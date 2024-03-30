package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1BS  reason: invalid class name */
public class AnonymousClass1BS extends C19580wB implements AnonymousClass0z8 {
    public C124815yq A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final Handler A04 = new C35931jU(Looper.getMainLooper(), this, 2);
    public final C19700wN A05;
    public final AnonymousClass19J A06;
    public final C19970wo A07;
    public final C20810yC A08;
    public final AnonymousClass1BU A09;
    public final C24091Bb A0A;
    public final AnonymousClass19A A0B;
    public final C19890wg A0C;
    public final AnonymousClass1BX A0D;
    public final C24101Bc A0E;
    public final AnonymousClass1BT A0F;
    public final C19770wU A0G;
    public final C21320z1 A0H;
    public final Object A0I = new Object();
    public final Object A0J = new Object();
    public final AtomicBoolean A0K = new AtomicBoolean(false);
    public volatile C147736xh A0L;

    public static AnonymousClass620 A00(AnonymousClass1BS r16, String str, String str2, String str3, int i, boolean z) {
        AnonymousClass1BS r6 = r16;
        C124815yq A0B2 = r6.A0B();
        C19970wo r2 = r6.A07;
        C20810yC r3 = r6.A08;
        C21320z1 r8 = r6.A0H;
        return new AnonymousClass620(C148396yn.A01(r6.A05, r6.A06, r2, r3, r6.A09, r6.A0D, r6, A0B2, r8, str, str2, str3, i, 0, r6.A03, false, z));
    }

    private synchronized C147736xh A01() {
        if (this.A0L == null) {
            this.A0L = new C147736xh(this.A07, this.A0B, this);
        }
        return this.A0L;
    }

    public void BRC() {
        this.A02 = true;
        if (C20800yB.A01(C21000yV.A02, this.A08, 149)) {
            A07(this);
        }
    }

    public void onAppBackgrounded() {
        this.A02 = false;
    }

    public AnonymousClass1BS(C19700wN r7, AnonymousClass19J r8, C19970wo r9, C20810yC r10, AnonymousClass1BU r11, C24091Bb r12, AnonymousClass19A r13, C19890wg r14, AnonymousClass1BX r15, AnonymousClass1BT r16, C19770wU r17, C21320z1 r18) {
        C24101Bc r5 = new C24101Bc();
        this.A07 = r9;
        this.A08 = r10;
        this.A0H = r18;
        this.A05 = r7;
        this.A0F = r16;
        this.A0G = r17;
        this.A0B = r13;
        this.A06 = r8;
        this.A0D = r15;
        this.A09 = r11;
        this.A0C = r14;
        this.A0A = r12;
        this.A0E = r5;
        this.A03 = 1000;
    }

