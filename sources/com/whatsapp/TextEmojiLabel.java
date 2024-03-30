package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass0BN;
import X.AnonymousClass14B;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass3RV;
import X.AnonymousClass3UG;
import X.AnonymousClass6YV;
import X.C012005e;
import X.C018107s;
import X.C18820ts;
import X.C19890wg;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21060yb;
import X.C33971gE;
import X.C34021gK;
import X.C598835q;
import X.C65783Tl;
import X.C87024Ne;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

public class TextEmojiLabel extends C33971gE {
    public AnonymousClass0BN A00;
    public C87024Ne A01;
    public C21060yb A02;
    public AnonymousClass1N0 A03;
    public AnonymousClass1H2 A04;
    public C19890wg A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Paint A0A;
    public TextView.BufferType A0B;
    public C34021gK A0C;
    public CharSequence A0D;

    public CharSequence A0D(C65783Tl r10, CharSequence charSequence, List list, float f, int i, boolean z) {
        CharSequence charSequence2;
        C65783Tl r5 = r10;
        if (charSequence == null) {
            return null;
        }
        if (z) {
            charSequence2 = AnonymousClass6YV.A08(this.A02, this.A05, charSequence);
        } else {
            charSequence2 = charSequence;
        }
        if (i != 0 && charSequence2.length() > i) {
            int A002 = AnonymousClass14B.A00(charSequence, i);
            if (charSequence2 instanceof Editable) {
                charSequence2 = ((Editable) charSequence2).delete(A002, charSequence2.length());
            } else {
                charSequence2 = charSequence2.subSequence(0, A002);
            }
        }
        Context context = getContext();
        TextPaint paint = getPaint();
        AnonymousClass1H2 r1 = this.A04;
        AnonymousClass00C.A0D(context, 1);
        AnonymousClass00C.A0D(paint, 2);
        AnonymousClass00C.A0D(r1, 4);
        CharSequence A042 = AnonymousClass3UG.A04(context, paint, r1, charSequence2, f);
        if (r10 == null) {
            r5 = C65783Tl.A03;
        }
        C598835q A003 = C65783Tl.A00(getContext(), this.A01, r5, A042, list, false);
        if (A003 != null) {
            return (CharSequence) A003.A00;
        }
        return null;
    }

