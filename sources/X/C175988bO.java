package X;

/* renamed from: X.8bO  reason: invalid class name and case insensitive filesystem */
public class C175988bO extends C201669k5 {
    public final int A00;

    public C175988bO(C201539jo r10, String str, String str2, int i, long j, boolean z) {
        super(C199769fw.A03, r10, str, str2, 3, j, z);
        this.A00 = i;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A0p = AnonymousClass8OC.DEFAULT_INSTANCE.A0p();
        int i = this.A00;
        AnonymousClass8OC r1 = (AnonymousClass8OC) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.expiredKeyEpoch_ = i;
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8OC r12 = (AnonymousClass8OC) A0p.A0R();
        int i2 = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.keyExpiration_ = r12;
        A0H.bitField0_ |= 16384;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "SentinelMutation{rowId=", A0u);
        A0u.append(", expiredKeyEpoch=");
        A0u.append(this.A00);
        C201669k5.A03(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
