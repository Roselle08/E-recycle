package com.junkshops.erecycle;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.junkshops.erecycle.dummy.DummyContent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing a single IC detail screen. This fragment is either
 * contained in a {@link ICListActivity} in two-pane mode (on tablets) or a
 * {@link ICDetailActivity} on handsets.
 */
public class ICDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private DummyContent.DummyItem mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ICDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = DummyContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_ic_detail,
				container, false);

		// Show the dummy content as text in a TextView.
		if (mItem != null) {
			((TextView) rootView.findViewById(R.id.ic_detail))
					.setText(mItem.content);
		}
		if(mItem.id == "1"){
			mapa.search = "51 KATIHAN ST.,, POBLACION, MUNTINLUPA CITY, NCR,FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt1());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "2"){
			mapa.search = "SUCAT, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt2());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "3"){
			mapa.search = "107-A PEREZ COMPD. CUPANG, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt3());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "4"){
			mapa.search = "ESPELETA PANTALAN POBL., MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt4());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "5"){
			mapa.search = "114 BUENDIA STREET,, TUNASAN, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt5());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "6"){
			mapa.search = "KM 27 NATIONAL RD. TUNASAN, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt6());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "7"){
			mapa.search = "TUNASAN, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt7());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "8"){
			mapa.search = "49 UPPER SUCAT ST., SUCAT,, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt8());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "9"){
			mapa.search = "662 CUPANG, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt9());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "10"){
			mapa.search = "066 MERALCO ROAD, PUROK 2, SUCAT, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt10());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "11"){
			mapa.search = "066 MERALCO ROAD, PUROK 2, SUCAT, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt11());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "12"){
			mapa.search = "06 SAN GUILLERMO ST., BAYANAN, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt12());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "13"){
			mapa.search = "TUNASAN, MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt13());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		if(mItem.id == "14"){
			mapa.search = "30 SAN GUILLERMO ST., MUNTINLUPA CITY, NCR, FOURTH DISTRICT";
			mapa.tp = "Muntinlupa City";
			((TextView) rootView.findViewById(R.id.textView3)).setText(readTxt14());
			((TextView) rootView.findViewById(R.id.item_dub)).setText(mItem.subti);
			}
		

		return rootView;
	}
	private String readTxt1(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.isa);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt2(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.dalawa);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt3(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.tatlo);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt4(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.apat);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt5(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.lima);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt6(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.anim);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt7(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.pito);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt8(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.walo);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt9(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.siyam);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt10(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.sampo);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt11(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.labingisa);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt12(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.labindalawa);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt13(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.labintatlo);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	private String readTxt14(){
    	
	   	 InputStream inputStream = getResources().openRawResource(R.raw.labinapat);
	   	
		     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		     
		     int i;
		  try {
			   i = inputStream.read();
			   while (i != -1)
			   {
		       byteArrayOutputStream.write(i);
		       i = inputStream.read();
			   }
			   inputStream.close();
			  	} catch (IOException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  
		     return byteArrayOutputStream.toString();
	   	}
	
	}
