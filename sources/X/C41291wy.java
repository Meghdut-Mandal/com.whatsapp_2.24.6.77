package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.comments.CommentListManager$loadMoreMessages$1;
import com.whatsapp.conversation.CommentsBottomSheet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1wy  reason: invalid class name and case insensitive filesystem */
public final class C41291wy extends AnonymousClass0UE {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ CommentsBottomSheet A01;

    public void A03(RecyclerView recyclerView, int i) {
        AnonymousClass0C0 r0;
        AnonymousClass00C.A0D(recyclerView, 0);
        if (i == 0) {
            r0 = this.A01.A0R;
        } else if (i == 1 || i == 2) {
            r0 = null;
        } else {
            return;
        }
        recyclerView.setItemAnimator(r0);
    }

    public C41291wy(LinearLayoutManager linearLayoutManager, CommentsBottomSheet commentsBottomSheet) {
        this.A01 = commentsBottomSheet;
        this.A00 = linearLayoutManager;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int A1U = this.A00.A1U();
        CommentsBottomSheet commentsBottomSheet = this.A01;
        C40441vY r0 = commentsBottomSheet.A07;
        if (r0 == null) {
            throw C36331k8.A0Y();
        } else if (r0.A0J() - A1U < 100) {
            C40001uV r3 = (C40001uV) commentsBottomSheet.A0U.getValue();
            C65513Sj r02 = r3.A00;
            if (r02 == null) {
                throw C36331k8.A0d("commentListManager");
            } else if (r02.A05.get() != C51732oI.COMPLETE) {
                C65513Sj r4 = r3.A00;
                if (r4 == null) {
                    throw C36331k8.A0d("commentListManager");
                }
                AtomicReference atomicReference = r4.A05;
                Object obj = atomicReference.get();
                C51732oI r03 = C51732oI.LOADING;
                if (obj != r03) {
                    atomicReference.set(r03);
                    C36381kD.A1R(r4.A06, new CommentListManager$loadMoreMessages$1(r4, (C023509x) null), r4.A07);
                }
            }
        }
    }
}
