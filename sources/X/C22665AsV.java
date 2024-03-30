package X;

import java.util.Arrays;

/* renamed from: X.AsV  reason: case insensitive filesystem */
public class C22665AsV extends AnonymousClass121 implements B0I {
    public byte[] A00;

    public C22665AsV(byte[] bArr) {
        this.A00 = AnonymousClass124.A02(bArr);
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(this.A00, 20, z);
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
        if (!(r3 instanceof C22665AsV)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22665AsV) r3).A00);
    }

    public String toString() {
        return AnonymousClass11q.A02(this.A00);
    }
}
