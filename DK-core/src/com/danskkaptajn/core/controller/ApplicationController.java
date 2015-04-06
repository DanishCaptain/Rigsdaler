package com.danskkaptajn.core.controller;

import java.awt.CardLayout;

import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.danskkaptajn.core.view.MenuAction;
import com.danskkaptajn.core.view.MenuItem;

public abstract class ApplicationController
{
  private boolean intialized;
  private ScreenHandler screenHandler;

  public ApplicationController()
  {
  }

  public abstract void start();

  public void init(JPanel p, CardLayout c)
  {
    screenHandler = new ScreenHandler(p, c);
    intialized = true;
  }

  public void showScreen(String id)
  {
    screenHandler.show(id);
  }

  public void register(MenuItem mi, JMenuItem jmi)
  {
    if (mi.getAction() == MenuAction.SelectScreen)
    {
      if (screenHandler != null)
      {
        screenHandler.register(jmi);
      }
    }
  }

}
