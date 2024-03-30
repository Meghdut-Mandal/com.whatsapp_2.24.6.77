package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.1WU  reason: invalid class name */
public final class AnonymousClass1WU extends Handler implements AnonymousClass1WT {
    public final /* synthetic */ AnonymousClass1WK A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1WU(AnonymousClass1WK r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Log.i("ConnectionThread/WriterThreadObserver/sending_channel_ready");
            this.A00.A0u((C29281Wa) message.obj);
        } else if (i == 1) {
            this.A00.A0z((C200139gg) message.obj);
        } else if (i == 2) {
            this.A00.A0x((C64933Qa) message.obj);
        }
    }
}
