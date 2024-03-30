package X;

/* renamed from: X.89i  reason: invalid class name and case insensitive filesystem */
public final class C1694789i extends AnonymousClass95B {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1694789i) && this.A00 == ((C1694789i) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C1694789i(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SupportedConfigurationUpdateRequest(videoQuality=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
