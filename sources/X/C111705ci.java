package X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5ci  reason: invalid class name and case insensitive filesystem */
public abstract class C111705ci {
    public static String A00(Uri uri, C120255rD r4) {
        Set<String> set;
        if (TextUtils.isEmpty(uri.getQuery())) {
            return null;
        }
        try {
            set = uri.getQueryParameterNames();
        } catch (UnsupportedOperationException unused) {
            set = null;
        }
        if (set == null || set.isEmpty()) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        Collections.unmodifiableList(r4.A00);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (A0u.length() > 0) {
                A0u.append('&');
            }
            A0u.append(A0C);
            A0u.append("=--sanitized--");
        }
        return A0u.toString();
    }
}
