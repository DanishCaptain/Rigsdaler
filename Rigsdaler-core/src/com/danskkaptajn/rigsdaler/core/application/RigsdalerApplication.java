package com.danskkaptajn.rigsdaler.core.application;

import java.util.List;

import javax.swing.JFrame;

import com.danskkaptajn.core.application.Application;
import com.danskkaptajn.core.application.ServiceModule;
import com.danskkaptajn.core.controller.ApplicationController;
import com.danskkaptajn.core.view.ApplicationView;

public abstract class RigsdalerApplication
extends Application
{

  protected final void init(List<ServiceModule> list)
  {
    initR(list);
    
    ApplicationView v = getView();
    ApplicationController c = getController();
    JFrame f = SwingTool.format(c, v.getFrame());
    c.showScreen(v.getDefault().getId());
    f.setVisible(true);
  }
  
  protected abstract void initR(List<ServiceModule> list);
}
