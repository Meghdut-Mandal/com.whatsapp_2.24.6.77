package X;

import com.whatsapp.funstickers.report.bloks.WaBkFunReportInterpreterExtImpl$onReportSubmitted$1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.501  reason: invalid class name */
public class AnonymousClass501 extends C142266ob {
    public C121625tR A00;

    public AnonymousClass501(C121625tR r2) {
        super("wa.action.genai.stickers.ReportSubmitted");
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r7, C115215iW r8, C124125xd r9) {
        if (r8.A00.equals("wa.action.genai.stickers.ReportSubmitted")) {
            List list = r7.A00;
            String A0s = C36401kF.A0s(list, 0);
            String A0i = C90474aD.A0i(list);
            C121625tR r2 = this.A00;
            Log.i("WaBkFunReportInterpreterExtImpl/onReportSubmitted");
            if (!(A0s == null || A0i == null)) {
                C36331k8.A1T(new WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(r2, A0s, A0i, (C023509x) null), r2.A01);
            }
        }
        return null;
    }
}
