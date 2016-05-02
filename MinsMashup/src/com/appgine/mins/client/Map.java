package com.appgine.mins.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapOptions;
import com.google.maps.gwt.client.MapTypeId;

public class Map {
	public static void showMap() {
	    new JsonpRequestBuilder().send("http://maps.googleapis.com/maps/api/js?sensor=false",
	    		new AsyncCallback<Void>(){
	    			public void onSuccess(Void result) {
	    				LatLng myLatLng = LatLng.create(37.35819, -5.98637);
	    				MapOptions myOptions = MapOptions.create();
	    				myOptions.setZoom(12.0);
	    				myOptions.setCenter(myLatLng);
	    				myOptions.setMapTypeId(MapTypeId.ROADMAP);
	    				GoogleMap.create(Document.get().getElementById("map_canvas"), myOptions);
	    			}
	    			public void onFailure(Throwable e) {
	    				Window.alert("Error loading map: " + e.getMessage());
	    			}
	    });
	}
}
