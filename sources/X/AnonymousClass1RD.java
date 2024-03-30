package X;

import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;

/* renamed from: X.1RD  reason: invalid class name */
public class AnonymousClass1RD implements C010904r {
    public View A00 = null;
    public final /* synthetic */ HomeActivity A01;

    public AnonymousClass09H BRE(View view, AnonymousClass09H r6) {
        AnonymousClass09T A0C = r6.A00.A0C(7);
        View view2 = this.A00;
        if (view2 == null) {
            view2 = this.A01.findViewById(R.id.navigation_bar_protection);
            this.A00 = view2;
        }
        view2.setPadding(0, 0, 0, A0C.A00);
        return r6;
    }

    public AnonymousClass1RD(HomeActivity homeActivity) {
        this.A01 = homeActivity;
    }
}
