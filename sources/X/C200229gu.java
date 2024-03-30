package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import java.util.List;

/* renamed from: X.9gu  reason: invalid class name and case insensitive filesystem */
public class C200229gu {
    public static Drawable A08;
    public Drawable A00 = null;
    public C36821lM A01;
    public Integer A02 = null;
    public final ConversationListRowHeaderView A03;
    public final AnonymousClass24G A04;
    public final AnonymousClass171 A05;
    public final C18820ts A06;
    public final C20810yC A07;

    public void A02() {
        ConversationListRowHeaderView conversationListRowHeaderView = this.A03;
        conversationListRowHeaderView.A01.setVisibility(0);
        A04();
        if (this.A07.A0E(7740)) {
            if (conversationListRowHeaderView.A03.A09()) {
                conversationListRowHeaderView.getUnreadIndicatorView().setVisibility(8);
            }
            if (!conversationListRowHeaderView.A02.A09()) {
                return;
            }
        } else {
            conversationListRowHeaderView.getUnreadIndicatorView().setVisibility(8);
        }
        conversationListRowHeaderView.getUnreadImportantIndicatorView().setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0.intValue() != r2) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00() {
        /*
            r3 = this;
            com.whatsapp.components.ConversationListRowHeaderView r0 = r3.A03
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r2 = r0.getResources()
            int r1 = X.C36411kG.A01(r0)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r2 = X.C015006m.A00(r0, r2, r1)
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x0025
            int r0 = r0.intValue()
            r1 = 0
            if (r0 == r2) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A02 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200229gu.A00():boolean");
    }

    public void A01() {
        ConversationListRowHeaderView conversationListRowHeaderView = this.A03;
        Context context = conversationListRowHeaderView.getUnreadIndicatorView().getContext();
        if (A08 == null || A00()) {
            A08 = AnonymousClass3UF.A02(context, R.drawable.ic_drill_in_chevron, R.color.f6nameremoved);
        }
        Drawable drawable = A08;
        int dimensionPixelSize = conversationListRowHeaderView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C18820ts r5 = this.A06;
        AnonymousClass1JZ.A07(conversationListRowHeaderView.getUnreadIndicatorView(), r5, dimensionPixelSize, 0, 0, 0);
        WaTextView unreadIndicatorView = conversationListRowHeaderView.getUnreadIndicatorView();
        if (C36401kF.A1X(r5)) {
            unreadIndicatorView.setCompoundDrawablesWithIntrinsicBounds(new C100744vb(drawable, r5), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            unreadIndicatorView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    public void A03() {
        if (this.A00 == null) {
            Context context = this.A03.getContext();
            this.A00 = new C100744vb(AnonymousClass0BT.A00(context.getTheme(), context.getResources(), R.drawable.vec_chevron_pill), this.A06);
        }
        ConversationListRowHeaderView conversationListRowHeaderView = this.A03;
        conversationListRowHeaderView.getUnreadIndicatorView().setText((CharSequence) null);
        conversationListRowHeaderView.getUnreadIndicatorView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        conversationListRowHeaderView.getUnreadIndicatorView().setBackground(this.A00);
    }

    public void A04() {
        if (this.A01 == null || A00()) {
            ConversationListRowHeaderView conversationListRowHeaderView = this.A03;
            this.A01 = new C36821lM(AnonymousClass00F.A00(conversationListRowHeaderView.getContext(), C224514j.A00(conversationListRowHeaderView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        }
        ConversationListRowHeaderView conversationListRowHeaderView2 = this.A03;
        conversationListRowHeaderView2.getUnreadIndicatorView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        conversationListRowHeaderView2.getUnreadIndicatorView().setPadding(0, 0, 0, 0);
        conversationListRowHeaderView2.getUnreadIndicatorView().setBackground(this.A01);
    }

    public void A05() {
        this.A03.A01.setVisibility(8);
        TextEmojiLabel textEmojiLabel = this.A04.A01;
        textEmojiLabel.setText("");
        textEmojiLabel.setPlaceholder(50);
    }

    public void A06(AnonymousClass141 r2, C65783Tl r3, List list) {
        A08(r3, this.A05.A0I(r2), list);
    }

    public void A07(C65783Tl r7, CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel = this.A04.A01;
        textEmojiLabel.setPlaceholder(0);
        textEmojiLabel.A0H(r7, charSequence, (List) null, 256, false);
    }

    public void A08(C65783Tl r7, String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A04.A01;
        textEmojiLabel.setPlaceholder(0);
        textEmojiLabel.A0H(r7, str, list, 256, false);
    }

    public void A09(CharSequence charSequence, CharSequence charSequence2) {
        ConversationListRowHeaderView conversationListRowHeaderView = this.A03;
        conversationListRowHeaderView.A01.setText(charSequence);
        conversationListRowHeaderView.A01.setContentDescription(charSequence2);
    }

    public C200229gu(Context context, C19460v5 r9, ConversationListRowHeaderView conversationListRowHeaderView, AnonymousClass171 r11, C18820ts r12, C20810yC r13) {
        this.A07 = r13;
        this.A03 = conversationListRowHeaderView;
        this.A06 = r12;
        AnonymousClass171 r4 = r11;
        this.A05 = r11;
        TextEmojiLabel textEmojiLabel = conversationListRowHeaderView.A00;
        Context context2 = context;
        C19460v5 r2 = r9;
        this.A04 = new AnonymousClass24G(context2, r2, textEmojiLabel, r4, r12, r13);
    }
}
