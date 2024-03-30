package X;

/* renamed from: X.50x  reason: invalid class name and case insensitive filesystem */
public final class C1026250x extends C125335zk {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1026250x) {
                C1026250x r5 = (C1026250x) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) - 275245112;
    }

    public C1026250x(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProductImages(productImageWidth=");
        A0u.append(this.A01);
        A0u.append(", productImageHeight=");
        A0u.append(this.A00);
        A0u.append(", fieldName=");
        return C36321k7.A0E("product_images", A0u);
    }
}
