package com.danskkaptajn.rigsdaler.client.application;

import java.util.List;

import com.danskkaptajn.core.application.ServiceModule;
import com.danskkaptajn.core.application.properties.PropertyFileConfig;
import com.danskkaptajn.core.controller.ApplicationController;
import com.danskkaptajn.core.model.ApplicationModel;
import com.danskkaptajn.core.view.ApplicationView;
import com.danskkaptajn.rigsdaler.core.application.RigsdalerApplication;
import com.danskkaptajn.rigsdaler.core.controller.RigsdalerController;
import com.danskkaptajn.rigsdaler.core.model.RigsdalerModel;
import com.danskkaptajn.rigsdaler.core.view.RigsdalerView;

public class RigsdalerClient
extends RigsdalerApplication
{
  private RigsdalerModel model;
  private RigsdalerView view;
  private RigsdalerController controller;
  
  public RigsdalerClient()
  {
    PropertyFileConfig config = new PropertyFileConfig();
    model = new RigsdalerModel(config);
    view = new RigsdalerView(config);
    controller = new RigsdalerController(config, model, view);
  }
  
  @Override
  protected void initR(List<ServiceModule> list)
  {
  }
  
  @Override
  protected ApplicationModel createModel()
  {
    return model;
  }

  @Override
  protected ApplicationView createView()
  {
    return view;
  }

  @Override
  protected ApplicationController createController()
  {
    return controller;
  }

  public static void main(String[] args)
  {
    RigsdalerClient app = new RigsdalerClient();
    app.initApplication();
    app.startApplication();
  }

}
