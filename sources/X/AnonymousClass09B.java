package X;

/* renamed from: X.09B  reason: invalid class name */
public final class AnonymousClass09B implements AnonymousClass04G {
    public final AnonymousClass09A[] A00;

    public AnonymousClass09B(AnonymousClass09A... r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass04R B46(AnonymousClass04K r8, Class cls) {
        AnonymousClass00C.A0D(cls, 0);
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass04R r1 = null;
        for (AnonymousClass09A r2 : this.A00) {
            if (AnonymousClass00C.A0J(r2.A00, cls)) {
                Object invoke = r2.A01.invoke(r8);
                if (invoke instanceof AnonymousClass04R) {
                    r1 = (AnonymousClass04R) invoke;
                } else {
                    r1 = null;
                }
            }
        }
        if (r1 != null) {
            return r1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No initializer set for given class ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public /* synthetic */ AnonymousClass04R B3o(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
