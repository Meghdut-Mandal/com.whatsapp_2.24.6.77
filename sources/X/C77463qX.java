package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.3qX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C77463qX implements C88044Re {
    public final /* synthetic */ ReportActivity A00;

    public /* synthetic */ C77463qX(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }

    public final void B5F() {
        boolean z;
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A00.A08;
        if (businessActivityReportViewModel.A03.A0M()) {
            C36341k9.A16(businessActivityReportViewModel.A01, 1);
            C76793pS r6 = businessActivityReportViewModel.A0B;
            if (r6.A02.A09()) {
                AnonymousClass19A r5 = r6.A03;
                String A09 = r5.A09();
                AnonymousClass1AL[] r3 = new AnonymousClass1AL[1];
                boolean A1Y = C36371kC.A1Y("action", "delete", r3);
                C203399nx r4 = new C203399nx("p2b", r3);
                AnonymousClass1AL[] r32 = new AnonymousClass1AL[6];
                C36341k9.A1V(r32, A1Y ? 1 : 0);
                C36341k9.A1L("from", C36371kC.A0e(r6.A01).getRawString(), r32, 1);
                C36351kA.A1N("xmlns", "w:biz:p2b_report", r32);
                C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r32);
                r32[4] = new AnonymousClass1AL("smax_id", "31");
                r32[5] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
                r5.A0F(r6, C36391kE.A0m(r4, r32), A09, 266, 32000);
                z = true;
            } else {
                z = false;
            }
            C36321k7.A1X("app/sendDeleteReport success:", AnonymousClass000.A0u(), z);
        }
    }
}
