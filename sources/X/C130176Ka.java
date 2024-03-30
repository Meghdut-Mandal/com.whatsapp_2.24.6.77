package X;

import android.os.ConditionVariable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.6Ka  reason: invalid class name and case insensitive filesystem */
public class C130176Ka {
    public final AnonymousClass1UG A00;
    public final C119175pM A01;
    public final Map A02 = new AnonymousClass008();
    public final Map A03 = new AnonymousClass008();

    public static C119175pM A00(C130176Ka r3, String str) {
        Object value;
        Map map = r3.A02;
        if (map.containsKey(str)) {
            value = map.get(str);
        } else {
            Iterator A0y = AnonymousClass000.A0y(r3.A03);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (C36361kB.A1Z(str, (Pattern) A11.getKey())) {
                    value = A11.getValue();
                }
            }
            return r3.A01;
        }
        return (C119175pM) value;
    }

    public C130176Ka(C119175pM r6, AnonymousClass1UG r7, Map map, Map map2) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A00 = r7;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            Object value = A11.getValue();
            C18740tg.A06(key);
            for (Object put : (Set) key) {
                this.A02.put(put, value);
            }
        }
        Iterator A0y2 = AnonymousClass000.A0y(map2);
        while (A0y2.hasNext()) {
            Map.Entry A112 = AnonymousClass000.A11(A0y2);
            Object key2 = A112.getKey();
            Object value2 = A112.getValue();
            C18740tg.A06(key2);
            for (Object put2 : (Set) key2) {
                this.A03.put(put2, value2);
            }
        }
        this.A01 = r6;
    }
}
