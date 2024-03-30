package X;

import android.os.Bundle;
import com.whatsapp.events.EventResponseBottomSheet;

/* renamed from: X.4BQ  reason: invalid class name */
public final class AnonymousClass4BQ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ EventResponseBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BQ(EventResponseBottomSheet eventResponseBottomSheet) {
        super(0);
        this.this$0 = eventResponseBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A0A;
        if (bundle != null) {
            int i = bundle.getInt("EXISTING_RESPONSE_EXTRA");
            if (Integer.valueOf(i) != null) {
                return C52292pC.values()[i];
            }
        }
        return C52292pC.UNKNOWN;
    }
}
