package X;

import com.whatsapp.WaTextView;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public final class C41131wi extends C02740Bs {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ BugReportingCategoriesActivity A01;
    public final /* synthetic */ AnonymousClass1RJ A02;

    public C41131wi(WaTextView waTextView, BugReportingCategoriesActivity bugReportingCategoriesActivity, AnonymousClass1RJ r3) {
        this.A01 = bugReportingCategoriesActivity;
        this.A02 = r3;
        this.A00 = waTextView;
    }

    public void A01() {
        C41081wa r0 = this.A01.A01;
        if (r0 == null) {
            throw C36331k8.A0d("bugCategoryListAdapter");
        }
        int size = r0.A00.size();
        AnonymousClass1RJ r02 = this.A02;
        if (size == 0) {
            r02.A03(0);
            this.A00.setVisibility(8);
            return;
        }
        r02.A03(8);
        this.A00.setVisibility(0);
    }
}
