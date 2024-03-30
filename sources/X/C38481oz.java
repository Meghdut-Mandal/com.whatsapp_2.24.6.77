package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.comments.CommentHeader;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.conversation.comments.DecryptionFailureMessageView;
import com.whatsapp.conversation.comments.MessageDate;

/* renamed from: X.1oz  reason: invalid class name and case insensitive filesystem */
public final class C38481oz extends LinearLayout {
    public LinearLayout A00 = ((LinearLayout) C36361kB.A0F(this, R.id.decryption_failure_container));
    public CommentHeader A01 = ((CommentHeader) C36361kB.A0F(this, R.id.decryption_failure_header));
    public ContactPictureView A02 = ((ContactPictureView) C36361kB.A0F(this, R.id.decryption_failure_profile_pic));
    public DecryptionFailureMessageView A03 = ((DecryptionFailureMessageView) C36361kB.A0F(this, R.id.decryption_failure_text));
    public MessageDate A04 = ((MessageDate) C36361kB.A0F(this, R.id.comment_date));
    public final AnonymousClass00T A05;

    public C38481oz(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A05 = C36431kI.A1I(new AnonymousClass4AY(context));
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    private final void setupClickListener(AnonymousClass3T1 r3) {
        AnonymousClass4Y7.A00(this.A00, this, r3, 3);
    }

    public final void A00(AnonymousClass1RY r5, AnonymousClass3T1 r6) {
        this.A02.A05(r5, r6);
        DecryptionFailureMessageView decryptionFailureMessageView = this.A03;
        C36321k7.A0q(decryptionFailureMessageView.getWaSharedPreferences(), "decryption_failure_views", C36371kC.A01(C36341k9.A0E(decryptionFailureMessageView.getWaSharedPreferences()), "decryption_failure_views") + 1);
        decryptionFailureMessageView.getUiWamEventHelper().A01(r6, 2);
        this.A01.A02(r6);
        MessageDate messageDate = this.A04;
        AnonymousClass3T1.A07(messageDate, messageDate.getTime(), messageDate.getWhatsAppLocale(), r6);
        setupClickListener(r6);
    }

    public final C225314u getActivity() {
        return (C225314u) this.A05.getValue();
    }
}
