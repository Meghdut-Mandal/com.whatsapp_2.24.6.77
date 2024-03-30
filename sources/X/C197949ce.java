package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: X.9ce  reason: invalid class name and case insensitive filesystem */
public class C197949ce {
    public static final Object A04 = C36441kJ.A11();
    public C22771Avh A00;
    public final Context A01;
    public final String A02;
    public final Map A03;

    public C197949ce(Drawable.Callback callback, String str, Map map) {
        Context applicationContext;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = AnonymousClass000.A0t(AnonymousClass000.A0v(str), '/');
        }
        this.A02 = str;
        this.A03 = map;
        this.A00 = null;
        if (!(callback instanceof View)) {
            applicationContext = null;
        } else {
            applicationContext = ((View) callback).getContext().getApplicationContext();
        }
        this.A01 = applicationContext;
    }
}
