package X;

import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.6v1  reason: invalid class name and case insensitive filesystem */
public class C146096v1 implements C162167o8 {
    public final Boolean A00;
    public final HttpURLConnection A01;

    public AnonymousClass5RE B8D(C20050ww r3, Integer num, Integer num2) {
        HttpURLConnection httpURLConnection = this.A01;
        if (httpURLConnection instanceof HttpsURLConnection) {
            return C132776Vf.A00(r3, num, num2, (HttpsURLConnection) httpURLConnection);
        }
        return new AnonymousClass5RE(r3, httpURLConnection.getInputStream(), num, num2);
    }

    public void close() {
        this.A01.disconnect();
    }

    public C146096v1(Boolean bool, HttpURLConnection httpURLConnection) {
        this.A01 = httpURLConnection;
        this.A00 = bool;
    }
}
