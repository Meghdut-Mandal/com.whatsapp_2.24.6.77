package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Vu  reason: invalid class name and case insensitive filesystem */
public class C89244Vu extends C429621m {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89244Vu(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void onClick(View view) {
        if (this.A01 != 0) {
            ChangeEphemeralSettingActivity changeEphemeralSettingActivity = (ChangeEphemeralSettingActivity) this.A00;
            int A012 = C36431kI.A01(changeEphemeralSettingActivity.A0I instanceof UserJid ? 1 : 0);
            Intent A0D = C36431kI.A0D();
            AnonymousClass190.A1T(changeEphemeralSettingActivity, A0D, A012);
            changeEphemeralSettingActivity.startActivity(A0D);
            return;
        }
        AnonymousClass01L r3 = ((C65053Qn) this.A00).A02;
        Intent A0D2 = AnonymousClass190.A0D(r3.getApplicationContext());
        A0D2.putExtra("target_setting", "privacy_groupadd");
        r3.startActivity(A0D2);
    }
}
