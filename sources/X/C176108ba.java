package X;

/* renamed from: X.8ba  reason: invalid class name and case insensitive filesystem */
public class C176108ba extends C201669k5 implements C22936Aym, AnonymousClass4QL {
    public final AnonymousClass11F A00;
    public final boolean A01;

    public C176108ba(AnonymousClass11F r9, long j, boolean z) {
        this((C201539jo) null, r9, (String) null, j, z, false);
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8OI.DEFAULT_INSTANCE.A0p();
        boolean z = this.A01;
        AnonymousClass8OI r1 = (AnonymousClass8OI) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.pinned_ = z;
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8OI r12 = (AnonymousClass8OI) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.pinAction_ = r12;
        A0H.bitField0_ |= 16;
        return A04;
    }

    public boolean BNX() {
        return !this.A01;
    }

    public AnonymousClass11F getChatJid() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "PinChatMutation{rowId=", A0u);
        A0u.append(", chatJid=");
        A0u.append(this.A00);
        A0u.append(", isPinned=");
        A0u.append(this.A01);
        C201669k5.A02(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }

    public C176108ba(C201539jo r10, AnonymousClass11F r11, String str, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r10, str, "regular_low", 5, j, z2);
        this.A00 = r11;
        this.A01 = z;
    }
}
