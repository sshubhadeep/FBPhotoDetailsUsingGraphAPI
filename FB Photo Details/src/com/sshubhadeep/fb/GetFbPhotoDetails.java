package com.sshubhadeep.fb;

import java.util.List;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Photo;

public class GetFbPhotoDetails {
	
	public static final String MY_ACCESS_TOKEN = "EAACEdEose0cBAA80qmPawnTG9ZAAy8rDs60ZBnHZCxrS2ZA7xOu5CJTrbAwjEqurcPZBrElCZCV3ptHOQRE3XyiNXZBjvuvsVeiASHfngnUZA4ZAPw6Ke0CeH42ZCCqQEwIkMHkgFTJ3pYz75MIpTRQO1Uazzje9cp5fvZBD23F1Df7PQZDZD";
	
	public static void main(String[] args) {
	       FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN);
	       
	       
	       Connection<Photo> photoConnection = facebookClient.fetchConnection(
	               "me/photos", Photo.class);
	       List<Photo> photos = photoConnection.getData();
	       
	       for(Photo photo: photos){
	    	   if(photo.getName()!=null && photo.getComments()!=null)
	    	   System.out.println(photo.getName()+"   "+ photo.getComments().getData().size());
	       }
	       
	 
	   }
}
