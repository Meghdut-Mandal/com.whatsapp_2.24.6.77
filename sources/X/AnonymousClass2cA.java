package X;

import android.text.TextUtils;

/* renamed from: X.2cA  reason: invalid class name */
public class AnonymousClass2cA extends C46912bs implements C88854Uh {
    public AnonymousClass3F4 A00;

    public AnonymousClass2cA(C64933Qa r9, AnonymousClass2cA r10, long j) {
        super(r9, r10, r10.A1I, j, true);
        this.A00 = r10.A00.A00();
    }

    public String BC7() {
        if (TextUtils.isEmpty(this.A00.A03)) {
            return this.A00.A02;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass3F4 r1 = this.A00;
        A0u.append(r1.A02);
        C36421kH.A1N(A0u);
        return AnonymousClass000.A0q(r1.A03, A0u);
    }

    public String BGC() {
        return this.A00.A02;
    }

    public String BGO() {
        return this.A00.A02;
    }

    public String BEX(C18820ts r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("📌 ");
        return AnonymousClass000.A0q(this.A00.A02, A0u);
    }

    public AnonymousClass3F4 BIE() {
        return this.A00;
    }

    public void BsS(AnonymousClass3F4 r1) {
        this.A00 = r1;
    }

    public AnonymousClass2cA(C64933Qa r2, long j) {
        super(r2, 30, j);
    }
}
