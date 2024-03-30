package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.7No  reason: invalid class name and case insensitive filesystem */
public final class C153237No extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ AnonymousClass1LI $textEmojiLabelViewControllerFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153237No(View view, AnonymousClass1LI r3) {
        super(0);
        this.$textEmojiLabelViewControllerFactory = r3;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3SF B3q = this.$textEmojiLabelViewControllerFactory.B3q(this.$itemView.getContext(), C36401kF.A0O(this.$itemView, R.id.contact_name));
        B3q.A01.setSingleLine(true);
        return B3q;
    }
}
