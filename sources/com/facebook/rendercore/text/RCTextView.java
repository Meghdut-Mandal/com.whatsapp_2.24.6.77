package com.facebook.rendercore.text;

import X.AnonymousClass000;
import X.C011705b;
import X.C012005e;
import X.C36441kJ;
import X.C95234kH;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;

public class RCTextView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public Layout A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09 = false;
    public ClickableSpan[] A0A;
    public ImageSpan[] A0B;
    public int A0C;
    public int A0D;
    public Paint A0E;
    public Path A0F;
    public boolean A0G;
    public final C95234kH A0H;

    public static int A00(RCTextView rCTextView, int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int i3 = (int) (((float) i2) - rCTextView.A01);
        int i4 = (int) (((float) i) - rCTextView.A00);
        int lineForVertical = rCTextView.A06.getLineForVertical(i3);
        Layout.Alignment alignment = rCTextView.A06.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = rCTextView.A06;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = rCTextView.A06.getLineRight(lineForVertical);
        } else {
            boolean A1S = AnonymousClass000.A1S(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = rCTextView.A06;
            if (A1S) {
                paragraphLeft = ((float) layout2.getWidth()) - rCTextView.A06.getLineMax(lineForVertical);
                lineMax = (float) rCTextView.A06.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout2.getParagraphLeft(lineForVertical);
                lineMax = rCTextView.A06.getLineMax(lineForVertical);
            }
        }
        float f = (float) i4;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return rCTextView.A06.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public static void A02(RCTextView rCTextView, int i, int i2) {
        CornerPathEffect cornerPathEffect;
        if (Color.alpha(rCTextView.A02) == 0) {
            return;
        }
        if (rCTextView.A0D != i || rCTextView.A0C != i2) {
            rCTextView.A0D = i;
            rCTextView.A0C = i2;
            Paint paint = rCTextView.A0E;
            if (paint == null) {
                paint = C36441kJ.A0K();
                rCTextView.A0E = paint;
            }
            paint.setColor(rCTextView.A02);
            int i3 = rCTextView.A03;
            Paint paint2 = rCTextView.A0E;
            if (i3 != 0) {
                cornerPathEffect = new CornerPathEffect((float) i3);
            } else {
                cornerPathEffect = null;
            }
            paint2.setPathEffect(cornerPathEffect);
            rCTextView.A0G = true;
            rCTextView.invalidate();
        }
    }

    private Path getSelectionPath() {
        if (this.A0D == this.A0C || Color.alpha(this.A02) == 0) {
            return null;
        }
        if (this.A0G) {
            Path path = this.A0F;
            if (path == null) {
                path = C36441kJ.A0M();
                this.A0F = path;
            }
            this.A06.getSelectionPath(this.A0D, this.A0C, path);
            this.A0G = false;
        }
        return this.A0F;
    }

    /* access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A07;
        if (charSequence == null || charSequence.length() < 1000000) {
            return this.A07;
        }
        if (!Character.isHighSurrogate(this.A07.charAt(999999)) || !Character.isLowSurrogate(this.A07.charAt(1000000))) {
            return this.A07.subSequence(0, 1000000);
        }
        return this.A07.subSequence(0, 999999);
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A07;
        A02(this, spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C95234kH r0 = this.A0H;
        if ((r0 == null || !r0.A0y(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public RCTextView(Context context) {
        super(context);
        if (getImportantForAccessibility() == 0) {
            C95234kH r1 = new C95234kH(this);
            this.A0H = r1;
            this.A09 = true;
            C012005e.A0V(this, r1);
            this.A09 = false;
            return;
        }
        this.A0H = null;
    }

    public void draw(Canvas canvas) {
        int save;
        boolean z;
        super.draw(canvas);
        if (this.A06 != null) {
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
                z = false;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                z = true;
            }
            this.A06.draw(canvas, getSelectionPath(), this.A0E, 0);
            if (z) {
                canvas.restoreToCount(save);
            }
        }
    }

    public Layout getLayout() {
        return this.A06;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public CharSequence getText() {
        return this.A07;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A02(this, 0, 0);
            return false;
        }
        int A002 = A00(this, (int) motionEvent.getX(), (int) motionEvent.getY());
        CharSequence charSequence = this.A07;
        if (!(charSequence instanceof Spanned) || A002 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A002, A002, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
            A02(this, 0, 0);
            return super.onTouchEvent(motionEvent);
        } else if (actionMasked == 1) {
            A02(this, 0, 0);
            clickableSpan.onClick(this);
            return true;
        } else if (actionMasked != 0) {
            return true;
        } else {
            setSelection(clickableSpan);
            return true;
        }
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        C011705b A052;
        super.setAccessibilityDelegate(accessibilityDelegate);
        C95234kH r1 = this.A0H;
        if (r1 != null && !this.A09 && (A052 = C012005e.A05(this)) != r1) {
            r1.A00 = A052;
            this.A09 = true;
            C012005e.A0V(this, r1);
            this.A09 = false;
        }
    }
}
