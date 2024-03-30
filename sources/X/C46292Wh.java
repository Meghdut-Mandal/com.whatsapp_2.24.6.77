package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.2Wh  reason: invalid class name and case insensitive filesystem */
public final class C46292Wh extends PhoneNumberPrivacyInfoView {
    public C87854Qk A00;
    public C27541Op A01;
    public boolean A02;

    public C46292Wh(Context context) {
        super(context, (AttributeSet) null);
        A03();
    }

    public final void setGroupDataChangeListeners$app_product_community_community_non_modified(C27541Op r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final C27541Op getGroupDataChangeListeners$app_product_community_community_non_modified() {
        C27541Op r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupDataChangeListeners");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27541Op groupDataChangeListeners$app_product_community_community_non_modified = getGroupDataChangeListeners$app_product_community_community_non_modified();
        C87854Qk r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("onRefreshListener");
        }
        groupDataChangeListeners$app_product_community_community_non_modified.A01(r0);
    }
}
