package X;

/* renamed from: X.8bP  reason: invalid class name and case insensitive filesystem */
public class C175998bP extends C201669k5 {
    public final boolean A00;

    public C175998bP(C201539jo r10, String str, long j, boolean z) {
        super(C199769fw.A03, r10, str, "regular_low", 4, j, false);
        this.A00 = z;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8OS.DEFAULT_INSTANCE.A0p();
        boolean z = this.A00;
        AnonymousClass8OS r1 = (AnonymousClass8OS) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.unarchiveChats_ = z;
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8OS r12 = (AnonymousClass8OS) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.unarchiveChatsSetting_ = r12;
        A0H.bitField0_ |= 262144;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C201669k5.A01(this, "UnarchiveChatsSettingMutation{rowId=", A0u);
        A0u.append(", isUnarchiveChatsSettingEnabled=");
        A0u.append(this.A00);
        C201669k5.A02(this, A0u);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
