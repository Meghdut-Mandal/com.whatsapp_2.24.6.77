package X;

/* renamed from: X.3Iw  reason: invalid class name and case insensitive filesystem */
public final class C63133Iw {
    public final C608439o A00;
    public final AnonymousClass3FZ A01;
    public final AnonymousClass3SB A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63133Iw) {
                C63133Iw r5 = (C63133Iw) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A00)));
    }

    public C63133Iw(C608439o r1, AnonymousClass3FZ r2, AnonymousClass3SB r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CompanionDeviceAndKey(companionPairingData=");
        A0u.append(this.A00);
        A0u.append(", device=");
        A0u.append(this.A02);
        A0u.append(", identityPublicKey=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
