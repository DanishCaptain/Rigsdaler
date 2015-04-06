package com.danskkaptajn.core.view;

import java.util.ArrayList;
import java.util.List;

public class Frame
{
  private ArrayList<Screen> sList = new ArrayList<Screen>();
  private ArrayList<Menu> mList = new ArrayList<Menu>();

  public Screen createScreen(String id)
  {
    Screen s = new Screen(id);
    sList.add(s);
    return s;
  }

  public List<Screen> getScreens()
  {
    ArrayList<Screen> list = new ArrayList<Screen>();
    list.addAll(sList);
    return list;
  }

  public Menu createMenu(String id)
  {
    Menu m = new Menu(id);
    mList.add(m);
    return m;
  }

  public List<Menu> getMenus()
  {
    ArrayList<Menu> list = new ArrayList<Menu>();
    list.addAll(mList);
    return list;
  }

}
