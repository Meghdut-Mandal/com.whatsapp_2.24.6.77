package X;

import android.os.ConditionVariable;
import com.whatsapp.jid.UserJid;

/* renamed from: X.18y  reason: invalid class name and case insensitive filesystem */
public final class C235618y {
    public final C19730wQ A00;
    public final C237819v A01;
    public final C20400xV A02;
    public final C231417i A03;
    public final C20500xf A04;

    public C235618y(C19730wQ r2, C237819v r3, C20400xV r4, C231417i r5, C20500xf r6) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r3, 5);
        this.A04 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public final boolean A00(UserJid userJid) {
        if (userJid != null) {
            if (!C20800yB.A01(C21000yV.A02, this.A04.A00, 5968) || !A01(userJid)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A01(UserJid userJid) {
        if (!this.A04.A00()) {
            AnonymousClass3QO A05 = this.A03.A05(userJid);
            if (A05 == null || A05.A00 != 1) {
                return false;
            }
            return true;
        } else if (userJid != null) {
            return this.A02.A01(userJid);
        } else {
            return false;
        }
    }
}
