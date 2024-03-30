package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;
import com.whatsapp.spamreport.ReportSpamDialogViewModel;

/* renamed from: X.74v  reason: invalid class name and case insensitive filesystem */
public class C1503274v implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public C1503274v(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX WARNING: type inference failed for: r0v149, types: [X.9WG] */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f3, code lost:
        r5.A0H(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0550, code lost:
        r0.A0E(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0553, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0671, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0675, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0676, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0677, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x067a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020b, code lost:
        if (r2 >= 0) goto L_0x020d;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:77:0x01e5, B:260:0x0658] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0368;
                case 1: goto L_0x037b;
                case 2: goto L_0x03b7;
                case 3: goto L_0x009c;
                case 4: goto L_0x03c7;
                case 5: goto L_0x03d2;
                case 6: goto L_0x03f8;
                case 7: goto L_0x0402;
                case 8: goto L_0x0133;
                case 9: goto L_0x0155;
                case 10: goto L_0x0414;
                case 11: goto L_0x044c;
                case 12: goto L_0x0173;
                case 13: goto L_0x0225;
                case 14: goto L_0x003a;
                case 15: goto L_0x04c6;
                case 16: goto L_0x04ef;
                case 17: goto L_0x006f;
                case 18: goto L_0x04fb;
                case 19: goto L_0x0284;
                case 20: goto L_0x0507;
                case 21: goto L_0x0511;
                case 22: goto L_0x0522;
                case 23: goto L_0x052e;
                case 24: goto L_0x0547;
                case 25: goto L_0x0554;
                case 26: goto L_0x02a5;
                case 27: goto L_0x02d6;
                case 28: goto L_0x0085;
                case 29: goto L_0x0560;
                case 30: goto L_0x05a1;
                case 31: goto L_0x05bd;
                case 32: goto L_0x05d7;
                case 33: goto L_0x02f7;
                case 34: goto L_0x05fd;
                case 35: goto L_0x061f;
                case 36: goto L_0x065c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r12.A00
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r5 = (com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer) r5
            java.lang.String r1 = r12.A01
            androidx.appcompat.widget.Toolbar r4 = r5.A03
            if (r4 == 0) goto L_0x002c
            X.0ts r3 = r5.A0A
            if (r3 == 0) goto L_0x0363
            android.content.Context r2 = r5.A0a()
            java.lang.String r0 = "close"
            boolean r1 = r0.equals(r1)
            r0 = 2131234005(0x7f080cd5, float:1.8084164E38)
            if (r1 == 0) goto L_0x0025
            r0 = 2131234080(0x7f080d20, float:1.8084316E38)
        L_0x0025:
            X.4vb r0 = X.C91364bt.A00(r2, r3, r0)
            r4.setNavigationIcon((android.graphics.drawable.Drawable) r0)
        L_0x002c:
            androidx.appcompat.widget.Toolbar r1 = r5.A03
            boolean r0 = r1 instanceof com.whatsapp.wds.components.topbar.WDSToolbar
            if (r0 == 0) goto L_0x0039
            com.whatsapp.wds.components.topbar.WDSToolbar r1 = (com.whatsapp.wds.components.topbar.WDSToolbar) r1
            if (r1 == 0) goto L_0x0039
            r1.A0L()
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r2 = r12.A00
            X.7yZ r2 = (X.C167687yZ) r2
            java.lang.String r5 = r12.A01
            X.1EU r1 = r2.A0G
            X.AnonymousClass1EU.A00(r1)
            X.1Ed r4 = r1.A05
            X.9lY r0 = r2.A07
            int r6 = r0.A03
            X.0wo r0 = r2.A03
            long r8 = X.C19970wo.A00(r0)
            long r10 = X.C19970wo.A00(r0)
            r7 = 401(0x191, float:5.62E-43)
            r4.A0Y(r5, r6, r7, r8, r10)
            X.AnonymousClass1EU.A00(r1)
            r3 = 0
            r0 = -1
            X.9lY r1 = r4.A0L(r3, r5, r0)
            X.17Y r5 = r2.A0B
            r0 = 8
            X.72v r4 = new X.72v
            r4.<init>(r2, r1, r0)
            goto L_0x02f3
        L_0x006f:
            java.lang.Object r2 = r12.A00
            com.whatsapp.profile.ProfilePhotoReminder r2 = (com.whatsapp.profile.ProfilePhotoReminder) r2
            java.lang.String r1 = r12.A01
            X.3ED r0 = r2.A0H
            r0.A00(r1)
            X.17Y r5 = r2.A05
            r0 = 9
            X.3wW r4 = new X.3wW
            r4.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x02f3
        L_0x0085:
            java.lang.Object r3 = r12.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            java.lang.String r2 = r12.A01
            X.1AP r0 = r3.A0H
            X.6CW r1 = r0.A04()
            X.17Y r5 = r3.A05
            r0 = 18
            X.74m r4 = new X.74m
            r4.<init>(r3, r1, r2, r0)
            goto L_0x02f3
        L_0x009c:
            java.lang.Object r0 = r12.A00
            X.6wT r0 = (X.C146976wT) r0
            java.lang.String r6 = r12.A01
            X.6TN r3 = r0.A01
            java.util.concurrent.CountDownLatch r4 = r0.A00
            X.5D6 r0 = r3.A00
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = "fpm/WifiDirectScannerConnectionHandler/WifiDirect is not initialized, we shouldn't be here."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00b0:
            android.net.wifi.p2p.WifiP2pManager r5 = r0.A01
            if (r5 == 0) goto L_0x00c0
            android.net.wifi.p2p.WifiP2pManager$Channel r2 = r0.A00
            java.lang.String r1 = "clearServiceRequests"
            X.6Zq r0 = new X.6Zq
            r0.<init>(r1)
            r5.clearServiceRequests(r2, r0)
        L_0x00c0:
            java.lang.Runnable r1 = r3.A01
            if (r1 == 0) goto L_0x00c9
            X.0wU r0 = r3.A05
            r0.Bnx(r1)
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            X.5D6 r9 = r3.A00     // Catch:{ InterruptedException -> 0x066b }
            android.net.wifi.p2p.WifiP2pConfig r8 = new android.net.wifi.p2p.WifiP2pConfig     // Catch:{ InterruptedException -> 0x066b }
            r8.<init>()     // Catch:{ InterruptedException -> 0x066b }
            r8.deviceAddress = r6     // Catch:{ InterruptedException -> 0x066b }
            android.net.wifi.WpsInfo r1 = r8.wps     // Catch:{ InterruptedException -> 0x066b }
            r0 = 0
            r1.setup = r0     // Catch:{ InterruptedException -> 0x066b }
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest r7 = r9.A00     // Catch:{ InterruptedException -> 0x066b }
            if (r7 == 0) goto L_0x00e8
            android.net.wifi.p2p.WifiP2pManager r2 = r9.A01     // Catch:{ InterruptedException -> 0x066b }
            r1 = 0
            if (r2 == 0) goto L_0x00e6
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r9.A00     // Catch:{ InterruptedException -> 0x066b }
            r2.removeServiceRequest(r0, r7, r1)     // Catch:{ InterruptedException -> 0x066b }
        L_0x00e6:
            r9.A00 = r1     // Catch:{ InterruptedException -> 0x066b }
        L_0x00e8:
            android.net.wifi.p2p.WifiP2pManager r0 = r9.A01     // Catch:{ InterruptedException -> 0x066b }
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "connect"
            X.6Zq r2 = new X.6Zq     // Catch:{ InterruptedException -> 0x066b }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x066b }
            android.net.wifi.p2p.WifiP2pManager r1 = r9.A01     // Catch:{ InterruptedException -> 0x066b }
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r9.A00     // Catch:{ InterruptedException -> 0x066b }
            r1.connect(r0, r8, r2)     // Catch:{ InterruptedException -> 0x066b }
            boolean r0 = r2.A00()     // Catch:{ InterruptedException -> 0x066b }
            if (r0 == 0) goto L_0x0114
            r1 = 30
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x066b }
            boolean r0 = r4.await(r1, r0)     // Catch:{ InterruptedException -> 0x066b }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "fpm/WifiDirectScannerConnectionHandler/Connect successful but network not connected"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x066b }
            r3.A01()     // Catch:{ InterruptedException -> 0x066b }
            goto L_0x066a
        L_0x0114:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ InterruptedException -> 0x066b }
            java.lang.String r0 = "fpm/WifiDirectScannerConnectionHandler/Unable to connect, attempt #"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x066b }
            int r5 = r5 + 1
            java.lang.String r0 = X.C36381kD.A10(r1, r5)     // Catch:{ InterruptedException -> 0x066b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x066b }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x066b }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x066b }
            r0 = 3
            if (r5 < r0) goto L_0x00ca
            r3.A01()
            return
        L_0x0133:
            java.lang.Object r3 = r12.A00
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r3 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r3
            java.lang.String r2 = r12.A01
            X.1A1 r1 = r3.A0e
            X.3Qa r0 = r3.A0H
            X.3T1 r1 = r1.A03(r0)
            X.2bZ r1 = (X.AnonymousClass2bZ) r1
            if (r1 == 0) goto L_0x0039
            X.9uk r0 = r1.A00
            if (r0 == 0) goto L_0x0039
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0039
            r0.A06 = r2
            X.0xM r0 = r3.A07
            r0.A0k(r1)
            return
        L_0x0155:
            java.lang.Object r2 = r12.A00
            com.whatsapp.payments.ui.BrazilPaymentActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r2
            java.lang.String r1 = r12.A01
            X.1EU r0 = r2.A0P
            X.AnonymousClass1EU.A00(r0)
            X.16S r0 = r0.A06
            X.9un r1 = r0.A07(r1)
            r2.Bnv()
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = r2.A0R
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            r0.BcR(r1)
            return
        L_0x0173:
            java.lang.Object r7 = r12.A00
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r7 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r7
            java.lang.String r6 = r12.A01
            X.9UE r5 = r7.A02
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x01c3
            X.5FZ r4 = r5.A01
            X.1EU r0 = r5.A00
            X.AnonymousClass1EU.A00(r0)
            X.16S r1 = r0.A06
            X.AnonymousClass00C.A08(r1)
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "Payment store cannot be initialized for device sync!"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.09w r0 = X.C023409w.A00
        L_0x0198:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x01a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9un r0 = (X.C207249un) r0
            java.lang.String r0 = r0.A0A
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            X.C36391kE.A1V(r1, r3, r0)
            goto L_0x01a0
        L_0x01b7:
            java.util.ArrayList r0 = r1.A09()
            goto L_0x0198
        L_0x01bc:
            java.util.List r0 = r5.A00(r3)
            r4.A01(r0)
        L_0x01c3:
            X.1EU r0 = r7.A03
            X.AnonymousClass1EU.A00(r0)
            X.16S r1 = r0.A06
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r9 = 0
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod called with empty credentialId"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01d6:
            X.00s r1 = r7.A01
            r0 = 2
            X.C36341k9.A17(r1, r0)
            return
        L_0x01dd:
            X.54d r0 = r1.A00
            X.1M0 r4 = r0.A04()
            java.lang.String r8 = "removePaymentMethod/DELETE_SCHEMA_PAY_METHODS"
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0671 }
            java.lang.String[] r2 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0671 }
            r2[r9] = r6     // Catch:{ all -> 0x0671 }
            java.lang.String r1 = "methods"
            java.lang.String r0 = "credential_id=?"
            int r2 = r3.A03(r1, r0, r8, r2)     // Catch:{ all -> 0x0671 }
            r0 = 1
            if (r2 != r0) goto L_0x0202
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod deleted: "
            X.C36321k7.A1Q(r0, r6, r1)     // Catch:{ all -> 0x0671 }
            goto L_0x020d
        L_0x0202:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0671 }
            java.lang.String r0 = "PAY: PaymentStore removePaymentMethod could not delete: "
            X.C36321k7.A1R(r0, r6, r1)     // Catch:{ all -> 0x0671 }
            if (r2 < 0) goto L_0x020e
        L_0x020d:
            r9 = 1
        L_0x020e:
            r4.close()
            if (r9 == 0) goto L_0x01d6
            X.00s r1 = r7.A01
            r0 = 3
            X.C36341k9.A17(r1, r0)
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x0039
            X.5FZ r0 = r5.A01
            r0.A00()
            return
        L_0x0225:
            java.lang.Object r5 = r12.A00
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r5 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r5
            java.lang.String r1 = r12.A01
            X.1EU r0 = r5.A03
            X.AnonymousClass1EU.A00(r0)
            X.16S r0 = r0.A06
            X.9un r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x0039
            boolean r0 = r1 instanceof X.C175788b3
            if (r0 == 0) goto L_0x0039
            X.8bF r6 = r1.A08
            boolean r0 = r6 instanceof X.C175738ay
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.data.BrazilCustomPaymentMethodData"
            X.AnonymousClass00C.A0E(r6, r0)
            X.8b9 r6 = (X.C175838b9) r6
            java.util.HashMap r1 = r6.A03
            java.lang.String r0 = "pix_key_type"
            java.lang.Object r0 = r1.get(r0)
            X.9u7 r0 = (X.C206859u7) r0
            r4 = 0
            if (r0 == 0) goto L_0x027c
            java.lang.String r3 = r0.A01
            if (r3 == 0) goto L_0x027c
            java.util.HashMap r1 = r6.A03
            java.lang.String r0 = "pix_key"
            java.lang.Object r0 = r1.get(r0)
            X.9u7 r0 = (X.C206859u7) r0
            if (r0 == 0) goto L_0x0282
            java.lang.String r2 = r0.A01
        L_0x0268:
            java.util.HashMap r1 = r6.A03
            java.lang.String r0 = "pix_display_name"
            java.lang.Object r0 = r1.get(r0)
            X.9u7 r0 = (X.C206859u7) r0
            if (r0 == 0) goto L_0x0276
            java.lang.String r4 = r0.A01
        L_0x0276:
            X.9WG r0 = new X.9WG
            r0.<init>(r3, r2, r4)
            r4 = r0
        L_0x027c:
            X.00s r0 = r5.A00
            r0.A0C(r4)
            return
        L_0x0282:
            r2 = r4
            goto L_0x0268
        L_0x0284:
            java.lang.Object r2 = r12.A00
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            java.lang.String r1 = r12.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0039
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0039
            com.whatsapp.WaEditText r0 = r2.A0I
            r0.setText(r1)
            com.whatsapp.WaEditText r1 = r2.A0I
            int r0 = r1.length()
            r1.setSelection(r0)
            return
        L_0x02a5:
            java.lang.Object r1 = r12.A00
            X.1Q1 r1 = (X.AnonymousClass1Q1) r1
            java.lang.String r0 = r12.A01
            r3 = 0
            java.lang.ref.WeakReference r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r0.get()
            X.15K r2 = (X.AnonymousClass15K) r2
            if (r2 == 0) goto L_0x0039
            X.01P r1 = r2.BAc()
            X.01P r0 = X.AnonymousClass01P.STARTED
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x0039
            r1 = 2131894538(0x7f12210a, float:1.9423884E38)
            r0 = 3500(0xdac, float:4.905E-42)
            X.3ZU r0 = r2.BHi(r1, r0, r3)
            X.AnonymousClass00C.A08(r0)
            r0.A02()
            return
        L_0x02d6:
            java.lang.Object r2 = r12.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r2 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r2
            java.lang.String r0 = r12.A01
            java.io.File r1 = X.C90524aI.A0S(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0039
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            X.17Y r5 = r2.A06
            r0 = 22
            X.3wd r4 = new X.3wd
            r4.<init>(r2, r1, r0)
        L_0x02f3:
            r5.A0H(r4)
            return
        L_0x02f7:
            java.lang.Object r6 = r12.A00
            X.6D2 r6 = (X.AnonymousClass6D2) r6
            com.whatsapp.videoplayback.ExoPlayerErrorFrame r5 = r6.A02
            r4 = 8
            r5.setLoadingViewVisibility(r4)
            java.lang.String r3 = r12.A01
            if (r3 != 0) goto L_0x0311
            android.content.Context r1 = r5.getContext()
            r0 = 2131895150(0x7f12236e, float:1.9425125E38)
            java.lang.String r3 = X.C36361kB.A0m(r1, r0)
        L_0x0311:
            android.widget.FrameLayout r0 = r5.A02
            if (r0 != 0) goto L_0x034a
            android.view.LayoutInflater r7 = X.C36351kA.A0C(r5)
            r1 = 2131626550(0x7f0e0a36, float:1.888034E38)
            r0 = 0
            r2 = 0
            android.view.View r1 = r7.inflate(r1, r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.AnonymousClass00C.A0E(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r5.A02 = r1
            android.widget.FrameLayout r0 = r5.A06
            r0.addView(r1)
            r0 = 2131430025(0x7f0b0a89, float:1.848174E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r5, r0)
            r5.A03 = r0
            r0 = 2131433423(0x7f0b17cf, float:1.8488631E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x0348
            android.view.View$OnClickListener r0 = r5.A00
            r1.setOnClickListener(r0)
            r2 = r1
        L_0x0348:
            r5.A01 = r2
        L_0x034a:
            android.widget.TextView r0 = r5.A03
            X.C18740tg.A04(r0)
            r0.setText(r3)
            android.widget.FrameLayout r1 = r5.A02
            X.C18740tg.A04(r1)
            r0 = 0
            r1.setVisibility(r0)
            X.5NI r0 = r6.A03
            if (r0 == 0) goto L_0x0039
            r0.setPlayControlVisibility(r4)
            return
        L_0x0363:
            java.lang.RuntimeException r0 = X.C36321k7.A09()
            throw r0
        L_0x0368:
            java.lang.Object r2 = r12.A00
            X.3ty r2 = (X.C79593ty) r2
            java.lang.String r1 = r12.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.2WU r0 = new X.2WU
            r0.<init>(r1)
            r2.accept(r0)
            return
        L_0x037b:
            java.lang.Object r1 = r12.A00
            X.36w r1 = (X.C602036w) r1
            java.lang.String r8 = r12.A01
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess uploading logs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3E6 r0 = r1.A01
            X.3PY r7 = r0.A00
            monitor-enter(r7)
            X.1bS r6 = r7.A01     // Catch:{ all -> 0x03b4 }
            r6.A07()     // Catch:{ all -> 0x03b4 }
            X.0yC r1 = r7.A00     // Catch:{ all -> 0x03b4 }
            r0 = 5553(0x15b1, float:7.781E-42)
            int r1 = r1.A07(r0)     // Catch:{ all -> 0x03b4 }
            r0 = 0
            java.io.File r5 = X.AnonymousClass3PY.A00(r7, r0, r1)     // Catch:{ all -> 0x03b4 }
            if (r5 == 0) goto L_0x03af
            long r3 = r5.length()     // Catch:{ all -> 0x03b4 }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x03af
            r0 = 1
            X.C31211bS.A01(r6, r5, r8, r0)     // Catch:{ all -> 0x03b4 }
            goto L_0x03b2
        L_0x03af:
            r6.A06(r8)     // Catch:{ all -> 0x03b4 }
        L_0x03b2:
            monitor-exit(r7)
            return
        L_0x03b4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x03b7:
            java.lang.Object r0 = r12.A00
            X.733 r0 = (X.AnonymousClass733) r0
            java.lang.String r1 = r12.A01
            java.lang.Object r0 = r0.A02
            X.6Zc r0 = (X.C133586Zc) r0
            r0.A0a = r1
            X.C133586Zc.A0B(r0)
            return
        L_0x03c7:
            java.lang.Object r0 = r12.A00
            com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker r0 = (com.whatsapp.ml.ptt.worker.PttMLModelDownloadWorker) r0
            java.lang.String r2 = r12.A01
            r1 = 0
            X.17Y r0 = r0.A01
            goto L_0x0550
        L_0x03d2:
            java.lang.Object r3 = r12.A00
            X.2Yd r3 = (X.C46512Yd) r3
            java.lang.String r2 = r12.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.3LE r0 = r3.A3m()
            boolean r0 = r0.A07()
            r1 = 1
            if (r0 == 0) goto L_0x03f6
            int r0 = r2.length()
            if (r0 != 0) goto L_0x03f6
        L_0x03ed:
            r3.A3v(r1)
            r1 = 0
            r0 = 0
            r3.A3t(r1, r0)
            return
        L_0x03f6:
            r1 = 0
            goto L_0x03ed
        L_0x03f8:
            java.lang.Object r1 = r12.A00
            X.14u r1 = (X.C225314u) r1
            java.lang.String r0 = r12.A01
            r1.A3F(r0)
            return
        L_0x0402:
            java.lang.Object r1 = r12.A00
            androidx.appcompat.app.AlertDialog$Builder r1 = (androidx.appcompat.app.AlertDialog$Builder) r1
            java.lang.String r0 = r12.A01
            android.content.Context r1 = r1.getContext()
            android.content.Intent r0 = X.C36331k8.A04(r0)
            r1.startActivity(r0)
            return
        L_0x0414:
            java.lang.Object r1 = r12.A00
            X.8it r1 = (X.C179008it) r1
            java.lang.String r3 = r12.A01
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0448
            X.AE0 r0 = r1.A0M
            java.lang.String r0 = r0.A0A()
            java.lang.String r0 = r1.A3t(r0)
            r1.A02 = r0
            r1.A4K()
            X.8az r0 = r1.A00
            java.lang.String r4 = r0.A0B
            java.lang.String r5 = r1.A02
            X.8bF r2 = r0.A08
            X.8b6 r2 = (X.C175818b6) r2
            r7 = 1
            X.6c7 r0 = r0.A09
            if (r0 != 0) goto L_0x0445
            r6 = 0
        L_0x043f:
            java.lang.String r6 = (java.lang.String) r6
            r1.A4H(r2, r3, r4, r5, r6, r7)
            return
        L_0x0445:
            java.lang.Object r6 = r0.A00
            goto L_0x043f
        L_0x0448:
            r1.A4F()
            return
        L_0x044c:
            java.lang.Object r3 = r12.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r0 = r12.A01
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x04ad }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x04ad }
            r2 = 0
        L_0x045c:
            int r0 = r5.length()     // Catch:{ JSONException -> 0x04ad }
            if (r2 >= r0) goto L_0x04b2
            X.8b6 r1 = new X.8b6     // Catch:{ JSONException -> 0x04ad }
            r1.<init>()     // Catch:{ JSONException -> 0x04ad }
            java.lang.Object r6 = r5.get(r2)     // Catch:{ JSONException -> 0x04ad }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x04ad }
            java.lang.String r0 = "popular-bank"
            int r0 = r6.optInt(r0)     // Catch:{ JSONException -> 0x04ad }
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r1.A0J = r0     // Catch:{ JSONException -> 0x04ad }
            java.lang.String r7 = "bankName"
            java.lang.String r0 = "name"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x04ad }
            X.6c7 r0 = X.C202349ld.A00(r0, r7)     // Catch:{ JSONException -> 0x04ad }
            r1.A01 = r0     // Catch:{ JSONException -> 0x04ad }
            java.lang.String r0 = "provider-type"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x04ad }
            r1.A09 = r0     // Catch:{ JSONException -> 0x04ad }
            java.lang.String r0 = "code"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x04ad }
            r1.A0B = r0     // Catch:{ JSONException -> 0x04ad }
            java.lang.String r0 = "bank-phone-number"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x04ad }
            r1.A04 = r0     // Catch:{ JSONException -> 0x04ad }
            java.lang.String r0 = "image"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x04ad }
            r1.A03 = r0     // Catch:{ JSONException -> 0x04ad }
            r4.add(r1)     // Catch:{ JSONException -> 0x04ad }
            int r2 = r2 + 1
            goto L_0x045c
        L_0x04ad:
            java.lang.String r0 = "Cached bank list loading failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x04b2:
            java.util.ArrayList r2 = X.C36441kJ.A15(r4)
            X.76A r0 = X.AnonymousClass76A.A00
            java.util.Collections.sort(r2, r0)
            r1 = 42
            X.AVb r0 = new X.AVb
            r0.<init>(r3, r2, r1)
            r3.runOnUiThread(r0)
            return
        L_0x04c6:
            java.lang.Object r1 = r12.A00
            X.5HK r1 = (X.AnonymousClass5HK) r1
            java.lang.String r4 = r12.A01
            X.19A r0 = r1.A02
            boolean r0 = r0.A0I()
            if (r0 != 0) goto L_0x04df
            X.6wf r1 = r1.A00
            X.8fO r0 = new X.8fO
            r0.<init>()
            r1.onError(r0)
            return
        L_0x04df:
            X.9cM r3 = r1.A03
            X.2bS r2 = r1.A01()
            X.6wf r1 = r1.A00
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            X.C197779cM.A00(r1, r3, r2, r4)
            return
        L_0x04ef:
            java.lang.Object r0 = r12.A00
            com.whatsapp.profile.ProfileInfoActivity r0 = (com.whatsapp.profile.ProfileInfoActivity) r0
            java.lang.String r1 = r12.A01
            X.3ED r0 = r0.A0O
            r0.A00(r1)
            return
        L_0x04fb:
            java.lang.Object r0 = r12.A00
            X.1mP r0 = (X.C37461mP) r0
            java.lang.String r1 = r12.A01
            X.4UB r0 = r0.A07
            r0.Bdv(r1)
            return
        L_0x0507:
            java.lang.Object r1 = r12.A00
            com.whatsapp.registration.VerifyCaptcha r1 = (com.whatsapp.registration.VerifyCaptcha) r1
            java.lang.String r0 = r12.A01
            com.whatsapp.registration.VerifyCaptcha.A0I(r1, r0)
            return
        L_0x0511:
            java.lang.Object r3 = r12.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r12.A01
            r0 = 3
            byte[] r2 = android.util.Base64.decode(r1, r0)
            r1 = 2
            r0 = 0
            X.C133306Xt.A03(r3, r0, r2, r1)
            return
        L_0x0522:
            java.lang.Object r0 = r12.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            java.lang.String r1 = r12.A01
            android.widget.TextView r0 = r0.A0Q
            r0.setText(r1)
            return
        L_0x052e:
            java.lang.Object r0 = r12.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r0
            java.lang.String r2 = "newsletter-dsa-report-unlawful-content"
            X.1fs r1 = r0.A06
            if (r1 == 0) goto L_0x0540
            X.01I r0 = r0.A0i()
            r1.A01(r0, r2)
            return
        L_0x0540:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0547:
            java.lang.Object r0 = r12.A00
            X.3f3 r0 = (X.C70373f3) r0
            java.lang.String r2 = r12.A01
            r1 = 1
            X.17Y r0 = r0.A00
        L_0x0550:
            r0.A0E(r2, r1)
            return
        L_0x0554:
            java.lang.Object r0 = r12.A00
            com.whatsapp.spamreport.ReportSpamDialogViewModel r0 = (com.whatsapp.spamreport.ReportSpamDialogViewModel) r0
            java.lang.String r1 = "about-blocking-reporting"
            X.00s r0 = r0.A01
            r0.A0C(r1)
            return
        L_0x0560:
            java.lang.Object r4 = r12.A00
            com.whatsapp.support.faq.FaqItemActivity r4 = (com.whatsapp.support.faq.FaqItemActivity) r4
            java.lang.String r5 = r12.A01
            boolean r0 = X.C1906499t.A00(r5)
            if (r0 == 0) goto L_0x058c
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "payments_support_topics"
            java.util.ArrayList r3 = r1.getParcelableArrayListExtra(r0)
            if (r3 == 0) goto L_0x058c
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "describe_problem_fields"
            android.os.Bundle r2 = r1.getBundleExtra(r0)
            r1 = 1
            r0 = 3
            android.content.Intent r0 = X.AnonymousClass190.A0T(r4, r2, r3, r1, r0)
            r4.startActivity(r0)
            return
        L_0x058c:
            X.3Gu r3 = r4.A03
            if (r5 != 0) goto L_0x0592
            java.lang.String r5 = "FaqItemActivity"
        L_0x0592:
            r2 = 1
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "describe_problem_fields"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            r3.A01(r0, r4, r5, r2)
            return
        L_0x05a1:
            java.lang.String r3 = r12.A01
            java.lang.Object r2 = r12.A00
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            android.content.res.Resources r1 = r2.getResources()
            X.AnonymousClass00C.A08(r1)
            X.1H2 r0 = r2.A0C
            X.AnonymousClass00C.A07(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SX.A00(r1, r0, r3)
            com.whatsapp.textstatus.AddTextStatusActivity.A01(r0, r2)
            r2.A0E = r3
            return
        L_0x05bd:
            java.lang.String r3 = r12.A01
            java.lang.Object r2 = r12.A00
            com.whatsapp.textstatus.AddTextStatusActivity r2 = (com.whatsapp.textstatus.AddTextStatusActivity) r2
            android.content.res.Resources r1 = r2.getResources()
            X.AnonymousClass00C.A08(r1)
            X.1H2 r0 = r2.A0C
            X.AnonymousClass00C.A08(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SX.A00(r1, r0, r3)
            com.whatsapp.textstatus.AddTextStatusActivity.A01(r0, r2)
            return
        L_0x05d7:
            java.lang.Object r0 = r12.A00
            X.2Ml r0 = (X.C44202Ml) r0
            java.lang.String r4 = r12.A01
            X.1YZ r1 = r0.A02
            r6 = 0
            r2 = -1
            r5 = 1
            r1.A02(r2, r4, r5, r6)
            X.0xY r2 = r0.A01
            X.5Tu r0 = X.C108515Tu.A03
            X.6Pz r1 = new X.6Pz
            r1.<init>(r0)
            X.6NS r0 = X.AnonymousClass6NS.A0O
            r1.A00 = r0
            r1.A02 = r5
            X.6Pq r0 = r1.A01()
            X.C20430xY.A00(r2, r0, r5)
            return
        L_0x05fd:
            java.lang.Object r0 = r12.A00
            X.6mW r0 = (X.C141006mW) r0
            java.lang.String r2 = r12.A01
            X.5NR r4 = r0.A00
            android.app.Activity r1 = r4.A01
            r0 = 2131889339(0x7f120cbb, float:1.9413339E38)
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.Integer r1 = X.C36361kB.A0j()
            r0 = 1
            X.AnonymousClass5NR.A02(r4, r1, r3, r2, r0)
            return
        L_0x061f:
            java.lang.Object r0 = r12.A00
            X.3DT r0 = (X.AnonymousClass3DT) r0
            java.lang.String r1 = r12.A01
            X.32S r0 = r0.A00
            X.C18740tg.A00()
            X.1DD r0 = r0.A00
            X.1M0 r6 = r0.A04()
            X.71s r5 = r6.B1k()     // Catch:{ all -> 0x0657 }
            X.14e r4 = r6.A02     // Catch:{ all -> 0x064d }
            java.lang.String r3 = "draft_voice_note_metadata"
            java.lang.String r2 = "chat_jid=?"
            java.lang.String[] r1 = X.C90474aD.A1b(r1)     // Catch:{ all -> 0x064d }
            java.lang.String r0 = "DraftVoiceNoteMetadataDataStore/delete"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x064d }
            r5.A00()     // Catch:{ all -> 0x064d }
            r5.close()     // Catch:{ all -> 0x0657 }
            r6.close()
            return
        L_0x064d:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0652 }
            goto L_0x0656
        L_0x0652:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0657 }
        L_0x0656:
            throw r1     // Catch:{ all -> 0x0657 }
        L_0x0657:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0676 }
            throw r1
        L_0x065c:
            java.lang.Object r0 = r12.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            java.lang.String r1 = r12.A01
            X.01z r0 = r0.A0k()
            X.AnonymousClass01z.A0H(r0, r1)
            return
        L_0x066a:
            return
        L_0x066b:
            java.lang.String r0 = "fpm/WifiDirectScannerConnectionHandler/interrupted while connecting to service"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0671:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0676 }
            throw r1
        L_0x0676:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503274v.run():void");
    }

    public C1503274v(ReportSpamDialogFragment reportSpamDialogFragment) {
        this.A02 = 23;
        this.A00 = reportSpamDialogFragment;
        this.A01 = "newsletter-dsa-report-unlawful-content";
    }

    public C1503274v(ReportSpamDialogViewModel reportSpamDialogViewModel) {
        this.A02 = 25;
        this.A00 = reportSpamDialogViewModel;
        this.A01 = "about-blocking-reporting";
    }
}
