/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package net.lag.kestrel.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class QueueInfo implements TBase<QueueInfo, QueueInfo._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("QueueInfo");

  private static final TField HEAD_ITEM_FIELD_DESC = new TField("head_item", TType.STRING, (short)1);
  private static final TField ITEMS_FIELD_DESC = new TField("items", TType.I64, (short)2);
  private static final TField BYTES_FIELD_DESC = new TField("bytes", TType.I64, (short)3);
  private static final TField JOURNAL_BYTES_FIELD_DESC = new TField("journal_bytes", TType.I64, (short)4);
  private static final TField AGE_FIELD_DESC = new TField("age", TType.I64, (short)5);
  private static final TField WAITERS_FIELD_DESC = new TField("waiters", TType.I32, (short)6);
  private static final TField OPEN_TRANSACTIONS_FIELD_DESC = new TField("open_transactions", TType.I32, (short)7);

  private byte[] head_item;
  private long items;
  private long bytes;
  private long journal_bytes;
  private long age;
  private int waiters;
  private int open_transactions;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    HEAD_ITEM((short)1, "head_item"),
    ITEMS((short)2, "items"),
    BYTES((short)3, "bytes"),
    JOURNAL_BYTES((short)4, "journal_bytes"),
    AGE((short)5, "age"),
    WAITERS((short)6, "waiters"),
    OPEN_TRANSACTIONS((short)7, "open_transactions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEAD_ITEM
          return HEAD_ITEM;
        case 2: // ITEMS
          return ITEMS;
        case 3: // BYTES
          return BYTES;
        case 4: // JOURNAL_BYTES
          return JOURNAL_BYTES;
        case 5: // AGE
          return AGE;
        case 6: // WAITERS
          return WAITERS;
        case 7: // OPEN_TRANSACTIONS
          return OPEN_TRANSACTIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ITEMS_ISSET_ID = 0;
  private static final int __BYTES_ISSET_ID = 1;
  private static final int __JOURNAL_BYTES_ISSET_ID = 2;
  private static final int __AGE_ISSET_ID = 3;
  private static final int __WAITERS_ISSET_ID = 4;
  private static final int __OPEN_TRANSACTIONS_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEAD_ITEM, new FieldMetaData("head_item", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ITEMS, new FieldMetaData("items", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.BYTES, new FieldMetaData("bytes", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.JOURNAL_BYTES, new FieldMetaData("journal_bytes", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.AGE, new FieldMetaData("age", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.WAITERS, new FieldMetaData("waiters", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.OPEN_TRANSACTIONS, new FieldMetaData("open_transactions", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(QueueInfo.class, metaDataMap);
  }

  public QueueInfo() {
  }

  public QueueInfo(
    long items,
    long bytes,
    long journal_bytes,
    long age,
    int waiters,
    int open_transactions)
  {
    this();
    this.items = items;
    set_items_isSet(true);
    this.bytes = bytes;
    set_bytes_isSet(true);
    this.journal_bytes = journal_bytes;
    set_journal_bytes_isSet(true);
    this.age = age;
    set_age_isSet(true);
    this.waiters = waiters;
    set_waiters_isSet(true);
    this.open_transactions = open_transactions;
    set_open_transactions_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueueInfo(QueueInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_head_item()) {
      this.head_item = new byte[other.head_item.length];
      System.arraycopy(other.head_item, 0, head_item, 0, other.head_item.length);
    }
    this.items = other.items;
    this.bytes = other.bytes;
    this.journal_bytes = other.journal_bytes;
    this.age = other.age;
    this.waiters = other.waiters;
    this.open_transactions = other.open_transactions;
  }

  public QueueInfo deepCopy() {
    return new QueueInfo(this);
  }

  @Deprecated
  public QueueInfo clone() {
    return new QueueInfo(this);
  }

  public byte[] get_head_item() {
    return this.head_item;
  }

  public void set_head_item(byte[] head_item) {
    this.head_item = head_item;
  }

  public void unset_head_item() {
    this.head_item = null;
  }

  /** Returns true if field head_item is set (has been asigned a value) and false otherwise */
  public boolean is_set_head_item() {
    return this.head_item != null;
  }

  public void set_head_item_isSet(boolean value) {
    if (!value) {
      this.head_item = null;
    }
  }

  public long get_items() {
    return this.items;
  }

  public void set_items(long items) {
    this.items = items;
    set_items_isSet(true);
  }

  public void unset_items() {
    __isset_bit_vector.clear(__ITEMS_ISSET_ID);
  }

  /** Returns true if field items is set (has been asigned a value) and false otherwise */
  public boolean is_set_items() {
    return __isset_bit_vector.get(__ITEMS_ISSET_ID);
  }

  public void set_items_isSet(boolean value) {
    __isset_bit_vector.set(__ITEMS_ISSET_ID, value);
  }

  public long get_bytes() {
    return this.bytes;
  }

  public void set_bytes(long bytes) {
    this.bytes = bytes;
    set_bytes_isSet(true);
  }

  public void unset_bytes() {
    __isset_bit_vector.clear(__BYTES_ISSET_ID);
  }

  /** Returns true if field bytes is set (has been asigned a value) and false otherwise */
  public boolean is_set_bytes() {
    return __isset_bit_vector.get(__BYTES_ISSET_ID);
  }

  public void set_bytes_isSet(boolean value) {
    __isset_bit_vector.set(__BYTES_ISSET_ID, value);
  }

  public long get_journal_bytes() {
    return this.journal_bytes;
  }

  public void set_journal_bytes(long journal_bytes) {
    this.journal_bytes = journal_bytes;
    set_journal_bytes_isSet(true);
  }

  public void unset_journal_bytes() {
    __isset_bit_vector.clear(__JOURNAL_BYTES_ISSET_ID);
  }

  /** Returns true if field journal_bytes is set (has been asigned a value) and false otherwise */
  public boolean is_set_journal_bytes() {
    return __isset_bit_vector.get(__JOURNAL_BYTES_ISSET_ID);
  }

  public void set_journal_bytes_isSet(boolean value) {
    __isset_bit_vector.set(__JOURNAL_BYTES_ISSET_ID, value);
  }

  public long get_age() {
    return this.age;
  }

  public void set_age(long age) {
    this.age = age;
    set_age_isSet(true);
  }

  public void unset_age() {
    __isset_bit_vector.clear(__AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been asigned a value) and false otherwise */
  public boolean is_set_age() {
    return __isset_bit_vector.get(__AGE_ISSET_ID);
  }

  public void set_age_isSet(boolean value) {
    __isset_bit_vector.set(__AGE_ISSET_ID, value);
  }

  public int get_waiters() {
    return this.waiters;
  }

  public void set_waiters(int waiters) {
    this.waiters = waiters;
    set_waiters_isSet(true);
  }

  public void unset_waiters() {
    __isset_bit_vector.clear(__WAITERS_ISSET_ID);
  }

  /** Returns true if field waiters is set (has been asigned a value) and false otherwise */
  public boolean is_set_waiters() {
    return __isset_bit_vector.get(__WAITERS_ISSET_ID);
  }

  public void set_waiters_isSet(boolean value) {
    __isset_bit_vector.set(__WAITERS_ISSET_ID, value);
  }

  public int get_open_transactions() {
    return this.open_transactions;
  }

  public void set_open_transactions(int open_transactions) {
    this.open_transactions = open_transactions;
    set_open_transactions_isSet(true);
  }

  public void unset_open_transactions() {
    __isset_bit_vector.clear(__OPEN_TRANSACTIONS_ISSET_ID);
  }

  /** Returns true if field open_transactions is set (has been asigned a value) and false otherwise */
  public boolean is_set_open_transactions() {
    return __isset_bit_vector.get(__OPEN_TRANSACTIONS_ISSET_ID);
  }

  public void set_open_transactions_isSet(boolean value) {
    __isset_bit_vector.set(__OPEN_TRANSACTIONS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEAD_ITEM:
      if (value == null) {
        unset_head_item();
      } else {
        set_head_item((byte[])value);
      }
      break;

    case ITEMS:
      if (value == null) {
        unset_items();
      } else {
        set_items((Long)value);
      }
      break;

    case BYTES:
      if (value == null) {
        unset_bytes();
      } else {
        set_bytes((Long)value);
      }
      break;

    case JOURNAL_BYTES:
      if (value == null) {
        unset_journal_bytes();
      } else {
        set_journal_bytes((Long)value);
      }
      break;

    case AGE:
      if (value == null) {
        unset_age();
      } else {
        set_age((Long)value);
      }
      break;

    case WAITERS:
      if (value == null) {
        unset_waiters();
      } else {
        set_waiters((Integer)value);
      }
      break;

    case OPEN_TRANSACTIONS:
      if (value == null) {
        unset_open_transactions();
      } else {
        set_open_transactions((Integer)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEAD_ITEM:
      return get_head_item();

    case ITEMS:
      return new Long(get_items());

    case BYTES:
      return new Long(get_bytes());

    case JOURNAL_BYTES:
      return new Long(get_journal_bytes());

    case AGE:
      return new Long(get_age());

    case WAITERS:
      return new Integer(get_waiters());

    case OPEN_TRANSACTIONS:
      return new Integer(get_open_transactions());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case HEAD_ITEM:
      return is_set_head_item();
    case ITEMS:
      return is_set_items();
    case BYTES:
      return is_set_bytes();
    case JOURNAL_BYTES:
      return is_set_journal_bytes();
    case AGE:
      return is_set_age();
    case WAITERS:
      return is_set_waiters();
    case OPEN_TRANSACTIONS:
      return is_set_open_transactions();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueueInfo)
      return this.equals((QueueInfo)that);
    return false;
  }

  public boolean equals(QueueInfo that) {
    if (that == null)
      return false;

    boolean this_present_head_item = true && this.is_set_head_item();
    boolean that_present_head_item = true && that.is_set_head_item();
    if (this_present_head_item || that_present_head_item) {
      if (!(this_present_head_item && that_present_head_item))
        return false;
      if (!java.util.Arrays.equals(this.head_item, that.head_item))
        return false;
    }

    boolean this_present_items = true;
    boolean that_present_items = true;
    if (this_present_items || that_present_items) {
      if (!(this_present_items && that_present_items))
        return false;
      if (this.items != that.items)
        return false;
    }

    boolean this_present_bytes = true;
    boolean that_present_bytes = true;
    if (this_present_bytes || that_present_bytes) {
      if (!(this_present_bytes && that_present_bytes))
        return false;
      if (this.bytes != that.bytes)
        return false;
    }

    boolean this_present_journal_bytes = true;
    boolean that_present_journal_bytes = true;
    if (this_present_journal_bytes || that_present_journal_bytes) {
      if (!(this_present_journal_bytes && that_present_journal_bytes))
        return false;
      if (this.journal_bytes != that.journal_bytes)
        return false;
    }

    boolean this_present_age = true;
    boolean that_present_age = true;
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (this.age != that.age)
        return false;
    }

    boolean this_present_waiters = true;
    boolean that_present_waiters = true;
    if (this_present_waiters || that_present_waiters) {
      if (!(this_present_waiters && that_present_waiters))
        return false;
      if (this.waiters != that.waiters)
        return false;
    }

    boolean this_present_open_transactions = true;
    boolean that_present_open_transactions = true;
    if (this_present_open_transactions || that_present_open_transactions) {
      if (!(this_present_open_transactions && that_present_open_transactions))
        return false;
      if (this.open_transactions != that.open_transactions)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_head_item = true && (is_set_head_item());
    builder.append(present_head_item);
    if (present_head_item)
      builder.append(head_item);

    boolean present_items = true;
    builder.append(present_items);
    if (present_items)
      builder.append(items);

    boolean present_bytes = true;
    builder.append(present_bytes);
    if (present_bytes)
      builder.append(bytes);

    boolean present_journal_bytes = true;
    builder.append(present_journal_bytes);
    if (present_journal_bytes)
      builder.append(journal_bytes);

    boolean present_age = true;
    builder.append(present_age);
    if (present_age)
      builder.append(age);

    boolean present_waiters = true;
    builder.append(present_waiters);
    if (present_waiters)
      builder.append(waiters);

    boolean present_open_transactions = true;
    builder.append(present_open_transactions);
    if (present_open_transactions)
      builder.append(open_transactions);

    return builder.toHashCode();
  }

  public int compareTo(QueueInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    QueueInfo typedOther = (QueueInfo)other;

    lastComparison = Boolean.valueOf(is_set_head_item()).compareTo(typedOther.is_set_head_item());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_head_item()) {      lastComparison = TBaseHelper.compareTo(this.head_item, typedOther.head_item);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_items()).compareTo(typedOther.is_set_items());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_items()) {      lastComparison = TBaseHelper.compareTo(this.items, typedOther.items);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_bytes()).compareTo(typedOther.is_set_bytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_bytes()) {      lastComparison = TBaseHelper.compareTo(this.bytes, typedOther.bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_journal_bytes()).compareTo(typedOther.is_set_journal_bytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_journal_bytes()) {      lastComparison = TBaseHelper.compareTo(this.journal_bytes, typedOther.journal_bytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_age()).compareTo(typedOther.is_set_age());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_age()) {      lastComparison = TBaseHelper.compareTo(this.age, typedOther.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_waiters()).compareTo(typedOther.is_set_waiters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_waiters()) {      lastComparison = TBaseHelper.compareTo(this.waiters, typedOther.waiters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_open_transactions()).compareTo(typedOther.is_set_open_transactions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_open_transactions()) {      lastComparison = TBaseHelper.compareTo(this.open_transactions, typedOther.open_transactions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // HEAD_ITEM
          if (field.type == TType.STRING) {
            this.head_item = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ITEMS
          if (field.type == TType.I64) {
            this.items = iprot.readI64();
            set_items_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // BYTES
          if (field.type == TType.I64) {
            this.bytes = iprot.readI64();
            set_bytes_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // JOURNAL_BYTES
          if (field.type == TType.I64) {
            this.journal_bytes = iprot.readI64();
            set_journal_bytes_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // AGE
          if (field.type == TType.I64) {
            this.age = iprot.readI64();
            set_age_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // WAITERS
          if (field.type == TType.I32) {
            this.waiters = iprot.readI32();
            set_waiters_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // OPEN_TRANSACTIONS
          if (field.type == TType.I32) {
            this.open_transactions = iprot.readI32();
            set_open_transactions_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.head_item != null) {
      if (is_set_head_item()) {
        oprot.writeFieldBegin(HEAD_ITEM_FIELD_DESC);
        oprot.writeBinary(this.head_item);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(ITEMS_FIELD_DESC);
    oprot.writeI64(this.items);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BYTES_FIELD_DESC);
    oprot.writeI64(this.bytes);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(JOURNAL_BYTES_FIELD_DESC);
    oprot.writeI64(this.journal_bytes);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(AGE_FIELD_DESC);
    oprot.writeI64(this.age);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(WAITERS_FIELD_DESC);
    oprot.writeI32(this.waiters);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(OPEN_TRANSACTIONS_FIELD_DESC);
    oprot.writeI32(this.open_transactions);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueueInfo(");
    boolean first = true;

    if (is_set_head_item()) {
      sb.append("head_item:");
      if (this.head_item == null) {
        sb.append("null");
      } else {
          int __head_item_size = Math.min(this.head_item.length, 128);
          for (int i = 0; i < __head_item_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.head_item[i]).length() > 1 ? Integer.toHexString(this.head_item[i]).substring(Integer.toHexString(this.head_item[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.head_item[i]).toUpperCase());
          }
          if (this.head_item.length > 128) sb.append(" ...");
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("items:");
    sb.append(this.items);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bytes:");
    sb.append(this.bytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("journal_bytes:");
    sb.append(this.journal_bytes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("age:");
    sb.append(this.age);
    first = false;
    if (!first) sb.append(", ");
    sb.append("waiters:");
    sb.append(this.waiters);
    first = false;
    if (!first) sb.append(", ");
    sb.append("open_transactions:");
    sb.append(this.open_transactions);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

