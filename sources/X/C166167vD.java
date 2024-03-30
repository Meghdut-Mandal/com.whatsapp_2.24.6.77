package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7vD  reason: invalid class name and case insensitive filesystem */
public final class C166167vD extends ResultReceiver {
    public final /* synthetic */ C22971AzN A00;
    public final /* synthetic */ AFG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166167vD(Handler handler, C22971AzN azN, AFG afg) {
        super(handler);
        this.A00 = azN;
        this.A01 = afg;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 2) {
            try {
                JSONObject A1B = C36441kJ.A1B();
                JSONObject A1B2 = C36441kJ.A1B();
                try {
                    this.A00.BeH(i, bundle);
                    A1B.put("status", "0");
                    A1B2.put("data", A1B);
                } catch (JSONException unused) {
                    Log.e("onReceiveResult JSONException");
                }
                C197959cf r3 = this.A01.A02.A00;
                if (r3 != null) {
                    String obj = A1B2.toString();
                    android.util.Log.d(C197959cf.class.getName(), "Common Library Callback Called");
                    try {
                        r3.A01.B71(obj);
                    } catch (RemoteException unused2) {
                        android.util.Log.e("CLServices", "Remote Exception in Common Library Callback");
                    }
                }
            } catch (Exception unused3) {
                Log.e("onReceiveResult java.lang.Exception");
            }
        } else {
            this.A00.BeH(i, bundle);
        }
    }
}
