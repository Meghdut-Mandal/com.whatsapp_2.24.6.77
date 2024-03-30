package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.views.VoipReturnToCallBanner;

/* renamed from: X.4em  reason: invalid class name and case insensitive filesystem */
public final class C92814em extends FrameLayout implements C88814Ud, C18700tb {
    public AnonymousClass012 A00;
    public C93034fT A01;
    public AudioChatCallingViewModel A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public AnonymousClass7gL A05;
    public final VoipReturnToCallBanner A06;

    public C92814em(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        View A022 = C012005e.A02(this, R.id.return_to_call_banner);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.calling.views.VoipReturnToCallBanner");
        this.A06 = (VoipReturnToCallBanner) A022;
        setVisibility(8);
    }

    public void setCallLogData(AnonymousClass6BK r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06.A02 = r2;
    }

    /* access modifiers changed from: private */
    public final void setAudioChatViewModel(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass012 r2) {
        this.A02 = audioChatCallingViewModel;
        this.A00 = r2;
    }

    /* access modifiers changed from: private */
    public final void setupVoiceChatBanner(boolean z) {
        if (z && this.A01 == null) {
            Context A0B = C36371kC.A0B(this);
            AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
            if (audioChatCallingViewModel == null) {
                throw C36331k8.A0d("audioChatViewModel");
            }
            AnonymousClass012 r0 = this.A00;
            if (r0 == null) {
                throw C36331k8.A0d("lifeCycleOwner");
            }
            C93034fT r1 = new C93034fT(A0B);
            r1.setViewModel(audioChatCallingViewModel, r0);
            this.A01 = r1;
            AnonymousClass7gL r02 = this.A05;
            if (r02 == null) {
                throw C36331k8.A0d("visibilityChangeListener");
            }
            r1.A01 = r02;
            addView(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public int getBackgroundColorRes() {
        C93034fT r0 = this.A01;
        if (r0 == null || r0.getVisibility() != 0) {
            return this.A06.getBackgroundColorRes();
        }
        return R.color.f6nameremoved;
    }

    public void setShouldHideBanner(boolean z) {
        C93034fT r0 = this.A01;
        if (r0 != null) {
            r0.setShouldHideBanner(z);
        }
        this.A06.setShouldHideBanner(z);
    }

    public void setShouldHideCallDuration(boolean z) {
        this.A06.setShouldHideCallDuration(z);
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
        this.A06.setShouldShowGenericContactOrGroupName(z);
    }

    public void setVisibilityChangeListener(AnonymousClass7gL r3) {
        C144396s7 r1 = new C144396s7(this, r3);
        this.A05 = r1;
        this.A06.A03 = r1;
        C93034fT r0 = this.A01;
        if (r0 != null) {
            r0.A01 = r1;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new C1501574e(this, 21));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AudioChatCallingViewModel audioChatCallingViewModel = this.A02;
        if (audioChatCallingViewModel == null) {
            throw C36331k8.A0d("audioChatViewModel");
        }
        audioChatCallingViewModel.A0E.A0B(new C165177t0(AnonymousClass5X0.A02(this, 24), 6));
    }
}
