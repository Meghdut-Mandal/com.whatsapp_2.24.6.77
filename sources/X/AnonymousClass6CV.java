package X;

/* renamed from: X.6CV  reason: invalid class name */
public final class AnonymousClass6CV {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C135066c4 A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CV) {
                AnonymousClass6CV r5 = (AnonymousClass6CV) obj;
                if (!(AnonymousClass00C.A0J(this.A03, r5.A03) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A03) + C36341k9.A01(this.A00 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass6CV(C135066c4 r2, boolean z) {
        boolean A1V = C36371kC.A1V(r2);
        this.A03 = r2;
        this.A00 = A1V;
        this.A01 = A1V;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerPreviewItem(sticker=");
        A0u.append(this.A03);
        A0u.append(", isLoading=");
        A0u.append(this.A00);
        A0u.append(", isPreviewImageLoaded=");
        A0u.append(this.A01);
        A0u.append(", isStarred=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
