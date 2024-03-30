package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165617ti;
import X.C36441kJ;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgw implements Iterable, Serializable {
    public static final Comparator zza = new zzgo();
    public static final zzgw zzb = new zzgt(zzjc.zzd);
    public static final zzgv zzd = new zzgv((zzgu) null);
    public int zzc = 0;

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new zzgn(this);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzgw zzg(int i, int i2);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzgm zzgm);

    public abstract boolean zzj();

    public final int zzl() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }

    public static int zzk(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i < 0) {
            A0u.append("Beginning index: ");
            A0u.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0q(" < 0", A0u));
        } else if (i2 < i) {
            A0u.append("Beginning index larger than ending index: ");
            A0u.append(i);
            throw C165617ti.A0W(AnonymousClass000.A0r(", ", A0u, i2));
        } else {
            A0u.append("End index: ");
            A0u.append(i2);
            throw C165617ti.A0W(AnonymousClass000.A0r(" >= ", A0u, i3));
        }
    }

    public static zzgw zzm(byte[] bArr, int i, int i2) {
        zzk(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgt(bArr2);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1Q = C36441kJ.A1Q();
        A1Q[0] = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        AnonymousClass000.A1K(A1Q, zzd2);
        if (zzd2 <= 50) {
            concat = zzlg.zza(this);
        } else {
            concat = zzlg.zza(zzg(0, 47)).concat("...");
        }
        A1Q[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1Q);
    }

    public final byte[] zzo() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzjc.zzd;
        }
        byte[] bArr = new byte[zzd2];
        System.arraycopy(((zzgt) this).zza, 0, bArr, 0, zzd2);
        return bArr;
    }
}
