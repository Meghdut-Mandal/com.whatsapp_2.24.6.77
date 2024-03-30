package X;

/* renamed from: X.0Ms  reason: invalid class name and case insensitive filesystem */
public final class C04970Ms extends C04980Mt {
    public final int zzc;
    public final int zzd;

    public final int A04() {
        return this.zzd;
    }

    public final int A06() {
        return this.zzc;
    }

    public final byte A02(int i) {
        int i2 = this.zzd;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[this.zzc + i];
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0r("Index < 0: ", A0u, i));
        }
        A0u.append("Index > length: ");
        A0u.append(i);
        throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0r(", ", A0u, i2));
    }

    public final byte A03(int i) {
        return this.zza[this.zzc + i];
    }

    public C04970Ms(byte[] bArr, int i, int i2) {
        super(bArr);
        C10970fW.A00(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }
}
