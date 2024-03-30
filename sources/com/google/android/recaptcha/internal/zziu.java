package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import X.C165597tg;
import X.C165617ti;
import X.C36381kD;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class zziu extends zzgh implements zziy, zzkm, RandomAccess {
    public static final zziu zza = new zziu(new int[0], 0, false);
    public int[] zzb;
    public int zzc;

    public static zziu zzf() {
        return zza;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zziu)) {
                return super.equals(obj);
            }
            zziu zziu = (zziu) obj;
            int i = this.zzc;
            if (i == zziu.zzc) {
                int[] iArr = zziu.zzb;
                int i2 = 0;
                while (i2 < i) {
                    if (this.zzb[i2] == iArr[i2]) {
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
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    public final int size() {
        return this.zzc;
    }

    private final String zzh(int i) {
        return C165567td.A0Z(AnonymousClass000.A0u(), i, this.zzc);
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.zzc) {
            throw C165617ti.A0W(zzh(i));
        }
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int A0I = AnonymousClass000.A0I(obj);
            int i = this.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.zzb[i2] == A0I) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= this.zzc) {
            return new zziu(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw C165617ti.A0U();
    }

    public zziu(int[] iArr, int i, boolean z) {
        super(z);
        this.zzb = iArr;
        this.zzc = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int A0I = AnonymousClass000.A0I(obj);
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw C165617ti.A0W(zzh(i));
        }
        int i3 = i + 1;
        int[] iArr = this.zzb;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] A1X = C165597tg.A1X(iArr, i2 * 3, i);
            System.arraycopy(this.zzb, i, A1X, i3, this.zzc - i);
            this.zzb = A1X;
        }
        this.zzb[i] = A0I;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzjc.zza;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zziu)) {
            return super.addAll(collection);
        }
        zziu zziu = (zziu) collection;
        int i = zziu.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzb;
            if (i3 > iArr.length) {
                iArr = Arrays.copyOf(iArr, i3);
                this.zzb = iArr;
            }
            System.arraycopy(zziu.zzb, 0, iArr, this.zzc, zziu.zzc);
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
        zzi(i);
        return Integer.valueOf(this.zzb[i]);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzi(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        C165567td.A1J(iArr, this.zzc, i);
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i2, iArr, i, this.zzc - i2);
            this.zzc -= i2 - i;
            this.modCount++;
            return;
        }
        throw C165617ti.A0W("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        zza();
        zzi(i);
        int[] iArr = this.zzb;
        int i2 = iArr[i];
        iArr[i] = A0I;
        return Integer.valueOf(i2);
    }

    public final int zze(int i) {
        zzi(i);
        return this.zzb[i];
    }

    public final void zzg(int i) {
        zza();
        int i2 = this.zzc;
        int[] iArr = this.zzb;
        if (i2 == iArr.length) {
            iArr = C165597tg.A1X(iArr, i2 * 3, i2);
            this.zzb = iArr;
        }
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        iArr[i3] = i;
    }

    public zziu() {
        this(new int[10], 0, true);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(AnonymousClass000.A0I(obj));
        return true;
    }
}
