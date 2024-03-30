package X;

/* renamed from: X.AFd  reason: case insensitive filesystem */
public final class C21273AFd implements B4W {
    public static final AG2 A02 = new AG2();
    public final Object A00;
    public final Object A01;

    public boolean B6r(C194429Pq r4) {
        AnonymousClass00C.A0D(r4, 0);
        Object obj = this.A01;
        Integer A002 = C132806Vi.A00(C165577te.A0h(r4, obj, obj instanceof String ? 1 : 0), this.A00);
        if (A002 == null) {
            throw AnonymousClass001.A0E("The data type is unsupported for this operation");
        } else if (A002.intValue() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public C21273AFd(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
