package X;

/* renamed from: X.3O0  reason: invalid class name */
public class AnonymousClass3O0 {
    public int A00 = 0;
    public long A01;
    public String A02;
    public boolean A03;
    public final C19970wo A04;
    public final C21010yW A05;
    public final C18950u5 A06;

    public AnonymousClass3O0(C19970wo r3, C21010yW r4) {
        C18950u5 r1 = C20890yK.DEFAULT_SAMPLING_RATE;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r1;
    }

    public static void A00(AnonymousClass3O0 r7, int i) {
        AnonymousClass2Q0 r6 = new AnonymousClass2Q0();
        C18740tg.A0D(AnonymousClass000.A1V(r7.A02), "RevokeUiActionWamEventLogger/logNextEvent: A session must be started before logging.");
        r6.A02 = r7.A02;
        r6.A00 = Integer.valueOf(i);
        long A002 = C19970wo.A00(r7.A04);
        r6.A01 = Long.valueOf(A002 - r7.A01);
        r7.A01 = A002;
        r7.A05.Blv(r6);
    }
}
