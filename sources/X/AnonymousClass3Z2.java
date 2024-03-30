package X;

import android.view.View;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Z2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Z2 implements View.OnLongClickListener {
    public final /* synthetic */ C32511dj A00;
    public final /* synthetic */ C1028352d A01;

    public /* synthetic */ AnonymousClass3Z2(C32511dj r1, C1028352d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        C32511dj r1 = this.A00;
        C1028352d r2 = this.A01;
        List list = AnonymousClass0D3.A0I;
        CallsHistoryFragmentV2 callsHistoryFragmentV2 = r1.A00;
        if (!callsHistoryFragmentV2.A0q) {
            Log.w("CallsHistoryFragmentV2/ScheduleCallItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search");
            return false;
        }
        CallsHistoryFragmentV2.A07(r2, callsHistoryFragmentV2);
        return true;
    }
}
