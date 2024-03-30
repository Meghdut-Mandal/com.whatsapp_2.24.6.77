package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9pN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204049pN implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ C135106c9 A02;
    public final /* synthetic */ AnonymousClass11F A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ B6K A05;
    public final /* synthetic */ C203269nh A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public /* synthetic */ C204049pN(AnonymousClass16X r1, C135106c9 r2, AnonymousClass11F r3, UserJid userJid, B6K b6k, C203269nh r6, String str, List list, long j) {
        this.A06 = r6;
        this.A07 = str;
        this.A08 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = b6k;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C203269nh r7 = this.A06;
        String str = this.A07;
        List list = this.A08;
        AnonymousClass11F r5 = this.A03;
        UserJid userJid = this.A04;
        long j = this.A00;
        AnonymousClass16X r3 = this.A01;
        C135106c9 r4 = this.A02;
        B6K b6k = this.A05;
        r7.A06.Boy(new C21679AVz(r3, r4, r5, userJid, r7, str, list, j));
        b6k.B7P();
    }
}
