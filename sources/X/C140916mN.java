package X;

import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6mN  reason: invalid class name and case insensitive filesystem */
public class C140916mN implements C157877ep {
    public final AnonymousClass6EQ A00;
    public final C157957ey A01;

    public /* bridge */ /* synthetic */ void BcH(AnonymousClass6MU r12, C125255za r13, File file) {
        String str;
        JSONObject jSONObject;
        long j;
        C98504rX r9 = (C98504rX) r13;
        File file2 = file;
        if (r9.A03) {
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
                str = file.getAbsolutePath();
            }
            AnonymousClass6EQ r2 = this.A00;
            String A0t = C36371kC.A0t(r2.A00, C36381kD.A10(AnonymousClass000.A0v(r2.A01), str.hashCode()));
            if (A0t == null) {
                A0t = "{}";
            }
            try {
                jSONObject = C36441kJ.A1C(A0t);
            } catch (JSONException unused2) {
                jSONObject = C36441kJ.A1B();
            }
            long optLong = jSONObject.optLong("last_measured_size", -1);
            C157957ey r3 = this.A01;
            if (((C159077il) r3).BMJ()) {
                j = r9.A01;
            } else {
                j = r9.A00;
            }
            if (optLong > j) {
                r3.B5E(file);
                file.mkdirs();
            }
        }
        ((C157937ew) this.A01).BBh(C023109s.A00).execute(new C1503474x((Object) file2, (Object) this, (Object) r12, (Object) r9, 6));
    }

    public C140916mN(C157957ey r2) {
        this.A01 = r2;
        this.A00 = ((C157917et) r2).BHy("max_size");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C98524rZ r7, java.io.File r8, long r9) {
        /*
            r6 = this;
            java.lang.String r4 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ JSONException -> 0x004e }
        L_0x0009:
            org.json.JSONObject r3 = r7.Bvk()     // Catch:{ JSONException -> 0x004e }
            X.5za r0 = r7.A00     // Catch:{ JSONException -> 0x004e }
            X.4rX r0 = (X.C98504rX) r0     // Catch:{ JSONException -> 0x004e }
            boolean r0 = r0.A03     // Catch:{ JSONException -> 0x004e }
            if (r0 == 0) goto L_0x0049
            r1 = 0
            java.lang.String r5 = "last_measured_size"
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            X.6EQ r2 = r6.A00     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = r2.A01     // Catch:{ JSONException -> 0x004e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ JSONException -> 0x004e }
            int r0 = r4.hashCode()     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = X.C36381kD.A10(r1, r0)     // Catch:{ JSONException -> 0x004e }
            android.content.SharedPreferences r0 = r2.A00     // Catch:{ JSONException -> 0x004e }
            java.lang.String r0 = X.C36371kC.A0t(r0, r1)     // Catch:{ JSONException -> 0x004e }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "{}"
        L_0x0037:
            org.json.JSONObject r2 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x004e }
        L_0x0040:
            r0 = -1
            long r9 = r2.optLong(r5, r0)     // Catch:{ JSONException -> 0x004e }
        L_0x0046:
            r3.put(r5, r9)     // Catch:{ JSONException -> 0x004e }
        L_0x0049:
            X.6EQ r0 = r6.A00     // Catch:{ JSONException -> 0x004e }
            r0.A02(r4, r3)     // Catch:{ JSONException -> 0x004e }
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140916mN.A00(X.4rZ, java.io.File, long):void");
    }
}
