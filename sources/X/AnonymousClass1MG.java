package X;

/* renamed from: X.1MG  reason: invalid class name */
public class AnonymousClass1MG implements AnonymousClass04G {
    public final /* synthetic */ C225314u A00;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        AnonymousClass00C.A0D(cls, 1);
        return B3o(cls);
    }

    public AnonymousClass1MG(C225314u r1) {
        this.A00 = r1;
    }

    public AnonymousClass04R B3o(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass1MH.class)) {
            return new AnonymousClass1MH();
        }
        throw new IllegalArgumentException("Invalid UIModeViewModel for DialogActivity");
    }
}
