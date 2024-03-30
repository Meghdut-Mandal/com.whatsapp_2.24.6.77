package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9cc  reason: invalid class name and case insensitive filesystem */
public final class C197929cc {
    public final C194549Qe A00;
    public final C20810yC A01;
    public final C19970wo A02;
    public final AnonymousClass96S A03;

    public static final AnonymousClass96Q A00(AnonymousClass9TX r14, AnonymousClass1IJ r15, UserJid userJid) {
        C175418aS r0;
        AnonymousClass9YF r1;
        AnonymousClass9TX r02 = r14;
        C175448aV r3 = (C175448aV) r15.A09(userJid);
        if (r14 instanceof C175418aS) {
            r0 = (C175418aS) r02;
        } else {
            r0 = null;
        }
        if (r3 == null) {
            if (r0 == null) {
                return C175488aZ.A00;
            }
        } else if (r0 == null || AnonymousClass00C.A0J(r0.A02, r3.A01.A02)) {
            r0 = r3.A01;
            r1 = r3.A02;
            return new C175438aU(C36441kJ.A19(r0, r1));
        }
        r1 = new AnonymousClass9YF(0, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        return new C175438aU(C36441kJ.A19(r0, r1));
    }

    public C197929cc(C19970wo r1, C194549Qe r2, AnonymousClass96S r3, C20810yC r4) {
        C36321k7.A0x(r1, r4);
        this.A02 = r1;
        this.A01 = r4;
        this.A03 = r3;
        this.A00 = r2;
    }
}
