package X;

import android.util.Log;

/* renamed from: X.6k6  reason: invalid class name and case insensitive filesystem */
public class C139566k6 implements C161037m1 {
    public static final C139566k6 A01 = new C139566k6();
    public int A00;

    public void BrD(int i) {
        this.A00 = 5;
    }

    public boolean BMH(int i) {
        return C90504aG.A1U(this.A00, i);
    }

    public void BxF(String str, String str2, Throwable th) {
        Log.v("CrashingExecutorPolicy", "Runnable is canceled", th);
    }

    public int BEI() {
        return this.A00;
    }

    public void B52(String str, String str2) {
        Log.d(str, str2);
    }

    public void B6I(String str, String str2) {
        Log.e(str, str2);
    }

    public void BKF(String str, String str2) {
        Log.i(str, str2);
    }

    public void BxE(String str, String str2) {
        Log.v(str, str2);
    }

    public void BxN(String str, String str2) {
        Log.w(str, str2);
    }

    public void Bxh(String str, String str2) {
        Log.e(str, str2);
    }

    public void B53(String str, String str2, Throwable th) {
        Log.d(str, str2, th);
    }

    public void B6J(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public void BxO(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public void Bxi(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
