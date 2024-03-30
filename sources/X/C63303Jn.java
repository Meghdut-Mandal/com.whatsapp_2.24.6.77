package X;

/* renamed from: X.3Jn  reason: invalid class name and case insensitive filesystem */
public final class C63303Jn {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63303Jn) {
                C63303Jn r5 = (C63303Jn) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((C36341k9.A01(this.A00 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public C63303Jn(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A02 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChatMessageCountsFMessageMetadata(isSent=");
        A0u.append(this.A00);
        A0u.append(", isEphemeral=");
        A0u.append(this.A01);
        A0u.append(", isViewOnce=");
        A0u.append(this.A03);
        A0u.append(", isReply=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
