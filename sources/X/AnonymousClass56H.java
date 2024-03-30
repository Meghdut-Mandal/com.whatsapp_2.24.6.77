package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.56H  reason: invalid class name */
public final class AnonymousClass56H extends C96524nT {
    public final View A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00S A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56H(View view, AnonymousClass00S r3, AnonymousClass00S r4, boolean z) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A05 = z;
        this.A04 = r3;
        this.A03 = r4;
        this.A00 = C36361kB.A0G(view, R.id.stickers_upsell_close);
        this.A02 = C36341k9.A0Q(view, R.id.stickers_upsell_title);
        this.A01 = C36341k9.A0Q(view, R.id.stickers_upsell_subtitle);
    }
}
