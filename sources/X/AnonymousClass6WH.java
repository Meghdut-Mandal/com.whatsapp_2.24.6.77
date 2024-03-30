package X;

import android.util.SparseArray;
import com.whatsapp.R;
import java.util.LinkedList;

/* renamed from: X.6WH  reason: invalid class name */
public abstract class AnonymousClass6WH {
    public static boolean A01(int i) {
        switch (i) {
            case 13313:
            case 13337:
            case 13566:
            case 13656:
            case 13688:
            case 13762:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 16310:
            case 16515:
            case 16529:
            case 16913:
                return true;
            default:
                return false;
        }
    }

    public static AnonymousClass75B A00(SparseArray sparseArray, C1271967i r2, Runnable runnable) {
        r2.A02.A01.B8r();
        AnonymousClass75B r22 = new AnonymousClass75B(runnable);
        AnonymousClass6LF r1 = (AnonymousClass6LF) sparseArray.get(R.id.bk_context_key_render_callback_queue);
        if (r1 != null && C132926Vv.A03() && !r1.A00 && !r1.A01) {
            LinkedList linkedList = r1.A04;
            linkedList.isEmpty();
            linkedList.add(r22);
        }
        return r22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fb, code lost:
        if (X.C90514aH.A1Z(r1) != false) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.C1271967i r8, X.C140456lc r9) {
        /*
            r7 = this;
            int r1 = r9.A04
            boolean r0 = A01(r1)
            if (r0 == 0) goto L_0x0113
            switch(r1) {
                case 13313: goto L_0x0010;
                case 13337: goto L_0x0046;
                case 13566: goto L_0x0113;
                case 13656: goto L_0x0113;
                case 13688: goto L_0x0059;
                case 13762: goto L_0x0016;
                case 13768: goto L_0x00d6;
                case 13774: goto L_0x001c;
                case 13914: goto L_0x0022;
                case 13981: goto L_0x0028;
                case 14001: goto L_0x002e;
                case 15833: goto L_0x0034;
                case 16310: goto L_0x003a;
                case 16515: goto L_0x0113;
                case 16529: goto L_0x0040;
                case 16913: goto L_0x0113;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r1)
            throw r0
        L_0x0010:
            X.5s5 r5 = new X.5s5
            r5.<init>()
            return r5
        L_0x0016:
            X.5hL r5 = new X.5hL
            r5.<init>()
            return r5
        L_0x001c:
            X.5o5 r5 = new X.5o5
            r5.<init>()
            return r5
        L_0x0022:
            X.5hV r5 = new X.5hV
            r5.<init>()
            return r5
        L_0x0028:
            X.5hU r5 = new X.5hU
            r5.<init>()
            return r5
        L_0x002e:
            X.5yf r5 = new X.5yf
            r5.<init>()
            return r5
        L_0x0034:
            X.5uE r5 = new X.5uE
            r5.<init>()
            return r5
        L_0x003a:
            X.63m r5 = new X.63m
            r5.<init>(r8, r9)
            return r5
        L_0x0040:
            X.5o6 r5 = new X.5o6
            r5.<init>()
            return r5
        L_0x0046:
            java.lang.String r1 = X.C140456lc.A0J(r9)
            r5 = 0
            if (r1 == 0) goto L_0x00da
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00da
            X.6cM r0 = new X.6cM
            r0.<init>(r5, r1)
            return r0
        L_0x0059:
            java.lang.String r6 = "ViewTransformsExtensionBinderUtils"
            X.6oF r5 = new X.6oF
            r5.<init>()
            r0 = 141(0x8d, float:1.98E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.A0S(r0, r3)
            r5.A00 = r0
            r4 = 0
            r2 = 0
            r0 = 38
            java.lang.Object r0 = X.C140456lc.A0I(r9, r0)     // Catch:{ 5R5 -> 0x008d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 5R5 -> 0x008d }
            if (r0 != 0) goto L_0x0078
            r0 = 0
            goto L_0x007c
        L_0x0078:
            float r0 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x008d }
        L_0x007c:
            r5.A09 = r0     // Catch:{ 5R5 -> 0x008d }
            java.lang.String r0 = X.C140456lc.A0M(r9)     // Catch:{ 5R5 -> 0x008d }
            if (r0 != 0) goto L_0x0086
            r0 = 0
            goto L_0x008a
        L_0x0086:
            float r0 = X.AnonymousClass6Y7.A01(r0)     // Catch:{ 5R5 -> 0x008d }
        L_0x008a:
            r5.A0A = r0     // Catch:{ 5R5 -> 0x008d }
            goto L_0x0093
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.AnonymousClass6RS.A00(r4, r6, r0, r1)
        L_0x0093:
            r0 = 35
            float r0 = r9.A0S(r0, r3)
            r5.A07 = r0
            r0 = 36
            float r0 = r9.A0S(r0, r3)
            r5.A08 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r9.A0S(r0, r2)
            r5.A04 = r0
            r0 = 44
            float r0 = r9.A0S(r0, r2)
            r5.A05 = r0
            r0 = 45
            float r0 = r9.A0S(r0, r2)
            r5.A06 = r0
            r1 = 43
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = r9.A0S(r1, r0)
            r5.A01 = r0
            r0 = 41
            java.lang.Object r1 = X.C140456lc.A0I(r9, r0)     // Catch:{ 5R5 -> 0x010c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 5R5 -> 0x010c }
            java.lang.String r3 = X.C140456lc.A0O(r9)     // Catch:{ 5R5 -> 0x010c }
            if (r1 != 0) goto L_0x00db
            if (r3 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00d6:
            com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.ExpressionMask r5 = com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil.createController(r8, r9)
        L_0x00da:
            return r5
        L_0x00db:
            r2 = 1
            r5.A0E = r2     // Catch:{ 5R5 -> 0x010c }
            if (r1 != 0) goto L_0x00e3
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x00e7
        L_0x00e3:
            float r0 = X.AnonymousClass6Y7.A01(r1)     // Catch:{ 5R5 -> 0x010c }
        L_0x00e7:
            r5.A02 = r0     // Catch:{ 5R5 -> 0x010c }
            if (r3 != 0) goto L_0x00ee
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x00f2
        L_0x00ee:
            float r0 = X.AnonymousClass6Y7.A01(r3)     // Catch:{ 5R5 -> 0x010c }
        L_0x00f2:
            r5.A03 = r0     // Catch:{ 5R5 -> 0x010c }
            if (r1 == 0) goto L_0x00fd
            boolean r1 = X.C90514aH.A1Z(r1)     // Catch:{ 5R5 -> 0x010c }
            r0 = 0
            if (r1 == 0) goto L_0x00fe
        L_0x00fd:
            r0 = 1
        L_0x00fe:
            r5.A0F = r0     // Catch:{ 5R5 -> 0x010c }
            if (r3 == 0) goto L_0x0109
            boolean r0 = X.C90514aH.A1Z(r3)     // Catch:{ 5R5 -> 0x010c }
            if (r0 != 0) goto L_0x0109
            r2 = 0
        L_0x0109:
            r5.A0G = r2     // Catch:{ 5R5 -> 0x010c }
            return r5
        L_0x010c:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.AnonymousClass6RS.A00(r4, r6, r0, r1)
            return r5
        L_0x0113:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WH.A02(X.67i, X.6lc):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02bf, code lost:
        X.AnonymousClass6RS.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ca, code lost:
        r6.setTag(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02cd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C1271967i r18, X.C140456lc r19, X.C140456lc r20, java.lang.Object r21) {
        /*
            r17 = this;
            r8 = r19
            r6 = r21
            int r1 = r8.A04
            boolean r0 = A01(r1)
            if (r0 == 0) goto L_0x031e
            android.view.View r6 = (android.view.View) r6
            r9 = r18
            r7 = r20
            switch(r1) {
                case 13313: goto L_0x00d1;
                case 13337: goto L_0x001a;
                case 13566: goto L_0x0129;
                case 13656: goto L_0x0132;
                case 13688: goto L_0x0150;
                case 13762: goto L_0x01ab;
                case 13768: goto L_0x005e;
                case 13774: goto L_0x01f1;
                case 13914: goto L_0x0225;
                case 13981: goto L_0x025e;
                case 14001: goto L_0x0062;
                case 15833: goto L_0x0066;
                case 16310: goto L_0x0267;
                case 16515: goto L_0x02ad;
                case 16529: goto L_0x02ce;
                case 16913: goto L_0x006a;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r1)
            throw r0
        L_0x001a:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            boolean r0 = r6 instanceof android.widget.EditText
            if (r0 == 0) goto L_0x031e
            android.widget.EditText r6 = (android.widget.EditText) r6
            if (r6 == 0) goto L_0x031e
            java.lang.Object r4 = X.C133266Xn.A05(r9, r8)
            X.6cM r4 = (X.C135226cM) r4
            if (r4 == 0) goto L_0x031e
            r4.A00 = r6
            java.lang.String r1 = X.C140456lc.A0J(r8)
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = r4.A01
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 != 0) goto L_0x0302
            r4.A01 = r1
            int r3 = r1.length()
            r2 = 0
        L_0x0045:
            if (r2 >= r3) goto L_0x02f5
            java.lang.String r0 = r4.A01
            char r1 = r0.charAt(r2)
            r0 = 35
            if (r1 == r0) goto L_0x0056
            java.util.ArrayList r0 = r4.A04
            X.AnonymousClass000.A1F(r0, r2)
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0059:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x005e:
            com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil.bind(r6, r9, r8, r7)
            return
        L_0x0062:
            X.C129836Iq.A00(r6, r9, r8, r7)
            return
        L_0x0066:
            X.AnonymousClass6I6.A00(r6, r9, r8, r7)
            return
        L_0x006a:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r1 = 1
            r0 = 38
            boolean r0 = r8.A0f(r0, r1)
            if (r0 == 0) goto L_0x031e
            boolean r0 = r6 instanceof X.C159057ij
            if (r0 == 0) goto L_0x031e
            r0 = 36
            X.7ku r3 = r8.A0X(r0)
            if (r3 == 0) goto L_0x031e
            X.7ij r6 = (X.C159057ij) r6
            java.lang.String r4 = X.C140456lc.A0J(r8)
            java.lang.String r0 = "image/*"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            if (r4 == 0) goto L_0x00b6
            int r1 = r4.hashCode()
            r0 = 96673(0x179a1, float:1.35468E-40)
            if (r1 == r0) goto L_0x00b6
            r0 = 102340(0x18fc4, float:1.43409E-40)
            if (r1 == r0) goto L_0x00c2
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r1 != r0) goto L_0x00b6
            java.lang.String r0 = "image"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r2 = "image/png"
            java.lang.String r1 = "image/jpeg"
            java.lang.String r0 = "image/webp"
            java.lang.String[] r2 = new java.lang.String[]{r2, r1, r0}
        L_0x00b6:
            r6.setAllowedContentTypes(r2)
            X.6lJ r0 = new X.6lJ
            r0.<init>(r9, r7, r3)
            r6.setContentCommittedListener(r0)
            return
        L_0x00c2:
            java.lang.String r0 = "gif"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "image/gif"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            goto L_0x00b6
        L_0x00d1:
            java.lang.Object r5 = X.C133266Xn.A05(r9, r8)
            X.5s5 r5 = (X.C120795s5) r5
            if (r5 == 0) goto L_0x031e
            int r0 = r6.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            boolean r0 = r6.isFocusable()
            r5.A01 = r0
            r0 = 35
            r4 = 1
            boolean r0 = r8.A0f(r0, r4)
            r3 = 0
            if (r0 != 0) goto L_0x0127
            r0 = 2
            r6.setImportantForAccessibility(r0)
            r2 = 0
        L_0x00f8:
            java.lang.String r1 = X.C140456lc.A0K(r8)
            java.lang.String r0 = X.C140456lc.A0L(r8)
            if (r1 != 0) goto L_0x0104
            if (r0 == 0) goto L_0x0105
        L_0x0104:
            r3 = 1
        L_0x0105:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x0115
            r6.setImportantForAccessibility(r4)
            r6.setFocusable(r4)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0115
            r6.requestFocus()
        L_0x0115:
            X.4k6 r0 = new X.4k6
            r0.<init>(r8)
            X.C012005e.A0V(r6, r0)
            r0 = 45
            java.util.List r0 = r8.A0d(r0)
            X.AnonymousClass6GQ.A01(r9, r7, r0)
            return
        L_0x0127:
            r2 = 1
            goto L_0x00f8
        L_0x0129:
            r1 = 2131434591(0x7f0b1c5f, float:1.8491E38)
            java.lang.String r0 = X.C140456lc.A0J(r8)
            goto L_0x02ca
        L_0x0132:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r1 = 2131428091(0x7f0b02fb, float:1.8477817E38)
            android.util.SparseArray r0 = r9.A01
            java.lang.Object r10 = r0.get(r1)
            r11 = 1
            X.753 r5 = new X.753
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.75B r1 = A00(r0, r9, r5)
            r0 = 2131433278(0x7f0b173e, float:1.8488337E38)
            r6.setTag(r0, r1)
            return
        L_0x0150:
            java.lang.Object r3 = X.C133266Xn.A05(r9, r8)
            X.6oF r3 = (X.C142046oF) r3
            if (r3 != 0) goto L_0x015e
            java.lang.String r1 = "ViewTransformsExtensionBinderUtils"
            java.lang.String r0 = "Null controller while binding ViewTransformsExtension"
            goto L_0x02bf
        L_0x015e:
            r3.A0B = r6
            float r0 = r3.A00
            r6.setAlpha(r0)
            float r0 = r3.A04
            r6.setRotation(r0)
            float r0 = r3.A05
            r6.setRotationX(r0)
            float r0 = r3.A06
            r6.setRotationY(r0)
            android.content.Context r1 = r9.A00
            float r2 = r3.A01
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x017f
            r2 = 1325400064(0x4f000000, float:2.14748365E9)
        L_0x017f:
            float r1 = X.C36341k9.A00(r1)
            float r1 = r1 * r1
            float r0 = -r2
            float r1 = r1 * r0
            float r0 = X.AnonymousClass6RT.A00
            float r1 = r1 * r0
            r6.setCameraDistance(r1)
            float r0 = r3.A07
            r6.setScaleX(r0)
            float r0 = r3.A08
            r6.setScaleY(r0)
            r0 = 1
            r3.A0D = r0
            r1 = 1
            X.7r9 r0 = new X.7r9
            r0.<init>(r6, r3, r1)
            r3.A0C = r0
            android.view.ViewTreeObserver r1 = r6.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r3.A0C
            r1.addOnPreDrawListener(r0)
            return
        L_0x01ab:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            int r1 = r7.A04
            r0 = 13323(0x340b, float:1.867E-41)
            if (r1 == r0) goto L_0x01bd
            java.lang.String r1 = "invalid_extension_used"
            java.lang.String r0 = "bk.components.AvatarImageExtension should only be used for image components"
            android.util.Log.e(r1, r0)
            return
        L_0x01bd:
            r1 = 35
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r8.A0S(r1, r0)
            r1 = 38
            r0 = 0
            float r2 = r8.A0S(r1, r0)
            r6.setScaleX(r3)
            r6.setScaleY(r3)
            float r0 = X.C36441kJ.A02(r6)
            float r0 = r0 * r2
            float r0 = r0 * r3
            r6.setTranslationY(r0)
            X.6d4 r1 = new X.6d4
            r1.<init>(r3, r2)
            r6.addOnLayoutChangeListener(r1)
            X.AnonymousClass00C.A0B(r9)
            java.lang.Object r0 = X.C133266Xn.A05(r9, r8)
            X.5hL r0 = (X.C114495hL) r0
            if (r0 == 0) goto L_0x031e
            r0.A00 = r1
            return
        L_0x01f1:
            java.lang.Object r4 = X.C133266Xn.A05(r9, r8)
            X.5o5 r4 = (X.AnonymousClass5o5) r4
            if (r4 == 0) goto L_0x031e
            X.6dO r0 = r4.A00
            if (r0 != 0) goto L_0x031e
            android.content.Context r3 = r9.A00
            android.app.Activity r1 = X.C129306Gj.A00(r3)
            if (r1 == 0) goto L_0x0220
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x020c:
            boolean r0 = r4.A01
            X.6dO r2 = new X.6dO
            r2.<init>(r1, r0)
            X.5uG r1 = new X.5uG
            r1.<init>(r3, r9, r8, r7)
            java.util.List r0 = r2.A03
            r0.add(r1)
            r4.A00 = r2
            return
        L_0x0220:
            android.view.View r1 = r6.getRootView()
            goto L_0x020c
        L_0x0225:
            java.lang.Object r1 = X.C133266Xn.A05(r9, r8)
            X.5hV r1 = (X.C114595hV) r1
            boolean r0 = r1.A00
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0248
            r1.A00 = r2
            r0 = 41
            X.7ku r1 = r8.A0X(r0)
            if (r1 == 0) goto L_0x0248
            X.68b r0 = X.C1273868b.A00()
            r0.A0A(r7, r3)
            r0.A0A(r9, r2)
            X.C1273868b.A06(r9, r8, r0, r1)
        L_0x0248:
            r0 = 42
            X.7ku r1 = r8.A0X(r0)
            if (r1 == 0) goto L_0x031e
            X.68b r0 = X.C1273868b.A00()
            r0.A0A(r7, r3)
            r0.A0A(r9, r2)
            X.C1273868b.A06(r9, r8, r0, r1)
            return
        L_0x025e:
            X.6dC r0 = new X.6dC
            r0.<init>(r9, r8, r7)
            r6.setOnTouchListener(r0)
            return
        L_0x0267:
            java.lang.Object r5 = X.C133266Xn.A04(r9, r8)
            X.63m r5 = (X.C1263263m) r5
            android.os.Handler r1 = X.C112625eC.A00
            java.lang.Runnable r0 = r5.A02
            r1.removeCallbacks(r0)
            r0 = 41
            java.lang.Object r4 = X.C140456lc.A0I(r8, r0)
            r0 = 42
            r3 = 1
            boolean r1 = r8.A0f(r0, r3)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0287
            if (r1 == 0) goto L_0x02a8
        L_0x0287:
            java.lang.Object r0 = r5.A00
            boolean r0 = X.AnonymousClass5Z0.A00(r4, r0)
            if (r0 != 0) goto L_0x02a8
            r5.A00()
            X.7ku r2 = X.C140456lc.A0E(r8)
            if (r2 == 0) goto L_0x02a8
            X.68b r1 = X.C1273868b.A02(r9)
            java.lang.Object r0 = r5.A00
            r1.A09(r0, r3)
            r0 = 2
            r1.A09(r4, r0)
            X.C1273868b.A06(r9, r8, r1, r2)
        L_0x02a8:
            r5.A00 = r4
            r5.A01 = r3
            return
        L_0x02ad:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r0 = 35
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r8.A0T(r0, r1)
            if (r0 != r1) goto L_0x02c3
            java.lang.String r1 = "BloksViewTagExtension"
            java.lang.String r0 = "ViewTagExtension is used, but no actual tag value is provided or FALLBACK_INT_TAG is found. This redundantly forces parent component for have a View"
        L_0x02bf:
            X.AnonymousClass6RS.A01(r1, r0)
            return
        L_0x02c3:
            r1 = 2131428029(0x7f0b02bd, float:1.847769E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x02ca:
            r6.setTag(r1, r0)
            return
        L_0x02ce:
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r1 = 2131428091(0x7f0b02fb, float:1.8477817E38)
            android.util.SparseArray r0 = r9.A01
            java.lang.Object r11 = r0.get(r1)
            java.lang.Object r13 = X.C133266Xn.A04(r9, r8)
            X.AnonymousClass00C.A08(r13)
            X.5o6 r13 = (X.AnonymousClass5o6) r13
            r16 = 2
            X.753 r10 = new X.753
            r12 = r7
            r14 = r9
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.75B r0 = A00(r0, r9, r10)
            r13.A00 = r0
            return
        L_0x02f5:
            android.widget.EditText r0 = r4.A00
            if (r0 == 0) goto L_0x0302
            android.text.Editable r0 = r0.getEditableText()
            if (r0 == 0) goto L_0x0302
            r4.afterTextChanged(r0)
        L_0x0302:
            java.lang.Object r1 = X.C133266Xn.A05(r9, r7)
            boolean r0 = r1 instanceof X.C125115zL
            if (r0 == 0) goto L_0x031e
            X.5zL r1 = (X.C125115zL) r1
            X.6cJ r0 = r1.A0M
            if (r0 == 0) goto L_0x0315
            java.util.List r0 = r0.A01
            r0.remove(r4)
        L_0x0315:
            X.6cJ r0 = r1.A0M
            if (r0 == 0) goto L_0x031e
            java.util.List r0 = r0.A01
            r0.add(r4)
        L_0x031e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WH.A03(X.67i, X.6lc, X.6lc, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r2.post(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0112, code lost:
        if ((r3 instanceof X.AnonymousClass75B) == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        r1 = (X.AnonymousClass75B) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0119, code lost:
        if (r1.A02 != 4) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011b, code lost:
        r1.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011f, code lost:
        r9.removeCallbacks(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0174, code lost:
        r9.setTag(r1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0178, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C1271967i r6, X.C140456lc r7, X.C140456lc r8, java.lang.Object r9) {
        /*
            r5 = this;
            int r1 = r7.A04
            boolean r0 = A01(r1)
            if (r0 == 0) goto L_0x019b
            android.view.View r9 = (android.view.View) r9
            switch(r1) {
                case 13313: goto L_0x0142;
                case 13337: goto L_0x0123;
                case 13566: goto L_0x0171;
                case 13656: goto L_0x0102;
                case 13688: goto L_0x017d;
                case 13762: goto L_0x00e9;
                case 13768: goto L_0x0179;
                case 13774: goto L_0x00c1;
                case 13914: goto L_0x00b1;
                case 13981: goto L_0x016c;
                case 14001: goto L_0x004f;
                case 15833: goto L_0x0037;
                case 16310: goto L_0x002c;
                case 16515: goto L_0x0023;
                case 16529: goto L_0x0012;
                case 16913: goto L_0x0181;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalArgumentException r0 = X.C90464aC.A0O(r1)
            throw r0
        L_0x0012:
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r0 = X.C133266Xn.A04(r6, r7)
            X.AnonymousClass00C.A08(r0)
            X.5o6 r0 = (X.AnonymousClass5o6) r0
            java.lang.Runnable r3 = r0.A00
            goto L_0x010f
        L_0x0023:
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r1 = 2131428029(0x7f0b02bd, float:1.847769E38)
            goto L_0x0174
        L_0x002c:
            java.lang.Object r0 = X.C133266Xn.A04(r6, r7)
            X.63m r0 = (X.C1263263m) r0
            android.os.Handler r2 = X.C112625eC.A00
            java.lang.Runnable r0 = r0.A02
            goto L_0x004b
        L_0x0037:
            r2 = 0
            r9.setOnTouchListener(r2)
            java.lang.Object r1 = X.C133266Xn.A04(r6, r7)
            X.5uE r1 = (X.C122055uE) r1
            X.4d7 r0 = r1.A01
            if (r0 == 0) goto L_0x0047
            r0.A01 = r2
        L_0x0047:
            android.os.Handler r2 = X.AnonymousClass6I6.A00
            java.lang.Runnable r0 = r1.A03
        L_0x004b:
            r2.post(r0)
            return
        L_0x004f:
            java.lang.Object r4 = X.C133266Xn.A05(r6, r7)
            X.5yf r4 = (X.C124705yf) r4
            if (r4 == 0) goto L_0x019b
            r3 = 0
            X.C012005e.A0V(r9, r3)
            java.lang.String r0 = r4.A03
            r9.setContentDescription(r0)
            java.lang.Integer r0 = r4.A00
            int r0 = r0.intValue()
            r9.setImportantForAccessibility(r0)
            java.lang.Integer r0 = r4.A01
            int r0 = r0.intValue()
            X.C011304x.A01(r9, r0)
            boolean r0 = r4.A05
            r9.setFocusable(r0)
            boolean r0 = r4.A08
            r9.setSelected(r0)
            boolean r0 = r4.A04
            r9.setEnabled(r0)
            boolean r0 = r4.A06
            X.C012005e.A0a(r9, r0)
            boolean r2 = r4.A07
            r0 = 0
            X.0sf r1 = new X.0sf
            r1.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A02(r9, r0)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x009c
            r9.setOnClickListener(r3)
        L_0x009c:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x00a3
            r9.setOnClickListener(r3)
        L_0x00a3:
            r0 = 56
            java.util.List r0 = r7.A0d(r0)
            X.AnonymousClass6GQ.A00(r6, r8, r0)
            r0 = -1
            X.AnonymousClass04F.A04(r9, r0)
            return
        L_0x00b1:
            r0 = 43
            X.7ku r1 = r7.A0X(r0)
            if (r1 == 0) goto L_0x019b
            X.68b r0 = X.C1273868b.A03(r8)
            X.C1273868b.A06(r6, r7, r0, r1)
            return
        L_0x00c1:
            java.lang.Object r2 = X.C133266Xn.A05(r6, r7)
            X.5o5 r2 = (X.AnonymousClass5o5) r2
            if (r2 == 0) goto L_0x019b
            X.6dO r1 = r2.A00
            if (r1 != 0) goto L_0x00d1
            r0 = 0
            r2.A01 = r0
            return
        L_0x00d1:
            boolean r0 = r1.A00
            r2.A01 = r0
            java.util.List r0 = r1.A03
            r0.clear()
            android.view.View r0 = r1.A02
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x00e5
            r0.removeOnGlobalLayoutListener(r1)
        L_0x00e5:
            r0 = 0
            r2.A00 = r0
            return
        L_0x00e9:
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Object r0 = X.C133266Xn.A05(r6, r7)
            X.5hL r0 = (X.C114495hL) r0
            if (r0 == 0) goto L_0x019b
            android.view.View$OnLayoutChangeListener r0 = r0.A00
            r9.removeOnLayoutChangeListener(r0)
            X.C90484aE.A16(r9)
            r0 = 0
            r9.setTranslationY(r0)
            return
        L_0x0102:
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 2131433278(0x7f0b173e, float:1.8488337E38)
            java.lang.Object r3 = r9.getTag(r0)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L_0x010f:
            r2 = 4
            boolean r0 = r3 instanceof X.AnonymousClass75B
            if (r0 == 0) goto L_0x011f
            r1 = r3
            X.75B r1 = (X.AnonymousClass75B) r1
            int r0 = r1.A02
            if (r0 != r2) goto L_0x011f
            r0 = 1
            r1.A01 = r0
            return
        L_0x011f:
            r9.removeCallbacks(r3)
            return
        L_0x0123:
            java.lang.Object r2 = X.C133266Xn.A05(r6, r7)
            X.6cM r2 = (X.C135226cM) r2
            if (r2 == 0) goto L_0x019b
            r0 = 0
            r2.A00 = r0
            java.lang.Object r1 = X.C133266Xn.A05(r6, r8)
            boolean r0 = r1 instanceof X.C125115zL
            if (r0 == 0) goto L_0x019b
            X.5zL r1 = (X.C125115zL) r1
            X.6cJ r0 = r1.A0M
            if (r0 == 0) goto L_0x019b
            java.util.List r0 = r0.A01
            r0.remove(r2)
            return
        L_0x0142:
            java.lang.Object r1 = X.C133266Xn.A05(r6, r7)
            X.5s5 r1 = (X.C120795s5) r1
            if (r1 == 0) goto L_0x019b
            boolean r0 = r9.isFocused()
            r1.A02 = r0
            r0 = 0
            X.C012005e.A0V(r9, r0)
            java.lang.Integer r0 = r1.A00
            int r0 = r0.intValue()
            r9.setImportantForAccessibility(r0)
            boolean r0 = r1.A01
            r9.setFocusable(r0)
            r0 = 45
            java.util.List r0 = r7.A0d(r0)
            X.AnonymousClass6GQ.A00(r6, r8, r0)
            return
        L_0x016c:
            r0 = 0
            r9.setOnTouchListener(r0)
            return
        L_0x0171:
            r1 = 2131434591(0x7f0b1c5f, float:1.8491E38)
        L_0x0174:
            r0 = 0
            r9.setTag(r1, r0)
            return
        L_0x0179:
            com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil.unbind(r9, r6, r7, r8)
            return
        L_0x017d:
            X.AnonymousClass6RT.A00(r9, r6, r7)
            return
        L_0x0181:
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r1 = 38
            r0 = 1
            boolean r0 = r7.A0f(r1, r0)
            if (r0 == 0) goto L_0x019b
            boolean r0 = r9 instanceof X.C159057ij
            if (r0 == 0) goto L_0x019b
            X.7ij r9 = (X.C159057ij) r9
            r0 = 0
            r9.setAllowedContentTypes(r0)
            r9.setContentCommittedListener(r0)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WH.A04(X.67i, X.6lc, X.6lc, java.lang.Object):void");
    }
}
