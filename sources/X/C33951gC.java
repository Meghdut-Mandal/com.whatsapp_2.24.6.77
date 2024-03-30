package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;

/* renamed from: X.1gC  reason: invalid class name and case insensitive filesystem */
public final class C33951gC {
    public final void A01(Context context, C24801Dv r8, Integer num, int i, int i2) {
        String str;
        String str2;
        String str3;
        AnonymousClass00C.A0D(r8, 1);
        Uri.Builder buildUpon = Uri.parse("https://one.google.com/storage/whatsapp?utm_source=whatsapp&utm_medium=android").buildUpon();
        if (i2 != 1) {
            str = "whatsapp_home";
        } else if (i != 1) {
            str = "whatsapp_settings";
        } else {
            str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (i == 1) {
            str2 = "_oos_banner";
        } else if (i == 2) {
            str2 = "_ninety_percent_banner";
        } else if (i == 3) {
            str2 = "_eighty_percent_banner";
        } else if (i != 4) {
            str2 = "_manage_storage";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('_');
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 1) {
                    str3 = "one";
                } else if (intValue == 2) {
                    str3 = "two";
                } else if (intValue == 3) {
                    str3 = "three";
                } else if (intValue == 4) {
                    str3 = "four";
                } else if (intValue == 5) {
                    str3 = "five";
                } else if (intValue == 6) {
                    str3 = "six";
                } else if (intValue == 7) {
                    str3 = "seven";
                } else if (intValue == 8) {
                    str3 = "eight";
                } else if (intValue == 9) {
                    str3 = "nine";
                } else if (intValue == 10) {
                    str3 = "ten";
                } else if (intValue == 11) {
                    str3 = "eleven";
                } else if (intValue == 12) {
                    str3 = "twelve";
                } else if (intValue == 13) {
                    str3 = "thirteen";
                } else if (intValue == 14) {
                    str3 = "fourteen";
                }
                sb2.append(str3);
                sb2.append("_gb_banner");
                str2 = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid number: ");
            sb3.append(num);
            throw new IllegalArgumentException(sb3.toString());
        }
        sb.append(str2);
        buildUpon.appendQueryParameter("utm_campaign", sb.toString());
        Uri build = buildUpon.build();
        AnonymousClass00C.A08(build);
        Intent data = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER").setData(build);
        AnonymousClass00C.A08(data);
        try {
            context.startActivity(data);
        } catch (ActivityNotFoundException unused) {
            A00(context, build, r8);
        } catch (SecurityException unused2) {
            Log.e("BackupStorageBanner/openGoogleManageStorageOnWeb/SecurityException");
            A00(context, build, r8);
        }
    }

    private final void A00(Context context, Uri uri, C24801Dv r9) {
        String str;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null));
        AnonymousClass00C.A08(data);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        intent.setSelector(data);
        try {
            context.startActivity(intent);
            return;
        } catch (ActivityNotFoundException unused) {
            str = "BackupStorageBanner/handleException/ActivityNotFoundException";
        } catch (SecurityException unused2) {
            str = "BackupStorageBanner/handleException/SecurityException";
        }
        Log.e(str);
        r9.A06(context, new Intent("android.intent.action.VIEW", uri));
    }
}
