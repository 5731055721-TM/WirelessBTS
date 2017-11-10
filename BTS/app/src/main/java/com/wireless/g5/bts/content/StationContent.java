package com.wireless.g5.bts.content;

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
public class StationContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS_SUKHUMVIT = new ArrayList<DummyItem>();
    public static final List<DummyItem> ITEMS_SILOM = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP_SUKHUMVIT = new HashMap<String, DummyItem>();
    public static final Map<String, DummyItem> ITEM_MAP_SILOM = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }
        addItemSukhumvit(new DummyItem("N8","หมอชิต","N8"));
        addItemSukhumvit(new DummyItem("N7","สะพานควาย","N7"));
        addItemSukhumvit(new DummyItem("N5","อารีย์","N5"));
        addItemSukhumvit(new DummyItem("N4","สนามเป้า","N4"));
        addItemSukhumvit(new DummyItem("N3","อนุสาวรีย์ชัยสมรภูมิ","N3"));
        addItemSukhumvit(new DummyItem("N2","พญาไท","N2"));
        addItemSukhumvit(new DummyItem("N1","ราชเทวี","N1"));
        addItemSukhumvit(new DummyItem("CEN","สยาม","CEN"));
        addItemSukhumvit(new DummyItem("E1","ชิดลม","E1"));
        addItemSukhumvit(new DummyItem("E2","เพลินจิต","E2"));
        addItemSukhumvit(new DummyItem("E3","นานา","E3"));
        addItemSukhumvit(new DummyItem("E5","พร้อมพงษ์","E5"));
        addItemSukhumvit(new DummyItem("E6","ทองหล่อ","E6"));
        addItemSukhumvit(new DummyItem("E7","เอกมัย","E7"));
        addItemSukhumvit(new DummyItem("E8","พระโขนง","E8"));
        addItemSukhumvit(new DummyItem("E9","อ่อนนุช","E9"));
        addItemSukhumvit(new DummyItem("E10","บางจาก","E10"));
        addItemSukhumvit(new DummyItem("E11","ปุณณวิถี","E11"));
        addItemSukhumvit(new DummyItem("E12","อุดมสุข","E12"));
        addItemSukhumvit(new DummyItem("E13","บางนา","E13"));
        addItemSukhumvit(new DummyItem("E14","แบริ่ง","E14"));
        addItemSukhumvit(new DummyItem("E15","สำโรง","E15"));

        addItemSilom(new DummyItem("W1","สนามกีฬาแห่งชาติ","W1"));
        addItemSilom(new DummyItem("CEN","สยาม","CEN"));
        addItemSilom(new DummyItem("S1","ราชดำริ","S1"));
        addItemSilom(new DummyItem("S2","ศาลาแดง","S2"));
        addItemSilom(new DummyItem("S3","ช่องนนทรี","S3"));
        addItemSilom(new DummyItem("S5","สุรศักดิ์ิ","S5"));
        addItemSilom(new DummyItem("S6","สะพานตากสิน","S6"));
        addItemSilom(new DummyItem("S7","กรุงธนบุรี","S7"));
        addItemSilom(new DummyItem("S8","วงเวียนใหญ่","S8"));
        addItemSilom(new DummyItem("S9","โพธิ์นิมิตร","S9"));
        addItemSilom(new DummyItem("S10","ตลาดพลู","S10"));
        addItemSilom(new DummyItem("S11","วุฒากาศ","S11"));
        addItemSilom(new DummyItem("S12","บางหว้า","S12"));
    }

    private static void addItemSukhumvit(DummyItem item) {
        ITEMS_SUKHUMVIT.add(item);
        ITEM_MAP_SUKHUMVIT.put(item.id, item);
    }
    private static void addItemSilom(DummyItem item) {
        ITEMS_SILOM.add(item);
        ITEM_MAP_SILOM.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
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
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
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
