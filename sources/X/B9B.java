package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

public class B9B implements OnFailureListener {
    public Object A00;
    public final int A01;

    public B9B(C30331a2 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void onFailure(Exception exc) {
        int i;
        int i2;
        if (this.A01 != 0) {
            C30331a2 r3 = (C30331a2) this.A00;
            Log.e("requestHarmfulApps/onError", exc);
            String message = exc.getMessage();
            if (exc instanceof ApiException) {
                i2 = ((ApiException) exc).mStatus.A01;
            } else {
                i2 = 500;
            }
            r3.A01.A00(message, i2);
            return;
        }
        C30331a2 r1 = (C30331a2) this.A00;
        String message2 = exc.getMessage();
        if (exc instanceof ApiException) {
            i = ((ApiException) exc).mStatus.A01;
        } else {
            i = 500;
        }
        r1.A01.A01((String) null, i, message2);
        Log.e("requestAttestation/onError", exc);
    }
}
