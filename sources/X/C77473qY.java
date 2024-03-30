package X;

import com.whatsapp.report.ReportActivity;

/* renamed from: X.3qY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C77473qY implements C88044Re {
    public final /* synthetic */ C51622o7 A00;
    public final /* synthetic */ ReportActivity A01;

    public /* synthetic */ C77473qY(C51622o7 r1, ReportActivity reportActivity) {
        this.A01 = reportActivity;
        this.A00 = r1;
    }

    public final void B5F() {
        ReportActivity reportActivity = this.A01;
        C51622o7 r2 = this.A00;
        if (reportActivity.A05.A0M()) {
            if (reportActivity.A0E != null) {
                reportActivity.A0E = null;
            }
            C49852jn r1 = new C49852jn(reportActivity, reportActivity.A05, reportActivity, r2);
            reportActivity.A0E = r1;
            C36331k8.A1F(r1, reportActivity.A04);
        }
    }
}
