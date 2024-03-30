package com.whatsapp.voicerecorder;

import X.AnonymousClass00F;
import X.AnonymousClass1QZ;
import X.C06360Th;
import X.C113425fW;
import X.C162397oW;
import X.C18700tb;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.whatsapp.R;

public class VoiceNoteSeekBar extends AppCompatSeekBar implements C18700tb {
    public SeekBar.OnSeekBarChangeListener A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public C06360Th A0C;
    public final Paint A0D;
    public final RectF A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r3 != 0) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onDraw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            int r4 = r12.getWidth()     // Catch:{ all -> 0x00af }
            int r2 = r12.getPaddingLeft()     // Catch:{ all -> 0x00af }
            int r0 = r12.getPaddingRight()     // Catch:{ all -> 0x00af }
            int r4 = r4 - r2
            int r4 = r4 - r0
            boolean r0 = r12.isPressed()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0028
            int r0 = r12.A0A     // Catch:{ all -> 0x00af }
            int r0 = r0 * 3
            int r7 = r0 / 4
        L_0x001b:
            int r3 = r12.getProgress()     // Catch:{ all -> 0x00af }
            int r0 = r12.getMax()     // Catch:{ all -> 0x00af }
            r10 = 0
            r1 = 0
            if (r0 <= 0) goto L_0x0030
            goto L_0x002d
        L_0x0028:
            int r0 = r12.A0A     // Catch:{ all -> 0x00af }
            int r7 = r0 / 2
            goto L_0x001b
        L_0x002d:
            float r1 = (float) r3     // Catch:{ all -> 0x00af }
            float r0 = (float) r0     // Catch:{ all -> 0x00af }
            float r1 = r1 / r0
        L_0x0030:
            float r0 = (float) r4     // Catch:{ all -> 0x00af }
            float r1 = r1 * r0
            int r9 = (int) r1     // Catch:{ all -> 0x00af }
            int r9 = r9 + r2
            int r8 = r12.getPaddingTop()     // Catch:{ all -> 0x00af }
            int r0 = r12.getHeight()     // Catch:{ all -> 0x00af }
            int r0 = X.AnonymousClass000.A0D(r12, r0)     // Catch:{ all -> 0x00af }
            int r0 = r0 / 2
            int r8 = r8 + r0
            android.graphics.Paint r6 = r12.A0D     // Catch:{ all -> 0x00af }
            int r0 = r12.A07     // Catch:{ all -> 0x00af }
            X.C36401kF.A0z(r0, r6)     // Catch:{ all -> 0x00af }
            boolean r0 = r12.A02     // Catch:{ all -> 0x00af }
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0073
            android.graphics.RectF r5 = r12.A0E     // Catch:{ all -> 0x00af }
            int r0 = r12.A0B     // Catch:{ all -> 0x00af }
            int r0 = r0 / 2
            int r0 = r8 - r0
            float r4 = (float) r0     // Catch:{ all -> 0x00af }
            float r1 = X.C36441kJ.A01(r12)     // Catch:{ all -> 0x00af }
            int r0 = r12.A0B     // Catch:{ all -> 0x00af }
            int r0 = r0 / 2
            int r0 = r0 + r8
            float r0 = (float) r0     // Catch:{ all -> 0x00af }
            r5.set(r10, r4, r1, r0)     // Catch:{ all -> 0x00af }
            float r1 = r5.height()     // Catch:{ all -> 0x00af }
            float r1 = r1 / r11
            float r0 = r5.height()     // Catch:{ all -> 0x00af }
            float r0 = r0 / r11
            r13.drawRoundRect(r5, r1, r0, r6)     // Catch:{ all -> 0x00af }
        L_0x0073:
            int r0 = r12.A08     // Catch:{ all -> 0x00af }
            r6.setColor(r0)     // Catch:{ all -> 0x00af }
            boolean r0 = r12.A03     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x007f
            r1 = 1
            if (r3 == 0) goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            boolean r0 = r12.A02     // Catch:{ all -> 0x00af }
            if (r0 != 0) goto L_0x0087
            if (r1 != 0) goto L_0x00ad
            goto L_0x008a
        L_0x0087:
            if (r1 != 0) goto L_0x00ad
            goto L_0x00a7
        L_0x008a:
            android.graphics.RectF r5 = r12.A0E     // Catch:{ all -> 0x00af }
            float r4 = (float) r2     // Catch:{ all -> 0x00af }
            int r0 = r12.A0B     // Catch:{ all -> 0x00af }
            int r3 = r0 / 2
            int r0 = r8 - r3
            float r2 = (float) r0     // Catch:{ all -> 0x00af }
            float r1 = (float) r9     // Catch:{ all -> 0x00af }
            int r3 = r3 + r8
            float r0 = (float) r3     // Catch:{ all -> 0x00af }
            r5.set(r4, r2, r1, r0)     // Catch:{ all -> 0x00af }
            float r1 = r5.height()     // Catch:{ all -> 0x00af }
            float r1 = r1 / r11
            float r0 = r5.height()     // Catch:{ all -> 0x00af }
            float r0 = r0 / r11
            r13.drawRoundRect(r5, r1, r0, r6)     // Catch:{ all -> 0x00af }
        L_0x00a7:
            float r2 = (float) r9     // Catch:{ all -> 0x00af }
            float r1 = (float) r8     // Catch:{ all -> 0x00af }
            float r0 = (float) r7     // Catch:{ all -> 0x00af }
            r13.drawCircle(r2, r1, r0, r6)     // Catch:{ all -> 0x00af }
        L_0x00ad:
            monitor-exit(r12)
            return
        L_0x00af:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicerecorder.VoiceNoteSeekBar.onDraw(android.graphics.Canvas):void");
    }

    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState(this.A0A * 2, i, 0), View.resolveSizeAndState(this.A0A * 2, i2, 0));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setProgressColor(int i) {
        this.A08 = i;
        invalidate();
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A0D = C36371kC.A0E();
        this.A0E = C36441kJ.A0N();
        this.A0A = 20;
        this.A0B = 10;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        this.A09 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A08 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A07 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C113425fW.A00);
            this.A0A = obtainStyledAttributes.getDimensionPixelSize(2, this.A0A);
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(3, this.A0B);
            this.A08 = obtainStyledAttributes.getInteger(1, this.A08);
            this.A07 = obtainStyledAttributes.getInteger(0, this.A07);
            obtainStyledAttributes.recycle();
        }
        this.A0C = new C06360Th(context, new C162397oW(this, 4));
    }

    private void A01(MotionEvent motionEvent) {
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = (width - paddingLeft) - paddingRight;
        int x = (int) motionEvent.getX();
        if (x < paddingLeft) {
            f = 0.0f;
        } else {
            int i2 = width - paddingRight;
            f = 1.0f;
            if (x <= i2) {
                f = ((float) (x - paddingLeft)) / ((float) i);
            }
        }
        int max = (int) ((f * ((float) getMax())) + 0.0f);
        setProgress(max);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged((SeekBar) null, max, true);
        }
    }

    public int getProgressColor() {
        return this.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r4.A05 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        if (X.C90494aF.A01(r5.getX(), r4.A06) > ((float) r4.A09)) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            r3 = 0
            if (r0 != 0) goto L_0x0008
            return r3
        L_0x0008:
            X.0Th r0 = r4.A0C
            if (r0 == 0) goto L_0x000f
            r0.A00(r5)
        L_0x000f:
            int r1 = r5.getAction()
            r2 = 1
            if (r1 == 0) goto L_0x005b
            if (r1 == r2) goto L_0x003b
            r0 = 2
            if (r1 == r0) goto L_0x0033
            r0 = 3
            if (r1 != r0) goto L_0x0032
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x002f
        L_0x0022:
            r4.A05 = r3
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A00
            if (r1 == 0) goto L_0x002c
            r0 = 0
            r1.onStopTrackingTouch(r0)
        L_0x002c:
            r4.setPressed(r3)
        L_0x002f:
            r4.invalidate()
        L_0x0032:
            return r2
        L_0x0033:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0078
            r4.A01(r5)
            return r2
        L_0x003b:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0043
            r4.A01(r5)
            goto L_0x0022
        L_0x0043:
            r4.A05 = r2
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A00
            if (r1 == 0) goto L_0x004d
            r0 = 0
            r1.onStartTrackingTouch(r0)
        L_0x004d:
            r4.A01(r5)
            r4.A05 = r3
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A00
            if (r1 == 0) goto L_0x002f
            r0 = 0
            r1.onStopTrackingTouch(r0)
            goto L_0x002f
        L_0x005b:
            android.view.ViewParent r1 = r4.getParent()
        L_0x005f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0089
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r0 = r0.shouldDelayChildPressedState()
            if (r0 == 0) goto L_0x0073
            float r0 = r5.getX()
            r4.A06 = r0
            return r2
        L_0x0073:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x005f
        L_0x0078:
            float r1 = r5.getX()
            float r0 = r4.A06
            float r1 = X.C90494aF.A01(r1, r0)
            int r0 = r4.A09
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
        L_0x0089:
            r4.setPressed(r2)
            r4.invalidate()
            r4.A05 = r2
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r4.A00
            if (r1 == 0) goto L_0x0099
            r0 = 0
            r1.onStartTrackingTouch(r0)
        L_0x0099:
            r4.A01(r5)
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0032
            r0.requestDisallowInterceptTouchEvent(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicerecorder.VoiceNoteSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHideProgressBar(boolean z) {
        this.A02 = z;
    }

    public void setHideProgressWhenPlaybackPositionAtStart(boolean z) {
        this.A03 = z;
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A0D = C36371kC.A0E();
        this.A0E = C36441kJ.A0N();
        this.A0A = 20;
        this.A0B = 10;
        A00(context, attributeSet);
    }

    public VoiceNoteSeekBar(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A0D = C36371kC.A0E();
        this.A0E = C36441kJ.A0N();
        this.A0A = 20;
        this.A0B = 10;
        A00(context, (AttributeSet) null);
    }
}
