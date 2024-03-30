package X;

import android.database.Cursor;

/* renamed from: X.3qg  reason: invalid class name and case insensitive filesystem */
public class C77553qg implements C88094Rj {
    public final AnonymousClass163 A00;
    public final C20650xu A01;
    public final AnonymousClass12P A02;

    public Cursor BE9(C02680Bk r11, AnonymousClass11F r12, AnonymousClass1S3 r13) {
        C36721lC r0;
        if (r12 == null) {
            return null;
        }
        C20650xu r3 = this.A01;
        long A09 = r3.A09();
        AnonymousClass1M0 A04 = this.A02.get();
        if (r13 != null) {
            try {
                if (C36391kE.A1a(r13)) {
                    r13.A02();
                    if (A09 == 1) {
                        String A0H = r3.A0H(r13.A02());
                        C224114e r32 = A04.A02;
                        String str = AnonymousClass2x9.A00;
                        String[] A1S = C36441kJ.A1S();
                        A1S[0] = A0H;
                        C36331k8.A19(this.A00, r12, A1S, 1);
                        r0 = r32.A0B(r11, str, "GET_DOCUMENT_MESSAGES_FTS_DEPRECATED_SQL", A1S);
                    } else {
                        C18740tg.A0D(AnonymousClass000.A1Q((A09 > 5 ? 1 : (A09 == 5 ? 0 : -1))), "unknown fts version");
                        r13.A02 = 100;
                        String A0E = r3.A0E(r11, r13, (Integer) null);
                        r0 = A04.A02.A0B(r11, AnonymousClass2x9.A03, "GET_MATCH_TYPE_MESSAGES_FTS_SQL", new String[]{A0E});
                    }
                    A04.close();
                    return r0;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        C224114e r33 = A04.A02;
        String str2 = AnonymousClass2xD.A03;
        String[] strArr = new String[1];
        C36331k8.A19(this.A00, r12, strArr, 0);
        r0 = r33.A0B(r11, str2, "GET_DOCUMENT_MESSAGES", strArr);
        A04.close();
        return r0;
    }

    public C77553qg(AnonymousClass163 r1, C20650xu r2, AnonymousClass12P r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
