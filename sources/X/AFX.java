package X;

public final class AFX implements B4W {
    public static final C21292AFw A02 = new C21292AFw();
    public final Object A00;
    public final Object A01;

    public boolean B6r(C194429Pq r3) {
        Object obj;
        AnonymousClass00C.A0D(r3, 0);
        Object obj2 = this.A01;
        Object A0h = C165577te.A0h(r3, obj2, obj2 instanceof String ? 1 : 0);
        if (A0h != null && (obj = this.A00) != null) {
            return C132806Vi.A03(obj, A0h);
        }
        throw new ClassCastException("Either variable or expected value or both are null");
    }

    public AFX(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}