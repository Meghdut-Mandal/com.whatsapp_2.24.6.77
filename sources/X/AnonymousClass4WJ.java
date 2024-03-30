package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.regex.Pattern;

/* renamed from: X.4WJ  reason: invalid class name */
public class AnonymousClass4WJ extends C66803Xj {
    public Object A00;
    public final int A01;

    public AnonymousClass4WJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new AnonymousClass4WJ(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e9, code lost:
        if (r5 != null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r7.equalsIgnoreCase(r0) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05a4, code lost:
        if (X.AnonymousClass098.A06(r7) != false) goto L_0x05a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A01
            r10 = r18
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0009;
                case 2: goto L_0x0322;
                case 3: goto L_0x0042;
                case 4: goto L_0x0156;
                case 5: goto L_0x010c;
                case 6: goto L_0x033f;
                case 7: goto L_0x0497;
                case 8: goto L_0x0009;
                case 9: goto L_0x04a3;
                case 10: goto L_0x0009;
                case 11: goto L_0x012d;
                case 12: goto L_0x0009;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x04b7;
                case 16: goto L_0x0009;
                case 17: goto L_0x030f;
                case 18: goto L_0x0224;
                case 19: goto L_0x0265;
                case 20: goto L_0x04fd;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.afterTextChanged(r10)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r4 = r5.A00
            X.24b r4 = (X.AnonymousClass24b) r4
            com.google.android.material.textfield.TextInputEditText r0 = r4.A00
            java.lang.String r2 = "secretCodeEditText"
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x001d:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L_0x0026
            r0.removeCallbacksAndMessages(r1)
        L_0x0026:
            com.google.android.material.textfield.TextInputEditText r0 = r4.A00
            if (r0 != 0) goto L_0x002f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x002f:
            android.os.Handler r3 = r0.getHandler()
            if (r3 == 0) goto L_0x000c
            r0 = 24
            X.3wp r2 = new X.3wp
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 250(0xfa, double:1.235E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0042:
            java.lang.String r7 = r10.toString()
            java.lang.Object r3 = r5.A00
            com.whatsapp.components.PhoneNumberEntry r3 = (com.whatsapp.components.PhoneNumberEntry) r3
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x00fc
            X.1N4 r0 = r3.A00
            X.3O9 r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x00f4
            r0 = 0
        L_0x0057:
            boolean r0 = r7.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00fc
        L_0x005d:
            java.lang.String r5 = r3.A06
        L_0x005f:
            if (r5 == 0) goto L_0x0090
            com.whatsapp.WaEditText r0 = r3.A01
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0090
            r3.A03(r5)
            com.whatsapp.WaEditText r0 = r3.A02
            java.lang.String r2 = X.C36361kB.A0n(r0)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.replaceAll(r1, r0)
            com.whatsapp.WaEditText r0 = r3.A02
            r0.setText(r1)
            com.whatsapp.WaEditText r0 = r3.A01
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0090
            com.whatsapp.WaEditText r0 = r3.A02
            r0.requestFocus()
        L_0x0090:
            X.3FT r6 = r3.A03
            if (r6 == 0) goto L_0x000c
            boolean r0 = r6 instanceof X.AnonymousClass4W2
            if (r0 == 0) goto L_0x059a
            X.4W2 r6 = (X.AnonymousClass4W2) r6
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0567;
                case 1: goto L_0x05f4;
                case 2: goto L_0x055f;
                default: goto L_0x009f;
            }
        L_0x009f:
            java.lang.Object r8 = r6.A00
            com.whatsapp.registration.phonenumberentry.RegisterPhone r8 = (com.whatsapp.registration.phonenumberentry.RegisterPhone) r8
            X.3AK r0 = r8.A0O
            android.widget.TextView r1 = r0.A04
            r0 = 0
            r1.setContentDescription(r0)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r7)
            r6 = 0
            if (r0 == 0) goto L_0x00c2
            X.3AK r0 = r8.A0O
            android.widget.TextView r1 = r0.A04
            r0 = 2131893395(0x7f121c93, float:1.9421565E38)
            r1.setText(r0)
        L_0x00be:
            com.whatsapp.TextEmojiLabel r4 = r8.A0F
            goto L_0x0523
        L_0x00c2:
            if (r5 != 0) goto L_0x00d2
            X.3AK r0 = r8.A0O
            android.widget.TextView r1 = r0.A04
            r0 = 2131893406(0x7f121c9e, float:1.9421588E38)
            r1.setText(r0)
            r8.A3n()
            goto L_0x00be
        L_0x00d2:
            X.1M4 r1 = r8.A0R
            X.0ts r0 = r8.A00
            java.lang.String r3 = r1.A03(r0, r5)
            X.3AK r0 = r8.A0O
            android.widget.TextView r0 = r0.A04
            r0.setText(r3)
            X.3AK r0 = r8.A0O
            android.widget.TextView r2 = r0.A04
            r1 = 2131893421(0x7f121cad, float:1.9421618E38)
            r0 = 1
            java.lang.String r0 = X.C36351kA.A0w(r8, r3, r0, r1)
            r2.setContentDescription(r0)
            r8.A3o()
            goto L_0x00be
        L_0x00f4:
            int r0 = r0.A00
            java.lang.String r0 = java.lang.Integer.toString(r0)
            goto L_0x0057
        L_0x00fc:
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0106
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x005d
        L_0x0106:
            java.lang.String r5 = X.AnonymousClass1M4.A00(r7)
            goto L_0x005f
        L_0x010c:
            java.lang.Object r3 = r5.A00
            X.3fk r3 = (X.C70803fk) r3
            boolean r0 = r3.A6M
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = r10.toString()
            int r0 = r0.length()
            r2 = 0
            if (r0 == 0) goto L_0x061a
            X.1X4 r1 = X.C70803fk.A0A(r3)
            X.141 r0 = r3.A3Y
            X.11F r0 = X.C36351kA.A0j(r0)
            r1.A0K(r0, r2)
            return
        L_0x012d:
            r1 = 0
            X.AnonymousClass00C.A0D(r10, r1)
            java.lang.Object r4 = r5.A00
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r4 = (com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment) r4
            java.lang.String r0 = r10.toString()
            java.lang.String r3 = X.AnonymousClass6YV.A0B(r0, r1)
            X.AnonymousClass00C.A08(r3)
            r4.A09 = r3
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A08
            if (r2 == 0) goto L_0x000c
            X.0yb r1 = r4.A03
            if (r1 == 0) goto L_0x0631
            X.0wg r0 = r4.A07
            if (r0 == 0) goto L_0x062a
            boolean r0 = X.AnonymousClass6YV.A0P(r1, r0, r3)
            r2.setEnabled(r0)
            return
        L_0x0156:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            X.1tF r2 = r0.A09
            if (r2 != 0) goto L_0x0165
            java.lang.String r0 = "editMessageViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0165:
            com.whatsapp.mentions.MentionableEntry r3 = r0.A0H
            if (r3 != 0) goto L_0x0170
            java.lang.String r0 = "entry"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0170:
            r10 = 0
            java.lang.String r0 = r3.getStringText()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = X.AnonymousClass6YV.A0B(r0, r10)
            r2.A00 = r0
            X.3T1 r1 = r2.A0B
            boolean r0 = r1 instanceof X.C46972by
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x020d
            X.2by r1 = (X.C46972by) r1
            java.lang.String r1 = r1.A01
        L_0x018e:
            java.lang.String r0 = r2.A00
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r7 = 0
            if (r0 != 0) goto L_0x019d
            r7 = 1
            X.00s r0 = r2.A05
            r0.A0C(r5)
        L_0x019d:
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x01a7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01ed
        L_0x01a7:
            X.00s r1 = r2.A04
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)
            if (r0 != 0) goto L_0x01b9
            java.lang.Object r0 = r1.A04()
            if (r0 != 0) goto L_0x01ed
        L_0x01b9:
            r1.A0C(r6)
        L_0x01bc:
            X.6tS r0 = r2.A07
            X.1sS r6 = r2.A08
            X.6tS r5 = r6.A01
            if (r0 == 0) goto L_0x01e8
            if (r5 == 0) goto L_0x01eb
            java.lang.String r1 = r0.A0Z
            java.lang.String r0 = r5.A0Z
            boolean r0 = android.text.TextUtils.equals(r1, r0)
        L_0x01ce:
            r0 = r0 ^ 1
            if (r7 != 0) goto L_0x01d5
            if (r0 != 0) goto L_0x01d5
            r4 = 0
        L_0x01d5:
            r2.A02 = r4
            X.3Qa r0 = r2.A0C
            X.11F r8 = r0.A00
            if (r8 == 0) goto L_0x000c
            android.text.Editable r7 = r3.getEditableText()
            X.005 r9 = r2.A0E
            r11 = 0
            r6.A0S(r7, r8, r9, r10, r11)
            return
        L_0x01e8:
            r0 = 1
            if (r5 == 0) goto L_0x01ce
        L_0x01eb:
            r0 = 0
            goto L_0x01ce
        L_0x01ed:
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x01bc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01bc
            X.00s r1 = r2.A04
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x0209
            java.lang.Object r0 = r1.A04()
            if (r0 != 0) goto L_0x01bc
        L_0x0209:
            r1.A0C(r5)
            goto L_0x01bc
        L_0x020d:
            boolean r0 = r1 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0219
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.lang.String r1 = r1.A1a()
            goto L_0x018e
        L_0x0219:
            if (r1 == 0) goto L_0x0221
            java.lang.String r1 = r1.A0b()
            goto L_0x018e
        L_0x0221:
            r1 = 0
            goto L_0x018e
        L_0x0224:
            r1 = 0
            X.AnonymousClass00C.A0D(r10, r1)
            java.lang.String r0 = r10.toString()
            java.lang.String r4 = X.C36371kC.A0y(r0)
            java.lang.Object r0 = r5.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r0 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r0
            X.00T r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r3 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r3
            X.AnonymousClass00C.A0D(r4, r1)
            X.3QR r0 = r3.A0S()
            java.lang.String r0 = r0.A03
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000c
            X.3QR r0 = r3.A0S()
            int r2 = r0.A00
            X.3QR r0 = r3.A0S()
            int r1 = r0.A01
            X.3QR r0 = r3.A0S()
            boolean r0 = r0.A06
            X.3QR r0 = X.C55172uC.A00(r4, r2, r1, r0)
            com.whatsapp.settings.SettingsSetupUserProxyViewModel.A01(r0, r3)
            return
        L_0x0265:
            if (r18 == 0) goto L_0x000c
            java.lang.Object r7 = r5.A00
            com.whatsapp.text.FinalBackspaceAwareEntry r7 = (com.whatsapp.text.FinalBackspaceAwareEntry) r7
            java.lang.String r0 = r10.toString()
            boolean r0 = com.whatsapp.text.FinalBackspaceAwareEntry.A06(r0)
            if (r0 != 0) goto L_0x02e7
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x02e7
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x02e4
            java.util.Iterator r9 = r0.iterator()
        L_0x0281:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02e4
            java.lang.Object r0 = r9.next()
            X.5mr r0 = (X.C117805mr) r0
            com.whatsapp.search.views.TokenizedSearchInput r6 = r0.A00
            com.whatsapp.search.SearchViewModel r0 = r6.A0G
            if (r0 == 0) goto L_0x0281
            com.whatsapp.jid.UserJid r8 = r0.A0Y()
            com.whatsapp.search.SearchViewModel r0 = r6.A0G
            int r5 = r0.A0U()
            int r4 = r6.A00
            r3 = 1
            if (r4 != r3) goto L_0x02a8
            com.google.android.material.chip.Chip r0 = r6.A0V
        L_0x02a4:
            com.whatsapp.search.views.TokenizedSearchInput.A00(r0, r6)
            goto L_0x0281
        L_0x02a8:
            r0 = 2
            if (r4 != r0) goto L_0x02ae
            com.google.android.material.chip.Chip r0 = r6.A0T
            goto L_0x02a4
        L_0x02ae:
            r2 = 3
            if (r4 != r2) goto L_0x02b4
            com.google.android.material.chip.Chip r0 = r6.A0U
            goto L_0x02a4
        L_0x02b4:
            r1 = 5
            if (r4 != r1) goto L_0x02ba
            com.google.android.material.chip.Chip r0 = r6.A07
            goto L_0x02a4
        L_0x02ba:
            if (r4 != 0) goto L_0x0281
            if (r8 != 0) goto L_0x02e0
            if (r5 == 0) goto L_0x02c8
            r0 = 98
            if (r5 == r0) goto L_0x02c8
            r6.setFocus(r3)
            goto L_0x0281
        L_0x02c8:
            com.whatsapp.search.SearchViewModel r0 = r6.A0G
            X.6bb r0 = r0.A0a()
            if (r0 == 0) goto L_0x02d4
            r6.setFocus(r2)
            goto L_0x0281
        L_0x02d4:
            com.whatsapp.search.SearchViewModel r0 = r6.A0G
            X.6bf r0 = r0.A0Z()
            if (r0 == 0) goto L_0x0281
            r6.setFocus(r1)
            goto L_0x0281
        L_0x02e0:
            r6.setFocus(r0)
            goto L_0x0281
        L_0x02e4:
            com.whatsapp.text.FinalBackspaceAwareEntry.A05(r10, r7)
        L_0x02e7:
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x000c
            java.util.Iterator r3 = r0.iterator()
        L_0x02ef:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r2 = r3.next()
            X.5mr r2 = (X.C117805mr) r2
            android.text.Editable r0 = com.whatsapp.text.FinalBackspaceAwareEntry.A03(r10)
            java.lang.String r1 = r0.toString()
            com.whatsapp.search.views.TokenizedSearchInput r0 = r2.A00
            com.whatsapp.search.SearchViewModel r0 = r0.A0G
            if (r0 == 0) goto L_0x02ef
            if (r1 == 0) goto L_0x02ef
            r0.A0o(r1)
            goto L_0x02ef
        L_0x030f:
            java.lang.Object r0 = r5.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.0v5 r0 = r0.A0A
            r0.A02()
            r10.toString()
            java.lang.String r0 = "recordFieldAddedAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0322:
            java.lang.Object r4 = r5.A00
            X.2Es r4 = (X.AnonymousClass2Es) r4
            com.whatsapp.WaEditText r0 = r4.A08
            android.content.Context r3 = r0.getContext()
            com.whatsapp.WaEditText r0 = r4.A08
            android.text.TextPaint r2 = r0.getPaint()
            X.1H2 r1 = r4.A0C
            r0 = 1067869798(0x3fa66666, float:1.3)
            X.AnonymousClass3UG.A07(r3, r2, r10, r1, r0)
            r0 = 0
            r4.A3i(r0)
            return
        L_0x033f:
            java.lang.String r3 = r10.toString()
            boolean r2 = X.AnonymousClass14B.A0F(r3)
            java.lang.Object r1 = r5.A00
            X.3fk r1 = (X.C70803fk) r1
            X.C70803fk.A0p(r1)
            X.1ts r0 = r1.A2u
            r0.A0V(r2)
            X.1uJ r0 = r1.A2y
            r0.A0T(r2)
            boolean r0 = r1.A6Q
            r6 = 0
            r14 = 1
            if (r2 == r0) goto L_0x03bc
            r1.A6Q = r2
            android.widget.ImageButton r4 = r1.A0d
            X.0ts r0 = r1.A36
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r2 == 0) goto L_0x043e
            android.view.animation.AnimationSet r0 = X.AnonymousClass3SS.A00(r0, r14, r6)
            r4.startAnimation(r0)
            android.widget.ImageButton r4 = r1.A0a
            X.0ts r0 = r1.A36
            boolean r0 = X.C36351kA.A1Y(r0)
            android.view.animation.AnimationSet r0 = X.AnonymousClass3SS.A00(r0, r14, r14)
            r4.startAnimation(r0)
            X.13J r0 = r1.A5I
            boolean r0 = r0.BJo()
            if (r0 == 0) goto L_0x038b
            X.C70803fk.A1B(r1, r6)
        L_0x038b:
            X.1FR r4 = r1.A4Y
            X.11F r0 = r1.A45
            int r5 = r4.A0D(r0)
            boolean r0 = X.C70803fk.A1g(r1, r5)
            if (r0 == 0) goto L_0x03bc
            X.1RJ r0 = r1.A5O
            int r0 = r0.A00()
            if (r0 == 0) goto L_0x03bc
            X.1RJ r0 = r1.A5O
            r0.A03(r6)
            X.1RJ r0 = r1.A5O
            android.view.View r4 = r0.A01()
            X.0ts r0 = r1.A36
            boolean r0 = X.C36351kA.A1Y(r0)
            android.view.animation.AnimationSet r0 = X.AnonymousClass3SS.A00(r0, r14, r14)
            r4.startAnimation(r0)
            X.C70803fk.A19(r1, r5)
        L_0x03bc:
            X.1sS r9 = r1.A2z
            X.0u1 r12 = r1.A1k()
            X.11F r11 = r1.A45
            r13 = 0
            r9.A0S(r10, r11, r12, r13, r14)
            X.155 r9 = X.C70803fk.A0C(r1)
            X.4V6 r0 = r1.A2l
            X.1H2 r13 = r0.getEmojiLoader()
            X.4V6 r0 = r1.A2l
            X.0yb r12 = r0.getSystemServices()
            X.0wg r14 = r1.A4e
            com.whatsapp.mentions.MentionableEntry r0 = r1.A4B
            android.text.TextPaint r11 = r0.getPaint()
            r15 = 2131102076(0x7f06097c, float:1.781658E38)
            boolean r0 = r1.A6J
            r16 = r0
            X.AnonymousClass6YV.A0F(r9, r10, r11, r12, r13, r14, r15, r16)
            X.3GT r0 = r1.A4v
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0403
            X.3EH r4 = r1.A4y
            if (r4 == 0) goto L_0x0403
            X.4V6 r0 = r1.A2l
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r0.getEmojiSearchProvider()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0403
            r4.A00(r3)
        L_0x0403:
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r10 = r1.A21
            if (r10 == 0) goto L_0x0429
            if (r2 != 0) goto L_0x0429
            X.17Y r9 = r10.A03
            java.lang.Runnable r8 = r10.A07
            r9.A0G(r8)
            java.lang.Runnable r2 = r10.A08
            X.00T r0 = r10.A0A
            long r4 = X.C36351kA.A08(r0)
            r9.A0I(r2, r4)
            long r6 = X.C36351kA.A08(r0)
            X.00T r0 = r10.A09
            long r4 = X.C36351kA.A08(r0)
            long r6 = r6 + r4
            r9.A0I(r8, r6)
        L_0x0429:
            X.1pF r2 = r1.A22
            if (r2 == 0) goto L_0x043a
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.1uI r0 = r2.getViewModel()
            r0.A01 = r3
            X.C39931uI.A01(r0)
        L_0x043a:
            X.C70803fk.A10(r1)
            return
        L_0x043e:
            android.view.animation.AnimationSet r0 = X.AnonymousClass3SS.A00(r0, r6, r6)
            r4.startAnimation(r0)
            X.0ts r0 = r1.A36
            boolean r0 = X.C36351kA.A1Y(r0)
            android.view.animation.AnimationSet r4 = X.AnonymousClass3SS.A00(r0, r6, r14)
            android.widget.ImageButton r0 = r1.A0a
            r5 = 5
            X.C89234Vt.A00(r4, r0, r5)
            android.widget.ImageButton r0 = r1.A0a
            r0.startAnimation(r4)
            X.1FR r4 = r1.A4Y
            X.11F r0 = r1.A45
            int r0 = r4.A0D(r0)
            boolean r0 = X.C70803fk.A1g(r1, r0)
            if (r0 == 0) goto L_0x03bc
            X.1RJ r0 = r1.A5O
            int r4 = r0.A00()
            r0 = 8
            if (r4 == r0) goto L_0x03bc
            X.0ts r0 = r1.A36
            boolean r0 = X.C36351kA.A1Y(r0)
            android.view.animation.AnimationSet r4 = X.AnonymousClass3SS.A00(r0, r6, r14)
            X.1RJ r0 = r1.A5O
            android.view.View r0 = r0.A01()
            X.C89234Vt.A00(r4, r0, r5)
            X.1RJ r0 = r1.A5O
            android.view.View r0 = r0.A01()
            r0.startAnimation(r4)
            android.animation.ObjectAnimator r0 = r1.A08
            if (r0 == 0) goto L_0x03bc
            r0.cancel()
            goto L_0x03bc
        L_0x0497:
            java.lang.Object r1 = r5.A00
            X.3fk r1 = (X.C70803fk) r1
            java.lang.String r0 = r10.toString()
            X.C70803fk.A1J(r1, r0)
            return
        L_0x04a3:
            java.lang.Object r0 = r5.A00
            com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment r0 = (com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A0J
            java.lang.String r0 = r10.toString()
            boolean r0 = X.AnonymousClass14B.A0F(r0)
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            return
        L_0x04b7:
            java.lang.Object r9 = r5.A00
            com.whatsapp.notification.PopupNotification r9 = (com.whatsapp.notification.PopupNotification) r9
            X.1YV r1 = r9.A13
            r0 = 1
            X.AnonymousClass1YV.A02(r1, r0)
            java.lang.String r3 = r10.toString()
            X.141 r1 = r9.A0l
            if (r1 == 0) goto L_0x04d9
            int r0 = r3.length()
            X.1X4 r2 = r9.A0I
            X.11F r1 = X.C36351kA.A0j(r1)
            if (r0 == 0) goto L_0x04f9
            r0 = 0
            r2.A0K(r1, r0)
        L_0x04d9:
            X.1H2 r13 = r9.A0C
            X.0yb r12 = r9.A08
            X.0wg r14 = r9.A12
            X.2HC r0 = r9.A0X
            android.text.TextPaint r11 = r0.getPaint()
            r15 = 2131102076(0x7f06097c, float:1.781658E38)
            boolean r0 = r9.A1K
            r16 = r0
            X.AnonymousClass6YV.A0F(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = X.AnonymousClass14B.A0F(r3)
            X.1ts r0 = r9.A0c
            r0.A0V(r1)
            return
        L_0x04f9:
            r2.A0J(r1)
            goto L_0x04d9
        L_0x04fd:
            java.lang.String r0 = r10.toString()
            java.lang.String r3 = r0.trim()
            java.lang.Object r2 = r5.A00
            com.whatsapp.twofactor.SetEmailFragment r2 = (com.whatsapp.twofactor.SetEmailFragment) r2
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x051e
            r0 = 2
            if (r1 != r0) goto L_0x051a
            android.widget.TextView r0 = r2.A02
            X.C36391kE.A1K(r0)
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A05
            r0.A05 = r3
        L_0x051a:
            com.whatsapp.twofactor.SetEmailFragment.A00(r2)
            return
        L_0x051e:
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A05
            r0.A04 = r3
            goto L_0x051a
        L_0x0523:
            X.3Pp r3 = r8.A0q     // Catch:{ IOException -> 0x0553 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException -> 0x0553 }
            r2 = 0
            if (r0 != 0) goto L_0x053c
            int r1 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0536 }
            r0 = 44
            if (r1 != r0) goto L_0x053c
            r2 = 1
            goto L_0x053c
        L_0x0536:
            r1 = move-exception
            java.lang.String r0 = "CountryPhoneInfo/isUk"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0553 }
        L_0x053c:
            r3.A01 = r2     // Catch:{ IOException -> 0x0553 }
            java.lang.String r1 = "eu"
            X.1N4 r0 = r8.A02     // Catch:{ IOException -> 0x0553 }
            java.lang.String r0 = r0.A04(r7)     // Catch:{ IOException -> 0x0553 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x0553 }
            r3.A00 = r0     // Catch:{ IOException -> 0x0553 }
            if (r0 != 0) goto L_0x055b
            boolean r0 = r3.A01     // Catch:{ IOException -> 0x0553 }
            if (r0 == 0) goto L_0x0559
            goto L_0x055b
        L_0x0553:
            r1 = move-exception
            java.lang.String r0 = "RegisterPhone/shouldShowTosInfo/getTosRegion failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0559:
            r6 = 8
        L_0x055b:
            r4.setVisibility(r6)
            return
        L_0x055f:
            java.lang.Object r0 = r6.A00
            X.2d9 r0 = (X.AnonymousClass2d9) r0
            X.3AK r0 = r0.A0O
            goto L_0x05fa
        L_0x0567:
            java.lang.String r0 = ""
            boolean r0 = r7.equals(r0)
            java.lang.Object r3 = r6.A00
            com.whatsapp.phonematching.CountryAndPhoneNumberFragment r3 = (com.whatsapp.phonematching.CountryAndPhoneNumberFragment) r3
            if (r0 == 0) goto L_0x0580
            android.widget.TextView r1 = r3.A03
            r0 = 2131893395(0x7f121c93, float:1.9421565E38)
            r1.setText(r0)
        L_0x057b:
            r0 = 0
        L_0x057c:
            com.whatsapp.phonematching.CountryAndPhoneNumberFragment.A03(r3, r0)
            return
        L_0x0580:
            if (r5 != 0) goto L_0x058c
            android.widget.TextView r1 = r3.A03
            r0 = 2131893395(0x7f121c93, float:1.9421565E38)
            r1.setText(r0)
            r0 = 1
            goto L_0x057c
        L_0x058c:
            android.widget.TextView r2 = r3.A03
            X.1M4 r1 = r3.A0B
            X.0ts r0 = r3.A09
            java.lang.String r0 = r1.A03(r0, r5)
            r2.setText(r0)
            goto L_0x057b
        L_0x059a:
            X.2FX r6 = (X.AnonymousClass2FX) r6
            r4 = 0
            if (r7 == 0) goto L_0x05a6
            boolean r1 = X.AnonymousClass098.A06(r7)
            r0 = 0
            if (r1 == 0) goto L_0x05a7
        L_0x05a6:
            r0 = 1
        L_0x05a7:
            r2 = 8
            java.lang.String r3 = "phoneNumberEntryViewHolder"
            r1 = 0
            if (r0 == 0) goto L_0x05c4
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r0 = r6.A00
            X.3AK r0 = r0.A03
            if (r0 != 0) goto L_0x05b9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05b9:
            android.widget.TextView r0 = r0.A04
            r0.setText(r1)
            X.1RJ r0 = r6.A01
            r0.A03(r2)
            return
        L_0x05c4:
            if (r5 == 0) goto L_0x0604
            boolean r0 = X.AnonymousClass098.A06(r5)
            if (r0 != 0) goto L_0x0604
            X.1RJ r0 = r6.A01
            r0.A03(r2)
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r2 = r6.A00
            X.1M4 r1 = r2.A05
            if (r1 == 0) goto L_0x05fd
            X.0ts r0 = r2.A00
            java.lang.String r1 = r1.A03(r0, r5)
            X.3AK r0 = r2.A03
            if (r0 != 0) goto L_0x05e6
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05e6:
            android.widget.TextView r0 = r0.A04
            r0.setText(r1)
            X.3AK r0 = r2.A03
            if (r0 != 0) goto L_0x05fa
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x05f4:
            java.lang.Object r0 = r6.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumber r0 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r0
            X.3AK r0 = r0.A0H
        L_0x05fa:
            r0.A06 = r5
            return
        L_0x05fd:
            java.lang.String r0 = "countryUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0604:
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r0 = r6.A00
            X.3AK r0 = r0.A03
            if (r0 != 0) goto L_0x060f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x060f:
            android.widget.TextView r0 = r0.A04
            r0.setText(r1)
            X.1RJ r0 = r6.A01
            r0.A03(r4)
            return
        L_0x061a:
            r3.A6H = r2
            X.1X4 r1 = X.C70803fk.A0A(r3)
            X.141 r0 = r3.A3Y
            X.11F r0 = X.C36351kA.A0j(r0)
            r1.A0J(r0)
            return
        L_0x062a:
            java.lang.String r0 = "sharedPreferencesFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0631:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4WJ.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        C81333wq r3;
        WDSButton wDSButton;
        String str;
        switch (this.A01) {
            case 0:
                if (charSequence != null) {
                    String obj = charSequence.toString();
                    AnonymousClass00C.A0D(obj, 0);
                    ((AnonymousClass24b) this.A00).A05 = obj;
                }
                AnonymousClass24b r0 = (AnonymousClass24b) this.A00;
                wDSButton = r0.A3k();
                str = r0.A3l();
                break;
            case 1:
                if (charSequence != null) {
                    ((SecretCodeAuthenticationBottomSheet) this.A00).A03 = charSequence.toString();
                }
                SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = (SecretCodeAuthenticationBottomSheet) this.A00;
                wDSButton = secretCodeAuthenticationBottomSheet.A02;
                if (wDSButton != null) {
                    str = secretCodeAuthenticationBottomSheet.A03;
                    break;
                } else {
                    return;
                }
            case 6:
                C39471sS r32 = ((C70803fk) this.A00).A2z;
                boolean z = false;
                if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
                    z = true;
                }
                r32.A08 = z;
                return;
            case 8:
                AnonymousClass3HK r5 = (AnonymousClass3HK) this.A00;
                if (r5.A0H == 2) {
                    int length = charSequence.length();
                    C81333wq r1 = r5.A04;
                    if (r1 == null) {
                        r3 = new C81333wq(new C81113wU((Object) r5, 21), length, 23, new C81113wU((Object) r5, 22));
                        r5.A04 = r3;
                    } else {
                        r5.A0K.A0G(r1);
                        r3 = r5.A04;
                        r3.A00 = length;
                    }
                    r5.A0K.A0I(r3, 275);
                    return;
                }
                return;
            case 10:
                AnonymousClass00C.A0D(charSequence, 0);
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                gifSearchContainer.A0J = charSequence;
                WaEditText waEditText = gifSearchContainer.A06;
                if (waEditText != null) {
                    waEditText.removeCallbacks(gifSearchContainer.A0N);
                }
                WaEditText waEditText2 = gifSearchContainer.A06;
                if (waEditText2 != null) {
                    waEditText2.postDelayed(gifSearchContainer.A0N, 500);
                }
                View view = gifSearchContainer.A01;
                if (view != null) {
                    int i4 = 0;
                    if (charSequence.length() == 0) {
                        i4 = 4;
                    }
                    view.setVisibility(i4);
                    return;
                }
                return;
            case 12:
                AnonymousClass00C.A0D(charSequence, 0);
                InAppBugReportingActivity inAppBugReportingActivity = (InAppBugReportingActivity) this.A00;
                WDSButton A3j = inAppBugReportingActivity.A3j();
                boolean z2 = true;
                if (charSequence.length() <= 0 || C36411kG.A0g(inAppBugReportingActivity).A0U()) {
                    z2 = false;
                }
                A3j.setEnabled(z2);
                InAppBugReportingViewModel A0g = C36411kG.A0g(inAppBugReportingActivity);
                String replaceAll = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]").matcher(C36371kC.A0y(charSequence.toString())).replaceAll("");
                AnonymousClass00C.A08(replaceAll);
                if (replaceAll.length() >= 10) {
                    A0g.A08.A0D(AnonymousClass2W1.A00);
                    return;
                }
                return;
            case 13:
            case 14:
                AnonymousClass3SE r4 = ((ContactUsActivity) this.A00).A0I;
                ContactUsActivity contactUsActivity = r4.A00;
                C18740tg.A06(contactUsActivity);
                boolean A1R = AnonymousClass000.A1R(charSequence.length());
                boolean A0E = contactUsActivity.A0D.A0E(7044);
                int i5 = R.id.contact_us_send_button;
                if (A0E) {
                    i5 = R.id.saga_contact_us_send_button;
                }
                contactUsActivity.findViewById(i5).setEnabled(A1R);
                if (C36331k8.A0f(r4.A00.A00).length() >= 10) {
                    ContactUsActivity contactUsActivity2 = r4.A00;
                    if (contactUsActivity2.A01.getVisibility() == 0) {
                        contactUsActivity2.A00.setBackgroundDrawable(AnonymousClass00E.A00(contactUsActivity2, R.drawable.description_field_background_state_list));
                        contactUsActivity2.A01.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                C39831tt r12 = ((AnonymousClass24a) this.A00).A05;
                int length2 = charSequence.length();
                C001700s r2 = r12.A01;
                int i6 = 1;
                if (length2 > 0) {
                    i6 = 3;
                }
                r2.A0D(new AnonymousClass35B(i6));
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
        wDSButton.setEnabled(AnonymousClass000.A1R(str.length()));
    }
}
