package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.07P  reason: invalid class name */
public class AnonymousClass07P extends TextView implements C015306p, C015406q {
    public Future A00;
    public boolean A01;
    public final C015706u A02;
    public final AnonymousClass07Q A03;
    public final C015906w A04;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r1 != 2) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r3 != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0XF A02(android.widget.TextView r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0010
            android.text.PrecomputedText$Params r0 = X.C07310Xd.A00(r5)
            X.0XF r4 = new X.0XF
            r4.<init>(r0)
            return r4
        L_0x0010:
            android.text.TextPaint r1 = r5.getPaint()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            X.0UR r4 = new X.0UR
            r4.<init>(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0032
            int r0 = X.C07640Yr.A00(r5)
            r4.A00(r0)
            int r0 = X.C07640Yr.A01(r5)
            r4.A01(r0)
        L_0x0032:
            android.text.method.TransformationMethod r0 = r5.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 != 0) goto L_0x0090
            r0 = 28
            r3 = 0
            r2 = 1
            if (r1 < r0) goto L_0x0074
            int r0 = r5.getInputType()
            r1 = r0 & 15
            r0 = 3
            if (r1 != r0) goto L_0x0074
            java.util.Locale r0 = A03(r5)
            android.icu.text.DecimalFormatSymbols r0 = X.AnonymousClass0QA.A00(r0)
            java.lang.String[] r0 = X.C07310Xd.A02(r0)
            r0 = r0[r3]
            int r0 = r0.codePointAt(r3)
            byte r1 = java.lang.Character.getDirectionality(r0)
            if (r1 == r2) goto L_0x0064
            r0 = 2
            if (r1 != r0) goto L_0x0090
        L_0x0064:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
        L_0x0066:
            r4.A02 = r3
            android.text.TextPaint r2 = r4.A03
            int r1 = r4.A00
            int r0 = r4.A01
            X.0XF r4 = new X.0XF
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x0074:
            int r0 = A00(r5)
            if (r0 != r2) goto L_0x007b
            r3 = 1
        L_0x007b:
            int r0 = A01(r5)
            switch(r0) {
                case 2: goto L_0x008d;
                case 3: goto L_0x0090;
                case 4: goto L_0x0064;
                case 5: goto L_0x008a;
                case 6: goto L_0x0087;
                case 7: goto L_0x0084;
                default: goto L_0x0082;
            }
        L_0x0082:
            if (r3 == 0) goto L_0x0087
        L_0x0084:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0066
        L_0x0087:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x0066
        L_0x008a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0066
        L_0x008d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0066
        L_0x0090:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07P.A02(android.widget.TextView):X.0XF");
    }

    public static void A05(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new NullPointerException("getPrecomputedText");
        }
        A02(textView);
        throw new NullPointerException("getParams");
    }

    public int getAutoSizeMaxTextSize() {
        if (C015306p.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C015306p.A00) {
            return super.getAutoSizeMinTextSize();
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C015306p.A00) {
            return super.getAutoSizeStepGranularity();
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C015306p.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            return r0.A0C.A07;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C015306p.A00) {
            C015906w r0 = this.A04;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C015806v r0;
        C015706u r02 = this.A02;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C015806v r0;
        C015706u r02 = this.A02;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C015806v r0 = this.A04.A07;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C015806v r0 = this.A04.A07;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A05(this);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        AnonymousClass07Q r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            return super.getTextClassifier();
        }
        return r0.A00();
    }

    public void onMeasure(int i, int i2) {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A05(this);
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C015306p.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A06(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C015306p.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A0B(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C015306p.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A05(i);
        }
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            AnonymousClass088.A04(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            AnonymousClass088.A05(this, i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C015706u r0 = this.A02;
        if (r0 != null) {
            r0.A03(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C015706u r0 = this.A02;
        if (r0 != null) {
            r0.A04(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C015906w r0 = this.A04;
        r0.A08(colorStateList);
        r0.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C015906w r0 = this.A04;
        r0.A09(mode);
        r0.A04();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass07Q r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r3 != r2) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMetricsParamsCompat(X.AnonymousClass0XF r5) {
        /*
            r4 = this;
            android.text.TextDirectionHeuristic r3 = r5.A03
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r3 == r2) goto L_0x0054
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r3 == r1) goto L_0x0054
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r3 != r0) goto L_0x003b
            r0 = 2
        L_0x000f:
            A04(r4, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0056
            android.text.TextPaint r1 = r5.A04
            float r2 = r1.getTextScaleX()
            android.text.TextPaint r0 = r4.getPaint()
            r0.set(r1)
            float r0 = r4.getTextScaleX()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r4.setTextScaleX(r1)
        L_0x0037:
            r4.setTextScaleX(r2)
            return
        L_0x003b:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r3 != r0) goto L_0x0041
            r0 = 3
            goto L_0x000f
        L_0x0041:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r3 != r0) goto L_0x0047
            r0 = 4
            goto L_0x000f
        L_0x0047:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r3 != r0) goto L_0x004d
            r0 = 5
            goto L_0x000f
        L_0x004d:
            if (r3 != r1) goto L_0x0051
            r0 = 6
            goto L_0x000f
        L_0x0051:
            r0 = 7
            if (r3 == r2) goto L_0x000f
        L_0x0054:
            r0 = 1
            goto L_0x000f
        L_0x0056:
            android.text.TextPaint r1 = r4.getPaint()
            android.text.TextPaint r0 = r5.A04
            r1.set(r0)
            int r0 = r5.A01()
            X.C07640Yr.A04(r4, r0)
            int r0 = r5.A02()
            X.C07640Yr.A05(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07P.setTextMetricsParamsCompat(X.0XF):void");
    }

    public void setTextSize(int i, float f) {
        if (C015306p.A00) {
            super.setTextSize(i, f);
            return;
        }
        C015906w r0 = this.A04;
        if (r0 != null) {
            C016006x r1 = r0.A0C;
            if (!(!(r1.A09 instanceof AnonymousClass074)) || r1.A03 == 0) {
                r1.A08(i, f);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.A01) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                C002000v r0 = AnonymousClass089.A00;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.A01 = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.A01 = false;
            }
        }
    }

    public AnonymousClass07P(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public static int A00(View view) {
        return view.getLayoutDirection();
    }

    public static int A01(View view) {
        return view.getTextDirection();
    }

    public static Locale A03(TextView textView) {
        return textView.getTextLocale();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C015706u r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
        C015906w r02 = this.A04;
        if (r02 != null) {
            r02.A04();
        }
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public AnonymousClass0XF getTextMetricsParamsCompat() {
        return A02(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C015906w.A03(editorInfo, onCreateInputConnection, this);
        AnonymousClass0PC.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C015906w r1 = this.A04;
        if (r1 != null && !C015306p.A00) {
            r1.A0C.A07();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C015906w r1 = this.A04;
        if (r1 != null && !C015306p.A00) {
            C016006x r12 = r1.A0C;
            if ((!(r12.A09 instanceof AnonymousClass074)) && r12.A03 != 0) {
                r12.A07();
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C015706u r0 = this.A02;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C015706u r0 = this.A02;
        if (r0 != null) {
            r0.A02(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass02X.A03().A08(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass02X.A03().A08(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass02X.A03().A08(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass02X.A03().A08(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass02X.A03().A08(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass02X.A03().A08(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass02X.A03().A08(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass02X.A03().A08(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass088.A00(callback, this));
    }

    public void setLineHeight(int i) {
        AnonymousClass0YM.A00(i);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(C08890bU r3) {
        A05(this);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A07(context, i);
        }
    }

    public static void A04(View view, int i) {
        view.setTextDirection(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass07P(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A01 = false;
        C015606t.A03(getContext(), this);
        C015706u r0 = new C015706u(this);
        this.A02 = r0;
        r0.A05(attributeSet, i);
        C015906w r02 = new C015906w(this);
        this.A04 = r02;
        r02.A0A(attributeSet, i);
        r02.A04();
        this.A03 = new AnonymousClass07Q(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C015906w r0 = this.A04;
        if (r0 != null) {
            r0.A04();
        }
    }
}
