package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8bQ  reason: invalid class name and case insensitive filesystem */
public final class C176008bQ extends C201669k5 {
    public final UserJid A00;
    public final boolean A01;

    public C176008bQ(C201539jo r10, UserJid userJid, String str, long j, boolean z, boolean z2) {
        super(C199769fw.A03, r10, str, "regular_high", 7, j, z2);
        this.A00 = userJid;
        this.A01 = z;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8OT.DEFAULT_INSTANCE.A0p();
        boolean z = this.A01;
        AnonymousClass8OT r1 = (AnonymousClass8OT) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.muted_ = z;
        AnonymousClass8LN A04 = super.A04();
        AnonymousClass00C.A0B(A04);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        AnonymousClass8OT r12 = (AnonymousClass8OT) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        A0H.userStatusMuteAction_ = r12;
        A0H.bitField0_ |= 8388608;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserStatusMuteMutation{userJid=");
        A0u.append(this.A00);
        C201669k5.A01(this, ", rowId=", A0u);
        A0u.append(", isMuted=");
        A0u.append(this.A01);
        C201669k5.A03(this, A0u);
        A0u.append(", keyId=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
