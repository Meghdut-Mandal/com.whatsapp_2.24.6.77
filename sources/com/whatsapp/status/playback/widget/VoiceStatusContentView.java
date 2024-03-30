package com.whatsapp.status.playback.widget;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass1EM;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RY;
import X.AnonymousClass3UY;
import X.C012005e;
import X.C018107s;
import X.C18700tb;
import X.C18750th;
import X.C18800tq;
import X.C18820ts;
import X.C18840tu;
import X.C19730wQ;
import X.C27751Pr;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C46812bi;
import X.C53562rW;
import X.C55482uh;
import X.C68553c5;
import X.C70123ed;
import X.C70133ee;
import X.C77953rK;
import X.C87304Og;
import X.C87314Oh;
import X.C88174Rr;
import X.C90104Zc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import java.util.List;

public final class VoiceStatusContentView extends ConstraintLayout implements C18700tb, C88174Rr {
    public ValueAnimator A00;
    public VoiceVisualizer A01;
    public C70123ed A02;
    public C87304Og A03;
    public VoiceStatusProfileAvatarView A04;
    public C87314Oh A05;
    public AnonymousClass005 A06;
    public AnonymousClass005 A07;
    public AnonymousClass005 A08;
    public AnonymousClass005 A09;
    public AnonymousClass005 A0A;
    public AnonymousClass005 A0B;
    public AnonymousClass1QZ A0C;
    public TextView A0D;
    public boolean A0E;
    public final ValueAnimator.AnimatorUpdateListener A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0I = AnonymousClass001.A0I();
        this.A0G = AnonymousClass001.A0I();
        this.A0H = AnonymousClass001.A0I();
        this.A0F = new C53562rW(this, 12);
        this.A0J = new C90104Zc(this, 33);
        A01(context);
    }

    public final void setContactAvatarsLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setContactManagerLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setGroupChatUtilsLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setMeManagerLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setPathDrawableHelperLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public void setUiCallback(C87314Oh r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocaleLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public static final void A02(VoiceStatusContentView voiceStatusContentView) {
        BlurFrameLayout blurFrameLayout;
        C87304Og r0 = voiceStatusContentView.A03;
        if (r0 != null && (blurFrameLayout = ((C77953rK) r0).A00.A01) != null) {
            blurFrameLayout.A07 = true;
            blurFrameLayout.invalidate();
        }
    }

    /* access modifiers changed from: private */
    public final int getPreviewWavesSegmentsCount() {
        VoiceVisualizer voiceVisualizer = this.A01;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("voiceVisualizer");
        }
        float A012 = C36441kJ.A01(voiceVisualizer);
        VoiceVisualizer voiceVisualizer2 = this.A01;
        if (voiceVisualizer2 != null) {
            return (int) Math.floor((double) (A012 / voiceVisualizer2.A0B));
        }
        throw C36331k8.A0d("voiceVisualizer");
    }

    public void A06() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A09 = C18840tu.A00(A0W.A4g);
            this.A07 = C18840tu.A00(A0W.A2A);
            this.A0B = C18840tu.A00(A0W.A9X);
            this.A08 = C18840tu.A00(A0W.A3l);
            this.A06 = C18840tu.A00(A0W.A28);
            this.A0A = C18840tu.A00(A0W.A64);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass005 getContactAvatarsLazy() {
        AnonymousClass005 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatarsLazy");
    }

    public final AnonymousClass005 getContactManagerLazy() {
        AnonymousClass005 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactManagerLazy");
    }

    public final AnonymousClass005 getGroupChatUtilsLazy() {
        AnonymousClass005 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatUtilsLazy");
    }

    public final AnonymousClass005 getMeManagerLazy() {
        AnonymousClass005 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManagerLazy");
    }

    public final AnonymousClass005 getPathDrawableHelperLazy() {
        AnonymousClass005 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pathDrawableHelperLazy");
    }

    public final AnonymousClass005 getWhatsAppLocaleLazy() {
        AnonymousClass005 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("whatsAppLocaleLazy");
    }

    public void setVoiceVisualizerSegments(List list) {
        Boolean bool = C18750th.A03;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            valueAnimator.removeUpdateListener(this.A0F);
        }
        this.A00 = null;
        List list2 = this.A0I;
        list2.clear();
        List list3 = this.A0G;
        list2.addAll(list3);
        if (list != null) {
            list3.clear();
            for (Object A032 : list) {
                list3.add(Float.valueOf(C36441kJ.A03(A032) * ((float) (((double) 0.8f) + (Math.random() * ((double) 0.19999999f))))));
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(0);
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(this.A0F);
        ofFloat.start();
        this.A00 = ofFloat;
        A02(this);
    }

    private final void A01(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A04 = (VoiceStatusProfileAvatarView) C36361kB.A0G(this, R.id.voice_status_profile_avatar);
        this.A0D = C36341k9.A0M(this, R.id.voice_duration);
        this.A01 = (VoiceVisualizer) C36361kB.A0G(this, R.id.voice_status_visualizer);
        setBackgroundResource(R.drawable.voice_status_content_view_background);
        C36361kB.A10(getResources(), this, R.dimen.f7nameremoved);
    }

    private final void setBackgroundColorFromMessage(C46812bi r4) {
        int A032 = C018107s.A03(0.2f, C55482uh.A00(C36371kC.A0B(this), r4), -16777216);
        C012005e.A0F(ColorStateList.valueOf(A032), this);
        VoiceStatusProfileAvatarView voiceStatusProfileAvatarView = this.A04;
        if (voiceStatusProfileAvatarView == null) {
            throw C36331k8.A0d("profileAvatarView");
        }
        voiceStatusProfileAvatarView.setMicrophoneStrokeColor(A032);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoiceVisualizer voiceVisualizer = this.A01;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("voiceVisualizer");
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C70123ed r0 = this.A02;
        if (r0 != null) {
            r0.A00.clear();
        }
        VoiceVisualizer voiceVisualizer = this.A01;
        if (voiceVisualizer == null) {
            throw C36331k8.A0d("voiceVisualizer");
        }
        ViewTreeObserver viewTreeObserver = voiceVisualizer.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0J);
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.end();
            valueAnimator.removeUpdateListener(this.A0F);
        }
        this.A00 = null;
    }

    public final void setDuration(int i) {
        String A072 = AnonymousClass3UY.A07((C18820ts) getWhatsAppLocaleLazy().get(), (long) i);
        AnonymousClass00C.A08(A072);
        TextView textView = this.A0D;
        if (textView == null) {
            throw C36331k8.A0d("durationView");
        }
        textView.setText(A072);
    }

    public final void setVoiceMessage(C46812bi r9, AnonymousClass1RY r10) {
        AnonymousClass141 A0D2;
        boolean A1a = C36331k8.A1a(r9, r10);
        setBackgroundColorFromMessage(r9);
        VoiceStatusProfileAvatarView voiceStatusProfileAvatarView = this.A04;
        if (voiceStatusProfileAvatarView == null) {
            throw C36331k8.A0d("profileAvatarView");
        }
        WaImageView profileAvatarImageView = voiceStatusProfileAvatarView.getProfileAvatarImageView();
        C27751Pr r6 = (C27751Pr) getPathDrawableHelperLazy().get();
        profileAvatarImageView.setImageDrawable(C27751Pr.A00(C36361kB.A09(this), getResources(), C68553c5.A00, r6.A00, R.drawable.avatar_contact));
        C70133ee r2 = new C70133ee((AnonymousClass1Pp) getContactAvatarsLazy().get(), (AnonymousClass141) null, r6, (AnonymousClass1EM) getGroupChatUtilsLazy().get());
        this.A02 = new C70123ed(r2, this);
        if (r9.A1J.A02) {
            C19730wQ r0 = (C19730wQ) getMeManagerLazy().get();
            r0.A0G();
            A0D2 = r0.A0E;
            if (A0D2 != null) {
                C70123ed r02 = this.A02;
                if (r02 != null) {
                    r02.A00.clear();
                }
            }
            setDuration(r9.A0B);
            A02(this);
        }
        AnonymousClass11F A0J2 = r9.A0J();
        if (A0J2 != null) {
            A0D2 = ((AnonymousClass16D) getContactManagerLazy().get()).A0D(A0J2);
        }
        setDuration(r9.A0B);
        A02(this);
        r10.A06(profileAvatarImageView, r2, A0D2, A1a);
        setDuration(r9.A0B);
        A02(this);
    }

    public final void setContentUpdatedListener(C87304Og r1) {
        this.A03 = r1;
    }

    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A06();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0I = AnonymousClass001.A0I();
        this.A0G = AnonymousClass001.A0I();
        this.A0H = AnonymousClass001.A0I();
        this.A0F = new C53562rW(this, 12);
        this.A0J = new C90104Zc(this, 33);
        A01(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0I = AnonymousClass001.A0I();
        this.A0G = AnonymousClass001.A0I();
        this.A0H = AnonymousClass001.A0I();
        this.A0F = new C53562rW(this, 12);
        this.A0J = new C90104Zc(this, 33);
        A01(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A06();
        this.A0I = AnonymousClass001.A0I();
        this.A0G = AnonymousClass001.A0I();
        this.A0H = AnonymousClass001.A0I();
        this.A0F = new C53562rW(this, 12);
        this.A0J = new C90104Zc(this, 33);
        A01(context);
    }
}
