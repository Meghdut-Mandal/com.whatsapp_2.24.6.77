package X;

import com.whatsapp.polls.PollResultsActivity;
import java.util.List;

/* renamed from: X.7TJ  reason: invalid class name */
public final class AnonymousClass7TJ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ PollResultsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TJ(PollResultsActivity pollResultsActivity) {
        super(1);
        this.this$0 = pollResultsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass00C.A0D(list, 0);
        C95874mQ r0 = this.this$0.A0A;
        if (r0 == null) {
            throw C36331k8.A0d("pollResultsAdapter");
        }
        r0.A0M(list);
        return AnonymousClass0AJ.A00;
    }
}
