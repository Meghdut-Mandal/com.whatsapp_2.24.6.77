package X;

import com.whatsapp.settings.SettingsChat;
import java.util.concurrent.Executor;

/* renamed from: X.3ql  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C77603ql implements C88104Rk {
    public final /* synthetic */ AnonymousClass2RM A00;
    public final /* synthetic */ SettingsChat A01;

    public /* synthetic */ C77603ql(AnonymousClass2RM r1, SettingsChat settingsChat) {
        this.A01 = settingsChat;
        this.A00 = r1;
    }

    public final void BaB(int i) {
        SettingsChat settingsChat = this.A01;
        AnonymousClass2RM r1 = this.A00;
        if (i == 0) {
            SettingsChat.A07(settingsChat);
        }
        r1.A03 = Integer.valueOf(AnonymousClass6YO.A00(i));
        Executor executor = AnonymousClass6Y6.A00;
        r1.A01 = C36371kC.A0o();
        r1.A00 = C36381kD.A0j();
        settingsChat.A08.Bly(r1);
    }
}
