package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4IZ  reason: invalid class name */
public final class AnonymousClass4IZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IZ(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        AnonymousClass00C.A0B(map);
        int A0I = AnonymousClass000.A0I(C007103b.A0J(map.keySet()));
        View view = (View) C007103b.A0J(map.values());
        MediaCardGrid mediaCardGrid = linkedIGPostsSummaryViewActivity.A07;
        if (mediaCardGrid == null) {
            throw C36331k8.A0d("mediaCard");
        }
        Context context = mediaCardGrid.getContext();
        UserJid userJid = linkedIGPostsSummaryViewActivity.A04;
        if (userJid == null) {
            throw C36331k8.A0d("bizJid");
        }
        C39671tD r1 = linkedIGPostsSummaryViewActivity.A03;
        if (r1 == null) {
            throw C36331k8.A0d("linkedIGPostsSummaryViewModel");
        }
        ArrayList arrayList = r1.A0A;
        LinkedAccountMediaView.A01(context, view, (C206949uI) null, userJid, AnonymousClass000.A0p("thumb-transition-", ((AnonymousClass3XV) arrayList.get(A0I)).A01.A04, AnonymousClass000.A0u()), arrayList, A0I, 1, 1, true);
        AnonymousClass3NM r12 = linkedIGPostsSummaryViewActivity.A02;
        if (r12 != null) {
            UserJid userJid2 = linkedIGPostsSummaryViewActivity.A04;
            if (userJid2 == null) {
                throw C36331k8.A0d("bizJid");
            }
            AnonymousClass3NM.A00(r12, userJid2, 1);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("linkedIGPostsLoggingHelper");
    }
}
