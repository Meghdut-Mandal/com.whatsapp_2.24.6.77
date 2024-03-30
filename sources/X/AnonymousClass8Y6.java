package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8Y6  reason: invalid class name */
public final class AnonymousClass8Y6 extends AnonymousClass1LZ {
    public final C19970wo A00;
    public final AnonymousClass12O A01;
    public final C20810yC A02;

    public C201669k5 A0A(C202599mH r14, String str, boolean z) {
        C223313w r8;
        PhoneUserJid phoneUserJid;
        AnonymousClass00C.A0D(r14, 2);
        AnonymousClass8SS r2 = r14.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = r14.A06;
        if (!AnonymousClass00C.A0J(C165617ti.A0a(strArr), "pnForLidChat") || strArr.length != 2 || !AnonymousClass00C.A0J(r14.A01, C176038bT.A02) || (r2.bitField0_ & Integer.MIN_VALUE) == 0) {
            return null;
        }
        C222813r r1 = UserJid.Companion;
        UserJid A022 = r1.A02(strArr[1]);
        if (!(A022 instanceof C223313w) || (r8 = (C223313w) A022) == null) {
            return null;
        }
        AnonymousClass8OJ r0 = r2.pnForLidChatAction_;
        if (r0 == null) {
            r0 = AnonymousClass8OJ.DEFAULT_INSTANCE;
        }
        UserJid A023 = r1.A02(r0.pnJid_);
        if (!(A023 instanceof PhoneUserJid) || (phoneUserJid = (PhoneUserJid) A023) == null) {
            return null;
        }
        return new C176038bT(r14.A02, r8, phoneUserJid, str, r2.timestamp_);
    }

    public String A0B() {
        return "regular";
    }

    public String A0C() {
        return "pnForLidChat";
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A05(r2);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A06(r2);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C176038bT r62 = (C176038bT) r6;
        AnonymousClass00C.A0D(r62, 0);
        if (r7 == null) {
            this.A01.A0H(r62.A00, r62.A01);
        } else if (r7.A04 < r62.A04) {
            A09(r62, r7);
            return;
        }
        A07(r62);
    }

    public boolean A0H() {
        return this.A02.A0E(3062);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Y6(C19970wo r1, AnonymousClass12O r2, AnonymousClass1AC r3, C20810yC r4) {
        super(r3);
        C36321k7.A18(r3, r2, r1, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r4;
    }

    public List A0D(boolean z) {
        return C023409w.A00;
    }
}
