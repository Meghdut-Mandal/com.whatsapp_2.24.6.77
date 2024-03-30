package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass1DM;
import X.AnonymousClass777;
import X.AnonymousClass7i8;
import X.C119505pv;
import X.C165337tG;
import X.C18800tq;
import X.C203399nx;
import X.C30911ay;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C90504aG;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class GeneratePrivacyTokenJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1DM A00;
    public transient UserJid A01;
    public transient C30911ay A02;
    public transient AnonymousClass19A A03;
    public transient boolean A04 = false;
    public final String toJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GeneratePrivacyTokenJob(com.whatsapp.jid.UserJid r4) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "generate-tc-token-"
            r1.append(r0)
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            r0 = 0
            r3.A04 = r0
            java.lang.String r0 = r4.getRawString()
            r3.toJid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    public void A0B() {
        Long l;
        UserJid userJid = this.A01;
        if (userJid == null) {
            Log.e("GeneratePrivacyTokenJob/onRun Stored UserJid String was invalid");
            return;
        }
        C119505pv A08 = this.A00.A08(userJid);
        if (A08 != null) {
            long j = A08.A00;
            l = Long.valueOf(j);
            if (l != null && j >= this.A00.A05()) {
                String A09 = this.A03.A09();
                AnonymousClass777 r9 = new AnonymousClass777();
                AnonymousClass19A r15 = this.A03;
                AnonymousClass1AL[] r0 = new AnonymousClass1AL[3];
                C90504aG.A1E(this.A01, "jid", r0, 0);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "trusted_contact", r0, 1);
                r0[2] = new AnonymousClass1AL("t", j);
                C203399nx r3 = new C203399nx(new C203399nx("token", r0), "tokens", (AnonymousClass1AL[]) null);
                AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
                C36331k8.A1R(A09, r2, 0);
                C36341k9.A1V(r2, 1);
                C36341k9.A1L("xmlns", "privacy", r2, 2);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r2, 3);
                C203399nx A0m = C36391kE.A0m(r3, r2);
                r15.A0K(new C165337tG(r9, this, l, 1), A0m, A09, 299, 32000);
                try {
                    r9.get();
                    this.A02.A01(this.A01);
                    return;
                } catch (Exception e) {
                    Log.e("GeneratePrivacyTokenJob/onRun Failed to deliver Privacy Token generate request");
                    throw e;
                }
            }
        } else {
            l = null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GeneratePrivacyTokenJob/onRun Token timestamp ");
        A0u.append(l);
        C36341k9.A1O(A0u, " missing or too old to send");
        this.A02.A01(this.A01);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A04 = true;
    }

    public void Bqf(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A03 = C36361kB.A0c(A0P);
        this.A00 = (AnonymousClass1DM) A0P.A6m.get();
        this.A02 = (C30911ay) A0P.A6n.get();
        UserJid A0l = C36431kI.A0l(this.toJid);
        this.A01 = A0l;
        if (this.A04 && A0l != null) {
            this.A02.A03(A0l);
        }
    }
}
