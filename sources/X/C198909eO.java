package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9eO  reason: invalid class name and case insensitive filesystem */
public final class C198909eO {
    public int A00;
    public UserJid A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass6TX A04;

    public final void A01(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        if (this.A03) {
            Log.w("onStart: can be called only once per instance");
            return;
        }
        this.A03 = true;
        this.A01 = userJid;
        this.A00 = this.A04.A02(897463359);
    }

    public static final void A00(C198909eO r1, C006302t r2) {
        String str;
        if (!r1.A02) {
            if (!r1.A03) {
                str = "onLoggable: onStart was not called?";
            } else {
                r1.A02 = true;
                UserJid userJid = r1.A01;
                if (userJid != null) {
                    r2.invoke(userJid);
                    return;
                }
                str = "onLoggable: bizJid should not be null by this moment!";
            }
            Log.e(str);
        }
    }

    public C198909eO(AnonymousClass6TX r1) {
        this.A04 = r1;
    }
}
