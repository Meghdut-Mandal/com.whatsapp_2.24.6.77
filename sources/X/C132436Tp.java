package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.6Tp  reason: invalid class name and case insensitive filesystem */
public final class C132436Tp {
    public final Bundle A00;

    public static String A00(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static boolean A02(Bundle bundle) {
        String str = "gcm.n.e";
        if (!"1".equals(bundle.getString(str))) {
            if (str.startsWith("gcm.n.")) {
                str = str.replace("gcm.n.", "gcm.notification.");
            }
            if (!"1".equals(bundle.getString(str))) {
                String str2 = "gcm.n.icon";
                if (bundle.getString(str2) == null) {
                    if (str2.startsWith("gcm.n.")) {
                        str2 = str2.replace("gcm.n.", "gcm.notification.");
                    }
                    if (bundle.getString(str2) != null) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final Bundle A03() {
        Bundle bundle = this.A00;
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!A0C.startsWith("google.c.a.") && !A0C.equals("from")) {
                bundle2.remove(A0C);
            }
        }
        return bundle2;
    }

    public final String A06(String str) {
        Bundle bundle = this.A00;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public C132436Tp(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.A00 = new Bundle(bundle);
    }

    public static final JSONArray A01(C132436Tp r3, String str) {
        String A06 = r3.A06(str);
        if (TextUtils.isEmpty(A06)) {
            return null;
        }
        try {
            return new JSONArray(A06);
        } catch (JSONException unused) {
            String A002 = A00(str);
            StringBuilder A0i = C90464aC.A0i(A06, C90474aD.A05(A002) + 50);
            A0i.append("Malformed JSON for key ");
            C90494aF.A1M(A0i, A002);
            A0i.append(A06);
            Log.w("NotificationParams", AnonymousClass000.A0q(", falling back to default", A0i));
            return null;
        }
    }

    public final Integer A04(String str) {
        String A06 = A06(str);
        if (TextUtils.isEmpty(A06)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A06));
        } catch (NumberFormatException unused) {
            String A002 = A00(str);
            StringBuilder A0i = C90464aC.A0i(A06, C90474aD.A05(A002) + 38);
            A0i.append("Couldn't parse value of ");
            A0i.append(A002);
            A0i.append("(");
            A0i.append(A06);
            Log.w("NotificationParams", AnonymousClass000.A0q(") into an int", A0i));
            return null;
        }
    }

    public final String A05(Resources resources, String str, String str2) {
        String str3;
        String[] strArr;
        String str4;
        String A06 = A06(str2);
        if (!TextUtils.isEmpty(A06)) {
            return A06;
        }
        String valueOf = String.valueOf(str2);
        int length = "_loc_key".length();
        if (length != 0) {
            str3 = valueOf.concat("_loc_key");
        } else {
            str3 = new String(valueOf);
        }
        String A062 = A06(str3);
        if (!TextUtils.isEmpty(A062)) {
            int identifier = resources.getIdentifier(A062, "string", str);
            String valueOf2 = String.valueOf(str2);
            if (identifier == 0) {
                if (length != 0) {
                    str4 = valueOf2.concat("_loc_key");
                } else {
                    str4 = new String(valueOf2);
                }
                String A002 = A00(str4);
                StringBuilder A0i = C90464aC.A0i(str2, C90474aD.A05(A002) + 49);
                A0i.append(A002);
                AnonymousClass000.A1D(" resource not found: ", str2, " Default value will be used.", A0i);
                AnonymousClass000.A1A(A0i, "NotificationParams");
            } else {
                JSONArray A01 = A01(this, C90484aE.A0n("_loc_args", valueOf2));
                if (A01 == null) {
                    strArr = null;
                } else {
                    int length2 = A01.length();
                    strArr = new String[length2];
                    for (int i = 0; i < length2; i++) {
                        strArr[i] = A01.optString(i);
                    }
                }
                if (strArr == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, strArr);
                } catch (MissingFormatArgumentException e) {
                    String A003 = A00(str2);
                    String arrays = Arrays.toString(strArr);
                    StringBuilder A0i2 = C90464aC.A0i(arrays, C90474aD.A05(A003) + 58);
                    A0i2.append("Missing format argument for ");
                    A0i2.append(A003);
                    AnonymousClass000.A1D(": ", arrays, " Default value will be used.", A0i2);
                    Log.w("NotificationParams", A0i2.toString(), e);
                    return null;
                }
            }
        }
        return null;
    }

    public final boolean A07(String str) {
        String A06 = A06(str);
        if ("1".equals(A06) || Boolean.parseBoolean(A06)) {
            return true;
        }
        return false;
    }
}
