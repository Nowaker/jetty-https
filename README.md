# jetty-https

Apache on HTTPS proxying requests to Jetty on HTTP?

      https                 http
    --------->   Apache   -------> Jetty

Now it's possible [without coding anything](http://wiki.eclipse.org/Jetty/Howto/Configure_mod_proxy#Proxying_SSL_on_Apache_to_HTTP_on_Jetty).

1. Download [`jetty-https-1.jar`](https://github.com/Nowaker/jetty-https/releases/download/1/jetty-https-1.jar) into `lib/` directory.
2. Modify your `conf/jetty.xml` - replace `<New class="org.eclipse.jetty.server.nio.SelectChannelConnector">` with `<New class="eu.stratushost.java.jetty.SslConnector">`
3. Restart Jetty.

## License

Licensed under [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).
