package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1yU  reason: invalid class name and case insensitive filesystem */
public final class C42231yU extends AnonymousClass0D3 {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final AnonymousClass32M A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42231yU(View view, AnonymousClass32M r3) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A00 = view;
        this.A03 = r3;
        this.A02 = C36351kA.A0F(view, R.id.item_integrator_name);
        this.A01 = C36361kB.A0M(view, R.id.item_integrator_icon);
        C36381kD.A18(view, R.id.item_integrator_checkbox);
    }
}
