package com.google.android.recaptcha.internal;

public enum zzmb {
    DOUBLE(zzmc.DOUBLE, 1),
    FLOAT(zzmc.FLOAT, 5),
    INT64(r1, 0),
    UINT64(r1, 0),
    INT32(r2, 0),
    FIXED64(r1, 1),
    FIXED32(r2, 5),
    BOOL(zzmc.BOOLEAN, 0),
    STRING(zzmc.STRING, 2),
    GROUP(r6, 3),
    MESSAGE(r6, 2),
    BYTES(zzmc.BYTE_STRING, 2),
    UINT32(r2, 0),
    ENUM(zzmc.ENUM, 0),
    SFIXED32(r2, 5),
    SFIXED64(r1, 1),
    SINT32(r2, 0),
    SINT64(r1, 0);
    
    public final zzmc zzt;

    public final zzmc zza() {
        return this.zzt;
    }

    /* access modifiers changed from: public */
    zzmb(zzmc zzmc, int i) {
        this.zzt = zzmc;
    }
}
