package org.whispersystems.jobqueue.requirements;

import X.AnonymousClass7i8;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient Context A00;

    public boolean BMk() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.A00.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public void Bqf(Context context) {
        this.A00 = context;
    }
}
