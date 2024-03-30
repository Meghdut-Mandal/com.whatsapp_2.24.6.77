package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.22r  reason: invalid class name */
public class AnonymousClass22r extends C38871qM {
    public ImageButton A00;
    public BoundedLinearLayout A01;
    public ConversationAttachmentContentView A02;
    public int A03;
    public final WaEditText A04;
    public final View A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass22r(android.app.Activity r10, android.widget.ImageButton r11, X.C19700wN r12, X.C87484Oz r13, com.whatsapp.WaEditText r14, X.C21060yb r15, X.C19420v0 r16, X.C20810yC r17, X.AnonymousClass1N2 r18) {
        /*
            r9 = this;
            r5 = r13
            r2 = r9
            r3 = r10
            r4 = r12
            r6 = r15
            r7 = r16
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.view.View r5 = (android.view.View) r5
            r9.A05 = r5
            r9.A04 = r14
            r9.A00 = r11
            r0 = 0
            r1 = r17
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 4268(0x10ac, float:5.981E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 2131231743(0x7f0803ff, float:1.8079576E38)
            if (r1 == 0) goto L_0x0028
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
        L_0x0028:
            r9.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22r.<init>(android.app.Activity, android.widget.ImageButton, X.0wN, X.4Oz, com.whatsapp.WaEditText, X.0yb, X.0v0, X.0yC, X.1N2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (false == r1.A0U) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(com.whatsapp.community.ConversationCommunityViewModel r8, X.AnonymousClass28e r9, X.AnonymousClass11F r10) {
        /*
            r7 = this;
            r5 = 0
            r7.A02 = r5
            r7.A09()
            X.4Oz r4 = r7.A04
            r4.setKeyboardPopup(r7)
            r0 = 1
            com.whatsapp.KeyboardPopupLayout r4 = (com.whatsapp.KeyboardPopupLayout) r4
            r4.A05 = r0
            android.view.View r0 = r7.getContentView()
            if (r0 == 0) goto L_0x0088
            com.whatsapp.conversation.ConversationAttachmentContentView r1 = r7.A02
            X.11F r0 = r1.A0M
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0088
            X.28e r0 = r1.A0D
            if (r9 != r0) goto L_0x0088
            com.whatsapp.community.ConversationCommunityViewModel r0 = r1.A0B
            if (r8 != r0) goto L_0x0088
            boolean r0 = r1.A0U
            if (r5 != r0) goto L_0x0088
        L_0x002c:
            r6 = -1
            int r0 = r7.A0D(r6)
            r7.A01 = r0
            android.widget.ImageButton r3 = r7.A00
            android.app.Activity r2 = r7.A03
            r1 = 2131231748(0x7f080404, float:1.8079586E38)
            r0 = 2131101055(0x7f06057f, float:1.7814509E38)
            X.AnonymousClass3UF.A0B(r2, r3, r1, r0)
            int r0 = r7.A01
            r7.setHeight(r0)
            r7.setWidth(r6)
            android.view.View r3 = r7.A05
            if (r3 == 0) goto L_0x0073
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r7.showAtLocation(r3, r1, r5, r0)
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "lenovo"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0073
            java.util.Objects.requireNonNull(r3)
            r0 = 13
            X.3v3 r2 = X.C80223v3.A00(r3, r0)
            r0 = 60
            r3.postDelayed(r2, r0)
        L_0x0073:
            r4.A05 = r5
            com.whatsapp.WaEditText r2 = r7.A04
            if (r2 == 0) goto L_0x0087
            r0 = 2
            X.72k r1 = new X.72k
            r1.<init>(r7, r0)
            X.4a0 r0 = new X.4a0
            r0.<init>(r2, r5)
            X.C38871qM.A01(r0, r7, r2, r1)
        L_0x0087:
            return
        L_0x0088:
            android.app.Activity r3 = r7.A03
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r3)
            android.view.LayoutInflater r6 = r3.getLayoutInflater()
            r0 = 2131624136(0x7f0e00c8, float:1.8875443E38)
            r1 = 1
            r6.inflate(r0, r2, r1)
            r7.setContentView(r2)
            X.C38871qM.A00(r7)
            X.0yb r0 = r7.A05
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00ea
        L_0x00ae:
            r7.setFocusable(r1)
            r1 = 1
            X.2rs r0 = new X.2rs
            r0.<init>(r2, r7, r1)
            r7.setTouchInterceptor(r0)
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r1 = X.C012005e.A02(r2, r0)
            com.whatsapp.BoundedLinearLayout r1 = (com.whatsapp.BoundedLinearLayout) r1
            r7.A01 = r1
            r0 = 2131429200(0x7f0b0750, float:1.8480066E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            r7.A02 = r0
            r0.A0C(r8, r9, r10, r5)
            r2.setVisibility(r5)
            com.whatsapp.BoundedLinearLayout r0 = r7.A01
            r0.setVisibility(r5)
            r1 = 2130968678(0x7f040066, float:1.7546016E38)
            r0 = 2131099747(0x7f060063, float:1.7811856E38)
            int r0 = X.C224514j.A00(r3, r1, r0)
            X.C36341k9.A0q(r3, r2, r0)
            goto L_0x002c
        L_0x00ea:
            r1 = 0
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22r.A0F(com.whatsapp.community.ConversationCommunityViewModel, X.28e, X.11F):void");
    }

    public void A0A() {
        super.A0A();
        ImageButton imageButton = this.A00;
        Activity activity = this.A03;
        AnonymousClass3UF.A0B(activity, imageButton, this.A03, R.color.f6nameremoved);
        C36331k8.A0q(activity, imageButton, R.string.f12nameremoved);
        this.A02.A09();
    }
}
