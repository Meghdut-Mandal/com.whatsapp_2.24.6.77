package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass098;
import X.C36321k7;
import X.C90494aF;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zzfb {
    public static final zzfb zza = new zzfb();
    public static final List zzb = zze(C90494aF.A0j(new String[]{"www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"}));

    public static final boolean zzc(String str) {
        List list = zzb;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass098.A07(str, AnonymousClass001.A0C(it), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean zza(Uri uri) {
        if (!zzd(uri) || !zzc(uri.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean zzb(Uri uri) {
        return zzd(uri);
    }

    public static final boolean zzd(Uri uri) {
        if (TextUtils.isEmpty(uri.toString()) || !"https".equals(uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            return false;
        }
        return true;
    }

    public static final List zze(List list) {
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("https://");
            A0u.append(A0C);
            A0J.add(AnonymousClass000.A0q("/", A0u));
        }
        return A0J;
    }
}
