package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4cH  reason: invalid class name and case insensitive filesystem */
public class C91584cH extends Handler {
    public void handleMessage(Message message) {
        C140456lc r1;
        C160377ku A0X;
        super.handleMessage(message);
        C124975z6 r6 = (C124975z6) message.obj;
        if (message.what == 0 && r6 != null && (r1 = r6.A0D) != null && r6.A0C != null && (A0X = r1.A0X(38)) != null) {
            C140456lc r4 = r6.A0D;
            C1273868b A00 = C1273868b.A00();
            A00.A09(Float.valueOf(((float) r6.A07) / 2.14748365E9f), 0);
            C131756Qk.A02(r6.A0C, r4, C1273868b.A05(A00, r6.A0C, 1), A0X);
        }
    }

    public C91584cH(Looper looper) {
        super(looper);
    }
}
