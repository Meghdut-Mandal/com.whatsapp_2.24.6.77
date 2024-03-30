package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass7i8;
import X.C130256Ki;
import X.C165427tP;
import X.C18830tt;
import X.C203399nx;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C65463Se;
import X.C90504aG;
import X.C99424tL;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;

public final class SendStatusPrivacyListJob extends Job implements AnonymousClass7i8 {
    public static volatile long A01 = 0;
    @Deprecated
    public static final long serialVersionUID = 1;
    public transient C130256Ki A00;
    public final Collection jids;
    public final int statusDistribution;

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        this.A00 = C18830tt.ACg(C36371kC.A0P(applicationContext).AfI.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendStatusPrivacyListJob(java.util.Collection r3, int r4) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "SendStatusPrivacyListJob"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            r2.statusDistribution = r4
            if (r3 == 0) goto L_0x001e
            java.util.ArrayList r0 = X.AnonymousClass143.A07(r3)
        L_0x001b:
            r2.jids = r0
            return
        L_0x001e:
            r0 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendStatusPrivacyListJob.<init>(java.util.Collection, int):void");
    }

    public void A0B() {
        ArrayList arrayList;
        C203399nx[] r8;
        String str;
        if (A01 != this.A01) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("skip send status privacy job");
            A0u.append(A00(this));
            A0u.append("; lastJobId=");
            C36351kA.A1S(A0u, A01);
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("run send status privacy job");
        C36321k7.A1a(A0u2, A00(this));
        AtomicInteger atomicInteger = new AtomicInteger();
        C130256Ki r6 = this.A00;
        if (r6 != null) {
            int i = this.statusDistribution;
            Collection collection = this.jids;
            if (collection != null) {
                arrayList = AnonymousClass001.A0I();
                AnonymousClass143.A0B(AnonymousClass11F.class, collection, arrayList);
            } else {
                arrayList = null;
            }
            C165427tP r7 = new C165427tP(atomicInteger, 0);
            C99424tL r4 = new C99424tL();
            AnonymousClass19A r14 = r6.A02;
            String A09 = r14.A09();
            if (arrayList == null || arrayList.size() <= 0) {
                r8 = null;
            } else {
                ArrayList A0J = C36321k7.A0J(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass1AL[] r62 = new AnonymousClass1AL[1];
                    C90504aG.A1E((Jid) it.next(), "jid", r62, 0);
                    A0J.add(new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r62));
                }
                r8 = (C203399nx[]) A0J.toArray(new C203399nx[0]);
            }
            if (i == 0) {
                str = "contacts";
            } else if (i != 1) {
                str = "blacklist";
            } else {
                str = "whitelist";
            }
            AnonymousClass1AL[] r63 = new AnonymousClass1AL[1];
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, r63, 0);
            C203399nx r82 = new C203399nx(new C203399nx("list", r63, r8), "privacy", (AnonymousClass1AL[]) null);
            AnonymousClass1AL[] r64 = new AnonymousClass1AL[4];
            C36331k8.A1R(A09, r64, 0);
            C36341k9.A1L("xmlns", "status", r64, 1);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r64, 2);
            C36341k9.A1V(r64, 3);
            r14.A0K(new C65463Se(r4, r7, 2), C36391kE.A0m(r82, r64), A09, 120, 32000);
            r4.get();
        }
        int i2 = atomicInteger.get();
        if (i2 == 500) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("server 500 error during send status privacy job");
            throw new Exception(AnonymousClass000.A0q(A00(this), A0u3));
        } else if (i2 != 0) {
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("server error code returned during send status privacy job; errorCode=");
            A0u4.append(i2);
            C36341k9.A1O(A0u4, A00(this));
        }
    }

    public static final String A00(SendStatusPrivacyListJob sendStatusPrivacyListJob) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; statusDistribution=");
        A0u.append(sendStatusPrivacyListJob.statusDistribution);
        A0u.append("; jids=");
        Collection collection = sendStatusPrivacyListJob.jids;
        if (collection != null) {
            ArrayList A14 = C36441kJ.A14(collection.size());
            AnonymousClass143.A0D(collection, A14);
            str = Arrays.toString(A14.toArray(new Jid[0]));
            AnonymousClass00C.A08(str);
        } else {
            str = "null";
        }
        A0u.append(str);
        A0u.append("; persistentId=");
        return C36411kG.A11(A0u, sendStatusPrivacyListJob.A01);
    }
}
