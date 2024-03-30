package X;

import android.content.Context;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.4sw  reason: invalid class name and case insensitive filesystem */
public final class C99254sw extends AnonymousClass0FL {
    public final CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99254sw(Context context, CallRatingViewModel callRatingViewModel, int i) {
        super(context, i);
        AnonymousClass00C.A0D(callRatingViewModel, 3);
        this.A00 = callRatingViewModel;
    }

    public void cancel() {
        this.A00.A08.A0D(C1028552h.A00);
    }
}
