package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.CatalogImageListActivity;

/* renamed from: X.1wx  reason: invalid class name and case insensitive filesystem */
public final class C41281wx extends AnonymousClass0UE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass07B A03;
    public final /* synthetic */ LinearLayoutManager A04;
    public final /* synthetic */ C41231ws A05;
    public final /* synthetic */ CatalogImageListActivity A06;

    public void A04(RecyclerView recyclerView, int i, int i2) {
        AnonymousClass00C.A0D(recyclerView, 0);
        LinearLayoutManager linearLayoutManager = this.A04;
        float f = 1.0f;
        if (linearLayoutManager.A1T() == 0) {
            View A0k = linearLayoutManager.A0k(0);
            if (A0k != null) {
                int top = A0k.getTop();
                int i3 = this.A05.A01;
                f = Math.min(Math.max(0.0f, ((float) (i3 - top)) / ((float) i3)), 1.0f);
            } else {
                throw C36381kD.A0l();
            }
        }
        int i4 = this.A00;
        int i5 = this.A01;
        this.A03.A0K(new ColorDrawable(C018107s.A03(f, i4, i5)));
        this.A06.getWindow().setStatusBarColor(C018107s.A03(f, this.A02, i5));
    }

    public C41281wx(AnonymousClass07B r1, LinearLayoutManager linearLayoutManager, C41231ws r3, CatalogImageListActivity catalogImageListActivity, int i, int i2, int i3) {
        this.A04 = linearLayoutManager;
        this.A05 = r3;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r1;
        this.A02 = i3;
        this.A06 = catalogImageListActivity;
    }
}
