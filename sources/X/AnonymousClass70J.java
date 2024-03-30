package X;

/* renamed from: X.70J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70J implements C25711Hj {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C006302t A02;

    public /* synthetic */ AnonymousClass70J(String str, String str2, C006302t r3) {
        this.A02 = r3;
        this.A00 = str;
        this.A01 = str2;
    }

    public final void accept(Object obj) {
        C006302t r6 = this.A02;
        String str = this.A00;
        String str2 = this.A01;
        Number number = (Number) obj;
        AnonymousClass00C.A0D(number, 3);
        r6.invoke(new AnonymousClass57G(new AnonymousClass6BR(str, ((double) number.intValue()) / 100.0d, str2)));
    }
}
