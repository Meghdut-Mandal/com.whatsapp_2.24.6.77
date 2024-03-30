package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.04f  reason: invalid class name and case insensitive filesystem */
public class C010004f extends AnonymousClass04Z {
    public /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        Bundle bundleExtra;
        C08770bI r6 = (C08770bI) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = r6.A02;
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                C06520Tx r2 = new C06520Tx(r6.A03);
                r2.A02 = null;
                int i = r6.A01;
                int i2 = r6.A00;
                r2.A01 = i;
                r2.A00 = i2;
                r6 = r2.A00();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r6);
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateIntent created the following intent: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
        return intent;
    }

    public /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        return new C009804d(i, intent);
    }
}
