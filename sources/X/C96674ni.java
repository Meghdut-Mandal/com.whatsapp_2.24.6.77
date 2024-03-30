package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4ni  reason: invalid class name and case insensitive filesystem */
public final class C96674ni extends AnonymousClass0D3 {
    public final TextView A00;
    public final /* synthetic */ C95974ma A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96674ni(View view, C95974ma r7) {
        super(view);
        AnonymousClass00C.A0D(view, 2);
        this.A01 = r7;
        TextView A0F = C36351kA.A0F(view, R.id.text_view);
        this.A00 = A0F;
        A0F.setMaxWidth(C14960mT.A00(((double) C90484aE.A0P().widthPixels) * 0.75d));
    }
}
