package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.location.Location;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1P5  reason: invalid class name */
public class AnonymousClass1P5 {
    public int A00 = 0;
    public long A01 = 0;
    public Long A02 = null;
    public Map A03;
    public Map A04;
    public C63593Kq A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final C19730wQ A07;
    public final AnonymousClass164 A08;
    public final C232417s A09;
    public final AnonymousClass16D A0A;
    public final C236519h A0B;
    public final C21060yb A0C;
    public final C19970wo A0D;
    public final C19630wG A0E;
    public final AnonymousClass189 A0F;
    public final AnonymousClass187 A0G;
    public final C24381Cf A0H;
    public final AnonymousClass1P6 A0I;
    public final AnonymousClass1P7 A0J;
    public final AnonymousClass1P9 A0K;
    public final AnonymousClass1PA A0L;
    public final C19770wU A0M;
    public final AnonymousClass005 A0N;
    public final AnonymousClass005 A0O;
    public final Object A0P = new Object();
    public final Object A0Q = new Object();
    public final Object A0R = new Object();
    public final HashSet A0S = new HashSet();
    public final List A0T = new ArrayList();
    public final List A0U = new ArrayList();
    public final Map A0V = new HashMap();
    public final Map A0W = new HashMap();
    public final Map A0X = new HashMap();
    public final Map A0Y = new HashMap();
    public final Map A0Z = new HashMap();
    public final AnonymousClass005 A0a;
    public final Runnable A0b = new C35711j8(this, 6);
    public final Runnable A0c = new C35711j8(this, 5);

    public static boolean A0G(long j, long j2) {
        return j == 0 || j > j2;
    }

