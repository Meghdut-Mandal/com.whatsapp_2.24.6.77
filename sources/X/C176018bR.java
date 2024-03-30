package X;

/* renamed from: X.8bR  reason: invalid class name and case insensitive filesystem */
public class C176018bR extends C201669k5 {
    public final long A00;
    public final String A01;

    public C176018bR(C201539jo r10, String str, String str2, long j, long j2, boolean z) {
        super(C199769fw.A03, r10, str, "regular_low", 7, j, z);
        this.A01 = str2;
        this.A00 = j2;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A0p = AnonymousClass8ON.DEFAULT_INSTANCE.A0p();
        long j = this.A00;
        AnonymousClass8ON r1 = (AnonymousClass8ON) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.lastStickerSentTs_ = j;
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8ON r12 = (AnonymousClass8ON) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.removeRecentStickerAction_ = r12;
        A0H.bitField0_ |= 268435456;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoveRecentStickerMutation{fileHash=");
        A0u.append(this.A01);
        A0u.append("; ts=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("}", A0u);
    }
}
