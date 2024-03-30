package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.2hK  reason: invalid class name and case insensitive filesystem */
public final class C48442hK extends C42581z3 {
    public final View A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final AnonymousClass37S A03;
    public final C32161d4 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48442hK(View view, AnonymousClass37S r3, C32161d4 r4) {
        super(view);
        AnonymousClass00C.A0D(r3, 3);
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = view.findViewById(R.id.advertise_banner_container);
        this.A02 = C36411kG.A0Z(view, R.id.title_text_view);
        this.A01 = C36411kG.A0Z(view, R.id.subtitle_text_view);
    }
}
