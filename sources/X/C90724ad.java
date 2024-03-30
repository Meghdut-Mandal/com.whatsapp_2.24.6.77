package X;

import android.app.KeyguardManager;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.4ad  reason: invalid class name and case insensitive filesystem */
public class C90724ad extends KeyguardManager.KeyguardDismissCallback {
    public final /* synthetic */ VoipActivityV2 A00;
    public final /* synthetic */ Runnable A01;

    public C90724ad(VoipActivityV2 voipActivityV2, Runnable runnable) {
        this.A00 = voipActivityV2;
        this.A01 = runnable;
    }

    public void onDismissSucceeded() {
        this.A01.run();
    }
}
