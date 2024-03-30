package X;

import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3MJ  reason: invalid class name */
public abstract class AnonymousClass3MJ {
    public static final void A00(C19460v5 r1) {
        AnonymousClass00C.A0D(r1, 0);
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("getVNameCertForVerifyCode");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = X.AnonymousClass097.A04(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 == 0) goto L_0x0014
            java.lang.Long r0 = X.AnonymousClass097.A04(r6)
            if (r0 == 0) goto L_0x0014
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            r5 = 1
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MJ.A02(java.lang.String):boolean");
    }

    public static boolean A01(C19420v0 r1, C66713Xa r2, VerifyPhoneNumber verifyPhoneNumber, String str) {
        C65983Uf.A0Q(r1, str);
        verifyPhoneNumber.A0s.A03("failTooMany");
        verifyPhoneNumber.A0s.A02("verify-tma");
        return A02(r2.A0K);
    }
}
