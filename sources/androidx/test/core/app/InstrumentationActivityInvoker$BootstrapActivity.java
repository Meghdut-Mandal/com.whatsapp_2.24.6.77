package androidx.test.core.app;

import X.AnonymousClass001;
import X.C23131B6m;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;
import java.util.Objects;

public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {
    public boolean A00;
    public final BroadcastReceiver A01 = new C23131B6m(this, 0);

    public void onResume() {
        super.onResume();
        if (!this.A00) {
            this.A00 = true;
            Parcelable parcelableExtra = getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
            ThreadChecker threadChecker = Checks.A00;
            Objects.requireNonNull(parcelableExtra);
            PendingIntent pendingIntent = (PendingIntent) parcelableExtra;
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            if (bundleExtra != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0, bundleExtra);
                } catch (IntentSender.SendIntentException e) {
                    Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e);
                    throw AnonymousClass001.A0B(e);
                }
            } else {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, (Intent) null, 268435456, 0, 0);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r4.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.content.BroadcastReceiver r2 = r3.A01
            java.lang.String r1 = "androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r2 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.String r0 = "IS_TARGET_ACTIVITY_STARTED_KEY"
            boolean r1 = r4.getBoolean(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r3.A00 = r0
            r3.overridePendingTransition(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A01);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.A00);
    }
}
