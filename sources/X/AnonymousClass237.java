package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

/* renamed from: X.237  reason: invalid class name */
public final class AnonymousClass237 extends ListItemWithLeftIcon {
    public AnonymousClass1X4 A00;
    public AnonymousClass4PX A01;
    public AnonymousClass3FH A02;
    public C24521Ct A03;
    public C24381Cf A04;
    public C45632Sc A05;
    public AnonymousClass147 A06;
    public C32641dx A07;
    public C19770wU A08;
    public boolean A09;
    public final CompoundButton.OnCheckedChangeListener A0A = new AnonymousClass4XY(this, 2);
    public final C225314u A0B;

    public AnonymousClass237(Context context) {
        super(context, (AttributeSet) null);
        A03();
        this.A0B = C36381kD.A0S(context);
        setIcon((int) R.drawable.ic_settings_notification);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
        C36321k7.A0N(this);
    }

    public final void setConversationObservers$app_product_community_community_non_modified(C24381Cf r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setMuteNotificationsInfoViewUpdateHelperFactory$app_product_community_community_non_modified(AnonymousClass4PX r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setUserActions$app_product_community_community_non_modified(AnonymousClass1X4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setUserMuteActions$app_product_community_community_non_modified(C32641dx r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setWaWorkers$app_product_community_community_non_modified(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final C24381Cf getConversationObservers$app_product_community_community_non_modified() {
        C24381Cf r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("conversationObservers");
    }

    public final AnonymousClass4PX getMuteNotificationsInfoViewUpdateHelperFactory$app_product_community_community_non_modified() {
        AnonymousClass4PX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("muteNotificationsInfoViewUpdateHelperFactory");
    }

    public final AnonymousClass1X4 getUserActions$app_product_community_community_non_modified() {
        AnonymousClass1X4 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("userActions");
    }

    public final C32641dx getUserMuteActions$app_product_community_community_non_modified() {
        C32641dx r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("userMuteActions");
    }

    public final C19770wU getWaWorkers$app_product_community_community_non_modified() {
        C19770wU r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final C225314u getActivity() {
        return this.A0B;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C24381Cf conversationObservers$app_product_community_community_non_modified = getConversationObservers$app_product_community_community_non_modified();
        C24521Ct r0 = this.A03;
        if (r0 == null) {
            throw C36331k8.A0d("conversationObserver");
        }
        conversationObservers$app_product_community_community_non_modified.unregisterObserver(r0);
    }
}
