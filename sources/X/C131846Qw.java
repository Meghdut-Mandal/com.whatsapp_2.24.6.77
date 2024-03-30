package X;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.6Qw  reason: invalid class name and case insensitive filesystem */
public abstract class C131846Qw {
    public static String A01(Context context, AnonymousClass6QG r5) {
        String str = r5.A07;
        if (r5.A07() && TextUtils.isEmpty(str)) {
            return context.getString(R.string.f12nameremoved);
        }
        if (r5.A06() && !TextUtils.isEmpty(str)) {
            return str.trim();
        }
        boolean A04 = r5.A04();
        int i = R.string.f12nameremoved;
        if (A04) {
            i = R.string.f12nameremoved;
        }
        return C36351kA.A0w(context, str, 1, i);
    }

    public static String A00(Context context, Address address, float f) {
        String thoroughfare = address.getThoroughfare();
        if (((double) f) <= 200.0d && !TextUtils.isEmpty(thoroughfare)) {
            String subThoroughfare = address.getSubThoroughfare();
            if (TextUtils.isEmpty(subThoroughfare)) {
                return thoroughfare;
            }
            Object[] A0M = AnonymousClass001.A0M();
            C36331k8.A1N(thoroughfare, subThoroughfare, A0M);
            return context.getString(R.string.f12nameremoved, A0M);
        } else if (!TextUtils.isEmpty(address.getSubLocality())) {
            return address.getSubLocality();
        } else {
            if (!TextUtils.isEmpty(address.getLocality())) {
                return address.getLocality();
            }
            if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                return address.getSubAdminArea();
            }
            return null;
        }
    }
}
