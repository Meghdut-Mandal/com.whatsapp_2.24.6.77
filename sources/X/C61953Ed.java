package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ed  reason: invalid class name and case insensitive filesystem */
public final class C61953Ed {
    public final int A00;
    public final int A01;
    public final UserJid A02;
    public final boolean A03;
    public final boolean A04;

    public C61953Ed(C65663Sz r2, boolean z) {
        AnonymousClass00C.A0D(r2, 1);
        this.A04 = z;
        UserJid userJid = r2.A09;
        AnonymousClass00C.A08(userJid);
        this.A02 = userJid;
        this.A00 = r2.A02();
        this.A01 = r2.A03();
        this.A03 = r2.A0C();
    }

    public final boolean A00() {
        if (this.A00 <= 0 || this.A04 || this.A03) {
            return false;
        }
        return true;
    }
}
