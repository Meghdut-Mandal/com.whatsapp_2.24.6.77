package X;

import android.text.TextUtils;

/* renamed from: X.8me  reason: invalid class name and case insensitive filesystem */
public class C180928me extends C181788o2 implements C88854Uh, AnonymousClass4RU {
    public AnonymousClass3F4 A00;

    public C180928me(C64933Qa r2, long j) {
        super(r2, 29, j);
    }

    public String A1a() {
        return this.A00.A02;
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
        A0u.append("👾 ");
        return AnonymousClass000.A0q(this.A00.A02, A0u);
    }

    public AnonymousClass3F4 BIE() {
        return this.A00;
    }

    public void BsS(AnonymousClass3F4 r1) {
        this.A00 = r1;
    }

    public C180928me(C65013Qj r9, C64933Qa r10, C180928me r11, long j) {
        super(r9, r10, r11, j, true);
        this.A00 = r11.A00.A00();
    }
}
