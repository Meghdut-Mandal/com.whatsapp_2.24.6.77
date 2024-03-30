package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.6RH  reason: invalid class name */
public abstract class AnonymousClass6RH {
    public static final String A00 = AnonymousClass6VD.A01("Schedulers");

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r2 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        r2 = new X.C138846in(r6);
        X.AnonymousClass6I0.A00(r6, androidx.work.impl.background.systemalarm.SystemAlarmService.class, true);
        r1 = X.AnonymousClass6VD.A00();
        r0 = "Created SystemAlarmScheduler";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C159907k7 A00(android.content.Context r6, X.AnonymousClass6VR r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 1
            r0 = 23
            if (r1 < r0) goto L_0x001d
            X.6io r2 = new X.6io
            r2.<init>(r6, r7)
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r0 = androidx.work.impl.background.systemjob.SystemJobService.class
            X.AnonymousClass6I0.A00(r6, r0, r4)
            X.6VD r1 = X.AnonymousClass6VD.A00()
            java.lang.String r5 = A00
            java.lang.String r0 = "Created SystemJobScheduler and enabled SystemJobService"
        L_0x0019:
            r1.A04(r5, r0)
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.String r0 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x0044 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0044 }
            java.lang.reflect.Constructor r1 = r3.getConstructor(r1)     // Catch:{ all -> 0x0044 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0044 }
            r0[r2] = r6     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r1.newInstance(r0)     // Catch:{ all -> 0x0044 }
            X.7k7 r2 = (X.C159907k7) r2     // Catch:{ all -> 0x0044 }
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = A00     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Created androidx.work.impl.background.gcm.GcmScheduler"
            r1.A04(r5, r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0056
        L_0x0044:
            r3 = move-exception
            X.6VD r0 = X.AnonymousClass6VD.A00()
            java.lang.String r5 = A00
            java.lang.String r2 = "Unable to create GCM Scheduler"
            int r1 = r0.A00
            r0 = 3
            if (r1 > r0) goto L_0x0058
            android.util.Log.d(r5, r2, r3)
            goto L_0x0058
        L_0x0056:
            if (r2 != 0) goto L_0x001c
        L_0x0058:
            X.6in r2 = new X.6in
            r2.<init>(r6)
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r0 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            X.AnonymousClass6I0.A00(r6, r0, r4)
            X.6VD r1 = X.AnonymousClass6VD.A00()
            java.lang.String r0 = "Created SystemAlarmScheduler"
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RH.A00(android.content.Context, X.6VR):X.7k7");
    }

