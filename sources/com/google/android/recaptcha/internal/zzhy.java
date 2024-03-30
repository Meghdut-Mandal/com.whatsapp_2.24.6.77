package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import X.C165617ti;
import X.C36341k9;
import X.C36381kD;
import X.C90504aG;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class zzhy extends zzgh implements zzjb, zzkm, RandomAccess {
    public static final zzhy zza = new zzhy(new double[0], 0, false);
    public double[] zzb;
    public int zzc;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzhy)) {
                return super.equals(obj);
            }
            zzhy zzhy = (zzhy) obj;
            int i = this.zzc;
            if (i == zzhy.zzc) {
                double[] dArr = zzhy.zzb;
                int i2 = 0;
                while (i2 < i) {
                    if (Double.doubleToLongBits(this.zzb[i2]) == Double.doubleToLongBits(dArr[i2])) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            Charset charset = zzjc.zza;
            i = C36341k9.A02(Double.doubleToLongBits(this.zzb[i2]), i * 31);
        }
        return i;
    }

    public final int size() {
        return this.zzc;
    }

    private final String zzf(int i) {
        return C165567td.A0Z(AnonymousClass000.A0u(), i, this.zzc);
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            throw C165617ti.A0W(zzf(i));
        }
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double A01 = C90504aG.A01(obj);
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == A01) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= this.zzc) {
            return new zzhy(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw C165617ti.A0U();
    }

    public zzhy(double[] dArr, int i, boolean z) {
        super(z);
        this.zzb = dArr;
        this.zzc = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double A01 = C90504aG.A01(obj);
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw C165617ti.A0W(zzf(i));
        }
        int i3 = i + 1;
        double[] dArr = this.zzb;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzb, i, dArr2, i3, this.zzc - i);
            this.zzb = dArr2;
        }
        this.zzb[i] = A01;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzjc.zza;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzhy)) {
            return super.addAll(collection);
        }
        zzhy zzhy = (zzhy) collection;
        int i = zzhy.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzb;
            if (i3 > dArr.length) {
                dArr = Arrays.copyOf(dArr, i3);
                this.zzb = dArr;
            }
            System.arraycopy(zzhy.zzb, 0, dArr, this.zzc, zzhy.zzc);
            this.zzc = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return C36381kD.A1U(indexOf(obj), -1);
    }

    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.zzb[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        C165567td.A1J(dArr, this.zzc, i);
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i2, dArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw C165617ti.A0W("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double A01 = C90504aG.A01(obj);
        zza();
        zzg(i);
        double[] dArr = this.zzb;
        double d = dArr[i];
        dArr[i] = A01;
        return Double.valueOf(d);
    }

    public final void zze(double d) {
        zza();
        int i = this.zzc;
        double[] dArr = this.zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzb = dArr2;
            dArr = dArr2;
        }
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        dArr[i2] = d;
    }

    public zzhy() {
        this(new double[10], 0, true);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(C90504aG.A01(obj));
        return true;
    }
}
