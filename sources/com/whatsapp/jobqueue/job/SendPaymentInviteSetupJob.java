package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C165587tf;
import X.C18740tg;
import X.C18800tq;
import X.C203399nx;
import X.C207209uj;
import X.C222813r;
import X.C29121Vk;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36411kG;
import X.C90464aC;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPaymentInviteSetupJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass19A A00;
    public transient C29121Vk A01;
    public final boolean inviteUsed;
    public final String jidRawStr;
    public final int paymentService;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPaymentInviteSetupJob(com.whatsapp.jid.UserJid r3, int r4, boolean r5) {
        /*
            r2 = this;
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "SendPaymentInviteSetupJob"
            r1.A00 = r0
            X.AnonymousClass673.A00(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r2.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            r2.jidRawStr = r0
            r2.paymentService = r4
            r2.inviteUsed = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPaymentInviteSetupJob.<init>(com.whatsapp.jid.UserJid, int, boolean):void");
    }

    private String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jid=");
        A0u.append(this.jidRawStr);
        A0u.append("; service: ");
        A0u.append(this.paymentService);
        A0u.append("; inviteUsed: ");
        A0u.append(this.inviteUsed);
        A0u.append("; persistentId=");
        return C36411kG.A11(A0u, this.A01);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jidRawStr)) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (this.paymentService == 0) {
            throw new InvalidObjectException("payment service must not be unknown");
        }
    }

    public void A09() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: SendPaymentInviteSetupJob notif job added: ");
        C36321k7.A1a(A0u, A00());
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("canceled SendPaymentInviteSetupJob job");
        C36341k9.A1O(A0u, A00());
    }

    public void A0B() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: starting SendPaymentInviteSetupJob job");
        C36321k7.A1a(A0u, A00());
        String A0A = this.A00.A0A();
        AnonymousClass9YT r2 = new AnonymousClass9YT();
        String str2 = this.jidRawStr;
        C222813r r1 = UserJid.Companion;
        r2.A02 = r1.A02(str2);
        r2.A05 = "notification";
        r2.A08 = "pay";
        r2.A07 = A0A;
        C207209uj A012 = r2.A01();
        UserJid A02 = r1.A02(this.jidRawStr);
        int i = this.paymentService;
        boolean z = this.inviteUsed;
        AnonymousClass1AL[] r7 = {new AnonymousClass1AL((Jid) A02, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "pay"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0A)};
        C203399nx[] r3 = new C203399nx[1];
        AnonymousClass1AL[] r22 = new AnonymousClass1AL[3];
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "account-set-up", r22, 0);
        if (i == 1) {
            str = "FBPAY";
        } else if (i == 2) {
            str = "NOVI";
        } else if (i != 3) {
            str = null;
        } else {
            str = "UPI";
        }
        C18740tg.A06(str);
        C36341k9.A1L("service", str, r22, 1);
        r22[2] = new AnonymousClass1AL("invite-used", z ? 1 : 0);
        C203399nx.A0H("invite", r22, r3, 0);
        this.A00.A07(C203399nx.A05("notification", r7, r3), A012, 272);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("PAY: done SendPaymentInviteSetupJob job");
        C36321k7.A1a(A0u2, A00());
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("exception while running SendPaymentInviteSetupJob job");
        C36351kA.A1P(A00(), A0u, exc);
        return true;
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A00 = C36361kB.A0c(A0I);
        this.A01 = C165587tf.A0T(A0I);
    }
}
