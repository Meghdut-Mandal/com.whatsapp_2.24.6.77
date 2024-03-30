package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class ar extends ResultReceiver {
    public final /* synthetic */ as a;

    public final void onReceiveResult(int i, Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        int i2;
        if (i == 1) {
            taskCompletionSource = this.a.a;
            i2 = 3;
        } else if (i == 2) {
            taskCompletionSource = this.a.a;
            i2 = 2;
        } else if (i == 3) {
            taskCompletionSource = this.a.a;
            i2 = 1;
        } else {
            return;
        }
        taskCompletionSource.trySetResult(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.a = asVar;
    }
}
