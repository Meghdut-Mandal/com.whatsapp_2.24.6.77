package X;

import android.os.Handler;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6xh  reason: invalid class name and case insensitive filesystem */
public class C147736xh implements C236119d {
    public long A00 = 0;
    public final AnonymousClass19A A01;
    public final C19970wo A02;
    public final AnonymousClass1BS A03;

    public void BVN(String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Log.w("routeselector/on delivery failure");
        C36321k7.A1U("routeselector/onmediaroutingrequesterror/code ", AnonymousClass000.A0u(), 0);
    }

    public void BWw(C203399nx r11, String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Set set = AnonymousClass6IX.A00;
        Iterator it = r11.A0j("error").iterator();
        while (it.hasNext()) {
            C203399nx A0s = C36431kI.A0s(it);
            if (A0s != null) {
                try {
                    int A0S = A0s.A0S("code", 0);
                    if (A0S != 0) {
                        Pair A0I = C36341k9.A0I(Integer.valueOf(A0S), A0s.A0S("backoff", 0));
                        AnonymousClass1BS r4 = this.A03;
                        int A04 = C36381kD.A04(A0I);
                        int A032 = C36381kD.A03(A0I);
                        C36321k7.A1U("routeselector/onmediaroutingrequesterror/code ", AnonymousClass000.A0u(), A04);
                        if (503 == A04) {
                            C24091Bb r2 = r4.A0A;
                            synchronized (r2) {
                                r2.A00 = 0;
                                Log.i("ChatdMediaThrottleManager/resetThrottle");
                            }
                            Handler handler = r4.A04;
                            C24101Bc r42 = r4.A0E;
                            long A012 = r42.A00.A01();
                            long j = 0;
                            if (A012 != 0) {
                                long j2 = A012 * 1000;
                                j = ((3 * j2) / 4) + Math.abs(r42.A01.nextLong() % (j2 / 2));
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("fibonaccibackoffhandler/sleep/");
                                A0u.append(j);
                                C36321k7.A1a(A0u, " milliseconds");
                            }
                            handler.sendEmptyMessageDelayed(0, j);
                            return;
                        } else if (507 == A04 && A032 > 0) {
                            C24091Bb r6 = r4.A0A;
                            long j3 = (long) A032;
                            synchronized (r6) {
                                long A002 = C19970wo.A00(r6.A01) + (Math.min(j3, 10800) * 1000);
                                r6.A00 = A002;
                                C36321k7.A1V("ChatdMediaThrottleManager/setThrottle until ", AnonymousClass000.A0u(), A002);
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (C235919b e) {
                    Log.e("MediaConnFactory/getErrorCodeAndBackoffFromIqResponse CorruptStreamException ", e);
                }
            }
        }
    }

    public void BiM(C203399nx r43, String str) {
        long j;
        synchronized (this) {
            j = this.A00;
            this.A00 = 0;
        }
        AnonymousClass1BS r2 = this.A03;
        Set set = AnonymousClass6IX.A00;
        C203399nx A0d = r43.A0d("media_conn");
        String A0x = C36391kE.A0x(A0d, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A0h = A0d.A0h("auth");
        long A0U = A0d.A0U("ttl");
        long A0U2 = A0d.A0U("auth_ttl");
        long A0V = A0d.A0V("max_buckets", 0);
        int A0S = A0d.A0S("is_new", 1);
        int A0S2 = A0d.A0S("max_auto_download_retry", 3);
        int A0S3 = A0d.A0S("max_manual_retry", 3);
        C203399nx[] r4 = A0d.A02;
        ArrayList A0I = AnonymousClass001.A0I();
        if (r4 != null) {
            for (C203399nx r0 : r4) {
                if ("host".equals(r0.A00)) {
                    String A0h2 = r0.A0h("hostname");
                    String A0i = r0.A0i("ip4", (String) null);
                    String A0i2 = r0.A0i("ip6", (String) null);
                    String A0i3 = r0.A0i("class", (String) null);
                    String A0i4 = r0.A0i("fallback_hostname", (String) null);
                    String A0i5 = r0.A0i("fallback_ip4", (String) null);
                    String A0i6 = r0.A0i("fallback_ip6", (String) null);
                    String A0i7 = r0.A0i("fallback_class", (String) null);
                    C203399nx A0c = r0.A0c("upload");
                    Set set2 = AnonymousClass6IX.A00;
                    A0I.add(new AnonymousClass65F(A0h2, A0i, A0i2, A0i3, A0i4, A0i5, A0i6, A0i7, r0.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null), AnonymousClass6IX.A00(A0c, set2), AnonymousClass6IX.A00(r0.A0c("download"), set2), AnonymousClass6IX.A00(r0.A0c("download_buckets"), (Set) null), "true".equals(r0.A0i("force_ip", (String) null))));
                }
            }
        }
        C124815yq r27 = new C124815yq(A0h, A0x, A0I, A0S2, A0S3, A0U, A0U2, A0V, j, AnonymousClass000.A1S(A0S, 1));
        C24091Bb r5 = r2.A0A;
        synchronized (r5) {
            r5.A00 = 0;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        AnonymousClass1BS.A08(r2, r27);
        if (r2.A08.A0E(149)) {
            C36341k9.A0x(C36381kD.A0G(r2.A0C, "route_selector_prefs"), "media_conn", AnonymousClass6HI.A00(r2.A07, r2.A0B()));
        }
    }

    public C147736xh(C19970wo r3, AnonymousClass19A r4, AnonymousClass1BS r5) {
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r5;
    }
}
