package X;

/* renamed from: X.9R8  reason: invalid class name */
public class AnonymousClass9R8 {
    public byte[] A00;
    public long[][] A01;

    public void A00(byte[] bArr) {
        long[][] jArr = this.A01;
        byte[] bArr2 = bArr;
        long[] jArr2 = jArr[bArr[15] & 255];
        long j = jArr2[0];
        long j2 = jArr2[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr3 = jArr[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr3[1];
            j = (((((j >>> 8) ^ jArr3[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        C202779me.A03(bArr2, 0, j);
        C202779me.A03(bArr2, 8, j2);
    }
}
