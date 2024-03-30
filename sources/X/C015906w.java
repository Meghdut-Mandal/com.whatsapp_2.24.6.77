package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.06w  reason: invalid class name and case insensitive filesystem */
public class C015906w {
    public int A00 = 0;
    public Typeface A01;
    public C015806v A02;
    public C015806v A03;
    public C015806v A04;
    public C015806v A05;
    public C015806v A06;
    public C015806v A07;
    public C015806v A08;
    public boolean A09;
    public int A0A = -1;
    public final TextView A0B;
    public final C016006x A0C;

    public static C015806v A00(Context context, AnonymousClass02W r3, int i) {
        ColorStateList A072;
        synchronized (r3) {
            A072 = r3.A00.A07(context, i);
        }
        if (A072 == null) {
            return null;
        }
        C015806v r1 = new C015806v();
        r1.A02 = true;
        r1.A00 = A072;
        return r1;
    }

    private void A01(Context context, C010404j r15) {
        String string;
        Typeface create;
        Typeface A042;
        int i = this.A00;
        TypedArray typedArray = r15.A02;
        this.A00 = typedArray.getInt(2, i);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = typedArray.getInt(11, -1);
            this.A0A = i2;
            if (i2 != -1) {
                this.A00 &= 2;
            }
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A01 = null;
            int i3 = 10;
            if (typedArray.hasValue(12)) {
                i3 = 12;
            }
            int i4 = this.A0A;
            int i5 = this.A00;
            if (!context.isRestricted()) {
                AnonymousClass072 r8 = new AnonymousClass072(this, new WeakReference(this.A0B), i4, i5);
                try {
                    int i6 = this.A00;
                    int resourceId = typedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        TypedValue typedValue = r15.A00;
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            r15.A00 = typedValue;
                        }
                        Context context2 = r15.A01;
                        if (!context2.isRestricted() && (A042 = C015006m.A04(context2, typedValue, r8, resourceId, i6, true, false)) != null) {
                            if (Build.VERSION.SDK_INT >= 28 && this.A0A != -1) {
                                Typeface create2 = Typeface.create(A042, 0);
                                int i7 = this.A0A;
                                boolean z2 = false;
                                if ((this.A00 & 2) != 0) {
                                    z2 = true;
                                }
                                A042 = Typeface.create(create2, i7, z2);
                            }
                            this.A01 = A042;
                        }
                    }
                    boolean z3 = false;
                    if (this.A01 == null) {
                        z3 = true;
                    }
                    this.A09 = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A01 == null && (string = typedArray.getString(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.A0A == -1) {
                    create = Typeface.create(string, this.A00);
                } else {
                    Typeface create3 = Typeface.create(string, 0);
                    int i8 = this.A0A;
                    if ((this.A00 & 2) != 0) {
                        z = true;
                    }
                    create = Typeface.create(create3, i8, z);
                }
            } else {
                return;
            }
        } else if (typedArray.hasValue(1)) {
            this.A09 = false;
            int i9 = typedArray.getInt(1, 1);
            if (i9 == 1) {
                create = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                create = Typeface.SERIF;
            } else if (i9 == 3) {
                create = Typeface.MONOSPACE;
            } else {
                return;
            }
        } else {
            return;
        }
        this.A01 = create;
    }

    private void A02(Drawable drawable, C015806v r3) {
        if (drawable != null && r3 != null) {
            AnonymousClass02X.A05(drawable, r3, this.A0B.getDrawableState());
        }
    }

    public static void A03(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    public void A04() {
        if (!(this.A04 == null && this.A08 == null && this.A05 == null && this.A02 == null)) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A02(compoundDrawables[0], this.A04);
            A02(compoundDrawables[1], this.A08);
            A02(compoundDrawables[2], this.A05);
            A02(compoundDrawables[3], this.A02);
        }
        if (this.A06 != null || this.A03 != null) {
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A02(compoundDrawablesRelative[0], this.A06);
            A02(compoundDrawablesRelative[2], this.A03);
        }
    }

    public void A05(int i) {
        C016006x r4 = this.A0C;
        if (!(!(r4.A09 instanceof AnonymousClass074))) {
            return;
        }
        if (i == 0) {
            r4.A03 = 0;
            r4.A01 = -1.0f;
            r4.A00 = -1.0f;
            r4.A02 = -1.0f;
            r4.A07 = new int[0];
            r4.A06 = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
            C016006x.A03(r4, TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (C016006x.A04(r4)) {
                r4.A07();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A06(int i, int i2, int i3, int i4) {
        C016006x r4 = this.A0C;
        if (!(r4.A09 instanceof AnonymousClass074)) {
            DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
            C016006x.A03(r4, TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (C016006x.A04(r4)) {
                r4.A07();
            }
        }
    }

    public void A07(Context context, int i) {
        String string;
        ColorStateList A012;
        ColorStateList A013;
        ColorStateList A014;
        C010404j r4 = new C010404j(context, context.obtainStyledAttributes(i, AnonymousClass1MJ.A0M));
        TypedArray typedArray = r4.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (typedArray.hasValue(3) && (A014 = r4.A01(3)) != null) {
                this.A0B.setTextColor(A014);
            }
            if (typedArray.hasValue(5) && (A013 = r4.A01(5)) != null) {
                this.A0B.setLinkTextColor(A013);
            }
            if (typedArray.hasValue(4) && (A012 = r4.A01(4)) != null) {
                this.A0B.setHintTextColor(A012);
            }
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A01(context, r4);
        if (Build.VERSION.SDK_INT >= 26 && typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        typedArray.recycle();
        Typeface typeface = this.A01;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A00);
        }
    }

    public void A08(ColorStateList colorStateList) {
        C015806v r1 = this.A07;
        if (r1 == null) {
            r1 = new C015806v();
            this.A07 = r1;
        }
        r1.A00 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        r1.A02 = z;
        this.A04 = r1;
        this.A08 = r1;
        this.A05 = r1;
        this.A02 = r1;
        this.A06 = r1;
        this.A03 = r1;
    }

    public void A09(PorterDuff.Mode mode) {
        C015806v r1 = this.A07;
        if (r1 == null) {
            r1 = new C015806v();
            this.A07 = r1;
        }
        r1.A01 = mode;
        boolean z = false;
        if (mode != null) {
            z = true;
        }
        r1.A03 = z;
        this.A04 = r1;
        this.A08 = r1;
        this.A05 = r1;
        this.A02 = r1;
        this.A06 = r1;
        this.A03 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:185:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.util.AttributeSet r27, int r28) {
        /*
            r26 = this;
            r12 = r26
            android.widget.TextView r9 = r12.A0B
            android.content.Context r8 = r9.getContext()
            X.02W r7 = X.AnonymousClass02W.A01()
            int[] r2 = X.AnonymousClass1MJ.A07
            r10 = 0
            r19 = 0
            r22 = r27
            r25 = r28
            r1 = r22
            r0 = r25
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r1, r2, r0, r10)
            X.04j r0 = new X.04j
            r0.<init>(r8, r1)
            android.content.Context r20 = r9.getContext()
            android.content.res.TypedArray r3 = r0.A02
            r18 = 0
            r21 = r3
            r23 = r9
            r24 = r2
            X.C012005e.A0E(r20, r21, r22, r23, r24, r25)
            r2 = -1
            int r1 = r3.getResourceId(r10, r2)
            r14 = 3
            boolean r0 = r3.hasValue(r14)
            if (r0 == 0) goto L_0x0049
            int r0 = r3.getResourceId(r14, r10)
            X.06v r0 = A00(r8, r7, r0)
            r12.A04 = r0
        L_0x0049:
            r0 = 1
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 1
            int r0 = r3.getResourceId(r0, r10)
            X.06v r0 = A00(r8, r7, r0)
            r12.A08 = r0
        L_0x005b:
            r13 = 4
            boolean r0 = r3.hasValue(r13)
            if (r0 == 0) goto L_0x006c
            int r0 = r3.getResourceId(r13, r10)
            X.06v r0 = A00(r8, r7, r0)
            r12.A05 = r0
        L_0x006c:
            r0 = 2
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 2
            int r0 = r3.getResourceId(r0, r10)
            X.06v r0 = A00(r8, r7, r0)
            r12.A02 = r0
        L_0x007e:
            r11 = 5
            boolean r0 = r3.hasValue(r11)
            if (r0 == 0) goto L_0x008f
            int r0 = r3.getResourceId(r11, r10)
            X.06v r0 = A00(r8, r7, r0)
            r12.A06 = r0
        L_0x008f:
            r0 = 6
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x00a1
            r0 = 6
            int r0 = r3.getResourceId(r0, r10)
            X.06v r0 = A00(r8, r7, r0)
            r12.A03 = r0
        L_0x00a1:
            r3.recycle()
            android.text.method.TransformationMethod r0 = r9.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            r17 = r0
            r3 = 23
            if (r1 == r2) goto L_0x036b
            int[] r0 = X.AnonymousClass1MJ.A0M
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r1, r0)
            X.04j r1 = new X.04j
            r1.<init>(r8, r0)
            if (r17 != 0) goto L_0x0367
            r0 = 14
            android.content.res.TypedArray r2 = r1.A02
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0367
            r0 = 14
            boolean r16 = r2.getBoolean(r0, r10)
            r18 = 1
        L_0x00cf:
            r12.A01(r8, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x0362
            android.content.res.TypedArray r2 = r1.A02
            boolean r0 = r2.hasValue(r14)
            if (r0 == 0) goto L_0x035f
            android.content.res.ColorStateList r6 = r1.A01(r14)
        L_0x00e2:
            boolean r0 = r2.hasValue(r13)
            if (r0 == 0) goto L_0x035c
            android.content.res.ColorStateList r5 = r1.A01(r13)
        L_0x00ec:
            boolean r0 = r2.hasValue(r11)
            if (r0 == 0) goto L_0x0359
            android.content.res.ColorStateList r4 = r1.A01(r11)
        L_0x00f6:
            r0 = 15
            android.content.res.TypedArray r1 = r1.A02
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x0356
            r0 = 15
            java.lang.String r3 = r1.getString(r0)
        L_0x0106:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x0353
            r0 = 13
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x0353
            r0 = 13
            java.lang.String r2 = r1.getString(r0)
        L_0x011a:
            r1.recycle()
        L_0x011d:
            int[] r15 = X.AnonymousClass1MJ.A0M
            r1 = r22
            r0 = r25
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r1, r15, r0, r10)
            X.04j r1 = new X.04j
            r1.<init>(r8, r0)
            if (r17 != 0) goto L_0x0145
            android.content.res.TypedArray r0 = r1.A02
            r20 = r0
            r0 = 14
            r15 = r0
            r0 = r20
            boolean r0 = r0.hasValue(r15)
            if (r0 == 0) goto L_0x0145
            r0 = r20
            boolean r16 = r0.getBoolean(r15, r10)
            r18 = 1
        L_0x0145:
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r15 >= r0) goto L_0x016b
            android.content.res.TypedArray r15 = r1.A02
            boolean r0 = r15.hasValue(r14)
            if (r0 == 0) goto L_0x0157
            android.content.res.ColorStateList r6 = r1.A01(r14)
        L_0x0157:
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x0161
            android.content.res.ColorStateList r5 = r1.A01(r13)
        L_0x0161:
            boolean r0 = r15.hasValue(r11)
            if (r0 == 0) goto L_0x016b
            android.content.res.ColorStateList r4 = r1.A01(r11)
        L_0x016b:
            r0 = 15
            android.content.res.TypedArray r13 = r1.A02
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x017b
            r0 = 15
            java.lang.String r3 = r13.getString(r0)
        L_0x017b:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r11 < r0) goto L_0x01a4
            r0 = 13
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x018f
            r0 = 13
            java.lang.String r2 = r13.getString(r0)
        L_0x018f:
            r0 = 28
            if (r11 < r0) goto L_0x01a4
            boolean r0 = r13.hasValue(r10)
            if (r0 == 0) goto L_0x01a4
            r0 = -1
            int r0 = r13.getDimensionPixelSize(r10, r0)
            if (r0 != 0) goto L_0x01a4
            r0 = 0
            r9.setTextSize(r10, r0)
        L_0x01a4:
            r12.A01(r8, r1)
            r13.recycle()
            if (r6 == 0) goto L_0x01af
            r9.setTextColor(r6)
        L_0x01af:
            if (r5 == 0) goto L_0x01b4
            r9.setHintTextColor(r5)
        L_0x01b4:
            if (r4 == 0) goto L_0x01b9
            r9.setLinkTextColor(r4)
        L_0x01b9:
            if (r17 != 0) goto L_0x01c2
            if (r18 == 0) goto L_0x01c2
            r0 = r16
            r9.setAllCaps(r0)
        L_0x01c2:
            android.graphics.Typeface r4 = r12.A01
            if (r4 == 0) goto L_0x01d0
            int r1 = r12.A0A
            r0 = -1
            if (r1 != r0) goto L_0x034e
            int r0 = r12.A00
            r9.setTypeface(r4, r0)
        L_0x01d0:
            if (r2 == 0) goto L_0x01d5
            r9.setFontVariationSettings(r2)
        L_0x01d5:
            if (r3 == 0) goto L_0x01e2
            r0 = 24
            if (r11 < r0) goto L_0x033b
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r3)
            r9.setTextLocales(r0)
        L_0x01e2:
            X.06x r3 = r12.A0C
            r1 = r22
            r0 = r25
            r3.A09(r1, r0)
            boolean r0 = X.C015306p.A00
            if (r0 == 0) goto L_0x0218
            int r0 = r3.A03
            if (r0 == 0) goto L_0x0218
            int[] r2 = r3.A07
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0218
            int r0 = r9.getAutoSizeStepGranularity()
            float r1 = (float) r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0336
            float r0 = r3.A01
            int r2 = java.lang.Math.round(r0)
            float r0 = r3.A00
            int r1 = java.lang.Math.round(r0)
            float r0 = r3.A02
            int r0 = java.lang.Math.round(r0)
            r9.setAutoSizeTextTypeUniformWithConfiguration(r2, r1, r0, r10)
        L_0x0218:
            int[] r1 = X.AnonymousClass1MJ.A08
            r0 = r22
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r0, r1)
            X.04j r10 = new X.04j
            r10.<init>(r8, r0)
            r1 = -1
            r0 = 8
            r5 = -1
            android.content.res.TypedArray r4 = r10.A02
            int r0 = r4.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0333
            android.graphics.drawable.Drawable r14 = r7.A03(r8, r0)
        L_0x0235:
            r0 = 13
            int r0 = r4.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0330
            android.graphics.drawable.Drawable r12 = r7.A03(r8, r0)
        L_0x0241:
            r0 = 9
            int r0 = r4.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x032d
            android.graphics.drawable.Drawable r13 = r7.A03(r8, r0)
        L_0x024d:
            r0 = 6
            int r0 = r4.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x032a
            android.graphics.drawable.Drawable r11 = r7.A03(r8, r0)
        L_0x0258:
            r0 = 10
            int r0 = r4.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0327
            android.graphics.drawable.Drawable r2 = r7.A03(r8, r0)
        L_0x0264:
            r0 = 7
            int r0 = r4.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0324
            android.graphics.drawable.Drawable r1 = r7.A03(r8, r0)
        L_0x026f:
            r7 = 3
            r6 = 1
            r3 = 2
            if (r2 != 0) goto L_0x030b
            if (r1 != 0) goto L_0x030b
            if (r14 != 0) goto L_0x027e
            if (r12 != 0) goto L_0x027e
            if (r13 != 0) goto L_0x027e
            if (r11 == 0) goto L_0x02a1
        L_0x027e:
            android.graphics.drawable.Drawable[] r2 = r9.getCompoundDrawablesRelative()
            r1 = r2[r19]
            if (r1 != 0) goto L_0x02fd
            r0 = r2[r3]
            if (r0 != 0) goto L_0x02fd
            android.graphics.drawable.Drawable[] r0 = r9.getCompoundDrawables()
            if (r14 != 0) goto L_0x0292
            r14 = r0[r19]
        L_0x0292:
            if (r12 != 0) goto L_0x0296
            r12 = r0[r6]
        L_0x0296:
            if (r13 != 0) goto L_0x029a
            r13 = r0[r3]
        L_0x029a:
            if (r11 != 0) goto L_0x029e
            r11 = r0[r7]
        L_0x029e:
            r9.setCompoundDrawablesWithIntrinsicBounds(r14, r12, r13, r11)
        L_0x02a1:
            r1 = 11
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x02b0
            android.content.res.ColorStateList r0 = r10.A01(r1)
            X.AnonymousClass088.A01(r0, r9)
        L_0x02b0:
            r0 = 12
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x02c6
            r0 = 12
            int r1 = r4.getInt(r0, r5)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C010504k.A00(r0, r1)
            X.AnonymousClass088.A02(r0, r9)
        L_0x02c6:
            r0 = 14
            int r3 = r4.getDimensionPixelSize(r0, r5)
            r0 = 17
            int r1 = r4.getDimensionPixelSize(r0, r5)
            r0 = 18
            int r2 = r4.getDimensionPixelSize(r0, r5)
            r4.recycle()
            if (r3 == r5) goto L_0x02e0
            X.AnonymousClass088.A04(r9, r3)
        L_0x02e0:
            if (r1 == r5) goto L_0x02e5
            X.AnonymousClass088.A05(r9, r1)
        L_0x02e5:
            if (r2 == r5) goto L_0x02fc
            X.AnonymousClass0YM.A00(r2)
            android.text.TextPaint r1 = r9.getPaint()
            r0 = 0
            int r0 = r1.getFontMetricsInt(r0)
            if (r2 == r0) goto L_0x02fc
            int r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.setLineSpacing(r1, r0)
        L_0x02fc:
            return
        L_0x02fd:
            if (r12 != 0) goto L_0x0301
            r12 = r2[r6]
        L_0x0301:
            r0 = r2[r3]
            if (r11 != 0) goto L_0x0307
            r11 = r2[r7]
        L_0x0307:
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r12, r0, r11)
            goto L_0x02a1
        L_0x030b:
            android.graphics.drawable.Drawable[] r0 = r9.getCompoundDrawablesRelative()
            if (r2 != 0) goto L_0x0313
            r2 = r0[r19]
        L_0x0313:
            if (r12 != 0) goto L_0x0317
            r12 = r0[r6]
        L_0x0317:
            if (r1 != 0) goto L_0x031b
            r1 = r0[r3]
        L_0x031b:
            if (r11 != 0) goto L_0x031f
            r11 = r0[r7]
        L_0x031f:
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r12, r1, r11)
            goto L_0x02a1
        L_0x0324:
            r1 = 0
            goto L_0x026f
        L_0x0327:
            r2 = 0
            goto L_0x0264
        L_0x032a:
            r11 = 0
            goto L_0x0258
        L_0x032d:
            r13 = 0
            goto L_0x024d
        L_0x0330:
            r12 = 0
            goto L_0x0241
        L_0x0333:
            r14 = 0
            goto L_0x0235
        L_0x0336:
            r9.setAutoSizeTextTypeUniformWithPresetSizes(r2, r10)
            goto L_0x0218
        L_0x033b:
            r0 = 44
            int r0 = r3.indexOf(r0)
            java.lang.String r0 = r3.substring(r10, r0)
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r9.setTextLocale(r0)
            goto L_0x01e2
        L_0x034e:
            r9.setTypeface(r4)
            goto L_0x01d0
        L_0x0353:
            r2 = 0
            goto L_0x011a
        L_0x0356:
            r3 = 0
            goto L_0x0106
        L_0x0359:
            r4 = 0
            goto L_0x00f6
        L_0x035c:
            r5 = 0
            goto L_0x00ec
        L_0x035f:
            r6 = 0
            goto L_0x00e2
        L_0x0362:
            r5 = 0
            r4 = 0
            r6 = 0
            goto L_0x00f6
        L_0x0367:
            r16 = 0
            goto L_0x00cf
        L_0x036b:
            r5 = 0
            r2 = 0
            r16 = 0
            r4 = 0
            r3 = 0
            r6 = 0
            goto L_0x011d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015906w.A0A(android.util.AttributeSet, int):void");
    }

    public void A0B(int[] iArr, int i) {
        C016006x r4 = this.A0C;
        if (!(r4.A09 instanceof AnonymousClass074)) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                r4.A07 = C016006x.A06(iArr2);
                if (!C016006x.A05(r4)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                r4.A05 = false;
            }
            if (C016006x.A04(r4)) {
                r4.A07();
            }
        }
    }

    public C015906w(TextView textView) {
        this.A0B = textView;
        this.A0C = new C016006x(textView);
    }
}