    public static HashSet A03(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    private void A04() {
        Log.i("routeselector/setuprouterequesttimer");
        C124815yq A0B2 = A0B();
        if (A0B2 != null) {
            Handler handler = this.A04;
            handler.removeMessages(0);
            long elapsedRealtime = (A0B2.A02 - SystemClock.elapsedRealtime()) - 60000;
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/settimerorupdateroutes/creating timer task with delay ");
            sb.append(elapsedRealtime);
            Log.i(sb.toString());
            handler.sendEmptyMessageDelayed(0, elapsedRealtime);
        }
    }

    public static void A05(AnonymousClass1BS r13) {
        boolean z;
        String str;
        C24091Bb r6 = r13.A0A;
        synchronized (r6) {
            z = false;
            if (C19970wo.A00(r6.A01) <= r6.A00) {
                z = true;
            }
        }
        if (z) {
            Log.i("routeselector/requestupdatedroutinginfo throttled");
            return;
        }
        C147736xh A012 = r13.A01();
        C124815yq A0B2 = r13.A0B();
        if (A0B2 == null) {
            str = null;
        } else {
            str = A0B2.A09;
        }
        synchronized (A012) {
            Log.i("routeselector/requestupdatedroutinginfo");
            if (A012.A00 == 0) {
                AnonymousClass19A r7 = A012.A01;
                String A092 = r7.A09();
                if (r7.A0K(A012, new C203399nx(new C203399nx("media_conn", str != null ? new AnonymousClass1AL[]{new AnonymousClass1AL("last_id", str)} : null), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "w:m"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A092, 124, 32000)) {
                    A012.A00 = SystemClock.elapsedRealtime();
                } else {
                    Log.i("app/sendgetmediaroutinginfo not sent");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/requestupdatedroutinginfo/not sending request; inFlightMediaRoutingRequestTime=");
            sb.append(A012.A00);
            Log.w(sb.toString());
        }
    }

    public static void A06(AnonymousClass1BS r37) {
        AnonymousClass1BS r2 = r37;
        if (C20800yB.A01(C21000yV.A02, r2.A08, 149) && r2.A0K.compareAndSet(false, true)) {
            C124815yq r4 = null;
            String string = r2.A0C.A00("route_selector_prefs").getString("media_conn", (String) null);
            C19970wo r9 = r2.A07;
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("auth_token");
                    long j = jSONObject.getLong("conn_ttl");
                    long j2 = jSONObject.getLong("auth_ttl");
                    long j3 = jSONObject.getLong("max_buckets");
                    JSONArray jSONArray = jSONObject.getJSONArray("hosts");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        arrayList.add(new AnonymousClass65F(jSONObject2.getString("hostname"), A02("ip4", jSONObject2), A02("ip6", jSONObject2), A02("class", jSONObject2), A02("fallback_hostname", jSONObject2), A02("fallback_ip4", jSONObject2), A02("fallback_ip6", jSONObject2), A02("fallback_class", jSONObject2), A02(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject2), A03(jSONObject2.optJSONArray("upload")), A03(jSONObject2.optJSONArray("download")), A03(jSONObject2.optJSONArray("download_buckets")), jSONObject2.optBoolean("force_ip")));
                    }
                    String A022 = A02("last_id", jSONObject);
                    boolean z = jSONObject.getBoolean("is_new");
                    r4 = new C124815yq(string2, A022, arrayList, jSONObject.getInt("max_autodownload_retry"), jSONObject.getInt("max_manual_retry"), j, j2, j3, (jSONObject.getLong("send_time_abs_ms") - C19970wo.A00(r9)) + SystemClock.elapsedRealtime(), z);
                } catch (JSONException e) {
                    Log.e("routingresponse/can't parse json", e);
                }
            }
            synchronized (r2.A0I) {
                if (r2.A00 == null && r4 != null && r4.A02 > SystemClock.elapsedRealtime()) {
                    A08(r2, r4);
                }
            }
        }
    }

    public static void A07(AnonymousClass1BS r3) {
        if ((!C20800yB.A01(C21000yV.A02, r3.A08, 149) || r3.A02) && r3.A01) {
            r3.A0G.Boy(new C35731jA((Object) r3, 32));
        }
    }

    public static void A08(AnonymousClass1BS r16, C124815yq r17) {
        StringBuilder sb = new StringBuilder();
        sb.append("routeselector/setroutinginfo/got a RoutingResponse with ");
        C124815yq r3 = r17;
        sb.append(r3.A0A.size());
        sb.append(" route classes");
        Log.i(sb.toString());
        AnonymousClass1BS r0 = r16;
        r0.A0E.A00.A02();
        synchronized (r0.A0I) {
            C124815yq r4 = r0.A00;
            if (r4 == null || r3.A0B) {
                r0.A00 = r3;
                for (AnonymousClass7hU BbY : r0.getObservers()) {
                    BbY.BbY(r3);
                }
            } else {
                List list = r4.A0A;
                r0.A00 = new C124815yq(r3.A08, r3.A09, list, r3.A00, r3.A01, r3.A05, r3.A03, r3.A06, r3.A07, false);
                Log.i("routeselector/setroutinginfo/previous hosts retained");
            }
        }
        Object obj = r0.A0J;
        synchronized (obj) {
            obj.notifyAll();
        }
        r0.A04();
    }

    public static boolean A09(AnonymousClass1BS r7) {
        Log.i("routeselector/requestroutinginfoifnulloralmostexpired");
        A06(r7);
        C124815yq A0B2 = r7.A0B();
        if (A0B2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/isroutinginfonulloralmostexpired/expiring at ");
            long j = A0B2.A04;
            sb.append(j);
            sb.append(" (");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms from now)");
            Log.i(sb.toString());
            if (j > SystemClock.elapsedRealtime() + 120000) {
                if (r7.A04.hasMessages(0)) {
                    return false;
                }
                r7.A04();
                return false;
            }
        }
        A05(r7);
        return true;
    }

