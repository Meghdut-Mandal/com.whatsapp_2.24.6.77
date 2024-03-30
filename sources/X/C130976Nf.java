package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.6Nf  reason: invalid class name and case insensitive filesystem */
public class C130976Nf {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public C118425ns A02(C162177o9 r38) {
        StringBuilder A0u;
        String str;
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new AnonymousClass6PV("work_spec_id", "TEXT", (String) null, 1, 1, true));
        hashMap.put("prerequisite_id", new AnonymousClass6PV("prerequisite_id", "TEXT", (String) null, 2, 1, true));
        HashSet hashSet = new HashSet(2);
        String str2 = "WorkSpec";
        hashSet.add(new C128426Cf(str2, "CASCADE", "CASCADE", C90484aE.A0t("work_spec_id"), C90484aE.A0t(PublicKeyCredentialControllerUtility.JSON_KEY_ID)));
        A01("prerequisite_id", hashSet);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C128336Bv("index_Dependency_work_spec_id", C90484aE.A0t("work_spec_id"), C90484aE.A0t("ASC"), false));
        hashSet2.add(new C128336Bv("index_Dependency_prerequisite_id", C90484aE.A0t("prerequisite_id"), C90484aE.A0t("ASC"), false));
        C128346Bw r6 = new C128346Bw("Dependency", hashMap, hashSet, hashSet2);
        C162177o9 r5 = r38;
        C128346Bw A002 = A00(r5, "Dependency");
        if (!r6.equals(A002)) {
            A0u = AnonymousClass000.A0u();
            str = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(27);
            String str3 = "TEXT";
            hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new AnonymousClass6PV(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, (String) null, 1, 1, true));
            hashMap2.put("state", new AnonymousClass6PV("state", "INTEGER", (String) null, 0, 1, true));
            hashMap2.put("worker_class_name", new AnonymousClass6PV("worker_class_name", str3, (String) null, 0, 1, true));
            hashMap2.put("input_merger_class_name", new AnonymousClass6PV("input_merger_class_name", str3, (String) null, 0, 1, false));
            hashMap2.put("input", new AnonymousClass6PV("input", "BLOB", (String) null, 0, 1, true));
            hashMap2.put("output", new AnonymousClass6PV("output", "BLOB", (String) null, 0, 1, true));
            String str4 = "INTEGER";
            hashMap2.put("initial_delay", new AnonymousClass6PV("initial_delay", str4, (String) null, 0, 1, true));
            hashMap2.put("interval_duration", new AnonymousClass6PV("interval_duration", str4, (String) null, 0, 1, true));
            hashMap2.put("flex_duration", new AnonymousClass6PV("flex_duration", str4, (String) null, 0, 1, true));
            hashMap2.put("run_attempt_count", new AnonymousClass6PV("run_attempt_count", str4, (String) null, 0, 1, true));
            hashMap2.put("backoff_policy", new AnonymousClass6PV("backoff_policy", str4, (String) null, 0, 1, true));
            hashMap2.put("backoff_delay_duration", new AnonymousClass6PV("backoff_delay_duration", str4, (String) null, 0, 1, true));
            hashMap2.put("last_enqueue_time", new AnonymousClass6PV("last_enqueue_time", str4, (String) null, 0, 1, true));
            hashMap2.put("minimum_retention_duration", new AnonymousClass6PV("minimum_retention_duration", str4, (String) null, 0, 1, true));
            String str5 = "INTEGER";
            hashMap2.put("schedule_requested_at", new AnonymousClass6PV("schedule_requested_at", str5, (String) null, 0, 1, true));
            hashMap2.put("run_in_foreground", new AnonymousClass6PV("run_in_foreground", str5, (String) null, 0, 1, true));
            hashMap2.put("out_of_quota_policy", new AnonymousClass6PV("out_of_quota_policy", str5, (String) null, 0, 1, true));
            hashMap2.put("period_count", new AnonymousClass6PV("period_count", str5, "0", 0, 1, true));
            String str6 = "generation";
            hashMap2.put("generation", new AnonymousClass6PV(str6, str5, "0", 0, 1, true));
            String str7 = "INTEGER";
            hashMap2.put("required_network_type", new AnonymousClass6PV("required_network_type", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_charging", new AnonymousClass6PV("requires_charging", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_device_idle", new AnonymousClass6PV("requires_device_idle", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_battery_not_low", new AnonymousClass6PV("requires_battery_not_low", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_storage_not_low", new AnonymousClass6PV("requires_storage_not_low", str7, (String) null, 0, 1, true));
            hashMap2.put("trigger_content_update_delay", new AnonymousClass6PV("trigger_content_update_delay", str7, (String) null, 0, 1, true));
            hashMap2.put("trigger_max_content_delay", new AnonymousClass6PV("trigger_max_content_delay", str7, (String) null, 0, 1, true));
            hashMap2.put("content_uri_triggers", new AnonymousClass6PV("content_uri_triggers", "BLOB", (String) null, 0, 1, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C128336Bv("index_WorkSpec_schedule_requested_at", C90484aE.A0t("schedule_requested_at"), C90484aE.A0t("ASC"), false));
            hashSet4.add(new C128336Bv("index_WorkSpec_last_enqueue_time", C90484aE.A0t("last_enqueue_time"), C90484aE.A0t("ASC"), false));
            r6 = new C128346Bw("WorkSpec", hashMap2, hashSet3, hashSet4);
            A002 = A00(r5, "WorkSpec");
            if (!r6.equals(A002)) {
                A0u = AnonymousClass000.A0u();
                str = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n";
            } else {
                HashMap hashMap3 = new HashMap(2);
                String str8 = "TEXT";
                hashMap3.put("tag", new AnonymousClass6PV("tag", str8, (String) null, 1, 1, true));
                String str9 = "work_spec_id";
                hashMap3.put("work_spec_id", new AnonymousClass6PV(str9, str8, (String) null, 2, 1, true));
                HashSet hashSet5 = new HashSet(1);
                A01("work_spec_id", hashSet5);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new C128336Bv("index_WorkTag_work_spec_id", C90484aE.A0t("work_spec_id"), C90484aE.A0t("ASC"), false));
                r6 = new C128346Bw("WorkTag", hashMap3, hashSet5, hashSet6);
                A002 = A00(r5, "WorkTag");
                if (!r6.equals(A002)) {
                    A0u = AnonymousClass000.A0u();
                    str = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                } else {
                    HashMap hashMap4 = new HashMap(3);
                    hashMap4.put("work_spec_id", new AnonymousClass6PV(str9, str8, (String) null, 1, 1, true));
                    hashMap4.put("generation", new AnonymousClass6PV(str6, str5, "0", 2, 1, true));
                    hashMap4.put("system_id", new AnonymousClass6PV("system_id", "INTEGER", (String) null, 0, 1, true));
                    HashSet hashSet7 = new HashSet(1);
                    A01("work_spec_id", hashSet7);
                    r6 = new C128346Bw("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                    A002 = A00(r5, "SystemIdInfo");
                    if (!r6.equals(A002)) {
                        A0u = AnonymousClass000.A0u();
                        str = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                    } else {
                        HashMap hashMap5 = new HashMap(2);
                        String str10 = "TEXT";
                        hashMap5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new AnonymousClass6PV(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str10, (String) null, 1, 1, true));
                        hashMap5.put("work_spec_id", new AnonymousClass6PV("work_spec_id", str10, (String) null, 2, 1, true));
                        HashSet hashSet8 = new HashSet(1);
                        A01("work_spec_id", hashSet8);
                        HashSet hashSet9 = new HashSet(1);
                        hashSet9.add(new C128336Bv("index_WorkName_work_spec_id", C90484aE.A0t("work_spec_id"), C90484aE.A0t("ASC"), false));
                        r6 = new C128346Bw("WorkName", hashMap5, hashSet8, hashSet9);
                        A002 = A00(r5, "WorkName");
                        if (!r6.equals(A002)) {
                            A0u = AnonymousClass000.A0u();
                            str = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                        } else {
                            HashMap hashMap6 = new HashMap(2);
                            hashMap6.put("work_spec_id", new AnonymousClass6PV("work_spec_id", "TEXT", (String) null, 1, 1, true));
                            hashMap6.put("progress", new AnonymousClass6PV("progress", "BLOB", (String) null, 0, 1, true));
                            HashSet hashSet10 = new HashSet(1);
                            A01("work_spec_id", hashSet10);
                            r6 = new C128346Bw("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                            A002 = A00(r5, "WorkProgress");
                            if (!r6.equals(A002)) {
                                A0u = AnonymousClass000.A0u();
                                str = "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n";
                            } else {
                                HashMap hashMap7 = new HashMap(2);
                                hashMap7.put("key", new AnonymousClass6PV("key", "TEXT", (String) null, 1, 1, true));
                                hashMap7.put("long_value", new AnonymousClass6PV("long_value", "INTEGER", (String) null, 0, 1, false));
                                C128346Bw r62 = new C128346Bw("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                C128346Bw A003 = A00(r5, "Preference");
                                if (r62.equals(A003)) {
                                    return new C118425ns(true, (String) null);
                                }
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                                A0u2.append(r62);
                                return new C118425ns(false, AnonymousClass000.A0l(A003, "\n Found:\n", A0u2));
                            }
                        }
                    }
                }
            }
        }
        A0u.append(str);
        A0u.append(r6);
        return new C118425ns(false, AnonymousClass000.A0l(A002, "\n Found:\n", A0u));
    }

    public C130976Nf(WorkDatabase_Impl workDatabase_Impl) {
        this.A00 = workDatabase_Impl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0269, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0284, code lost:
        X.C05600Qi.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0287, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028b, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C128346Bw A00(X.C162177o9 r31, java.lang.String r32) {
        /*
            r2 = r31
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PRAGMA table_info(`"
            r3.append(r0)
            r0 = r32
            r3.append(r0)
            java.lang.String r1 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0q(r1, r3)
            X.6iP r2 = (X.C138616iP) r2
            android.database.Cursor r4 = X.C138616iP.A00(r2, r0)
            java.lang.String r10 = "dflt_value"
            java.lang.String r9 = "pk"
            java.lang.String r5 = "notnull"
            java.lang.String r3 = "type"
            java.lang.String r25 = "name"
            int r0 = r4.getColumnCount()     // Catch:{ all -> 0x0288 }
            if (r0 > 0) goto L_0x0031
            X.00f r24 = X.C000400e.A0D()     // Catch:{ all -> 0x0288 }
            goto L_0x007e
        L_0x0031:
            r0 = r25
            int r8 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0288 }
            int r7 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x0288 }
            int r6 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0288 }
            int r5 = r4.getColumnIndex(r9)     // Catch:{ all -> 0x0288 }
            int r3 = r4.getColumnIndex(r10)     // Catch:{ all -> 0x0288 }
            X.0i5 r0 = new X.0i5     // Catch:{ all -> 0x0288 }
            r0.<init>()     // Catch:{ all -> 0x0288 }
        L_0x004c:
            boolean r9 = r4.moveToNext()     // Catch:{ all -> 0x0288 }
            if (r9 == 0) goto L_0x007a
            java.lang.String r10 = r4.getString(r8)     // Catch:{ all -> 0x0288 }
            java.lang.String r11 = r4.getString(r7)     // Catch:{ all -> 0x0288 }
            int r9 = r4.getInt(r6)     // Catch:{ all -> 0x0288 }
            boolean r15 = X.AnonymousClass000.A1P(r9)
            int r13 = r4.getInt(r5)     // Catch:{ all -> 0x0288 }
            java.lang.String r12 = r4.getString(r3)     // Catch:{ all -> 0x0288 }
            X.AnonymousClass00C.A08(r10)     // Catch:{ all -> 0x0288 }
            X.AnonymousClass00C.A08(r11)     // Catch:{ all -> 0x0288 }
            r14 = 2
            X.6PV r9 = new X.6PV     // Catch:{ all -> 0x0288 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0288 }
            r0.put(r10, r9)     // Catch:{ all -> 0x0288 }
            goto L_0x004c
        L_0x007a:
            X.0i5 r24 = X.C000300d.A04(r0)     // Catch:{ all -> 0x0288 }
        L_0x007e:
            r4.close()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "PRAGMA foreign_key_list(`"
            r0 = r32
            X.AnonymousClass000.A1D(r3, r0, r1, r4)
            java.lang.String r0 = r4.toString()
            android.database.Cursor r4 = X.C138616iP.A00(r2, r0)
            r3 = -1
            java.lang.String r8 = "on_update"
            java.lang.String r7 = "on_delete"
            java.lang.String r6 = "table"
            java.lang.String r5 = "seq"
            java.lang.String r0 = "id"
            int r18 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0288 }
            int r17 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0288 }
            int r16 = r4.getColumnIndex(r6)     // Catch:{ all -> 0x0288 }
            int r7 = r4.getColumnIndex(r7)     // Catch:{ all -> 0x0288 }
            int r6 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x0288 }
            int r15 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0288 }
            int r14 = r4.getColumnIndex(r5)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = "from"
            int r13 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = "to"
            int r12 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x0288 }
            X.0k2 r11 = new X.0k2     // Catch:{ all -> 0x0288 }
            r11.<init>()     // Catch:{ all -> 0x0288 }
        L_0x00cc:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x00eb
            int r10 = r4.getInt(r15)     // Catch:{ all -> 0x0288 }
            int r9 = r4.getInt(r14)     // Catch:{ all -> 0x0288 }
            java.lang.String r8 = X.C90494aF.A0Z(r4, r13)     // Catch:{ all -> 0x0288 }
            java.lang.String r5 = X.C90494aF.A0Z(r4, r12)     // Catch:{ all -> 0x0288 }
            X.72S r0 = new X.72S     // Catch:{ all -> 0x0288 }
            r0.<init>(r10, r9, r8, r5)     // Catch:{ all -> 0x0288 }
            r11.add(r0)     // Catch:{ all -> 0x0288 }
            goto L_0x00cc
        L_0x00eb:
            X.0k2 r0 = X.AnonymousClass03S.A00(r11)     // Catch:{ all -> 0x0288 }
            java.util.List r14 = X.C007103b.A0X(r0)     // Catch:{ all -> 0x0288 }
            r4.moveToPosition(r3)     // Catch:{ all -> 0x0288 }
            X.0k4 r5 = new X.0k4     // Catch:{ all -> 0x0288 }
            r5.<init>()     // Catch:{ all -> 0x0288 }
        L_0x00fb:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x016c
            r0 = r17
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0288 }
            if (r0 != 0) goto L_0x00fb
            r0 = r18
            int r13 = r4.getInt(r0)     // Catch:{ all -> 0x0288 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0288 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0288 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0288 }
            java.util.Iterator r11 = r14.iterator()     // Catch:{ all -> 0x0288 }
        L_0x011f:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x0134
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0288 }
            r0 = r10
            X.72S r0 = (X.AnonymousClass72S) r0     // Catch:{ all -> 0x0288 }
            int r0 = r0.A00     // Catch:{ all -> 0x0288 }
            if (r0 != r13) goto L_0x011f
            r12.add(r10)     // Catch:{ all -> 0x0288 }
            goto L_0x011f
        L_0x0134:
            java.util.Iterator r11 = r12.iterator()     // Catch:{ all -> 0x0288 }
        L_0x0138:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x014f
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0288 }
            X.72S r10 = (X.AnonymousClass72S) r10     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x0288 }
            r9.add(r0)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x0288 }
            r8.add(r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0138
        L_0x014f:
            r0 = r16
            java.lang.String r27 = X.C90494aF.A0Z(r4, r0)     // Catch:{ all -> 0x0288 }
            java.lang.String r28 = X.C90494aF.A0Z(r4, r7)     // Catch:{ all -> 0x0288 }
            java.lang.String r29 = X.C90494aF.A0Z(r4, r6)     // Catch:{ all -> 0x0288 }
            X.6Cf r0 = new X.6Cf     // Catch:{ all -> 0x0288 }
            r26 = r0
            r30 = r9
            r31 = r8
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0288 }
            r5.add(r0)     // Catch:{ all -> 0x0288 }
            goto L_0x00fb
        L_0x016c:
            X.0k4 r23 = X.AnonymousClass02M.A00(r5)     // Catch:{ all -> 0x0288 }
            r4.close()
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "PRAGMA index_list(`"
            r0 = r32
            X.AnonymousClass000.A1D(r4, r0, r1, r5)
            java.lang.String r0 = r5.toString()
            android.database.Cursor r12 = X.C138616iP.A00(r2, r0)
            java.lang.String r22 = "c"
            java.lang.String r5 = "unique"
            java.lang.String r4 = "origin"
            r11 = 0
            r0 = r25
            int r10 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x0281 }
            int r9 = r12.getColumnIndex(r4)     // Catch:{ all -> 0x0281 }
            int r8 = r12.getColumnIndex(r5)     // Catch:{ all -> 0x0281 }
            if (r10 == r3) goto L_0x0272
            if (r9 == r3) goto L_0x0272
            if (r8 == r3) goto L_0x0272
            X.0k4 r21 = new X.0k4     // Catch:{ all -> 0x0281 }
            r21.<init>()     // Catch:{ all -> 0x0281 }
        L_0x01a6:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0281 }
            if (r0 == 0) goto L_0x026e
            java.lang.String r3 = r12.getString(r9)     // Catch:{ all -> 0x0281 }
            r0 = r22
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0281 }
            if (r0 == 0) goto L_0x01a6
            java.lang.String r13 = r12.getString(r10)     // Catch:{ all -> 0x0281 }
            int r3 = r12.getInt(r8)     // Catch:{ all -> 0x0281 }
            r0 = 1
            boolean r20 = X.AnonymousClass000.A1S(r3, r0)
            X.AnonymousClass00C.A08(r13)     // Catch:{ all -> 0x0281 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = "PRAGMA index_xinfo(`"
            X.AnonymousClass000.A1D(r0, r13, r1, r3)     // Catch:{ all -> 0x0281 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0281 }
            android.database.Cursor r7 = X.C138616iP.A00(r2, r0)     // Catch:{ all -> 0x0281 }
            java.lang.String r19 = "DESC"
            java.lang.String r18 = "ASC"
            java.lang.String r4 = "desc"
            java.lang.String r5 = "cid"
            java.lang.String r0 = "seqno"
            r3 = -1
            int r14 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0267 }
            int r6 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x0267 }
            r0 = r25
            int r5 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x0267 }
            int r4 = r7.getColumnIndex(r4)     // Catch:{ all -> 0x0267 }
            if (r14 == r3) goto L_0x025a
            if (r6 == r3) goto L_0x025a
            if (r5 == r3) goto L_0x025a
            if (r4 == r3) goto L_0x025a
            java.util.TreeMap r17 = new java.util.TreeMap     // Catch:{ all -> 0x0267 }
            r17.<init>()     // Catch:{ all -> 0x0267 }
            java.util.TreeMap r16 = new java.util.TreeMap     // Catch:{ all -> 0x0267 }
            r16.<init>()     // Catch:{ all -> 0x0267 }
        L_0x0208:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0267 }
            if (r0 == 0) goto L_0x023c
            int r0 = r7.getInt(r6)     // Catch:{ all -> 0x0267 }
            if (r0 < 0) goto L_0x0208
            int r3 = r7.getInt(r14)     // Catch:{ all -> 0x0267 }
            java.lang.String r15 = r7.getString(r5)     // Catch:{ all -> 0x0267 }
            int r0 = r7.getInt(r4)     // Catch:{ all -> 0x0267 }
            r26 = r19
            if (r0 > 0) goto L_0x0226
            r19 = r18
        L_0x0226:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0267 }
            X.AnonymousClass00C.A08(r15)     // Catch:{ all -> 0x0267 }
            r0 = r17
            r0.put(r3, r15)     // Catch:{ all -> 0x0267 }
            r15 = r19
            r0 = r16
            r0.put(r3, r15)     // Catch:{ all -> 0x0267 }
            r19 = r26
            goto L_0x0208
        L_0x023c:
            java.util.Collection r0 = r17.values()     // Catch:{ all -> 0x0267 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0267 }
            java.util.List r4 = X.C007103b.A0Y(r0)     // Catch:{ all -> 0x0267 }
            java.util.Collection r0 = r16.values()     // Catch:{ all -> 0x0267 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0267 }
            java.util.List r3 = X.C007103b.A0Y(r0)     // Catch:{ all -> 0x0267 }
            X.6Bv r5 = new X.6Bv     // Catch:{ all -> 0x0267 }
            r0 = r20
            r5.<init>(r13, r4, r3, r0)     // Catch:{ all -> 0x0267 }
            goto L_0x025b
        L_0x025a:
            r5 = 0
        L_0x025b:
            r7.close()     // Catch:{ all -> 0x0281 }
            if (r5 == 0) goto L_0x0272
            r0 = r21
            r0.add(r5)     // Catch:{ all -> 0x0281 }
            goto L_0x01a6
        L_0x0267:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0269 }
        L_0x0269:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x0281 }
            throw r0     // Catch:{ all -> 0x0281 }
        L_0x026e:
            X.0k4 r11 = X.AnonymousClass02M.A00(r21)     // Catch:{ all -> 0x0281 }
        L_0x0272:
            r12.close()
            X.6Bw r3 = new X.6Bw
            r2 = r24
            r1 = r23
            r0 = r32
            r3.<init>(r0, r2, r1, r11)
            return r3
        L_0x0281:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r0 = move-exception
            X.C05600Qi.A00(r12, r1)
            throw r0
        L_0x0288:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x028a }
        L_0x028a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130976Nf.A00(X.7o9, java.lang.String):X.6Bw");
    }

    public static void A01(String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new C128426Cf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
    }

    public void A03(C162177o9 r2) {
        r2.B6z("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B6z("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        r2.B6z("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        r2.B6z("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r2.B6z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r2.B6z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r2.B6z("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B6z("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        r2.B6z("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B6z("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B6z("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        r2.B6z("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.B6z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r2.B6z("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r2.B6z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }
}
