package com.google.android.gms.auth;

import X.AnonymousClass0OD;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class UserRecoverableAuthException extends AnonymousClass0OD {
    public final Intent zza;

    public UserRecoverableAuthException(Intent intent, String str) {
        super(str);
        this.zza = intent;
    }
}
