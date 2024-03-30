package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6Y4  reason: invalid class name */
public abstract class AnonymousClass6Y4 {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass17Y r9, X.C35021i1 r10, X.AnonymousClass005 r11, java.util.List r12) {
        /*
            r7 = 0
            X.AnonymousClass00C.A0D(r12, r7)
            java.lang.Object r4 = r11.get()
            X.6Tl r4 = (X.C132396Tl) r4
            java.lang.String r0 = "("
            java.lang.StringBuilder r3 = X.C90524aI.A0i(r0)
            int r2 = r12.size()
            r1 = 0
        L_0x0015:
            if (r1 >= r2) goto L_0x0026
            if (r1 <= 0) goto L_0x001e
            java.lang.String r0 = ","
            r3.append(r0)
        L_0x001e:
            java.lang.String r0 = "?"
            r3.append(r0)
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0026:
            java.lang.String r8 = X.C90474aD.A0f(r3)
            X.AnonymousClass00C.A08(r8)
            X.1i6 r0 = r4.A01
            X.C35071i6.A00(r0)
            X.C35071i6.A00(r0)
            X.00i r3 = r0.A00
            monitor-enter(r3)
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x008f }
        L_0x003c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x004a
            long r0 = X.C36391kE.A0D(r2)     // Catch:{ all -> 0x008f }
            r3.A08(r0)     // Catch:{ all -> 0x008f }
            goto L_0x003c
        L_0x004a:
            monitor-exit(r3)
            X.12P r0 = r4.A00
            X.1M0 r6 = r0.A05()
            X.14e r5 = r6.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = "status_crossposting"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "status_message_row_id IN "
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r8, r1)     // Catch:{ all -> 0x0088 }
            java.util.ArrayList r2 = X.C36321k7.A0J(r12)     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x0088 }
        L_0x0067:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0071
            X.C90464aC.A1V(r2, r1)     // Catch:{ all -> 0x0088 }
            goto L_0x0067
        L_0x0071:
            java.lang.String[] r1 = X.C36371kC.A1b(r2, r7)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/DELETE_RECORDS_BY_MESSAGE_ROW_IDS"
            r5.A03(r4, r3, r0, r1)     // Catch:{ all -> 0x0088 }
            r6.close()
            r1 = 11
            X.72x r0 = new X.72x
            r0.<init>(r12, r10, r1)
            r9.A0H(r0)
            return
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x008f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y4.A05(X.17Y, X.1i1, X.005, java.util.List):void");
    }

    public static final void A06(AnonymousClass17Y r2, C35021i1 r3, AnonymousClass005 r4, List list, int i) {
        AnonymousClass00C.A0D(list, 0);
        ((C132396Tl) r4.get()).A06(list, i);
        r2.A0H(new C1498272x(list, r3, 12));
    }

    public static final boolean A07(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C64933Qa r1 = r2.A1J;
        if (!(r1.A00 instanceof C177528dw) || !r1.A02) {
            return false;
        }
        if ((r2 instanceof AnonymousClass2bV) || (r2 instanceof C181798o3) || (r2 instanceof C46882bp) || (r2 instanceof C181788o2) || (r2 instanceof C46812bi)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C36391kE.A0l(it).A0H <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final String A03(Integer num) {
        if (num == null) {
            return "other";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "auto_xpost_status_share_view";
        }
        if (intValue == 2) {
            return "auto_xpost_audience_selector_view";
        }
        if (intValue == 3) {
            return "contextual_share_icon";
        }
        if (intValue == 4) {
            return "contextual_share_upsell_banner_setup_link";
        }
        if (intValue == 5) {
            return "status_list_single_status_share_to_fb_menu";
        }
        if (intValue == 6) {
            return "status_list_single_status_long_press_share_to_fb_menu";
        }
        if (intValue == 7) {
            return "status_list_multiple_statuses_share_to_fb_menu";
        }
        if (intValue == 8) {
            return "status_detail_share_to_fb_menu";
        }
        if (intValue == 9) {
            return "auto_xpost_retry";
        }
        if (intValue == 10) {
            return "xpost_retry";
        }
        return "other";
    }

    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder A0P;
        C36321k7.A0w(context, charSequence);
        SpannableStringBuilder A0P2 = C36441kJ.A0P(context.getString(R.string.f12nameremoved));
        A04(A0P2, charSequence, "%1$s");
        Drawable A00 = AnonymousClass00E.A00(context, R.drawable.ic_settings_fb);
        if (A00 == null) {
            A0P = new SpannableStringBuilder();
        } else {
            A0P = C36441kJ.A0P(" ");
            int A02 = C36361kB.A02(context, i);
            A00.setBounds(0, 0, A02, A02);
            C90484aE.A15(context.getResources(), A00, i2);
            A0P.setSpan(new C37341mD(A00), 0, 1, 33);
        }
        A04(A0P2, A0P, "%2$s");
        return A0P2;
    }

    public static final C134876bk A01(AnonymousClass1UJ r3, String str) {
        C36321k7.A0w(str, r3);
        return new C134876bk(new C135086c7(C146356vT.A00(), String.class, r3.A01(str), "XfamilyStatusUniqueId"), 2);
    }

    public static final String A02() {
        String A0V = C90464aC.A0V();
        StringBuilder A0u = AnonymousClass000.A0u();
        int length = A0V.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = A0V.charAt(i2);
            A0u.append(charAt);
            if (charAt == '-' && (i = i + 1) == 2) {
                A0u.append("waffle-");
            }
        }
        return C36381kD.A0y(A0u);
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), charSequence);
        }
    }

    public static final boolean A09(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        for (Object obj : collection) {
            if (obj instanceof C46812bi) {
                return true;
            }
        }
        return false;
    }
}
