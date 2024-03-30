package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0BN;
import X.AnonymousClass7h0;
import X.C012005e;
import X.C107085Mm;
import X.C113295fJ;
import X.C132446Tt;
import X.C146626vu;
import X.C157377cr;
import X.C158417gt;
import X.C18820ts;
import X.C19550w8;
import X.C19770wU;
import X.C36331k8;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C65083Qq;
import X.C90484aE;
import X.C92364dg;
import X.C95244kI;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class VideoTimelineView extends C92364dg implements AnonymousClass7h0 {
    public static final long A0S = C90484aE.A0K(TimeUnit.SECONDS);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C18820ts A0C;
    public C158417gt A0D;
    public C157377cr A0E;
    public C95244kI A0F;
    public C132446Tt A0G;
    public C19770wU A0H;
    public File A0I;
    public ArrayList A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public float A0N;
    public int A0O;
    public final Paint A0P = C36371kC.A0E();
    public final Rect A0Q = AnonymousClass001.A06();
    public final RectF A0R = C36441kJ.A0N();

    private void A03(float f) {
        int i;
        if (this.A0K != f && (i = this.A05) != 0) {
            float f2 = f - this.A0L;
            if (i == 1) {
                long A022 = A02(this.A0M + f2);
                long j = this.A0B;
                long max = Math.max(0, Math.min(A022, j));
                this.A0A = max;
                long j2 = this.A09;
                if (j - max > j2) {
                    this.A0B = max + j2;
                }
            } else if (i != 2) {
                long j3 = this.A0B - this.A0A;
                long A023 = A02(this.A0M + f2);
                this.A0A = A023;
                if (A023 == 0) {
                    this.A0B = A023 + j3;
                } else {
                    long A024 = A02(this.A0N + f2);
                    this.A0B = A024;
                    if (A024 == this.A08) {
                        this.A0A = A024 - j3;
                    }
                }
            } else {
                long A025 = A02(this.A0N + f2);
                long j4 = this.A08;
                long j5 = this.A0A;
                long min = Math.min(j4, Math.max(A025, j5));
                this.A0B = min;
                long j6 = this.A09;
                if (min - j5 > j6) {
                    this.A0A = min - j6;
                }
            }
            this.A0K = f;
            invalidate();
            C158417gt r7 = this.A0D;
            if (r7 != null) {
                r7.Bj8(this, this.A05, this.A0A, this.A0B);
            }
        }
    }

    private long A02(float f) {
        return Math.min(this.A08, Math.max((long) ((((float) this.A08) * (f - ((float) getPaddingLeft()))) / ((float) getTimelineWidth())), 0));
    }

    private void A04(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            Rect rect = AnonymousClass0BN.A0A;
            C95244kI r0 = new C95244kI(this, this, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            this.A0F = r0;
            C012005e.A0V(this, r0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C113295fJ.A00);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A03 = obtainStyledAttributes.getInteger(0, this.A03);
            this.A01 = obtainStyledAttributes.getDimension(5, this.A01);
            this.A06 = obtainStyledAttributes.getInteger(3, this.A06);
            this.A02 = obtainStyledAttributes.getDimension(6, this.A02);
            this.A07 = obtainStyledAttributes.getInteger(4, this.A07);
            this.A04 = obtainStyledAttributes.getInteger(2, this.A04);
            obtainStyledAttributes.recycle();
        }
    }

    public void Bx3(int i, boolean z) {
        long j;
        int i2 = i;
        if (z) {
            long j2 = this.A0A;
            j = A0S;
            long j3 = this.A0B;
            long max = Math.max(0, Math.min(j2 + (j * ((long) i2)), j3));
            this.A0A = max;
            long j4 = this.A09;
            if (j3 - max > j4) {
                this.A0B = max + j4;
            }
        } else {
            long j5 = this.A0B;
            j = A0S;
            long j6 = this.A08;
            long j7 = this.A0A;
            long min = Math.min(j6, Math.max(j5 + (j * ((long) i2)), j7));
            this.A0B = min;
            long j8 = this.A09;
            if (min - j7 > j8) {
                this.A0A = min - j8;
            }
        }
        invalidate();
        C158417gt r11 = this.A0D;
        if (r11 != null) {
            r11.Bj8(this, this.A05, this.A0A, this.A0B);
        }
        long j9 = this.A0B / j;
        C18820ts r7 = this.A0C;
        Object[] A0M2 = AnonymousClass001.A0M();
        AnonymousClass000.A1M(A0M2, 0, this.A0A / j);
        AnonymousClass000.A1M(A0M2, 1, j9);
        announceForAccessibility(r7.A0L(A0M2, R.plurals.f10nameremoved, j9));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A0F.A0y(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        long j;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A0I != null) {
            int timelineWidth = getTimelineWidth();
            int timelineHeight = getTimelineHeight();
            if (timelineHeight > 0 && timelineWidth > 0) {
                if (this.A0O != timelineWidth) {
                    this.A0O = timelineWidth;
                    this.A0J = null;
                    C132446Tt r0 = this.A0G;
                    if (r0 != null) {
                        r0.A0D(true);
                        this.A0G = null;
                    }
                }
                if (this.A0J != null) {
                    float f3 = ((float) timelineWidth) / ((float) (timelineWidth / timelineHeight));
                    RectF rectF = this.A0R;
                    rectF.top = (float) getPaddingTop();
                    rectF.bottom = (float) (getPaddingTop() + timelineHeight);
                    for (int i3 = 0; i3 < this.A0J.size(); i3++) {
                        float paddingLeft = ((float) getPaddingLeft()) + (((float) i3) * f3);
                        rectF.left = paddingLeft;
                        rectF.right = paddingLeft + f3;
                        Bitmap bitmap = (Bitmap) this.A0J.get(i3);
                        if (bitmap != null) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            Rect rect = this.A0Q;
                            if (width > height) {
                                rect.top = 0;
                                rect.bottom = height;
                                int i4 = (width - height) / 2;
                                rect.left = i4;
                                rect.right = i4 + height;
                            } else {
                                rect.left = 0;
                                rect.right = width;
                                int i5 = (height - width) / 2;
                                rect.top = i5;
                                rect.bottom = i5 + width;
                            }
                            canvas2.drawBitmap(bitmap, rect, rectF, this.A0P);
                        }
                    }
                } else if (this.A0G == null) {
                    int i6 = timelineWidth / timelineHeight;
                    this.A0J = C36441kJ.A14(i6);
                    C107085Mm r13 = new C107085Mm(this, this.A0I, ((float) timelineWidth) / ((float) i6), (float) timelineHeight, i6);
                    this.A0G = r13;
                    C36391kE.A1Q(r13, this.A0H);
                }
                if (this.A0D != null) {
                    float A012 = (float) A01(this.A0A);
                    float A013 = (float) A01(this.A0B);
                    Paint paint = this.A0P;
                    C36431kI.A1L(paint);
                    paint.setColor(this.A04);
                    RectF rectF2 = this.A0R;
                    rectF2.set((float) getPaddingLeft(), (float) getPaddingTop(), A012, (float) AnonymousClass000.A0A(this));
                    canvas2.drawRect(rectF2, paint);
                    rectF2.set(A013, (float) getPaddingTop(), (float) AnonymousClass000.A0B(this), (float) AnonymousClass000.A0A(this));
                    canvas2.drawRect(rectF2, paint);
                    C157377cr r02 = this.A0E;
                    if (r02 != null) {
                        VideoComposerFragment videoComposerFragment = ((C146626vu) r02).A00;
                        C65083Qq r03 = videoComposerFragment.A0L;
                        if (r03 == null || !r03.A0X()) {
                            j = videoComposerFragment.A04;
                        } else {
                            C65083Qq r04 = videoComposerFragment.A0L;
                            if (r04 != null) {
                                j = (long) r04.A04();
                            } else {
                                j = 0;
                            }
                        }
                        videoComposerFragment.A04 = j;
                        if (j >= 0 && j >= this.A0A && j <= this.A0B) {
                            paint.setColor(this.A03);
                            C36421kH.A0q(paint);
                            paint.setStrokeWidth(this.A00 / 2.0f);
                            float A014 = (float) A01(j);
                            canvas2.drawLine(A014, (float) getPaddingTop(), A014, (float) AnonymousClass000.A0A(this), paint);
                        }
                        C65083Qq r05 = ((C146626vu) this.A0E).A00.A0L;
                        if (r05 != null && r05.A0X()) {
                            invalidate();
                        }
                    }
                    paint.setColor(this.A03);
                    C36421kH.A0q(paint);
                    paint.setStrokeWidth(this.A00);
                    rectF2.set(A012 - 1.0f, (float) getPaddingTop(), 1.0f + A013, (float) AnonymousClass000.A0A(this));
                    canvas2.drawRect(rectF2, paint);
                    C36431kI.A1L(paint);
                    if (this.A05 == 1) {
                        i = this.A07;
                    } else {
                        i = this.A06;
                    }
                    paint.setColor(i);
                    int i7 = timelineHeight / 2;
                    float paddingTop = (float) (getPaddingTop() + i7);
                    if (this.A05 == 1) {
                        f = this.A02;
                    } else {
                        f = this.A01;
                    }
                    canvas2.drawCircle(A012, paddingTop, f, paint);
                    if (this.A05 == 2) {
                        i2 = this.A07;
                    } else {
                        i2 = this.A06;
                    }
                    paint.setColor(i2);
                    float paddingTop2 = (float) (getPaddingTop() + i7);
                    if (this.A05 == 2) {
                        f2 = this.A02;
                    } else {
                        f2 = this.A01;
                    }
                    canvas2.drawCircle(A013, paddingTop2, f2, paint);
                    int i8 = (int) A012;
                    int i9 = (int) A013;
                    int paddingTop3 = getPaddingTop();
                    int A0A2 = AnonymousClass000.A0A(this);
                    C95244kI r3 = this.A0F;
                    Rect rect2 = r3.A04;
                    int i10 = r3.A01;
                    rect2.left = i8 - i10;
                    rect2.right = i8;
                    rect2.top = paddingTop3;
                    rect2.bottom = A0A2;
                    Rect rect3 = r3.A05;
                    rect3.left = i8;
                    rect3.right = i8 + i10;
                    rect3.top = paddingTop3;
                    rect3.bottom = A0A2;
                    Rect rect4 = r3.A02;
                    rect4.left = i9 - i10;
                    rect4.right = i9;
                    rect4.top = paddingTop3;
                    rect4.bottom = A0A2;
                    Rect rect5 = r3.A03;
                    rect5.left = i9;
                    rect5.right = i9 + i10;
                    rect5.top = paddingTop3;
                    rect5.bottom = A0A2;
                    r3.A00 = true;
                    r3.A0o();
                }
            }
        } else if (isInEditMode()) {
            Paint paint2 = this.A0P;
            C36431kI.A1L(paint2);
            paint2.setColor(this.A04);
            RectF rectF3 = this.A0R;
            rectF3.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) AnonymousClass000.A0B(this), (float) AnonymousClass000.A0A(this));
            canvas2.drawRect(rectF3, paint2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1 != 3) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if ((r4 / X.C36441kJ.A01(r10)) <= 0.5f) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r4 >= (r7 - r6)) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            X.7gt r0 = r10.A0D
            if (r0 != 0) goto L_0x0009
            boolean r0 = super.onTouchEvent(r11)
            return r0
        L_0x0009:
            boolean r0 = r10.isEnabled()
            r8 = 0
            if (r0 != 0) goto L_0x0011
            return r8
        L_0x0011:
            int r0 = r11.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            float r4 = r11.getX()
            r3 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x00d1
            r0 = 2
            if (r1 == r0) goto L_0x00cd
            r0 = 3
            if (r1 == r0) goto L_0x00d1
        L_0x0026:
            return r3
        L_0x0027:
            r10.A0L = r4
            long r0 = r10.A0A
            int r0 = r10.A01(r0)
            float r0 = (float) r0
            r10.A0M = r0
            long r0 = r10.A0B
            int r0 = r10.A01(r0)
            float r0 = (float) r0
            r10.A0N = r0
            long r0 = r10.A0A
            int r0 = r10.A01(r0)
            float r9 = (float) r0
            long r0 = r10.A0B
            int r0 = r10.A01(r0)
            float r7 = (float) r0
            float r2 = r10.A01
            int r1 = r10.getTimelineWidth()
            r0 = 3
            int r1 = r1 / r0
            int r0 = r10.getTimelineHeight()
            int r0 = java.lang.Math.min(r1, r0)
            float r0 = (float) r0
            float r6 = java.lang.Math.max(r2, r0)
            float r5 = X.C90494aF.A01(r4, r9)
            r2 = 1
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0068
            r8 = 1
        L_0x0068:
            float r1 = X.C90494aF.A01(r4, r7)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)
            if (r8 == 0) goto L_0x00bc
            if (r0 == 0) goto L_0x0093
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00cb
            float r5 = r5 - r1
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00cb
            float r0 = X.C36441kJ.A01(r10)
            float r4 = r4 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
        L_0x0093:
            r10.A05 = r2
            X.7gt r0 = r10.A0D
            if (r0 == 0) goto L_0x0026
            X.6vt r0 = (X.C146616vt) r0
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = r0.A00
            X.3Qq r0 = r4.A0L
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.A0X()
            if (r0 != r3) goto L_0x00aa
            r4.A1l()
        L_0x00aa:
            android.widget.TextView r2 = r4.A0A
            r0 = 100
            com.whatsapp.mediacomposer.VideoComposerFragment.A07(r2, r0)
            X.6Fh r0 = r4.A0H
            if (r0 != 0) goto L_0x0133
            java.lang.String r0 = "titleBarController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00bc:
            if (r0 != 0) goto L_0x00cb
            float r9 = r9 + r6
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            float r7 = r7 - r6
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r2 = 3
            if (r0 < 0) goto L_0x0093
        L_0x00c9:
            r2 = 0
            goto L_0x0093
        L_0x00cb:
            r2 = 2
            goto L_0x0093
        L_0x00cd:
            r10.A03(r4)
            return r3
        L_0x00d1:
            r10.A03(r4)
            X.7gt r0 = r10.A0D
            if (r0 == 0) goto L_0x0130
            X.6vt r0 = (X.C146616vt) r0
            com.whatsapp.mediacomposer.VideoComposerFragment r5 = r0.A00
            X.66x r4 = r5.A0Q
            if (r4 == 0) goto L_0x0126
            r0 = 43
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 8
            r0 = 11
            r4.A02(r2, r1, r0)
            boolean r0 = r5.A0Q
            if (r0 == 0) goto L_0x00fe
            X.3Qq r4 = r5.A0L
            if (r4 == 0) goto L_0x00fb
            long r1 = r5.A05
            int r0 = (int) r1
            r4.A0L(r0)
        L_0x00fb:
            r5.A1d()
        L_0x00fe:
            android.widget.TextView r4 = r5.A0A
            r1 = 100
            android.view.animation.AlphaAnimation r0 = X.C36371kC.A0L()
            r0.setDuration(r1)
            if (r4 == 0) goto L_0x0112
            r4.startAnimation(r0)
            r0 = 4
            r4.setVisibility(r0)
        L_0x0112:
            X.7le r0 = r5.A1a()
            if (r0 == 0) goto L_0x011b
            r0.BW2()
        L_0x011b:
            X.6Fh r0 = r5.A0H
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "titleBarController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0126:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012d:
            r0.A04()
        L_0x0130:
            r10.A05 = r8
            goto L_0x0136
        L_0x0133:
            r0.A02()
        L_0x0136:
            r10.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.VideoTimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C92364dg.A00(this);
        A04(context, attributeSet);
    }

    private int A01(long j) {
        return Math.min(getPaddingLeft() + getTimelineWidth(), Math.max(getPaddingLeft(), (int) (((long) getPaddingLeft()) + ((((long) getTimelineWidth()) * j) / this.A08))));
    }

    private int getTimelineHeight() {
        return Math.max(0, AnonymousClass000.A0D(this, getHeight()));
    }

    private int getTimelineWidth() {
        return Math.max(0, C36331k8.A00(this, getWidth()));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C132446Tt r2 = this.A0G;
        if (r2 != null) {
            r2.A0D(true);
            this.A0G = null;
        }
        this.A0J = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (C19550w8.A06()) {
            setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, i, i2)));
        }
    }

    public void setMaxTrim(long j) {
        this.A09 = j;
    }

    public void setTrimListener(C158417gt r1) {
        this.A0D = r1;
    }

    public void setVideoPlayback(C157377cr r1) {
        this.A0E = r1;
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C92364dg.A00(this);
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C92364dg.A00(this);
        A04(context, attributeSet);
    }

    public VideoTimelineView(Context context) {
        super(context);
        C92364dg.A00(this);
    }
}
