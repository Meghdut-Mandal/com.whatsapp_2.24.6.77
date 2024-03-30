package X;

import android.os.Bundle;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;

/* renamed from: X.2uk  reason: invalid class name and case insensitive filesystem */
public abstract class C55512uk {
    public static final StatusPrivacyBottomSheetDialogFragment A00(boolean z) {
        StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = new StatusPrivacyBottomSheetDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("should_display_xo", z);
        statusPrivacyBottomSheetDialogFragment.A17(A07);
        return statusPrivacyBottomSheetDialogFragment;
    }
}
