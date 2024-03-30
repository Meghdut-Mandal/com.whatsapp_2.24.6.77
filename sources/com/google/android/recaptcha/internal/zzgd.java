package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class zzgd {
    public static final Map zza;
    public static final Map zzb;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        Class cls = Boolean.TYPE;
        Class<Boolean> cls2 = Boolean.class;
        linkedHashMap.put(cls, cls2);
        linkedHashMap2.put(cls2, cls);
        Class cls3 = Byte.TYPE;
        Class<Byte> cls4 = Byte.class;
        linkedHashMap.put(cls3, cls4);
        linkedHashMap2.put(cls4, cls3);
        Class cls5 = Character.TYPE;
        Class<Character> cls6 = Character.class;
        linkedHashMap.put(cls5, cls6);
        linkedHashMap2.put(cls6, cls5);
        Class cls7 = Double.TYPE;
        Class<Double> cls8 = Double.class;
        linkedHashMap.put(cls7, cls8);
        linkedHashMap2.put(cls8, cls7);
        Class cls9 = Float.TYPE;
        Class<Float> cls10 = Float.class;
        linkedHashMap.put(cls9, cls10);
        linkedHashMap2.put(cls10, cls9);
        Class cls11 = Integer.TYPE;
        Class<Integer> cls12 = Integer.class;
        linkedHashMap.put(cls11, cls12);
        linkedHashMap2.put(cls12, cls11);
        Class cls13 = Long.TYPE;
        Class<Long> cls14 = Long.class;
        linkedHashMap.put(cls13, cls14);
        linkedHashMap2.put(cls14, cls13);
        Class cls15 = Short.TYPE;
        Class<Short> cls16 = Short.class;
        linkedHashMap.put(cls15, cls16);
        linkedHashMap2.put(cls16, cls15);
        Class cls17 = Void.TYPE;
        Class<Void> cls18 = Void.class;
        linkedHashMap.put(cls17, cls18);
        linkedHashMap2.put(cls18, cls17);
        zza = Collections.unmodifiableMap(linkedHashMap);
        zzb = Collections.unmodifiableMap(linkedHashMap2);
    }

    public static Class zza(Class cls) {
        Objects.requireNonNull(cls);
        Class cls2 = (Class) zza.get(cls);
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    public static void zzb(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
