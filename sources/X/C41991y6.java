package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1y6  reason: invalid class name and case insensitive filesystem */
public final class C41991y6 extends AnonymousClass0D3 {
    public final TextEmojiLabel A00;
    public final /* synthetic */ C168097zh A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41991y6(View view, C24801Dv r11, C21060yb r12, C168097zh r13, C32681e1 r14) {
        super(view);
        this.A01 = r13;
        TextEmojiLabel A0R = C36361kB.A0R(view, R.id.disclaimer_text_view);
        this.A00 = A0R;
        C36331k8.A1A(A0R.getAbProps(), A0R);
        C36331k8.A16(A0R, r12);
        C32681e1 r3 = r14;
        A0R.setText(r3.A03(A0R.getContext(), new C80403vL(r11, A0R, r13, 42), A0R.getContext().getString(R.string.f12nameremoved), "", C36381kD.A01(A0R.getContext())));
    }
}
