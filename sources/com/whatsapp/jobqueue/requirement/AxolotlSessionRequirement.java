package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass189;
import X.AnonymousClass7i8;
import X.C133256Xm;
import X.C19740wR;
import X.C36371kC;
import X.C90464aC;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlSessionRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient DeviceJid A00;
    public transient AnonymousClass189 A01;
    public final String jid;

    public boolean BMk() {
        return this.A01.A0Z(C133256Xm.A02(this.A00));
    }

    public AxolotlSessionRequirement(DeviceJid deviceJid) {
        this.A00 = deviceJid;
        this.jid = deviceJid.getRawString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A00 = DeviceJid.Companion.A02(this.jid);
        } catch (C19740wR unused) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("jid must be a valid user jid; jid=");
            throw C90464aC.A0N(this.jid, A0u);
        }
    }

    public void Bqf(Context context) {
        this.A01 = C36371kC.A0P(context).AzT();
    }
}
