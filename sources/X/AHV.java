package X;

import com.whatsapp.R;

public final class AHV implements B6A {
    public final C19630wG A00;
    public final C18820ts A01;
    public final AnonymousClass97O A02;

    public C16340p0 BGA(AnonymousClass3T1 r7) {
        String str;
        String str2;
        AnonymousClass00C.A0D(r7, 0);
        String A0m = C36361kB.A0m(this.A00.A00, R.string.f12nameremoved);
        if (!C202359le.A04(r7) || (str = C202359le.A00(r7)) == null) {
            str = ((AnonymousClass2bU) r7).A1a();
        }
        int i = ((AnonymousClass2bU) r7).A0B;
        if (i > 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append('(');
            str2 = C36321k7.A0E(AnonymousClass3UY.A07(this.A01, (long) i), A0u);
        } else {
            str2 = "";
        }
        return new AH9(C36371kC.A0y(C90464aC.A0f(str2, AnonymousClass000.A0v(C28471Su.A02.A00(str, "🎥", A0m)), ' ')));
    }

    public AHV(C19630wG r1, C18820ts r2, AnonymousClass97O r3) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
