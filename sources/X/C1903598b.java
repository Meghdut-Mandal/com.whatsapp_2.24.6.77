package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.98b  reason: invalid class name and case insensitive filesystem */
public abstract class C1903598b {
    public static final Map A00;

    static {
        HashMap hashMap = new HashMap(9);
        A00 = hashMap;
        Integer num = C023109s.A0V;
        hashMap.put("xx-small", new AUX(num, 0.694f));
        hashMap.put("x-small", new AUX(num, 0.833f));
        hashMap.put("small", new AUX(num, 10.0f));
        hashMap.put("medium", new AUX(num, 12.0f));
        hashMap.put("large", new AUX(num, 14.4f));
        hashMap.put("x-large", new AUX(num, 17.3f));
        hashMap.put("xx-large", new AUX(num, 20.7f));
        Integer num2 = C023109s.A0X;
        hashMap.put("smaller", new AUX(num2, 83.33f));
        hashMap.put("larger", new AUX(num2, 120.0f));
    }
}
