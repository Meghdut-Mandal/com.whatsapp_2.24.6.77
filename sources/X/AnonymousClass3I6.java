package X;

/* renamed from: X.3I6  reason: invalid class name */
public final class AnonymousClass3I6 {
    public final long A00;
    public final AnonymousClass11F A01;

    public AnonymousClass3I6(AnonymousClass11F r2, long j) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3I6) {
                AnonymousClass3I6 r8 = (AnonymousClass3I6) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ConversationInfo(jid=");
        A0u.append(this.A01);
        A0u.append(", timestampMillis=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
