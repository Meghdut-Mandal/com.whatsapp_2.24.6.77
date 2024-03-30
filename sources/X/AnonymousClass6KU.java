package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6KU  reason: invalid class name */
public final class AnonymousClass6KU {
    public static final C125425zt A03 = new C125425zt();
    public final String A00;
    public final Map A01;
    public final AnonymousClass6KU[] A02;

    public AnonymousClass6KU(String str, AnonymousClass6KU[] r7) {
        LinkedHashMap linkedHashMap;
        this.A00 = str;
        this.A02 = r7;
        if (r7 != null) {
            linkedHashMap = new LinkedHashMap(C90484aE.A05(r4));
            for (AnonymousClass6KU r1 : r7) {
                linkedHashMap.put(r1.A00, r1);
            }
        } else {
            linkedHashMap = null;
        }
        this.A01 = linkedHashMap;
    }
}
