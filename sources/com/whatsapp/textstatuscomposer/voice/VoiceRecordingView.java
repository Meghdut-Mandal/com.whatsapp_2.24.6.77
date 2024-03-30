package com.whatsapp.textstatuscomposer.voice;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass13J;
import X.AnonymousClass142;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RY;
import X.AnonymousClass3UY;
import X.AnonymousClass7d7;
import X.AnonymousClass7d8;
import X.C012005e;
import X.C017507m;
import X.C018607y;
import X.C106915Lv;
import X.C141756nm;
import X.C148836zV;
import X.C148846zW;
import X.C148856zX;
import X.C158567hi;
import X.C160187kb;
import X.C163467qF;
import X.C164757sK;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18840tu;
import X.C19730wQ;
import X.C27731Pn;
import X.C27751Pr;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C37151lt;
import X.C67103Yn;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.status.playback.widget.VoiceStatusProfileAvatarView;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;

public final class VoiceRecordingView extends ConstraintLayout implements C160187kb, C18700tb, C158567hi {
    public View A00;
    public View A01;
    public Animation A02;
    public TextView A03;
    public C19730wQ A04;
    public WaImageButton A05;
    public C27731Pn A06;
    public VoiceVisualizer A07;
    public C27751Pr A08;
    public AnonymousClass7d7 A09;
    public VoiceStatusRecordingVisualizer A0A;
    public AnonymousClass7d8 A0B;
    public AnonymousClass13J A0C;
    public VoiceNoteSeekBar A0D;
    public AnonymousClass005 A0E;
    public AnonymousClass005 A0F;
    public AnonymousClass1QZ A0G;
    public AnonymousClass1RY A0H;
    public VoiceStatusProfileAvatarView A0I;
    public boolean A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0K = new C164757sK(this, 25);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        View A022 = C012005e.A02(this, R.id.voice_status_profile_avatar);
        AnonymousClass00C.A08(A022);
        this.A0I = (VoiceStatusProfileAvatarView) A022;
        View A023 = C012005e.A02(this, R.id.voice_status_preview_delete);
        AnonymousClass00C.A08(A023);
        this.A01 = A023;
        View A024 = C012005e.A02(this, R.id.voice_status_remaining_seconds_view);
        AnonymousClass00C.A08(A024);
        this.A03 = (TextView) A024;
        View A025 = C012005e.A02(this, R.id.voice_status_preview_playback);
        AnonymousClass00C.A08(A025);
        this.A05 = (WaImageButton) A025;
        View A026 = C012005e.A02(this, R.id.voice_status_flashing_recording_view);
        AnonymousClass00C.A08(A026);
        this.A00 = A026;
        View A027 = C012005e.A02(this, R.id.voice_status_preview_visualizer);
        AnonymousClass00C.A08(A027);
        this.A07 = (VoiceVisualizer) A027;
        View A028 = C012005e.A02(this, R.id.voice_status_recording_visualizer);
        AnonymousClass00C.A08(A028);
        this.A0A = (VoiceStatusRecordingVisualizer) A028;
        View A029 = C012005e.A02(this, R.id.voice_status_preview_seek_bar);
        AnonymousClass00C.A08(A029);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A029;
        voiceNoteSeekBar.A02 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A05(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C148846zW(this));
        this.A05.setOnClickListener(new C67103Yn((Object) this, 48));
        this.A01.setOnClickListener(new C67103Yn((Object) this, 47));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new C163467qF(this, 0));
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setPathDrawableHelper(C27751Pr r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemFeatures(AnonymousClass13J r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setSystemServicesLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0E = r2;
    }

    public void setUICallback(AnonymousClass7d7 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public void setUICallbacks(AnonymousClass7d8 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setWhatsAppLocaleLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0F = r2;
    }

    private final void A01() {
        WaImageView profileAvatarImageView = this.A0I.getProfileAvatarImageView();
        C27751Pr pathDrawableHelper = getPathDrawableHelper();
        profileAvatarImageView.setImageDrawable(C27751Pr.A00(C36361kB.A09(this), getResources(), C141756nm.A00, pathDrawableHelper.A00, R.drawable.avatar_contact));
        C19730wQ meManager = getMeManager();
        meManager.A0G();
        AnonymousClass142 r2 = meManager.A0E;
        if (r2 != null) {
            this.A0H.A0B(profileAvatarImageView, r2, true);
        }
    }

    /* access modifiers changed from: private */
    public final int getPreviewSegmentsCount() {
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer != null) {
            return (int) Math.floor((double) (C36441kJ.A01(voiceVisualizer) / voiceVisualizer.A0B));
        }
        throw C36331k8.A0d("previewVoiceVisualizer");
    }

    public void A06() {
        if (!this.A0J) {
            this.A0J = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36351kA.A0N(A0W);
            this.A06 = C36351kA.A0T(A0W);
            this.A0C = C36351kA.A0q(A0W);
            this.A08 = (C27751Pr) A0W.A64.get();
            this.A0E = C18840tu.A00(A0W.A8W);
            this.A0F = C18840tu.A00(A0W.A9X);
        }
    }

    public void BJP() {
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
        }
        this.A02 = null;
        C017507m r3 = new C017507m(3);
        r3.A06(200);
        r3.A02 = 0;
        r3.A07(new DecelerateInterpolator());
        C018607y.A02(this, r3);
        this.A03.setVisibility(4);
        this.A0A.setVisibility(4);
        this.A01.setVisibility(0);
        this.A05.setVisibility(0);
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("previewVoiceVisualizer");
        }
        voiceVisualizer.setVisibility(0);
        this.A0D.setVisibility(0);
        setSeekbarContentDescription(0);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0G;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0G = r0;
        }
        return r0.generatedComponent();
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C27751Pr getPathDrawableHelper() {
        C27751Pr r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pathDrawableHelper");
    }

    public final AnonymousClass13J getSystemFeatures() {
        AnonymousClass13J r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("systemFeatures");
    }

    public final AnonymousClass005 getSystemServicesLazy() {
        AnonymousClass005 r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("systemServicesLazy");
    }

    public final AnonymousClass005 getWhatsAppLocaleLazy() {
        AnonymousClass005 r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("whatsAppLocaleLazy");
    }

    public void setSeekbarContentDescription(long j) {
        this.A0D.setContentDescription(C36321k7.A0A(getContext(), AnonymousClass3UY.A0A((C18820ts) getWhatsAppLocaleLazy().get(), j), R.string.f12nameremoved));
    }

    /* access modifiers changed from: private */
    public final void setupPreviewProgressIndicatorSizes(boolean z) {
        Resources A0F2 = C36341k9.A0F(this);
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = A0F2.getDimensionPixelSize(i);
        Resources A0F3 = C36341k9.A0F(this);
        int i2 = R.dimen.f7nameremoved;
        if (z) {
            i2 = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize2 = A0F3.getDimensionPixelSize(i2);
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("previewVoiceVisualizer");
        }
        voiceVisualizer.setProgressBubbleRadius((float) dimensionPixelSize);
        voiceVisualizer.setProgressBubbleStokeWidth((float) dimensionPixelSize2);
    }

    public void BJQ() {
        getSystemFeatures();
        this.A00.setVisibility(8);
        Animation animation = this.A02;
        if (animation != null) {
            animation.cancel();
        }
        this.A02 = null;
        this.A03.setVisibility(0);
        this.A0A.setVisibility(0);
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("previewVoiceVisualizer");
        }
        voiceVisualizer.setVisibility(4);
        this.A05.setVisibility(4);
        this.A01.setVisibility(4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("previewVoiceVisualizer");
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0K);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0H.A02();
        AnonymousClass7d7 r3 = this.A09;
        if (r3 != null) {
            C148836zV r32 = (C148836zV) r3;
            C37151lt r0 = r32.A06;
            if (r0 != null) {
                r0.A0E.clear();
            }
            C148836zV.A03(r32, false);
            C106915Lv r02 = r32.A04;
            if (r02 != null) {
                r02.A00.clear();
            }
            C106915Lv r03 = r32.A04;
            if (r03 != null) {
                r03.A0D(true);
            }
            r32.A04 = null;
            C106915Lv r04 = r32.A03;
            if (r04 != null) {
                r04.A00.clear();
            }
            C106915Lv r05 = r32.A03;
            if (r05 != null) {
                r05.A0D(true);
            }
            r32.A03 = null;
            C148856zX r06 = r32.A07;
            if (r06 != null) {
                r06.A00 = null;
            }
            C148836zV.A02(r32, r32.A09);
            r32.A09 = null;
        }
        AnonymousClass7d8 r2 = this.A0B;
        if (r2 != null) {
            C148856zX r22 = (C148856zX) r2;
            r22.A08.A0B(r22.A09);
            r22.A05.A0B(r22.A0A);
            r22.A04.removeCallbacks(r22.A03);
            C148856zX.A01(r22);
        }
        VoiceVisualizer voiceVisualizer = this.A07;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("previewVoiceVisualizer");
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0K);
        }
    }

    public final void setBackgroundTint(int i) {
        C012005e.A0F(ColorStateList.valueOf(i), this);
        this.A0I.setMicrophoneStrokeColor(i);
    }

    public void setRemainingSeconds(int i) {
        String A072 = AnonymousClass3UY.A07((C18820ts) getWhatsAppLocaleLazy().get(), (long) i);
        AnonymousClass00C.A08(A072);
        this.A03.setText(A072);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0K = new C164757sK(this, 25);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        View A022 = C012005e.A02(this, R.id.voice_status_profile_avatar);
        AnonymousClass00C.A08(A022);
        this.A0I = (VoiceStatusProfileAvatarView) A022;
        View A023 = C012005e.A02(this, R.id.voice_status_preview_delete);
        AnonymousClass00C.A08(A023);
        this.A01 = A023;
        View A024 = C012005e.A02(this, R.id.voice_status_remaining_seconds_view);
        AnonymousClass00C.A08(A024);
        this.A03 = (TextView) A024;
        View A025 = C012005e.A02(this, R.id.voice_status_preview_playback);
        AnonymousClass00C.A08(A025);
        this.A05 = (WaImageButton) A025;
        View A026 = C012005e.A02(this, R.id.voice_status_flashing_recording_view);
        AnonymousClass00C.A08(A026);
        this.A00 = A026;
        View A027 = C012005e.A02(this, R.id.voice_status_preview_visualizer);
        AnonymousClass00C.A08(A027);
        this.A07 = (VoiceVisualizer) A027;
        View A028 = C012005e.A02(this, R.id.voice_status_recording_visualizer);
        AnonymousClass00C.A08(A028);
        this.A0A = (VoiceStatusRecordingVisualizer) A028;
        View A029 = C012005e.A02(this, R.id.voice_status_preview_seek_bar);
        AnonymousClass00C.A08(A029);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A029;
        voiceNoteSeekBar.A02 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A05(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C148846zW(this));
        this.A05.setOnClickListener(new C67103Yn((Object) this, 48));
        this.A01.setOnClickListener(new C67103Yn((Object) this, 47));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new C163467qF(this, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0K = new C164757sK(this, 25);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        View A022 = C012005e.A02(this, R.id.voice_status_profile_avatar);
        AnonymousClass00C.A08(A022);
        this.A0I = (VoiceStatusProfileAvatarView) A022;
        View A023 = C012005e.A02(this, R.id.voice_status_preview_delete);
        AnonymousClass00C.A08(A023);
        this.A01 = A023;
        View A024 = C012005e.A02(this, R.id.voice_status_remaining_seconds_view);
        AnonymousClass00C.A08(A024);
        this.A03 = (TextView) A024;
        View A025 = C012005e.A02(this, R.id.voice_status_preview_playback);
        AnonymousClass00C.A08(A025);
        this.A05 = (WaImageButton) A025;
        View A026 = C012005e.A02(this, R.id.voice_status_flashing_recording_view);
        AnonymousClass00C.A08(A026);
        this.A00 = A026;
        View A027 = C012005e.A02(this, R.id.voice_status_preview_visualizer);
        AnonymousClass00C.A08(A027);
        this.A07 = (VoiceVisualizer) A027;
        View A028 = C012005e.A02(this, R.id.voice_status_recording_visualizer);
        AnonymousClass00C.A08(A028);
        this.A0A = (VoiceStatusRecordingVisualizer) A028;
        View A029 = C012005e.A02(this, R.id.voice_status_preview_seek_bar);
        AnonymousClass00C.A08(A029);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A029;
        voiceNoteSeekBar.A02 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A05(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C148846zW(this));
        this.A05.setOnClickListener(new C67103Yn((Object) this, 48));
        this.A01.setOnClickListener(new C67103Yn((Object) this, 47));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new C163467qF(this, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceRecordingView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0K = new C164757sK(this, 25);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        View A022 = C012005e.A02(this, R.id.voice_status_profile_avatar);
        AnonymousClass00C.A08(A022);
        this.A0I = (VoiceStatusProfileAvatarView) A022;
        View A023 = C012005e.A02(this, R.id.voice_status_preview_delete);
        AnonymousClass00C.A08(A023);
        this.A01 = A023;
        View A024 = C012005e.A02(this, R.id.voice_status_remaining_seconds_view);
        AnonymousClass00C.A08(A024);
        this.A03 = (TextView) A024;
        View A025 = C012005e.A02(this, R.id.voice_status_preview_playback);
        AnonymousClass00C.A08(A025);
        this.A05 = (WaImageButton) A025;
        View A026 = C012005e.A02(this, R.id.voice_status_flashing_recording_view);
        AnonymousClass00C.A08(A026);
        this.A00 = A026;
        View A027 = C012005e.A02(this, R.id.voice_status_preview_visualizer);
        AnonymousClass00C.A08(A027);
        this.A07 = (VoiceVisualizer) A027;
        View A028 = C012005e.A02(this, R.id.voice_status_recording_visualizer);
        AnonymousClass00C.A08(A028);
        this.A0A = (VoiceStatusRecordingVisualizer) A028;
        View A029 = C012005e.A02(this, R.id.voice_status_preview_seek_bar);
        AnonymousClass00C.A08(A029);
        VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) A029;
        voiceNoteSeekBar.A02 = true;
        voiceNoteSeekBar.setMax(1000);
        this.A0D = voiceNoteSeekBar;
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A0H = getContactPhotos().A05(getContext(), "voice-recording-view");
        A01();
        this.A0A.setListener(new C148846zW(this));
        this.A05.setOnClickListener(new C67103Yn((Object) this, 48));
        this.A01.setOnClickListener(new C67103Yn((Object) this, 47));
        setupPreviewProgressIndicatorSizes(false);
        this.A0D.setOnSeekBarChangeListener(new C163467qF(this, 0));
    }

    public VoiceRecordingView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A06();
    }
}
