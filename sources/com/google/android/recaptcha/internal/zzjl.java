package com.google.android.recaptcha.internal;

import X.C165617ti;
import X.C36441kJ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzjl extends zzgh implements zzjm, RandomAccess {
    @Deprecated
    public static final zzjm zza;
    public static final zzjl zzb;
    public final List zzc;

    static {
        zzjl zzjl = new zzjl(false);
        zzb = zzjl;
        zza = zzjl;
    }

    public static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgw) {
            return ((zzgw) obj).zzn(zzjc.zzb);
        }
        return new String((byte[]) obj, zzjc.zzb);
    }

    public final int size() {
        return this.zzc.size();
    }

    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    /* renamed from: zzg */
    public final String get(int i) {
        String str;
        boolean zze;
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgw) {
            zzgw zzgw = (zzgw) obj;
            str = zzgw.zzn(zzjc.zzb);
            zze = zzgw.zzj();
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, zzjc.zzb);
            zze = zzma.zze(bArr);
        }
        if (zze) {
            this.zzc.set(i, str);
        }
        return str;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjl(int i) {
        super(true);
        ArrayList A14 = C36441kJ.A14(i);
        this.zzc = A14;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzjm) {
            collection = ((zzjm) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzj(this.zzc.set(i, obj));
    }

    public final /* bridge */ /* synthetic */ zzjb zzd(int i) {
        if (i >= size()) {
            ArrayList A14 = C36441kJ.A14(i);
            A14.addAll(this.zzc);
            return new zzjl(A14);
        }
        throw C165617ti.A0U();
    }

    public final zzjm zze() {
        if (zzc()) {
            return new zzlq(this);
        }
        return this;
    }

    public final void zzi(zzgw zzgw) {
        zza();
        this.zzc.add(zzgw);
        this.modCount++;
    }

    public zzjl(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public zzjl(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    public zzjl() {
        this(10);
    }
}
