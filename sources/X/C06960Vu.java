package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: X.0Vu  reason: invalid class name and case insensitive filesystem */
public abstract class C06960Vu {
    public static final Comparator A00 = new C18420t8(1);

    public static ArrayList A00(Toolbar toolbar, CharSequence charSequence) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    A0I.add(textView);
                }
            }
        }
        return A0I;
    }
}
