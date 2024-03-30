package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.info.views.StarredMessageInfoView;

/* renamed from: X.2Wj  reason: invalid class name and case insensitive filesystem */
public final class C46302Wj extends StarredMessageInfoView {
    public AnonymousClass4OA A00;
    public AnonymousClass2EH A01;
    public boolean A02;

    public C46302Wj(Context context) {
        super(context, (AttributeSet) null);
        A03();
        C36321k7.A0N(this);
    }

    public final void setGroupChatInfoViewModelFactory$app_product_community_community_non_modified(AnonymousClass4OA r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass4OA getGroupChatInfoViewModelFactory$app_product_community_community_non_modified() {
        AnonymousClass4OA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatInfoViewModelFactory");
    }
}
