package com.whatsapp;

import X.C224514j;
import X.C36331k8;
import android.widget.TextView;

public final class SuspiciousLinkWarningDialogFragment extends Hilt_SuspiciousLinkWarningDialogFragment {
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r19) {
        /*
            r18 = this;
            r9 = r18
            android.os.Bundle r1 = r9.A0b()
            java.lang.String r0 = "url"
            java.lang.String r8 = r1.getString(r0)
            android.os.Bundle r1 = r9.A0b()
            java.lang.String r0 = "phishingChars"
            java.io.Serializable r10 = r1.getSerializable(r0)
            boolean r0 = r10 instanceof java.util.HashSet
            if (r0 == 0) goto L_0x006b
            java.util.AbstractCollection r10 = (java.util.AbstractCollection) r10
        L_0x001c:
            X.0xT r1 = r9.A05
            if (r1 == 0) goto L_0x017e
            java.lang.String r0 = "26000162"
            java.lang.String r0 = r1.A05(r0)
            X.AnonymousClass00C.A08(r0)
            android.content.Context r2 = r9.A0a()
            r1 = 2131894760(0x7f1221e8, float:1.9424334E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            android.text.Spanned r0 = X.AnonymousClass14B.A01(r2, r0, r1)
            android.text.SpannableStringBuilder r7 = X.C36441kJ.A0P(r0)
            int r1 = r7.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r12 = 0
            java.lang.Object[] r11 = r7.getSpans(r12, r1, r0)
            android.text.style.URLSpan[] r11 = (android.text.style.URLSpan[]) r11
            if (r11 == 0) goto L_0x0088
            int r6 = r11.length
            r5 = 0
        L_0x004d:
            if (r5 >= r6) goto L_0x007e
            r4 = r11[r5]
            android.content.Context r3 = r9.A0a()
            X.17Y r2 = r9.A00
            if (r2 == 0) goto L_0x0079
            X.0yb r1 = r9.A02
            if (r1 == 0) goto L_0x0074
            X.1e2 r0 = r9.A01
            if (r0 == 0) goto L_0x006d
            X.21s r0 = X.C429721s.A00(r3, r4, r0, r2, r1)
            X.C36351kA.A18(r7, r4, r0)
            int r5 = r5 + 1
            goto L_0x004d
        L_0x006b:
            r10 = 0
            goto L_0x001c
        L_0x006d:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0074:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0079:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x007e:
            if (r12 >= r6) goto L_0x0088
            r0 = r11[r12]
            r7.removeSpan(r0)
            int r12 = r12 + 1
            goto L_0x007e
        L_0x0088:
            java.lang.String r0 = "\n\n"
            r7.append(r0)
            if (r8 == 0) goto L_0x0159
            int r3 = r8.length()
            if (r3 == 0) goto L_0x0159
            if (r10 == 0) goto L_0x0159
            android.content.Context r1 = r9.A0a()
            r0 = 2131102357(0x7f060a95, float:1.781715E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            r11.<init>(r0)
            r2 = r8
            r0 = 0
            int r1 = r8.codePointCount(r0, r3)
            r0 = 96
            if (r1 <= r0) goto L_0x00c2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.AnonymousClass14B.A0C(r8, r0)
            r1.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r2 = X.AnonymousClass000.A0t(r1, r0)
        L_0x00c2:
            android.text.SpannableString r6 = X.C36441kJ.A0O(r2)
            android.net.Uri r0 = android.net.Uri.parse(r8)
            if (r0 == 0) goto L_0x0150
            java.lang.String r2 = r0.getHost()
            if (r2 == 0) goto L_0x0150
            java.lang.String r1 = "\\."
            X.0fN r0 = new X.0fN
            r0.<init>((java.lang.String) r1)
            r5 = 0
            java.util.List r2 = r0.A01(r2, r5)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x014d
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x00ec:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x014d
            int r0 = X.C36411kG.A0A(r1)
            if (r0 == 0) goto L_0x00ec
            java.util.List r0 = X.C36411kG.A14(r2, r1)
        L_0x00fc:
            java.lang.String[] r4 = X.C36431kI.A1b(r0)
            if (r4 == 0) goto L_0x0150
            int r0 = r4.length
            r17 = r0
            r12 = 0
            r13 = -1
        L_0x0107:
            r0 = r17
            if (r12 >= r0) goto L_0x0150
            r14 = r4[r12]
            r2 = 0
            r15 = -1
            r3 = 0
        L_0x0110:
            int r1 = r14.length()
            if (r3 >= r1) goto L_0x013c
            int r1 = r14.codePointAt(r3)
            int r16 = java.lang.Character.charCount(r1)
            boolean r0 = X.C36381kD.A1Z(r10, r1)
            if (r0 == 0) goto L_0x0139
            char r1 = (char) r1
            int r0 = r15 + 1
            int r15 = X.AnonymousClass099.A09(r8, r1, r0, r5)
            r0 = 1
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r0)
            int r1 = r15 + r16
            r0 = 33
            r6.setSpan(r2, r15, r1, r0)
            r2 = 1
        L_0x0139:
            int r3 = r3 + r16
            goto L_0x0110
        L_0x013c:
            if (r2 == 0) goto L_0x014a
            int r0 = r13 + 1
            int r13 = X.AnonymousClass099.A0C(r8, r14, r0, r5)
            int r1 = r1 + r13
            r0 = 33
            r6.setSpan(r11, r13, r1, r0)
        L_0x014a:
            int r12 = r12 + 1
            goto L_0x0107
        L_0x014d:
            X.09w r0 = X.C023409w.A00
            goto L_0x00fc
        L_0x0150:
            X.0ts r0 = r9.A01
            android.text.SpannableStringBuilder r0 = r0.A04(r6)
            r7.append(r0)
        L_0x0159:
            r4 = 2131894764(0x7f1221ec, float:1.9424342E38)
            r3 = 2131894763(0x7f1221eb, float:1.942434E38)
            X.1qm r2 = X.AnonymousClass3LW.A05(r9)
            r0 = 2131894761(0x7f1221e9, float:1.9424336E38)
            r2.A0d(r0)
            X.C39001qm.A09(r2, r7)
            r1 = 1
            X.4Xf r0 = new X.4Xf
            r0.<init>(r1, r8, r9)
            r2.A0f(r0, r3)
            r0 = 7
            X.C39001qm.A0I(r2, r9, r0, r4)
            X.0FM r0 = X.C36371kC.A0O(r2)
            return r0
        L_0x017e:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SuspiciousLinkWarningDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }

    public void A1M() {
        super.A1M();
        TextView textView = (TextView) A1Z().findViewById(16908299);
        if (textView != null) {
            C36331k8.A10(textView, this.A02);
            C36331k8.A0r(A0i(), textView, C224514j.A00(A0h(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
    }
}
