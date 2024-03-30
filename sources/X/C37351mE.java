package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

/* renamed from: X.1mE  reason: invalid class name and case insensitive filesystem */
public class C37351mE extends ImageSpan {
    public WeakReference A00;

    public static CharSequence A02(Paint paint, Drawable drawable, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        Drawable drawable2 = drawable;
        if (charSequence instanceof SpannableStringBuilder) {
            A03(paint2, drawable2, (SpannableStringBuilder) charSequence2, -1, 0, 1);
            return charSequence2;
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass000.A0l(charSequence, "  ", AnonymousClass000.A0u()));
        A03(paint2, drawable2, A0P, -1, 0, 1);
        return A0P;
    }

    public static SpannableStringBuilder A00(Paint paint, Drawable drawable, CharSequence charSequence, int i, int i2) {
        StringBuilder sb = new StringBuilder(" ".length() * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(" ");
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass000.A0l(charSequence, sb.toString(), AnonymousClass000.A0u()));
        A03(paint, drawable, A0P, i, 0, 1);
        return A0P;
    }

    public static void A03(Paint paint, Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i <= 0) {
            i = (int) paint.getTextSize();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight(), i);
        spannableStringBuilder.setSpan(new C37351mE(drawable), i2, i3, 33);
    }

    public Drawable A05() {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.A00 = AnonymousClass001.A0F(drawable2);
        return drawable2;
    }

    public static SpannableStringBuilder A01(Paint paint, Drawable drawable, CharSequence charSequence, String str) {
        int indexOf = TextUtils.indexOf(charSequence, str);
        int A09 = C36441kJ.A09(str, indexOf);
        SpannableStringBuilder A0P = C36441kJ.A0P(charSequence);
        A03(paint, drawable, A0P, -1, indexOf, A09);
        return A0P;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C36411kG.A18(canvas, paint, A05(), f, i4);
    }

    public C37351mE(Drawable drawable) {
        super(drawable);
    }
}
