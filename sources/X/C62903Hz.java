package X;

/* renamed from: X.3Hz  reason: invalid class name and case insensitive filesystem */
public final class C62903Hz {
    public final AnonymousClass3T1 A00;
    public final C006302t A01;

    public C62903Hz(AnonymousClass3T1 r2, C006302t r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62903Hz) {
                C62903Hz r5 = (C62903Hz) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunityActivityUiState(lastActivityMessage=");
        A0u.append(this.A00);
        A0u.append(", onActivityClick=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
