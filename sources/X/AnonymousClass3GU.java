package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3GU  reason: invalid class name */
public class AnonymousClass3GU {
    public final int A00;
    public final View A01;
    public final View A02;

    public void A01() {
        C89924Yk.A00(this.A02.getViewTreeObserver(), this, 11);
    }

    public AnonymousClass3GU(View view, View view2, int i) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i;
        C89634Xh.A00(view.getViewTreeObserver(), this, 9);
    }

    public static AnonymousClass3GU A00(Context context, View view, View view2) {
        return new AnonymousClass3GU(view, view2, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public void A02(Context context, ClickableSpan clickableSpan, TextView textView, String str, int i) {
        SpannableString A0O = C36441kJ.A0O(str);
        int length = str.length();
        A0O.setSpan(clickableSpan, 0, length, 0);
        A0O.setSpan(new TextAppearanceSpan(context, i), 0, length, 0);
        A0O.setSpan(new C37431mM(this), 0, length, 0);
        C36391kE.A1J(textView);
        C36431kI.A1M(textView, A0O);
    }
}
