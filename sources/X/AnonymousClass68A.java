package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.68A  reason: invalid class name */
public class AnonymousClass68A {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public float A04 = Float.MAX_VALUE;
    public float A05;
    public float A06;
    public float A07;
    public float A08 = 0.0f;
    public float A09 = 1.0f;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public ColorStateList A0F;
    public Layout.Alignment A0G;
    public TextPaint A0H = new TextPaint(1);
    public TextUtils.TruncateAt A0I;
    public AnonymousClass048 A0J;
    public CharSequence A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public void A00() {
        if (this.A02) {
            TextPaint textPaint = new TextPaint(this.A0H);
            textPaint.set(this.A0H);
            this.A0H = textPaint;
            this.A02 = false;
        }
    }

    public int hashCode() {
        int i;
        int A022 = C90474aD.A02((this.A0H.getColor() + 31) * 31, this.A0H.getTextSize());
        int i2 = 0;
        if (this.A0H.getTypeface() != null) {
            i = this.A0H.getTypeface().hashCode();
        } else {
            i = 0;
        }
        TextPaint textPaint = this.A0H;
        int A052 = (((((((C36351kA.A05(this.A0J, C36351kA.A05(this.A0G, (((((((((C90474aD.A02(C90474aD.A02(C90474aD.A02((((((C90474aD.A02((((C90474aD.A02(C90474aD.A02(C90474aD.A02((A022 + i) * 31, this.A05), this.A06), this.A07) + this.A0B) * 31) + textPaint.linkColor) * 31, textPaint.density) + Arrays.hashCode(textPaint.drawableState)) * 31) + this.A0E) * 31) + this.A0D) * 31, this.A09), this.A08), this.A04) + (this.A0L ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A0I)) * 31) + (this.A0N ? 1 : 0)) * 31) + this.A0C) * 31)) + this.A0A) * 31) + this.A00) * 31) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
        CharSequence charSequence = this.A0K;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return A052 + i2;
    }

    public AnonymousClass68A() {
        boolean z = true;
        this.A03 = Build.VERSION.SDK_INT < 28 ? false : z;
        this.A0M = false;
        this.A0I = null;
        this.A0N = false;
        this.A0C = Integer.MAX_VALUE;
        this.A0G = Layout.Alignment.ALIGN_NORMAL;
        this.A0J = AnonymousClass047.A01;
        this.A0A = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = false;
    }
}
