package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;

/* renamed from: X.6Gq  reason: invalid class name and case insensitive filesystem */
public final class C129366Gq {
    public static final TextVariantsBottomSheet A00(C134606bJ r3, C134746bX r4, int i, boolean z) {
        TextVariantsBottomSheet textVariantsBottomSheet = new TextVariantsBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("START_WITH_SELECTION_ARG", i);
        A07.putParcelable("TEXT_OPTIONS_DATA", r4);
        A07.putParcelable("OTHER_OPTION_SELECTED_ARG", r3);
        A07.putBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG", z);
        textVariantsBottomSheet.A17(A07);
        return textVariantsBottomSheet;
    }
}
