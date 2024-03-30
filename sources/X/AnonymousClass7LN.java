package X;

import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onEmojiBackspaceClick$1;

/* renamed from: X.7LN  reason: invalid class name */
public final class AnonymousClass7LN extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ExpressionsBottomSheetView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7LN(ExpressionsBottomSheetView expressionsBottomSheetView) {
        super(0);
        this.this$0 = expressionsBottomSheetView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ExpressionsKeyboardViewModel A00 = this.this$0.getExpressionsViewModel();
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onEmojiBackspaceClick$1(A00, (C023509x) null), C109325Xd.A00(A00));
        this.this$0.getExpressionUserJourneyLogger().A02(41, 1, 4);
        return AnonymousClass0AJ.A00;
    }
}
