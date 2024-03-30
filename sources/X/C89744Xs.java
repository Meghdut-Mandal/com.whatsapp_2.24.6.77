package X;

import com.whatsapp.R;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;

/* renamed from: X.4Xs  reason: invalid class name and case insensitive filesystem */
public class C89744Xs implements AnonymousClass7gL {
    public Object A00;
    public final int A01;

    public C89744Xs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BkW(int i) {
        int A04;
        switch (this.A01) {
            case 0:
                CallLinkActivity callLinkActivity = (CallLinkActivity) this.A00;
                if (callLinkActivity.A0A.getVisibility() == 0) {
                    A04 = C224514j.A00(callLinkActivity, R.attr.f4nameremoved, R.color.f6nameremoved);
                } else {
                    A04 = C36441kJ.A04(callLinkActivity);
                }
                AnonymousClass1RC.A04(callLinkActivity, A04);
                AnonymousClass1RC.A09(callLinkActivity.getWindow(), false);
                return;
            case 1:
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) ((AnonymousClass01L) this.A00).findViewById(R.id.content);
                if (chatInfoLayoutV2 != null) {
                    chatInfoLayoutV2.A0H();
                    return;
                }
                return;
            default:
                C70803fk r1 = (C70803fk) this.A00;
                if (C70803fk.A0C(r1) != null) {
                    r1.A00 = i;
                    C70803fk.A1A(r1, i);
                    return;
                }
                return;
        }
    }
}
