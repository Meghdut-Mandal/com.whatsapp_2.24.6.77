package X;

/* renamed from: X.3v5  reason: invalid class name and case insensitive filesystem */
public class C80243v5 implements Runnable {
    public Object A00;
    public final int A01;

    public C80243v5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C80243v5 A00(Object obj, int i) {
        return new C80243v5(obj, i);
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C80243v5(obj, i));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:205|206|207) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0208, code lost:
        X.AnonymousClass3UT.A07(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x020b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0346, code lost:
        r6 = r3.A00;
        r2 = r7.A02;
        r5 = r2.A09(r6.BIB());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0352, code lost:
        if (r5 != null) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r4 = r6.BOD();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0359, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x035a, code lost:
        r4 = null;
        com.whatsapp.util.Log.e("mediathumbloader/bitmapLoader error ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0361, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05e8, code lost:
        r5.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0617, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0618, code lost:
        if (r2 == false) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x061a, code lost:
        r0 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x061c, code lost:
        r1.A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x061f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r3.postDelayed(A00(r4, r0), (long) (((float) 300) * X.AnonymousClass3UT.A00(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0684, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0688, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x068b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x068f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0692, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0696, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:207:0x0389 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0036;
                case 2: goto L_0x007d;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00da;
                case 5: goto L_0x01f5;
                case 6: goto L_0x01f5;
                case 7: goto L_0x0203;
                case 8: goto L_0x00e9;
                case 9: goto L_0x005f;
                case 10: goto L_0x00fb;
                case 11: goto L_0x01fd;
                case 12: goto L_0x020c;
                case 13: goto L_0x021d;
                case 14: goto L_0x0229;
                case 15: goto L_0x0112;
                case 16: goto L_0x0235;
                case 17: goto L_0x0143;
                case 18: goto L_0x016e;
                case 19: goto L_0x023d;
                case 20: goto L_0x0259;
                case 21: goto L_0x0262;
                case 22: goto L_0x026b;
                case 23: goto L_0x028c;
                case 24: goto L_0x0308;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0310;
                case 29: goto L_0x031e;
                case 30: goto L_0x0326;
                case 31: goto L_0x0188;
                case 32: goto L_0x038f;
                case 33: goto L_0x039e;
                case 34: goto L_0x01bb;
                case 35: goto L_0x03a6;
                case 36: goto L_0x01d9;
                case 37: goto L_0x03d7;
                case 38: goto L_0x03f1;
                case 39: goto L_0x0405;
                case 40: goto L_0x040f;
                case 41: goto L_0x0430;
                case 42: goto L_0x0438;
                case 43: goto L_0x0569;
                case 44: goto L_0x0577;
                case 45: goto L_0x05d2;
                case 46: goto L_0x0590;
                case 47: goto L_0x05ec;
                case 48: goto L_0x05f4;
                case 49: goto L_0x0605;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1b()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r3 = r10.A00
            X.2FT r3 = (X.AnonymousClass2FT) r3
            X.12P r0 = r3.A00
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x000c
            X.1Xa r0 = r3.A01
            java.util.ArrayList r0 = r0.A03()
            java.util.Iterator r2 = r0.iterator()
        L_0x0024:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r2.next()
            X.2bT r1 = (X.AnonymousClass2bT) r1
            X.3hV r0 = r3.A02
            r0.A04(r1)
            goto L_0x0024
        L_0x0036:
            java.lang.Object r3 = r10.A00
            X.3t4 r3 = (X.C79033t4) r3
            X.12P r0 = r3.A00
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x000c
            X.1Xa r0 = r3.A01
            java.util.ArrayList r0 = r0.A03()
            java.util.Iterator r2 = r0.iterator()
        L_0x004d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r1 = r2.next()
            X.2bT r1 = (X.AnonymousClass2bT) r1
            X.3hV r0 = r3.A02
            r0.A04(r1)
            goto L_0x004d
        L_0x005f:
            java.lang.Object r4 = r10.A00
            X.3UT r4 = (X.AnonymousClass3UT) r4
            r4.A0A()
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x0076
            X.1rd r1 = r4.A0F
            if (r1 == 0) goto L_0x0076
            X.4BS r0 = new X.4BS
            r0.<init>(r4)
            goto L_0x00c2
        L_0x0076:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A08
            if (r3 == 0) goto L_0x000c
            r0 = 10
            goto L_0x0090
        L_0x007d:
            java.lang.Object r4 = r10.A00
            X.3UT r4 = (X.AnonymousClass3UT) r4
            com.whatsapp.KeyboardPopupLayout r0 = r4.A08
            if (r0 == 0) goto L_0x00a1
            boolean r0 = X.AnonymousClass1N2.A00(r0)
            if (r0 == 0) goto L_0x00a1
            com.whatsapp.KeyboardPopupLayout r3 = r4.A08
            if (r3 == 0) goto L_0x000c
            r0 = 6
        L_0x0090:
            X.3v5 r2 = A00(r4, r0)
            r0 = 300(0x12c, float:4.2E-43)
            float r1 = (float) r0
            float r0 = X.AnonymousClass3UT.A00(r4)
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x00a1:
            com.whatsapp.WaEditText r0 = r4.A09
            X.C36421kH.A1D(r0)
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x00c5
            X.1rd r0 = r4.A0F
            if (r0 == 0) goto L_0x00c5
            float r1 = X.AnonymousClass3UT.A00(r4)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c5
            X.1rd r1 = r4.A0F
            if (r1 == 0) goto L_0x000c
            X.4BT r0 = new X.4BT
            r0.<init>(r4)
        L_0x00c2:
            r1.A00 = r0
            return
        L_0x00c5:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A08
            if (r3 == 0) goto L_0x000c
            r0 = 5
            goto L_0x0090
        L_0x00cb:
            java.lang.Object r1 = r10.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            r0 = 0
            r1.A0K = r0
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x000c
            X.AnonymousClass3UT.A04(r1)
            return
        L_0x00da:
            java.lang.Object r0 = r10.A00
            X.3UT r0 = (X.AnonymousClass3UT) r0
            com.whatsapp.KeyboardPopupLayout r1 = r0.A08
            if (r1 == 0) goto L_0x000c
            r0 = 0
            r1.A04 = r0
            r1.requestLayout()
            return
        L_0x00e9:
            java.lang.Object r2 = r10.A00
            X.3UT r2 = (X.AnonymousClass3UT) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A06
            if (r0 == 0) goto L_0x000c
            int r1 = r0.A0J
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A0E
            if (r0 == 0) goto L_0x000c
            r0.A0E(r1)
            return
        L_0x00fb:
            java.lang.Object r2 = r10.A00
            X.3UT r2 = (X.AnonymousClass3UT) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A06
            if (r0 == 0) goto L_0x000c
            int r1 = r0.A0J
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A0E
            if (r0 == 0) goto L_0x010c
            r0.A0E(r1)
        L_0x010c:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A0E
            X.AnonymousClass3UT.A02(r0, r2)
            return
        L_0x0112:
            java.lang.Object r3 = r10.A00
            com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity r3 = (com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity) r3
            X.0yC r1 = r3.A0D
            r0 = 6715(0x1a3b, float:9.41E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x000c
            X.13q r0 = X.AnonymousClass11F.A00
            X.13o r2 = com.whatsapp.jid.Jid.Companion
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "extra_business_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            com.whatsapp.jid.Jid r0 = r2.A02(r0)
            X.11F r4 = X.C222713q.A00(r0)
            boolean r2 = r4 instanceof X.C28981Uw
            X.1N6 r1 = r3.A00
            if (r1 != 0) goto L_0x0617
            java.lang.String r0 = "navigationTimeSpentManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0143:
            java.lang.Object r3 = r10.A00
            com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity r3 = (com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity) r3
            X.0yC r1 = r3.A0D
            r0 = 6715(0x1a3b, float:9.41E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x000c
            X.13q r2 = X.AnonymousClass11F.A00
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.11F r4 = r2.A02(r0)
            boolean r2 = r4 instanceof X.C28981Uw
            X.1N6 r1 = r3.A00
            if (r1 != 0) goto L_0x0617
            java.lang.String r0 = "navigationTimeSpentManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x016e:
            java.lang.Object r1 = r10.A00
            X.2Mg r1 = (X.AnonymousClass2Mg) r1
            java.lang.String r0 = r1.A02
            java.util.Map r7 = X.AnonymousClass977.A00(r0)
            if (r7 == 0) goto L_0x000c
            X.6TL r2 = r1.A00
            java.lang.String r3 = r1.A04
            java.lang.String r4 = r1.A05
            java.lang.String r5 = r1.A03
            java.lang.String r6 = r1.A01
            r2.A03(r3, r4, r5, r6, r7)
            return
        L_0x0188:
            java.lang.Object r4 = r10.A00
            X.5Lf r4 = (X.C106755Lf) r4
            X.C18740tg.A00()
            java.io.File r3 = X.C106755Lf.A00(r4)
            if (r3 == 0) goto L_0x000c
            X.51z r0 = r4.A03
            X.1PN r0 = r0.A02
            java.util.LinkedHashMap r1 = r0.A06()
            int r0 = r1.size()
            java.util.ArrayList r2 = X.C36441kJ.A14(r0)
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r1)
        L_0x01a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0620
            java.lang.Object r0 = r1.next()
            X.33z r0 = (X.C594533z) r0
            java.lang.Object r0 = r0.A01
            r2.add(r0)
            goto L_0x01a9
        L_0x01bb:
            java.lang.Object r2 = r10.A00
            com.whatsapp.gifsearch.GifSearchContainer r2 = (com.whatsapp.gifsearch.GifSearchContainer) r2
            java.lang.CharSequence r0 = r2.A0J
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.A0K
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x000c
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x000c
            java.lang.CharSequence r0 = r2.A0J
            com.whatsapp.gifsearch.GifSearchContainer.A00(r2, r0)
            return
        L_0x01d9:
            java.lang.Object r2 = r10.A00
            X.6n9 r2 = (X.AnonymousClass6n9) r2
            X.0ze r1 = r2.A03
            int r0 = X.AnonymousClass6n9.A00(r2)
            boolean r0 = r1.BMN(r0)
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "event_timed_out"
            r2.BPE(r1, r0)
            r0 = 3
            r2.BPF(r0)
            return
        L_0x01f5:
            java.lang.Object r0 = r10.A00
            X.3UT r0 = (X.AnonymousClass3UT) r0
            X.AnonymousClass3UT.A05(r0)
            return
        L_0x01fd:
            java.lang.Object r1 = r10.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            r0 = 1
            goto L_0x0208
        L_0x0203:
            java.lang.Object r1 = r10.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            r0 = 0
        L_0x0208:
            X.AnonymousClass3UT.A07(r1, r0)
            return
        L_0x020c:
            java.lang.Object r0 = r10.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel) r0
            X.0v0 r0 = r0.A0C
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "sticker_picker_initial_download"
            X.C36331k8.A0w(r1, r0, r2)
            return
        L_0x021d:
            java.lang.Object r1 = r10.A00
            X.0Ws r1 = (X.C07200Ws) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.A00()
            return
        L_0x0229:
            java.lang.Object r1 = r10.A00
            android.view.View r1 = (android.view.View) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r0 = 8
            X.C36421kH.A0u(r1, r0)
            return
        L_0x0235:
            java.lang.Object r0 = r10.A00
            com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView r0 = (com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView) r0
            com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView.setUpFlowsFooterWithLogo$lambda$2(r0)
            return
        L_0x023d:
            java.lang.Object r2 = r10.A00
            com.whatsapp.extensions.webview.view.FlowsWebViewFragment r2 = (com.whatsapp.extensions.webview.view.FlowsWebViewFragment) r2
            X.4eH r0 = r2.A00
            if (r0 == 0) goto L_0x0248
            r0.stopLoading()
        L_0x0248:
            android.content.Context r1 = r2.A0a()
            r0 = 2131896185(0x7f122779, float:1.9427224E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -11
            r2.Bke(r1, r0)
            return
        L_0x0259:
            java.lang.Object r1 = r10.A00
            X.6X1 r1 = (X.AnonymousClass6X1) r1
            r0 = 1
            X.AnonymousClass6X1.A02(r1, r0)
            return
        L_0x0262:
            java.lang.Object r1 = r10.A00
            X.6X1 r1 = (X.AnonymousClass6X1) r1
            r0 = 1
            r1.A07(r0)
            return
        L_0x026b:
            java.lang.Object r2 = r10.A00
            X.6X1 r2 = (X.AnonymousClass6X1) r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A0C = r0
            X.19J r0 = r2.A02
            int r1 = r0.A04
            r0 = 2
            if (r1 != r0) goto L_0x0287
            X.6xm r1 = r2.A06
            byte[] r0 = r2.A0G
            java.lang.String r0 = r1.A00(r0)
            r2.A0D = r0
            return
        L_0x0287:
            r0 = 5
            X.AnonymousClass6X1.A01(r2, r0)
            return
        L_0x028c:
            java.lang.Object r7 = r10.A00
            X.3E5 r7 = (X.AnonymousClass3E5) r7
            java.util.concurrent.locks.Lock r6 = r7.A03
            r6.lock()
            boolean r0 = r7.A00     // Catch:{ all -> 0x0303 }
            if (r0 != 0) goto L_0x02ff
            X.0yG r1 = r7.A01     // Catch:{ all -> 0x0303 }
            java.io.File r3 = r1.A03     // Catch:{ all -> 0x0303 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0303 }
            if (r0 == 0) goto L_0x02ff
            r6.lock()     // Catch:{ all -> 0x0303 }
            r0 = 1
            r7.A00 = r0     // Catch:{ all -> 0x0303 }
            X.C20850yG.A00(r1)     // Catch:{ all -> 0x0303 }
            r5 = 0
            java.io.File[] r9 = r3.listFiles()     // Catch:{ OutOfMemoryError -> 0x02e1 }
            if (r9 == 0) goto L_0x02f2
            monitor-enter(r1)     // Catch:{ all -> 0x02f8 }
            java.io.File r8 = r1.A00     // Catch:{ all -> 0x02de }
            monitor-exit(r1)     // Catch:{ all -> 0x02f8 }
            int r4 = r9.length     // Catch:{ all -> 0x02f8 }
            r3 = 0
        L_0x02b9:
            if (r3 >= r4) goto L_0x02f2
            r2 = r9[r3]     // Catch:{ all -> 0x02f8 }
            if (r8 == 0) goto L_0x02cd
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x02f8 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x02d6
        L_0x02cd:
            r6.unlock()     // Catch:{ all -> 0x02f8 }
            X.AnonymousClass6YY.A0Q(r2)     // Catch:{ all -> 0x02d9 }
            r6.lock()     // Catch:{ all -> 0x02f8 }
        L_0x02d6:
            int r3 = r3 + 1
            goto L_0x02b9
        L_0x02d9:
            r0 = move-exception
            r6.lock()     // Catch:{ all -> 0x02f8 }
            goto L_0x02e0
        L_0x02de:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02f8 }
        L_0x02e0:
            throw r0     // Catch:{ all -> 0x02f8 }
        L_0x02e1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "trash/empty-trash/out-of-memory "
            r1.append(r0)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ all -> 0x02f8 }
            X.C36351kA.A1Q(r0, r1, r2)     // Catch:{ all -> 0x02f8 }
        L_0x02f2:
            r7.A00 = r5     // Catch:{ all -> 0x0303 }
            r6.unlock()     // Catch:{ all -> 0x0303 }
            goto L_0x02ff
        L_0x02f8:
            r0 = move-exception
            r7.A00 = r5     // Catch:{ all -> 0x0303 }
            r6.unlock()     // Catch:{ all -> 0x0303 }
            throw r0     // Catch:{ all -> 0x0303 }
        L_0x02ff:
            r6.unlock()
            return
        L_0x0303:
            r0 = move-exception
            r6.unlock()
            throw r0
        L_0x0308:
            java.lang.Object r0 = r10.A00
            X.1MP r0 = (X.AnonymousClass1MP) r0
            r0.A02()
            return
        L_0x0310:
            java.lang.Object r1 = r10.A00
            com.whatsapp.gallerypicker.MediaPickerFragment r1 = (com.whatsapp.gallerypicker.MediaPickerFragment) r1
            java.util.HashSet r0 = r1.A0M
            int r0 = r0.size()
            r1.A1d(r0)
            return
        L_0x031e:
            java.lang.Object r0 = r10.A00
            X.4U2 r0 = (X.AnonymousClass4U2) r0
            r0.BXH()
            return
        L_0x0326:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L_0x032b:
            java.lang.Object r7 = r10.A00
            X.3K8 r7 = (X.AnonymousClass3K8) r7
            java.util.ArrayList r1 = r7.A03
            monitor-enter(r1)
            boolean r0 = r7.A00     // Catch:{ all -> 0x038c }
            if (r0 == 0) goto L_0x0338
            monitor-exit(r1)     // Catch:{ all -> 0x038c }
            goto L_0x038b
        L_0x0338:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x038c }
            if (r0 != 0) goto L_0x0386
            r0 = 0
            java.lang.Object r3 = r1.remove(r0)     // Catch:{ all -> 0x038c }
            X.34h r3 = (X.C595334h) r3     // Catch:{ all -> 0x038c }
            monitor-exit(r1)     // Catch:{ all -> 0x038c }
            X.4TB r6 = r3.A00
            X.1PM r2 = r7.A02
            java.lang.String r0 = r6.BIB()
            java.lang.Object r5 = r2.A09(r0)
            if (r5 != 0) goto L_0x0361
            android.graphics.Bitmap r4 = r6.BOD()     // Catch:{ Exception -> 0x0359 }
            goto L_0x0362
        L_0x0359:
            r1 = move-exception
            r4 = 0
            java.lang.String r0 = "mediathumbloader/bitmapLoader error "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0362
        L_0x0361:
            r4 = r5
        L_0x0362:
            X.4U2 r3 = r3.A01
            if (r4 == 0) goto L_0x037a
            java.lang.String r0 = r6.BIB()
            r2.A0D(r0, r4)
            android.os.Handler r2 = r7.A01
            r1 = 40
            X.3vL r0 = new X.3vL
            r0.<init>(r3, r4, r5, r1)
        L_0x0376:
            r2.post(r0)
            goto L_0x032b
        L_0x037a:
            android.os.Handler r2 = r7.A01
            java.util.Objects.requireNonNull(r3)
            r0 = 29
            X.3v5 r0 = A00(r3, r0)
            goto L_0x0376
        L_0x0386:
            r1.wait()     // Catch:{ InterruptedException -> 0x0389 }
        L_0x0389:
            monitor-exit(r1)     // Catch:{ all -> 0x038c }
            goto L_0x032b
        L_0x038b:
            return
        L_0x038c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x038c }
            throw r0
        L_0x038f:
            java.lang.Object r0 = r10.A00
            X.5tS r0 = (X.C121635tS) r0
            java.lang.String r1 = r0.A00
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            X.AnonymousClass6YY.A0P(r0)
            return
        L_0x039e:
            java.lang.Object r0 = r10.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x03a6:
            java.lang.Object r6 = r10.A00
            com.whatsapp.glasses.layouts.StatusIndicator r6 = (com.whatsapp.glasses.layouts.StatusIndicator) r6
            android.graphics.Rect r5 = X.AnonymousClass001.A06()
            android.widget.TextView r4 = r6.A0L
            r4.getHitRect(r5)
            android.view.View r3 = r6.A0H
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168411(0x7f070c9b, float:1.7951123E38)
            r2 = 2131168411(0x7f070c9b, float:1.7951123E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = -r0
            int r0 = X.C36371kC.A03(r3, r2)
            int r0 = -r0
            r5.inset(r1, r0)
            android.widget.LinearLayout r1 = r6.A04
            android.view.TouchDelegate r0 = new android.view.TouchDelegate
            r0.<init>(r5, r4)
            r1.setTouchDelegate(r0)
            return
        L_0x03d7:
            java.lang.Object r1 = r10.A00
            android.os.Looper.prepare()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 47
            X.3wc r2 = new X.3wc
            r2.<init>(r1, r3, r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r2, r0)
            android.os.Looper.loop()
            return
        L_0x03f1:
            java.lang.Object r0 = r10.A00
            X.5Ly r0 = (X.C106945Ly) r0
            X.6VU r0 = r0.A01
            X.7jR r3 = r0.A03
            r2 = 0
            r0 = 3
            X.62u r1 = new X.62u
            r1.<init>(r2, r2, r0)
            r0 = 1
            r3.BWx(r1, r0)
            return
        L_0x0405:
            java.lang.Object r0 = r10.A00
            X.3OK r0 = (X.AnonymousClass3OK) r0
            X.17Y r0 = r0.A06
            r0.A02()
            return
        L_0x040f:
            java.lang.Object r1 = r10.A00
            X.3OK r1 = (X.AnonymousClass3OK) r1
            X.14u r0 = r1.A05
            android.view.View r2 = r0.A00
            X.AnonymousClass00C.A08(r2)
            android.content.Context r0 = r1.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131892109(0x7f12178d, float:1.9418957E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -1
            X.4t3 r0 = X.C99304t3.A01(r2, r1, r0)
            r0.A0P()
            return
        L_0x0430:
            java.lang.Object r0 = r10.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x0438:
            java.lang.Object r5 = r10.A00
            X.1uw r5 = (X.C40111uw) r5
            X.16D r0 = r5.A0J
            X.147 r6 = r5.A03
            X.141 r0 = r0.A0D(r6)
            r5.A02 = r0
            X.17X r4 = r5.A0O
            X.147 r0 = X.C65533Sl.A01(r6)
            int r0 = r4.A01(r0)
            int r1 = r0 + -1
            X.17r r2 = r4.A07
            int r0 = r2.A0A(r6)
            int r1 = r1 - r0
            r5.A01 = r1
            X.1PF r0 = r5.A0N
            int r0 = r0.A00(r6)
            r5.A00 = r0
            X.1EM r0 = r5.A0W
            boolean r1 = r0.A05(r6)
            X.00s r0 = r5.A07
            java.lang.Boolean r1 = X.C36441kJ.A0x(r1)
            r0.A0C(r1)
            X.00s r0 = r5.A0H
            r3 = 1
            r0.A0C(r1)
            X.00s r1 = r5.A0F
            X.0xQ r0 = r5.A0Q
            boolean r0 = r0.A0o(r6)
            X.C36341k9.A19(r1, r0)
            X.00s r7 = r5.A0E
            X.1Or r1 = r5.A0T
            X.141 r0 = r5.A02
            boolean r0 = r1.A00(r0)
            X.C36341k9.A19(r7, r0)
            X.00s r7 = r5.A0C
            X.141 r1 = r5.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            int r1 = r1.A04
            r0 = 1
            if (r1 == r3) goto L_0x049e
            r0 = 0
        L_0x049e:
            X.C36341k9.A19(r7, r0)
            X.00s r1 = r5.A0B
            X.141 r0 = r5.A02
            boolean r0 = r0.A12
            X.C36341k9.A19(r1, r0)
            X.00s r9 = r5.A05
            X.12q r0 = r5.A0L
            int r1 = r0.A05(r6)
            r0 = 3
            if (r1 == r0) goto L_0x0513
            boolean r0 = r4.A0D(r6)
            if (r0 == 0) goto L_0x0513
            X.6X6 r0 = r2.A0C(r6)
            X.0y7 r0 = r0.A07()
            X.14x r8 = r0.iterator()
        L_0x04c7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0513
            java.lang.Object r7 = r8.next()
            X.6PM r7 = (X.AnonymousClass6PM) r7
            X.0wQ r1 = r5.A0I
            com.whatsapp.jid.UserJid r0 = r7.A03
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x04c7
            int r1 = r7.A01
            r0 = 2
            if (r1 == r0) goto L_0x04c7
            r0 = 1
        L_0x04e3:
            X.C36341k9.A19(r9, r0)
            X.00s r1 = r5.A0D
            X.141 r0 = r5.A02
            boolean r0 = r0.A0p
            X.C36341k9.A19(r1, r0)
            X.00s r9 = r5.A04
            X.6X6 r0 = r2.A0C(r6)
            java.util.ArrayList r0 = r0.A0F()
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
        L_0x0501:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0515
            java.lang.Object r0 = r1.next()
            X.6PM r0 = (X.AnonymousClass6PM) r0
            com.whatsapp.jid.UserJid r0 = r0.A03
            r8.add(r0)
            goto L_0x0501
        L_0x0513:
            r0 = 0
            goto L_0x04e3
        L_0x0515:
            X.171 r7 = r5.A0K
            java.util.HashSet r2 = X.C36441kJ.A16()
            boolean r1 = X.AnonymousClass171.A05(r7, r8, r2)
            r0 = -1
            java.util.ArrayList r0 = r7.A0b(r2, r0, r1)
            r9.A0C(r0)
            X.00s r1 = r5.A0G
            X.141 r0 = r5.A02
            boolean r0 = r0.A0d
            r0 = r0 ^ 1
            X.C36341k9.A19(r1, r0)
            X.00s r1 = r5.A06
            X.141 r0 = r5.A02
            boolean r0 = r0.A13
            r0 = r0 ^ 1
            X.C36341k9.A19(r1, r0)
            X.00s r1 = r5.A0A
            X.141 r0 = r5.A02
            boolean r0 = r0.A0i
            r0 = r0 ^ 1
            X.C36341k9.A19(r1, r0)
            X.00s r1 = r5.A08
            X.141 r0 = r5.A02
            boolean r0 = r0.A0h
            X.C36341k9.A19(r1, r0)
            X.00s r2 = r5.A09
            boolean r0 = r4.A0D(r6)
            if (r0 == 0) goto L_0x0567
            X.0yC r1 = r5.A0P
            r0 = 5191(0x1447, float:7.274E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0567
        L_0x0563:
            X.C36341k9.A19(r2, r3)
            return
        L_0x0567:
            r3 = 0
            goto L_0x0563
        L_0x0569:
            java.lang.Object r0 = r10.A00
            X.3f2 r0 = (X.C70363f2) r0
            X.17Y r2 = r0.A00
            r1 = 2131893566(0x7f121d3e, float:1.9421912E38)
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x0577:
            java.lang.Object r4 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            android.view.View r1 = r4.A05
            r0 = 2131431019(0x7f0b0e6b, float:1.8483755E38)
            android.view.View r3 = r1.findViewById(r0)
            com.whatsapp.components.InviteViaLinkView r3 = (com.whatsapp.components.InviteViaLinkView) r3
            X.147 r2 = r4.A1Y
            X.2Sc r1 = r4.A1A
            X.147 r0 = r4.A1Z
            r3.setupOnClick(r2, r4, r1, r0)
            return
        L_0x0590:
            java.lang.Object r4 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.0xQ r6 = r4.A1J
            X.147 r5 = r4.A3t()
            r3 = 0
            if (r5 == 0) goto L_0x05c8
            X.1LV r0 = r6.A08
            X.147 r2 = r0.A02(r5)
            X.1EM r0 = r6.A11
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x05c8
            X.12q r0 = r6.A0M
            int r1 = r0.A05(r5)
            r0 = 2
            if (r1 == r0) goto L_0x05b7
            r0 = 6
            if (r1 != r0) goto L_0x05c8
        L_0x05b7:
            if (r2 == 0) goto L_0x05c8
            X.17X r1 = r6.A0U
            boolean r0 = r1.A0D(r2)
            if (r0 != 0) goto L_0x05c7
            boolean r0 = r1.A0D(r5)
            if (r0 == 0) goto L_0x05c8
        L_0x05c7:
            r3 = 1
        L_0x05c8:
            X.17Y r5 = r4.A05
            r1 = 38
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            goto L_0x05e8
        L_0x05d2:
            java.lang.Object r2 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.1LV r1 = r2.A0c
            X.147 r0 = r2.A1Y
            X.147 r0 = r1.A02(r0)
            r2.A1Z = r0
            X.17Y r5 = r2.A05
            r0 = 44
            X.3v5 r0 = A00(r2, r0)
        L_0x05e8:
            r5.A0H(r0)
            return
        L_0x05ec:
            java.lang.Object r0 = r10.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A1B(r0)
            return
        L_0x05f4:
            java.lang.Object r0 = r10.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            com.whatsapp.group.GroupChatInfoActivity.A1A(r0)
            X.3PA r0 = r0.A0X
            r0.A01()
            return
        L_0x0605:
            java.lang.Object r0 = r10.A00
            X.4XY r0 = (X.AnonymousClass4XY) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            X.1dx r2 = r0.A0O
            X.147 r1 = r0.A1Y
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            r2.A01(r1, r0)
            return
        L_0x0617:
            r0 = 4
            if (r2 == 0) goto L_0x061c
            r0 = 26
        L_0x061c:
            r1.A03(r4, r0)
            return
        L_0x0620:
            java.util.ArrayList r1 = X.C36441kJ.A15(r2)
            java.lang.String r9 = "file"
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch:{ IOException -> 0x0697 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0697 }
            java.io.BufferedWriter r7 = new java.io.BufferedWriter     // Catch:{ all -> 0x0690 }
            r7.<init>(r5)     // Catch:{ all -> 0x0690 }
            android.util.JsonWriter r8 = new android.util.JsonWriter     // Catch:{ all -> 0x0689 }
            r8.<init>(r7)     // Catch:{ all -> 0x0689 }
            r8.beginObject()     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = "mappings"
            r8.name(r0)     // Catch:{ all -> 0x0682 }
            r8.beginArray()     // Catch:{ all -> 0x0682 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x0682 }
        L_0x0644:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0682 }
            r3 = 0
            if (r0 == 0) goto L_0x0672
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0682 }
            X.5tS r2 = (X.C121635tS) r2     // Catch:{ all -> 0x0682 }
            r8.beginObject()     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = "url"
            android.util.JsonWriter r1 = r8.name(r0)     // Catch:{ all -> 0x0682 }
            if (r2 == 0) goto L_0x0670
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0682 }
        L_0x065e:
            r1.value(r0)     // Catch:{ all -> 0x0682 }
            android.util.JsonWriter r0 = r8.name(r9)     // Catch:{ all -> 0x0682 }
            if (r2 == 0) goto L_0x0669
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x0682 }
        L_0x0669:
            r0.value(r3)     // Catch:{ all -> 0x0682 }
            r8.endObject()     // Catch:{ all -> 0x0682 }
            goto L_0x0644
        L_0x0670:
            r0 = r3
            goto L_0x065e
        L_0x0672:
            r8.endArray()     // Catch:{ all -> 0x0682 }
            r8.endObject()     // Catch:{ all -> 0x0682 }
            r8.close()     // Catch:{ all -> 0x0689 }
            r7.close()     // Catch:{ all -> 0x0690 }
            r5.close()     // Catch:{ IOException -> 0x0697 }
            return
        L_0x0682:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0684 }
        L_0x0684:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x0689 }
            throw r0     // Catch:{ all -> 0x0689 }
        L_0x0689:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x068b }
        L_0x068b:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0690 }
            throw r0     // Catch:{ all -> 0x0690 }
        L_0x0690:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0692 }
        L_0x0692:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ IOException -> 0x0697 }
            throw r0     // Catch:{ IOException -> 0x0697 }
        L_0x0697:
            r1 = move-exception
            java.lang.String r0 = "DiskBackedGifCache/persistCache/error"
            com.whatsapp.util.Log.e(r0, r1)
            X.0wN r3 = r4.A02
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "disk-backed-gif-cache/save-error"
            r3.A0E(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80243v5.run():void");
    }
}
