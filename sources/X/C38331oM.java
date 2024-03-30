package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import com.whatsapp.status.playback.widget.VoiceStatusContentView;

/* renamed from: X.1oM  reason: invalid class name and case insensitive filesystem */
public final class C38331oM extends FrameLayout implements C18700tb {
    public C20810yC A00;
    public BlurFrameLayout A01;
    public VoiceStatusContentView A02;
    public AnonymousClass1QZ A03;
    public boolean A04;

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView == null) {
            throw C36331k8.A0d("voiceStatusContentView");
        }
        ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(voiceStatusContentView);
        int dimensionPixelOffset = C36341k9.A0F(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
        A0K.setMargins(dimensionPixelOffset, A0K.topMargin, dimensionPixelOffset, A0K.bottomMargin);
        voiceStatusContentView.setLayoutParams(A0K);
        voiceStatusContentView.requestLayout();
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C88174Rr getWavesView() {
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView != null) {
            return voiceStatusContentView;
        }
        throw C36331k8.A0d("voiceStatusContentView");
    }

    public final void setBlurEnabled(boolean z) {
        BlurFrameLayout blurFrameLayout = this.A01;
        if (blurFrameLayout != null) {
            blurFrameLayout.setBlurEnabled(z);
        }
    }

    public C38331oM(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
        BlurFrameLayout blurFrameLayout = null;
        if (getAbProps().A0E(3229)) {
            View.inflate(context, R.layout.f9nameremoved, this);
        } else {
            View.inflate(context, R.layout.f9nameremoved, this);
            View A022 = C012005e.A02(this, R.id.blur_container);
            AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.status.playback.content.BlurFrameLayout");
            blurFrameLayout = (BlurFrameLayout) A022;
        }
        this.A01 = blurFrameLayout;
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) C36361kB.A0G(this, R.id.message_voice);
        this.A02 = voiceStatusContentView;
        if (voiceStatusContentView == null) {
            throw C36331k8.A0d("voiceStatusContentView");
        }
        voiceStatusContentView.A03 = new C77953rK(this);
    }

    private final void setBackgroundColorFromMessage(C46812bi r3) {
        int A002 = C55482uh.A00(C36371kC.A0B(this), r3);
        setBackgroundColor(A002);
        BlurFrameLayout blurFrameLayout = this.A01;
        if (blurFrameLayout != null) {
            blurFrameLayout.setBackgroundColor(A002);
        }
    }

    /* access modifiers changed from: private */
    public final void setMessage(C46812bi r2, AnonymousClass1RY r3) {
        setBackgroundColorFromMessage(r2);
        VoiceStatusContentView voiceStatusContentView = this.A02;
        if (voiceStatusContentView == null) {
            throw C36331k8.A0d("voiceStatusContentView");
        }
        voiceStatusContentView.setVoiceMessage(r2, r3);
    }
}
