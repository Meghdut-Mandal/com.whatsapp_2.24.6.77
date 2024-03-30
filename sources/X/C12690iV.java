package X;

/* renamed from: X.0iV  reason: invalid class name and case insensitive filesystem */
public abstract class C12690iV implements C17150qo {
    public Object A00;

    public abstract void A00(Object obj, Object obj2, C17960sM r3);

    public void Bsf(Object obj, Object obj2, C17960sM r4) {
        AnonymousClass00C.A0D(r4, 1);
        Object obj3 = this.A00;
        this.A00 = obj2;
        A00(obj3, obj2, r4);
    }

    public C12690iV(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ObservableProperty(value=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public Object BIo(Object obj, C17960sM r3) {
        return this.A00;
    }
}
