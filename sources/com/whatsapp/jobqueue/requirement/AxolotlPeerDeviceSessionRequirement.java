package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass189;
import X.AnonymousClass7i8;
import X.C133256Xm;
import X.C18740tg;
import X.C18800tq;
import X.C231417i;
import X.C36341k9;
import X.C36371kC;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlPeerDeviceSessionRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass189 A00;
    public transient C231417i A01;
    public final String targetJidRawString;

    public boolean BMk() {
        DeviceJid nullable = DeviceJid.getNullable(this.targetJidRawString);
        C18740tg.A06(nullable);
        if (this.A01.A02().contains(nullable)) {
            return this.A00.A0Z(C133256Xm.A02(nullable));
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AxolotlDeviceSessionRequirement/isPresent/warning: the specific device is not in db, handle the error in the job. jid=");
        C36341k9.A1O(A0u, this.targetJidRawString);
        return true;
    }

    public AxolotlPeerDeviceSessionRequirement(DeviceJid deviceJid) {
        this.targetJidRawString = deviceJid.getRawString();
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A01 = (C231417i) A0P.A8k.get();
        this.A00 = A0P.AzT();
    }
}
