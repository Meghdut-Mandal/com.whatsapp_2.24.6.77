package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.2LX  reason: invalid class name */
public final class AnonymousClass2LX extends AnonymousClass16R {
    public final Set A00;

    public AnonymousClass2LX(C175538ae r4, AnonymousClass2LY r5) {
        AnonymousClass16R[] r1 = {r5, r4};
        AnonymousClass00C.A0D(r1, 0);
        this.A00 = AnonymousClass02R.A0E(r1);
    }

    public void A01(AnonymousClass9TX r3, UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        for (AnonymousClass16R A01 : this.A00) {
            A01.A01(r3, userJid);
        }
    }

    public void A02(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        for (AnonymousClass16R A02 : this.A00) {
            A02.A02(userJid);
        }
    }

    public void A03(UserJid userJid, long j) {
        AnonymousClass00C.A0D(userJid, 0);
        for (AnonymousClass16R A03 : this.A00) {
            A03.A03(userJid, j);
        }
    }

    public void A00() {
        for (AnonymousClass16R A002 : this.A00) {
            A002.A00();
        }
    }

    public void A05(AnonymousClass3T1 r3) {
        for (AnonymousClass16R A05 : this.A00) {
            A05.A05(r3);
        }
    }

    public void A06(AnonymousClass3T1 r3) {
        for (AnonymousClass16R A06 : this.A00) {
            A06.A06(r3);
        }
    }
}
