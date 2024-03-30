package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Mp  reason: invalid class name and case insensitive filesystem */
public class C130836Mp {
    public static final C130836Mp A03 = new C130836Mp((C130836Mp) null, "empty", Collections.emptyList());
    public final C130836Mp A00;
    public final String A01;
    public final List A02;

    public void A00(AnonymousClass3PT r14) {
        for (C120775s3 r5 : this.A02) {
            AnonymousClass5o1 r2 = r5.A00;
            Set set = (Set) r2.A01.A01.get(r2.A00);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C140456lc A0Y = C90514aH.A0Y(it);
                    String A0a = A0Y.A0a(38, "");
                    C1255360g r22 = r5.A02;
                    String A0p = AnonymousClass000.A0p("bloks/impression-time-tracker/", A0a, C36341k9.A0i(A0a));
                    AnonymousClass00C.A0D(A0p, 0);
                    Map map = r22.A00;
                    Object obj = map.get(AnonymousClass000.A0p("bloks/impression-time-tracker/", A0p, AnonymousClass000.A0u()));
                    if (obj instanceof Long) {
                        C36431kI.A09(obj);
                    }
                    AnonymousClass00C.A0D(A0a, 0);
                    Object obj2 = map.get(AnonymousClass000.A0p("bloks/impression-time-tracker/", A0a, AnonymousClass000.A0u()));
                    if (obj2 instanceof Long) {
                        C36431kI.A09(obj2);
                    }
                    C53052qd r6 = new C53052qd(this, r14);
                    C160377ku A0E = C140456lc.A0E(A0Y);
                    Map map2 = r14.A03;
                    String str = this.A01;
                    if (((AnonymousClass365) map2.get(str)).A00 == C023109s.A00 && A0E != null) {
                        map.put(C36321k7.A0D("bloks/impression-time-tracker/", A0a), C90484aE.A0g());
                        C1273868b A012 = C1273868b.A01(r6);
                        C1271967i r1 = r5.A01;
                        A012.A09(r1, 1);
                        C1273868b.A06(r1, A0Y, A012, A0E);
                    }
                    C160377ku A0X = A0Y.A0X(36);
                    if (A0X != null && ((AnonymousClass365) map2.get(str)).A00 == C023109s.A0C) {
                        C1273868b A013 = C1273868b.A01(r6);
                        C1271967i r12 = r5.A01;
                        A013.A09(r12, 1);
                        C1273868b.A06(r12, A0Y, A013, A0X);
                    }
                    C160377ku A0X2 = A0Y.A0X(40);
                    if (A0X2 != null && ((AnonymousClass365) map2.get(str)).A00 == C023109s.A01) {
                        C1273868b A014 = C1273868b.A01(r6);
                        C1271967i r13 = r5.A01;
                        A014.A09(r13, 1);
                        C1273868b.A06(r13, A0Y, A014, A0X2);
                    }
                }
            }
        }
        r14.A03.get(this.A01);
    }

    public C130836Mp(C130836Mp r1, String str, List list) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = list;
    }
}
