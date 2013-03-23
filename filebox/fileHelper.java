package filebox;


/**
* filebox/fileHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from filebox.idl
* 23 March 2013 12:36:51 o'clock GMT
*/

abstract public class fileHelper
{
  private static String  _id = "IDL:filebox/file:1.0";

  public static void insert (org.omg.CORBA.Any a, filebox.file that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static filebox.file extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (filebox.fileHelper.id (), "file");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static filebox.file read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_fileStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, filebox.file value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static filebox.file narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof filebox.file)
      return (filebox.file)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      filebox._fileStub stub = new filebox._fileStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static filebox.file unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof filebox.file)
      return (filebox.file)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      filebox._fileStub stub = new filebox._fileStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
