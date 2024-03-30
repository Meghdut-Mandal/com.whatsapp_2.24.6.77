package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.0m6  reason: invalid class name and case insensitive filesystem */
public final class C14730m6 extends AnonymousClass00R implements C006302t {
    public static final C14730m6 A00 = new C14730m6();

    public C14730m6() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 0);
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (!(tag instanceof AnonymousClass017)) {
            return null;
        }
        return tag;
    }
}
