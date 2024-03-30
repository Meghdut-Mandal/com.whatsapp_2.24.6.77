package X;

import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.683  reason: invalid class name */
public abstract class AnonymousClass683 {
    public boolean A00;
    public final C19600wD A01;
    public final C19970wo A02;
    public final C18820ts A03;
    public final C21010yW A04;
    public final C160097kS A05;
    public final AnonymousClass1XI A06;
    public final AnonymousClass6O2 A07;
    public final C19770wU A08;
    public final Set A09 = C36441kJ.A17();
    public final C159507jT A0A;

    public boolean A01(AnonymousClass6LL r6) {
        try {
            JSONObject A1B = C36441kJ.A1B();
            A1B.put("request_etag", r6.A04);
            A1B.put("language", r6.A03);
            A1B.put("cache_fetch_time", r6.A00);
            A1B.put("last_fetch_attempt_time", r6.A01);
            A1B.put("language_attempted_to_fetch", r6.A05);
            this.A0A.Bql(C36381kD.A0y(A1B));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public AnonymousClass6LL A00() {
        String BB7 = this.A0A.BB7();
        if (BB7 == null) {
            return new AnonymousClass6LL((C108495Ts) null, (String) null, (String) null, (String) null, 0, 0);
        }
        String str = null;
        try {
            AnonymousClass6LL r4 = new AnonymousClass6LL((C108495Ts) null, (String) null, (String) null, (String) null, 0, 0);
            JSONObject A1C = C36441kJ.A1C(BB7);
            String optString = A1C.optString("request_etag");
            AnonymousClass00C.A0B(optString);
            if (AnonymousClass098.A06(optString)) {
                optString = null;
            }
            r4.A04 = optString;
            r4.A00 = A1C.optLong("cache_fetch_time", 0);
            String optString2 = A1C.optString("language");
            AnonymousClass00C.A0B(optString2);
            if (AnonymousClass098.A06(optString2)) {
                optString2 = null;
            }
            r4.A03 = optString2;
            r4.A01 = A1C.optLong("last_fetch_attempt_time", 0);
            String optString3 = A1C.optString("language_attempted_to_fetch");
            AnonymousClass00C.A0B(optString3);
            if (!AnonymousClass098.A06(optString3)) {
                str = optString3;
            }
            r4.A05 = str;
            return r4;
        } catch (JSONException unused) {
            return new AnonymousClass6LL((C108495Ts) null, (String) null, (String) null, (String) null, 0, 0);
        }
    }

    public AnonymousClass683(C19600wD r2, C19970wo r3, C18820ts r4, C21010yW r5, C160097kS r6, C159507jT r7, AnonymousClass1XI r8, AnonymousClass6O2 r9, C19770wU r10) {
        C36321k7.A1B(r3, r10, r5, r4, r8);
        C36321k7.A13(r2, r7, r6);
        AnonymousClass00C.A0D(r9, 9);
        this.A02 = r3;
        this.A08 = r10;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r8;
        this.A01 = r2;
        this.A0A = r7;
        this.A05 = r6;
        this.A07 = r9;
    }
}
