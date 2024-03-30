package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.7vB  reason: invalid class name and case insensitive filesystem */
public class C166147vB extends ResultReceiver {
    public CLResultReceiver A00;

    public C166147vB(CLResultReceiver cLResultReceiver) {
        super(new Handler());
        this.A00 = cLResultReceiver;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 2) {
            try {
                this.A00.Bw9(bundle);
            } catch (RemoteException e) {
                e.getLocalizedMessage();
            }
        } else if (i == 3) {
            this.A00.B7Z(bundle);
        } else if (i == 4) {
            this.A00.Bw8(bundle);
        } else {
            this.A00.Bpm(bundle);
        }
    }
}
