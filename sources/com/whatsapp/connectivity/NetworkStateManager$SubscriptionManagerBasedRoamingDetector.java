package com.whatsapp.connectivity;

import X.AnonymousClass00C;
import X.C21060yb;
import X.C36371kC;
import X.C36441kJ;
import android.telephony.SubscriptionManager;
import android.util.Pair;

public final class NetworkStateManager$SubscriptionManagerBasedRoamingDetector {
    public static final NetworkStateManager$SubscriptionManagerBasedRoamingDetector INSTANCE = new NetworkStateManager$SubscriptionManagerBasedRoamingDetector();

    public final Pair determineNetworkStateUsingSubscriptionManager(C21060yb r5, boolean z) {
        boolean z2;
        int i;
        int defaultDataSubscriptionId;
        AnonymousClass00C.A0D(r5, 0);
        SubscriptionManager A0J = r5.A0J();
        if (A0J == null || (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) == -1) {
            z2 = false;
            i = 0;
        } else {
            boolean isNetworkRoaming = A0J.isNetworkRoaming(defaultDataSubscriptionId);
            z2 = C36371kC.A0m();
            int i2 = 2;
            if (isNetworkRoaming) {
                i2 = 3;
            }
            i = Integer.valueOf(i2);
        }
        return C36441kJ.A0Q(z2, i);
    }
}
