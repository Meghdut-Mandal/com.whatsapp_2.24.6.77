package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4ny  reason: invalid class name and case insensitive filesystem */
public final class C96834ny extends AnonymousClass0D3 {
    public final WaTextView A00;
    public final WaTextView A01;
    public final C21060yb A02;
    public final AnonymousClass1H2 A03;
    public final C19890wg A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96834ny(View view, C21060yb r3, AnonymousClass1H2 r4, C19890wg r5) {
        super(view);
        C36321k7.A11(r4, r3, r5);
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = C36341k9.A0Q(view, R.id.poll_results_question_text_view);
        this.A01 = C36341k9.A0Q(view, R.id.poll_voters_count_text_view);
    }
}
