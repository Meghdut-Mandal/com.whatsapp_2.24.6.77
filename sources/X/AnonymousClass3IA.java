package X;

/* renamed from: X.3IA  reason: invalid class name */
public final class AnonymousClass3IA {
    public final C51942od A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IA) {
                AnonymousClass3IA r5 = (AnonymousClass3IA) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass3IA(C51942od r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ErrorUiState(errorUiCase=");
        A0u.append(this.A00);
        A0u.append(", errorProtocolCode=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
