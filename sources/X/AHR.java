package X;

import com.whatsapp.R;

public final class AHR implements B6A {
    public final C19630wG A00;

    public AHR(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public C16340p0 BGA(AnonymousClass3T1 r6) {
        AnonymousClass00C.A0D(r6, 0);
        C46852bm r62 = (C46852bm) r6;
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = r62.A02;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        A0u.append(str);
        A0u.append(' ');
        String str3 = r62.A05;
        if (str3 == null) {
            str3 = str2;
        }
        String A0y = C36371kC.A0y(AnonymousClass000.A0q(str3, A0u));
        StringBuilder A0u2 = AnonymousClass000.A0u();
        String str4 = r62.A09;
        if (str4 != null) {
            str2 = str4;
        }
        A0u2.append(str2);
        return new AH9(C28471Su.A02.A00(C36371kC.A0y(C90464aC.A0f(A0y, A0u2, ' ')), "🛒", C36371kC.A0v(this.A00, R.string.f12nameremoved)));
    }
}
