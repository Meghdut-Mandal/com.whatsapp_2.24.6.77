package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.File;
import java.util.List;

/* renamed from: X.70k  reason: invalid class name and case insensitive filesystem */
public class C1492470k implements C159727jp {
    public Animation A00;
    public ImageButton A01;
    public TextView A02;
    public VoiceVisualizer A03;
    public VoiceNoteSeekBar A04;
    public final Context A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewGroup A0B;
    public final ImageButton A0C;
    public final ImageButton A0D;
    public final ImageButton A0E;
    public final AnonymousClass17Y A0F;
    public final VoiceVisualizer A0G;
    public final C18820ts A0H;
    public final AnonymousClass13J A0I;
    public final AnonymousClass1RJ A0J;
    public final C19770wU A0K;
    public final List A0L = AnonymousClass001.A0I();
    public final boolean A0M;

    public void A02() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250);
        C162657ow.A00(alphaAnimation, this, 11);
        this.A0D.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation3.setDuration(250);
        C162657ow.A00(alphaAnimation3, this, 10);
        this.A0C.startAnimation(alphaAnimation3);
        alphaAnimation2.setDuration(250);
        C162657ow.A00(alphaAnimation2, this, 12);
        this.A08.startAnimation(alphaAnimation2);
    }

    public C1492470k(Context context, View view, AnonymousClass17Y r16, C18820ts r17, C20810yC r18, AnonymousClass13J r19, C19770wU r20) {
        boolean A0E2 = r18.A0E(1139);
        ImageButton A0T = C90514aH.A0T(view, R.id.voice_note_draft_stop_btn_v2);
        ImageButton A0T2 = C90514aH.A0T(view, R.id.voice_note_cancel_btn_v2);
        ViewGroup A0O = C36411kG.A0O(view, R.id.voice_note_draft_layout_v2);
        ViewGroup A0O2 = C36411kG.A0O(view, R.id.voice_note_draft_v2);
        AnonymousClass1RJ A0X = C36341k9.A0X(view, R.id.voice_note_draft_preview_v2_view_stub);
        ViewGroup A0O3 = C36411kG.A0O(view, R.id.quoted_message_preview_container_v2);
        ViewGroup A0O4 = C36411kG.A0O(view, R.id.draft_send_container_v2);
        View A022 = C012005e.A02(view, R.id.draft_send_v2);
        View A023 = C012005e.A02(view, R.id.voice_note_flashing_recording_view);
        ImageButton A0T3 = C90514aH.A0T(view, R.id.voice_note_view_once_toggle);
        this.A05 = context;
        this.A0F = r16;
        this.A0K = r20;
        this.A0I = r19;
        this.A0H = r17;
        this.A0M = A0E2;
        this.A0D = A0T;
        this.A0C = A0T2;
        this.A0B = A0O;
        this.A0A = A0O2;
        this.A0J = A0X;
        C164677sC.A00(A0X, this, 7);
        this.A09 = A0O3;
        this.A08 = A0O4;
        this.A07 = A022;
        this.A0G = (VoiceVisualizer) C012005e.A02(view, R.id.voice_note_draft_audio_visualizer);
        this.A06 = A023;
        this.A0E = A0T3;
    }

    private void A01(boolean z, boolean z2) {
        if (!z) {
            this.A0A.setVisibility(4);
            if (!z2) {
                this.A0D.setVisibility(8);
            }
            this.A0J.A03(0);
            return;
        }
        AnimationSet A002 = C55912vO.A00(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150);
        C162657ow.A00(alphaAnimation, this, 14);
        this.A0A.startAnimation(alphaAnimation);
        AnimationSet A003 = C55912vO.A00(true);
        A002.setAnimationListener(new C100704vS(A003, this, true));
        C162657ow.A00(A003, this, 13);
        this.A0D.startAnimation(A002);
        alphaAnimation2.setDuration(250);
        C162657ow.A00(alphaAnimation2, this, 15);
        this.A0J.A01().startAnimation(alphaAnimation2);
    }

    public void A03(int i) {
        ImageButton imageButton = this.A0D;
        C18820ts r0 = this.A0H;
        Context context = this.A05;
        C36321k7.A0L(context, imageButton, r0, i);
        int i2 = R.string.f12nameremoved;
        if (R.drawable.ic_resume_draft_preview == i) {
            i2 = R.string.f12nameremoved;
        }
        C36331k8.A0q(context, imageButton, i2);
    }

    public void A04(C132476Tw r3, File file, boolean z, boolean z2) {
        List list = this.A0L;
        if (!list.isEmpty()) {
            A00(r3, this, list);
            A01(z, z2);
            return;
        }
        A01(z, z2);
        this.A0J.A01().getViewTreeObserver().addOnGlobalLayoutListener(new C135856dN(r3, this, file));
    }

    public void B5b() {
        this.A0J.A01();
        VoiceVisualizer voiceVisualizer = this.A03;
        C18740tg.A04(voiceVisualizer);
        voiceVisualizer.setVisibility(0);
        this.A0G.setVisibility(0);
        this.A06.setVisibility(8);
        Animation animation = this.A00;
        if (animation != null) {
            animation.cancel();
            this.A00 = null;
        }
    }

    public void Bto() {
        if (this.A00 == null) {
            AlphaAnimation A0D2 = C36351kA.A0D();
            this.A00 = A0D2;
            A0D2.setDuration(1000);
            this.A00.setRepeatMode(2);
            this.A00.setRepeatCount(-1);
        }
        VoiceVisualizer voiceVisualizer = this.A03;
        if (voiceVisualizer != null) {
            voiceVisualizer.setVisibility(8);
        }
        this.A0G.setVisibility(8);
        View view = this.A06;
        view.setVisibility(0);
        view.startAnimation(this.A00);
    }

    public static void A00(C132476Tw r1, C1492470k r2, List list) {
        int i;
        View view;
        int i2;
        if (list.isEmpty()) {
            if (r1 != null) {
                i2 = r1.A03();
            } else {
                i2 = 0;
            }
            r2.A04.setMax(i2);
            r2.A04.setProgress(0);
            if (r2.A0M) {
                r2.A04.setVisibility(0);
            }
            i = 8;
            view = r2.A03;
        } else {
            r2.A03.setPlaybackPercentage(0.0f);
            r2.A03.A03(list, 0.0f);
            r2.A03.setVisibility(0);
            i = 8;
            view = r2.A04;
        }
        view.setVisibility(i);
    }
}
