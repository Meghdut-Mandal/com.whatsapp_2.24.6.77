package X;

/* renamed from: X.8yE  reason: invalid class name and case insensitive filesystem */
public enum C187628yE {
    VOID(r6, r6, (Class) null),
    INT(r7, r8, 0),
    LONG(Long.TYPE, Long.class, C36411kG.A0t()),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, C90494aF.A0S()),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(r16, r16, ""),
    BYTE_STRING(r19, r19, C21673AUw.A00),
    ENUM(r7, r8, (Class) null),
    MESSAGE(r26, r26, (Class) null);
    
    public final Class zzk;
    public final Class zzl;
    public final Object zzm;

    /* access modifiers changed from: public */
    C187628yE(Class cls, Class cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }
}
