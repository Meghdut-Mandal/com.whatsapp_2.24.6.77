package com.google.android.play.core.integrity;

import android.content.Context;

public abstract class ax {
    public static aw a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            awVar = a;
            if (awVar == null) {
                u uVar = new u((t) null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                awVar = uVar.b();
                a = awVar;
            }
        }
        return awVar;
    }
}
