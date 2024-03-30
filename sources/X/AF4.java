package X;

public final class AF4 implements C23075B3f {
    public C21010yW A00;
    public C24631De A01;
    public C1271267b A02;

    public /* bridge */ /* synthetic */ void BOn(Integer num, Integer num2, String str, String str2, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        C176658cT B4W = B4W();
        C176658cT.A04(B4W, num2, str, 1);
        this.A00.Bly(B4W);
    }

    public C176658cT B4W() {
        String str;
        C176658cT r1 = new C176658cT();
        r1.A0V = this.A02.A00();
        C202159l8 A022 = this.A01.A02();
        if (A022 != null) {
            str = A022.A03;
        } else {
            str = null;
        }
        r1.A0R = str;
        return r1;
    }

    public void BOb(C202059ky r4, int i) {
        C21010yW r2 = this.A00;
        C176658cT B4W = B4W();
        B4W.A0C = Integer.valueOf(C176658cT.A00(B4W, r4, i));
        B4W.A08 = C36371kC.A0n();
        r2.Bly(B4W);
    }

    public void BOl(C176658cT r2) {
        String str;
        r2.A0V = this.A02.A00();
        C202159l8 A022 = this.A01.A02();
        if (A022 != null) {
            str = A022.A03;
        } else {
            str = null;
        }
        r2.A0R = str;
        this.A00.Bly(r2);
    }

    public /* bridge */ /* synthetic */ void BOq(C131606Ps r5, Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        int intValue = num.intValue();
        C176658cT B4W = B4W();
        C176658cT.A04(B4W, num2, "payment_transaction_details", intValue);
        if (str2 != null) {
            B4W.A0a = str2;
        }
        if (r5 != null) {
            C165587tf.A18(B4W, r5, r5.A01);
        }
        B4W.A06 = Boolean.valueOf(z2);
        B4W.A0W = null;
        B4W.A0X = null;
        this.A00.Bly(B4W);
    }

    public void Buu() {
        this.A02.A01();
    }

    public void reset() {
        C165587tf.A1B(this.A02);
    }

    public AF4(C21010yW r1, C24631De r2, C1271267b r3) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ void BOm(Integer num, Integer num2, String str, String str2) {
        int intValue = num.intValue();
        C176658cT B4W = B4W();
        C176658cT.A04(B4W, num2, str, intValue);
        if (str2 != null) {
            B4W.A0a = str2;
        }
        this.A00.Bly(B4W);
    }

    public /* bridge */ /* synthetic */ void BOp(C131606Ps r4, Integer num, Integer num2, String str, String str2) {
        int intValue = num.intValue();
        C176658cT B4W = B4W();
        C176658cT.A04(B4W, num2, str, intValue);
        if (str2 != null) {
            B4W.A0a = str2;
        }
        if (r4 != null) {
            C165587tf.A18(B4W, r4, r4.A01);
        }
        this.A00.Bly(B4W);
    }

    public /* bridge */ /* synthetic */ void BOZ(C21667AUj aUj, Integer num, Integer num2, String str, String str2) {
    }
}
