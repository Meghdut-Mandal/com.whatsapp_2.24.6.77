package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;

public final class zzgq extends zzgt {
    public final int zzc;

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i < 0) {
            throw C165567td.A0M("Index < 0: ", A0u, i);
        }
        A0u.append("Index > length: ");
        A0u.append(i);
        throw C165567td.A0M(", ", A0u, i2);
    }

    public final byte zzb(int i) {
        return this.zza[i];
    }

    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public zzgq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgw.zzk(0, i2, bArr.length);
        this.zzc = i2;
    }
}
