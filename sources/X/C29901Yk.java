package X;

/* renamed from: X.1Yk  reason: invalid class name and case insensitive filesystem */
public final class C29901Yk {
    public final C23981Ap A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    public C29901Yk(C23981Ap r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    public final void A00(C46962bx r8, C158497hb r9) {
        AnonymousClass005 r0;
        AnonymousClass00C.A0D(r8, 0);
        if (this.A00.A00(r8).A0L) {
            r0 = this.A01;
        } else {
            r0 = this.A02;
        }
        C104665Ar r3 = (C104665Ar) r0.get();
        C135066c4 A002 = r3.A06.A00(r8);
        long j = r8.A04;
        if (A002.A0L == r3.A0E) {
            r3.A0C.execute(new C1502574o(r9, r3, A002, j));
        }
    }

    public final void A01(C135066c4 r6) {
        AnonymousClass005 r0;
        String str = r6.A0E;
        if (str != null && str.length() != 0) {
            if (r6.A0L) {
                r0 = this.A01;
            } else {
                r0 = this.A02;
            }
            C104665Ar r4 = (C104665Ar) r0.get();
            String str2 = r6.A0E;
            if (str2 != null) {
                r4.A0C.execute(new C1502374m(r4, r6, str2, 17));
            }
        }
    }
}
