package filebox;

/**
* filebox/MessageServerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../filebox.idl
* Saturday, April 6, 2013 6:25:21 PM BST
*/

public final class MessageServerHolder implements org.omg.CORBA.portable.Streamable
{
  public filebox.MessageServer value = null;

  public MessageServerHolder ()
  {
  }

  public MessageServerHolder (filebox.MessageServer initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = filebox.MessageServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    filebox.MessageServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return filebox.MessageServerHelper.type ();
  }

}
