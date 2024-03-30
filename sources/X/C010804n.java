package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.04n  reason: invalid class name and case insensitive filesystem */
public class C010804n extends C010704m {
    public static final PorterDuff.Mode A09 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass0BX A00;
    public boolean A01;
    public ColorFilter A02;
    public PorterDuffColorFilter A03;
    public Drawable.ConstantState A04;
    public boolean A05;
    public final Matrix A06;
    public final Rect A07;
    public final float[] A08;

    public static C010804n A00(Resources.Theme theme, Resources resources, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C010804n r2 = new C010804n();
            Drawable A002 = AnonymousClass0BT.A00(theme, resources, i);
            r2.A00 = A002;
            r2.A04 = new C02590Bb(A002.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    C010804n r0 = new C010804n();
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public PorterDuffColorFilter A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        AnonymousClass076.A08(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A07;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A02;
            if (colorFilter == null) {
                colorFilter = this.A03;
            }
            Matrix matrix = this.A06;
            canvas.getMatrix(matrix);
            float[] fArr = this.A08;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && AnonymousClass08I.A00(this) == 1) {
                    canvas.translate((float) rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                AnonymousClass0BX r1 = this.A00;
                Bitmap bitmap = r1.A04;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == r1.A04.getHeight())) {
                    r1.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    r1.A0A = true;
                }
                boolean z = this.A01;
                AnonymousClass0BX r8 = this.A00;
                if (!z) {
                    r8.A00(min, min2);
                } else if (!(!r8.A0A && r8.A02 == r8.A03 && r8.A06 == r8.A07 && r8.A0B == r8.A09 && r8.A00 == r8.A08.A04)) {
                    r8.A00(min, min2);
                    AnonymousClass0BX r12 = this.A00;
                    r12.A02 = r12.A03;
                    r12.A06 = r12.A07;
                    r12.A00 = r12.A08.A04;
                    r12.A0B = r12.A09;
                    r12.A0A = false;
                }
                AnonymousClass0BX r6 = this.A00;
                if (r6.A08.A04 < 255 || colorFilter != null) {
                    if (r6.A05 == null) {
                        Paint paint2 = new Paint();
                        r6.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    r6.A05.setAlpha(r6.A08.A04);
                    r6.A05.setColorFilter(colorFilter);
                    paint = r6.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(r6.A04, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0XY.A00(drawable);
        }
        return this.A00.A08.A04;
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.A00.A01;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass076.A00(drawable);
        }
        return this.A02;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C02590Bb(drawable.getConstantState());
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.A00.A08.A00;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.A00.A08.A01;
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void invalidateSelf() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return AnonymousClass0XY.A02(drawable);
        }
        return this.A00.A09;
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        AnonymousClass0BX r0 = this.A00;
        if (r0 == null) {
            return false;
        }
        AnonymousClass0BY r1 = r0.A08;
        Boolean bool = r1.A08;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A01());
            r1.A08 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A03;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A05 && super.mutate() == this) {
            this.A00 = new AnonymousClass0BX(this.A00);
            this.A05 = true;
            return this;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        AnonymousClass0BX r3 = this.A00;
        ColorStateList colorStateList = r3.A03;
        if (!(colorStateList == null || (mode = r3.A07) == null)) {
            this.A03 = A01(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        AnonymousClass0BY r1 = r3.A08;
        Boolean bool = r1.A08;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A01());
            r1.A08 = bool;
        }
        if (bool.booleanValue()) {
            boolean A022 = r3.A08.A0F.A02(iArr);
            r3.A0A |= A022;
            if (A022) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        AnonymousClass0BY r1 = this.A00.A08;
        if (r1.A04 != i) {
            r1.A04 = i;
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass0XY.A01(drawable, z);
        } else {
            this.A00.A09 = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A02 = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass076.A06(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass076.A01(colorStateList, drawable);
            return;
        }
        AnonymousClass0BX r1 = this.A00;
        if (r1.A03 != colorStateList) {
            r1.A03 = colorStateList;
            this.A03 = A01(colorStateList, r1.A07);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            AnonymousClass076.A04(mode, drawable);
            return;
        }
        AnonymousClass0BX r1 = this.A00;
        if (r1.A07 != mode) {
            r1.A07 = mode;
            this.A03 = A01(r1.A03, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public C010804n(AnonymousClass0BX r3) {
        this.A01 = true;
        this.A08 = new float[9];
        this.A06 = new Matrix();
        this.A07 = new Rect();
        this.A00 = r3;
        this.A03 = A01(r3.A03, r3.A07);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.0Ic} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: X.0Id} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.0Ic} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: X.0Ic} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: X.0Ic} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.content.res.Resources.Theme r22) {
        /*
            r18 = this;
            r5 = r18
            android.graphics.drawable.Drawable r0 = r5.A00
            r9 = r19
            r8 = r20
            r7 = r21
            r6 = r22
            if (r0 == 0) goto L_0x0012
            X.AnonymousClass076.A02(r6, r9, r0, r7, r8)
            return
        L_0x0012:
            X.0BX r4 = r5.A00
            X.0BY r0 = new X.0BY
            r0.<init>()
            r4.A08 = r0
            int[] r0 = X.AnonymousClass0SA.A02
            android.content.res.TypedArray r2 = X.AnonymousClass0Yh.A02(r6, r9, r7, r0)
            X.0BX r11 = r5.A00
            X.0BY r10 = r11.A08
            java.lang.String r0 = "tintMode"
            r3 = 6
            r1 = -1
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 != 0) goto L_0x035d
            r3 = -1
        L_0x0030:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r0 = 3
            if (r3 == r0) goto L_0x0359
            r0 = 5
            if (r3 == r0) goto L_0x003f
            r0 = 9
            if (r3 == r0) goto L_0x0355
            switch(r3) {
                case 14: goto L_0x0351;
                case 15: goto L_0x034d;
                case 16: goto L_0x0349;
                default: goto L_0x003f;
            }
        L_0x003f:
            r11.A07 = r1
            android.content.res.ColorStateList r0 = X.AnonymousClass0Yh.A01(r6, r2, r8)
            if (r0 == 0) goto L_0x0049
            r11.A03 = r0
        L_0x0049:
            boolean r3 = r11.A09
            java.lang.String r0 = "autoMirrored"
            r1 = 5
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x0058
            boolean r3 = r2.getBoolean(r1, r3)
        L_0x0058:
            r11.A09 = r3
            float r3 = r10.A03
            java.lang.String r0 = "viewportWidth"
            r1 = 7
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x0069
            float r3 = r2.getFloat(r1, r3)
        L_0x0069:
            r10.A03 = r3
            float r11 = r10.A02
            java.lang.String r0 = "viewportHeight"
            r1 = 8
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x007b
            float r11 = r2.getFloat(r1, r11)
        L_0x007b:
            r10.A02 = r11
            float r0 = r10.A03
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x03c9
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x03ae
            r1 = 3
            float r0 = r10.A01
            float r0 = r2.getDimension(r1, r0)
            r10.A01 = r0
            r1 = 2
            float r0 = r10.A00
            float r1 = r2.getDimension(r1, r0)
            r10.A00 = r1
            float r0 = r10.A01
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0393
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0378
            float r3 = r10.getAlpha()
            java.lang.String r0 = "alpha"
            r1 = 4
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x00b5
            float r3 = r2.getFloat(r1, r3)
        L_0x00b5:
            r10.setAlpha(r3)
            r0 = 0
            java.lang.String r1 = r2.getString(r0)
            if (r1 == 0) goto L_0x00c6
            r10.A09 = r1
            X.008 r0 = r10.A0E
            r0.put(r1, r10)
        L_0x00c6:
            r2.recycle()
            int r0 = r5.getChangingConfigurations()
            r4.A01 = r0
            r3 = 1
            r4.A0A = r3
            X.0BX r2 = r5.A00
            X.0BY r1 = r2.A08
            java.util.ArrayDeque r17 = new java.util.ArrayDeque
            r17.<init>()
            X.0Ba r10 = r1.A0F
            r0 = r17
            r0.push(r10)
            int r12 = r8.getEventType()
            int r0 = r8.getDepth()
            int r16 = r0 + 1
            r15 = 1
        L_0x00ed:
            if (r12 == r3) goto L_0x0363
            int r10 = r8.getDepth()
            r11 = 3
            r0 = r16
            if (r10 >= r0) goto L_0x00fa
            if (r12 == r11) goto L_0x0363
        L_0x00fa:
            r0 = 2
            java.lang.String r10 = "group"
            if (r12 != r0) goto L_0x0338
            java.lang.String r11 = r8.getName()
            java.lang.Object r12 = r17.peek()
            X.0Ba r12 = (X.C02580Ba) r12
            java.lang.String r0 = "path"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0243
            X.0Id r11 = new X.0Id
            r11.<init>()
            int[] r0 = X.AnonymousClass0SA.A0A
            android.content.res.TypedArray r13 = X.AnonymousClass0Yh.A02(r6, r9, r7, r0)
            r0 = 0
            r11.A0B = r0
            java.lang.String r0 = "pathData"
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x020e
            r0 = 0
            java.lang.String r0 = r13.getString(r0)
            if (r0 == 0) goto L_0x0130
            r11.A02 = r0
        L_0x0130:
            r0 = 2
            java.lang.String r0 = r13.getString(r0)
            if (r0 == 0) goto L_0x013d
            X.0YU[] r0 = X.AnonymousClass0YJ.A02(r0)
            r11.A03 = r0
        L_0x013d:
            java.lang.String r0 = "fillColor"
            X.0Sm r0 = X.AnonymousClass0Yh.A03(r6, r13, r0, r8, r3)
            r11.A09 = r0
            float r14 = r11.A00
            java.lang.String r0 = "fillAlpha"
            r10 = 12
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x0155
            float r14 = r13.getFloat(r10, r14)
        L_0x0155:
            r11.A00 = r14
            java.lang.String r0 = "strokeLineCap"
            r10 = 8
            r14 = -1
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 != 0) goto L_0x023d
            r15 = -1
        L_0x0163:
            android.graphics.Paint$Cap r10 = r11.A07
            if (r15 == 0) goto L_0x0239
            if (r15 == r3) goto L_0x0235
            r0 = 2
            if (r15 != r0) goto L_0x016e
            android.graphics.Paint$Cap r10 = android.graphics.Paint.Cap.SQUARE
        L_0x016e:
            r11.A07 = r10
            java.lang.String r0 = "strokeLineJoin"
            r10 = 9
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x017e
            int r14 = r13.getInt(r10, r14)
        L_0x017e:
            android.graphics.Paint$Join r10 = r11.A08
            if (r14 == 0) goto L_0x0231
            if (r14 == r3) goto L_0x022d
            r0 = 2
            if (r14 != r0) goto L_0x0189
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.BEVEL
        L_0x0189:
            r11.A08 = r10
            float r14 = r11.A02
            java.lang.String r0 = "strokeMiterLimit"
            r10 = 10
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x019b
            float r14 = r13.getFloat(r10, r14)
        L_0x019b:
            r11.A02 = r14
            r10 = 3
            java.lang.String r0 = "strokeColor"
            X.0Sm r0 = X.AnonymousClass0Yh.A03(r6, r13, r0, r8, r10)
            r11.A0A = r0
            float r14 = r11.A01
            java.lang.String r0 = "strokeAlpha"
            r10 = 11
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x01b6
            float r14 = r13.getFloat(r10, r14)
        L_0x01b6:
            r11.A01 = r14
            float r14 = r11.A03
            java.lang.String r0 = "strokeWidth"
            r10 = 4
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x01c7
            float r14 = r13.getFloat(r10, r14)
        L_0x01c7:
            r11.A03 = r14
            float r14 = r11.A04
            java.lang.String r0 = "trimPathEnd"
            r10 = 6
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x01d8
            float r14 = r13.getFloat(r10, r14)
        L_0x01d8:
            r11.A04 = r14
            float r14 = r11.A05
            java.lang.String r0 = "trimPathOffset"
            r10 = 7
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x01e9
            float r14 = r13.getFloat(r10, r14)
        L_0x01e9:
            r11.A05 = r14
            float r14 = r11.A06
            java.lang.String r0 = "trimPathStart"
            r10 = 5
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x01fa
            float r14 = r13.getFloat(r10, r14)
        L_0x01fa:
            r11.A06 = r14
            int r14 = r11.A01
            java.lang.String r0 = "fillType"
            r10 = 13
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x020c
            int r14 = r13.getInt(r10, r14)
        L_0x020c:
            r11.A01 = r14
        L_0x020e:
            r13.recycle()
            java.util.ArrayList r0 = r12.A0C
            r0.add(r11)
            java.lang.String r10 = r11.A02
            if (r10 == 0) goto L_0x021f
            X.008 r0 = r1.A0E
            r0.put(r10, r11)
        L_0x021f:
            r15 = 0
        L_0x0220:
            int r10 = r2.A01
            int r0 = r11.A00
        L_0x0224:
            r0 = r0 | r10
            r2.A01 = r0
        L_0x0227:
            int r12 = r8.next()
            goto L_0x00ed
        L_0x022d:
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.ROUND
            goto L_0x0189
        L_0x0231:
            android.graphics.Paint$Join r10 = android.graphics.Paint.Join.MITER
            goto L_0x0189
        L_0x0235:
            android.graphics.Paint$Cap r10 = android.graphics.Paint.Cap.ROUND
            goto L_0x016e
        L_0x0239:
            android.graphics.Paint$Cap r10 = android.graphics.Paint.Cap.BUTT
            goto L_0x016e
        L_0x023d:
            int r15 = r13.getInt(r10, r14)
            goto L_0x0163
        L_0x0243:
            java.lang.String r0 = "clip-path"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0296
            X.0Ic r11 = new X.0Ic
            r11.<init>()
            java.lang.String r0 = "pathData"
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x0282
            int[] r0 = X.AnonymousClass0SA.A08
            android.content.res.TypedArray r13 = X.AnonymousClass0Yh.A02(r6, r9, r7, r0)
            r14 = 0
            java.lang.String r0 = r13.getString(r14)
            if (r0 == 0) goto L_0x0267
            r11.A02 = r0
        L_0x0267:
            java.lang.String r0 = r13.getString(r3)
            if (r0 == 0) goto L_0x0273
            X.0YU[] r0 = X.AnonymousClass0YJ.A02(r0)
            r11.A03 = r0
        L_0x0273:
            java.lang.String r0 = "fillType"
            r10 = 2
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 != 0) goto L_0x0291
            r0 = 0
        L_0x027d:
            r11.A01 = r0
            r13.recycle()
        L_0x0282:
            java.util.ArrayList r0 = r12.A0C
            r0.add(r11)
            java.lang.String r10 = r11.A02
            if (r10 == 0) goto L_0x0220
            X.008 r0 = r1.A0E
            r0.put(r10, r11)
            goto L_0x0220
        L_0x0291:
            int r0 = r13.getInt(r10, r14)
            goto L_0x027d
        L_0x0296:
            boolean r0 = r10.equals(r11)
            if (r0 == 0) goto L_0x0227
            X.0Ba r11 = new X.0Ba
            r11.<init>()
            int[] r0 = X.AnonymousClass0SA.A09
            android.content.res.TypedArray r13 = X.AnonymousClass0Yh.A02(r6, r9, r7, r0)
            r0 = 0
            r11.A09 = r0
            float r14 = r11.A02
            java.lang.String r0 = "rotation"
            r10 = 5
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x02b9
            float r14 = r13.getFloat(r10, r14)
        L_0x02b9:
            r11.A02 = r14
            float r0 = r11.A00
            float r0 = r13.getFloat(r3, r0)
            r11.A00 = r0
            float r10 = r11.A01
            r0 = 2
            float r0 = r13.getFloat(r0, r10)
            r11.A01 = r0
            float r14 = r11.A03
            java.lang.String r0 = "scaleX"
            r10 = 3
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x02db
            float r14 = r13.getFloat(r10, r14)
        L_0x02db:
            r11.A03 = r14
            float r14 = r11.A04
            java.lang.String r0 = "scaleY"
            r10 = 4
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x02ec
            float r14 = r13.getFloat(r10, r14)
        L_0x02ec:
            r11.A04 = r14
            float r14 = r11.A05
            java.lang.String r0 = "translateX"
            r10 = 6
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x02fd
            float r14 = r13.getFloat(r10, r14)
        L_0x02fd:
            r11.A05 = r14
            float r14 = r11.A06
            java.lang.String r0 = "translateY"
            r10 = 7
            boolean r0 = X.AnonymousClass0Yh.A04(r0, r8)
            if (r0 == 0) goto L_0x030e
            float r14 = r13.getFloat(r10, r14)
        L_0x030e:
            r11.A06 = r14
            r0 = 0
            java.lang.String r0 = r13.getString(r0)
            if (r0 == 0) goto L_0x0319
            r11.A08 = r0
        L_0x0319:
            X.C02580Ba.A00(r11)
            r13.recycle()
            java.util.ArrayList r0 = r12.A0C
            r0.add(r11)
            r0 = r17
            r0.push(r11)
            java.lang.String r10 = r11.A08
            if (r10 == 0) goto L_0x0332
            X.008 r0 = r1.A0E
            r0.put(r10, r11)
        L_0x0332:
            int r10 = r2.A01
            int r0 = r11.A07
            goto L_0x0224
        L_0x0338:
            if (r12 != r11) goto L_0x0227
            java.lang.String r0 = r8.getName()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0227
            r17.pop()
            goto L_0x0227
        L_0x0349:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x003f
        L_0x034d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x003f
        L_0x0351:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x003f
        L_0x0355:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x003f
        L_0x0359:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            goto L_0x003f
        L_0x035d:
            int r3 = r2.getInt(r3, r1)
            goto L_0x0030
        L_0x0363:
            if (r15 != 0) goto L_0x0370
            android.content.res.ColorStateList r1 = r4.A03
            android.graphics.PorterDuff$Mode r0 = r4.A07
            android.graphics.PorterDuffColorFilter r0 = r5.A01(r1, r0)
            r5.A03 = r0
            return
        L_0x0370:
            java.lang.String r1 = "no path defined"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0378:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r2.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<vector> tag requires height > 0"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0393:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r2.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<vector> tag requires width > 0"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03ae:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r2.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<vector> tag requires viewportHeight > 0"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r2.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<vector> tag requires viewportWidth > 0"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010804n.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public C010804n() {
        this.A01 = true;
        this.A08 = new float[9];
        this.A06 = new Matrix();
        this.A07 = new Rect();
        this.A00 = new AnonymousClass0BX();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }
}
