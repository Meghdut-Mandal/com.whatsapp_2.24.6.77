package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.753  reason: invalid class name */
public class AnonymousClass753 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public AnonymousClass753(Bitmap bitmap, ImageView imageView, C88514Sz r4, C50352kc r5, Object obj) {
        this.A05 = 10;
        C36331k8.A1H(obj, r4);
        this.A04 = r5;
        this.A00 = bitmap;
        this.A01 = imageView;
        this.A03 = obj;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05a0, code lost:
        if (r7.isEmpty() != false) goto L_0x05a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            int r0 = r14.A05
            switch(r0) {
                case 0: goto L_0x076a;
                case 1: goto L_0x0734;
                case 2: goto L_0x06e9;
                case 3: goto L_0x06ce;
                case 4: goto L_0x067b;
                case 5: goto L_0x0595;
                case 6: goto L_0x050e;
                case 7: goto L_0x04ba;
                case 8: goto L_0x034c;
                case 9: goto L_0x0330;
                case 10: goto L_0x0305;
                case 11: goto L_0x02ce;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x028d;
                case 15: goto L_0x01e2;
                case 16: goto L_0x0173;
                case 17: goto L_0x014e;
                case 18: goto L_0x00ee;
                case 19: goto L_0x00d6;
                case 20: goto L_0x00b1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r14.A00
            X.7tT r3 = (X.C165467tT) r3
            java.lang.Object r7 = r14.A01
            com.whatsapp.jid.DeviceJid r7 = (com.whatsapp.jid.DeviceJid) r7
            java.lang.Object r1 = r14.A02
            X.9nx r1 = (X.C203399nx) r1
            java.lang.Object r0 = r14.A03
            X.9nx r0 = (X.C203399nx) r0
            java.lang.Object r2 = r14.A04
            X.9nx r2 = (X.C203399nx) r2
            java.lang.Object r3 = r3.A00
            X.0xN r3 = (X.C20320xN) r3
            byte[] r9 = r1.A01
            byte[] r1 = r0.A01
            r0 = 0
            byte r10 = r1[r0]
            if (r2 == 0) goto L_0x0035
            byte[] r8 = r2.A01
        L_0x0028:
            X.005 r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.18I r0 = (X.AnonymousClass18I) r0
            X.79X r5 = r0.A08(r7)
            goto L_0x0037
        L_0x0035:
            r8 = 0
            goto L_0x0028
        L_0x0037:
            int r1 = r7.getDevice()     // Catch:{ all -> 0x00a5 }
            r0 = 0
            if (r1 != 0) goto L_0x003f
            r0 = 1
        L_0x003f:
            r4 = 1
            if (r0 != 0) goto L_0x0061
            X.005 r1 = r3.A02     // Catch:{ all -> 0x00a5 }
            java.lang.Object r6 = r1.get()     // Catch:{ all -> 0x00a5 }
            X.1OD r6 = (X.AnonymousClass1OD) r6     // Catch:{ all -> 0x00a5 }
            r11 = 5
            boolean r0 = r6.A0E(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalid device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00a5 }
            X.1OD r0 = (X.AnonymousClass1OD) r0     // Catch:{ all -> 0x00a5 }
            r0.A0B(r7, r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x0764
        L_0x0061:
            r0 = 2
            byte[][] r2 = new byte[r0][]     // Catch:{ all -> 0x00a5 }
            byte[] r1 = new byte[r4]     // Catch:{ all -> 0x00a5 }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x00a5 }
            r2[r0] = r1     // Catch:{ all -> 0x00a5 }
            r2[r4] = r9     // Catch:{ all -> 0x00a5 }
            byte[] r0 = X.C203239na.A05(r2)     // Catch:{ all -> 0x00a5 }
            X.3IG r4 = X.C133256Xm.A01(r0)     // Catch:{ 110 -> 0x009d }
            X.005 r0 = r3.A04     // Catch:{ 110 -> 0x009d }
            java.lang.Object r2 = r0.get()     // Catch:{ 110 -> 0x009d }
            X.189 r2 = (X.AnonymousClass189) r2     // Catch:{ 110 -> 0x009d }
            X.6EZ r1 = X.C133256Xm.A02(r7)     // Catch:{ 110 -> 0x009d }
            X.3FZ r0 = new X.3FZ     // Catch:{ 110 -> 0x009d }
            r0.<init>(r4)     // Catch:{ 110 -> 0x009d }
            r2.A0Q(r0, r1)     // Catch:{ 110 -> 0x009d }
            X.005 r0 = r3.A03     // Catch:{ 110 -> 0x009d }
            java.lang.Object r2 = r0.get()     // Catch:{ 110 -> 0x009d }
            X.17Y r2 = (X.AnonymousClass17Y) r2     // Catch:{ 110 -> 0x009d }
            r1 = 44
            X.1j7 r0 = new X.1j7     // Catch:{ 110 -> 0x009d }
            r0.<init>(r3, r7, r1)     // Catch:{ 110 -> 0x009d }
            r2.A0H(r0)     // Catch:{ 110 -> 0x009d }
            goto L_0x0764
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-get-identity-success/invalidkey/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x0764
        L_0x00a5:
            r1 = move-exception
            if (r5 == 0) goto L_0x00b0
            r5.close()     // Catch:{ all -> 0x00ac }
            throw r1
        L_0x00ac:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00b0:
            throw r1
        L_0x00b1:
            java.lang.Object r6 = r14.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r6 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r6
            java.lang.Object r5 = r14.A01
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r14.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r14.A03
            X.5VM r3 = (X.AnonymousClass5VM) r3
            java.lang.Object r2 = r14.A04
            X.3GB r2 = (X.AnonymousClass3GB) r2
            r1 = 0
            X.5Fd r0 = r6.A3i()
            r0.A00(r3, r5, r4, r1)
            if (r2 == 0) goto L_0x00d2
            r2.A00()
        L_0x00d2:
            r6.finish()
            return
        L_0x00d6:
            java.lang.Object r4 = r14.A00
            X.6Ju r4 = (X.C130116Ju) r4
            java.lang.Object r3 = r14.A01
            X.1US r3 = (X.AnonymousClass1US) r3
            java.lang.Object r2 = r14.A02
            X.6bk r2 = (X.C134876bk) r2
            java.lang.Object r1 = r14.A03
            X.638 r1 = (X.AnonymousClass638) r1
            java.lang.Object r0 = r14.A04
            X.6Ee r0 = (X.C128936Ee) r0
            X.C130116Ju.A00(r0, r2, r1, r4, r3)
            return
        L_0x00ee:
            java.lang.Object r3 = r14.A00
            com.whatsapp.storage.StorageUsageActivity r3 = (com.whatsapp.storage.StorageUsageActivity) r3
            java.lang.Object r6 = r14.A01
            X.37V r6 = (X.AnonymousClass37V) r6
            java.lang.Object r5 = r14.A02
            X.37U r5 = (X.AnonymousClass37U) r5
            java.lang.Object r4 = r14.A03
            X.37U r4 = (X.AnonymousClass37U) r4
            java.lang.Object r2 = r14.A04
            X.3AN r2 = (X.AnonymousClass3AN) r2
            X.1wZ r1 = r3.A0H
            if (r6 == 0) goto L_0x0114
            X.37V r0 = r1.A03
            if (r0 != 0) goto L_0x0114
            r1.A03 = r6
            r0 = 1
            int r0 = X.C41071wZ.A02(r1, r0)
            r1.A07(r0)
        L_0x0114:
            if (r5 == 0) goto L_0x011f
            X.37U r0 = r1.A02
            if (r0 != 0) goto L_0x011f
            r1.A02 = r5
            X.C41071wZ.A03(r1)
        L_0x011f:
            if (r4 == 0) goto L_0x012a
            X.37U r0 = r1.A01
            if (r0 != 0) goto L_0x012a
            r1.A01 = r4
            X.C41071wZ.A03(r1)
        L_0x012a:
            java.lang.Long r0 = r2.A04
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            com.whatsapp.storage.StorageUsageActivity.A0G(r3, r0)
        L_0x0137:
            if (r5 == 0) goto L_0x0142
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            com.whatsapp.storage.StorageUsageActivity.A0G(r3, r0)
        L_0x0142:
            if (r4 == 0) goto L_0x0769
            java.lang.String r0 = "storage-usage-activity/fetch cache/fetched forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            com.whatsapp.storage.StorageUsageActivity.A0G(r3, r0)
            return
        L_0x014e:
            java.lang.Object r5 = r14.A00
            X.8j0 r5 = (X.C179068j0) r5
            java.lang.Object r4 = r14.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            java.lang.Object r3 = r14.A02
            X.9ua r3 = (X.C207119ua) r3
            java.lang.Object r2 = r14.A03
            X.9un r2 = (X.C207249un) r2
            java.lang.Object r1 = r14.A04
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r1 = (com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment) r1
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x016b
            r5.A4m(r2, r3, r4)
        L_0x016b:
            com.whatsapp.WaButtonWithLoader r0 = r1.A01
            if (r0 == 0) goto L_0x0769
            r0.A01()
            return
        L_0x0173:
            java.lang.Object r4 = r14.A00
            X.9oR r4 = (X.C203639oR) r4
            java.lang.Object r8 = r14.A01
            java.lang.Object r9 = r14.A02
            X.9nx r9 = (X.C203399nx) r9
            java.lang.Object r7 = r14.A03
            X.33b r7 = (X.C592133b) r7
            java.lang.Object r3 = r14.A04
            X.7jg r3 = (X.C159637jg) r3
            r6 = 0
            r0 = 3
            X.AnonymousClass00C.A0D(r7, r0)
            int r2 = r8.hashCode()
            java.lang.String r1 = "iqResponse"
            X.5Fp r0 = r4.A04
            X.0zf r5 = r0.A01
            r5.A03(r2, r1)
            X.9nx r2 = X.C90514aH.A0e(r9, r7)
            r0 = 1
            X.7sk r1 = new X.7sk
            r1.<init>(r2, r0)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object r2 = X.C203539oF.A06(r9, r1, r0)
            X.8t3 r2 = (X.C184818t3) r2
            X.AnonymousClass00C.A08(r2)
            int r1 = r8.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r5.A04(r1, r0)
            java.lang.Object r0 = r2.A00
            X.8sG r0 = (X.C184328sG) r0
            java.lang.Object r0 = r0.A02
            X.8rq r0 = (X.C184068rq) r0
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r0.A00
            X.8rq r0 = (X.C184068rq) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = X.C90514aH.A14(r0)
        L_0x01cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r1.next()
            X.8t4 r0 = (X.C184828t4) r0
            X.AnonymousClass00C.A0B(r0)
            X.C203639oR.A05(r4, r0)
            goto L_0x01cb
        L_0x01de:
            r3.BXX(r2)
            return
        L_0x01e2:
            java.lang.Object r8 = r14.A00
            X.9oR r8 = (X.C203639oR) r8
            java.lang.Object r7 = r14.A01
            X.6Be r7 = (X.C128166Be) r7
            java.lang.Object r3 = r14.A02
            X.9nx r3 = (X.C203399nx) r3
            java.lang.Object r10 = r14.A03
            X.33b r10 = (X.C592133b) r10
            java.lang.Object r5 = r14.A04
            X.7jg r5 = (X.C159637jg) r5
            r9 = 0
            r0 = 3
            X.AnonymousClass00C.A0D(r10, r0)
            int r1 = r7.hashCode()
            java.lang.String r0 = "iqResponse"
            X.5Fp r6 = r8.A04
            X.0zf r4 = r6.A01
            r4.A03(r1, r0)
            java.util.Map r0 = r7.A02
            if (r0 == 0) goto L_0x0224
            X.C18740tg.A06(r0)
            java.lang.String r2 = "action"
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0224
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0224
            int r0 = r7.hashCode()
            r6.A02(r0, r2, r1)
        L_0x0224:
            X.9nx r0 = X.C90514aH.A0e(r3, r10)
            X.7sk r1 = new X.7sk
            r1.<init>(r0, r9)
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object r3 = X.C203539oF.A06(r3, r1, r0)
            X.8t3 r3 = (X.C184818t3) r3
            X.AnonymousClass00C.A08(r3)
            java.lang.Object r2 = r3.A00
            X.8sG r2 = (X.C184328sG) r2
            java.lang.Object r0 = r2.A02
            X.8rq r0 = (X.C184068rq) r0
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r0.A00
            X.8rq r0 = (X.C184068rq) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = X.C90514aH.A14(r0)
        L_0x024e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r1.next()
            X.8t4 r0 = (X.C184828t4) r0
            X.AnonymousClass00C.A0B(r0)
            X.C203639oR.A05(r8, r0)
            goto L_0x024e
        L_0x0261:
            java.lang.Object r0 = r2.A01
            X.8rq r0 = (X.C184068rq) r0
            if (r0 == 0) goto L_0x0280
            int r2 = r7.hashCode()
            java.lang.Object r0 = r0.A00
            X.8rn r0 = (X.C184038rn) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_screens_to_prefetch"
            r6.A02(r2, r0, r1)
        L_0x0280:
            int r1 = r7.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r4.A04(r1, r0)
            r5.BXX(r3)
            return
        L_0x028d:
            java.lang.Object r6 = r14.A00
            X.3Gi r6 = (X.C62483Gi) r6
            java.lang.Object r5 = r14.A01
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.Object r4 = r14.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r14.A03
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r14.A04
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.58E r1 = new X.58E
            r1.<init>()
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A00 = r0
            r1.A01 = r0
            X.1KU r0 = r6.A02
            java.lang.String r0 = r0.A00(r5)
            r1.A06 = r0
            r1.A02 = r4
            r1.A03 = r3
            r1.A04 = r2
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A04
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r1.A05 = r0
            X.0yW r0 = r6.A01
            r0.Bly(r1)
            return
        L_0x02ce:
            java.lang.Object r5 = r14.A00
            X.2bU r5 = (X.AnonymousClass2bU) r5
            java.lang.Object r3 = r14.A01
            X.0ts r3 = (X.C18820ts) r3
            java.lang.Object r2 = r14.A02
            X.17Y r2 = (X.AnonymousClass17Y) r2
            java.lang.Object r4 = r14.A03
            java.lang.Object r6 = r14.A04
            int r0 = r5.A0B
            if (r0 != 0) goto L_0x02ff
            X.3Qj r0 = r5.A01
            java.io.File r0 = r0.A0I
            int r0 = X.AnonymousClass1GW.A04(r0)
            r5.A0B = r0
            if (r0 != 0) goto L_0x02ff
            long r0 = r5.A00
            java.lang.String r7 = X.AnonymousClass3TF.A02(r3, r0)
        L_0x02f4:
            r8 = 8
            X.74y r3 = new X.74y
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A0H(r3)
            return
        L_0x02ff:
            long r0 = (long) r0
            java.lang.String r7 = X.AnonymousClass3UY.A07(r3, r0)
            goto L_0x02f4
        L_0x0305:
            java.lang.Object r0 = r14.A04
            X.2kc r0 = (X.C50352kc) r0
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0769
            java.lang.Object r3 = r14.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r0 = r3.getTag()
            if (r0 == 0) goto L_0x0769
            java.lang.Object r1 = r3.getTag()
            java.lang.Object r0 = r14.A03
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0769
            java.lang.Object r2 = r14.A02
            X.4Sz r2 = (X.C88514Sz) r2
            java.lang.Object r1 = r14.A00
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0 = 0
            r2.Btf(r1, r3, r0)
            return
        L_0x0330:
            java.lang.Object r0 = r14.A00
            X.36u r0 = (X.C601836u) r0
            java.lang.Object r4 = r14.A01
            com.whatsapp.chatinfo.EphemeralMessagesInfoView r4 = (com.whatsapp.chatinfo.EphemeralMessagesInfoView) r4
            java.lang.Object r3 = r14.A02
            X.141 r3 = (X.AnonymousClass141) r3
            java.lang.Object r2 = r14.A03
            X.147 r2 = (X.AnonymousClass147) r2
            java.lang.Object r1 = r14.A04
            X.2Sc r1 = (X.C45632Sc) r1
            if (r0 == 0) goto L_0x0769
            boolean r0 = r0.A02
            r4.A08(r3, r1, r2, r0)
            return
        L_0x034c:
            java.lang.Object r3 = r14.A00
            X.6X4 r3 = (X.AnonymousClass6X4) r3
            java.lang.Object r4 = r14.A01
            X.5Nh r4 = (X.C107265Nh) r4
            java.lang.Object r9 = r14.A02
            X.11F r9 = (X.AnonymousClass11F) r9
            java.lang.Object r2 = r14.A03
            X.5SD r2 = (X.AnonymousClass5SD) r2
            java.lang.Object r8 = r14.A04
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            X.00T r0 = X.AnonymousClass6X4.A0E
            boolean r7 = X.C90514aH.A1Y(r9)
            X.0yC r1 = r3.A06
            r0 = 7515(0x1d5b, float:1.0531E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0425
            X.6by r5 = r4.A04
            java.lang.String r0 = r5.A02
            java.lang.String r6 = X.C34681hT.A08(r0)
            X.AnonymousClass00C.A08(r6)
            if (r8 == 0) goto L_0x03cb
            boolean r1 = r8.booleanValue()
        L_0x0381:
            com.whatsapp.jid.GroupJid r0 = r4.A0D
            if (r0 != 0) goto L_0x039b
            boolean r0 = r4.A0M()
            if (r0 == 0) goto L_0x039b
            if (r1 != 0) goto L_0x039b
            X.1Pa r0 = r3.A01
            com.whatsapp.jid.UserJid r9 = r0.A02(r6)
            if (r9 != 0) goto L_0x039b
            com.whatsapp.jid.DeviceJid r0 = r4.A02
            if (r0 == 0) goto L_0x03c9
            com.whatsapp.jid.UserJid r9 = r0.userJid
        L_0x039b:
            X.3Qa r8 = new X.3Qa
            r8.<init>(r9, r6, r1)
            int r1 = r2.ordinal()
            r6 = 1
            if (r1 == r7) goto L_0x04ad
            r0 = 2
            if (r1 == r0) goto L_0x03ce
            if (r1 != r6) goto L_0x0769
            X.1A1 r0 = r3.A08
            X.3T1 r6 = r0.A03(r8)
            if (r6 != 0) goto L_0x03c2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No existing message found for message key: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r8, r0, r1)
        L_0x03be:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x03c2:
            boolean r0 = r6 instanceof X.AnonymousClass2c3
            if (r0 == 0) goto L_0x03e8
            java.lang.String r0 = "Unexpected FMessageTemporaryPlaceholder message"
            goto L_0x03be
        L_0x03c9:
            r9 = 0
            goto L_0x039b
        L_0x03cb:
            boolean r1 = r5.A03
            goto L_0x0381
        L_0x03ce:
            X.1HQ r0 = r3.A02
            X.5Iz r2 = new X.5Iz
            r2.<init>((X.AnonymousClass1HQ) r0, (X.C64933Qa) r8, (X.C107265Nh) r4)
            X.5lY r1 = new X.5lY
            r1.<init>(r3)
            X.9cw r0 = r3.A07
            int r0 = X.C198119cw.A00(r1, r0, r2, r7)
            if (r0 != r6) goto L_0x0769
            X.1A1 r0 = r3.A08
            X.3T1 r6 = r0.A03(r8)
        L_0x03e8:
            boolean r0 = r6 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x0769
            X.5Iz r6 = (X.C106265Iz) r6
            X.3Qa r0 = r6.A1J
            X.AnonymousClass00C.A07(r0)
            X.3T1 r2 = r6.B32(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.calling.fmessage.FMessageCallLog"
            X.AnonymousClass00C.A0E(r2, r0)
            X.5Iz r2 = (X.C106265Iz) r2
            X.1HQ r0 = r3.A02
            r2.A00 = r0
            X.3Kh r0 = r2.A01
            r0.A01(r4)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0422
            com.whatsapp.jid.DeviceJid r0 = r4.A02
            if (r0 == 0) goto L_0x0414
            com.whatsapp.jid.UserJid r0 = r0.userJid
        L_0x0411:
            r2.A0q(r0)
        L_0x0414:
            long r0 = r6.A1N
            r2.A1N = r0
            long r0 = r6.A1O
            r2.A1O = r0
            X.0xM r0 = r3.A04
            r0.A0k(r2)
            return
        L_0x0422:
            com.whatsapp.jid.UserJid r0 = r5.A01
            goto L_0x0411
        L_0x0425:
            X.6by r1 = r4.A04
            java.lang.String r0 = r1.A02
            java.lang.String r6 = X.C34681hT.A08(r0)
            X.AnonymousClass00C.A08(r6)
            X.5SD r0 = X.AnonymousClass5SD.UPDATE_ONLY
            if (r2 != r0) goto L_0x0497
            com.whatsapp.jid.GroupJid r0 = r4.A0D
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r5 = 0
            if (r0 == 0) goto L_0x047c
            com.whatsapp.jid.GroupJid r2 = r4.A0D
        L_0x043f:
            X.11F r2 = (X.AnonymousClass11F) r2
            if (r2 == 0) goto L_0x0769
            X.1A1 r1 = r3.A08
            X.3Qa r0 = new X.3Qa
            r0.<init>(r2, r6, r7)
            X.3T1 r2 = r1.A03(r0)
            boolean r0 = r2 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x047a
            X.5Iz r2 = (X.C106265Iz) r2
            if (r2 == 0) goto L_0x045f
            X.3Qa r0 = r2.A1J
            X.AnonymousClass00C.A07(r0)
            X.3T1 r5 = r2.B32(r0)
        L_0x045f:
            boolean r0 = r5 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x0769
            X.5Iz r5 = (X.C106265Iz) r5
            if (r5 == 0) goto L_0x0769
            X.3Kh r0 = r5.A01
            r0.A01(r4)
            long r0 = r2.A1N
            r5.A1N = r0
            long r0 = r2.A1O
            r5.A1O = r0
            X.0xM r0 = r3.A04
            r0.A0k(r5)
            return
        L_0x047a:
            r2 = 0
            goto L_0x045f
        L_0x047c:
            com.whatsapp.jid.GroupJid r0 = r4.A0D
            if (r0 != 0) goto L_0x0769
            boolean r0 = r4.A0M()
            if (r0 == 0) goto L_0x0769
            X.1Pa r0 = r3.A01
            com.whatsapp.jid.UserJid r2 = r0.A02(r6)
            if (r2 != 0) goto L_0x043f
            com.whatsapp.jid.DeviceJid r0 = r4.A02
            if (r0 == 0) goto L_0x0495
            com.whatsapp.jid.UserJid r2 = r0.userJid
            goto L_0x043f
        L_0x0495:
            r2 = r5
            goto L_0x043f
        L_0x0497:
            if (r8 == 0) goto L_0x04aa
            boolean r0 = r8.booleanValue()
        L_0x049d:
            X.3Qa r2 = new X.3Qa
            r2.<init>(r9, r6, r0)
            X.1HQ r0 = r3.A02
            X.5Iz r1 = new X.5Iz
            r1.<init>((X.AnonymousClass1HQ) r0, (X.C64933Qa) r2, (X.C107265Nh) r4)
            goto L_0x04b4
        L_0x04aa:
            boolean r0 = r1.A03
            goto L_0x049d
        L_0x04ad:
            X.1HQ r0 = r3.A02
            X.5Iz r1 = new X.5Iz
            r1.<init>((X.AnonymousClass1HQ) r0, (X.C64933Qa) r8, (X.C107265Nh) r4)
        L_0x04b4:
            X.0xM r0 = r3.A04
            r0.A0h(r1)
            return
        L_0x04ba:
            java.lang.Object r1 = r14.A00
            X.0wG r1 = (X.C19630wG) r1
            java.lang.Object r0 = r14.A01
            X.0ts r0 = (X.C18820ts) r0
            java.lang.Object r4 = r14.A02
            android.location.Location r4 = (android.location.Location) r4
            java.lang.Object r3 = r14.A03
            X.17Y r3 = (X.AnonymousClass17Y) r3
            java.lang.Object r2 = r14.A04
            android.content.Context r6 = r1.A00
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            android.location.Geocoder r7 = new android.location.Geocoder
            r7.<init>(r6, r0)
            r5 = 0
            double r8 = r4.getLatitude()     // Catch:{ Exception -> 0x04e8 }
            double r10 = r4.getLongitude()     // Catch:{ Exception -> 0x04e8 }
            r12 = 1
            java.util.List r1 = r7.getFromLocation(r8, r10, r12)     // Catch:{ Exception -> 0x04e8 }
            if (r1 == 0) goto L_0x0503
            goto L_0x04ef
        L_0x04e8:
            r1 = move-exception
            java.lang.String r0 = "LocationUpdateListener/geocodeAddress Exception while trying to fetch address"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0503
        L_0x04ef:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0503
            java.lang.Object r1 = X.C36391kE.A0t(r1)
            android.location.Address r1 = (android.location.Address) r1
            float r0 = r4.getAccuracy()
            java.lang.String r5 = X.C131846Qw.A00(r6, r1, r0)
        L_0x0503:
            r1 = 27
            X.74l r0 = new X.74l
            r0.<init>(r2, r4, r5, r1)
            r3.A0H(r0)
            return
        L_0x050e:
            java.lang.Object r8 = r14.A00
            com.whatsapp.TextEmojiLabel r8 = (com.whatsapp.TextEmojiLabel) r8
            java.lang.Object r6 = r14.A01
            X.6Er r6 = (X.C129036Er) r6
            java.lang.Object r3 = r14.A02
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            java.lang.Object r5 = r14.A03
            X.1RJ r5 = (X.AnonymousClass1RJ) r5
            java.lang.Object r2 = r14.A04
            r7 = 0
            r10 = 1
            int r0 = r8.getLineCount()
            r4 = 8
            if (r0 <= r10) goto L_0x058e
            X.0wQ r0 = r6.A00
            X.0wh r0 = r0.A0A
            java.lang.String r9 = r0.A02()
            X.AnonymousClass00C.A08(r9)
            android.text.Layout r0 = r8.getLayout()
            int r1 = r0.getLineStart(r7)
            android.text.Layout r0 = r8.getLayout()
            int r0 = r0.getLineEnd(r7)
            java.lang.String r1 = X.C36431kI.A16(r1, r0, r9)
            android.text.Layout r0 = r8.getLayout()
            int r0 = r0.getLineStart(r10)
            java.lang.String r0 = X.C90494aF.A0d(r9, r0)
            r8.A0I(r1)
            r3.A0I(r0)
            r3.setVisibility(r7)
            r1 = 32
            X.74w r0 = new X.74w
            r0.<init>(r3, r6, r2, r1)
            r3.post(r0)
            r3 = 2131431463(0x7f0b1027, float:1.8484656E38)
        L_0x056b:
            android.view.ViewGroup$LayoutParams r2 = r5.A02()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            X.AnonymousClass00C.A0E(r2, r0)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            X.0ts r0 = r6.A06
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 7
            if (r1 == 0) goto L_0x0580
            r0 = 5
        L_0x0580:
            r2.addRule(r0, r3)
            r0 = 6
            r2.addRule(r0, r3)
            r2.addRule(r4, r3)
            r5.A06(r2)
            return
        L_0x058e:
            r3.setVisibility(r4)
            r3 = 2131431461(0x7f0b1025, float:1.8484652E38)
            goto L_0x056b
        L_0x0595:
            java.lang.Object r7 = r14.A03
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x05a2
            boolean r1 = r7.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x05a3
        L_0x05a2:
            r0 = 1
        L_0x05a3:
            r2 = 0
            if (r0 == 0) goto L_0x05bc
            java.lang.Object r3 = r14.A04
            X.63F r3 = (X.AnonymousClass63F) r3
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r3.A00(r0)
            java.lang.Object r1 = r14.A02
            X.64V r1 = (X.AnonymousClass64V) r1
            X.60A r0 = new X.60A
            r0.<init>()
            r1.A00(r0, r2)
            return
        L_0x05bc:
            java.util.Iterator r5 = r7.iterator()
        L_0x05c0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0601
            java.lang.Object r4 = r5.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r4 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r4
            X.00T r0 = X.C114005gU.A01
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            X.0wy r0 = (X.C20070wy) r0
            java.util.Set r1 = r0.keySet()
            X.AnonymousClass00C.A08(r1)
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r4.mCapability
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x05c0
            java.lang.Object[] r3 = X.AnonymousClass001.A0M()
            r1 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = r4.mCapability
            java.lang.String r0 = r0.toServerValue()
            r3[r1] = r0
            r1 = 1
            java.lang.Object r0 = r14.A01
            X.6SG r0 = (X.AnonymousClass6SG) r0
            java.lang.String r0 = r0.A01
            r3[r1] = r0
            java.lang.String r1 = "DefaultARModelManager"
            java.lang.String r0 = "tries to fetch unsupported capability: %s. operation id: %s"
            X.AnonymousClass6YR.A0H(r1, r0, r3)
            goto L_0x05c0
        L_0x0601:
            java.lang.Object r5 = r14.A00
            X.5vn r5 = (X.C123015vn) r5
            java.util.HashSet r6 = X.C36441kJ.A16()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "capabilityMinVersionModelings should not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x0616:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0654
            java.lang.Object r1 = r7.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r1 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r1
            if (r1 == 0) goto L_0x0616
            com.facebook.cameracore.ardelivery.model.VersionedCapability r9 = r1.mCapability
            boolean r0 = r6.contains(r9)
            r12 = 0
            if (r0 == 0) goto L_0x063f
            java.lang.Object[] r3 = X.AnonymousClass001.A0L()
            java.lang.String r0 = r9.toServerValue()
            r3[r12] = r0
            java.lang.String r1 = "DefaultARModelManager"
            java.lang.String r0 = "should not request duplicated capability : %s"
            X.AnonymousClass6YR.A0H(r1, r0, r3)
            goto L_0x0616
        L_0x063f:
            r6.add(r9)
            int r10 = r1.mMinVersion
            X.60d r0 = r5.A01
            int r11 = r0.A00(r9)
            r13 = 0
            com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest r8 = new com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest
            r8.<init>(r9, r10, r11, r12, r13)
            r4.add(r8)
            goto L_0x0616
        L_0x0654:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0668
            java.lang.Object r1 = r14.A02
            X.64V r1 = (X.AnonymousClass64V) r1
            java.lang.String r0 = "no valid request for capabilityMinVersionList"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            r1.A00(r2, r0)
            return
        L_0x0668:
            X.6Sr r3 = r5.A00
            java.lang.Object r2 = r14.A01
            X.6SG r2 = (X.AnonymousClass6SG) r2
            java.lang.Object r1 = r14.A04
            X.63F r1 = (X.AnonymousClass63F) r1
            X.6jq r0 = new X.6jq
            r0.<init>(r14, r4)
            r3.A02(r1, r0, r2, r4)
            return
        L_0x067b:
            java.lang.Object r5 = r14.A00
            X.6k5 r5 = (X.C139556k5) r5
            java.lang.Object r3 = r14.A03
            X.6c3 r3 = (X.C135056c3) r3
            java.lang.Object r1 = r14.A01
            X.6SG r1 = (X.AnonymousClass6SG) r1
            java.lang.Object r2 = r14.A02
            X.5VK r2 = (X.AnonymousClass5VK) r2
            X.6PQ r0 = r5.A05
            r4 = 0
            r0.A03(r3, r2, r1, r4)
            X.4xI r5 = r5.A06
            boolean r3 = X.C36341k9.A1a(r1, r2)
            X.00T r0 = r5.A00
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 != 0) goto L_0x06c6
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x06c6
            long r6 = X.C101284xI.A00(r1, r5)
            X.5Ti r0 = r2.mType
            int r9 = r0.ordinal()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = X.C90524aI.A0x(r0, r1, r4, r3)
            java.lang.String r0 = "Effect fetch failed, reason: %s"
            java.lang.String r10 = X.C90504aG.A0m(r0, r1)
            java.lang.String r8 = "ar_delivery"
            r5.A03(r6, r8, r9, r10)
        L_0x06c6:
            java.lang.Object r0 = r14.A04
            X.7ic r0 = (X.C159007ic) r0
            r0.BXI(r2)
            return
        L_0x06ce:
            java.lang.Object r1 = r14.A01
            X.7lf r1 = (X.C160837lf) r1
            java.lang.Object r0 = r14.A00
            X.9lP r0 = (X.C202249lP) r0
            int r7 = r0.A00
            X.9WT r2 = r0.A01
            java.lang.Object r3 = r14.A02
            X.9Bl r3 = (X.C191069Bl) r3
            java.lang.Object r4 = r14.A04
            X.9NR r4 = (X.AnonymousClass9NR) r4
            java.lang.Object r5 = r14.A03
            r6 = 0
            r1.BZs(r2, r3, r4, r5, r6, r7)
            return
        L_0x06e9:
            java.lang.Object r1 = r14.A02
            X.5o6 r1 = (X.AnonymousClass5o6) r1
            r0 = 0
            r1.A00 = r0
            boolean r0 = r1.A01
            r4 = 1
            if (r0 != 0) goto L_0x0713
            r1.A01 = r4
            java.lang.Object r0 = r14.A03
            X.6lc r0 = (X.C140456lc) r0
            X.7ku r3 = X.C140456lc.A0E(r0)
            if (r3 == 0) goto L_0x0713
            java.lang.Object r2 = r14.A00
            X.6lc r2 = (X.C140456lc) r2
            java.lang.Object r1 = r14.A01
            X.67i r1 = (X.C1271967i) r1
            X.68b r0 = X.C1273868b.A02(r2)
            r0.A09(r1, r4)
            X.C1273868b.A06(r1, r2, r0, r3)
        L_0x0713:
            java.lang.Object r1 = r14.A03
            X.6lc r1 = (X.C140456lc) r1
            r0 = 36
            X.7ku r3 = r1.A0X(r0)
            if (r3 == 0) goto L_0x0731
            java.lang.Object r2 = r14.A00
            X.6lc r2 = (X.C140456lc) r2
            java.lang.Object r1 = r14.A01
            X.67i r1 = (X.C1271967i) r1
            X.68b r0 = X.C1273868b.A02(r2)
            r0.A09(r1, r4)
            X.C1273868b.A06(r1, r2, r0, r3)
        L_0x0731:
            java.lang.Object r0 = r14.A04
            goto L_0x075c
        L_0x0734:
            java.lang.Object r2 = r14.A04
            android.view.View r2 = (android.view.View) r2
            r1 = 2131433278(0x7f0b173e, float:1.8488337E38)
            r0 = 0
            r2.setTag(r1, r0)
            java.lang.Object r4 = r14.A00
            X.6lc r4 = (X.C140456lc) r4
            java.lang.Object r0 = r14.A02
            X.6lc r0 = (X.C140456lc) r0
            X.7ku r3 = X.C140456lc.A0E(r0)
            X.68b r2 = X.C1273868b.A01(r4)
            java.lang.Object r1 = r14.A01
            X.67i r1 = (X.C1271967i) r1
            r0 = 1
            r2.A09(r1, r0)
            X.C1273868b.A06(r1, r4, r2, r3)
            java.lang.Object r0 = r14.A03
        L_0x075c:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0769
            r0.run()
            return
        L_0x0764:
            if (r5 == 0) goto L_0x0769
            r5.close()
        L_0x0769:
            return
        L_0x076a:
            java.lang.Object r3 = r14.A03     // Catch:{ all -> 0x0858 }
            X.4pl r3 = (X.C97484pl) r3     // Catch:{ all -> 0x0858 }
            boolean r0 = r3.isCancelled()     // Catch:{ all -> 0x0858 }
            if (r0 != 0) goto L_0x0853
            java.lang.Object r0 = r14.A04     // Catch:{ all -> 0x0858 }
            java.util.UUID r0 = (java.util.UUID) r0     // Catch:{ all -> 0x0858 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0858 }
            java.lang.Object r1 = r14.A00     // Catch:{ all -> 0x0858 }
            X.6if r1 = (X.C138766if) r1     // Catch:{ all -> 0x0858 }
            X.7lt r0 = r1.A01     // Catch:{ all -> 0x0858 }
            X.6QA r5 = r0.BJH(r8)     // Catch:{ all -> 0x0858 }
            if (r5 == 0) goto L_0x0813
            java.lang.Integer r0 = r5.A0E     // Catch:{ all -> 0x0858 }
            boolean r0 = X.AnonymousClass6GL.A01(r0)     // Catch:{ all -> 0x0858 }
            if (r0 != 0) goto L_0x0813
            X.7bt r7 = r1.A00     // Catch:{ all -> 0x0858 }
            java.lang.Object r6 = r14.A02     // Catch:{ all -> 0x0858 }
            X.6At r6 = (X.C128076At) r6     // Catch:{ all -> 0x0858 }
            X.6im r7 = (X.C138836im) r7     // Catch:{ all -> 0x0858 }
            java.lang.Object r4 = r7.A0A     // Catch:{ all -> 0x0858 }
            monitor-enter(r4)     // Catch:{ all -> 0x0858 }
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0810 }
            java.lang.String r2 = X.C138836im.A0C     // Catch:{ all -> 0x0810 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "Moving WorkSpec ("
            r1.append(r0)     // Catch:{ all -> 0x0810 }
            r1.append(r8)     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = ") to the foreground"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0810 }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x0810 }
            java.util.Map r0 = r7.A04     // Catch:{ all -> 0x0810 }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x0810 }
            X.758 r2 = (X.AnonymousClass758) r2     // Catch:{ all -> 0x0810 }
            if (r2 == 0) goto L_0x080e
            android.os.PowerManager$WakeLock r0 = r7.A01     // Catch:{ all -> 0x0810 }
            if (r0 != 0) goto L_0x07d0
            android.content.Context r1 = r7.A00     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "ProcessorForegroundLck"
            android.os.PowerManager$WakeLock r0 = X.AnonymousClass6I2.A00(r1, r0)     // Catch:{ all -> 0x0810 }
            r7.A01 = r0     // Catch:{ all -> 0x0810 }
            r0.acquire()     // Catch:{ all -> 0x0810 }
        L_0x07d0:
            java.util.Map r0 = r7.A05     // Catch:{ all -> 0x0810 }
            r0.put(r8, r2)     // Catch:{ all -> 0x0810 }
            android.content.Context r7 = r7.A00     // Catch:{ all -> 0x0810 }
            X.6QA r0 = r2.A08     // Catch:{ all -> 0x0810 }
            X.69L r8 = X.C109445Xp.A00(r0)     // Catch:{ all -> 0x0810 }
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r0 = androidx.work.impl.foreground.SystemForegroundService.class
            android.content.Intent r2 = X.C36441kJ.A0H(r7, r0)     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "ACTION_START_FOREGROUND"
            r2.setAction(r0)     // Catch:{ all -> 0x0810 }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0810 }
            int r1 = r8.A00     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "KEY_GENERATION"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0810 }
            int r1 = r6.A01     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "KEY_NOTIFICATION_ID"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0810 }
            int r1 = r6.A00     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "KEY_FOREGROUND_SERVICE_TYPE"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0810 }
            android.app.Notification r1 = r6.A02     // Catch:{ all -> 0x0810 }
            java.lang.String r0 = "KEY_NOTIFICATION"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0810 }
            X.AnonymousClass00F.A08(r7, r2)     // Catch:{ all -> 0x0810 }
        L_0x080e:
            monitor-exit(r4)     // Catch:{ all -> 0x0810 }
            goto L_0x081a
        L_0x0810:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0810 }
            goto L_0x0819
        L_0x0813:
            java.lang.String r0 = "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0858 }
        L_0x0819:
            throw r0     // Catch:{ all -> 0x0858 }
        L_0x081a:
            java.lang.Object r4 = r14.A01     // Catch:{ all -> 0x0858 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x0858 }
            X.69L r5 = X.C109445Xp.A00(r5)     // Catch:{ all -> 0x0858 }
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r0 = androidx.work.impl.foreground.SystemForegroundService.class
            android.content.Intent r2 = X.C36441kJ.A0H(r4, r0)     // Catch:{ all -> 0x0858 }
            java.lang.String r0 = "ACTION_NOTIFY"
            r2.setAction(r0)     // Catch:{ all -> 0x0858 }
            int r1 = r6.A01     // Catch:{ all -> 0x0858 }
            java.lang.String r0 = "KEY_NOTIFICATION_ID"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0858 }
            int r1 = r6.A00     // Catch:{ all -> 0x0858 }
            java.lang.String r0 = "KEY_FOREGROUND_SERVICE_TYPE"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0858 }
            android.app.Notification r1 = r6.A02     // Catch:{ all -> 0x0858 }
            java.lang.String r0 = "KEY_NOTIFICATION"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0858 }
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x0858 }
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0858 }
            int r1 = r5.A00     // Catch:{ all -> 0x0858 }
            java.lang.String r0 = "KEY_GENERATION"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0858 }
            r4.startService(r2)     // Catch:{ all -> 0x0858 }
        L_0x0853:
            r0 = 0
            r3.A06(r0)     // Catch:{ all -> 0x0858 }
            return
        L_0x0858:
            r1 = move-exception
            java.lang.Object r0 = r14.A03
            X.A6T r0 = (X.A6T) r0
            r0.A07(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass753.run():void");
    }

    public AnonymousClass753(AnonymousClass63F r2, AnonymousClass64V r3, C123015vn r4, AnonymousClass6SG r5, List list) {
        this.A05 = 5;
        this.A00 = r4;
        this.A03 = list;
        this.A04 = r2;
        this.A02 = r3;
        this.A01 = r5;
    }

    public AnonymousClass753(C202249lP r2, C191069Bl r3, AnonymousClass9NR r4, C160837lf r5, Object obj) {
        this.A05 = 3;
        this.A00 = r2;
        this.A01 = r5;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = obj;
    }

    public AnonymousClass753(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A04 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
    }
}
