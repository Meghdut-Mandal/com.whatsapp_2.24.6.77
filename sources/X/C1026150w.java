package X;

/* renamed from: X.50w  reason: invalid class name and case insensitive filesystem */
public final class C1026150w extends C125335zk {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1026150w) {
                C1026150w r5 = (C1026150w) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + 393671415;
    }

    public C1026150w(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PostImages(productImageWidth=");
        A0u.append(this.A01);
        A0u.append(", productImageHeight=");
        A0u.append(this.A00);
        A0u.append(", fieldName=");
        return C36321k7.A0E("post_images", A0u);
    }
}
