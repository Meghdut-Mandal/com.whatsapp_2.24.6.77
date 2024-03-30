package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7tY  reason: invalid class name and case insensitive filesystem */
public class C165517tY implements C236119d {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C165517tY(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj2;
        this.A00 = i;
        this.A02 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r0 = X.C97324ov.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r1 > 4) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        r0 = X.C97334ow.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r2.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BVN(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.String r0 = "disclosuremetadatagetworker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r2 = r3.A01
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker r2 = (com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker) r2
            androidx.work.WorkerParameters r0 = r2.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x003c
            int r0 = r3.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker.A00(r2, r0)
            java.lang.Object r2 = r3.A02
            X.0UQ r2 = (X.AnonymousClass0UQ) r2
            goto L_0x0034
        L_0x0020:
            java.lang.String r0 = "DisclosureResetOnServerWorker/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r3.A01
            X.6Ec r0 = (X.C128916Ec) r0
            androidx.work.WorkerParameters r0 = r0.A01
            int r1 = r0.A00
            r0 = 4
            java.lang.Object r2 = r3.A02
            X.0UQ r2 = (X.AnonymousClass0UQ) r2
            if (r1 <= r0) goto L_0x0040
        L_0x0034:
            X.4ow r0 = X.C97334ow.A00()
        L_0x0038:
            r2.A00(r0)
            return
        L_0x003c:
            java.lang.Object r2 = r3.A02
            X.0UQ r2 = (X.AnonymousClass0UQ) r2
        L_0x0040:
            X.4ov r0 = X.C97324ov.A00()
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165517tY.BVN(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r1 > 4) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r0 = X.C97334ow.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r2.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r0 = X.C97324ov.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BWw(X.C203399nx r4, java.lang.String r5) {
        /*
            r3 = this;
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            android.util.Pair r2 = X.AnonymousClass3ME.A01(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "disclosuremetadatagetworker/onError "
            X.C36321k7.A1J(r2, r0, r1)
            if (r2 == 0) goto L_0x0022
            int r1 = X.C36381kD.A04(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0022
            java.lang.String r0 = "disclosuremetadatagetworker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0022:
            java.lang.Object r2 = r3.A01
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker r2 = (com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker) r2
            androidx.work.WorkerParameters r0 = r2.A01
            int r1 = r0.A00
            r0 = 4
            if (r1 <= r0) goto L_0x006a
            int r0 = r3.A00
            com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker.A00(r2, r0)
            java.lang.Object r2 = r3.A02
            X.0UQ r2 = (X.AnonymousClass0UQ) r2
            goto L_0x0062
        L_0x0037:
            android.util.Pair r2 = X.AnonymousClass3ME.A01(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DisclosureResetOnServertWorker/onError "
            X.C36321k7.A1J(r2, r0, r1)
            if (r2 == 0) goto L_0x0053
            int r1 = X.C36381kD.A04(r2)
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0053
            java.lang.String r0 = "DisclosureResetOnServertWorker/onError invalid stanza"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0053:
            java.lang.Object r0 = r3.A01
            X.6Ec r0 = (X.C128916Ec) r0
            androidx.work.WorkerParameters r0 = r0.A01
            int r1 = r0.A00
            r0 = 4
            java.lang.Object r2 = r3.A02
            X.0UQ r2 = (X.AnonymousClass0UQ) r2
            if (r1 <= r0) goto L_0x006e
        L_0x0062:
            X.4ow r0 = X.C97334ow.A00()
        L_0x0066:
            r2.A00(r0)
            return
        L_0x006a:
            java.lang.Object r2 = r3.A02
            X.0UQ r2 = (X.AnonymousClass0UQ) r2
        L_0x006e:
            X.4ov r0 = X.C97324ov.A00()
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C165517tY.BWw(X.9nx, java.lang.String):void");
    }

    public void BiM(C203399nx r20, String str) {
        AnonymousClass1Z6 A002;
        switch (this.A03) {
            case 0:
                DisclosureMetadataGetWorker disclosureMetadataGetWorker = (DisclosureMetadataGetWorker) this.A01;
                int i = this.A00;
                List A0j = r20.A0j("notice");
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it = A0j.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C203399nx A0s = C36431kI.A0s(it);
                    int A0R = A0s.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A0R2 = A0s.A0R("stage");
                    long A0U = 1000 * A0s.A0U("t");
                    int A0R3 = A0s.A0R("version");
                    if (A0s.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0) != 2 || A0R2 <= -1 || A0R2 >= 1000) {
                        C36321k7.A1U("disclosuremetadatagetworker/parseusernoticemetadatalist not valid PDFN metadata id = ", AnonymousClass000.A0u(), A0R);
                    } else {
                        A0I.add(new C65613Su(A0R, A0R2, A0R3, A0U, 2));
                        if (A0R == i) {
                            z = true;
                        }
                    }
                }
                if (!A0I.isEmpty() && (A002 = disclosureMetadataGetWorker.A02.A00(2)) != null) {
                    A002.BJZ(A0I, false, false);
                }
                if (!z) {
                    DisclosureMetadataGetWorker.A00(disclosureMetadataGetWorker, i);
                    break;
                }
                break;
            case 1:
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("disclosureresetOnservertWorker/onsuccess disclosureId = ");
                C36321k7.A1Y(A0u, this.A00);
                break;
            default:
                return;
        }
        ((AnonymousClass0UQ) this.A02).A00(C97344ox.A00());
    }
}
