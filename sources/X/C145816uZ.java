package X;

/* renamed from: X.6uZ  reason: invalid class name and case insensitive filesystem */
public class C145816uZ implements C159487jR {
    public final /* synthetic */ C145896uh A00;

    public C145816uZ(C145896uh r1) {
        this.A00 = r1;
    }

    public void BWx(C1261662u r3, int i) {
        C143526qh r1 = this.A00.A0B;
        if (r1 != null) {
            C143526qh.A05(r1, r3, i, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        throw X.C90514aH.A0s(X.AnonymousClass000.A0p("HomeWidgetsDelegate/getWidgetTypeById: Widget not supported: ", r2, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r1 = new X.C119275pY(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r1.A00 != 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r1.A01 = r4;
        X.C90504aG.A1K(r1, r3.A0B, r2);
        X.C143526qh.A04(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            X.6uh r0 = r7.A00
            X.6qh r3 = r0.A0B
            if (r3 == 0) goto L_0x002a
            boolean r0 = r8.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "HomeWidgetsDelegate/onFetchUnifiedHomeSuccess widgets list cannot be empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.5yM r2 = r3.A06
            r0 = 4
            r2.A02 = r0
            r0 = 3
            r2.A00 = r0
            r0 = 2
            r2.A01 = r0
            r1 = 7
            X.62u r0 = new X.62u
            r0.<init>(r4, r4, r1)
            r2.A07 = r0
            r3.A0A()
        L_0x002a:
            return
        L_0x002b:
            r6 = 0
            java.util.Iterator r5 = r8.iterator()
        L_0x0030:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r4 = r5.next()
            X.5pT r4 = (X.C119225pT) r4
            java.lang.String r2 = r4.A01
            int r0 = r2.hashCode()
            switch(r0) {
                case -1425004772: goto L_0x0072;
                case -1049482625: goto L_0x0068;
                case -805635793: goto L_0x005e;
                case 1594529602: goto L_0x0054;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "HomeWidgetsDelegate/getWidgetTypeById: Widget not supported: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0054:
            java.lang.String r0 = "popular_categories"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 1
            goto L_0x007b
        L_0x005e:
            java.lang.String r0 = "frequently_contacted_biz"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 3
            goto L_0x007b
        L_0x0068:
            java.lang.String r0 = "nearby"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 0
            goto L_0x007b
        L_0x0072:
            java.lang.String r0 = "verified_biz"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r2 = 2
        L_0x007b:
            int r0 = r4.A00
            X.5pY r1 = new X.5pY
            r1.<init>(r0)
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0087
            r6 = 1
        L_0x0087:
            r1.A01 = r4
            java.util.Map r0 = r3.A0B
            X.C90504aG.A1K(r1, r0, r2)
            X.C143526qh.A04(r3, r2)
            goto L_0x0030
        L_0x0092:
            if (r6 == 0) goto L_0x00cb
            java.util.Map r2 = r3.A0B
            java.lang.Integer r1 = X.C36381kD.A0m()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r2.get(r1)
            X.5pY r0 = (X.C119275pY) r0
            java.lang.Object r0 = r0.A01
            X.50t r0 = (X.C1025850t) r0
            X.6Du r0 = r0.A00
            r3.BST(r0)
        L_0x00af:
            java.lang.Integer r1 = X.C36371kC.A0n()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r2.get(r1)
            X.5pY r0 = (X.C119275pY) r0
            java.lang.Object r0 = r0.A01
            X.50s r0 = (X.C1025750s) r0
            int r1 = r0.A00
            X.3F3 r0 = r3.A0A
            r0.A00(r3, r1)
            return
        L_0x00cb:
            X.C143526qh.A03(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145816uZ.onSuccess(java.lang.Object):void");
    }
}
