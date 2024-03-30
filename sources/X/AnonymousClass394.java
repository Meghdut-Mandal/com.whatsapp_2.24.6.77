package X;

import android.os.Handler;
import com.whatsapp.conversation.conversationrow.MediaTimeDisplay;

/* renamed from: X.394  reason: invalid class name */
public class AnonymousClass394 {
    public Runnable A00 = C80233v4.A00(this, 25);
    public boolean A01 = false;
    public final int A02 = 100;
    public final Handler A03 = C36341k9.A0H();
    public final Runnable A04;

    public AnonymousClass394(Runnable runnable) {
        this.A04 = runnable;
    }

    public static C88554Td A00(MediaTimeDisplay mediaTimeDisplay) {
        mediaTimeDisplay.A02();
        mediaTimeDisplay.A02 = new AnonymousClass394(new C80233v4(mediaTimeDisplay, 24));
        mediaTimeDisplay.A06 = false;
        mediaTimeDisplay.A00 = 1;
        return new C88554Td(mediaTimeDisplay, 36);
    }
}
