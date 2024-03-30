package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Dl  reason: invalid class name and case insensitive filesystem */
public class C24701Dl {
    public C24681Dj A00;
    public SharedPreferences A01;
    public final C19970wo A02;
    public final C24691Dk A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap(4);
    public final C19890wg A05;

    public static synchronized SharedPreferences.Editor A00(C24701Dl r1) {
        SharedPreferences.Editor edit;
        synchronized (r1) {
            edit = A01(r1).edit();
        }
        return edit;
    }

    public static synchronized SharedPreferences A01(C24701Dl r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A01;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A05.A00("privacy_disclosure_store");
                r2.A01 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static void A02(C24701Dl r18) {
        C24701Dl r2 = r18;
        ConcurrentHashMap concurrentHashMap = r2.A04;
        if (concurrentHashMap.size() == 0) {
            synchronized (r2) {
                for (Map.Entry next : A01(r2).getAll().entrySet()) {
                    String str = (String) next.getKey();
                    if (!str.startsWith("repeat_last_index_") && !str.startsWith("repeat_last_ts_")) {
                        try {
                            Integer valueOf = Integer.valueOf((String) next.getKey());
                            try {
                                JSONObject jSONObject = new JSONObject((String) next.getValue());
                                int i = jSONObject.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                int i2 = jSONObject.getInt("stage");
                                int optInt = jSONObject.optInt("version", 1);
                                long j = jSONObject.getLong("activatedTimeInSecond");
                                long j2 = jSONObject.getLong("acceptedTimeInSecond");
                                String string = jSONObject.getString("deepLink");
                                String string2 = jSONObject.getString("content");
                                int optInt2 = jSONObject.optInt("rolloutMode", 0);
                                if (i2 < -1 || i2 > 1000) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("privacydisclosurestore/loadFromFile bad stage value for disclosure = ");
                                    sb.append(valueOf);
                                    Log.e(sb.toString());
                                    A00(r2).remove((String) next.getKey()).apply();
                                } else {
                                    concurrentHashMap.put(valueOf, new C34331gr(string, string2, i, i2, optInt, optInt2, j, j2));
                                }
                            } catch (JSONException e) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("privacydisclosurestore/loadFromFile bad json ");
                                sb2.append(e.toString());
                                Log.e(sb2.toString());
                                A00(r2).remove((String) next.getKey()).apply();
                            } catch (NumberFormatException e2) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("privacydisclosurestore/loadFromFile corrupted number ");
                                sb3.append(e2.toString());
                                Log.e(sb3.toString());
                                A00(r2).remove((String) next.getKey()).apply();
                            }
                        } catch (NumberFormatException unused) {
                            Log.e("privacydisclosurestore disclosure id key is corrupted");
                            A00(r2).remove((String) next.getKey()).apply();
                        }
                    }
                }
            }
        }
    }

    public void A04(int i, int i2, int i3, int i4, int i5) {
        long j;
        C24681Dj r2;
        A02(this);
        int i6 = i2;
        if (i2 == 0) {
            j = C19970wo.A00(this.A02) / 1000;
        } else {
            j = -1;
        }
        if (A06(new C34331gr("", "", i3, i6, i4, i5, j, -1), i) && (r2 = this.A00) != null) {
            synchronized (r2.A01) {
                if (r2.A0D && i == r2.A0B) {
                    r2.A0D = false;
                    r2.A0B = 0;
                    r2.A01.notify();
                }
            }
        }
    }

    public C24701Dl(C19970wo r3, C19890wg r4, C24691Dk r5) {
        this.A02 = r3;
        this.A05 = r4;
        this.A03 = r5;
    }

    public int A03(int i) {
        A02(this);
        C34331gr r0 = (C34331gr) this.A04.get(Integer.valueOf(i));
        if (r0 != null) {
            return r0.A01;
        }
        throw new IllegalArgumentException("Disclosure is not eligible for current user");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r10 == r3) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r3 != 0) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, int r9, int r10, int r11, boolean r12) {
        /*
            r5 = this;
            A02(r5)
            java.util.concurrent.ConcurrentHashMap r1 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r2 = r1.get(r0)
            X.1gr r2 = (X.C34331gr) r2
            if (r2 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "privacydisclosurestore/updatedisclosure invalid disclosureId = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0025:
            return
        L_0x0026:
            int r3 = r2.A01
            if (r12 != 0) goto L_0x005c
            java.util.List r1 = X.C34391gx.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0061
            r0 = 1
            if (r10 != r0) goto L_0x005f
            if (r3 == 0) goto L_0x005c
        L_0x003b:
            if (r7 == 0) goto L_0x003f
            r2.A07 = r7
        L_0x003f:
            if (r8 == 0) goto L_0x0043
            r2.A06 = r8
        L_0x0043:
            if (r6 == 0) goto L_0x004b
            int r0 = r6.intValue()
            r2.A03 = r0
        L_0x004b:
            r0 = -1
            if (r11 == r0) goto L_0x0051
            r0 = 1
            r2.A00 = r0
        L_0x0051:
            r5.A06(r2, r9)
            X.1Dj r2 = r5.A00
            if (r2 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            monitor-enter(r1)
            goto L_0x007c
        L_0x005c:
            r2.A01 = r10
            goto L_0x0061
        L_0x005f:
            if (r10 != r3) goto L_0x005c
        L_0x0061:
            r0 = 5
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r10 != r0) goto L_0x0070
            X.0wo r0 = r5.A02
            long r0 = X.C19970wo.A00(r0)
            long r0 = r0 / r3
            r2.A04 = r0
            goto L_0x003b
        L_0x0070:
            if (r10 != 0) goto L_0x003b
            X.0wo r0 = r5.A02
            long r0 = X.C19970wo.A00(r0)
            long r0 = r0 / r3
            r2.A05 = r0
            goto L_0x003b
        L_0x007c:
            boolean r0 = r2.A0C     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008e
            int r0 = r2.A0A     // Catch:{ all -> 0x0090 }
            if (r9 != r0) goto L_0x008e
            r0 = 0
            r2.A0C = r0     // Catch:{ all -> 0x0090 }
            r2.A0A = r0     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x0090 }
            r0.notify()     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0090 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24701Dl.A05(java.lang.Integer, java.lang.String, java.lang.String, int, int, int, boolean):void");
    }

    public boolean A06(C34331gr r5, int i) {
        StringBuilder sb;
        String str;
        A02(this);
        this.A04.put(Integer.valueOf(i), r5);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A02);
            jSONObject.put("stage", r5.A01);
            jSONObject.put("version", r5.A03);
            jSONObject.put("rolloutMode", r5.A00);
            jSONObject.put("activatedTimeInSecond", r5.A05);
            jSONObject.put("acceptedTimeInSecond", r5.A04);
            jSONObject.put("deepLink", r5.A07);
            jSONObject.put("content", r5.A06);
            A00(this).putString(String.valueOf(i), jSONObject.toString()).apply();
            return true;
        } catch (JSONException e) {
            e = e;
            sb = new StringBuilder();
            str = "privacydisclosurestore/savedisclosure JEX ";
            sb.append(str);
            sb.append(e);
            Log.e(sb.toString());
            return false;
        } catch (Exception e2) {
            e = e2;
            sb = new StringBuilder();
            str = "privacydisclosurestore/savedisclosure exception:";
            sb.append(str);
            sb.append(e);
            Log.e(sb.toString());
            return false;
        }
    }
}
