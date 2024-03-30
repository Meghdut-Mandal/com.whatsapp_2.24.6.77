package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16V;
import X.AnonymousClass16W;
import X.AnonymousClass1A5;
import X.AnonymousClass1EV;
import X.AnonymousClass6ZA;
import X.C131606Ps;
import X.C19730wQ;
import X.C199969gL;
import X.C203049nB;
import X.C207119ua;
import X.C207199ui;
import X.C207219uk;
import X.C20810yC;
import X.C21335AHn;
import X.C222713q;
import X.C23075B3f;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C90484aE;
import X.C90524aI;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class BrazilPixBottomSheet extends Hilt_BrazilPixBottomSheet {
    public CoordinatorLayout A00;
    public C19730wQ A01;
    public AnonymousClass1A5 A02;
    public C20810yC A03;
    public AnonymousClass11F A04;
    public AnonymousClass6ZA A05 = new AnonymousClass6ZA();
    public AnonymousClass1EV A06;
    public C23075B3f A07;
    public C199969gL A08;
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public C207119ua A0F;
    public C21335AHn A0G;
    public C207219uk A0H;
    public Boolean A0I;
    public String A0J;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0J2;
        String A0l;
        C207199ui r0;
        String str;
        AnonymousClass00C.A0D(layoutInflater, 0);
        Bundle A0b = A0b();
        C222713q r02 = AnonymousClass11F.A00;
        this.A04 = C222713q.A01(A0b.getString("merchantJid"));
        this.A0J = A0b.getString("referenceId");
        this.A0G = (C21335AHn) A0b.getParcelable("payment_settings");
        this.A0H = (C207219uk) A0b.getParcelable("interactive_message_content");
        this.A0F = (C207119ua) A0b.getParcelable("total_amount_money_representation");
        this.A0D = A0b.getString("referral_screen");
        this.A09 = Boolean.valueOf(A0b.getBoolean("is_quick_launch_enabled"));
        if (A0b.getBoolean("show_snackbar_on_copy_enabled") && !A1r().A0E(7569)) {
            this.A0I = Boolean.valueOf(A0b.getBoolean("show_snackbar_on_copy_enabled"));
        }
        C21335AHn aHn = this.A0G;
        if (aHn == null || (A0J2 = aHn.A01) == null) {
            AnonymousClass11F r1 = this.A04;
            if (r1 == null) {
                A0J2 = null;
            } else {
                AnonymousClass1A5 r03 = this.A02;
                if (r03 != null) {
                    AnonymousClass141 A012 = r03.A01(r1);
                    if (A012.A0K() != null) {
                        A0J2 = A012.A0K();
                    } else {
                        A0J2 = A012.A0J();
                    }
                } else {
                    throw C36331k8.A0d("conversationContactManager");
                }
            }
        }
        this.A0A = A0J2;
        C21335AHn aHn2 = this.A0G;
        if (aHn2 != null) {
            String str2 = aHn2.A02;
            String str3 = aHn2.A00;
            if (str3 == null || str3.length() == 0) {
                String str4 = this.A0J;
                C207119ua r2 = this.A0F;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("0014br.gov.bcb.pix01");
                String A0q = AnonymousClass000.A0q(A03(str2), A0u);
                StringBuilder A0i = C90524aI.A0i("000201");
                A0i.append("26");
                A0i.append(A03(A0q));
                A0i.append("52040000");
                A0i.append("5303986");
                A0i.append("5802BR");
                A0i.append("59");
                String str5 = aHn2.A01;
                try {
                    str5 = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+").matcher(Normalizer.normalize(str5, Normalizer.Form.NFD)).replaceAll("");
                } catch (Exception unused) {
                }
                if (str5.length() > 25) {
                    str5 = str5.substring(0, 25);
                }
                A0i.append(A03(str5));
                A0i.append("6001");
                A0i.append("*");
                if (r2 != null && ((AnonymousClass16V) r2.A01).A02.equals(((AnonymousClass16V) AnonymousClass16W.A04).A02)) {
                    A0i.append("54");
                    A0i.append(A03(r2.A02.toString()));
                }
                if (str4 != null) {
                    StringBuilder A0q2 = C90484aE.A0q("62", A0i);
                    A0q2.append("05");
                    str = A03(AnonymousClass000.A0q(A03(str4), A0q2));
                } else {
                    A0i.append("62");
                    str = "070503***";
                }
                A0i.append(str);
                A0i.append("6304");
                Object[] A0L = AnonymousClass001.A0L();
                short s = -1;
                for (byte b : A0i.toString().getBytes()) {
                    s = (short) (s ^ (((short) b) << 8));
                    int i = 0;
                    do {
                        short s2 = 32768 & s;
                        int i2 = s << 1;
                        if (s2 != 0) {
                            i2 ^= 4129;
                        }
                        s = (short) i2;
                        i++;
                    } while (i < 8);
                }
                A0L[0] = Short.valueOf(s);
                str3 = AnonymousClass000.A0q(String.format("%X", A0L), A0i);
            }
            this.A0C = str3;
        }
        this.A0E = A0b.getString("total_amount");
        A05(this, (Integer) null, 0);
        if (A1r().A0E(8038)) {
            C207219uk r04 = this.A0H;
            if (r04 == null || (r0 = r04.A01) == null || (A0l = r0.A03) == null) {
                A0l = C36361kB.A0l();
            }
            this.A0B = A0l;
        }
        return super.A1G(bundle, layoutInflater, viewGroup);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        if (A07(this)) {
            A06(this, this.A0B, false);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }

    public static final boolean A07(BrazilPixBottomSheet brazilPixBottomSheet) {
        if (!C36371kC.A1X(brazilPixBottomSheet.A09, true) || !"chat".equals(brazilPixBottomSheet.A0D)) {
            return false;
        }
        return true;
    }

    public final C20810yC A1r() {
        C20810yC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public BrazilPixBottomSheet() {
        Boolean A0j = C36381kD.A0j();
        this.A0I = A0j;
        this.A09 = A0j;
    }

    public static String A03(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, str.length(), 0);
        return AnonymousClass000.A0p(String.format(locale, "%02d", A0L), str, A0u);
    }

    public static final void A05(BrazilPixBottomSheet brazilPixBottomSheet, Integer num, int i) {
        Integer num2 = num;
        int i2 = i;
        if (!brazilPixBottomSheet.A1r().A0E(8038) || i != 1 || num == null || num.intValue() != 5) {
            C131606Ps r2 = new C131606Ps((String) null, new C131606Ps[0]);
            r2.A03("payment_method", "pix");
            String str = brazilPixBottomSheet.A0D;
            C23075B3f b3f = brazilPixBottomSheet.A07;
            if (b3f != null) {
                C203049nB.A03(r2, b3f, num2, "payment_instructions_prompt", str, i2);
                return;
            }
            throw C36331k8.A0d("fieldStatEventLogger");
        }
        AnonymousClass11F r1 = brazilPixBottomSheet.A04;
        if (r1 != null) {
            C199969gL r0 = brazilPixBottomSheet.A08;
            if (r0 != null) {
                r0.A01(r1, brazilPixBottomSheet.A0H, (Integer) null, brazilPixBottomSheet.A0B, "pix", (List) null, 36, 1, false, true, true);
                return;
            }
            throw C36331k8.A0d("orderDetailsMessageLogging");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.whatsapp.payments.ui.BrazilPixBottomSheet r6, java.lang.String r7, boolean r8) {
        /*
            java.lang.Integer r0 = X.C36371kC.A0p()
            r4 = 1
            A05(r6, r0, r4)
            X.01I r5 = r6.A0h()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPixBottomSheet.Callback"
            X.AnonymousClass00C.A0E(r5, r0)
            X.7cy r5 = (X.C157447cy) r5
            java.lang.String r3 = r6.A0C
            X.C18740tg.A06(r3)
            X.AnonymousClass00C.A08(r3)
            X.11F r0 = r6.A04
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            X.9ua r0 = r6.A0F
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            X.AHn r0 = r6.A0G
            X.C18740tg.A06(r0)
            X.AnonymousClass00C.A08(r0)
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r5 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r5
            X.7yk r0 = r5.A0B
            java.lang.String r2 = "serializeAndCopyPixCodeToClipboard/clipboard/"
            X.0yb r0 = r0.A04
            android.content.ClipboardManager r1 = r0.A09()
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "pix_code"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r3)     // Catch:{ NullPointerException | SecurityException -> 0x004b }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x004b }
            goto L_0x005b
        L_0x004b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x004f:
            java.lang.String r1 = "BrazilOrderDetailActivity"
            java.lang.String r0 = "onCopyPixKeyCTAClicked failed"
            java.lang.String r0 = X.C24611Dc.A01(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0085
        L_0x005b:
            X.7yk r3 = r5.A0B
            r2 = 6
            X.2bZ r1 = r5.A0I
            java.lang.String r0 = "pending_buyer_confirmation"
            r3.A0S(r1, r7, r0, r2)
            if (r8 == 0) goto L_0x0085
            java.lang.String r1 = "order_details"
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "referral_screen"
            r2.putString(r0, r1)
            com.whatsapp.payments.ui.BrazilContentCopiedBottomSheet r1 = new com.whatsapp.payments.ui.BrazilContentCopiedBottomSheet
            r1.<init>()
            r1.A17(r2)
            X.6ZA r0 = r1.A00
            r0.A00 = r5
            X.01z r0 = r5.getSupportFragmentManager()
            X.C65443Sb.A02(r1, r0)
        L_0x0085:
            java.lang.Boolean r0 = r6.A0I
            boolean r0 = X.C36371kC.A1X(r0, r4)
            if (r0 == 0) goto L_0x00c0
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r6.A00
            if (r2 == 0) goto L_0x00c0
            r1 = 2131893082(0x7f121b5a, float:1.942093E38)
            r0 = 0
            X.4t3 r5 = X.C99304t3.A00(r2, r1, r0)
            X.0Eq r4 = r5.A0J
            android.view.ViewGroup$MarginLayoutParams r3 = X.C36371kC.A0K(r4)
            android.content.res.Resources r2 = X.C36341k9.A0G(r6)
            r0 = 2131168374(0x7f070c76, float:1.7951048E38)
            r1 = 2131168374(0x7f070c76, float:1.7951048E38)
            int r2 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = X.C36341k9.A0G(r6)
            int r1 = r0.getDimensionPixelSize(r1)
            int r0 = r3.topMargin
            r3.setMargins(r2, r0, r2, r1)
            r4.setLayoutParams(r3)
            r5.A0P()
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPixBottomSheet.A06(com.whatsapp.payments.ui.BrazilPixBottomSheet, java.lang.String, boolean):void");
    }
}
