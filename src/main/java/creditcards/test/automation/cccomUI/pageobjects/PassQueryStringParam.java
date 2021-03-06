package creditcards.test.automation.cccomUI.pageobjects;

import java.net.URI;
import java.net.URISyntaxException;

	
	public class PassQueryStringParam  {

	    public static URI appendUri(String uri, String appendQuery) throws URISyntaxException {
	        URI oldUri = new URI(uri);

	        String newQuery = oldUri.getQuery();
	        if (newQuery == null) {
	            newQuery = appendQuery;
	        } else {
	            newQuery += "&" + appendQuery;  
	        }

	        URI newUri = new URI(oldUri.getScheme(), oldUri.getAuthority(),
	                oldUri.getPath(), newQuery, oldUri.getFragment());

	        return newUri;
	    }

	   
		
}
