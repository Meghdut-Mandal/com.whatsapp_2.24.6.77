package X;

/* renamed from: X.6pQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142756pQ implements AnonymousClass7fT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass7fT A02;

    public /* synthetic */ C142756pQ(AnonymousClass7fT r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object B2F(Object obj) {
        AnonymousClass7fT r3 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        Number number = (Number) obj;
        if (r3 == null) {
            return null;
        }
        r3.B2F(Integer.valueOf(i + ((number.intValue() * (i2 - i)) / 100)));
        return null;
    }
}