    public void A0E() {
        setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void A0I(CharSequence charSequence) {
        A0J(charSequence, (List) null, 0, false);
    }

    public void A0J(CharSequence charSequence, List list, int i, boolean z) {
        A0H((C65783Tl) null, charSequence, list, i, z);
    }

    public void A0H(C65783Tl r9, CharSequence charSequence, List list, int i, boolean z) {
        setText(A0D(r9, charSequence, list, 1.0f, i, z));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AnonymousClass0BN r0 = this.A00;
        if ((r0 == null || !r0.A0y(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass0BN r0 = this.A00;
        if ((r0 == null || !r0.A0x(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.A09 <= 0 || this.A0A == null) {
            try {
                super.onDraw(canvas);
            } catch (IndexOutOfBoundsException unused) {
                setText(getText());
            } catch (Exception e) {
                Log.e((Throwable) e);
                throw new RuntimeException(e);
            }
        } else {
            canvas2.drawRect((float) (getScrollX() + getPaddingLeft()), (float) (((getHeight() - getPaddingBottom()) - this.A07) - this.A08), (float) ((getScrollX() + getWidth()) - getPaddingRight()), (float) ((getHeight() - getPaddingBottom()) - this.A07), this.A0A);
        }
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        if (this.A09 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(i, i2);
            if (mode != 1073741824) {
                measuredWidth = (size * this.A09) / 100;
            } else {
                measuredWidth = getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
            return;
        }
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 0) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            TransformationMethod transformationMethod = getTransformationMethod();
            if (size2 > 0 && this.A06 != size2 && (this.A0D instanceof Spanned) && getEllipsize() != null && (transformationMethod instanceof SingleLineTransformationMethod)) {
                this.A06 = size2;
                CharSequence transformation = transformationMethod.getTransformation(this.A0D, this);
                CharSequence ellipsize = TextUtils.ellipsize(transformation, getPaint(), (float) size2, getEllipsize());
                if (ellipsize != null && !ellipsize.equals(transformation)) {
                    super.setText(ellipsize, this.A0B);
                }
            }
        }
    }

    public void setAccessibilityHelper(AnonymousClass0BN r1) {
        this.A00 = r1;
        C012005e.A0V(this, r1);
    }

    public void setLinkHandler(C34021gK r4) {
        this.A0C = r4;
        C20810yC r2 = this.A02;
        if (r2 != null && C20800yB.A01(C21000yV.A01, r2, 6882)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            setMovementMethod(r4);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    public void setPlaceholder(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            if (i > 0) {
                Paint.FontMetricsInt A002 = AnonymousClass3RV.A00(getPaint());
                this.A08 = ((-A002.ascent) * 6) / 10;
                this.A07 = A002.bottom;
                Paint paint = this.A0A;
                if (paint == null) {
                    paint = new Paint();
                    this.A0A = paint;
                }
                paint.setColor(C018107s.A06(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / 255));
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object obj;
        this.A0D = charSequence;
        this.A0B = bufferType;
        this.A06 = 0;
        C20810yC r2 = this.A02;
        if (r2 == null || !C20800yB.A01(C21000yV.A01, r2, 6882)) {
            obj = this.A0C;
        } else {
            obj = getMovementMethod();
        }
        if (obj != null && (charSequence instanceof Spanned)) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public void A0F(int i, int i2) {
        Drawable A002 = AnonymousClass00E.A00(getContext(), i);
        if (C18820ts.A00(this.A01).A06) {
            setCompoundDrawablesWithIntrinsicBounds(A002, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A002, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(i2));
    }

    public void A0G(Drawable drawable) {
        if (C18820ts.A00(this.A01).A06) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AnonymousClass0BN r2 = this.A00;
        if (r2 != null) {
            int i2 = r2.A02;
            if (i2 != Integer.MIN_VALUE) {
                r2.A0u(i2);
            }
            if (z) {
                AnonymousClass0BN.A09(rect, r2, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            super.onLayout(r11, r12, r13, r14, r15)
            X.4Ne r0 = r10.A01
            if (r0 == 0) goto L_0x003e
            int r14 = r14 - r12
            X.3cZ r0 = (X.C68853cZ) r0
            X.3SF r8 = r0.A01
            android.text.Spannable r7 = r0.A00
            java.lang.CharSequence r9 = r0.A02
            java.lang.String r6 = r0.A03
            com.whatsapp.TextEmojiLabel r5 = r8.A01
            java.lang.CharSequence r4 = r5.getText()
            boolean r0 = r4 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x008b
            r3 = r4
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r3.length()
            java.lang.Class<X.3NB> r0 = X.AnonymousClass3NB.class
            r2 = 0
            java.lang.Object[] r1 = r3.getSpans(r2, r1, r0)
            X.3NB[] r1 = (X.AnonymousClass3NB[]) r1
            if (r1 == 0) goto L_0x008b
            int r0 = r1.length
            if (r0 <= 0) goto L_0x008b
            r0 = r1[r2]
            java.lang.CharSequence r0 = r0.A00
        L_0x0035:
            boolean r0 = android.text.TextUtils.equals(r7, r0)
            if (r0 != 0) goto L_0x003f
            r0 = 0
            r5.A01 = r0
        L_0x003e:
            return
        L_0x003f:
            android.text.TextPaint r3 = r5.getPaint()
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3SF.A00(r8, r9, r6)
            float r1 = android.text.Layout.getDesiredWidth(r2, r3)
            float r0 = (float) r14
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            float r0 = r3.measureText(r0)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            int r14 = r14 - r0
            if (r14 <= 0) goto L_0x0079
            float r1 = (float) r14
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r9, r3, r1, r0)
            android.text.SpannableStringBuilder r9 = X.AnonymousClass3SF.A00(r8, r0, r6)
        L_0x0079:
            r2 = r9
        L_0x007a:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r2)
            X.AnonymousClass3NB.A00(r1, r7)
            boolean r0 = android.text.TextUtils.equals(r4, r1)
            if (r0 != 0) goto L_0x003e
            r5.setText(r1)
            return
        L_0x008b:
            r0 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.onLayout(boolean, int, int, int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C20810yC r2 = this.A02;
        if ((r2 == null || !C20800yB.A01(C21000yV.A01, r2, 6882)) && this.A0C != null) {
            CharSequence text = getText();
            if ((text instanceof Spannable) && getLayout() != null) {
                return onTouchEvent | this.A0C.onTouchEvent(this, (Spannable) text, motionEvent);
            }
        }
        return onTouchEvent;
    }

    public void setOnPostLayoutListener(C87024Ne r1) {
        this.A01 = r1;
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public TextEmojiLabel(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }
}
