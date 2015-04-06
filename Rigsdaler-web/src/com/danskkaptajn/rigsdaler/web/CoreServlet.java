package com.danskkaptajn.rigsdaler.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.danskkaptajn.core.application.ServiceModule;

@SuppressWarnings("unused")
public abstract class CoreServlet
extends HttpServlet
{
  private static final long serialVersionUID = 1306587255288700131L;
  private ArrayList<ServiceModule> smList = new ArrayList<ServiceModule>();
  private HashMap<String, ServiceModule> smMap = new HashMap<String, ServiceModule>();

  public final void init() throws ServletException
  {
    init(smList);
    for (int i=0; i<smList.size(); i++)
    {
      smMap.put(smList.get(i).getId(), smList.get(i));
    }
  }

  protected abstract void init(List<ServiceModule> smList);
  
  public final void destroy()
  {
    for (int i=0; i<smList.size(); i++)
    {
    }
  }
}
