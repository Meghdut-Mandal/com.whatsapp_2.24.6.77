package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.1QD  reason: invalid class name */
public class AnonymousClass1QD {
    public final C19630wG A00;
    public final C19420v0 A01;
    public final AnonymousClass12P A02;
    public final AnonymousClass1B5 A03;
    public final C19770wU A04;

    public static void A00(Bundle bundle, AnonymousClass1QD r5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("InterAppCommunicationManager/sendRequesterToProviderOrderedBroadcast/action = ");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.whatsapp.w4b", MigrationProviderOrderedBroadcastReceiver.class.getName()));
        intent.setAction(str);
        intent.addFlags(32);
        new C35661j3(bundle, intent, r5, 14).run();
    }

    public void A01() {
        String string = ((SharedPreferences) this.A01.A00.get()).getString("registration_sibling_app_country_code", (String) null);
        StringBuilder sb = new StringBuilder();
        sb.append("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled/sibling-country-code = ");
        sb.append(string);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb2.append(false);
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled = ");
        sb3.append(false);
        Log.i(sb3.toString());
    }

    public void A02() {
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder();
        sb.append("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb.append(false);
        Log.i(sb.toString());
        bundle.putBoolean("database_migration_is_enabled_on_requester_side", false);
        Log.i("InterAppCommunicationManager/sendInitialMigrationInfoNeededBroadcast/sendInitialMigrationInfoNeededBroadcast");
        A00(bundle, this, "com.whatsapp.registration.directmigration.initialMigrationInfoAction");
    }

    public AnonymousClass1QD(C19630wG r1, C19420v0 r2, AnonymousClass12P r3, AnonymousClass1B5 r4, C19770wU r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
