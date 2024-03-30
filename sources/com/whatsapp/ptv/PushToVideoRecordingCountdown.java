package com.whatsapp.ptv;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C20810yC;
import X.C21060yb;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class PushToVideoRecordingCountdown extends FrameLayout implements C18700tb {
    public int A00;
    public long A01;
    public WaTextView A02;
    public C21060yb A03;
    public C18820ts A04;
    public C20810yC A05;
    public AnonymousClass1QZ A06;
    public boolean A07;
    public final Handler A08;

    public static void A01(PushToVideoRecordingCountdown pushToVideoRecordingCountdown, int i) {
        pushToVideoRecordingCountdown.A00 = i;
        WaTextView waTextView = pushToVideoRecordingCountdown.A02;
        int i2 = 8;
        if (i > 0) {
            i2 = 0;
        }
        waTextView.setVisibility(i2);
        C36411kG.A1E(pushToVideoRecordingCountdown.A02, pushToVideoRecordingCountdown.A04.A0M(), (long) i);
    }

    public void A02() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36341k9.A0T(A0W);
            this.A05 = C36341k9.A0V(A0W);
            this.A03 = C36351kA.A0U(A0W);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A06;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public PushToVideoRecordingCountdown(Context context) {
        super(context);
        A02();
        this.A08 = C36341k9.A0H();
        this.A00 = 0;
        this.A01 = 0;
        A00();
    }

    private void A00() {
        WaTextView waTextView = new WaTextView(getContext());
        this.A02 = waTextView;
        waTextView.setVisibility(8);
        C36351kA.A15(getResources(), this.A02, R.color.f6nameremoved);
        this.A02.setShadowLayer(25.0f, 0.0f, 10.0f, getResources().getColor(R.color.f6nameremoved));
        this.A02.setTextSize(0, (float) Math.min(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), getWidth() / 2));
        WaTextView waTextView2 = this.A02;
        waTextView2.setTypeface(waTextView2.getTypeface(), 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.A02.setLayoutParams(layoutParams);
        addView(this.A02);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A02.setTextSize(0, (float) Math.min(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), getWidth() / 2));
    }

    public void setDelayOnFinishingCountdown(long j) {
        this.A01 = j;
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A08 = C36341k9.A0H();
        this.A00 = 0;
        this.A01 = 0;
        A00();
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public PushToVideoRecordingCountdown(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A08 = C36341k9.A0H();
        this.A00 = 0;
        this.A01 = 0;
        A00();
    }
}
