package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Dk  reason: invalid class name and case insensitive filesystem */
public final class C24691Dk {
    public final C20810yC A00;

    public C24691Dk(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.6AX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: long[]} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C131506Pi A04(org.json.JSONObject r12) {
        /*
            r11 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r12, r0)
            java.lang.String r0 = "start"
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            X.68z r9 = A01(r0)
            java.lang.String r0 = "duration"
            org.json.JSONObject r4 = r12.optJSONObject(r0)
            r10 = 0
            if (r4 == 0) goto L_0x004d
            java.lang.String r0 = "static"
            r1 = -1
            int r0 = r4.optInt(r0, r1)
            r2 = -1
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r0 == r1) goto L_0x0027
            long r2 = (long) r0
            long r2 = r2 * r7
        L_0x0027:
            java.lang.String r0 = "repeat"
            org.json.JSONArray r6 = r4.optJSONArray(r0)
            if (r6 == 0) goto L_0x0047
            int r0 = r6.length()
            long[] r10 = new long[r0]
            r5 = 0
            int r4 = r6.length()
        L_0x003a:
            if (r5 >= r4) goto L_0x0047
            int r0 = r6.getInt(r5)
            long r0 = (long) r0
            long r0 = r0 * r7
            r10[r5] = r0
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0047:
            X.6AX r0 = new X.6AX
            r0.<init>(r10, r2)
            r10 = r0
        L_0x004d:
            java.lang.String r0 = "end"
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            X.68z r2 = A01(r0)
            java.lang.String r0 = "activation"
            java.lang.String r1 = r12.optString(r0)
            X.6Pi r0 = new X.6Pi
            r0.<init>(r10, r9, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24691Dk.A04(org.json.JSONObject):X.6Pi");
    }

    public static final C128646Db A00(C24691Dk r18, JSONObject jSONObject, int i) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject2;
        String string;
        String A002;
        AnonymousClass5TI A003;
        int i2 = i;
        JSONObject jSONObject3 = jSONObject;
        try {
            int i3 = jSONObject3.getInt("policyVersion");
            AnonymousClass5HN r8 = null;
            C24691Dk r2 = r18;
            if (jSONObject3.has("banner") && (optJSONObject2 = jSONObject3.optJSONObject("banner")) != null) {
                String string2 = optJSONObject2.getString("text");
                String string3 = optJSONObject2.getString("iconDescription");
                String string4 = optJSONObject2.getString("action");
                C20810yC r9 = r2.A00;
                JSONObject jSONObject4 = optJSONObject2.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                AnonymousClass5TJ r11 = null;
                if (!jSONObject4.has("v2") || !C20800yB.A01(C21000yV.A02, r9, 6674)) {
                    jSONObject2 = null;
                } else {
                    jSONObject2 = jSONObject4.getJSONObject("v2");
                }
                if (jSONObject2 == null) {
                    string = jSONObject4.getString("light");
                } else {
                    string = jSONObject2.getString("light");
                }
                if (jSONObject2 == null) {
                    A002 = jSONObject4.getString("dark");
                    A003 = null;
                } else {
                    A002 = C63893Lv.A00("dark", jSONObject2, false);
                    if (A002 == null) {
                        A002 = jSONObject2.getString("light");
                    }
                    A003 = C111305c4.A00(C63893Lv.A00("role", jSONObject2, false));
                    if (A003 == null) {
                        A003 = AnonymousClass5TI.DEFAULT;
                    }
                    r11 = C111315c5.A00(C63893Lv.A00("style", jSONObject2, false));
                    if (r11 == null) {
                        r11 = AnonymousClass5TJ.PLAIN;
                    }
                }
                AnonymousClass00C.A0B(string);
                AnonymousClass00C.A0B(A002);
                AnonymousClass00C.A0D(string, 1);
                AnonymousClass00C.A0D(A002, 2);
                JSONObject jSONObject5 = optJSONObject2.getJSONObject("timing");
                AnonymousClass00C.A0B(jSONObject5);
                r8 = new AnonymousClass5HN(r2.A04(jSONObject5), A003, r11, string2, string, A002, string3, string4);
            }
            AnonymousClass5HO A02 = r2.A02("modal", jSONObject3, true);
            AnonymousClass5HO A022 = r2.A02("blocking-modal", jSONObject3, false);
            AnonymousClass6CS r7 = null;
            if (jSONObject3.has("badged-notice") && (optJSONObject = jSONObject3.optJSONObject("badged-notice")) != null) {
                String string5 = optJSONObject.getString("text");
                String string6 = optJSONObject.getString("action");
                JSONObject jSONObject6 = optJSONObject.getJSONObject("timing");
                AnonymousClass00C.A0B(jSONObject6);
                C131506Pi A04 = r2.A04(jSONObject6);
                int A004 = C55072u1.A00(optJSONObject);
                AnonymousClass00C.A0B(string5);
                AnonymousClass00C.A0B(string6);
                r7 = new AnonymousClass6CS(A04, string5, string6, A004);
            }
            return new C128646Db(r8, A02, A022, r7, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, i2, i3);
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse user notice content for notice id: ");
            sb.append(i2);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static final C1276168z A01(JSONObject jSONObject) {
        TimeZone timeZone;
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("time");
        String string2 = jSONObject.getString("reference");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        if ("utc".equalsIgnoreCase(string2)) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        try {
            simpleDateFormat.setTimeZone(timeZone);
            Date parse = simpleDateFormat.parse(string);
            C18740tg.A06(parse);
            return new C1276168z(parse.getTime());
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("UserNoticeTiming/getDate/Unable to parse date: ");
            sb.append(string);
            sb.append(" reference: ");
            sb.append(string2);
            Log.e(sb.toString());
            throw new RuntimeException(e);
        }
    }

    private final AnonymousClass5HO A02(String str, JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        String string;
        String A002;
        AnonymousClass5TI A003;
        String str2;
        String str3;
        String str4 = str;
        JSONObject jSONObject3 = jSONObject;
        if (!jSONObject3.has(str4) || (optJSONObject = jSONObject3.optJSONObject(str4)) == null) {
            return null;
        }
        String string2 = optJSONObject.getString("title");
        String string3 = optJSONObject.getString("iconDescription");
        String string4 = optJSONObject.getString("buttonText");
        C20810yC r8 = this.A00;
        JSONObject jSONObject4 = optJSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
        AnonymousClass5TJ r0 = null;
        if (!jSONObject4.has("v2") || !C20800yB.A01(C21000yV.A02, r8, 6674)) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject4.getJSONObject("v2");
        }
        if (jSONObject2 == null) {
            string = jSONObject4.getString("light");
        } else {
            string = jSONObject2.getString("light");
        }
        if (jSONObject2 == null) {
            A002 = jSONObject4.getString("dark");
            A003 = null;
        } else {
            A002 = C63893Lv.A00("dark", jSONObject2, false);
            if (A002 == null) {
                A002 = jSONObject2.getString("light");
            }
            A003 = C111305c4.A00(C63893Lv.A00("role", jSONObject2, false));
            if (A003 == null) {
                A003 = AnonymousClass5TI.DEFAULT;
            }
            r0 = C111315c5.A00(C63893Lv.A00("style", jSONObject2, false));
            if (r0 == null) {
                r0 = AnonymousClass5TJ.PLAIN;
            }
        }
        AnonymousClass00C.A0B(string);
        AnonymousClass00C.A0B(A002);
        AnonymousClass00C.A0D(string, 1);
        AnonymousClass00C.A0D(A002, 2);
        JSONObject jSONObject5 = optJSONObject.getJSONObject("timing");
        AnonymousClass00C.A0B(jSONObject5);
        AnonymousClass65B r12 = new AnonymousClass65B(A04(jSONObject5), string, A002, string3, string2, string4);
        r12.A00 = A003;
        r12.A01 = r0;
        JSONArray jSONArray = optJSONObject.getJSONArray("bullets");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject6 = jSONArray.getJSONObject(i);
            String string5 = jSONObject6.getString("text");
            JSONObject optJSONObject2 = jSONObject6.optJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            if (optJSONObject2 != null) {
                str3 = optJSONObject2.getString("light");
                str2 = optJSONObject2.getString("dark");
            } else {
                str2 = null;
                str3 = null;
            }
            r12.A05.add(new C128156Bc(string5, str3, str2));
        }
        String optString = optJSONObject.optString("body");
        if (!(optString == null || optString.length() == 0)) {
            r12.A02 = optString;
        }
        String optString2 = optJSONObject.optString("footer");
        if (!(optString2 == null || optString2.length() == 0)) {
            r12.A04 = optString2;
        }
        if (z) {
            r12.A03 = optJSONObject.getString("dismissText");
        }
        return r12.A00();
    }

    public final C128646Db A03(InputStream inputStream, int i) {
        try {
            JSONObject A01 = AnonymousClass14X.A01(inputStream);
            C18740tg.A06(A01);
            AnonymousClass00C.A0B(A01);
            return A00(this, A01, i);
        } catch (IOException | JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse user notice content for notice id: ");
            sb.append(i);
            Log.e(sb.toString(), e);
            return null;
        }
    }
}
