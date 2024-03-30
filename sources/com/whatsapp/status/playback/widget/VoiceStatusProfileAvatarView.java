package com.whatsapp.status.playback.widget;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.C012005e;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class VoiceStatusProfileAvatarView extends FrameLayout {
    public WaImageView A00;
    public WaImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A00(context);
    }

    public final WaImageView getProfileAvatarImageView() {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            return waImageView;
        }
        throw C36331k8.A0d("profileAvatarImageView");
    }

    private final void A00(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A01 = (WaImageView) C36361kB.A0G(this, R.id.profile_avatar);
        this.A00 = (WaImageView) C36361kB.A0G(this, R.id.mic_overlay);
    }

    public final void setMicrophoneStrokeColor(int i) {
        Drawable A002 = AnonymousClass00E.A00(getContext(), R.drawable.mic_background_incoming_normal);
        if (A002 != null) {
            Drawable mutate = A002.mutate();
            AnonymousClass00C.A08(mutate);
            WaImageView waImageView = this.A00;
            if (waImageView == null) {
                throw C36331k8.A0d("micOverlayImageView");
            }
            waImageView.setBackground(mutate);
            WaImageView waImageView2 = this.A00;
            if (waImageView2 == null) {
                throw C36331k8.A0d("micOverlayImageView");
            }
            C012005e.A0F(ColorStateList.valueOf(i), waImageView2);
            return;
        }
        throw C36381kD.A0k();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A00(context);
    }
}
