package X;

/* renamed from: X.5sJ  reason: invalid class name and case insensitive filesystem */
public final class C120925sJ {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C120925sJ(Object obj, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw AnonymousClass000.A0d("width must be >= 0, but was: ", AnonymousClass000.A0u(), i);
        } else if (i2 < 0) {
            throw AnonymousClass000.A0d("height must be >= 0, but was: ", AnonymousClass000.A0u(), i2);
        }
    }
}