    public AnonymousClass620 A0A(AnonymousClass7hT r22, int i) {
        C160507l7 r4;
        AnonymousClass7hT r0 = r22;
        C18740tg.A0C(true);
        if (r0 instanceof C148356yj) {
            r4 = new C148386ym(((C148356yj) r0).A00, this.A03);
        } else {
            int i2 = i;
            if (r0 instanceof C148346yi) {
                C148346yi r02 = (C148346yi) r0;
                C124815yq A0B2 = A0B();
                C19970wo r5 = this.A07;
                C20810yC r6 = this.A08;
                C21320z1 r11 = this.A0H;
                C19700wN r3 = this.A05;
                AnonymousClass19J r42 = this.A06;
                AnonymousClass1BX r8 = this.A0D;
                AnonymousClass1BU r7 = this.A09;
                long j = this.A03;
                r4 = new C148376yl(C148396yn.A01(r3, r42, r5, r6, r7, r8, this, A0B2, r11, r02.A01, (String) null, (String) null, i2, 0, j, false, false), r02.A00, j);
            } else if (r0 instanceof AnonymousClass5JY) {
                AnonymousClass5JY r03 = (AnonymousClass5JY) r0;
                return A00(this, r03.A00, r03.A01, r03.A01, i2, false);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown url generator type: ");
                sb.append(r0);
                throw new AssertionError(sb.toString());
            }
        }
        return new AnonymousClass620(r4);
    }

    public C124815yq A0B() {
        C124815yq r0;
        synchronized (this.A0I) {
            r0 = this.A00;
        }
        return r0;
    }

    public C148396yn A0C(String str, String str2, String str3, int i, int i2) {
        C124815yq A0B2 = A0B();
        C19970wo r2 = this.A07;
        C20810yC r3 = this.A08;
        C21320z1 r8 = this.A0H;
        return C148396yn.A01(this.A05, this.A06, r2, r3, this.A09, this.A0D, this, A0B2, r8, str, str2, str3, i, i2, this.A03, false, false);
    }

    public void A0D() {
        boolean z;
        Log.i("routeselector/requestroutesandwaitforauth");
        if (A09(this)) {
            C124815yq r0 = this.A00;
            if (r0 == null || r0.A02 <= SystemClock.elapsedRealtime()) {
                Log.i("routeselector/requestroutesandwaitforauth/waiting for response");
                C18740tg.A00();
                long uptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    C124815yq r02 = this.A00;
                    if (r02 == null || r02.A02 <= SystemClock.elapsedRealtime()) {
                        C147736xh A012 = A01();
                        synchronized (A012) {
                            z = false;
                            if (A012.A00 > 0) {
                                z = true;
                            }
                        }
                        if (!z) {
                            Log.w("routeselector/waitforroutingresponse/giving up because no request in flight");
                            return;
                        }
                        Object obj = this.A0J;
                        synchronized (obj) {
                            try {
                                obj.wait(1000);
                            } catch (InterruptedException e) {
                                Log.w("routeselector/waitforroutingresponse/interrupted while waiting on route selection", e);
                            }
                            C124815yq r03 = this.A00;
                            if (r03 == null || r03.A02 <= SystemClock.elapsedRealtime()) {
                                Log.w("routeselector/waitforroutingresponse/routing response still not available");
                            }
                            if (20000 + uptimeMillis < SystemClock.uptimeMillis()) {
                                Log.w("routeselector/waitforroutingresponse/waited too long for routing response! Give up");
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                while (true) {
                }
            }
        }
    }

    public void A0E(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("routeselector/onmediatransfererrororresponsecode/code ");
        sb.append(i);
        Log.i(sb.toString());
        if (i == 401 || i == 403) {
            A05(this);
        }
    }

    public static String A02(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
