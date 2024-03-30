package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import com.whatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.9m7  reason: invalid class name and case insensitive filesystem */
public class C202529m7 {
    public final C22846Awv A00;
    public final C07610Yn A01;
    public final BiometricManager A02;

    private int A00() {
        int i;
        boolean A012 = C196269Ym.A01(((C207669va) this.A00).A00);
        C07610Yn r1 = this.A01;
        if (r1 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            i = 1;
        } else if (!r1.A06()) {
            i = 12;
        } else {
            boolean A05 = r1.A05();
            i = 0;
            if (!A05) {
                i = 11;
            }
        }
        if (!A012) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        return -1;
    }

    private int A01() {
        BiometricPrompt.CryptoObject A002;
        Method A022 = C200289h3.A02();
        if (!(A022 == null || (A002 = C129206Fv.A00(C129206Fv.A01())) == null)) {
            try {
                Object invoke = A022.invoke(this.A02, AnonymousClass000.A1b(A002));
                if (invoke instanceof Integer) {
                    return ((Number) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int A023 = A02();
        Context context = ((C207669va) this.A00).A00;
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String equals : context.getResources().getStringArray(R.array.f3nameremoved)) {
                if (str.equals(equals)) {
                    return A023;
                }
            }
        }
        if (A023 == 0) {
            return A00();
        }
        return A023;
    }

    private int A02() {
        BiometricManager biometricManager = this.A02;
        if (biometricManager != null) {
            return C200289h3.A00(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public int A03(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.A02;
            if (biometricManager != null) {
                return AnonymousClass93G.A00(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (!C52962qT.A00(i)) {
            return -2;
        } else {
            Context context = ((C207669va) this.A00).A00;
            if (C196269Ym.A00(context) == null) {
                return 12;
            }
            if ((32768 & i) != 0) {
                if (C196269Ym.A01(context)) {
                    return 0;
                }
                return 11;
            } else if (i2 == 29) {
                if ((i & 255) == 255) {
                    return A02();
                }
                return A01();
            } else if (i2 != 28) {
                C07610Yn r1 = this.A01;
                if (r1 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                    return 1;
                } else if (!r1.A06()) {
                    return 12;
                } else {
                    if (!r1.A05()) {
                        return 11;
                    }
                    return 0;
                }
            } else if (AnonymousClass93J.A00(context)) {
                return A00();
            } else {
                return 12;
            }
        }
    }

    public C202529m7(C22846Awv awv) {
        BiometricManager biometricManager;
        this.A00 = awv;
        C07610Yn r2 = null;
        if (Build.VERSION.SDK_INT >= 29) {
            biometricManager = awv.B8l();
        } else {
            biometricManager = null;
        }
        this.A02 = biometricManager;
        this.A01 = Build.VERSION.SDK_INT <= 29 ? new C07610Yn(((C207669va) awv).A00) : r2;
    }
}
