package com.danskkaptajn.core.view;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
  private ArrayList<MenuItem> miList = new ArrayList<MenuItem>();
  private String id;

  public Menu(String id)
  {
    this.id = id;
  }
  
  public String getId()
  {
    return id;
  }

  public MenuItem createMenuItem(String id, MenuAction action)
  {
    MenuItem mi = new MenuItem(id, action);
    miList.add(mi);
    return mi;
  }

  public List<MenuItem> getMenuItems()
  {
    ArrayList<MenuItem> list = new ArrayList<MenuItem>();
    list.addAll(miList);
    return list;
  }

}
