package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.56A  reason: invalid class name */
public final class AnonymousClass56A extends C96524nT {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56A(View view, AnonymousClass00S r4, boolean z) {
        super(view);
        AnonymousClass00C.A0D(view, 2);
        WDSButton A0y = C36431kI.A0y(C36361kB.A0G(view, R.id.sticker_maker_button), R.id.action_button);
        AnonymousClass3Y1.A00(view, r4, 32);
        A0y.setIcon(z ? R.drawable.sticker_maker_create_with_ai : R.drawable.vec_sticker_info_edit);
    }
}
