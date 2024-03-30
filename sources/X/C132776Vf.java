package X;

import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.6Vf  reason: invalid class name and case insensitive filesystem */
public abstract class C132776Vf {
    public static AnonymousClass5RE A00(C20050ww r2, Integer num, Integer num2, HttpsURLConnection httpsURLConnection) {
        return new AnonymousClass5RE(r2, httpsURLConnection.getInputStream(), num, num2);
    }

    public static AnonymousClass5RL A01(C20050ww r2, Integer num, Integer num2, HttpsURLConnection httpsURLConnection) {
        return new AnonymousClass5RL(r2, httpsURLConnection.getOutputStream(), num, num2);
    }
}
