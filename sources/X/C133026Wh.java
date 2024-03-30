package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Wh  reason: invalid class name and case insensitive filesystem */
public final class C133026Wh {
    public static final C133026Wh A00 = new C133026Wh();

    public static final void A01(C161027m0 r2, Object obj, String str) {
        AnonymousClass00C.A0D(obj, 2);
        if (obj instanceof Number) {
            r2.BPA(str, C36431kI.A09(obj));
        } else if (obj instanceof Boolean) {
            r2.BPC(str, AnonymousClass000.A1X(obj));
        } else {
            r2.BPB(str, obj.toString());
        }
    }

    public static final void A03(Long l, String str, String str2, Map map, int i) {
        AnonymousClass00C.A0D(map, 3);
        C161027m0 A002 = A00(str, i);
        if (A002 != null) {
            if (l == null) {
                A002.BPK(str2);
            } else {
                A002.BPL(str2, l.longValue());
            }
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                A11.getKey();
                A11.getValue();
                A02(A002, map);
            }
        }
    }

    public static final C161027m0 A00(String str, int i) {
        C130336Kr r6;
        C161027m0 r0;
        if (str == null) {
            return null;
        }
        int parseInt = Integer.parseInt(str);
        synchronized (C130336Kr.A05) {
            r6 = C130336Kr.A04;
            if (r6 == null) {
                r6 = new C130336Kr();
                C130336Kr.A04 = r6;
            }
        }
        long j = (((long) parseInt) & 4294967295L) | ((((long) i) << 32) & -4294967296L);
        synchronized (r6) {
            r0 = (C161027m0) r6.A00.get(j);
        }
        return r0;
    }

    public static final void A02(C161027m0 r4, Map map) {
        String str;
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object key = A11.getKey();
            Object value = A11.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (str = key.toString()) == null) {
                    str = key.toString();
                }
                A01(r4, value, str);
            }
        }
    }
}
