package X;

import com.whatsapp.report.ReportActivity;

/* renamed from: X.3ow  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C76483ow implements AnonymousClass4RS {
    public final /* synthetic */ C74173lB A00;
    public final /* synthetic */ ReportActivity A01;

    public /* synthetic */ C76483ow(C74173lB r1, ReportActivity reportActivity) {
        this.A01 = reportActivity;
        this.A00 = r1;
    }

    public final void Bou(int i) {
        ReportActivity reportActivity = this.A01;
        C74173lB r2 = this.A00;
        C36321k7.A1S("send-get-gdpr-report/failed/error ", AnonymousClass000.A0u(), i);
        if (i == 404) {
            r2.A08();
        } else {
            C81153wY.A00(reportActivity.A05, reportActivity, 33);
        }
    }
}
