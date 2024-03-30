package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.0XF  reason: invalid class name */
public final class AnonymousClass0XF {
    public final PrecomputedText.Params A00;
    public final int A01;
    public final int A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    public boolean equals(Object obj) {
        Object textLocale;
        Object textLocale2;
        if (obj != this) {
            if (obj instanceof AnonymousClass0XF) {
                AnonymousClass0XF r7 = (AnonymousClass0XF) obj;
                if (Build.VERSION.SDK_INT < 23 || (this.A01 == r7.A01() && this.A02 == r7.A02())) {
                    TextPaint textPaint = this.A04;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = r7.A04;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            textLocale = textPaint.getTextLocales();
                            textLocale2 = textPaint2.getTextLocales();
                        } else {
                            textLocale = textPaint.getTextLocale();
                            textLocale2 = textPaint2.getTextLocale();
                        }
                        if (textLocale.equals(textLocale2)) {
                            if (textPaint.getTypeface() == null) {
                                if (textPaint2.getTypeface() != null) {
                                    return false;
                                }
                            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                                return false;
                            }
                            if (this.A03 != r7.A03) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object textLocale;
        int i = Build.VERSION.SDK_INT;
        Object[] objArr = new Object[11];
        TextPaint textPaint = this.A04;
        AnonymousClass000.A1I(objArr, textPaint.getTextSize(), 0);
        AnonymousClass000.A1I(objArr, textPaint.getTextScaleX(), 1);
        AnonymousClass000.A1I(objArr, textPaint.getTextSkewX(), 2);
        AnonymousClass000.A1I(objArr, textPaint.getLetterSpacing(), 3);
        int flags = textPaint.getFlags();
        if (i >= 24) {
            AnonymousClass000.A1L(objArr, flags, 4);
            textLocale = textPaint.getTextLocales();
        } else {
            AnonymousClass000.A1L(objArr, flags, 4);
            textLocale = textPaint.getTextLocale();
        }
        objArr[5] = textLocale;
        objArr[6] = textPaint.getTypeface();
        AnonymousClass000.A1N(objArr, 7, textPaint.isElegantTextHeight());
        objArr[8] = this.A03;
        AnonymousClass000.A1L(objArr, this.A01, 9);
        AnonymousClass000.A1L(objArr, this.A02, 10);
        return C014106d.A00(objArr);
    }

    public String toString() {
        Object textLocale;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("textSize=");
        TextPaint textPaint = this.A04;
        A0u.append(textPaint.getTextSize());
        StringBuilder A002 = A00(A0u, sb);
        A002.append(", textScaleX=");
        A002.append(textPaint.getTextScaleX());
        StringBuilder A003 = A00(A002, sb);
        A003.append(", textSkewX=");
        A003.append(textPaint.getTextSkewX());
        StringBuilder A004 = A00(A003, sb);
        A004.append(", letterSpacing=");
        A004.append(textPaint.getLetterSpacing());
        StringBuilder A005 = A00(A004, sb);
        A005.append(", elegantTextHeight=");
        A005.append(textPaint.isElegantTextHeight());
        sb.append(A005.toString());
        int i = Build.VERSION.SDK_INT;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (i >= 24) {
            A0u2.append(", textLocale=");
            textLocale = textPaint.getTextLocales();
        } else {
            A0u2.append(", textLocale=");
            textLocale = textPaint.getTextLocale();
        }
        A0u2.append(textLocale);
        StringBuilder A006 = A00(A0u2, sb);
        A006.append(", typeface=");
        sb.append(AnonymousClass000.A0o(textPaint.getTypeface(), A006));
        if (i >= 26) {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append(", variationSettings=");
            sb.append(AnonymousClass000.A0q(textPaint.getFontVariationSettings(), A0u3));
        }
        StringBuilder A0u4 = AnonymousClass000.A0u();
        A0u4.append(", textDir=");
        A0u4.append(this.A03);
        StringBuilder A007 = A00(A0u4, sb);
        A007.append(", breakStrategy=");
        A007.append(this.A01);
        StringBuilder A008 = A00(A007, sb);
        A008.append(", hyphenationFrequency=");
        A008.append(this.A02);
        sb.append(A008.toString());
        return AnonymousClass000.A0q("}", sb);
    }

    public AnonymousClass0XF(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, int i, int i2) {
        PrecomputedText.Params params;
        if (Build.VERSION.SDK_INT >= 29) {
            params = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            params = null;
        }
        this.A00 = params;
        this.A04 = textPaint;
        this.A03 = textDirectionHeuristic;
        this.A01 = i;
        this.A02 = i2;
    }

    public static StringBuilder A00(Object obj, StringBuilder sb) {
        sb.append(obj.toString());
        return new StringBuilder();
    }

    public int A01() {
        return this.A01;
    }

    public int A02() {
        return this.A02;
    }

    public AnonymousClass0XF(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A01 = params.getBreakStrategy();
        this.A02 = params.getHyphenationFrequency();
        this.A00 = Build.VERSION.SDK_INT < 29 ? null : params;
    }
}
