package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.5FA  reason: invalid class name */
public class AnonymousClass5FA extends C46482Xv {
    public final RecyclerView A00;
    public final C96084ml A01;

    public void A0B() {
        this.A00.setAdapter((AnonymousClass0CZ) null);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105235Dw r4 = (C105235Dw) obj;
        RecyclerView recyclerView = this.A00;
        C96084ml r2 = this.A01;
        recyclerView.setAdapter(r2);
        r2.A02 = r4.A01;
        r2.A06();
        C160627lJ r0 = r4.A00;
        AnonymousClass00C.A0D(r0, 0);
        r2.A01 = r0;
    }

    public AnonymousClass5FA(View view, C96084ml r4) {
        super(view);
        RecyclerView A0J = C90504aG.A0J(view, R.id.search_filter_recycler_view);
        this.A00 = A0J;
        view.getContext();
        C36351kA.A1F(A0J, 0);
        this.A01 = r4;
    }
}
