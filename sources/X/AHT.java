package X;

import com.whatsapp.R;

public final class AHT implements B6A {
    public final C19630wG A00;
    public final AnonymousClass97O A01;

    public AHT(C19630wG r2, AnonymousClass97O r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public C16340p0 BGA(AnonymousClass3T1 r5) {
        String str;
        AnonymousClass00C.A0D(r5, 0);
        String A0m = C36361kB.A0m(this.A00.A00, R.string.f12nameremoved);
        if (!C202359le.A04(r5) || (str = C202359le.A00(r5)) == null) {
            str = ((AnonymousClass2bU) r5).A1a();
        }
        return new AH9(C28471Su.A02.A00(str, "📷", A0m));
    }
}