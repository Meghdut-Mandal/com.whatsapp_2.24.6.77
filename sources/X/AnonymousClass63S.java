package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.63S  reason: invalid class name */
public final class AnonymousClass63S {
    public final C19730wQ A00;
    public final C144576sT A01;
    public final C34631hO A02;
    public final C19770wU A03;

    public final void A00(C107265Nh r5) {
        if (!r5.A04.A03) {
            if (r5.A0C != null) {
                DeviceJid deviceJid = r5.A02;
                C19730wQ r2 = this.A00;
                r2.A0G();
                if ((!AnonymousClass00C.A0J(deviceJid, r2.A02) && !AnonymousClass00C.A0J(deviceJid, r2.A07())) || r5.A0C().size() <= 1) {
                    return;
                }
            } else {
                return;
            }
        }
        if (r5.A0F == null) {
            C36411kG.A1M(this.A03, this, r5, 20);
        }
    }

    public AnonymousClass63S(C19730wQ r1, C34631hO r2, C144576sT r3, C19770wU r4) {
        C36321k7.A18(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }
}
