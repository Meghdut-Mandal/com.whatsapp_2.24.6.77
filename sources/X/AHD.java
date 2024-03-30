package X;

import com.whatsapp.R;

public final class AHD implements B6A {
    public final C19630wG A00;

    public AHD(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public C16340p0 BGA(AnonymousClass3T1 r4) {
        String str;
        AnonymousClass00C.A0D(r4, 0);
        String str2 = ((AnonymousClass2bX) r4).A00;
        if (str2 != null) {
            str = AnonymousClass14B.A0C(str2, 128);
        } else {
            str = null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C165587tf.A1O(A0u, "👤");
        if (str == null) {
            str = C36361kB.A0m(this.A00.A00, R.string.f12nameremoved);
        }
        return new AH9(AnonymousClass000.A0q(str, A0u));
    }
}
