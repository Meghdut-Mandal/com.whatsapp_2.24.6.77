package X;

/* renamed from: X.5IG  reason: invalid class name */
public final class AnonymousClass5IG extends C111375cB {
    public final C125415zs A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IG) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5IG(C125415zs r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarStickerCategory(avatarCategory=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
