package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5FJ  reason: invalid class name */
public final class AnonymousClass5FJ extends AnonymousClass5FD {
    public TextEmojiLabel A00;
    public final C18820ts A01;

    public void A0E(AnonymousClass5E0 r4) {
        AnonymousClass00C.A0D(r4, 0);
        super.A0E(r4);
        this.A00.setText(C26621Kw.A06(C36401kF.A0x(this.A01), String.valueOf(A04() + 1)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FJ(View view, C18820ts r3, C20810yC r4, C117555mS r5) {
        super(view, r4, r5);
        C36321k7.A11(r4, r5, r3);
        this.A01 = r3;
        this.A00 = C36351kA.A0O(view, R.id.business_rank);
    }
}
