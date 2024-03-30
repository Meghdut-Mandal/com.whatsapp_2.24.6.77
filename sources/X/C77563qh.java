package X;

import android.database.Cursor;

/* renamed from: X.3qh  reason: invalid class name and case insensitive filesystem */
public class C77563qh implements C88094Rj {
    public final AnonymousClass163 A00;
    public final C20650xu A01;
    public final AnonymousClass12P A02;

    public Cursor BE9(C02680Bk r11, AnonymousClass11F r12, AnonymousClass1S3 r13) {
        C36721lC r0;
        C20650xu r3 = this.A01;
        long A09 = r3.A09();
        String l = Long.toString(this.A00.A08(r12));
        AnonymousClass1M0 A04 = this.A02.get();
        if (r13 != null) {
            try {
                if (C36391kE.A1a(r13)) {
                    if (A09 == 1) {
                        String A0H = r3.A0H(r13.A02());
                        C224114e r32 = A04.A02;
                        String str = AnonymousClass2x9.A01;
                        String[] A1S = C36441kJ.A1S();
                        A1S[0] = l;
                        A1S[1] = A0H;
                        r0 = r32.A0B(r11, str, "GET_LINK_MESSAGE_FTS_DEPRECATED_SQL", A1S);
                    } else {
                        r13.A02 = C65953Uc.A03;
                        String A0E = r3.A0E(r11, r13, (Integer) null);
                        r0 = A04.A02.A0B(r11, AnonymousClass2x9.A02, "GET_LINK_MESSAGE_FTS_SQL", new String[]{A0E});
                    }
                    A04.close();
                    return r0;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        r0 = A04.A02.A0B(r11, C56322w6.A00, "GET_LINK_MESSAGE_SQL", new String[]{l});
        A04.close();
        return r0;
    }

    public C77563qh(AnonymousClass163 r1, C20650xu r2, AnonymousClass12P r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
