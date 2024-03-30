package X;

/* renamed from: X.9eT  reason: invalid class name and case insensitive filesystem */
public class C198959eT {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C198959eT(boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A06 = z2;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        this.A04 = false;
        this.A02 = null;
        this.A07 = false;
        this.A08 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("fullSyncDaysLimit: ");
        A0u.append(this.A00);
        A0u.append(", fullSyncSizeMbLimit: ");
        A0u.append(this.A01);
        A0u.append(", storageQuotaMb: ");
        A0u.append(this.A03);
        A0u.append(", inlineInitialHistSyncPayloadEnabled: ");
        A0u.append(this.A04);
        A0u.append(", recentSyncDaysLimit: ");
        A0u.append(this.A02);
        A0u.append(", supportCallLogHistory: ");
        A0u.append(this.A07);
        A0u.append(", supportBotUserAgentChatHistory: ");
        A0u.append(this.A05);
        A0u.append(", supportCagReactionsAndPolls: ");
        A0u.append(this.A06);
        A0u.append(", supportRecentSyncChunkMessageCountTuning: ");
        return C36421kH.A0d(A0u, this.A08);
    }

    public C198959eT(C173378Rl r4) {
        Integer num;
        Integer num2;
        Integer num3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer num4 = null;
        if (r4 == null || (r4.bitField0_ & 1) == 0) {
            num = null;
        } else {
            num = Integer.valueOf(r4.fullSyncDaysLimit_);
        }
        this.A00 = num;
        if (r4 == null || (r4.bitField0_ & 2) == 0) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(r4.fullSyncSizeMbLimit_);
        }
        this.A01 = num2;
        if (r4 == null || (r4.bitField0_ & 4) == 0) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(r4.storageQuotaMb_);
        }
        this.A03 = num3;
        boolean z5 = false;
        if (r4 == null || (r4.bitField0_ & 8) == 0) {
            z = false;
        } else {
            z = r4.inlineInitialPayloadInE2EeMsg_;
        }
        this.A04 = z;
        if (!(r4 == null || (r4.bitField0_ & 16) == 0)) {
            num4 = Integer.valueOf(r4.recentSyncDaysLimit_);
        }
        this.A02 = num4;
        if (r4 == null || (r4.bitField0_ & 32) == 0) {
            z2 = false;
        } else {
            z2 = r4.supportCallLogHistory_;
        }
        this.A07 = z2;
        if (r4 == null || (r4.bitField0_ & 64) == 0) {
            z3 = false;
        } else {
            z3 = r4.supportBotUserAgentChatHistory_;
        }
        this.A05 = z3;
        if (r4 == null || (r4.bitField0_ & 128) == 0) {
            z4 = false;
        } else {
            z4 = r4.supportCagReactionsAndPolls_;
        }
        this.A06 = z4;
        if (!(r4 == null || (r4.bitField0_ & 256) == 0)) {
            z5 = r4.supportRecentSyncChunkMessageCountTuning_;
        }
        this.A08 = z5;
    }
}
