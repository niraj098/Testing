import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
//import org.json.simple.JSONObject;

import java.io.InputStream;
import java.util.logging.Logger;

public class testServices {

    public static void main(String[] args)  throws Exception
    {
        String result = null;
        StringBuffer sb = new StringBuffer();
        InputStream is = null;
		/*URL obj = new URL("http://restapi.demoqa.com/utilities/books/getallbooks");
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");*/
        HttpClient client= new DefaultHttpClient();
        HttpGet httpGet=new HttpGet("http://restapi.demoqa.com/utilities/books/getallbooks");
        HttpResponse resp = client.execute(httpGet);
        System.out.print(resp);
        String result1= EntityUtils.toString(resp.getEntity());
        System.out.println(result1);
        int statusCode = resp.getStatusLine().getStatusCode();
        ObjectMapper mapper = new ObjectMapper();


        /*String test=mapper.readv


        JSONObject jsonObject=new JSONObject(result1);*/
        // Getting the response body.

        ResponseHandler<String> handler = new BasicResponseHandler();

        String body = client.execute(httpGet, handler);


        //int code = response.getStatusLine().getStatusCode();

        //con.setRequestProperty("User-Agent", USER_AGENT);
        //int responseCode = con.getResponseCode();try {
	        /*is = new BufferedInputStream(con.getInputStream());
	        BufferedReader br = new BufferedReader(new InputStreamReader(is));
	        String inputLine = "";
	        while ((inputLine = br.readLine()) != null) {
	            sb.append(inputLine);
	        }
	        result = sb.toString();
*/	    /*}
	    catch (Exception e) {

	        result = null;*/



	/*RestAssured.baseURI = "http://restapi.demoqa.com/utilities/books/getallbooks";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("http://restapi.demoqa.com/utilities/books/getallbooks").;*/

        // First get the JsonPath object instance from the Response interface
        //JsonPath jsonPathEvaluator = Handler.jsonPath();

        // Read all the books as a List of String. Each item in the list
        // represent a book node in the REST service Response
        //List<Book> allBooks = jsonPathEvaluator.getList("books", Book.class);

        // Iterate over the list and print individual book item
        // Note that every book entry in the list will be complete Json object of book
	/*for(Book book : allBooks)
	{
		System.out.println("Book: " + book.title);
	}*/
    }
}
