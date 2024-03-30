package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.223  reason: invalid class name */
public class AnonymousClass223 extends C36541kT {
    public final /* synthetic */ C21360z5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass223(Activity activity, C21360z5 r8, C21060yb r9, C19970wo r10, C18820ts r11) {
        super(activity, r9, r10, r11, R.layout.f9nameremoved);
        this.A00 = r8;
    }

    public void onCreate(Bundle bundle) {
        long time;
        super.onCreate(bundle);
        Date date = new Date();
        C36321k7.A1L(date, "conversations/clock-wrong-time ", AnonymousClass000.A0u());
        Date date2 = this.A00.A00;
        if (date2 != null) {
            time = date2.getTime();
        } else {
            time = date.getTime();
        }
        Activity activity = this.A00;
        Object[] A0M = AnonymousClass001.A0M();
        C18820ts r3 = this.A02;
        A0M[0] = AnonymousClass6XI.A03(r3, C20040wv.A09(r3, time), AnonymousClass3UM.A00(r3, time));
        ((TextView) findViewById(R.id.clock_wrong_date)).setText(C36391kE.A0v(activity, TimeZone.getDefault().getDisplayName(C36401kF.A0x(r3)), A0M, 1, R.string.f12nameremoved));
        C66923Xv.A01(findViewById(R.id.close), this, 16);
    }
}
