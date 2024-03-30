package X;

import android.database.sqlite.SQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6P9  reason: invalid class name */
public abstract class AnonymousClass6P9 {
    public final AnonymousClass6Q8 A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new AnonymousClass7JN(this));
    public final AtomicBoolean A02 = C36431kI.A1H();

    public void A03(C161957nk r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3 == this.A01.getValue()) {
            this.A02.set(false);
        }
    }

    public static final C97274ok A01(AnonymousClass6P9 r3) {
        String str;
        if (!(r3 instanceof C162547ol)) {
            switch (((C162537ok) r3).A01) {
                case 0:
                    str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                    break;
                case 1:
                    str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                    break;
                case 2:
                    str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                    break;
                case 3:
                    str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                    break;
                case 4:
                    str = "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
                    break;
                case 5:
                    str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    break;
                default:
                    str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                    break;
            }
        } else {
            switch (((C162547ol) r3).A01) {
                case 0:
                    str = "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
                    break;
                case 1:
                    str = "DELETE FROM SystemIdInfo where work_spec_id=?";
                    break;
                case 2:
                    str = "DELETE from WorkProgress where work_spec_id=?";
                    break;
                case 3:
                    str = "DELETE FROM WorkProgress";
                    break;
                case 4:
                    str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
                    break;
                case 5:
                    str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
                    break;
                case 6:
                    str = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
                    break;
                case 7:
                    str = "UPDATE workspec SET generation=generation+1 WHERE id=?";
                    break;
                case 8:
                    str = "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
                    break;
                case 9:
                    str = "DELETE FROM workspec WHERE id=?";
                    break;
                case 10:
                    str = "UPDATE workspec SET state=? WHERE id=?";
                    break;
                case 11:
                    str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
                    break;
                case 12:
                    str = "UPDATE workspec SET output=? WHERE id=?";
                    break;
                case 13:
                    str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
                    break;
                case 14:
                    str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
                    break;
                case 15:
                    str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
                    break;
                default:
                    str = "DELETE FROM worktag WHERE work_spec_id=?";
                    break;
            }
        }
        AnonymousClass6Q8 r1 = r3.A00;
        r1.A04();
        r1.A05();
        SQLiteStatement compileStatement = AnonymousClass6Q8.A00(r1).compileStatement(str);
        AnonymousClass00C.A08(compileStatement);
        return new C97274ok(compileStatement);
    }

    public C161957nk A02() {
        this.A00.A04();
        if (C90504aG.A1Z(this.A02)) {
            return (C161957nk) this.A01.getValue();
        }
        return A01(this);
    }

    public AnonymousClass6P9(AnonymousClass6Q8 r2) {
        this.A00 = r2;
    }

    public static C161957nk A00(AnonymousClass6Q8 r2, AnonymousClass6P9 r3, String str) {
        C161957nk A022 = r3.A02();
        A022.B1q(1, str);
        r2.A06();
        return A022;
    }
}
