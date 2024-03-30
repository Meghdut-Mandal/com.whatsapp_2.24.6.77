package com.google.android.play.core.common;

import X.AnonymousClass001;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r3 = r10
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r2 = "window_flags"
            r0 = 0
            int r1 = r1.getIntExtra(r2, r0)
            if (r1 == 0) goto L_0x0062
            android.view.Window r0 = r10.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r1)
            android.content.Intent r6 = X.C36431kI.A0D()
            r6.putExtra(r2, r1)
        L_0x0020:
            super.onCreate(r11)
            java.lang.String r1 = "result_receiver"
            if (r11 != 0) goto L_0x0065
            android.content.Intent r0 = r10.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r10.A00 = r0
            android.os.Bundle r1 = X.C36371kC.A0H(r10)
            if (r1 != 0) goto L_0x0049
            android.os.ResultReceiver r2 = r10.A00
            if (r2 == 0) goto L_0x0045
        L_0x003d:
            r1 = 3
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            r2.send(r1, r0)
        L_0x0045:
            r10.finish()
            return
        L_0x0049:
            java.lang.String r0 = "confirmation_intent"
            java.lang.Object r0 = r1.get(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            android.content.IntentSender r4 = r0.getIntentSender()     // Catch:{ SendIntentException -> 0x005d }
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3.startIntentSenderForResult(r4, r5, r6, r7, r8, r9)     // Catch:{ SendIntentException -> 0x005d }
            goto L_0x0064
        L_0x005d:
            android.os.ResultReceiver r2 = r10.A00
            if (r2 == 0) goto L_0x0045
            goto L_0x003d
        L_0x0062:
            r6 = 0
            goto L_0x0020
        L_0x0064:
            return
        L_0x0065:
            android.os.Parcelable r0 = r11.getParcelable(r1)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r10.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.A00);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.A00) != null) {
            if (i2 == -1) {
                i3 = 1;
            } else if (i2 == 0) {
                i3 = 2;
            }
            resultReceiver.send(i3, AnonymousClass001.A07());
        }
        finish();
    }
}
