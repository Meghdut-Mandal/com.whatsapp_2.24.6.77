package X;

/* renamed from: X.5YX  reason: invalid class name */
public abstract class AnonymousClass5YX {
    public static final String A00(Class cls) {
        AnonymousClass00C.A0D(cls, 0);
        String name = cls.getName();
        String simpleName = cls.getSimpleName();
        if (simpleName.length() >= 5) {
            return simpleName;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("<cls>");
        A0u.append(name);
        return AnonymousClass000.A0q("</cls>", A0u);
    }

    public static String A01(Object obj) {
        return A00(obj.getClass());
    }
}
