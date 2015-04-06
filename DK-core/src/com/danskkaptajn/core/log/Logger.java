package com.danskkaptajn.core.log;

public class Logger
{
  //TODO: fix the logger
  private static final Logger l = new Logger();

  public static Logger getInstance(Class<?> class1)
  {
    return l;
  }

  public void info(String method, String message)
  {
    System.out.println("INFO: "+method+":"+message);
  }

}
