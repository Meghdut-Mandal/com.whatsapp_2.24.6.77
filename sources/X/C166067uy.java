package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: X.7uy  reason: invalid class name and case insensitive filesystem */
public class C166067uy extends Handler {
    public final /* synthetic */ C200129gf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166067uy(Looper looper, C200129gf r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (C209059zO r5 : this.A00.A04) {
            if (Arrays.equals(r5.A07, bArr)) {
                int i = message.what;
                int i2 = r5.A01;
                if (i2 != 3 && i2 != 4) {
                    return;
                }
                if (i == 1) {
                    r5.A01 = 3;
                    r5.A0B.A02(r5);
                    return;
                } else if (i == 2) {
                    C209059zO.A03(r5, false);
                    return;
                } else if (i == 3 && i2 == 4) {
                    r5.A01 = 3;
                    C209059zO.A02(r5, new AnonymousClass91U(), 2);
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
