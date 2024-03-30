package X;

/* renamed from: X.8bc  reason: invalid class name and case insensitive filesystem */
public class C176128bc extends C201669k5 implements B67, AnonymousClass4QL {
    public final AnonymousClass11F A00;
    public final C64933Qa A01;
    public final boolean A02;

    public C176128bc(C201539jo r11, AnonymousClass11F r12, C64933Qa r13, String str, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r11, str, "regular_high", 2, j, z2);
        this.A01 = r13;
        this.A00 = r12;
        this.A02 = z;
    }

    public boolean BNX() {
        return !this.A02;
    }

    public /* synthetic */ AnonymousClass11F getChatJid() {
        AnonymousClass11F r0 = this.A01.A00;
        C18740tg.A06(r0);
        return r0;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A0p = AnonymousClass8OP.DEFAULT_INSTANCE.A0p();
        boolean z = this.A02;
        AnonymousClass8OP r1 = (AnonymousClass8OP) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.starred_ = z;
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8OP r12 = (AnonymousClass8OP) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.starAction_ = r12;
        A0H.bitField0_ |= 2;
        return A04;
    }

    public C64933Qa BE4() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "StarMessageMutation{rowId=", A0u);
        A0u.append(", key=");
        A0u.append(this.A01);
        A0u.append(", participant=");
        A0u.append(this.A00);
        A0u.append(", starred=");
        A0u.append(this.A02);
        C201669k5.A02(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
