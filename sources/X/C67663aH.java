package X;

import android.text.TextUtils;
import java.nio.charset.Charset;

/* renamed from: X.3aH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67663aH implements C16670pt {
    public static final /* synthetic */ C67663aH A00 = new C67663aH();

    public final boolean BvZ(Object obj) {
        String str = (String) obj;
        Charset charset = C31191bQ.A08;
        if (TextUtils.isEmpty(str) || str.startsWith("ab_props:") || str.startsWith("prop_override:") || str.endsWith("_expo_key")) {
            return true;
        }
        return false;
    }
}
