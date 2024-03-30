package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.1MY  reason: invalid class name */
public class AnonymousClass1MY implements Handler.Callback {
    public final /* synthetic */ AnonymousClass1MV A00;

    public AnonymousClass1MY(AnonymousClass1MV r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        String str = (String) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                AnonymousClass1MV r1 = this.A00;
                if (!AnonymousClass1MV.A03(r1, str)) {
                    AnonymousClass1MV.A02(r1, str);
                    return true;
                }
            } else if (i == 3) {
                AnonymousClass1MV.A01(this.A00, str);
            } else if (i != 4) {
                return false;
            } else {
                AnonymousClass1MV r12 = this.A00;
                Log.i("xmpp/handler/logout-timer/reset");
                if (!AnonymousClass1MV.A03(r12, str)) {
                    return false;
                }
                AnonymousClass1MV.A02(r12, str);
                return false;
            }
            return true;
        }
        AnonymousClass1MV.A02(this.A00, str);
        return true;
    }
}
