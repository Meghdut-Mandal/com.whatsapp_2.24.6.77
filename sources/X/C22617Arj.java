package X;

/* renamed from: X.Arj  reason: case insensitive filesystem */
public class C22617Arj extends AnonymousClass120 {
    public C22656AsM A00;
    public C22654AsK A01;
    public C22654AsK A02;
    public C22586ArE A03;
    public C22586ArE A04;
    public C22641As7 A05;
    public C22641As7 A06;
    public C22632Ary A07;
    public C22608Ara A08;
    public C22611Ard A09;
    public C22639As5 A0A;
    public C22639As5 A0B;

    public static C22617Arj A00(Object obj) {
        if (obj instanceof C22617Arj) {
            return (C22617Arj) obj;
        }
        if (obj != null) {
            return new C22617Arj(C22656AsM.A04(obj));
        }
        return null;
    }

    public AnonymousClass121 Bve() {
        if (C200679hw.A00("org.spongycastle.x509.allow_non-der_tbscert") == null || C200679hw.A01("org.spongycastle.x509.allow_non-der_tbscert")) {
            return this.A00;
        }
        C202169lB r4 = new C202169lB();
        C22654AsK asK = this.A02;
        if (!asK.A0I(AnonymousClass9BA.A02)) {
            C202169lB.A02(asK, r4, 0, true);
        }
        r4.A06(this.A01);
        r4.A06(this.A07);
        r4.A06(this.A05);
        C202169lB r1 = new C202169lB(2);
        r1.A06(this.A0B);
        r4.A06(C202169lB.A01(this.A0A, r1));
        C219411z r0 = this.A06;
        if (r0 == null) {
            r0 = new C22675Asf();
        }
        r4.A06(r0);
        r4.A06(this.A09);
        C22586ArE arE = this.A03;
        if (arE != null) {
            C202169lB.A02(arE, r4, 1, false);
        }
        C22586ArE arE2 = this.A04;
        if (arE2 != null) {
            C202169lB.A02(arE2, r4, 2, false);
        }
        C22608Ara ara = this.A08;
        if (ara != null) {
            C202169lB.A02(ara, r4, 3, true);
        }
        return new C22675Asf(r4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22617Arj(X.C22656AsM r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A00 = r8
            r4 = 0
            X.11z r0 = r8.A0J(r4)
            boolean r2 = r0 instanceof X.C22658AsO
            r0 = 0
            r3 = 1
            if (r2 == 0) goto L_0x00b9
            X.11z r2 = r8.A0J(r4)
            X.AsO r2 = (X.C22658AsO) r2
            X.121 r2 = X.C22658AsO.A01(r2)
            X.AsK r2 = X.C22654AsK.A01(r2)
            r7.A02 = r2
            r5 = 0
        L_0x0022:
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x0097
            r2 = 1
        L_0x002d:
            r6 = 0
        L_0x002e:
            int r0 = r5 + 1
            X.11z r0 = r8.A0J(r0)
            X.AsK r0 = X.C22654AsK.A01(r0)
            r7.A01 = r0
            int r0 = r5 + 2
            X.11z r0 = r8.A0J(r0)
            X.Ary r0 = X.C22632Ary.A00(r0)
            r7.A07 = r0
            int r0 = r5 + 3
            X.11z r0 = r8.A0J(r0)
            X.As7 r0 = X.C22641As7.A01(r0)
            r7.A05 = r0
            int r0 = r5 + 4
            X.11z r1 = r8.A0J(r0)
            X.AsM r1 = (X.C22656AsM) r1
            X.11z r0 = r1.A0J(r4)
            X.As5 r0 = X.C22639As5.A00(r0)
            r7.A0B = r0
            X.11z r0 = r1.A0J(r3)
            X.As5 r0 = X.C22639As5.A00(r0)
            r7.A0A = r0
            int r0 = r5 + 5
            X.11z r0 = r8.A0J(r0)
            X.As7 r0 = X.C22641As7.A01(r0)
            r7.A06 = r0
            int r5 = r5 + 6
            X.11z r0 = r8.A0J(r5)
            X.Ard r0 = X.C22611Ard.A00(r0)
            r7.A09 = r0
            int r4 = r8.A0H()
            int r4 = r4 - r5
            int r4 = r4 - r3
            if (r4 == 0) goto L_0x010b
            if (r2 == 0) goto L_0x00c3
            java.lang.String r0 = "version 1 certificate contains extra data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0097:
            X.AsK r2 = r7.A02
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x00a8
            r2 = 0
            r6 = 1
            goto L_0x002e
        L_0x00a8:
            X.AsK r2 = r7.A02
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0I(r0)
            if (r0 == 0) goto L_0x010c
            r2 = 0
            goto L_0x002d
        L_0x00b9:
            X.AsK r2 = new X.AsK
            r2.<init>((long) r0)
            r7.A02 = r2
            r5 = -1
            goto L_0x0022
        L_0x00c3:
            if (r4 <= 0) goto L_0x010b
            int r0 = r5 + r4
            X.11z r2 = r8.A0J(r0)
            X.AsO r2 = (X.C22658AsO) r2
            int r1 = r2.A00
            if (r1 == r3) goto L_0x00ed
            r0 = 2
            if (r1 == r0) goto L_0x00e6
            r0 = 3
            if (r1 != r0) goto L_0x00fb
            if (r6 != 0) goto L_0x00f4
            X.AsM r0 = X.C22656AsM.A05(r2, r3)
            X.Ara r0 = X.C22608Ara.A01(r0)
            r7.A08 = r0
        L_0x00e3:
            int r4 = r4 + -1
            goto L_0x00c3
        L_0x00e6:
            X.ArE r0 = X.C22586ArE.A02(r2)
            r7.A04 = r0
            goto L_0x00e3
        L_0x00ed:
            X.ArE r0 = X.C22586ArE.A02(r2)
            r7.A03 = r0
            goto L_0x00e3
        L_0x00f4:
            java.lang.String r0 = "version 2 certificate cannot contain extensions"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x00fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown tag encountered in structure: "
            r1.append(r0)
            int r0 = r2.A00
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r0)
            throw r0
        L_0x010b:
            return
        L_0x010c:
            java.lang.String r0 = "version number not recognised"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22617Arj.<init>(X.AsM):void");
    }
}
