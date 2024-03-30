package X;

/* renamed from: X.0wA  reason: invalid class name and case insensitive filesystem */
public abstract class C19570wA {
    public static Object A00(Class cls, Object obj) {
        if (obj instanceof AnonymousClass003) {
            return cls.cast(obj);
        }
        if (obj instanceof C18700tb) {
            return A00(cls, ((C18700tb) obj).generatedComponent());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), AnonymousClass003.class, C18700tb.class}));
    }
}
