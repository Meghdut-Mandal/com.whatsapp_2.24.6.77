package X;

import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;

/* renamed from: X.4IY  reason: invalid class name */
public final class AnonymousClass4IY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IY(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        AnonymousClass00C.A0B(arrayList);
        MediaCardGrid mediaCardGrid = linkedIGPostsSummaryViewActivity.A07;
        if (mediaCardGrid == null) {
            throw C36331k8.A0d("mediaCard");
        }
        mediaCardGrid.A08(arrayList, Integer.MAX_VALUE);
        return AnonymousClass0AJ.A00;
    }
}
