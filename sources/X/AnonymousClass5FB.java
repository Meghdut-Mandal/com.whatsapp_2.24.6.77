package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.5FB  reason: invalid class name */
public class AnonymousClass5FB extends C46482Xv {
    public final RecyclerView A00;
    public final C168007zY A01;

    public void A0B() {
        this.A00.setAdapter((AnonymousClass0CZ) null);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.setAdapter(this.A01);
        throw AnonymousClass001.A0A("historyBarItems");
    }

    public AnonymousClass5FB(View view, C168007zY r4) {
        super(view);
        RecyclerView A0J = C90504aG.A0J(view, R.id.search_history_recycler_view);
        this.A00 = A0J;
        view.getContext();
        C36351kA.A1F(A0J, 0);
        this.A01 = r4;
    }
}