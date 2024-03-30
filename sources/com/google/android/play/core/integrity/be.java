package com.google.android.play.core.integrity;

import X.AX1;
import X.C196649aH;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class be extends AX1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bn b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.b = bnVar;
        this.a = context;
    }

    public final void b() {
        int i;
        Context context = this.a;
        TaskCompletionSource taskCompletionSource = this.b.d;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && C196649aH.A00(packageInfo.signatures)) {
                i = packageInfo.versionCode;
                taskCompletionSource.trySetResult(Integer.valueOf(i));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        i = 0;
        taskCompletionSource.trySetResult(Integer.valueOf(i));
    }
}
