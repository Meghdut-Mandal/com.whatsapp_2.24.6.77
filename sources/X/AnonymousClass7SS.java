package X;

import com.whatsapp.R;
import com.whatsapp.calling.callrating.CallRatingBottomSheet;
import com.whatsapp.calling.callrating.CallRatingFragment;
import com.whatsapp.calling.callrating.UserProblemsFragment;

/* renamed from: X.7SS  reason: invalid class name */
public final class AnonymousClass7SS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CallRatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SS(CallRatingBottomSheet callRatingBottomSheet) {
        super(1);
        this.this$0 = callRatingBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallRatingBottomSheet callRatingBottomSheet;
        AnonymousClass02E userProblemsFragment;
        if (AnonymousClass00C.A0J(obj, C1028652i.A00)) {
            callRatingBottomSheet = this.this$0;
            userProblemsFragment = new CallRatingFragment();
        } else {
            if (AnonymousClass00C.A0J(obj, C1028752j.A00)) {
                callRatingBottomSheet = this.this$0;
                userProblemsFragment = new UserProblemsFragment();
            }
            return AnonymousClass0AJ.A00;
        }
        AnonymousClass09Y A0S = C36411kG.A0S(callRatingBottomSheet);
        A0S.A0B(userProblemsFragment, R.id.container);
        A0S.A00(false);
        return AnonymousClass0AJ.A00;
    }
}
