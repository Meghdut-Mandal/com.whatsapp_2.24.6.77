package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.2hH  reason: invalid class name and case insensitive filesystem */
public final class C48412hH extends C42581z3 {
    public boolean A00;
    public final WaImageView A01;
    public final C006302t A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48412hH(View view, C006302t r5, int i) {
        super(view);
        AnonymousClass00C.A0D(r5, 3);
        this.A02 = r5;
        TextView A0E = C36351kA.A0E(view);
        A0E.setText(i);
        A0E.setTextSize(0, A0E.getResources().getDimension(R.dimen.f7nameremoved));
        C33511fU.A03(A0E);
        WaImageView waImageView = (WaImageView) C36361kB.A0F(view, R.id.status_chevron);
        this.A01 = waImageView;
        waImageView.setVisibility(0);
        AnonymousClass3Y9.A00(view, this, 39);
    }
}
