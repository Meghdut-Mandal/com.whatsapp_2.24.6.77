package com.whatsapp.crop;

import X.AnonymousClass001;
import X.AnonymousClass0BN;
import X.AnonymousClass2LU;
import X.AnonymousClass3Qg;
import X.AnonymousClass4O0;
import X.C012005e;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import X.C39311rg;
import X.C80753vu;
import X.C81193wc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends AnonymousClass2LU implements AnonymousClass4O0 {
    public boolean A00;
    public boolean A01;
    public float A02;
    public float A03;
    public int A04;
    public AnonymousClass3Qg A05;
    public final ArrayList A06;
    public final C39311rg A07;

    public void clearFocus() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i < arrayList.size()) {
                AnonymousClass3Qg r1 = (AnonymousClass3Qg) arrayList.get(i);
                r1.A09 = false;
                r1.A04 = AnonymousClass3Qg.A00(r1);
                i++;
            } else {
                return;
            }
        }
    }

    public static void A00(CropImageView cropImageView, int i, int i2, int i3, int i4) {
        C39311rg r2 = cropImageView.A07;
        Rect rect = r2.A02;
        int i5 = r2.A0P;
        rect.set(i4 - i5, i, i4, i3);
        r2.A03.set(i4, i, i5 + i4, i3);
        r2.A04.set(i2 - i5, i, i2, i3);
        r2.A05.set(i2, i, i5 + i2, i3);
        r2.A07.set(i4, i - i5, i2, i);
        r2.A06.set(i4, i, i2, i5 + i);
        r2.A01.set(i4, i3 - i5, i2, i3);
        r2.A00.set(i4, i3, i2, i5 + i3);
        r2.A0G = true;
        r2.A0o();
    }

    private void A01(AnonymousClass3Qg r14) {
        Rect rect = r14.A04;
        float width = (float) rect.width();
        float max = Math.max(1.0f, Math.min((C36441kJ.A01(this) / width) * 0.6f, (C36441kJ.A02(this) / ((float) rect.height())) * 0.6f) * getScale());
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {r14.A05.centerX(), r14.A05.centerY()};
            getImageMatrix().mapPoints(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            this.A06.post(new C80753vu(this, new C81193wc(this, r14, 12), getScale(), (max - getScale()) / 300.0f, f, f2, System.currentTimeMillis()));
        }
    }

    public void A08(AnonymousClass3Qg r8) {
        Rect rect = r8.A04;
        int max = Math.max(0, -rect.left);
        int min = Math.min(0, getWidth() - rect.right);
        int max2 = Math.max(0, -rect.top);
        int min2 = Math.min(0, getHeight() - rect.bottom);
        if (max == 0 && rect.width() <= getWidth()) {
            max = min;
        }
        if (max2 == 0 && rect.height() <= getHeight()) {
            max2 = min2;
        }
        if (max != 0 || max2 != 0) {
            float f = (float) max;
            float f2 = (float) max2;
            if (f != 0.0f || f2 != 0.0f) {
                A05(f, f2);
                setImageMatrix(getImageViewMatrix());
            }
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A07.A0y(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Canvas canvas2 = canvas;
        if (!this.A01) {
            super.onDraw(canvas2);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i < arrayList.size()) {
                AnonymousClass3Qg r8 = (AnonymousClass3Qg) arrayList.get(i);
                Path A0M = C36441kJ.A0M();
                View view = r8.A07;
                float f = C36361kB.A0B(view).density;
                Paint paint5 = r8.A0D;
                paint5.setStrokeWidth(0.5f + f);
                Rect A062 = AnonymousClass001.A06();
                view.getDrawingRect(A062);
                boolean z = r8.A08;
                Rect rect = r8.A04;
                if (z) {
                    float width = (float) rect.width();
                    float height = (float) r8.A04.height();
                    Rect rect2 = r8.A04;
                    float f2 = width / 2.0f;
                    A0M.addCircle(((float) rect2.left) + f2, ((float) rect2.top) + (height / 2.0f), f2, Path.Direction.CW);
                    paint5.setColor(-1112874);
                } else {
                    A0M.addRect(new RectF(rect), Path.Direction.CW);
                    paint5.setColor(1728053247);
                    Rect A063 = AnonymousClass001.A06();
                    A063.set(A062);
                    A063.right = r8.A04.left;
                    if (r8.A09) {
                        paint = r8.A0B;
                    } else {
                        paint = r8.A0C;
                    }
                    canvas2.drawRect(A063, paint);
                    A063.set(A062);
                    Rect rect3 = r8.A04;
                    A063.right = rect3.right;
                    A063.left = rect3.left;
                    A063.bottom = rect3.top;
                    if (r8.A09) {
                        paint2 = r8.A0B;
                    } else {
                        paint2 = r8.A0C;
                    }
                    canvas2.drawRect(A063, paint2);
                    A063.set(A062);
                    Rect rect4 = r8.A04;
                    A063.right = rect4.right;
                    A063.left = rect4.left;
                    A063.top = rect4.bottom;
                    if (r8.A09) {
                        paint3 = r8.A0B;
                    } else {
                        paint3 = r8.A0C;
                    }
                    canvas2.drawRect(A063, paint3);
                    A063.set(A062);
                    A063.left = r8.A04.right;
                    if (r8.A09) {
                        paint4 = r8.A0B;
                    } else {
                        paint4 = r8.A0C;
                    }
                    canvas2.drawRect(A063, paint4);
                    int round = Math.round(f);
                    Rect rect5 = r8.A04;
                    int i2 = rect5.left + round;
                    int i3 = rect5.right - round;
                    int i4 = rect5.top;
                    int i5 = i4 + round;
                    int i6 = rect5.bottom;
                    int i7 = i6 - round;
                    float f3 = (float) i2;
                    float f4 = (float) (i4 + ((i6 - i4) / 3));
                    Paint paint6 = paint5;
                    float f5 = (float) i3;
                    canvas2.drawLine(f3, f4, f5, f4, paint6);
                    Rect rect6 = r8.A04;
                    int i8 = rect6.bottom;
                    float f6 = (float) (i8 - ((i8 - rect6.top) / 3));
                    canvas2.drawLine(f3, f6, f5, f6, paint6);
                    Rect rect7 = r8.A04;
                    int i9 = rect7.left;
                    float f7 = (float) (i9 + ((rect7.right - i9) / 3));
                    float f8 = (float) i7;
                    float f9 = (float) i5;
                    canvas2.drawLine(f7, f9, f7, f8, paint6);
                    Rect rect8 = r8.A04;
                    int i10 = rect8.right;
                    float f10 = (float) (i10 - ((i10 - rect8.left) / 3));
                    canvas2.drawLine(f10, f9, f10, f8, paint6);
                }
                canvas2.drawPath(A0M, paint5);
                float f11 = 2.0f * f;
                int round2 = Math.round(f11);
                Rect rect9 = r8.A04;
                int i11 = rect9.left + round2;
                int i12 = rect9.right - round2;
                int i13 = rect9.top + round2;
                int i14 = rect9.bottom - round2;
                int i15 = (int) (f * 24.0f);
                int min = Math.min(i15, rect9.width() / 4);
                int min2 = Math.min(i15, r8.A04.height() / 4);
                Rect rect10 = r8.A04;
                int i16 = rect10.left;
                int i17 = i16 + ((rect10.right - i16) / 2);
                int i18 = rect10.top;
                int i19 = i18 + ((rect10.bottom - i18) / 2);
                paint5.setStrokeWidth(f11);
                paint5.setColor(-1);
                paint5.setStrokeCap(Paint.Cap.SQUARE);
                int i20 = min / 2;
                float f12 = (float) i13;
                Paint paint7 = paint5;
                float f13 = (float) (i17 - i20);
                float f14 = (float) (i17 + i20);
                Canvas canvas3 = canvas2;
                canvas3.drawLine(f13, f12, f14, f12, paint7);
                float f15 = (float) i14;
                canvas3.drawLine(f13, f15, f14, f15, paint7);
                float f16 = (float) i11;
                int i21 = min2 / 2;
                float f17 = (float) (i19 - i21);
                float f18 = (float) (i19 + i21);
                canvas3.drawLine(f16, f17, f16, f18, paint7);
                float f19 = (float) i12;
                canvas3.drawLine(f19, f17, f19, f18, paint7);
                float f20 = (float) (i11 + min);
                float f21 = f12;
                float f22 = f16;
                canvas3.drawLine(f22, f21, f20, f12, paint7);
                float f23 = (float) (i13 + min2);
                canvas3.drawLine(f22, f21, f16, f23, paint7);
                float f24 = (float) (i12 - min);
                Canvas canvas4 = canvas2;
                float f25 = f19;
                float f26 = f12;
                Paint paint8 = paint5;
                canvas4.drawLine(f25, f26, f24, f12, paint8);
                canvas4.drawLine(f25, f26, f19, f23, paint8);
                canvas4.drawLine(f25, f15, f24, f15, paint8);
                float f27 = (float) (i14 - min2);
                Paint paint9 = paint5;
                float f28 = f15;
                canvas2.drawLine(f19, f28, f19, f27, paint9);
                float f29 = f16;
                canvas2.drawLine(f29, f28, f20, f15, paint9);
                canvas2.drawLine(f29, f28, f16, f27, paint9);
                i++;
            } else {
                return;
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
    }

    public void A05(float f, float f2) {
        super.A05(f, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A06;
            if (i < arrayList.size()) {
                AnonymousClass3Qg r1 = (AnonymousClass3Qg) arrayList.get(i);
                r1.A03.postTranslate(f, f2);
                r1.A04 = AnonymousClass3Qg.A00(r1);
                i++;
            } else {
                return;
            }
        }
    }

    public void A06(float f, float f2, float f3) {
        super.A06(f, f2, f3);
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            AnonymousClass3Qg r2 = (AnonymousClass3Qg) it.next();
            r2.A03.set(getImageMatrix());
            r2.A04 = AnonymousClass3Qg.A00(r2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A07.A00 != null) {
            Iterator it = this.A06.iterator();
            while (it.hasNext()) {
                AnonymousClass3Qg r2 = (AnonymousClass3Qg) it.next();
                r2.A03.set(getImageMatrix());
                r2.A04 = AnonymousClass3Qg.A00(r2);
                if (r2.A09) {
                    A01(r2);
                }
            }
        }
        ArrayList arrayList = this.A06;
        if (arrayList.size() > 0) {
            ((AnonymousClass3Qg) arrayList.get(0)).A03();
            Rect A032 = ((AnonymousClass3Qg) arrayList.get(0)).A03();
            A00(this, A032.top, A032.right, A032.bottom, A032.left);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass3Qg r6;
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            while (true) {
                ArrayList arrayList = this.A06;
                if (i >= arrayList.size()) {
                    break;
                }
                AnonymousClass3Qg r2 = (AnonymousClass3Qg) arrayList.get(i);
                int A012 = r2.A01(motionEvent.getX(), motionEvent.getY());
                if (A012 != 1) {
                    this.A04 = A012;
                    this.A05 = r2;
                    this.A02 = motionEvent.getX();
                    this.A03 = motionEvent.getY();
                    AnonymousClass3Qg r22 = this.A05;
                    int i2 = 2;
                    if (A012 == 32) {
                        i2 = 1;
                    }
                    if (i2 != r22.A02) {
                        r22.A02 = i2;
                        r22.A07.invalidate();
                    }
                    clearFocus();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        AnonymousClass3Qg r23 = (AnonymousClass3Qg) arrayList.get(i3);
                        if (r23.A01(motionEvent.getX(), motionEvent.getY()) == 1) {
                            i3++;
                        } else if (!r23.A09) {
                            r23.A09 = true;
                            r23.A04 = AnonymousClass3Qg.A00(r23);
                        }
                    }
                    invalidate();
                } else {
                    i++;
                }
            }
        } else if (action == 1) {
            AnonymousClass3Qg r1 = this.A05;
            if (r1 != null) {
                if (r1.A09) {
                    r1.A09 = false;
                    r1.A04 = AnonymousClass3Qg.A00(r1);
                    invalidate();
                }
                A01(this.A05);
                AnonymousClass3Qg r12 = this.A05;
                if (0 != r12.A02) {
                    r12.A02 = 0;
                    r12.A07.invalidate();
                }
            }
            this.A05 = null;
        } else if (action == 2 && (r6 = this.A05) != null) {
            r6.A04(this.A04, motionEvent.getX() - this.A02, motionEvent.getY() - this.A03);
            this.A02 = motionEvent.getX();
            this.A03 = motionEvent.getY();
            A08(this.A05);
        }
        int action2 = motionEvent.getAction();
        if (action2 != 1 && (action2 == 2 ? getScale() != 1.0f : action2 != 3)) {
            return true;
        }
        A04();
        return true;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass001.A0I();
        this.A05 = null;
        Rect rect = AnonymousClass0BN.A0A;
        C39311rg r0 = new C39311rg(this, this, C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A07 = r0;
        C012005e.A0V(this, r0);
    }
}
