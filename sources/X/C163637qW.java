package X;

/* renamed from: X.7qW  reason: invalid class name and case insensitive filesystem */
public class C163637qW implements AnonymousClass02G {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C163637qW(Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
    }

    public void BcA(int i) {
        boolean z;
        if (i != 0) {
            z = true;
            if (i != 1) {
                return;
            }
        } else {
            z = false;
        }
        this.A01 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcC(int r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            java.lang.Object r5 = r7.A00
            if (r0 == 0) goto L_0x006a
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet r5 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet) r5
            X.4kY r1 = r5.A0H
            if (r1 == 0) goto L_0x0068
            java.util.List r0 = r1.A04
            int r0 = r0.size()
            if (r0 <= r8) goto L_0x0068
            if (r8 < 0) goto L_0x0068
            java.util.List r0 = r1.A04
            java.lang.Object r4 = r0.get(r8)
            X.5q5 r4 = (X.C119575q5) r4
        L_0x001e:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0052
            if (r4 == 0) goto L_0x003e
            X.5q5 r0 = r5.A0G
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass6R3.A02(r0)
            if (r0 == 0) goto L_0x003e
            int r3 = r0.intValue()
            X.6O1 r2 = r5.A0D
            if (r2 == 0) goto L_0x00dd
            r1 = 6
        L_0x0037:
            int r0 = X.AnonymousClass6R3.A01(r4)
            X.AnonymousClass6O1.A01(r2, r0, r1, r3)
        L_0x003e:
            r5.A0G = r4
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r1 = X.C90514aH.A0b(r5)
            java.util.List r0 = r1.A04
            java.lang.Object r0 = X.C007103b.A0P(r0, r8)
            X.5q5 r0 = (X.C119575q5) r0
            if (r0 == 0) goto L_0x0051
            r1.A0S(r0)
        L_0x0051:
            return
        L_0x0052:
            if (r4 == 0) goto L_0x003e
            X.5q5 r0 = r5.A0G
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r0 = X.AnonymousClass6R3.A02(r0)
            if (r0 == 0) goto L_0x003e
            int r3 = r0.intValue()
            X.6O1 r2 = r5.A0D
            if (r2 == 0) goto L_0x00e4
            r1 = 1
            goto L_0x0037
        L_0x0068:
            r4 = 0
            goto L_0x001e
        L_0x006a:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r5 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r5
            X.4kY r1 = r5.A09
            if (r1 == 0) goto L_0x00db
            java.util.List r0 = r1.A04
            int r0 = r0.size()
            if (r0 <= r8) goto L_0x00db
            if (r8 < 0) goto L_0x00db
            java.util.List r0 = r1.A04
            java.lang.Object r4 = r0.get(r8)
            X.5q5 r4 = (X.C119575q5) r4
        L_0x0082:
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00c1
            if (r4 == 0) goto L_0x00aa
            X.5q5 r6 = r5.A08
            if (r6 == 0) goto L_0x00aa
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r5.getExpressionsViewModel()
            r1 = 3
            X.63V r0 = r0.A09
            r0.A00(r6, r4, r1)
            boolean r0 = r5.A0O
            if (r0 != 0) goto L_0x00aa
            X.6O1 r3 = r5.getExpressionUserJourneyLogger()
            r2 = 6
        L_0x009f:
            int r1 = X.AnonymousClass6R3.A00(r6)
            int r0 = X.AnonymousClass6R3.A01(r4)
            X.AnonymousClass6O1.A01(r3, r0, r2, r1)
        L_0x00aa:
            r0 = 0
            r5.A0O = r0
            r5.A08 = r4
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r1 = r5.getExpressionsViewModel()
            java.util.List r0 = r1.A04
            java.lang.Object r0 = X.C007103b.A0P(r0, r8)
            X.5q5 r0 = (X.C119575q5) r0
            if (r0 == 0) goto L_0x0051
            r1.A0S(r0)
            return
        L_0x00c1:
            if (r4 == 0) goto L_0x00aa
            X.5q5 r6 = r5.A08
            if (r6 == 0) goto L_0x00aa
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r5.getExpressionsViewModel()
            r1 = 4
            X.63V r0 = r0.A09
            r0.A00(r6, r4, r1)
            boolean r0 = r5.A0O
            if (r0 != 0) goto L_0x00aa
            X.6O1 r3 = r5.getExpressionUserJourneyLogger()
            r2 = 1
            goto L_0x009f
        L_0x00db:
            r4 = 0
            goto L_0x0082
        L_0x00dd:
            java.lang.String r0 = "expressionUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00e4:
            java.lang.String r0 = "expressionUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163637qW.BcC(int):void");
    }

    public void BcB(int i, float f, int i2) {
    }
}
