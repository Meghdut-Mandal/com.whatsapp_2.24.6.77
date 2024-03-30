package X;

/* renamed from: X.0iL  reason: invalid class name and case insensitive filesystem */
public final class C12590iL implements C023509x, C023609y {
    public final C023509x A00;
    public final C005102h A01;

    public C023609y getCallerFrame() {
        C023509x r1 = this.A00;
        if (r1 instanceof C023609y) {
            return (C023609y) r1;
        }
        return null;
    }

    public void resumeWith(Object obj) {
        this.A00.resumeWith(obj);
    }

    public C12590iL(C023509x r1, C005102h r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C005102h getContext() {
        return this.A01;
    }
}
