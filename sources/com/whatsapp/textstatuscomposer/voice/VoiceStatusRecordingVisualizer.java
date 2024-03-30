package com.whatsapp.textstatuscomposer.voice;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C158557hh;
import X.C18700tb;
import X.C19970wo;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C90524aI;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

public final class VoiceStatusRecordingVisualizer extends View implements C18700tb {
    public long A00;
    public long A01;
    public C19970wo A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public boolean A05;
    public C158557hh A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;
    public final List A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = C36351kA.A0V(C36391kE.A0W(generatedComponent()));
        }
        this.A0B = AnonymousClass001.A0I();
        Paint A0L = C36441kJ.A0L(5);
        A0L.setStrokeCap(Paint.Cap.ROUND);
        C36381kD.A16(context, A0L, R.color.f6nameremoved);
        this.A09 = A0L;
        Paint paint = new Paint(A0L);
        C36381kD.A16(context, paint, R.color.f6nameremoved);
        this.A0A = paint;
        this.A07 = C90524aI.A01(context, 4.3f);
        this.A08 = C90524aI.A01(context, 2.5f);
        this.A01 = 750;
    }

    public void onDraw(Canvas canvas) {
        float f;
        Paint paint;
        Object valueOf;
        Canvas canvas2 = canvas;
        AnonymousClass00C.A0D(canvas2, 0);
        super.onDraw(canvas2);
        float f2 = 1.0f;
        if (this.A00 != 0) {
            getTime();
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.A00)) / ((float) this.A01);
            if (elapsedRealtime > 1.0f) {
                this.A05 = false;
            } else {
                f2 = elapsedRealtime;
            }
        } else {
            f2 = 0.0f;
        }
        int A0D = AnonymousClass000.A0D(this, canvas2.getHeight());
        int totalSegmentsCount = getTotalSegmentsCount();
        for (int i = 0; i < totalSegmentsCount; i++) {
            List list = this.A0B;
            float f3 = 1.0f;
            if (i < list.size()) {
                f = C36441kJ.A03(list.get(i));
                if (i == C36431kI.A07(list)) {
                    f3 = f2;
                }
                paint = this.A09;
                if (f3 < 0.5f) {
                    valueOf = Float.valueOf(((float) 4) * f3 * f3 * f3);
                }
                valueOf = Double.valueOf(((double) 1) - (Math.pow((double) ((((float) -2) * f3) + ((float) 2)), 3.0d) / ((double) 2)));
            } else {
                if (i == list.size()) {
                    paint = this.A09;
                } else {
                    paint = this.A0A;
                }
                f = 0.006f;
                valueOf = Double.valueOf(((double) 1) - (Math.pow((double) ((((float) -2) * f3) + ((float) 2)), 3.0d) / ((double) 2)));
            }
            float A032 = C36441kJ.A03(valueOf);
            float f4 = this.A08;
            float f5 = (f4 / 2.0f) + (this.A07 * ((float) i));
            float f6 = (float) A0D;
            float max = Math.max(0.006f, f) * f6 * A032;
            float paddingTop = ((float) getPaddingTop()) + ((f6 - max) / ((float) 2));
            paint.setStrokeWidth(f4);
            float f7 = paddingTop;
            canvas2.drawLine(f5, f7, f5, paddingTop + max, paint);
        }
        if (this.A05) {
            invalidate();
        }
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final void setListener(C158557hh r2) {
        this.A06 = r2;
        if (getWidth() > 0 && r2 != null) {
            r2.Bg6(getTotalSegmentsCount());
        }
    }

    private final int getTotalSegmentsCount() {
        return ((int) Math.floor((double) ((((float) AnonymousClass000.A0B(this)) - this.A08) / this.A07))) + 1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C158557hh r1 = this.A06;
        if (r1 != null) {
            r1.Bg6(getTotalSegmentsCount());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceStatusRecordingVisualizer(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
