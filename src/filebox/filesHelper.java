package filebox;


/**
* filebox/filesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Saturday, April 6, 2013 6:25:21 PM BST
*/

abstract public class filesHelper
{
  private static String  _id = "IDL:filebox/files:1.0";

  public static void insert (org.omg.CORBA.Any a, filebox.file[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static filebox.file[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = filebox.fileHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (filebox.filesHelper.id (), "files", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static filebox.file[] read (org.omg.CORBA.portable.InputStream istream)
  {
    filebox.file value[] = null;
    int _len0 = istream.read_long ();
    value = new filebox.file[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = filebox.fileHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, filebox.file[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      filebox.fileHelper.write (ostream, value[_i0]);
  }

}
