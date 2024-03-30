package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;

/* renamed from: X.4b1  reason: invalid class name and case insensitive filesystem */
public class C90874b1 extends BroadcastReceiver {
    public final /* synthetic */ WaFcsPreloadedBloksActivity A00;

    public C90874b1(WaFcsPreloadedBloksActivity waFcsPreloadedBloksActivity) {
        this.A00 = waFcsPreloadedBloksActivity;
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        AnonymousClass6EW r1;
        if (intent.getAction() != null && intent.getAction().equals("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result")) {
            if (TextUtils.isEmpty(intent.getStringExtra("app_to_app_partner_app_package")) || TextUtils.isEmpty(intent.getStringExtra("app_to_app_partner_intent_action"))) {
                i = 0;
                r1 = this.A00.A00;
            } else {
                Intent intent2 = C36441kJ.A0I(intent.getStringExtra("app_to_app_partner_intent_action")).setPackage(intent.getStringExtra("app_to_app_partner_app_package"));
                if (!TextUtils.isEmpty(intent.getStringExtra("app_to_app_request_payload"))) {
                    intent2.putExtra("android.intent.extra.TEXT", intent.getStringExtra("app_to_app_request_payload"));
                }
                WaFcsPreloadedBloksActivity waFcsPreloadedBloksActivity = this.A00;
                if (intent2.resolveActivity(waFcsPreloadedBloksActivity.getPackageManager()) == null) {
                    i = 0;
                    r1 = waFcsPreloadedBloksActivity.A00;
                } else {
                    waFcsPreloadedBloksActivity.startActivityForResult(intent2, 100);
                    return;
                }
            }
            if (r1 != null) {
                r1.A02(new AnonymousClass703(i, (Bundle) null));
            }
        }
    }
}
