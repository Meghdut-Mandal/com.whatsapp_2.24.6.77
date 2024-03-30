package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.1MO  reason: invalid class name */
public class AnonymousClass1MO implements Handler.Callback {
    public final /* synthetic */ AnonymousClass1MN A00;

    public AnonymousClass1MO(AnonymousClass1MN r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass1MN.A04(this.A00);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            AnonymousClass1MN.A03(this.A00);
            return true;
        }
    }
}