    public void A0T() {
        C63593Kq r3;
        int i;
        synchronized (this) {
            r3 = this.A05;
        }
        if (!C20800yB.A01(C21000yV.A02, this.A0J.A01, 4718)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.A0R) {
                for (Map.Entry entry : A06(this).entrySet()) {
                    Iterator it = ((AnonymousClass38X) entry.getValue()).A03.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass143.A0I((UserJid) it.next())) {
                                arrayList.add((AnonymousClass11F) entry.getKey());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AnonymousClass11F r2 = (AnonymousClass11F) it2.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append("LocationSharingManager/checkLidRollback rolling back ");
                    sb.append(r2);
                    Log.i(sb.toString());
                    A0V(r2);
                }
            }
        }
        if (r3 != null) {
            if (A0c()) {
                synchronized (this.A0R) {
                    boolean z = false;
                    for (AnonymousClass38X r11 : A06(this).values()) {
                        long j = r11.A01;
                        C64933Qa r6 = r11.A02;
                        C46902br A032 = A03(this, r6);
                        if (!(A032 == null || j == 0)) {
                            C63593Kq r9 = r11.A00;
                            if (r9 == null) {
                                r9 = A032.A02;
                                if (r9 != null) {
                                    r11.A00 = r9;
                                    z = true;
                                } else {
                                    long j2 = r3.A05;
                                    if (j >= j2 && j <= j2 + 240000) {
                                        r9 = new C63593Kq(r3.A06);
                                        r11.A00 = r9;
                                        r9.A00(r3);
                                        this.A08.A01(new SendFinalLiveLocationNotificationJob(r6, r3, (int) ((r3.A05 - A032.A0I) / 1000)));
                                        z = true;
                                    }
                                }
                            }
                            if (r9.A05 + AnonymousClass6X5.A0L < j) {
                                long j3 = r3.A05;
                                if (j >= j3 && j <= j3 + AnonymousClass6X5.A0L) {
                                    r9.A00(r3);
                                    this.A08.A01(new SendFinalLiveLocationNotificationJob(r6, r3, (int) ((r3.A05 - A032.A0I) / 1000)));
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        A0C(this);
                    }
                }
                if (!A0c()) {
                    synchronized (this.A0P) {
                        i = (~1) & this.A00;
                        this.A00 = i;
                    }
                    if (i == 0) {
                        LocationSharingService.A00(this.A0E.A00);
                    }
                }
            }
            this.A0M.Boy(new C35721j9(this, r3, 33));
            return;
        }
        Log.w("LocationSharingManager/sendLatestLocation/try to send location, but no location available");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        r2 = r9.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7 = X.C19970wo.A00(r9.A0D);
        r6 = (android.util.Pair) r2.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r6 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        r0 = r7 - ((java.lang.Long) r6.first).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r0 >= 60000) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (((java.lang.Integer) r6.second).intValue() < r12) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource=");
        r4.append(r10);
        r4.append("; timeElapsed=");
        r4.append(r0);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource=");
        r1.append(r10);
        r1.append("; retryCount=");
        r1.append(r12);
        com.whatsapp.util.Log.i(r1.toString());
        r2.put(r10, android.util.Pair.create(java.lang.Long.valueOf(r7), java.lang.Integer.valueOf(r12)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r3 = r9.A0L.A01;
        r3.A0G(new X.C203399nx(new X.C203399nx("encrypt", (X.AnonymousClass1AL[]) null, new X.C203399nx[]{new X.C203399nx("request", new X.AnonymousClass1AL[]{new X.AnonymousClass1AL("retry", java.lang.String.valueOf(r12))}), new X.C203399nx("registration", r11, (X.AnonymousClass1AL[]) null)}), "notification", new X.AnonymousClass1AL[]{new X.AnonymousClass1AL((java.lang.String) androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A09()), new X.AnonymousClass1AL((com.whatsapp.jid.Jid) r10, "to"), new X.AnonymousClass1AL((java.lang.String) androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location")}), 125);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x014f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Y(com.whatsapp.jid.UserJid r10, byte[] r11, int r12) {
        /*
            r9 = this;
            r0 = 4
            if (r12 <= r0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/reached max retry; remote_resource="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0020:
            java.lang.Object r2 = r9.A0Q
            monitor-enter(r2)
            java.util.Map r0 = A05(r9)     // Catch:{ all -> 0x0153 }
            r4 = 0
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x0030:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0153 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0153 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0153 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0153 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0153 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0153 }
        L_0x004a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0153 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0153 }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x004a
            r4 = 1
            goto L_0x0030
        L_0x005e:
            if (r4 != 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0153 }
            r1.<init>()     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/should not receive location updates from this user; jid="
            r1.append(r0)     // Catch:{ all -> 0x0153 }
            r1.append(r10)     // Catch:{ all -> 0x0153 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0153 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0153 }
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            return
        L_0x0076:
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            java.util.Map r2 = r9.A0V
            monitor-enter(r2)
            X.0wo r0 = r9.A0D     // Catch:{ all -> 0x0150 }
            long r7 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0150 }
            java.lang.Object r6 = r2.get(r10)     // Catch:{ all -> 0x0150 }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x0150 }
            if (r6 == 0) goto L_0x00c1
            java.lang.Object r0 = r6.first     // Catch:{ all -> 0x0150 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0150 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0150 }
            long r0 = r7 - r3
            r4 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x00c1
            java.lang.Object r3 = r6.second     // Catch:{ all -> 0x0150 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0150 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0150 }
            if (r3 < r12) goto L_0x00c1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r4.<init>()     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource="
            r4.append(r3)     // Catch:{ all -> 0x0150 }
            r4.append(r10)     // Catch:{ all -> 0x0150 }
            java.lang.String r3 = "; timeElapsed="
            r4.append(r3)     // Catch:{ all -> 0x0150 }
            r4.append(r0)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            return
        L_0x00c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0150 }
            r1.<init>()     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource="
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r10)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = "; retryCount="
            r1.append(r0)     // Catch:{ all -> 0x0150 }
            r1.append(r12)     // Catch:{ all -> 0x0150 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0150 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0150 }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0150 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0150 }
            android.util.Pair r0 = android.util.Pair.create(r1, r0)     // Catch:{ all -> 0x0150 }
            r2.put(r10, r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            X.1PA r0 = r9.A0L
            X.19A r3 = r0.A01
            java.lang.String r2 = r3.A09()
            r0 = 3
            X.1AL[] r4 = new X.AnonymousClass1AL[r0]
            java.lang.String r1 = "id"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r8 = 0
            r4[r8] = r0
            java.lang.String r1 = "to"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r1)
            r7 = 1
            r4[r7] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "location"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r4[r0] = r1
            X.9nx[] r5 = new X.C203399nx[r0]
            X.1AL[] r6 = new X.AnonymousClass1AL[r7]
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "retry"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r6[r8] = r0
            java.lang.String r1 = "request"
            X.9nx r0 = new X.9nx
            r0.<init>(r1, r6)
            r5[r8] = r0
            java.lang.String r2 = "registration"
            r1 = 0
            X.9nx r0 = new X.9nx
            r0.<init>((java.lang.String) r2, (byte[]) r11, (X.AnonymousClass1AL[]) r1)
            r5[r7] = r0
            java.lang.String r0 = "encrypt"
            X.9nx r2 = new X.9nx
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1AL[]) r1, (X.C203399nx[]) r5)
            java.lang.String r0 = "notification"
            X.9nx r1 = new X.9nx
            r1.<init>((X.C203399nx) r2, (java.lang.String) r0, (X.AnonymousClass1AL[]) r4)
            r0 = 125(0x7d, float:1.75E-43)
            r3.A0G(r1, r0)
            return
        L_0x0150:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            throw r0
        L_0x0153:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0153 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0Y(com.whatsapp.jid.UserJid, byte[], int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0g(com.whatsapp.jid.UserJid r9, int r10) {
        /*
            r8 = this;
            r7 = 0
            r0 = 4
            if (r10 <= r0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/reached max retry; remote_resource="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; retryCount="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x0021:
            java.lang.Object r4 = r8.A0R
            monitor-enter(r4)
            java.util.HashSet r0 = A04(r8)     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0074
            X.0wo r0 = r8.A0D     // Catch:{ all -> 0x007b }
            long r1 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x007b }
            java.util.Map r0 = r8.A0W     // Catch:{ all -> 0x007b }
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x007b }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x0076
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x007b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x007b }
            long r5 = r0.longValue()     // Catch:{ all -> 0x007b }
            long r1 = r1 - r5
            r5 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            java.lang.Object r0 = r3.second     // Catch:{ all -> 0x007b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x007b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x007b }
            if (r0 < r10) goto L_0x0076
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r3.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/retry too soon; remote_resource="
            r3.append(r0)     // Catch:{ all -> 0x007b }
            r3.append(r9)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = "; timeElapsed="
            r3.append(r0)     // Catch:{ all -> 0x007b }
            r3.append(r1)     // Catch:{ all -> 0x007b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x007b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            return r7
        L_0x0076:
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            r0 = 1
            return r0
        L_0x0079:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x007b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0g(com.whatsapp.jid.UserJid, int):boolean");
    }

    public static long A00(AnonymousClass1P5 r10) {
        long j;
        synchronized (r10.A0R) {
            AnonymousClass005 r9 = r10.A0a;
            long j2 = ((SharedPreferences) ((C19420v0) r9.get()).A00.get()).getLong("live_location_sequence_number", -1);
            long A042 = r10.A0D.A04() * 1000;
            if (A042 > j2) {
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/getNextSequenceNumber; got a new sequence number; currentSequenceNumber=");
                sb.append(A042);
                Log.i(sb.toString());
                j2 = A042;
            }
            j = j2 + 1;
            C19420v0.A00((C19420v0) r9.get()).putLong("live_location_sequence_number", j).apply();
        }
        return j;
    }

    public static C63593Kq A02(UserJid userJid, AnonymousClass8SX r6, C46902br r7) {
        C173448Rs r3 = r6.liveLocationMessage_;
        if (r3 == null) {
            r3 = C173448Rs.DEFAULT_INSTANCE;
        }
        C63593Kq r62 = new C63593Kq(userJid);
        r62.A00 = r3.degreesLatitude_;
        r62.A01 = r3.degreesLongitude_;
        r62.A03 = r3.accuracyInMeters_;
        int i = r3.bitField0_;
        if ((i & 8) != 0) {
            float f = r3.speedInMps_;
            if (!Float.isNaN(f)) {
                r62.A02 = f;
            }
        }
        r62.A04 = r3.degreesClockwiseFromMagneticNorth_;
        if (!((i & 128) == 0 || r7 == null)) {
            r62.A05 = r7.A0I + (((long) r3.timeOffset_) * 1000);
        }
        return r62;
    }

    public static C46902br A03(AnonymousClass1P5 r1, C64933Qa r2) {
        AnonymousClass3T1 A032 = ((AnonymousClass1A1) r1.A0O.get()).A03(r2);
        if (!(A032 instanceof C46902br) || A032.A1P) {
            return null;
        }
        return (C46902br) A032;
    }

    public static Map A05(AnonymousClass1P5 r11) {
        Map map;
        Cursor A092;
        AnonymousClass32R r0;
        synchronized (r11.A0Q) {
            if (r11.A03 == null) {
                Map map2 = r11.A0Z;
                AnonymousClass1P9 r8 = r11.A0K;
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                try {
                    AnonymousClass1M0 A032 = r8.A00.get();
                    try {
                        A092 = A032.A02.A09(C56242vy.A00, "getAllUserLocations/QUERY_LOCATION_CACHE", (String[]) null);
                        while (A092.moveToNext()) {
                            UserJid A022 = UserJid.Companion.A02(A092.getString(0));
                            if (A022 == null) {
                                r0 = null;
                            } else {
                                r0 = new AnonymousClass32R(A092, A022);
                            }
                            if (r0 != null) {
                                C63593Kq r1 = r0.A00;
                                hashMap.put(r1.A06, r1);
                            }
                        }
                        A092.close();
                        A032.close();
                        StringBuilder sb = new StringBuilder();
                        sb.append("LocationSharingStore/getAllUserLocations/returned ");
                        sb.append(hashMap.size());
                        sb.append(" user locations sharer | time: ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        Log.i(sb.toString());
                        map2.putAll(hashMap);
                        HashSet hashSet = new HashSet(map2.keySet());
                        r11.A03 = new HashMap();
                        AnonymousClass1P9.A02(r8, C19970wo.A00(r11.A0D), false);
                        ArrayList A002 = AnonymousClass1P9.A00(r8, 0, false);
                        HashMap hashMap2 = new HashMap();
                        Iterator it = A002.iterator();
                        while (it.hasNext()) {
                            C64303Nl r3 = (C64303Nl) it.next();
                            AnonymousClass11F r12 = r3.A01;
                            if (!hashMap2.containsKey(r12)) {
                                hashMap2.put(r12, new HashMap());
                            }
                            UserJid userJid = r3.A02;
                            ((Map) hashMap2.get(r12)).put(userJid, new AnonymousClass375(userJid, r3.A03, r3.A00));
                        }
                        HashSet hashSet2 = new HashSet();
                        for (AnonymousClass11F r32 : hashMap2.keySet()) {
                            if (r11.A0A.A0A(r32) != null) {
                                if (!r11.A03.containsKey(r32)) {
                                    r11.A03.put(r32, new HashMap());
                                }
                                Map map3 = (Map) hashMap2.get(r32);
                                C18740tg.A06(map3);
                                Map map4 = (Map) r11.A03.get(r32);
                                C18740tg.A06(map4);
                                for (UserJid userJid2 : map3.keySet()) {
                                    map4.put(userJid2, (AnonymousClass375) map3.get(userJid2));
                                    hashSet.remove(userJid2);
                                }
                            } else {
                                hashSet2.add(r32);
                            }
                        }
                        if (!hashSet2.isEmpty()) {
                            AnonymousClass1P9.A03(r8, hashSet2, false);
                        }
                        if (!hashSet.isEmpty()) {
                            r8.A06(hashSet);
                        }
                        A0B(r11);
                    } catch (Throwable th) {
                        A032.close();
                        throw th;
                    }
                } catch (Exception e) {
                    Log.e("LocationSharingStore/getAllUserLocations/error getting user locations", e);
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            map = r11.A03;
        }
        return map;
        throw th;
    }

    public static Map A06(AnonymousClass1P5 r11) {
        Map map;
        synchronized (r11.A0R) {
            if (r11.A04 == null) {
                r11.A04 = new HashMap();
                C19970wo r7 = r11.A0D;
                long A002 = C19970wo.A00(r7);
                AnonymousClass1P9 r6 = r11.A0K;
                AnonymousClass1P9.A02(r6, A002 - 604800000, true);
                ArrayList A003 = AnonymousClass1P9.A00(r6, C19970wo.A00(r7), true);
                HashMap hashMap = new HashMap(A003.size());
                Iterator it = A003.iterator();
                while (it.hasNext()) {
                    C64303Nl r8 = (C64303Nl) it.next();
                    AnonymousClass11F r9 = r8.A01;
                    if (!hashMap.containsKey(r9)) {
                        hashMap.put(r9, new AnonymousClass38X(r8.A03, (List) null, r8.A00));
                    }
                    Object obj = hashMap.get(r9);
                    C18740tg.A06(obj);
                    if (r8.A03.equals(((AnonymousClass38X) obj).A02)) {
                        ((AnonymousClass38X) hashMap.get(r9)).A03.add(r8.A02);
                    }
                }
                HashSet hashSet = new HashSet();
                for (AnonymousClass11F r2 : hashMap.keySet()) {
                    if (r11.A0A.A0A(r2) != null) {
                        r11.A04.put(r2, (AnonymousClass38X) hashMap.get(r2));
                    } else {
                        hashSet.add(r2);
                    }
                }
                if (!hashSet.isEmpty()) {
                    AnonymousClass1P9.A03(r6, hashSet, true);
                }
                HashSet hashSet2 = r11.A0S;
                hashSet2.addAll(r6.A04());
                HashSet hashSet3 = new HashSet(hashSet2);
                hashSet3.removeAll(A04(r11));
                if (!hashSet3.isEmpty()) {
                    r11.A0S();
                }
                A0C(r11);
            }
            map = r11.A04;
        }
        return map;
    }

    private void A07() {
        Context context = this.A0E.A00;
        PendingIntent A012 = C65743Th.A01(context, 0, new Intent(context, FinalLiveLocationBroadcastReceiver.class), 536870912);
        if (A012 != null) {
            AlarmManager A052 = this.A0C.A05();
            if (A052 != null) {
                A052.cancel(A012);
            } else {
                Log.w("LocationSharingManager/cancelFinalLiveLocationUpdateAlarm/AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public static void A08(AnonymousClass11F r6, UserJid userJid, AnonymousClass1P5 r8) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/onReceiveStopSharing; jid=");
        sb.append(r6);
        sb.append("; participant=");
        sb.append(userJid);
        Log.i(sb.toString());
        synchronized (r8.A0Q) {
            Map A052 = A05(r8);
            Map map = (Map) A052.get(r6);
            if (map != null) {
                UserJid userJid2 = userJid;
                if (userJid == null) {
                    userJid2 = r6;
                }
                A0D(r8, (AnonymousClass375) map.remove(userJid2));
                AnonymousClass1P9 r2 = r8.A0K;
                C18740tg.A06(r6);
                if (userJid != null) {
                    AnonymousClass1P9.A01(r6, r2, Collections.singletonList(userJid), false);
                } else {
                    AnonymousClass1P9.A03(r2, Collections.singletonList(r6), false);
                }
                if (map.isEmpty()) {
                    A052.remove(r6);
                }
            }
            A0F(r8, A052);
        }
        for (AnonymousClass4U8 BeJ : r8.A0U) {
            BeJ.BeJ(r6, userJid);
        }
        A0B(r8);
        r8.A06.post(new C35721j9(r8, r6, 43));
    }

    public static void A09(AnonymousClass1P5 r13) {
        ArrayList arrayList = new ArrayList();
        synchronized (r13.A0Q) {
            Map A052 = A05(r13);
            A052.size();
            long A002 = C19970wo.A00(r13.A0D);
            for (Map.Entry entry : A052.entrySet()) {
                for (AnonymousClass375 r5 : ((Map) entry.getValue()).values()) {
                    long j = r5.A00;
                    if (j != 0 && j <= A002) {
                        arrayList.add(Pair.create((AnonymousClass11F) entry.getKey(), r5.A01));
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            A08((AnonymousClass11F) pair.first, (UserJid) pair.second, r13);
        }
        A0B(r13);
    }

    public static void A0A(AnonymousClass1P5 r4) {
        synchronized (r4.A0R) {
            HashSet A042 = A04(r4);
            HashSet hashSet = new HashSet(r4.A0S);
            hashSet.removeAll(A042);
            if (!hashSet.isEmpty()) {
                r4.A0S();
            }
        }
    }

    public static void A0B(AnonymousClass1P5 r12) {
        Long l;
        Handler handler = r12.A06;
        Runnable runnable = r12.A0b;
        handler.removeCallbacks(runnable);
        synchronized (r12.A0Q) {
            l = null;
            for (Map values : A05(r12).values()) {
                for (AnonymousClass375 r7 : values.values()) {
                    if (l == null || r7.A00 < l.longValue()) {
                        l = Long.valueOf(r7.A00);
                    }
                }
            }
        }
        if (l != null) {
            long A002 = C19970wo.A00(r12.A0D);
            long longValue = l.longValue();
            if (longValue > A002) {
                handler.postDelayed(runnable, longValue - A002);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008e, code lost:
        if (r0 < r21.longValue()) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.AnonymousClass1P5 r31) {
        /*
            r12 = r31
            android.os.Handler r0 = r12.A06
            r31 = r0
            java.lang.Runnable r0 = r12.A0c
            r30 = r0
            r1 = r31
            r1.removeCallbacks(r0)
            X.0wo r0 = r12.A0D
            r29 = r0
            long r8 = X.C19970wo.A00(r29)
            X.005 r0 = r12.A0a
            r28 = r0
            java.lang.Object r0 = r28.get()
            X.0v0 r0 = (X.C19420v0) r0
            X.005 r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r27 = "live_location_sharing_session_total_time"
            r6 = 0
            r0 = r27
            long r25 = r1.getLong(r0, r6)
            java.lang.Object r0 = r28.get()
            X.0v0 r0 = (X.C19420v0) r0
            X.005 r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r24 = "live_location_sharing_session_start_time"
            r0 = r24
            long r13 = r1.getLong(r0, r6)
            java.lang.Object r0 = r28.get()
            X.0v0 r0 = (X.C19420v0) r0
            X.005 r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r23 = "live_location_sharing_session_end_time"
            r0 = r23
            long r19 = r1.getLong(r0, r6)
            java.lang.Object r0 = r12.A0R
            r22 = r0
            monitor-enter(r22)
            java.util.Map r0 = A06(r12)     // Catch:{ all -> 0x01af }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x01af }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x01af }
            r17 = 0
            r21 = r17
            r4 = 0
            r2 = 0
        L_0x0078:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r11 = r18.next()     // Catch:{ all -> 0x01af }
            X.38X r11 = (X.AnonymousClass38X) r11     // Catch:{ all -> 0x01af }
            if (r21 == 0) goto L_0x0090
            long r0 = r11.A01     // Catch:{ all -> 0x01af }
            long r15 = r21.longValue()     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x0096
        L_0x0090:
            long r0 = r11.A01     // Catch:{ all -> 0x01af }
            java.lang.Long r21 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01af }
        L_0x0096:
            if (r17 == 0) goto L_0x00a0
            long r15 = r17.longValue()     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a4
        L_0x00a0:
            java.lang.Long r17 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01af }
        L_0x00a4:
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0078
            X.3Kq r11 = r11.A00     // Catch:{ all -> 0x01af }
            if (r11 != 0) goto L_0x00b4
            boolean r10 = A0G(r2, r0)     // Catch:{ all -> 0x01af }
            if (r10 == 0) goto L_0x0078
            r2 = r0
            goto L_0x0078
        L_0x00b4:
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0078
            long r10 = r11.A05     // Catch:{ all -> 0x01af }
            r15 = 30000(0x7530, double:1.4822E-319)
            long r10 = r10 + r15
            int r15 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x0078
            boolean r10 = A0G(r4, r0)     // Catch:{ all -> 0x01af }
            if (r10 == 0) goto L_0x0078
            r4 = r0
            goto L_0x0078
        L_0x00c9:
            if (r17 == 0) goto L_0x00d9
            long r0 = r17.longValue()     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d9
            int r10 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00e9
            r13 = r8
            goto L_0x00e9
        L_0x00d9:
            r0 = r19
            long r6 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x01af }
            long r6 = r6 - r13
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            long r25 = r25 + r6
            r13 = 0
            r0 = 0
        L_0x00e9:
            long r19 = X.C19970wo.A00(r29)     // Catch:{ all -> 0x01af }
            r6 = 0
            int r11 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r11 >= 0) goto L_0x0103
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0103
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01ad }
            r12.A02 = r2     // Catch:{ all -> 0x01ad }
            r12.A01 = r6     // Catch:{ all -> 0x01ad }
            r12.A07()     // Catch:{ all -> 0x01ad }
            goto L_0x0133
        L_0x0103:
            r17 = 30000(0x7530, double:1.4822E-319)
            if (r11 >= 0) goto L_0x0110
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01ad }
            r12.A02 = r2     // Catch:{ all -> 0x01ad }
            long r4 = r4 - r17
            goto L_0x0131
        L_0x0110:
            r15 = 180000(0x2bf20, double:8.8932E-319)
            int r10 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r10 >= 0) goto L_0x0120
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01ad }
            r12.A02 = r4     // Catch:{ all -> 0x01ad }
            long r4 = r2 - r15
            goto L_0x0131
        L_0x0120:
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x01ad }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01ad }
            r12.A02 = r10     // Catch:{ all -> 0x01ad }
            long r2 = r2 - r15
            long r4 = r4 - r17
            long r4 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x01ad }
        L_0x0131:
            r12.A01 = r4     // Catch:{ all -> 0x01ad }
        L_0x0133:
            long r4 = r12.A01     // Catch:{ all -> 0x01ad }
            long r4 = r4 - r19
            java.lang.Long r2 = r12.A02     // Catch:{ all -> 0x01ad }
            long r10 = r2.longValue()     // Catch:{ all -> 0x01ad }
            int r2 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x0145
            r12.A07()     // Catch:{ all -> 0x01ad }
            goto L_0x0178
        L_0x0145:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x014d
            r12.A0P()     // Catch:{ all -> 0x01ad }
            goto L_0x0178
        L_0x014d:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ad }
            long r2 = r2 + r4
            X.0yb r4 = r12.A0C     // Catch:{ all -> 0x01ad }
            android.app.AlarmManager r4 = r4.A05()     // Catch:{ all -> 0x01ad }
            if (r4 == 0) goto L_0x0173
            X.0wG r4 = r12.A0E     // Catch:{ all -> 0x01ad }
            android.content.Context r7 = r4.A00     // Catch:{ all -> 0x01ad }
            r6 = 0
            java.lang.Class<com.whatsapp.location.FinalLiveLocationBroadcastReceiver> r4 = com.whatsapp.location.FinalLiveLocationBroadcastReceiver.class
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x01ad }
            r5.<init>(r7, r4)     // Catch:{ all -> 0x01ad }
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = X.C65743Th.A01(r7, r6, r5, r4)     // Catch:{ all -> 0x01ad }
            X.19h r5 = r12.A0B     // Catch:{ all -> 0x01ad }
            r4 = 2
            r5.A00(r6, r4, r2)     // Catch:{ all -> 0x01ad }
            goto L_0x0178
        L_0x0173:
            java.lang.String r2 = "LocationSharingManager/startFinalLiveLocationUpdateAlarm/AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x01ad }
        L_0x0178:
            java.lang.Object r2 = r28.get()     // Catch:{ all -> 0x01af }
            X.0v0 r2 = (X.C19420v0) r2     // Catch:{ all -> 0x01af }
            android.content.SharedPreferences$Editor r5 = X.C19420v0.A00(r2)     // Catch:{ all -> 0x01af }
            r4 = r27
            r2 = r25
            android.content.SharedPreferences$Editor r3 = r5.putLong(r4, r2)     // Catch:{ all -> 0x01af }
            r2 = r24
            android.content.SharedPreferences$Editor r3 = r3.putLong(r2, r13)     // Catch:{ all -> 0x01af }
            r2 = r23
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)     // Catch:{ all -> 0x01af }
            r0.apply()     // Catch:{ all -> 0x01af }
            monitor-exit(r22)     // Catch:{ all -> 0x01af }
            if (r21 == 0) goto L_0x01ac
            long r2 = r21.longValue()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ac
            long r2 = r2 - r8
            r1 = r31
            r0 = r30
            r1.postDelayed(r0, r2)
        L_0x01ac:
            return
        L_0x01ad:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01af }
        L_0x01af:
            r0 = move-exception
            monitor-exit(r22)     // Catch:{ all -> 0x01af }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0C(X.1P5):void");
    }

    public static void A0D(AnonymousClass1P5 r1, AnonymousClass375 r2) {
        C46902br A032;
        if (r2 != null && (A032 = A03(r1, r2.A02)) != null) {
            A0E(r1, A032);
        }
    }

    public static void A0E(AnonymousClass1P5 r4, C46902br r5) {
        int A002 = (int) ((C19970wo.A00(r4.A0D) - r5.A0I) / 1000);
        if (A002 < r5.A00) {
            r5.A00 = A002;
            if (r5.A02 == 1) {
                r5.A02 = 0;
            }
            ((C20310xM) r4.A0N.get()).A0n(r5, 19);
        }
    }

    public static void A0F(AnonymousClass1P5 r4, Map map) {
        HashSet hashSet = new HashSet(r4.A0Z.keySet());
        for (Map values : map.values()) {
            for (AnonymousClass375 r0 : values.values()) {
                hashSet.remove(r0.A01);
            }
        }
        if (!hashSet.isEmpty()) {
            r4.A0K.A06(hashSet);
        }
    }

    public long A0H(AnonymousClass11F r4) {
        long j;
        synchronized (this.A0R) {
            AnonymousClass38X r0 = (AnonymousClass38X) A06(this).get(r4);
            if (r0 != null) {
                j = r0.A01;
            } else {
                j = -1;
            }
        }
        return j;
    }

    public long A0I(C46902br r7) {
        long j;
        synchronized (this.A0Q) {
            Map A052 = A05(this);
            C64933Qa r4 = r7.A1J;
            Map map = (Map) A052.get(r4.A00);
            if (map != null) {
                UserJid A0L2 = r7.A0L();
                AnonymousClass375 r1 = (AnonymousClass375) map.get(A0L2);
                if (!(r1 == null && (r1 = (AnonymousClass375) map.get(this.A0J.A00.A0B(A0L2))) == null) && r4.equals(r1.A02)) {
                    j = r1.A00;
                }
            }
            j = -1;
        }
        return j;
    }

    public long A0J(C46902br r5) {
        long j;
        C64933Qa r3 = r5.A1J;
        AnonymousClass11F r1 = r3.A00;
        C18740tg.A06(r1);
        synchronized (this.A0R) {
            AnonymousClass38X r12 = (AnonymousClass38X) A06(this).get(r1);
            if (r12 == null || !r12.A02.equals(r3)) {
                j = -1;
            } else {
                j = r12.A01;
            }
        }
        return j;
    }

    public AnonymousClass11F A0K(AnonymousClass11F r5) {
        boolean z;
        if (r5 instanceof UserJid) {
            synchronized (this.A0Q) {
                Map map = (Map) A05(this).get(r5);
                if (map != null) {
                    Iterator it = map.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass143.A0I((UserJid) it.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
            }
            AnonymousClass1P7 r1 = this.A0J;
            AnonymousClass00C.A0D(r5, 0);
            if ((r5 instanceof PhoneUserJid) && z) {
                C223313w A092 = r1.A00.A09((PhoneUserJid) r5);
                C18740tg.A06(A092);
                AnonymousClass00C.A0B(A092);
                return A092;
            }
        }
        return r5;
    }

    public DeviceJid A0L() {
        boolean A012;
        DeviceJid deviceJid;
        AnonymousClass1P7 r1 = this.A0J;
        if (AnonymousClass1P7.A00(r1)) {
            A012 = false;
        } else {
            A012 = C20800yB.A01(C21000yV.A02, r1.A01, 4718);
        }
        C19730wQ r0 = this.A07;
        if (A012) {
            deviceJid = r0.A07();
        } else {
            r0.A0G();
            deviceJid = r0.A02;
        }
        C18740tg.A06(deviceJid);
        return deviceJid;
    }

    public ArrayList A0M() {
        ArrayList arrayList;
        synchronized (this.A0R) {
            A06(this);
            HashSet A042 = A04(this);
            A042.removeAll(this.A0S);
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingManager/getJidsNeedingSenderKey; jids.size=");
            sb.append(A042.size());
            Log.i(sb.toString());
            arrayList = new ArrayList(A042);
        }
        return arrayList;
    }

    public ArrayList A0N(AnonymousClass11F r9) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0Q) {
            Map map = (Map) A05(this).get(r9);
            long A002 = C19970wo.A00(this.A0D);
            if (map != null) {
                for (AnonymousClass375 r4 : map.values()) {
                    if (A0G(r4.A00, A002)) {
                        arrayList.add(r4.A01);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A0O() {
        Log.i("LocationSharingManager/cancelShareLocation");
        synchronized (this.A0R) {
            Iterator it = new ArrayList(A06(this).keySet()).iterator();
            while (it.hasNext()) {
                A0V((AnonymousClass11F) it.next());
            }
        }
    }

    public void A0Q() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0R) {
            Map A062 = A06(this);
            A062.size();
            long A002 = C19970wo.A00(this.A0D);
            for (Map.Entry entry : A062.entrySet()) {
                long j = ((AnonymousClass38X) entry.getValue()).A01;
                if (j != 0 && j <= A002) {
                    arrayList.add((AnonymousClass11F) entry.getKey());
                }
            }
        }
        this.A0M.Boy(new C35721j9(this, arrayList, 35));
        A0C(this);
    }

    public void A0R() {
        Log.i("LocationSharingManager/onStopLocationReporting");
        synchronized (this.A0P) {
            this.A00 = (~2) & this.A00;
        }
        LocationSharingService.A00(this.A0E.A00);
    }

    public void A0S() {
        AnonymousClass1M0 A042;
        Log.i("LocationSharingManager/removeMyLocationSenderKey");
        DeviceJid A0L2 = A0L();
        C18740tg.A06(A0L2);
        AnonymousClass6EZ A022 = C133256Xm.A02(A0L2);
        synchronized (this.A0R) {
            if (this.A0F.A0X()) {
                this.A0M.Boy(new C35721j9(this, A022, 37));
            } else {
                AnonymousClass187 r2 = this.A0G;
                r2.A00.execute(new C35721j9(this, A022, 38));
            }
            this.A0S.clear();
            this.A0Y.clear();
            try {
                A042 = this.A0K.A00.A04();
                int A032 = A042.A02.A03("location_key_distribution", (String) null, "deleteAllLocationReceiverHasKey/DELETE_LOCATION_KEY_DISTRIBUTION", (String[]) null);
                A042.close();
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingStore/deleteAllLocationReceiverHasKey/deleted ");
                sb.append(A032);
                sb.append(" rows");
                Log.i(sb.toString());
            } catch (Exception e) {
                Log.e("LocationSharingStore/deleteAllLocationReceiverHasKey/delete failed", e);
                throw new RuntimeException(e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        C232417s r0 = this.A09;
        r0.A00.A01(new C125305zh());
        return;
        throw th;
    }

    public void A0U(Location location) {
        AnonymousClass1P6 r2 = this.A0I;
        C19730wQ r0 = r2.A02;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        C63593Kq r6 = new C63593Kq(phoneUserJid);
        r6.A00 = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
        r6.A01 = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
        if (location.hasAccuracy()) {
            r6.A03 = (int) location.getAccuracy();
        }
        if (location.hasSpeed()) {
            r6.A02 = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
        }
        if (location.hasBearing()) {
            r6.A04 = (int) location.getBearing();
        }
        long time = location.getTime();
        r6.A05 = time;
        C19970wo r3 = r2.A04;
        if (time > C19970wo.A00(r3)) {
            r6.A05 = C19970wo.A00(r3);
        }
        synchronized (this) {
            C63593Kq r02 = this.A05;
            if (r02 == null || r6.A05 > r02.A05) {
                this.A05 = r6;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r6.A01, 4718) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r3 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r5 = r6.A00.A09((com.whatsapp.jid.PhoneUserJid) r5);
        X.C18740tg.A06(r5);
        X.AnonymousClass00C.A0B(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ba, code lost:
        r1 = r7.A0T.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        if (r1.hasNext() == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        ((X.AnonymousClass4TK) r1.next()).Bhu(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        A0C(r7);
        r7.A06.post(new X.C35721j9(r7, r8, 39));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (A0d() != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        A0R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        r7.A08.A01(new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob(r5, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.AnonymousClass11F r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; jid="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1P7 r6 = r7.A0J
            java.lang.Object r4 = r7.A0R
            monitor-enter(r4)
            java.util.Map r0 = A06(r7)     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x00f6 }
            X.38X r0 = (X.AnonymousClass38X) r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0040
            java.util.List r0 = r0.A03     // Catch:{ all -> 0x00f6 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x002b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f6 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00f6 }
            boolean r0 = X.AnonymousClass143.A0I(r0)     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x002b
            r3 = 1
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            goto L_0x0042
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            r3 = 0
        L_0x0042:
            r5 = r8
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            boolean r0 = r8 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x006d
            boolean r0 = X.AnonymousClass1P7.A00(r6)
            if (r0 != 0) goto L_0x005d
            X.0yC r2 = r6.A01
            r1 = 4718(0x126e, float:6.611E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            if (r3 == 0) goto L_0x006d
        L_0x005f:
            X.12O r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            X.13w r5 = r0.A09(r5)
            X.C18740tg.A06(r5)
            X.AnonymousClass00C.A0B(r5)
        L_0x006d:
            monitor-enter(r4)
            java.util.Map r0 = A06(r7)     // Catch:{ all -> 0x00f3 }
            java.lang.Object r6 = r0.remove(r8)     // Catch:{ all -> 0x00f3 }
            X.38X r6 = (X.AnonymousClass38X) r6     // Catch:{ all -> 0x00f3 }
            if (r6 != 0) goto L_0x007c
            monitor-exit(r4)     // Catch:{ all -> 0x00f3 }
            return
        L_0x007c:
            X.3Qa r0 = r6.A02     // Catch:{ all -> 0x00f3 }
            X.2br r0 = A03(r7, r0)     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x0087
            A0E(r7, r0)     // Catch:{ all -> 0x00f3 }
        L_0x0087:
            X.1P9 r3 = r7.A0K     // Catch:{ all -> 0x00f3 }
            java.util.List r2 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x00f3 }
            X.0wo r0 = r7.A0D     // Catch:{ all -> 0x00f3 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00f3 }
            r3.A07(r2, r0)     // Catch:{ all -> 0x00f3 }
            java.util.HashSet r2 = A04(r7)     // Catch:{ all -> 0x00f3 }
            java.util.List r0 = r6.A03     // Catch:{ all -> 0x00f3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00f3 }
        L_0x00a0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f3 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x00f3 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x00f3 }
            if (r0 != 0) goto L_0x00a0
            r7.A0S()     // Catch:{ all -> 0x00f3 }
        L_0x00b5:
            long r2 = A00(r7)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f3 }
            java.util.List r0 = r7.A0T
            java.util.Iterator r1 = r0.iterator()
        L_0x00c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = r1.next()
            X.4TK r0 = (X.AnonymousClass4TK) r0
            r0.Bhu(r8)
            goto L_0x00c0
        L_0x00d0:
            A0C(r7)
            android.os.Handler r4 = r7.A06
            r1 = 39
            X.1j9 r0 = new X.1j9
            r0.<init>(r7, r8, r1)
            r4.post(r0)
            boolean r0 = r7.A0d()
            if (r0 != 0) goto L_0x00e8
            r7.A0R()
        L_0x00e8:
            X.164 r1 = r7.A08
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r0 = new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            r0.<init>(r5, r2)
            r1.A01(r0)
            return
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f3 }
            throw r0
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0V(X.11F):void");
    }

    public void A0W(AnonymousClass11F r9, List list) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/onParticipantsLeftGroup; gjid=");
        sb.append(r9);
        sb.append("; participants.size=");
        sb.append(list.size());
        Log.i(sb.toString());
        synchronized (this.A0R) {
            Map A062 = A06(this);
            AnonymousClass38X r6 = (AnonymousClass38X) A062.get(r9);
            z = false;
            if (r6 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid userJid = (UserJid) it.next();
                    List list2 = r6.A03;
                    if (list2.contains(userJid)) {
                        list2.remove(userJid);
                        z = true;
                    }
                }
                if (r6.A03.isEmpty()) {
                    AnonymousClass38X r0 = (AnonymousClass38X) A062.remove(r9);
                    C18740tg.A06(r0);
                    C46902br A032 = A03(this, r0.A02);
                    if (A032 != null) {
                        A0E(this, A032);
                    }
                }
                AnonymousClass1P9.A01(r9, this.A0K, list, true);
                A0A(this);
            }
        }
        if (z) {
            A0C(this);
            this.A06.post(new C35721j9(this, r9, 41));
        }
        synchronized (this.A0Q) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A08(r9, (UserJid) it2.next(), this);
            }
        }
    }

    public void A0X(AnonymousClass147 r3) {
        Map map;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/onMeLeftGroup; gjid=");
        sb.append(r3);
        Log.i(sb.toString());
        A0V(r3);
        synchronized (this.A0Q) {
            map = (Map) A05(this).remove(r3);
        }
        if (map != null) {
            for (AnonymousClass375 r0 : map.values()) {
                A08(r3, r0.A01, this);
            }
        }
    }

    public void A0Z(AnonymousClass4TK r3) {
        List list = this.A0T;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public void A0a(C63593Kq r7, C46902br r8) {
        UserJid A002;
        C64933Qa r2 = r8.A1J;
        AnonymousClass11F r5 = r2.A00;
        boolean z = r2.A02;
        if (z) {
            A002 = null;
        } else if (AnonymousClass143.A0G(r5)) {
            AnonymousClass11F A0J2 = r8.A0J();
            C222813r r0 = UserJid.Companion;
            A002 = C222813r.A00(A0J2);
        } else {
            C222813r r02 = UserJid.Companion;
            A002 = C222813r.A00(r5);
        }
        String str = r2.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationSharingManager/storeFinalLiveLocation/jid=");
        sb.append(r5);
        sb.append("; fromMe=");
        sb.append(z);
        sb.append("; msgId=");
        sb.append(str);
        sb.append("; participant=");
        sb.append(A002);
        sb.append("; location.time=");
        sb.append(r7.A05);
        Log.i(sb.toString());
        r8.A02 = r7;
        ((C20310xM) this.A0N.get()).A0n(r8, 18);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0138, code lost:
        r1 = r5.A0U.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0142, code lost:
        if (r1.hasNext() == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0144, code lost:
        ((X.AnonymousClass4U8) r1.next()).BeI(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014e, code lost:
        A0B(r5);
        r5.A06.post(new X.C35721j9(r5, r15, 42));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x015d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(X.C46902br r21, long r22) {
        /*
            r20 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; message.key.remote_jid="
            r2.append(r0)
            r7 = r21
            X.3Qa r8 = r7.A1J
            X.11F r15 = r8.A00
            r2.append(r15)
            java.lang.String r0 = "; message.remote_resource="
            r2.append(r0)
            X.11F r0 = r7.A0J()
            r2.append(r0)
            java.lang.String r0 = "; expiration="
            r2.append(r0)
            r11 = r22
            r2.append(r11)
            java.lang.String r0 = "; message.sequenceNumber="
            r2.append(r0)
            long r0 = r7.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11F r1 = r7.A0J()
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            if (r1 != 0) goto L_0x0086
            com.whatsapp.jid.UserJid r6 = X.C222813r.A00(r15)
        L_0x0046:
            r5 = r20
            X.1P7 r1 = r5.A0J
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            boolean r0 = r7.A12
            if (r0 == 0) goto L_0x0083
            boolean r0 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0083
            X.12O r1 = r1.A00
            r0 = r6
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.13w r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LiveLocationManager/getRemoteResource/msgId="
            r1.append(r0)
            java.lang.String r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = " LID not found for "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x007f:
            java.lang.Object r4 = r5.A0Q
            monitor-enter(r4)
            goto L_0x008b
        L_0x0083:
            r0 = r6
        L_0x0084:
            r6 = r0
            goto L_0x007f
        L_0x0086:
            com.whatsapp.jid.UserJid r6 = X.C222813r.A00(r1)
            goto L_0x0046
        L_0x008b:
            java.util.Map r3 = A05(r5)     // Catch:{ all -> 0x015e }
            android.util.Pair r14 = android.util.Pair.create(r15, r6)     // Catch:{ all -> 0x015e }
            java.util.Map r13 = r5.A0X     // Catch:{ all -> 0x015e }
            java.lang.Object r0 = r13.get(r14)     // Catch:{ all -> 0x015e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x00ae
            long r9 = r0.longValue()     // Catch:{ all -> 0x015e }
            long r0 = r7.A01     // Catch:{ all -> 0x015e }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00ae
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; received message with old sequence number; not set receiving"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015e }
            monitor-exit(r4)     // Catch:{ all -> 0x015e }
            return
        L_0x00ae:
            r13.remove(r14)     // Catch:{ all -> 0x015e }
            boolean r0 = r3.containsKey(r15)     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x00bf
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x015e }
            r0.<init>()     // Catch:{ all -> 0x015e }
            r3.put(r15, r0)     // Catch:{ all -> 0x015e }
        L_0x00bf:
            java.lang.Object r1 = r3.get(r15)     // Catch:{ all -> 0x015e }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x015e }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x015e }
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x015e }
            X.375 r0 = (X.AnonymousClass375) r0     // Catch:{ all -> 0x015e }
            A0D(r5, r0)     // Catch:{ all -> 0x015e }
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x015e }
            r10 = r6
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x015e }
            X.375 r0 = new X.375     // Catch:{ all -> 0x015e }
            r0.<init>(r10, r8, r11)     // Catch:{ all -> 0x015e }
            r1.put(r6, r0)     // Catch:{ all -> 0x015e }
            java.util.Map r1 = r5.A0Z     // Catch:{ all -> 0x015e }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x00f2
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x015e }
            X.3Kq r0 = new X.3Kq     // Catch:{ all -> 0x015e }
            r0.<init>(r10)     // Catch:{ all -> 0x015e }
            r1.put(r6, r0)     // Catch:{ all -> 0x015e }
        L_0x00f2:
            java.lang.Object r9 = r1.get(r6)     // Catch:{ all -> 0x015e }
            X.3Kq r9 = (X.C63593Kq) r9     // Catch:{ all -> 0x015e }
            X.C18740tg.A06(r9)     // Catch:{ all -> 0x015e }
            long r0 = r9.A05     // Catch:{ all -> 0x015e }
            long r2 = r7.A0I     // Catch:{ all -> 0x015e }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x0112
            double r0 = r7.A00     // Catch:{ all -> 0x015e }
            r9.A00 = r0     // Catch:{ all -> 0x015e }
            double r0 = r7.A01     // Catch:{ all -> 0x015e }
            r9.A01 = r0     // Catch:{ all -> 0x015e }
            r9.A05 = r2     // Catch:{ all -> 0x015e }
            X.1P9 r0 = r5.A0K     // Catch:{ all -> 0x015e }
            r0.A05(r9)     // Catch:{ all -> 0x015e }
        L_0x0112:
            X.1P9 r3 = r5.A0K     // Catch:{ all -> 0x015e }
            X.C18740tg.A06(r15)     // Catch:{ all -> 0x015e }
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x015e }
            java.lang.String r2 = r8.A01     // Catch:{ all -> 0x015e }
            r1 = 0
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x015e }
            r0.<init>(r15, r2, r1)     // Catch:{ all -> 0x015e }
            X.3Nl r14 = new X.3Nl     // Catch:{ all -> 0x015e }
            r18 = r11
            r16 = r10
            r17 = r0
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x015e }
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x015e }
            r3.A08(r0)     // Catch:{ all -> 0x015e }
            r5.A0a(r9, r7)     // Catch:{ all -> 0x015e }
            monitor-exit(r4)     // Catch:{ all -> 0x015e }
            java.util.List r0 = r5.A0U
            java.util.Iterator r1 = r0.iterator()
        L_0x013e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r1.next()
            X.4U8 r0 = (X.AnonymousClass4U8) r0
            r0.BeI(r15, r6)
            goto L_0x013e
        L_0x014e:
            A0B(r5)
            android.os.Handler r2 = r5.A06
            r1 = 42
            X.1j9 r0 = new X.1j9
            r0.<init>(r5, r15, r1)
            r2.post(r0)
            return
        L_0x015e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x015e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0b(X.2br, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r5 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3 <= r7) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0c() {
        /*
            r9 = this;
            X.0wo r0 = r9.A0D
            long r7 = X.C19970wo.A00(r0)
            java.lang.Object r6 = r9.A0R
            monitor-enter(r6)
            java.lang.Long r5 = r9.A02     // Catch:{ all -> 0x003d }
            monitor-exit(r6)     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x001c
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0026
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x001c:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/triggered clearing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0Q()
            if (r5 == 0) goto L_0x003b
        L_0x0026:
            long r1 = r5.longValue()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            monitor-enter(r6)
            long r2 = r9.A01     // Catch:{ all -> 0x0033 }
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            goto L_0x0036
        L_0x0033:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0c():boolean");
    }

    public boolean A0d() {
        boolean z;
        synchronized (this.A0R) {
            Map A062 = A06(this);
            long A002 = C19970wo.A00(this.A0D);
            Iterator it = A062.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (A0G(((AnonymousClass38X) it.next()).A01, A002)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public boolean A0e() {
        synchronized (this.A0R) {
            ArrayList A0M2 = A0M();
            Map map = this.A0Y;
            A0M2.removeAll(map.keySet());
            if (A0M2.isEmpty()) {
                return false;
            }
            Iterator it = A0M2.iterator();
            while (it.hasNext()) {
                map.put((UserJid) it.next(), 0);
            }
            this.A08.A01(new SendLiveLocationKeyJob(A0M2));
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(X.AnonymousClass11F r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A0R
            monitor-enter(r4)
            java.util.Map r2 = A06(r5)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x003d }
            X.38X r0 = (X.AnonymousClass38X) r0     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003a
            X.1P7 r0 = r5.A0J     // Catch:{ all -> 0x003d }
            r1 = r6
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x003d }
            X.12O r0 = r0.A00     // Catch:{ all -> 0x003d }
            com.whatsapp.jid.UserJid r0 = r0.A0B(r1)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x003d }
            X.38X r0 = (X.AnonymousClass38X) r0     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003a
        L_0x0026:
            long r2 = r0.A01     // Catch:{ all -> 0x003d }
            X.0wo r0 = r5.A0D     // Catch:{ all -> 0x003d }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x003d }
            boolean r0 = A0G(r2, r0)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0037
            r0 = 1
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            return r0
        L_0x0037:
            r5.A0V(r6)     // Catch:{ all -> 0x003d }
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            r0 = 0
            return r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P5.A0f(X.11F):boolean");
    }

    public boolean A0h(C63593Kq r13) {
        boolean z;
        C46902br A032;
        synchronized (this.A0Q) {
            Map map = this.A0Z;
            UserJid userJid = r13.A06;
            C63593Kq r4 = (C63593Kq) map.get(userJid);
            z = false;
            if (r4 == null || r4.A05 <= r13.A05) {
                for (Map map2 : A05(this).values()) {
                    AnonymousClass375 r9 = (AnonymousClass375) map2.get(userJid);
                    if (!(r9 == null || r13.A05 > r9.A00 || (A032 = A03(this, r9.A02)) == null)) {
                        A0a(r13, A032);
                        z = true;
                    }
                }
                if (z) {
                    if (r4 == null) {
                        map.put(userJid, r13);
                    } else {
                        r4.A00(r13);
                    }
                    this.A0K.A05(r13);
                }
            }
        }
        return z;
    }

    public AnonymousClass1P5(C19730wQ r3, AnonymousClass164 r4, C232417s r5, AnonymousClass16D r6, C236519h r7, C21060yb r8, C19970wo r9, C19630wG r10, AnonymousClass189 r11, AnonymousClass187 r12, C24381Cf r13, AnonymousClass1P6 r14, AnonymousClass1P7 r15, AnonymousClass1P9 r16, AnonymousClass1PA r17, C19770wU r18, AnonymousClass005 r19, AnonymousClass005 r20, AnonymousClass005 r21) {
        this.A0E = r10;
        this.A0D = r9;
        this.A0B = r7;
        this.A07 = r3;
        this.A0M = r18;
        this.A08 = r4;
        this.A0A = r6;
        this.A0G = r12;
        this.A0C = r8;
        this.A0I = r14;
        this.A0F = r11;
        this.A09 = r5;
        this.A0J = r15;
        this.A0L = r17;
        this.A0a = r20;
        this.A0K = r16;
        this.A0H = r13;
        this.A0O = r19;
        this.A0N = r21;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public static AnonymousClass630 A01(AnonymousClass1P5 r3, AnonymousClass8SX r4) {
        DeviceJid A0L2 = r3.A0L();
        C18740tg.A06(A0L2);
        return new AnonymousClass630(r3.A0F.A0A(new AnonymousClass6EU(C133256Xm.A02(A0L2), C177518dv.A00.getRawString()), r4.A0o()).A02, 2, 3);
    }

    public static HashSet A04(AnonymousClass1P5 r7) {
        Map A062 = A06(r7);
        HashSet hashSet = new HashSet();
        long A002 = C19970wo.A00(r7.A0D);
        for (AnonymousClass38X r2 : A062.values()) {
            if (A0G(r2.A01, A002)) {
                hashSet.addAll(r2.A03);
            }
        }
        return hashSet;
    }

    public void A0P() {
        if (A0c()) {
            boolean z = true;
            Object obj = this.A0P;
            synchronized (obj) {
                if ((this.A00 & 1) != 1) {
                    z = false;
                }
            }
            if (!z) {
                Context context = this.A0E.A00;
                LocationSharingService.A01(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", 40000));
                synchronized (obj) {
                    this.A00 = 1 | this.A00;
                }
            }
        }
    }
}
