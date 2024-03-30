package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.2Xu  reason: invalid class name and case insensitive filesystem */
public class C46472Xu extends C46482Xv {
    public final View A00;
    public final AnonymousClass0CP A01;
    public final RecyclerView A02;
    public final WaTextView A03;
    public final C40551vj A04;
    public final AnonymousClass1QW A05;

    public void A0B() {
        this.A02.setAdapter((AnonymousClass0CZ) null);
    }

    public C46472Xu(View view, C40551vj r6, C18820ts r7, AnonymousClass1QW r8) {
        super(view);
        AnonymousClass0CP gridLayoutManager;
        this.A05 = r8;
        this.A03 = C36401kF.A0Q(view, R.id.title);
        this.A00 = C012005e.A02(view, R.id.view_all_popular_categories);
        this.A02 = (RecyclerView) C012005e.A02(view, R.id.popular_categories_recycler_view);
        boolean A012 = r8.A01();
        view.getContext();
        if (A012) {
            gridLayoutManager = new LinearLayoutManager(0);
        } else {
            Resources resources = view.getResources();
            gridLayoutManager = new GridLayoutManager((int) Math.floor((double) (((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass04F.A03(view) + AnonymousClass04F.A02(view)))) / C36441kJ.A00(resources, R.dimen.f7nameremoved))));
        }
        this.A01 = gridLayoutManager;
        RecyclerView recyclerView = this.A02;
        recyclerView.setLayoutManager(gridLayoutManager);
        if (!this.A05.A01()) {
            recyclerView.A0t(new C41211wq(r7, view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
            C90204Zm.A00(recyclerView.getViewTreeObserver(), this, view, 0);
        } else if (view instanceof LinearLayout) {
            ((LinearLayout) view).setGravity(3);
        }
        this.A04 = r6;
    }
}
