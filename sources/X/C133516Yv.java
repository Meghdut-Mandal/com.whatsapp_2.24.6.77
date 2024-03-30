package X;

import android.content.DialogInterface;
import com.whatsapp.community.CommunitySpamReportDialogFragment;

/* renamed from: X.6Yv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133516Yv implements DialogInterface.OnClickListener {
    public final /* synthetic */ CommunitySpamReportDialogFragment A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C133516Yv(CommunitySpamReportDialogFragment communitySpamReportDialogFragment, AnonymousClass11F r2, String str) {
        this.A00 = communitySpamReportDialogFragment;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CommunitySpamReportDialogFragment communitySpamReportDialogFragment = this.A00;
        String str = this.A02;
        AnonymousClass11F r2 = this.A01;
        AnonymousClass3Os r1 = communitySpamReportDialogFragment.A03;
        C36321k7.A0w(str, r2);
        AnonymousClass3Os.A00(r1, r2, str, 2);
    }
}
