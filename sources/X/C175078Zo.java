package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.8Zo  reason: invalid class name and case insensitive filesystem */
public abstract class C175078Zo extends AnonymousClass8ZM {
    public final ImageView A00 = C36401kF.A0G(this, R.id.avatar);
    public final View A01 = C012005e.A02(this, R.id.button_div);
    public final View A02 = C012005e.A02(this, R.id.expired_invitation_container);
    public final View A03 = C012005e.A02(this, R.id.group_view_contacts_btn);
    public final TextEmojiLabel A04 = C36401kF.A0O(this, R.id.group_invite_caption);
    public final TextAndDateLayout A05 = ((TextAndDateLayout) C012005e.A02(this, R.id.text_and_date));
    public final C160527l9 A06 = new C203209nX(this, 0);
    public final TextEmojiLabel A07 = C36401kF.A0O(this, R.id.action_text);
    public final TextEmojiLabel A08 = C36401kF.A0O(this, R.id.instructions);
    public final TextEmojiLabel A09 = C36401kF.A0O(this, R.id.group_name);

    public abstract String getInviteCaption();

    public abstract View.OnClickListener getOnActionClickListener();

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public C175078Zo(Context context, C89004Uw r4, AnonymousClass3T1 r5) {
        super(context, r4, r5);
        A2D();
    }

    public boolean A1E() {
        return C175108Zr.A15(this);
    }

    public void A1Y() {
        A2D();
        super.A1Y();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A2D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c5, code lost:
        if (r6.A07 != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D() {
        /*
            r11 = this;
            X.3T1 r7 = r11.getFMessage()
            com.whatsapp.TextEmojiLabel r0 = r11.A09
            X.C33511fU.A03(r0)
            java.lang.String r8 = r11.getInviteCaption()
            r2 = r11
            boolean r0 = r11 instanceof X.AnonymousClass8ZK
            if (r0 == 0) goto L_0x00af
            X.8ZK r2 = (X.AnonymousClass8ZK) r2
            X.2bP r1 = r2.getFMessage()
            X.0wo r0 = r2.A19
            long r3 = X.C19970wo.A00(r0)
            long r1 = r1.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r10 = X.C36401kF.A1U(r0)
        L_0x0026:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = 8
            r3 = 0
            com.whatsapp.TextEmojiLabel r1 = r11.A04
            if (r0 != 0) goto L_0x00a4
            r11.setMessageText(r8, r1, r7)
            android.view.View r1 = r11.A01
            int r0 = X.C36381kD.A00(r10)
            r1.setVisibility(r0)
        L_0x003d:
            com.whatsapp.components.TextAndDateLayout r9 = r11.A05
            if (r9 == 0) goto L_0x0068
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            r5 = 7
            r1 = -2
            r0 = -1
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0, r1)
            r1 = 2131431015(0x7f0b0e67, float:1.8483747E38)
            if (r6 == 0) goto L_0x0099
            r2.addRule(r5, r1)
            r2.addRule(r4, r1)
            r9.setLayoutParams(r2)
            android.view.ViewGroup r2 = r11.A07
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r2.measure(r1, r0)
        L_0x0068:
            if (r10 == 0) goto L_0x0085
            r0 = 0
            r11.setOnClickListener(r0)
            r11.setClickable(r3)
            android.view.View r0 = r11.A03
            r0.setVisibility(r4)
            android.view.View r0 = r11.A02
        L_0x0078:
            r0.setVisibility(r3)
            X.1SV r2 = r11.A1y
            android.widget.ImageView r1 = r11.A00
            X.7l9 r0 = r11.A06
            r2.A0C(r1, r7, r0)
            return
        L_0x0085:
            android.view.View$OnClickListener r1 = r11.getOnActionClickListener()
            r11.setOnClickListener(r1)
            com.whatsapp.TextEmojiLabel r0 = r11.A07
            r0.setOnClickListener(r1)
            android.view.View r0 = r11.A02
            r0.setVisibility(r4)
            android.view.View r0 = r11.A03
            goto L_0x0078
        L_0x0099:
            r2.addRule(r5, r1)
            r0 = 3
            r2.addRule(r0, r1)
            r9.setLayoutParams(r2)
            goto L_0x0068
        L_0x00a4:
            java.lang.String r0 = ""
            r11.setMessageText(r0, r1, r7)
            android.view.View r0 = r11.A01
            r0.setVisibility(r4)
            goto L_0x003d
        L_0x00af:
            X.3T1 r6 = r11.A0K
            X.2bQ r6 = (X.AnonymousClass2bQ) r6
            X.0wo r0 = r11.A19
            long r4 = X.C19970wo.A00(r0)
            long r2 = r6.A01
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c7
            boolean r0 = r6.A07
            r10 = 0
            if (r0 == 0) goto L_0x0026
        L_0x00c7:
            r10 = 1
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175078Zo.A2D():void");
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
