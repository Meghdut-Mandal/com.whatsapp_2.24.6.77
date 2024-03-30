package X;

import java.io.Serializable;

/* renamed from: X.0fK  reason: invalid class name and case insensitive filesystem */
public final class C10850fK implements Serializable {
    public static final long serialVersionUID = 0;
    public final Class c;

    public C10850fK(Enum[] enumArr) {
        AnonymousClass00C.A0D(enumArr, 1);
        Class<?> componentType = enumArr.getClass().getComponentType();
        AnonymousClass00C.A0B(componentType);
        this.c = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.c.getEnumConstants();
        AnonymousClass00C.A08(enumConstants);
        return C000900k.A00((Enum[]) enumConstants);
    }
}
