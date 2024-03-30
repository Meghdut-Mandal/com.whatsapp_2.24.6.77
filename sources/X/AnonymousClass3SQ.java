package X;

import com.whatsapp.report.activity.banreport.BanReportViewModel;
import java.io.IOException;

/* renamed from: X.3SQ  reason: invalid class name */
public class AnonymousClass3SQ implements C160087kR {
    public Object A00;
    public final int A01;

    public AnonymousClass3SQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void B2J(C123815x8 r7) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C74993mV r0 = (C74993mV) obj;
            BanReportViewModel banReportViewModel = r0.A01;
            int i2 = r0.A00 + 1;
            C36341k9.A0H().postDelayed(new C81293wm((Object) banReportViewModel, i2, 13), ((long) i2) * 5000);
            return;
        }
        C36341k9.A17(((BanReportViewModel) obj).A02, 4);
    }

    public void BVL(IOException iOException) {
        if (this.A01 != 0) {
            C36341k9.A17(((C74993mV) this.A00).A01.A02, 1);
        } else {
            BWk(iOException);
        }
    }

    public void BWk(Exception exc) {
        BanReportViewModel banReportViewModel;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            banReportViewModel = ((C74993mV) obj).A01;
        } else {
            banReportViewModel = (BanReportViewModel) obj;
        }
        C36341k9.A17(banReportViewModel.A02, 1);
    }
}
