package X;

/* renamed from: X.5IM  reason: invalid class name */
public final class AnonymousClass5IM extends C111385cC {
    public final C135066c4 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IM) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5IM(C135066c4 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OnDevice(sticker=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
