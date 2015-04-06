package com.danskkaptajn.core.view;

public abstract class ApplicationView
{

  public ApplicationView()
  {
  }

  public abstract Frame getFrame();

  public abstract void start();

  public abstract Screen getDefault();

}
