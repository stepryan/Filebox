package filebox;


/**
* filebox/usersHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Tuesday, April 2, 2013 10:15:42 AM BST
*/

public final class usersHolder implements org.omg.CORBA.portable.Streamable
{
  public filebox.user value[] = null;

  public usersHolder ()
  {
  }

  public usersHolder (filebox.user[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = filebox.usersHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    filebox.usersHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return filebox.usersHelper.type ();
  }

}