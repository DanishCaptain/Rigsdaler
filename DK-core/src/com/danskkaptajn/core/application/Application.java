package com.danskkaptajn.core.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.danskkaptajn.core.controller.ApplicationController;
import com.danskkaptajn.core.model.ApplicationModel;
import com.danskkaptajn.core.view.ApplicationView;

public abstract class Application
{
  private ArrayList<ServiceModule> smList = new ArrayList<ServiceModule>();
  private HashMap<String, ServiceModule> smMap = new HashMap<String, ServiceModule>();
  private boolean initialized;
  private boolean started;
  private ApplicationModel model;
  private ApplicationView view;
  private ApplicationController controller;
  
  public Application()
  {
  }
  
  protected synchronized final void initApplication()
  {
    if (!initialized)
    {
      initialized = true;
      model = createModel();
      view = createView();
      controller = createController();
      init(smList);
      for (int i=0; i<smList.size(); i++)
      {
        smMap.put(smList.get(i).getId(), smList.get(i));
      }
    }
  }

  protected abstract ApplicationModel createModel();
  
  protected ApplicationModel getModel()
  {
    return model;
  }

  protected abstract ApplicationView createView();

  protected ApplicationView getView()
  {
    return view;
  }

  protected abstract ApplicationController createController();

  protected ApplicationController getController()
  {
    return controller;
  }

  protected final void startApplication()
  {
    if (!started)
    {
      started = true;
      model.start();
      for (int i=0; i<smList.size(); i++)
      {
        smList.get(i).startService();
      }
      controller.start();
      view.start();
    }
  }

  protected abstract void init(List<ServiceModule> list);

}
