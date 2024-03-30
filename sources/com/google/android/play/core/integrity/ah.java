package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

public final class ah extends y {
    public final /* synthetic */ ai a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, String str, long j) {
        super(str, j);
        this.a = aiVar;
    }

    public final Task b(Activity activity, Bundle bundle) {
        return this.a.a.b(activity, bundle);
    }
}
