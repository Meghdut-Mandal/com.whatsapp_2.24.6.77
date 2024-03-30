package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C36371kC;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class zzjy extends LinkedHashMap {
    public static final zzjy zza;
    public boolean zzb = true;

    public static zzjy zza() {
        return zza;
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zze() {
        return this.zzb;
    }

    static {
        zzjy zzjy = new zzjy();
        zza = zzjy;
        zzjy.zzb = false;
    }

    public static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            int i = r3;
            Charset charset = zzjc.zza;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof zziv)) {
            return obj.hashCode();
        } else {
            throw AnonymousClass001.A0D();
        }
    }

    private final void zzg() {
        if (!this.zzb) {
            throw AnonymousClass001.A0D();
        }
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator A10 = C36371kC.A10(this);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (!map.containsKey(A11.getKey())) {
                return false;
            }
            Object value = A11.getValue();
            Object obj2 = map.get(A11.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                equals = value.equals(obj2);
                continue;
            } else {
                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    public zzjy(Map map) {
        super(map);
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final int hashCode() {
        Iterator A10 = C36371kC.A10(this);
        int i = 0;
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            i += zzf(A11.getValue()) ^ zzf(A11.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        Charset charset = zzjc.zza;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            Object next = A10.next();
            Charset charset = zzjc.zza;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzjy zzb() {
        zzjy zzjy;
        if (isEmpty()) {
            return zzjy;
        }
        zzjy = new zzjy(this);
        return zzjy;
    }

    public final void zzd(zzjy zzjy) {
        zzg();
        if (!zzjy.isEmpty()) {
            putAll(zzjy);
        }
    }

    public zzjy() {
    }
}
