package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1QZ;
import X.AnonymousClass5CY;
import X.AnonymousClass5Cl;
import X.AnonymousClass5Co;
import X.AnonymousClass67Q;
import X.AnonymousClass6FV;
import X.AnonymousClass6OT;
import X.AnonymousClass6V4;
import X.AnonymousClass6VQ;
import X.C104965Cn;
import X.C117435mG;
import X.C1265564m;
import X.C1270166p;
import X.C129196Ft;
import X.C135326cW;
import X.C1503074t;
import X.C158437gv;
import X.C162047nw;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19970wo;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C54762tV;
import X.C90484aE;
import X.C90494aF;
import X.C92274dQ;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;
import org.json.JSONException;

public class DoodleView extends View implements C18700tb, C158437gv {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public C19970wo A04;
    public C18820ts A05;
    public AnonymousClass1H2 A06;
    public C1265564m A07;
    public AnonymousClass1HA A08;
    public AnonymousClass1QZ A09;
    public C162047nw A0A;
    public C135326cW A0B;
    public boolean A0C;
    public final Handler A0D;
    public final AnonymousClass6V4 A0E;
    public final AnonymousClass6OT A0F;
    public final C1270166p A0G;
    public final AnonymousClass6FV A0H;
    public final Runnable A0I;
    public final RectF A0J;

    private PointF getCenterPoint() {
        float f;
        AnonymousClass6OT r1 = this.A0F;
        if (r1.A06 != null) {
            return this.A0G.A00(getX() + ((float) (getMeasuredWidth() / 2)), getY() + ((float) (getMeasuredHeight() / 2)));
        }
        RectF rectF = r1.A08;
        float f2 = 0.0f;
        if (rectF != null) {
            f2 = rectF.centerX();
            f = rectF.centerY();
        } else {
            f = 0.0f;
        }
        return new PointF(f2, f);
    }

