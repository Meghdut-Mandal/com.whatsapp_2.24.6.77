package X;

/* renamed from: X.691  reason: invalid class name */
public final class AnonymousClass691 {
    public final String A00;

    public AnonymousClass691(String str) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass691) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass691) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A02(-1, (C36421kH.A04(this.A00) + 1231) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PhoenixSessionConfig(sessionId=");
        A0u.append(this.A00);
        C90484aE.A1K(A0u, ", isResumable=");
        A0u.append(", ttl=");
        return C36331k8.A0j(A0u, -1);
    }
}
