package com.whatsapp.areffects.flmconsent;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass3AO;
import X.AnonymousClass3NG;
import X.AnonymousClass4IL;
import X.AnonymousClass4UN;
import X.C188448zb;
import X.C20810yC;
import X.C21060yb;
import X.C32711e4;
import X.C36431kI;
import X.C50792la;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.calling.avatar.view.CallAvatarFLMConsentBottomSheet;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel;
import com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet;

public abstract class ArEffectsFlmConsentBottomSheet extends Hilt_ArEffectsFlmConsentBottomSheet {
    public WaButtonWithLoader A00;
    public WaButtonWithLoader A01;
    public C188448zb A02;
    public C21060yb A03;
    public C20810yC A04;
    public C32711e4 A05;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A1G = super.A1G(bundle, layoutInflater, viewGroup);
        ViewStub viewStub = null;
        if (A1G != null) {
            viewStub = C36431kI.A0M(A1G, R.id.content_stub);
        }
        C188448zb BBy = A1m().BBy();
        this.A02 = BBy;
        if (viewStub != null) {
            int ordinal = BBy.ordinal();
            if (ordinal != 0) {
                int i = R.layout.f9nameremoved;
                if (ordinal != 1) {
                    i = R.layout.f9nameremoved;
                }
                viewStub.setLayoutResource(i);
                viewStub.inflate();
            } else {
                throw AnonymousClass001.A09("Invalid consent type");
            }
        }
        return A1G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r1 == false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r18, android.view.View r19) {
        /*
            r17 = this;
            r3 = 0
            r2 = r19
            X.AnonymousClass00C.A0D(r2, r3)
            r5 = r17
            r0 = r18
            super.A1S(r0, r2)
            X.8zb r0 = r5.A02
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "consentType"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0018:
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x027e
            r4 = 1
            if (r0 == r4) goto L_0x0196
            r0 = 2131434614(0x7f0b1c76, float:1.8491047E38)
            android.view.View r7 = X.C36361kB.A0G(r2, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r7 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r7
            boolean r0 = r5 instanceof com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet
            if (r0 == 0) goto L_0x007e
            r0 = r5
            com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet r0 = (com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet) r0
            boolean r1 = r0.A01
        L_0x0033:
            r0 = 2131896322(0x7f122802, float:1.9427502E38)
            if (r1 == 0) goto L_0x003b
            r0 = 2131896323(0x7f122803, float:1.9427504E38)
        L_0x003b:
            java.lang.String r0 = X.C36381kD.A0t(r2, r0)
            r7.setHeadlineText(r0)
            android.content.Context r6 = r2.getContext()
            r0 = 2131232997(0x7f0808e5, float:1.808212E38)
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r6, r0)
            r7.setHeaderImage(r0)
            X.2nk r0 = X.C51392nk.SMALL
            r7.setLayoutSize(r0)
            r0 = 4
            X.3JS[] r9 = new X.AnonymousClass3JS[r0]
            android.content.Context r6 = r2.getContext()
            r0 = 2131896313(0x7f1227f9, float:1.9427484E38)
            if (r1 == 0) goto L_0x0064
            r0 = 2131896314(0x7f1227fa, float:1.9427486E38)
        L_0x0064:
            java.lang.String r10 = X.C36361kB.A0m(r6, r0)
            r8 = 2131234003(0x7f080cd3, float:1.808416E38)
            r6 = 0
            X.3JS r0 = new X.3JS
            r0.<init>(r10, r6, r8)
            r9[r3] = r0
            X.8zb r0 = r5.A02
            java.lang.String r16 = "consentType"
            if (r0 != 0) goto L_0x0080
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x007e:
            r1 = 0
            goto L_0x0033
        L_0x0080:
            int r0 = r0.ordinal()
            java.lang.String r15 = "Invalid consent type"
            r12 = 5
            r11 = 4
            r8 = 3
            r10 = 2
            if (r0 == r10) goto L_0x0097
            if (r0 == r8) goto L_0x00a0
            if (r0 == r11) goto L_0x00a0
            if (r0 == r12) goto L_0x009c
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r15)
            throw r0
        L_0x0097:
            r14 = 2131896316(0x7f1227fc, float:1.942749E38)
            if (r1 != 0) goto L_0x00a3
        L_0x009c:
            r14 = 2131896315(0x7f1227fb, float:1.9427488E38)
            goto L_0x00a3
        L_0x00a0:
            r14 = 2131896312(0x7f1227f8, float:1.9427482E38)
        L_0x00a3:
            android.content.Context r13 = r2.getContext()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "privacy-policy"
            java.lang.String r13 = X.C36351kA.A0x(r13, r1, r0, r3, r14)
            X.8zb r0 = r5.A02
            if (r0 != 0) goto L_0x00b8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r16)
            throw r0
        L_0x00b8:
            int r0 = r0.ordinal()
            if (r0 == r10) goto L_0x00cc
            if (r0 == r8) goto L_0x00c9
            if (r0 == r11) goto L_0x00cf
            if (r0 == r12) goto L_0x00cc
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r15)
            throw r0
        L_0x00c9:
            java.lang.String r0 = "https://faq.whatsapp.com/334507007438726"
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r0 = "https://www.whatsapp.com/legal/recommended-avatars-privacy-notice"
            goto L_0x00d1
        L_0x00cf:
            java.lang.String r0 = "https://faq.whatsapp.com/829127588693564"
        L_0x00d1:
            X.1e4 r11 = r5.A05
            if (r11 == 0) goto L_0x018f
            android.content.Context r12 = X.C36371kC.A0B(r2)
            java.lang.String[] r15 = new java.lang.String[]{r1}
            java.lang.String[] r1 = new java.lang.String[r4]
            r1[r3] = r0
            java.lang.Runnable[] r14 = new java.lang.Runnable[r4]
            X.3wG r0 = X.C80973wG.A00
            r14[r3] = r0
            r16 = r1
            android.text.SpannableString r11 = r11.A03(r12, r13, r14, r15, r16)
            r1 = 2131234159(0x7f080d6f, float:1.8084476E38)
            X.3JS r0 = new X.3JS
            r0.<init>(r11, r6, r1)
            r9[r4] = r0
            r11 = 2131234227(0x7f080db3, float:1.8084614E38)
            android.content.Context r1 = r2.getContext()
            r0 = 2131896317(0x7f1227fd, float:1.9427492E38)
            java.lang.String r6 = X.C36361kB.A0m(r1, r0)
            r1 = 0
            X.3JS r0 = new X.3JS
            r0.<init>(r6, r1, r11)
            r9[r10] = r0
            r10 = 2131233962(0x7f080caa, float:1.8084076E38)
            android.content.Context r1 = r2.getContext()
            r0 = 2131896318(0x7f1227fe, float:1.9427494E38)
            java.lang.String r6 = X.C36361kB.A0m(r1, r0)
            r1 = 0
            X.3JS r0 = new X.3JS
            r0.<init>(r6, r1, r10)
            java.util.List r1 = X.C36341k9.A0m(r0, r9, r8)
            X.2mw r0 = new X.2mw
            r0.<init>(r1)
            r7.setContent(r0)
            r0 = 2131429154(0x7f0b0722, float:1.8479973E38)
            android.view.View r0 = X.C36361kB.A0G(r7, r0)
            java.util.Iterator r12 = X.C36381kD.A12(r0)
            r11 = 0
        L_0x0139:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r10 = r12.next()
            int r9 = r11 + 1
            if (r11 >= 0) goto L_0x014c
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x014c:
            android.view.View r10 = (android.view.View) r10
            r0 = 2131428277(0x7f0b03b5, float:1.8478194E38)
            android.widget.ImageView r8 = X.C36341k9.A0L(r10, r0)
            android.content.Context r7 = r8.getContext()
            android.content.Context r6 = r8.getContext()
            r1 = 2130971175(0x7f040a27, float:1.755108E38)
            r0 = 2131102655(0x7f060bbf, float:1.7817754E38)
            int r0 = X.C36351kA.A02(r6, r7, r1, r0)
            r8.setColorFilter(r0)
            if (r11 != r4) goto L_0x0183
            r0 = 2131428284(0x7f0b03bc, float:1.8478208E38)
            android.widget.TextView r1 = X.C36341k9.A0M(r10, r0)
            X.0yC r0 = r5.A04
            if (r0 == 0) goto L_0x018a
            X.C36331k8.A10(r1, r0)
            android.graphics.Rect r0 = X.AnonymousClass0BN.A0A
            X.0yb r0 = r5.A03
            if (r0 == 0) goto L_0x0185
            X.C36371kC.A1I(r1, r0)
        L_0x0183:
            r11 = r9
            goto L_0x0139
        L_0x0185:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x018a:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x018f:
            java.lang.String r0 = "linkifierUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0196:
            android.content.Context r1 = r5.A0a()
            r0 = 2131896308(0x7f1227f4, float:1.9427474E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.Spanned r9 = android.text.Html.fromHtml(r0)
            X.AnonymousClass00C.A08(r9)
            char[] r8 = new char[r4]
            r0 = 10
            r8[r3] = r0
            int r7 = r9.length()
            int r7 = r7 - r4
            r6 = 0
            r4 = 0
        L_0x01b5:
            if (r6 > r7) goto L_0x01d3
            r0 = r7
            if (r4 != 0) goto L_0x01bb
            r0 = r6
        L_0x01bb:
            char r1 = r9.charAt(r0)
            char r0 = r8[r3]
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r4 != 0) goto L_0x01ce
            if (r0 != 0) goto L_0x01cb
            r4 = 1
            goto L_0x01b5
        L_0x01cb:
            int r6 = r6 + 1
            goto L_0x01b5
        L_0x01ce:
            if (r0 == 0) goto L_0x01d3
            int r7 = r7 + -1
            goto L_0x01b5
        L_0x01d3:
            int r0 = r7 + 1
            java.lang.CharSequence r1 = r9.subSequence(r6, r0)
            r0 = 2131428100(0x7f0b0304, float:1.8477835E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r2, r0)
            if (r0 == 0) goto L_0x01e5
            r0.setText(r1)
        L_0x01e5:
            r0 = 2131430334(0x7f0b0bbe, float:1.8482366E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.WaButtonWithLoader r0 = (com.whatsapp.WaButtonWithLoader) r0
            r5.A00 = r0
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r4 = r2.findViewById(r0)
            com.whatsapp.WaButtonWithLoader r4 = (com.whatsapp.WaButtonWithLoader) r4
            r5.A01 = r4
            com.whatsapp.WaButtonWithLoader r2 = r5.A00
            if (r2 == 0) goto L_0x0208
            r1 = 30
            X.3Xv r0 = new X.3Xv
            r0.<init>(r5, r1)
            r2.A00 = r0
        L_0x0208:
            if (r4 == 0) goto L_0x0221
            r1 = 31
            X.3Xv r0 = new X.3Xv
            r0.<init>(r5, r1)
            r4.A00 = r0
            r0 = 2131428419(0x7f0b0443, float:1.8478482E38)
            com.whatsapp.wds.components.button.WDSButton r1 = X.C36441kJ.A0u(r4, r0)
            if (r1 == 0) goto L_0x0221
            X.1Qp r0 = X.C27981Qp.BORDERLESS
            r1.setVariant(r0)
        L_0x0221:
            com.whatsapp.WaButtonWithLoader r2 = r5.A00
            java.lang.String r7 = "Invalid consent type"
            java.lang.String r6 = "consentType"
            r4 = 1
            if (r2 == 0) goto L_0x024f
            X.8zb r0 = r5.A02
            if (r0 != 0) goto L_0x0233
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0233:
            int r0 = r0.ordinal()
            if (r0 == r3) goto L_0x0279
            if (r0 == r4) goto L_0x025e
            boolean r0 = r5 instanceof com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet
            if (r0 == 0) goto L_0x025c
            r0 = r5
            com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet r0 = (com.whatsapp.settings.SettingsPrivacyFLMConsentBottomSheet) r0
            boolean r1 = r0.A01
        L_0x0244:
            r0 = 2131896319(0x7f1227ff, float:1.9427496E38)
            if (r1 == 0) goto L_0x024c
            r0 = 2131896320(0x7f122800, float:1.9427498E38)
        L_0x024c:
            r2.setButtonText((int) r0)
        L_0x024f:
            com.whatsapp.WaButtonWithLoader r2 = r5.A01
            if (r2 == 0) goto L_0x0273
            X.8zb r0 = r5.A02
            if (r0 != 0) goto L_0x0262
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x025c:
            r1 = 0
            goto L_0x0244
        L_0x025e:
            r0 = 2131896309(0x7f1227f5, float:1.9427476E38)
            goto L_0x024c
        L_0x0262:
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0274
            r0 = 2131896310(0x7f1227f6, float:1.9427478E38)
            if (r1 == r4) goto L_0x0270
            r0 = 2131896321(0x7f122801, float:1.94275E38)
        L_0x0270:
            r2.setButtonText((int) r0)
        L_0x0273:
            return
        L_0x0274:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r7)
            throw r0
        L_0x0279:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r7)
            throw r0
        L_0x027e:
            java.lang.String r0 = "Invalid consent type"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1k(AnonymousClass3NG r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass3AO r2 = r4.A00;
        r2.A06 = false;
        r2.A04 = new C50792la(AnonymousClass4IL.A00);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        AnonymousClass00C.A0D(dialogInterface, 0);
        AnonymousClass02E A0N = A0i().getSupportFragmentManager().A0N(ArEffectsFlmConsentErrorDialogFragment.class.getName());
        if ((A0N instanceof DialogFragment) && (dialogFragment = (DialogFragment) A0N) != null) {
            dialogFragment.A1c();
        }
        A1m().BY8();
        super.onDismiss(dialogInterface);
        this.A00 = null;
        this.A01 = null;
    }

    public static final void A03(ArEffectsFlmConsentBottomSheet arEffectsFlmConsentBottomSheet) {
        WaButtonWithLoader waButtonWithLoader = arEffectsFlmConsentBottomSheet.A00;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A01();
        }
        WaButtonWithLoader waButtonWithLoader2 = arEffectsFlmConsentBottomSheet.A00;
        if (waButtonWithLoader2 != null) {
            waButtonWithLoader2.setEnabled(true);
        }
        WaButtonWithLoader waButtonWithLoader3 = arEffectsFlmConsentBottomSheet.A01;
        if (waButtonWithLoader3 != null) {
            waButtonWithLoader3.A01();
        }
        WaButtonWithLoader waButtonWithLoader4 = arEffectsFlmConsentBottomSheet.A01;
        if (waButtonWithLoader4 != null) {
            waButtonWithLoader4.setEnabled(true);
        }
    }

    public AnonymousClass4UN A1m() {
        if (this instanceof SettingsPrivacyFLMConsentBottomSheet) {
            return (SettingsPrivacyCameraEffectsViewModel) ((SettingsPrivacyFLMConsentBottomSheet) this).A00.getValue();
        }
        return (CallAvatarViewModel) ((CallAvatarFLMConsentBottomSheet) this).A00.getValue();
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
