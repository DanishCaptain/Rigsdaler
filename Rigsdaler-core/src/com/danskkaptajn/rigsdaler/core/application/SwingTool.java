package com.danskkaptajn.rigsdaler.core.application;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.danskkaptajn.core.controller.ApplicationController;
import com.danskkaptajn.core.view.Frame;
import com.danskkaptajn.core.view.Menu;
import com.danskkaptajn.core.view.MenuItem;
import com.danskkaptajn.core.view.Screen;

public final class SwingTool
{
  private SwingTool()
  {
  }

  public static JFrame format(ApplicationController c, Frame frame)
  {
    JFrame jFrame = new JFrame();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    jFrame.setSize(d.width, d.height-40);
    jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //TODO: fix this to work shutdown
    
    JMenuBar mb = new JMenuBar();
    jFrame.setJMenuBar(mb);
    
    JPanel main = new JPanel();
    CardLayout card = new CardLayout();
    c.init(main, card);
    main.setLayout(card);
    jFrame.setContentPane(main);
    
    List<Menu> menus = frame.getMenus();
    for (int i=0; i<menus.size(); i++)
    {
      Menu m = menus.get(i);
      JMenu jm = format(m);
      mb.add(jm);
      
      List<MenuItem> menuItems = m.getMenuItems();
      for (int j=0; j<menuItems.size(); j++)
      {
        MenuItem mi = menuItems.get(j);
        JMenuItem jmi = format(mi);
        jm.add(jmi);
        c.register(mi, jmi);
      }
    }
    
    List<Screen> screens = frame.getScreens();
    for (int i=0; i<screens.size(); i++)
    {
      Screen s = screens.get(i);
      main.add(format(s), s.getId());
    }
    
    return jFrame;
  }

  private static JMenuItem format(MenuItem i)
  {
    JMenuItem mi = new JMenuItem(i.getId());
    return mi;
  }

  private static JMenu format(Menu m)
  {
    JMenu jm = new JMenu(m.getId());
    return jm;
  }

  private static JPanel format(Screen s)
  {
    JPanel p = new JPanel();
    p.add(new JLabel(s.getId()));
    return p;
  }

}
