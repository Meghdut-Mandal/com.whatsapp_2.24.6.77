package X;

/* renamed from: X.3Hd  reason: invalid class name and case insensitive filesystem */
public final class C62693Hd {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C62693Hd) && AnonymousClass00C.A0J(this.A00, ((C62693Hd) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C62693Hd(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountLinkingAuthBlobResult(authBlob=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
