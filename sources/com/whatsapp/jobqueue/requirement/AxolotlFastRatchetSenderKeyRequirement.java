package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass189;
import X.AnonymousClass1P5;
import X.AnonymousClass7i8;
import X.C177518dv;
import X.C18800tq;
import X.C36411kG;
import X.C90464aC;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlFastRatchetSenderKeyRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass189 A00;
    public transient AnonymousClass1P5 A01;
    public String groupJid = C177518dv.A00.getRawString();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r1 <= 0) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BMk() {
        /*
            r6 = this;
            X.1P5 r0 = r6.A01
            boolean r0 = r0.A0d()
            r5 = 1
            if (r0 == 0) goto L_0x0063
            X.1P5 r0 = r6.A01
            java.util.ArrayList r0 = r0.A0M()
            boolean r1 = r0.isEmpty()
            r4 = 0
            X.1P5 r0 = r6.A01
            if (r1 != 0) goto L_0x001c
            r0.A0e()
            return r4
        L_0x001c:
            com.whatsapp.jid.DeviceJid r0 = r0.A0L()
            X.6EZ r1 = X.C133256Xm.A02(r0)
            X.8dv r0 = X.C177518dv.A00
            java.lang.String r0 = r0.getRawString()
            X.6EU r3 = new X.6EU
            r3.<init>(r1, r0)
            X.189 r1 = r6.A00
            X.18I r0 = r1.A0K
            X.79X r2 = X.AnonymousClass18I.A01(r0, r3)
            r2.lock()
            X.18n r0 = r1.A06     // Catch:{ all -> 0x0059 }
            X.5p5 r0 = r0.A01(r3)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0048
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0059 }
            int r1 = r0.length     // Catch:{ all -> 0x0059 }
            r0 = 1
            if (r1 > 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r2.close()
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "AxolotlFastRatchetSenderKeyRequirement/empty sender key record; reset key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1P5 r0 = r6.A01
            r0.A0S()
            return r4
        L_0x0059:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x005e }
            throw r1
        L_0x005e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement.BMk():boolean");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String rawString = C177518dv.A00.getRawString();
        String str = this.groupJid;
        if (!rawString.equals(str)) {
            throw new InvalidObjectException(AnonymousClass000.A0p("groupJid is not location Jid, only location Jid supported for now; groupJid=", str, AnonymousClass000.A0u()));
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A00 = A0I.AzT();
        this.A01 = C36411kG.A0l(A0I);
    }
}
