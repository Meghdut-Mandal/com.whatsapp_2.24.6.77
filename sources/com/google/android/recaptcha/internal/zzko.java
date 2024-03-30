package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import X.C165617ti;
import java.util.Arrays;
import java.util.RandomAccess;

public final class zzko extends zzgh implements RandomAccess {
    public static final zzko zza = new zzko(new Object[0], 0, false);
    public Object[] zzb;
    public int zzc;

    public static zzko zze() {
        return zza;
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

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= this.zzc) {
            return new zzko(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw C165617ti.A0U();
    }

    public zzko(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzb = objArr;
        this.zzc = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw C165617ti.A0W(zzf(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.zzb;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.zzb, i, objArr2, i3, this.zzc - i);
            this.zzb = objArr2;
        }
        this.zzb[i] = obj;
        this.zzc++;
        this.modCount++;
    }

    public final Object get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    public final Object remove(int i) {
        zza();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj = objArr[i];
        C165567td.A1J(objArr, this.zzc, i);
        this.zzc--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        zza();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public zzko() {
        this(new Object[10], 0, true);
    }

    public final boolean add(Object obj) {
        zza();
        int i = this.zzc;
        Object[] objArr = this.zzb;
        if (i == objArr.length) {
            objArr = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
            this.zzb = objArr;
        }
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        objArr[i2] = obj;
        this.modCount++;
        return true;
    }
}
