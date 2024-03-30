package com.google.android.play.core.integrity;

import X.AnonymousClass001;
import android.content.Context;
import java.util.Objects;

public final class q implements x {
    public Context a;

    public /* synthetic */ q(p pVar) {
    }

    public final s b() {
        Context context = this.a;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new s(context, (r) null);
        }
        throw AnonymousClass001.A09(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public q() {
    }

    public final q a(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }
}
