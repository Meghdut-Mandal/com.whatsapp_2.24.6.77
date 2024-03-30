package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3RN  reason: invalid class name */
public abstract class AnonymousClass3RN {
    public static int A00(AnonymousClass3T1 r1) {
        if (r1 instanceof AnonymousClass2bX) {
            return 1;
        }
        if (r1 instanceof AnonymousClass2bW) {
            return ((AnonymousClass2bW) r1).A1X().size();
        }
        if (!C131806Qs.A02(r1)) {
            return 0;
        }
        C46972by r12 = (C46972by) r1;
        C65013Qj r0 = r12.A01;
        if (r0 != null) {
            return r0.A01;
        }
        return r12.A00;
    }

    public static List A02(AnonymousClass3T1 r3, AnonymousClass1YI r4) {
        File A01;
        if (r3 instanceof AnonymousClass2bX) {
            return Collections.singletonList(((AnonymousClass2bX) r3).A1X());
        }
        if (r3 instanceof AnonymousClass2bW) {
            return ((AnonymousClass2bW) r3).A1X();
        }
        if (C131806Qs.A02(r3) && (A01 = AnonymousClass2bU.A01((AnonymousClass2bU) r3)) != null) {
            try {
                return C200709i5.A00(r4.A01(Uri.fromFile(A01)));
            } catch (IOException e) {
                Log.e("vcardloader/splitvcards/exception", e);
            }
        }
        return null;
    }

    public static String A01(Context context, AnonymousClass3T1 r3) {
        if (!C131806Qs.A02(r3)) {
            return null;
        }
        String A1b = ((AnonymousClass2bU) r3).A1b();
        if (TextUtils.isEmpty(A1b)) {
            return context.getString(R.string.f12nameremoved);
        }
        return AnonymousClass6YY.A08(A1b);
    }
}
