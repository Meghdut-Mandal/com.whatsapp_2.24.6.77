package X;

/* renamed from: X.AFc  reason: case insensitive filesystem */
public final class C21272AFc implements B4W {
    public static final AG1 A02 = new AG1();
    public final String A00;
    public final String A01;

    public boolean B6r(C194429Pq r3) {
        AnonymousClass00C.A0D(r3, 0);
        Integer A002 = C132806Vi.A00(r3.A00(this.A01), r3.A00(this.A00));
        if (A002 != null) {
            return C90484aE.A1Q(A002.intValue());
        }
        throw AnonymousClass001.A0E("The data type is unsupported for this operation");
    }

    public C21272AFc(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
