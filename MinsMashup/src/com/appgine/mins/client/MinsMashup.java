package com.appgine.mins.client;

import com.appgine.mins.shared.ChartSearch;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MinsMashup implements EntryPoint {
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	private final MinsServiceAsync mashupService = GWT.create(MinsService.class);
	
	private Button searchButton = new Button("Search");
	private TextBox searchField = new TextBox();
	private HorizontalPanel searchPanel = new HorizontalPanel();
	
	public void onModuleLoad() {
		Map.showMap();
		
		searchPanel.add(searchField);
		searchPanel.add(searchButton);
		
		RootPanel.get("form").add(searchPanel);
		
		searchField.setFocus(true);
		searchField.selectAll();
		
		searchButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				final String country = searchField.getText();

				mashupService.getContent(country, new AsyncCallback<ChartSearch>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						Window.alert("Failure");
					}

					@Override
					public void onSuccess(ChartSearch result) {
						// TODO Auto-generated method stub
						Window.alert("Success");
					}
					
				});
			}
		});
	}
}
