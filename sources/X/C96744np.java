package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4np  reason: invalid class name and case insensitive filesystem */
public final class C96744np extends AnonymousClass0D3 {
    public final View A00;
    public final WaImageView A01;
    public final WaImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96744np(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A01 = (WaImageView) C36361kB.A0F(view, R.id.icon);
        this.A02 = (WaImageView) C36361kB.A0F(view, R.id.selector);
        this.A00 = C36361kB.A0F(view, R.id.tap_area);
    }
}
