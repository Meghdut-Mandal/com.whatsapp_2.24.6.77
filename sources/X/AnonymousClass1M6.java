package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.whatsapp.connectivity.NetworkStateManager$SubscriptionManagerBasedRoamingDetector;
import com.whatsapp.util.Log;

/* renamed from: X.1M6  reason: invalid class name */
public final class AnonymousClass1M6 {
    public final C19700wN A00;
    public final C21060yb A01;
    public final C005502l A02;

    public AnonymousClass1M6(C19700wN r2, C21060yb r3, C005502l r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final int A00(boolean z) {
        String simCountryIso;
        String simOperator;
        String networkOperator;
        ConditionVariable conditionVariable = C18740tg.A00;
        C21060yb r4 = this.A01;
        TelephonyManager A0K = r4.A0K();
        ConnectivityManager A0E = r4.A0E();
        int i = 0;
        if (!(A0E == null || A0K == null)) {
            try {
                NetworkInfo activeNetworkInfo = A0E.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return 1;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Pair determineNetworkStateUsingSubscriptionManager = NetworkStateManager$SubscriptionManagerBasedRoamingDetector.INSTANCE.determineNetworkStateUsingSubscriptionManager(r4, z);
                        Object obj = determineNetworkStateUsingSubscriptionManager.first;
                        AnonymousClass00C.A07(obj);
                        if (((Boolean) obj).booleanValue()) {
                            Object obj2 = determineNetworkStateUsingSubscriptionManager.second;
                            AnonymousClass00C.A07(obj2);
                            return ((Number) obj2).intValue();
                        }
                    }
                    i = 3;
                    if (!(activeNetworkInfo.isRoaming() || A0K.isNetworkRoaming() || (simCountryIso = A0K.getSimCountryIso()) == null || simCountryIso.length() == 0 || (simOperator = A0K.getSimOperator()) == null || simOperator.length() == 0)) {
                        if (A0K.getPhoneType() != 2) {
                            String networkCountryIso = A0K.getNetworkCountryIso();
                            if (!(networkCountryIso == null || networkCountryIso.length() == 0 || !simCountryIso.equals(networkCountryIso) || (networkOperator = A0K.getNetworkOperator()) == null || networkOperator.length() == 0)) {
                                if (networkOperator.equals(simOperator) || C56532wR.A00.contains(new AnonymousClass00I(networkOperator, simOperator))) {
                                    return 2;
                                }
                                return 3;
                            }
                        }
                        return 2;
                    }
                }
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadObjectException)) {
                    if (Build.VERSION.SDK_INT >= 24 && (e.getCause() instanceof DeadSystemException)) {
                        return 0;
                    }
                    throw e;
                }
            }
        }
        return i;
    }

    public final NetworkInfo A01() {
        ConditionVariable conditionVariable = C18740tg.A00;
        C21060yb r1 = this.A01;
        C21060yb.A0P = true;
        ConnectivityManager A0E = r1.A0E();
        C21060yb.A0P = false;
        if (A0E != null) {
            return A0E.getActiveNetworkInfo();
        }
        Log.w("NetworkStateManager/getActiveNetworkInfo cm=null");
        return null;
    }

    public final boolean A02() {
        ConditionVariable conditionVariable = C18740tg.A00;
        ConnectivityManager A0E = this.A01.A0E();
        if (A0E != null) {
            try {
                NetworkInfo activeNetworkInfo = A0E.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (RuntimeException e) {
                if (e.getCause() instanceof DeadObjectException) {
                    this.A00.A0E("networkstatemanager/deadOS", (String) null, false);
                    return false;
                }
                throw e;
            }
        }
        return false;
    }

    public final boolean A03() {
        ConditionVariable conditionVariable = C18740tg.A00;
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager A0E = this.A01.A0E();
            if (A0E == null) {
                Log.w("NetworkStateManager/isDataSaverOn cm=null");
            } else if (A0E.isActiveNetworkMetered()) {
                A0E.getRestrictBackgroundStatus();
                if (A0E.getRestrictBackgroundStatus() == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
