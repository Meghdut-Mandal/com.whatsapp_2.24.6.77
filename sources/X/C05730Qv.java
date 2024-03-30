package X;

/* renamed from: X.0Qv  reason: invalid class name and case insensitive filesystem */
public abstract class C05730Qv {
    public static final String A00(C023509x r3) {
        Object obj;
        if (r3 instanceof AnonymousClass0AD) {
            return r3.toString();
        }
        try {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(r3);
            A0u.append('@');
            AnonymousClass000.A1B(r3, A0u);
            obj = A0u.toString();
        } catch (Throwable th) {
            obj = new AnonymousClass03N(th);
        }
        if (AnonymousClass0AK.A00(obj) != null) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append(AnonymousClass000.A0k(r3));
            A0u2.append('@');
            AnonymousClass000.A1B(r3, A0u2);
            obj = A0u2.toString();
        }
        return (String) obj;
    }
}
