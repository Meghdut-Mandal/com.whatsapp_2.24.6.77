package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass189;
import X.AnonymousClass7i8;
import X.C133256Xm;
import X.C18740tg;
import X.C19740wR;
import X.C36371kC;
import X.C90464aC;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlDifferentAliceBaseKeyRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient DeviceJid A00;
    public transient AnonymousClass189 A01;
    public final String jid;
    public final byte[] oldAliceBaseKey;

    public boolean BMk() {
        return !Arrays.equals(this.oldAliceBaseKey, this.A01.A0D(C133256Xm.A02(this.A00)).A01.A00.aliceBaseKey_.A06());
    }

    public AxolotlDifferentAliceBaseKeyRequirement(DeviceJid deviceJid, byte[] bArr) {
        this.A00 = deviceJid;
        this.jid = deviceJid.getRawString();
        C18740tg.A0G(bArr);
        this.oldAliceBaseKey = bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A00 = DeviceJid.Companion.A02(this.jid);
            byte[] bArr = this.oldAliceBaseKey;
            if (bArr == null || bArr.length == 0) {
                throw new InvalidObjectException("oldAliceBaseKey must not be empty");
            }
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
