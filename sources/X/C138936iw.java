package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.6iw  reason: invalid class name and case insensitive filesystem */
public final class C138936iw implements C160977lt {
    public final C97124oV A00;
    public final C162547ol A01;
    public final AnonymousClass6Q8 A02;
    public final AnonymousClass6P9 A03;
    public final AnonymousClass6P9 A04;
    public final AnonymousClass6P9 A05;
    public final AnonymousClass6P9 A06;
    public final AnonymousClass6P9 A07;
    public final AnonymousClass6P9 A08;
    public final AnonymousClass6P9 A09;
    public final AnonymousClass6P9 A0A;
    public final AnonymousClass6P9 A0B;
    public final AnonymousClass6P9 A0C;
    public final AnonymousClass6P9 A0D;

    public void B5B(String str) {
        AnonymousClass6Q8 r3 = this.A02;
        r3.A05();
        AnonymousClass6P9 r2 = this.A07;
        C161957nk A002 = AnonymousClass6P9.A00(r3, r2, str);
        try {
            C97274ok.A00(r3, A002);
        } finally {
            AnonymousClass6Q8.A01(r3);
            r2.A03(A002);
        }
    }

    public ArrayList B8U(int i) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        A002.B1o(1, (long) 200);
        AnonymousClass6Q8 r1 = this.A02;
        r1.A05();
        Cursor A003 = C109365Xh.A00(r1, A002, false);
        try {
            int A012 = AnonymousClass6GJ.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = AnonymousClass6GJ.A01(A003, "state");
            int A014 = AnonymousClass6GJ.A01(A003, "worker_class_name");
            int A015 = AnonymousClass6GJ.A01(A003, "input_merger_class_name");
            int A016 = AnonymousClass6GJ.A01(A003, "input");
            int A017 = AnonymousClass6GJ.A01(A003, "output");
            int A018 = AnonymousClass6GJ.A01(A003, "initial_delay");
            int A019 = AnonymousClass6GJ.A01(A003, "interval_duration");
            int A0110 = AnonymousClass6GJ.A01(A003, "flex_duration");
            int A0111 = AnonymousClass6GJ.A01(A003, "run_attempt_count");
            int A0112 = AnonymousClass6GJ.A01(A003, "backoff_policy");
            int A0113 = AnonymousClass6GJ.A01(A003, "backoff_delay_duration");
            int A0114 = AnonymousClass6GJ.A01(A003, "last_enqueue_time");
            int A0115 = AnonymousClass6GJ.A01(A003, "minimum_retention_duration");
            int A0116 = AnonymousClass6GJ.A01(A003, "schedule_requested_at");
            int A0117 = AnonymousClass6GJ.A01(A003, "run_in_foreground");
            int A0118 = AnonymousClass6GJ.A01(A003, "out_of_quota_policy");
            int A0119 = AnonymousClass6GJ.A01(A003, "period_count");
            int A0120 = AnonymousClass6GJ.A01(A003, "generation");
            int A0121 = AnonymousClass6GJ.A01(A003, "required_network_type");
            int A0122 = AnonymousClass6GJ.A01(A003, "requires_charging");
            int A0123 = AnonymousClass6GJ.A01(A003, "requires_device_idle");
            int A0124 = AnonymousClass6GJ.A01(A003, "requires_battery_not_low");
            int A0125 = AnonymousClass6GJ.A01(A003, "requires_storage_not_low");
            int A0126 = AnonymousClass6GJ.A01(A003, "trigger_content_update_delay");
            int A0127 = AnonymousClass6GJ.A01(A003, "trigger_max_content_delay");
            int A0128 = AnonymousClass6GJ.A01(A003, "content_uri_triggers");
            ArrayList A0n = C90474aD.A0n(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A012)) {
                    str = null;
                } else {
                    str = A003.getString(A012);
                }
                Integer A052 = AnonymousClass6XU.A05(A003.getInt(A013));
                if (A003.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A015);
                }
                if (A003.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A016);
                }
                AnonymousClass6X2 A004 = AnonymousClass6X2.A00(bArr);
                if (A003.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A017);
                }
                AnonymousClass6X2 A005 = AnonymousClass6X2.A00(bArr2);
                long j = A003.getLong(A018);
                long j2 = A003.getLong(A019);
                long j3 = A003.getLong(A0110);
                int i2 = A003.getInt(A0111);
                Integer A022 = AnonymousClass6XU.A02(A003.getInt(A0112));
                long j4 = A003.getLong(A0113);
                long j5 = A003.getLong(A0114);
                long j6 = A003.getLong(A0115);
                long j7 = A003.getLong(A0116);
                boolean A1P = AnonymousClass000.A1P(A003.getInt(A0117));
                Integer A042 = AnonymousClass6XU.A04(A003.getInt(A0118));
                int i3 = A003.getInt(A0119);
                int i4 = A003.getInt(A0120);
                Integer A032 = AnonymousClass6XU.A03(A003.getInt(A0121));
                boolean A1P2 = AnonymousClass000.A1P(A003.getInt(A0122));
                boolean A1P3 = AnonymousClass000.A1P(A003.getInt(A0123));
                boolean A1P4 = AnonymousClass000.A1P(A003.getInt(A0124));
                boolean A1P5 = AnonymousClass000.A1P(A003.getInt(A0125));
                long j8 = A003.getLong(A0126);
                long j9 = A003.getLong(A0127);
                if (A003.isNull(A0128)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0128);
                }
                A0n.add(new AnonymousClass6QA(new C132316Tb(A032, AnonymousClass6XU.A06(bArr3), j8, j9, A1P2, A1P3, A1P4, A1P5), A004, A005, A052, A022, A042, str, str2, str3, i2, i3, i4, j, j2, j3, j4, j5, j6, j7, A1P));
            }
            return A0n;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public ArrayList BGu() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT * FROM workspec WHERE state=1", 0);
        AnonymousClass6Q8 r1 = this.A02;
        r1.A05();
        Cursor A003 = C109365Xh.A00(r1, A002, false);
        try {
            int A012 = AnonymousClass6GJ.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = AnonymousClass6GJ.A01(A003, "state");
            int A014 = AnonymousClass6GJ.A01(A003, "worker_class_name");
            int A015 = AnonymousClass6GJ.A01(A003, "input_merger_class_name");
            int A016 = AnonymousClass6GJ.A01(A003, "input");
            int A017 = AnonymousClass6GJ.A01(A003, "output");
            int A018 = AnonymousClass6GJ.A01(A003, "initial_delay");
            int A019 = AnonymousClass6GJ.A01(A003, "interval_duration");
            int A0110 = AnonymousClass6GJ.A01(A003, "flex_duration");
            int A0111 = AnonymousClass6GJ.A01(A003, "run_attempt_count");
            int A0112 = AnonymousClass6GJ.A01(A003, "backoff_policy");
            int A0113 = AnonymousClass6GJ.A01(A003, "backoff_delay_duration");
            int A0114 = AnonymousClass6GJ.A01(A003, "last_enqueue_time");
            int A0115 = AnonymousClass6GJ.A01(A003, "minimum_retention_duration");
            int A0116 = AnonymousClass6GJ.A01(A003, "schedule_requested_at");
            int A0117 = AnonymousClass6GJ.A01(A003, "run_in_foreground");
            int A0118 = AnonymousClass6GJ.A01(A003, "out_of_quota_policy");
            int A0119 = AnonymousClass6GJ.A01(A003, "period_count");
            int A0120 = AnonymousClass6GJ.A01(A003, "generation");
            int A0121 = AnonymousClass6GJ.A01(A003, "required_network_type");
            int A0122 = AnonymousClass6GJ.A01(A003, "requires_charging");
            int A0123 = AnonymousClass6GJ.A01(A003, "requires_device_idle");
            int A0124 = AnonymousClass6GJ.A01(A003, "requires_battery_not_low");
            int A0125 = AnonymousClass6GJ.A01(A003, "requires_storage_not_low");
            int A0126 = AnonymousClass6GJ.A01(A003, "trigger_content_update_delay");
            int A0127 = AnonymousClass6GJ.A01(A003, "trigger_max_content_delay");
            int A0128 = AnonymousClass6GJ.A01(A003, "content_uri_triggers");
            ArrayList A0n = C90474aD.A0n(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A012)) {
                    str = null;
                } else {
                    str = A003.getString(A012);
                }
                Integer A052 = AnonymousClass6XU.A05(A003.getInt(A013));
                if (A003.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A015);
                }
                if (A003.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A016);
                }
                AnonymousClass6X2 A004 = AnonymousClass6X2.A00(bArr);
                if (A003.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A017);
                }
                AnonymousClass6X2 A005 = AnonymousClass6X2.A00(bArr2);
                long j = A003.getLong(A018);
                long j2 = A003.getLong(A019);
                long j3 = A003.getLong(A0110);
                int i = A003.getInt(A0111);
                Integer A022 = AnonymousClass6XU.A02(A003.getInt(A0112));
                long j4 = A003.getLong(A0113);
                long j5 = A003.getLong(A0114);
                long j6 = A003.getLong(A0115);
                long j7 = A003.getLong(A0116);
                boolean A1P = AnonymousClass000.A1P(A003.getInt(A0117));
                Integer A042 = AnonymousClass6XU.A04(A003.getInt(A0118));
                int i2 = A003.getInt(A0119);
                int i3 = A003.getInt(A0120);
                Integer A032 = AnonymousClass6XU.A03(A003.getInt(A0121));
                boolean A1P2 = AnonymousClass000.A1P(A003.getInt(A0122));
                boolean A1P3 = AnonymousClass000.A1P(A003.getInt(A0123));
                boolean A1P4 = AnonymousClass000.A1P(A003.getInt(A0124));
                boolean A1P5 = AnonymousClass000.A1P(A003.getInt(A0125));
                long j8 = A003.getLong(A0126);
                long j9 = A003.getLong(A0127);
                if (A003.isNull(A0128)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0128);
                }
                A0n.add(new AnonymousClass6QA(new C132316Tb(A032, AnonymousClass6XU.A06(bArr3), j8, j9, A1P2, A1P3, A1P4, A1P5), A004, A005, A052, A022, A042, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1P));
            }
            return A0n;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public ArrayList BH0() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        AnonymousClass6Q8 r1 = this.A02;
        r1.A05();
        Cursor A003 = C109365Xh.A00(r1, A002, false);
        try {
            int A012 = AnonymousClass6GJ.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = AnonymousClass6GJ.A01(A003, "state");
            int A014 = AnonymousClass6GJ.A01(A003, "worker_class_name");
            int A015 = AnonymousClass6GJ.A01(A003, "input_merger_class_name");
            int A016 = AnonymousClass6GJ.A01(A003, "input");
            int A017 = AnonymousClass6GJ.A01(A003, "output");
            int A018 = AnonymousClass6GJ.A01(A003, "initial_delay");
            int A019 = AnonymousClass6GJ.A01(A003, "interval_duration");
            int A0110 = AnonymousClass6GJ.A01(A003, "flex_duration");
            int A0111 = AnonymousClass6GJ.A01(A003, "run_attempt_count");
            int A0112 = AnonymousClass6GJ.A01(A003, "backoff_policy");
            int A0113 = AnonymousClass6GJ.A01(A003, "backoff_delay_duration");
            int A0114 = AnonymousClass6GJ.A01(A003, "last_enqueue_time");
            int A0115 = AnonymousClass6GJ.A01(A003, "minimum_retention_duration");
            int A0116 = AnonymousClass6GJ.A01(A003, "schedule_requested_at");
            int A0117 = AnonymousClass6GJ.A01(A003, "run_in_foreground");
            int A0118 = AnonymousClass6GJ.A01(A003, "out_of_quota_policy");
            int A0119 = AnonymousClass6GJ.A01(A003, "period_count");
            int A0120 = AnonymousClass6GJ.A01(A003, "generation");
            int A0121 = AnonymousClass6GJ.A01(A003, "required_network_type");
            int A0122 = AnonymousClass6GJ.A01(A003, "requires_charging");
            int A0123 = AnonymousClass6GJ.A01(A003, "requires_device_idle");
            int A0124 = AnonymousClass6GJ.A01(A003, "requires_battery_not_low");
            int A0125 = AnonymousClass6GJ.A01(A003, "requires_storage_not_low");
            int A0126 = AnonymousClass6GJ.A01(A003, "trigger_content_update_delay");
            int A0127 = AnonymousClass6GJ.A01(A003, "trigger_max_content_delay");
            int A0128 = AnonymousClass6GJ.A01(A003, "content_uri_triggers");
            ArrayList A0n = C90474aD.A0n(A003);
            while (A003.moveToNext()) {
                if (A003.isNull(A012)) {
                    str = null;
                } else {
                    str = A003.getString(A012);
                }
                Integer A052 = AnonymousClass6XU.A05(A003.getInt(A013));
                if (A003.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A014);
                }
                if (A003.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A003.getString(A015);
                }
                if (A003.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = A003.getBlob(A016);
                }
                AnonymousClass6X2 A004 = AnonymousClass6X2.A00(bArr);
                if (A003.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = A003.getBlob(A017);
                }
                AnonymousClass6X2 A005 = AnonymousClass6X2.A00(bArr2);
                long j = A003.getLong(A018);
                long j2 = A003.getLong(A019);
                long j3 = A003.getLong(A0110);
                int i = A003.getInt(A0111);
                Integer A022 = AnonymousClass6XU.A02(A003.getInt(A0112));
                long j4 = A003.getLong(A0113);
                long j5 = A003.getLong(A0114);
                long j6 = A003.getLong(A0115);
                long j7 = A003.getLong(A0116);
                boolean A1P = AnonymousClass000.A1P(A003.getInt(A0117));
                Integer A042 = AnonymousClass6XU.A04(A003.getInt(A0118));
                int i2 = A003.getInt(A0119);
                int i3 = A003.getInt(A0120);
                Integer A032 = AnonymousClass6XU.A03(A003.getInt(A0121));
                boolean A1P2 = AnonymousClass000.A1P(A003.getInt(A0122));
                boolean A1P3 = AnonymousClass000.A1P(A003.getInt(A0123));
                boolean A1P4 = AnonymousClass000.A1P(A003.getInt(A0124));
                boolean A1P5 = AnonymousClass000.A1P(A003.getInt(A0125));
                long j8 = A003.getLong(A0126);
                long j9 = A003.getLong(A0127);
                if (A003.isNull(A0128)) {
                    bArr3 = null;
                } else {
                    bArr3 = A003.getBlob(A0128);
                }
                A0n.add(new AnonymousClass6QA(new C132316Tb(A032, AnonymousClass6XU.A06(bArr3), j8, j9, A1P2, A1P3, A1P4, A1P5), A004, A005, A052, A022, A042, str, str2, str3, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1P));
            }
            return A0n;
        } finally {
            A003.close();
            A002.A00();
        }
    }

    public Integer BHw(String str) {
        C138686iW A012 = C109355Xg.A01("SELECT state FROM workspec WHERE id=?", str);
        AnonymousClass6Q8 r0 = this.A02;
        r0.A05();
        Integer num = null;
        Cursor A002 = C109365Xh.A00(r0, A012, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                int i = A002.getInt(0);
                if (Integer.valueOf(i) != null) {
                    num = AnonymousClass6XU.A05(i);
                }
            }
            return num;
        } finally {
            A002.close();
            A012.A00();
        }
    }

    public AnonymousClass6QA BJH(String str) {
        AnonymousClass6QA r30;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C138686iW A012 = C109355Xg.A01("SELECT * FROM workspec WHERE id=?", str);
        AnonymousClass6Q8 r2 = this.A02;
        r2.A05();
        Cursor A002 = C109365Xh.A00(r2, A012, false);
        try {
            int A013 = AnonymousClass6GJ.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A014 = AnonymousClass6GJ.A01(A002, "state");
            int A015 = AnonymousClass6GJ.A01(A002, "worker_class_name");
            int A016 = AnonymousClass6GJ.A01(A002, "input_merger_class_name");
            int A017 = AnonymousClass6GJ.A01(A002, "input");
            int A018 = AnonymousClass6GJ.A01(A002, "output");
            int A019 = AnonymousClass6GJ.A01(A002, "initial_delay");
            int A0110 = AnonymousClass6GJ.A01(A002, "interval_duration");
            int A0111 = AnonymousClass6GJ.A01(A002, "flex_duration");
            int A0112 = AnonymousClass6GJ.A01(A002, "run_attempt_count");
            int A0113 = AnonymousClass6GJ.A01(A002, "backoff_policy");
            int A0114 = AnonymousClass6GJ.A01(A002, "backoff_delay_duration");
            int A0115 = AnonymousClass6GJ.A01(A002, "last_enqueue_time");
            int A0116 = AnonymousClass6GJ.A01(A002, "minimum_retention_duration");
            int A0117 = AnonymousClass6GJ.A01(A002, "schedule_requested_at");
            int A0118 = AnonymousClass6GJ.A01(A002, "run_in_foreground");
            int A0119 = AnonymousClass6GJ.A01(A002, "out_of_quota_policy");
            int A0120 = AnonymousClass6GJ.A01(A002, "period_count");
            int A0121 = AnonymousClass6GJ.A01(A002, "generation");
            int A0122 = AnonymousClass6GJ.A01(A002, "required_network_type");
            int A0123 = AnonymousClass6GJ.A01(A002, "requires_charging");
            int A0124 = AnonymousClass6GJ.A01(A002, "requires_device_idle");
            int A0125 = AnonymousClass6GJ.A01(A002, "requires_battery_not_low");
            int A0126 = AnonymousClass6GJ.A01(A002, "requires_storage_not_low");
            int A0127 = AnonymousClass6GJ.A01(A002, "trigger_content_update_delay");
            int A0128 = AnonymousClass6GJ.A01(A002, "trigger_max_content_delay");
            int A0129 = AnonymousClass6GJ.A01(A002, "content_uri_triggers");
            if (A002.moveToFirst()) {
                if (A002.isNull(A013)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(A013);
                }
                Integer A052 = AnonymousClass6XU.A05(A002.getInt(A014));
                if (A002.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = A002.getString(A015);
                }
                if (A002.isNull(A016)) {
                    str4 = null;
                } else {
                    str4 = A002.getString(A016);
                }
                if (A002.isNull(A017)) {
                    bArr = null;
                } else {
                    bArr = A002.getBlob(A017);
                }
                AnonymousClass6X2 A003 = AnonymousClass6X2.A00(bArr);
                if (A002.isNull(A018)) {
                    bArr2 = null;
                } else {
                    bArr2 = A002.getBlob(A018);
                }
                AnonymousClass6X2 A004 = AnonymousClass6X2.A00(bArr2);
                long j = A002.getLong(A019);
                long j2 = A002.getLong(A0110);
                long j3 = A002.getLong(A0111);
                int i = A002.getInt(A0112);
                Integer A022 = AnonymousClass6XU.A02(A002.getInt(A0113));
                long j4 = A002.getLong(A0114);
                long j5 = A002.getLong(A0115);
                long j6 = A002.getLong(A0116);
                long j7 = A002.getLong(A0117);
                boolean A1P = AnonymousClass000.A1P(A002.getInt(A0118));
                Integer A042 = AnonymousClass6XU.A04(A002.getInt(A0119));
                int i2 = A002.getInt(A0120);
                int i3 = A002.getInt(A0121);
                Integer A032 = AnonymousClass6XU.A03(A002.getInt(A0122));
                boolean A1P2 = AnonymousClass000.A1P(A002.getInt(A0123));
                boolean A1P3 = AnonymousClass000.A1P(A002.getInt(A0124));
                boolean A1P4 = AnonymousClass000.A1P(A002.getInt(A0125));
                boolean A1P5 = AnonymousClass000.A1P(A002.getInt(A0126));
                long j8 = A002.getLong(A0127);
                long j9 = A002.getLong(A0128);
                if (A002.isNull(A0129)) {
                    bArr3 = null;
                } else {
                    bArr3 = A002.getBlob(A0129);
                }
                r30 = new AnonymousClass6QA(new C132316Tb(A032, AnonymousClass6XU.A06(bArr3), j8, j9, A1P2, A1P3, A1P4, A1P5), A003, A004, A052, A022, A042, str2, str3, str4, i, i2, i3, j, j2, j3, j4, j5, j6, j7, A1P);
            } else {
                r30 = null;
            }
            return r30;
        } finally {
            A002.close();
            A012.A00();
        }
    }

    public ArrayList BJI(String str) {
        String str2;
        C138686iW A012 = C109355Xg.A01("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", str);
        AnonymousClass6Q8 r0 = this.A02;
        r0.A05();
        Cursor A002 = C109365Xh.A00(r0, A012, false);
        try {
            ArrayList A0n = C90474aD.A0n(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(0);
                }
                A0n.add(new AnonymousClass69M(str2, AnonymousClass6XU.A05(A002.getInt(1))));
            }
            return A0n;
        } finally {
            A002.close();
            A012.A00();
        }
    }

    public int BP9(String str, long j) {
        AnonymousClass6Q8 r3 = this.A02;
        r3.A05();
        AnonymousClass6P9 r2 = this.A09;
        C161957nk A022 = r2.A02();
        A022.B1o(1, j);
        if (str == null) {
            A022.B1p(2);
        } else {
            A022.B1q(2, str);
        }
        r3.A06();
        try {
            int executeUpdateDelete = ((C97274ok) A022).A00.executeUpdateDelete();
            r3.A07();
            return executeUpdateDelete;
        } finally {
            AnonymousClass6Q8.A01(r3);
            r2.A03(A022);
        }
    }

    public void Br7(String str, long j) {
        AnonymousClass6Q8 r3 = this.A02;
        r3.A05();
        AnonymousClass6P9 r2 = this.A0B;
        C161957nk A022 = r2.A02();
        A022.B1o(1, j);
        if (str == null) {
            A022.B1p(2);
        } else {
            A022.B1q(2, str);
        }
        r3.A06();
        try {
            C97274ok.A00(r3, A022);
        } finally {
            AnonymousClass6Q8.A01(r3);
            r2.A03(A022);
        }
    }

    public void BrR(AnonymousClass6X2 r6, String str) {
        AnonymousClass6Q8 r4 = this.A02;
        r4.A05();
        AnonymousClass6P9 r3 = this.A0C;
        C161957nk A022 = r3.A02();
        byte[] A012 = AnonymousClass6X2.A01(r6);
        if (A012 == null) {
            A022.B1p(1);
        } else {
            A022.B1m(1, A012);
        }
        A022.B1q(2, str);
        r4.A06();
        try {
            C97274ok.A00(r4, A022);
        } finally {
            AnonymousClass6Q8.A01(r4);
            r3.A03(A022);
        }
    }

    public int BsK(Integer num, String str) {
        AnonymousClass6Q8 r5 = this.A02;
        r5.A05();
        AnonymousClass6P9 r4 = this.A0D;
        C161957nk A022 = r4.A02();
        A022.B1o(1, (long) AnonymousClass6XU.A01(num));
        if (str == null) {
            A022.B1p(2);
        } else {
            A022.B1q(2, str);
        }
        r5.A06();
        try {
            int executeUpdateDelete = ((C97274ok) A022).A00.executeUpdateDelete();
            r5.A07();
            return executeUpdateDelete;
        } finally {
            AnonymousClass6Q8.A01(r5);
            r4.A03(A022);
        }
    }

    public C138936iw(AnonymousClass6Q8 r4) {
        this.A02 = r4;
        this.A00 = new C162537ok(r4, this, 5);
        this.A01 = new C162547ol(r4, this, 8);
        this.A07 = new C162547ol(r4, this, 9);
        this.A0D = new C162547ol(r4, this, 10);
        this.A03 = new C162547ol(r4, this, 11);
        this.A0C = new C162547ol(r4, this, 12);
        this.A0B = new C162547ol(r4, this, 13);
        this.A04 = new C162547ol(r4, this, 14);
        this.A06 = new C162547ol(r4, this, 15);
        this.A09 = new C162547ol(r4, this, 4);
        this.A05 = new C162547ol(r4, this, 5);
        this.A0A = new C162547ol(r4, this, 6);
        this.A08 = new C162547ol(r4, this, 7);
    }

    public static void A00(AnonymousClass008 r8, C138936iw r9) {
        byte[] bArr;
        int i;
        Set keySet = r8.keySet();
        if (!keySet.isEmpty()) {
            int size = r8.size();
            if (size > 999) {
                AnonymousClass008 r4 = new AnonymousClass008(999);
                int i2 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        r4.put(r8.A04(i2), r8.A06(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            A00(r4, r9);
                            r4 = new AnonymousClass008(999);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    A00(r4, r9);
                    return;
                }
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            for (int i3 = 0; i3 < size2; i3++) {
                A0u.append("?");
                if (i3 < size2 - 1) {
                    A0u.append(",");
                }
            }
            String A0f = C90474aD.A0f(A0u);
            TreeMap treeMap = C138686iW.A08;
            C138686iW A002 = C109355Xg.A00(A0f, size2);
            Iterator it = keySet.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(it);
                if (A0C2 == null) {
                    A002.B1p(i4);
                } else {
                    A002.B1q(i4, A0C2);
                }
                i4++;
            }
            Cursor A003 = C109365Xh.A00(r9.A02, A002, false);
            try {
                int A004 = AnonymousClass6GJ.A00(A003, "work_spec_id");
                if (A004 != -1) {
                    while (A003.moveToNext()) {
                        ArrayList arrayList = (ArrayList) r8.get(A003.getString(A004));
                        if (arrayList != null) {
                            if (A003.isNull(0)) {
                                bArr = null;
                            } else {
                                bArr = A003.getBlob(0);
                            }
                            arrayList.add(AnonymousClass6X2.A00(bArr));
                        }
                    }
                }
            } finally {
                A003.close();
            }
        }
    }

    public static void A01(AnonymousClass008 r8, C138936iw r9) {
        String str;
        int i;
        Set keySet = r8.keySet();
        if (!keySet.isEmpty()) {
            int size = r8.size();
            if (size > 999) {
                AnonymousClass008 r4 = new AnonymousClass008(999);
                int i2 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        r4.put(r8.A04(i2), r8.A06(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            A01(r4, r9);
                            r4 = new AnonymousClass008(999);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    A01(r4, r9);
                    return;
                }
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            for (int i3 = 0; i3 < size2; i3++) {
                A0u.append("?");
                if (i3 < size2 - 1) {
                    A0u.append(",");
                }
            }
            String A0f = C90474aD.A0f(A0u);
            TreeMap treeMap = C138686iW.A08;
            C138686iW A002 = C109355Xg.A00(A0f, size2);
            Iterator it = keySet.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(it);
                if (A0C2 == null) {
                    A002.B1p(i4);
                } else {
                    A002.B1q(i4, A0C2);
                }
                i4++;
            }
            Cursor A003 = C109365Xh.A00(r9.A02, A002, false);
            try {
                int A004 = AnonymousClass6GJ.A00(A003, "work_spec_id");
                if (A004 != -1) {
                    while (A003.moveToNext()) {
                        ArrayList arrayList = (ArrayList) r8.get(A003.getString(A004));
                        if (arrayList != null) {
                            if (A003.isNull(0)) {
                                str = null;
                            } else {
                                str = A003.getString(0);
                            }
                            arrayList.add(str);
                        }
                    }
                }
            } finally {
                A003.close();
            }
        }
    }
}
