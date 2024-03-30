package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.3ON  reason: invalid class name */
public final class AnonymousClass3ON {
    public static final FingerprintBottomSheet A00(int i, int i2, int i3, int i4) {
        FingerprintBottomSheet fingerprintBottomSheet = new FingerprintBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("title", i);
        A07.putInt("negative_button_text", i2);
        A07.putInt("positive_button_text", i3);
        if (i4 != 0) {
            A07.putInt("header_layout_id", i4);
        }
        A07.putInt("fingerprint_view_style_id", R.style.f13nameremoved);
        A07.putBoolean("full_screen", false);
        fingerprintBottomSheet.A17(A07);
        return fingerprintBottomSheet;
    }

    public final FingerprintBottomSheet A01() {
        return A00(R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.layout.f9nameremoved);
    }
}
