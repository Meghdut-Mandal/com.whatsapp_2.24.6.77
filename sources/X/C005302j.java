package X;

/* renamed from: X.02j  reason: invalid class name and case insensitive filesystem */
public abstract class C005302j implements C005202i {
    public final C005902p key;

    public C005302j(C005902p r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.key = r2;
    }

    public Object fold(Object obj, C009003v r3) {
        AnonymousClass00C.A0D(r3, 2);
        return r3.invoke(obj, this);
    }

    public C005202i get(C005902p r2) {
        return C008803t.A00(this, r2);
    }

    public C005102h minusKey(C005902p r2) {
        return C008803t.A01(this, r2);
    }

    public C005102h plus(C005102h r2) {
        return C008803t.A02(this, r2);
    }

    public C005902p getKey() {
        return this.key;
    }
}
