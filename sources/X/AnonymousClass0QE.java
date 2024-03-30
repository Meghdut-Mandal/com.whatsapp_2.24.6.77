package X;

import android.view.View;
import android.view.ViewParent;
import com.whatsapp.R;

/* renamed from: X.0QE  reason: invalid class name */
public abstract class AnonymousClass0QE {
    public static AnonymousClass016 A00(View view) {
        AnonymousClass016 r2 = (AnonymousClass016) view.getTag(R.id.view_tree_view_model_store_owner);
        if (r2 == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                r2 = (AnonymousClass016) view2.getTag(R.id.view_tree_view_model_store_owner);
                parent = view2.getParent();
                if (r2 != null) {
                    break;
                }
            }
        }
        return r2;
    }
}
