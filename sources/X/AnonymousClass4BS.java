package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;

/* renamed from: X.4BS  reason: invalid class name */
public final class AnonymousClass4BS extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass3UT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BS(AnonymousClass3UT r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3UT r2 = this.this$0;
        BottomSheetBehavior bottomSheetBehavior = r2.A06;
        if (bottomSheetBehavior != null) {
            int i = bottomSheetBehavior.A0J;
            ExpressionsBottomSheetView expressionsBottomSheetView = r2.A0E;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.A0E(i);
            }
            AnonymousClass3UT.A02(r2.A0E, r2);
        }
        return AnonymousClass0AJ.A00;
    }
}
