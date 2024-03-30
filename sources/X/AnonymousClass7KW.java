package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CallRatingActivity;
import com.whatsapp.calling.callrating.CallRatingBottomSheet;

/* renamed from: X.7KW  reason: invalid class name */
public final class AnonymousClass7KW extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CallRatingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7KW(CallRatingActivity callRatingActivity) {
        super(0);
        this.this$0 = callRatingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle A0H = C36371kC.A0H(this.this$0);
        CallRatingBottomSheet callRatingBottomSheet = new CallRatingBottomSheet();
        if (A0H != null) {
            callRatingBottomSheet.A17(A0H);
        }
        return callRatingBottomSheet;
    }
}
