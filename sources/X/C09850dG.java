package X;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0dG  reason: invalid class name and case insensitive filesystem */
public class C09850dG implements AnonymousClass04S {
    public final /* synthetic */ DialogFragment A00;

    public C09850dG(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public /* bridge */ /* synthetic */ void BTH(Object obj) {
        if (obj != null) {
            DialogFragment dialogFragment = this.A00;
            if (dialogFragment.A0A) {
                View A0d = dialogFragment.A0d();
                if (A0d.getParent() != null) {
                    throw AnonymousClass001.A09("DialogFragment can not be attached to a container view");
                } else if (dialogFragment.A02 != null) {
                    if (AnonymousClass01z.A0E(3)) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("DialogFragment ");
                        A0u.append(this);
                        A0u.append(" setting the content view on ");
                        Log.d("FragmentManager", AnonymousClass000.A0o(dialogFragment.A02, A0u));
                    }
                    dialogFragment.A02.setContentView(A0d);
                }
            }
        }
    }
}
