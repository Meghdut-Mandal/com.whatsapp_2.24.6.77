package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.comments.CommentHeader;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.conversation.comments.MessageDate;
import com.whatsapp.conversation.comments.RevokedMessageText;

/* renamed from: X.1p0  reason: invalid class name and case insensitive filesystem */
public final class C38491p0 extends LinearLayout {
    public LinearLayout A00 = ((LinearLayout) C36361kB.A0F(this, R.id.revoked_comment_container));
    public CommentHeader A01 = ((CommentHeader) C36361kB.A0F(this, R.id.revoked_comment_header));
    public ContactPictureView A02 = ((ContactPictureView) C36361kB.A0F(this, R.id.revoked_comment_profile_pic));
    public MessageDate A03 = ((MessageDate) C36361kB.A0F(this, R.id.comment_date));
    public RevokedMessageText A04 = ((RevokedMessageText) C36361kB.A0F(this, R.id.revoked_comment_text));
    public final AnonymousClass00T A05;

    public C38491p0(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A05 = C36431kI.A1I(new AnonymousClass4AZ(context));
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    private final void setupClickListener(AnonymousClass3T1 r3) {
        AnonymousClass4Y7.A00(this.A00, this, r3, 4);
    }

    public final void A00(AnonymousClass1RY r4, AnonymousClass3T1 r5) {
        this.A02.A05(r4, r5);
        this.A04.A0K(r5);
        this.A01.A02(r5);
        MessageDate messageDate = this.A03;
        AnonymousClass3T1.A07(messageDate, messageDate.getTime(), messageDate.getWhatsAppLocale(), r5);
        setupClickListener(r5);
    }

    public final C225314u getActivity() {
        return (C225314u) this.A05.getValue();
    }
}
