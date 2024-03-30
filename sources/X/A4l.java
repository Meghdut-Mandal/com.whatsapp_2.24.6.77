package X;

public final class A4l implements C22895Axz {
    public static final Object A02 = C36441kJ.A11();
    public volatile C22895Axz A00;
    public volatile Object A01 = A02;

    public A4l(C22895Axz axz) {
        this.A00 = axz;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.a();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Scoped provider was invoked recursively returning different results: ");
                    A0u.append(obj4);
                    A0u.append(" & ");
                    A0u.append(obj);
                    throw AnonymousClass000.A0g(". This is likely due to a circular dependency.", A0u);
                }
            }
        }
        return obj;
    }
}
