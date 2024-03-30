package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class zzle extends AbstractMap {
    public final int zza;
    public List zzb = Collections.emptyList();
    public Map zzc = Collections.emptyMap();
    public boolean zzd;
    public volatile zzlc zze;
    public Map zzf = Collections.emptyMap();

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this != obj) {
            if (!(obj instanceof zzle)) {
                return super.equals(obj);
            }
            zzle zzle = (zzle) obj;
            int size = size();
            if (size == zzle.size()) {
                int size2 = this.zzb.size();
                if (size2 == zzle.zzb.size()) {
                    int i = 0;
                    while (i < size2) {
                        if (zzg(i).equals(zzle.zzg(i))) {
                            i++;
                        }
                    }
                    if (size2 != size) {
                        obj2 = this.zzc;
                        obj3 = zzle.zzc;
                    }
                } else {
                    obj2 = entrySet();
                    obj3 = zzle.entrySet();
                }
                return obj2.equals(obj3);
            }
            return false;
        }
        return true;
    }

    public final boolean zzj() {
        return this.zzd;
    }

    private final int zzk(Comparable comparable) {
        int i;
        int A07 = C36431kI.A07(this.zzb);
        int i2 = 0;
        if (A07 < 0) {
            i = i2 + 1;
        } else {
            int compareTo = comparable.compareTo(((zzky) this.zzb.get(A07)).zzb);
            if (compareTo > 0) {
                i = A07 + 2;
            } else if (compareTo == 0) {
                return A07;
            } else {
                do {
                    int i3 = (i2 + A07) / 2;
                    int compareTo2 = comparable.compareTo(((zzky) this.zzb.get(i3)).zzb);
                    if (compareTo2 < 0) {
                        A07 = i3 - 1;
                        continue;
                    } else if (compareTo2 <= 0) {
                        return i3;
                    } else {
                        i2 = i3 + 1;
                        continue;
                    }
                } while (i2 <= A07);
                i = i2 + 1;
            }
        }
        return -i;
    }

    /* access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw AnonymousClass001.A0D();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzk(comparable) >= 0 || this.zzc.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzlc(this, (zzlb) null);
        }
        return this.zze;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzky) this.zzb.get(zzk)).getValue();
        }
        return this.zzc.get(comparable);
    }

    public final int hashCode() {
        int size = this.zzb.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = C36401kF.A02(this.zzb.get(i2), i);
        }
        if (this.zzc.size() > 0) {
            return C36401kF.A02(this.zzc, i);
        }
        return i;
    }

    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            if (this.zzf.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = unmodifiableMap2;
            this.zzd = true;
        }
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        if (this.zzc.isEmpty()) {
            return zzkx.zzb;
        }
        return this.zzc.entrySet();
    }

    public final Map.Entry zzg(int i) {
        return (Map.Entry) this.zzb.get(i);
    }

    public /* synthetic */ zzle(int i, zzld zzld) {
        this.zza = i;
    }

    /* access modifiers changed from: private */
    public final Object zzl(int i) {
        zzn();
        Object value = ((zzky) this.zzb.remove(i)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry A11 = AnonymousClass000.A11(it);
            list.add(new zzky(this, (Comparable) A11.getKey(), A11.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* renamed from: zze */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzky) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = C36441kJ.A14(this.zza);
        }
        int i = -(zzk + 1);
        if (i >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            zzky zzky = (zzky) this.zzb.remove(i2 - 1);
            zzm().put(zzky.zzb, zzky.getValue());
        }
        this.zzb.add(i, new zzky(this, comparable, obj));
        return null;
    }
}
