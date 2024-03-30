package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import com.whatsapp.R;

/* renamed from: X.1e4  reason: invalid class name and case insensitive filesystem */
public final class C32711e4 {
    public final C24791Du A00;
    public final AnonymousClass17Y A01;
    public final C21060yb A02;

    public C32711e4(C24791Du r2, AnonymousClass17Y r3, C21060yb r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final SpannableString A00(Context context, String str) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(str, 1);
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                int spanFlags = spannableString.getSpanFlags(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new C37421mL(context, uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
            }
        }
        return spannableString;
    }

    public static final SpannableStringBuilder A01(Context context, Runnable runnable, String str) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(str, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AnonymousClass21o(context, runnable, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved)), 0, str.length(), 33);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder A02(Context context, Runnable runnable, String str, String str2, int i) {
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(runnable, 5);
        Spanned fromHtml = Html.fromHtml(str);
        AnonymousClass00C.A08(fromHtml);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (str2.equals(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new C34001gI(context, runnable, i), spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    public final SpannableString A03(Context context, String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        Context context2 = context;
        AnonymousClass00C.A0D(context2, 0);
        String str2 = str;
        AnonymousClass00C.A0D(str2, 1);
        SpannableString spannableString = new SpannableString(Html.fromHtml(str2));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            for (int i = 0; i < length; i++) {
                URLSpan uRLSpan = uRLSpanArr[i];
                if (AnonymousClass00C.A0J(strArr[i], uRLSpan.getURL())) {
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    int spanFlags = spannableString.getSpanFlags(uRLSpan);
                    Runnable runnable = runnableArr[i];
                    spannableString.removeSpan(uRLSpan);
                    C429721s r9 = new C429721s(context2, this.A00, this.A01, this.A02, strArr2[i]);
                    r9.A02 = new C68773cR(runnable);
                    spannableString.setSpan(r9, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableString;
    }
}
