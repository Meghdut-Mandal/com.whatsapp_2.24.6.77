package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.1kh  reason: invalid class name and case insensitive filesystem */
public final class C36651kh extends BroadcastReceiver {
    public C19770wU A00;
    public final Object A01 = C36441kJ.A11();
    public volatile boolean A02 = false;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C18830tt.APr(C56042vd.A00(context), this);
                    this.A02 = true;
                }
            }
        }
        int resultCode = getResultCode();
        Bundle resultExtras = getResultExtras(true);
        Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive");
        if (context != null && resultCode == -1) {
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (AnonymousClass00C.A0J(str, "com.facebook.GET_FOA_BACKUP_TOKEN") && resultExtras != null) {
                Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive/success");
                String string = resultExtras.getString("foa_backup_token");
                if (string != null) {
                    Log.i("FoaBackupTokenRequesterResponseReceiver/onReceive/success token present");
                    C19770wU r1 = this.A00;
                    if (r1 != null) {
                        C36421kH.A1H(r1, context, string, 21);
                        return;
                    }
                    throw C36321k7.A08();
                }
            }
        }
    }
}
