package X;

import java.util.Arrays;

/* renamed from: X.AsT  reason: case insensitive filesystem */
public class C22663AsT extends AnonymousClass121 implements B0I {
    public final byte[] A00;

    public C22663AsT(byte[] bArr) {
        this.A00 = bArr;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 27, z);
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

    public int A0A() {
        return C165587tf.A08(this.A00);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22663AsT)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22663AsT) r3).A00);
    }

    public String toString() {
        return AnonymousClass11q.A02(this.A00);
    }
}
