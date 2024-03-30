package X;

/* renamed from: X.6BT  reason: invalid class name */
public final class AnonymousClass6BT {
    public final int A00;
    public final int A01;
    public final String A02;

    public AnonymousClass6BT(int i, int i2, String str) {
        AnonymousClass00C.A0D(str, 3);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BT) {
                AnonymousClass6BT r5 = (AnonymousClass6BT) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && AnonymousClass00C.A0J(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SampleSearchData(image=");
        A0u.append(this.A00);
        A0u.append(", prompt=");
        A0u.append(this.A01);
        A0u.append(", downloadableResourceId=");
        return C36321k7.A0E(this.A02, A0u);
    }
}
