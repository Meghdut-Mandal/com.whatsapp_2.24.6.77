package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3D6  reason: invalid class name */
public class AnonymousClass3D6 {
    public final AnonymousClass1NG A00;
    public final C26371Jx A01;

    public void A00(C225314u r9, UserJid userJid, int i, int i2) {
        UserJid userJid2 = userJid;
        if (this.A01.A01(userJid)) {
            C225314u r3 = r9;
            Intent A0Y = AnonymousClass190.A0Y(r9, userJid, i, i2);
            if (this.A00.A0O(userJid)) {
                int i3 = R.string.f12nameremoved;
                if (i > 0) {
                    i3 = R.string.f12nameremoved;
                }
                r9.Btm(UnblockDialogFragment.A03(new C53512rR(r3, A0Y, this, userJid2, 0), r9.getString(i3), R.string.f12nameremoved, false));
                return;
            }
            r9.startActivity(A0Y);
        }
    }

    public AnonymousClass3D6(AnonymousClass1NG r1, C26371Jx r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
