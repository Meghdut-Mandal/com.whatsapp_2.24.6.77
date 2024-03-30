package X;

import android.view.View;
import android.view.ViewParent;
import com.whatsapp.R;

/* renamed from: X.0QD  reason: invalid class name */
public abstract class AnonymousClass0QD {
    public static AnonymousClass012 A00(View view) {
        AnonymousClass012 r2 = (AnonymousClass012) view.getTag(R.id.view_tree_lifecycle_owner);
        if (r2 == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                r2 = (AnonymousClass012) view2.getTag(R.id.view_tree_lifecycle_owner);
                parent = view2.getParent();
                if (r2 != null) {
                    break;
                }
            }
        }
        return r2;
    }
}
