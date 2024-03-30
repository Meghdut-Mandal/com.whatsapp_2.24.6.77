package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9nI  reason: invalid class name and case insensitive filesystem */
public class C203099nI {
    public final C20810yC A00;
    public final C19700wN A01;
    public final C195329Tv A02;
    public final C195739Vt A03;
    public final C198499df A04;
    public final C196049Xl A05;

    public static AnonymousClass8SE A01(AnonymousClass8SL r2) {
        Object obj;
        if (r2.formatCase_ == 1) {
            AnonymousClass8SM A0u = r2.A0u();
            if (A0u.titleCase_ == 4) {
                obj = A0u.title_;
            }
            return AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        AnonymousClass8SO A0N = C170918Hz.A0N(r2);
        if (A0N.titleCase_ == 4) {
            obj = A0N.title_;
        }
        return AnonymousClass8SE.DEFAULT_INSTANCE;
        return (AnonymousClass8SE) obj;
    }

    public static boolean A04(AnonymousClass8SL r3) {
        Integer A0R;
        if (AnonymousClass000.A1O(r3.formatCase_)) {
            A0R = C170918Hz.A0R(r3.A0u().titleCase_);
        } else {
            A0R = C170918Hz.A0R(C170918Hz.A0N(r3).titleCase_);
        }
        if (A0R != C023109s.A0G) {
            return false;
        }
        return true;
    }

    public C203099nI(C19700wN r1, C20810yC r2, C195329Tv r3, C195739Vt r4, C198499df r5, C196049Xl r6) {
        this.A00 = r2;
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static AnonymousClass8SV A00(AnonymousClass8SX r3) {
        if (r3.A10()) {
            AnonymousClass8SL r0 = r3.templateMessage_;
            AnonymousClass8SL r2 = r0;
            if (r0 == null) {
                r0 = AnonymousClass8SL.DEFAULT_INSTANCE;
            }
            if (r0.formatCase_ == 5) {
                if (r2 == null) {
                    r2 = AnonymousClass8SL.DEFAULT_INSTANCE;
                }
                if (r2.formatCase_ == 5) {
                    return (AnonymousClass8SV) r2.format_;
                }
                return AnonymousClass8SV.DEFAULT_INSTANCE;
            }
        }
        AnonymousClass8SV r02 = r3.interactiveMessage_;
        if (r02 != null) {
            return r02;
        }
        return AnonymousClass8SV.DEFAULT_INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (r3 == 2) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        if (r3 == 2) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.C20810yC r10, X.AnonymousClass8SO r11) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r9 = 0
        L_0x0005:
            X.B6c r0 = r11.hydratedButtons_
            int r0 = r0.size()
            if (r9 >= r0) goto L_0x00dc
            X.B6c r0 = r11.hydratedButtons_
            java.lang.Object r2 = r0.get(r9)
            X.8SJ r2 = (X.AnonymousClass8SJ) r2
            int r3 = r2.hydratedButtonCase_
            r0 = 1
            if (r3 != r0) goto L_0x00be
            java.lang.Object r0 = r2.hydratedButton_
            X.8Ou r0 = (X.C172688Ou) r0
            java.lang.String r3 = r0.displayText_
        L_0x0020:
            r0 = 50
            java.lang.String r5 = X.AnonymousClass14B.A0D(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0089
            int r3 = r2.hydratedButtonCase_
            r0 = 1
            if (r3 != r0) goto L_0x009a
            java.lang.Object r0 = r2.hydratedButton_
            X.8Ou r0 = (X.C172688Ou) r0
            java.lang.String r6 = r0.id_
        L_0x0037:
            java.lang.String r7 = ""
            r0 = 1
            if (r3 != r0) goto L_0x0095
            r8 = 1
        L_0x003d:
            X.3P8 r4 = new X.3P8
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 5970(0x1752, float:8.366E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x0086
            r0 = 5970(0x1752, float:8.366E-42)
            boolean r0 = r10.A0E(r0)
            if (r0 == 0) goto L_0x0093
            int r3 = r2.hydratedButtonCase_
            r0 = 2
            if (r3 != r0) goto L_0x0093
            X.8Qe r0 = r2.A0u()
            int r0 = r0.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0093
            X.8Qe r0 = r2.A0u()
            int r0 = r0.webviewPresentation_
            X.915 r0 = X.AnonymousClass915.A00(r0)
            if (r0 != 0) goto L_0x006f
            X.915 r0 = X.AnonymousClass915.FULL
        L_0x006f:
            int r2 = r0.ordinal()
            r0 = 0
            if (r2 == r0) goto L_0x0090
            r0 = 1
            if (r2 == r0) goto L_0x008d
            r0 = 2
            if (r2 != r0) goto L_0x00d7
            java.lang.String r2 = "compact"
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0086
            r4.A03 = r2
        L_0x0086:
            r1.add(r4)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0005
        L_0x008d:
            java.lang.String r2 = "tall"
            goto L_0x007e
        L_0x0090:
            java.lang.String r2 = "full"
            goto L_0x007e
        L_0x0093:
            r2 = 0
            goto L_0x007e
        L_0x0095:
            r0 = 2
            r8 = 3
            if (r3 != r0) goto L_0x003d
            goto L_0x00a9
        L_0x009a:
            r0 = 2
            if (r3 != r0) goto L_0x00ab
            X.8Qe r0 = r2.A0u()
            java.lang.String r6 = r0.url_
        L_0x00a3:
            X.8Qe r0 = r2.A0u()
            java.lang.String r7 = r0.consentedUsersUrl_
        L_0x00a9:
            r8 = 2
            goto L_0x003d
        L_0x00ab:
            r0 = 3
            if (r3 != r0) goto L_0x00bb
            java.lang.Object r0 = r2.hydratedButton_
            X.8Ot r0 = (X.C172678Ot) r0
        L_0x00b2:
            java.lang.String r6 = r0.phoneNumber_
            r0 = 1
            if (r3 == r0) goto L_0x0037
            r0 = 2
            if (r3 != r0) goto L_0x0037
            goto L_0x00a3
        L_0x00bb:
            X.8Ot r0 = X.C172678Ot.DEFAULT_INSTANCE
            goto L_0x00b2
        L_0x00be:
            r0 = 2
            if (r3 != r0) goto L_0x00c9
            X.8Qe r0 = r2.A0u()
            java.lang.String r3 = r0.displayText_
            goto L_0x0020
        L_0x00c9:
            r0 = 3
            if (r3 != r0) goto L_0x00d4
            java.lang.Object r0 = r2.hydratedButton_
            X.8Ot r0 = (X.C172678Ot) r0
        L_0x00d0:
            java.lang.String r3 = r0.displayText_
            goto L_0x0020
        L_0x00d4:
            X.8Ot r0 = X.C172678Ot.DEFAULT_INSTANCE
            goto L_0x00d0
        L_0x00d7:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00dc:
            int r0 = r1.size()
            if (r0 > 0) goto L_0x00e3
            r1 = 0
        L_0x00e3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203099nI.A02(X.0yC, X.8SO):java.util.ArrayList");
    }

    public static void A03(C203099nI r12, String str, List list) {
        Iterator it = list.iterator();
        AnonymousClass3P8 r1 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            AnonymousClass3P8 r4 = (AnonymousClass3P8) it.next();
            if (r4 == null) {
                i++;
            } else {
                if (r4.A08.isEmpty()) {
                    i2++;
                }
                int i6 = r4.A06;
                if (i6 == 2) {
                    i3++;
                } else if (i6 == 3) {
                    i4++;
                }
                if (!(r1 == null || AnonymousClass000.A1O(r1.A06) == AnonymousClass000.A1O(i6))) {
                    i5++;
                }
                r1 = r4;
            }
        }
        if (list.size() > 10) {
            r12.A01.A0E("TemplateMessageHasMoreThanTenTemplateButtons", String.format("%s: FMessage field of templateInfo has more than 10 templateButtons", new Object[]{str}), true);
        }
        if (i > 0) {
            r12.A01.A0E("TemplateMessageHasNullInButtonList", String.format("%s: FMessage field of templateInfo has at least 1 null templateButton", new Object[]{str}), true);
        }
        if (i2 > 0) {
            r12.A01.A0E("TemplateMessageHasTemplateButtonWithEmptyText", String.format("%s: FMessage field of templateInfo has at least 1 button with empty text", new Object[]{str}), true);
        }
        if (i3 > 2) {
            r12.A01.A0E("TemplateMessageHasMoreThanTwoURLButtons", String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed URL buttons of 2", new Object[]{str}), true);
        }
        if (i4 > 1) {
            r12.A01.A0E("TemplateMessageHasMoreThanOneCallButton", String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed CALL buttons of 1", new Object[]{str}), true);
        }
        if (i5 > 1) {
            r12.A01.A0E("TemplateMessageHasStaggeredTemplateButtons", String.format("%s: FMessage field of templateInfo has exceeded the maximum number of allowed CALL buttons of 1", new Object[]{str}), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0.formatCase_ == 5) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.AnonymousClass8SX r2) {
        /*
            boolean r0 = r2.A10()
            if (r0 == 0) goto L_0x0013
            X.8SL r0 = r2.templateMessage_
            if (r0 != 0) goto L_0x000c
            X.8SL r0 = X.AnonymousClass8SL.DEFAULT_INSTANCE
        L_0x000c:
            int r1 = r0.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x0013
        L_0x0011:
            r1 = 1
        L_0x0012:
            return r1
        L_0x0013:
            int r0 = r2.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203099nI.A05(X.8SX):boolean");
    }
}
