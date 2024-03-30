package X;

import android.os.MessageQueue;
import com.whatsapp.AbstractAppShellDelegate;

/* renamed from: X.14c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C223914c implements MessageQueue.IdleHandler {
    public final /* synthetic */ C18780to A00;
    public final /* synthetic */ AbstractAppShellDelegate A01;

    public /* synthetic */ C223914c(C18780to r1, AbstractAppShellDelegate abstractAppShellDelegate) {
        this.A01 = abstractAppShellDelegate;
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        return this.A01.m4lambda$queueAsyncInit$7$comwhatsappAbstractAppShellDelegate(this.A00);
    }
}
