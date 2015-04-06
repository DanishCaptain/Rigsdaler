package com.danskkaptajn.core.application;

import com.danskkaptajn.core.application.properties.PropertyConfig;
import com.danskkaptajn.core.log.Logger;

public abstract class ServiceModule
{
  private static final Logger LOG = Logger.getInstance(ServiceModule.class);
  private PropertyConfig config;
  private String id;

  public ServiceModule(PropertyConfig config, String id)
  {
    this.config = config;
    this.id = id;
  }
  
  protected PropertyConfig getConfig()
  {
    return config;
  }
  
  public String getId()
  {
    return id;
  }

  public final void startService()
  {
    LOG.info("startService", "Starting");
    startupService();
  }

  protected abstract void startupService();

}
