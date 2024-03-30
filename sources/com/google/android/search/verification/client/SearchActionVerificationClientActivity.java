package com.google.android.search.verification.client;

import X.C36441kJ;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.VoiceMessagingService;

public abstract class SearchActionVerificationClientActivity extends Activity {
    public abstract Class getServiceClass();

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent A0H = C36441kJ.A0H(this, VoiceMessagingService.class);
        A0H.putExtra(SearchActionVerificationClientService.EXTRA_INTENT, getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(A0H);
        } else {
            startService(A0H);
        }
        finish();
    }
}
