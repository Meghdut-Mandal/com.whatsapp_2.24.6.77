package X;

import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3qZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C77483qZ implements C88054Rf {
    public final /* synthetic */ ReportActivity A00;

    public /* synthetic */ C77483qZ(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }

    public final void Bsu() {
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A00.A08;
        Log.i("BusinessActivityReportViewModel/export-report");
        businessActivityReportViewModel.A0E.Boy(new C81153wY((Object) businessActivityReportViewModel, 28));
    }
}
