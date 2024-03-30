package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.comments.CommentFailedIconView;
import com.whatsapp.conversation.comments.CommentHeader;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.conversation.comments.MessageDate;
import com.whatsapp.conversation.comments.MessageText;

/* renamed from: X.1ps  reason: invalid class name and case insensitive filesystem */
public final class C38761ps extends LinearLayout implements C18700tb {
    public C19730wQ A00;
    public C19970wo A01;
    public C20810yC A02;
    public AnonymousClass19I A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public final LinearLayout A06;
    public final TextAndDateLayout A07;
    public final CommentHeader A08;
    public final ContactPictureView A09;
    public final MessageDate A0A;
    public final MessageText A0B;
    public final AnonymousClass1RJ A0C;
    public final AnonymousClass1RJ A0D;
    public final AnonymousClass00T A0E;

    public C38761ps(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A01 = C36351kA.A0V(A0W);
            this.A02 = C36341k9.A0V(A0W);
            this.A00 = C36351kA.A0N(A0W);
            this.A03 = (AnonymousClass19I) A0W.A45.get();
        }
        this.A0E = C36431kI.A1I(new C83604Aa(context));
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A06 = (LinearLayout) C36361kB.A0F(this, R.id.comment_container);
        this.A09 = (ContactPictureView) C36361kB.A0F(this, R.id.comment_profile_pic);
        View findViewById = findViewById(R.id.comment_text_date_container);
        TextAndDateLayout textAndDateLayout = (TextAndDateLayout) findViewById;
        textAndDateLayout.A03 = true;
        AnonymousClass00C.A08(findViewById);
        this.A07 = textAndDateLayout;
        this.A0B = (MessageText) C36361kB.A0F(this, R.id.comment_text);
        this.A08 = (CommentHeader) C36361kB.A0F(this, R.id.comment_header);
        this.A0A = (MessageDate) C36361kB.A0F(this, R.id.comment_date);
        this.A0C = C36341k9.A0Y(this, R.id.comment_row_failed_icon);
        this.A0D = C36341k9.A0Y(this, R.id.comment_suspicious_links);
    }

    public final void A00(AnonymousClass1RY r16, AnonymousClass9SI r17, AnonymousClass3T1 r18) {
        AnonymousClass3T1 r12 = r18;
        this.A09.A05(r16, r12);
        this.A0B.A0K(r17, r12, this.A0D);
        this.A08.A02(r12);
        MessageDate messageDate = this.A0A;
        AnonymousClass3T1.A07(messageDate, messageDate.getTime(), messageDate.getWhatsAppLocale(), r12);
        C19970wo time = getTime();
        boolean A1R = AnonymousClass000.A1R(C66013Ui.A0C(getMeManager(), time, getAbProps(), getInFlightMessages(), r12).A00.size());
        AnonymousClass1RJ r1 = this.A0C;
        if (!A1R) {
            r1.A03(8);
        } else {
            CommentFailedIconView commentFailedIconView = (CommentFailedIconView) C36391kE.A0L(r1, 0);
            C19970wo time2 = commentFailedIconView.getTime();
            C590032g A0C2 = C66013Ui.A0C(commentFailedIconView.getMeManager(), time2, commentFailedIconView.getAbProps(), commentFailedIconView.getInFlightMessages(), r12);
            commentFailedIconView.setOnClickListener(new C48882iD(commentFailedIconView.getContext(), commentFailedIconView.getGlobalUI(), commentFailedIconView.getSendMedia(), commentFailedIconView.getUserActions(), commentFailedIconView.getBlockListManager(), commentFailedIconView.getCoreMessageStore(), commentFailedIconView.getMessageAddOnManager(), r12, A0C2, commentFailedIconView.getWaWorkers()));
        }
        setupClickListener(r12);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setInFlightMessages(AnonymousClass19I r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    private final void setupClickListener(AnonymousClass3T1 r3) {
        AnonymousClass4Y7.A00(this.A06, this, r3, 5);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C225314u getActivity() {
        return (C225314u) this.A0E.getValue();
    }

    public final AnonymousClass19I getInFlightMessages() {
        AnonymousClass19I r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("inFlightMessages");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }
}
