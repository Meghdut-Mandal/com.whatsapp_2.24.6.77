package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

public final class bj extends y {
    public final /* synthetic */ bk a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j) {
        super(str, j);
        this.a = bkVar;
    }

    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.a.e);
        return this.a.c.c(activity, bundle);
    }
}
