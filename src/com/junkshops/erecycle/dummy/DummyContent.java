package com.junkshops.erecycle.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 3 sample items.
		addItem(new DummyItem("1", "4M AND I JUNKSHOP", "Electronics, Construction, Plastic, Paper, Bottle, Metal"));
		addItem(new DummyItem("2", "ADZ JUNKSHOP", "Plastic, Paper, Bottle, Metal"));
		addItem(new DummyItem("3", "AJA JUNKSHOP", "Electronics, Construction, Plastic, Paper, Bottle, Metal, Hazardous, Glass, Gardening"));
		addItem(new DummyItem("4", "AJERO JUNKSHOP", "Household, Electronics, Construction, Plastic, Paper, Bottle, Metal, Hazardous, Glass, Gardening")); 
		addItem(new DummyItem("5", "ALLAN LAGOS JUNKSHOP", "Automobile, Plastic, Paper, Bottle, Metal"));
		addItem(new DummyItem("6", "ALTABLING JUNKSHOP", "Plastic, Paper, Bottle, Metal"));
		addItem(new DummyItem("7", "BAR & CRIS JUNKSHOP", "Construction, Battery, Metal"));
		addItem(new DummyItem("8", "BER JUNKSHOP", "Construction, Battery, Metal"));
		addItem(new DummyItem("9", "BIG CRANE JUNKSHOP", "Plastic, Paper, Bottle, Metal"));
		addItem(new DummyItem("10", "BILLONES JUNKSHOP", "Automobile, Household, Electronics, Construction, Plastic, Paper, Bottle, Metal, Hazardous, Glass, Gardening"));
		addItem(new DummyItem("11", "CHARLYN MASARQUE JUNKSHOP", "Hazardous, Electronics, Glass, Metal, Gardening"));
		addItem(new DummyItem("12", "CM FAJARDO JUNKSHOP", "Paint, Hazardous, Metal, Household, Electronics, Construction, Plastic, Paper, Bottle, Glass, Gardening"));
		addItem(new DummyItem("13", "DIOGENES JUNKSHOP", "Construction, Battery, Metal"));
		addItem(new DummyItem("14", "DON DAX'S JUNKSHOP", "Plastic, Paper, Bottle, Metal"));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
		ITEM_MAP.put(item.subti, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String content;
		public String subti;


		public DummyItem(String id, String content, String subti) {
			this.id = id;
			this.content = content;
			this.subti = subti;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
