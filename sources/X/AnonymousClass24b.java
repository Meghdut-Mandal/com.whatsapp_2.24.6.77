package X;

import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.24b  reason: invalid class name */
public abstract class AnonymousClass24b extends AnonymousClass155 {
    public TextInputEditText A00;
    public TextInputLayout A01;
    public C63603Kr A02;
    public WDSButton A03;
    public WDSButton A04;
    public String A05;

    public final TextInputLayout A3i() {
        TextInputLayout textInputLayout = this.A01;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        throw C36331k8.A0d("secretCodeInputLayout");
    }

    public final C63603Kr A3j() {
        C63603Kr r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("passcodeManager");
    }

    public final WDSButton A3k() {
        WDSButton wDSButton = this.A03;
        if (wDSButton != null) {
            return wDSButton;
        }
        throw C36331k8.A0d("primaryButton");
    }

    public final String A3l() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        throw C36331k8.A0d("secretCodeString");
    }

    public final void A3n(int i) {
        C99304t3 A002 = C99304t3.A00(this.A00, i, 0);
        AnonymousClass0Eq r4 = A002.A0J;
        ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(r4);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        A0K.setMargins(dimensionPixelSize, A0K.topMargin, dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        r4.setLayoutParams(A0K);
        A002.A0Y(new C66933Xw(A002, 21), R.string.f12nameremoved);
        A002.A0P();
    }

    public boolean A3o() {
        Object A3l;
        Object obj;
        if (this instanceof ChatLockCreateSecretCodeActivity) {
            A3l = A3j().A00(A3l());
            obj = AnonymousClass2Ec.A00;
        } else {
            ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity = (ChatLockConfirmSecretCodeActivity) this;
            A3l = chatLockConfirmSecretCodeActivity.A3l();
            obj = chatLockConfirmSecretCodeActivity.A03;
            if (obj == null) {
                throw C36331k8.A0d("correctSecretCode");
            }
        }
        return AnonymousClass00C.A0J(A3l, obj);
    }

    public void A3m() {
        CharSequence error = A3i().getError();
        if (error != null && error.length() > 0 && A3o()) {
            A3i().setError((CharSequence) null);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            boolean r2 = X.C36381kD.A1W(r9)
            r0 = 2131624378(0x7f0e01ba, float:1.8875934E38)
            r9.setContentView((int) r0)
            r0 = 2131433709(0x7f0b18ed, float:1.8489211E38)
            android.view.View r0 = X.C36361kB.A0H(r9, r0)
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            r4 = 0
            X.AnonymousClass00C.A0D(r0, r4)
            r9.A01 = r0
            com.google.android.material.textfield.TextInputLayout r1 = r9.A3i()
            r0 = 2131893890(0x7f121e82, float:1.942257E38)
            r1.setHint((int) r0)
            com.google.android.material.textfield.TextInputLayout r1 = r9.A3i()
            r0 = 2
            r1.setEndIconMode(r0)
            com.google.android.material.textfield.TextInputLayout r1 = r9.A3i()
            r0 = 2131896404(0x7f122854, float:1.9427668E38)
            java.lang.String r0 = r9.getString(r0)
            r1.setEndIconContentDescription((java.lang.CharSequence) r0)
            com.google.android.material.textfield.TextInputLayout r1 = r9.A3i()
            r0 = 2131101065(0x7f060589, float:1.781453E38)
            android.content.res.ColorStateList r0 = X.C36431kI.A0G(r9, r0)
            r1.setEndIconTintList(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r9.A3i()
            r0.setErrorEnabled(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r9.A3i()
            r0.setHelperTextEnabled(r2)
            r0 = 2131434633(0x7f0b1c89, float:1.8491085E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0064
            r0.setAccessibilityLiveRegion(r2)
        L_0x0064:
            r0 = 2131434611(0x7f0b1c73, float:1.849104E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x0070
            r0.setImportantForAccessibility(r2)
        L_0x0070:
            r8 = 3
            int[][] r6 = new int[r8][]
            r7 = 2
            int[] r0 = new int[r7]
            r0 = {16842910, 16842908} // fill-array
            r3 = 0
            r6[r4] = r0
            int[] r1 = new int[r2]
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1[r4] = r0
            r6[r2] = r1
            int[] r0 = new int[r4]
            r6[r7] = r0
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            r5 = 0
            int r4 = X.C015006m.A00(r5, r1, r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            int r1 = X.C015006m.A00(r5, r1, r0)
            int[] r0 = new int[r8]
            r0[r3] = r4
            r0[r2] = r1
            r0[r7] = r1
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r1.<init>(r6, r0)
            com.google.android.material.textfield.TextInputLayout r0 = r9.A3i()
            r0.setBoxStrokeColorStateList(r1)
            r0.setHintTextColor(r1)
            java.lang.String r0 = ""
            r9.A05 = r0
            r0 = 2131433707(0x7f0b18eb, float:1.8489207E38)
            android.view.View r1 = X.C36361kB.A0H(r9, r0)
            com.google.android.material.textfield.TextInputEditText r1 = (com.google.android.material.textfield.TextInputEditText) r1
            r9.A00 = r1
            if (r1 != 0) goto L_0x00cf
            java.lang.String r0 = "secretCodeEditText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00cf:
            X.AnonymousClass4WJ.A00(r1, r9, r3)
            boolean r4 = r9 instanceof com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity
            if (r4 == 0) goto L_0x015f
            r0 = 5
        L_0x00d7:
            r1.setImeOptions(r0)
            X.C89384Wi.A00(r1, r9, r2)
            r0 = 2131428781(0x7f0b05ad, float:1.8479216E38)
            android.view.View r0 = X.C36361kB.A0H(r9, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            X.AnonymousClass00C.A0D(r0, r3)
            r9.A03 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A3k()
            java.lang.String r0 = r9.A3l()
            int r0 = r0.length()
            if (r0 > 0) goto L_0x00fa
            r2 = 0
        L_0x00fa:
            r1.setEnabled(r2)
            r0 = 2131428783(0x7f0b05af, float:1.847922E38)
            android.view.View r0 = X.C36361kB.A0H(r9, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            X.AnonymousClass00C.A0D(r0, r3)
            r9.A04 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A3k()
            if (r4 == 0) goto L_0x014f
            r0 = 2131893891(0x7f121e83, float:1.9422571E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A3k()
            r0 = 17
            X.C66933Xw.A00(r1, r9, r0)
        L_0x0120:
            r2 = r9
            if (r4 == 0) goto L_0x0182
            com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity r2 = (com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity) r2
            X.3Kr r0 = r2.A3j()
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0177
            int r1 = r2.A00
            r0 = 1
            if (r1 != r0) goto L_0x0177
            com.whatsapp.wds.components.button.WDSButton r0 = r2.A04
            if (r0 == 0) goto L_0x0170
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            if (r1 == 0) goto L_0x0169
            r0 = 2131893897(0x7f121e89, float:1.9422583E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            if (r1 == 0) goto L_0x0162
            r0 = 18
            X.C66933Xw.A00(r1, r2, r0)
            return
        L_0x014f:
            r0 = 2131893888(0x7f121e80, float:1.9422565E38)
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A3k()
            r0 = 16
            X.C66933Xw.A00(r1, r9, r0)
            goto L_0x0120
        L_0x015f:
            r0 = 6
            goto L_0x00d7
        L_0x0162:
            java.lang.String r0 = "secondaryButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0169:
            java.lang.String r0 = "secondaryButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0170:
            java.lang.String r0 = "secondaryButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0177:
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A04
            if (r1 != 0) goto L_0x018d
            java.lang.String r0 = "secondaryButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0182:
            com.whatsapp.wds.components.button.WDSButton r1 = r9.A04
            if (r1 != 0) goto L_0x018d
            java.lang.String r0 = "secondaryButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x018d:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass24b.onCreate(android.os.Bundle):void");
    }
}
