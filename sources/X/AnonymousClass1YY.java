package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.1YY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1YY implements Handler.Callback {
    public final /* synthetic */ AnonymousClass1YV A00;
    public final /* synthetic */ AnonymousClass1G4 A01;

    public /* synthetic */ AnonymousClass1YY(AnonymousClass1YV r1, AnonymousClass1G4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass1YV r3 = this.A00;
        AnonymousClass1G4 r0 = this.A01;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            AnonymousClass1ML r2 = r3.A03;
            if (r2.A00 != 1) {
                r3.A03();
                r3.A04.A01();
                r3.A02.A00.clear();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("presencestatemanager/timeout/foreground ");
            sb.append(r2);
            Log.i(sb.toString());
            return true;
        } else if (r0.A01()) {
            return true;
        } else {
            AnonymousClass1YV.A02(r3, false);
            return true;
        }
    }
}
