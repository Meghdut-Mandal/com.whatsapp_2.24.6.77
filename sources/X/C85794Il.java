package X;

import com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog;
import java.util.List;

/* renamed from: X.4Il  reason: invalid class name and case insensitive filesystem */
public final class C85794Il extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85794Il(ParticipantListBottomSheetDialog participantListBottomSheetDialog) {
        super(1);
        this.this$0 = participantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C95894mS r0 = this.this$0.A01;
        if (r0 != null) {
            r0.A0M(list);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("participantListAdapter");
    }
}
