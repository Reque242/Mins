package com.appgine.mins.server;

import org.restlet.resource.ClientResource;

import com.appgine.mins.client.MinsService;
import com.appgine.mins.shared.ChartSearch;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class MinsServiceImpl extends RemoteServiceServlet implements MinsService {

	private static final long serialVersionUID = 3976203093797689182L;
	private String MUSIX_API_KEY = "0fb55327bba9cb8890d81c075de073ab";
	// http://api.musixmatch.com/ws/1.1/chart.tracks.get?apikey=0fb55327bba9cb8890d81c075de073ab&page=1&page_size=5&country=it&f_has_lyrics=1
	
	@Override
	public ChartSearch getContent(String country) {
		// TODO Auto-generated method stub
		ClientResource cr = new ClientResource("http://api.musixmatch.com/ws/1.1/chart.tracks.get?apikey=" + MUSIX_API_KEY + "&page=1&page_size=5&country=" + country + "&f_has_lyrics=1");
		ChartSearch cs = cr.get(ChartSearch.class);
		return cs;
	}
	
}

