package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.6X8  reason: invalid class name */
public abstract class AnonymousClass6X8 {
    public static boolean A05(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145;
    }

    public static void A00(TextUtils.TruncateAt truncateAt, BloksEditText bloksEditText, C125115zL r4) {
        KeyListener keyListener;
        if (r4 != null && bloksEditText.getEllipsize() != truncateAt) {
            if (truncateAt == null) {
                if (r4.A0C != bloksEditText.getKeyListener()) {
                    keyListener = r4.A0C;
                }
                r4.A0A = truncateAt;
                bloksEditText.setEllipsize(truncateAt);
            }
            r4.A0C = bloksEditText.getKeyListener();
            keyListener = null;
            bloksEditText.setKeyListener(keyListener);
            r4.A0A = truncateAt;
            bloksEditText.setEllipsize(truncateAt);
        }
    }

    public static void A02(BloksEditText bloksEditText, C125115zL r2) {
        Drawable drawable = r2.A07;
        if (drawable != null) {
            bloksEditText.setTextCursorDrawable(drawable);
        }
    }

    public static void A03(BloksEditText bloksEditText, C125115zL r4, C1271967i r5, C140456lc r6) {
        Drawable.ConstantState constantState;
        if (r6 != null) {
            Drawable textCursorDrawable = bloksEditText.getTextCursorDrawable();
            r4.A07 = textCursorDrawable;
            if (textCursorDrawable != null && (constantState = textCursorDrawable.getConstantState()) != null) {
                Drawable newDrawable = constantState.newDrawable();
                C90514aH.A1H(PorterDuff.Mode.SRC_OVER, newDrawable, AnonymousClass5Z8.A00(r5, r6));
                bloksEditText.setTextCursorDrawable(newDrawable);
            }
        }
    }

    public static void A01(BloksEditText bloksEditText) {
        for (ViewParent parent = bloksEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                ((RecyclerView) parent).setImportantForAutofill(1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        X.AnonymousClass6RS.A01("TextInputBinderUtils", X.AnonymousClass000.A0p("Unsupported value for autofill type: ", r5, X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        if (r5.equals(r2) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
        r3.setImportantForAutofill(1);
        r3.setAutofillHints(new java.lang.String[]{r2});
        X.C90524aI.A0C(X.C132926Vv.A00).post(new X.AnonymousClass759((java.lang.Object) r3, 33));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0111, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r3, X.C1271967i r4, java.lang.String r5) {
        /*
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L_0x0016
            if (r5 != 0) goto L_0x0017
            java.lang.String[] r2 = X.C36441kJ.A1R()
            r1 = 0
            r0 = 0
            r2[r0] = r1
            r3.setAutofillHints(r2)
        L_0x0013:
            r3.setImportantForAutofill(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.String r0 = "none"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0021
            r0 = 2
            goto L_0x0013
        L_0x0021:
            android.content.Context r1 = r4.A00
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.autofill.AutofillManager r1 = (android.view.autofill.AutofillManager) r1
            if (r1 == 0) goto L_0x003a
            android.view.autofill.AutofillId r0 = r1.getNextAutofillId()
            r3.setAutofillId(r0)
            r1.requestAutofill(r3)
            r1.notifyViewClicked(r3)
        L_0x003a:
            int r0 = r5.hashCode()
            java.lang.String r1 = "password"
            java.lang.String r2 = "username"
            switch(r0) {
                case -2053263135: goto L_0x00eb;
                case -1677176261: goto L_0x00e0;
                case -1163041205: goto L_0x00d5;
                case -1122949358: goto L_0x00ca;
                case -612351174: goto L_0x00bf;
                case -397476730: goto L_0x00b4;
                case -265713450: goto L_0x00ad;
                case -177500692: goto L_0x00a2;
                case -177500691: goto L_0x0097;
                case 21980740: goto L_0x008c;
                case 96619420: goto L_0x0081;
                case 263786198: goto L_0x0076;
                case 390008550: goto L_0x006a;
                case 1216985755: goto L_0x0061;
                case 1729797393: goto L_0x0055;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unsupported value for autofill type: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)
            java.lang.String r0 = "TextInputBinderUtils"
            X.AnonymousClass6RS.A01(r0, r1)
            return
        L_0x0055:
            java.lang.String r0 = "credit_card_expiry_date"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "creditCardExpirationDate"
            goto L_0x00f5
        L_0x0061:
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x0045
            r2 = r1
            goto L_0x00f5
        L_0x006a:
            java.lang.String r0 = "credit_card_card_security_code"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "creditCardSecurityCode"
            goto L_0x00f5
        L_0x0076:
            java.lang.String r0 = "address_city"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "addressLocality"
            goto L_0x00f5
        L_0x0081:
            java.lang.String r0 = "email"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "emailAddress"
            goto L_0x00f5
        L_0x008c:
            java.lang.String r0 = "full_address"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "postalAddress"
            goto L_0x00f5
        L_0x0097:
            java.lang.String r0 = "address_street_line2"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "aptNumber"
            goto L_0x00f5
        L_0x00a2:
            java.lang.String r0 = "address_street_line1"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "streetAddress"
            goto L_0x00f5
        L_0x00ad:
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L_0x00f5
            goto L_0x0045
        L_0x00b4:
            java.lang.String r0 = "address_state"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "addressRegion"
            goto L_0x00f5
        L_0x00bf:
            java.lang.String r0 = "phone_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "phone"
            goto L_0x00f5
        L_0x00ca:
            java.lang.String r0 = "credit_card_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "creditCardNumber"
            goto L_0x00f5
        L_0x00d5:
            java.lang.String r0 = "address_country"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "addressCountry"
            goto L_0x00f5
        L_0x00e0:
            java.lang.String r0 = "full_name"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "name"
            goto L_0x00f5
        L_0x00eb:
            java.lang.String r0 = "postal_code"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "postalCode"
        L_0x00f5:
            r0 = 1
            r3.setImportantForAutofill(r0)
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r2
            r3.setAutofillHints(r1)
            r0 = 33
            X.759 r1 = new X.759
            r1.<init>((java.lang.Object) r3, (int) r0)
            X.00T r0 = X.C132926Vv.A00
            android.os.Handler r0 = X.C90524aI.A0C(r0)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6X8.A04(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText, X.67i, java.lang.String):void");
    }

    public static boolean A06(BloksEditText bloksEditText) {
        Editable text = bloksEditText.getText();
        if (text == null || text.length() == 0 || bloksEditText.getWidth() == 0 || bloksEditText.getLineCount() > 1 || (bloksEditText.getInputType() & 131087) == 131073 || A05(bloksEditText.getInputType())) {
            return false;
        }
        return true;
    }
}
