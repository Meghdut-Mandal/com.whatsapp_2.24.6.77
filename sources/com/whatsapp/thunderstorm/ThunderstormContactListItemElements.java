package com.whatsapp.thunderstorm;

import X.AnonymousClass00C;
import X.AnonymousClass0BT;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class ThunderstormContactListItemElements extends LinearLayout implements C18700tb {
    public LottieAnimationView A00;
    public LottieAnimationView A01;
    public LottieAnimationView A02;
    public LottieAnimationView A03;
    public WaTextView A04;
    public C18820ts A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public View A08;
    public LinearLayout A09;
    public WaTextView A0A;
    public WDSProfilePhoto A0B;

    public final void setListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        this.A09.setOnClickListener(onClickListener);
    }

    public final void setText(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A0A.setText(str);
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final double getTransferSendingProgress() {
        LottieAnimationView lottieAnimationView = this.A01;
        if (lottieAnimationView != null) {
            return (double) lottieAnimationView.getProgress();
        }
        throw C36331k8.A0d("transferSendingProgressBarAnimation");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void setIcon(Integer num) {
        if (num == null) {
            this.A0B.setVisibility(8);
            return;
        }
        WDSProfilePhoto wDSProfilePhoto = this.A0B;
        wDSProfilePhoto.setVisibility(0);
        wDSProfilePhoto.setImageDrawable(AnonymousClass0BT.A00((Resources.Theme) null, getResources(), num.intValue()));
    }

    public final void setSubtitle(Integer num) {
        WaTextView waTextView = this.A04;
        if (num == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        waTextView.setText(num.intValue());
    }

    public final void setTransferSendingProgress(double d) {
        LottieAnimationView lottieAnimationView = this.A01;
        if (lottieAnimationView != null) {
            lottieAnimationView.setProgress((float) d);
        }
    }

    public ThunderstormContactListItemElements(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            this.A05 = C36331k8.A0C(generatedComponent());
        }
    }

    public final int getLayout() {
        return R.layout.f9nameremoved;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormContactListItemElements(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A07) {
            this.A07 = true;
            this.A05 = C36331k8.A0C(generatedComponent());
        }
        View A0J = C36371kC.A0J(LayoutInflater.from(context), this, R.layout.f9nameremoved, false);
        this.A08 = A0J;
        this.A0B = (WDSProfilePhoto) C36361kB.A0G(A0J, R.id.thunderstorm_contact_row_profile_icon);
        this.A0A = C36341k9.A0Q(this.A08, R.id.thunderstorm_contact_row_text);
        this.A04 = C36341k9.A0Q(this.A08, R.id.thunderstorm_contact_row_subtitle);
        this.A09 = (LinearLayout) C36361kB.A0G(this.A08, R.id.thunderstorm_contact_row_container);
        this.A08.setVisibility(0);
        addView(this.A08);
    }
}
