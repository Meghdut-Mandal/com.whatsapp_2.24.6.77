package X;

import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1KK  reason: invalid class name */
public final class AnonymousClass1KK {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C19730wQ A01;
    public final C26421Kc A02;
    public final AnonymousClass1KL A03;
    public final AnonymousClass1KM A04;
    public final AnonymousClass1KR A05;
    public final AnonymousClass1LE A06;
    public final C19420v0 A07;
    public final C20310xM A08;
    public final C24961El A09;
    public final AnonymousClass1DV A0A;
    public final C19700wN A0B;
    public final AnonymousClass1L9 A0C;
    public final AnonymousClass1LB A0D;
    public final AnonymousClass1L1 A0E;
    public final C19970wo A0F;
    public final C20810yC A0G;
    public final AnonymousClass19A A0H;
    public final AnonymousClass1LA A0I;
    public final C19770wU A0J;
    public final Set A0K = new HashSet();

    public AnonymousClass1KK(C19700wN r21, C19730wQ r22, AnonymousClass1L9 r23, C26421Kc r24, AnonymousClass1KL r25, AnonymousClass1LB r26, AnonymousClass1KM r27, AnonymousClass1L1 r28, AnonymousClass1KR r29, C19970wo r30, C19420v0 r31, C20310xM r32, C20810yC r33, AnonymousClass19A r34, AnonymousClass1LA r35, C19770wU r36, C24961El r37, AnonymousClass1DV r38, C229716r r39) {
        C19970wo r14 = r30;
        AnonymousClass00C.A0D(r14, 1);
        C20810yC r7 = r33;
        AnonymousClass00C.A0D(r7, 2);
        C19730wQ r18 = r22;
        AnonymousClass00C.A0D(r18, 3);
        C19770wU r4 = r36;
        AnonymousClass00C.A0D(r4, 4);
        C19700wN r19 = r21;
        AnonymousClass00C.A0D(r19, 5);
        AnonymousClass19A r6 = r34;
        AnonymousClass00C.A0D(r6, 7);
        C229716r r2 = r39;
        AnonymousClass00C.A0D(r2, 8);
        C19420v0 r9 = r31;
        AnonymousClass00C.A0D(r9, 9);
        AnonymousClass1KL r13 = r25;
        AnonymousClass00C.A0D(r13, 10);
        C20310xM r8 = r32;
        AnonymousClass00C.A0D(r8, 11);
        AnonymousClass1KM r11 = r27;
        AnonymousClass00C.A0D(r11, 12);
        C24961El r3 = r37;
        AnonymousClass00C.A0D(r3, 13);
        C26421Kc r16 = r24;
        AnonymousClass00C.A0D(r16, 15);
        AnonymousClass1L1 r10 = r28;
        AnonymousClass00C.A0D(r10, 16);
        AnonymousClass1L9 r17 = r23;
        AnonymousClass00C.A0D(r17, 17);
        AnonymousClass1LA r5 = r35;
        AnonymousClass00C.A0D(r5, 18);
        AnonymousClass1LB r12 = r26;
        AnonymousClass00C.A0D(r12, 19);
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0F = r14;
        this.A0G = r7;
        this.A01 = r18;
        this.A0J = r4;
        this.A0B = r19;
        this.A0A = r38;
        this.A0H = r6;
        this.A07 = r9;
        this.A03 = r13;
        this.A08 = r8;
        this.A02 = r16;
        this.A09 = r3;
        this.A0C = r17;
        this.A0I = r5;
        this.A04 = r11;
        this.A05 = r29;
        this.A0E = r10;
        this.A06 = new AnonymousClass1LE(r2);
        this.A0D = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r6.A00 != 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.C207109uZ r6, X.C207109uZ r7) {
        /*
            r5 = 1
            r4 = 0
            if (r7 == 0) goto L_0x001a
            boolean r0 = r7.A0d
            r3 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
        L_0x000a:
            int r2 = r7.A00
            if (r2 != r5) goto L_0x0015
            if (r6 == 0) goto L_0x0015
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            return r4
        L_0x001b:
            if (r6 == 0) goto L_0x002a
            boolean r0 = r6.A0d
            if (r0 != r5) goto L_0x002a
            if (r1 != 0) goto L_0x002a
            int r0 = r6.A00
            if (r0 != r5) goto L_0x0029
            if (r2 != r5) goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KK.A05(X.9uZ, X.9uZ):boolean");
    }

    public final AI7 A06(C19700wN r12, UserJid userJid, String str) {
        AnonymousClass00C.A0D(userJid, 0);
        C19700wN r2 = r12;
        AnonymousClass00C.A0D(r12, 2);
        int A002 = this.A03.A00();
        C19730wQ r3 = this.A01;
        AnonymousClass3L6 r8 = (AnonymousClass3L6) ((C18800tq) C19570wA.A00(C18800tq.class, this.A0I.A00.A00)).A0t.get();
        AnonymousClass00C.A08(r8);
        AnonymousClass19A r7 = this.A0H;
        return new AI7(r2, r3, this, this.A02, userJid, r7, r8, str, A002);
    }

    public final String A09(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        return this.A04.A02(userJid);
    }

    public final void A0D(C23021B0r b0r, UserJid userJid, boolean z) {
        this.A0J.Boy(new C35351iY(this, userJid, b0r, 0, z));
    }

    public final void A0E(C31751cK r2, UserJid userJid, String str) {
        AnonymousClass00C.A0D(userJid, 0);
        AnonymousClass00C.A0D(r2, 2);
        A06(this.A0B, userJid, str).A00(r2);
    }

    public final void A0F(C207109uZ r4, UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        if ((this.A03.A00() & 128) > 0 && r4 != null && r4.A0X) {
            this.A04.A03(new C21100A8l(this), r4, userJid, true);
        }
    }

    public final void A0G(C207109uZ r9, UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        if (r9 != null) {
            if (this.A01.A0M(userJid)) {
                C19420v0 r3 = this.A07;
                C19420v0.A00(r3).putLong("smb_last_my_business_profile_sync_time", C19970wo.A00(this.A0F)).apply();
                AnonymousClass1L9 r32 = this.A0C;
                C206699tp r4 = r9.A01;
                if (r4 != null) {
                    C206539tZ r1 = new C206539tZ("incomplete_profile", "warning");
                    boolean A002 = C53342rA.A00(r32.A01, r9);
                    List<C206539tZ> list = r4.A02;
                    if (A002) {
                        list.remove(r1);
                    } else if (!list.contains(r1)) {
                        list.add(r1);
                    }
                    C19420v0 r33 = r32.A02;
                    C19420v0.A00(r33).putString("smb_searchability_intent", r4.A00).apply();
                    C19420v0.A00(r33).putString("smb_searchability_status", r4.A01).apply();
                    ArrayList arrayList = new ArrayList();
                    for (C206539tZ r5 : list) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.A01);
                        jSONObject.put("level", r5.A00);
                        arrayList.add(jSONObject.toString());
                    }
                    C19420v0.A00(r33).putStringSet("smb_searchability_issues", new HashSet(arrayList)).apply();
                    C19420v0.A00(r33).putBoolean("smb_is_profile_edit_disabled", r4.A03).apply();
                }
            }
            C207109uZ A072 = A07(userJid);
            if (A04(this, r9, A072)) {
                Set singleton = Collections.singleton(userJid);
                AnonymousClass00C.A08(singleton);
                A02(this, singleton);
            }
            if (A03(this, r9, A072)) {
                Set singleton2 = Collections.singleton(userJid);
                AnonymousClass00C.A08(singleton2);
                A01(this, singleton2);
            }
            if (!(r9.A00 != 0 || A072 == null || A072.A00 == 0)) {
                Set singleton3 = Collections.singleton(userJid);
                AnonymousClass00C.A08(singleton3);
                A00(this, singleton3);
            }
            if (A05(r9, A072)) {
                this.A0A.A01(userJid, false);
            }
            AnonymousClass1LE r12 = this.A06;
            HashMap hashMap = new HashMap();
            hashMap.put(userJid, r9);
            r12.A08(hashMap);
            A0F(r9, userJid);
        }
    }

    public final void A0H(UserJid userJid, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        this.A0J.Boy(new C35291iS(this, userJid, 2, z));
    }

    static {
        TimeUnit.HOURS.toMillis(24);
    }

    public static final void A01(AnonymousClass1KK r4, Set set) {
        if (r4.A09.A02()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r2 = (AnonymousClass11F) it.next();
                C20310xM r1 = r4.A08;
                if (r1.A0j.A08(r2)) {
                    C20310xM.A0D(r1, r2, true, true);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r7.A09.A00.A00(r1) != -1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r9 != null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.AnonymousClass1KK r7, X.C207109uZ r8, X.C207109uZ r9) {
        /*
            X.0yC r2 = r7.A0G
            r6 = 0
            r1 = 4873(0x1309, float:6.829E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r5 = 0
            if (r0 == 0) goto L_0x0031
            r1 = 1
            if (r8 == 0) goto L_0x0031
            int r0 = r8.A00
            if (r0 != r1) goto L_0x0031
            X.0wQ r0 = r7.A01
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0032
            if (r9 != 0) goto L_0x0034
            com.whatsapp.jid.UserJid r1 = r8.A08
            if (r1 == 0) goto L_0x0039
            X.1El r0 = r7.A09
            X.1Et r0 = r0.A00
            long r3 = r0.A00(r1)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
        L_0x0031:
            return r6
        L_0x0032:
            if (r9 == 0) goto L_0x0039
        L_0x0034:
            int r0 = r9.A00
            if (r0 != r1) goto L_0x0039
            r5 = 1
        L_0x0039:
            r0 = r5 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KK.A03(X.1KK, X.9uZ, X.9uZ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r6.A09.A00.A00(r1) != -1) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r8 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.AnonymousClass1KK r6, X.C207109uZ r7, X.C207109uZ r8) {
        /*
            X.0yC r0 = r6.A0G
            boolean r0 = X.C55942vR.A00(r0)
            r5 = 0
            if (r0 == 0) goto L_0x002c
            r1 = 2
            if (r7 == 0) goto L_0x002c
            int r0 = r7.A00
            if (r0 != r1) goto L_0x002c
            X.0wQ r0 = r6.A01
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x002d
            if (r8 != 0) goto L_0x002f
            com.whatsapp.jid.UserJid r1 = r7.A08
            if (r1 == 0) goto L_0x0034
            X.1El r0 = r6.A09
            X.1Et r0 = r0.A00
            long r3 = r0.A00(r1)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
        L_0x002c:
            return r5
        L_0x002d:
            if (r8 == 0) goto L_0x0034
        L_0x002f:
            int r0 = r8.A00
            if (r0 != r1) goto L_0x0034
            r5 = 1
        L_0x0034:
            r0 = r5 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KK.A04(X.1KK, X.9uZ, X.9uZ):boolean");
    }

    public final C207109uZ A07(UserJid userJid) {
        C199179ep A062 = this.A06.A06(userJid);
        if (A062 == null) {
            return null;
        }
        AnonymousClass1L9 r0 = this.A0C;
        C63043In r6 = new C63043In();
        AnonymousClass005 r3 = r0.A02.A00;
        r6.A00 = ((SharedPreferences) r3.get()).getString("smb_searchability_intent", (String) null);
        r6.A01 = ((SharedPreferences) r3.get()).getString("smb_searchability_status", (String) null);
        ArrayList arrayList = new ArrayList(((SharedPreferences) r3.get()).getStringSet("smb_searchability_issues", new HashSet()));
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String string2 = jSONObject.getString("level");
                AnonymousClass00C.A0B(string);
                AnonymousClass00C.A0B(string2);
                arrayList2.add(new C206539tZ(string, string2));
            }
            r6.A02 = arrayList2;
        } catch (JSONException unused) {
            Log.e("BusinessAccountSettingsManager/getBusinessAccountSettings invalid issue list JSON");
        }
        A062.A01 = new C206699tp(r6.A00, r6.A01, false, r6.A02);
        return A062.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A08(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            X.1LE r0 = r6.A06
            r5 = 0
            if (r7 != 0) goto L_0x000b
            java.lang.String r0 = "contact-mgr-db/cannot get business description details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x000b:
            java.lang.String r4 = r7.getRawString()
            X.16r r0 = r0.A00
            X.1M0 r3 = r0.get()
            java.lang.String r2 = "SELECT _id, jid, email, business_description, address, tag, latitude, longitude, vertical, has_catalog, address_postal_code, address_city_id, address_city_name, commerce_experience, shop_url, cart_enabled, commerce_manager_url, direct_connection_enabled, is_shop_banned, default_postcode, location_name, galaxy_business_enabled, cover_photo_url, cover_photo_id, custom_url, member_since, capi_calling_enabled, is_responsive, postcode_type, price_tier_id, business_blocked_status, survey_sampling_rate, is_offerings_eligible, automated_type, welcome_message_protocol_mode FROM wa_biz_profiles WHERE jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0041 }
            r0 = 0
            r1[r0] = r4     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r2 = X.C229416o.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x0041 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "business_description"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r5 = r2.getString(r0)     // Catch:{ all -> 0x003a }
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            return r5
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KK.A08(com.whatsapp.jid.UserJid):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A0A() {
        /*
            r7 = this;
            X.1LE r0 = r7.A06
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            X.16r r0 = r0.A00
            X.1M0 r5 = r0.get()
            java.lang.String r2 = "SELECT jid, tag FROM wa_biz_profiles"
            java.lang.String r1 = "CONTACT_BIZ_PROFILES"
            r0 = 0
            android.database.Cursor r4 = X.C229416o.A03(r5, r2, r1, r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "jid"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "tag"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
        L_0x0022:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            X.13r r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0043 }
            com.whatsapp.jid.UserJid r1 = r1.A02(r0)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x0043 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0043 }
            goto L_0x0022
        L_0x003c:
            r4.close()     // Catch:{ all -> 0x004a }
            r5.close()
            return r6
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KK.A0A():java.util.HashMap");
    }

    public final void A0B(C23020B0q b0q, UserJid userJid) {
        A0C(new C21098A8j(b0q, this), userJid);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass7fY r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            X.0wU r2 = r6.A0J
            X.5M4 r1 = new X.5M4
            r1.<init>(r7, r6, r8)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.Box(r1, r0)
            X.1L1 r3 = r6.A0E
            r2 = 0
            X.0yC r1 = r3.A02
            r0 = 1693(0x69d, float:2.372E-42)
            java.lang.String r1 = r1.A09(r0)
            X.AnonymousClass00C.A08(r1)
            r5 = 0
            if (r8 == 0) goto L_0x0027
            java.lang.String r0 = r8.user
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r5)
            if (r0 == 0) goto L_0x0027
            r5 = 1
        L_0x0027:
            X.0v0 r0 = r3.A01
            X.005 r0 = r0.A00
            java.lang.Object r4 = r0.get()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r1 = "pref_commerce_metadata_cache_enable"
            r0 = 1
            boolean r0 = r4.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x00a8
            if (r5 == 0) goto L_0x004e
            X.5kt r0 = r3.A03()
            if (r0 == 0) goto L_0x00a8
            java.util.List r1 = r0.A00
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0090
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0090
        L_0x004e:
            X.1LB r5 = r6.A0D
            X.0yC r1 = r5.A04
            r0 = 1763(0x6e3, float:2.47E-42)
            java.lang.String r2 = r1.A09(r0)
            X.AnonymousClass00C.A08(r2)
            r1 = 0
            if (r8 == 0) goto L_0x008f
            java.lang.String r0 = r8.user
            if (r0 == 0) goto L_0x008f
            boolean r0 = X.AnonymousClass099.A0O(r2, r0, r1)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0086
            r4 = 1
            r5.A00 = r4
            X.0wG r0 = r5.A02
            android.content.Context r3 = r0.A00
            X.AnonymousClass00C.A08(r3)
            r0 = 6
            X.7oR r2 = new X.7oR
            r2.<init>(r5, r0)
            java.lang.String r1 = "android.intent.action.LOCALE_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            X.C26981Mg.A01(r2, r3, r0, r4)
        L_0x0086:
            boolean r0 = r5.A02()
            if (r0 == 0) goto L_0x008f
            r5.A01()
        L_0x008f:
            return
        L_0x0090:
            java.util.Iterator r1 = r1.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r1.next()
            X.6Pp r0 = (X.C131576Pp) r0
            java.lang.String r0 = r0.A03
            X.6Pp r0 = r3.A02(r0)
            if (r0 != 0) goto L_0x0094
        L_0x00a8:
            r3.A04(r2)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KK.A0C(X.7fY, com.whatsapp.jid.UserJid):void");
    }

    public static final void A00(AnonymousClass1KK r10, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r8 = (AnonymousClass11F) it.next();
            C20310xM r7 = r10.A08;
            if (r7.A0j.A08(r8)) {
                C238019x r1 = r7.A1A;
                AnonymousClass2cI r3 = new AnonymousClass2cI(r1.A01.A02(r8, true), 69, C19970wo.A00(r7.A0C));
                r3.A00 = 2;
                r3.A01 = null;
                C20310xM.A05(r7, r3, -1);
                StringBuilder sb = new StringBuilder();
                sb.append("CoreMessageStore/downgrade from bot system msg when automatedType downgrade; jid=");
                sb.append(r8);
                Log.i(sb.toString());
                r7.A0R(r3, -1);
            }
        }
    }

    public static final void A02(AnonymousClass1KK r7, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r5 = (AnonymousClass11F) it.next();
            C20310xM r4 = r7.A08;
            if (r4.A0j.A08(r5)) {
                C181148n0 A012 = r4.A1E.A01(r5, true);
                C20310xM.A05(r4, A012, -1);
                StringBuilder sb = new StringBuilder();
                sb.append("CoreMessageStore/3p bot system msg when automatedType updated; jid=");
                sb.append(r5);
                Log.i(sb.toString());
                r4.A0R(A012, -1);
            }
        }
    }
}
