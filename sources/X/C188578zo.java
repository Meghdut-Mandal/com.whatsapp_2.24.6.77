package X;

/* renamed from: X.8zo  reason: invalid class name and case insensitive filesystem */
public enum C188578zo {
    VOID(r5, r5, (Class) null),
    INT(r6, r7, 0),
    LONG(Long.TYPE, Long.class, C36411kG.A0t()),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, C90494aF.A0S()),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(r15, r15, ""),
    BYTE_STRING(r16, r16, C21674AUx.A00),
    ENUM(r6, r7, (Class) null),
    MESSAGE(r25, r25, (Class) null);
    
    public final Class boxedType;
    public final Object defaultDefault;
    public final Class type;

    /* access modifiers changed from: public */
    C188578zo(Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }
}
