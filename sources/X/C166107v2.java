package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.7v2  reason: invalid class name and case insensitive filesystem */
public final class C166107v2 extends Handler implements C22947Ayz, C22821AwW {
    public boolean A00;
    public final /* synthetic */ AnonymousClass1WK A01;

    public void A00() {
        this.A00 = true;
    }

    public void Bkm(Message message) {
        message.what = 0;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166107v2(AnonymousClass1WK r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass1WK r1;
        String str;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                boolean z = this.A00;
                r1 = this.A01;
                if (z) {
                    str = "ConnectionThread/ReaderThreadHandler/quit if logout is finished";
                }
                r1.A0M();
                return;
            } else if (i == 2) {
                boolean z2 = this.A00;
                r1 = this.A01;
                if (z2) {
                    str = "ConnectionThread/ReaderThreadHandler/quit if error and finished";
                } else {
                    if (!r1.A17()) {
                        r1.A0T(message.arg1);
                        return;
                    }
                    r1.A0M();
                    return;
                }
            } else if (i == 4) {
                this.A01.A0X(message);
                return;
            } else if (i == 5) {
                C235819a A0B = this.A01.A0s;
                C165577te.A0w(A0B.A08, message.obj, 6);
                return;
            } else {
                return;
            }
            r1.A12(str);
            return;
        }
        this.A01.A0Y(message);
    }
}
