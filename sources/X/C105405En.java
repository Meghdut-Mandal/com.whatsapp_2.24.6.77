package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.5En  reason: invalid class name and case insensitive filesystem */
public final class C105405En extends C46482Xv {
    public final View A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        View view = this.A00;
        ViewGroup A0O = C36411kG.A0O(view, R.id.shimmer_items);
        A0O.removeAllViews();
        C36351kA.A0C(view).inflate(R.layout.f9nameremoved, A0O, true);
    }

    public C105405En(View view) {
        super(view);
        this.A00 = view;
    }
}
