package X;

/* renamed from: X.9Ve  reason: invalid class name and case insensitive filesystem */
public class C195629Ve {
    public final Object A00;
    public final Object A01;

    public Object A00() {
        if (this instanceof C177278dX) {
            return ((C177278dX) this).A00;
        }
        return this.A00;
    }

    public Object A01() {
        if (this instanceof C177278dX) {
            return ((C177278dX) this).A01;
        }
        return this.A01;
    }

    public C195629Ve(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GraphQlResult(data=");
        A0u.append(A00());
        A0u.append(", errors=");
        return AnonymousClass000.A0m(A01(), A0u);
    }
}
