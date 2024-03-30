package X;

import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportVideoActivity;

/* renamed from: X.3u6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79673u6 implements AnonymousClass4SM {
    public final /* synthetic */ SupportVideoActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C79673u6(SupportVideoActivity supportVideoActivity, String str) {
        this.A00 = supportVideoActivity;
        this.A01 = str;
    }

    public final void BWy(String str, String str2, boolean z) {
        String str3;
        SupportVideoActivity supportVideoActivity = this.A00;
        String str4 = this.A01;
        AnonymousClass5NI r2 = supportVideoActivity.A09;
        if (r2 == null) {
            throw C36331k8.A0d("videoPlayerControllerView");
        }
        r2.setPlayControlVisibility(8);
        AnonymousClass5NI r0 = supportVideoActivity.A09;
        if (r0 == null) {
            throw C36331k8.A0d("videoPlayerControllerView");
        }
        r0.A02();
        boolean A1R = C36431kI.A1R(supportVideoActivity);
        C39001qm A002 = AnonymousClass3LW.A00(supportVideoActivity);
        if (!A1R) {
            A002.A0K(R.string.f12nameremoved);
            A002.A0a(false);
            A002.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XN(supportVideoActivity, 30));
            C36371kC.A0O(A002).show();
            str3 = "NETWORK_ERROR";
        } else {
            A002.A0L(R.string.f12nameremoved);
            A002.A0K(R.string.f12nameremoved);
            A002.A0a(false);
            A002.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4XN(supportVideoActivity, 29));
            C36371kC.A0O(A002).show();
            str3 = "DOWNLOAD_FAILED";
        }
        C33761ft r4 = supportVideoActivity.A05;
        if (r4 != null) {
            String str5 = supportVideoActivity.A0A;
            String str6 = supportVideoActivity.A0B;
            C45582Rx r1 = new C45582Rx();
            r1.A01 = C36371kC.A0o();
            r1.A07 = str4;
            r1.A05 = str3;
            r1.A04 = str5;
            r1.A06 = str6;
            r4.A00.Blv(r1);
            return;
        }
        throw C36331k8.A0d("supportLogging");
    }
}
