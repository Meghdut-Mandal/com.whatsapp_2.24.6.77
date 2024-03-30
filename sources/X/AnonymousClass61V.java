package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: X.61V  reason: invalid class name */
public abstract class AnonymousClass61V {
    public final int A00;
    public final int A01;

    public void A00(C162177o9 r15) {
        String str;
        long A09;
        int byteValue;
        double A012;
        String str2;
        if (this instanceof C97164oZ) {
            r15.B6z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = ((C97164oZ) this).A00;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                SQLiteDatabase sQLiteDatabase = ((C138616iP) r15).A00;
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    Object[] objArr = new Object[2];
                    objArr[0] = "reschedule_needed";
                    AnonymousClass000.A1M(objArr, 1, j);
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
                    C90504aG.A12(sharedPreferences);
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                SQLiteDatabase sQLiteDatabase2 = ((C138616iP) r15).A00;
                sQLiteDatabase2.beginTransaction();
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = "next_job_scheduler_id";
                    AnonymousClass000.A1L(objArr2, i, 1);
                    sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr2);
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = "next_alarm_manager_id";
                    AnonymousClass000.A1L(objArr3, i2, 1);
                    sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr3);
                    C90504aG.A12(sharedPreferences2);
                    sQLiteDatabase2.setTransactionSuccessful();
                } finally {
                    sQLiteDatabase2.endTransaction();
                }
            }
        } else if (this instanceof C97144oX) {
            r15.B6z("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            r15.B6z("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
            r15.B6z("DROP TABLE `WorkSpec`");
            r15.B6z("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
            r15.B6z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            r15.B6z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            r15.B6z("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("last_enqueue_time", C90484aE.A0g());
            Object[] objArr4 = new Object[0];
            C138616iP r152 = (C138616iP) r15;
            int i3 = 0;
            if (contentValues.size() != 0) {
                int size = contentValues.size();
                Object[] objArr5 = new Object[size];
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("UPDATE ");
                A0u.append(C138616iP.A02[3]);
                A0u.append("WorkSpec");
                A0u.append(" SET ");
                Iterator<String> it = contentValues.keySet().iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    if (i3 > 0) {
                        str2 = ",";
                    } else {
                        str2 = "";
                    }
                    A0u.append(str2);
                    A0u.append(A0C);
                    objArr5[i3] = contentValues.get(A0C);
                    A0u.append("=?");
                    i3++;
                }
                for (int i4 = size; i4 < size; i4++) {
                    objArr5[i4] = objArr4[i4 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    A0u.append(" WHERE ");
                    A0u.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                SQLiteStatement compileStatement = r152.A00.compileStatement(C36381kD.A0y(A0u));
                AnonymousClass00C.A08(compileStatement);
                C97274ok r5 = new C97274ok(compileStatement);
                int i5 = 0;
                while (i5 < size) {
                    Object obj = objArr5[i5];
                    i5++;
                    if (obj == null) {
                        r5.B1p(i5);
                    } else if (obj instanceof byte[]) {
                        r5.B1m(i5, (byte[]) obj);
                    } else {
                        if (obj instanceof Float) {
                            A012 = (double) C36441kJ.A03(obj);
                        } else if (obj instanceof Double) {
                            A012 = C90504aG.A01(obj);
                        } else {
                            if (obj instanceof Long) {
                                A09 = C36431kI.A09(obj);
                            } else {
                                if (obj instanceof Integer) {
                                    byteValue = AnonymousClass000.A0I(obj);
                                } else if (obj instanceof Short) {
                                    byteValue = ((Number) obj).shortValue();
                                } else if (obj instanceof Byte) {
                                    byteValue = ((Number) obj).byteValue();
                                } else if (obj instanceof String) {
                                    r5.B1q(i5, (String) obj);
                                } else if (obj instanceof Boolean) {
                                    A09 = C90474aD.A09(AnonymousClass000.A1X(obj) ? 1 : 0);
                                } else {
                                    StringBuilder A0u2 = AnonymousClass000.A0u();
                                    A0u2.append("Cannot bind ");
                                    A0u2.append(obj);
                                    A0u2.append(" at index ");
                                    A0u2.append(i5);
                                    throw AnonymousClass000.A0c(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String", A0u2);
                                }
                                A09 = (long) byteValue;
                            }
                            r5.B1o(i5, A09);
                        }
                        r5.A00.bindDouble(i5, A012);
                    }
                }
                r5.A00.executeUpdateDelete();
                return;
            }
            throw AnonymousClass001.A08("Empty values");
        } else {
            if (this instanceof C97134oW) {
                r15.B6z("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                r15.B6z("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                r15.B6z("DROP TABLE `WorkSpec`");
                r15.B6z("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                r15.B6z("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                str = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)";
            } else if (this instanceof C97154oY) {
                C97154oY r52 = (C97154oY) this;
                if (r52.A00 >= 10) {
                    Object[] A1b = C36411kG.A1b("reschedule_needed");
                    A1b[1] = 1;
                    ((C138616iP) r15).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", A1b);
                    return;
                }
                C36331k8.A0w(r52.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit(), "reschedule_needed", true);
                return;
            } else if (this instanceof C97254oi) {
                str = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
            } else if (this instanceof C97244oh) {
                str = "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ";
            } else if (this instanceof C97234og) {
                str = "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";
            } else if (this instanceof C97224of) {
                r15.B6z("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                str = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
            } else if (this instanceof C97204od) {
                r15.B6z("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                r15.B6z("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                r15.B6z("DROP TABLE IF EXISTS alarmInfo");
                str = "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ";
            } else if (this instanceof C97194oc) {
                r15.B6z("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                r15.B6z("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                r15.B6z("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                r15.B6z("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                r15.B6z("DROP TABLE `SystemIdInfo`");
                str = "ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`";
            } else if (this instanceof C97184ob) {
                r15.B6z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                str = "UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL";
            } else {
                str = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
            }
            r15.B6z(str);
        }
    }

    public AnonymousClass61V(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
