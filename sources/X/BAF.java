package X;

public class BAF implements C22974AzQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public BAF(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        ((X.C178808hb) r0).A02.setChecked(r1);
        r2.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r5 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r5 != 1440) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0098, code lost:
        r2.A1r(r7.A01, com.whatsapp.R.plurals.f10nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r5 != 1441) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        X.C165607th.A1F(r2, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r1 = (X.C195069Sj) r1.A00;
        r4 = new X.C23186B8u(r2, 23);
        r3 = new X.C23186B8u(r2, 24);
        r2 = r1.A02;
        r1 = r1.A01;
        r0 = r2.A05(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r7 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        if (r0 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r0 = r2.A04(r1, r4, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r0 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        r0 = X.C202939my.A00(r1, r3, r1.getString(com.whatsapp.R.string.f12nameremoved));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        X.C179158jJ.A0j(r2, (java.util.Map) null, r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2.A00("on_success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bf8(X.C202059ky r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0005;
                case 2: goto L_0x0021;
                case 3: goto L_0x0005;
                case 4: goto L_0x005e;
                case 5: goto L_0x0073;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r6.A01
            X.6C8 r2 = (X.AnonymousClass6C8) r2
            if (r7 != 0) goto L_0x00dc
        L_0x000b:
            java.lang.String r0 = "on_success"
            r2.A00(r0)
            return
        L_0x0011:
            java.lang.Object r0 = r6.A00
            X.8jJ r0 = (X.C179158jJ) r0
            java.lang.Object r2 = r6.A01
            X.6C8 r2 = (X.AnonymousClass6C8) r2
            if (r7 != 0) goto L_0x00dc
            X.1Z2 r0 = r0.A0B
            r0.A00()
            goto L_0x000b
        L_0x0021:
            java.lang.Object r3 = r6.A01
            X.6C8 r3 = (X.AnonymousClass6C8) r3
            if (r7 == 0) goto L_0x0058
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            int r1 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r1 != r0) goto L_0x0042
            int r0 = r7.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "remaining_retries"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_incorrect"
        L_0x003e:
            r3.A01(r0, r2)
            return
        L_0x0042:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r1 != r0) goto L_0x0054
            long r0 = r7.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "next_retry_ts"
            r2.put(r0, r1)
            java.lang.String r0 = "pin_rate_limited"
            goto L_0x003e
        L_0x0054:
            X.C179158jJ.A0j(r3, r2, r1)
            return
        L_0x0058:
            java.lang.String r0 = "on_success"
            r3.A00(r0)
            return
        L_0x005e:
            java.lang.Object r1 = r6.A00
            X.BAM r1 = (X.BAM) r1
            java.lang.Object r2 = r6.A01
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A1p()
            if (r7 != 0) goto L_0x0092
            java.lang.Object r0 = r1.A00
            X.9Sj r0 = (X.C195069Sj) r0
            X.Awe r0 = r0.A07
            r1 = 0
            goto L_0x0087
        L_0x0073:
            java.lang.Object r1 = r6.A00
            X.BAM r1 = (X.BAM) r1
            java.lang.Object r2 = r6.A01
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r2
            r2.A1p()
            if (r7 != 0) goto L_0x0092
            java.lang.Object r0 = r1.A00
            X.9Sj r0 = (X.C195069Sj) r0
            X.Awe r0 = r0.A07
            r1 = 1
        L_0x0087:
            X.8hb r0 = (X.C178808hb) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.setChecked(r1)
            r2.A1b()
            return
        L_0x0092:
            int r5 = r7.A00
            r0 = 1440(0x5a0, float:2.018E-42)
            if (r5 != r0) goto L_0x00a1
            int r1 = r7.A01
            r0 = 2131755267(0x7f100103, float:1.9141408E38)
            r2.A1r(r1, r0)
            return
        L_0x00a1:
            r0 = 1441(0x5a1, float:2.019E-42)
            if (r5 != r0) goto L_0x00ab
            long r0 = r7.A02
            X.C165607th.A1F(r2, r0)
            return
        L_0x00ab:
            java.lang.Object r1 = r1.A00
            X.9Sj r1 = (X.C195069Sj) r1
            r0 = 23
            X.B8u r4 = new X.B8u
            r4.<init>(r2, r0)
            r0 = 24
            X.B8u r3 = new X.B8u
            r3.<init>(r2, r0)
            X.9my r2 = r1.A02
            X.155 r1 = r1.A01
            X.0FM r0 = r2.A05(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00d8
            X.0FM r0 = r2.A04(r1, r4, r3, r5)
            if (r0 != 0) goto L_0x00d8
            r0 = 2131892408(0x7f1218b8, float:1.9419563E38)
            java.lang.String r0 = r1.getString(r0)
            X.0FM r0 = X.C202939my.A00(r1, r3, r0)
        L_0x00d8:
            r0.show()
            return
        L_0x00dc:
            r1 = 0
            int r0 = r7.A00
            X.C179158jJ.A0j(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BAF.Bf8(X.9ky):void");
    }
}
