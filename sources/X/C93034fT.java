package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.4fT  reason: invalid class name and case insensitive filesystem */
public final class C93034fT extends LinearLayout implements C88814Ud, C18700tb {
    public VoiceParticipantAudioWave A00;
    public AnonymousClass7gL A01;
    public C20810yC A02;
    public AnonymousClass1QZ A03;
    public Runnable A04;
    public boolean A05;
    public ValueAnimator A06;
    public AudioChatCallingViewModel A07;
    public final WaImageButton A08;
    public final WaImageButton A09;
    public final ViewStub A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final AnonymousClass1RJ A0D;
    public final AnonymousClass00T A0E;

    public C93034fT(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            this.A02 = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
        this.A0E = C36431kI.A1I(AnonymousClass7QF.A00);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        View A022 = C012005e.A02(this, R.id.end_call_btn);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        this.A08 = (WaImageButton) A022;
        View A023 = C012005e.A02(this, R.id.end_call_btn_container);
        AnonymousClass00C.A0E(A023, "null cannot be cast to non-null type android.widget.FrameLayout");
        C135456cj.A01(A023, this, 21);
        View A024 = C012005e.A02(this, R.id.title);
        AnonymousClass00C.A0E(A024, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        this.A0C = (WaTextView) A024;
        View A025 = C012005e.A02(this, R.id.subtitle);
        AnonymousClass00C.A0E(A025, "null cannot be cast to non-null type com.whatsapp.WaTextView");
        this.A0B = (WaTextView) A025;
        View A026 = C012005e.A02(this, R.id.audio_wave_view_stub);
        AnonymousClass00C.A0E(A026, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0A = (ViewStub) A026;
        this.A0D = C36341k9.A0X(this, R.id.dots_wave_view_stub);
        View A027 = C012005e.A02(this, R.id.mute_btn);
        AnonymousClass00C.A0E(A027, "null cannot be cast to non-null type com.whatsapp.WaImageButton");
        this.A09 = (WaImageButton) A027;
        View A028 = C012005e.A02(this, R.id.mute_btn_container);
        AnonymousClass00C.A0E(A028, "null cannot be cast to non-null type android.widget.FrameLayout");
        C135456cj.A01(A028, this, 22);
        setVisibility(8);
    }

    public static final void setViewModel$lambda$6(AudioChatCallingViewModel audioChatCallingViewModel, View view) {
        AnonymousClass00C.A0D(audioChatCallingViewModel, 0);
        audioChatCallingViewModel.A0I.A00(24, 37);
        AnonymousClass6YM r2 = audioChatCallingViewModel.A01;
        if (r2 != null) {
            AnonymousClass6YM.A0A(r2, (CallInfo) null, (String) null, 1);
        }
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public void setCallLogData(AnonymousClass6BK r1) {
    }

    public void setShouldHideCallDuration(boolean z) {
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
    }

    public static final void A02(C93034fT r7, AnonymousClass6DE r8) {
        int A002;
        Integer num = r8.A02;
        if (num != null) {
            A002 = AnonymousClass3UE.A01(r7.getResources(), num.intValue());
        } else {
            A002 = AnonymousClass00F.A00(r7.getContext(), R.color.f6nameremoved);
        }
        WaTextView waTextView = r7.A0C;
        waTextView.setText(C90474aD.A0V(r7, r8.A01));
        waTextView.setTextColor(A002);
        boolean z = r8.A05;
        if (z && r7.A00 == null) {
            View inflate = r7.A0A.inflate();
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave");
            r7.A00 = (VoiceParticipantAudioWave) inflate;
        }
        VoiceParticipantAudioWave voiceParticipantAudioWave = r7.A00;
        if (voiceParticipantAudioWave != null) {
            voiceParticipantAudioWave.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
        VoiceParticipantAudioWave voiceParticipantAudioWave2 = r7.A00;
        if (voiceParticipantAudioWave2 != null) {
            voiceParticipantAudioWave2.setColor(A002);
        }
        r7.A0B.setText(C90474aD.A0V(r7, r8.A00));
        WaImageButton waImageButton = r7.A09;
        waImageButton.setSelected(r8.A03);
        Context context = r7.getContext();
        boolean isSelected = waImageButton.isSelected();
        int i = R.string.f12nameremoved;
        if (isSelected) {
            i = R.string.f12nameremoved;
        }
        String string = context.getString(i);
        Context context2 = r7.getContext();
        boolean isSelected2 = waImageButton.isSelected();
        int i2 = R.string.f12nameremoved;
        if (isSelected2) {
            i2 = R.string.f12nameremoved;
        }
        AnonymousClass3UE.A06(waImageButton, string, context2.getString(i2));
        if (r8.A04) {
            AnonymousClass1RJ r4 = r7.A0D;
            if (C36391kE.A0L(r4, 0).getBackground() == null) {
                r4.A01().setBackground(r7.getAvdHolder().A00(C36371kC.A0B(r7), R.drawable.vec_voice_chat_dots_wave, true));
                return;
            }
            return;
        }
        r7.getAvdHolder().A02();
        AnonymousClass1RJ r2 = r7.A0D;
        if (r2.A00 != null) {
            r2.A01().setBackground((Drawable) null);
            r2.A03(8);
        }
    }

    private final AnonymousClass6C3 getAvdHolder() {
        return (AnonymousClass6C3) this.A0E.getValue();
    }

    /* access modifiers changed from: private */
    public final void setViewModel(AudioChatCallingViewModel audioChatCallingViewModel, AnonymousClass012 r5) {
        this.A07 = audioChatCallingViewModel;
        C165177t0.A00(r5, audioChatCallingViewModel.A0E, new AnonymousClass7SV(this), 4);
        C165177t0.A00(r5, audioChatCallingViewModel.A0F, AnonymousClass5X0.A02(this, 21), 3);
        C165177t0.A00(r5, audioChatCallingViewModel.A0D, AnonymousClass5X0.A02(this, 22), 2);
        setOnClickListener(new AnonymousClass3YE(audioChatCallingViewModel, this, 9));
        C135456cj.A01(this.A08, audioChatCallingViewModel, 23);
        this.A09.setOnClickListener(new AnonymousClass3YE(audioChatCallingViewModel, this, 10));
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
        C20810yC r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public void setShouldHideBanner(boolean z) {
        AudioChatCallingViewModel audioChatCallingViewModel = this.A07;
        if (audioChatCallingViewModel != null) {
            audioChatCallingViewModel.A0A = z;
            if (z) {
                C36341k9.A18(audioChatCallingViewModel.A0E, false);
            } else {
                C95504lc.A02(audioChatCallingViewModel.A0H, audioChatCallingViewModel);
            }
        }
    }

    public static final void A03(C93034fT r5, boolean z) {
        int measuredHeight;
        ValueAnimator valueAnimator;
        if (AnonymousClass000.A1Q(r5.getVisibility()) != z || ((valueAnimator = r5.A06) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = r5.A06;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                Runnable runnable = r5.A04;
                if (runnable != null) {
                    r5.removeCallbacks(runnable);
                }
                r5.A04 = new AnonymousClass75B(16, (Object) r5, z);
            } else if (((r5.getAbProps().A07(5091) >> 3) & 1) == 1) {
                r5.setVisibility(0);
                if (z) {
                    r5.setVisibilityInternal(true);
                }
                r5.measure(0, 0);
                if (z) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = r5.getMeasuredHeight();
                }
                int[] A1O = C36441kJ.A1O();
                A1O[0] = measuredHeight;
                A1O[1] = r5.getMeasuredHeight() - measuredHeight;
                ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
                ofInt.addListener(new C162287oL(2, r5, z));
                C111565cU.A00(ofInt, r5, 17);
                ofInt.setDuration(250);
                ofInt.setInterpolator(new DecelerateInterpolator());
                ofInt.start();
                r5.A06 = ofInt;
            } else {
                r5.setVisibilityInternal(z);
            }
        }
    }

    public static final void setViewModel$lambda$5(AudioChatCallingViewModel audioChatCallingViewModel, C93034fT r5, View view) {
        C36321k7.A0w(audioChatCallingViewModel, r5);
        Context A0B2 = C36371kC.A0B(r5);
        audioChatCallingViewModel.A0I.A00(7, 37);
        String str = audioChatCallingViewModel.A04;
        if (str != null) {
            AudioChatBottomSheetDialog.A0O.A00(A0B2, str);
        }
    }

    public static final void setViewModel$lambda$7(AudioChatCallingViewModel audioChatCallingViewModel, C93034fT r5, View view) {
        boolean A1a = C36331k8.A1a(audioChatCallingViewModel, r5);
        WaImageButton waImageButton = r5.A09;
        boolean z = true;
        if (waImageButton == null || waImageButton.isSelected() != A1a) {
            z = false;
        }
        AnonymousClass1PZ r2 = audioChatCallingViewModel.A0I;
        int i = 1;
        if (z) {
            i = 2;
        }
        r2.A00(i, 37);
        AnonymousClass6YM r1 = audioChatCallingViewModel.A01;
        if (r1 != null) {
            C90504aG.A17(new C1501574e(r1), r1);
        }
    }

    /* access modifiers changed from: private */
    public final void setVisibilityInternal(boolean z) {
        setVisibility(C36351kA.A00(z ? 1 : 0));
        AnonymousClass7gL r1 = this.A01;
        if (r1 != null) {
            r1.BkW(getVisibility());
        }
    }

    public int getBackgroundColorRes() {
        return R.color.f6nameremoved;
    }

    public static final void setViewModel$lambda$2(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void setViewModel$lambda$3(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void setViewModel$lambda$4(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public void setVisibilityChangeListener(AnonymousClass7gL r1) {
        this.A01 = r1;
    }
}
