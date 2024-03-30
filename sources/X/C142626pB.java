package X;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6pB  reason: invalid class name and case insensitive filesystem */
public final class C142626pB implements C159177iw {
    public final AnonymousClass6DA A00;
    public final C20810yC A01;
    public final C21010yW A02;

    public final void A05(String str, String str2, String str3, int i) {
        if (AnonymousClass6TR.A01(this.A01)) {
            AnonymousClass2RY r3 = new AnonymousClass2RY();
            int i2 = i;
            C90514aH.A1L(r3, C36431kI.A12(), i2);
            r3.A02 = 2;
            A01(this, r3);
            String str4 = str2;
            Integer valueOf = Integer.valueOf(str2.length());
            LinkedHashMap A1G = C36431kI.A1G();
            if (valueOf != null) {
                A1G.put("query_length", valueOf);
            }
            A1G.put("location_type", str3);
            r3.A04 = C90474aD.A0k(A1G);
            this.A02.Bly(r3);
            A03((Boolean) null, 2, str4, str, (String) null, (String) null, 6, i2);
        }
    }

    public void BOY(Integer num, Integer num2) {
    }

    public void BOy(Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i) {
    }

    public static final Integer A00(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        int i = 0;
        if (intValue != 0) {
            i = 1;
            if (intValue != 1) {
                i = 2;
                if (intValue != 5) {
                    return null;
                }
            }
        }
        return Integer.valueOf(i);
    }

    public static final void A01(C142626pB r1, AnonymousClass2RY r2) {
        AnonymousClass6DA r12 = r1.A00;
        r2.A06 = r12.A01;
        r2.A03 = r12.A01();
        r2.A05 = r12.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.Boolean r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, int r14) {
        /*
            r6 = this;
            X.6TR r2 = X.AnonymousClass6YD.A0P
            X.0yC r1 = r6.A01
            boolean r0 = r2.A03(r1)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r2.A02(r1)
            if (r0 == 0) goto L_0x0079
        L_0x0010:
            r0 = 6329(0x18b9, float:8.869E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0079
            X.58X r3 = new X.58X
            r3.<init>()
            r3.A09 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A00 = r0
            r3.A04 = r12
            r3.A0A = r10
            boolean r0 = X.AnonymousClass000.A1O(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            r2 = 1
            boolean r0 = X.C36371kC.A1X(r7, r2)
            if (r0 == 0) goto L_0x007a
            r1 = 3
        L_0x003b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x003f:
            r3.A02 = r0
            X.6DA r1 = r6.A00
            java.lang.String r0 = r1.A03
            r3.A05 = r0
            java.lang.String r0 = r1.A02()
            r3.A08 = r0
            java.lang.String r0 = r1.A02
            r3.A07 = r0
            X.8eS r5 = r1.A04
            android.content.SharedPreferences r0 = r5.A00()
            java.lang.String r4 = "pref_saved_search_session_action_order"
            int r0 = X.C36371kC.A01(r0, r4)
            long r1 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.A03 = r0
            if (r0 == 0) goto L_0x0070
            int r0 = (int) r1
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C90474aD.A0H(r5)
            X.C36341k9.A0v(r0, r4, r1)
        L_0x0070:
            if (r11 == 0) goto L_0x0074
            r3.A06 = r11
        L_0x0074:
            X.0yW r0 = r6.A02
            r0.Bly(r3)
        L_0x0079:
            return
        L_0x007a:
            if (r8 == 0) goto L_0x008e
            int r0 = r8.intValue()
            r1 = 2
            if (r0 == r1) goto L_0x003b
            if (r0 != r2) goto L_0x0087
            r1 = 0
            goto L_0x003b
        L_0x0087:
            if (r0 != 0) goto L_0x008e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x003f
        L_0x008e:
            r0 = 0
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142626pB.A03(java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public final void A04(String str) {
        if (AnonymousClass6TR.A01(this.A01)) {
            AnonymousClass2RY r2 = new AnonymousClass2RY();
            r2.A00 = C36401kF.A0h();
            r2.A01 = C36361kB.A0i();
            A01(this, r2);
            LinkedHashMap A1G = C36431kI.A1G();
            A1G.put("location_type", str);
            r2.A04 = C90474aD.A0k(A1G);
            this.A02.Bly(r2);
        }
    }

    public C142626pB(AnonymousClass6DA r1, C20810yC r2, C21010yW r3) {
        C36321k7.A11(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static final void A02(AnonymousClass2RY r2, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, List list) {
        LinkedHashMap A1G = C36431kI.A1G();
        if (num != null) {
            A1G.put("query_length", num);
        }
        if (num4 != null) {
            A1G.put("serp_size", num4);
        }
        if (num5 != null) {
            A1G.put("error_type", num5);
        }
        if (list != null) {
            A1G.put("error_code", list);
        }
        if (num2 != null) {
            A1G.put("item_rank", num2);
        }
        if (num3 != null) {
            A1G.put("local_serp_size", num3);
        }
        if (str != null) {
            A1G.put("location_type", str);
        }
        if (l != null) {
            A1G.put("latency", l);
        }
        if (bool != null) {
            A1G.put("is_cached", bool);
        }
        r2.A04 = C90474aD.A0k(A1G);
    }
}
