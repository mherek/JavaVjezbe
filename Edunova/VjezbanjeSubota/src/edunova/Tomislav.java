package edunova;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

public class Tomislav {
	
	public static void main(String[] args) {
		
		
		try {
			String json = Unirest.get("https://free-nba.p.rapidapi.com/games?page=2&per_page=100")
					.header("X-RapidAPI-Host", "free-nba.p.rapidapi.com")
					.header("X-RapidAPI-Key", "3aac086fb2msh4b6f970005ecacdp14ca52jsnc72d5cff58a2")
					.asString().getBody();
			
			
			Podatak p = new Gson().fromJson(json, Podatak.class);
			
			for (Data d : p.getData()) {
				try {
					System.out.println(d.getHome_team().getName());
					System.out.println(d.getDate());
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			
//			JsonParser parser = new JsonParser();
//			 JsonObject rootObj = parser.parse(json).getAsJsonObject();
//			 JsonArray arr = rootObj.getAsJsonArray("data");
//
//			 JsonObject o = arr.get(0).getAsJsonObject();
//			 
//			 System.out.println(o.getAsJsonObject().getAsJsonPrimitive("id"));
//			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