    public static void A01(C18850tv r70, WorkDatabase workDatabase, List list) {
        C138686iW A002;
        Cursor A003;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (list != null && list.size() != 0) {
            C160977lt A0D = workDatabase.A0D();
            workDatabase.A06();
            try {
                int A004 = r70.A00();
                TreeMap treeMap = C138686iW.A08;
                A002 = C109355Xg.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
                A002.B1o(1, (long) A004);
                AnonymousClass6Q8 r1 = ((C138936iw) A0D).A02;
                r1.A05();
                A003 = C109365Xh.A00(r1, A002, false);
                int A01 = AnonymousClass6GJ.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                int A012 = AnonymousClass6GJ.A01(A003, "state");
                int A013 = AnonymousClass6GJ.A01(A003, "worker_class_name");
                int A014 = AnonymousClass6GJ.A01(A003, "input_merger_class_name");
                int A015 = AnonymousClass6GJ.A01(A003, "input");
                int A016 = AnonymousClass6GJ.A01(A003, "output");
                int A017 = AnonymousClass6GJ.A01(A003, "initial_delay");
                int A018 = AnonymousClass6GJ.A01(A003, "interval_duration");
                int A019 = AnonymousClass6GJ.A01(A003, "flex_duration");
                int A0110 = AnonymousClass6GJ.A01(A003, "run_attempt_count");
                int A0111 = AnonymousClass6GJ.A01(A003, "backoff_policy");
                int A0112 = AnonymousClass6GJ.A01(A003, "backoff_delay_duration");
                int A0113 = AnonymousClass6GJ.A01(A003, "last_enqueue_time");
                int A0114 = AnonymousClass6GJ.A01(A003, "minimum_retention_duration");
                int A0115 = AnonymousClass6GJ.A01(A003, "schedule_requested_at");
                int A0116 = AnonymousClass6GJ.A01(A003, "run_in_foreground");
                int A0117 = AnonymousClass6GJ.A01(A003, "out_of_quota_policy");
                int A0118 = AnonymousClass6GJ.A01(A003, "period_count");
                int A0119 = AnonymousClass6GJ.A01(A003, "generation");
                int A0120 = AnonymousClass6GJ.A01(A003, "required_network_type");
                int A0121 = AnonymousClass6GJ.A01(A003, "requires_charging");
                int A0122 = AnonymousClass6GJ.A01(A003, "requires_device_idle");
                int A0123 = AnonymousClass6GJ.A01(A003, "requires_battery_not_low");
                int A0124 = AnonymousClass6GJ.A01(A003, "requires_storage_not_low");
                int A0125 = AnonymousClass6GJ.A01(A003, "trigger_content_update_delay");
                int A0126 = AnonymousClass6GJ.A01(A003, "trigger_max_content_delay");
                int A0127 = AnonymousClass6GJ.A01(A003, "content_uri_triggers");
                ArrayList A0n = C90474aD.A0n(A003);
                while (A003.moveToNext()) {
                    if (A003.isNull(A01)) {
                        str = null;
                    } else {
                        str = A003.getString(A01);
                    }
                    Integer A05 = AnonymousClass6XU.A05(A003.getInt(A012));
                    if (A003.isNull(A013)) {
                        str2 = null;
                    } else {
                        str2 = A003.getString(A013);
                    }
                    if (A003.isNull(A014)) {
                        str3 = null;
                    } else {
                        str3 = A003.getString(A014);
                    }
                    if (A003.isNull(A015)) {
                        bArr = null;
                    } else {
                        bArr = A003.getBlob(A015);
                    }
                    AnonymousClass6X2 A005 = AnonymousClass6X2.A00(bArr);
                    if (A003.isNull(A016)) {
                        bArr2 = null;
                    } else {
                        bArr2 = A003.getBlob(A016);
                    }
                    AnonymousClass6X2 A006 = AnonymousClass6X2.A00(bArr2);
                    long j = A003.getLong(A017);
                    long j2 = A003.getLong(A018);
                    long j3 = A003.getLong(A019);
                    int i = A003.getInt(A0110);
                    Integer A02 = AnonymousClass6XU.A02(A003.getInt(A0111));
                    long j4 = A003.getLong(A0112);
                    long j5 = A003.getLong(A0113);
                    long j6 = A003.getLong(A0114);
                    long j7 = A003.getLong(A0115);
                    boolean A1P = AnonymousClass000.A1P(A003.getInt(A0116));
                    Integer A04 = AnonymousClass6XU.A04(A003.getInt(A0117));
                    int i2 = A003.getInt(A0118);
                    int i3 = A003.getInt(A0119);
                    Integer A03 = AnonymousClass6XU.A03(A003.getInt(A0120));
                    boolean A1P2 = AnonymousClass000.A1P(A003.getInt(A0121));
                    boolean A1P3 = AnonymousClass000.A1P(A003.getInt(A0122));
                    boolean A1P4 = AnonymousClass000.A1P(A003.getInt(A0123));
                    boolean A1P5 = AnonymousClass000.A1P(A003.getInt(A0124));
                    long j8 = A003.getLong(A0125);
                    long j9 = A003.getLong(A0126);
                    if (A003.isNull(A0127)) {
                        bArr3 = null;
                    } else {
                        bArr3 = A003.getBlob(A0127);
                    }
                    A0n.add(new AnonymousClass6QA(new C132316Tb(A03, AnonymousClass6XU.A06(bArr3), j8, j9, A1P2, A1P3, A1P4, A1P5), A005, A006, A05, A02, A04, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1P));
                }
                A003.close();
                A002.A00();
                ArrayList B8U = A0D.B8U(200);
                if (A0n.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = A0n.iterator();
                    while (it.hasNext()) {
                        A0D.BP9(((AnonymousClass6QA) it.next()).A0J, currentTimeMillis);
                    }
                }
                workDatabase.A07();
                AnonymousClass6Q8.A01(workDatabase);
                if (A0n.size() > 0) {
                    AnonymousClass6QA[] r3 = (AnonymousClass6QA[]) A0n.toArray(new AnonymousClass6QA[A0n.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C159907k7 r12 = (C159907k7) it2.next();
                        if (r12.BJv()) {
                            r12.BpL(r3);
                        }
                    }
                }
                if (B8U.size() > 0) {
                    AnonymousClass6QA[] r32 = (AnonymousClass6QA[]) B8U.toArray(new AnonymousClass6QA[B8U.size()]);
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C159907k7 r13 = (C159907k7) it3.next();
                        if (!r13.BJv()) {
                            r13.BpL(r32);
                        }
                    }
                }
            } catch (Throwable th) {
                AnonymousClass6Q8.A01(workDatabase);
                throw th;
            }
        }
    }
}
