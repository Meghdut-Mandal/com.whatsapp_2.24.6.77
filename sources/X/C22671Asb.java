package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.Asb  reason: case insensitive filesystem */
public class C22671Asb extends AnonymousClass121 implements B0I {
    public final byte[] A00;

    public C22671Asb(byte[] bArr) {
        this.A00 = bArr;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 22, z);
    }

    public boolean A0E() {
        return false;
    }

    public String BHz() {
        return AnonymousClass11q.A02(this.A00);
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public static C22671Asb A01(Object obj) {
        if (obj == null || (obj instanceof C22671Asb)) {
            return (C22671Asb) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C22671Asb) AnonymousClass121.A00((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                throw AnonymousClass000.A0c(C90494aF.A0c(e, "encoding error in getInstance: ", A0u), A0u);
            }
        } else {
            throw C165567td.A0N(obj, "illegal object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public int A0A() {
        return C165587tf.A08(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22671Asb)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22671Asb) r3).A00);
    }

    public String toString() {
        return AnonymousClass11q.A02(this.A00);
    }

    public C22671Asb(String str) {
        Objects.requireNonNull(str, "'string' cannot be null");
        this.A00 = AnonymousClass11q.A03(str);
    }
}
