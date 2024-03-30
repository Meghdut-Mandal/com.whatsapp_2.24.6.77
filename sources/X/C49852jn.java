package X;

import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2jn  reason: invalid class name and case insensitive filesystem */
public class C49852jn extends C132446Tt {
    public final AnonymousClass17Y A00;
    public final AnonymousClass4UG A01;
    public final C51622o7 A02;
    public final WeakReference A03;

    public C49852jn(C225314u r2, AnonymousClass17Y r3, AnonymousClass4UG r4, C51622o7 r5) {
        super(r2, true);
        this.A03 = AnonymousClass001.A0F(r2);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null && !A0W.BLh()) {
            A0W.Bu2(0, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A03);
        if (A0W != null && !A0W.BLh()) {
            A0W.Bnv();
            this.A01.Bn9(this.A02);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            long r9 = android.os.SystemClock.elapsedRealtime()
            r3 = r18
            X.4UG r4 = r3.A01
            X.2o7 r2 = r3.A02
            com.whatsapp.report.ReportActivity r4 = (com.whatsapp.report.ReportActivity) r4
            X.2o7 r0 = X.C51622o7.ACCOUNT
            if (r2 != r0) goto L_0x00b6
            X.005 r0 = r4.A0H
        L_0x0012:
            java.lang.Object r1 = r0.get()
            X.3lB r1 = (X.C74173lB) r1
            if (r1 == 0) goto L_0x00be
            X.3DN r7 = r4.A09
            java.util.Objects.requireNonNull(r1)
            r0 = 30
            X.3wY r6 = new X.3wY
            r6.<init>((java.lang.Object) r1, (int) r0)
            X.3ow r5 = new X.3ow
            r5.<init>(r1, r4)
            X.19A r11 = r7.A01
            java.lang.String r14 = r11.A09()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GdprXmppMethods/sendDeleteGdprReport; iq="
            X.C36321k7.A1Q(r0, r14, r1)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "action"
            java.lang.String r0 = "delete"
            X.C36381kD.A1M(r1, r0, r4)
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r2 != r0) goto L_0x0050
            java.lang.String r1 = "report_type"
            java.lang.String r0 = "newsletters"
            X.C36381kD.A1M(r1, r0, r4)
        L_0x0050:
            r2 = 0
            X.1AL[] r0 = new X.AnonymousClass1AL[r2]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.1AL[] r1 = (X.AnonymousClass1AL[]) r1
            java.lang.String r0 = "gdpr"
            X.9nx r8 = new X.9nx
            r8.<init>(r0, r1)
            r0 = 4
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]
            X.C36341k9.A1V(r4, r2)
            r2 = 1
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C36341k9.A1L(r1, r0, r4, r2)
            r2 = 2
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C36341k9.A1L(r1, r0, r4, r2)
            r0 = 3
            X.C36331k8.A1R(r14, r4, r0)
            X.9nx r13 = X.C36391kE.A0m(r8, r4)
            X.4tL r4 = new X.4tL
            r4.<init>()
            X.3Tc r12 = new X.3Tc
            r12.<init>(r4, r5, r7, r6)
            r15 = 169(0xa9, float:2.37E-43)
            r16 = 32000(0x7d00, double:1.581E-319)
            r11.A0E(r12, r13, r14, r15, r16)
        L_0x008f:
            r5 = 0
            if (r4 != 0) goto L_0x009f
            java.lang.String r0 = "send-request-gdpr-report/failed/callback is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.17Y r1 = r3.A00
            r0 = 36
            X.C81153wY.A00(r1, r3, r0)
        L_0x009e:
            return r5
        L_0x009f:
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00c1 }
            r4.get(r1, r0)     // Catch:{ Exception -> 0x00c1 }
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r9
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x009e
            long r1 = r1 - r3
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x009e }
            goto L_0x00c0
        L_0x00b6:
            X.2o7 r0 = X.C51622o7.NEWSLETTER
            if (r2 != r0) goto L_0x00be
            X.005 r0 = r4.A0I
            goto L_0x0012
        L_0x00be:
            r4 = 0
            goto L_0x008f
        L_0x00c0:
            return r5
        L_0x00c1:
            r1 = move-exception
            java.lang.String r0 = "send-request-gdpr-report/timeout"
            com.whatsapp.util.Log.w(r0, r1)
            X.17Y r1 = r3.A00
            r0 = 36
            X.C81153wY.A00(r1, r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49852jn.A08(java.lang.Object[]):java.lang.Object");
    }
}
