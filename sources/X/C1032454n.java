package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.54n  reason: invalid class name and case insensitive filesystem */
public final class C1032454n extends C201669k5 {
    public static final C199769fw A01 = C199769fw.A03;
    public final C99834u2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1032454n(C201539jo r10, C99834u2 r11, String str, long j) {
        super(A01, r10, str, "regular_low", 7, j, false);
        AnonymousClass00C.A0D(r11, 4);
        this.A00 = r11;
    }

    public String A07() {
        return "setting_chatLock";
    }

    public String[] A0A() {
        return new String[]{"setting_chatLock"};
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        if (A04 == null) {
            return null;
        }
        C99834u2 r2 = this.A00;
        AnonymousClass8SS r1 = (AnonymousClass8SS) C90524aI.A0H(A04);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r1.chatLockSettings_ = r2;
        r1.bitField1_ |= DefaultCrypto.BUFFER_SIZE;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChatLockSettingsMutation(settings= ");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
