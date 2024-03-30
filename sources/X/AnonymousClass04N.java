package X;

/* renamed from: X.04N  reason: invalid class name */
public class AnonymousClass04N implements AnonymousClass04G {
    public static AnonymousClass04N A00;
    public static final C003401n A01 = AnonymousClass04P.A00;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        AnonymousClass00C.A0D(cls, 1);
        return B3o(cls);
    }

    public AnonymousClass04R B3o(Class cls) {
        AnonymousClass00C.A0D(cls, 0);
        try {
            Object newInstance = cls.newInstance();
            AnonymousClass00C.A08(newInstance);
            return (AnonymousClass04R) newInstance;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        }
    }
}
