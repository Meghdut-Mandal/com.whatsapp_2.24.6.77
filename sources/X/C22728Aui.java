package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.Aui  reason: case insensitive filesystem */
public final class C22728Aui extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C28291Sb A00;
    public transient C28981Uw A01;
    public transient AnonymousClass19A A02;
    public transient AnonymousClass1SM A03;
    public final String newsletterRawJid;
    public String receiptStanzaId;
    public List serverMessageIds;

    public boolean A0D(Exception exc) {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22728Aui(X.C28981Uw r4, java.lang.String r5, java.util.List r6) {
        /*
            r3 = this;
            X.673 r2 = new X.673
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "view-receipt-"
            java.lang.String r0 = X.C165607th.A0r(r4, r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A00 = r0
            X.AnonymousClass673.A00(r2)
            com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.whatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r2.A02(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A01()
            r3.<init>(r0)
            r3.A01 = r4
            r3.receiptStanzaId = r5
            r3.serverMessageIds = r6
            java.lang.String r0 = r4.getRawString()
            r3.newsletterRawJid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22728Aui.<init>(X.1Uw, java.lang.String, java.util.List):void");
    }

    private final String A00() {
        AnonymousClass11F A022 = AnonymousClass11F.A00.A02(this.newsletterRawJid);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("; jid=");
        A0u.append(A022);
        A0u.append("; id=");
        A0u.append(C165567td.A08(this.serverMessageIds, 0));
        A0u.append("; count=");
        return C36381kD.A10(A0u, this.serverMessageIds.size());
    }

    public void A0B() {
        A00();
        C28981Uw A012 = C28981Uw.A03.A01(this.newsletterRawJid);
        if (A012 != null) {
            List list = this.serverMessageIds;
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                long A09 = C36431kI.A09(next);
                AnonymousClass1SM r2 = this.A03;
                if (r2 == null) {
                    throw C36331k8.A0d("newsletterMessageStore");
                }
                AnonymousClass3T1 A022 = r2.A02(A012, A09);
                if (!(A09 <= 0 || A022 == null || A022.A0D == 16)) {
                    A0I.add(next);
                }
            }
            if (!A0I.isEmpty()) {
                AnonymousClass9YT A002 = AnonymousClass9YT.A00(A012);
                A002.A05 = "receipt";
                A002.A08 = "view";
                A002.A07 = this.receiptStanzaId;
                C207209uj A013 = A002.A01();
                String str = this.receiptStanzaId;
                ArrayList A0I2 = AnonymousClass001.A0I();
                C165577te.A16(A012, "to", A0I2);
                C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A0I2);
                C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "view", A0I2);
                AnonymousClass1AL[] A1a = C165577te.A1a(A0I2, 0);
                ArrayList A0I3 = AnonymousClass001.A0I();
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    long A0D = C36391kE.A0D(it);
                    AnonymousClass1AL[] A0k = C165617ti.A0k();
                    A0k[0] = new AnonymousClass1AL("server_id", A0D);
                    C203399nx.A0E("item", A0I3, A0k);
                }
                C203399nx r22 = new C203399nx(C203399nx.A05("list", (AnonymousClass1AL[]) null, C165577te.A1b(A0I3, 0)), "receipt", A1a);
                AnonymousClass19A r1 = this.A02;
                if (r1 == null) {
                    throw C36331k8.A0d("messageClient");
                }
                r1.A07(r22, A013, 407).get();
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    long A0D2 = C36391kE.A0D(it2);
                    AnonymousClass1SM r0 = this.A03;
                    if (r0 == null) {
                        throw C36331k8.A0d("newsletterMessageStore");
                    }
                    AnonymousClass3T1 A023 = r0.A02(A012, A0D2);
                    if (A023 != null) {
                        C28291Sb r12 = this.A00;
                        if (r12 == null) {
                            throw C36331k8.A0d("messageStatusStoreBridge");
                        }
                        r12.A01((C06120Sj) null, A023.A1J, 16);
                    }
                }
            }
        }
    }

    public void A09() {
        A00();
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendViewReceiptJob/onAdded; ");
        C36341k9.A1O(A0u, A00());
    }

    public void Bqf(Context context) {
        C18800tq A0P = C165577te.A0P(context);
        this.A02 = C36361kB.A0c(A0P);
        this.A03 = (AnonymousClass1SM) A0P.A5k.get();
        this.A00 = (C28291Sb) A0P.A5C.get();
    }
}
