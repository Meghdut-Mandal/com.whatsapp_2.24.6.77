package X;

import java.util.Set;

/* renamed from: X.9W6  reason: invalid class name */
public final class AnonymousClass9W6 {
    public final int A00;
    public final int A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9W6) {
                AnonymousClass9W6 r5 = (AnonymousClass9W6) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + this.A01) * 31) + this.A00;
    }

    public AnonymousClass9W6(Set set, int i, int i2) {
        this.A02 = set;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CatalogVariantsRequestData(variantRequestInfoTypes=");
        A0u.append(this.A02);
        A0u.append(", variantThumbnailWidth=");
        A0u.append(this.A01);
        A0u.append(", variantThumbnailHeight=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
