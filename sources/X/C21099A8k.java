package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.A8k  reason: case insensitive filesystem */
public final /* synthetic */ class C21099A8k implements AnonymousClass7fY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C21136A9w A02;
    public final /* synthetic */ C207199ui A03;
    public final /* synthetic */ AnonymousClass3T1 A04;

    public /* synthetic */ C21099A8k(Context context, C21136A9w a9w, C207199ui r3, AnonymousClass3T1 r4, int i) {
        this.A02 = a9w;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = context;
        this.A00 = i;
    }

    public final void BSQ(C207109uZ r17) {
        C21136A9w a9w = this.A02;
        C207199ui r8 = this.A03;
        AnonymousClass3T1 r2 = this.A04;
        Context context = this.A01;
        int i = this.A00;
        String A002 = a9w.A01.A00(r17);
        if ("UNBLOCKED".equals(A002)) {
            String A0Y = a9w.A08.A0Y(r8);
            AnonymousClass1EV r7 = a9w.A05;
            A8P a8p = a9w.A04;
            UserJid A0L = r2.A0L();
            C18740tg.A06(A0L);
            C1901296z.A00(context, A0L, a8p, r7, r8, r2.A1J, r8.A0E, A0Y, r8.A0F, "chat", 0, i);
            return;
        }
        a9w.A03.A02(context, A002);
    }
}
