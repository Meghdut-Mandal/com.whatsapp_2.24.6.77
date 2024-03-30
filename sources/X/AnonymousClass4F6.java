package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4F6  reason: invalid class name */
public final class AnonymousClass4F6 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ AnonymousClass1LI $textEmojiLabelViewControllerFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4F6(View view, AnonymousClass1LI r3) {
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
