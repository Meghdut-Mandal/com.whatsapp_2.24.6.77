package X;

import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.3L7  reason: invalid class name */
public abstract class AnonymousClass3L7 {
    public long A00 = -1;
    public WeakReference A01;
    public final C20050ww A02;
    public final C19970wo A03;
    public final C18820ts A04;
    public final C21010yW A05;
    public final AnonymousClass1GZ A06;
    public final AnonymousClass6O2 A07;
    public final C19770wU A08;
    public final C221112x A09;
    public final C20020wt A0A;
    public final Random A0B = new Random();

    public abstract int A04();

    public abstract AnonymousClass67Z A05();

    public abstract AnonymousClass67Z A06(CharSequence charSequence, boolean z);

    public abstract String A07();

    public final HttpsURLConnection A03(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        AnonymousClass00C.A0E(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        AnonymousClass00C.A0E(httpsURLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        httpsURLConnection.setRequestProperty("User-Agent", this.A0A.A02());
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.connect();
        return httpsURLConnection;
    }

    public AnonymousClass3L7(C20050ww r3, C19970wo r4, C18820ts r5, C221112x r6, C21010yW r7, AnonymousClass1GZ r8, AnonymousClass6O2 r9, C20020wt r10, C19770wU r11) {
        this.A03 = r4;
        this.A09 = r6;
        this.A06 = r8;
        this.A0A = r10;
        this.A08 = r11;
        this.A02 = r3;
        this.A05 = r7;
        this.A04 = r5;
        this.A07 = r9;
    }

    public final AnonymousClass67Z A02() {
        AnonymousClass67Z r3;
        C18740tg.A01();
        WeakReference weakReference = this.A01;
        if (weakReference != null && (r3 = (AnonymousClass67Z) weakReference.get()) != null && C19970wo.A00(this.A03) - this.A00 < TimeUnit.HOURS.toMillis(4) && !r3.A01) {
            return r3;
        }
        AnonymousClass67Z A052 = A05();
        this.A01 = AnonymousClass001.A0F(A052);
        this.A00 = C19970wo.A00(this.A03);
        return A052;
    }
}
