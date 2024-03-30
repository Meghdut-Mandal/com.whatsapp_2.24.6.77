package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.businessdirectory.util.BaseGPSLocationManager;
import com.whatsapp.util.Log;

/* renamed from: X.7rY  reason: invalid class name and case insensitive filesystem */
public class C164277rY implements OnFailureListener {
    public Object A00;
    public final int A01;

    public C164277rY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.A01) {
            case 0:
                BaseGPSLocationManager.A03((BaseGPSLocationManager) this.A00, "Unable to fetch last known location from FusedLocationProviderClient");
                return;
            case 1:
                BaseGPSLocationManager.A03((BaseGPSLocationManager) this.A00, C36331k8.A0i("Location services unavailable ", C36401kF.A0t(exc, 1), exc));
                return;
            case 2:
                Object obj = this.A00;
                Log.e("BackupTokenUtils/setBlockStoreBytes/exception determining E2EE", exc);
                if (obj != null) {
                    Log.e("BackupTokenProtocolHelper/encryptAndSaveToken/onFailure", exc);
                    return;
                }
                return;
            default:
                Log.e("SMSRetrieverReceiver/onReceive/failure registering sms retriever client/ ", exc);
                C19420v0 r1 = ((C90924bA) this.A00).A01;
                C65983Uf.A0Q(r1, "timeout-waiting-for-sms");
                C36341k9.A0v(C19420v0.A00(r1), "sms_retriever_retry_count", 0);
                return;
        }
    }
}
