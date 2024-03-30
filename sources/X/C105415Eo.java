package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.5Eo  reason: invalid class name and case insensitive filesystem */
public final class C105415Eo extends C46482Xv {
    public final View A00;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5EC r8 = (AnonymousClass5EC) obj;
        AnonymousClass00C.A0D(r8, 0);
        View view = this.A00;
        ViewGroup A0O = C36411kG.A0O(view, R.id.shimmer_items);
        A0O.removeAllViews();
        if (r8.A00) {
            C36351kA.A0C(view).inflate(R.layout.f9nameremoved, A0O, true);
        }
        int i = 0;
        do {
            C36351kA.A0C(view).inflate(R.layout.f9nameremoved, A0O, true);
            i++;
        } while (i < 3);
        C36351kA.A0C(view).inflate(R.layout.f9nameremoved, A0O, true);
    }

    public C105415Eo(View view) {
        super(view);
        this.A00 = view;
    }
}
