package X;

import java.util.List;

/* renamed from: X.7rV  reason: invalid class name and case insensitive filesystem */
public class C164247rV implements AnonymousClass05G {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164247rV(C161547n5 r1, List list, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
                this.A00 = list;
                this.A01 = r1;
                break;
            default:
                this.A01 = list;
                this.A00 = r1;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ff, code lost:
        X.AnonymousClass0AN.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021b, code lost:
        if (r0 != r6) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021d, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04c5, code lost:
        r1.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04c8, code lost:
        r1 = (X.C161547n5) r2.A01;
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04ce, code lost:
        X.C90474aD.A11(r1, X.C36401kF.A1a((java.util.List) r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d9, code lost:
        ((java.util.List) r2.A00).add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6N(java.lang.Object r19, X.C023509x r20) {
        /*
            r18 = this;
            r10 = r19
            r2 = r18
            int r0 = r2.A02
            r6 = r20
            switch(r0) {
                case 0: goto L_0x04b3;
                case 1: goto L_0x04a0;
                case 2: goto L_0x046f;
                case 3: goto L_0x0246;
                case 4: goto L_0x021e;
                case 5: goto L_0x01d7;
                case 6: goto L_0x0196;
                case 7: goto L_0x0154;
                case 8: goto L_0x0107;
                case 9: goto L_0x00ca;
                case 10: goto L_0x002b;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r2 = r2.A00
            android.view.View r2 = (android.view.View) r2
            X.AnonymousClass00C.A07(r2)
            X.5FS r0 = X.AnonymousClass5FS.A00
            boolean r1 = X.AnonymousClass00C.A0J(r10, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0025
            X.5FR r0 = X.AnonymousClass5FR.A00
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)
            if (r0 == 0) goto L_0x04e1
            r0 = 8
        L_0x0025:
            r2.setVisibility(r0)
        L_0x0028:
            X.0AJ r6 = X.AnonymousClass0AJ.A00
            return r6
        L_0x002b:
            boolean r0 = r6 instanceof X.AnonymousClass7AH
            if (r0 == 0) goto L_0x004d
            r4 = r6
            X.7AH r4 = (X.AnonymousClass7AH) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x004d
            int r3 = r3 - r1
            r4.label = r3
        L_0x003d:
            java.lang.Object r1 = r4.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 == r5) goto L_0x01ff
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x004d:
            X.7AH r4 = new X.7AH
            r4.<init>(r2, r6)
            goto L_0x003d
        L_0x0053:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r7 = r2.A00
            X.05G r7 = (X.AnonymousClass05G) r7
            X.6AI r10 = (X.AnonymousClass6AI) r10
            java.lang.Object r8 = r2.A01
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r8 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r8
            X.00s r0 = r8.A0A
            java.lang.Object r1 = r0.A04()
            X.5bA r1 = (X.C110745bA) r1
            boolean r0 = r1 instanceof X.AnonymousClass56Z
            r3 = 0
            if (r0 == 0) goto L_0x0098
            boolean r0 = X.C90484aE.A1T(r8)
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r8.A05
        L_0x0075:
            java.util.ArrayList r3 = X.C36351kA.A0z(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x007d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.next()
            X.5b9 r1 = (X.C110735b9) r1
            java.lang.String r0 = r10.A00
            X.5b9 r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A01(r1, r8, r0)
            r3.add(r0)
            goto L_0x007d
        L_0x0093:
            X.56Z r1 = (X.AnonymousClass56Z) r1
            java.util.List r0 = r1.A01
            goto L_0x0075
        L_0x0098:
            boolean r0 = r1 instanceof X.C1035856a
            if (r0 == 0) goto L_0x00c2
            boolean r0 = X.C90484aE.A1T(r8)
            if (r0 == 0) goto L_0x00c2
            java.util.List r0 = r8.A05
            java.util.ArrayList r3 = X.C36351kA.A0z(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r1 = r2.next()
            X.5b9 r1 = (X.C110735b9) r1
            java.lang.String r0 = r10.A00
            X.5b9 r0 = com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel.A01(r1, r8, r0)
            r3.add(r0)
            goto L_0x00ac
        L_0x00c2:
            r4.label = r5
            java.lang.Object r0 = r7.B6N(r3, r4)
            goto L_0x021b
        L_0x00ca:
            boolean r0 = r6 instanceof X.AnonymousClass7AF
            if (r0 == 0) goto L_0x00ec
            r4 = r6
            X.7AF r4 = (X.AnonymousClass7AF) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00ec
            int r3 = r3 - r1
            r4.label = r3
        L_0x00dc:
            java.lang.Object r1 = r4.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x00f2
            if (r0 == r3) goto L_0x01ff
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00ec:
            X.7AF r4 = new X.7AF
            r4.<init>(r2, r6)
            goto L_0x00dc
        L_0x00f2:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r1 = r2.A01
            X.05G r1 = (X.AnonymousClass05G) r1
            java.lang.Object r0 = r2.A00
            X.011 r0 = X.C36441kJ.A19(r0, r10)
            r4.label = r3
            java.lang.Object r0 = r1.B6N(r0, r4)
            goto L_0x021b
        L_0x0107:
            boolean r0 = r6 instanceof X.AnonymousClass7AC
            if (r0 == 0) goto L_0x0129
            r4 = r6
            X.7AC r4 = (X.AnonymousClass7AC) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0129
            int r3 = r3 - r1
            r4.label = r3
        L_0x0119:
            java.lang.Object r1 = r4.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x012f
            if (r0 == r3) goto L_0x01ff
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0129:
            X.7AC r4 = new X.7AC
            r4.<init>(r2, r6)
            goto L_0x0119
        L_0x012f:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r1 = r2.A00
            X.05G r1 = (X.AnonymousClass05G) r1
            X.5cG r10 = (X.C111425cG) r10
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            boolean r0 = r10 instanceof X.C106105Ij
            if (r0 == 0) goto L_0x0151
            X.5Ij r10 = (X.C106105Ij) r10
            X.68B r0 = r10.A00
            java.util.List r0 = r0.A05
            X.AnonymousClass00C.A0B(r0)
        L_0x0149:
            r4.label = r3
            java.lang.Object r0 = r1.B6N(r0, r4)
            goto L_0x021b
        L_0x0151:
            X.09w r0 = X.C023409w.A00
            goto L_0x0149
        L_0x0154:
            boolean r0 = r6 instanceof X.AnonymousClass7A9
            if (r0 == 0) goto L_0x0176
            r5 = r6
            X.7A9 r5 = (X.AnonymousClass7A9) r5
            int r3 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0176
            int r3 = r3 - r1
            r5.label = r3
        L_0x0166:
            java.lang.Object r1 = r5.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x017c
            if (r0 == r4) goto L_0x01ff
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0176:
            X.7A9 r5 = new X.7A9
            r5.<init>(r2, r6)
            goto L_0x0166
        L_0x017c:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r3 = r2.A00
            X.05G r3 = (X.AnonymousClass05G) r3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r2.A01
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r1 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r1
            r0 = 0
            X.5az r0 = com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel.A01(r1, r10, r0)
            r5.label = r4
            java.lang.Object r0 = r3.B6N(r0, r5)
            goto L_0x021b
        L_0x0196:
            boolean r0 = r6 instanceof X.AnonymousClass7A8
            if (r0 == 0) goto L_0x01b8
            r5 = r6
            X.7A8 r5 = (X.AnonymousClass7A8) r5
            int r3 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x01b8
            int r3 = r3 - r1
            r5.label = r3
        L_0x01a8:
            java.lang.Object r1 = r5.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x01be
            if (r0 == r4) goto L_0x01ff
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x01b8:
            X.7A8 r5 = new X.7A8
            r5.<init>(r2, r6)
            goto L_0x01a8
        L_0x01be:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r3 = r2.A00
            X.05G r3 = (X.AnonymousClass05G) r3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r2.A01
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r1 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r1
            r0 = 0
            X.5az r0 = com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel.A01(r1, r10, r0)
            r5.label = r4
            java.lang.Object r0 = r3.B6N(r0, r5)
            goto L_0x021b
        L_0x01d7:
            boolean r0 = r6 instanceof X.AnonymousClass7A7
            if (r0 == 0) goto L_0x01f9
            r4 = r6
            X.7A7 r4 = (X.AnonymousClass7A7) r4
            int r3 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x01f9
            int r3 = r3 - r1
            r4.label = r3
        L_0x01e9:
            java.lang.Object r1 = r4.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x0204
            if (r0 == r3) goto L_0x01ff
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x01f9:
            X.7A7 r4 = new X.7A7
            r4.<init>(r2, r6)
            goto L_0x01e9
        L_0x01ff:
            X.AnonymousClass0AN.A00(r1)
            goto L_0x0028
        L_0x0204:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r1 = r2.A00
            X.05G r1 = (X.AnonymousClass05G) r1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = r2.A01
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r0
            X.5az r0 = com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel.A01(r0, r10, r3)
            r4.label = r3
            java.lang.Object r0 = r1.B6N(r0, r4)
        L_0x021b:
            if (r0 != r6) goto L_0x0028
            return r6
        L_0x021e:
            X.9gk r3 = X.AnonymousClass9AO.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Received update to streaming status - isStreamingActive = "
            java.lang.String r1 = X.AnonymousClass000.A0l(r10, r0, r1)
            java.lang.String r0 = "sup:DeviceStreamingStatus"
            r3.A01(r0, r1)
            java.lang.Object r0 = r2.A01
            X.0fG r0 = (X.C10810fG) r0
            r0.element = r10
            r0 = 0
            boolean r0 = X.C36371kC.A1X(r10, r0)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r2.A00
            X.040 r1 = (X.AnonymousClass040) r1
            r0 = 0
            X.C009403z.A03(r0, r1)
            goto L_0x0028
        L_0x0246:
            X.0no r10 = (X.C15680no) r10
            boolean r0 = r10 instanceof X.C136706er
            if (r0 == 0) goto L_0x034c
            java.lang.Object r4 = r2.A01
            X.6eU r4 = (X.C136496eU) r4
            X.6er r10 = (X.C136706er) r10
            java.lang.Object r5 = r2.A00
            X.040 r5 = (X.AnonymousClass040) r5
            boolean r0 = r4 instanceof X.C93514gg
            if (r0 == 0) goto L_0x029d
            X.4gg r4 = (X.C93514gg) r4
            boolean r3 = X.C36331k8.A1a(r10, r5)
            X.76d r6 = r4.A01
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x026a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0283
            java.lang.Object r1 = X.C36351kA.A0u(r2)
            androidx.compose.material.ripple.RippleAnimation r1 = (androidx.compose.material.ripple.RippleAnimation) r1
            X.7n5 r0 = r1.A07
            X.C90474aD.A11(r0, r3)
            X.0sO r1 = r1.A09
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.B3E(r0)
            goto L_0x026a
        L_0x0283:
            r3 = 0
            long r1 = r10.A00
            X.6Xf r0 = new X.6Xf
            r0.<init>(r1)
            androidx.compose.material.ripple.RippleAnimation r1 = new androidx.compose.material.ripple.RippleAnimation
            r1.<init>(r0)
            r6.put(r10, r1)
            androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2 r0 = new androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2
            r0.<init>(r10, r4, r1, r3)
            X.C36331k8.A1T(r0, r5)
            goto L_0x0028
        L_0x029d:
            X.4gh r4 = (X.C93524gh) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r10, r0)
            X.4dq r7 = r4.A02
            r8 = 0
            X.5nb r6 = r7.A02
            java.util.Map r5 = r6.A01
            java.lang.Object r9 = r5.get(r4)
            X.4dW r9 = (X.C92314dW) r9
            if (r9 != 0) goto L_0x02f2
            java.util.List r1 = r7.A04
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0346
            r9 = 0
        L_0x02be:
            X.4dW r9 = (X.C92314dW) r9
            if (r9 != 0) goto L_0x02ea
            int r2 = r7.A00
            java.util.List r1 = r7.A03
            X.AnonymousClass00C.A0D(r1, r8)
            int r0 = X.C36431kI.A07(r1)
            if (r2 <= r0) goto L_0x031b
            android.content.Context r0 = X.C36371kC.A0B(r7)
            X.4dW r9 = new X.4dW
            r9.<init>(r0)
            r7.addView(r9)
            r1.add(r9)
        L_0x02de:
            int r1 = r7.A00
            int r0 = r7.A01
            int r0 = r0 + -1
            if (r1 >= r0) goto L_0x0318
            int r0 = r1 + 1
            r7.A00 = r0
        L_0x02ea:
            r5.put(r4, r9)
            java.util.Map r0 = r6.A00
            r0.put(r9, r4)
        L_0x02f2:
            long r14 = r4.A01
            int r13 = r4.A00
            X.7dn r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            X.6Xx r0 = (X.C133336Xx) r0
            long r0 = r0.A00
            X.7dn r2 = r4.A06
            java.lang.Object r2 = r2.getValue()
            X.6Br r2 = (X.C128296Br) r2
            float r12 = r2.A03
            X.00S r11 = r4.A07
            r16 = r0
            r9.A03(r10, r11, r12, r13, r14, r16)
            X.7n5 r0 = r4.A04
            r0.setValue(r9)
            goto L_0x0028
        L_0x0318:
            r7.A00 = r8
            goto L_0x02ea
        L_0x031b:
            int r0 = r7.A00
            java.lang.Object r9 = r1.get(r0)
            X.4dW r9 = (X.C92314dW) r9
            X.AnonymousClass00C.A0D(r9, r8)
            java.util.Map r3 = r6.A00
            java.lang.Object r2 = r3.get(r9)
            X.4gh r2 = (X.C93524gh) r2
            if (r2 == 0) goto L_0x02de
            r1 = 0
            X.7n5 r0 = r2.A04
            r0.setValue(r1)
            java.lang.Object r0 = r5.get(r2)
            if (r0 == 0) goto L_0x033f
            r3.remove(r0)
        L_0x033f:
            r5.remove(r2)
            r9.A00()
            goto L_0x02de
        L_0x0346:
            java.lang.Object r9 = r1.remove(r8)
            goto L_0x02be
        L_0x034c:
            boolean r0 = r10 instanceof X.C136716es
            if (r0 == 0) goto L_0x037b
            java.lang.Object r4 = r2.A01
            X.6eU r4 = (X.C136496eU) r4
            X.6es r10 = (X.C136716es) r10
            X.6er r1 = r10.A00
        L_0x0358:
            boolean r0 = r4 instanceof X.C93514gg
            if (r0 == 0) goto L_0x0388
            X.4gg r4 = (X.C93514gg) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.76d r0 = r4.A01
            java.lang.Object r2 = r0.get(r1)
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            if (r2 == 0) goto L_0x0028
            r1 = 1
            X.7n5 r0 = r2.A07
            X.C90474aD.A11(r0, r1)
            X.0sO r1 = r2.A09
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.B3E(r0)
            goto L_0x0028
        L_0x037b:
            boolean r0 = r10 instanceof X.C136696eq
            java.lang.Object r4 = r2.A01
            X.6eU r4 = (X.C136496eU) r4
            if (r0 == 0) goto L_0x0399
            X.6eq r10 = (X.C136696eq) r10
            X.6er r1 = r10.A00
            goto L_0x0358
        L_0x0388:
            X.4gh r4 = (X.C93524gh) r4
            X.7n5 r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.4dW r0 = (X.C92314dW) r0
            if (r0 == 0) goto L_0x0028
            r0.A01()
            goto L_0x0028
        L_0x0399:
            java.lang.Object r3 = r2.A00
            X.040 r3 = (X.AnonymousClass040) r3
            X.C36321k7.A0w(r10, r3)
            X.5uA r2 = r4.A00
            boolean r1 = r10 instanceof X.C136646el
            if (r1 != 0) goto L_0x0468
            boolean r0 = r10 instanceof X.C136686ep
            if (r0 == 0) goto L_0x0439
            java.util.List r4 = r2.A03
            r0 = r10
            X.6ep r0 = (X.C136686ep) r0
            X.6el r0 = r0.A00
        L_0x03b1:
            r4.remove(r0)
        L_0x03b4:
            java.lang.Object r6 = X.C007103b.A0O(r4)
            X.0no r6 = (X.C15680no) r6
            X.0no r0 = r2.A00
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x0028
            r5 = 0
            if (r6 == 0) goto L_0x0417
            if (r1 == 0) goto L_0x03f7
            X.7dn r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.6Br r0 = (X.C128296Br) r0
            float r7 = r0.A02
        L_0x03d1:
            X.6eD r0 = X.C129496Hf.A00
            boolean r0 = r6 instanceof X.C136646el
            if (r0 != 0) goto L_0x03f4
            boolean r0 = r6 instanceof X.C136636ek
            if (r0 != 0) goto L_0x03df
            boolean r0 = r6 instanceof X.C136626ej
            if (r0 == 0) goto L_0x03f4
        L_0x03df:
            X.7dY r1 = X.C113945gO.A01
            r0 = 45
            X.6eD r4 = new X.6eD
            r4.<init>(r1, r0)
        L_0x03e8:
            androidx.compose.material.ripple.StateLayer$handleInteraction$1 r0 = new androidx.compose.material.ripple.StateLayer$handleInteraction$1
            r0.<init>(r4, r2, r5, r7)
        L_0x03ed:
            X.C36331k8.A1T(r0, r3)
            r2.A00 = r6
            goto L_0x0028
        L_0x03f4:
            X.6eD r4 = X.C129496Hf.A00
            goto L_0x03e8
        L_0x03f7:
            boolean r0 = r10 instanceof X.C136636ek
            if (r0 == 0) goto L_0x0406
            X.7dn r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.6Br r0 = (X.C128296Br) r0
            float r7 = r0.A01
            goto L_0x03d1
        L_0x0406:
            boolean r0 = r10 instanceof X.C136626ej
            if (r0 == 0) goto L_0x0415
            X.7dn r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.6Br r0 = (X.C128296Br) r0
            float r7 = r0.A00
            goto L_0x03d1
        L_0x0415:
            r7 = 0
            goto L_0x03d1
        L_0x0417:
            X.0no r1 = r2.A00
            X.6eD r0 = X.C129496Hf.A00
            boolean r0 = r1 instanceof X.C136646el
            if (r0 != 0) goto L_0x0436
            boolean r0 = r1 instanceof X.C136636ek
            if (r0 != 0) goto L_0x0436
            boolean r0 = r1 instanceof X.C136626ej
            if (r0 == 0) goto L_0x0436
            X.7dY r1 = X.C113945gO.A01
            r0 = 150(0x96, float:2.1E-43)
            X.6eD r4 = new X.6eD
            r4.<init>(r1, r0)
        L_0x0430:
            androidx.compose.material.ripple.StateLayer$handleInteraction$2 r0 = new androidx.compose.material.ripple.StateLayer$handleInteraction$2
            r0.<init>(r4, r2, r5)
            goto L_0x03ed
        L_0x0436:
            X.6eD r4 = X.C129496Hf.A00
            goto L_0x0430
        L_0x0439:
            boolean r0 = r10 instanceof X.C136636ek
            if (r0 != 0) goto L_0x0468
            boolean r0 = r10 instanceof X.C136676eo
            if (r0 == 0) goto L_0x044a
            java.util.List r4 = r2.A03
            r0 = r10
            X.6eo r0 = (X.C136676eo) r0
            X.6ek r0 = r0.A00
            goto L_0x03b1
        L_0x044a:
            boolean r0 = r10 instanceof X.C136626ej
            if (r0 != 0) goto L_0x0468
            boolean r0 = r10 instanceof X.C136666en
            if (r0 == 0) goto L_0x045b
            java.util.List r4 = r2.A03
            r0 = r10
            X.6en r0 = (X.C136666en) r0
            X.6ej r0 = r0.A00
            goto L_0x03b1
        L_0x045b:
            boolean r0 = r10 instanceof X.C136656em
            if (r0 == 0) goto L_0x0028
            java.util.List r4 = r2.A03
            r0 = r10
            X.6em r0 = (X.C136656em) r0
            X.6ej r0 = r0.A00
            goto L_0x03b1
        L_0x0468:
            java.util.List r4 = r2.A03
            r4.add(r10)
            goto L_0x03b4
        L_0x046f:
            X.0no r10 = (X.C15680no) r10
            boolean r0 = r10 instanceof X.C136706er
            if (r0 == 0) goto L_0x0483
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            r0.add(r10)
        L_0x047c:
            java.lang.Object r1 = r2.A00
            X.7n5 r1 = (X.C161547n5) r1
            java.lang.Object r0 = r2.A01
            goto L_0x04ce
        L_0x0483:
            boolean r0 = r10 instanceof X.C136716es
            if (r0 == 0) goto L_0x0493
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            X.6es r10 = (X.C136716es) r10
            X.6er r0 = r10.A00
        L_0x048f:
            r1.remove(r0)
            goto L_0x047c
        L_0x0493:
            boolean r0 = r10 instanceof X.C136696eq
            if (r0 == 0) goto L_0x047c
            java.lang.Object r1 = r2.A01
            java.util.List r1 = (java.util.List) r1
            X.6eq r10 = (X.C136696eq) r10
            X.6er r0 = r10.A00
            goto L_0x048f
        L_0x04a0:
            X.0no r10 = (X.C15680no) r10
            boolean r0 = r10 instanceof X.C136646el
            if (r0 != 0) goto L_0x04d9
            boolean r0 = r10 instanceof X.C136686ep
            if (r0 == 0) goto L_0x04c8
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            X.6ep r10 = (X.C136686ep) r10
            X.6el r0 = r10.A00
            goto L_0x04c5
        L_0x04b3:
            X.0no r10 = (X.C15680no) r10
            boolean r0 = r10 instanceof X.C136636ek
            if (r0 != 0) goto L_0x04d9
            boolean r0 = r10 instanceof X.C136676eo
            if (r0 == 0) goto L_0x04c8
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            X.6eo r10 = (X.C136676eo) r10
            X.6ek r0 = r10.A00
        L_0x04c5:
            r1.remove(r0)
        L_0x04c8:
            java.lang.Object r1 = r2.A01
            X.7n5 r1 = (X.C161547n5) r1
            java.lang.Object r0 = r2.A00
        L_0x04ce:
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.C36401kF.A1a(r0)
            X.C90474aD.A11(r1, r0)
            goto L_0x0028
        L_0x04d9:
            java.lang.Object r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            r0.add(r10)
            goto L_0x04c8
        L_0x04e1:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164247rV.B6N(java.lang.Object, X.09x):java.lang.Object");
    }

    public C164247rV(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
