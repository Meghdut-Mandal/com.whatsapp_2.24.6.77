package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

/* renamed from: X.232  reason: invalid class name */
public final class AnonymousClass232 extends ListItemWithLeftIcon {
    public AnonymousClass4PW A00;
    public C62513Gl A01;
    public AnonymousClass1CR A02;
    public boolean A03;
    public final AnonymousClass155 A04;

    public AnonymousClass232(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A04 = (AnonymousClass155) C24801Dv.A01(context, AnonymousClass155.class);
        C36321k7.A0N(this);
        setIcon((int) R.drawable.vec_ic_media_visibility);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
    }

    public final void setChatSettingsStore$app_product_community_community_non_modified(AnonymousClass1CR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setMediaVisibilityInfoUpdateHelperFactory$app_product_community_community_non_modified(AnonymousClass4PW r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1CR getChatSettingsStore$app_product_community_community_non_modified() {
        AnonymousClass1CR r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatSettingsStore");
    }

    public final AnonymousClass4PW getMediaVisibilityInfoUpdateHelperFactory$app_product_community_community_non_modified() {
        AnonymousClass4PW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mediaVisibilityInfoUpdateHelperFactory");
    }

    public final AnonymousClass155 getActivity() {
        return this.A04;
    }
}
