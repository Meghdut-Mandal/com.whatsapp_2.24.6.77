package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8V7  reason: invalid class name */
public class AnonymousClass8V7 extends AID {
    public final AnonymousClass9EC A00;
    public final AnonymousClass9N9 A01;
    public final C20810yC A02;
    public final AnonymousClass3L6 A03;
    public final C199349fA A04;
    public final AnonymousClass19A A05;
    public final C192079Fp A06;

    public boolean A03() {
        C203399nx r8;
        boolean z;
        String A09 = this.A05.A09();
        this.A03.A02("report_product_tag");
        AnonymousClass1KK r1 = this.A01;
        AnonymousClass9N9 r3 = this.A01;
        String A092 = r1.A09(r3.A02);
        C199349fA r4 = this.A04;
        C192079Fp r5 = this.A06;
        BA4 ba4 = new BA4(this, A09, A092, 0);
        BA4 ba42 = new BA4(this, A09, A092, 1);
        if (r5 != null) {
            C592133b r12 = (C592133b) ba4.invoke();
            AnonymousClass00C.A0D(r12, 1);
            r5.A00.put(A09, r12);
            r8 = r12.A00;
            AnonymousClass00C.A0B(r8);
        } else {
            r8 = (C203399nx) ba42.invoke();
        }
        try {
            if (r4.A00.A0E(1319)) {
                z = C199349fA.A00(this, A09);
            } else {
                z = r4.A01.A0K(this, r8, A09, 193, 32000);
            }
        } catch (C235919b e) {
            Log.e(e.getMessage());
            z = false;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("app/sendReportBizProduct productId=");
        A0u.append(r3.A03);
        C36321k7.A1X(" success:", A0u, z);
        return z;
    }

    public void BVN(String str) {
        Log.e("sendReportBizProduct/delivery-error");
        C192079Fp r1 = this.A06;
        AnonymousClass00C.A0D(str, 1);
        if (r1 != null) {
            r1.A00.remove(str);
        }
        AnonymousClass3L6 r4 = this.A03;
        r4.A01("report_product_tag");
        AnonymousClass9EC r0 = this.A00;
        AnonymousClass9N9 r2 = this.A01;
        C202279lS r02 = r0.A00;
        AnonymousClass00C.A0D(r02, 0);
        r02.A07(r2, false);
        r4.A05("report_product_tag", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWw(X.C203399nx r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sendReportBizProduct/response-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3L6 r5 = r7.A03
            java.lang.String r4 = "report_product_tag"
            r5.A01(r4)
            X.9Fp r3 = r7.A06     // Catch:{ all -> 0x00b2 }
            r6 = 1
            X.AnonymousClass00C.A0D(r9, r6)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r2 = 0
            goto L_0x001f
        L_0x0017:
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00     // Catch:{ all -> 0x00b2 }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ all -> 0x00b2 }
            X.33b r2 = (X.C592133b) r2     // Catch:{ all -> 0x00b2 }
        L_0x001f:
            X.8vH r2 = (X.C186018vH) r2     // Catch:{ all -> 0x00b2 }
            X.0yC r1 = r7.A02     // Catch:{ all -> 0x00b2 }
            r0 = 3497(0xda9, float:4.9E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x008e
            if (r2 == 0) goto L_0x008e
            X.9nx r1 = X.C90514aH.A0e(r8, r2)     // Catch:{ all -> 0x00b2 }
            r0 = 45
            X.B9v r0 = X.C23213B9v.A00(r1, r0)     // Catch:{ all -> 0x00b2 }
            r1 = 0
            X.C203539oF.A0B(r8, r0)     // Catch:{ all -> 0x00b2 }
            r0 = 8
            X.Azj[] r2 = new X.C22993Azj[r0]     // Catch:{ all -> 0x00b2 }
            X.AQj r0 = X.C21565AQj.A00     // Catch:{ all -> 0x00b2 }
            r2[r1] = r0     // Catch:{ all -> 0x00b2 }
            X.AQk r0 = X.C21566AQk.A00     // Catch:{ all -> 0x00b2 }
            r2[r6] = r0     // Catch:{ all -> 0x00b2 }
            X.AQl r1 = X.C21567AQl.A00     // Catch:{ all -> 0x00b2 }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x00b2 }
            X.AQm r1 = X.C21568AQm.A00     // Catch:{ all -> 0x00b2 }
            r0 = 3
            r2[r0] = r1     // Catch:{ all -> 0x00b2 }
            X.AQn r1 = X.C21569AQn.A00     // Catch:{ all -> 0x00b2 }
            r0 = 4
            r2[r0] = r1     // Catch:{ all -> 0x00b2 }
            X.AQo r1 = X.C21570AQo.A00     // Catch:{ all -> 0x00b2 }
            r0 = 5
            r2[r0] = r1     // Catch:{ all -> 0x00b2 }
            X.AQp r1 = X.C21571AQp.A00     // Catch:{ all -> 0x00b2 }
            r0 = 6
            r2[r0] = r1     // Catch:{ all -> 0x00b2 }
            X.AQq r1 = X.C21572AQq.A00     // Catch:{ all -> 0x00b2 }
            r0 = 7
            java.util.ArrayList r2 = X.C165567td.A0d(r1, r2, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r1 = X.C165607th.A1a()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "IQErrorBadRequest|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorNotAcceptable|IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorDirectConnectionInvalidEncryptedInfo|IQErrorUnavailableForLegalReasons"
            java.lang.Object r0 = X.C203379ns.A06(r8, r0, r2, r1)     // Catch:{ all -> 0x00b2 }
            X.B09 r0 = (X.B09) r0     // Catch:{ all -> 0x00b2 }
            X.9N9 r2 = r7.A01     // Catch:{ all -> 0x00b2 }
            com.whatsapp.jid.UserJid r1 = r2.A02     // Catch:{ all -> 0x00b2 }
            java.lang.Long r0 = r0.B9o()     // Catch:{ all -> 0x00b2 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00b2 }
            boolean r0 = r7.A02(r1, r0)     // Catch:{ all -> 0x00b2 }
            r1 = 0
            if (r0 != 0) goto L_0x00a7
            X.9EC r0 = r7.A00     // Catch:{ all -> 0x00b2 }
            X.9lS r0 = r0.A00     // Catch:{ all -> 0x00b2 }
            X.AnonymousClass00C.A0D(r0, r1)     // Catch:{ all -> 0x00b2 }
            goto L_0x00a4
        L_0x008e:
            X.9N9 r2 = r7.A01     // Catch:{ all -> 0x00b2 }
            com.whatsapp.jid.UserJid r1 = r2.A02     // Catch:{ all -> 0x00b2 }
            int r0 = X.AnonymousClass3ME.A00(r8)     // Catch:{ all -> 0x00b2 }
            boolean r0 = r7.A02(r1, r0)     // Catch:{ all -> 0x00b2 }
            r1 = 0
            if (r0 != 0) goto L_0x00a7
            X.9EC r0 = r7.A00     // Catch:{ all -> 0x00b2 }
            X.9lS r0 = r0.A00     // Catch:{ all -> 0x00b2 }
            X.AnonymousClass00C.A0D(r0, r1)     // Catch:{ all -> 0x00b2 }
        L_0x00a4:
            r0.A07(r2, r1)     // Catch:{ all -> 0x00b2 }
        L_0x00a7:
            r5.A05(r4, r1)     // Catch:{ all -> 0x00b2 }
            if (r3 == 0) goto L_0x00b1
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00
            r0.remove(r9)
        L_0x00b1:
            return
        L_0x00b2:
            r2 = move-exception
            X.9Fp r1 = r7.A06
            r0 = 1
            X.AnonymousClass00C.A0D(r9, r0)
            if (r1 == 0) goto L_0x00c0
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            r0.remove(r9)
        L_0x00c0:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8V7.BWw(X.9nx, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r9, java.lang.String r10) {
        /*
            r8 = this;
            X.3L6 r5 = r8.A03
            java.lang.String r4 = "report_product_tag"
            r5.A01(r4)
            X.9Fp r3 = r8.A06     // Catch:{ all -> 0x0097 }
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x001a
        L_0x0012:
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r0.get(r10)     // Catch:{ all -> 0x0097 }
            X.33b r1 = (X.C592133b) r1     // Catch:{ all -> 0x0097 }
        L_0x001a:
            X.8vH r1 = (X.C186018vH) r1     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0054
            java.util.ArrayList r0 = X.C186058vL.A00     // Catch:{ all -> 0x0097 }
            X.9nx r7 = X.C90514aH.A0e(r9, r1)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r6 = X.C186058vL.A00     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "response"
            java.lang.String r1 = "success"
            java.lang.String r0 = "#elementValue"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = X.C203379ns.A0A(r9, r6, r0)     // Catch:{ all -> 0x0097 }
            r0 = 46
            X.B9v r0 = X.C23213B9v.A00(r7, r0)     // Catch:{ all -> 0x0097 }
            X.C203539oF.A0C(r9, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "true"
            boolean r2 = r1.equals(r0)     // Catch:{ all -> 0x0097 }
            X.9EC r0 = r8.A00     // Catch:{ all -> 0x0097 }
            X.9N9 r6 = r8.A01     // Catch:{ all -> 0x0097 }
            X.9lS r1 = r0.A00     // Catch:{ all -> 0x0097 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0097 }
        L_0x004d:
            r1.A07(r6, r2)     // Catch:{ all -> 0x0097 }
            r5.A05(r4, r2)     // Catch:{ all -> 0x0097 }
            goto L_0x008f
        L_0x0054:
            java.lang.String r0 = "response"
            X.9nx r1 = r9.A0c(r0)     // Catch:{ all -> 0x0097 }
            r2 = 0
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "success"
            X.9nx r0 = r1.A0c(r0)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r1 = r0.A0e()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x008a
            X.9EC r0 = r8.A00     // Catch:{ all -> 0x0097 }
            X.9N9 r6 = r8.A01     // Catch:{ all -> 0x0097 }
            r2 = 1
        L_0x0076:
            X.9lS r1 = r0.A00     // Catch:{ all -> 0x0097 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0097 }
            goto L_0x004d
        L_0x007d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "sendReportBizProduct/corrupted-response:"
            java.lang.String r0 = X.C90494aF.A0c(r9, r0, r1)     // Catch:{ all -> 0x0097 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            X.9EC r0 = r8.A00     // Catch:{ all -> 0x0097 }
            X.9N9 r6 = r8.A01     // Catch:{ all -> 0x0097 }
            goto L_0x0076
        L_0x008f:
            if (r3 == 0) goto L_0x0096
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00
            r0.remove(r10)
        L_0x0096:
            return
        L_0x0097:
            r2 = move-exception
            X.9Fp r1 = r8.A06
            r0 = 1
            X.AnonymousClass00C.A0D(r10, r0)
            if (r1 == 0) goto L_0x00a5
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            r0.remove(r10)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8V7.BiM(X.9nx, java.lang.String):void");
    }

    public AnonymousClass8V7(AnonymousClass1KK r2, AnonymousClass9EC r3, AnonymousClass9N9 r4, C20810yC r5, C199349fA r6, AnonymousClass19A r7, AnonymousClass3L6 r8) {
        super(r2);
        C192079Fp r0;
        this.A03 = r8;
        this.A05 = r7;
        this.A01 = r4;
        this.A04 = r6;
        this.A00 = r3;
        this.A02 = r5;
        if (r5.A0E(3497)) {
            r0 = new C192079Fp();
        } else {
            r0 = null;
        }
        this.A06 = r0;
    }

    public void BVl(UserJid userJid) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1Z(A0u, C165607th.A0r(userJid, "sendReportBizProduct/direct-connection-error/jid=", A0u));
        AnonymousClass9EC r0 = this.A00;
        AnonymousClass9N9 r2 = this.A01;
        C202279lS r02 = r0.A00;
        AnonymousClass00C.A0D(r02, 0);
        r02.A07(r2, false);
    }

    public void BVm(UserJid userJid) {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36321k7.A1Z(A0u, C165607th.A0r(userJid, "sendReportBizProduct/direct-connection-success/jid=", A0u));
        A03();
    }
}
