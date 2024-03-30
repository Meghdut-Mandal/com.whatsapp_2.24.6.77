package com.whatsapp.search.views.itemviews;

import X.AnonymousClass000;
import X.AnonymousClass00E;
import X.AnonymousClass1JZ;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass2x6;
import X.AnonymousClass3UY;
import X.AnonymousClass4ZO;
import X.C012005e;
import X.C100744vb;
import X.C136166ds;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36441kJ;
import X.C90464aC;
import X.C90484aE;
import X.C90514aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.util.List;

public class AudioPlayerView extends LinearLayout implements C18700tb {
    public int A00;
    public VoiceVisualizer A01;
    public C18820ts A02;
    public C20810yC A03;
    public AnonymousClass1RJ A04;
    public VoiceNoteSeekBar A05;
    public AnonymousClass1QZ A06;
    public int A07;
    public ImageButton A08;
    public boolean A09;

    public void A01() {
        this.A01.setVisibility(8);
        this.A01.setEnabled(false);
        this.A05.setVisibility(0);
        this.A05.setProgress(this.A07);
        VoiceNoteSeekBar voiceNoteSeekBar = this.A05;
        voiceNoteSeekBar.A02 = false;
        voiceNoteSeekBar.invalidate();
    }

    public void A02() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A03 = C36341k9.A0V(A0W);
            this.A02 = C36341k9.A0T(A0W);
        }
    }

    public void A03(List list) {
        this.A01.setEnabled(true);
        this.A01.setVisibility(0);
        this.A01.A03(list, (((float) this.A07) * 1.0f) / ((float) this.A00));
        VoiceNoteSeekBar voiceNoteSeekBar = this.A05;
        voiceNoteSeekBar.A02 = true;
        voiceNoteSeekBar.invalidate();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public int getSeekbarProgress() {
        return this.A05.getProgress();
    }

    public void setOnControlButtonClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    public void setOnControlButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A08.setOnLongClickListener(onLongClickListener);
    }

    public void setPlayButtonState(int i) {
        ImageButton imageButton;
        Context context;
        int i2;
        if (i == 0) {
            Drawable A002 = AnonymousClass00E.A00(getContext(), R.drawable.inline_audio_play);
            ImageButton imageButton2 = this.A08;
            if (!this.A03.A0E(1117)) {
                A002 = new C100744vb(A002, this.A02);
            }
            imageButton2.setImageDrawable(A002);
            imageButton = this.A08;
            context = getContext();
            i2 = R.string.f12nameremoved;
        } else if (i == 1) {
            this.A08.setImageResource(R.drawable.inline_audio_pause);
            imageButton = this.A08;
            context = getContext();
            i2 = R.string.f12nameremoved;
        } else if (i == 2) {
            this.A08.setImageResource(R.drawable.inline_audio_upload);
            imageButton = this.A08;
            context = getContext();
            i2 = R.string.f12nameremoved;
        } else if (i == 3) {
            this.A08.setImageResource(R.drawable.inline_audio_download);
            imageButton = this.A08;
            context = getContext();
            i2 = R.string.f12nameremoved;
        } else if (i == 4) {
            this.A08.setImageResource(R.drawable.inline_audio_cancel);
            imageButton = this.A08;
            context = getContext();
            i2 = R.string.f12nameremoved;
        } else {
            throw C90464aC.A0R("setPlayButtonState: Did not handle playstate: ", AnonymousClass000.A0u(), i);
        }
        C36331k8.A0q(context, imageButton, i2);
    }

    public void setPlaybackListener(C136166ds r2) {
        this.A05.setOnSeekBarChangeListener(r2);
    }

    public void setSeekbarColor(int i) {
        this.A05.setProgressColor(i);
    }

    public void setSeekbarContentDescription(long j) {
        this.A05.setContentDescription(C36321k7.A0A(getContext(), AnonymousClass3UY.A0A(this.A02, j), R.string.f12nameremoved));
    }

    public void setSeekbarLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A05.setOnLongClickListener(onLongClickListener);
    }

    public void setSeekbarMax(int i) {
        this.A05.setMax(i);
        this.A00 = i;
    }

    public void setSeekbarProgress(int i) {
        this.A07 = i;
        this.A05.setProgress(i);
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A02();
    }

    private void A00(Context context, AttributeSet attributeSet) {
        View.inflate(context, R.layout.f9nameremoved, this);
        setOrientation(0);
        setGravity(17);
        setClipChildren(false);
        setClipToPadding(false);
        this.A08 = C90514aH.A0T(this, R.id.control_btn);
        this.A05 = (VoiceNoteSeekBar) C012005e.A02(this, R.id.audio_seekbar);
        this.A01 = (VoiceVisualizer) C012005e.A02(this, R.id.audio_visualizer);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.progress_bar);
        this.A04 = A0X;
        A0X.A07(new AnonymousClass4ZO(context, this, 3));
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, AnonymousClass2x6.A01);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            View A022 = C012005e.A02(this, R.id.controls);
            AnonymousClass1JZ.A07(A022, this.A02, A022.getPaddingLeft(), A022.getPaddingTop(), dimensionPixelSize3, A022.getPaddingBottom());
            View A023 = C012005e.A02(this, R.id.audio_seekbar);
            C90484aE.A17(A023, dimensionPixelSize2, dimensionPixelSize);
            if (dimensionPixelSize4 > 0) {
                AnonymousClass1JZ.A03(A023, dimensionPixelSize4, AnonymousClass000.A0a(A023).rightMargin);
            }
            View A024 = C012005e.A02(this, R.id.control_button_container);
            if (dimensionPixelSize5 > 0) {
                ViewGroup.LayoutParams layoutParams = A024.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                A024.setLayoutParams(layoutParams);
            }
            if (dimensionPixelSize6 > 0) {
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(A024);
                AnonymousClass1JZ.A03(A024, dimensionPixelSize6, A0a.rightMargin);
                A024.setLayoutParams(A0a);
            }
            if (dimensionPixelSize7 > 0) {
                ViewGroup.LayoutParams A025 = this.A04.A02();
                A025.height = dimensionPixelSize7;
                A025.width = dimensionPixelSize7;
                this.A04.A06(A025);
            }
        }
    }

    public AnonymousClass1RJ getProgressBar() {
        return this.A04;
    }

    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00(context, attributeSet);
    }

    public AudioPlayerView(Context context) {
        super(context);
        A02();
        A00(context, (AttributeSet) null);
    }
}
