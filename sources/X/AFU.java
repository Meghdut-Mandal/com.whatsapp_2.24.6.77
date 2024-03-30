package X;

public final class AFU implements B4W {
    public static final C21289AFt A02 = new C21289AFt();
    public final String A00;
    public final String A01;

    public boolean B6r(C194429Pq r3) {
        AnonymousClass00C.A0D(r3, 0);
        Object A002 = r3.A00(this.A01);
        Object A003 = r3.A00(this.A00);
        if (A002 != null && A003 != null) {
            return C132806Vi.A02(A002, A003);
        }
        throw new ClassCastException("Either variable or expected value or both is/are null");
    }

    public AFU(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
