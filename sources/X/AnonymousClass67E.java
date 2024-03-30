package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.67E  reason: invalid class name */
public final class AnonymousClass67E {
    public Map A00 = null;
    public C199679fm[] A01;
    public final String A02;
    public final byte[] A03;

    public void A00(C187928yl r3, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C187928yl.class);
            this.A00 = map;
        }
        map.put(r3, obj);
    }

    public AnonymousClass67E(String str, byte[] bArr, C199679fm[] r4) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = r4;
    }

    public String toString() {
        return this.A02;
    }
}
