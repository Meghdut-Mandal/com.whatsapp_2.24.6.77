package X;

import android.app.Activity;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.Map;

/* renamed from: X.71A  reason: invalid class name */
public final class AnonymousClass71A implements C158717hx {
    public void BlS(Activity activity, C594233w r8, Map map) {
        AnonymousClass02E r2;
        AnonymousClass00C.A0E(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass02E A0N = ((AnonymousClass01I) activity).getSupportFragmentManager().A0N("extensions_bottom_sheet_container");
        String str = null;
        if (A0N != null) {
            r2 = A0N.A0k().A0N("BK_FRAGMENT");
        } else {
            r2 = null;
        }
        boolean z = false;
        if (map != null) {
            if (map.containsKey("show_full_screen_error")) {
                z = C90464aC.A1a(map, "show_full_screen_error");
            }
            if (map.containsKey("custom_error_message")) {
                str = C36431kI.A1A("custom_error_message", map);
            }
        }
        if (r2 != null) {
            ((WaBkExtensionsLayoutViewModel) C36441kJ.A0b(r2).A00(WaBkExtensionsLayoutViewModel.class)).A0V((AnonymousClass2Uv) null, (String) null, str, "extensions-error-from-layout", z);
        }
    }
}
