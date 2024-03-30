package X;

/* renamed from: X.8bM  reason: invalid class name and case insensitive filesystem */
public class C175968bM extends C201669k5 {
    public C175968bM(C201539jo r10, String str, long j, boolean z) {
        super(C199769fw.A03, r10, str, "regular_low", 4, j, z);
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A01 = C170918Hz.A01(AnonymousClass8O4.DEFAULT_INSTANCE);
        AnonymousClass8O4 r2 = (AnonymousClass8O4) A01.A00;
        r2.bitField0_ |= 1;
        r2.allowed_ = true;
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8O4 r1 = (AnonymousClass8O4) A01.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r1.getClass();
        A0H.androidUnsupportedActions_ = r1;
        A0H.bitField0_ |= 1048576;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "AndroidUnsupportedMutation{rowId=", A0u);
        C201669k5.A03(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
