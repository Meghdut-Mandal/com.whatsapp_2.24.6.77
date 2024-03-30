package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

/* renamed from: X.53x  reason: invalid class name */
public final class AnonymousClass53x extends AnonymousClass1LZ {
    public final C25731Hl A00;
    public final C25751Hn A01;
    public final C24381Cf A02;
    public final C19970wo A03;
    public final C20810yC A04;

    public C201669k5 A0A(C202599mH r7, String str, boolean z) {
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass8SS r2 = r7.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = r7.A06;
        if (!AnonymousClass00C.A0J(strArr[0], "setting_chatLock") || strArr.length != 1 || !AnonymousClass00C.A0J(r7.A01, C1032454n.A01) || (r2.bitField1_ & DefaultCrypto.BUFFER_SIZE) == 0) {
            return null;
        }
        long j = r2.timestamp_;
        C201539jo r1 = r7.A02;
        C99834u2 r22 = r2.chatLockSettings_;
        if (r22 == null) {
            r22 = C99834u2.DEFAULT_INSTANCE;
        }
        AnonymousClass00C.A08(r22);
        return new C1032454n(r1, r22, str, j);
    }

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "setting_chatLock";
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A06(r2);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C1032454n r62 = (C1032454n) r6;
        AnonymousClass00C.A0D(r62, 0);
        if (r7 == null || r7.A04 < r62.A04) {
            C99834u2 r2 = r62.A00;
            if ((r2.bitField0_ & 2) != 0) {
                C25751Hn r1 = this.A01;
                C173158Qp r0 = r2.secretCode_;
                if (r0 == null) {
                    r0 = C173158Qp.DEFAULT_INSTANCE;
                }
                AnonymousClass00C.A08(r0);
                r1.A02(r0);
            }
            if ((r2.bitField0_ & 1) != 0) {
                this.A00.A01(r2.hideLockedChats_);
                this.A02.A00();
            }
            A09(r62, r7);
            return;
        }
        A07(r62);
    }

    public boolean A0H() {
        return this.A04.A0E(7280);
    }

    public final C1032454n A0I() {
        C173158Qp A002 = this.A01.A00();
        long A003 = C19970wo.A00(this.A03);
        C99754tu r2 = (C99754tu) C99834u2.DEFAULT_INSTANCE.A0p();
        if (A002 != null) {
            r2.A0V(this.A00.A03());
            r2.A0U(A002);
        } else {
            r2.A0V(false);
            C99834u2 r1 = (C99834u2) C90524aI.A0H(r2);
            r1.secretCode_ = null;
            r1.bitField0_ &= -3;
        }
        return new C1032454n((C201539jo) null, (C99834u2) r2.A0R(), (String) null, A003);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass53x(C25731Hl r2, C25751Hn r3, C19970wo r4, C24381Cf r5, AnonymousClass1AC r6, C20810yC r7) {
        super(r6);
        C36321k7.A1B(r6, r4, r7, r3, r5);
        AnonymousClass00C.A0D(r2, 6);
        this.A03 = r4;
        this.A04 = r7;
        this.A01 = r3;
        this.A02 = r5;
        this.A00 = r2;
    }

    public List A0D(boolean z) {
        return C36371kC.A11(A0I());
    }
}
