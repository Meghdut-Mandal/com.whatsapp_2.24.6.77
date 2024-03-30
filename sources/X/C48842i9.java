package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import java.util.Objects;

/* renamed from: X.2i9  reason: invalid class name and case insensitive filesystem */
public class C48842i9 extends C33541fX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass3JY A02;
    public final /* synthetic */ GroupJid A03;
    public final /* synthetic */ C42681zD A04;

    public C48842i9(Context context, AnonymousClass3JY r2, C42681zD r3, GroupJid groupJid, int i) {
        this.A04 = r3;
        this.A03 = groupJid;
        this.A01 = context;
        this.A00 = i;
        this.A02 = r2;
    }

    public void A02(View view) {
        int i;
        C42681zD r6 = this.A04;
        List list = AnonymousClass0D3.A0I;
        C220412q r0 = r6.A0A;
        GroupJid groupJid = this.A03;
        if (!r0.A0M(groupJid) || !r6.A0B.A0C(groupJid)) {
            i = 2;
            C28431Sq r3 = r6.A07;
            Activity A012 = C24801Dv.A01(this.A01, C225314u.class);
            Objects.requireNonNull(A012);
            r3.Bl4(groupJid, new C89504Wu(A012, 1), (String) null, this.A00);
        } else {
            i = 1;
            r6.A07.Bl2(this.A01, groupJid, this.A00);
        }
        C81333wq.A00(r6.A0E, this, this.A02, i, 17);
    }
}
