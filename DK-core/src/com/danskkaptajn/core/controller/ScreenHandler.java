package com.danskkaptajn.core.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ScreenHandler
implements ActionListener
{
  private JPanel p;
  private CardLayout c;

  public ScreenHandler(JPanel p, CardLayout c)
  {
    this.p = p;
    this.c = c;
  }

  public void show(String id)
  {
    c.show(p, id);
  }

  public void register(JMenuItem mi)
  {
    mi.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent ev)
  {
    show(ev.getActionCommand());
  }

}
