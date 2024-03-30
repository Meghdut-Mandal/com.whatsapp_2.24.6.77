package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass19A;
import X.AnonymousClass1XT;
import X.AnonymousClass65C;
import X.AnonymousClass7i8;
import X.C18800tq;
import X.C18840tu;
import X.C19470v6;
import X.C19700wN;
import X.C19730wQ;
import X.C20810yC;
import X.C222813r;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C90524aI;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class GetVNameCertificateJob extends Job implements AnonymousClass7i8 {
    public static final ConcurrentHashMap A02 = C90524aI.A0s();
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1XT A00;
    public transient AnonymousClass65C A01;
    public final String jid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetVNameCertificateJob(com.whatsapp.jid.UserJid r4) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.String r0 = r4.getRawString()
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r1 = r4.getPrimaryDevice()
            X.C18740tg.A06(r1)
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r2.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            X.C18740tg.A05(r0)
            r3.jid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GetVNameCertificateJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    public static String A00(GetVNameCertificateJob getVNameCertificateJob) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jid=");
        A0u.append(C36431kI.A0l(getVNameCertificateJob.jid));
        A0u.append("; persistentId=");
        return C36411kG.A11(A0u, getVNameCertificateJob.A01);
    }

    public void A0B() {
        try {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetVNameCertificateJob/onRun, starting get vname certificate job");
            C36321k7.A1a(A0u, A00(this));
            AnonymousClass65C r2 = this.A01;
            String str = this.jid;
            C222813r r0 = UserJid.Companion;
            r2.A00(C222813r.A01(str)).get();
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("GetVNameCertificateJob/onRun, finished get vname certificate job");
            C36321k7.A1a(A0u2, A00(this));
            A02.remove(this.jid);
            return;
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            A02.remove(this.jid);
            throw th;
        }
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        C20810yC A0V = C36341k9.A0V(A0P);
        C19700wN A0V2 = C36391kE.A0V(A0P);
        C19730wQ A0N = C36351kA.A0N(A0P);
        AnonymousClass19A A0c = C36361kB.A0c(A0P);
        AnonymousClass005 A002 = C18840tu.A00(A0P.A9Y);
        AnonymousClass005 A003 = C18840tu.A00(A0P.A1C);
        AnonymousClass005 A004 = C18840tu.A00(A0P.A8u);
        this.A01 = new AnonymousClass65C(C19470v6.A00, A0V2, A0N, C36351kA.A0Y(A0P), A0V, A0c, A002, A003, A004, C18840tu.A00(A0P.A5w), C18840tu.A00(A0P.A5y), C18840tu.A00(A0P.A5x));
        this.A00 = (AnonymousClass1XT) A0P.A6b.get();
    }
}
