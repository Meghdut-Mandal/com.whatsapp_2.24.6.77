package X;

import android.text.TextUtils;

/* renamed from: X.2bn  reason: invalid class name and case insensitive filesystem */
public class C46862bn extends C46882bp implements C88854Uh, AnonymousClass4RU {
    public AnonymousClass3F4 A00;

    public C46862bn(C65013Qj r9, C64933Qa r10, C46862bn r11, long j) {
        super(r9, r10, r11, j, true);
        this.A00 = r11.A00.A00();
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
        A0u.append("📷 ");
        return AnonymousClass000.A0q(this.A00.A02, A0u);
    }

    public AnonymousClass3F4 BIE() {
        return this.A00;
    }

    public void BsS(AnonymousClass3F4 r1) {
        this.A00 = r1;
    }

    public C46862bn(C64933Qa r2, long j) {
        super(r2, 25, j);
    }
}
