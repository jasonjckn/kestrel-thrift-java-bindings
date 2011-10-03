package net.lag.kestrel;

import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.TException;
import net.lag.kestrel.thrift.*;
import java.io.*;
import java.util.List;
import java.util.Set;

/* Thin wrapper around Thrift Client for Kestrel */
public class ThriftClient implements Kestrel.Iface {
    Kestrel.Client _client = null;
    TTransport _transport = null;

    public ThriftClient(String hostname, int port) 
        throws TException {

        _transport = new TFramedTransport(new TSocket(hostname, port));
        TProtocol proto = new TBinaryProtocol(_transport);
        _client = new Kestrel.Client(proto);
        _transport.open();
    }

    public void close() {
        _transport.close();
        _transport = null;
        _client = null;
    }


    public int put(String queue_name, List<byte[]> items, int expiration_msec) throws TException {
        return _client.put(queue_name, items, expiration_msec);
    }

    public List<Item> get(String queue_name, int max_items, int timeout_msec, boolean auto_confirm) throws TException {
        return _client.get(queue_name, max_items, timeout_msec, auto_confirm);
    }

    public int confirm(String queue_name, Set<Integer> xids) throws TException {
        return _client.confirm(queue_name, xids);
    }

    public int abort(String queue_name, Set<Integer> xids) throws TException {
        return _client.abort(queue_name, xids);
    }

    public QueueInfo peek(String queue_name) throws TException {
        return _client.peek(queue_name);
    }

    public void flush(String queue_name) throws TException {
        _client.flush(queue_name);
    }

    public void delete_queue(String queue_name) throws TException {
        _client.delete_queue(queue_name);
    }

    public String get_version() throws TException {
        return _client.get_version();
    }

    public void flush_all() throws TException {
        _client.flush_all();
    }

    public int flush_all_expired() throws TException {
        return _client.flush_all_expired();
    }

}
