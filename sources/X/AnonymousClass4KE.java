package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.4KE  reason: invalid class name */
public final class AnonymousClass4KE extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KE(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C54572tA r4 = (C54572tA) obj;
        LinearLayout linearLayout = this.this$0.A02;
        if (linearLayout == null) {
            throw C36331k8.A0d("screenshotsGroup");
        }
        View childAt = linearLayout.getChildAt(0);
        AnonymousClass00C.A0E(childAt, "null cannot be cast to non-null type com.whatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
        AnonymousClass00C.A0B(r4);
        InAppBugReportingActivity.A0H(inAppBugReportingActivity, r4, (C38941qW) childAt, 0);
        return AnonymousClass0AJ.A00;
    }
}
