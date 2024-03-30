package X;

import java.util.HashMap;

/* renamed from: X.1k6  reason: invalid class name and case insensitive filesystem */
public class C36311k6 extends HashMap {
    public final int A00;

    public C36311k6(int i) {
        int i2;
        String str;
        this.A00 = i;
        if (i != 0) {
            put(0, "NO_CATEGORY");
            put(1, "MANIFEST_WAITING");
            put(2, "MANIFEST_ERROR");
            put(3, "LOADING");
            put(4, "LOAD_FAILED");
            i2 = 5;
            str = "UP_TO_DATE";
        } else {
            i2 = "x-fb-request-origin";
            str = "WhatsApp";
        }
        put(i2, str);
    }
}
