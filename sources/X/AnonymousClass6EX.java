package X;

/* renamed from: X.6EX  reason: invalid class name */
public final class AnonymousClass6EX {
    public int A00;
    public final int A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6EX) {
                AnonymousClass6EX r5 = (AnonymousClass6EX) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C128326Bu A00(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        } else if (i == Integer.MIN_VALUE) {
            throw AnonymousClass001.A09("Item.end should be set first");
        }
        return new C128326Bu(this.A02, "", this.A01, i);
    }

    public int hashCode() {
        return (((C36391kE.A0A(this.A02) + this.A01) * 31) + this.A00) * 31;
    }

    public AnonymousClass6EX(Object obj, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutableRange(item=");
        A0u.append(this.A02);
        A0u.append(", start=");
        A0u.append(this.A01);
        A0u.append(", end=");
        A0u.append(this.A00);
        A0u.append(", tag=");
        return C36321k7.A0E("", A0u);
    }
}
