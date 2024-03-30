package X;

import android.hardware.Camera;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.9W3  reason: invalid class name */
public class AnonymousClass9W3 {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9W3)) {
            return false;
        }
        AnonymousClass9W3 r4 = (AnonymousClass9W3) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public static void A00(AnonymousClass9W3 r2, StringBuilder sb) {
        sb.append(r2.A02);
        sb.append('x');
        sb.append(r2.A01);
    }

    public int hashCode() {
        int i = this.A01;
        int i2 = this.A02;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public AnonymousClass9W3(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i * i2;
    }

    public static void A01(AbstractCollection abstractCollection, List list, int i) {
        Camera.Size size = (Camera.Size) list.get(i);
        abstractCollection.add(new AnonymousClass9W3(size.width, size.height));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C90494aF.A1L(A0u, this.A02);
        return C36381kD.A10(A0u, this.A01);
    }
}
