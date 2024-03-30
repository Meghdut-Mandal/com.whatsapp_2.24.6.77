package X;

import com.whatsapp.R;

public final class AHS implements B6A {
    public final C19630wG A00;
    public final C18820ts A01;

    public C16340p0 BGA(AnonymousClass3T1 r6) {
        String str;
        String str2;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass2bU r62 = (AnonymousClass2bU) r6;
        if (r62.A09 == 1) {
            str = "🎤";
        } else {
            str = "🎵";
        }
        if (r62.A0B != 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(" (");
            str2 = C36321k7.A0E(AnonymousClass3UY.A07(this.A01, (long) r62.A0B), A0u);
        } else {
            str2 = "";
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(' ');
        return new AH9(AnonymousClass000.A0p(this.A00.A00.getString(R.string.f12nameremoved), str2, A0v));
    }

    public AHS(C19630wG r1, C18820ts r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
