package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Tl  reason: invalid class name and case insensitive filesystem */
public abstract class C65783Tl {
    public static final C65783Tl A00 = new AnonymousClass4WN(1);
    public static final C65783Tl A01 = new AnonymousClass4WN(2);
    public static final C65783Tl A02 = new AnonymousClass4WN(3);
    public static final C65783Tl A03 = new AnonymousClass4WN(0);
    public static final Map A04 = new ConcurrentHashMap();

    public void A04(Context context, Spannable spannable, int i, int i2) {
        int i3;
        int i4;
        int i5;
        switch (((AnonymousClass4WN) this).A00) {
            case 0:
                spannable.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(context, R.color.f6nameremoved)), i, i2, 33);
                return;
            case 1:
                i3 = 33;
                spannable.setSpan(new BackgroundColorSpan(C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved)), i, i2, 33);
                i4 = R.attr.f4nameremoved;
                i5 = R.color.f6nameremoved;
                break;
            case 2:
                i3 = 33;
                spannable.setSpan(new C37401mJ(), i, i2, 33);
                i4 = R.attr.f4nameremoved;
                i5 = R.color.f6nameremoved;
                break;
            default:
                return;
        }
        spannable.setSpan(new ForegroundColorSpan(C36351kA.A01(context, i4, i5)), i, i2, i3);
    }

    public static CharSequence A01(Context context, C18820ts r7, CharSequence charSequence, List list) {
        C598835q A002 = A00(context, r7, A00, charSequence, list, false);
        if (A002 != null) {
            return (CharSequence) A002.A00;
        }
        return null;
    }

    public static CharSequence A02(Context context, C18820ts r7, CharSequence charSequence, List list) {
        return (CharSequence) A00(context, r7, A01, charSequence, list, true).A00;
    }

    public static CharSequence A03(Context context, C18820ts r7, CharSequence charSequence, List list) {
        C598835q A002 = A00(context, r7, A03, charSequence, list, false);
        if (A002 != null) {
            return (CharSequence) A002.A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r0 != 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r8 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r8 = android.text.SpannableString.valueOf(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e9, code lost:
        r14.A04(r21, r8, r10, r9);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
        if (r8 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c2, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C598835q A00(android.content.Context r21, X.C18820ts r22, X.C65783Tl r23, java.lang.CharSequence r24, java.util.List r25, boolean r26) {
        /*
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            r20 = r24
            if (r24 == 0) goto L_0x013b
            r13 = r25
            if (r25 == 0) goto L_0x0133
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0133
            java.util.regex.Pattern r1 = X.C202859mm.A01
            r0 = r20
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = " "
            java.lang.String r11 = r1.replaceAll(r0)
            java.text.BreakIterator r19 = X.C202859mm.A02(r22)
            r0 = r19
            r0.setText(r11)
            int r10 = r19.first()
            int r9 = r19.next()
            r1 = -1
            r8 = 0
            r5 = 0
            r7 = -1
            r6 = 0
        L_0x0036:
            if (r9 == r1) goto L_0x0131
            java.lang.String r18 = r11.substring(r10, r9)
            r17 = 1
            if (r5 != 0) goto L_0x0084
            java.util.Locale r2 = X.C36401kF.A0x(r22)
            java.util.Map r1 = A04
            java.lang.Object r0 = r1.get(r2)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L_0x0056
            X.3yP r0 = new X.3yP
            r0.<init>(r2)
            r1.put(r2, r0)
        L_0x0056:
            java.lang.Object r5 = r0.get()
            X.C18740tg.A06(r5)
            java.text.Collator r5 = (java.text.Collator) r5
            int r0 = r13.size()
            java.text.CollationKey[] r6 = new java.text.CollationKey[r0]
            int r2 = X.C36431kI.A07(r13)
        L_0x0069:
            if (r2 < 0) goto L_0x0084
            java.lang.String r1 = X.C36401kF.A0s(r13, r2)
            java.lang.String r0 = X.C36401kF.A0s(r13, r2)
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            r6[r2] = r0
            int r0 = r1.length()
            int r7 = java.lang.Math.max(r7, r0)
            int r2 = r2 + -1
            goto L_0x0069
        L_0x0084:
            X.3Tl r0 = A01
            r4 = 0
            r14 = r23
            if (r14 == r0) goto L_0x00c9
            X.3Tl r0 = A00
            if (r14 == r0) goto L_0x00c9
            int r0 = r18.length()
            int r16 = java.lang.Math.min(r0, r7)
            r3 = 1
            r17 = 0
        L_0x009a:
            r0 = r16
            if (r3 > r0) goto L_0x00ee
            r0 = r18
            java.lang.String r0 = r0.substring(r4, r3)
            java.text.CollationKey r15 = r5.getCollationKey(r0)
            int r2 = r6.length
        L_0x00a9:
            if (r4 >= r2) goto L_0x00c5
            r0 = r6[r4]
            int r0 = r15.compareTo(r0)
            if (r0 != 0) goto L_0x00c2
            if (r8 != 0) goto L_0x00b9
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r20)
        L_0x00b9:
            int r1 = r10 + r3
            r0 = r21
            r14.A04(r0, r8, r10, r1)
            r17 = 1
        L_0x00c2:
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00c5:
            int r3 = r3 + 1
            r4 = 0
            goto L_0x009a
        L_0x00c9:
            java.lang.String r3 = X.AnonymousClass14B.A06(r18)
        L_0x00cd:
            int r0 = r6.length
            int r1 = r0 + -1
            if (r4 >= r1) goto L_0x0109
            r1 = r6[r4]
            java.text.CollationKey r0 = r5.getCollationKey(r3)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0106
            r0 = 1
        L_0x00df:
            r17 = r0
            if (r0 == 0) goto L_0x00ee
        L_0x00e3:
            if (r8 != 0) goto L_0x00e9
            android.text.SpannableString r8 = android.text.SpannableString.valueOf(r20)
        L_0x00e9:
            r0 = r21
            r14.A04(r0, r8, r10, r9)
        L_0x00ee:
            if (r26 == 0) goto L_0x00fd
            if (r17 == 0) goto L_0x00fd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.C36341k9.A1H(r1, r0, r12)
        L_0x00fd:
            int r0 = r19.next()
            r10 = r9
            r1 = -1
            r9 = r0
            goto L_0x0036
        L_0x0106:
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x0109:
            r0 = 0
            r4 = r6[r1]
            int r2 = r3.length()
            java.lang.String r1 = r4.getSourceString()
            int r1 = r1.length()
            int r2 = java.lang.Math.min(r2, r1)
            r1 = 1
        L_0x011d:
            if (r1 > r2) goto L_0x00df
            java.lang.String r0 = r3.substring(r0, r1)
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            int r0 = r0.compareTo(r4)
            if (r0 == 0) goto L_0x00e3
            int r1 = r1 + 1
            r0 = 0
            goto L_0x011d
        L_0x0131:
            if (r8 != 0) goto L_0x0135
        L_0x0133:
            r8 = r20
        L_0x0135:
            X.35q r0 = new X.35q
            r0.<init>(r8, r12)
            return r0
        L_0x013b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65783Tl.A00(android.content.Context, X.0ts, X.3Tl, java.lang.CharSequence, java.util.List, boolean):X.35q");
    }
}
