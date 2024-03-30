package X;

import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: X.13N  reason: invalid class name */
public class AnonymousClass13N implements C19710wO {
    public final C19900wh A00;
    public final AnonymousClass12U A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;

    public String BIB() {
        return "AppUpdatedEventManager";
    }

    public void BRL() {
        SharedPreferences sharedPreferences = this.A00.A01;
        if (sharedPreferences.getBoolean("async_tasks_pending_for_version_change", false)) {
            for (C88594Th BRJ : (Set) this.A02.get()) {
                BRJ.BRJ();
            }
            sharedPreferences.edit().putBoolean("async_tasks_pending_for_version_change", false).apply();
            ((C19420v0) this.A04.get()).A1Z("client_version_upgrade_timestamp");
        }
    }

    public void BRM() {
        if (this.A00.A01.getBoolean("async_tasks_pending_for_version_change", false)) {
            for (C88594Th BRI : (Set) this.A02.get()) {
                BRI.BRI();
            }
        }
    }

    public AnonymousClass13N(C19900wh r1, AnonymousClass12U r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        this.A01 = r2;
        this.A04 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r5;
    }
}
