package eu.stratushost.java.jetty;

import org.eclipse.jetty.io.EndPoint;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.nio.SelectChannelConnector;

import java.io.IOException;

public class SslConnector extends SelectChannelConnector {

	@Override
	public void customize(final EndPoint endpoint, final Request request) throws IOException {
		request.setScheme("https");
		super.customize(endpoint, request);
	}

}
