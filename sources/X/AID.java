package X;

import com.whatsapp.jid.UserJid;

public abstract class AID implements C236119d, C23021B0r {
    public boolean A00;
    public final AnonymousClass1KK A01;

    public AID(AnonymousClass1KK r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public final boolean A02(UserJid userJid, int i) {
        boolean z = false;
        AnonymousClass00C.A0D(userJid, 0);
        if (i == 421) {
            z = true;
            if (!this.A00) {
                this.A00 = true;
                this.A01.A0D(this, userJid, true);
            } else {
                BVl(userJid);
                return true;
            }
        }
        return z;
    }
}
