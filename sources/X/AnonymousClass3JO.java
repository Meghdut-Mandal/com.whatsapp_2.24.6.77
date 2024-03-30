package X;

/* renamed from: X.3JO  reason: invalid class name */
public final class AnonymousClass3JO {
    public final AnonymousClass11F A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JO) {
                AnonymousClass3JO r5 = (AnonymousClass3JO) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass3JO(AnonymousClass11F r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ReplyRenderParams(currentConversationJid=");
        A0u.append(this.A00);
        A0u.append(", isCurrentMessageFromMe=");
        A0u.append(this.A01);
        A0u.append(", isEpnEligibleSurface=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
