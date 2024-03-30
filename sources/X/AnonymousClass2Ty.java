package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.2Ty  reason: invalid class name */
public class AnonymousClass2Ty extends C39031qw {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03 = 0.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public Bitmap A06;
    public Drawable A07;
    public AnonymousClass4V2 A08;
    public Integer A09;
    public boolean A0A;
    public Drawable A0B;
    public Drawable A0C;
    public boolean A0D;
    public final Paint A0E = C36441kJ.A0L(1);
    public final Paint A0F = C36441kJ.A0L(1);
    public final Paint A0G = C36441kJ.A0L(1);
    public final Paint A0H = C36441kJ.A0L(1);
    public final Map A0I = AnonymousClass001.A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = (X.AnonymousClass2UM) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.graphics.Canvas r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.AnonymousClass2UM
            if (r0 == 0) goto L_0x0033
            r5 = r6
            X.2UM r5 = (X.AnonymousClass2UM) r5
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 == 0) goto L_0x0033
            int r0 = r0.getIntrinsicHeight()
            int r4 = r0 / 4
            android.graphics.drawable.Drawable r3 = r5.A00
            int r2 = r5.getHeight()
            android.graphics.drawable.Drawable r0 = r5.A00
            int r0 = r0.getIntrinsicHeight()
            int r2 = r2 - r0
            int r2 = r2 - r4
            android.graphics.drawable.Drawable r0 = r5.A00
            int r1 = r0.getIntrinsicWidth()
            int r1 = r1 + r4
            int r0 = r5.getHeight()
            int r0 = r0 - r4
            r3.setBounds(r4, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r0.draw(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ty.A03(android.graphics.Canvas):void");
    }

    public Uri getUri() {
        AnonymousClass4V2 r0 = this.A08;
        if (r0 == null) {
            return null;
        }
        return r0.B7k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c7, code lost:
        if (r1 != null) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r22) {
        /*
            r21 = this;
            r0 = r21
            r10 = r22
            super.onDraw(r10)
            r0.A03(r10)
            boolean r1 = r0.A0D
            if (r1 == 0) goto L_0x00ff
            java.lang.Integer r1 = r0.A09
            if (r1 == 0) goto L_0x00b6
            int r1 = r1.intValue()
            int r1 = r1 + 1
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r9 = r3.length()
            java.util.Map r8 = r0.A0I
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            boolean r1 = r8.containsKey(r7)
            if (r1 == 0) goto L_0x0095
            java.lang.Object r6 = r8.get(r7)
            X.C18740tg.A06(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
        L_0x0035:
            int r2 = r6.right
            int r1 = r6.left
            int r2 = r2 - r1
            float r7 = (float) r2
            int r2 = r6.bottom
            int r1 = r6.top
            int r2 = r2 - r1
            float r6 = (float) r2
            float r4 = X.C36441kJ.A01(r0)
            float r4 = r4 - r7
            float r1 = r0.A04
            float r4 = r4 - r1
            float r2 = r0.A02
            float r1 = r0.A05
            float r2 = r2 + r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r1
            float r6 = r6 * r1
            float r4 = r4 + r7
            float r14 = r2 - r6
            float r18 = X.C36441kJ.A01(r0)
            float r19 = X.C36441kJ.A02(r0)
            android.graphics.Paint r1 = r0.A0E
            r16 = 0
            r17 = 0
            r15 = r10
            r20 = r1
            r15.drawRect(r16, r17, r18, r19, r20)
            android.graphics.Paint r8 = r0.A0F
            float r11 = r4 - r7
            float r5 = r0.A00
            float r11 = r11 - r5
            float r12 = r14 - r6
            float r1 = r0.A01
            float r12 = r12 - r1
            float r13 = r4 + r7
            float r13 = r13 + r5
            float r14 = r14 + r6
            float r14 = r14 + r1
            float r15 = r0.A03
            r16 = r15
            r17 = r8
            r10.drawRoundRect(r11, r12, r13, r14, r15, r16, r17)
            android.graphics.Paint r1 = r0.A0G
            r10.drawText(r3, r4, r2, r1)
        L_0x0088:
            android.graphics.drawable.Drawable r1 = r0.A0C
            if (r1 == 0) goto L_0x0094
            X.C36371kC.A19(r1, r0)
            android.graphics.drawable.Drawable r0 = r0.A0C
            r0.draw(r10)
        L_0x0094:
            return
        L_0x0095:
            android.graphics.Rect r6 = X.AnonymousClass001.A06()
            android.graphics.Paint r5 = r0.A0G
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            r2 = 0
        L_0x00a0:
            if (r2 >= r9) goto L_0x00aa
            java.lang.String r1 = "0"
            r4.append(r1)
            int r2 = r2 + 1
            goto L_0x00a0
        L_0x00aa:
            java.lang.String r2 = r4.toString()
            r1 = 0
            r5.getTextBounds(r2, r1, r9, r6)
            r8.put(r7, r6)
            goto L_0x0035
        L_0x00b6:
            android.graphics.drawable.Drawable r1 = r0.A0B
            if (r1 != 0) goto L_0x00c9
            android.content.Context r2 = r0.getContext()
            r1 = 2131233495(0x7f080ad7, float:1.808313E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00E.A00(r2, r1)
            r0.A0B = r1
            if (r1 == 0) goto L_0x0088
        L_0x00c9:
            r1 = 1073741824(0x40000000, float:2.0)
            r10.drawColor(r1)
            int r2 = r0.getWidth()
            android.graphics.drawable.Drawable r1 = r0.A0B
            int r1 = r1.getIntrinsicWidth()
            int r2 = r2 - r1
            int r5 = r2 / 2
            int r2 = r0.getHeight()
            android.graphics.drawable.Drawable r1 = r0.A0B
            int r1 = r1.getIntrinsicHeight()
            int r2 = r2 - r1
            int r4 = r2 / 2
            android.graphics.drawable.Drawable r3 = r0.A0B
            int r2 = r3.getIntrinsicWidth()
            int r2 = r2 + r5
            android.graphics.drawable.Drawable r1 = r0.A0B
            int r1 = r1.getIntrinsicHeight()
            int r1 = r1 + r4
            r3.setBounds(r5, r4, r2, r1)
            android.graphics.drawable.Drawable r1 = r0.A0B
            r1.draw(r10)
            goto L_0x0088
        L_0x00ff:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x0088
            java.lang.String r8 = "0"
            int r7 = r8.length()
            java.util.Map r6 = r0.A0I
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            boolean r1 = r6.containsKey(r5)
            if (r1 == 0) goto L_0x0158
            java.lang.Object r4 = r6.get(r5)
            X.C18740tg.A06(r4)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
        L_0x011e:
            int r2 = r4.right
            int r1 = r4.left
            int r2 = r2 - r1
            float r5 = (float) r2
            int r2 = r4.bottom
            int r1 = r4.top
            int r2 = r2 - r1
            float r4 = (float) r2
            float r13 = X.C36441kJ.A01(r0)
            float r13 = r13 - r5
            float r1 = r0.A04
            float r13 = r13 - r1
            float r14 = r0.A02
            float r1 = r0.A05
            float r14 = r14 + r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r1
            float r4 = r4 * r1
            float r13 = r13 + r5
            float r14 = r14 - r4
            android.graphics.Paint r3 = r0.A0H
            float r11 = r13 - r5
            float r2 = r0.A00
            float r11 = r11 - r2
            float r12 = r14 - r4
            float r1 = r0.A01
            float r12 = r12 - r1
            float r13 = r13 + r5
            float r13 = r13 + r2
            float r14 = r14 + r4
            float r14 = r14 + r1
            float r15 = r0.A03
            r16 = r15
            r17 = r3
            r10.drawRoundRect(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0088
        L_0x0158:
            android.graphics.Rect r4 = X.AnonymousClass001.A06()
            android.graphics.Paint r3 = r0.A0G
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
        L_0x0163:
            if (r1 >= r7) goto L_0x016b
            r2.append(r8)
            int r1 = r1 + 1
            goto L_0x0163
        L_0x016b:
            java.lang.String r2 = r2.toString()
            r1 = 0
            r3.getTextBounds(r2, r1, r7, r4)
            r6.put(r5, r4)
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ty.onDraw(android.graphics.Canvas):void");
    }

    public void setChecked(boolean z) {
        if (this.A0D != z) {
            this.A0D = z;
            setSelected(z);
            invalidate();
        }
    }

    public void setCheckedPosition(Integer num) {
        if (!Objects.equals(this.A09, num)) {
            boolean A1V = AnonymousClass000.A1V(num);
            this.A0D = A1V;
            this.A09 = num;
            setSelected(A1V);
            invalidate();
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A0C = drawable;
        invalidate();
    }

    public void setMediaItem(AnonymousClass4V2 r3) {
        int i;
        this.A08 = r3;
        if (r3 != null) {
            int type = r3.getType();
            if (type == 0) {
                i = R.string.f12nameremoved;
            } else if (type == 1) {
                i = R.string.f12nameremoved;
            } else if (type == 2) {
                i = R.string.f12nameremoved;
            } else if (type == 3) {
                i = R.string.f12nameremoved;
            } else if (type == 4) {
                i = R.string.f12nameremoved;
            } else {
                return;
            }
            C36331k8.A0q(getContext(), this, i);
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A07;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A07 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.A07) {
            return true;
        }
        if (drawable == null || !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public AnonymousClass2Ty(Context context) {
        super(context);
        Drawable A002 = AnonymousClass00E.A00(context, R.drawable.selector_orange_gradient);
        this.A07 = A002;
        if (A002 != null) {
            A002.setCallback(this);
        }
        this.A01 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        this.A00 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        this.A05 = (float) C36361kB.A02(context, R.dimen.f7nameremoved);
        this.A04 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        this.A03 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        Paint paint = this.A0E;
        C36381kD.A16(context, paint, R.color.f6nameremoved);
        paint.setAlpha(153);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.A0F;
        paint2.setColor(C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        paint2.setStyle(style);
        Paint paint3 = this.A0G;
        paint3.setColor(C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        paint3.setTextSize(C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(C33511fU.A00());
        this.A02 = paint3.getTextSize();
        Paint paint4 = this.A0H;
        C36381kD.A16(context, paint4, R.color.f6nameremoved);
        C36421kH.A0q(paint4);
        paint4.setStrokeWidth(C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
        paint4.setShadowLayer(this.A03, 0.0f, 0.0f, -16777216);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A07;
        if (drawable != null) {
            C36371kC.A19(drawable, this);
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A07;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public AnonymousClass4V2 getMediaItem() {
        return this.A08;
    }

    public Bitmap getThumbnail() {
        return this.A06;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setMultiCheckEnabled(boolean z) {
        this.A0A = z;
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A06 = bitmap;
    }
}
