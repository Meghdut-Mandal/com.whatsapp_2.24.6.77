package X;

/* renamed from: X.0fS  reason: invalid class name and case insensitive filesystem */
public abstract class C10930fS implements Comparable {
    public int A01() {
        return 0;
    }

    public abstract int A02();

    public static final C10930fS A00(C10930fS r2, Class cls) {
        if (cls.isInstance(r2)) {
            return (C10930fS) cls.cast(r2);
        }
        String name = cls.getName();
        String A0k = AnonymousClass000.A0k(r2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Expected a ");
        A0u.append(name);
        throw new AnonymousClass0O6(AnonymousClass000.A0p(" value, but got ", A0k, A0u));
    }
}
