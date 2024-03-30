package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.7Nq  reason: invalid class name and case insensitive filesystem */
public final class C153257Nq extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ AnonymousClass1LI $textEmojiLabelViewControllerFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153257Nq(View view, AnonymousClass1LI r3) {
        super(0);
        this.$textEmojiLabelViewControllerFactory = r3;
        this.$itemView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3SF A01 = AnonymousClass3SF.A01(this.$itemView, this.$textEmojiLabelViewControllerFactory, R.id.contact_name);
        TextEmojiLabel textEmojiLabel = A01.A01;
        C33511fU.A03(textEmojiLabel);
        textEmojiLabel.setSingleLine(true);
        return A01;
    }
}
