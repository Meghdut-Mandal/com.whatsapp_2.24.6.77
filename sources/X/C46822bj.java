package X;

import android.text.TextUtils;

/* renamed from: X.2bj  reason: invalid class name and case insensitive filesystem */
public class C46822bj extends C46972by implements C88854Uh, AnonymousClass4RU {
    public AnonymousClass3F4 A00;

    public C46822bj(C65013Qj r10, C64933Qa r11, C46822bj r12, long j) {
        super(r10, r11, r12, r12.A1I, j, true);
        this.A00 = r12.A00.A00();
    }

    public String BC7() {
        String str;
        if (!TextUtils.isEmpty(this.A00.A03)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass3F4 r1 = this.A00;
            A0u.append(r1.A02);
            A0u.append(" ");
            str = AnonymousClass000.A0q(r1.A03, A0u);
        } else {
            str = this.A00.A02;
        }
        String A1j = A1j();
        if (TextUtils.isEmpty(A1j)) {
            return str;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        AnonymousClass000.A1D(A1j, " ", str, A0u2);
        return A0u2.toString();
    }

    public String BGC() {
        return this.A00.A02;
    }

    public String BGO() {
        return this.A00.A02;
    }

    public String BEX(C18820ts r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("📄 ");
        return AnonymousClass000.A0q(this.A00.A02, A0u);
    }

    public AnonymousClass3F4 BIE() {
        return this.A00;
    }

    public void BsS(AnonymousClass3F4 r1) {
        this.A00 = r1;
    }

    public C46822bj(C64933Qa r2, long j) {
        super(r2, 26, j);
    }
}
