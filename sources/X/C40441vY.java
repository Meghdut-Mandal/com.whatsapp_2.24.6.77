package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.1vY  reason: invalid class name and case insensitive filesystem */
public final class C40441vY extends C02920Ck {
    public RecyclerView A00;
    public final AnonymousClass1RY A01;
    public final AnonymousClass9SI A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40441vY(AnonymousClass1RY r3, AnonymousClass9SI r4) {
        super((C02830Cb) new C40311vI());
        AnonymousClass00C.A0D(r4, 2);
        this.A01 = r3;
        this.A02 = r4;
        A0B(true);
        BnA(new C89114Vh(this, 3));
    }

    public void A0H(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public void A0I(RecyclerView recyclerView) {
        this.A00 = null;
    }

    public void BSE(AnonymousClass0D3 r6, int i) {
        AnonymousClass00C.A0D(r6, 0);
        if (r6 instanceof C41751xi) {
            Object A0L = A0L(i);
            AnonymousClass00C.A0E(A0L, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.CommentItem");
            AnonymousClass3T1 r4 = ((AnonymousClass2HV) A0L).A00;
            AnonymousClass1RY r3 = this.A01;
            AnonymousClass9SI r2 = this.A02;
            C36321k7.A0x(r3, r2);
            View view = r6.A0H;
            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.conversation.comments.TextCommentLayout");
            ((C38761ps) view).A00(r3, r2, r4);
        } else if (r6 instanceof C41771xk) {
            Object A0L2 = A0L(i);
            AnonymousClass00C.A0E(A0L2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.RevokedCommentItem");
            AnonymousClass3T1 r32 = ((AnonymousClass2HX) A0L2).A00;
            AnonymousClass1RY r22 = this.A01;
            AnonymousClass00C.A0D(r22, 1);
            View view2 = r6.A0H;
            AnonymousClass00C.A0E(view2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.RevokedCommentLayout");
            ((C38491p0) view2).A00(r22, r32);
        } else if (r6 instanceof C41761xj) {
            Object A0L3 = A0L(i);
            AnonymousClass00C.A0E(A0L3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.DecryptionFailureItem");
            AnonymousClass3T1 r33 = ((AnonymousClass2HW) A0L3).A00;
            AnonymousClass1RY r23 = this.A01;
            AnonymousClass00C.A0D(r23, 1);
            View view3 = r6.A0H;
            AnonymousClass00C.A0E(view3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.DecryptionFailureLayout");
            ((C38481oz) view3).A00(r23, r33);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View view;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new C41751xi(C36351kA.A09(viewGroup));
        }
        if (i == 2) {
            return new C41771xk(C36351kA.A09(viewGroup));
        }
        if (i == 3) {
            return new C41761xj(C36351kA.A09(viewGroup));
        }
        if (i == 4) {
            View A0E = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
            AnonymousClass00C.A08(A0E);
            view = A0E;
        } else {
            view = viewGroup;
            if (i == 5) {
                View A0E2 = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
                A0E2.setLayoutParams(new ViewGroup.LayoutParams(-1, C36411kG.A00() / 3));
                view = A0E2;
            }
        }
        return new C41431xC(view);
    }

    public long A0E(int i) {
        AnonymousClass3T1 r0;
        Object A0L = A0L(i);
        if (A0L instanceof AnonymousClass2HV) {
            Object A0L2 = A0L(i);
            AnonymousClass00C.A0E(A0L2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.CommentItem");
            r0 = ((AnonymousClass2HV) A0L2).A00;
        } else if (A0L instanceof AnonymousClass2HX) {
            Object A0L3 = A0L(i);
            AnonymousClass00C.A0E(A0L3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.RevokedCommentItem");
            r0 = ((AnonymousClass2HX) A0L3).A00;
        } else if (!(A0L instanceof AnonymousClass2HW)) {
            return -1;
        } else {
            Object A0L4 = A0L(i);
            AnonymousClass00C.A0E(A0L4, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.DecryptionFailureItem");
            r0 = ((AnonymousClass2HW) A0L4).A00;
        }
        return r0.A1N;
    }

    public int getItemViewType(int i) {
        C51922ob r0;
        AnonymousClass31B r02 = (AnonymousClass31B) A0L(i);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = C51922ob.NONE;
        }
        return r0.ordinal();
    }
}
