package X;

/* renamed from: X.5Ij  reason: invalid class name and case insensitive filesystem */
public final class C106105Ij extends C111425cG {
    public final AnonymousClass68B A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C106105Ij) && AnonymousClass00C.A0J(this.A00, ((C106105Ij) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C106105Ij(AnonymousClass68B r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Available(stickerPack=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
