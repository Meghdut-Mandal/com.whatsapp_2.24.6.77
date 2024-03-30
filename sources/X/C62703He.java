package X;

/* renamed from: X.3He  reason: invalid class name and case insensitive filesystem */
public final class C62703He {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C62703He) && AnonymousClass00C.A0J(this.A00, ((C62703He) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C62703He(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BanStatusResponse(banStatus=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
