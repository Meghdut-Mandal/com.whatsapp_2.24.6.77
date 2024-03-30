package X;

import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel$reportBug$1;
import java.util.List;

/* renamed from: X.3ts  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79533ts implements C25711Hj {
    public final /* synthetic */ InAppBugReportingViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C79533ts(InAppBugReportingViewModel inAppBugReportingViewModel, String str, String str2, String str3) {
        this.A00 = inAppBugReportingViewModel;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void accept(Object obj) {
        AnonymousClass3DD r0;
        String str;
        InAppBugReportingViewModel inAppBugReportingViewModel = this.A00;
        String str2 = this.A01;
        String str3 = this.A02;
        String str4 = this.A03;
        List<C54592tC> list = (List) obj;
        AnonymousClass00C.A0D(list, 4);
        for (C54592tC r1 : list) {
            if (r1 instanceof AnonymousClass2WT) {
                inAppBugReportingViewModel.A03 = ((AnonymousClass2WT) r1).A00;
                r0 = inAppBugReportingViewModel.A0D;
                str = "debug_info_fetched";
            } else if (r1 instanceof AnonymousClass2WU) {
                inAppBugReportingViewModel.A04 = ((AnonymousClass2WU) r1).A00;
                r0 = inAppBugReportingViewModel.A0D;
                str = "device_log_fetched";
            }
            r0.A00.markerPoint(476715896, str);
        }
        C36331k8.A1T(new InAppBugReportingViewModel$reportBug$1(inAppBugReportingViewModel, str2, str3, str4, (C023509x) null), C109325Xd.A00(inAppBugReportingViewModel));
    }
}
