package X;

import android.util.Log;

/* renamed from: X.6k7  reason: invalid class name and case insensitive filesystem */
public class C139576k7 implements C161037m1 {
    public static final C139576k7 A00 = new C139576k7();

    public void B52(String str, String str2) {
        A00(3, str, str2);
    }

    public void B53(String str, String str2, Throwable th) {
        A01(str, str2, th, 3);
    }

    public void B6I(String str, String str2) {
        A00(6, str, str2);
    }

    public void B6J(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    public void BKF(String str, String str2) {
        A00(4, str, str2);
    }

    public boolean BMH(int i) {
        return C90504aG.A1U(5, i);
    }

    public void BxE(String str, String str2) {
        A00(2, str, str2);
    }

    public void BxN(String str, String str2) {
        A00(5, str, str2);
    }

    public void BxO(String str, String str2, Throwable th) {
        A01(str, str2, th, 5);
    }

    public void Bxh(String str, String str2) {
        A00(6, str, str2);
    }

    public void Bxi(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    private void A00(int i, String str, String str2) {
        Log.println(i, AnonymousClass000.A0p(":", str, AnonymousClass000.A0v("unknown")), str2);
    }

    private void A01(String str, String str2, Throwable th, int i) {
        String stackTraceString;
        String A0p = AnonymousClass000.A0p(":", str, AnonymousClass000.A0v("unknown"));
        StringBuilder A0v = AnonymousClass000.A0v(str2);
        A0v.append(10);
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        Log.println(i, A0p, AnonymousClass000.A0q(stackTraceString, A0v));
    }

    public void BxF(String str, String str2, Throwable th) {
        A01("CrashingExecutorPolicy", "Runnable is canceled", th, 2);
    }

    public int BEI() {
        return 5;
    }

    public void BrD(int i) {
    }
}
