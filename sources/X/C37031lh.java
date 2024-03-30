package X;

import android.os.CountDownTimer;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.1lh  reason: invalid class name and case insensitive filesystem */
public class C37031lh extends CountDownTimer {
    public final /* synthetic */ RegisterPhone A00;

    public void onTick(long j) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37031lh(RegisterPhone registerPhone) {
        super(200, 200);
        this.A00 = registerPhone;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r7 == -2) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017b, code lost:
        if (r2 == 30) goto L_0x015c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish() {
        /*
            r18 = this;
            r17 = r18
            r0 = r17
            com.whatsapp.registration.phonenumberentry.RegisterPhone r3 = r0.A00
            X.3AK r0 = r3.A0O
            android.widget.EditText r0 = r0.A02
            android.text.Editable r0 = r0.getText()
            java.lang.String r8 = X.C36331k8.A0h(r0)
            X.3AK r0 = r3.A0O
            android.widget.EditText r0 = r0.A03
            android.text.Editable r0 = r0.getText()
            java.lang.String r11 = X.C36331k8.A0h(r0)
            if (r8 == 0) goto L_0x00bf
            if (r11 == 0) goto L_0x00bf
            java.lang.String r10 = ""
            boolean r0 = r8.equals(r10)
            if (r0 != 0) goto L_0x00bf
            X.1N4 r1 = r3.A02
            java.lang.String r0 = r3.A0b
            java.lang.String r1 = X.C65983Uf.A0B(r1, r11, r8, r0)
            if (r1 == 0) goto L_0x00bf
            X.1N4 r0 = r3.A02
            java.lang.String r4 = X.C65983Uf.A0A(r0, r8, r1)
            int r2 = r4.length()
            int r0 = r1.length()
            if (r2 < r0) goto L_0x00bf
            r6 = 2131893413(0x7f121ca5, float:1.9421602E38)
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            X.0ts r0 = r3.A00
            java.lang.String r0 = r0.A0H(r4)
            r4 = 0
            java.lang.String r6 = X.C36391kE.A0v(r3, r0, r2, r4, r6)
            X.1N4 r0 = r3.A02
            java.lang.String r2 = X.AnonymousClass3U2.A02(r0, r8, r11)
            java.lang.String r0 = X.C36431kI.A1B(r8, r1)
            java.lang.String r9 = "\\D"
            java.lang.String r13 = r0.replaceAll(r9, r10)
            java.lang.String r16 = r2.replaceAll(r9, r10)
            int r12 = r16.length()
            int r0 = r13.length()
            int r14 = X.AnonymousClass000.A05(r12, r0)
            if (r14 != r5) goto L_0x0083
            if (r12 <= r0) goto L_0x0083
        L_0x0079:
            r7 = -1
        L_0x007a:
            boolean r0 = r3.A0e
            if (r0 == 0) goto L_0x00c3
            int r0 = r3.A01
            if (r0 != r7) goto L_0x00c3
            return
        L_0x0083:
            r2 = 0
            r7 = 0
        L_0x0085:
            if (r2 < r12) goto L_0x008a
            if (r14 != 0) goto L_0x00a8
            goto L_0x0079
        L_0x008a:
            char r15 = r6.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x00b5 }
            char r0 = r13.charAt(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x00b5 }
            if (r15 == r0) goto L_0x0097
            int r7 = r7 + 1
            goto L_0x008a
        L_0x0097:
            r0 = r16
            char r15 = r0.charAt(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x00b5 }
            char r0 = r13.charAt(r2)     // Catch:{ StringIndexOutOfBoundsException -> 0x00b5 }
            if (r15 != r0) goto L_0x00bc
            int r7 = r7 + 1
            int r2 = r2 + 1
            goto L_0x0085
        L_0x00a8:
            char r2 = r6.charAt(r7)     // Catch:{ StringIndexOutOfBoundsException -> 0x00b5 }
            char r0 = r13.charAt(r12)     // Catch:{ StringIndexOutOfBoundsException -> 0x00b5 }
            if (r2 == r0) goto L_0x00bc
            int r7 = r7 + 1
            goto L_0x00a8
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "RegistrationUtils/getIndexOfDifference/skip"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00bf
        L_0x00bc:
            r0 = -2
            if (r7 != r0) goto L_0x007a
        L_0x00bf:
            r3.A3n()
            return
        L_0x00c3:
            r3.A01 = r7
            int r13 = r6.length()
            int r0 = r13 + -2
            if (r7 != r0) goto L_0x017e
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A0s = r5
        L_0x00cf:
            android.widget.ScrollView r2 = r3.A09
            android.widget.TextView r0 = r3.A0A
            int r0 = r0.getBottom()
            r2.scrollTo(r4, r0)
            android.text.SpannableString r6 = X.C36441kJ.A0O(r6)
            X.1m4 r2 = new X.1m4
            r0 = r17
            r2.<init>(r0, r8, r1)
            r12 = 17
            r6.setSpan(r2, r4, r13, r12)
            android.widget.TextView r0 = r3.A0A
            X.C36391kE.A1J(r0)
            r0 = -1
            if (r7 == r0) goto L_0x00fe
            r0 = -65536(0xffffffffffff0000, float:NaN)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            int r0 = r7 + 1
            r6.setSpan(r2, r7, r0, r12)
        L_0x00fe:
            java.lang.String r0 = r6.toString()
            java.lang.String r7 = r0.replaceAll(r9, r10)
            java.lang.String r9 = r11.replaceAll(r9, r10)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterPhone/suggested/cc/"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " pn="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " suggest="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " s="
            r2.append(r0)
            java.lang.String r0 = r3.A0b
            r2.append(r0)
            java.lang.String r0 = " disp="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " same="
            r2.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)
            X.1N4 r0 = r3.A02
            java.lang.String r0 = X.AnonymousClass3U2.A02(r0, r8, r9)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            boolean r0 = r7.equals(r0)
            X.C36331k8.A1S(r2, r0)
            r3.A0g = r5
            int r2 = r3.A00
            r1 = 31
            if (r2 != r1) goto L_0x0179
            r1 = 32
        L_0x015c:
            r3.A00 = r1
        L_0x015e:
            android.widget.TextView r0 = r3.A0A
            X.C36431kI.A1M(r0, r6)
            android.view.animation.AlphaAnimation r2 = X.C36351kA.A0D()
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            android.widget.TextView r0 = r3.A0A
            r0.startAnimation(r2)
            android.widget.TextView r0 = r3.A0A
            r0.setVisibility(r4)
            r3.A0e = r5
            return
        L_0x0179:
            r0 = 30
            if (r2 != r0) goto L_0x015e
            goto L_0x015c
        L_0x017e:
            com.whatsapp.registration.phonenumberentry.RegisterPhone.A0t = r5
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37031lh.onFinish():void");
    }
}
