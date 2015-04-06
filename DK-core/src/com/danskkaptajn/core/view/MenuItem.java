package com.danskkaptajn.core.view;

public class MenuItem
{
  private String id;
  private MenuAction action;

  public MenuItem(String id, MenuAction action)
  {
    this.id = id;
    this.action = action;
  }
  
  public String getId()
  {
    return id;
  }

  public MenuAction getAction()
  {
    return action;
  }

}
