package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.3t9  reason: invalid class name and case insensitive filesystem */
public final class C79083t9 implements AnonymousClass4SA {
    public StaticLayout B4f(TextPaint textPaint, CharSequence charSequence, int i) {
        StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(1).build();
        AnonymousClass00C.A08(build);
        return build;
    }
}
