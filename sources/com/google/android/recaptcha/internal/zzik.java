package com.google.android.recaptcha.internal;

public enum zzik {
    FLOAT(1, 1, r0);
    
    public static final zzik[] zzZ = null;
    public final zzjf zzab;
    public final int zzac;
    public final Class zzad;

    public final int zza() {
        return this.zzac;
    }

    /* access modifiers changed from: public */
    static {
        zzik[] zzikArr = new zzik[r4];
        zzZ = zzikArr;
        for (zzik zzik : values()) {
            zzikArr[zzik.zzac] = zzik;
        }
    }

    /* access modifiers changed from: public */
    zzik(int i, int i2, zzjf zzjf) {
        Class zza2;
        this.zzac = i;
        this.zzab = zzjf;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zza2 = zzjf.zza();
        } else {
            zza2 = null;
        }
        this.zzad = zza2;
        if (i2 == 1) {
            zzjf zzjf2 = zzjf.VOID;
        }
    }
}
