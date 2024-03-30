package com.google.android.play.core.integrity;

import X.AnonymousClass001;
import android.content.Context;
import java.util.Objects;

public final class u implements av {
    public Context a;

    public /* synthetic */ u(t tVar) {
    }

    public final aw b() {
        Context context = this.a;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new w(context, (v) null);
        }
        throw AnonymousClass001.A09(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public u() {
    }

    public final u a(Context context) {
        Objects.requireNonNull(context);
        this.a = context;
        return this;
    }
}
