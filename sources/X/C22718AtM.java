package X;

/* renamed from: X.AtM  reason: case insensitive filesystem */
public abstract class C22718AtM extends AZr {
    public static void A00(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            C165587tf.A1T(bArr, (((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1, b & 254, i);
        }
    }
}
