package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.3MY  reason: invalid class name */
public abstract class AnonymousClass3MY {
    public static boolean A00(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return scrollView.getHeight() < (childAt.getHeight() + scrollView.getPaddingTop()) + scrollView.getPaddingBottom();
    }
}
