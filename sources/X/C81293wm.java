package X;

import com.whatsapp.R;

/* renamed from: X.3wm  reason: invalid class name and case insensitive filesystem */
public class C81293wm implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public C81293wm(C599535x r2) {
        this.A02 = 24;
        this.A01 = r2;
        this.A00 = R.string.f12nameremoved;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        X.AnonymousClass3TS.A03(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        r2.A06(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
        r0.BSs(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0173, code lost:
        X.C36341k9.A16(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0176, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02b2, code lost:
        r0.A05(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x02b6;
                case 1: goto L_0x005c;
                case 2: goto L_0x0068;
                case 3: goto L_0x0070;
                case 4: goto L_0x007b;
                case 5: goto L_0x0091;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00fa;
                case 10: goto L_0x0104;
                case 11: goto L_0x0119;
                case 12: goto L_0x012b;
                case 13: goto L_0x0167;
                case 14: goto L_0x0184;
                case 15: goto L_0x0193;
                case 16: goto L_0x019d;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x01c0;
                case 20: goto L_0x01e7;
                case 21: goto L_0x0205;
                case 22: goto L_0x0211;
                case 23: goto L_0x028b;
                case 24: goto L_0x02a0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r13.A01
            X.3P4 r6 = (X.AnonymousClass3P4) r6
            int r8 = r13.A00
            monitor-enter(r6)
            java.util.HashMap r1 = r6.A00     // Catch:{ all -> 0x0059 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0059 }
            java.lang.Object r7 = r1.get(r0)     // Catch:{ all -> 0x0059 }
            X.37X r7 = (X.AnonymousClass37X) r7     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0057
            X.AnonymousClass3P4.A00(r7, r6)     // Catch:{ all -> 0x0059 }
            X.0wo r2 = r6.A01     // Catch:{ all -> 0x0059 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0059 }
            r7.A00 = r0     // Catch:{ all -> 0x0059 }
            X.2QW r4 = r7.A01     // Catch:{ all -> 0x0059 }
            X.18g r0 = r6.A03     // Catch:{ all -> 0x0059 }
            long r2 = X.C19970wo.A00(r2)     // Catch:{ all -> 0x0059 }
            X.18d r0 = r0.A00     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences r1 = X.C233518d.A00(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "session_start_timestamp"
            long r0 = X.C36371kC.A08(r1, r0)     // Catch:{ all -> 0x0059 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0059 }
            r4.A01 = r0     // Catch:{ all -> 0x0059 }
            X.0wU r5 = r6.A04     // Catch:{ all -> 0x0059 }
            X.00T r0 = r6.A05     // Catch:{ all -> 0x0059 }
            long r3 = X.C36351kA.A08(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "TimeSpentExternalEventLogger/logExternalEvent"
            r1 = 17
            X.3wm r0 = new X.3wm     // Catch:{ all -> 0x0059 }
            r0.<init>((java.lang.Object) r6, (int) r8, (int) r1)     // Catch:{ all -> 0x0059 }
            X.1jE r0 = r5.BpM(r0, r2, r3)     // Catch:{ all -> 0x0059 }
            r7.A02 = r0     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r6)
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x005c:
            java.lang.Object r1 = r13.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r13.A00
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            r1.setAnimation((int) r0)
            return
        L_0x0068:
            java.lang.Object r2 = r13.A01
            X.3TS r2 = (X.AnonymousClass3TS) r2
            int r1 = r13.A00
            r0 = 4
            goto L_0x0077
        L_0x0070:
            java.lang.Object r2 = r13.A01
            X.3TS r2 = (X.AnonymousClass3TS) r2
            int r1 = r13.A00
            r0 = 3
        L_0x0077:
            X.AnonymousClass3TS.A03(r2, r1, r0)
            return
        L_0x007b:
            java.lang.Object r3 = r13.A01
            X.9mr r3 = (X.C202899mr) r3
            X.11F r2 = r3.A0D
            r1 = 401(0x191, float:5.62E-43)
            X.C202899mr.A00(r2, r3)
            X.1O8 r0 = r3.A0F
            r0.A00(r2, r1)
            X.17Y r2 = r3.A04
            r1 = 2131889567(0x7f120d9f, float:1.9413801E38)
            goto L_0x00af
        L_0x0091:
            java.lang.Object r3 = r13.A01
            X.9mr r3 = (X.C202899mr) r3
            int r2 = r13.A00
            X.11F r1 = r3.A0D
            X.C202899mr.A00(r1, r3)
            X.1O8 r0 = r3.A0F
            r0.A00(r1, r2)
            X.17Y r2 = r3.A04
            boolean r0 = X.AnonymousClass143.A0G(r1)
            r1 = 2131889568(0x7f120da0, float:1.9413803E38)
            if (r0 == 0) goto L_0x00af
            r1 = 2131889565(0x7f120d9d, float:1.9413797E38)
        L_0x00af:
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x00b4:
            java.lang.Object r3 = r13.A01
            X.4X4 r3 = (X.AnonymousClass4X4) r3
            int r2 = r13.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ptvcameraui/error "
            X.C36321k7.A1U(r0, r1, r2)
            r0 = 4
            if (r2 != r0) goto L_0x00d3
            java.lang.Object r0 = r3.A00
            X.3UB r0 = (X.AnonymousClass3UB) r0
            X.17Y r2 = r0.A0S
            r1 = 2131895641(0x7f122559, float:1.942612E38)
            r0 = 1
            r2.A06(r1, r0)
        L_0x00d3:
            java.lang.Object r1 = r3.A00
            X.3UB r1 = (X.AnonymousClass3UB) r1
            r0 = 0
            X.AnonymousClass3UB.A06(r1, r0, r0)
            X.7kJ r0 = r1.A0V
            r0.BSr()
            return
        L_0x00e1:
            java.lang.Object r0 = r13.A01
            X.1mP r0 = (X.C37461mP) r0
            int r1 = r13.A00
            X.4UB r0 = r0.A07
            goto L_0x00f6
        L_0x00ea:
            java.lang.Object r0 = r13.A01
            X.4X4 r0 = (X.AnonymousClass4X4) r0
            int r1 = r13.A00
            java.lang.Object r0 = r0.A00
            com.whatsapp.qrcode.QrScannerViewV2 r0 = (com.whatsapp.qrcode.QrScannerViewV2) r0
            X.4UB r0 = r0.A04
        L_0x00f6:
            r0.BSs(r1)
            return
        L_0x00fa:
            java.lang.Object r1 = r13.A01
            X.4Ta r1 = (X.C88524Ta) r1
            int r0 = r13.A00
            r1.onError(r0)
            return
        L_0x0104:
            java.lang.Object r0 = r13.A01
            X.3pT r0 = (X.C76803pT) r0
            X.32s r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.1cX r0 = r2.A05
            int r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x02bf
            com.whatsapp.report.BusinessActivityReportViewModel.A01(r2)
            return
        L_0x0119:
            java.lang.Object r0 = r13.A01
            X.3pU r0 = (X.C76813pU) r0
            X.32r r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.00s r1 = r2.A01
            r0 = 2
            X.C36341k9.A16(r1, r0)
            X.00s r1 = r2.A02
            r0 = 0
            goto L_0x0173
        L_0x012b:
            java.lang.Object r2 = r13.A01
            com.whatsapp.report.activity.banreport.BanReportViewModel r2 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r2
            int r1 = r13.A00
            X.30P r0 = r2.A04
            java.lang.String r10 = r2.A00
            X.1U2 r4 = r0.A00
            X.0tq r3 = r4.A00
            X.0ww r5 = X.C36381kD.A0U(r3)
            X.0v0 r6 = X.C36351kA.A0Y(r3)
            X.004 r0 = r3.A96
            X.005 r9 = X.C18840tu.A00(r0)
            X.004 r0 = r3.A8i
            java.lang.Object r8 = r0.get()
            X.0wt r8 = (X.C20020wt) r8
            X.0yC r7 = X.C36341k9.A0V(r3)
            X.1U1 r0 = r4.A01
            X.004 r11 = r0.A1O
            X.004 r12 = r0.A0D
            X.2dH r4 = new X.2dH
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.3mV r0 = new X.3mV
            r0.<init>(r2, r1)
            r4.Blp(r0)
            return
        L_0x0167:
            java.lang.Object r4 = r13.A01
            com.whatsapp.report.activity.banreport.BanReportViewModel r4 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r4
            int r3 = r13.A00
            r0 = 5
            if (r3 <= r0) goto L_0x0177
            X.00s r1 = r4.A02
            r0 = 1
        L_0x0173:
            X.C36341k9.A16(r1, r0)
            return
        L_0x0177:
            X.0wU r2 = r4.A08
            r1 = 12
            X.3wm r0 = new X.3wm
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.Boy(r0)
            return
        L_0x0184:
            java.lang.Object r2 = r13.A01
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            int r1 = r13.A00
            com.whatsapp.WaImageButton r0 = r2.A0W
            r0.setVisibility(r1)
            com.whatsapp.search.views.TokenizedSearchInput.A05(r2)
            return
        L_0x0193:
            java.lang.Object r1 = r13.A01
            com.whatsapp.text.AutoSizeTextView r1 = (com.whatsapp.text.AutoSizeTextView) r1
            int r0 = r13.A00
            r1.A0E(r0)
            return
        L_0x019d:
            java.lang.Object r1 = r13.A01
            X.2gA r1 = (X.AnonymousClass2gA) r1
            int r7 = r13.A00
            android.widget.TextView r0 = r1.A04
            android.content.Context r6 = r0.getContext()
            X.0yb r5 = r1.A05
            X.0ts r4 = r1.A06
            r3 = 2131755384(0x7f100178, float:1.9141646E38)
            long r1 = (long) r7
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1J(r0, r7)
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            X.C33521fV.A00(r6, r5, r0)
            return
        L_0x01c0:
            java.lang.Object r4 = r13.A01
            X.3P4 r4 = (X.AnonymousClass3P4) r4
            int r0 = r13.A00
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x01e4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e4 }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x01e4 }
            X.37X r0 = (X.AnonymousClass37X) r0     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x01e2
            X.AnonymousClass3P4.A00(r0, r4)     // Catch:{ all -> 0x01e4 }
            X.0wU r1 = r4.A04     // Catch:{ all -> 0x01e4 }
            java.lang.Runnable r0 = r0.A02     // Catch:{ all -> 0x01e4 }
            r1.Bnx(r0)     // Catch:{ all -> 0x01e4 }
            r3.remove(r2)     // Catch:{ all -> 0x01e4 }
        L_0x01e2:
            monitor-exit(r4)
            return
        L_0x01e4:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01e7:
            java.lang.Object r2 = r13.A01
            X.14u r2 = (X.C225314u) r2
            int r1 = r13.A00
            r2.Bnv()
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x01fe
            r1 = 2131895102(0x7f12233e, float:1.9425028E38)
            r0 = 2131895101(0x7f12233d, float:1.9425026E38)
            X.C36401kF.A1D(r2, r1, r0)
            return
        L_0x01fe:
            r0 = 2131895130(0x7f12235a, float:1.9425084E38)
            r2.BO5(r0)
            return
        L_0x0205:
            java.lang.Object r0 = r13.A01
            X.6YP r0 = (X.AnonymousClass6YP) r0
            int r1 = r13.A00
            X.01I r0 = r0.A0c
            X.AnonymousClass3SJ.A01(r0, r1)
            return
        L_0x0211:
            java.lang.Object r5 = r13.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r5 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r5
            int r1 = r13.A00
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0F
            X.0D3 r2 = r0.A0Q(r1)
            if (r2 == 0) goto L_0x02bf
            android.content.Context r0 = r5.A1D()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165550(0x7f07016e, float:1.794532E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            android.view.View r7 = r2.A0H
            int r2 = r7.getWidth()
            int r0 = r7.getHeight()
            int r0 = r0 + r1
            r6 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6, r6, r2, r0)
            androidx.core.widget.NestedScrollView r0 = r5.A0E
            r0.requestChildRectangleOnScreen(r7, r1, r6)
            int r1 = r5.A06
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            X.C011504z.A04(r0, r7)
            r0 = 255(0xff, float:3.57E-43)
            android.graphics.drawable.Drawable r4 = r7.getBackground()
            r3 = 1
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r3]
            int[] r1 = X.C36441kJ.A1O()
            r1[r6] = r0
            r1[r3] = r6
            java.lang.String r0 = "alpha"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r0, r1)
            r2[r6] = r0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r4, r2)
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            r2.setTarget(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.setDuration(r0)
            r2.start()
            X.6X3 r1 = r5.A0L
            if (r1 == 0) goto L_0x02bf
            boolean r0 = r1.A07()
            if (r0 != 0) goto L_0x02bf
            r0 = 3
            X.AnonymousClass6X3.A01(r1, r0)
            r1.A05 = r3
            return
        L_0x028b:
            java.lang.Object r1 = r13.A01
            X.3GB r1 = (X.AnonymousClass3GB) r1
            int r3 = r13.A00
            r2 = 0
            X.AnonymousClass00C.A0D(r1, r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x02bf
            X.17Y r0 = r1.A01
            goto L_0x02b2
        L_0x02a0:
            java.lang.Object r1 = r13.A01
            X.35x r1 = (X.C599535x) r1
            r3 = 2131890184(0x7f121008, float:1.9415053E38)
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A00
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x02bf
            X.17Y r0 = r1.A01
        L_0x02b2:
            r0.A05(r2, r3)
            return
        L_0x02b6:
            java.lang.Object r1 = r13.A01
            X.0CZ r1 = (X.AnonymousClass0CZ) r1
            int r0 = r13.A00
            r1.A07(r0)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81293wm.run():void");
    }

    public C81293wm(C202899mr r2, int i, int i2) {
        this.A02 = i2;
        if (4 - i2 != 0) {
            this.A01 = r2;
            this.A00 = i;
            return;
        }
        this.A01 = r2;
        this.A00 = 401;
    }

    public C81293wm(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }
}
