package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.biz.BusinessHoursView;

/* renamed from: X.3YV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YV implements View.OnClickListener {
    public final /* synthetic */ BusinessHoursView A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass3YV(BusinessHoursView businessHoursView, Integer num, String str, boolean z, boolean z2) {
        this.A00 = businessHoursView;
        this.A02 = str;
        this.A01 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void onClick(View view) {
        BusinessHoursView businessHoursView = this.A00;
        String str = this.A02;
        Integer num = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A04;
        if (!businessHoursView.A06) {
            businessHoursView.A02.A06((Integer) null, num, str, 4, z, z2);
        }
        boolean z3 = !businessHoursView.A06;
        businessHoursView.A06 = z3;
        businessHoursView.A01.setFullView(z3);
        ImageView imageView = businessHoursView.A00;
        Context context = businessHoursView.getContext();
        boolean z4 = businessHoursView.A06;
        int i = R.drawable.ic_chevron_down;
        if (z4) {
            i = R.drawable.ic_chevron_up;
        }
        C36391kE.A18(context, imageView, i);
    }
}
