package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Sj  reason: invalid class name and case insensitive filesystem */
public final class C28371Sj {
    public static final Pattern A0A = Pattern.compile("(@\\d+(?:(?:-\\d+)?@g\\.us)?)");
    public static final boolean A0B = Character.isDefined(8296);
    public static final boolean A0C = Character.isDefined(8297);
    public final C19730wQ A00;
    public final C20230xE A01;
    public final AnonymousClass1Sk A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C19630wG A05;
    public final C220412q A06;
    public final AnonymousClass17X A07;
    public final AnonymousClass005 A08;
    public final AnonymousClass1LV A09;

    public CharSequence A01(Context context, AnonymousClass3T1 r8, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        List list = r8.A0w;
        if (list == null || list.isEmpty()) {
            return charSequence2;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        A04(context, valueOf, r8.A1J.A00, list, false);
        return valueOf;
    }

    public AnonymousClass34G A00(AnonymousClass141 r5, GroupJid groupJid) {
        String str;
        AnonymousClass171 r3 = this.A04;
        AnonymousClass34G A0E = r3.A0E(r5, r3.A07(r5, groupJid), false, true);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (A0B) {
            str = "⁨";
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(A0E.A01);
        if (A0C) {
            str2 = "⁩";
        }
        sb.append(str2);
        return new AnonymousClass34G(A0E.A00, sb.toString());
    }

    public String A02(C80163ux r9) {
        String str;
        String A032;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (A0B) {
            str = "⁨";
        } else {
            str = str2;
        }
        sb.append(str);
        AnonymousClass11F r1 = r9.A00;
        if (!(r1 instanceof GroupJid) || (A032 = r9.A01) == null) {
            AnonymousClass16D r0 = this.A03;
            AnonymousClass141 A092 = r0.A09(r1);
            if (A092 == null) {
                A092 = r0.A0D(r1);
            }
            if (A092.A0G()) {
                A032 = this.A04.A0H(A092);
                if (A032 == null) {
                    A032 = this.A05.A01(R.string.f12nameremoved);
                }
            } else if (A092.A0N()) {
                A032 = this.A04.A0S(A092, false);
            } else if (!TextUtils.isEmpty(A092.A0J())) {
                A032 = A092.A0J();
            } else if (TextUtils.isEmpty(A092.A0a)) {
                A032 = AnonymousClass3U8.A03(A092);
            } else if (!this.A00.A0M(A092.A0H)) {
                A032 = this.A05.A02(R.string.f12nameremoved, A092.A0a);
            } else {
                A032 = A092.A0a;
            }
        }
        sb.append(A032);
        if (A0C) {
            str2 = "⁩";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A03(com.whatsapp.jid.GroupJid r12) {
        /*
            r11 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.1LV r2 = r11.A09
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r1 = X.C65533Sl.A03(r12)
            if (r1 == 0) goto L_0x0076
            X.17d r0 = r2.A08
            r0.A03()
            java.util.Map r0 = r0.A02
            java.lang.Object r8 = r0.get(r1)
            X.147 r8 = (X.AnonymousClass147) r8
            if (r8 == 0) goto L_0x0076
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
            X.1Lr r10 = r2.A09
            X.17d r9 = r10.A01
            r1 = 4
            X.3Tw r0 = new X.3Tw
            r0.<init>(r10, r1)
            java.util.HashSet r0 = r9.A01(r0, r8)
            java.util.Iterator r2 = r0.iterator()
        L_0x003b:
            boolean r0 = r2.hasNext()
            r3 = 3
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r2.next()
            X.3QK r1 = (X.AnonymousClass3QK) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x004e
            r5 = r1
            goto L_0x003b
        L_0x004e:
            r7.add(r1)
            goto L_0x003b
        L_0x0052:
            r1 = 5
            X.3Tw r0 = new X.3Tw
            r0.<init>(r10, r1)
            java.util.HashSet r0 = r9.A01(r0, r8)
            java.util.Iterator r2 = r0.iterator()
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r2.next()
            X.3QK r1 = (X.AnonymousClass3QK) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0072
            r5 = r1
            goto L_0x0060
        L_0x0072:
            r6.add(r1)
            goto L_0x0060
        L_0x0076:
            r1 = 0
            X.09w r0 = X.C023409w.A00
            X.3Q8 r9 = new X.3Q8
            r9.<init>(r1, r1, r0, r0)
            goto L_0x0084
        L_0x007f:
            X.3Q8 r9 = new X.3Q8
            r9.<init>(r5, r8, r7, r6)
        L_0x0084:
            X.3QK r1 = r9.A00
            if (r1 == 0) goto L_0x009a
            com.whatsapp.jid.GroupJid r2 = r1.A02
            boolean r0 = X.C1901797e.A00(r12, r2)
            if (r0 != 0) goto L_0x009a
            java.lang.String r1 = r1.A04
            X.3ux r0 = new X.3ux
            r0.<init>(r2, r1)
            r4.add(r0)
        L_0x009a:
            java.util.List r0 = r9.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x00a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r1 = r3.next()
            X.3QK r1 = (X.AnonymousClass3QK) r1
            com.whatsapp.jid.GroupJid r2 = r1.A02
            boolean r0 = X.C1901797e.A00(r12, r2)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r1 = r1.A04
            X.3ux r0 = new X.3ux
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00a0
        L_0x00bf:
            java.util.List r0 = r9.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x00c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r1 = r3.next()
            X.3QK r1 = (X.AnonymousClass3QK) r1
            com.whatsapp.jid.GroupJid r2 = r1.A02
            boolean r0 = X.C1901797e.A00(r12, r2)
            if (r0 != 0) goto L_0x00c5
            java.lang.String r1 = r1.A04
            X.3ux r0 = new X.3ux
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00c5
        L_0x00e4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28371Sj.A03(com.whatsapp.jid.GroupJid):java.util.ArrayList");
    }

    public void A05(SpannableStringBuilder spannableStringBuilder, AnonymousClass4RA r12, List list) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableStringBuilder)) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C80163ux r3 = (C80163ux) it.next();
                if (r3 != null) {
                    hashMap.put(C65713Te.A00(r3), new AnonymousClass00I(r3, (Object) null));
                }
            }
            Matcher matcher = A0A.matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find()) {
                String group = matcher.group();
                AnonymousClass00I r6 = (AnonymousClass00I) hashMap.get(group);
                if (r6 != null) {
                    if (r6.A01 == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("@");
                        C80163ux r1 = (C80163ux) r6.A00;
                        sb.append(A02(r1));
                        r6 = new AnonymousClass00I(r1, sb.toString());
                        hashMap.put(group, r6);
                    }
                    Object obj = r6.A00;
                    if (obj == null) {
                        C18740tg.A0D(false, "Mentions/null mention after map population");
                    } else {
                        int start = matcher.start() + i;
                        String str = (String) r6.A01;
                        int length = group.length();
                        spannableStringBuilder.replace(start, length + start, str);
                        int length2 = str.length();
                        i += length2 - length;
                        if (r12 != null) {
                            r12.Bek(spannableStringBuilder, (C80163ux) obj, start, length2 + start);
                        }
                    }
                }
            }
        }
    }

    public C28371Sj(C19730wQ r1, AnonymousClass1LV r2, C20230xE r3, AnonymousClass1Sk r4, AnonymousClass16D r5, AnonymousClass171 r6, C19630wG r7, C220412q r8, AnonymousClass17X r9, AnonymousClass005 r10) {
        this.A00 = r1;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A08 = r10;
        this.A09 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A07 = r9;
    }

    public void A04(Context context, SpannableStringBuilder spannableStringBuilder, AnonymousClass11F r10, List list, boolean z) {
        C75763nl r1;
        Context context2 = context;
        int A002 = C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        if (z) {
            r1 = new C75763nl(context2, r10, this, A002, false);
        } else {
            r1 = null;
        }
        A05(spannableStringBuilder, r1, list);
    }
}
