package com.google.android.play.core.integrity;

import X.C201499ji;
import X.C22895Axz;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class at {
    public final C22895Axz a;
    public final C22895Axz b;

    public at(C22895Axz axz, C22895Axz axz2) {
        this.a = axz;
        this.b = axz2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C201499ji r9) {
        Object a2 = this.a.a();
        a2.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        r9.getClass();
        return new as((Context) a2, kVar, activity, taskCompletionSource, r9);
    }
}
