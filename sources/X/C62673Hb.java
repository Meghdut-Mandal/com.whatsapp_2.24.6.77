package X;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
public final class C62673Hb {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C62673Hb) && this.A00 == ((C62673Hb) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public C62673Hb(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DataSharingDisclosureMetadata(showMarketingMessageDisclosure=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
