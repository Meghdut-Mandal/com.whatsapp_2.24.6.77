package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dc  reason: invalid class name and case insensitive filesystem */
public final class C61703Dc {
    public int A00;
    public int A01;
    public final /* synthetic */ C61993Eh A02;

    public void A00(UserJid userJid, Integer num, int i) {
        AnonymousClass00C.A0D(userJid, 1);
        if (i != 1) {
            this.A01 = 4;
            C61993Eh r2 = this.A02;
            boolean A0M = r2.A00.A0M(userJid);
            int i2 = R.string.f12nameremoved;
            if (A0M) {
                i2 = R.string.f12nameremoved;
            }
            this.A00 = i2;
            if (A0M && num != null) {
                int intValue = num.intValue();
                if (intValue == 3) {
                    C62813Hq r3 = (C62813Hq) r2.A05.getValue();
                    AnonymousClass2PH A002 = AnonymousClass2PH.A00(r3);
                    A002.A02 = C36361kB.A0j();
                    A002.A00 = false;
                    r3.A01.Bly(A002);
                } else if (intValue == 4) {
                    C62813Hq r22 = (C62813Hq) r2.A05.getValue();
                    AnonymousClass2PH.A01(r22, AnonymousClass2PH.A00(r22), 5);
                }
            }
        } else {
            this.A01 = 2;
            this.A00 = R.string.f12nameremoved;
        }
        AnonymousClass3D3 r5 = new AnonymousClass3D3(this.A01);
        C61993Eh r4 = this.A02;
        AnonymousClass155 r32 = r4.A01;
        String A0m = C36361kB.A0m(r32, this.A00);
        Bundle bundle = r5.A01;
        bundle.putCharSequence("message", A0m);
        AnonymousClass3D3.A01(bundle, r5, r4, userJid);
        AnonymousClass3D3.A00(bundle, r32, r5, R.string.f12nameremoved);
    }

    public C61703Dc(C61993Eh r1) {
        this.A02 = r1;
    }
}
