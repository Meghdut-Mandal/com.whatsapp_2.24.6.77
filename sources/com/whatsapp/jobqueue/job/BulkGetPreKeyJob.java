package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass143;
import X.AnonymousClass19A;
import X.AnonymousClass7i8;
import X.C18800tq;
import X.C21010yW;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C44912Pi;
import X.C90464aC;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import org.whispersystems.jobqueue.Job;

public final class BulkGetPreKeyJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C21010yW A00;
    public transient AnonymousClass19A A01;
    public final int context;
    public final String[] identityChangedJids;
    public final String[] jids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BulkGetPreKeyJob(com.whatsapp.jid.DeviceJid[] r7, com.whatsapp.jid.DeviceJid[] r8, int r9) {
        /*
            r6 = this;
            X.673 r0 = new X.673
            r0.<init>()
            X.AnonymousClass673.A00(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r0.A01()
            r6.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r0)
            X.C18740tg.A0H(r0)
            r6.jids = r0
            if (r8 != 0) goto L_0x0037
            r0 = 0
        L_0x001f:
            r6.identityChangedJids = r0
            r6.context = r9
            int r5 = r7.length
            r4 = 0
            r2 = 0
        L_0x0026:
            java.lang.String r3 = "jid must be an individual jid; jid="
            if (r2 >= r5) goto L_0x0050
            r1 = r7[r2]
            if (r1 == 0) goto L_0x0049
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x0040
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0037:
            java.util.List r0 = java.util.Arrays.asList(r8)
            java.lang.String[] r0 = X.AnonymousClass143.A0O(r0)
            goto L_0x001f
        L_0x0040:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r1, r3, r0)
            throw r0
        L_0x0049:
            java.lang.String r0 = "an element of jids was empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0050:
            if (r8 == 0) goto L_0x0072
            int r2 = r8.length
        L_0x0053:
            if (r4 >= r2) goto L_0x0072
            r1 = r8[r4]
            if (r1 == 0) goto L_0x006b
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x0062
            int r4 = r4 + 1
            goto L_0x0053
        L_0x0062:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0P(r1, r3, r0)
            throw r0
        L_0x006b:
            java.lang.String r0 = "an element of identityChangedJids was empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.BulkGetPreKeyJob.<init>(com.whatsapp.jid.DeviceJid[], com.whatsapp.jid.DeviceJid[], int):void");
    }

    public static String A00(BulkGetPreKeyJob bulkGetPreKeyJob) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jids=");
        A0u.append(AnonymousClass143.A05(bulkGetPreKeyJob.jids));
        A0u.append("; context=");
        return C36381kD.A10(A0u, bulkGetPreKeyJob.context);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            DeviceJid nullable = DeviceJid.getNullable(strArr[i2]);
            if (nullable == null) {
                throw new InvalidObjectException("an element of jids was empty");
            } else if (!AnonymousClass143.A0G(nullable)) {
                i2++;
            } else {
                throw new InvalidObjectException(AnonymousClass000.A0l(nullable, "jid must be an individual jid; jid=", AnonymousClass000.A0u()));
            }
        }
        String[] strArr2 = this.identityChangedJids;
        if (strArr2 != null) {
            int length2 = strArr2.length;
            while (i < length2) {
                DeviceJid nullable2 = DeviceJid.getNullable(strArr2[i]);
                if (nullable2 == null) {
                    throw new InvalidObjectException("an element of identityChangedJids was empty");
                } else if (!AnonymousClass143.A0G(nullable2)) {
                    i++;
                } else {
                    throw new InvalidObjectException(AnonymousClass000.A0l(nullable2, "jid must be an individual jid; jid=", AnonymousClass000.A0u()));
                }
            }
        }
    }

    public void A0B() {
        ArrayList A0I;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("starting bulk get pre key job");
        C36321k7.A1a(A0u, A00(this));
        String A09 = this.A01.A09();
        Class<DeviceJid> cls = DeviceJid.class;
        ArrayList A06 = AnonymousClass143.A06(cls, Arrays.asList(this.jids));
        String[] strArr = this.identityChangedJids;
        if (strArr != null) {
            A0I = AnonymousClass143.A06(cls, Arrays.asList(strArr));
        } else {
            A0I = AnonymousClass001.A0I();
        }
        if (this.context != 0) {
            C44912Pi r1 = new C44912Pi();
            r1.A00 = Boolean.valueOf(C36411kG.A1a(A0I));
            r1.A02 = C36441kJ.A0y(A06.size());
            r1.A01 = Integer.valueOf(this.context);
            this.A00.Bly(r1);
        }
        AnonymousClass19A r5 = this.A01;
        Message obtain = Message.obtain((Handler) null, 0, 87, 0);
        obtain.getData().putString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
        obtain.getData().putParcelableArray("jids", (Jid[]) A06.toArray(new DeviceJid[0]));
        obtain.getData().putParcelableArray("identityJids", (Jid[]) A0I.toArray(new DeviceJid[0]));
        r5.A06(obtain, A09).get();
    }

    public void Bqf(Context context2) {
        C18800tq A0I = C90464aC.A0I(context2);
        this.A00 = C36351kA.A0g(A0I);
        this.A01 = C36361kB.A0c(A0I);
    }
}
