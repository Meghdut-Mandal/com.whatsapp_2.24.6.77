package X;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9lm  reason: invalid class name and case insensitive filesystem */
public final class C202409lm {
    public static final List A00;

    public static final boolean A02(Context context, String str) {
        Iterator A14 = C90514aH.A14(context.getPackageManager().queryIntentActivities(C36331k8.A04("upi://pay"), 65536));
        while (A14.hasNext()) {
            if (AnonymousClass00C.A0J(((ResolveInfo) A14.next()).activityInfo.packageName, str)) {
                return true;
            }
        }
        return false;
    }

    public static final C175758b0 A00(Resources resources, String str) {
        int i = 0;
        if (!AnonymousClass00C.A0J(str, "WhatsappPay")) {
            if (!AnonymousClass00C.A0J(str, "other")) {
                C188568zn[] values = C188568zn.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    C188568zn r1 = values[i2];
                    if (AnonymousClass00C.A0J(r1.packageName, str)) {
                        i = r1.appIcon;
                        break;
                    }
                    i2++;
                }
            } else {
                i = R.drawable.ic_send_to_upi;
            }
        } else {
            i = R.drawable.ic_wa_app_logo;
        }
        return new C175758b0(BitmapFactory.decodeResource(resources, i), str, A01(resources, str));
    }

    static {
        ArrayList A14 = C36441kJ.A14(r3);
        for (C188568zn r0 : C188568zn.values()) {
            A14.add(r0.packageName);
        }
        A00 = A14;
    }

    public static final String A01(Resources resources, String str) {
        int i;
        C36321k7.A0w(str, resources);
        if (str.equals("WhatsappPay")) {
            i = R.string.f12nameremoved;
        } else if (str.equals(C188568zn.GOOGLE_PAY.packageName)) {
            i = R.string.f12nameremoved;
        } else if (str.equals(C188568zn.PHONE_PE.packageName)) {
            i = R.string.f12nameremoved;
        } else if (str.equals(C188568zn.PAY_TM.packageName)) {
            i = R.string.f12nameremoved;
        } else if (!str.equals("other")) {
            return "";
        } else {
            i = R.string.f12nameremoved;
        }
        String string = resources.getString(i);
        AnonymousClass00C.A08(string);
        return string;
    }
}
