package X;

/* renamed from: X.1Zt  reason: invalid class name and case insensitive filesystem */
public class C30241Zt implements C236319f {
    public final C30231Zs A00;
    public final C29501Ww A01;

    public int[] BCF() {
        return new int[]{198, 199, 200, 201};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 < 500) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJl(android.os.Message r8, int r9) {
        /*
            r7 = this;
            r3 = 1
            switch(r9) {
                case 198: goto L_0x0020;
                case 199: goto L_0x0006;
                case 200: goto L_0x00a0;
                case 201: goto L_0x0040;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            X.1Zs r0 = r7.A00
            int r2 = r8.arg2
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            X.4TQ r0 = (X.AnonymousClass4TQ) r0
            r0.Bbm(r2)
            goto L_0x0010
        L_0x0020:
            X.1Zs r1 = r7.A00
            java.lang.Object r2 = r8.obj
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.util.List r0 = r1.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0030:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            X.4TQ r0 = (X.AnonymousClass4TQ) r0
            r0.Bbn(r2)
            goto L_0x0030
        L_0x0040:
            X.1Ww r4 = r7.A01
            int r2 = r8.arg2
            X.0wQ r5 = r4.A05
            com.whatsapp.Me r1 = r5.A05()
            X.0wG r0 = r4.A0D
            android.content.Context r6 = r0.A00
            if (r1 == 0) goto L_0x009a
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x0084
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x0077
            r0 = 405(0x195, float:5.68E-43)
            if (r2 == r0) goto L_0x0096
            r0 = 409(0x199, float:5.73E-43)
            if (r2 == r0) goto L_0x0076
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x0076
        L_0x0064:
            X.0v0 r0 = r4.A0F
            r0.A24(r3)
            X.0xL r0 = r4.A06
            r0.A06()
        L_0x006e:
            r5.A0F()
            X.1VX r0 = r4.A03
            r0.A00()
        L_0x0076:
            return r3
        L_0x0077:
            android.os.Handler r2 = r4.A01
            r1 = 36
            X.1jD r0 = new X.1jD
            r0.<init>(r4, r6, r1)
            r2.post(r0)
            goto L_0x0064
        L_0x0084:
            java.lang.String r0 = "RegistrationManager/notifyChangeNumberError/match"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            android.os.Handler r2 = r4.A01
            r1 = 37
            X.1jD r0 = new X.1jD
            r0.<init>(r4, r6, r1)
            r2.post(r0)
            goto L_0x006e
        L_0x0096:
            r4.A05()
            return r3
        L_0x009a:
            java.lang.String r0 = "RegistrationManager/notifyChangeNumberError/response/error but already changed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x00a0:
            X.1Ww r0 = r7.A01
            r0.A05()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30241Zt.BJl(android.os.Message, int):boolean");
    }

    public C30241Zt(C30231Zs r1, C29501Ww r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
