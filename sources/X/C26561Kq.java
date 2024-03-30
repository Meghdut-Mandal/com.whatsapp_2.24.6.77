package X;

import android.content.SharedPreferences;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.1Kq  reason: invalid class name and case insensitive filesystem */
public final class C26561Kq {
    public final C26571Kr A00;
    public final C19770wU A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final C005502l A03;
    public final C19700wN A04;
    public final C19600wD A05;
    public final AnonymousClass1KW A06;
    public final C20810yC A07;
    public final AnonymousClass040 A08;

    public C26561Kq(C19700wN r3, C26571Kr r4, C19600wD r5, AnonymousClass1KW r6, C20810yC r7, C19770wU r8, C005502l r9, AnonymousClass040 r10) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r9, 7);
        AnonymousClass00C.A0D(r10, 8);
        this.A06 = r6;
        this.A00 = r4;
        this.A04 = r3;
        this.A05 = r5;
        this.A01 = r8;
        this.A07 = r7;
        this.A03 = r9;
        this.A08 = r10;
    }

    public final C1037656u A01(C1037656u r4, C117225lu r5, String str, Throwable th) {
        if (!this.A05.A09()) {
            r4 = C1037456s.A00;
        }
        if (r5 != null) {
            r5.A00.countDown();
        }
        C19700wN r1 = this.A04;
        String str2 = r4.A00;
        if (th != null) {
            r1.A0D(str2, str, th);
            return r4;
        }
        r1.A0E(str2, str, false);
        return r4;
    }

    public static final C110805bG A00(C26561Kq r6, C117225lu r7, C123815x8 r8) {
        AnonymousClass6PF r4;
        String str;
        r6.A02.set(false);
        if (r8.A00 != 0 || (r4 = (AnonymousClass6PF) r8.A03.A00) == null) {
            return r6.A01(C1037256q.A00, r7, "Asset verification response is not in expected format.", (Throwable) null);
        }
        AnonymousClass1KW r5 = r6.A06;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pub_key", r4.A02);
        jSONObject.put("prev_pub_key", r4.A01);
        Long l = r4.A00;
        if (l != null) {
            try {
                str = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US).format(new Date(l.longValue()));
            } catch (ParseException unused) {
                str = null;
            }
        } else {
            str = null;
        }
        jSONObject.put("prev_pub_key_expiry", str);
        String obj = jSONObject.toString();
        AnonymousClass00C.A08(obj);
        ((SharedPreferences) r5.A00.get()).edit().putString("extensions_asset_verification", obj).apply();
        C1037756v r1 = new C1037756v(r4);
        if (r7 != null) {
            r7.A00.countDown();
        }
        return r1;
    }
}
