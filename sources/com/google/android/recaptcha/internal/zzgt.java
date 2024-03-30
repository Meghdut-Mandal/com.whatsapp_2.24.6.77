package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import java.nio.charset.Charset;
import java.util.Objects;

public class zzgt extends zzgs {
    public final byte[] zza;

    public final boolean equals(Object obj) {
        int zzd;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if ((obj instanceof zzgw) && (zzd = zzd()) == ((zzgw) obj).zzd()) {
            if (zzd == 0) {
                return true;
            }
            if (!(obj instanceof zzgt)) {
                return obj.equals(this);
            }
            zzgt zzgt = (zzgt) obj;
            int i2 = this.zzc;
            int i3 = zzgt.zzc;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                int zzd2 = zzgt.zzd();
                if (zzd > zzd2) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Length too large: ");
                    A0u.append(zzd);
                    throw C165567td.A0O(A0u, zzd);
                } else if (zzd <= zzd2) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgt.zza;
                    int i4 = 0;
                    while (i < zzd) {
                        if (bArr[i] != bArr2[i4]) {
                            return false;
                        }
                        i++;
                        i4++;
                    }
                    return true;
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Ran off end of other: 0, ");
                    A0u2.append(zzd);
                    throw AnonymousClass000.A0d(", ", A0u2, zzd2);
                }
            }
        }
        return false;
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public final int zzf(int i, int i2, int i3) {
        byte[] bArr = this.zza;
        Charset charset = zzjc.zza;
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public zzgt(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final zzgw zzg(int i, int i2) {
        int zzk = zzgw.zzk(0, i2, zzd());
        if (zzk == 0) {
            return zzgw.zzb;
        }
        return new zzgq(this.zza, 0, zzk);
    }

    public final void zzi(zzgm zzgm) {
        ((zzhe) zzgm).zzc(this.zza, 0, zzd());
    }

    public final boolean zzj() {
        return zzma.zzf(this.zza, 0, zzd());
    }
}
