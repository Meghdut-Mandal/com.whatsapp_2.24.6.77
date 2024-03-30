package com.google.android.recaptcha.internal;

import X.C36411kG;
import X.C90494aF;

public enum zzjf {
    VOID(r6, r6, (Class) null),
    INT(r7, r8, 0),
    LONG(Long.TYPE, Long.class, C36411kG.A0t()),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, C90494aF.A0S()),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(r16, r16, ""),
    BYTE_STRING(r19, r19, zzgw.zzb),
    ENUM(r7, r8, (Class) null),
    MESSAGE(r26, r26, (Class) null);
    
    public final Class zzl;
    public final Class zzm;
    public final Object zzn;

    public final Class zza() {
        return this.zzm;
    }

    /* access modifiers changed from: public */
    zzjf(Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }
}
