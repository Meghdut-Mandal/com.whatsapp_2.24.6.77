package X;

import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.4Yh  reason: invalid class name and case insensitive filesystem */
public class C89894Yh implements C160107kT {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89894Yh(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BW6(boolean z) {
        if (this.A02 != 0) {
            Log.i("statusdownload/status-cancelled");
            C65553Sn r2 = (C65553Sn) this.A01;
            r2.A00 = null;
            r2.A01 = null;
            C65553Sn.A00(C65553Sn.A06, (AnonymousClass2bU) this.A00, r2);
            return;
        }
        C36321k7.A1X("BusinessActivityReportManager/download-report/on-download-canceled transferred -> ", AnonymousClass000.A0u(), z);
        if (!z) {
            C31881cX r22 = (C31881cX) this.A00;
            File A09 = r22.A01.A09();
            if (A09.exists() && !A09.delete()) {
                Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
            }
            r22.A03.A15(2);
        }
    }

    public void BW7(C133136Wx r5, C129166Fp r6) {
        AnonymousClass2bU r2;
        C65013Qj r0;
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(r5, 0);
            Log.i("statusdownload/status-completed");
            C65553Sn r3 = (C65553Sn) this.A01;
            while (true) {
                ArrayList arrayList = r3.A04;
                r2 = null;
                if (arrayList.size() <= 0) {
                    break;
                }
                Object remove = arrayList.remove(0);
                AnonymousClass00C.A08(remove);
                r2 = (AnonymousClass2bU) remove;
                AnonymousClass2bU r02 = r3.A00;
                if ((r02 == null || !AnonymousClass00C.A0J(r2.A1J, r02.A1J)) && (r0 = r2.A01) != null && !r0.A0V) {
                    break;
                }
            }
            r3.A00 = null;
            r3.A01 = null;
            C65553Sn.A00(r5, (AnonymousClass2bU) this.A00, r3);
            if (r2 != null) {
                int i = 0;
                if (C65703Td.A01(r3.A02, r2)) {
                    i = 3;
                }
                C65553Sn.A01(r2, r3, i);
                return;
            }
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessActivityReportManager/download-report/on-download-completed success -> ");
        boolean A03 = r5.A03();
        C36331k8.A1S(A0u, A03);
        if (A03) {
            C31881cX r22 = (C31881cX) this.A00;
            synchronized (r22) {
                r22.A03.A15(4);
            }
            Log.i("BusinessActivityReportViewModel/download-report/on-success");
            BusinessActivityReportViewModel businessActivityReportViewModel = ((C61603Cs) this.A01).A00;
            C36341k9.A17(businessActivityReportViewModel.A02, businessActivityReportViewModel.A05.A00());
            return;
        }
        Log.i("BusinessActivityReportViewModel/download-report/on-error");
        BusinessActivityReportViewModel businessActivityReportViewModel2 = ((C61603Cs) this.A01).A00;
        BusinessActivityReportViewModel.A01(businessActivityReportViewModel2);
        C36341k9.A17(businessActivityReportViewModel2.A01, 5);
        ((C31881cX) this.A00).A03.A15(2);
    }

    public /* synthetic */ void BW4(long j) {
    }
}
