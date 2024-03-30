package com.whatsapp.registration.directmigration;

import X.AnonymousClass1QE;
import X.AnonymousClass1QF;
import X.C18830tt;
import X.C19420v0;
import X.C36341k9;
import X.C36441kJ;
import X.C56042vd;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MigrationRequesterBroadcastReceiver extends BroadcastReceiver {
    public C19420v0 A00;
    public AnonymousClass1QE A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C18830tt.APp(C56042vd.A00(context), this);
                    this.A03 = true;
                }
            }
        }
        if (intent != null) {
            Log.i("MigrationRequesterBroadcastReceiver/received-broadcast");
            if ("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_min_storage_needed", 0);
                long longExtra2 = intent.getLongExtra("extra_msg_db_size", 0);
                AnonymousClass1QF r4 = this.A01.A00;
                r4.A03 = Double.valueOf((double) longExtra);
                r4.A02 = Double.valueOf((double) longExtra2);
                C36341k9.A0w(C19420v0.A00(this.A00), "registration_sibling_app_min_storage_needed", longExtra);
            }
        }
    }

    public MigrationRequesterBroadcastReceiver(int i) {
        this.A03 = false;
        this.A02 = C36441kJ.A11();
    }

    public MigrationRequesterBroadcastReceiver() {
        this(0);
    }
}
