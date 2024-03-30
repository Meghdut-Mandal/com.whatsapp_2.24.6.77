package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7sg  reason: invalid class name and case insensitive filesystem */
public class C164977sg implements C25711Hj {
    public Object A00;
    public final int A01;

    public C164977sg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        int i;
        int i2;
        C19700wN r2;
        String str;
        switch (this.A01) {
            case 0:
                AnonymousClass00C.A0D(obj, 0);
                ((C023509x) this.A00).resumeWith(obj);
                return;
            case 1:
                C132326Tc.A00((C132326Tc) this.A00, true);
                return;
            case 2:
                Runnable runnable = (Runnable) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                AnonymousClass00C.A0D(obj, 0);
                ((C146506vi) this.A00).A0H.A04(obj);
                return;
            case 4:
                C101334xN r0 = (C101334xN) this.A00;
                C133136Wx r13 = (C133136Wx) obj;
                r0.A0J(r13);
                C101334xN.A04(r13, r0);
                return;
            case 5:
                C101334xN r4 = (C101334xN) this.A00;
                C110995bZ.A01(r4.A0f);
                C133136Wx r22 = new C133136Wx(13, (String) null, false);
                if (r4.A0U.A0E(7091)) {
                    C80293vA.A00(r4.A0u, r4, r22, 35);
                    return;
                }
                C101334xN.A05(r22, r4, (Runnable) null);
                r4.A0J(r22);
                return;
            case 6:
                C101334xN r42 = (C101334xN) this.A00;
                Throwable th = (Throwable) obj;
                if (th instanceof IOException) {
                    C133136Wx r5 = new C133136Wx(9, (String) null, false);
                    C20810yC r23 = r42.A0U;
                    if (r23.A0E(7091)) {
                        C80293vA.A00(r42.A0u, r42, r5, 38);
                    } else {
                        C101334xN.A05(r5, r42, (Runnable) null);
                        r42.A0J(r5);
                        C101334xN.A04(r5, r42);
                    }
                    if (r23.A0E(7959)) {
                        r2 = r42.A0A;
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("ioexception, watls=");
                        str = C36421kH.A0d(A0u, r42.A0X.A03(th));
                    } else {
                        return;
                    }
                } else if (th instanceof CancellationException) {
                    C101334xN.A04(new C133136Wx(13, (String) null, false), r42);
                    return;
                } else if (r42.A0U.A0E(7959)) {
                    r2 = r42.A0A;
                    str = "non-captured";
                } else {
                    return;
                }
                r2.A0D("MediaDownload", str, th);
                return;
            case 7:
                Pair pair = (Pair) obj;
                AnonymousClass00C.A0D(pair, 1);
                ((C160107kT) this.A00).BW7((C133136Wx) pair.first, (C129166Fp) pair.second);
                return;
            case 8:
                ((C160107kT) this.A00).BW6(AnonymousClass000.A1X(obj));
                return;
            case 9:
                ((C160107kT) this.A00).BW4(C36431kI.A09(obj));
                return;
            case 10:
                C1508376y r8 = (C1508376y) this.A00;
                long A09 = C36431kI.A09(obj);
                long j = r8.A01 + A09;
                r8.A01 = j;
                long j2 = r8.A02;
                if (j2 == 0) {
                    i2 = 100;
                } else {
                    i2 = (int) ((((float) j) * 100.0f) / ((float) j2));
                }
                if (i2 >= r8.A00 + 5 || i2 == 100) {
                    r8.A00 = i2;
                    r8.A08.BW5(j);
                }
                AnonymousClass6Fk r6 = r8.A06;
                if (r6 != null) {
                    r6.A0A(r8.A01 - r8.A03, A09);
                    return;
                }
                return;
            case 11:
                C101314xL.A03((C101314xL) this.A00, (Integer) obj);
                return;
            case 12:
                C101314xL r24 = (C101314xL) this.A00;
                Throwable th2 = (Throwable) obj;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("mediaupload/oncancelled, request=");
                A0u2.append(r24.A0V);
                Log.i(AnonymousClass000.A0l(r24, ", this=", A0u2), th2);
                if (th2 instanceof FileNotFoundException) {
                    i = 7;
                } else if (th2 instanceof IOException) {
                    i = 3;
                    if (r24.A0Q.A03(th2)) {
                        i = 18;
                    }
                } else if (th2 instanceof C108715Up) {
                    i = 21;
                } else if (th2 instanceof NoSuchAlgorithmException) {
                    i = 16;
                } else if (r24.A02.isCancelled()) {
                    i = 1;
                } else {
                    Log.e("MediaUpload/onError unknown", th2);
                    i = 31;
                }
                C101314xL.A03(r24, Integer.valueOf(i));
                return;
            case 13:
                C147016wX r25 = (C147016wX) this.A00;
                long longValue = r25.A02 + ((Number) obj).longValue();
                r25.A02 = longValue;
                r25.A00 = AnonymousClass6XZ.A00(r25.A0A, r25.A00, longValue, r25.A01);
                return;
            case 14:
                C147026wY r26 = (C147026wY) this.A00;
                long longValue2 = r26.A05 + ((Number) obj).longValue();
                r26.A05 = longValue2;
                r26.A00 = AnonymousClass6XZ.A00(r26.A0E, r26.A00, longValue2, r26.A04);
                return;
            case 15:
                C36331k8.A0w(C90494aF.A0E((C24601Db) this.A00), "payment_is_first_send", AnonymousClass000.A1X(obj));
                return;
            case 16:
                AnonymousClass5NQ r3 = (AnonymousClass5NQ) this.A00;
                AnonymousClass6AK r132 = (AnonymousClass6AK) obj;
                JSONObject jSONObject = r3.A05;
                if (jSONObject != null) {
                    try {
                        ((JSONObject) jSONObject.get("playerVars")).put("rctn", r132.A01).put("rct", r132.A00);
                    } catch (ClassCastException | JSONException e) {
                        Log.e("InlineYoutubeVideoPlayer/addCounterAbuseDataIfNeeded", e);
                    }
                }
                AnonymousClass5NQ.A00(r3);
                return;
            default:
                AnonymousClass5NQ.A00((AnonymousClass5NQ) this.A00);
                return;
        }
    }
}
