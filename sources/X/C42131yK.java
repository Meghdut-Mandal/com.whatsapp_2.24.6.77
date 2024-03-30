package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.1yK  reason: invalid class name and case insensitive filesystem */
public final class C42131yK extends AnonymousClass0D3 {
    public final Context A00;
    public final View A01;
    public final C20230xE A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42131yK(View view, C20230xE r7, C18820ts r8) {
        super(view);
        C36321k7.A11(view, r7, r8);
        this.A02 = r7;
        this.A01 = C36361kB.A0D(C36361kB.A06(view), 16908290);
        this.A00 = view.getContext();
        View view2 = this.A0H;
        ImageView A0G = C36401kF.A0G(view2, R.id.chevron);
        C36361kB.A13(AnonymousClass3UF.A02(A0G.getContext(), C222013h.A07 ? R.drawable.vec_ic_chevron_right_wds : R.drawable.chevron, R.color.f6nameremoved), A0G, r8);
        view2.setBackground((Drawable) null);
        C36351kA.A19(view2, R.id.divider);
    }
}
