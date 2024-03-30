package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.5FP  reason: invalid class name */
public class AnonymousClass5FP extends C46482Xv {
    public final AnonymousClass0CP A00;
    public final RecyclerView A01;
    public final C95914mU A02;
    public final AnonymousClass1QW A03;

    public static int A00(AnonymousClass5FP r4) {
        View view = r4.A0H;
        Resources resources = view.getResources();
        return (int) Math.floor((double) (((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass04F.A03(view) + AnonymousClass04F.A02(view)))) / C36441kJ.A00(resources, R.dimen.f7nameremoved)));
    }

    public AnonymousClass5FP(View view, AnonymousClass1QW r5) {
        super(view);
        AnonymousClass0CP gridLayoutManager;
        this.A03 = r5;
        this.A01 = C90504aG.A0J(view, R.id.popular_categories_recycler_view);
        boolean A012 = r5.A01();
        view.getContext();
        if (A012) {
            gridLayoutManager = new LinearLayoutManager(0);
        } else {
            gridLayoutManager = new GridLayoutManager(A00(this));
        }
        this.A00 = gridLayoutManager;
        Resources resources = view.getResources();
        RecyclerView recyclerView = this.A01;
        recyclerView.A0t(new C96254n2(resources, this));
        recyclerView.setLayoutManager(this.A00);
        if (!r5.A01()) {
            C164757sK.A00(recyclerView.getViewTreeObserver(), this, 3);
        }
        this.A02 = new C95914mU();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 8;
        if (this.A03.A01()) {
            i = 6;
        }
        int i2 = 0;
        do {
            A0I.add(new C110215aJ());
            i2++;
        } while (i2 < i);
        C95914mU r1 = this.A02;
        r1.A00 = A0I;
        r1.A06();
        this.A01.setAdapter(r1);
    }
}
