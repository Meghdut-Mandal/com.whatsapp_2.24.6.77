package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: X.1Ds  reason: invalid class name and case insensitive filesystem */
public final class C24771Ds {
    public final C19730wQ A00;
    public final C24761Dr A01;
    public final C24681Dj A02;
    public final C19770wU A03;

    public C24771Ds(C19730wQ r2, C24761Dr r3, C24681Dj r4, C19770wU r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static final void A00(Context context, AnonymousClass3NX r5, C160877lj r6, Integer num, String str) {
        int i;
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass6M9.A00 = null;
        if (r6 != null) {
            AnonymousClass6M9.A00 = new WeakReference(r6);
            Boolean bool = C18750th.A03;
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity");
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        intent.putExtra("disclosure_id", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("surface", str);
        }
        Integer num2 = r5.A00;
        if (num2 != null) {
            intent.putExtra("trigger", num2.intValue());
        }
        intent.addFlags(65536);
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    public static final boolean A01(Uri uri) {
        if (uri.getPathSegments().size() != 2) {
            return false;
        }
        String str = uri.getPathSegments().get(0);
        AnonymousClass00C.A08(str);
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        AnonymousClass00C.A08(lowerCase);
        if (!"privacy".equals(lowerCase)) {
            return false;
        }
        String str2 = uri.getPathSegments().get(1);
        AnonymousClass00C.A08(str2);
        String lowerCase2 = str2.toLowerCase(locale);
        AnonymousClass00C.A08(lowerCase2);
        if ("disclosure".equals(lowerCase2)) {
            return true;
        }
        return false;
    }
}
