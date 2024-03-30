package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1FU  reason: invalid class name */
public final class AnonymousClass1FU {
    public final C20810yC A00;

    public AnonymousClass1FU(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (C66013Ui.A0q(r4) && (r4.A1J.A00 instanceof UserJid)) {
            if (C20800yB.A01(C21000yV.A01, this.A00, 2200)) {
                return true;
            }
        }
        if (!C66013Ui.A0q(r4) || !AnonymousClass143.A0G(r4.A1J.A00)) {
            return false;
        }
        if (C20800yB.A01(C21000yV.A01, this.A00, 2932)) {
            return true;
        }
        return false;
    }
}
