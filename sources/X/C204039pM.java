package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9pM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204039pM implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ B6K A04;
    public final /* synthetic */ C203269nh A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ C204039pM(AnonymousClass16X r1, AnonymousClass11F r2, UserJid userJid, B6K b6k, C203269nh r5, String str, List list, long j) {
        this.A05 = r5;
        this.A06 = str;
        this.A07 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A04 = b6k;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C203269nh r6 = this.A05;
        String str = this.A06;
        List list = this.A07;
        AnonymousClass11F r4 = this.A02;
        UserJid userJid = this.A03;
        long j = this.A00;
        AnonymousClass16X r3 = this.A01;
        B6K b6k = this.A04;
        r6.A06.Boy(new AVu(r3, r4, userJid, r6, str, list, j));
        b6k.B7P();
    }
}
