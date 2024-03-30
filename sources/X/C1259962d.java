package X;

/* renamed from: X.62d  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1259962d {
    public final /* synthetic */ C1271967i A00;
    public final /* synthetic */ C140456lc A01;
    public final /* synthetic */ C100254ui A02;

    public /* synthetic */ C1259962d(C1271967i r1, C140456lc r2, C100254ui r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(String str, int i, int i2, int i3, long j) {
        C100254ui r2 = this.A02;
        C1271967i r5 = this.A00;
        C140456lc r4 = this.A01;
        AnonymousClass6WZ A012 = C133266Xn.A01(r5);
        A012.A08(new C142196oU((long) r4.A03), new C100654vN(r2, str, j));
        A012.A05();
        C160377ku A0X = r4.A0X(44);
        if (A0X != null) {
            C1273868b A002 = C1273868b.A00();
            A002.A0A(str, 0);
            A002.A0A(Integer.valueOf(i3), 1);
            A002.A0A(Integer.valueOf(i2), 2);
            A002.A0A(Integer.valueOf(i), 3);
            C1273868b.A06(r5, r4, A002, A0X);
        }
        C160377ku A0X2 = r4.A0X(49);
        if (A0X2 != null) {
            C1273868b A022 = C1273868b.A02(str);
            A022.A09(Integer.valueOf(i3), 1);
            A022.A09(Integer.valueOf(i2), 2);
            A022.A09(Integer.valueOf(i), 3);
            A022.A09(Long.valueOf(j), 4);
            C1273868b.A06(r5, r4, A022, A0X2);
        }
    }
}
