package X;

/* renamed from: X.3IX  reason: invalid class name */
public final class AnonymousClass3IX {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IX) {
                AnonymousClass3IX r5 = (AnonymousClass3IX) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass3IX(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ImageDimension(mediaWidth=");
        A0u.append(this.A01);
        A0u.append(", mediaHeight=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
