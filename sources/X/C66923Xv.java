package X;

import android.view.View;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.avatar.home.AvatarHomeViewModel;

/* renamed from: X.3Xv  reason: invalid class name and case insensitive filesystem */
public class C66923Xv implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C66923Xv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static AvatarHomeViewModel A00(C66923Xv r0) {
        return (AvatarHomeViewModel) ((AvatarHomeActivity) r0.A00).A0L.getValue();
    }

    public static void A01(View view, Object obj, int i) {
        view.setOnClickListener(new C66923Xv(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x048c, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x048f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04f8, code lost:
        r1 = (X.C92764ea) r11.A00;
        r1.A02(r1.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0501, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0517, code lost:
        r1 = r0.A00;
        r0 = r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x051b, code lost:
        if (r0 == null) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x051d, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0520, code lost:
        r1.A00 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0523, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x054c, code lost:
        if (r1.size() != 0) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (r1 == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r1.A09(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        r2.A03(r1, r0);
        r1 = r3.A05;
        r0 = X.AnonymousClass28z.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x0524;
                case 1: goto L_0x0511;
                case 2: goto L_0x050a;
                case 3: goto L_0x052c;
                case 4: goto L_0x00e7;
                case 5: goto L_0x0502;
                case 6: goto L_0x00b6;
                case 7: goto L_0x0010;
                case 8: goto L_0x04f8;
                case 9: goto L_0x04f5;
                case 10: goto L_0x04e9;
                case 11: goto L_0x0475;
                case 12: goto L_0x04aa;
                case 13: goto L_0x00aa;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0490;
                case 17: goto L_0x047a;
                case 18: goto L_0x009a;
                case 19: goto L_0x0475;
                case 20: goto L_0x0468;
                case 21: goto L_0x0457;
                case 22: goto L_0x03de;
                case 23: goto L_0x03bd;
                case 24: goto L_0x0357;
                case 25: goto L_0x034e;
                case 26: goto L_0x033e;
                case 27: goto L_0x02d9;
                case 28: goto L_0x02bf;
                case 29: goto L_0x02b7;
                case 30: goto L_0x028a;
                case 31: goto L_0x025c;
                case 32: goto L_0x01f2;
                case 33: goto L_0x01d3;
                case 34: goto L_0x01cb;
                case 35: goto L_0x01c3;
                case 36: goto L_0x01bb;
                case 37: goto L_0x01b3;
                case 38: goto L_0x01ab;
                case 39: goto L_0x01a3;
                case 40: goto L_0x0071;
                case 41: goto L_0x0037;
                case 42: goto L_0x0173;
                case 43: goto L_0x0011;
                case 44: goto L_0x015e;
                case 45: goto L_0x0145;
                case 46: goto L_0x0137;
                case 47: goto L_0x0122;
                case 48: goto L_0x0114;
                case 49: goto L_0x00ff;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.3Tz r0 = (X.C65923Tz) r0
            android.view.View r1 = r0.A0E
            r0 = 8
            r1.setVisibility(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r3 = (com.whatsapp.avatar.home.AvatarHomeActivity) r3
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r2 = r3.A0F
            if (r2 == 0) goto L_0x0010
            int r1 = r2.A0J
            r0 = 5
            if (r1 != r0) goto L_0x056e
            r0 = 4
            r2.A0W(r0)
            android.view.Window r1 = r3.getWindow()
            r0 = 0
            X.AnonymousClass1RC.A09(r1, r0)
            X.C36391kE.A14(r3)
            X.07B r0 = r3.getSupportActionBar()
            if (r0 == 0) goto L_0x0010
            r0.A0E()
            return
        L_0x0037:
            java.lang.Object r0 = r11.A00
            X.1nx r0 = (X.C38171nx) r0
            X.3O5 r4 = r0.getViewModel()
            X.00r r1 = r4.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>"
            X.AnonymousClass00C.A0E(r1, r0)
            r0 = 8
            X.C36341k9.A17(r1, r0)
            X.11F r3 = r4.A00
            if (r3 == 0) goto L_0x0010
            X.3Cj r1 = r4.A05
            r0 = 7
            r1.A00(r0)
            X.0wU r2 = r4.A07
            r0 = 1
            X.C36391kE.A1R(r2, r4, r3, r0)
            X.11F r1 = r4.A00
            if (r1 == 0) goto L_0x0063
            r0 = 2
            X.C36391kE.A1R(r2, r4, r1, r0)
        L_0x0063:
            X.00r r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.util.SingleLiveEvent<kotlin.Int>"
            X.AnonymousClass00C.A0E(r1, r0)
            r0 = 2131890334(0x7f12109e, float:1.9415357E38)
            X.C36341k9.A17(r1, r0)
            return
        L_0x0071:
            java.lang.Object r0 = r11.A00
            X.1nx r0 = (X.C38171nx) r0
            X.3O5 r3 = r0.getViewModel()
            X.00r r1 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>"
            X.AnonymousClass00C.A0E(r1, r0)
            r0 = 8
            X.C36341k9.A17(r1, r0)
            X.11F r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            X.3Cj r1 = r3.A05
            r0 = 5
            r1.A00(r0)
            X.11F r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            X.0wU r1 = r3.A07
            r0 = 2
            X.C36391kE.A1R(r1, r3, r2, r0)
            return
        L_0x009a:
            java.lang.Object r1 = r11.A00
            com.whatsapp.WaButtonWithLoader r1 = (com.whatsapp.WaButtonWithLoader) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0010
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            r0.onClick(r1)
            return
        L_0x00aa:
            java.lang.Object r0 = r11.A00
            X.3Tz r0 = (X.C65923Tz) r0
            X.4Sf r0 = r0.A02
            if (r0 == 0) goto L_0x0010
            r0.BRp()
            return
        L_0x00b6:
            java.lang.Object r3 = r11.A00
            X.21U r3 = (X.AnonymousClass21U) r3
            android.widget.EditText r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            int r2 = r0.getSelectionEnd()
            android.widget.EditText r0 = r3.A00
            if (r0 == 0) goto L_0x00cf
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            android.widget.EditText r1 = r3.A00
            if (r0 == 0) goto L_0x00e2
            r0 = 0
        L_0x00d5:
            r1.setTransformationMethod(r0)
            if (r2 < 0) goto L_0x00df
            android.widget.EditText r0 = r3.A00
            r0.setSelection(r2)
        L_0x00df:
            X.4fP r1 = r3.A02
            goto L_0x00fa
        L_0x00e2:
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            goto L_0x00d5
        L_0x00e7:
            java.lang.Object r1 = r11.A00
            X.4tB r1 = (X.C99374tB) r1
            android.widget.EditText r0 = r1.A02
            if (r0 == 0) goto L_0x0010
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00f8
            r0.clear()
        L_0x00f8:
            X.4fP r1 = r1.A02
        L_0x00fa:
            r0 = 0
            r1.A09(r0)
            return
        L_0x00ff:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r11)
            java.lang.String r0 = "onDeleteAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ae r2 = r3.A04
            r1 = 0
            r0 = 6
            r2.A03(r1, r0)
            X.1Rs r1 = r3.A05
            X.292 r0 = X.AnonymousClass292.A00
            goto L_0x015a
        L_0x0114:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r11)
            java.lang.String r0 = "AvatarHomeViewModel/onFabEditAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ae r2 = r3.A04
            r1 = 0
            r0 = 5
            goto L_0x012f
        L_0x0122:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r11)
            java.lang.String r0 = "AvatarHomeViewModel/onNewUserCreateAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ae r2 = r3.A04
            r1 = 0
            r0 = 2
        L_0x012f:
            r2.A03(r1, r0)
            X.1Rs r1 = r3.A05
            X.28z r0 = X.AnonymousClass28z.A00
            goto L_0x015a
        L_0x0137:
            com.whatsapp.avatar.home.AvatarHomeViewModel r1 = A00(r11)
            java.lang.String r0 = "AvatarHomeViewModel/onBrowserStickersClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rs r1 = r1.A05
            X.291 r0 = X.AnonymousClass291.A00
            goto L_0x015a
        L_0x0145:
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = A00(r11)
            java.lang.String r0 = "AvatarHomeViewModel/onCreateProfilePhotoClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ae r2 = r3.A04
            r1 = 0
            r0 = 18
            r2.A03(r1, r0)
            X.1Rs r1 = r3.A05
            X.290 r0 = X.AnonymousClass290.A00
        L_0x015a:
            r1.A0D(r0)
            return
        L_0x015e:
            java.lang.Object r2 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = (com.whatsapp.avatar.home.AvatarHomeActivity) r2
            X.1e2 r1 = r2.A0A
            if (r1 == 0) goto L_0x016c
            java.lang.String r0 = "https://faq.whatsapp.com/general/account-and-profile/how-to-use-avatars-on-whatsapp/"
            X.C36331k8.A0t(r2, r1, r0)
            return
        L_0x016c:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0173:
            com.whatsapp.avatar.home.AvatarHomeViewModel r4 = A00(r11)
            java.lang.String r0 = "AvatarHomeViewModel/onAvatarPreviewTryAgainClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00s r3 = r4.A00
            X.28y r2 = X.AnonymousClass28y.A00
            r1 = 0
            X.295 r0 = new X.295
            r0.<init>(r2, r1, r1, r1)
            r3.A0D(r0)
            X.5xM r5 = r4.A02
            X.4IQ r6 = new X.4IQ
            r6.<init>(r4)
            X.4IR r7 = new X.4IR
            r7.<init>(r4)
            r9 = 1
            X.0wU r0 = r5.A02
            r8 = 21
            X.755 r4 = new X.755
            r4.<init>(r5, r6, r7, r8, r9)
            r0.Bp1(r4)
            return
        L_0x01a3:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.FingerprintBottomSheet r0 = (com.whatsapp.authentication.FingerprintBottomSheet) r0
            r0.A1c()
            return
        L_0x01ab:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.FingerprintBottomSheet r0 = (com.whatsapp.authentication.FingerprintBottomSheet) r0
            com.whatsapp.authentication.FingerprintBottomSheet.A07(r0)
            return
        L_0x01b3:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.AppAuthenticationActivity r0 = (com.whatsapp.authentication.AppAuthenticationActivity) r0
            com.whatsapp.authentication.AppAuthenticationActivity.A0G(r0)
            return
        L_0x01bb:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0K(r0)
            return
        L_0x01c3:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0J(r0)
            return
        L_0x01cb:
            java.lang.Object r0 = r11.A00
            X.3Tn r0 = (X.C65803Tn) r0
            X.C65803Tn.A02(r12, r0)
            return
        L_0x01d3:
            java.lang.Object r2 = r11.A00
            com.whatsapp.audiopicker.AudioPickerActivity r2 = (com.whatsapp.audiopicker.AudioPickerActivity) r2
            android.widget.RelativeLayout r1 = r2.A02
            r0 = 8
            r1.setVisibility(r0)
            java.util.LinkedHashMap r0 = r2.A0L
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x01ec
            android.widget.ImageButton r0 = r2.A01
            X.AnonymousClass3MU.A01(r0, r1, r1)
        L_0x01ec:
            X.3LE r0 = r2.A0E
            r0.A05(r1)
            return
        L_0x01f2:
            java.lang.Object r5 = r11.A00
            com.whatsapp.audiopicker.AudioPickerActivity r5 = (com.whatsapp.audiopicker.AudioPickerActivity) r5
            X.171 r1 = r5.A06
            X.141 r0 = r5.A0C
            java.lang.String r8 = r1.A0H(r0)
            java.util.LinkedHashMap r0 = r5.A0L
            int r10 = r0.size()
            r7 = 0
            r9 = 2
            r6 = 1
            if (r10 != r6) goto L_0x023f
            java.util.Iterator r0 = X.C36391kE.A10(r0)
            java.lang.Object r0 = r0.next()
            X.3Ac r0 = (X.C60983Ac) r0
            java.lang.String r2 = r0.A07
            X.141 r0 = r5.A0C
            boolean r0 = r0.A0G()
            r1 = 2131888223(0x7f12085f, float:1.9411075E38)
            if (r0 == 0) goto L_0x0223
            r1 = 2131890080(0x7f120fa0, float:1.9414842E38)
        L_0x0223:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r7] = r2
            java.lang.String r0 = X.C36391kE.A0v(r5, r8, r0, r6, r1)
        L_0x022b:
            X.1qm r2 = X.C39001qm.A01(r5, r0)
            r1 = 2131893993(0x7f121ee9, float:1.9422778E38)
            r0 = 13
            X.4XL r0 = X.AnonymousClass4XL.A00(r5, r0)
            X.C39001qm.A03(r0, r2, r1)
            X.C36341k9.A11(r2)
            return
        L_0x023f:
            X.0ts r4 = r5.A00
            X.141 r0 = r5.A0C
            boolean r0 = r0.A0G()
            r3 = 2131755052(0x7f10002c, float:1.9140972E38)
            if (r0 == 0) goto L_0x024f
            r3 = 2131755141(0x7f100085, float:1.9141153E38)
        L_0x024f:
            long r1 = (long) r10
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1L(r0, r10, r7)
            r0[r6] = r8
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            goto L_0x022b
        L_0x025c:
            java.lang.Object r4 = r11.A00
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentBottomSheet r4 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentBottomSheet) r4
            com.whatsapp.WaButtonWithLoader r0 = r4.A01
            if (r0 == 0) goto L_0x0267
            r0.A02()
        L_0x0267:
            com.whatsapp.WaButtonWithLoader r0 = r4.A00
            r1 = 0
            if (r0 == 0) goto L_0x026f
            r0.setEnabled(r1)
        L_0x026f:
            com.whatsapp.WaButtonWithLoader r0 = r4.A01
            if (r0 == 0) goto L_0x0276
            r0.setEnabled(r1)
        L_0x0276:
            X.4UN r3 = r4.A1m()
            r0 = 2
            X.2qk r2 = new X.2qk
            r2.<init>(r4, r0)
            r1 = 3
            X.2qk r0 = new X.2qk
            r0.<init>(r4, r1)
            r3.BYA(r2, r0)
            return
        L_0x028a:
            java.lang.Object r4 = r11.A00
            com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentBottomSheet r4 = (com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentBottomSheet) r4
            com.whatsapp.WaButtonWithLoader r0 = r4.A00
            if (r0 == 0) goto L_0x0295
            r0.A02()
        L_0x0295:
            com.whatsapp.WaButtonWithLoader r0 = r4.A00
            r1 = 0
            if (r0 == 0) goto L_0x029d
            r0.setEnabled(r1)
        L_0x029d:
            com.whatsapp.WaButtonWithLoader r0 = r4.A01
            if (r0 == 0) goto L_0x02a4
            r0.setEnabled(r1)
        L_0x02a4:
            X.4UN r3 = r4.A1m()
            X.2qk r2 = new X.2qk
            r2.<init>(r4, r1)
            r1 = 1
            X.2qk r0 = new X.2qk
            r0.<init>(r4, r1)
            r3.BY9(r2, r0)
            return
        L_0x02b7:
            java.lang.Object r0 = r11.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r0 = (com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment) r0
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment.A03(r0)
            return
        L_0x02bf:
            java.lang.Object r4 = r11.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment) r4
            X.6TO r3 = r4.A00
            if (r3 == 0) goto L_0x02d2
            r2 = 0
            r1 = 7
            r0 = 21
            r3.A02(r2, r1, r0)
            r4.A1c()
            return
        L_0x02d2:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02d9:
            java.lang.Object r4 = r11.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r4
            r5 = 0
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAddAccount/add account tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RU r0 = r4.A07
            if (r0 == 0) goto L_0x0337
            X.0yC r1 = r0.A0C
            r0 = 7582(0x1d9e, float:1.0625E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0308
            X.01I r0 = r4.A0h()
            X.14u r2 = X.C36401kF.A0L(r0)
            int r1 = r4.A00
            java.lang.String r0 = r4.A0G
            com.whatsapp.accountswitching.ui.AddAccountBottomSheet r0 = X.C53232qz.A00(r0, r1)
            r2.Btm(r0)
        L_0x0304:
            r4.A1b()
            return
        L_0x0308:
            X.6TO r3 = r4.A09
            if (r3 == 0) goto L_0x0330
            int r2 = r4.A00
            r1 = 0
            r0 = 3
            r3.A02(r1, r2, r0)
            X.005 r0 = r4.A0F
            if (r0 == 0) goto L_0x0329
            java.lang.Object r3 = r0.get()
            X.6PU r3 = (X.AnonymousClass6PU) r3
            android.content.Context r2 = X.C36371kC.A0B(r12)
            int r1 = r4.A00
            java.lang.String r0 = r4.A0G
            r3.A01(r2, r0, r1, r5)
            goto L_0x0304
        L_0x0329:
            java.lang.String r0 = "addAccountNavigator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0330:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0337:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x033e:
            java.lang.Object r3 = r11.A00
            X.155 r3 = (X.AnonymousClass155) r3
            X.1Dv r2 = r3.A01
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass190.A1E(r3, r1, r1, r0)
            r2.A06(r3, r0)
            return
        L_0x034e:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0357:
            java.lang.Object r5 = r11.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r5 = (com.whatsapp.account.delete.DeleteAccountFeedback) r5
            android.widget.EditText r0 = r5.A03
            int r0 = X.C36381kD.A06(r0)
            if (r0 <= 0) goto L_0x0376
            android.widget.EditText r0 = r5.A03
            int r1 = X.C36381kD.A06(r0)
            r0 = 5
            if (r1 >= r0) goto L_0x0376
            X.17Y r2 = r5.A05
            r1 = 2131888769(0x7f120a81, float:1.9412183E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x0376:
            int r4 = r5.A01
            r1 = 1
            android.widget.EditText r0 = r5.A03
            if (r4 != r1) goto L_0x039e
            java.lang.String r4 = X.C36361kB.A0n(r0)
            r3 = 1
            com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment r2 = new com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "deleteReason"
            r1.putInt(r0, r3)
            java.lang.String r0 = "additionalComments"
            r1.putString(r0, r4)
            r2.A17(r1)
            r5.A06 = r2
            X.C36331k8.A12(r2, r5)
            return
        L_0x039e:
            java.lang.String r3 = X.C36361kB.A0n(r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountConfirmation"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "deleteReason"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "additionalComments"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            return
        L_0x03bd:
            java.lang.Object r2 = r11.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.EditText r0 = r2.A03
            r0.clearFocus()
            android.view.View r0 = r2.getCurrentFocus()
            if (r0 == 0) goto L_0x03d5
            X.1N2 r1 = r2.A0C
            android.view.View r0 = r2.getCurrentFocus()
            r1.A01(r0)
        L_0x03d5:
            r0 = 1
            r2.A07 = r0
            X.0Ws r0 = r2.A05
            r0.A00()
            return
        L_0x03de:
            java.lang.Object r4 = r11.A00
            com.whatsapp.account.delete.DeleteAccountConfirmation r4 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r4
            boolean r0 = X.C36431kI.A1R(r4)
            if (r0 != 0) goto L_0x03f2
            java.lang.String r0 = "DeleteAccountConfirmation/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            X.AnonymousClass3SJ.A01(r4, r0)
            return
        L_0x03f2:
            r0 = 1
            X.AnonymousClass3SJ.A01(r4, r0)
            android.os.Handler r3 = r4.A01
            r2 = 0
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.sendEmptyMessageDelayed(r2, r0)
            X.1C4 r2 = r4.A0A
            X.0ts r0 = r4.A00
            java.lang.String r8 = r0.A06()
            X.0ts r0 = r4.A00
            java.lang.String r7 = r0.A05()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "additionalComments"
            java.lang.String r6 = r1.getStringExtra(r0)
            android.content.Intent r1 = r4.getIntent()
            r0 = -1
            java.lang.String r5 = "deleteReason"
            int r4 = r1.getIntExtra(r5, r0)
            java.lang.String r0 = "sendmethods/sendremoveaccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19A r3 = r2.A02
            r2 = 0
            r1 = 0
            r0 = 27
            android.os.Message r2 = android.os.Message.obtain(r2, r1, r0, r1)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "lg"
            r1.putString(r0, r8)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "lc"
            r1.putString(r0, r7)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "userFeedback"
            r1.putString(r0, r6)
            android.os.Bundle r0 = r2.getData()
            r0.putInt(r5, r4)
            r3.A0J(r2)
            return
        L_0x0457:
            java.lang.Object r1 = r11.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "delete-account/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass190.A01(r1)
            r1.startActivity(r0)
            return
        L_0x0468:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x0475:
            java.lang.Object r0 = r11.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x048c
        L_0x047a:
            java.lang.Object r2 = r11.A00
            X.1kT r2 = (X.C36541kT) r2
            android.content.Intent r1 = X.C36431kI.A0C()
            java.lang.String r0 = X.C19430v1.A05
            X.C36421kH.A0n(r1, r0)
            android.app.Activity r0 = r2.A00
            r0.startActivity(r1)
        L_0x048c:
            r0.finish()
            return
        L_0x0490:
            java.lang.Object r0 = r11.A00
            X.1kT r0 = (X.C36541kT) r0
            android.app.Activity r1 = r0.A00
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            android.content.Intent r0 = X.C36441kJ.A0I(r0)
            r1.startActivity(r0)
            r1.finish()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x04aa:
            java.lang.Object r2 = r11.A00
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment r2 = (com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment) r2
            java.lang.String r0 = "LoginFailedDialogFragment/onCreateDialog/remove current account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01I r3 = r2.A0i()
            X.1RU r0 = r2.A05
            X.3KU r1 = r0.A03()
            r4 = 0
            X.0v0 r0 = r2.A08
            int r6 = r0.A0I()
            if (r1 != 0) goto L_0x04d8
            X.0wh r0 = r2.A09
            java.lang.String r1 = r0.A01()
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1H(r3, r4, r1, r6, r0)
        L_0x04d1:
            r3.startActivity(r0)
            X.AnonymousClass0XN.A00(r3)
            return
        L_0x04d8:
            r7 = 10
            long r8 = android.os.SystemClock.elapsedRealtime()
            X.0wh r0 = r2.A09
            java.lang.String r5 = r0.A01()
            android.content.Intent r0 = X.AnonymousClass190.A1G(r3, r4, r5, r6, r7, r8)
            goto L_0x04d1
        L_0x04e9:
            java.lang.Object r1 = r11.A00
            android.widget.EditText r1 = (android.widget.EditText) r1
            int r0 = X.C36381kD.A06(r1)
            r1.setSelection(r0)
            return
        L_0x04f5:
            r0 = 1
            X.C56582wY.A00 = r0
        L_0x04f8:
            java.lang.Object r1 = r11.A00
            X.4ea r1 = (X.C92764ea) r1
            int r0 = r1.A01
            r1.A02(r0)
            return
        L_0x0502:
            java.lang.Object r0 = r11.A00
            X.4tC r0 = (X.C99384tC) r0
            X.C99384tC.A00(r0)
            return
        L_0x050a:
            java.lang.Object r0 = r11.A00
            X.6LD r0 = (X.AnonymousClass6LD) r0
            X.2xJ r0 = r0.A03
            goto L_0x0517
        L_0x0511:
            java.lang.Object r0 = r11.A00
            X.6LC r0 = (X.AnonymousClass6LC) r0
            X.2xJ r0 = r0.A04
        L_0x0517:
            X.6j8 r1 = r0.A00
            X.4aa r0 = r1.A05
            if (r0 == 0) goto L_0x0520
            r0.dismiss()
        L_0x0520:
            r0 = 6
            r1.A00 = r0
            return
        L_0x0524:
            java.lang.Object r0 = r11.A00
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r0.A0D(r12)
            return
        L_0x052c:
            java.lang.Object r3 = r11.A00
            com.google.android.exoplayer2.ui.TrackSelectionView r3 = (com.google.android.exoplayer2.ui.TrackSelectionView) r3
            android.widget.CheckedTextView r2 = r3.A07
            if (r12 != r2) goto L_0x0559
            r1 = 1
        L_0x0535:
            r3.A00 = r1
            android.util.SparseArray r1 = r3.A05
            r1.clear()
            boolean r0 = r3.A00
            r2.setChecked(r0)
            android.widget.CheckedTextView r2 = r3.A06
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x054e
            int r1 = r1.size()
            r0 = 1
            if (r1 == 0) goto L_0x054f
        L_0x054e:
            r0 = 0
        L_0x054f:
            r2.setChecked(r0)
            java.lang.String r0 = "array-length"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0559:
            android.widget.CheckedTextView r0 = r3.A06
            r1 = 0
            if (r12 == r0) goto L_0x0535
            r3.A00 = r1
            java.lang.Object r0 = r12.getTag()
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "groupIndex"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x056e:
            r2.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A07(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66923Xv.onClick(android.view.View):void");
    }
}
