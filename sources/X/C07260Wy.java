package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.Objects;

/* renamed from: X.0Wy  reason: invalid class name and case insensitive filesystem */
public final class C07260Wy {
    public static Object A0C;
    public static Constructor A0D;
    public static boolean A0E;
    public static final int A0F;
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public int A02 = A0F;
    public int A03 = Integer.MAX_VALUE;
    public Layout.Alignment A04 = Layout.Alignment.ALIGN_NORMAL;
    public TextUtils.TruncateAt A05 = null;
    public boolean A06 = true;
    public boolean A07;
    public int A08;
    public CharSequence A09;
    public final int A0A;
    public final TextPaint A0B;

    static {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        }
        A0F = i;
    }

    public StaticLayout A00() {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence charSequence = this.A09;
        if (charSequence == null) {
            charSequence = "";
            this.A09 = charSequence;
        }
        int max = Math.max(0, this.A0A);
        if (this.A03 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.A0B, (float) max, this.A05);
        }
        int min = Math.min(charSequence.length(), this.A08);
        this.A08 = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.A07 && this.A03 == 1) {
                this.A04 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.A0B, max);
            obtain.setAlignment(this.A04);
            obtain.setIncludePad(this.A06);
            if (this.A07) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.A05;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.A03);
            float f = this.A00;
            if (!(f == 0.0f && this.A01 == 1.0f)) {
                obtain.setLineSpacing(f, this.A01);
            }
            if (this.A03 > 1) {
                obtain.setHyphenationFrequency(this.A02);
            }
            return obtain.build();
        }
        if (!A0E) {
            Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
            try {
                A0C = TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                A0D = declaredConstructor;
                declaredConstructor.setAccessible(true);
                A0E = true;
            } catch (Exception e) {
                throw new AnonymousClass0O7(e);
            }
        }
        try {
            Constructor constructor = A0D;
            Objects.requireNonNull(constructor);
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            AnonymousClass000.A1L(objArr, 0, 1);
            AnonymousClass000.A1L(objArr, this.A08, 2);
            objArr[3] = this.A0B;
            Integer valueOf = Integer.valueOf(max);
            objArr[4] = valueOf;
            objArr[5] = this.A04;
            Object obj = A0C;
            Objects.requireNonNull(obj);
            objArr[6] = obj;
            AnonymousClass000.A1I(objArr, 1.0f, 7);
            AnonymousClass000.A1I(objArr, 0.0f, 8);
            AnonymousClass000.A1N(objArr, 9, this.A06);
            objArr[10] = null;
            objArr[11] = valueOf;
            AnonymousClass000.A1L(objArr, this.A03, 12);
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new AnonymousClass0O7(e2);
        }
    }

    public C07260Wy(TextPaint textPaint, CharSequence charSequence, int i) {
        this.A09 = charSequence;
        this.A0B = textPaint;
        this.A0A = i;
        this.A08 = charSequence.length();
    }
}
