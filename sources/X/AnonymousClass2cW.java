package X;

import android.text.TextUtils;

/* renamed from: X.2cW  reason: invalid class name */
public class AnonymousClass2cW extends AnonymousClass2bV implements C88854Uh, AnonymousClass4RU, AnonymousClass4RV {
    public AnonymousClass3F4 A00;

    public AnonymousClass2cW(C64933Qa r8, AnonymousClass2cW r9, long j) {
        super(r8, r9, j, true);
        this.A00 = r9.A00.A00();
    }

    public String A1d() {
        if (TextUtils.isEmpty(A0b())) {
            return this.A00.A02;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("*");
        A0u.append(AnonymousClass000.A0p(A0b(), "*", A0u2));
        A0u.append("\n");
        return AnonymousClass000.A0q(this.A00.A02, A0u);
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 B31(C64933Qa r2, long j) {
        return A1X(r2, j);
    }

    public String BC7() {
        AnonymousClass3F4 r2;
        String str;
        if (!TextUtils.isEmpty(A0b())) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(A0b());
            A0u.append(" ");
            r2 = this.A00;
            str = AnonymousClass000.A0q(r2.A02, A0u);
        } else {
            r2 = this.A00;
            str = r2.A02;
        }
        if (TextUtils.isEmpty(r2.A03)) {
            return str;
        }
        return AnonymousClass000.A0q(this.A00.A03, C36331k8.A0k(str, " "));
    }

    public String BEX(C18820ts r2) {
        if (!TextUtils.isEmpty(A0b())) {
            return A0b();
        }
        return this.A00.A02;
    }

    public String BGC() {
        if (!TextUtils.isEmpty(A0b())) {
            return A0b();
        }
        return this.A00.A02;
    }

    public String BGO() {
        return A1d();
    }

    public AnonymousClass3F4 BIE() {
        return this.A00;
    }

    public void BsS(AnonymousClass3F4 r1) {
        this.A00 = r1;
    }

    public AnonymousClass2cW(C64933Qa r2, long j) {
        super(r2, 27, j);
    }
}
