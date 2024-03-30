package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2aM  reason: invalid class name */
public final class AnonymousClass2aM extends AnonymousClass1IB {
    public String A02(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        return userJid.getRawString();
    }

    public /* bridge */ /* synthetic */ String A03(Object obj) {
        AnonymousClass3Q5 r2 = (AnonymousClass3Q5) obj;
        AnonymousClass00C.A0D(r2, 0);
        return r2.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2aM(C19700wN r2, C76143oO r3, C19890wg r4) {
        super(r2, r3, r4, "ctwa_ads_dc_state");
        C36321k7.A0x(r2, r4);
    }

    public final AnonymousClass3Q5 A08(UserJid userJid) {
        return (AnonymousClass3Q5) super.A01(userJid);
    }

    public final ArrayList A09() {
        return super.A04();
    }

    public final void A0A(AnonymousClass3Q5 r1) {
        super.A07(r1);
    }

    public final void A0B(UserJid userJid) {
        super.A05(userJid);
    }
}
