package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6rE  reason: invalid class name and case insensitive filesystem */
public final class C143856rE implements AnonymousClass7gE {
    public final AnonymousClass1PZ A00;
    public final AnonymousClass190 A01;
    public final UserJid A02;

    public /* bridge */ /* synthetic */ void BTe(Object obj) {
        Context context = (Context) obj;
        AnonymousClass00C.A0D(context, 0);
        Intent A1b = this.A01.A1b(context, this.A02, false);
        AnonymousClass00C.A08(A1b);
        A1b.putExtra("lobbyEntryPoint", 7);
        this.A00.A00(37, 86);
        context.startActivity(A1b);
    }

    public C143856rE(AnonymousClass1PZ r1, AnonymousClass190 r2, UserJid userJid) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
    }
}
