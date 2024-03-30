package X;

/* renamed from: X.2fY  reason: invalid class name and case insensitive filesystem */
public final class C47742fY extends AnonymousClass3FV {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47742fY) && this.A00 == ((C47742fY) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C47742fY(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoveOption(fromRecent=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
