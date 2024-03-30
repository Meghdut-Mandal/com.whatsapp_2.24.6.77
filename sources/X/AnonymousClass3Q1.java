package X;

/* renamed from: X.3Q1  reason: invalid class name */
public final class AnonymousClass3Q1 {
    public final long A00;
    public final Boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q1) {
                AnonymousClass3Q1 r8 = (AnonymousClass3Q1) obj;
                if (!(AnonymousClass00C.A0J(this.A01, r8.A01) && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A00, AnonymousClass000.A0H(this.A01) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass3Q1(Boolean bool, long j, boolean z) {
        this.A01 = bool;
        this.A00 = j;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LidChatState(isPhoneNumberShared=");
        A0u.append(this.A01);
        A0u.append(", phoneRequestedTimeMs=");
        A0u.append(this.A00);
        A0u.append(", isDuplicateThread=");
        return C36321k7.A0H(A0u, this.A02);
    }

    public AnonymousClass3Q1() {
        this((Boolean) null, 0, false);
    }
}
