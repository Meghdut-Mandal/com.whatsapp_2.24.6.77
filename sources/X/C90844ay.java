package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.4ay  reason: invalid class name and case insensitive filesystem */
public final class C90844ay extends BroadcastReceiver {
    public C35331iW A00;

    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        C35331iW r0 = this.A00;
        if (r0 != null && (connectivityManager = (ConnectivityManager) r0.A00().getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (FirebaseInstanceId.A05()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.A04(this.A00, 0);
            this.A00.A00().unregisterReceiver(this);
            this.A00 = null;
        }
    }

    public C90844ay(C35331iW r1) {
        this.A00 = r1;
    }
}
