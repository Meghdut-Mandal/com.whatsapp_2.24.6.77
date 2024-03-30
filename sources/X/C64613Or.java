package X;

/* renamed from: X.3Or  reason: invalid class name and case insensitive filesystem */
public class C64613Or {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;
    public final AnonymousClass1A1 A02;
    public final C598535n A03;

    public static String A00(AnonymousClass3T1 r2) {
        if (r2 instanceof C23043B1o) {
            C207219uk BA8 = ((C23043B1o) r2).BA8();
            if (BA8 != null) {
                return BA8.A09;
            }
            return null;
        } else if (C202359le.A04(r2)) {
            return C202359le.A01(r2);
        } else {
            if (r2 instanceof AnonymousClass2bV) {
                return r2.A0b();
            }
            if ((r2 instanceof C46882bp) || (r2 instanceof C47002cZ)) {
                return ((AnonymousClass2bU) r2).A1a();
            }
            return null;
        }
    }

    public int A01(C02680Bk r8, AnonymousClass11F r9) {
        C36721lC A0B;
        String l = Long.toString(this.A00.A08(r9));
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            C224114e r4 = A04.A02;
            String[] A1R = C36441kJ.A1R();
            A1R[0] = l;
            A0B = r4.A0B(r8, "SELECT COUNT(*) AS count FROM message_link WHERE chat_row_id = ?", "MESSAGE_LINK_TABLE_GET_COUNT", A1R);
            if (A0B.moveToFirst()) {
                int i = A0B.getInt(A0B.getColumnIndexOrThrow("count"));
                A0B.close();
                A04.close();
                return i;
            }
            A0B.close();
            A04.close();
            return 0;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C64613Or(AnonymousClass163 r1, AnonymousClass12P r2, AnonymousClass1A1 r3, C598535n r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
