package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165617ti;

public final class zzci {
    public static final zzci zza = new zzci();

    public static final Class zza(Object obj) {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int A0I = AnonymousClass000.A0I(obj);
            if (A0I == 1) {
                cls = Integer.TYPE;
            } else if (A0I == 2) {
                cls = Short.TYPE;
            } else if (A0I == 3) {
                cls = Byte.TYPE;
            } else if (A0I == 4) {
                cls = Long.TYPE;
            } else if (A0I == 5) {
                cls = Character.TYPE;
            } else if (A0I == 6) {
                cls = Float.TYPE;
            } else if (A0I == 7) {
                cls = Double.TYPE;
            } else if (A0I == 8) {
                cls = Boolean.TYPE;
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls;
            }
            throw C165617ti.A0E((Throwable) null, 4, 6);
        } else if (obj instanceof String) {
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                if (zzcb.zzb(str)) {
                    return cls2;
                }
                throw C165617ti.A0E((Throwable) null, 6, 47);
            } catch (Exception e) {
                throw C165617ti.A0E(e, 6, 8);
            }
        } else {
            throw C165617ti.A0E((Throwable) null, 4, 5);
        }
    }
}
