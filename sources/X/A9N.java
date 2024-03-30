package X;

public final class A9N implements C16180ok {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof A9N) && this.A00 == ((A9N) obj).A00);
    }

    public int hashCode() {
        return C36341k9.A01(this.A00 ? 1 : 0);
    }

    public A9N(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductBottomSheetUiStateLoading(showVariantCarouselGlimmeringState=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
