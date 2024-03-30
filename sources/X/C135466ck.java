package X;

import android.view.View;

/* renamed from: X.6ck  reason: invalid class name and case insensitive filesystem */
public class C135466ck implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C135466ck(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C135466ck(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0490, code lost:
        r1 = r1.A00;
        r0 = java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0496, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0499, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x068e, code lost:
        r1.A0h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0691, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06bb, code lost:
        r0.Bw7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x072f, code lost:
        if (r0.intValue() == 3) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x084f, code lost:
        if (r1 != true) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0965, code lost:
        r2 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0968, code lost:
        if (r2 == 0) goto L_0x0975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x096a, code lost:
        if (r2 == 1) goto L_0x0970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x096d, code lost:
        if (r2 == 2) goto L_0x0975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x096f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0970, code lost:
        r3.setLocationMode(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0974, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0975, code lost:
        r3.setLocationMode(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0978, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x09ab, code lost:
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x09ae, code lost:
        if (r2 == 0) goto L_0x09bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x09b0, code lost:
        if (r2 == 1) goto L_0x09b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x09b3, code lost:
        if (r2 == 2) goto L_0x09bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x09b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x09b6, code lost:
        r3.setLocationMode(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x09ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x09bb, code lost:
        r3.setLocationMode(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x09be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r1 = r1.A03;
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x09a0;
                case 1: goto L_0x095a;
                case 2: goto L_0x08a1;
                case 3: goto L_0x0692;
                case 4: goto L_0x0654;
                case 5: goto L_0x0638;
                case 6: goto L_0x0600;
                case 7: goto L_0x0897;
                case 8: goto L_0x088f;
                case 9: goto L_0x0886;
                case 10: goto L_0x087e;
                case 11: goto L_0x0874;
                case 12: goto L_0x083c;
                case 13: goto L_0x054c;
                case 14: goto L_0x052a;
                case 15: goto L_0x0834;
                case 16: goto L_0x082c;
                case 17: goto L_0x0824;
                case 18: goto L_0x081c;
                case 19: goto L_0x0814;
                case 20: goto L_0x080c;
                case 21: goto L_0x07f7;
                case 22: goto L_0x0506;
                case 23: goto L_0x04df;
                case 24: goto L_0x049a;
                case 25: goto L_0x047b;
                case 26: goto L_0x0026;
                case 27: goto L_0x0017;
                case 28: goto L_0x000f;
                case 29: goto L_0x0417;
                case 30: goto L_0x0718;
                case 31: goto L_0x0252;
                case 32: goto L_0x0208;
                case 33: goto L_0x01ba;
                case 34: goto L_0x0078;
                case 35: goto L_0x002f;
                case 36: goto L_0x002f;
                case 37: goto L_0x0710;
                case 38: goto L_0x0708;
                case 39: goto L_0x06fc;
                case 40: goto L_0x06f4;
                case 41: goto L_0x06ec;
                case 42: goto L_0x06e6;
                case 43: goto L_0x06d9;
                case 44: goto L_0x06c7;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x06bf;
                case 48: goto L_0x06b5;
                case 49: goto L_0x06ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A00
            X.5DB r0 = (X.AnonymousClass5DB) r0
            com.whatsapp.migration.transfer.ui.ChatTransferViewModel r0 = r0.A06
            r0.A0V()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r13.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            X.4l7 r1 = r0.A0C
            r0 = 1
            goto L_0x001e
        L_0x0017:
            java.lang.Object r0 = r13.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            X.4l7 r1 = r0.A0C
            r0 = 0
        L_0x001e:
            X.1hi r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0496
        L_0x0026:
            java.lang.Object r0 = r13.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            X.4l7 r1 = r0.A0C
            r0 = 1
            goto L_0x0490
        L_0x002f:
            java.lang.Object r3 = r13.A00
            X.6Fh r3 = (X.C129126Fh) r3
            r2 = 0
            X.AnonymousClass00C.A0D(r3, r2)
            X.66x r5 = r3.A0J
            X.6VT r0 = r3.A0G
            int r4 = r0.A06()
            java.lang.Integer r1 = X.C36431kI.A12()
            r0 = 1
            r5.A02(r1, r0, r4)
            android.animation.AnimatorSet r0 = r3.A03
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
        L_0x0051:
            X.6FL r0 = r3.A05
            if (r0 == 0) goto L_0x08d9
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A00
            X.6wC r0 = r0.A0E
            r1 = 1
            if (r0 == 0) goto L_0x08d9
            X.0u1 r0 = r0.A0Y
            java.lang.Object r0 = r0.get()
            X.6XN r0 = (X.AnonymousClass6XN) r0
            X.4l7 r0 = r0.A0N
            X.1hi r0 = r0.A00
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 != r1) goto L_0x08d9
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            android.app.Activity r0 = X.C36361kB.A06(r0)
            r0.onBackPressed()
            return
        L_0x0078:
            java.lang.Object r6 = r13.A00
            X.6Fh r6 = (X.C129126Fh) r6
            r5 = 0
            X.AnonymousClass00C.A0D(r6, r5)
            android.animation.AnimatorSet r0 = r6.A03
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
        L_0x008a:
            X.6wC r0 = r6.A06
            if (r0 == 0) goto L_0x000e
            android.animation.ValueAnimator r0 = r6.A0E
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x000e
            X.66x r3 = r6.A0J
            r4 = 1
            X.6VT r2 = r6.A0G
            int r1 = r2.A06()
            r0 = 14
            X.C1270866x.A00(r3, r0, r4, r1)
            r2.A0A(r5)
            X.6wC r3 = r6.A06
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r3.A0N
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x000e
            X.6FL r1 = r3.A0I
            boolean r0 = r1 instanceof X.C162857pG
            if (r0 == 0) goto L_0x01a8
            X.7pG r1 = (X.C162857pG) r1
            int r0 = r1.A01
            if (r0 != 0) goto L_0x01a8
            java.lang.Object r2 = r1.A00
            com.whatsapp.mediacomposer.ImageComposerFragment r2 = (com.whatsapp.mediacomposer.ImageComposerFragment) r2
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = r2.A04
            X.6cY r0 = r0.A02
            X.74P r6 = r0.A09
            if (r6 == 0) goto L_0x00e4
            float r7 = r0.A04
            float r8 = r0.A01
            android.view.View r1 = r0.A0L
            int r0 = r1.getWidth()
            int r0 = r0 / 2
            float r9 = (float) r0
            int r0 = X.C36441kJ.A07(r1)
            float r10 = (float) r0
            r11 = 200(0xc8, double:9.9E-322)
            r6.A00(r7, r8, r9, r10, r11)
        L_0x00e4:
            X.01I r0 = r2.A0i()
            X.3FO r6 = new X.3FO
            r6.<init>(r0)
            X.7le r8 = r2.A1a()
            if (r8 == 0) goto L_0x01a8
            X.6wC r0 = r2.A0E
            if (r0 == 0) goto L_0x0120
            X.6FV r0 = r0.A0T
            java.util.List r0 = r0.A04
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x0120
            X.6wC r1 = r2.A0E
            X.6OT r0 = r1.A0O
            android.graphics.RectF r10 = r0.A07
            android.graphics.RectF r9 = r0.A08
            if (r10 == 0) goto L_0x0120
            if (r9 == 0) goto L_0x0120
            int r7 = r0.A02
            X.6FV r0 = r1.A0T
            java.util.List r1 = r0.A04
            X.6VQ r0 = new X.6VQ
            r0.<init>(r10, r9, r1, r7)
            java.lang.String r0 = r0.A02()
            if (r0 == 0) goto L_0x0120
            r6.A0B = r0
        L_0x0120:
            X.6WR r0 = r2.A05
            int r0 = r0.A01
            r6.A02 = r0
            r6.A0I = r5
            r6.A0E = r5
            r6.A0F = r5
            boolean r7 = r2.A09
            X.0yC r1 = r2.A0A
            r0 = 1576(0x628, float:2.208E-42)
            if (r7 == 0) goto L_0x0136
            r0 = 2654(0xa5e, float:3.719E-42)
        L_0x0136:
            int r0 = r1.A07(r0)
            r6.A03 = r0
            android.net.Uri r1 = r2.A00
            if (r1 == 0) goto L_0x015c
            X.0y0 r0 = r2.A01
            java.io.File r0 = X.C105005Cx.A01(r1, r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r6.A0A = r0
            android.net.Uri r0 = r2.A00
            X.6QO r0 = X.C132366Tg.A01(r0, r8)
            java.io.File r0 = r0.A08()
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r6.A09 = r0
        L_0x015c:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            java.lang.String r0 = r0.toString()
            r6.A0C = r0
            X.01I r0 = r2.A0h()
            r7 = 1
            if (r0 == 0) goto L_0x01b8
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "origin"
            int r1 = r1.getIntExtra(r0, r4)
            r0 = 35
            if (r1 != r0) goto L_0x01b8
        L_0x0179:
            if (r7 == 0) goto L_0x017f
            r6.A00 = r4
            r6.A01 = r4
        L_0x017f:
            android.net.Uri r0 = r2.A00
            X.6QO r0 = X.C132366Tg.A01(r0, r8)
            android.graphics.Rect r0 = r0.A04()
            if (r0 == 0) goto L_0x018d
            r6.A08 = r0
        L_0x018d:
            int r0 = com.whatsapp.mediacomposer.ImageComposerFragment.A06(r2)
            r6.A05 = r0
            android.net.Uri r1 = r2.A00
            java.lang.String r0 = "flip-h"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x019f
            r6.A0G = r4
        L_0x019f:
            r2.A07 = r4
            android.content.Intent r0 = r6.A00()
            r2.startActivityForResult(r0, r4)
        L_0x01a8:
            X.C146806wC.A01(r3)
            X.64m r0 = r3.A0P
            r0.A02 = r5
            X.6FV r1 = r3.A0T
            r0 = 0
            r1.A01 = r0
            X.C146806wC.A03(r3)
            return
        L_0x01b8:
            r7 = 0
            goto L_0x0179
        L_0x01ba:
            java.lang.Object r6 = r13.A00
            X.6Fh r6 = (X.C129126Fh) r6
            r5 = 0
            X.AnonymousClass00C.A0D(r6, r5)
            android.animation.AnimatorSet r0 = r6.A03
            if (r0 == 0) goto L_0x01cc
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
        L_0x01cc:
            android.animation.ValueAnimator r0 = r6.A0E
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x000e
            X.66x r4 = r6.A0J
            X.6VT r3 = r6.A0G
            int r2 = r3.A06()
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r4.A02(r0, r1, r2)
            X.00s r0 = r3.A06
            int r0 = X.C36341k9.A07(r0)
            if (r0 != r1) goto L_0x01fd
            r3.A0A(r5)
            X.6wC r0 = r6.A06
            if (r0 == 0) goto L_0x000e
            r0.A08()
            return
        L_0x01fd:
            r3.A0A(r1)
            X.6wC r0 = r6.A06
            if (r0 == 0) goto L_0x000e
            r0.A07()
            return
        L_0x0208:
            java.lang.Object r5 = r13.A00
            X.6Fh r5 = (X.C129126Fh) r5
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            android.animation.AnimatorSet r0 = r5.A03
            if (r0 == 0) goto L_0x021a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
        L_0x021a:
            android.animation.ValueAnimator r0 = r5.A0E
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x000e
            X.66x r4 = r5.A0J
            r3 = 1
            X.6VT r2 = r5.A0G
            int r1 = r2.A06()
            r0 = 56
            X.C1270866x.A00(r4, r0, r3, r1)
            X.00s r0 = r2.A06
            int r1 = X.C36341k9.A07(r0)
            r0 = 3
            if (r1 != r0) goto L_0x023e
            r0 = 0
        L_0x023e:
            r2.A0A(r0)
            X.6wC r1 = r5.A06
            if (r1 == 0) goto L_0x000e
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A0N
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x000e
            r0 = 0
            X.C146806wC.A05(r1, r0)
            return
        L_0x0252:
            java.lang.Object r5 = r13.A00
            X.6Fh r5 = (X.C129126Fh) r5
            r10 = 0
            X.AnonymousClass00C.A0D(r5, r10)
            android.animation.AnimatorSet r0 = r5.A03
            if (r0 == 0) goto L_0x0264
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
        L_0x0264:
            android.animation.ValueAnimator r0 = r5.A0E
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x000e
            X.66x r4 = r5.A0J
            r2 = 1
            X.6VT r3 = r5.A0G
            int r1 = r3.A06()
            r0 = 48
            X.C1270866x.A00(r4, r0, r2, r1)
            X.00s r1 = r3.A06
            int r0 = X.C36341k9.A07(r1)
            r2 = 5
            if (r0 == r2) goto L_0x000e
            int r1 = X.C36341k9.A07(r1)
            r0 = 2
            if (r1 == r0) goto L_0x000e
            r3.A0A(r2)
            X.6wC r9 = r5.A06
            if (r9 == 0) goto L_0x000e
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r9.A0N
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x000e
            X.5mF r3 = r9.A0L
            int r0 = r3.A00
            r1.A03 = r0
            X.6FL r8 = r9.A0I
            r8.A03()
            X.0yC r1 = r9.A0H
            r0 = 5976(0x1758, float:8.374E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x02d9
            X.3UT r2 = r9.A0G
            r0 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r2.A0F(r1, r0)
        L_0x02be:
            X.6Fh r0 = r9.A0V
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            r0.setToolbarExtraVisibility(r10)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r9.A0K
            r0 = 1
            r1.A04(r0)
            X.64m r0 = r9.A0P
            r0.A02 = r10
            X.C146806wC.A03(r9)
            X.C146806wC.A02(r9)
            r8.A01()
            return
        L_0x02d9:
            X.0u1 r0 = r9.A0Y
            java.lang.Object r2 = r0.get()
            X.6XN r2 = (X.AnonymousClass6XN) r2
            int r1 = r3.A00
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r9.A0K
            com.whatsapp.mediacomposer.doodle.ColorPickerView r0 = r0.A03
            int r0 = r0.A03
            float r0 = (float) r0
            r2.A01 = r1
            r2.A00 = r0
            X.4mv r0 = r2.A0I
            r0.A06()
            X.6SU r0 = r2.A0M
            com.whatsapp.ClearableEditText r0 = r0.A0A
            X.C36391kE.A1K(r0)
            android.graphics.Rect r0 = r9.A08
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView r12 = r2.A0Q
            X.C90504aG.A14(r0, r12)
            X.6V4 r11 = r9.A0M
            X.6OT r7 = r9.A0O
            r12.setVisibility(r10)
            com.whatsapp.mediacomposer.MediaComposerFragment r1 = r2.A0E
            boolean r0 = r1.A1l()
            r2.A04 = r0
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.VideoComposerFragment     // Catch:{ OutOfMemoryError -> 0x040f }
            if (r0 == 0) goto L_0x0327
            com.whatsapp.mediacomposer.VideoComposerFragment r1 = (com.whatsapp.mediacomposer.VideoComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x040f }
            X.3Qq r0 = r1.A0L     // Catch:{ OutOfMemoryError -> 0x040f }
            if (r0 == 0) goto L_0x0320
            android.graphics.Bitmap r6 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x040f }
            if (r6 != 0) goto L_0x0349
        L_0x0320:
            java.io.File r0 = r1.A0M     // Catch:{ OutOfMemoryError -> 0x040f }
            android.graphics.Bitmap r6 = X.C25541Gs.A01(r0)     // Catch:{ OutOfMemoryError -> 0x040f }
            goto L_0x0349
        L_0x0327:
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.ImageComposerFragment     // Catch:{ OutOfMemoryError -> 0x040f }
            if (r0 == 0) goto L_0x033f
            com.whatsapp.mediacomposer.ImageComposerFragment r1 = (com.whatsapp.mediacomposer.ImageComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x040f }
            com.whatsapp.mediaview.PhotoView r0 = r1.A06     // Catch:{ OutOfMemoryError -> 0x040f }
            android.graphics.Bitmap r2 = r0.getPhoto()     // Catch:{ OutOfMemoryError -> 0x040f }
            if (r2 == 0) goto L_0x02be
            android.graphics.Bitmap$Config r1 = r2.getConfig()     // Catch:{ OutOfMemoryError -> 0x040f }
            r0 = 1
            android.graphics.Bitmap r6 = r2.copy(r1, r0)     // Catch:{ OutOfMemoryError -> 0x040f }
            goto L_0x0349
        L_0x033f:
            com.whatsapp.mediacomposer.GifComposerFragment r1 = (com.whatsapp.mediacomposer.GifComposerFragment) r1     // Catch:{ OutOfMemoryError -> 0x040f }
            X.3Qq r0 = r1.A00     // Catch:{ OutOfMemoryError -> 0x040f }
            if (r0 == 0) goto L_0x02be
            android.graphics.Bitmap r6 = r0.A07()     // Catch:{ OutOfMemoryError -> 0x040f }
        L_0x0349:
            if (r6 == 0) goto L_0x02be
            android.graphics.Bitmap$Config r1 = r6.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 != r0) goto L_0x0359
            boolean r0 = r6.isMutable()
            if (r0 != 0) goto L_0x0360
        L_0x0359:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x040b }
            r0 = 1
            android.graphics.Bitmap r6 = r6.copy(r1, r0)     // Catch:{ OutOfMemoryError -> 0x040b }
        L_0x0360:
            X.6OT r3 = r11.A0F
            android.graphics.RectF r0 = r3.A08
            if (r0 == 0) goto L_0x0406
            android.graphics.Canvas r5 = X.C90524aI.A0A(r6)
            int r0 = r3.A02
            int r1 = r0 % 180
            r2 = 90
            android.graphics.RectF r0 = r3.A08
            if (r1 != r2) goto L_0x0400
            float r4 = r0.height()
        L_0x0378:
            int r0 = r3.A02
            int r1 = r0 % 180
            android.graphics.RectF r0 = r3.A08
            if (r1 != r2) goto L_0x03fb
            float r2 = r0.width()
        L_0x0384:
            int r0 = r6.getWidth()
            float r1 = (float) r0
            float r1 = r1 / r4
            int r0 = r6.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r2
            r5.scale(r1, r0)
            X.AnonymousClass6OT.A00(r5, r3)
            X.6FV r0 = r11.A0G
            java.util.List r4 = r0.A04
            android.graphics.Bitmap r0 = r11.A06
            if (r0 != 0) goto L_0x03bb
            android.graphics.Bitmap r0 = r11.A05
            if (r0 != 0) goto L_0x03bb
        L_0x03a2:
            java.util.Iterator r2 = r4.iterator()
        L_0x03a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0406
            X.6Ft r1 = X.C90524aI.A0N(r2)
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x03b7
            android.os.SystemClock.elapsedRealtime()
        L_0x03b7:
            r1.A0I(r5)
            goto L_0x03a6
        L_0x03bb:
            java.util.Iterator r1 = r4.iterator()
        L_0x03bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a2
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.AnonymousClass5Ci
            if (r0 == 0) goto L_0x03bf
            r5.save()
            int r0 = r11.A00
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r1
            r5.scale(r0, r0)
            android.graphics.Bitmap r3 = r11.A05
            if (r3 == 0) goto L_0x03e8
            android.graphics.PointF r0 = r11.A0D
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.Paint r0 = r11.A0C
            r5.drawBitmap(r3, r2, r1, r0)
        L_0x03e8:
            android.graphics.Bitmap r3 = r11.A06
            if (r3 == 0) goto L_0x03f7
            android.graphics.PointF r0 = r11.A0D
            float r2 = r0.x
            float r1 = r0.y
            android.graphics.Paint r0 = r11.A0C
            r5.drawBitmap(r3, r2, r1, r0)
        L_0x03f7:
            r5.restore()
            goto L_0x03a2
        L_0x03fb:
            float r2 = r0.height()
            goto L_0x0384
        L_0x0400:
            float r4 = r0.width()
            goto L_0x0378
        L_0x0406:
            r12.A01(r6, r7)
            goto L_0x02be
        L_0x040b:
            r1 = move-exception
            java.lang.String r0 = "ShapePicker/blurBackground copying bitmap"
            goto L_0x0412
        L_0x040f:
            r1 = move-exception
            java.lang.String r0 = "ShapePicker/blurBackground getting bitmap from preview container"
        L_0x0412:
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x02be
        L_0x0417:
            java.lang.Object r4 = r13.A00
            X.6Fh r4 = (X.C129126Fh) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.6wC r0 = r4.A06
            if (r0 == 0) goto L_0x000e
            X.6FL r0 = r4.A05
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x000e
            X.66x r3 = r4.A0J
            r2 = 1
            X.6VT r0 = r4.A0G
            int r1 = r0.A06()
            r0 = 57
            X.C1270866x.A00(r3, r0, r2, r1)
            X.6wC r5 = r4.A06
            X.6FL r0 = r5.A0I
            r0.A03()
            X.622 r0 = r5.A0R
            r0.A00()
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r5.A0N
            X.6FV r0 = r1.A0H
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x045b
            android.os.Handler r3 = r1.A0D
            java.lang.Runnable r2 = r1.A0I
            r3.removeCallbacks(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x045b:
            X.6Fh r2 = r5.A0V
            X.6FV r0 = r5.A0T
            X.65v r0 = r0.A03
            java.util.List r0 = r0.A00
            boolean r0 = X.C36401kF.A1a(r0)
            int r1 = X.C90514aH.A0A(r0)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r2.A0I
            r0.setUndoButtonVisibility(r1)
            X.6FL r0 = r4.A05
            r0.A02()
            X.6wC r0 = r4.A06
            X.C146806wC.A03(r0)
            return
        L_0x047b:
            java.lang.Object r0 = r13.A00
            X.6SU r0 = (X.AnonymousClass6SU) r0
            X.4l7 r1 = r0.A0C
            X.1hi r0 = r1.A02
            java.lang.Object r0 = r0.A04()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            r0 = 0
        L_0x0490:
            X.1hi r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0496:
            r1.A0D(r0)
            return
        L_0x049a:
            java.lang.Object r8 = r13.A00
            X.4nr r8 = (X.C96764nr) r8
            X.7mX r0 = r8.A00
            if (r0 == 0) goto L_0x000e
            X.4mv r9 = r8.A02
            X.6XN r7 = r9.A05
            X.0wU r6 = r7.A0Y
            X.5Aq r0 = r7.A0F
            X.5Lz r2 = new X.5Lz
            r2.<init>(r0, r9)
            r5 = 1
            X.7mX[] r1 = new X.C161307mX[r5]
            X.7mX r0 = r8.A00
            r4 = 0
            r1[r4] = r0
            r6.Box(r2, r1)
            X.7gx r3 = r7.A0H
            r0 = r3
            X.6wC r0 = (X.C146806wC) r0
            X.C146806wC.A01(r0)
            X.7mX r2 = r8.A00
            boolean r0 = r2.BoQ()
            if (r0 == 0) goto L_0x08fa
            X.0ts r1 = r7.A0B
            android.content.Context r0 = r14.getContext()
            X.5M7 r2 = new X.5M7
            r2.<init>(r0, r1, r9)
            X.7mX[] r1 = new X.C161307mX[r5]
            X.7mX r0 = r8.A00
            r1[r4] = r0
            r6.Bp0(r2, r1)
            return
        L_0x04df:
            java.lang.Object r4 = r13.A00
            X.4aZ r4 = (X.C90694aZ) r4
            X.6OU r0 = r4.A07
            if (r0 != 0) goto L_0x04ee
            java.lang.String r0 = "penDialogController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04ee:
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x000e
            X.66x r3 = r4.A0H
            r2 = 1
            X.6Fh r0 = r4.A0G
            X.6VT r0 = r0.A0G
            int r1 = r0.A06()
            r0 = 15
            X.C1270866x.A00(r3, r0, r2, r1)
            r4.dismiss()
            return
        L_0x0506:
            java.lang.Object r0 = r13.A00
            X.4aZ r0 = (X.C90694aZ) r0
            X.6OU r1 = r0.A07
            if (r1 != 0) goto L_0x0515
            java.lang.String r0 = "penDialogController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0515:
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x000e
            X.5mG r0 = r1.A08
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.622 r0 = r1.A0B
            r0.A00()
            r0 = 1
            X.AnonymousClass6OU.A00(r1, r0)
            return
        L_0x052a:
            java.lang.Object r4 = r13.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x000e
            X.66x r3 = r4.A0Q
            if (r3 == 0) goto L_0x0918
            r2 = 11
            r0 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r3.A02(r1, r0, r2)
            boolean r0 = r4.A0O
            r0 = r0 ^ 1
            r4.A0O = r0
            com.whatsapp.mediacomposer.VideoComposerFragment.A0C(r4)
            return
        L_0x054c:
            java.lang.Object r4 = r13.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.66x r2 = r4.A0Q
            if (r2 == 0) goto L_0x092c
            boolean r1 = r4.A0Q
            r0 = 28
            if (r1 == 0) goto L_0x055c
            r0 = 29
        L_0x055c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r0 = 11
            r2.A02(r1, r3, r0)
            boolean r0 = r4.A0Q
            r6 = r0 ^ 1
            r4.A0Q = r6
            android.net.Uri r0 = r4.A00
            if (r0 == 0) goto L_0x0594
            X.7le r5 = r4.A1a()
            if (r5 == 0) goto L_0x0594
            com.whatsapp.mediacomposer.MediaComposerActivity r5 = (com.whatsapp.mediacomposer.MediaComposerActivity) r5
            X.6VT r2 = r5.A0s
            android.net.Uri r1 = r2.A08()
            if (r1 == 0) goto L_0x0591
            X.6Tg r0 = r2.A0B
            X.6QO r1 = r0.A03(r1)
            monitor-enter(r1)
            r1.A0E = r6     // Catch:{ all -> 0x091f }
            monitor-exit(r1)
            int r0 = X.AnonymousClass6VT.A00(r2)
            X.AnonymousClass6VT.A05(r2, r0)
        L_0x0591:
            com.whatsapp.mediacomposer.MediaComposerActivity.A0l(r5)
        L_0x0594:
            boolean r0 = r4.A0Q
            android.widget.ImageView r1 = r4.A09
            if (r0 == 0) goto L_0x05cd
            if (r1 == 0) goto L_0x05a2
            r0 = 2131232331(0x7f08064b, float:1.8080768E38)
            r1.setImageResource(r0)
        L_0x05a2:
            com.whatsapp.mediacomposer.VideoTimelineView r2 = r4.A0G
            if (r2 == 0) goto L_0x05aa
            r0 = 7000(0x1b58, double:3.4585E-320)
            r2.A09 = r0
        L_0x05aa:
            com.whatsapp.mediacomposer.VideoComposerFragment.A09(r4)
            X.01I r2 = r4.A0i()
            X.0yb r1 = r4.A04
            if (r1 == 0) goto L_0x0922
            r0 = 2131889952(0x7f120f20, float:1.9414582E38)
        L_0x05b8:
            java.lang.String r0 = r4.A0n(r0)
            X.C33521fV.A00(r2, r1, r0)
            com.whatsapp.mediacomposer.VideoComposerFragment.A0B(r4)
            com.whatsapp.mediacomposer.VideoComposerFragment.A05(r4)
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x000e
            com.whatsapp.mediacomposer.VideoComposerFragment.A03(r4)
            return
        L_0x05cd:
            if (r1 == 0) goto L_0x05d5
            r0 = 2131232329(0x7f080649, float:1.8080764E38)
            r1.setImageResource(r0)
        L_0x05d5:
            com.whatsapp.mediacomposer.VideoTimelineView r2 = r4.A0G
            if (r2 == 0) goto L_0x05dd
            long r0 = r4.A01
            r2.A09 = r0
        L_0x05dd:
            X.3Qq r0 = r4.A0L
            if (r0 == 0) goto L_0x05ea
            boolean r0 = r0.A0X()
            if (r0 != r3) goto L_0x05ea
            r4.A1l()
        L_0x05ea:
            X.3Qq r3 = r4.A0L
            if (r3 == 0) goto L_0x05f4
            long r1 = r4.A05
            int r0 = (int) r1
            r3.A0L(r0)
        L_0x05f4:
            X.01I r2 = r4.A0i()
            X.0yb r1 = r4.A04
            if (r1 == 0) goto L_0x0927
            r0 = 2131895660(0x7f12256c, float:1.942616E38)
            goto L_0x05b8
        L_0x0600:
            java.lang.Object r2 = r13.A00
            com.whatsapp.location.LocationPicker2 r2 = (com.whatsapp.location.LocationPicker2) r2
            X.6Zc r1 = r2.A0W
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x0933
            android.location.Location r0 = r1.A05
            if (r0 == 0) goto L_0x000e
            android.widget.ImageView r1 = r1.A0K
            r0 = 2131231186(0x7f0801d2, float:1.8078446E38)
            r1.setImageResource(r0)
            X.6Fs r5 = r2.A02
            if (r5 == 0) goto L_0x0635
            X.6Zc r0 = r2.A0W
            android.location.Location r0 = r0.A05
            double r3 = r0.getLatitude()
            X.6Zc r0 = r2.A0W
            android.location.Location r0 = r0.A05
            double r0 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r0 = X.C90524aI.A0F(r3, r0)
            X.5iH r0 = X.AnonymousClass6UP.A01(r0)
            r5.A09(r0)
        L_0x0635:
            X.6Zc r1 = r2.A0W
            goto L_0x068e
        L_0x0638:
            java.lang.Object r2 = r13.A00
            com.whatsapp.location.LocationPicker2 r2 = (com.whatsapp.location.LocationPicker2) r2
            X.6Zc r0 = r2.A0W
            android.view.View r1 = r0.A08
            r0 = 0
            r1.setVisibility(r0)
            X.6Zc r0 = r2.A0W
            com.whatsapp.location.PlaceInfo r0 = r0.A0V
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.A0D
            if (r0 == 0) goto L_0x000e
            X.6Fg r0 = (X.C129116Fg) r0
            r0.A02()
            return
        L_0x0654:
            java.lang.Object r2 = r13.A00
            com.whatsapp.location.LocationPicker r2 = (com.whatsapp.location.LocationPicker) r2
            X.6Zc r1 = r2.A0P
            boolean r0 = r1.A0i
            if (r0 == 0) goto L_0x0979
            android.location.Location r0 = r1.A05
            if (r0 == 0) goto L_0x000e
            android.widget.ImageView r1 = r1.A0K
            r0 = 2131231186(0x7f0801d2, float:1.8078446E38)
            r1.setImageResource(r0)
            X.6jV r5 = r2.A03
            if (r5 == 0) goto L_0x068c
            X.6Zc r0 = r2.A0P
            android.location.Location r0 = r0.A05
            double r3 = r0.getLatitude()
            X.6Zc r0 = r2.A0P
            android.location.Location r0 = r0.A05
            double r0 = r0.getLongitude()
            X.6bv r1 = X.C134976bv.A00(r3, r0)
            X.64g r0 = new X.64g
            r0.<init>()
            r0.A06 = r1
            r5.A08(r0)
        L_0x068c:
            X.6Zc r1 = r2.A0P
        L_0x068e:
            r0 = 1
            r1.A0h = r0
            return
        L_0x0692:
            java.lang.Object r2 = r13.A00
            com.whatsapp.location.LocationPicker r2 = (com.whatsapp.location.LocationPicker) r2
            X.6Zc r0 = r2.A0P
            android.view.View r1 = r0.A08
            r0 = 0
            r1.setVisibility(r0)
            X.6Zc r0 = r2.A0P
            com.whatsapp.location.PlaceInfo r0 = r0.A0V
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.A0D
            if (r0 == 0) goto L_0x000e
            X.4q1 r0 = (X.C97634q1) r0
            r0.A07()
            return
        L_0x06ae:
            java.lang.Object r0 = r13.A00
            X.5zA r0 = (X.C125005zA) r0
            X.7h6 r0 = r0.A0F
            goto L_0x06bb
        L_0x06b5:
            java.lang.Object r0 = r13.A00
            X.5zA r0 = (X.C125005zA) r0
            X.7h6 r0 = r0.A0E
        L_0x06bb:
            r0.Bw7()
            return
        L_0x06bf:
            java.lang.Object r0 = r13.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x06c7:
            java.lang.Object r1 = r13.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationDataExportedActivity/dataExportReadyFinishActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 100
            r1.setResult(r0)
            r1.finish()
            return
        L_0x06d9:
            java.lang.Object r2 = r13.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r2 = (com.whatsapp.mediaview.MediaViewBaseFragment) r2
            boolean r0 = r2.A0G
            r1 = r0 ^ 1
            r0 = 1
            r2.A1o(r1, r0)
            return
        L_0x06e6:
            java.lang.Object r0 = r13.A00
            X.C36411kG.A1O(r0)
            return
        L_0x06ec:
            java.lang.Object r0 = r13.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1k()
            return
        L_0x06f4:
            java.lang.Object r0 = r13.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1j()
            return
        L_0x06fc:
            java.lang.Object r1 = r13.A00
            X.4me r1 = (X.C96014me) r1
            r0 = 1
            r1.A0L(r0)
            r1.A06()
            return
        L_0x0708:
            java.lang.Object r0 = r13.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setTooltipInPosition$lambda$13$lambda$12(r0, r14)
            return
        L_0x0710:
            java.lang.Object r0 = r13.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setMagicModVisibility$lambda$17$lambda$16(r0, r14)
            return
        L_0x0718:
            java.lang.Object r4 = r13.A00
            X.6Fh r4 = (X.C129126Fh) r4
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.5mD r0 = r4.A0H
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = r0.A00
            java.lang.Integer r0 = r2.A1S
            if (r0 == 0) goto L_0x0731
            int r1 = r0.intValue()
            r0 = 3
            r5 = 30
            if (r1 != r0) goto L_0x0733
        L_0x0731:
            r5 = 31
        L_0x0733:
            X.6Fh r0 = r2.A10
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0X
            if (r0 != 0) goto L_0x073d
            r5 = 66
        L_0x073d:
            X.66x r3 = r2.A1O
            r1 = 1
            X.6VT r0 = r2.A0s
            int r0 = r0.A06()
            X.C1270866x.A00(r3, r5, r1, r0)
            X.6Fh r0 = r2.A10
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r0.A0I
            boolean r0 = r0.A0X
            if (r0 != 0) goto L_0x0771
            X.1qm r2 = X.AnonymousClass3LW.A00(r2)
            r0 = 2131890944(0x7f121300, float:1.9416594E38)
            r2.A0d(r0)
            r0 = 2131890943(0x7f1212ff, float:1.9416592E38)
            r2.A0c(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
            r2.A0h(r0, r1)
            X.C36341k9.A11(r2)
        L_0x076b:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r4.A0I
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.A00(r0)
            return
        L_0x0771:
            java.lang.Integer r0 = r2.A1S
            int r1 = r0.intValue()
            r0 = 3
            if (r0 != r1) goto L_0x0796
            X.0yC r1 = r2.A0D
            r0 = 7589(0x1da5, float:1.0634E-41)
            boolean r0 = X.AnonymousClass1Ax.A03(r1, r0)
            if (r0 == 0) goto L_0x0796
            java.lang.Integer r0 = r2.A1S
            int r1 = r0.intValue()
            r0 = 3
            if (r0 != r1) goto L_0x078e
            r0 = 0
        L_0x078e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.BaZ(r0)
            goto L_0x076b
        L_0x0796:
            com.whatsapp.mediacomposer.MediaComposerFragment r6 = com.whatsapp.mediacomposer.MediaComposerActivity.A0F(r2)
            X.6VT r0 = r2.A0s
            android.net.Uri r1 = r0.A08()
            if (r6 == 0) goto L_0x076b
            if (r1 == 0) goto L_0x076b
            java.lang.Integer r5 = r2.A1S
            X.6Tg r0 = r2.A1r
            X.6QO r3 = r0.A03(r1)
            boolean r0 = r6 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x07e1
            com.whatsapp.mediacomposer.VideoComposerFragment r6 = (com.whatsapp.mediacomposer.VideoComposerFragment) r6
            X.01I r3 = r6.A0h()
            boolean r0 = r3 instanceof X.C158427gu
            if (r0 == 0) goto L_0x07df
            X.7gu r3 = (X.C158427gu) r3
        L_0x07bc:
            com.whatsapp.mediacomposer.VideoComposerFragment.A05(r6)
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x07c6
            com.whatsapp.mediacomposer.VideoComposerFragment.A03(r6)
        L_0x07c6:
            java.util.Map r1 = r6.A0b
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.mediacomposer.bottomsheet.VideoQualitySettingsBottomSheetFragment r2 = new com.whatsapp.mediacomposer.bottomsheet.VideoQualitySettingsBottomSheetFragment
            r2.<init>(r3, r5, r1)
        L_0x07d1:
            X.01I r0 = r6.A0i()
            X.01z r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "media_quality_fragment"
            r2.A1f(r1, r0)
            goto L_0x076b
        L_0x07df:
            r3 = 0
            goto L_0x07bc
        L_0x07e1:
            boolean r0 = r6 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x076b
            X.01I r1 = r6.A0h()
            boolean r0 = r1 instanceof X.C158427gu
            if (r0 == 0) goto L_0x07f5
            X.7gu r1 = (X.C158427gu) r1
        L_0x07ef:
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r2 = new com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment
            r2.<init>(r3, r1, r5)
            goto L_0x07d1
        L_0x07f5:
            r1 = 0
            goto L_0x07ef
        L_0x07f7:
            java.lang.Object r2 = r13.A00
            com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment r2 = (com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment) r2
            X.7gu r1 = r2.A07
            if (r1 == 0) goto L_0x0808
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.BaZ(r0)
        L_0x0808:
            r2.A1b()
            return
        L_0x080c:
            java.lang.Object r0 = r13.A00
            X.4U9 r0 = (X.AnonymousClass4U9) r0
            com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView.setRecipientsListener$lambda$1(r0, r14)
            return
        L_0x0814:
            java.lang.Object r0 = r13.A00
            X.4U9 r0 = (X.AnonymousClass4U9) r0
            com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView.setRecipientsListener$lambda$0(r0, r14)
            return
        L_0x081c:
            java.lang.Object r0 = r13.A00
            X.4U9 r0 = (X.AnonymousClass4U9) r0
            com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView.setRecipientsListener$lambda$3(r0, r14)
            return
        L_0x0824:
            java.lang.Object r0 = r13.A00
            X.4U9 r0 = (X.AnonymousClass4U9) r0
            com.whatsapp.mediacomposer.bottombar.recipients.QuickShareRecipientsView.setRecipientsListener$lambda$2(r0, r14)
            return
        L_0x082c:
            java.lang.Object r0 = r13.A00
            X.4UT r0 = (X.AnonymousClass4UT) r0
            r0.BkR()
            return
        L_0x0834:
            java.lang.Object r0 = r13.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            com.whatsapp.mediacomposer.VideoComposerFragment.A0A(r0)
            return
        L_0x083c:
            java.lang.Object r4 = r13.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.66x r3 = r4.A0Q
            if (r3 == 0) goto L_0x086d
            X.3Qq r0 = r4.A0L
            r2 = 1
            if (r0 == 0) goto L_0x0851
            boolean r1 = r0.A0X()
            r0 = 39
            if (r1 == r2) goto L_0x0853
        L_0x0851:
            r0 = 38
        L_0x0853:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 11
            r3.A02(r1, r2, r0)
            X.6wC r1 = r4.A0E
            if (r1 == 0) goto L_0x0869
            X.64m r0 = r1.A0P
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0869
            r1.A08()
        L_0x0869:
            com.whatsapp.mediacomposer.VideoComposerFragment.A0A(r4)
            return
        L_0x086d:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0874:
            java.lang.Object r0 = r13.A00
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.6WR r0 = r0.A05
            X.AnonymousClass6WR.A03(r0)
            return
        L_0x087e:
            java.lang.Object r0 = r13.A00
            X.6Zc r0 = (X.C133586Zc) r0
            X.C133586Zc.A07(r0)
            return
        L_0x0886:
            java.lang.Object r1 = r13.A00
            X.6Zc r1 = (X.C133586Zc) r1
            r0 = 1
            X.C133586Zc.A0G(r1, r0)
            return
        L_0x088f:
            java.lang.Object r0 = r13.A00
            X.6Zc r0 = (X.C133586Zc) r0
            X.C133586Zc.A09(r0)
            return
        L_0x0897:
            java.lang.Object r1 = r13.A00
            X.6Zc r1 = (X.C133586Zc) r1
            com.whatsapp.location.PlaceInfo r0 = r1.A1C
            X.C133586Zc.A0E(r1, r0)
            return
        L_0x08a1:
            java.lang.Object r0 = r13.A00
            X.5B4 r0 = (X.AnonymousClass5B4) r0
            X.6ov r3 = r0.A00
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x08cf
            android.app.Activity r2 = r3.A05
            X.3FM r1 = new X.3FM
            r1.<init>(r2)
            r0 = 2131233476(0x7f080ac4, float:1.808309E38)
            r1.A01 = r0
            java.lang.String[] r0 = X.AnonymousClass1P6.A09
            r1.A0C = r0
            r0 = 2131892842(0x7f121a6a, float:1.9420444E38)
            r1.A03 = r0
            r0 = 2131892843(0x7f121a6b, float:1.9420446E38)
            r1.A02 = r0
            android.content.Intent r1 = r1.A02()
            r0 = 34
            r2.startActivityForResult(r1, r0)
            return
        L_0x08cf:
            X.2XH r2 = r3.A13
            android.app.Activity r1 = r3.A05
            X.11F r0 = r3.A0I
            r2.A06(r1, r0)
            return
        L_0x08d9:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x08ee
            android.animation.AnimatorSet r0 = r3.A03
            if (r0 == 0) goto L_0x08ee
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x08ee
            android.animation.AnimatorSet r0 = r3.A03
            r0.start()
            r3.A07 = r2
        L_0x08ee:
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0I
            android.app.Activity r0 = X.C36361kB.A06(r0)
            r0.onBackPressed()
            r3.A08 = r2
            return
        L_0x08fa:
            android.content.Context r1 = r14.getContext()
            X.0ts r0 = r7.A0B
            X.6Ft r1 = r2.B4v(r1, r0, r4)
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x090f
            int r0 = r7.A01
            r1.A0G(r0)
        L_0x090f:
            float r0 = r7.A00
            r1.A0F(r0)
            r3.BgS(r1)
            return
        L_0x0918:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x091f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0922:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0927:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x092c:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0933:
            com.whatsapp.location.PlaceInfo r0 = r1.A0V
            if (r0 == 0) goto L_0x094a
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0942
            X.6Fg r1 = (X.C129116Fg) r1
            X.5iI r0 = r2.A03
            r1.A04(r0)
        L_0x0942:
            X.6Zc r1 = r2.A0W
            r0 = 0
            r1.A0V = r0
            X.C133586Zc.A0C(r1)
        L_0x094a:
            X.6Zc r1 = r2.A0W
            boolean r0 = r1.A0e
            android.view.View r1 = r1.A0B
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            X.5B9 r3 = r2.A0V
            goto L_0x0965
        L_0x095a:
            java.lang.Object r1 = r13.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            X.6ov r0 = r1.A0O
            r0.A0O()
            X.5B9 r3 = r1.A0N
        L_0x0965:
            int r2 = r3.A03
            r1 = 1
            if (r2 == 0) goto L_0x0975
            if (r2 == r1) goto L_0x0970
            r0 = 2
            if (r2 == r0) goto L_0x0975
            return
        L_0x0970:
            r0 = 0
            r3.setLocationMode(r0)
            return
        L_0x0975:
            r3.setLocationMode(r1)
            return
        L_0x0979:
            com.whatsapp.location.PlaceInfo r0 = r1.A0V
            if (r0 == 0) goto L_0x0990
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0988
            X.4q1 r1 = (X.C97634q1) r1
            X.5hZ r0 = r2.A04
            r1.A09(r0)
        L_0x0988:
            X.6Zc r1 = r2.A0P
            r0 = 0
            r1.A0V = r0
            X.C133586Zc.A0C(r1)
        L_0x0990:
            X.6Zc r1 = r2.A0P
            boolean r0 = r1.A0e
            android.view.View r1 = r1.A0B
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            X.5B8 r3 = r2.A0O
            goto L_0x09ab
        L_0x09a0:
            java.lang.Object r1 = r13.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r1
            X.6ov r0 = r1.A0N
            r0.A0O()
            X.5B8 r3 = r1.A0M
        L_0x09ab:
            int r2 = r3.A02
            r1 = 1
            if (r2 == 0) goto L_0x09bb
            if (r2 == r1) goto L_0x09b6
            r0 = 2
            if (r2 == r0) goto L_0x09bb
            return
        L_0x09b6:
            r0 = 0
            r3.setLocationMode(r0)
            return
        L_0x09bb:
            r3.setLocationMode(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135466ck.onClick(android.view.View):void");
    }
}
