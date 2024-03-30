package X;

/* renamed from: X.3Hs  reason: invalid class name and case insensitive filesystem */
public final class C62833Hs {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62833Hs) {
                C62833Hs r5 = (C62833Hs) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A0H(this.A01);
    }

    public C62833Hs(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunityParticipantsState(state=");
        A0u.append(this.A00);
        A0u.append(", communityParticipantSize=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
