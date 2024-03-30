package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.7LS  reason: invalid class name */
public final class AnonymousClass7LS extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7LS(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        super(0);
        this.this$0 = expressionsKeyboardSearchBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A0A;
        int i = 0;
        if (bundle != null) {
            i = bundle.getInt("arg_search_opener", 0);
        }
        return Integer.valueOf(i);
    }
}
