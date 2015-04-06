package com.danskkaptajn.rigsdaler.core.view;

import com.danskkaptajn.core.application.properties.PropertyConfig;
import com.danskkaptajn.core.view.ApplicationView;
import com.danskkaptajn.core.view.Frame;
import com.danskkaptajn.core.view.Menu;
import com.danskkaptajn.core.view.MenuAction;
import com.danskkaptajn.core.view.MenuItem;
import com.danskkaptajn.core.view.Screen;

public class RigsdalerView
extends ApplicationView
{

  private static String ID = "RigsdalerView";
  private Frame frame;
  private Screen defaultScreen;

  public RigsdalerView(PropertyConfig config)
  {
    frame = new Frame();
    Screen intro = frame.createScreen("Intro");
    defaultScreen = intro;
    Screen chartOfAccounts = frame.createScreen("Chart Of Accounts");
    Screen accountView = frame.createScreen("Account View");
    Screen reconcileStatementTool = frame.createScreen("Reconcile Statement");
    Screen statementView = frame.createScreen("Statement View");
    
    Menu mView = frame.createMenu("View");
    MenuItem miChartOfAccounts = mView.createMenuItem(chartOfAccounts.getId(), MenuAction.SelectScreen);
    MenuItem miAccountView = mView.createMenuItem(accountView.getId(), MenuAction.SelectScreen);
    MenuItem miReconcileStatementTool = mView.createMenuItem(reconcileStatementTool.getId(), MenuAction.SelectScreen);
    MenuItem miStatementView = mView.createMenuItem(statementView.getId(), MenuAction.SelectScreen);
  }

  @Override
  public Frame getFrame()
  {
    return frame;
  }

  @Override
  public void start()
  {
  }

  @Override
  public Screen getDefault()
  {
    return defaultScreen;
  }

}
