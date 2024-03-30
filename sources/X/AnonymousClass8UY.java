package X;

import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.8UY  reason: invalid class name */
public class AnonymousClass8UY extends C430728r {
    public byte[] A00;
    public final C225314u A01;
    public final FingerprintBottomSheet A02;
    public final B1Y A03;
    public final C19970wo A04;
    public final AnonymousClass9SL A05;
    public final C196039Xk A06;

    public void A00() {
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        fingerprintBottomSheet.A1g(true);
        this.A03.BiK(this.A00);
        fingerprintBottomSheet.A1c();
    }

    public void A01() {
        this.A03.Bgg();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C02680Bk r9, X.C160387kv r10) {
        /*
            r8 = this;
            X.9Xk r0 = r8.A06
            long r1 = r0.A00()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            X.0wo r0 = r8.A04
            long r3 = X.C19970wo.A00(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r8.A02
            r0.A1k(r1)
        L_0x0018:
            return
        L_0x0019:
            X.9SL r6 = r8.A05
            X.A8e r5 = new X.A8e
            r5.<init>(r10, r8)
            X.0wo r0 = r6.A00
            long r1 = X.C36371kC.A09(r0)
            boolean r0 = r6 instanceof X.AnonymousClass8h5
            if (r0 == 0) goto L_0x0073
            r0 = r6
            X.8h5 r0 = (X.AnonymousClass8h5) r0
            java.lang.Object[] r7 = X.AnonymousClass001.A0M()
            java.lang.String r3 = r0.A01
            r0 = 0
            r7[r0] = r3
            X.C36421kH.A1P(r7, r1)
        L_0x0039:
            byte[] r4 = X.C200959iX.A01(r7)
        L_0x003d:
            X.6VG r3 = r6.A02
            X.A8c r0 = new X.A8c
            r0.<init>(r6, r5, r1)
            boolean r0 = r3.A06(r9, r0, r4)
            if (r0 != 0) goto L_0x0018
            X.8UY r1 = r5.A01
            com.whatsapp.authentication.FingerprintBottomSheet r0 = r1.A02
            r0.A1b()
            X.14u r0 = r1.A01
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131892352(0x7f121880, float:1.941945E38)
            r2.A0d(r0)
            r0 = 2131892351(0x7f12187f, float:1.9419448E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 15
            X.B83.A01(r2, r5, r0, r1)
            r0 = 0
            r2.A0r(r0)
            r2.A0b()
            return
        L_0x0073:
            boolean r0 = r6 instanceof X.AnonymousClass8h4
            if (r0 == 0) goto L_0x008c
            r4 = r6
            X.8h4 r4 = (X.AnonymousClass8h4) r4
            java.lang.Object[] r7 = X.C36441kJ.A1Q()
            java.lang.String r3 = r4.A00
            r0 = 0
            r7[r0] = r3
            X.C36421kH.A1P(r7, r1)
            java.lang.String r3 = r4.A01
            r0 = 2
            r7[r0] = r3
            goto L_0x0039
        L_0x008c:
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            X.C90474aD.A1S(r0, r1)
            byte[] r4 = X.C200959iX.A01(r0)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8UY.A02(X.0Bk, X.7kv):void");
    }

    public AnonymousClass8UY(C225314u r1, FingerprintBottomSheet fingerprintBottomSheet, C19970wo r3, AnonymousClass9SL r4, B1Y b1y, C196039Xk r6) {
        this.A04 = r3;
        this.A06 = r6;
        this.A01 = r1;
        this.A02 = fingerprintBottomSheet;
        this.A05 = r4;
        this.A03 = b1y;
    }

    public void A03(byte[] bArr) {
        this.A00 = bArr;
    }
}
