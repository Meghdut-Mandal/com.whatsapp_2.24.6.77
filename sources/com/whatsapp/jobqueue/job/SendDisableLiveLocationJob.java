package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass1P5;
import X.AnonymousClass1PA;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C18800tq;
import X.C203399nx;
import X.C207209uj;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36411kG;
import X.C36421kH;
import X.C90464aC;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendDisableLiveLocationJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P5 A00;
    public transient AnonymousClass1PA A01;
    public final String rawJid;
    public final long sequenceNumber;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDisableLiveLocationJob(X.AnonymousClass11F r4, long r5) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.String r0 = r4.getRawString()
            r2.A00 = r0
            r1 = 1
            r2.A01 = r1
            com.whatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.whatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            X.C18740tg.A0B(r1)
            java.lang.String r0 = r4.getRawString()
            r3.rawJid = r0
            r3.sequenceNumber = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDisableLiveLocationJob.<init>(X.11F, long):void");
    }

    public static String A00(SendDisableLiveLocationJob sendDisableLiveLocationJob) {
        AnonymousClass11F A0N = C36421kH.A0N(sendDisableLiveLocationJob.rawJid);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jid=");
        A0u.append(A0N);
        A0u.append("; persistentId=");
        return C36411kG.A11(A0u, sendDisableLiveLocationJob.A01);
    }

    public void A0B() {
        String str;
        AnonymousClass11F A0N = C36421kH.A0N(this.rawJid);
        if (A0N == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("skip disable live location job; invalid jid: ");
            C36321k7.A1Z(A0u, this.rawJid);
            return;
        }
        boolean A0f = this.A00.A0f(A0N);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (A0f) {
            str = "skip disable live location job; sharing is currently enabled";
        } else {
            A0u2.append("starting disable live location job");
            C36321k7.A1a(A0u2, A00(this));
            AnonymousClass1PA r0 = this.A01;
            long j = this.sequenceNumber;
            AnonymousClass19A r7 = r0.A01;
            String A0A = r7.A0A();
            AnonymousClass9YT r02 = new AnonymousClass9YT();
            r02.A02 = A0N;
            r02.A05 = "notification";
            r02.A08 = "location";
            r02.A07 = A0A;
            C207209uj A012 = r02.A01();
            AnonymousClass1AL[] r5 = new AnonymousClass1AL[3];
            boolean A1Y = C36371kC.A1Y(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0A, r5);
            r5[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
            r5[2] = new AnonymousClass1AL((Jid) A0N, "to");
            AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.toString(j), r2, A1Y ? 1 : 0);
            r7.A07(new C203399nx(new C203399nx("disable", r2), "notification", r5), A012, 81).get();
            A0u2 = AnonymousClass000.A0u();
            str = "done disable live location job";
        }
        A0u2.append(str);
        C36321k7.A1a(A0u2, A00(this));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A01 = (AnonymousClass1PA) A0I.A4X.get();
        this.A00 = C36411kG.A0l(A0I);
    }
}
