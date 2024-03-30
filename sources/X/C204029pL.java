package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9pL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204029pL implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass16X A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C122725vK A03;
    public final /* synthetic */ B6K A04;
    public final /* synthetic */ C203269nh A05;

    public /* synthetic */ C204029pL(AnonymousClass16X r1, AnonymousClass11F r2, UserJid userJid, C122725vK r4, B6K b6k, C203269nh r6) {
        this.A05 = r6;
        this.A04 = b6k;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C203269nh r6 = this.A05;
        B6K b6k = this.A04;
        AnonymousClass11F r5 = this.A01;
        UserJid userJid = this.A02;
        AnonymousClass16X r3 = this.A00;
        C122725vK r8 = this.A03;
        b6k.Bnj();
        C46962bx r7 = r8.A03;
        C18740tg.A06(r7);
        C29121Vk r1 = r6.A03;
        if (!AnonymousClass143.A0G(r5)) {
            userJid = C36401kF.A0b(r5);
        }
        r1.A0L(r3, (C135106c9) null, userJid, r7);
        r6.A00.A0H(new AnonymousClass73N(r6, r7, r8, b6k, 6));
    }
}
