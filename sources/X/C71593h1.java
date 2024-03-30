package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3h1  reason: invalid class name and case insensitive filesystem */
public final class C71593h1 implements AnonymousClass4QC {
    public final AnonymousClass2aJ A00;
    public final AnonymousClass141 A01;

    public C71593h1(AnonymousClass2aJ r2, AnonymousClass141 r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean BMk() {
        UserJid A0l = C36351kA.A0l(this.A01);
        AnonymousClass2aJ r0 = this.A00;
        if (A0l == null || r0.A01(A0l) == null) {
            return false;
        }
        return true;
    }
}
