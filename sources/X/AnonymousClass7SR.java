package X;

import com.whatsapp.calling.callrating.CallRatingBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.7SR  reason: invalid class name */
public final class AnonymousClass7SR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CallRatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SR(CallRatingBottomSheet callRatingBottomSheet) {
        super(1);
        this.this$0 = callRatingBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        WDSButton wDSButton = this.this$0.A03;
        if (wDSButton != null) {
            AnonymousClass00C.A0B(bool);
            wDSButton.setEnabled(bool.booleanValue());
        }
        return AnonymousClass0AJ.A00;
    }
}
