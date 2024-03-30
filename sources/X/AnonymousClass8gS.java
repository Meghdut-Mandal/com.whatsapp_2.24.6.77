package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.8gS  reason: invalid class name */
public class AnonymousClass8gS extends AnonymousClass9I1 {
    public final Context A00;
    public final C19700wN A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass19A A03;
    public final C202269lR A04;
    public final AE0 A05;
    public final C29221Vu A06;
    public final AnonymousClass8gJ A07;
    public final C29131Vl A08;

    public static void A01(C202319lY r2, AnonymousClass8gS r3, List list) {
        C165567td.A1P(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2.A0K, list);
        C165567td.A1P("device-id", r3.A08.A01(), list);
        C175928bI A002 = C202319lY.A00(r2);
        C201599jw r22 = A002.A0G;
        C18740tg.A06(r22);
        C165567td.A1P("sender-vpa", A002.A0Q, list);
        if (!TextUtils.isEmpty(A002.A0R)) {
            C165567td.A1P("sender-vpa-id", A002.A0R, list);
        }
        C165567td.A1P("receiver-vpa", A002.A0O, list);
        if (!TextUtils.isEmpty(A002.A0P)) {
            C165567td.A1P("receiver-vpa-id", A002.A0P, list);
        }
        if (!C202349ld.A02(r22.A08)) {
            C165567td.A1P("mandate-no", (String) C165577te.A0g(r22.A08), list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C201459je r9, X.C175928bI r10, java.lang.String r11, java.util.List r12, boolean r13) {
        /*
            X.9jw r2 = r10.A0G
            if (r2 == 0) goto L_0x00c5
            long r0 = r2.A02
            r7 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0019
            long r0 = r0 / r7
            java.lang.String r4 = "start-ts"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x0019:
            long r0 = r2.A01
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            long r0 = r0 / r7
            java.lang.String r4 = "end-ts"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x002a:
            java.lang.String r1 = r2.A0G
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "amount-rule"
            X.C165567td.A1P(r0, r1, r12)
        L_0x0033:
            java.lang.String r1 = r2.A0E
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "frequency-rule"
            X.C165567td.A1P(r0, r1, r12)
        L_0x003c:
            X.6c7 r1 = r2.A07
            boolean r0 = X.C202349ld.A03(r1)
            if (r0 != 0) goto L_0x004f
            java.lang.Object r1 = X.C165577te.A0g(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-name"
            X.C165567td.A1P(r0, r1, r12)
        L_0x004f:
            boolean r0 = r2.A0N
            java.lang.String r1 = X.C165617ti.A0Y(r0)
            java.lang.String r0 = "is-revocable"
            X.C165567td.A1P(r0, r1, r12)
            java.lang.String r3 = "seq-no"
            if (r11 == 0) goto L_0x00c6
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r3, (java.lang.String) r11)
        L_0x0063:
            r12.add(r1)
        L_0x0066:
            if (r9 == 0) goto L_0x0081
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0081
            X.6c7 r1 = r9.A02
            boolean r0 = X.C202349ld.A02(r1)
            if (r0 != 0) goto L_0x0081
            java.lang.Object r1 = X.C165577te.A0g(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-update-info"
            X.C165567td.A1P(r0, r1, r12)
        L_0x0081:
            if (r13 == 0) goto L_0x00c5
            java.lang.String r0 = r2.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0092
            java.lang.String r1 = r2.A0K
            java.lang.String r0 = "recurrence-rule"
            X.C165567td.A1P(r0, r1, r12)
        L_0x0092:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r1 = r2.A0J
            java.lang.String r0 = "recurrence-day"
            X.C165567td.A1P(r0, r1, r12)
        L_0x00a1:
            X.6c7 r0 = r2.A0A
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r0.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bc
            X.6c7 r0 = r2.A0A
            java.lang.Object r1 = X.C165577te.A0g(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "purpose-code"
            X.C165567td.A1P(r0, r1, r12)
        L_0x00bc:
            java.lang.String r1 = r10.A0M
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = "mcc"
            X.C165567td.A1P(r0, r1, r12)
        L_0x00c5:
            return
        L_0x00c6:
            java.lang.String r0 = r10.A0S
            if (r0 == 0) goto L_0x0066
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gS.A02(X.9je, X.8bI, java.lang.String, java.util.List, boolean):void");
    }

    public AnonymousClass8gS(Context context, C19700wN r2, AnonymousClass17Y r3, AnonymousClass19A r4, C202269lR r5, AE0 ae0, C29221Vu r7, AnonymousClass9YX r8, C29121Vk r9, AnonymousClass8gJ r10, C29131Vl r11) {
        super(r8, r9);
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r11;
        this.A07 = r10;
        this.A06 = r7;
        this.A05 = ae0;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r1 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (X.C202349ld.A03(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        X.C165567td.A1P("upi-bank-info", (java.lang.String) X.C165577te.A0g(r1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r4.A04.A06("MPIN", r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        X.C165567td.A1P("mpin", r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        X.C165567td.A1P("credential-id", r3.A0A, r7);
        r0 = (X.C175818b6) r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C207249un r3, X.AnonymousClass8gS r4, java.lang.String r5, java.util.HashMap r6, java.util.List r7) {
        /*
            int r0 = r5.hashCode()
            switch(r0) {
                case -1747997465: goto L_0x0045;
                case -1206140285: goto L_0x004e;
                case 417679030: goto L_0x0057;
                case 485726418: goto L_0x0060;
                case 1224051264: goto L_0x003c;
                default: goto L_0x0007;
            }
        L_0x0007:
            r2 = 7
        L_0x0008:
            if (r6 == 0) goto L_0x0019
            X.9lR r1 = r4.A04
            java.lang.String r0 = "MPIN"
            java.lang.String r1 = r1.A06(r0, r6, r2)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "mpin"
            X.C165567td.A1P(r0, r1, r7)
        L_0x0019:
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = r3.A0A
            java.lang.String r0 = "credential-id"
            X.C165567td.A1P(r0, r1, r7)
            X.8bF r0 = r3.A08
            X.8b6 r0 = (X.C175818b6) r0
            if (r0 == 0) goto L_0x003b
            X.6c7 r1 = r0.A05
            boolean r0 = X.C202349ld.A03(r1)
            if (r0 != 0) goto L_0x003b
            java.lang.Object r1 = X.C165577te.A0g(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "upi-bank-info"
            X.C165567td.A1P(r0, r1, r7)
        L_0x003b:
            return
        L_0x003c:
            java.lang.String r0 = "upi-revoke-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 10
            goto L_0x0068
        L_0x0045:
            java.lang.String r0 = "upi-resume-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 12
            goto L_0x0068
        L_0x004e:
            java.lang.String r0 = "upi-update-mandate-by-url"
            boolean r0 = r5.equals(r0)
            r2 = 9
            goto L_0x0068
        L_0x0057:
            java.lang.String r0 = "upi-create-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 8
            goto L_0x0068
        L_0x0060:
            java.lang.String r0 = "upi-pause-mandate"
            boolean r0 = r5.equals(r0)
            r2 = 11
        L_0x0068:
            if (r0 != 0) goto L_0x0008
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gS.A00(X.9un, X.8gS, java.lang.String, java.util.HashMap, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C203399nx[] A03(X.C202319lY r9, X.AnonymousClass8gS r10) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.8av r0 = r9.A0A
            if (r0 == 0) goto L_0x0071
            X.9ua r2 = r0.A01
            if (r2 == 0) goto L_0x0071
            X.1Vk r3 = r10.A01
            int r0 = r2.A01()
            long r7 = (long) r0
            int r6 = r2.A00
            X.16U r4 = r2.A01
            java.lang.String r5 = "amount"
            X.9nx r0 = r3.A06(r4, r5, r6, r7)
        L_0x001d:
            r1.add(r0)
        L_0x0020:
            X.8av r0 = r9.A0A
            X.8bI r0 = (X.C175928bI) r0
            X.9jw r2 = r0.A0G
            X.C18740tg.A06(r2)
            X.9ua r0 = r2.A05
            if (r0 == 0) goto L_0x004c
            X.1Vk r3 = r10.A01
            int r0 = r0.A01()
            long r7 = (long) r0
            X.9ua r0 = r2.A05
            int r6 = r0.A00
            X.16U r4 = r0.A01
            java.lang.String r5 = "original-amount"
            X.9nx r0 = r3.A06(r4, r5, r6, r7)
        L_0x0040:
            r1.add(r0)
        L_0x0043:
            int r0 = r1.size()
            X.9nx[] r0 = X.C165577te.A1b(r1, r0)
            return r0
        L_0x004c:
            X.6c7 r2 = r2.A09
            boolean r0 = X.C202349ld.A03(r2)
            if (r0 != 0) goto L_0x0043
            java.lang.Object r0 = r2.A00
            java.lang.String r0 = (java.lang.String) r0
            java.math.BigDecimal r2 = X.C165617ti.A0b(r0)
            X.16U r4 = X.AnonymousClass16W.A05
            r0 = r4
            X.16V r0 = (X.AnonymousClass16V) r0
            int r0 = r0.A01
            X.16X r3 = new X.16X
            r3.<init>(r2, r0)
            X.1Vk r2 = r10.A01
            java.lang.String r0 = "original-amount"
            X.9nx r0 = r2.A05(r4, r3, r0)
            goto L_0x0040
        L_0x0071:
            X.16X r4 = r9.A08
            if (r4 == 0) goto L_0x0020
            X.1Vk r3 = r10.A01
            X.16U r2 = X.AnonymousClass16W.A05
            java.lang.String r0 = "amount"
            X.9nx r0 = r3.A05(r2, r4, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gS.A03(X.9lY, X.8gS):X.9nx[]");
    }
}
