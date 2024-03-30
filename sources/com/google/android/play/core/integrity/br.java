package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class br extends StandardIntegrityManager.StandardIntegrityToken {
    public final String a;
    public final y b;

    public br(String str, y yVar) {
        this.a = str;
        this.b = yVar;
    }

    public final String token() {
        return this.a;
    }

    public final Task showDialog(Activity activity, int i) {
        return this.b.a(activity, i);
    }
}
