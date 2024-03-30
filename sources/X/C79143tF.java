package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.3tF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79143tF implements AnonymousClass4SC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C75543nP A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ ArrayList A03;

    public /* synthetic */ C79143tF(C75543nP r1, UserJid userJid, ArrayList arrayList, int i) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A03 = arrayList;
        this.A00 = i;
    }

    public final void BTp(View view, AnonymousClass3A6 r16) {
        C75543nP r3 = this.A01;
        UserJid userJid = this.A02;
        ArrayList arrayList = this.A03;
        int i = this.A00;
        View view2 = view;
        if (view.getTag(R.id.loaded_image_url) != null) {
            int i2 = r3.A03;
            int i3 = 21;
            if (i2 == 0) {
                i3 = 18;
            }
            C201549jr r0 = r3.A07;
            C206949uI r6 = r3.A08;
            r0.A03(r6, i3);
            LinkedAccountMediaView.A01(r3.A04, view2, r6, userJid, AnonymousClass000.A0p("thumb-transition-", ((AnonymousClass3XV) arrayList.get(i)).A01.A04, AnonymousClass000.A0u()), arrayList, i, i2, 0, r3.A0C);
        }
    }
}
