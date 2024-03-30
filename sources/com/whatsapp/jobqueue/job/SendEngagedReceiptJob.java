package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass19L;
import X.AnonymousClass6QB;
import X.AnonymousClass7i8;
import X.AnonymousClass9YT;
import X.C177528dw;
import X.C185718ug;
import X.C18740tg;
import X.C18800tq;
import X.C19970wo;
import X.C203399nx;
import X.C203539oF;
import X.C207209uj;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import X.C50672lI;
import android.content.Context;
import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import org.whispersystems.jobqueue.Job;

public final class SendEngagedReceiptJob extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C19970wo A00;
    public transient AnonymousClass19A A01;
    public transient AnonymousClass19L A02;
    public final String jidStr;
    public final long loggableStanzaId;
    public final String messageId;
    public final long originalMessageTimestamp;
    public final String source;
    public final String value;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendEngagedReceiptJob(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, long r10) {
        /*
            r3 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "engaged-receipt-"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            r3.jidStr = r4
            r3.messageId = r5
            r3.originalMessageTimestamp = r8
            r3.loggableStanzaId = r10
            r3.source = r6
            r3.value = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendEngagedReceiptJob.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        this.A00 = A0P.Bvc();
        this.A01 = C36361kB.A0c(A0P);
        this.A02 = (AnonymousClass19L) A0P.A4Y.get();
    }

    public void A0B() {
        AnonymousClass11F A022 = AnonymousClass11F.A00.A02(this.jidStr);
        if (A022 instanceof C177528dw) {
            long j = this.originalMessageTimestamp;
            if (j > 0) {
                long j2 = j + 86400000;
                C19970wo r0 = this.A00;
                if (r0 == null) {
                    throw C36331k8.A0d("time");
                } else if (j2 < C19970wo.A00(r0)) {
                    return;
                }
            }
        }
        AnonymousClass9YT A002 = AnonymousClass9YT.A00(A022);
        A002.A05 = "receipt";
        A002.A08 = "engaged";
        A002.A07 = this.messageId;
        A002.A00 = this.loggableStanzaId;
        C207209uj A012 = A002.A01();
        ArrayList arrayList = C50672lI.A00;
        String str = this.messageId;
        String str2 = this.value;
        String str3 = this.source;
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        C185718ug r1 = new C185718ug((UserJid) A022);
        AnonymousClass6QB A0q = C36441kJ.A0q("receipt");
        C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "engaged");
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        AnonymousClass6QB A0q2 = C36441kJ.A0q("biz");
        if (C203539oF.A0P(str2, 1, 9007199254740991L, false)) {
            C36331k8.A1D(A0q2, "value", str2);
        }
        A0q2.A09(str3, "source", C50672lI.A00);
        C36361kB.A1H(A0q2, A0q);
        ConditionVariable conditionVariable = C18740tg.A00;
        A0q.A06(r1.A00);
        C203399nx A03 = A0q.A03();
        AnonymousClass19A r12 = this.A01;
        if (r12 == null) {
            throw C36331k8.A0d("messageClient");
        }
        r12.A07(A03, A012, 360);
    }

    private final String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendEngagedReceiptJob(jidStr='");
        A0u.append(this.jidStr);
        A0u.append("', messageId='");
        A0u.append(this.messageId);
        A0u.append("', originalMessageTimestamp=");
        A0u.append(this.originalMessageTimestamp);
        A0u.append(", loggableStanzaId=");
        A0u.append(this.loggableStanzaId);
        A0u.append(", source='");
        A0u.append(this.source);
        A0u.append("', value='");
        A0u.append(this.value);
        return AnonymousClass000.A0q("')", A0u);
    }

    public void A09() {
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("canceled sent engaged receipts job: ");
        C36341k9.A1O(A0u, A00());
    }

    public boolean A0D(Exception exc) {
        StringBuilder A0i = C36341k9.A0i(exc);
        A0i.append("exception while running sent engaged receipts job: ");
        C36351kA.A1P(A00(), A0i, exc);
        return true;
    }
}
