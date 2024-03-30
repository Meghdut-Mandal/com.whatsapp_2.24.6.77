package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.biz.serviceofferings.ServiceOfferingsRecyclerView;

/* renamed from: X.38y  reason: invalid class name and case insensitive filesystem */
public final class C606838y {
    public C40471vb A00;
    public ServiceOfferingsRecyclerView A01;
    public final Context A02;
    public final View A03;
    public final C18820ts A04;

    public C606838y(Context context, View view, C18820ts r8) {
        C36341k9.A1E(r8, 2, context);
        this.A03 = view;
        this.A04 = r8;
        this.A02 = context;
        this.A01 = (ServiceOfferingsRecyclerView) C36361kB.A0G(view, R.id.service_offerings_recycler_view);
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView = this.A01;
        if (serviceOfferingsRecyclerView == null) {
            throw C36331k8.A0d("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView.setLayoutManager(gridLayoutManager);
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView2 = this.A01;
        if (serviceOfferingsRecyclerView2 == null) {
            throw C36331k8.A0d("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView2.A0t(new C41211wq(this.A04, this.A02.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView3 = this.A01;
        if (serviceOfferingsRecyclerView3 == null) {
            throw C36331k8.A0d("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView3.setNestedScrollingEnabled(false);
        C40471vb r1 = new C40471vb();
        this.A00 = r1;
        ServiceOfferingsRecyclerView serviceOfferingsRecyclerView4 = this.A01;
        if (serviceOfferingsRecyclerView4 == null) {
            throw C36331k8.A0d("serviceOfferingsRecyclerView");
        }
        serviceOfferingsRecyclerView4.setAdapter(r1);
    }
}
