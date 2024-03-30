package X;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: X.0Im  reason: invalid class name and case insensitive filesystem */
public class C03930Im extends UserRecoverableAuthException {
    public final int zza;

    public C03930Im(Intent intent, String str, int i) {
        super(intent, str);
        this.zza = i;
    }
}
