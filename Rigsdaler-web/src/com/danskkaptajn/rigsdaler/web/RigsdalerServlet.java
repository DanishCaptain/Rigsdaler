package com.danskkaptajn.rigsdaler.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import com.danskkaptajn.core.application.properties.PropertyFileConfig;
import com.danskkaptajn.rigsdaler.core.model.RigsdalerModel;
import com.danskkaptajn.rigsdaler.core.view.RigsdalerView;

@SuppressWarnings("unused")
public class RigsdalerServlet
extends CoreServlet
{
  private static final long serialVersionUID = 1306587255288700131L;
  private ArrayList<ServiceModule> smList = new ArrayList<ServiceModule>();
  private String message = "Rigsdaler";

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
  {
    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    out.println("<h1>" + message + "</h1>");
  }

  @Override
  protected void init(List<ServiceModule> smList)
  {
    PropertyFileConfig config = new PropertyFileConfig();
    RigsdalerModel model = new RigsdalerModel(config);
    RigsdalerView view = new RigsdalerView(config);
    
  }
}
