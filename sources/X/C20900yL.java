package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0yL  reason: invalid class name and case insensitive filesystem */
public class C20900yL extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public Long A0S;
    public Long A0T;
    public boolean A0U;
    public final AnonymousClass005 A0V;

    public synchronized void A04() {
        String string = ((SharedPreferences) ((C19420v0) this.A0V.get()).A00.get()).getString("wam_client_errors", (String) null);
        this.A0U = true;
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.A0J = A01(jSONObject, 2);
                this.A0K = A01(jSONObject, 3);
                this.A0E = A00(jSONObject, 1);
                this.A01 = A00(jSONObject, 4);
                this.A00 = A00(jSONObject, 5);
                this.A0B = A00(jSONObject, 6);
                this.A0D = A00(jSONObject, 7);
                this.A07 = A00(jSONObject, 8);
                this.A02 = A00(jSONObject, 9);
                this.A0I = A00(jSONObject, 10);
                this.A0A = A00(jSONObject, 11);
                this.A0C = A00(jSONObject, 12);
                this.A0G = A00(jSONObject, 13);
                this.A03 = A00(jSONObject, 14);
                this.A06 = A00(jSONObject, 15);
                this.A05 = A00(jSONObject, 16);
                this.A08 = A00(jSONObject, 17);
                this.A04 = A00(jSONObject, 18);
                this.A09 = A00(jSONObject, 19);
                this.A0F = A00(jSONObject, 20);
                this.A0P = A01(jSONObject, 22);
                this.A0Q = A01(jSONObject, 23);
                this.A0L = A01(jSONObject, 24);
                this.A0M = A01(jSONObject, 25);
                this.A0R = A01(jSONObject, 26);
                this.A0T = A01(jSONObject, 27);
                this.A0S = A01(jSONObject, 28);
                this.A0H = A00(jSONObject, 29);
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if ((r2 | r3) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A05() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A0U     // Catch:{ all -> 0x0108 }
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = "WamClientErrors/WamClientErrors should be initialized before persist"
            r0 = 0
            X.C18740tg.A0D(r0, r1)     // Catch:{ all -> 0x0108 }
            r5.A04()     // Catch:{ all -> 0x0108 }
        L_0x000e:
            r4 = 0
            boolean r0 = r5.A06()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x002b
            java.lang.Long r0 = r5.A0R     // Catch:{ all -> 0x0108 }
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r2 = 1
        L_0x001c:
            java.lang.Long r1 = r5.A0T     // Catch:{ all -> 0x0108 }
            r0 = 0
            if (r1 == 0) goto L_0x0022
            r0 = 1
        L_0x0022:
            r2 = r2 | r0
            java.lang.Long r0 = r5.A0S     // Catch:{ all -> 0x0108 }
            if (r0 != 0) goto L_0x0028
            r3 = 0
        L_0x0028:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x00f1
        L_0x002b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0108 }
            r2.<init>()     // Catch:{ all -> 0x0108 }
            r1 = 2
            java.lang.Long r0 = r5.A0J     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 3
            java.lang.Long r0 = r5.A0K     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 1
            java.lang.Boolean r0 = r5.A0E     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 4
            java.lang.Boolean r0 = r5.A01     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 5
            java.lang.Boolean r0 = r5.A00     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 6
            java.lang.Boolean r0 = r5.A0B     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 7
            java.lang.Boolean r0 = r5.A0D     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 8
            java.lang.Boolean r0 = r5.A07     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 9
            java.lang.Boolean r0 = r5.A02     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 10
            java.lang.Boolean r0 = r5.A0I     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 11
            java.lang.Boolean r0 = r5.A0A     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 12
            java.lang.Boolean r0 = r5.A0C     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 13
            java.lang.Boolean r0 = r5.A0G     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 14
            java.lang.Boolean r0 = r5.A03     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 15
            java.lang.Boolean r0 = r5.A06     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 16
            java.lang.Boolean r0 = r5.A05     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 17
            java.lang.Boolean r0 = r5.A08     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 18
            java.lang.Boolean r0 = r5.A04     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 19
            java.lang.Boolean r0 = r5.A09     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 20
            java.lang.Boolean r0 = r5.A0F     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 22
            java.lang.Long r0 = r5.A0P     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 23
            java.lang.Long r0 = r5.A0Q     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 24
            java.lang.Long r0 = r5.A0L     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 25
            java.lang.Long r0 = r5.A0M     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 26
            java.lang.Long r0 = r5.A0R     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 27
            java.lang.Long r0 = r5.A0T     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 28
            java.lang.Long r0 = r5.A0S     // Catch:{ all -> 0x0108 }
            A03(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            r1 = 29
            java.lang.Boolean r0 = r5.A0H     // Catch:{ all -> 0x0108 }
            A02(r0, r2, r1)     // Catch:{ all -> 0x0108 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0108 }
        L_0x00f1:
            X.005 r0 = r5.A0V     // Catch:{ all -> 0x0108 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0108 }
            X.0v0 r0 = (X.C19420v0) r0     // Catch:{ all -> 0x0108 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "wam_client_errors"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)     // Catch:{ all -> 0x0108 }
            r0.apply()     // Catch:{ all -> 0x0108 }
            monitor-exit(r5)
            return
        L_0x0108:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20900yL.A05():void");
    }

    public final boolean A06() {
        return this.A0J == null && this.A0K == null && this.A0E == null && this.A0L == null && this.A0M == null && this.A0N == null && this.A0O == null && this.A0P == null && this.A0Q == null && this.A04 == null && this.A05 == null && this.A06 == null && this.A07 == null && this.A08 == null && this.A09 == null && this.A0A == null && this.A03 == null && this.A02 == null && this.A0I == null && this.A0H == null && this.A0G == null && this.A0F == null && this.A0D == null && this.A0C == null && this.A0B == null && this.A01 == null && this.A00 == null;
    }

    public synchronized void serialize(C28991Ux r3) {
        if (!this.A0U) {
            C18740tg.A0D(false, "WamClientErrors/WamClientErrors should be initialized before serialization");
            A04();
        }
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(2, this.A0J);
        r3.Bpz(3, this.A0K);
        r3.Bpz(1, this.A0E);
        r3.Bpz(24, this.A0L);
        r3.Bpz(25, this.A0M);
        r3.Bpz(34, this.A0N);
        r3.Bpz(35, this.A0O);
        r3.Bpz(22, this.A0P);
        r3.Bpz(23, this.A0Q);
        r3.Bpz(18, this.A04);
        r3.Bpz(16, this.A05);
        r3.Bpz(15, this.A06);
        r3.Bpz(8, this.A07);
        r3.Bpz(17, this.A08);
        r3.Bpz(19, this.A09);
        r3.Bpz(11, this.A0A);
        r3.Bpz(14, this.A03);
        r3.Bpz(9, this.A02);
        r3.Bpz(10, this.A0I);
        r3.Bpz(26, this.A0H);
        r3.Bpz(13, this.A0G);
        r3.Bpz(20, this.A0F);
        r3.Bpz(7, this.A0D);
        r3.Bpz(12, this.A0C);
        r3.Bpz(6, this.A0B);
        r3.Bpz(4, this.A01);
        r3.Bpz(5, this.A00);
    }

    public static void A02(Boolean bool, JSONObject jSONObject, int i) {
        if (bool != null) {
            try {
                jSONObject.put(String.valueOf(i), bool.booleanValue());
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public static void A03(Long l, JSONObject jSONObject, int i) {
        if (l != null) {
            try {
                jSONObject.put(String.valueOf(i), l.longValue());
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public Map getFieldsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(27, (Object) null);
        linkedHashMap.put(28, (Object) null);
        linkedHashMap.put(29, (Object) null);
        linkedHashMap.put(30, (Object) null);
        linkedHashMap.put(2, this.A0J);
        linkedHashMap.put(41, (Object) null);
        linkedHashMap.put(3, this.A0K);
        linkedHashMap.put(1, this.A0E);
        linkedHashMap.put(37, (Object) null);
        linkedHashMap.put(38, (Object) null);
        linkedHashMap.put(24, this.A0L);
        linkedHashMap.put(25, this.A0M);
        linkedHashMap.put(34, this.A0N);
        linkedHashMap.put(35, this.A0O);
        linkedHashMap.put(36, (Object) null);
        linkedHashMap.put(31, (Object) null);
        linkedHashMap.put(22, this.A0P);
        linkedHashMap.put(23, this.A0Q);
        linkedHashMap.put(32, (Object) null);
        linkedHashMap.put(33, (Object) null);
        linkedHashMap.put(18, this.A04);
        linkedHashMap.put(16, this.A05);
        linkedHashMap.put(15, this.A06);
        linkedHashMap.put(8, this.A07);
        linkedHashMap.put(17, this.A08);
        linkedHashMap.put(19, this.A09);
        linkedHashMap.put(11, this.A0A);
        linkedHashMap.put(14, this.A03);
        linkedHashMap.put(9, this.A02);
        linkedHashMap.put(10, this.A0I);
        linkedHashMap.put(26, this.A0H);
        linkedHashMap.put(13, this.A0G);
        linkedHashMap.put(20, this.A0F);
        linkedHashMap.put(7, this.A0D);
        linkedHashMap.put(12, this.A0C);
        linkedHashMap.put(6, this.A0B);
        linkedHashMap.put(4, this.A01);
        linkedHashMap.put(5, this.A00);
        linkedHashMap.put(39, (Object) null);
        linkedHashMap.put(40, (Object) null);
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WamWamClientErrors {");
        C20910yM.A00(this.A0J, "wamClientDroppedEventCount", sb);
        C20910yM.A00(this.A0K, "wamClientDroppedEventSize", sb);
        C20910yM.A00(this.A0E, "wamClientErrorFlags", sb);
        C20910yM.A00(this.A0L, "wamClientPrivateDroppedEventCount", sb);
        C20910yM.A00(this.A0M, "wamClientPrivateDroppedEventSize", sb);
        C20910yM.A00(this.A0N, "wamClientPrivateRealtimeDroppedEventCount", sb);
        C20910yM.A00(this.A0O, "wamClientPrivateRealtimeDroppedEventSize", sb);
        C20910yM.A00(this.A0P, "wamClientRealtimeDroppedEventCount", sb);
        C20910yM.A00(this.A0Q, "wamClientRealtimeDroppedEventSize", sb);
        C20910yM.A00(this.A04, "wamErrorBadCurrentEventBufferChecksum", sb);
        C20910yM.A00(this.A05, "wamErrorBadEventBuffer", sb);
        C20910yM.A00(this.A06, "wamErrorBadFileHeader", sb);
        C20910yM.A00(this.A07, "wamErrorBadFileSize", sb);
        C20910yM.A00(this.A08, "wamErrorBadHeaderChecksum", sb);
        C20910yM.A00(this.A09, "wamErrorBadRotatedEventBufferChecksum", sb);
        C20910yM.A00(this.A0A, "wamErrorCloseFile", sb);
        C20910yM.A00(this.A03, "wamErrorCreateWamFile", sb);
        C20910yM.A00(this.A02, "wamErrorFseekFile", sb);
        C20910yM.A00(this.A0I, "wamErrorOpenFile", sb);
        C20910yM.A00(this.A0H, "wamErrorOpenPsUploadQueueFile", sb);
        C20910yM.A00(this.A0G, "wamErrorOpenWamFile", sb);
        C20910yM.A00(this.A0F, "wamErrorPersistence", sb);
        C20910yM.A00(this.A0D, "wamErrorReadFile", sb);
        C20910yM.A00(this.A0C, "wamErrorRemoveFile", sb);
        C20910yM.A00(this.A0B, "wamErrorWriteEventBuffer", sb);
        C20910yM.A00(this.A01, "wamErrorWriteFile", sb);
        C20910yM.A00(this.A00, "wamErrorWriteHeader", sb);
        sb.append("}");
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        return obj;
    }

    public C20900yL(AnonymousClass005 r1) {
        this();
        this.A0V = r1;
    }

    public static Boolean A00(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(valueOf));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public static Long A01(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(valueOf));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public C20900yL() {
        super(1144, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }
}
