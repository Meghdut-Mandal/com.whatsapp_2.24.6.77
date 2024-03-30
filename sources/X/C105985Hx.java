package X;

/* renamed from: X.5Hx  reason: invalid class name and case insensitive filesystem */
public final class C105985Hx extends C108685Um {
    public final String newRevision;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C105985Hx) && AnonymousClass00C.A0J(this.newRevision, ((C105985Hx) obj).newRevision));
    }

    public int hashCode() {
        return this.newRevision.hashCode();
    }

    public C105985Hx(String str) {
        super("Revision outdated");
        this.newRevision = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RevisionOutdated(newRevision=");
        return C36321k7.A0E(this.newRevision, A0u);
    }
}
