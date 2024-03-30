package X;

import java.util.List;

/* renamed from: X.9dW  reason: invalid class name and case insensitive filesystem */
public final class C198419dW {
    public static final C198419dW A00 = new C198419dW();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r5 == null) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C173158Qp A01(X.C52642pw r11, X.C52712q3 r12, java.lang.String r13, java.util.List r14, int r15) {
        /*
            r10 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r13, r2)
            X.8Qp r0 = X.C173158Qp.DEFAULT_INSTANCE
            X.8NN r3 = X.C170918Hz.A01(r0)
            X.8Hz r1 = r3.A00
            X.8Qp r1 = (X.C173158Qp) r1
            int r0 = r11.value
            r1.encoding_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8Qp r1 = (X.C173158Qp) r1
            int r0 = r12.value
            r1.transformer_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            int r0 = r11.ordinal()
            if (r0 != r2) goto L_0x0066
            byte[] r1 = X.C36351kA.A1b(r13)
            int r0 = r1.length
            X.8I5 r7 = X.C21674AUx.A01(r1, r2, r0)
        L_0x0037:
            r2 = 0
            if (r7 == 0) goto L_0x012f
            int r1 = r12.ordinal()
            r0 = 1
            if (r1 != r0) goto L_0x012e
            int r0 = X.C36331k8.A01(r14)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r2 = r14.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r2.next()
            X.8PU r0 = (X.AnonymousClass8PU) r0
            java.lang.String r1 = r0.key_
            X.8PT r0 = r0.value_
            if (r0 != 0) goto L_0x0062
            X.8PT r0 = X.AnonymousClass8PT.DEFAULT_INSTANCE
        L_0x0062:
            r4.put(r1, r0)
            goto L_0x004e
        L_0x0066:
            java.lang.String r0 = "UserPasscodeUtil/Encoding.encode: Unknown user password encoding"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            goto L_0x0037
        L_0x006d:
            java.lang.String r6 = "salt"
            java.lang.Object r2 = r4.get(r6)
            X.8PT r2 = (X.AnonymousClass8PT) r2
            if (r2 == 0) goto L_0x0080
            int r1 = r2.valueCase_
            r0 = 1
            if (r1 != r0) goto L_0x011e
            java.lang.Object r5 = r2.value_
        L_0x007e:
            if (r5 != 0) goto L_0x00b4
        L_0x0080:
            r0 = 16
            byte[] r2 = new byte[r0]
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextBytes(r2)
            r1 = 16
            r0 = 0
            X.8I5 r5 = X.C21674AUx.A01(r2, r0, r1)
            X.8PT r0 = X.AnonymousClass8PT.DEFAULT_INSTANCE
            X.8NN r2 = X.C170918Hz.A01(r0)
            X.8Hz r1 = r2.A00
            X.8PT r1 = (X.AnonymousClass8PT) r1
            r0 = 1
            r1.valueCase_ = r0
            r1.value_ = r5
            X.8Hz r1 = r2.A0R()
            X.8PT r1 = (X.AnonymousClass8PT) r1
            X.8PU r0 = X.AnonymousClass8PU.DEFAULT_INSTANCE
            X.8NN r0 = X.C170918Hz.A01(r0)
            A00(r0, r1, r6, r14)
            X.AnonymousClass00C.A0B(r5)
        L_0x00b4:
            java.lang.String r6 = "iterations"
            java.lang.Object r2 = r4.get(r6)
            X.8PT r2 = (X.AnonymousClass8PT) r2
            if (r2 == 0) goto L_0x00f5
            int r1 = r2.valueCase_
            r0 = 2
            if (r1 != r0) goto L_0x00f3
            java.lang.Object r0 = r2.value_
            int r0 = X.AnonymousClass000.A0I(r0)
        L_0x00c9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.011 r1 = X.C36441kJ.A19(r5, r0)
            java.lang.Object r0 = r1.first
            X.AUx r0 = (X.C21674AUx) r0
            int r9 = X.C90474aD.A08(r1)
            byte[] r8 = X.C165617ti.A0i(r7)
            byte[] r7 = r0.A06()
            int r6 = r15 * 8
            java.lang.String r5 = "PBKDF2WithHmacSHA512"
            int r4 = r8.length
            char[] r2 = new char[r4]
            r1 = 0
        L_0x00e9:
            if (r1 >= r4) goto L_0x0122
            byte r0 = r8[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x00e9
        L_0x00f3:
            r0 = 0
            goto L_0x00c9
        L_0x00f5:
            X.8PT r0 = X.AnonymousClass8PT.DEFAULT_INSTANCE
            X.8NN r4 = r0.A0p()
            r2 = 10000(0x2710, float:1.4013E-41)
            X.8Hz r1 = X.C90524aI.A0H(r4)
            X.8PT r1 = (X.AnonymousClass8PT) r1
            r0 = 2
            r1.valueCase_ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.value_ = r0
            X.8Hz r1 = r4.A0R()
            X.8PT r1 = (X.AnonymousClass8PT) r1
            X.8PU r0 = X.AnonymousClass8PU.DEFAULT_INSTANCE
            X.8NN r0 = X.C170918Hz.A01(r0)
            A00(r0, r1, r6, r14)
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L_0x00c9
        L_0x011e:
            X.AUx r5 = X.C21674AUx.A00
            goto L_0x007e
        L_0x0122:
            javax.crypto.SecretKey r0 = X.C18750th.A08(r5, r7, r2, r9, r6)
            byte[] r0 = r0.getEncoded()
            X.8I5 r7 = X.C165607th.A0O(r0)
        L_0x012e:
            r2 = r7
        L_0x012f:
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8Qp r1 = (X.C173158Qp) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.transformedData_ = r2
            X.8Hz r2 = X.C90524aI.A0H(r3)
            X.8Qp r2 = (X.C173158Qp) r2
            X.B6c r1 = r2.transformerArg_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0155
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.transformerArg_ = r1
        L_0x0155:
            X.C21071A7i.A0O(r14, r1)
            X.8Hz r0 = r3.A0R()
            X.8Qp r0 = (X.C173158Qp) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198419dW.A01(X.2pw, X.2q3, java.lang.String, java.util.List, int):X.8Qp");
    }

    public static void A00(AnonymousClass8NN r2, AnonymousClass8PT r3, String str, List list) {
        AnonymousClass8PU r1 = (AnonymousClass8PU) r2.A00;
        r1.bitField0_ |= 1;
        r1.key_ = str;
        r2.A0S();
        AnonymousClass8PU r12 = (AnonymousClass8PU) r2.A00;
        r3.getClass();
        r12.value_ = r3;
        r12.bitField0_ |= 2;
        list.add(r2.A0R());
    }
}
