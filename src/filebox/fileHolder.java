package filebox;

/**
* filebox/fileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Tuesday, April 2, 2013 10:15:42 AM BST
*/

public final class fileHolder implements org.omg.CORBA.portable.Streamable
{
  public filebox.file value = null;

  public fileHolder ()
  {
  }

  public fileHolder (filebox.file initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = filebox.fileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    filebox.fileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return filebox.fileHelper.type ();
  }

}