package com.wireless.g5.bts.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Admins on 009 09/11/2560.
 */

public class ChartContent {

    public static final List<ChartItem> CHART_ITEMS = new ArrayList<ChartItem>();
    public static final Map<String, ChartItem> ITEM_MAP = new HashMap<String, ChartItem>();
    private static String time,content,details;

    static {
        fetchData(new ChartItem(time,content,details));
    }

    private static void fetchData(ChartItem item) {
        CHART_ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static ChartItem createDummyItem(int position) {
        return new ChartItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ChartItem {
        public final String id;
        public final String content;
        public final String details;

        public ChartItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

