package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4kf  reason: invalid class name and case insensitive filesystem */
public class C95364kf extends AnonymousClass08X {
    public final int A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C195419Uf A02;
    public final AnonymousClass9UA A03;
    public final C202279lS A04;
    public final UserJid A05;
    public final C61223Ba A06;
    public final C19770wU A07;
    public final AnonymousClass9ZJ A08;

    public C95364kf(Application application, C195419Uf r4, AnonymousClass9ZJ r5, AnonymousClass9UA r6, C202279lS r7, UserJid userJid, C61223Ba r9, C19770wU r10) {
        super(application);
        this.A05 = userJid;
        this.A02 = r4;
        this.A04 = r7;
        this.A06 = r9;
        this.A08 = r5;
        this.A03 = r6;
        this.A07 = r10;
        this.A00 = application.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }
}
