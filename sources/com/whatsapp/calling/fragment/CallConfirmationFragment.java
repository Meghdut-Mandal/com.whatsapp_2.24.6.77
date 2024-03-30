package com.whatsapp.calling.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass1ND;
import X.AnonymousClass3UL;
import X.C19420v0;
import X.C19730wQ;
import X.C225014r;
import X.C225314u;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36421kH;
import X.C87094Nl;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import java.util.List;

public class CallConfirmationFragment extends Hilt_CallConfirmationFragment {
    public C19730wQ A00;
    public AnonymousClass1ND A01;
    public AnonymousClass16D A02;
    public C19420v0 A03;
    public AnonymousClass17X A04;
    public boolean A05 = false;
    public final List A06 = AnonymousClass001.A0I();

    public static void A05(C225314u r5, AnonymousClass141 r6, Integer num, boolean z) {
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle A07 = AnonymousClass001.A07();
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        A07.putString("jid", AnonymousClass143.A03(r6.A06(cls)));
        A07.putBoolean("is_video_call", z);
        A07.putInt("call_from_ui", num.intValue());
        callConfirmationFragment.A17(A07);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("showCallConfirmationDialog groupJid: ");
        C36321k7.A1N(r6.A06(cls), A0u);
        r5.Btm(callConfirmationFragment);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.0FM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.0FL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.0FM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.0FM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.0FM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.0FM} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            X.01I r8 = r7.A0i()
            android.os.Bundle r1 = r7.A0b()
            java.lang.String r0 = "is_video_call"
            boolean r11 = r1.getBoolean(r0)
            android.os.Bundle r1 = r7.A0b()
            java.lang.String r0 = "jid"
            X.11F r1 = X.C36351kA.A0i(r1, r0)
            X.C18740tg.A06(r1)
            X.16D r0 = r7.A02
            X.141 r9 = r0.A0D(r1)
            android.os.Bundle r1 = r7.A0b()
            java.lang.String r0 = "education_message_resouce_id"
            r6 = 0
            int r5 = r1.getInt(r0, r6)
            if (r5 != 0) goto L_0x00da
            boolean r0 = r9.A0G()
            if (r0 == 0) goto L_0x00bb
            X.0FL r2 = new X.0FL
            r2.<init>(r8, r6)
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r0 = 1
            int[] r1 = new int[r0]
            r0 = 2130969261(0x7f0402ad, float:1.7547199E38)
            r1[r6] = r0
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r1)
            boolean r0 = r0.getBoolean(r6, r6)
            r2.A06 = r0
            r0 = 2131624313(0x7f0e0179, float:1.8875802E38)
            r2.setContentView(r0)
            r0 = 2131428440(0x7f0b0458, float:1.8478525E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x009a
            r0 = 2131231991(0x7f0804f7, float:1.8080079E38)
            if (r11 == 0) goto L_0x006e
            r0 = 2131231993(0x7f0804f9, float:1.8080083E38)
        L_0x006e:
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00E.A00(r8, r0)
            if (r3 == 0) goto L_0x0085
            android.graphics.drawable.Drawable r3 = X.AnonymousClass08I.A01(r3)
            r1 = 2130968687(0x7f04006f, float:1.7546035E38)
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            int r0 = X.C36351kA.A01(r8, r1, r0)
            X.AnonymousClass076.A06(r3, r0)
        L_0x0085:
            X.0ts r0 = r7.A01
            boolean r1 = X.C36351kA.A1Y(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00b7
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r0, r0, r0)
        L_0x0091:
            r10 = 1
            X.6cr r6 = new X.6cr
            r6.<init>(r7, r8, r9, r10, r11)
            r4.setOnClickListener(r6)
        L_0x009a:
            r0 = 2131429523(0x7f0b0893, float:1.8480721E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x00a9
            r0 = 2131233608(0x7f080b48, float:1.8083358E38)
            r1.setBackgroundResource(r0)
        L_0x00a9:
            r0 = 1
            r2.setCanceledOnTouchOutside(r0)
            boolean r0 = r8 instanceof X.C87094Nl
            if (r0 == 0) goto L_0x00b6
            java.util.List r0 = r7.A06
            r0.add(r8)
        L_0x00b6:
            return r2
        L_0x00b7:
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r3, r0)
            goto L_0x0091
        L_0x00bb:
            X.1qm r2 = X.AnonymousClass3LW.A00(r8)
            r0 = 2131886549(0x7f1201d5, float:1.940768E38)
            if (r11 == 0) goto L_0x00c7
            r0 = 2131895637(0x7f122555, float:1.9426113E38)
        L_0x00c7:
            r2.A0K(r0)
            r1 = 2131896373(0x7f122835, float:1.9427605E38)
            X.3VB r0 = new X.3VB
            r0.<init>(r8, r7, r9, r11)
            X.C36371kC.A15(r0, r2, r1)
            X.0FM r2 = r2.create()
            goto L_0x00a9
        L_0x00da:
            android.os.Bundle r1 = r7.A0b()
            java.lang.String r0 = "education_message_display_limit"
            int r16 = r1.getInt(r0, r6)
            android.os.Bundle r1 = r7.A0b()
            java.lang.String r0 = "callee_name"
            java.lang.String r2 = r1.getString(r0)
            X.1qm r4 = X.AnonymousClass3LW.A00(r8)
            r3 = 2131886548(0x7f1201d4, float:1.9407678E38)
            if (r11 == 0) goto L_0x00fa
            r3 = 2131895636(0x7f122554, float:1.942611E38)
        L_0x00fa:
            r0 = 1
            if (r2 != 0) goto L_0x011e
            android.content.res.Resources r2 = X.C36341k9.A0G(r7)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = ""
            java.lang.String r0 = X.C36411kG.A0w(r2, r0, r1, r6, r5)
        L_0x0109:
            r4.setTitle(r0)
            X.3VD r12 = new X.3VD
            r13 = r8
            r14 = r7
            r15 = r9
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            X.C36371kC.A15(r12, r4, r3)
            X.0FM r2 = r4.create()
            goto L_0x00a9
        L_0x011e:
            android.content.res.Resources r1 = X.C36341k9.A0G(r7)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = X.C36411kG.A0w(r1, r2, r0, r6, r5)
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.fragment.CallConfirmationFragment.A1a(android.os.Bundle):android.app.Dialog");
    }

    public static void A03(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass141 r10, boolean z) {
        int i = callConfirmationFragment.A0b().getInt("call_from_ui");
        Activity activity2 = activity;
        callConfirmationFragment.A01.Buc(activity2, C36421kH.A0P(r10), AnonymousClass3UL.A04(callConfirmationFragment.A00, callConfirmationFragment.A02, callConfirmationFragment.A04, r10), i, z);
        callConfirmationFragment.A05 = true;
    }

    public static void A06(AnonymousClass17Y r7, AnonymousClass141 r8, Integer num, String str, int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle A07 = AnonymousClass001.A07();
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        A07.putString("jid", AnonymousClass143.A03(r8.A06(cls)));
        A07.putBoolean("is_video_call", z);
        A07.putInt("call_from_ui", num.intValue());
        if (valueOf != null) {
            A07.putInt("education_message_resouce_id", R.string.f12nameremoved);
            A07.putString("callee_name", str);
            A07.putInt("education_message_display_limit", valueOf.intValue());
        }
        callConfirmationFragment.A17(A07);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("showCallConfirmationDialog groupJid: ");
        C36321k7.A1N(r8.A06(cls), A0u);
        C225014r r1 = r7.A00;
        if (r1 != null) {
            r1.Btl(callConfirmationFragment, "CallConfirmationFragment");
        } else {
            Log.e("CallConfirmationFragment null dialog interface, show dialog failed.");
        }
    }

    public static boolean A07(C225314u r2, C19420v0 r3, AnonymousClass141 r4, Integer num, boolean z) {
        if (C36371kC.A01(C36341k9.A0E(r3), "call_confirmation_dialog_count") >= 5 && !r4.A0G()) {
            return false;
        }
        A05(r2, r4, num, z);
        return true;
    }

    public static boolean A08(C225314u r1, AnonymousClass141 r2, Integer num, boolean z) {
        if (!r2.A0G()) {
            return false;
        }
        A05(r1, r2, num, z);
        return true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A05) {
            for (C87094Nl r1 : this.A06) {
                QuickContactActivity.A0F((QuickContactActivity) r1, false);
            }
        }
        this.A06.clear();
    }
}
