package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;

/* renamed from: X.2hE  reason: invalid class name and case insensitive filesystem */
public final class C48382hE extends C42581z3 {
    public RecyclerView A00;
    public final StatusSeeAllAdapter A01;

    public C48382hE(View view, StatusSeeAllAdapter statusSeeAllAdapter) {
        super(view);
        this.A01 = statusSeeAllAdapter;
        View findViewById = view.findViewById(R.id.see_all_filter_chips_recycler_view);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        view.getContext();
        C36351kA.A1F(recyclerView, 0);
        recyclerView.setItemAnimator((C02800By) null);
        AnonymousClass00C.A08(findViewById);
        this.A00 = recyclerView;
    }
}
