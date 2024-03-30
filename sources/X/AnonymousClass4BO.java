package X;

import android.os.Bundle;
import com.whatsapp.events.EventInfoBottomSheet;

/* renamed from: X.4BO  reason: invalid class name */
public final class AnonymousClass4BO extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ EventInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BO(EventInfoBottomSheet eventInfoBottomSheet) {
        super(0);
        this.this$0 = eventInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C64933Qa A03;
        Bundle bundle = this.this$0.A0A;
        if (bundle != null && (A03 = AnonymousClass3UJ.A03(bundle, "")) != null) {
            return A03;
        }
        throw AnonymousClass001.A09("Could not retrieve message key from arguments bundle.");
    }
}
