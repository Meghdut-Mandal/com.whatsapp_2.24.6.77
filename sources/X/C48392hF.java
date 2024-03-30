package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.2hF  reason: invalid class name and case insensitive filesystem */
public final class C48392hF extends C42581z3 {
    public boolean A00;
    public final WaImageView A01;
    public final UpdatesAdapter A02;

    public C48392hF(View view, UpdatesAdapter updatesAdapter) {
        super(view);
        this.A02 = updatesAdapter;
        TextView A0E = C36351kA.A0E(view);
        A0E.setText(R.string.f12nameremoved);
        A0E.setTextSize(0, A0E.getResources().getDimension(R.dimen.f7nameremoved));
        C33511fU.A03(A0E);
        WaImageView waImageView = (WaImageView) C36361kB.A0F(view, R.id.status_chevron);
        this.A01 = waImageView;
        waImageView.setVisibility(0);
        AnonymousClass3Y9.A00(view, this, 31);
    }
}
