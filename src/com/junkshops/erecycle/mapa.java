package com.junkshops.erecycle;
import java.util.List;

import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;


public class mapa extends MapActivity {

	 private MapView mapView;
	 private EditText place;
	 MapController mapC;
	 GeoPoint p;
	 private static final int lat = 12312312;
     private static final int lon = 123123123;
     public static String search;
     public static String tp;
     
     @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapa);
		
		// For each of the sections in the app, add a tab to the action bar.
		
		mapView = (MapView) findViewById(R.id.map_view);
		mapView.setBuiltInZoomControls(true);
		p = new GeoPoint(lat, lon);
		mapC = mapView.getController();
        mapC.animateTo(p);
        mapC.setZoom(6);
        if(search !=  null){
        	onAw(mapView);
        }
        
        
        }
		  public void onAw(View v) {
			  String placeInput;
			  		List<Overlay> mapOverlays = mapView.getOverlays();
			        Drawable drawable = this.getResources().getDrawable(R.drawable.icon);
			        CustomItemizedOverlay itemizedOverlay =
			             new CustomItemizedOverlay(drawable, this);
			        if(search != null){
			        	placeInput = "Philippines ," + search; // Get input text
			        }
			        else{
			        	placeInput = "Philippines ," + place.getText().toString(); // Get input text
				    }
			    	Geocoder gc = new Geocoder(this);
		        List<Address> addressList;
				try {
				    addressList = gc.getFromLocationName(placeInput, 1);
					Address address = addressList.get(0);
			        if(address.hasLatitude() && address.hasLongitude()){
			            double selectedLat = address.getLatitude()*1000000;
			            double selectedLng = address.getLongitude()*1000000;
			            int a = (int)selectedLat;
			            int b = (int)selectedLng;
			            p = new GeoPoint(a, b);
			            mapOverlays.add(itemizedOverlay);
			            OverlayItem overlayitem =
			     		       new OverlayItem(p, "its here. ", placeInput);
			            itemizedOverlay.addOverlay(overlayitem);
				        mapC.animateTo(p);
				        mapC.setZoom(8);			   
				        }
			        else{
			        	placeInput = "Philippines ," + tp;
			        	try {
						    addressList = gc.getFromLocationName(placeInput, 1);
							Address address1 = addressList.get(0);
					        if(address1.hasLatitude() && address1.hasLongitude()){
					            double selectedLat = address1.getLatitude()*1000000;
					            double selectedLng = address1.getLongitude()*1000000;
					            int a = (int)selectedLat;
					            int b = (int)selectedLng;
					            p = new GeoPoint(a, b);
					            mapOverlays.add(itemizedOverlay);
					            OverlayItem overlayitem =
					     		       new OverlayItem(p, "its here.", placeInput);
					            itemizedOverlay.addOverlay(overlayitem);
						        mapC.animateTo(p);
						        mapC.setZoom(8);			   
						        }
					        else{
			        
			        	  }
				
			       
			        	}catch (Exception e) {
				        	
				        	}
			        	}
				}catch (Exception e) {placeInput = "Philippines ," + tp;
	        	try {
				    addressList = gc.getFromLocationName(placeInput, 1);
					Address address1 = addressList.get(0);
			        if(address1.hasLatitude() && address1.hasLongitude()){
			            double selectedLat = address1.getLatitude()*1000000;
			            double selectedLng = address1.getLongitude()*1000000;
			            int a = (int)selectedLat;
			            int b = (int)selectedLng;
			            p = new GeoPoint(a, b);
			            mapOverlays.add(itemizedOverlay);
			            OverlayItem overlayitem =
			     		       new OverlayItem(p, "Hello", placeInput);
			            itemizedOverlay.addOverlay(overlayitem);
				        mapC.animateTo(p);
				        mapC.setZoom(8);			   
				        }
			        else{
	        	
	        	  }
		
	       
	        	}catch (Exception f) {
		        	
		        	}
					
		        	
		        	}
				search = null;	
				tp = null;
			}
			  
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
}