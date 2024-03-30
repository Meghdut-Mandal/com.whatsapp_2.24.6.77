package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass076;
import X.AnonymousClass1QZ;
import X.C013105r;
import X.C111565cU;
import X.C18700tb;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36441kJ;
import X.C56762wq;
import X.C90464aC;
import X.C90524aI;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.whatsapp.R;
import java.util.Random;

public class VoiceParticipantAudioWave extends View implements C18700tb {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public Paint A04;
    public Drawable A05;
    public C20810yC A06;
    public AnonymousClass1QZ A07;
    public double[] A08;
    public double[] A09;
    public double[] A0A;
    public float A0B;
    public int A0C;
    public int A0D;
    public ValueAnimator A0E;
    public boolean A0F;
    public boolean A0G;
    public final Interpolator A0H;
    public final Random A0I;

    public void setAudioLevel(float f) {
        A02(this, f, true);
    }

    private void A01(Context context, AttributeSet attributeSet) {
        this.A0C = this.A06.A07(1106);
        int min = Math.min(this.A06.A07(1213), 127);
        this.A0D = min;
        if (min >= 127) {
            this.A0D = 0;
        }
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, C56762wq.A00, 0, 0);
            try {
                this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, this.A01);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint = this.A04;
        paint.setStrokeCap(Paint.Cap.ROUND);
        C36381kD.A16(getContext(), paint, 17170443);
        paint.setStrokeWidth((float) this.A01);
        A00();
    }

    public void A03() {
        if (!this.A0F) {
            this.A0F = true;
            this.A06 = C36341k9.A0V(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A07;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (!this.A0G || (drawable = this.A05) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = (this.A08.length - 5) / 2;
            int i2 = this.A01;
            int i3 = i2 * 9;
            int i4 = i3 / 2;
            int i5 = this.A01;
            drawable.setBounds(this.A02 + i2 + (i2 * 2 * i), C36441kJ.A07(this) - i4, this.A02 + i5 + (i5 * 2 * i) + i3, C36441kJ.A07(this) + i4);
            this.A05.draw(canvas2);
        }
        for (int i6 = 0; i6 < this.A08.length; i6++) {
            if (i6 < i || i6 >= i + 5) {
                int i7 = this.A01;
                int i8 = this.A02 + i7 + (i7 * 2 * i6);
                double d = this.A0A[i6];
                double d2 = this.A09[i6];
                float f = ((float) (((d - d2) * ((double) this.A00)) + d2)) / 2.0f;
                canvas2.drawLine((float) i8, ((float) C36441kJ.A07(this)) - f, (float) (i8 + 1), ((float) C36441kJ.A07(this)) + f, this.A04);
            }
        }
    }

    public void setColor(int i) {
        Paint paint = this.A04;
        paint.setColor(i);
        Drawable drawable = this.A05;
        if (drawable != null) {
            AnonymousClass076.A06(drawable, paint.getColor());
        }
        invalidate();
    }

    public void setMuteIconVisibility(boolean z) {
        if (this.A0G != z) {
            this.A0G = z;
            Drawable drawable = this.A05;
            if (drawable == null) {
                drawable = C013105r.A01(getContext(), R.drawable.vec_ic_voip_voice_mute);
                this.A05 = drawable;
            }
            AnonymousClass076.A06(drawable, this.A04.getColor());
            invalidate();
        }
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = C90464aC.A0m(this);
        this.A0H = new LinearInterpolator();
        A01(context, attributeSet);
    }

    private void A00() {
        int lineCount = getLineCount();
        if (lineCount > 0) {
            this.A08 = new double[lineCount];
            int i = lineCount / 2;
            double pow = Math.pow(3.0d / ((double) getHeight()), 1.0d / ((double) i));
            this.A08[i] = (double) getHeight();
            int i2 = 1;
            while (true) {
                int i3 = i - i2;
                if (i3 >= 0) {
                    double[] dArr = this.A08;
                    dArr[i3] = dArr[i3 + 1] * pow;
                    int i4 = i + i2;
                    if (i4 < lineCount) {
                        dArr[i4] = dArr[i3];
                    }
                    i2++;
                } else {
                    this.A09 = new double[lineCount];
                    this.A0A = new double[lineCount];
                    return;
                }
            }
        }
    }

    public static void A02(VoiceParticipantAudioWave voiceParticipantAudioWave, float f, boolean z) {
        long j;
        if (voiceParticipantAudioWave.getVisibility() == 0) {
            ValueAnimator valueAnimator = voiceParticipantAudioWave.A0E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            voiceParticipantAudioWave.A09 = voiceParticipantAudioWave.A0A;
            voiceParticipantAudioWave.A0A = new double[voiceParticipantAudioWave.A08.length];
            int i = voiceParticipantAudioWave.A0D;
            float f2 = (float) i;
            float max = Math.max(f, f2);
            float f3 = (max - f2) / ((float) (127 - i));
            int i2 = 1;
            while (true) {
                double[] dArr = voiceParticipantAudioWave.A08;
                if (i2 >= dArr.length - 1) {
                    break;
                }
                double[] dArr2 = voiceParticipantAudioWave.A0A;
                double d = dArr[i2];
                Random random = voiceParticipantAudioWave.A0I;
                if (random.nextFloat() < 0.3f) {
                    d = ((double) ((random.nextFloat() * 0.7f) + 0.3f)) * d;
                }
                dArr2[i2] = d * ((double) f3);
                i2++;
            }
            float[] A0v = C90524aI.A0v();
            // fill-array-data instruction
            A0v[0] = 0;
            A0v[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            voiceParticipantAudioWave.A0E = ofFloat;
            if (z) {
                j = (long) voiceParticipantAudioWave.A0C;
            } else {
                j = 0;
            }
            ofFloat.setDuration(j);
            voiceParticipantAudioWave.A0E.setInterpolator(voiceParticipantAudioWave.A0H);
            C111565cU.A00(voiceParticipantAudioWave.A0E, voiceParticipantAudioWave, 13);
            voiceParticipantAudioWave.A0E.start();
            voiceParticipantAudioWave.A0B = max;
        }
    }

    private int getLineCount() {
        if (getWidth() == 0) {
            return 0;
        }
        int width = getWidth();
        int i = this.A01;
        int i2 = (width - i) / (i * 2);
        if (i2 % 2 == 0) {
            i2--;
        }
        this.A02 = (getWidth() - ((i2 * 2) * this.A01)) / 2;
        return i2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        A02(this, this.A0B, true);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0I = C90464aC.A0m(this);
        this.A0H = new LinearInterpolator();
        A01(context, attributeSet);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = C90464aC.A0m(this);
        this.A0H = new LinearInterpolator();
        A01(context, attributeSet);
    }

    public VoiceParticipantAudioWave(Context context) {
        super(context);
        this.A0I = C90464aC.A0m(this);
        this.A0H = new LinearInterpolator();
        A01(context, (AttributeSet) null);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A03();
    }
}
