package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollResultsViewModel;

/* renamed from: X.1yC  reason: invalid class name and case insensitive filesystem */
public final class C42051yC extends AnonymousClass0D3 {
    public long A00;
    public final WaTextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42051yC(View view, PollResultsViewModel pollResultsViewModel) {
        super(view);
        AnonymousClass00C.A0D(pollResultsViewModel, 2);
        WaTextView A0Q = C36341k9.A0Q(view, R.id.poll_results_see_all_text_view);
        AnonymousClass3YH.A00(A0Q, pollResultsViewModel, this, 13);
        C33521fV.A02(A0Q);
        this.A01 = A0Q;
    }
}
