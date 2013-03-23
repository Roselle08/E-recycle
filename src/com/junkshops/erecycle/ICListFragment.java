package com.junkshops.erecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.junkshops.erecycle.dummy.DummyContent;

/**
 * A list fragment representing a list of IC's. This fragment also supports
 * tablet devices by allowing list items to be given an 'activated' state upon
 * selection. This helps indicate which item is currently being viewed in a
 * {@link ICDetailFragment}.
 * <p>
 * Activities containing this fragment MUST implement the {@link Callbacks}
 * interface.
 */
public class ICListFragment extends ListFragment {
	String search = MainActivity.ser;
	String[] handle;
	/**
	 * The serialization (saved instance state) Bundle key representing the
	 * activated item position. Only used on tablets.
	 */
	private static final String STATE_ACTIVATED_POSITION = "activated_position";

	/**
	 * The fragment's current callback object, which is notified of list item
	 * clicks.
	 */
	private Callbacks mCallbacks = sDummyCallbacks;

	/**
	 * The current activated item position. Only used on tablets.
	 */
	private int mActivatedPosition = ListView.INVALID_POSITION;

	/**
	 * A callback interface that all activities containing this fragment must
	 * implement. This mechanism allows activities to be notified of item
	 * selections.
	 */
	public interface Callbacks {
		/**
		 * Callback for when an item has been selected.
		 */
		public void onItemSelected(String id);
	}

	/**
	 * A dummy implementation of the {@link Callbacks} interface that does
	 * nothing. Used only when this fragment is not attached to an activity.
	 */
	private static Callbacks sDummyCallbacks = new Callbacks() {
		@Override
		public void onItemSelected(String id) {
		}
	};

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ICListFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String sss;
		
		List<Map<String, String>> waw =new ArrayList<Map<String, String>>();
		// TODO: replace with a real list adapter.
		setListAdapter(new ArrayAdapter<DummyContent.DummyItem>(getActivity(),
				android.R.layout.simple_list_item_activated_1,
				android.R.id.text1, DummyContent.ITEMS));
		ArrayAdapter<DummyContent.DummyItem> adapter = (new ArrayAdapter<DummyContent.DummyItem>(getActivity(),
				android.R.layout.simple_list_item_activated_1,
				android.R.id.text1, DummyContent.ITEMS));
		int g = adapter.getCount();
		int a = 0;
		handle = new String[g];
		
		for(int i=0; i<g; ++i){
			sss =  (DummyContent.ITEMS.get(i).content + DummyContent.ITEMS.get(i).subti).replaceAll("\\s","").toLowerCase();
			if(sss.indexOf(search.replaceAll("\\s","").toLowerCase()) >= 0){
				
				Map<String, String> datim = new HashMap<String, String>(2);
				datim.put("Title", DummyContent.ITEMS.get(i).content);
				datim.put("SubTitle", DummyContent.ITEMS.get(i).subti);
				waw.add(datim);
				handle[a] = DummyContent.ITEMS.get(i).id;
				++a;
				}
		}
		SimpleAdapter adapter2 =   new SimpleAdapter(getActivity(), waw, android.R.layout.simple_list_item_2,
                new String[] {"Title", "SubTitle"},
                new int[] {android.R.id.text1,
                           android.R.id.text2});
		setListAdapter(adapter2);
		
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		// Restore the previously serialized activated item position.
		if (savedInstanceState != null
				&& savedInstanceState.containsKey(STATE_ACTIVATED_POSITION)) {
			setActivatedPosition(savedInstanceState
					.getInt(STATE_ACTIVATED_POSITION));
		}
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		// Activities containing this fragment must implement its callbacks.
		if (!(activity instanceof Callbacks)) {
			throw new IllegalStateException(
					"Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
	}

	@Override
	public void onDetach() {
		super.onDetach();

		// Reset the active callbacks interface to the dummy implementation.
		mCallbacks = sDummyCallbacks;
	}

	@Override
	public void onListItemClick(ListView listView, View view, int position,
			long id) {
		super.onListItemClick(listView, view, position, id);

		// Notify the active callbacks interface (the activity, if the
		// fragment is attached to one) that an item has been selected.
		if(search != null){
			mCallbacks.onItemSelected(handle[position]);
			}
			else{
				mCallbacks.onItemSelected(DummyContent.ITEMS.get(position).id);
				}
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		if (mActivatedPosition != ListView.INVALID_POSITION) {
			// Serialize and persist the activated item position.
			outState.putInt(STATE_ACTIVATED_POSITION, mActivatedPosition);
		}
	}

	/**
	 * Turns on activate-on-click mode. When this mode is on, list items will be
	 * given the 'activated' state when touched.
	 */
	public void setActivateOnItemClick(boolean activateOnItemClick) {
		// When setting CHOICE_MODE_SINGLE, ListView will automatically
		// give items the 'activated' state when touched.
		getListView().setChoiceMode(
				activateOnItemClick ? ListView.CHOICE_MODE_SINGLE
						: ListView.CHOICE_MODE_NONE);
	}

	private void setActivatedPosition(int position) {
		if (position == ListView.INVALID_POSITION) {
			getListView().setItemChecked(mActivatedPosition, false);
		} else {
			getListView().setItemChecked(position, true);
		}

		mActivatedPosition = position;
	}
}
