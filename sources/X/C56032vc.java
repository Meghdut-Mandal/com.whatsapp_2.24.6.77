package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;

/* renamed from: X.2vc  reason: invalid class name and case insensitive filesystem */
public abstract class C56032vc {
    public static final SpannableStringBuilder A00(Context context, int i, int i2, int i3) {
        Drawable A00 = AnonymousClass00E.A00(context, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (A00 != null) {
            spannableStringBuilder.append(' ').append(' ');
            A00.setBounds(0, 0, i, i);
            A00.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            spannableStringBuilder.setSpan(new C37351mE(A00), 1, 2, 33);
        }
        return spannableStringBuilder;
    }
}
