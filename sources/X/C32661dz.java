package X;

import java.util.UUID;

/* renamed from: X.1dz  reason: invalid class name and case insensitive filesystem */
public final class C32661dz {
    public final C21010yW A00;
    public final C19730wQ A01;
    public final C21060yb A02;
    public final C20830yE A03;
    public final AnonymousClass005 A04;
    public volatile Integer A05;
    public volatile String A06;

    public C32661dz(C19730wQ r2, C21060yb r3, C20830yE r4, C21010yW r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A01 = r2;
        this.A00 = r5;
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r4;
    }

    public final void A02(Boolean bool, int i) {
        if (!this.A01.A0L() && this.A06 != null) {
            ((C19770wU) this.A04.get()).Bp6(new C35341iX(this, new C45102Qb(), bool, i, 14), "AddContactLog");
        }
    }

    public static final void A00(C45102Qb r2, C32661dz r3) {
        r2.A04 = r3.A06;
        r2.A02 = r3.A05;
        Integer A002 = C63723Ld.A00(r3.A02, r3.A03);
        if (A002 != null) {
            r2.A03 = Long.valueOf((long) A002.intValue());
        }
    }

    public final void A01() {
        if (!this.A01.A0L() && this.A06 != null) {
            ((C19770wU) this.A04.get()).Bp6(new C35771jE(this, new C45102Qb(), 14), "AddContactLog");
        }
    }

    public final void A03(boolean z, int i) {
        if (!this.A01.A0L()) {
            this.A06 = UUID.randomUUID().toString();
            this.A05 = Integer.valueOf(i);
            ((C19770wU) this.A04.get()).Bp6(new C35291iS(this, new C45102Qb(), 17, z), "AddContactLog");
        }
    }
}
