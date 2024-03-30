package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8pU  reason: invalid class name and case insensitive filesystem */
public abstract class C182688pU extends C182698pV {
    public AnonymousClass00I A00;
    public TextEmojiLabel A01;
    public C200229gu A02;
    public AnonymousClass2LE A03;
    public CharSequence A04;
    public C175308aB A05;
    public final int A06;
    public final C33301f4 A07;
    public final int A08;

    public abstract CharSequence A06(AnonymousClass141 r1, AnonymousClass3T1 r2);

    public static void A03(AnonymousClass3T1 r3, C182688pU r4, List list) {
        AnonymousClass00I r2 = r4.A00;
        if (r2 != null && Boolean.TRUE.equals(r2.A00) && r4.A04 != null) {
            CharSequence A042 = AnonymousClass3TZ.A04(C65783Tl.A02(r4.getContext(), r4.A06, r4.A06((AnonymousClass141) r2.A01, r3), list), r4.A04);
            r4.A01.setPlaceholder(0);
            if (TextUtils.isEmpty(A042)) {
                r4.A01.setVisibility(8);
                return;
            }
            r4.A01.setVisibility(0);
            r4.A01.A0I(A042);
        }
    }

    private void setTitleColorBasedOnQuery(List list) {
        C200229gu r0;
        int i;
        if (list == null || list.isEmpty()) {
            r0 = this.A02;
            i = this.A08;
        } else {
            r0 = this.A02;
            i = this.A06;
        }
        r0.A03.A00.setTextColor(i);
    }

