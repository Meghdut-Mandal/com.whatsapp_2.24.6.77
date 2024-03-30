package X;

/* renamed from: X.AFh  reason: case insensitive filesystem */
public final class C21277AFh implements B4W {
    public static final AG6 A02 = new AG6();
    public final Object A00;
    public final Object A01;

    public boolean B6r(C194429Pq r3) {
        Object obj;
        AnonymousClass00C.A0D(r3, 0);
        Object obj2 = this.A01;
        Object A0h = C165577te.A0h(r3, obj2, obj2 instanceof String ? 1 : 0);
        if (A0h != null && (obj = this.A00) != null) {
            return !C132806Vi.A02(obj, A0h);
        }
        throw new ClassCastException("Either variable or expected value or both is/are null");
    }

    public C21277AFh(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
