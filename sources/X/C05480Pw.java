package X;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: X.0Pw  reason: invalid class name and case insensitive filesystem */
public abstract class C05480Pw {
    public static Spanned A00(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C05470Pv.A00(str);
        }
        return Html.fromHtml(str);
    }
}
