package X;

/* renamed from: X.555  reason: invalid class name */
public final class AnonymousClass555 extends C110605aw {
    public final int A00;
    public final C135066c4 A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass555) {
                AnonymousClass555 r5 = (AnonymousClass555) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A01) * 31) + C36411kG.A09(this.A02)) * 31) + this.A00;
    }

    public AnonymousClass555(C135066c4 r1, Integer num, int i) {
        this.A01 = r1;
        this.A02 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OnStickerSelected(sticker=");
        A0u.append(this.A01);
        A0u.append(", stickerSendOrigin=");
        A0u.append(this.A02);
        A0u.append(", position=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
