package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1x3  reason: invalid class name and case insensitive filesystem */
public final class C41341x3 extends AnonymousClass0D3 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41341x3(View view, C20810yC r11, C32681e1 r12, Runnable runnable) {
        super(view);
        C36321k7.A0x(r11, r12);
        TextView A0M = C36341k9.A0M(view, R.id.e2ee_main_text);
        Runnable runnable2 = runnable;
        A0M.setText(r12.A03(A0M.getContext(), runnable2, C36361kB.A0m(view.getContext(), R.string.f12nameremoved), "%s", C36381kD.A01(A0M.getContext())));
        C36331k8.A10(A0M, r11);
    }
}
