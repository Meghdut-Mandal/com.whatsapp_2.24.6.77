package X;

/* renamed from: X.8bW  reason: invalid class name and case insensitive filesystem */
public class C176068bW extends C201669k5 implements C22936Aym, AnonymousClass4QK, AnonymousClass4QL {
    public final C202679mP A00;
    public final AnonymousClass11F A01;
    public final boolean A02;

    public C176068bW(C201539jo r11, C202679mP r12, AnonymousClass11F r13, String str, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r11, str, "regular_low", 3, j, z2);
        this.A01 = r13;
        this.A02 = z;
        this.A00 = r12;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8PQ.DEFAULT_INSTANCE.A0p();
        boolean z = this.A02;
        AnonymousClass8PQ r1 = (AnonymousClass8PQ) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.read_ = z;
        AnonymousClass8QJ A04 = this.A00.A04();
        AnonymousClass8PQ r12 = (AnonymousClass8PQ) C90524aI.A0H(A0p);
        A04.getClass();
        r12.messageRange_ = A04;
        r12.bitField0_ |= 2;
        AnonymousClass8LN A042 = super.A04();
        C18740tg.A06(A042);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A042);
        AnonymousClass8PQ r13 = (AnonymousClass8PQ) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r13.getClass();
        A0H.markChatAsReadAction_ = r13;
        A0H.bitField0_ |= 32768;
        return A042;
    }

    public boolean BNX() {
        return !this.A02;
    }

    public C202679mP BE5() {
        return this.A00;
    }

    public AnonymousClass11F getChatJid() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "MarkChatAsReadMutation{rowId=", A0u);
        A0u.append(", chatJid=");
        A0u.append(this.A01);
        A0u.append(", isRead=");
        A0u.append(this.A02);
        A0u.append(", messageRange=");
        A0u.append(this.A00);
        C201669k5.A02(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
