package X;

/* renamed from: X.6iB  reason: invalid class name and case insensitive filesystem */
public class C138486iB implements AnonymousClass04G {
    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }

    public AnonymousClass04R B3o(Class cls) {
        Class<C95514le> cls2 = C95514le.class;
        if (cls.equals(cls2)) {
            return new C95514le();
        }
        Class<C95464l7> cls3 = C95464l7.class;
        if (cls.equals(cls3)) {
            return new C95464l7();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Model class must be one of: [");
        C90474aD.A1L(A0u, cls2.getCanonicalName());
        A0u.append(cls3.getCanonicalName());
        throw AnonymousClass000.A0c("]", A0u);
    }
}
