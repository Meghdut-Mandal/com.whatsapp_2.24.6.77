package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6iG  reason: invalid class name and case insensitive filesystem */
public class C138536iG implements AnonymousClass04G {
    public final Application A00;
    public final C195419Uf A01;
    public final AnonymousClass9ZJ A02;
    public final AnonymousClass9UA A03;
    public final C202279lS A04;
    public final UserJid A05;
    public final C61223Ba A06;
    public final C19770wU A07;

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }

    public AnonymousClass04R B3o(Class cls) {
        UserJid userJid = this.A05;
        Application application = this.A00;
        C202279lS r5 = this.A04;
        C195419Uf r2 = this.A01;
        C61223Ba r7 = this.A06;
        return new C95364kf(application, r2, this.A02, this.A03, r5, userJid, r7, this.A07);
    }

    public C138536iG(Application application, C195419Uf r2, AnonymousClass9ZJ r3, AnonymousClass9UA r4, C202279lS r5, UserJid userJid, C61223Ba r7, C19770wU r8) {
        this.A05 = userJid;
        this.A01 = r2;
        this.A00 = application;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r8;
    }
}
