package X;

/* renamed from: X.3p0  reason: invalid class name and case insensitive filesystem */
public final class C76523p0 implements C236119d {
    public C62543Go A00;
    public final AnonymousClass19A A01;

    public void BWw(C203399nx r4, String str) {
        AnonymousClass00C.A0D(r4, 1);
        C203399nx A0c = r4.A0c("error");
        if (A0c != null) {
            C36321k7.A1S("error getting 1on1 invite code ", AnonymousClass000.A0u(), A0c.A0S("code", 0));
        }
        C62543Go r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void BiM(C203399nx r3, String str) {
        String A0x;
        AnonymousClass00C.A0D(r3, 1);
        C203399nx A0c = r3.A0c("invite");
        if (A0c == null || (A0x = C36391kE.A0x(A0c, "code")) == null) {
            C62543Go r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C62543Go r02 = this.A00;
        if (r02 != null) {
            r02.A01(A0x);
        }
    }

    public void BVN(String str) {
        C62543Go r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public C76523p0(AnonymousClass19A r1) {
        this.A01 = r1;
    }
}
