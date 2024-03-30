package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.54E  reason: invalid class name */
public class AnonymousClass54E extends AnonymousClass54I {
    public final C20810yC A00;
    public final AnonymousClass2XH A01;
    public final C119525px A02;

    public final String A05() {
        return "send_location";
    }

    public final void A0G(Activity activity, Jid jid, C206969uL r21, String str, String str2, long j) {
        Activity activity2 = activity;
        String str3 = str;
        long j2 = j;
        super.A0G(activity2, (Jid) null, r21, str3, str2, j2);
        C119525px r0 = this.A02;
        AnonymousClass73M r11 = new AnonymousClass73M(this, activity2, str3, 3, j2);
        if (RequestPermissionActivity.A0B.A0I(activity2, r0.A00, r0.A01, 904)) {
            r11.run();
        }
    }

    public Integer A04() {
        return 904;
    }

    public void A07(Activity activity, Intent intent, C20310xM r10, C21010yW r11, AnonymousClass1A1 r12, C19770wU r13, int i) {
        String str;
        if (intent == null || intent.getExtras() == null) {
            str = "SendLocationAction/handleResult/notHandled";
        } else {
            Bundle extras = intent.getExtras();
            C18740tg.A06(extras);
            if (extras.getSerializable("carry_forward_extras") instanceof Map) {
                Map map = (Map) extras.getSerializable("carry_forward_extras");
                String A1A = C36431kI.A1A("message_id", map);
                String A1A2 = C36431kI.A1A("chat_id", map);
                if (i == -1 && !TextUtils.isEmpty(A1A) && !TextUtils.isEmpty(A1A2)) {
                    r13.Boy(new AVn(this, r10, r12, A1A, A1A2, 1));
                    return;
                }
                return;
            }
            str = "SendLocationAction/handleResult/intentExtrasNotFound";
        }
        Log.e(str);
    }

    public boolean A0B(C20810yC r2, AnonymousClass8SX r3) {
        return !r2.A0E(2386);
    }

    public AnonymousClass54E(C1255460h r1, C119525px r2, C20810yC r3, AnonymousClass2XH r4) {
        super(r1);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r2;
    }

    public int A03() {
        return R.drawable.vec_ic_location_pin_blue;
    }

    public final String A06(Context context, C206969uL r3) {
        return context.getString(R.string.f12nameremoved);
    }
}
