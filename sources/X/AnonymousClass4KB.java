package X;

import android.content.Intent;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.4KB  reason: invalid class name */
public final class AnonymousClass4KB extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BugReportingCategoriesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KB(BugReportingCategoriesActivity bugReportingCategoriesActivity) {
        super(1);
        this.this$0 = bugReportingCategoriesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C601936v r4 = (C601936v) obj;
        AnonymousClass00C.A0D(r4, 0);
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("bug_category_title", r4.A02);
        A0D.putExtra("bug_category_type", r4.A00);
        this.this$0.setResult(-1, A0D);
        this.this$0.finish();
        return AnonymousClass0AJ.A00;
    }
}