    public void A02() {
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36351kA.A0V(A0W);
            this.A06 = C36351kA.A0e(A0W);
            this.A05 = C36341k9.A0T(A0W);
            this.A08 = (AnonymousClass1HA) A0W.A84.get();
        }
    }

    public void A03(C129196Ft r13) {
        float width;
        float f;
        float f2;
        AnonymousClass67Q r0;
        AnonymousClass6OT r2 = this.A0F;
        RectF rectF = r2.A08;
        C129196Ft r6 = r13;
        if (rectF != null) {
            boolean z = r13 instanceof AnonymousClass5Cl;
            if (z) {
                width = Math.max(rectF.width(), (float) ((AnonymousClass5Cl) r6).A07);
            } else {
                width = rectF.width();
            }
            float height = rectF.height();
            if (z) {
                f = (width * 7.0f) / 8.0f;
                f2 = height / 10.0f;
            } else {
                f = width / 2.0f;
                f2 = height / 2.0f;
            }
            PointF centerPoint = getCenterPoint();
            float f3 = centerPoint.x;
            float f4 = f / 2.0f;
            float f5 = centerPoint.y;
            float f6 = f2 / 2.0f;
            r6.A0J(rectF, f3 - f4, f5 - f6, f4 + f3, f5 + f6);
            if (r13.A0N() && !z) {
                r13.A0G(this.A03);
            }
            if (r13.A0O()) {
                r13.A0F(C129196Ft.A04 / this.A00);
            }
            float f7 = 1.0f / r2.A01;
            if (r13 instanceof AnonymousClass5CY) {
                AnonymousClass5CY r1 = (AnonymousClass5CY) r6;
                r1.A0H(2, f7);
                r0 = r1.A0M;
            } else if (r13 instanceof AnonymousClass5Co) {
                AnonymousClass5Co r12 = (AnonymousClass5Co) r6;
                r12.A0H(2, f7);
                r0 = r12.A0D;
            } else if (r13 instanceof C104965Cn) {
                C104965Cn r14 = (C104965Cn) r6;
                r14.A0H(2, f7);
                r0 = r14.A0E;
            } else {
                r13.A0H(2, f7);
                r13.A00 += (float) (-r2.A02);
            }
            r0.A00(f7);
            r13.A00 += (float) (-r2.A02);
        }
        AnonymousClass6FV r15 = this.A0H;
        r15.A03(r13);
        if (((r13 instanceof AnonymousClass5CY) || (r13 instanceof C104965Cn)) && !r15.A06()) {
            this.A0D.postDelayed(this.A0I, 1000);
        }
        this.A07.A02 = false;
        C162047nw r02 = this.A0A;
        if (r02 != null) {
            r02.BgT(r13);
        }
        invalidate();
    }

    public boolean A04() {
        AnonymousClass6OT r1 = this.A0F;
        if (r1.A07 == null || r1.A08 == null) {
            return false;
        }
        return true;
    }

    public void BsM(int i, float f) {
        AnonymousClass6FV r2 = this.A0H;
        C129196Ft r3 = r2.A01;
        if (!(r3 == null || r3 == r2.A02 || (!r3.A0O() && !r3.A0N()))) {
            r2.A00 = r3.A09();
            r3 = r2.A01;
            r2.A02 = r3;
        }
        this.A02 = f;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            this.A01 = f;
        } else {
            this.A01 = f / f2;
        }
        this.A03 = i;
        C1265564m r0 = this.A07;
        if (r0 != null && !r0.A02 && r3 != null) {
            if (r3.A0O() || r3.A0N()) {
                if (r3.A0N()) {
                    r3.A0G(i);
                }
                C129196Ft r1 = r2.A01;
                if (r1.A0O()) {
                    r1.A0F(this.A01);
                }
                C129196Ft r4 = r2.A01;
                if (r4 instanceof AnonymousClass5Cl) {
                    AnonymousClass5Cl r42 = (AnonymousClass5Cl) r4;
                    float f3 = C129196Ft.A06;
                    float f4 = C129196Ft.A04;
                    float f5 = (f3 - f4) / 4.0f;
                    int i2 = 4;
                    if (f < f4 + f5) {
                        i2 = 0;
                    } else if (f < (2.0f * f5) + f4) {
                        i2 = 1;
                    } else if (f < f4 + (f5 * 3.0f)) {
                        i2 = 2;
                    }
                    if (r42.A06 != i2) {
                        r42.A06 = i2;
                        TextPaint textPaint = r42.A0C;
                        textPaint.setTypeface(C54762tV.A00(r42.A0B, i2));
                        textPaint.setFakeBoldText(AnonymousClass000.A1O(i2));
                        if (r42.A00 != 0.0f) {
                            RectF rectF = r42.A02;
                            float width = rectF.width() / r42.A00;
                            float f6 = (float) 2;
                            rectF.set(rectF.centerX() - (r42.A02 / f6), rectF.centerY() - (r42.A01 / f6), rectF.centerX() + (r42.A02 / f6), rectF.centerY() + (r42.A01 / f6));
                            AnonymousClass5Cl.A02(r42);
                            rectF.set(rectF.centerX() - ((rectF.width() * width) / f6), rectF.centerY() - ((rectF.height() * width) / f6), rectF.centerX() + ((rectF.width() * width) / f6), rectF.centerY() + ((width * rectF.height()) / f6));
                        }
                    }
                }
                invalidate();
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDetachedFromWindow() {
        this.A0D.removeCallbacks(this.A0I);
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C92274dQ r7 = (C92274dQ) parcelable;
        String str = r7.A01;
        if (!TextUtils.isEmpty(str)) {
            Context context = getContext();
            AnonymousClass1H2 r3 = this.A06;
            AnonymousClass6VQ A022 = AnonymousClass6VQ.A05.A02(context, this.A05, r3, this.A08, str);
            if (A022 != null) {
                AnonymousClass6OT r2 = this.A0F;
                r2.A02(A022);
                AnonymousClass6FV r0 = this.A0H;
                r0.A02();
                r0.A04.addAll(A022.A04);
                r2.A09 = C36361kB.A0B(this);
                this.A0E.A04();
            }
            this.A0H.A05(r7.A02);
        }
        this.A07.A02 = r7.A03;
        this.A02 = r7.A00;
        requestLayout();
        this.A0E.A03();
        super.onRestoreInstanceState(r7.getSuperState());
    }

    public void setControllers(C135326cW r1, C1265564m r2) {
        this.A0B = r1;
        this.A07 = r2;
    }

    public void setDoodle(AnonymousClass6VQ r4) {
        AnonymousClass6OT r2 = this.A0F;
        r2.A02(r4);
        AnonymousClass6FV r0 = this.A0H;
        r0.A02();
        r0.A04.addAll(r4.A04);
        r2.A09 = C36361kB.A0B(this);
        AnonymousClass6V4 r02 = this.A0E;
        r02.A04();
        requestLayout();
        r02.A03();
        invalidate();
    }

    public void setDoodleViewListener(C162047nw r3) {
        this.A0A = r3;
        C1265564m r1 = this.A07;
        AnonymousClass00C.A0D(r3, 0);
        r1.A00 = r3;
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = C90484aE.A0O(this);
        this.A0I = new C1503074t((Object) this, 42);
        AnonymousClass6FV r4 = new AnonymousClass6FV();
        this.A0H = r4;
        AnonymousClass6OT r3 = new AnonymousClass6OT();
        this.A0F = r3;
        this.A0G = new C1270166p(r3);
        this.A0E = new AnonymousClass6V4(this.A04, new C117435mG(this), r3, r4);
        this.A0J = C36441kJ.A0N();
        C90494aF.A0u(this);
    }

    public C129196Ft A00(MotionEvent motionEvent) {
        if (!A04() || motionEvent.getPointerCount() != 1) {
            return null;
        }
        return this.A0H.A00(this.A0G.A00(motionEvent.getX(), motionEvent.getY()));
    }

    public C129196Ft A01(MotionEvent motionEvent) {
        if (!A04() || motionEvent.getPointerCount() != 2) {
            return null;
        }
        C1270166p r2 = this.A0G;
        PointF A002 = r2.A00(motionEvent.getX(0), motionEvent.getY(0));
        PointF A003 = r2.A00(motionEvent.getX(1), motionEvent.getY(1));
        AnonymousClass6FV r4 = this.A0H;
        C129196Ft A004 = r4.A00(A002);
        if (A004 != null) {
            return A004;
        }
        C129196Ft A005 = r4.A00(A003);
        if (A005 != null) {
            return A005;
        }
        float f = (float) 2;
        return r4.A00(new PointF((A002.x + A003.x) / f, (A002.y + A003.y) / f));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0119, code lost:
        if (r3.A03 == ((int) r4.height())) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            super.draw(r12)
            X.6V4 r3 = r11.A0E
            X.6OT r6 = r3.A0F
            android.graphics.Matrix r0 = r6.A05
            r12.setMatrix(r0)
            android.graphics.RectF r0 = r6.A08
            if (r0 == 0) goto L_0x0230
            X.6FV r5 = r3.A0G
            java.util.List r2 = r5.A04
            int r1 = r2.size()
            java.util.ArrayList r0 = r5.A01()
            int r0 = r0.size()
            int r1 = r1 - r0
            r7 = 0
            r0 = 3
            if (r1 < r0) goto L_0x003b
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x00fd
            java.util.Iterator r1 = r2.iterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fd
            X.6Ft r0 = X.C90524aI.A0N(r1)
            boolean r0 = r0 instanceof X.AnonymousClass5CZ
            if (r0 == 0) goto L_0x002d
        L_0x003b:
            r3.A01 = r7
            r3.A02 = r7
            android.graphics.Bitmap r0 = r3.A07
            r1 = 0
            if (r0 == 0) goto L_0x0049
            r0.recycle()
            r3.A07 = r1
        L_0x0049:
            android.graphics.Bitmap r0 = r3.A08
            if (r0 == 0) goto L_0x0052
            r0.recycle()
            r3.A08 = r1
        L_0x0052:
            r12.save()
            android.graphics.RectF r4 = r6.A0B
            float r1 = r4.left
            float r0 = r4.top
            r12.translate(r1, r0)
            android.graphics.Bitmap r0 = r3.A06
            if (r0 != 0) goto L_0x009b
            android.graphics.Bitmap r0 = r3.A05
            if (r0 != 0) goto L_0x009b
        L_0x0066:
            int r0 = r3.A01
            r7 = 0
            if (r0 <= 0) goto L_0x0072
            android.graphics.Bitmap r1 = r3.A07
            android.graphics.Paint r0 = r3.A0C
            r12.drawBitmap(r1, r7, r7, r0)
        L_0x0072:
            r12.save()
            float r0 = r6.A00
            r12.scale(r0, r0)
            X.AnonymousClass6OT.A00(r12, r6)
            int r6 = r3.A01
        L_0x007f:
            int r1 = r2.size()
            int r0 = r3.A02
            int r1 = r1 - r0
            if (r6 >= r1) goto L_0x01ae
            java.lang.Object r1 = r2.get(r6)
            X.6Ft r1 = (X.C129196Ft) r1
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0095
            android.os.SystemClock.elapsedRealtime()
        L_0x0095:
            r1.A0I(r12)
            int r6 = r6 + 1
            goto L_0x007f
        L_0x009b:
            java.util.Iterator r1 = r2.iterator()
        L_0x009f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass5Ci
            if (r0 == 0) goto L_0x009f
            r12.save()
            android.graphics.Bitmap r1 = r3.A06
            r8 = 0
            r7 = 0
            if (r1 == 0) goto L_0x00ee
            int r0 = r6.A02
            float r9 = (float) r0
            int r0 = r1.getWidth()
            float r10 = (float) r0
            android.graphics.Bitmap r0 = r3.A06
        L_0x00c0:
            int r0 = r0.getHeight()
            float r1 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r7, r10, r1)
            android.graphics.Matrix r7 = X.C111045be.A00(r8, r0, r9)
            float r1 = r6.A00
            int r0 = r3.A00
            float r0 = (float) r0
            float r1 = r1 / r0
            r7.postScale(r1, r1)
            android.graphics.Bitmap r1 = r3.A05
            if (r1 == 0) goto L_0x00e0
            android.graphics.Paint r0 = r3.A0C
            r12.drawBitmap(r1, r7, r0)
        L_0x00e0:
            android.graphics.Bitmap r1 = r3.A06
            if (r1 == 0) goto L_0x00e9
            android.graphics.Paint r0 = r3.A0C
            r12.drawBitmap(r1, r7, r0)
        L_0x00e9:
            r12.restore()
            goto L_0x0066
        L_0x00ee:
            android.graphics.Bitmap r1 = r3.A05
            if (r1 == 0) goto L_0x0066
            int r0 = r6.A02
            float r9 = (float) r0
            int r0 = r1.getWidth()
            float r10 = (float) r0
            android.graphics.Bitmap r0 = r3.A05
            goto L_0x00c0
        L_0x00fd:
            X.6Ft r1 = r5.A01
            X.6Ft r0 = r3.A09
            if (r1 != r0) goto L_0x011b
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x011b
            int r1 = r3.A04
            android.graphics.RectF r4 = r6.A0B
            float r0 = r4.width()
            int r0 = (int) r0
            if (r1 != r0) goto L_0x011b
            int r1 = r3.A03
            float r0 = r4.height()
            int r0 = (int) r0
            if (r1 == r0) goto L_0x0052
        L_0x011b:
            r3.A01 = r7
            r3.A02 = r7
            X.6Ft r0 = r5.A01
            r3.A09 = r0
            android.graphics.RectF r1 = r6.A0B
            float r0 = r1.width()
            int r0 = (int) r0
            r3.A04 = r0
            float r0 = r1.height()
            int r4 = (int) r0
            r3.A03 = r4
            r0 = 1
            r3.A0B = r0
            android.graphics.Bitmap r1 = r3.A07
            int r0 = r3.A04
            android.graphics.Bitmap r0 = X.AnonymousClass6V4.A00(r1, r0, r4)
            r3.A07 = r0
            if (r0 == 0) goto L_0x016f
            r0.eraseColor(r7)
            android.graphics.Bitmap r0 = r3.A07
            android.graphics.Canvas r8 = X.C90524aI.A0A(r0)
            float r0 = r6.A00
            r8.scale(r0, r0)
            X.AnonymousClass6OT.A00(r8, r6)
            java.util.Iterator r4 = r2.iterator()
        L_0x0157:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x016f
            X.6Ft r1 = X.C90524aI.A0N(r4)
            X.6Ft r0 = r3.A09
            if (r1 == r0) goto L_0x016f
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r1.A0I(r8)
            goto L_0x0157
        L_0x016f:
            android.graphics.Bitmap r4 = r3.A08
            int r1 = r3.A04
            int r0 = r3.A03
            android.graphics.Bitmap r0 = X.AnonymousClass6V4.A00(r4, r1, r0)
            r3.A08 = r0
            if (r0 == 0) goto L_0x0052
            r0.eraseColor(r7)
            android.graphics.Bitmap r0 = r3.A08
            android.graphics.Canvas r8 = X.C90524aI.A0A(r0)
            float r0 = r6.A00
            r8.scale(r0, r0)
            X.AnonymousClass6OT.A00(r8, r6)
            java.util.Iterator r4 = r2.iterator()
        L_0x0192:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            X.6Ft r1 = X.C90524aI.A0N(r4)
            X.6Ft r0 = r3.A09
            if (r1 != r0) goto L_0x01a2
            r7 = 1
            goto L_0x0192
        L_0x01a2:
            if (r7 == 0) goto L_0x0192
            int r0 = r3.A02
            int r0 = r0 + 1
            r3.A02 = r0
            r1.A0I(r8)
            goto L_0x0192
        L_0x01ae:
            r12.restore()
            int r0 = r3.A02
            if (r0 <= 0) goto L_0x01bc
            android.graphics.Bitmap r1 = r3.A08
            android.graphics.Paint r0 = r3.A0C
            r12.drawBitmap(r1, r7, r7, r0)
        L_0x01bc:
            r12.restore()
            X.6Ft r0 = r5.A02
            boolean r1 = X.AnonymousClass000.A1V(r0)
            float r0 = r4.left
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x01d1
            float r0 = r4.top
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e5
        L_0x01d1:
            r12.save()
            android.graphics.Region$Op r0 = android.graphics.Region.Op.DIFFERENCE
            r12.clipRect(r4, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r1 == 0) goto L_0x01df
            r0 = -1157627904(0xffffffffbb000000, float:-0.001953125)
        L_0x01df:
            r12.drawColor(r0)
            r12.restore()
        L_0x01e5:
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0203
            java.util.Iterator r1 = r2.iterator()
        L_0x01ed:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0203
            X.6Ft r0 = X.C90524aI.A0N(r1)
            boolean r0 = r0 instanceof X.AnonymousClass5CZ
            if (r0 == 0) goto L_0x01ed
        L_0x01fb:
            X.5mG r0 = r3.A0E
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            return
        L_0x0203:
            java.util.Iterator r2 = r2.iterator()
        L_0x0207:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0230
            X.6Ft r1 = X.C90524aI.A0N(r2)
            boolean r0 = r1 instanceof X.AnonymousClass5CY
            if (r0 == 0) goto L_0x021e
            X.5CY r1 = (X.AnonymousClass5CY) r1
            X.66R r0 = r1.A0L
        L_0x0219:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0207
            goto L_0x01fb
        L_0x021e:
            boolean r0 = r1 instanceof X.AnonymousClass5Co
            if (r0 == 0) goto L_0x0227
            X.5Co r1 = (X.AnonymousClass5Co) r1
            X.66R r0 = r1.A0C
            goto L_0x0219
        L_0x0227:
            boolean r0 = r1 instanceof X.C104965Cn
            if (r0 == 0) goto L_0x0207
            X.5Cn r1 = (X.C104965Cn) r1
            X.66R r0 = r1.A0D
            goto L_0x0219
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.draw(android.graphics.Canvas):void");
    }

    public AnonymousClass6V4 getDoodleRender() {
        return this.A0E;
    }

    public C1270166p getPointsUtil() {
        return this.A0G;
    }

    public AnonymousClass6FV getShapeRepository() {
        return this.A0H;
    }

    public AnonymousClass6OT getState() {
        return this.A0F;
    }

    public float getStrokeScale() {
        return this.A00;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0H.A06()) {
            this.A0D.postDelayed(this.A0I, 1000);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        AnonymousClass6OT r6 = this.A0F;
        RectF rectF = r6.A08;
        if (rectF != null) {
            RectF rectF2 = this.A0J;
            rectF2.set(rectF);
            r6.A0A.mapRect(rectF2);
            float measuredWidth = (float) getMeasuredWidth();
            float measuredHeight = (float) getMeasuredHeight();
            float width = rectF2.width() / rectF2.height();
            if (measuredWidth / measuredHeight < width) {
                measuredHeight = measuredWidth / width;
            } else {
                measuredWidth = measuredHeight * width;
            }
            r6.A00 = measuredWidth / rectF2.width();
            if (this.A00 == 0.0f || !C36401kF.A1a(this.A0H.A04)) {
                float f = r6.A00;
                this.A00 = f;
                this.A01 = this.A02 / f;
            }
            r6.A0B.set((((float) getMeasuredWidth()) - measuredWidth) / 2.0f, (((float) getMeasuredHeight()) - measuredHeight) / 2.0f, (((float) getMeasuredWidth()) + measuredWidth) / 2.0f, (((float) getMeasuredHeight()) + measuredHeight) / 2.0f);
            r6.A09 = C36361kB.A0B(this);
            r6.A03 = getMeasuredHeight();
            r6.A04 = getMeasuredWidth();
            AnonymousClass6V4 r2 = this.A0E;
            if (AnonymousClass6V4.A02(r2, false) || AnonymousClass6V4.A01(r2, false)) {
                r2.A04();
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        String str;
        String str2;
        RectF rectF;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        AnonymousClass6OT r0 = this.A0F;
        RectF rectF2 = r0.A07;
        if (rectF2 == null || (rectF = r0.A08) == null) {
            str = null;
        } else {
            str = new AnonymousClass6VQ(rectF2, rectF, this.A0H.A04, r0.A02).A02();
        }
        AnonymousClass6FV r02 = this.A0H;
        try {
            str2 = r02.A03.A01(r02.A04);
        } catch (JSONException e) {
            Log.e("ShapeRepository/getUndoJson", e);
            str2 = null;
        }
        return new C92274dQ(onSaveInstanceState, str, str2, this.A02, this.A07.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r3 != 6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (r1 != 6) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b0, code lost:
        if (r2.getStrokeWidth() == r5.A01) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0297 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            boolean r0 = r13.isEnabled()
            r8 = 0
            if (r0 == 0) goto L_0x0297
            r13.invalidate()
            X.64m r2 = r13.A07
            int r1 = r13.A03
            float r0 = r13.A01
            boolean r1 = r2.A00(r14, r0, r1, r8)
            r0 = 1
            if (r1 == 0) goto L_0x0018
            return r0
        L_0x0018:
            X.6cW r7 = r13.A0B
            if (r7 == 0) goto L_0x0297
            int r3 = r14.getActionMasked()
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L_0x022f
            if (r3 == r0) goto L_0x017a
            if (r3 == r2) goto L_0x0162
            r0 = 3
            if (r3 == r0) goto L_0x017a
            r0 = 5
            if (r3 == r0) goto L_0x022f
            r0 = 6
            if (r3 == r0) goto L_0x017a
        L_0x0031:
            X.0Th r0 = r7.A01
            boolean r12 = r0.A00(r14)
            X.4dC r0 = r7.A07
            boolean r0 = r0.onTouchEvent(r14)
            r12 = r12 | r0
            X.5vD r6 = r7.A06
            int r0 = r14.getPointerCount()
            r1 = 2
            r10 = 0
            if (r0 != r1) goto L_0x0159
            int r0 = r14.getActionMasked()
            if (r0 != r1) goto L_0x0159
            r9 = 1
            float r5 = r14.getX(r9)
            float r0 = r14.getX(r8)
            float r5 = r5 - r0
            float r4 = r14.getY(r9)
            float r0 = r14.getY(r8)
            float r4 = r4 - r0
            double r2 = (double) r4
            double r0 = (double) r5
            double r0 = java.lang.Math.atan2(r2, r0)
            float r2 = (float) r0
            float r0 = r6.A01
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            float r0 = r6.A02
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            float r1 = r6.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            X.6cW r3 = r6.A03
            float r0 = r2 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r9 = (float) r0
            X.6LZ r10 = r3.A04
            X.6Ft r0 = r10.A00
            if (r0 != 0) goto L_0x012d
            r9 = 0
        L_0x008b:
            r6.A01 = r5
            r6.A02 = r4
            r6.A00 = r2
        L_0x0091:
            r12 = r12 | r9
            X.6La r4 = r7.A05
            int r1 = r14.getActionMasked()
            r5 = 1
            if (r1 == 0) goto L_0x011d
            if (r1 == r5) goto L_0x011a
            r0 = 2
            if (r1 == r0) goto L_0x00ba
            r0 = 3
            if (r1 == r0) goto L_0x011a
            r0 = 5
            if (r1 == r0) goto L_0x00b0
            r0 = 6
            if (r1 == r0) goto L_0x011a
        L_0x00a9:
            boolean r0 = r4.A02
            r0 = r0 | r12
            if (r0 == 0) goto L_0x0297
            r8 = 1
            return r8
        L_0x00b0:
            android.graphics.PointF r0 = r4.A04
            X.C130426La.A00(r0, r14)
            r4.A02 = r5
            r4.A01 = r5
            goto L_0x00a9
        L_0x00ba:
            android.graphics.PointF r6 = r4.A06
            X.C130426La.A00(r6, r14)
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x00fd
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00fd
            float r9 = r6.x
            android.graphics.PointF r2 = r4.A05
            float r0 = r2.x
            float r1 = r9 - r0
            float r7 = r6.y
            float r0 = r2.y
            float r0 = r7 - r0
            float r1 = r1 * r1
            float r0 = r0 * r0
            float r1 = r1 + r0
            double r2 = (double) r1
            int r0 = r4.A03
            int r0 = r0 * r0
            double r0 = (double) r0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f5
            r4.A01 = r5
            X.6cW r2 = r4.A00
            android.graphics.PointF r1 = r4.A04
            float r0 = r1.x
            float r9 = r9 - r0
            float r0 = r1.y
            float r7 = r7 - r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r9, r7)
            r2.A01(r0, r1)
        L_0x00f5:
            android.graphics.PointF r0 = r4.A04
            r0.set(r6)
            r4.A02 = r5
            goto L_0x00a9
        L_0x00fd:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00f5
            if (r1 == 0) goto L_0x00f5
            X.6cW r7 = r4.A00
            float r3 = r6.x
            android.graphics.PointF r2 = r4.A04
            float r0 = r2.x
            float r3 = r3 - r0
            float r1 = r6.y
            float r0 = r2.y
            float r1 = r1 - r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            r7.A01(r0, r2)
            goto L_0x00f5
        L_0x011a:
            r4.A02 = r8
            goto L_0x00a9
        L_0x011d:
            android.graphics.PointF r1 = r4.A04
            X.C130426La.A00(r1, r14)
            r4.A02 = r5
            r4.A01 = r8
            android.graphics.PointF r0 = r4.A05
            r0.set(r1)
            goto L_0x00a9
        L_0x012d:
            X.AnonymousClass6LZ.A00(r10)
            X.66p r11 = r10.A04
            X.6Ft r0 = r10.A00
            android.graphics.RectF r0 = r0.A02
            float r3 = r0.centerX()
            float r1 = r0.centerY()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r1)
            android.graphics.PointF r3 = r11.A01(r0)
            X.6NQ r1 = r10.A05
            X.6Ft r0 = r10.A00
            float r3 = r1.A01(r3, r0, r9)
            X.6Ft r1 = r10.A00
            float r0 = r1.A00
            float r0 = r0 + r3
            r1.A00 = r0
            r9 = 1
            goto L_0x008b
        L_0x0159:
            r6.A00 = r10
            r6.A02 = r10
            r6.A01 = r10
            r9 = 0
            goto L_0x0091
        L_0x0162:
            X.6FV r2 = r7.A09
            X.6Ft r1 = r2.A01
            if (r1 == 0) goto L_0x0031
            X.6Ft r0 = r2.A02
            if (r1 == r0) goto L_0x0031
            boolean r0 = r1 instanceof X.AnonymousClass5Ci
            if (r0 != 0) goto L_0x0031
            X.5vF r0 = r1.A09()
            r2.A00 = r0
            r2.A02 = r1
            goto L_0x0031
        L_0x017a:
            X.6FV r4 = r7.A09
            X.6Ft r3 = r4.A01
            if (r3 == 0) goto L_0x01ba
            X.6Ft r0 = r4.A02
            if (r0 != r3) goto L_0x01b2
            boolean r0 = r3 instanceof X.AnonymousClass5Ci
            if (r0 != 0) goto L_0x01b2
            X.5vF r5 = r4.A00
            if (r5 == 0) goto L_0x01b2
            android.graphics.RectF r1 = r5.A03
            android.graphics.RectF r0 = r3.A02
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0218
            float r1 = r3.A00
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0218
            android.graphics.Paint r2 = r3.A01
            int r1 = r2.getColor()
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0218
            float r1 = r2.getStrokeWidth()
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0218
        L_0x01b2:
            r3.A0D()
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
        L_0x01ba:
            X.7nw r0 = r7.A02
            r0.BW2()
            X.6LZ r3 = r7.A04
            X.6Ft r0 = r3.A00
            if (r0 == 0) goto L_0x0031
            float r5 = r14.getX()
            float r4 = r14.getY()
            X.6SM r2 = r3.A06
            android.os.Handler r1 = r2.A01
            java.lang.Runnable r0 = r2.A06
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A05
            r1.post(r0)
            X.AnonymousClass6SM.A00(r2)
            r2.A00 = r8
            boolean r0 = X.AnonymousClass6SM.A01(r2, r5, r4)
            if (r0 == 0) goto L_0x0200
            X.6Ft r2 = r3.A00
            if (r2 == 0) goto L_0x0200
            X.5mH r0 = r3.A02
            X.6wC r1 = r0.A00
            X.6FV r0 = r1.A0T
            r0.A04(r2)
            X.6V4 r0 = r1.A0M
            r0.A03()
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0N
            r0.invalidate()
            X.C146806wC.A03(r1)
        L_0x0200:
            X.6NQ r2 = r3.A05
            java.util.Map r0 = r2.A05
            java.util.Iterator r1 = X.AnonymousClass000.A0z(r0)
        L_0x0208:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r0 = r1.next()
            X.6F8 r0 = (X.AnonymousClass6F8) r0
            r0.A01()
            goto L_0x0208
        L_0x0218:
            X.5vF r0 = r4.A00
            X.5Cs r1 = new X.5Cs
            r1.<init>(r0, r3)
            X.65v r0 = r4.A03
            java.util.List r0 = r0.A00
            r0.add(r1)
            goto L_0x01b2
        L_0x0227:
            X.AnonymousClass6NQ.A00(r2)
            r0 = 0
            r3.A00 = r0
            goto L_0x0031
        L_0x022f:
            int r0 = r14.getPointerCount()
            if (r0 != r1) goto L_0x0288
            X.6FV r1 = r7.A09
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.6Ft r0 = r0.A00(r14)
        L_0x023d:
            r1.A01 = r0
        L_0x023f:
            X.6FV r0 = r7.A09
            X.6Ft r4 = r0.A01
            if (r4 == 0) goto L_0x0031
            X.6LZ r0 = r7.A04
            r0.A00 = r4
            X.6SM r2 = r0.A06
            r1 = 700(0x2bc, float:9.81E-43)
            android.os.Handler r3 = r2.A01
            java.lang.Runnable r0 = r2.A05
            r3.removeCallbacks(r0)
            java.lang.Runnable r2 = r2.A06
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            X.7nw r0 = r7.A02
            r0.BgT(r4)
            r0.BW1()
            boolean r0 = r4.A0O()
            if (r0 == 0) goto L_0x0270
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r7.A03
            float r0 = r4.A08()
            r1.A01 = r0
        L_0x0270:
            boolean r0 = r4.A0N()
            if (r0 == 0) goto L_0x0031
            android.graphics.Paint r2 = r4.A01
            int r0 = r2.getColor()
            if (r0 == 0) goto L_0x0031
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r7.A03
            int r0 = r2.getColor()
            r1.A03 = r0
            goto L_0x0031
        L_0x0288:
            int r0 = r14.getPointerCount()
            if (r0 != r2) goto L_0x023f
            X.6FV r1 = r7.A09
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            X.6Ft r0 = r0.A01(r14)
            goto L_0x023d
        L_0x0297:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.DoodleView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStrokeColor(int i) {
        this.A03 = i;
    }

    public void setStrokeScale(float f) {
        this.A00 = f;
    }

    public void setStrokeWidth(float f) {
        this.A01 = f;
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0D = C90484aE.A0O(this);
        this.A0I = new C1503074t((Object) this, 42);
        AnonymousClass6FV r4 = new AnonymousClass6FV();
        this.A0H = r4;
        AnonymousClass6OT r3 = new AnonymousClass6OT();
        this.A0F = r3;
        this.A0G = new C1270166p(r3);
        this.A0E = new AnonymousClass6V4(this.A04, new C117435mG(this), r3, r4);
        this.A0J = C36441kJ.A0N();
        C90494aF.A0u(this);
    }

    public DoodleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0D = C90484aE.A0O(this);
        this.A0I = new C1503074t((Object) this, 42);
        AnonymousClass6FV r4 = new AnonymousClass6FV();
        this.A0H = r4;
        AnonymousClass6OT r3 = new AnonymousClass6OT();
        this.A0F = r3;
        this.A0G = new C1270166p(r3);
        this.A0E = new AnonymousClass6V4(this.A04, new C117435mG(this), r3, r4);
        this.A0J = C36441kJ.A0N();
        C90494aF.A0u(this);
    }

    public DoodleView(Context context) {
        super(context);
        this.A0D = C90484aE.A0O(this);
        this.A0I = new C1503074t((Object) this, 42);
        AnonymousClass6FV r4 = new AnonymousClass6FV();
        this.A0H = r4;
        AnonymousClass6OT r3 = new AnonymousClass6OT();
        this.A0F = r3;
        this.A0G = new C1270166p(r3);
        this.A0E = new AnonymousClass6V4(this.A04, new C117435mG(this), r3, r4);
        this.A0J = C36441kJ.A0N();
        C90494aF.A0u(this);
    }

    public DoodleView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
