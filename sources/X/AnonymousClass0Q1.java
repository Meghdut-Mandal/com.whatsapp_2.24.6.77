package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Q1  reason: invalid class name */
public abstract class AnonymousClass0Q1 {
    public static final View A00(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Index: ");
        A0u.append(0);
        A0u.append(", Size: ");
        A0u.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(A0u.toString());
    }
}
