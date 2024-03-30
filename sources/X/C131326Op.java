package X;

/* renamed from: X.6Op  reason: invalid class name and case insensitive filesystem */
public final class C131326Op {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C131326Op) && this.A00 == ((C131326Op) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C131326Op(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerAnimationData(firstFrameLength=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C131326Op() {
        this(-1);
    }
}
