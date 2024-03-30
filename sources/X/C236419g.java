package X;

import android.content.ContentValues;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.19g  reason: invalid class name and case insensitive filesystem */
public class C236419g extends C19580wB implements C236319f {
    public C63133Iw A00;
    public DeviceJid A01;
    public Comparator A02 = C237719u.A00;
    public boolean A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final C19460v5 A05;
    public final C19700wN A06;
    public final AnonymousClass1G9 A07;
    public final C237019m A08;
    public final C19730wQ A09;
    public final C237119n A0A;
    public final C236519h A0B;
    public final C19970wo A0C;
    public final C19630wG A0D;
    public final C19420v0 A0E;
    public final AnonymousClass189 A0F;
    public final AnonymousClass187 A0G;
    public final C237219o A0H;
    public final C231517j A0I;
    public final AnonymousClass19A A0J;
    public final C236919l A0K;
    public final C19930wk A0L;
    public final C19770wU A0M;
    public final Object A0N = new Object();
    public final Set A0O = new HashSet();
    public final AnonymousClass1G8 A0P;
    public final C18820ts A0Q;
    public final Map A0R = new HashMap();

    public AnonymousClass3SB A08(int i) {
        if (i > 0 && this.A0K.A01.A2H()) {
            C225614x it = this.A0I.A04.A00().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Jid) entry.getKey()).getDevice() == i) {
                    return (AnonymousClass3SB) entry.getValue();
                }
            }
        }
        return null;
    }

    public int[] BCF() {
        return new int[]{213};
    }

    public C236419g(C19460v5 r4, C19700wN r5, AnonymousClass1G8 r6, AnonymousClass1G9 r7, C237019m r8, C19730wQ r9, C237119n r10, C236519h r11, C19970wo r12, C19630wG r13, C19420v0 r14, C18820ts r15, AnonymousClass189 r16, AnonymousClass187 r17, C237219o r18, C231517j r19, AnonymousClass19A r20, C236919l r21, C19770wU r22, AnonymousClass005 r23) {
        super(r23);
        this.A0C = r12;
        this.A0B = r11;
        this.A06 = r5;
        this.A09 = r9;
        this.A0D = r13;
        C19770wU r2 = r22;
        this.A0M = r2;
        this.A0I = r19;
        this.A0J = r20;
        this.A0G = r17;
        this.A0Q = r15;
        this.A0K = r21;
        this.A0F = r16;
        this.A05 = r4;
        this.A0E = r14;
        this.A08 = r8;
        this.A0A = r10;
        this.A0H = r18;
        this.A0L = new C19930wk(r2, true);
        this.A0P = r6;
        this.A07 = r7;
    }

    public static AnonymousClass3SB A00(C236419g r1, DeviceJid deviceJid) {
        if (!r1.A0K.A01.A2H()) {
            return null;
        }
        return (AnonymousClass3SB) r1.A0I.A04.A00().get(deviceJid);
    }

    private C76863pZ A01(C20760y7 r4, String str, boolean z, boolean z2) {
        C18740tg.A0D(!AnonymousClass6XG.A02(C67633aE.A00, r4), "companion-device-manager/hostedDevice present when not supported in build");
        return new C76863pZ(new C71983he(this, z2, z), (AnonymousClass19A) this.A07.A00.A00.A4x.get(), str);
    }

    public static void A02(Location location, AnonymousClass3SB r12, C236419g r13) {
        AnonymousClass3SB r0;
        String str = null;
        try {
            List<Address> fromLocation = new Geocoder(r13.A0D.A00, C18820ts.A01(r13.A0Q.A00)).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation != null) {
                for (Address locality : fromLocation) {
                    str = locality.getLocality();
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
        } catch (IOException | IllegalArgumentException unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            C231517j r02 = r13.A0I;
            DeviceJid deviceJid = r12.A07;
            C231917n r4 = r02.A04;
            ContentValues contentValues = new ContentValues();
            contentValues.put("place_name", str);
            AnonymousClass1M0 A042 = r4.A02.A04();
            try {
                A042.A02.A01(contentValues, "devices", "device_id = ?", "setDevicePlaceName/UPDATE_DEVICES", new String[]{deviceJid.getRawString()});
                synchronized (r4) {
                    C20070wy r03 = r4.A00;
                    if (!(r03 == null || (r0 = (AnonymousClass3SB) r03.get(deviceJid)) == null)) {
                        r0.A03 = str;
                    }
                }
                A042.close();
                A05(r12, r13);
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    public static void A04(C20760y7 r2, C236419g r3, boolean z) {
        r3.A0L.execute(new C35311iU(r2, r3, z));
    }

    public static void A06(C236419g r4, String str) {
        synchronized (r4.A0N) {
            C63133Iw r2 = r4.A00;
            if (r2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("companion-device-manager/device login canceled: ");
                sb.append(r2.A02.A07);
                Log.i(sb.toString());
                r4.A0C(r4.A00.A02.A07, str, true, false);
                r4.A00 = null;
                r4.A03 = false;
            }
        }
    }

    public C79593ty A07() {
        C79593ty r4 = new C79593ty();
        if (!this.A0K.A01.A2H()) {
            r4.A0C(false);
            return r4;
        }
        this.A0M.Box(new AnonymousClass4WQ(r4, this, 1), new Void[0]);
        return r4;
    }

    public ArrayList A09() {
        if (!this.A0K.A01.A2H()) {
            return new ArrayList();
        }
        return new ArrayList(this.A0I.A04.A00().values());
    }

    public ArrayList A0A() {
        if (!this.A0K.A01.A2H()) {
            return new ArrayList();
        }
        return new ArrayList(this.A0I.A04().values());
    }

    public void A0B(C20760y7 r3, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("companion-device-manager/onDeviceRemovedByServer/devices: ");
        sb.append(r3);
        Log.i(sb.toString());
        C18740tg.A0D(!AnonymousClass6XG.A02(C67633aE.A00, r3), "companion-device-manager/hostedDevice present when not supported in build");
        Log.i("companion-device-manager/onDeviceRemovedByServer/removing device locally");
        A04(r3, this, z);
    }

    public void A0D(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("companion-device-manager/logoutAllCompanionDevicesAndNotify/remove on error: ");
        boolean z2 = z;
        sb.append(z2);
        sb.append(", removalReason ");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        C20760y7 keySet = this.A0I.A04.A00().keySet();
        if (keySet.isEmpty()) {
            A03(keySet, this);
            return;
        }
        C76863pZ A012 = A01(keySet, str2, z2, false);
        A012.A00 = keySet;
        AnonymousClass19A r9 = A012.A02;
        String A092 = r9.A09();
        boolean A0K2 = r9.A0K(A012, new C203399nx(new C203399nx("remove-companion-device", new AnonymousClass1AL[]{new AnonymousClass1AL("all", "true"), new AnonymousClass1AL("reason", A012.A03)}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) C177588e2.A00, "to"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "md"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set")}), A092, 237, 32000);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("app/sendRemoveAllDevicesRequest success: ");
        sb2.append(A0K2);
        Log.i(sb2.toString());
        if (!A0K2) {
            A012.A01.BWc(keySet, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r1 != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.C20070wy r13, boolean r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = "companion-device-manager/refreshDevices"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17j r0 = r12.A0I
            X.0wy r2 = r0.A04()
            r9 = r2
            java.lang.Object r7 = r12.A0N
            monitor-enter(r7)
            X.3Iw r0 = r12.A00     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0025
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01db }
            r1.<init>(r2)     // Catch:{ all -> 0x01db }
            X.3Iw r0 = r12.A00     // Catch:{ all -> 0x01db }
            X.3SB r0 = r0.A02     // Catch:{ all -> 0x01db }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x01db }
            r1.remove(r0)     // Catch:{ all -> 0x01db }
            X.0wy r9 = X.C20070wy.copyOf((java.util.Map) r1)     // Catch:{ all -> 0x01db }
        L_0x0025:
            monitor-exit(r7)     // Catch:{ all -> 0x01db }
            r6 = 1
            r5 = 0
            if (r13 == 0) goto L_0x01cc
            X.15o r3 = new X.15o
            r3.<init>()
            X.0y7 r0 = r9.entrySet()
            X.14x r8 = r0.iterator()
        L_0x0037:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            boolean r0 = r13.containsKey(r0)
            if (r0 == 0) goto L_0x0067
            if (r14 == 0) goto L_0x0037
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r0 = r13.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r4.getValue()
            X.3SB r0 = (X.AnonymousClass3SB) r0
            int r0 = r0.A04
            if (r1 == r0) goto L_0x0037
        L_0x0067:
            java.lang.Object r0 = r4.getKey()
            r3.add((java.lang.Object) r0)
            goto L_0x0037
        L_0x006f:
            X.0y7 r8 = r3.build()
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0094
            int r3 = r8.size()
            int r0 = r9.size()
            r1 = 0
            if (r3 != r0) goto L_0x0085
            r1 = 1
        L_0x0085:
            X.0wQ r0 = r12.A09
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0090
            r0 = 1
            if (r1 == 0) goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            r12.A0B(r8, r0)
        L_0x0094:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            X.0y7 r0 = r13.entrySet()
            X.14x r9 = r0.iterator()
        L_0x00a1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r1 = r3.getKey()
            X.0wQ r0 = r12.A09
            r0.A0G()
            X.13x r0 = r0.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.Object r0 = r3.getKey()
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x00e2
            if (r14 == 0) goto L_0x00a1
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r0 = r2.get(r0)
            X.3SB r0 = (X.AnonymousClass3SB) r0
            int r1 = r0.A04
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 == r0) goto L_0x00a1
        L_0x00e2:
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r3.getValue()
            r4.put(r1, r0)
            goto L_0x00a1
        L_0x00ee:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01c5
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x00fc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r3 = r11.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            monitor-enter(r7)
            X.3Iw r0 = r12.A00     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x014f
            X.3SB r0 = r0.A02     // Catch:{ all -> 0x01c2 }
            com.whatsapp.jid.DeviceJid r1 = r0.A07     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x01c2 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x014f
            if (r15 == 0) goto L_0x01bf
            X.3Iw r9 = r12.A00     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r1.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "companion-device-manager/device registered: "
            r1.append(r0)     // Catch:{ all -> 0x01c2 }
            X.3SB r0 = r9.A02     // Catch:{ all -> 0x01c2 }
            com.whatsapp.jid.DeviceJid r0 = r0.A07     // Catch:{ all -> 0x01c2 }
            r1.append(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Iterable r0 = r12.getObservers()     // Catch:{ all -> 0x01c2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01c2 }
        L_0x013f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01c2 }
            X.192 r0 = (X.AnonymousClass192) r0     // Catch:{ all -> 0x01c2 }
            r0.BVZ(r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x013f
        L_0x014f:
            X.0wQ r0 = r12.A09     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.A0L()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0161
            X.0wk r2 = r12.A0L     // Catch:{ all -> 0x01c2 }
            r0 = 38
            X.1j7 r1 = new X.1j7     // Catch:{ all -> 0x01c2 }
            r1.<init>(r12, r3, r0)     // Catch:{ all -> 0x01c2 }
            goto L_0x01bc
        L_0x0161:
            java.lang.Object r1 = r3.getKey()     // Catch:{ all -> 0x01c2 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "unknown_companion"
            r12.A0C(r1, r0, r6, r5)     // Catch:{ all -> 0x01c2 }
            X.0wN r3 = r12.A06     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "ContactSyncDevicesUpdater/update add unknown device of self"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r1.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "toAdd="
            r1.append(r0)     // Catch:{ all -> 0x01c2 }
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x01c2 }
            r1.append(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c2 }
            r3.A0E(r2, r0, r5)     // Catch:{ all -> 0x01c2 }
            goto L_0x01bf
        L_0x0189:
            X.19n r10 = r12.A0A     // Catch:{ all -> 0x01c2 }
            android.content.SharedPreferences r0 = X.C237119n.A00(r10)     // Catch:{ all -> 0x01c2 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "syncd_last_fatal_error_time"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x01c2 }
            r0.apply()     // Catch:{ all -> 0x01c2 }
            X.0wo r0 = r12.A0C     // Catch:{ all -> 0x01c2 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x01c2 }
            android.content.SharedPreferences r0 = X.C237119n.A00(r10)     // Catch:{ all -> 0x01c2 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "syncd_last_device_reg_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ all -> 0x01c2 }
            r0.apply()     // Catch:{ all -> 0x01c2 }
            X.0wk r2 = r12.A0L     // Catch:{ all -> 0x01c2 }
            r0 = 42
            X.1j7 r1 = new X.1j7     // Catch:{ all -> 0x01c2 }
            r1.<init>(r12, r9, r0)     // Catch:{ all -> 0x01c2 }
        L_0x01bc:
            r2.execute(r1)     // Catch:{ all -> 0x01c2 }
        L_0x01bf:
            monitor-exit(r7)     // Catch:{ all -> 0x01c2 }
            goto L_0x00fc
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01c2 }
            throw r0
        L_0x01c5:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            return r0
        L_0x01cc:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01da
            X.0y7 r0 = r9.keySet()
            r12.A0B(r0, r5)
            return r6
        L_0x01da:
            return r5
        L_0x01db:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01db }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C236419g.A0E(X.0wy, boolean, boolean):boolean");
    }

    public boolean A0F(DeviceJid deviceJid) {
        boolean z;
        synchronized (this.A0N) {
            DeviceJid deviceJid2 = this.A01;
            if (deviceJid2 == null || !deviceJid2.equals(deviceJid)) {
                C63133Iw r0 = this.A00;
                if (r0 == null || !r0.A02.A07.equals(deviceJid) || !this.A03) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean BJl(Message message, int i) {
        long A002;
        if (i != 213) {
            return false;
        }
        if (message == null) {
            return true;
        }
        C203399nx r4 = (C203399nx) message.obj;
        DeviceJid deviceJid = (DeviceJid) r4.A0Y(DeviceJid.class, "from");
        if (deviceJid == null) {
            return true;
        }
        if (!this.A09.A0N(deviceJid)) {
            return true;
        }
        String A0i = r4.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        if (A0i == null || "available".equals(A0i)) {
            A002 = C19970wo.A00(this.A0C);
            this.A0O.add(deviceJid);
        } else if (!"unavailable".equals(A0i)) {
            return true;
        } else {
            A002 = AnonymousClass9Ze.A00(r4);
            this.A0O.remove(deviceJid);
        }
        if (A002 == 0) {
            return true;
        }
        this.A0M.Boy(new C35251iO(this, deviceJid, 5, A002));
        return true;
    }

    public static void A03(C20760y7 r2, C236419g r3) {
        for (AnonymousClass192 BVa : r3.getObservers()) {
            BVa.BVa(r2);
        }
    }

    public static void A05(AnonymousClass3SB r2, C236419g r3) {
        for (AnonymousClass192 BVb : r3.getObservers()) {
            BVb.BVb(r2);
        }
    }

    public void A0C(DeviceJid deviceJid, String str, boolean z, boolean z2) {
        if (AnonymousClass143.A0I(deviceJid)) {
            StringBuilder sb = new StringBuilder();
            sb.append("companion-device-manager/logoutDeviceAndNotify: skipping LID device: ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            return;
        }
        if (!(str == "user_initiated" || str == "smb_subscription_deactivated" || str == "account_sync_timeout" || str == "critical_sync_timeout" || str == "syncd_error_during_bootstrap")) {
            Map map = this.A0R;
            if (map.containsKey(deviceJid) && C19970wo.A00(this.A0C) - ((Number) map.get(deviceJid)).longValue() < 3600000) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("companion-device-manager/logoutDeviceAndNotify: ");
        sb2.append(deviceJid);
        sb2.append(", removalReason ");
        sb2.append(str);
        sb2.append(", remove on error: ");
        sb2.append(z);
        Log.i(sb2.toString());
        this.A0R.put(deviceJid, Long.valueOf(C19970wo.A00(this.A0C)));
        A01(C20760y7.of(deviceJid), str, z, z2).A00(deviceJid);
    }
}
