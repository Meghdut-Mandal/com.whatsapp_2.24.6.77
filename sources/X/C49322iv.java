package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2iv  reason: invalid class name and case insensitive filesystem */
public class C49322iv extends C132446Tt {
    public final AnonymousClass4UG A00;
    public final C51622o7 A01;
    public final WeakReference A02;

    public C49322iv(C225314u r2, AnonymousClass4UG r3, C51622o7 r4) {
        super(r2, true);
        this.A02 = AnonymousClass001.A0F(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r15) {
        /*
            r14 = this;
            X.4UG r1 = r14.A00
            X.2o7 r2 = r14.A01
            com.whatsapp.report.ReportActivity r1 = (com.whatsapp.report.ReportActivity) r1
            X.2o7 r0 = X.C51622o7.ACCOUNT
            if (r2 != r0) goto L_0x0088
            X.005 r0 = r1.A0H
        L_0x000c:
            java.lang.Object r0 = r0.get()
            X.3lB r0 = (X.C74173lB) r0
            if (r0 == 0) goto L_0x0090
            X.3DN r5 = r1.A09
            X.35S r4 = new X.35S
            r4.<init>(r0, r1)
            X.19A r7 = r5.A01
            java.lang.String r10 = r7.A09()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GdprXmppMethods/sendGetGdprReport; iq="
            X.C36321k7.A1Q(r0, r10, r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "action"
            java.lang.String r0 = "status"
            X.C36381kD.A1M(r1, r0, r3)
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r2 != r0) goto L_0x0040
            java.lang.String r1 = "report_type"
            java.lang.String r0 = "newsletters"
            X.C36381kD.A1M(r1, r0, r3)
        L_0x0040:
            r2 = 0
            X.1AL[] r0 = new X.AnonymousClass1AL[r2]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.1AL[] r1 = (X.AnonymousClass1AL[]) r1
            java.lang.String r0 = "gdpr"
            X.9nx r6 = new X.9nx
            r6.<init>(r0, r1)
            r0 = 4
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1V(r3, r2)
            r2 = 1
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C36341k9.A1L(r1, r0, r3, r2)
            r2 = 2
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36341k9.A1L(r1, r0, r3, r2)
            r0 = 3
            X.C36331k8.A1R(r10, r3, r0)
            X.9nx r9 = X.C36391kE.A0m(r6, r3)
            X.4tL r6 = new X.4tL
            r6.<init>()
            X.3Tq r8 = new X.3Tq
            r8.<init>(r6, r5, r4, r0)
            r11 = 168(0xa8, float:2.35E-43)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0E(r8, r9, r10, r11, r12)
        L_0x007f:
            r3 = 0
            if (r6 != 0) goto L_0x0092
            java.lang.String r0 = "send-get-gdpr-report/failed/callback is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x0088:
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r2 != r0) goto L_0x0090
            X.005 r0 = r1.A0I
            goto L_0x000c
        L_0x0090:
            r6 = 0
            goto L_0x007f
        L_0x0092:
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x009a }
            r6.get(r1, r0)     // Catch:{ Exception -> 0x009a }
            return r3
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "send-get-gdpr-report/timeout"
            com.whatsapp.util.Log.w(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49322iv.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A02);
        if (A0W != null && !A0W.BLh()) {
            this.A00.Bn9(this.A01);
        }
    }
}
