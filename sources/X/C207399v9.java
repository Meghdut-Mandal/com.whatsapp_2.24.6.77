package X;

import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.9v9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207399v9 implements View.OnLongClickListener {
    public final /* synthetic */ C175218a2 A00;
    public final /* synthetic */ AnonymousClass11F A01;

    public /* synthetic */ C207399v9(C175218a2 r1, AnonymousClass11F r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        C175218a2 r0 = this.A00;
        AnonymousClass11F r3 = this.A01;
        C28251Rx r2 = r0.A03;
        ViewHolder viewHolder = r0.A06;
        return r2.BaP(viewHolder, viewHolder, r3, -1);
    }
}
