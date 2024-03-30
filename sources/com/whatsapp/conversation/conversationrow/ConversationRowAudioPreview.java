package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36401kF;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class ConversationRowAudioPreview extends FrameLayout implements C18700tb {
    public ImageView A00;
    public WaveformVisualizerView A01;
    public C20810yC A02;
    public AnonymousClass1QZ A03;
    public ImageView A04;
    public WaTextView A05;
    public boolean A06;

    public void A01() {
        this.A01.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public void A02() {
        if (!this.A06) {
            this.A06 = true;
            this.A02 = C36341k9.A0V(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
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

    public void setDuration(String str) {
        this.A05.setText(str);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00(context);
    }

    private void A00(Context context) {
        WaTextView waTextView;
        float f;
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A04 = C36401kF.A0G(this, R.id.picture);
        this.A01 = (WaveformVisualizerView) C012005e.A02(this, R.id.visualizer);
        this.A00 = C36401kF.A0G(this, R.id.icon);
        this.A05 = C36401kF.A0Q(this, R.id.duration);
        boolean A0E = this.A02.A0E(1040);
        ImageView imageView = this.A04;
        if (A0E) {
            imageView.setImageResource(R.drawable.audio_file_background);
            this.A05.A0C();
            waTextView = this.A05;
            f = 10.0f;
        } else {
            imageView.setImageResource(R.drawable.audio_message_thumb);
            this.A05.A0A();
            waTextView = this.A05;
            f = 12.0f;
        }
        waTextView.setTextSize(2, f);
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A00(context);
    }

    public ConversationRowAudioPreview(Context context) {
        super(context);
        A02();
        A00(context);
    }
}
