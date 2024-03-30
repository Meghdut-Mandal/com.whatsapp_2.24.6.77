package X;

/* renamed from: X.8bZ  reason: invalid class name and case insensitive filesystem */
public class C176098bZ extends C201669k5 implements C22936Aym, AnonymousClass4QL {
    public final long A00;
    public final AnonymousClass11F A01;
    public final boolean A02;

    public C176098bZ(C201539jo r11, AnonymousClass11F r12, String str, long j, long j2, boolean z, boolean z2) {
        super(C199769fw.A03, r11, str, "regular_high", 2, j2, z2);
        this.A01 = r12;
        this.A02 = z;
        this.A00 = j;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8QH.DEFAULT_INSTANCE.A0p();
        boolean z = this.A02;
        AnonymousClass8QH r1 = (AnonymousClass8QH) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.muted_ = z;
        if (z) {
            long j = this.A00;
            AnonymousClass8QH r12 = (AnonymousClass8QH) C90524aI.A0H(A0p);
            r12.bitField0_ |= 2;
            r12.muteEndTimestamp_ = j;
        }
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8QH r13 = (AnonymousClass8QH) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0H.muteAction_ = r13;
        A0H.bitField0_ |= 8;
        return A04;
    }

    public boolean BNX() {
        return !this.A02;
    }

    public AnonymousClass11F getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "MuteChatMutation{rowId=", A0u);
        A0u.append(", chatJid=");
        A0u.append(this.A01);
        A0u.append(", muteEndTimestamp=");
        A0u.append(this.A00);
        A0u.append(", isMuted=");
        A0u.append(this.A02);
        C201669k5.A02(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
