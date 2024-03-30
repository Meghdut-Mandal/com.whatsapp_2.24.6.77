package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.privacy.usernotice.UserNoticeModalIconView;

/* renamed from: X.5HR  reason: invalid class name */
public abstract class AnonymousClass5HR extends C101034wm {
    public C19770wU A00;
    public AnonymousClass5M9 A01;

    public abstract int getTargetIconSize();

    public void A04(AnonymousClass647 r6) {
        setContentDescription(r6.A04);
        AnonymousClass5M9 r0 = this.A01;
        if (r0 != null) {
            r0.A0D(true);
        }
        if (r6.A01(getContext()) == null) {
            A05(r6);
            return;
        }
        AnonymousClass5M9 r4 = new AnonymousClass5M9(r6, this);
        this.A01 = r4;
        this.A00.Box(r4, r6.A01(getContext()));
    }

    public void A05(AnonymousClass647 r7) {
        int i;
        if (this instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) this;
            C011504z.A04(AnonymousClass00E.A00(userNoticeModalIconView.getContext(), R.drawable.user_notice_modal_default_icon_background), userNoticeModalIconView);
            userNoticeModalIconView.A00.setImageResource(R.drawable.user_notice_banner_icon);
            userNoticeModalIconView.A00.setColorFilter(userNoticeModalIconView.getResources().getColor(C224514j.A00(userNoticeModalIconView.A00.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
            userNoticeModalIconView.A00.setVisibility(0);
            return;
        }
        if (!(r7 instanceof AnonymousClass5HM)) {
            setColorFilter(getResources().getColor(C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
            i = R.drawable.user_notice_banner_icon;
        } else {
            i = R.drawable.ga_banner;
        }
        setImageResource(i);
    }

    public AnonymousClass5HR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnonymousClass5HR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass5HR(Context context) {
        super(context);
    }
}
