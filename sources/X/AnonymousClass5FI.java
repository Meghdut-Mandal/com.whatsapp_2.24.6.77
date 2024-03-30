package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.5FI  reason: invalid class name */
public class AnonymousClass5FI extends C46482Xv implements C159277j6 {
    public C105215Du A00;
    public final C121375t2 A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105215Du r10 = (C105215Du) obj;
        this.A00 = r10;
        C121375t2 r3 = this.A01;
        Queue queue = r10.A01;
        C95804mJ r8 = r3.A01;
        LinkedList A0l = C90524aI.A0l();
        boolean isEmpty = queue.isEmpty();
        RecyclerView recyclerView = r3.A00;
        String string = recyclerView.getContext().getString(R.string.f12nameremoved);
        C159277j6 r4 = r3.A02;
        A0l.add(new C1025650r(r4, string, isEmpty));
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            A0l.add(new C1025550q(r4, (AnonymousClass6BG) it.next(), !it.hasNext()));
        }
        r8.A0M(A0l);
        if (queue.size() > 1) {
            recyclerView.A0i(queue.size());
        }
    }

    public void BZN(AnonymousClass6BG r2) {
        this.A00.A00.BZN(r2);
    }

    public void Bfb() {
        this.A00.A00.Bfb();
    }

    public AnonymousClass5FI(View view) {
        super(view);
        this.A01 = new C121375t2(C90504aG.A0J(view, R.id.bread_crumbs_list), this);
    }
}
