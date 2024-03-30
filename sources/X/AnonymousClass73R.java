package X;

import com.whatsapp.community.CommunitySpamReportDialogFragment;
import java.util.List;

/* renamed from: X.73R  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73R implements Runnable {
    public final /* synthetic */ C39971uO A00;
    public final /* synthetic */ CommunitySpamReportDialogFragment A01;
    public final /* synthetic */ AnonymousClass141 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass73R(C39971uO r1, CommunitySpamReportDialogFragment communitySpamReportDialogFragment, AnonymousClass141 r3, String str, boolean z) {
        this.A01 = communitySpamReportDialogFragment;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = z;
        this.A00 = r1;
    }

    public final void run() {
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = this.A01;
        AnonymousClass141 r5 = this.A02;
        String str = this.A03;
        boolean z = this.A04;
        C39971uO r3 = this.A00;
        communitySpamReportDialogFragment.A02.A01(r5, str, (List) null);
        communitySpamReportDialogFragment.A00.A02();
        communitySpamReportDialogFragment.A00.A0H(new AnonymousClass752(communitySpamReportDialogFragment, r3, 16, z));
    }
}