    public CharSequence A07(AnonymousClass3T1 r11, List list) {
        String str;
        String str2;
        if (this instanceof C182588pK) {
            C182588pK r2 = (C182588pK) this;
            AnonymousClass2bV r112 = (AnonymousClass2bV) r11;
            if (r2 instanceof C182678pT) {
                C182678pT r22 = (C182678pT) r2;
                C20810yC r1 = r22.A08;
                AnonymousClass1DU r6 = r22.A01;
                if (r112.A1Y() == null) {
                    str2 = "";
                } else {
                    str2 = r112.A1Y();
                }
                if (list != null && !"".equals(str2)) {
                    String str3 = C65243Rh.A00(r1, r6, r112).A03;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!str3.isEmpty() && str2.contains(str3)) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (str3.contains(AnonymousClass001.A0C(it))) {
                                int indexOf = str2.indexOf(str3);
                                if (indexOf == 0 || indexOf == str2.length() - str3.length()) {
                                    String str4 = r112.A05;
                                    String str5 = r112.A04;
                                    String A002 = C63783Lk.A00(r6, str3);
                                    String[] strArr = new String[3];
                                    strArr[0] = str4;
                                    C36411kG.A1Q(str5, A002, strArr, 1);
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        int i = 0;
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String A0C = AnonymousClass001.A0C(it2);
                                        while (true) {
                                            String str6 = strArr[i];
                                            if (str6 != null && str6.contains(A0C)) {
                                                return str2.replace(str3, "");
                                            }
                                            i++;
                                            if (i >= 3) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                str2 = "";
                if (C61583Cq.A00(r112) != null) {
                    String str7 = C61583Cq.A00(r112).A00;
                    if (!TextUtils.isEmpty(str7)) {
                        str2 = str7;
                    }
                    if (!TextUtils.isEmpty(r112.A0b())) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("*");
                        A0u.append(r112.A0b());
                        return AnonymousClass000.A0p("*\n\n", str2, A0u);
                    }
                } else if (r112.A1Y() != null) {
                    return r112.A1Y();
                }
            }
            return str2;
        }
        if (!(this instanceof C182618pN) && !(this instanceof C182638pP)) {
            if (this instanceof C182628pO) {
                C182628pO r23 = (C182628pO) this;
                AnonymousClass2bU r113 = (AnonymousClass2bU) r11;
                String A012 = C202359le.A01(r113);
                if (!TextUtils.isEmpty(A012) || ((A012 = r113.A1a()) != null && !C202359le.A04(r113))) {
                    return A012;
                }
                return r23.getDefaultMessageText();
            } else if (((C182608pM) this) instanceof C182568pI) {
                AnonymousClass2bL r114 = (AnonymousClass2bL) r11;
                if (!(r114 instanceof C46902br) || (str = ((C46902br) r114).A03) == null) {
                    return "";
                }
                return str;
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass3T1 r12, java.util.List r13) {
        /*
            r11 = this;
            X.8aB r0 = r11.A05
            X.C36351kA.A1H(r0)
            X.2LE r0 = r11.A03
            X.C36351kA.A1H(r0)
            r8 = r13
            r11.setTitleColorBasedOnQuery(r13)
            X.16D r1 = r11.A02
            X.3Qa r0 = r12.A1J
            X.11F r0 = r0.A00
            X.C18740tg.A06(r0)
            X.141 r3 = r1.A07(r0)
            r2 = 0
            if (r3 == 0) goto L_0x002e
            X.0wQ r0 = r11.A01
            X.11F r1 = X.AnonymousClass3TZ.A01(r0, r3, r12)
            if (r1 == 0) goto L_0x0095
            X.16D r0 = r11.A02
            X.141 r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x0096
        L_0x002e:
            X.9gu r0 = r11.A02
            r0.A05()
            java.lang.Boolean r1 = X.C36381kD.A0j()
            X.00I r0 = new X.00I
            r0.<init>(r1, r2)
            r11.A00 = r0
            X.0wQ r1 = r11.A01
            X.16D r0 = r11.A02
            X.8aB r3 = new X.8aB
            r3.<init>(r1, r0, r12)
            r11.A05 = r3
            X.1f4 r2 = r11.A07
            r1 = 0
            X.B8f r0 = new X.B8f
            r0.<init>(r12, r11, r13, r1)
            r2.A00(r0, r3)
            java.lang.CharSequence r7 = r11.A07(r12, r13)
        L_0x0058:
            android.content.Context r1 = r11.getContext()
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.text.TextPaint r2 = r0.getPaint()
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r10 = r0.getMeasuredWidth()
            X.1H2 r5 = r11.A07
            X.0yb r3 = r11.A04
            X.0ts r4 = r11.A06
            X.0wg r6 = r11.A09
            r9 = 3
            X.2LE r0 = new X.2LE
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A03 = r0
            r0 = 1
            X.B8f r2 = new X.B8f
            r2.<init>(r12, r11, r13, r0)
            int r1 = r7.length()
            r0 = 768(0x300, float:1.076E-42)
            if (r1 > r0) goto L_0x00a6
            boolean r0 = X.AnonymousClass3TC.A02(r7)
            if (r0 != 0) goto L_0x00a6
            X.2LE r0 = r11.A03
            goto L_0x009e
        L_0x0095:
            r0 = r2
        L_0x0096:
            java.lang.CharSequence r7 = r11.A07(r12, r13)
            r11.A08(r3, r0, r12, r13)
            goto L_0x0058
        L_0x009e:
            java.lang.Object r0 = r0.call()     // Catch:{ 02S -> 0x00b4 }
            r2.BU2(r0)     // Catch:{ 02S -> 0x00b4 }
            return
        L_0x00a6:
            com.whatsapp.TextEmojiLabel r1 = r11.A01
            r0 = 80
            r1.setPlaceholder(r0)
            X.1f4 r1 = r11.A07
            X.2LE r0 = r11.A03
            r1.A00(r2, r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C182688pU.A09(X.3T1, java.util.List):void");
    }

    public Paint getMessageViewPaint() {
        return this.A01.getPaint();
    }

    public C182688pU(Context context, C33301f4 r4) {
        super(context);
        this.A07 = r4;
        this.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A08 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        if (!(this instanceof C182568pI) && !(this instanceof C182578pJ)) {
            A05();
        }
    }

    public void A08(AnonymousClass141 r6, AnonymousClass141 r7, AnonymousClass3T1 r8, List list) {
        C200229gu r0;
        int i;
        this.A00 = new AnonymousClass00I(C36371kC.A0m(), r7);
        this.A02.A06(r6, C65783Tl.A01, list);
        this.A02.A04.A0B(r6);
        setTitleColorBasedOnQuery(list);
        if (this instanceof C182628pO) {
            r0 = this.A02;
            i = 8;
        } else {
            AnonymousClass00I r02 = new AnonymousClass00I(AnonymousClass3UY.A0F(this.A06, this.A05.A08(r8.A0I), false), AnonymousClass3UY.A0F(this.A06, this.A05.A08(r8.A0I), true));
            this.A02.A09((CharSequence) r02.A00, (CharSequence) r02.A01);
            r0 = this.A02;
            i = 0;
        }
        r0.A03.A01.setVisibility(i);
        A03(r8, this, list);
    }
}
