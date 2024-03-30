package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.5zo  reason: invalid class name and case insensitive filesystem */
public final class C125375zo {
    public ExpressionsKeyboardSearchBottomSheet A00(String str, int i) {
        ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = new ExpressionsKeyboardSearchBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("arg_search_opener", i);
        A07.putString("contextual_suggestion_query", str);
        expressionsKeyboardSearchBottomSheet.A17(A07);
        return expressionsKeyboardSearchBottomSheet;
    }
}
