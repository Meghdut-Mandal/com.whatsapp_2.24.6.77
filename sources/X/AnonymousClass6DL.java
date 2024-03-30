package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.6DL  reason: invalid class name */
public final class AnonymousClass6DL {
    public int A00;
    public C159627jf A01;
    public final C105695Fr A02;
    public final C105705Fs A03;
    public final C1255460h A04;
    public final C131376Ou A05;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r1.isEmpty() != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C128786Dp r9, X.C159627jf r10, java.util.Map r11, X.AnonymousClass011 r12) {
        /*
            r8 = this;
            r7 = 0
            r6 = 1
            int r0 = r9.A00
            r8.A00 = r0
            r8.A01 = r10
            java.lang.String r5 = "app_id"
            java.lang.Object r0 = r11.get(r5)
            r1 = 0
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "No parameters or no app_id"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.6PH r0 = X.AnonymousClass6PH.A03
            r10.BXS(r0, r1)
            return r7
        L_0x001c:
            X.6Ou r0 = r8.A05
            X.6EW r2 = r0.A00()
            java.lang.Class<X.70C> r1 = X.AnonymousClass70C.class
            r0 = 5
            X.AnonymousClass6EW.A00(r2, r1, r8, r0)
            java.lang.String r4 = X.C90464aC.A0a(r5, r11)
            int r3 = r8.A00
            java.lang.String r2 = "requestBloksScreen"
            X.5Fs r1 = r8.A03
            X.0zf r0 = r1.A01
            r0.A03(r3, r2)
            if (r4 == 0) goto L_0x003c
            r1.A02(r3, r5, r4)
        L_0x003c:
            java.lang.String r0 = "data"
            java.lang.Object r1 = r11.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00dd
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00dd
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            X.5Tg r0 = X.C108375Tg.ADDITIONAL_PARAMS
            java.lang.String r0 = r0.key
            java.lang.Object r1 = r11.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0062
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0062
            r4.putAll(r1)
        L_0x0062:
            X.5Tg r0 = X.C108375Tg.RESUMABLE_DATA
            java.lang.String r3 = r0.key
            X.9XM r2 = r9.A02
            if (r2 == 0) goto L_0x0080
            java.util.Stack r1 = r2.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0080
            java.lang.Object r0 = r1.peek()
            X.9Wh r0 = (X.C195849Wh) r0
            java.util.Map r1 = r0.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0084
        L_0x0080:
            X.00f r1 = X.C000400e.A0D()
        L_0x0084:
            r4.put(r3, r1)
            X.5Tg r0 = X.C108375Tg.EXTENSIONS_CONTEXT
            java.lang.String r5 = r0.key
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            X.5Tg r0 = X.C108375Tg.EXTENSIONS_IS_RESUMED
            java.lang.String r1 = r0.key
            if (r2 == 0) goto L_0x00de
            boolean r0 = r2.A01
        L_0x0097:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.put(r1, r0)
            X.5Tg r0 = X.C108375Tg.EXTENSIONS_IS_BACK_TRIGGERED
            java.lang.String r2 = r0.key
            java.lang.String r1 = "is_back_triggered"
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00ae
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
        L_0x00ae:
            r3.put(r2, r0)
            r4.put(r5, r3)
            r4.remove(r1)
            X.60h r3 = r8.A04
            java.lang.Object r2 = r12.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r12.second
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r0 = X.C023109s.A00
            X.6oS r5 = r3.A00
            r5.A00(r0, r2, r1, r4)
            java.lang.Object r4 = r12.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r12.second
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer r2 = X.C023109s.A01
            java.lang.String r1 = r9.A04
            java.lang.String r0 = "job_id"
            java.util.Map r0 = X.C36391kE.A11(r0, r1)
            r5.A00(r2, r4, r3, r0)
        L_0x00dd:
            return r6
        L_0x00de:
            r0 = 0
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6DL.A02(X.6Dp, X.7jf, java.util.Map, X.011):boolean");
    }

    public final void A00(String str) {
        C120345rM r1 = this.A04.A00.A00;
        synchronized (r1) {
            r1.A00.remove(str);
        }
        this.A05.A00().A03(AnonymousClass70C.class, this);
    }

    public final void A01(Map map) {
        this.A05.A00().A03(AnonymousClass70C.class, this);
        C159627jf r4 = this.A01;
        if (r4 == null) {
            return;
        }
        if (map == null || !AnonymousClass00C.A0J(map.get(C108355Te.SUCCESS_FLAG.key), "false")) {
            Log.w("Finishing Bloks resource with success");
            r4.BiH(map);
            return;
        }
        Log.w("Finishing Bloks resource with failure");
        r4.BXS(new AnonymousClass6PH((Integer) null, "BloksScreenFinishWithError", "Finishing Bloks resource with failure"), map);
    }

    public AnonymousClass6DL(C1255460h r2, C105695Fr r3, C105705Fs r4, C131376Ou r5) {
        C36321k7.A0y(r5, r3);
        AnonymousClass00C.A0D(r4, 4);
        this.A05 = r5;
        this.A04 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
