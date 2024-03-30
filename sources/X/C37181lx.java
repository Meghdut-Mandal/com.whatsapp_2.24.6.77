package X;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;

/* renamed from: X.1lx  reason: invalid class name and case insensitive filesystem */
public class C37181lx extends PhoneStateListener {
    public final /* synthetic */ AnonymousClass1V6 A00;

    public C37181lx(AnonymousClass1V6 r1) {
        this.A00 = r1;
    }

    public void onCallStateChanged(int i, String str) {
        String str2;
        if (i == 0) {
            str2 = "phone/state idle";
        } else if (i == 1) {
            Log.i("phone/state ringing");
            this.A00.A04();
            return;
        } else if (i == 2) {
            str2 = "phone/state offhook";
        } else {
            return;
        }
        Log.i(str2);
    }
}
