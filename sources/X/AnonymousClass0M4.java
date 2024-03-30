package X;

/* renamed from: X.0M4  reason: invalid class name */
public final class AnonymousClass0M4 extends AnonymousClass0M5 {
    public final int zzc;

    public final int A02() {
        return this.zzc;
    }

    public final byte A01(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0r("Index < 0: ", A0u, i));
        }
        A0u.append("Index > length: ");
        A0u.append(i);
        throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0r(", ", A0u, i2));
    }

    public AnonymousClass0M4(byte[] bArr, int i) {
        super(bArr);
        C10960fV.A00(0, i, bArr.length);
        this.zzc = i;
    }
}
