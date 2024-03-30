package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass040;
import X.AnonymousClass1H2;
import X.AnonymousClass3PG;
import X.AnonymousClass7LZ;
import X.C005502l;
import X.C007403e;
import X.C023509x;
import X.C117195lr;
import X.C1270066o;
import X.C1275368r;
import X.C128566Ct;
import X.C36321k7;
import X.C36391kE;
import X.C36431kI;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

public final class EmojiImageViewLoader {
    public final AnonymousClass1H2 A00;
    public final C117195lr A01;
    public final C1270066o A02;
    public final HashMap A03 = AnonymousClass001.A0J();
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7LZ(this));
    public final C005502l A05;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6AB r14, com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader r15, X.C023509x r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C151777Aw
            if (r0 == 0) goto L_0x0110
            r7 = r3
            X.7Aw r7 = (X.C151777Aw) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0110
            int r2 = r2 - r1
            r7.label = r2
        L_0x0014:
            java.lang.Object r1 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r13 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r5) goto L_0x0117
            int r4 = r7.I$0
            java.lang.Object r3 = r7.L$2
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r14 = r7.L$1
            X.6AB r14 = (X.AnonymousClass6AB) r14
            java.lang.Object r15 = r7.L$0
            com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader r15 = (com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader) r15
            X.AnonymousClass0AN.A00(r1)
        L_0x0031:
            int r1 = r3.size()
            java.util.List r0 = r14.A01
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r4 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            r13 = 1
        L_0x0044:
            java.lang.Integer r0 = r14.A00
            if (r0 == 0) goto L_0x005b
            X.66o r3 = r15.A02
            int r2 = r0.intValue()
            r1 = 0
            java.lang.String r0 = "emoji_image_loader_load_batch_end"
            r3.A00(r2, r0, r1)
            if (r13 == 0) goto L_0x005e
            X.5TR r0 = X.AnonymousClass5TR.SUCCESS
        L_0x0058:
            r3.A01(r0, r2)
        L_0x005b:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x005e:
            X.5TR r0 = X.AnonymousClass5TR.FAIL
            goto L_0x0058
        L_0x0061:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Integer r0 = r14.A00
            if (r0 == 0) goto L_0x0074
            X.66o r3 = r15.A02
            int r2 = r0.intValue()
            r1 = 0
            java.lang.String r0 = "emoji_image_loader_load_batch_start"
            r3.A00(r2, r0, r1)
        L_0x0074:
            java.util.List r8 = r14.A01
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r8.iterator()
        L_0x007e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.6Eh r0 = (X.C128966Eh) r0
            X.68r r1 = r0.A03
            java.lang.ref.WeakReference r0 = r0.A04
            android.view.View r0 = X.AnonymousClass000.A0Y(r0)
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r0.getTag()
        L_0x0099:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x007e
            r2.add(r3)
            goto L_0x007e
        L_0x00a3:
            r0 = 0
            goto L_0x0099
        L_0x00a5:
            int r1 = r8.size()
            int r0 = r2.size()
            boolean r4 = X.AnonymousClass000.A1S(r1, r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r12 = r2.iterator()
        L_0x00b9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r8 = r12.next()
            X.6Eh r8 = (X.C128966Eh) r8
            java.lang.ref.WeakReference r11 = r8.A04
            android.view.View r0 = X.AnonymousClass000.A0Y(r11)
            if (r0 == 0) goto L_0x00b9
            X.1H2 r10 = r15.A00
            android.content.res.Resources r9 = r0.getResources()
            long r0 = r8.A01
            X.3PG r2 = r8.A02
            android.graphics.drawable.BitmapDrawable r2 = r10.A05(r9, r2, r0)
            if (r2 == 0) goto L_0x00b9
            X.68r r1 = r8.A03
            android.view.View r0 = X.AnonymousClass000.A0Y(r11)
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r0.getTag()
        L_0x00e9:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x00b9
            r8.A00 = r2
            r3.add(r8)
            goto L_0x00b9
        L_0x00f5:
            r0 = 0
            goto L_0x00e9
        L_0x00f7:
            X.02l r2 = r15.A05
            r1 = 0
            com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$3 r0 = new com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$3
            r0.<init>(r3, r1)
            r7.L$0 = r15
            r7.L$1 = r14
            r7.L$2 = r3
            r7.I$0 = r4
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r2, r0)
            if (r0 != r6) goto L_0x0031
            return r6
        L_0x0110:
            X.7Aw r7 = new X.7Aw
            r7.<init>(r15, r3)
            goto L_0x0014
        L_0x0117:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader.A00(X.6AB, com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader, X.09x):java.lang.Object");
    }

    public EmojiImageViewLoader(AnonymousClass1H2 r2, C117195lr r3, C1270066o r4, C005502l r5) {
        C36321k7.A18(r2, r5, r4, r3);
        this.A00 = r2;
        this.A05 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final void A01(AnonymousClass3PG r13, EmojiImageView emojiImageView, Integer num, long j) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("emoji_");
        long j2 = j;
        A0u.append(j2);
        A0u.append('/');
        AnonymousClass3PG r6 = r13;
        C1275368r r7 = new C1275368r(AnonymousClass000.A0o(r13, A0u));
        if (!AnonymousClass00C.A0J(emojiImageView.getTag(), r7)) {
            emojiImageView.A00((int[]) null, (Drawable) null);
        }
        emojiImageView.setTag(r7);
        HashMap hashMap = this.A03;
        C007403e r0 = (C007403e) hashMap.remove(r7);
        if (r0 != null) {
            r0.B2S((CancellationException) null);
        }
        C128566Ct r5 = new C128566Ct(r6, r7, num, AnonymousClass001.A0F(emojiImageView), j2);
        if (num != null) {
            this.A02.A00(num.intValue(), "emoji_image_loader_launch", (String) null);
        }
        hashMap.put(r7, C36391kE.A12(new EmojiImageViewLoader$loadEmoji$job$1(r5, this, (C023509x) null), (AnonymousClass040) this.A04.getValue()));
    }
}
