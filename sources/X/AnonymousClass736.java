package X;

/* renamed from: X.736  reason: invalid class name */
public class AnonymousClass736 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass736(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, Object obj3, int i) {
        r1.Boy(new AnonymousClass736(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:181:0x057c, code lost:
        if (r9 <= 0) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x064c, code lost:
        if (r3 == false) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0789, code lost:
        r3.A0R.A0a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x078e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0b98, code lost:
        if (r2.equals("video") != false) goto L_0x0be6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0bc0, code lost:
        if (r2.equals("image") == false) goto L_0x0b9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0bc9, code lost:
        if (r2.equals("audio") == false) goto L_0x0b9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0bdb, code lost:
        if (r6 != 29) goto L_0x0b9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0ca4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0ca8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0cb4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0cb8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0d21, code lost:
        r7.A0H(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0d24, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0e1c, code lost:
        r1.A01(new X.C22728Aui(r4, r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0e24, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0bad  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0bef  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0c13  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0c19  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0c1c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r0 = r28
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0dab;
                case 1: goto L_0x0d7e;
                case 2: goto L_0x0d5c;
                case 3: goto L_0x027b;
                case 4: goto L_0x0d25;
                case 5: goto L_0x0d03;
                case 6: goto L_0x0cda;
                case 7: goto L_0x0cca;
                case 8: goto L_0x0b3a;
                case 9: goto L_0x0b2b;
                case 10: goto L_0x0234;
                case 11: goto L_0x01cd;
                case 12: goto L_0x0b12;
                case 13: goto L_0x0ac7;
                case 14: goto L_0x018f;
                case 15: goto L_0x014d;
                case 16: goto L_0x0aa7;
                case 17: goto L_0x0123;
                case 18: goto L_0x0a60;
                case 19: goto L_0x0a3b;
                case 20: goto L_0x0a05;
                case 21: goto L_0x00f5;
                case 22: goto L_0x09f0;
                case 23: goto L_0x00b5;
                case 24: goto L_0x09b6;
                case 25: goto L_0x0086;
                case 26: goto L_0x0967;
                case 27: goto L_0x0939;
                case 28: goto L_0x08eb;
                case 29: goto L_0x08ba;
                case 30: goto L_0x08aa;
                case 31: goto L_0x085c;
                case 32: goto L_0x080a;
                case 33: goto L_0x07f8;
                case 34: goto L_0x07d0;
                case 35: goto L_0x078f;
                case 36: goto L_0x0777;
                case 37: goto L_0x0763;
                case 38: goto L_0x0746;
                case 39: goto L_0x005e;
                case 40: goto L_0x0736;
                case 41: goto L_0x0021;
                case 42: goto L_0x0720;
                case 43: goto L_0x06b6;
                case 44: goto L_0x04bb;
                case 45: goto L_0x03ab;
                case 46: goto L_0x02ec;
                case 47: goto L_0x02c4;
                case 48: goto L_0x02b1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A00
            X.3UB r3 = (X.AnonymousClass3UB) r3
            java.lang.Object r2 = r0.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r1 = r0.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.17Y r0 = r3.A0S
            r0.A0G(r2)
            r1.run()
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r3.A04
            r0.pause()
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r4 = r0.A00
            com.whatsapp.picker.search.StickerSearchDialogFragment r4 = (com.whatsapp.picker.search.StickerSearchDialogFragment) r4
            java.lang.Object r3 = r0.A01
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            r4.A0C = r0
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = r4.A0D
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x0020
            int r0 = r3.length()
            java.lang.String r5 = r3.toString()
            if (r0 != 0) goto L_0x0dd6
            r4.A0D = r5
            X.1uy r1 = r4.A1k()
            r0 = 0
            r1.A00 = r0
            r0 = 4
            r2.setVisibility(r0)
            X.1uy r0 = r4.A1k()
            r0.A0S()
            com.whatsapp.picker.search.StickerSearchDialogFragment.A05(r4)
            return
        L_0x005e:
            java.lang.Object r4 = r0.A00
            X.7yq r4 = (X.C167797yq) r4
            java.lang.Object r3 = r0.A01
            X.9lY r3 = (X.C202319lY) r3
            java.lang.Object r2 = r0.A02
            X.9lY r2 = (X.C202319lY) r2
            X.0wo r0 = r4.A0O
            long r0 = X.C19970wo.A00(r0)
            r3.A06 = r0
            X.1Ed r1 = r4.A0R
            java.lang.String r0 = r2.A0L
            r1.A0c(r3, r2, r0)
            boolean r0 = r1.A0Z()
            if (r0 != 0) goto L_0x0020
            X.1Db r1 = r4.A0U
            r0 = 0
            r1.A0O(r0)
            return
        L_0x0086:
            java.lang.Object r4 = r0.A00
            X.9lC r4 = (X.C202179lC) r4
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            r4.A05(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x0099:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r2 = r3.next()
            X.00I r2 = (X.AnonymousClass00I) r2
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x0099
            X.9lY r0 = (X.C202319lY) r0
            java.lang.String r1 = r0.A0K
            java.lang.Object r0 = r2.A01
            X.3Qa r0 = (X.C64933Qa) r0
            X.C202179lC.A02(r4, r0, r1)
            goto L_0x0099
        L_0x00b5:
            java.lang.Object r2 = r0.A00
            X.3fU r2 = (X.C70643fU) r2
            java.lang.Object r5 = r0.A01
            X.6zU r5 = (X.C148826zU) r5
            java.lang.Object r4 = r0.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            boolean r3 = X.C90514aH.A1Y(r4)
            X.1V6 r8 = r2.A07
            boolean r0 = r8.A0B()
            if (r0 != 0) goto L_0x0020
            int r1 = X.C148826zU.A12
            r0 = 1
            r5.A0C(r1, r3, r0)
            X.0v0 r1 = r2.A08
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            X.AnonymousClass3UR.A0B(r1, r0)
            X.6zU r1 = r8.A00()
            if (r1 == 0) goto L_0x00e5
            r0 = 1
            r1.A0S = r0
        L_0x00e5:
            X.0ts r9 = r2.A09
            android.view.View r3 = r2.A00
            X.1RY r7 = r2.A05
            X.0wQ r4 = r2.A02
            X.16D r5 = r2.A03
            X.171 r6 = r2.A04
            X.AnonymousClass3UR.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00f5:
            java.lang.Object r2 = r0.A01
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r1 = r0.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 2131434092(0x7f0b1a6c, float:1.8489988E38)
            java.lang.Object r0 = r2.getTag(r0)
            boolean r0 = X.C36341k9.A1Z(r0)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x011b
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            if (r1 == 0) goto L_0x011b
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 == 0) goto L_0x011b
            r2.setImageBitmap(r0)
        L_0x011b:
            r1 = 0
            r0 = 2131434092(0x7f0b1a6c, float:1.8489988E38)
            r2.setTag(r0, r1)
            return
        L_0x0123:
            java.lang.Object r1 = r0.A00
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r3 = r0.A01
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r0.A02
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            r0 = 0
            X.C36321k7.A0v(r1, r0, r2)
            java.lang.Object r1 = r1.get()
            X.0V2 r1 = (X.AnonymousClass0V2) r1
            if (r1 == 0) goto L_0x0020
            int r0 = r3.intValue()
            r1.A00 = r0
            java.lang.Object r0 = r2.get()
            X.0CP r0 = (X.AnonymousClass0CP) r0
            if (r0 == 0) goto L_0x0020
            r0.A0g(r1)
            return
        L_0x014d:
            java.lang.Object r3 = r0.A00
            X.3nv r3 = (X.C75863nv) r3
            java.lang.Object r4 = r0.A01
            X.1Uw r4 = (X.C28981Uw) r4
            java.lang.Object r1 = r0.A02
            X.0fG r1 = (X.C10810fG) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r1 = r1.element
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0020
            r1.size()
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            java.lang.String r6 = r0.A01
            X.AnonymousClass00C.A07(r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x017f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e17
            X.3T1 r0 = X.C36391kE.A0l(r2)
            long r0 = r0.A1O
            X.C36391kE.A1W(r5, r0)
            goto L_0x017f
        L_0x018f:
            java.lang.Object r3 = r0.A00
            X.3nu r3 = (X.C75853nu) r3
            java.lang.Object r4 = r0.A01
            X.1Uw r4 = (X.C28981Uw) r4
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0020
            r1.size()
            java.lang.Object r0 = X.C36391kE.A0t(r1)
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            java.lang.String r6 = r0.A01
            X.AnonymousClass00C.A07(r6)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r1.iterator()
        L_0x01bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e1a
            X.3T1 r0 = X.C36391kE.A0l(r2)
            long r0 = r0.A1O
            X.C36391kE.A1W(r5, r0)
            goto L_0x01bd
        L_0x01cd:
            java.lang.Object r2 = r0.A00
            X.9cw r2 = (X.C198119cw) r2
            java.lang.Object r1 = r0.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.Object r7 = r0.A02
            X.3Qa r7 = (X.C64933Qa) r7
            X.0xM r0 = r2.A00
            r0.A0h(r1)
            X.1aP r6 = r2.A02
            X.005 r0 = r6.A00
            java.util.Iterator r8 = X.C90474aD.A0q(r0)
        L_0x01e6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r5 = r8.next()
            X.6Ew r5 = (X.C129086Ew) r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = "/resolveOrphanMessagesForParentKey"
            X.C36321k7.A1a(r1, r0)
            java.util.LinkedHashSet r4 = X.C36441kJ.A17()
            r3 = 1
            r0 = -1
        L_0x0209:
            r2 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r1 = r5.A02(r7, r2, r0)
            r5.A04(r1, r4)
            int r0 = r1.size()
            if (r0 >= r2) goto L_0x0219
            r3 = 0
        L_0x0219:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0230
            java.lang.Object r0 = X.C007103b.A0N(r1)
            X.9XS r0 = (X.AnonymousClass9XS) r0
            java.lang.Long r0 = r0.A07
            if (r0 == 0) goto L_0x0230
            long r0 = r0.longValue()
            if (r3 == 0) goto L_0x0230
            goto L_0x0209
        L_0x0230:
            r6.A00(r4)
            goto L_0x01e6
        L_0x0234:
            java.lang.Object r1 = r0.A00
            X.755 r1 = (X.AnonymousClass755) r1
            java.lang.Object r6 = r0.A01
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r5 = r0.A02
            X.6AQ r5 = (X.AnonymousClass6AQ) r5
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0020
            java.lang.Object r4 = r1.A01
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            X.01I r0 = r4.A0i()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0020
            if (r6 == 0) goto L_0x0264
            com.whatsapp.mediaview.PhotoView r3 = r5.A00
            X.2bU r2 = r5.A01
            android.content.res.Resources r1 = X.C36341k9.A0G(r4)
            X.1lG r0 = new X.1lG
            r0.<init>(r1, r6, r2)
            r3.A09(r0)
        L_0x0264:
            X.2bU r2 = r4.A1R
            if (r2 == 0) goto L_0x0020
            X.2bU r0 = r5.A01
            X.3Qa r1 = r0.A1J
            X.3Qa r0 = r2.A1J
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r0 = 1
            r4.A1u = r0
            com.whatsapp.mediaview.MediaViewFragment.A0I(r4)
            return
        L_0x027b:
            java.lang.Object r3 = r0.A00
            X.6wC r3 = (X.C146806wC) r3
            java.lang.Object r1 = r0.A01
            X.6Fh r1 = (X.C129126Fh) r1
            java.lang.Object r2 = r0.A02
            X.6FL r2 = (X.AnonymousClass6FL) r2
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r1.A0I
            android.view.View r0 = r0.A02
            if (r0 != 0) goto L_0x0294
            java.lang.String r0 = "titleBar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0294:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r1.A02()
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r3.A0K
            r0 = 1
            r1.A04(r0)
            r2.A00()
            r2.A01()
            r1 = 1284(0x504, float:1.799E-42)
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r3.A0N
            r0.setSystemUiVisibility(r1)
            return
        L_0x02b1:
            java.lang.Object r3 = r0.A00
            X.3UB r3 = (X.AnonymousClass3UB) r3
            java.lang.Object r2 = r0.A01
            X.00r r2 = (X.C001600r) r2
            java.lang.Object r1 = r0.A02
            X.04S r1 = (X.AnonymousClass04S) r1
            r0 = 0
            r3.A0B = r0
            r2.A0B(r1)
            return
        L_0x02c4:
            java.lang.Object r4 = r0.A00
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r0.A01
            X.1XY r3 = (X.AnonymousClass1XY) r3
            java.lang.Object r2 = r0.A02
            X.1X4 r2 = (X.AnonymousClass1X4) r2
            int r1 = r4.A1I
            boolean r0 = X.C66013Ui.A0J(r1)
            if (r0 != 0) goto L_0x02e6
            boolean r0 = X.C66013Ui.A0K(r1)
            if (r0 != 0) goto L_0x02e6
            r0 = 82
            if (r1 == r0) goto L_0x02e6
            r2.A0U(r4)
            return
        L_0x02e6:
            X.2bU r4 = (X.AnonymousClass2bU) r4
            r3.A05(r4)
            return
        L_0x02ec:
            java.lang.Object r4 = r0.A00
            X.5vO r4 = (X.C122765vO) r4
            java.lang.Object r5 = r0.A01
            X.5xL r5 = (X.C123945xL) r5
            java.lang.Object r2 = r0.A02
            X.5wW r2 = (X.C123455wW) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            r0 = 2
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r7.<init>(r0)
            com.whatsapp.jid.UserJid r6 = r4.A00
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0320
            r7.countDown()
        L_0x030b:
            X.61D r8 = r5.A04
            X.5ml r0 = r5.A03
            X.0yC r3 = r0.A00
            r0 = 2696(0xa88, float:3.778E-42)
            boolean r1 = r3.A0E(r0)
            X.6xM r0 = new X.6xM
            r0.<init>(r5, r7)
            r8.A00(r6, r0, r1)
            goto L_0x034c
        L_0x0320:
            X.5qv r3 = r5.A02
            X.5qu r8 = new X.5qu
            r8.<init>(r5, r7)
            X.5ml r0 = r3.A01
            X.0yC r1 = r0.A00
            r0 = 2024(0x7e8, float:2.836E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x033e
            r1 = 0
            X.5xL r0 = r8.A00
            r0.A01 = r1
            java.util.concurrent.CountDownLatch r0 = r8.A01
            r0.countDown()
            goto L_0x030b
        L_0x033e:
            X.5kq r0 = r3.A00
            X.1KK r3 = r0.A00
            r1 = 0
            X.7e5 r0 = new X.7e5
            r0.<init>(r8, r1)
            r3.A0B(r0, r6)
            goto L_0x030b
        L_0x034c:
            r7.await()     // Catch:{ InterruptedException -> 0x03a4 }
            r0 = 2697(0xa89, float:3.78E-42)
            boolean r0 = r3.A0E(r0)     // Catch:{ InterruptedException -> 0x03a4 }
            if (r0 == 0) goto L_0x0371
            java.lang.String r6 = r6.getRawString()     // Catch:{ InterruptedException -> 0x03a4 }
        L_0x035b:
            java.lang.String r7 = r5.A00     // Catch:{ InterruptedException -> 0x03a4 }
            java.lang.String r8 = r5.A01     // Catch:{ InterruptedException -> 0x03a4 }
            java.lang.String r9 = r4.A01     // Catch:{ InterruptedException -> 0x03a4 }
            boolean r0 = r4.A02     // Catch:{ InterruptedException -> 0x03a4 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException -> 0x03a4 }
            X.6L7 r4 = new X.6L7     // Catch:{ InterruptedException -> 0x03a4 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ InterruptedException -> 0x03a4 }
            int r1 = r2.A00     // Catch:{ InterruptedException -> 0x03a4 }
            if (r1 == 0) goto L_0x0382
            goto L_0x0373
        L_0x0371:
            r6 = 0
            goto L_0x035b
        L_0x0373:
            r0 = 1
            if (r1 == r0) goto L_0x038e
            X.6TX r0 = r2.A04     // Catch:{ InterruptedException -> 0x03a4 }
            X.5to r3 = r0.A00     // Catch:{ InterruptedException -> 0x03a4 }
            int r5 = r2.A02     // Catch:{ InterruptedException -> 0x03a4 }
            int r6 = r2.A01     // Catch:{ InterruptedException -> 0x03a4 }
            long r7 = r2.A03     // Catch:{ InterruptedException -> 0x03a4 }
            r9 = 4
            goto L_0x0399
        L_0x0382:
            X.6TX r0 = r2.A04     // Catch:{ InterruptedException -> 0x03a4 }
            X.5to r3 = r0.A00     // Catch:{ InterruptedException -> 0x03a4 }
            int r5 = r2.A02     // Catch:{ InterruptedException -> 0x03a4 }
            int r6 = r2.A01     // Catch:{ InterruptedException -> 0x03a4 }
            long r7 = r2.A03     // Catch:{ InterruptedException -> 0x03a4 }
            r9 = 2
            goto L_0x0399
        L_0x038e:
            X.6TX r0 = r2.A04     // Catch:{ InterruptedException -> 0x03a4 }
            X.5to r3 = r0.A00     // Catch:{ InterruptedException -> 0x03a4 }
            int r5 = r2.A02     // Catch:{ InterruptedException -> 0x03a4 }
            int r6 = r2.A01     // Catch:{ InterruptedException -> 0x03a4 }
            long r7 = r2.A03     // Catch:{ InterruptedException -> 0x03a4 }
            r9 = 3
        L_0x0399:
            X.73g r2 = new X.73g     // Catch:{ InterruptedException -> 0x03a4 }
            r2.<init>(r3, r4, r5, r6, r7, r9)     // Catch:{ InterruptedException -> 0x03a4 }
            X.0wU r0 = r3.A01     // Catch:{ InterruptedException -> 0x03a4 }
            r0.Boy(r2)     // Catch:{ InterruptedException -> 0x03a4 }
            return
        L_0x03a4:
            r1 = move-exception
            java.lang.String r0 = "CatalogOperationsQplEventAnnotations creation interrupted"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x03ab:
            java.lang.Object r4 = r0.A00
            X.6FH r4 = (X.AnonymousClass6FH) r4
            java.lang.Object r3 = r0.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r0 = r0.A02
            r20 = r0
            boolean r6 = X.C90514aH.A1Y(r20)
            java.lang.String r2 = r4.A03()
            if (r2 != 0) goto L_0x03e5
            java.util.HashSet r0 = X.C36441kJ.A16()
        L_0x03c5:
            java.util.HashSet r11 = X.C90524aI.A0k(r3)
            java.util.HashSet r1 = X.C36441kJ.A16()
            java.util.Iterator r7 = r0.iterator()
        L_0x03d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03ea
            java.lang.Object r5 = r7.next()
            boolean r0 = r11.remove(r5)
            if (r0 != 0) goto L_0x03d1
            r1.add(r5)
            goto L_0x03d1
        L_0x03e5:
            java.util.HashSet r0 = r4.A04()
            goto L_0x03c5
        L_0x03ea:
            X.19A r0 = r4.A00
            r19 = r0
            java.lang.String r17 = r19.A09()
            java.lang.String r0 = r4.A01
            r18 = r0
            java.lang.String r5 = "category"
            java.lang.String r10 = "id"
            r9 = 1
            r8 = 2
            r7 = 3
            java.lang.String r12 = "action"
            java.lang.String r0 = "add"
            X.1AL r15 = new X.1AL
            r15.<init>((java.lang.String) r12, (java.lang.String) r0)
            java.lang.String r0 = "remove"
            X.1AL r14 = new X.1AL
            r14.<init>((java.lang.String) r12, (java.lang.String) r0)
            java.util.ArrayList r13 = X.C36351kA.A0z(r11)
            java.util.Iterator r16 = r11.iterator()
        L_0x0415:
            boolean r0 = r16.hasNext()
            java.lang.String r12 = "jid"
            if (r0 == 0) goto L_0x042e
            java.lang.Object r11 = r16.next()
            com.whatsapp.jid.Jid r11 = (com.whatsapp.jid.Jid) r11
            X.1AL[] r0 = new X.AnonymousClass1AL[r8]
            r0[r6] = r15
            X.C90504aG.A1E(r11, r12, r0, r9)
            r13.add(r0)
            goto L_0x0415
        L_0x042e:
            java.util.ArrayList r11 = X.C36351kA.A0z(r1)
            java.util.Iterator r15 = r1.iterator()
        L_0x0436:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x044d
            java.lang.Object r1 = r15.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            X.1AL[] r0 = new X.AnonymousClass1AL[r8]
            r0[r6] = r14
            X.C90504aG.A1E(r1, r12, r0, r9)
            r11.add(r0)
            goto L_0x0436
        L_0x044d:
            java.util.ArrayList r0 = X.C007103b.A0S(r11, r13)
            java.util.ArrayList r13 = X.C36351kA.A0z(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0459:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0470
            java.lang.Object r11 = r12.next()
            X.1AL[] r11 = (X.AnonymousClass1AL[]) r11
            java.lang.String r1 = "user"
            X.9nx r0 = new X.9nx
            r0.<init>(r1, r11)
            r13.add(r0)
            goto L_0x0459
        L_0x0470:
            X.9nx[] r0 = new X.C203399nx[r6]
            java.lang.Object[] r1 = r13.toArray(r0)
            X.9nx[] r1 = (X.C203399nx[]) r1
            r0 = r18
            X.1AL[] r0 = X.AnonymousClass3MB.A00(r0, r2)
            X.9nx r2 = new X.9nx
            r2.<init>((java.lang.String) r5, (X.AnonymousClass1AL[]) r0, (X.C203399nx[]) r1)
            r0 = 0
            java.lang.String r1 = "privacy"
            X.9nx r5 = new X.9nx
            r5.<init>((X.C203399nx) r2, (java.lang.String) r1, (X.AnonymousClass1AL[]) r0)
            r0 = 4
            X.1AL[] r2 = new X.AnonymousClass1AL[r0]
            r0 = r17
            X.C36341k9.A1L(r10, r0, r2, r6)
            X.C36341k9.A1V(r2, r9)
            java.lang.String r0 = "xmlns"
            X.C36341k9.A1L(r0, r1, r2, r8)
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C36341k9.A1L(r1, r0, r2, r7)
            X.9nx r2 = X.C36391kE.A0m(r5, r2)
            X.7tG r1 = new X.7tG
            r0 = r20
            r1.<init>(r3, r0, r4, r7)
            int r4 = r4.A00(r6)
            r5 = 32000(0x7d00, double:1.581E-319)
            r0 = r19
            r3 = r17
            r0.A0F(r1, r2, r3, r4, r5)
            return
        L_0x04bb:
            java.lang.Object r6 = r0.A00
            X.5HK r6 = (X.AnonymousClass5HK) r6
            java.lang.Object r1 = r0.A01
            java.lang.Object r5 = r0.A02
            java.util.Map r5 = (java.util.Map) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.lang.Object r4 = r6.A05
            monitor-enter(r4)
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x06b3 }
            r6.A03 = r0     // Catch:{ all -> 0x06b3 }
            if (r1 == 0) goto L_0x04d7
            r0.add(r1)     // Catch:{ all -> 0x06b3 }
        L_0x04d7:
            int r0 = r5.size()     // Catch:{ all -> 0x06b3 }
            r3 = 1
            if (r0 == r3) goto L_0x051b
            r3 = 0
            X.2bS r0 = r6.A01()     // Catch:{ all -> 0x06b3 }
            X.3Qa r0 = r0.A1J     // Catch:{ all -> 0x06b3 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x06b3 }
            if (r0 == 0) goto L_0x051b
            X.2bS r0 = r6.A01()     // Catch:{ all -> 0x06b3 }
            java.util.List r1 = r0.A05     // Catch:{ all -> 0x06b3 }
            int r0 = r1.size()     // Catch:{ all -> 0x06b3 }
            if (r0 <= 0) goto L_0x050a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x06b3 }
            r7 = 0
        L_0x04fa:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06b3 }
            if (r0 == 0) goto L_0x050b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06b3 }
            X.3PS r0 = (X.AnonymousClass3PS) r0     // Catch:{ all -> 0x06b3 }
            int r0 = r0.A00     // Catch:{ all -> 0x06b3 }
            int r7 = r7 + r0
            goto L_0x04fa
        L_0x050a:
            r7 = 0
        L_0x050b:
            java.util.List r2 = r6.A03     // Catch:{ all -> 0x06b3 }
            X.2bS r0 = r6.A01()     // Catch:{ all -> 0x06b3 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x06b3 }
            X.6xH r0 = new X.6xH     // Catch:{ all -> 0x06b3 }
            r0.<init>(r3, r7, r1, r3)     // Catch:{ all -> 0x06b3 }
            r2.add(r0)     // Catch:{ all -> 0x06b3 }
        L_0x051b:
            X.2bS r0 = r6.A01()     // Catch:{ all -> 0x06b3 }
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x06b3 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x06b3 }
            int r15 = X.C131546Pm.A00(r0)     // Catch:{ all -> 0x06b3 }
            X.2bS r0 = r6.A01()     // Catch:{ all -> 0x06b3 }
            java.util.List r1 = r0.A05     // Catch:{ all -> 0x06b3 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x06b3 }
            r0 = 17
            java.util.List r0 = X.C163907qx.A00(r1, r0)     // Catch:{ all -> 0x06b3 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x06b3 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x06b3 }
        L_0x053f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x06b3 }
            if (r0 == 0) goto L_0x0558
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x06b3 }
            r0 = r1
            X.3PS r0 = (X.AnonymousClass3PS) r0     // Catch:{ all -> 0x06b3 }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x06b3 }
            boolean r0 = r5.containsKey(r0)     // Catch:{ all -> 0x06b3 }
            if (r0 == 0) goto L_0x053f
            r7.add(r1)     // Catch:{ all -> 0x06b3 }
            goto L_0x053f
        L_0x0558:
            java.util.Iterator r18 = r7.iterator()     // Catch:{ all -> 0x06b3 }
        L_0x055c:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x06b3 }
            if (r0 == 0) goto L_0x06a6
            java.lang.Object r2 = r18.next()     // Catch:{ all -> 0x06b3 }
            X.3PS r2 = (X.AnonymousClass3PS) r2     // Catch:{ all -> 0x06b3 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x06b3 }
            java.util.List r11 = r6.A03     // Catch:{ all -> 0x06b3 }
            long r0 = r2.A01     // Catch:{ all -> 0x06b3 }
            java.lang.String r10 = r2.A03     // Catch:{ all -> 0x06b3 }
            X.AnonymousClass00C.A08(r10)     // Catch:{ all -> 0x06b3 }
            int r9 = r2.A00     // Catch:{ all -> 0x06b3 }
            int r8 = r6.A00     // Catch:{ all -> 0x06b3 }
            if (r15 != r9) goto L_0x057e
            r25 = 1
            if (r9 > 0) goto L_0x0580
        L_0x057e:
            r25 = 0
        L_0x0580:
            X.6xI r7 = new X.6xI     // Catch:{ all -> 0x06b3 }
            r19 = r7
            r20 = r10
            r21 = r9
            r22 = r8
            r23 = r0
            r26 = r3
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x06b3 }
            r11.add(r7)     // Catch:{ all -> 0x06b3 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x06b3 }
            java.util.List r17 = X.C90524aI.A0o(r0, r5)     // Catch:{ all -> 0x06b3 }
            if (r17 == 0) goto L_0x055c
            long r7 = r2.A01     // Catch:{ all -> 0x06b3 }
            int r1 = r2.A00     // Catch:{ all -> 0x06b3 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x06b3 }
            java.util.Map r9 = r6.A05     // Catch:{ all -> 0x06b3 }
            java.lang.Long r12 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x06b3 }
            java.util.List r9 = X.C90524aI.A0o(r12, r9)     // Catch:{ all -> 0x06b3 }
            if (r9 == 0) goto L_0x05b3
            r0.addAll(r9)     // Catch:{ all -> 0x06b3 }
        L_0x05b3:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x06b3 }
            java.util.Iterator r16 = r17.iterator()     // Catch:{ all -> 0x06b3 }
        L_0x05bb:
            boolean r10 = r16.hasNext()     // Catch:{ all -> 0x06b3 }
            if (r10 == 0) goto L_0x05f2
            java.lang.Object r10 = r16.next()     // Catch:{ all -> 0x06b3 }
            X.6CR r10 = (X.AnonymousClass6CR) r10     // Catch:{ all -> 0x06b3 }
            long r13 = r10.A02     // Catch:{ all -> 0x06b3 }
            long r25 = X.C36391kE.A0B(r13)     // Catch:{ all -> 0x06b3 }
            X.141 r11 = r10.A00     // Catch:{ all -> 0x06b3 }
            if (r11 == 0) goto L_0x05bb
            r21 = 0
            java.lang.CharSequence r10 = r10.A01     // Catch:{ all -> 0x06b3 }
            if (r10 == 0) goto L_0x05dd
            java.lang.String r23 = r10.toString()     // Catch:{ all -> 0x06b3 }
            if (r23 != 0) goto L_0x05df
        L_0x05dd:
            java.lang.String r23 = ""
        L_0x05df:
            java.lang.String r24 = ""
            r27 = 0
            X.6xJ r10 = new X.6xJ     // Catch:{ all -> 0x06b3 }
            r20 = r11
            r22 = r12
            r19 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r27)     // Catch:{ all -> 0x06b3 }
            r9.add(r10)     // Catch:{ all -> 0x06b3 }
            goto L_0x05bb
        L_0x05f2:
            r0.addAll(r9)     // Catch:{ all -> 0x06b3 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x06b3 }
            java.util.Iterator r14 = r17.iterator()     // Catch:{ all -> 0x06b3 }
        L_0x05fd:
            boolean r10 = r14.hasNext()     // Catch:{ all -> 0x06b3 }
            if (r10 == 0) goto L_0x0629
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x06b3 }
            X.6CR r12 = (X.AnonymousClass6CR) r12     // Catch:{ all -> 0x06b3 }
            long r10 = r12.A02     // Catch:{ all -> 0x06b3 }
            long r21 = X.C36391kE.A0B(r10)     // Catch:{ all -> 0x06b3 }
            X.141 r10 = r12.A00     // Catch:{ all -> 0x06b3 }
            if (r10 != 0) goto L_0x05fd
            X.13w r10 = r12.A03     // Catch:{ all -> 0x06b3 }
            X.141 r11 = new X.141     // Catch:{ all -> 0x06b3 }
            r11.<init>(r10)     // Catch:{ all -> 0x06b3 }
            X.6xG r10 = new X.6xG     // Catch:{ all -> 0x06b3 }
            r19 = r10
            r20 = r11
            r23 = r7
            r19.<init>(r20, r21, r23)     // Catch:{ all -> 0x06b3 }
            r13.add(r10)     // Catch:{ all -> 0x06b3 }
            goto L_0x05fd
        L_0x0629:
            r0.addAll(r13)     // Catch:{ all -> 0x06b3 }
            r10 = 5
            if (r3 != 0) goto L_0x0634
            r11 = 5
            if (r10 <= r1) goto L_0x0633
            r11 = r1
        L_0x0633:
            r1 = r11
        L_0x0634:
            int r12 = r17.size()     // Catch:{ all -> 0x06b3 }
            r11 = 0
            if (r1 >= r12) goto L_0x063f
            java.util.List r0 = r0.subList(r11, r1)     // Catch:{ all -> 0x06b3 }
        L_0x063f:
            boolean r1 = X.C36401kF.A1a(r9)     // Catch:{ all -> 0x06b3 }
            if (r1 == 0) goto L_0x064e
            boolean r1 = X.C36401kF.A1a(r13)     // Catch:{ all -> 0x06b3 }
            if (r1 == 0) goto L_0x064e
            r14 = 1
            if (r3 != 0) goto L_0x064f
        L_0x064e:
            r14 = 0
        L_0x064f:
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x06b3 }
            r9 = 0
        L_0x0654:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x06b3 }
            if (r0 == 0) goto L_0x0691
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x06b3 }
            X.7l5 r12 = (X.C160487l5) r12     // Catch:{ all -> 0x06b3 }
            if (r14 == 0) goto L_0x068b
            if (r11 != 0) goto L_0x0676
            int r1 = r12.BJ9()     // Catch:{ all -> 0x06b3 }
            r0 = 2
            if (r1 != r0) goto L_0x0676
            java.util.List r1 = r6.A03     // Catch:{ all -> 0x06b3 }
            X.6xE r0 = new X.6xE     // Catch:{ all -> 0x06b3 }
            r0.<init>(r7, r10)     // Catch:{ all -> 0x06b3 }
            r1.add(r0)     // Catch:{ all -> 0x06b3 }
            r11 = 1
        L_0x0676:
            if (r9 != 0) goto L_0x068b
            int r1 = r12.BJ9()     // Catch:{ all -> 0x06b3 }
            r0 = 4
            if (r1 != r0) goto L_0x068b
            java.util.List r9 = r6.A03     // Catch:{ all -> 0x06b3 }
            r1 = 6
            X.6xE r0 = new X.6xE     // Catch:{ all -> 0x06b3 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x06b3 }
            r9.add(r0)     // Catch:{ all -> 0x06b3 }
            r9 = 1
        L_0x068b:
            java.util.List r0 = r6.A03     // Catch:{ all -> 0x06b3 }
            r0.add(r12)     // Catch:{ all -> 0x06b3 }
            goto L_0x0654
        L_0x0691:
            if (r3 != 0) goto L_0x055c
            int r0 = r2.A00     // Catch:{ all -> 0x06b3 }
            if (r0 <= r10) goto L_0x055c
            java.util.List r8 = r6.A03     // Catch:{ all -> 0x06b3 }
            long r0 = r2.A01     // Catch:{ all -> 0x06b3 }
            r7 = -1
            X.6xF r2 = new X.6xF     // Catch:{ all -> 0x06b3 }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x06b3 }
            r8.add(r2)     // Catch:{ all -> 0x06b3 }
            goto L_0x055c
        L_0x06a6:
            X.00s r1 = r6.A06     // Catch:{ all -> 0x06b3 }
            java.util.List r0 = r6.A03     // Catch:{ all -> 0x06b3 }
            java.util.ArrayList r0 = X.C36361kB.A0q(r0)     // Catch:{ all -> 0x06b3 }
            r1.A0C(r0)     // Catch:{ all -> 0x06b3 }
            monitor-exit(r4)
            return
        L_0x06b3:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x06b6:
            java.lang.Object r6 = r0.A00
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            java.lang.Object r9 = r0.A01
            X.2ps r9 = (X.C52612ps) r9
            java.lang.Object r8 = r0.A02
            X.64b r8 = (X.C1264564b) r8
            r3 = 0
            r7 = 1
            X.3Qa r0 = r6.A1J
            X.11F r1 = r0.A00
            if (r1 == 0) goto L_0x070e
            X.1Jr r0 = r8.A01
            java.util.LinkedHashMap r0 = r0.A00(r1)
            java.util.Collection r2 = r0.values()
            int r1 = r2.size()
            X.1Ju r0 = r8.A03
            int r0 = r0.A00()
            if (r1 < r0) goto L_0x070e
            java.lang.Object r10 = X.C007103b.A0J(r2)
            X.3T1 r10 = (X.AnonymousClass3T1) r10
            X.AnonymousClass00C.A0B(r10)
            r8.A00(r10, r3, r3)
            X.5J2 r2 = r10.A1V
            if (r2 == 0) goto L_0x070e
            X.3PQ r5 = r8.A02
            r4 = 40
            X.0wo r1 = r8.A00
            boolean r0 = r2.A1f(r1)
            if (r0 != 0) goto L_0x071d
            long r2 = r2.A00
            long r0 = X.C19970wo.A00(r1)
            long r2 = r2 - r0
            long r0 = X.C36391kE.A0B(r2)
        L_0x0707:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01(r10, r0, r4)
        L_0x070e:
            int r2 = r9.A00()
            r8.A00(r6, r7, r2)
            X.3PQ r1 = r8.A02
            r0 = 37
            r1.A00(r6, r0, r2)
            return
        L_0x071d:
            r0 = 0
            goto L_0x0707
        L_0x0720:
            java.lang.Object r3 = r0.A00
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r3 = (com.whatsapp.pininchat.banner.PinInChatBannerViewModel) r3
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            r0 = 0
            r3.A00 = r0
            X.1hi r0 = r3.A06
            r0.A0E(r2)
            X.00s r0 = r3.A01
            X.AnonymousClass3R7.A01(r0, r1)
            return
        L_0x0736:
            java.lang.Object r2 = r0.A00
            X.8li r2 = (X.C180388li) r2
            java.lang.Object r1 = r0.A01
            X.9lY r1 = (X.C202319lY) r1
            java.lang.Object r0 = r0.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r2.A01(r1, r0)
            return
        L_0x0746:
            java.lang.Object r4 = r0.A00
            X.7yq r4 = (X.C167797yq) r4
            java.lang.Object r3 = r0.A01
            X.9un r3 = (X.C207249un) r3
            java.lang.Object r2 = r0.A02
            X.9lY r2 = (X.C202319lY) r2
            r0 = 10
            X.9Og r1 = new X.9Og
            r1.<init>(r0)
            r1.A04 = r3
            r1.A05 = r2
            X.1Rs r0 = r4.A08
            r0.A0D(r1)
            return
        L_0x0763:
            java.lang.Object r3 = r0.A00
            X.7yq r3 = (X.C167797yq) r3
            java.lang.Object r1 = r0.A01
            X.8bI r1 = (X.C175928bI) r1
            java.lang.Object r2 = r0.A02
            X.9lY r2 = (X.C202319lY) r2
            X.9jw r0 = r1.A0G
            X.9je r1 = r0.A0C
            r0 = 0
            r1.A05 = r0
            goto L_0x0789
        L_0x0777:
            java.lang.Object r3 = r0.A00
            X.7yq r3 = (X.C167797yq) r3
            java.lang.Object r1 = r0.A01
            X.8bI r1 = (X.C175928bI) r1
            java.lang.Object r2 = r0.A02
            X.9lY r2 = (X.C202319lY) r2
            X.9jw r1 = r1.A0G
            java.lang.String r0 = ""
            r1.A0H = r0
        L_0x0789:
            X.1Ed r0 = r3.A0R
            r0.A0a(r2)
            return
        L_0x078f:
            java.lang.Object r3 = r0.A00
            X.7yZ r3 = (X.C167687yZ) r3
            java.lang.Object r1 = r0.A01
            X.9je r1 = (X.C201459je) r1
            java.lang.Object r0 = r0.A02
            X.9un r0 = (X.C207249un) r0
            if (r1 == 0) goto L_0x07bb
            java.lang.String r0 = "ACCEPT"
            r1.A08 = r0
            java.lang.String r0 = "PENDING"
            r1.A09 = r0
        L_0x07a5:
            X.1EU r0 = r3.A0G
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r1 = r0.A05
            X.9lY r0 = r3.A07
            r1.A0a(r0)
        L_0x07b1:
            X.17Y r7 = r3.A0B
            r0 = 2
            X.72o r6 = new X.72o
            r6.<init>(r3, r0)
            goto L_0x0d21
        L_0x07bb:
            if (r0 == 0) goto L_0x07b1
            X.9lY r2 = r3.A07
            java.lang.String r0 = r0.A0A
            r2.A0H = r0
            X.0wo r0 = r3.A03
            long r0 = X.C19970wo.A00(r0)
            r2.A06 = r0
            r0 = 401(0x191, float:5.62E-43)
            r2.A02 = r0
            goto L_0x07a5
        L_0x07d0:
            java.lang.Object r3 = r0.A00
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r3 = (com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel) r3
            java.lang.Object r6 = r0.A01
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r0.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            X.1Db r2 = r3.A07
            X.0wo r0 = r3.A05
            long r0 = X.C19970wo.A00(r0)
            r2.A0G(r0)
            r0 = 1
            r2.A0D(r0)
            X.1XC r4 = r3.A06
            X.6wk r5 = new X.6wk
            r5.<init>(r3, r6, r7)
            r8 = 0
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9)
            return
        L_0x07f8:
            java.lang.Object r3 = r0.A00
            X.64L r3 = (X.AnonymousClass64L) r3
            java.lang.Object r2 = r0.A01
            X.2bU r2 = (X.AnonymousClass2bU) r2
            java.lang.Object r1 = r0.A02
            X.6vi r1 = (X.C146506vi) r1
            X.1X4 r0 = r3.A01
            r0.A0S(r1, r2)
            return
        L_0x080a:
            java.lang.Object r2 = r0.A00
            X.9ei r2 = (X.C199109ei) r2
            java.lang.Object r5 = r0.A01
            X.54i r5 = (X.C1031954i) r5
            java.lang.Object r4 = r0.A02
            android.app.Activity r4 = (android.app.Activity) r4
            if (r5 == 0) goto L_0x0854
            X.9un r0 = r5.A00
            if (r0 == 0) goto L_0x0854
            X.9ig r1 = X.C201039ig.A00
            X.0yC r0 = r2.A0B
            boolean r0 = r1.A00(r0)
            r3 = 2131888742(0x7f120a66, float:1.9412128E38)
            if (r0 == 0) goto L_0x082c
            r3 = 2131888743(0x7f120a67, float:1.941213E38)
        L_0x082c:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            java.lang.String r0 = r5.A02()
            java.lang.String r1 = X.C36391kE.A0v(r4, r0, r2, r1, r3)
        L_0x0839:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "message"
            r2.putString(r0, r1)
            r0 = 2131888740(0x7f120a64, float:1.9412124E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.String r0 = "title"
            r2.putString(r0, r1)
            r0 = 101(0x65, float:1.42E-43)
            X.AnonymousClass3SJ.A02(r4, r2, r0)
            return
        L_0x0854:
            r0 = 2131888741(0x7f120a65, float:1.9412126E38)
            java.lang.String r1 = r4.getString(r0)
            goto L_0x0839
        L_0x085c:
            java.lang.Object r6 = r0.A00
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r6 = (com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity) r6
            java.lang.Object r8 = r0.A01
            X.11F r8 = (X.AnonymousClass11F) r8
            java.lang.Object r7 = r0.A02
            X.141 r7 = (X.AnonymousClass141) r7
            X.17Y r5 = r6.A05
            android.content.res.Resources r4 = r6.getResources()
            r3 = 2131892449(0x7f1218e1, float:1.9419647E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.171 r1 = r6.A04
            X.16D r0 = r6.A02
            X.141 r0 = r0.A0D(r8)
            java.lang.String r0 = r1.A0M(r0)
            r1 = 0
            java.lang.String r0 = X.C36411kG.A0w(r4, r0, r2, r1, r3)
            r5.A0E(r0, r1)
            r6.finish()
            android.os.Bundle r0 = X.C36371kC.A0H(r6)
            if (r0 == 0) goto L_0x08a5
            X.190 r0 = X.C36441kJ.A0j()
            android.os.Bundle r1 = X.C36371kC.A0H(r6)
            android.content.Intent r0 = r0.A1W(r6, r7)
            r0.putExtras(r1)
        L_0x08a1:
            r6.startActivity(r0)
            return
        L_0x08a5:
            android.content.Intent r0 = X.C90504aG.A0G(r6, r7)
            goto L_0x08a1
        L_0x08aa:
            java.lang.Object r2 = r0.A00
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r2 = (com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity) r2
            java.lang.Object r1 = r0.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r0.A02
            android.content.Intent r0 = (android.content.Intent) r0
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity.A01(r0, r1, r2)
            return
        L_0x08ba:
            java.lang.Object r6 = r0.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r6 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r6
            java.lang.Object r5 = r0.A01
            X.2bZ r5 = (X.AnonymousClass2bZ) r5
            java.lang.Object r4 = r0.A02
            X.9lY r4 = (X.C202319lY) r4
            r6.Bnv()
            if (r4 == 0) goto L_0x08e9
            boolean r0 = r4.A0L()
        L_0x08cf:
            r0 = r0 ^ 1
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A0H(r6, r5, r0)
            X.AGg r3 = r6.A3j()
            X.AGg r0 = r6.A3j()
            X.9gv r2 = r0.A06
            X.8yt r1 = X.C188008yt.NONE
            r0 = 0
            X.9Oo r0 = r2.A02(r6, r4, r5, r0)
            r3.A01(r1, r0)
            return
        L_0x08e9:
            r0 = 0
            goto L_0x08cf
        L_0x08eb:
            java.lang.Object r2 = r0.A00
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r2 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r2
            java.lang.Object r3 = r0.A01
            java.lang.Object r4 = r0.A02
            X.1A1 r1 = r2.A0P
            if (r1 == 0) goto L_0x0932
            X.AGg r0 = r2.A3j()
            X.3Qa r0 = r0.A07
            X.3T1 r5 = r1.A03(r0)
            X.2bZ r5 = (X.AnonymousClass2bZ) r5
            r1 = 0
            if (r5 == 0) goto L_0x0930
            X.9uk r0 = r5.A00
            if (r0 == 0) goto L_0x0930
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0930
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0916:
            r2.A0T = r0
            if (r5 == 0) goto L_0x0924
            X.9uk r0 = r5.A00
            if (r0 == 0) goto L_0x0924
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x0924
            java.util.List r1 = r0.A0I
        L_0x0924:
            r2.A0V = r1
            r6 = 5
            X.73N r1 = new X.73N
            r1.<init>(r2, r3, r4, r5, r6)
            r2.runOnUiThread(r1)
            return
        L_0x0930:
            r0 = r1
            goto L_0x0916
        L_0x0932:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0939:
            java.lang.Object r5 = r0.A00
            X.8jG r5 = (X.C179148jG) r5
            java.lang.Object r2 = r0.A01
            com.whatsapp.payments.ui.widget.PaymentView r2 = (com.whatsapp.payments.ui.widget.PaymentView) r2
            java.lang.Object r4 = r0.A02
            X.16X r4 = (X.AnonymousClass16X) r4
            X.1Vk r3 = r5.A0M
            java.lang.String r1 = r2.getPaymentNote()
            java.util.List r0 = r2.getMentionedJids()
            X.2bV r2 = r5.A3j(r1, r0)
            X.11F r1 = r5.A0E
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x0962
            com.whatsapp.jid.UserJid r1 = r5.A0G
        L_0x095d:
            r0 = 0
            r3.A08(r4, r0, r1, r2)
            return
        L_0x0962:
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r1)
            goto L_0x095d
        L_0x0967:
            java.lang.Object r4 = r0.A00
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r6 = r0.A01
            X.5G0 r6 = (X.AnonymousClass5G0) r6
            java.lang.Object r5 = r0.A02
            X.5zt r3 = X.AnonymousClass6KU.A03
            java.lang.String r2 = "query"
            java.lang.Object r1 = r4.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.6KU r2 = r3.A00(r2, r1)
            java.lang.String r0 = "args"
            java.lang.Object r4 = r4.get(r0)
            boolean r1 = r4 instanceof java.util.Map
            r0 = 0
            if (r1 == 0) goto L_0x09b4
            java.util.Map r4 = (java.util.Map) r4
        L_0x0991:
            X.6OV r3 = r6.A01
            java.lang.String r1 = "client"
            java.util.Map r0 = r2.A01
            if (r0 == 0) goto L_0x09b2
            java.lang.Object r2 = r0.get(r1)
            X.6KU r2 = (X.AnonymousClass6KU) r2
        L_0x099f:
            X.0AJ r1 = X.AnonymousClass0AJ.A00
            X.AHf r0 = r3.A00
            java.util.LinkedHashMap r1 = r3.A01(r2, r0, r1, r4)
            X.17Y r7 = r6.A00
            r0 = 21
            X.AVb r6 = new X.AVb
            r6.<init>(r5, r1, r0)
            goto L_0x0d21
        L_0x09b2:
            r2 = 0
            goto L_0x099f
        L_0x09b4:
            r4 = r0
            goto L_0x0991
        L_0x09b6:
            java.lang.Object r4 = r0.A00
            X.5Ff r4 = (X.C105575Ff) r4
            java.lang.Object r2 = r0.A01
            X.9nx r2 = (X.C203399nx) r2
            java.lang.Object r3 = r0.A02
            X.6Jr r3 = (X.C130096Jr) r3
            X.5Fh r0 = r4.A02
            X.1VY r0 = r0.A05
            r1 = 0
            X.9lY r2 = r0.A03(r1, r2)
            if (r2 != 0) goto L_0x09d9
            X.9ky r0 = new X.9ky
            r0.<init>()
            X.C105575Ff.A00(r0, r4)
            X.C130096Jr.A00(r1, r3)
            return
        L_0x09d9:
            X.8lb r1 = r3.A01
            X.1EU r0 = r1.A0Y
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r0 = r0.A05
            r0.A0a(r2)
            X.17Y r7 = r1.A0I
            r0 = 16
            X.72v r6 = new X.72v
            r6.<init>(r3, r2, r0)
            goto L_0x0d21
        L_0x09f0:
            java.lang.Object r1 = r0.A00
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r1 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r1
            java.lang.Object r3 = r0.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            X.1TF r1 = r1.A02
            X.2cW r3 = (X.AnonymousClass2cW) r3
            r0 = 0
            r1.A04(r2, r3, r0)
            return
        L_0x0a05:
            java.lang.Object r6 = r0.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r6 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet) r6
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r0.A02
            X.01I r4 = (X.AnonymousClass01I) r4
            r3 = 0
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            r2 = 2131893729(0x7f121de1, float:1.9422243E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.3On r0 = r6.A1m()
            java.lang.String r0 = r0.A01(r5)
            java.lang.String r2 = X.C36401kF.A0q(r6, r0, r1, r3, r2)
            X.AnonymousClass00C.A08(r2)
            X.2oW r1 = X.C51872oW.REVOKE
            r0 = 0
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r1 = X.C54812tb.A00(r1, r2, r0, r5)
            r1.A00 = r6
            X.01z r0 = r4.getSupportFragmentManager()
            X.C65443Sb.A02(r1, r0)
            return
        L_0x0a3b:
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            if (r4 != 0) goto L_0x0a49
            java.lang.String r0 = "NewsletterAcceptAdminInviteSheet/decode-photo-bytes-returns-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0a49:
            android.view.animation.AlphaAnimation r2 = X.C36371kC.A0L()
            r0 = 100
            r2.setDuration(r0)
            r1 = 13
            X.4Vr r0 = new X.4Vr
            r0.<init>(r4, r3, r1)
            r2.setAnimationListener(r0)
            r3.startAnimation(r2)
            return
        L_0x0a60:
            java.lang.Object r5 = r0.A00
            X.14u r5 = (X.C225314u) r5
            java.lang.Object r4 = r0.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r3 = r0.A02
            X.6Tg r3 = (X.C132366Tg) r3
            r2 = 1
            X.C36321k7.A0v(r4, r2, r3)
            X.15V r1 = r5.A0N
            com.whatsapp.dialogs.ProgressDialogFragment r0 = r1.A00
            if (r0 == 0) goto L_0x0a79
            r0.A1c()
        L_0x0a79:
            r0 = 0
            r1.A00 = r0
            X.3FR r1 = new X.3FR
            r1.<init>(r5)
            r0 = 3
            r1.A02 = r0
            r1.A0H = r4
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            X.C132366Tg.A02(r0, r3)
            r1.A09 = r0
            X.8dw r0 = X.C177528dw.A00
            java.lang.String r0 = r0.getRawString()
            r1.A0D = r0
            r1.A0N = r2
            r1.A0J = r2
            r0 = 25
            r1.A04 = r0
            android.content.Intent r0 = r1.A01()
            r5.startActivity(r0)
            return
        L_0x0aa7:
            java.lang.Object r1 = r0.A00
            X.3Ga r1 = (X.C62403Ga) r1
            java.lang.Object r4 = r0.A01
            X.4TP r4 = (X.AnonymousClass4TP) r4
            java.lang.Object r3 = r0.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.17Y r0 = r1.A01
            r0.A02()
            r1 = 0
            X.2YR r0 = new X.2YR
            r0.<init>(r3, r1)
            java.util.List r0 = X.C36371kC.A11(r0)
            r4.BiG(r0)
            return
        L_0x0ac7:
            java.lang.Object r5 = r0.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r2 = r0.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            boolean r1 = X.C90484aE.A1U(r4)
            X.0wQ r0 = r5.A02
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x0af9
            r0 = 2131888884(0x7f120af4, float:1.9412416E38)
            java.lang.String r3 = r5.getString(r0)
        L_0x0ae7:
            X.AnonymousClass00C.A0B(r3)
            X.01z r2 = r5.getSupportFragmentManager()
            r1 = 0
            X.2oW r0 = X.C51872oW.DISMISS
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C54812tb.A00(r0, r3, r1, r4)
            X.C65443Sb.A02(r0, r2)
            return
        L_0x0af9:
            r2 = 2131888877(0x7f120aed, float:1.9412402E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.3On r0 = r5.A0s
            if (r0 == 0) goto L_0x0b0b
            java.lang.String r0 = r0.A01(r4)
            java.lang.String r3 = X.C36391kE.A0v(r5, r0, r1, r3, r2)
            goto L_0x0ae7
        L_0x0b0b:
            java.lang.String r0 = "newsletterMultiAdminUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0b12:
            java.lang.Object r3 = r0.A00
            X.AX0 r3 = (X.AX0) r3
            java.lang.Object r2 = r0.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.Object r1 = r0.A02
            X.8NL r1 = (X.AnonymousClass8NL) r1
            X.13q r0 = X.AnonymousClass11F.A00
            X.144 r0 = X.AnonymousClass6H4.A00(r2)
            X.C18740tg.A06(r0)
            X.AX0.A00(r0, r3, r1)
            return
        L_0x0b2b:
            java.lang.Object r2 = r0.A01
            X.5NL r2 = (X.AnonymousClass5NL) r2
            java.lang.Object r0 = r0.A02
            java.io.File r0 = (java.io.File) r0
            long r0 = X.AnonymousClass1GX.A02(r0)
            r2.A00 = r0
            return
        L_0x0b3a:
            java.lang.Object r4 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r3 = r0.A01
            X.2bU r3 = (X.AnonymousClass2bU) r3
            java.lang.Object r5 = r0.A02
            java.io.File r5 = (java.io.File) r5
            int r6 = r3.A1I
            java.lang.String r7 = r3.A05
            r2 = 3
            r1 = 2
            r0 = 1
            if (r7 == 0) goto L_0x0bcf
            java.lang.String r1 = "/"
            X.0fN r0 = new X.0fN
            r0.<init>((java.lang.String) r1)
            r6 = 0
            java.util.List r2 = r0.A01(r7, r6)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0bcc
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x0b69:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0bcc
            int r0 = X.C36411kG.A0A(r1)
            if (r0 == 0) goto L_0x0b69
            java.util.List r0 = X.C36411kG.A14(r2, r1)
        L_0x0b79:
            java.lang.String[] r0 = X.C36431kI.A1b(r0)
            r2 = r0[r6]
            int r1 = r2.hashCode()
            r0 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r1 == r0) goto L_0x0bc3
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r1 == r0) goto L_0x0bba
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 != r0) goto L_0x0b9a
            java.lang.String r0 = "video"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0be6
        L_0x0b9a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaViewFragment/handleSave/save-media-unsupported-mimetype-"
            r1.append(r0)
            java.lang.String r0 = r3.A05
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
        L_0x0ba9:
            boolean r0 = r4.A1w
            if (r0 == 0) goto L_0x0bb0
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0bb0:
            X.17Y r2 = r4.A0H
            r1 = 2131893771(0x7f121e0b, float:1.9422328E38)
            r0 = 0
            r2.A07(r1, r0)
            return
        L_0x0bba:
            java.lang.String r0 = "image"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0be2
            goto L_0x0b9a
        L_0x0bc3:
            java.lang.String r0 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0bde
            goto L_0x0b9a
        L_0x0bcc:
            X.09w r0 = X.C023409w.A00
            goto L_0x0b79
        L_0x0bcf:
            if (r6 == r0) goto L_0x0be2
            if (r6 == r1) goto L_0x0bde
            if (r6 == r2) goto L_0x0be6
            r0 = 13
            if (r6 == r0) goto L_0x0be6
            r0 = 29
            if (r6 == r0) goto L_0x0be2
            goto L_0x0b9a
        L_0x0bde:
            r1 = 3
            java.lang.String r9 = android.os.Environment.DIRECTORY_MUSIC
            goto L_0x0be9
        L_0x0be2:
            r1 = 1
            java.lang.String r9 = android.os.Environment.DIRECTORY_PICTURES
            goto L_0x0be9
        L_0x0be6:
            r1 = 2
            java.lang.String r9 = android.os.Environment.DIRECTORY_MOVIES
        L_0x0be9:
            X.AnonymousClass00C.A09(r9)
            r0 = 1
            if (r1 == r0) goto L_0x0c19
            r0 = 2
            if (r1 == r0) goto L_0x0c16
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x0bf4:
            java.lang.String r12 = r5.getName()
            r6 = 0
            r10 = 1
            X.AnonymousClass00C.A0D(r12, r10)
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r9)
            java.lang.String r0 = "WhatsApp"
            java.io.File r8 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x0c1c
            boolean r0 = r8.mkdirs()
            if (r0 != 0) goto L_0x0c1c
            java.lang.String r1 = "MediaViewFragment/handleSave/save-media-destination-file-null"
            goto L_0x0ba9
        L_0x0c16:
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x0bf4
        L_0x0c19:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0bf4
        L_0x0c1c:
            java.io.File r1 = X.C36441kJ.A0w(r8, r12)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0c63
            java.lang.String r7 = "\\."
            X.0fN r0 = new X.0fN
            r0.<init>((java.lang.String) r7)
            r1 = 2
            java.util.List r0 = r0.A01(r12, r1)
            java.lang.String[] r0 = X.C36431kI.A1b(r0)
            r11 = r0[r6]
            java.util.List r0 = X.C90504aG.A0v(r12, r7, r1)
            java.lang.String[] r0 = X.C36431kI.A1b(r0)
            r7 = r0[r10]
        L_0x0c42:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r11)
            r0 = 40
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ")."
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)
            java.io.File r1 = X.C36441kJ.A0w(r8, r0)
            boolean r0 = r1.exists()
            r0 = r0 ^ 1
            int r10 = r10 + 1
            if (r0 != 0) goto L_0x0c63
            goto L_0x0c42
        L_0x0c63:
            java.lang.String r0 = r3.A05
            android.content.ContentValues r1 = X.C111085bi.A00(r1, r9, r0)
            X.0yb r0 = r4.A0d
            X.0ya r0 = r0.A0O()
            if (r2 == 0) goto L_0x0c86
            if (r0 == 0) goto L_0x0c86
            android.content.ContentResolver r0 = X.C21050ya.A00(r0)
            android.net.Uri r2 = r0.insert(r2, r1)
            if (r2 == 0) goto L_0x0cc1
            X.0yb r1 = r4.A0d
            boolean r7 = r4.A1w
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            goto L_0x0c8a
        L_0x0c86:
            java.lang.String r1 = "MediaViewFragment/handleSave/save-media-context-or-media-uri-null"
            goto L_0x0ba9
        L_0x0c8a:
            java.io.FileInputStream r3 = X.C90524aI.A0U(r5)     // Catch:{ Exception -> 0x0cb9 }
            X.0ya r0 = r1.A0O()     // Catch:{ all -> 0x0cb2 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0cb2 }
            java.io.OutputStream r2 = r0.A07(r2)     // Catch:{ all -> 0x0cb2 }
            if (r2 == 0) goto L_0x0ca9
            X.AnonymousClass6YY.A0J(r3, r2)     // Catch:{ all -> 0x0ca2 }
            r2.close()     // Catch:{ all -> 0x0cb2 }
            goto L_0x0ca9
        L_0x0ca2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0ca4 }
        L_0x0ca4:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0cb2 }
            throw r0     // Catch:{ all -> 0x0cb2 }
        L_0x0ca9:
            r3.close()     // Catch:{ Exception -> 0x0cb9 }
            X.17Y r1 = r4.A0H
            r0 = 2131893772(0x7f121e0c, float:1.942233E38)
            goto L_0x0cc6
        L_0x0cb2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0cb4 }
        L_0x0cb4:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ Exception -> 0x0cb9 }
            throw r0     // Catch:{ Exception -> 0x0cb9 }
        L_0x0cb9:
            r1 = move-exception
            if (r7 == 0) goto L_0x0cc1
            java.lang.String r0 = "mediasave/save-media-io-exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0cc1:
            X.17Y r1 = r4.A0H
            r0 = 2131893771(0x7f121e0b, float:1.9422328E38)
        L_0x0cc6:
            r1.A07(r0, r6)
            return
        L_0x0cca:
            java.lang.Object r2 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            java.lang.Object r1 = r0.A01
            X.2bU r1 = (X.AnonymousClass2bU) r1
            java.lang.Object r0 = r0.A02
            android.content.Intent r0 = (android.content.Intent) r0
            com.whatsapp.mediaview.MediaViewFragment.A0A(r0, r2, r1)
            return
        L_0x0cda:
            java.lang.Object r4 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r3 = r0.A01
            X.3Qa r3 = (X.C64933Qa) r3
            java.lang.Object r2 = r0.A02
            int r1 = r4.A03
            X.4Up r0 = r4.A1C
            if (r0 == 0) goto L_0x0cf4
            X.2bU r1 = r0.BE2(r1)
            if (r1 == 0) goto L_0x0cf4
            X.3Qa r0 = r1.A1J
            if (r0 == r3) goto L_0x0cfa
        L_0x0cf4:
            X.1A1 r0 = r4.A1e
            X.3T1 r1 = r0.A03(r3)
        L_0x0cfa:
            X.17Y r7 = r4.A0H
            r0 = 7
            X.736 r6 = new X.736
            r6.<init>(r4, r1, r2, r0)
            goto L_0x0d21
        L_0x0d03:
            java.lang.Object r3 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r1 = r0.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r2 = r0.A02
            X.16D r0 = r3.A0S
            X.141 r1 = r0.A0D(r1)
            X.171 r0 = r3.A0W
            java.lang.String r1 = X.C36381kD.A0v(r0, r1)
            X.17Y r7 = r3.A0H
            r0 = 1
            X.74m r6 = new X.74m
            r6.<init>(r3, r2, r1, r0)
        L_0x0d21:
            r7.A0H(r6)
            return
        L_0x0d25:
            java.lang.Object r2 = r0.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            java.lang.Object r3 = r0.A01
            java.lang.Object r5 = r0.A02
            X.1A1 r1 = r2.A1e
            X.3Qa r0 = r2.A1Q
            X.3T1 r1 = r1.A03(r0)
            boolean r0 = r1 instanceof X.AnonymousClass2bZ
            if (r0 != 0) goto L_0x0d4d
            X.1A1 r1 = r2.A1e
            X.3Qa r0 = r2.A1Q
            X.3T1 r4 = r1.A03(r0)
        L_0x0d41:
            X.17Y r0 = r2.A0H
            r6 = 1
            X.73N r1 = new X.73N
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0H(r1)
            return
        L_0x0d4d:
            boolean r0 = X.C203369nr.A09(r1)
            if (r0 == 0) goto L_0x0d5a
            int r0 = r2.A02
            X.3T1 r4 = X.C203369nr.A02(r1, r0)
            goto L_0x0d41
        L_0x0d5a:
            r4 = 0
            goto L_0x0d41
        L_0x0d5c:
            java.lang.Object r3 = r0.A00
            X.5NL r3 = (X.AnonymousClass5NL) r3
            java.lang.Object r2 = r0.A01
            com.whatsapp.mediacomposer.MediaComposerFragment r2 = (com.whatsapp.mediacomposer.MediaComposerFragment) r2
            java.lang.Object r1 = r0.A02
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.1GX r0 = r2.A0P
            if (r0 == 0) goto L_0x0d77
            long r0 = X.AnonymousClass1GX.A02(r1)
            r3.A00 = r0
            return
        L_0x0d77:
            java.lang.String r0 = "mediaFileUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0d7e:
            java.lang.Object r4 = r0.A00
            X.6LY r4 = (X.AnonymousClass6LY) r4
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r0.A02
            X.00r r3 = (X.C001600r) r3
            r0 = 0
            X.C36321k7.A0v(r4, r0, r3)
            X.5tc r2 = new X.5tc
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0d97:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0da7
            java.lang.Object r0 = r1.next()
            android.net.Uri r0 = (android.net.Uri) r0
            X.AnonymousClass6LY.A00(r0, r2, r4)
            goto L_0x0d97
        L_0x0da7:
            r3.A0C(r2)
            return
        L_0x0dab:
            java.lang.Object r5 = r0.A00
            X.6Sm r5 = (X.C132166Sm) r5
            java.lang.Object r4 = r0.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r0.A02
            X.3ty r3 = (X.C79593ty) r3
            X.1Je r2 = r5.A01
            long r0 = r4.A1N
            byte[] r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0dc3
            r4.A1b = r0
        L_0x0dc3:
            X.6AK r0 = X.C132166Sm.A00(r5, r4)
            if (r0 == 0) goto L_0x0dcd
            r3.A0C(r0)
            return
        L_0x0dcd:
            X.5V8 r0 = new X.5V8
            r0.<init>()
            r3.A0D(r0)
            return
        L_0x0dd6:
            X.1uy r0 = r4.A1k()
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r0.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0e09
            X.1uy r3 = r4.A1k()
            r2 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r3.A03
            r0 = 1
            X.66P r0 = r1.A00(r5, r0, r0)
            r0.A00(r3)
            android.view.View r0 = r4.A00
            int r1 = X.C36411kG.A04(r0)
            com.google.android.material.tabs.TabLayout r0 = r4.A04
            if (r0 == 0) goto L_0x0dff
            r0.setVisibility(r1)
        L_0x0dff:
            androidx.viewpager.widget.ViewPager r0 = r4.A03
            if (r0 == 0) goto L_0x0e0c
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x0e0c
        L_0x0e09:
            r4.A0D = r5
            return
        L_0x0e0c:
            com.whatsapp.picker.search.StickerSearchDialogFragment.A06(r4, r2)
            androidx.viewpager.widget.ViewPager r0 = r4.A03
            if (r0 == 0) goto L_0x0e09
            r0.setVisibility(r1)
            goto L_0x0e09
        L_0x0e17:
            X.164 r1 = r3.A03
            goto L_0x0e1c
        L_0x0e1a:
            X.164 r1 = r3.A03
        L_0x0e1c:
            X.Aui r0 = new X.Aui
            r0.<init>(r4, r6, r5)
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass736.run():void");
    }
}
