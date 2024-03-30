package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.737  reason: invalid class name */
public class AnonymousClass737 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static Long A00(File file) {
        return Long.valueOf((AnonymousClass6YY.A00((C02680Bk) null, file) / 10000000) * 10000000);
    }

    public AnonymousClass737(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0499, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        X.C05600Qi.A00(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x049d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x056e, code lost:
        r4.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0571, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03dd, code lost:
        r0.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03e0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r6 = r20
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x0840;
                case 1: goto L_0x02c9;
                case 2: goto L_0x0302;
                case 3: goto L_0x0324;
                case 4: goto L_0x033f;
                case 5: goto L_0x036a;
                case 6: goto L_0x0395;
                case 7: goto L_0x03a5;
                case 8: goto L_0x03bc;
                case 9: goto L_0x0018;
                case 10: goto L_0x00f2;
                case 11: goto L_0x0142;
                case 12: goto L_0x03e4;
                case 13: goto L_0x0416;
                case 14: goto L_0x0193;
                case 15: goto L_0x054d;
                case 16: goto L_0x0572;
                case 17: goto L_0x01f2;
                case 18: goto L_0x0598;
                case 19: goto L_0x05ab;
                case 20: goto L_0x05e8;
                case 21: goto L_0x022f;
                case 22: goto L_0x0243;
                case 23: goto L_0x025a;
                case 24: goto L_0x0602;
                case 25: goto L_0x061a;
                case 26: goto L_0x062a;
                case 27: goto L_0x0686;
                case 28: goto L_0x0696;
                case 29: goto L_0x06c5;
                case 30: goto L_0x06d5;
                case 31: goto L_0x028f;
                case 32: goto L_0x0708;
                case 33: goto L_0x0718;
                case 34: goto L_0x0820;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r6.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            java.lang.Object r2 = r6.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r6.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0 = 0
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity.A07(r3, r2, r1, r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r4 = r6.A00
            X.5yr r4 = (X.C124825yr) r4
            java.lang.Object r2 = r6.A01
            X.58g r2 = (X.C1040958g) r2
            java.lang.Object r3 = r6.A02
            X.0u5 r3 = (X.C18950u5) r3
            X.0wQ r0 = r4.A01
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0017
            X.12P r0 = r4.A06
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0017
            X.12U r0 = r4.A0A
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0017
            X.0wx r5 = r4.A04
            long r0 = r5.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            long r0 = r5.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0D = r0
            long r0 = r5.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            long r0 = r5.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            X.15x r0 = r4.A05
            java.lang.Long r0 = r0.A00()
            r2.A00 = r0
            java.util.concurrent.atomic.AtomicBoolean r6 = X.C36431kI.A1H()
            X.3ha r5 = new X.3ha
            r5.<init>(r2, r4, r6)
            X.3Si r1 = r4.A07
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A07
            r0.add(r5)
            r0 = 0
            X.C65503Si.A01(r0, r1, r6)
            X.0wG r0 = r4.A03
            android.content.Context r1 = r0.A00
            java.io.File r0 = r1.getFilesDir()
            java.io.File r0 = r0.getParentFile()
            java.lang.Long r0 = A00(r0)
            r2.A0B = r0
            java.io.File r0 = r1.getFilesDir()
            java.lang.Long r0 = A00(r0)
            r2.A0A = r0
            java.lang.String r0 = "ignore"
            java.io.File r0 = r1.getDatabasePath(r0)
            java.io.File r0 = r0.getParentFile()
            java.lang.Long r0 = A00(r0)
            r2.A09 = r0
            java.io.File r0 = r1.getCacheDir()
            java.lang.Long r0 = A00(r0)
            r2.A08 = r0
            X.179 r1 = r4.A02
            X.005 r0 = r1.A01
            java.lang.Object r0 = r0.get()
            java.io.File r0 = (java.io.File) r0
            java.lang.Long r0 = A00(r0)
            r2.A07 = r0
            X.0y0 r0 = r4.A00
            java.io.File r0 = r0.A0H()
            java.lang.Long r0 = A00(r0)
            r2.A04 = r0
            java.io.File r0 = r1.A03()
            java.lang.Long r0 = A00(r0)
            r2.A03 = r0
            java.io.File r0 = r1.A02()
            java.lang.Long r0 = A00(r0)
            r2.A02 = r0
            X.0yW r1 = r4.A09
            int r0 = r3.A00
            r1.Blz(r2, r0)
            return
        L_0x00f2:
            java.lang.Object r4 = r6.A00
            com.whatsapp.storage.StorageUsageActivity r4 = (com.whatsapp.storage.StorageUsageActivity) r4
            java.lang.Object r7 = r6.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r6.A02
            java.util.List r5 = (java.util.List) r5
            X.1wZ r3 = r4.A0H
            X.C18740tg.A06(r7)
            java.lang.String r2 = r4.A0P
            java.util.List r1 = r4.A0R
            X.2pI r0 = r4.A0G
            r3.A05 = r7
            r3.A04 = r2
            r3.A06 = r1
            r3.A00 = r0
            r0 = 1
            r3.A07 = r0
            if (r5 == 0) goto L_0x012d
            java.util.Iterator r2 = r5.iterator()
        L_0x011a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0130
            int r1 = X.C36341k9.A0A(r2)
            int r0 = X.C41071wZ.A00(r3)
            int r1 = r1 + r0
            r3.A08(r1)
            goto L_0x011a
        L_0x012d:
            r3.A06()
        L_0x0130:
            X.3PI r3 = r4.A0F
            android.view.View r2 = r4.A00
            java.lang.String r1 = r4.A0O
            java.lang.String r0 = "manage_storage"
            boolean r0 = r3.A02(r2, r0, r1)
            if (r0 == 0) goto L_0x0017
            r0 = 0
            r4.A0O = r0
            return
        L_0x0142:
            java.lang.Object r0 = r6.A00
            X.2rU r0 = (X.C53542rU) r0
            java.lang.Object r7 = r6.A01
            java.lang.Object r5 = r6.A02
            X.3Xe r5 = (X.C66753Xe) r5
            java.lang.Object r0 = r0.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            X.1wZ r4 = r0.A0H
            java.util.List r0 = r4.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0158:
            boolean r0 = r2.hasNext()
            r3 = -1
            if (r0 == 0) goto L_0x0017
            java.lang.Object r1 = r2.next()
            X.3v0 r1 = (X.C80193v0) r1
            X.11F r0 = r1.A01()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0158
            java.util.List r0 = r4.A05
            int r2 = r0.indexOf(r1)
            if (r2 == r3) goto L_0x0017
            java.util.List r0 = r4.A05
            java.lang.Object r1 = r0.get(r2)
            X.3v0 r1 = (X.C80193v0) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            r1.A00 = r5
            java.util.List r0 = r4.A05
            r0.set(r2, r1)
            java.util.List r0 = r4.A05
            java.util.Collections.sort(r0)
            r4.A06()
            return
        L_0x0193:
            java.lang.Object r0 = r6.A00
            X.1lt r0 = (X.C37151lt) r0
            java.lang.Object r1 = r6.A01
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r7 = r6.A02
            java.io.File r7 = (java.io.File) r7
            java.lang.ref.WeakReference r0 = r0.A0E
            java.lang.Object r4 = r0.get()
            X.6zV r4 = (X.C148836zV) r4
            if (r4 == 0) goto L_0x0017
            r4.A08 = r1
            r4.A09 = r7
            X.5Lv r0 = r4.A04
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x01d0
            int r0 = r4.A00
            X.5rC r3 = new X.5rC
            r3.<init>(r7, r0)
            r1 = 3
            X.7qz r0 = new X.7qz
            r0.<init>(r4, r1)
            X.5Lv r2 = new X.5Lv
            r2.<init>(r0)
            X.0wU r1 = r4.A0K
            X.5rC[] r0 = new X.C120245rC[r5]
            r0[r6] = r3
            r1.Box(r2, r0)
            r4.A04 = r2
        L_0x01d0:
            X.5Lv r0 = r4.A03
            if (r0 != 0) goto L_0x0017
            r0 = 192(0xc0, float:2.69E-43)
            X.5rC r3 = new X.5rC
            r3.<init>(r7, r0)
            r1 = 2
            X.7qz r0 = new X.7qz
            r0.<init>(r4, r1)
            X.5Lv r2 = new X.5Lv
            r2.<init>(r0)
            X.0wU r1 = r4.A0K
            X.5rC[] r0 = new X.C120245rC[r5]
            r0[r6] = r3
            r1.Box(r2, r0)
            r4.A03 = r2
            return
        L_0x01f2:
            java.lang.Object r0 = r6.A00
            X.5N5 r0 = (X.AnonymousClass5N5) r0
            java.lang.Object r5 = r6.A01
            X.5wb r5 = (X.C123495wb) r5
            java.lang.Object r4 = r6.A02
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.1SX r0 = r0.A04
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0A
            r0.decrementAndGet()
            X.1SV r2 = r5.A03
            X.3T1 r3 = r5.A01
            monitor-enter(r2)
            java.lang.String r1 = X.AnonymousClass1SV.A03(r3)     // Catch:{ all -> 0x08ad }
            java.util.HashMap r0 = r2.A04     // Catch:{ all -> 0x08ab }
            r0.remove(r1)     // Catch:{ all -> 0x08ab }
            if (r4 == 0) goto L_0x021a
            X.1PM r0 = r2.A02     // Catch:{ all -> 0x08ab }
            r0.A0D(r1, r4)     // Catch:{ all -> 0x08ab }
        L_0x021a:
            monitor-exit(r2)
            java.lang.Object r2 = r5.A04
            android.view.View r1 = r5.A00
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0017
            X.7l9 r0 = r5.A02
            r0.Bte(r4, r1, r3)
            return
        L_0x022f:
            java.lang.Object r2 = r6.A00
            X.6YP r2 = (X.AnonymousClass6YP) r2
            java.lang.Object r1 = r6.A01
            X.6Q9 r1 = (X.AnonymousClass6Q9) r1
            java.lang.Object r0 = r6.A02
            X.7hq r0 = (X.C158647hq) r0
            r2.A0H = r1
            if (r0 == 0) goto L_0x0017
            r0.B2G()
            return
        L_0x0243:
            java.lang.Object r0 = r6.A00
            X.6YP r0 = (X.AnonymousClass6YP) r0
            java.lang.Object r2 = r6.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r1 = r6.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.0wU r0 = r0.A10
            r0.Bnx(r2)
            if (r1 == 0) goto L_0x0017
            r0.Bnx(r1)
            return
        L_0x025a:
            java.lang.Object r3 = r6.A00
            X.4vR r3 = (X.C100694vR) r3
            java.lang.Object r2 = r6.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r4 = r6.A02
            r0 = 8
            r2.setVisibility(r0)
            X.6YP r0 = r3.A04
            X.6Q9 r0 = r0.A0H
            if (r0 != 0) goto L_0x0017
            r6 = 1
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 1
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 3
            X.7ov r0 = new X.7ov
            r0.<init>(r4, r3, r1)
            r5.setAnimationListener(r0)
            r0 = 213(0xd5, double:1.05E-321)
            r5.setDuration(r0)
            r2.startAnimation(r5)
            return
        L_0x028f:
            java.lang.Object r4 = r6.A00
            X.1hq r4 = (X.C34911hq) r4
            java.lang.Object r3 = r6.A01
            X.6DN r3 = (X.AnonymousClass6DN) r3
            java.lang.Object r2 = r6.A02
            X.5Tq r2 = (X.C108475Tq) r2
            X.1UN r1 = X.C34911hq.A00(r4)
            if (r1 == 0) goto L_0x02a6
            java.lang.String r0 = "TAP_UNDO_CROSSPOST"
            r1.A02(r0)
        L_0x02a6:
            X.005 r0 = r4.A09
            java.lang.Object r0 = r0.get()
            X.1hu r0 = (X.C34951hu) r0
            r0.A01(r3)
            X.005 r0 = r4.A07
            r0.get()
            int r2 = r2.ordinal()
            r1 = 0
            java.lang.String r0 = "currentShareViewState"
            if (r2 == r1) goto L_0x02c4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c4:
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02c9:
            java.lang.Object r7 = r6.A00
            com.whatsapp.registration.email.VerifyEmail r7 = (com.whatsapp.registration.email.VerifyEmail) r7
            java.lang.Object r5 = r6.A01
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r4 = r6.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            X.9Pi r8 = r7.A3i()
            java.lang.String r9 = r7.A0F
            int r11 = r7.A00
            r12 = 8
            r13 = 2
            r10 = 0
            r14 = 2
            r8.A00(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass3SJ.A00(r7, r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = X.C36371kC.A0A(r5)
            long r2 = r2.toMillis(r0)
            X.0wo r0 = r7.A07
            long r0 = X.C19970wo.A00(r0)
            long r2 = r2 + r0
            r7.A01 = r2
            com.whatsapp.registration.email.VerifyEmail.A0F(r7, r5)
            com.whatsapp.registration.email.VerifyEmail.A07(r7, r4, r5)
            return
        L_0x0302:
            java.lang.Object r4 = r6.A00
            X.4UE r4 = (X.AnonymousClass4UE) r4
            java.lang.Object r1 = r6.A01
            X.2kE r1 = (X.C50112kE) r1
            java.lang.Object r3 = r6.A02
            X.00I r3 = (X.AnonymousClass00I) r3
            boolean r0 = r1.A0G
            java.lang.String r2 = r1.A0C
            r4.BKC(r0, r2)
            java.lang.Object r1 = r3.A00
            X.AnonymousClass00C.A07(r1)
            X.2or r1 = (X.C52082or) r1
            java.lang.Object r0 = r3.A01
            X.3Xa r0 = (X.C66713Xa) r0
            r4.BTw(r1, r0, r2)
            return
        L_0x0324:
            java.lang.Object r3 = r6.A00
            X.1yu r3 = (X.C42491yu) r3
            java.lang.Object r0 = r6.A01
            X.3Qj r0 = (X.C65013Qj) r0
            java.lang.Object r2 = r6.A02
            boolean r1 = r0.A03()
            r0 = 7
            if (r1 == 0) goto L_0x0336
            r0 = 6
        L_0x0336:
            X.3wd r1 = new X.3wd
            r1.<init>(r3, r2, r0)
            X.17Y r0 = r3.A0F
            goto L_0x03dd
        L_0x033f:
            java.lang.Object r4 = r6.A00
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r6.A01
            X.02E r0 = (X.AnonymousClass02E) r0
            java.lang.Object r3 = r6.A02
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r2 = X.AnonymousClass001.A06()
            r4.getGlobalVisibleRect(r2)
            android.content.res.Resources r1 = X.C36341k9.A0G(r0)
            r0 = 2131168444(0x7f070cbc, float:1.795119E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r0 = -r0
            r2.inset(r0, r0)
            android.view.TouchDelegate r0 = new android.view.TouchDelegate
            r0.<init>(r2, r4)
            r3.setTouchDelegate(r0)
            return
        L_0x036a:
            java.lang.Object r7 = r6.A00
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r6.A01
            X.5zv r5 = (X.C125445zv) r5
            java.lang.Object r4 = r6.A02
            X.38m r4 = (X.C606038m) r4
            java.util.Iterator r3 = r7.iterator()
        L_0x037a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0391
            X.68B r2 = X.C90514aH.A0g(r3)
            X.1BA r0 = r4.A01
            java.lang.String r1 = r2.A0F
            java.util.Map r0 = r0.A01
            boolean r0 = r0.containsKey(r1)
            r2.A06 = r0
            goto L_0x037a
        L_0x0391:
            r5.A00(r7)
            return
        L_0x0395:
            java.lang.Object r2 = r6.A00
            X.5Ar r2 = (X.C104665Ar) r2
            java.lang.Object r1 = r6.A01
            X.6c4 r1 = (X.C135066c4) r1
            java.lang.Object r0 = r6.A02
            X.7hb r0 = (X.C158497hb) r0
            r2.A0J(r0, r1)
            return
        L_0x03a5:
            java.lang.Object r3 = r6.A00
            X.5HA r3 = (X.AnonymousClass5HA) r3
            java.lang.Object r2 = r6.A01
            X.6c4 r2 = (X.C135066c4) r2
            java.lang.Object r1 = r6.A02
            X.6c4 r1 = (X.C135066c4) r1
            X.5Kv r0 = r3.A0L
            r0.A05(r2)
            X.5Kt r0 = r3.A0M
            r0.A05(r1)
            return
        L_0x03bc:
            java.lang.Object r2 = r6.A00
            X.4mp r2 = (X.C96124mp) r2
            java.lang.Object r4 = r6.A01
            X.4o8 r4 = (X.C96934o8) r4
            java.lang.Object r5 = r6.A02
            X.4mr r0 = r4.A00
            if (r0 != 0) goto L_0x03e1
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r2.A01
            X.1AP r0 = r0.A0E
            X.6CW r3 = r0.A04()
            r7 = 1
        L_0x03d3:
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r2.A01
            X.17Y r0 = r0.A04
            r6 = 6
            X.74p r1 = new X.74p
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x03dd:
            r0.A0H(r1)
            return
        L_0x03e1:
            r3 = 0
            r7 = 0
            goto L_0x03d3
        L_0x03e4:
            java.lang.Object r3 = r6.A00
            com.whatsapp.support.faq.SearchFAQ r3 = (com.whatsapp.support.faq.SearchFAQ) r3
            java.lang.Object r2 = r6.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r4 = r6.A02
            android.os.Bundle r4 = (android.os.Bundle) r4
            if (r2 == 0) goto L_0x0402
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0402
            r1 = 1
            r0 = 3
            android.content.Intent r0 = X.AnonymousClass190.A0T(r3, r4, r2, r1, r0)
        L_0x03fe:
            r3.startActivity(r0)
            return
        L_0x0402:
            X.3DY r2 = r3.A01
            X.1CF r0 = r3.A03
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A06
            r5 = 0
            r8 = r5
            r9 = r5
            r10 = r5
            r6 = r5
            android.content.Intent r0 = r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x03fe
        L_0x0416:
            java.lang.Object r0 = r6.A00
            com.whatsapp.textstatus.AddTextStatusActivity r0 = (com.whatsapp.textstatus.AddTextStatusActivity) r0
            java.lang.Object r7 = r6.A01
            X.0fE r7 = (X.C10790fE) r7
            java.lang.Object r1 = r6.A02
            r6 = 0
            r5 = 1
            X.AnonymousClass00C.A0D(r7, r5)
            java.lang.String r9 = "null"
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r3 = "customTSValues"
            java.io.File r2 = X.C36441kJ.A0w(r2, r3)
            boolean r2 = r2.exists()
            r12 = 0
            if (r2 == 0) goto L_0x04cb
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.io.FileInputStream r2 = r0.openFileInput(r3)     // Catch:{ Exception -> 0x049e }
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x049e }
            r8.<init>(r2)     // Catch:{ Exception -> 0x049e }
            java.lang.Object r3 = r8.readObject()     // Catch:{ all -> 0x0497 }
            X.C90494aF.A10(r3)     // Catch:{ all -> 0x0497 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0497 }
            java.lang.String r2 = "\n"
            java.util.List r2 = X.C90504aG.A0v(r3, r2, r6)     // Catch:{ all -> 0x0497 }
            r10 = 2
            java.util.ArrayList r2 = X.C007103b.A0R(r2, r10, r10)     // Catch:{ all -> 0x0497 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x0497 }
        L_0x045d:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x0497 }
            if (r2 == 0) goto L_0x0493
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x0497 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0497 }
            int r2 = r7.size()     // Catch:{ all -> 0x0497 }
            if (r2 != r10) goto L_0x045d
            java.lang.Object r2 = r7.get(r6)     // Catch:{ all -> 0x0497 }
            boolean r2 = X.AnonymousClass00C.A0J(r2, r9)     // Catch:{ all -> 0x0497 }
            if (r2 != 0) goto L_0x0491
            java.lang.String r3 = X.C36401kF.A0s(r7, r6)     // Catch:{ all -> 0x0497 }
        L_0x047d:
            java.lang.Object r2 = r7.get(r5)     // Catch:{ all -> 0x0497 }
            boolean r2 = X.AnonymousClass00C.A0J(r2, r9)     // Catch:{ all -> 0x0497 }
            if (r2 != 0) goto L_0x048f
            java.lang.String r2 = X.C36401kF.A0s(r7, r5)     // Catch:{ all -> 0x0497 }
        L_0x048b:
            X.C90494aF.A1F(r3, r2, r4)     // Catch:{ all -> 0x0497 }
            goto L_0x045d
        L_0x048f:
            r2 = r12
            goto L_0x048b
        L_0x0491:
            r3 = r12
            goto L_0x047d
        L_0x0493:
            r8.close()     // Catch:{ Exception -> 0x049e }
            goto L_0x04a4
        L_0x0497:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0499 }
        L_0x0499:
            r2 = move-exception
            X.C05600Qi.A00(r8, r3)     // Catch:{ Exception -> 0x049e }
            throw r2     // Catch:{ Exception -> 0x049e }
        L_0x049e:
            r3 = move-exception
            java.lang.String r2 = "GetCustomValues/serialization_error"
            com.whatsapp.util.Log.w(r2, r3)
        L_0x04a4:
            java.util.Iterator r4 = r4.iterator()
        L_0x04a8:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x053e
            java.lang.Object r3 = r4.next()
            X.011 r3 = (X.AnonymousClass011) r3
            java.util.List r2 = r0.A0M
            java.lang.Object r8 = r3.second
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r3.first
            java.lang.String r11 = (java.lang.String) r11
            r6 = 0
            r9 = 0
            X.3Jg r5 = new X.3Jg
            r5.<init>(r6, r8, r9, r11)
            r2.add(r5)
            goto L_0x04a8
        L_0x04cb:
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2130903072(0x7f030020, float:1.7412952E38)
            android.content.res.TypedArray r9 = r3.obtainTypedArray(r2)
            X.AnonymousClass00C.A08(r9)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0548 }
            r4 = 0
            int r3 = r9.length()     // Catch:{ all -> 0x0548 }
        L_0x04e2:
            if (r4 >= r3) goto L_0x04f0
            java.lang.String r2 = r9.getString(r4)     // Catch:{ all -> 0x0548 }
            if (r2 == 0) goto L_0x04ed
            r8.add(r2)     // Catch:{ all -> 0x0548 }
        L_0x04ed:
            int r4 = r4 + 1
            goto L_0x04e2
        L_0x04f0:
            r9.recycle()
            java.util.Iterator r11 = r8.iterator()
        L_0x04f7:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x053e
            java.lang.String r15 = X.AnonymousClass001.A0C(r11)
            int[] r8 = new int[r5]
            int[] r4 = X.C56502wO.A00
            int r3 = r7.element
            int r2 = r3 + 1
            r7.element = r2
            r2 = r4[r3]
            r8[r6] = r2
            X.2M9 r2 = new X.2M9
            r2.<init>(r8)
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            int[] r9 = r2.A01
            int r8 = r9.length
            r4 = 0
        L_0x051c:
            if (r4 >= r8) goto L_0x052b
            r3 = r9[r4]
            r2 = 65039(0xfe0f, float:9.1139E-41)
            if (r3 == r2) goto L_0x0528
            r10.appendCodePoint(r3)
        L_0x0528:
            int r4 = r4 + 1
            goto L_0x051c
        L_0x052b:
            java.lang.String r18 = X.C36381kD.A0y(r10)
            java.util.List r2 = r0.A0M
            r13 = 0
            r16 = 0
            X.3Jg r12 = new X.3Jg
            r12.<init>(r13, r15, r16, r18)
            r2.add(r12)
            goto L_0x04f7
        L_0x053e:
            X.17Y r4 = r0.A05
            r3 = 38
            X.3wd r2 = new X.3wd
            r2.<init>(r0, r1, r3)
            goto L_0x056e
        L_0x0548:
            r0 = move-exception
            r9.recycle()
            throw r0
        L_0x054d:
            java.lang.Object r3 = r6.A00
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r6.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r2 = r6.A02
            X.39Z r2 = (X.AnonymousClass39Z) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            android.content.Context r0 = X.C36371kC.A0B(r3)
            android.graphics.drawable.GradientDrawable r1 = X.C55382uX.A00(r0, r1)
            X.17Y r4 = r2.A01
            r0 = 44
            X.3wd r2 = new X.3wd
            r2.<init>(r3, r1, r0)
        L_0x056e:
            r4.A0H(r2)
            return
        L_0x0572:
            java.lang.Object r4 = r6.A00
            X.3So r4 = (X.C65563So) r4
            java.lang.Object r3 = r6.A01
            X.6uv r3 = (X.C146036uv) r3
            java.lang.Object r2 = r6.A02
            X.4Tk r2 = (X.C88624Tk) r2
            X.0wD r0 = r4.A04
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0590
            r1 = 2
            X.3SO r0 = new X.3SO
            r0.<init>(r2, r4, r1)
            r3.Blp(r0)
            return
        L_0x0590:
            java.lang.Integer r0 = X.C36361kB.A0i()
            r2.BXN(r0)
            return
        L_0x0598:
            java.lang.Object r2 = r6.A00
            X.5NL r2 = (X.AnonymousClass5NL) r2
            java.lang.Object r1 = r6.A02
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            long r0 = X.AnonymousClass1GX.A02(r1)
            r2.A00 = r0
            return
        L_0x05ab:
            java.lang.Object r7 = r6.A00
            X.6E3 r7 = (X.AnonymousClass6E3) r7
            java.lang.Object r5 = r6.A01
            X.6KH r5 = (X.AnonymousClass6KH) r5
            java.lang.Object r3 = r6.A02
            android.content.Context r3 = (android.content.Context) r3
            r4 = 0
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            X.AUR r1 = X.AnonymousClass6KH.A00(r5)
            X.B44 r0 = X.B44.A00
            X.9lT r3 = X.C202289lT.A01(r3, r1, r0, r2)
            r7.A04 = r3
            java.util.concurrent.atomic.AtomicInteger r0 = X.C204359ps.A0T
            X.6mV r2 = new X.6mV
            r2.<init>(r7)
            X.AUR r1 = X.AnonymousClass6KH.A00(r5)
            X.9ps r0 = new X.9ps
            r0.<init>(r2, r3, r1)
            r7.A02 = r0
            r0.A0L(r4)
            android.view.TextureView r1 = r7.A0A
            X.6cb r0 = new X.6cb
            r0.<init>(r7)
            r1.setSurfaceTextureListener(r0)
            return
        L_0x05e8:
            java.lang.Object r0 = r6.A00
            X.6dN r0 = (X.C135856dN) r0
            java.lang.Object r3 = r6.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r6.A02
            X.6Tw r2 = (X.C132476Tw) r2
            X.70k r1 = r0.A03
            java.util.List r0 = r1.A0L
            r0.clear()
            r0.addAll(r3)
            X.C1492470k.A00(r2, r1, r0)
            return
        L_0x0602:
            java.lang.Object r2 = r6.A00
            X.5BI r2 = (X.AnonymousClass5BI) r2
            java.lang.Object r1 = r6.A01
            X.2bi r1 = (X.C46812bi) r1
            java.lang.Object r0 = r6.A02
            boolean r5 = X.C90514aH.A1Y(r0)
            r3 = 0
            r4 = -1
            r6 = r5
            X.AnonymousClass5BI.A01(r1, r2, r3, r4, r5, r6)
            r2.A04(r1, r0)
            return
        L_0x061a:
            java.lang.Object r2 = r6.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r2
            java.lang.Object r1 = r6.A01
            java.util.concurrent.Exchanger r1 = (java.util.concurrent.Exchanger) r1
            java.lang.Object r0 = r6.A02
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            r2.m78lambda$syncRunOnCameraThread$0$comwhatsappvoipcallingcameraVoipPhysicalCamera(r1, r0)
            return
        L_0x062a:
            java.lang.Object r7 = r6.A00
            X.7jf r7 = (X.C159627jf) r7
            java.lang.Object r6 = r6.A02
            java.util.Map r6 = (java.util.Map) r6
            r3 = 0
            X.AnonymousClass00C.A0D(r7, r3)
            r2 = 0
            java.lang.String r0 = "data"
            java.lang.Object r1 = r6.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x064b
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x064b
            java.lang.String r0 = "error_message"
            java.lang.Object r2 = r1.get(r0)
        L_0x064b:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0682
            if (r2 == 0) goto L_0x0682
            X.5Te r0 = X.C108355Te.ERROR
            java.lang.String r5 = r0.key
            r0 = 2
            X.011[] r4 = new X.AnonymousClass011[r0]
            X.5Te r0 = X.C108355Te.ERROR_MESSAGE
            java.lang.String r0 = r0.key
            X.C36341k9.A1J(r0, r2, r4, r3)
            X.5Te r0 = X.C108355Te.ERROR_PARAMS
            java.lang.String r3 = r0.key
            r2 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "is_data_channel_error"
            java.util.Map r0 = X.C36391kE.A11(r0, r1)
            X.C36341k9.A1J(r3, r0, r4, r2)
            java.util.LinkedHashMap r0 = X.C000400e.A07(r4)
            java.util.Map r1 = X.C36391kE.A11(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r6)
            r0.putAll(r1)
            r6 = r0
        L_0x0682:
            r7.BiH(r6)
            return
        L_0x0686:
            java.lang.Object r2 = r6.A00
            X.6Kk r2 = (X.C130266Kk) r2
            java.lang.Object r1 = r6.A01
            X.5rQ r1 = (X.C120385rQ) r1
            java.lang.Object r0 = r6.A02
            X.6Ee r0 = (X.C128936Ee) r0
            X.C130266Kk.A00(r0, r1, r2)
            return
        L_0x0696:
            java.lang.Object r5 = r6.A00
            java.lang.Object r1 = r6.A01
            X.7fl r1 = (X.C158077fl) r1
            java.lang.Object r4 = r6.A02
            java.util.List r4 = (java.util.List) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.7ku r3 = r1.B7y()
            X.68b r2 = X.C1273868b.A00()
            r1 = 0
        L_0x06ad:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x06bd
            java.lang.Object r0 = r4.get(r1)
            r2.A09(r0, r1)
            int r1 = r1 + 1
            goto L_0x06ad
        L_0x06bd:
            X.4vP r0 = X.C142326oh.A03(r5)
            X.C1273868b.A07(r0, r2, r3)
            return
        L_0x06c5:
            java.lang.Object r2 = r6.A00
            X.6KN r2 = (X.AnonymousClass6KN) r2
            java.lang.Object r1 = r6.A01
            X.7jx r1 = (X.C159807jx) r1
            java.lang.Object r0 = r6.A02
            X.6Ee r0 = (X.C128936Ee) r0
            X.AnonymousClass6KN.A00(r0, r1, r2)
            return
        L_0x06d5:
            java.lang.Object r0 = r6.A00
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r6.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r6.A02
            X.1hq r4 = (X.C34911hq) r4
            java.util.ArrayList r3 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x06e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06f3
            X.C90464aC.A1T(r3, r1)
            goto L_0x06e9
        L_0x06f3:
            X.17Y r2 = r4.A00
            X.1hs r1 = r4.A06
            X.005 r0 = r4.A0C
            java.lang.Object r0 = r0.get()
            X.6VF r0 = (X.AnonymousClass6VF) r0
            r0.A06(r3, r5)
            r0 = 43
            X.C1498172w.A01(r2, r1, r3, r0)
            return
        L_0x0708:
            java.lang.Object r2 = r6.A01
            X.64P r2 = (X.AnonymousClass64P) r2
            java.lang.Object r1 = r6.A00
            X.6Ee r1 = (X.C128936Ee) r1
            java.lang.Object r0 = r6.A02
            X.6OQ r0 = (X.AnonymousClass6OQ) r0
            r2.A00(r0, r1)
            return
        L_0x0718:
            java.lang.Object r1 = r6.A00
            X.6l7 r1 = (X.C140156l7) r1
            java.lang.Object r13 = r6.A01
            com.facebook.msys.mci.DataTask r13 = (com.facebook.msys.mci.DataTask) r13
            java.lang.Object r5 = r6.A02
            com.facebook.msys.mci.NetworkSession r5 = (com.facebook.msys.mci.NetworkSession) r5
            int r2 = r13.mTaskType
            if (r2 == 0) goto L_0x07ec
            r0 = 1
            if (r2 == r0) goto L_0x07b4
            r0 = 2
            if (r2 == r0) goto L_0x07ec
            r0 = 3
            if (r2 == r0) goto L_0x076f
            r0 = 4
            if (r2 != r0) goto L_0x0758
            X.6l9 r4 = r1.A00
            java.util.Map r3 = r4.A05     // Catch:{ IOException -> 0x0748 }
            java.lang.String r2 = r13.mTaskIdentifier     // Catch:{ IOException -> 0x0748 }
            X.5rZ r1 = new X.5rZ     // Catch:{ IOException -> 0x0748 }
            r1.<init>(r13, r4)     // Catch:{ IOException -> 0x0748 }
            X.6SQ r0 = new X.6SQ     // Catch:{ IOException -> 0x0748 }
            r0.<init>(r13, r5, r1, r4)     // Catch:{ IOException -> 0x0748 }
            r3.put(r2, r0)     // Catch:{ IOException -> 0x0748 }
            return
        L_0x0748:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "wa-msys/NetworkSession: "
            r1.append(r0)
            java.lang.String r0 = "Failed to create StreamingUploadDataTask"
            X.C36351kA.A1Q(r0, r1, r2)
            return
        L_0x0758:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DataTask type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " not yet supported"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x076f:
            X.6l9 r7 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r13.mUrlRequest
            java.io.ByteArrayOutputStream r9 = X.C90524aI.A0Q()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07ad }
            java.lang.String r2 = r13.mContentUrl     // Catch:{ all -> 0x07a3 }
            java.lang.String r1 = "file://"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceFirst(r1, r0)     // Catch:{ all -> 0x07a3 }
            java.io.File r0 = X.C90524aI.A0S(r0)     // Catch:{ all -> 0x07a3 }
            java.io.FileInputStream r8 = X.C90524aI.A0U(r0)     // Catch:{ all -> 0x07a3 }
            java.lang.String r10 = r13.mTaskIdentifier     // Catch:{ all -> 0x07a3 }
            r11 = 1
            r12 = 0
            com.facebook.msys.mci.UrlResponse r15 = X.C140176l9.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x07a3 }
            byte[] r17 = r9.toByteArray()     // Catch:{ all -> 0x07a3 }
            java.lang.String r16 = "wa-msys/NetworkSession: "
            r18 = 0
            r14 = r5
            r19 = r18
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x07a3 }
            r9.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07ad }
            return
        L_0x07a3:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x07a8 }
            goto L_0x07ac
        L_0x07a8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07ad }
        L_0x07ac:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07ad }
        L_0x07ad:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUploadDataTask"
            A01(r13, r5, r6, r0, r1)
            return
        L_0x07b4:
            X.6l9 r7 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r13.mUrlRequest
            java.lang.String r1 = "NetworkSessionDownload"
            r8 = 0
            java.io.File r0 = r7.A04     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07e5 }
            java.io.File r18 = java.io.File.createTempFile(r1, r8, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07e5 }
            java.io.FileOutputStream r9 = X.C90524aI.A0W(r18)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07e5 }
            java.lang.String r10 = r13.mTaskIdentifier     // Catch:{ all -> 0x07db }
            r11 = 0
            r12 = 1
            com.facebook.msys.mci.UrlResponse r15 = X.C140176l9.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x07db }
            java.lang.String r16 = "wa-msys/NetworkSession: "
            r19 = r8
            r14 = r5
            r17 = r8
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x07db }
            r9.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07e5 }
            return
        L_0x07db:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x07e0 }
            goto L_0x07e4
        L_0x07e0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07e5 }
        L_0x07e4:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x07e5 }
        L_0x07e5:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDownloadDataTask"
            A01(r13, r5, r6, r0, r1)
            return
        L_0x07ec:
            X.6l9 r7 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r13.mUrlRequest
            java.io.ByteArrayOutputStream r9 = X.C90524aI.A0Q()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0819 }
            java.lang.String r10 = r13.mTaskIdentifier     // Catch:{ all -> 0x080f }
            r11 = 1
            r12 = 0
            r8 = 0
            com.facebook.msys.mci.UrlResponse r15 = X.C140176l9.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x080f }
            byte[] r17 = r9.toByteArray()     // Catch:{ all -> 0x080f }
            java.lang.String r16 = "wa-msys/NetworkSession: "
            r19 = r8
            r14 = r5
            r18 = r8
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x080f }
            r9.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0819 }
            return
        L_0x080f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0814 }
            goto L_0x0818
        L_0x0814:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0819 }
        L_0x0818:
            throw r1     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0819 }
        L_0x0819:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDataDataTask"
            A01(r13, r5, r6, r0, r1)
            return
        L_0x0820:
            java.lang.Object r4 = r6.A00
            X.5xV r4 = (X.C124045xV) r4
            java.lang.Object r3 = r6.A01
            X.5QL r3 = (X.AnonymousClass5QL) r3
            java.lang.Object r2 = r6.A02
            X.00S r2 = (X.AnonymousClass00S) r2
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            X.6Mr r1 = r4.A04
            X.7Qb r0 = new X.7Qb
            r0.<init>(r4, r3, r2)
            monitor-enter(r1)
            r0.invoke()     // Catch:{ all -> 0x083d }
            monitor-exit(r1)
            return
        L_0x083d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0840:
            java.lang.Object r5 = r6.A00
            com.whatsapp.registration.email.VerifyEmail r5 = (com.whatsapp.registration.email.VerifyEmail) r5
            java.lang.Object r4 = r6.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r6.A02
            java.lang.Long r3 = (java.lang.Long) r3
            X.9Pi r6 = r5.A3i()
            java.lang.String r7 = r5.A0F
            int r9 = r5.A00
            java.lang.String r8 = java.lang.String.valueOf(r4)
            r10 = 8
            r11 = 5
            r12 = 2
            r6.A00(r7, r8, r9, r10, r11, r12)
            r0 = 3
            X.AnonymousClass3SJ.A00(r5, r0)
            if (r3 == 0) goto L_0x08a7
            r6 = 0
            long r1 = r3.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x08a7
            com.whatsapp.WaTextView r7 = r5.A04
            java.lang.String r6 = "resendCodeText"
            if (r7 != 0) goto L_0x087a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x087a:
            r0 = 0
            r7.setClickable(r0)
            com.whatsapp.WaTextView r7 = r5.A04
            if (r7 != 0) goto L_0x0887
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0887:
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2131099876(0x7f0600e4, float:1.7812118E38)
            X.C36351kA.A15(r6, r7, r0)
            X.0wI r7 = r5.A3j()
            r0 = 43
            X.3wX r6 = new X.3wX
            r6.<init>((java.lang.Object) r5, (int) r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
            android.os.Handler r0 = r7.A00
            r0.postDelayed(r6, r1)
        L_0x08a7:
            com.whatsapp.registration.email.VerifyEmail.A07(r5, r4, r3)
            return
        L_0x08ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x08ad }
        L_0x08ad:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass737.run():void");
    }

    public static void A01(DataTask dataTask, NetworkSession networkSession, UrlRequest urlRequest, String str, Throwable th) {
        Log.e(str, th);
        NetworkUtils.markDataTaskCompleted(dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest), "wa-msys/NetworkSession: ", (byte[]) null, (File) null, new IOException(th));
    }
}
