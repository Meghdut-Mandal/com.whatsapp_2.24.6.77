package X;

import android.os.Bundle;
import com.whatsapp.events.EventResponseBottomSheet;

/* renamed from: X.4BR  reason: invalid class name */
public final class AnonymousClass4BR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ EventResponseBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BR(EventResponseBottomSheet eventResponseBottomSheet) {
        super(0);
        this.this$0 = eventResponseBottomSheet;
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
