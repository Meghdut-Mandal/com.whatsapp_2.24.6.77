package X;

/* renamed from: X.9Nb  reason: invalid class name and case insensitive filesystem */
public final class C193839Nb {
    public final int A00;
    public final AnonymousClass9UU A01;
    public final C197769cL A02;
    public final AnonymousClass00T A03;
    public final C019108d A04;
    public final C17750ry[] A05;
    public final Boolean[] A06;

    public C193839Nb(AnonymousClass9UU r3, C197769cL r4, C019108d r5) {
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r4;
        r3.A01();
        AnonymousClass39C r0 = r3.A00;
        if (r0 == null) {
            throw C36331k8.A0d("metadata");
        }
        int i = r0.A00;
        this.A00 = i;
        int i2 = i + 1;
        this.A05 = new C17750ry[i2];
        this.A06 = new Boolean[i2];
        this.A03 = C36431kI.A1I(new C22162Ahl(this));
    }
}
