package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.3YZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YZ implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass1NE A03;
    public final /* synthetic */ GroupJid A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ AnonymousClass3YZ(Context context, AnonymousClass1NE r2, GroupJid groupJid, List list, int i, int i2) {
        this.A03 = r2;
        this.A05 = list;
        this.A02 = context;
        this.A00 = i;
        this.A04 = groupJid;
        this.A01 = i2;
    }

    public final void onClick(View view) {
        AnonymousClass1NE r4 = this.A03;
        List list = this.A05;
        Context context = this.A02;
        int i = this.A00;
        GroupJid groupJid = this.A04;
        int i2 = this.A01;
        r4.A09.A00(4, 38);
        AnonymousClass1NE.A06(context, r4, groupJid, list, i, i2, false);
    }
}
