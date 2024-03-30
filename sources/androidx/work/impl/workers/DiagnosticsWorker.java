package androidx.work.impl.workers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass6GJ;
import X.AnonymousClass6I3;
import X.AnonymousClass6Q8;
import X.AnonymousClass6QA;
import X.AnonymousClass6VD;
import X.AnonymousClass6VR;
import X.AnonymousClass6X2;
import X.AnonymousClass6XU;
import X.C109355Xg;
import X.C109365Xh;
import X.C109385Xj;
import X.C132316Tb;
import X.C138686iW;
import X.C138936iw;
import X.C157157bv;
import X.C158967iX;
import X.C158977iY;
import X.C160977lt;
import X.C36321k7;
import X.C36411kG;
import X.C90474aD;
import X.C90484aE;
import X.C97344ox;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: finally extract failed */
    public C109385Xj A09() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AnonymousClass6VR A00 = AnonymousClass6VR.A00(this.A00);
        AnonymousClass00C.A08(A00);
        WorkDatabase workDatabase = A00.A04;
        AnonymousClass00C.A08(workDatabase);
        C160977lt A0D = workDatabase.A0D();
        C157157bv A0B = workDatabase.A0B();
        C158977iY A0E = workDatabase.A0E();
        C158967iX A0A = workDatabase.A0A();
        long currentTimeMillis = System.currentTimeMillis() - C90484aE.A0K(TimeUnit.DAYS);
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A002.B1o(1, currentTimeMillis);
        AnonymousClass6Q8 r1 = ((C138936iw) A0D).A02;
        r1.A05();
        Cursor A003 = C109365Xh.A00(r1, A002, false);
        try {
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
                AnonymousClass6X2 A004 = AnonymousClass6X2.A00(bArr);
                if (A003.isNull(A016)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A016);
                }
                AnonymousClass6X2 A005 = AnonymousClass6X2.A00(bArr2);
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
                A0n.add(new AnonymousClass6QA(new C132316Tb(A03, AnonymousClass6XU.A06(bArr3), j8, j9, A1P2, A1P3, A1P4, A1P5), A004, A005, A05, A02, A04, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1P));
            }
            A003.close();
            A002.A00();
            ArrayList BGu = A0D.BGu();
            ArrayList B8U = A0D.B8U(200);
            if (C36411kG.A1a(A0n)) {
                AnonymousClass6VD.A00();
                String str4 = AnonymousClass6I3.A00;
                Log.i(str4, "Recently completed work:\n\n");
                AnonymousClass6VD.A00();
                Log.i(str4, AnonymousClass6I3.A00(A0A, A0B, A0E, A0n));
            }
            if (C36411kG.A1a(BGu)) {
                AnonymousClass6VD.A00();
                String str5 = AnonymousClass6I3.A00;
                Log.i(str5, "Running work:\n\n");
                AnonymousClass6VD.A00();
                Log.i(str5, AnonymousClass6I3.A00(A0A, A0B, A0E, BGu));
            }
            if (C36411kG.A1a(B8U)) {
                AnonymousClass6VD.A00();
                String str6 = AnonymousClass6I3.A00;
                Log.i(str6, "Enqueued work:\n\n");
                AnonymousClass6VD.A00();
                Log.i(str6, AnonymousClass6I3.A00(A0A, A0B, A0E, B8U));
            }
            return C97344ox.A00();
        } catch (Throwable th) {
            A003.close();
            A002.A00();
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
    }
}
