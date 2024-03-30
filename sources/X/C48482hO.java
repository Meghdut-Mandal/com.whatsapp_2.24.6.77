package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;

/* renamed from: X.2hO  reason: invalid class name and case insensitive filesystem */
public final class C48482hO extends C42581z3 {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextEmojiLabel A04;
    public final AnonymousClass3SF A05;
    public final WaTextView A06;
    public final AnonymousClass1RY A07;
    public final C200229gu A08;
    public final C19970wo A09;
    public final C19630wG A0A;
    public final C18820ts A0B;
    public final AnonymousClass3G9 A0C;
    public final UpdatesAdapter A0D;
    public final AnonymousClass3KS A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G = C36431kI.A1I(new AnonymousClass4EL(this));
    public final AnonymousClass00T A0H = C36431kI.A1I(new AnonymousClass4EM(this));
    public final ConversationListRowHeaderView A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48482hO(View view, C19460v5 r10, AnonymousClass1LI r11, AnonymousClass171 r12, AnonymousClass1RY r13, C19970wo r14, C19630wG r15, C18820ts r16, C20810yC r17, AnonymousClass3G9 r18, UpdatesAdapter updatesAdapter, AnonymousClass3KS r20) {
        super(view);
        C20810yC r7 = r17;
        C36321k7.A18(r7, r10, r12, r11);
        AnonymousClass00C.A0D(r13, 7);
        C36391kE.A1U(r15, r14);
        C18820ts r6 = r16;
        AnonymousClass00C.A0D(r6, 12);
        this.A0D = updatesAdapter;
        this.A07 = r13;
        this.A0C = r18;
        this.A0A = r15;
        this.A09 = r14;
        this.A0E = r20;
        this.A0B = r6;
        this.A0F = C36431kI.A1I(new AnonymousClass4EK(r7));
        this.A01 = C36341k9.A0L(view, R.id.contact_photo);
        this.A00 = C36361kB.A0G(view, R.id.bottom_row);
        this.A03 = C36341k9.A0L(view, R.id.status_indicator);
        this.A04 = C36351kA.A0O(view, R.id.single_msg_tv);
        this.A06 = C36341k9.A0Q(view, R.id.conversations_row_message_count);
        this.A02 = C36341k9.A0L(view, R.id.message_type_indicator);
        ConversationListRowHeaderView conversationListRowHeaderView = (ConversationListRowHeaderView) C36361kB.A0G(view, R.id.conversations_row_header);
        this.A0I = conversationListRowHeaderView;
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(conversationListRowHeaderView, r11, R.id.conversations_row_contact_name);
        C33511fU.A03(A012.A01);
        this.A05 = A012;
        C200229gu r1 = new C200229gu(r15.A00, r10, conversationListRowHeaderView, r12, r6, r7);
        C33511fU.A03(r1.A04.A01);
        this.A08 = r1;
    }
}
