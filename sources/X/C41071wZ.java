package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1wZ  reason: invalid class name and case insensitive filesystem */
public class C41071wZ extends AnonymousClass0CZ {
    public C52352pI A00 = C52352pI.ALL;
    public AnonymousClass37U A01;
    public AnonymousClass37U A02;
    public AnonymousClass37V A03;
    public String A04;
    public List A05 = AnonymousClass001.A0I();
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public C42481yt A0A;
    public String A0B;
    public final AnonymousClass17Y A0C;
    public final C40861wE A0D;
    public final C87344Ok A0E;
    public final Runnable A0F = C81183wb.A00(this, 12);
    public final int A0G;
    public final LinearLayoutManager A0H;
    public final C19700wN A0I;
    public final C21100yf A0J;
    public final AnonymousClass1LI A0K;
    public final AnonymousClass16D A0L;
    public final AnonymousClass171 A0M;
    public final AnonymousClass1RY A0N;
    public final C18820ts A0O;
    public final C21010yW A0P;
    public final C28201Rs A0Q;
    public final String A0R;
    public final LinkedHashMap A0S;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C42481yt r1 = this.A0A;
            if (r1 != null) {
                return r1;
            }
            C42481yt r12 = new C42481yt(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0I, this.A0O);
            this.A0A = r12;
            return r12;
        } else if (i == 2) {
            return new C41481xH(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        } else {
            if (i == 3) {
                C21010yW r3 = this.A0P;
                return new C42431yo(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0O, r3);
            } else if (i == 4) {
                return new C42081yF(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
            } else {
                if (i == 10) {
                    C40861wE r32 = this.A0D;
                    List list = AnonymousClass0D3.A0I;
                    AnonymousClass00C.A0D(viewGroup, 0);
                    AnonymousClass00C.A0D(r32, 1);
                    return new C42071yE(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), r32);
                } else if (i == 6) {
                    return new C42061yD(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0O);
                } else if (i == 7) {
                    AnonymousClass2US r5 = new AnonymousClass2US(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), R.string.f12nameremoved);
                    r5.A0G(true);
                    return r5;
                } else if (i == 8) {
                    return new C42201yR(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A0B);
                } else if (i == 9) {
                    return new AnonymousClass2UQ(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
                } else {
                    C21010yW r122 = this.A0P;
                    C21100yf r7 = this.A0J;
                    AnonymousClass16D r9 = this.A0L;
                    AnonymousClass171 r10 = this.A0M;
                    C18820ts r11 = this.A0O;
                    return new C42401yl(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), r7, this.A0K, r9, r10, r11, r122);
                }
            }
        }
    }

    public static int A00(C41071wZ r2) {
        Iterator A10 = C36371kC.A10(r2.A0S);
        int i = 0;
        while (A10.hasNext()) {
            if (AnonymousClass000.A1X(C36351kA.A0u(A10))) {
                i++;
            }
        }
        return i;
    }

    public static int A01(C41071wZ r6) {
        int i = 0;
        for (C80193v0 r0 : r6.A05) {
            if (r0.A00.A0I == 0) {
                i++;
            }
        }
        return i;
    }

    public static int A02(C41071wZ r3, int i) {
        Iterator A10 = C36371kC.A10(r3.A0S);
        int i2 = 0;
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (AnonymousClass000.A1X(A11.getValue())) {
                if (AnonymousClass000.A0I(A11.getKey()) == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r2 < 4) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.A02.size() < 4) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C41071wZ r7) {
        /*
            java.util.LinkedHashMap r6 = r7.A0S
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r6.get(r5)
            if (r0 == 0) goto L_0x003d
            X.37U r0 = r7.A02
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 4
            r3 = 1
            if (r1 >= r0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            X.37U r0 = r7.A01
            if (r0 == 0) goto L_0x002a
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r3 != 0) goto L_0x003e
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r6.get(r5)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 0
        L_0x003a:
            A04(r7, r4, r0)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r6.get(r5)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x003d
            r0 = 1
            goto L_0x003a
        L_0x004e:
            int r0 = A02(r7, r4)
            if (r0 < 0) goto L_0x003d
            r7.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41071wZ.A03(X.1wZ):void");
    }

    public static void A04(C41071wZ r4, int i, boolean z) {
        LinkedHashMap linkedHashMap = r4.A0S;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.get(valueOf) != null && AnonymousClass000.A1X(linkedHashMap.get(valueOf)) != z) {
            if (z) {
                linkedHashMap.put(valueOf, C36371kC.A0m());
                int A022 = A02(r4, i);
                r4.A08(A022);
                if (A022 == 0) {
                    LinearLayoutManager linearLayoutManager = r4.A0H;
                    if (linearLayoutManager.A1S() == 0) {
                        linearLayoutManager.A17(0);
                        return;
                    }
                    return;
                }
                return;
            }
            r4.A09(A02(r4, i));
            linkedHashMap.put(valueOf, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04a9, code lost:
        if (r6 != 0) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04bb, code lost:
        if (r6 == 0) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04c1, code lost:
        if (r7 != 0) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04c3, code lost:
        r1 = X.C36321k7.A0B(r8.A00.getResources(), r7, 0, com.whatsapp.R.plurals.f10nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ef, code lost:
        if (r12.A02.size() < 4) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c4, code lost:
        if (r3 != 0) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01cf, code lost:
        if (r3 <= 0) goto L_0x01c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BSE(X.AnonymousClass0D3 r21, int r22) {
        /*
            r20 = this;
            r8 = r21
            boolean r0 = r8 instanceof X.C42481yt
            r9 = r20
            if (r0 == 0) goto L_0x0073
            X.1yt r8 = (X.C42481yt) r8
            X.37V r1 = r9.A03
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "storage-usage-summary-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r6 = r1.A01
            long r4 = r1.A00
            long r13 = r1.A02
            long r2 = r13 - r4
            long r2 = r2 - r6
            double r11 = (double) r4
            double r0 = (double) r13
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r9
            r9 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 * r9
            r9 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r9
            r9 = 4737168216739020800(0x41bdcd6500000000, double:5.0E8)
            double r9 = java.lang.Math.min(r0, r9)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            boolean r17 = X.C36431kI.A1P(r0)
            X.0ts r9 = r8.A0F
            java.lang.String r10 = X.AnonymousClass3TF.A02(r9, r6)
            java.lang.String r11 = X.AnonymousClass3TF.A02(r9, r4)
            r0 = 0
            long r0 = java.lang.Math.max(r0, r2)
            java.lang.String r12 = X.AnonymousClass3TF.A02(r9, r0)
            long r0 = r8.A01
            java.lang.String r0 = X.AnonymousClass3TF.A02(r9, r0)
            boolean r0 = X.C1901797e.A00(r10, r0)
            if (r0 == 0) goto L_0x0224
            long r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r9, r0)
            boolean r0 = X.C1901797e.A00(r11, r0)
            if (r0 == 0) goto L_0x0224
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            boolean r0 = r8.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x0224
        L_0x0072:
            return
        L_0x0073:
            boolean r0 = r8 instanceof X.C42401yl
            if (r0 == 0) goto L_0x00d0
            X.1yl r8 = (X.C42401yl) r8
            java.util.List r1 = r9.A05
            int r0 = A00(r9)
            int r2 = r22 - r0
            java.lang.Object r6 = r1.get(r2)
            X.3v0 r6 = (X.C80193v0) r6
            X.1RY r11 = r9.A0N
            java.lang.String r10 = r9.A04
            java.util.List r3 = r9.A06
            java.lang.String r5 = r9.A0R
            int r4 = r9.A0G
            X.1Rs r7 = r9.A0Q
            X.16D r1 = r8.A03
            X.11F r0 = r6.A01()
            X.141 r2 = r1.A08(r0)
            if (r2 != 0) goto L_0x00a6
            android.view.View r0 = r8.A0H
            r9 = 0
        L_0x00a2:
            r0.setOnClickListener(r9)
            return
        L_0x00a6:
            com.whatsapp.components.button.ThumbnailButton r1 = r8.A02
            r0 = 0
            r11.A0B(r1, r2, r0)
            X.3SF r0 = r8.A01
            if (r10 == 0) goto L_0x00cc
            r0.A08(r2, r3)
        L_0x00b3:
            android.widget.TextView r3 = r8.A00
            X.0ts r2 = r8.A04
            X.3Xe r0 = r6.A00
            long r0 = r0.A0I
            X.AnonymousClass3TF.A05(r3, r2, r0)
            android.view.View r0 = r8.A0H
            X.3YX r9 = new X.3YX
            r15 = 0
            r10 = r8
            r11 = r6
            r12 = r7
            r13 = r5
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x00a2
        L_0x00cc:
            r0.A05(r2)
            goto L_0x00b3
        L_0x00d0:
            boolean r0 = r8 instanceof X.C42431yo
            if (r0 == 0) goto L_0x017d
            X.1yo r8 = (X.C42431yo) r8
            X.37U r6 = r9.A02
            X.37U r12 = r9.A01
            java.lang.String r3 = r9.A0R
            int r2 = r9.A0G
            X.1Rs r4 = r9.A0Q
            java.lang.String r0 = "storage-usage-cleanup-suggestions-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r12 == 0) goto L_0x00f1
            java.util.List r0 = r12.A02
            int r5 = r0.size()
            r1 = 4
            r0 = 1
            if (r5 >= r1) goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r5 = 0
            r7 = 8
            if (r0 == 0) goto L_0x0177
            android.view.View r11 = r8.A00
            r19 = 1
            X.3YX r13 = new X.3YX
            r14 = r8
            r15 = r12
            r16 = r4
            r17 = r3
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r11.setOnClickListener(r13)
            long r0 = r12.A01
            android.widget.TextView r10 = r8.A02
            X.0ts r9 = r8.A05
            X.AnonymousClass3TF.A05(r10, r9, r0)
            r13 = 0
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            int r0 = X.C36421kH.A00(r9)
            r11.setVisibility(r0)
            com.whatsapp.storage.StorageUsageMediaPreviewView r10 = r8.A07
            java.util.List r9 = r12.A02
            int r1 = r12.A00
            java.lang.String r0 = "forwarded_files"
            r10.setPreviewMediaItems(r9, r1, r0)
            r11.setVisibility(r5)
        L_0x012d:
            if (r6 == 0) goto L_0x0454
            java.util.List r9 = r6.A02
            int r1 = r9.size()
            r0 = 4
            if (r1 < r0) goto L_0x0454
            android.view.View r7 = r8.A01
            r16 = 2
            X.3YX r10 = new X.3YX
            r11 = r8
            r12 = r6
            r13 = r4
            r14 = r3
            r15 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r7.setOnClickListener(r10)
            android.widget.TextView r2 = r8.A04
            android.content.Context r0 = X.C36441kJ.A0F(r8)
            X.0ts r1 = r8.A05
            java.lang.String r0 = X.AnonymousClass1V2.A04(r0, r1)
            r2.setText(r0)
            long r3 = r6.A01
            android.widget.TextView r0 = r8.A03
            X.AnonymousClass3TF.A05(r0, r1, r3)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            int r0 = X.C36421kH.A00(r0)
            r7.setVisibility(r0)
            com.whatsapp.storage.StorageUsageMediaPreviewView r2 = r8.A08
            int r1 = r6.A00
            java.lang.String r0 = "large_files"
            r2.setPreviewMediaItems(r9, r1, r0)
            r7.setVisibility(r5)
            return
        L_0x0177:
            android.view.View r0 = r8.A00
            r0.setVisibility(r7)
            goto L_0x012d
        L_0x017d:
            boolean r0 = r8 instanceof X.C42081yF
            if (r0 == 0) goto L_0x01d2
            java.util.List r0 = r9.A05
            java.util.Iterator r1 = r0.iterator()
            r3 = 0
        L_0x0188:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.Object r0 = r1.next()
            X.3v0 r0 = (X.C80193v0) r0
            X.11F r0 = r0.A01()
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0188
            int r3 = r3 + 1
            goto L_0x0188
        L_0x019f:
            X.1yF r8 = (X.C42081yF) r8
            java.util.List r0 = r9.A05
            int r1 = X.C36421kH.A06(r0, r3)
            X.4Ok r2 = r9.A0E
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x01bf
            r1 = 2131894682(0x7f12219a, float:1.9424176E38)
        L_0x01b0:
            com.whatsapp.WaTextView r0 = r8.A01
            r0.setText(r1)
            if (r2 == 0) goto L_0x0072
            com.whatsapp.WaImageView r1 = r8.A00
            r0 = 29
            X.C67103Yn.A00(r1, r2, r0)
            return
        L_0x01bf:
            if (r1 <= 0) goto L_0x01ca
            r1 = 2131896976(0x7f122a90, float:1.9428828E38)
            if (r3 == 0) goto L_0x01b0
        L_0x01c6:
            r1 = 2131894669(0x7f12218d, float:1.942415E38)
            goto L_0x01b0
        L_0x01ca:
            if (r1 != 0) goto L_0x01c6
            r1 = 2131894668(0x7f12218c, float:1.9424147E38)
            if (r3 > 0) goto L_0x01b0
            goto L_0x01c6
        L_0x01d2:
            boolean r0 = r8 instanceof X.C42071yE
            if (r0 == 0) goto L_0x01e0
            X.1yE r8 = (X.C42071yE) r8
            androidx.recyclerview.widget.RecyclerView r1 = r8.A00
            X.1wE r0 = r8.A01
            r1.setAdapter(r0)
            return
        L_0x01e0:
            boolean r0 = r8 instanceof X.C42061yD
            if (r0 == 0) goto L_0x020e
            X.1yD r8 = (X.C42061yD) r8
            java.util.List r0 = r9.A05
            java.util.Iterator r6 = r0.iterator()
            r7 = 0
        L_0x01ed:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x045a
            java.lang.Object r5 = r6.next()
            X.3v0 r5 = (X.C80193v0) r5
            X.3Xe r0 = r5.A00
            long r3 = r0.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ed
            X.11F r0 = r5.A01()
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x01ed
            int r7 = r7 + 1
            goto L_0x01ed
        L_0x020e:
            boolean r0 = r8 instanceof X.C42201yR
            if (r0 == 0) goto L_0x0072
            X.1yR r8 = (X.C42201yR) r8
            X.1Rs r2 = r9.A0Q
            com.whatsapp.settings.SettingsRowIconText r1 = r8.A01
            r0 = 30
            X.AnonymousClass3YC.A00(r1, r8, r2, r0)
            com.whatsapp.WaTextView r1 = r8.A00
            r0 = 3
            r1.setMaxLines(r0)
            return
        L_0x0224:
            r8.A01 = r6
            r8.A00 = r4
            com.whatsapp.WaTextView r11 = r8.A0B
            r1 = 2131894685(0x7f12219d, float:1.9424182E38)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r10
            java.lang.String r0 = r9.A0D(r1, r0)
            r11.setText(r0)
            com.whatsapp.WaTextView r10 = r8.A0C
            r1 = 2131894689(0x7f1221a1, float:1.942419E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r12
            java.lang.String r0 = r9.A0D(r1, r0)
            r10.setText(r0)
            boolean r1 = r8.A03
            r0 = r17
            if (r1 == r0) goto L_0x02de
            r8.A03 = r0
            android.animation.AnimatorSet r0 = r8.A02
            if (r0 == 0) goto L_0x0259
            r0.cancel()
        L_0x0259:
            android.animation.AnimatorSet r0 = X.C36441kJ.A0C()
            r8.A02 = r0
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            boolean r0 = r8.A03
            r15 = 0
            if (r0 == 0) goto L_0x0270
            com.whatsapp.WaImageView r0 = r8.A09
            r0.setAlpha(r15)
            r0.setVisibility(r2)
        L_0x0270:
            android.animation.FloatEvaluator r16 = new android.animation.FloatEvaluator
            r16.<init>()
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            boolean r1 = r8.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x027f
            r0 = 0
        L_0x027f:
            X.AnonymousClass000.A1I(r12, r0, r2)
            if (r1 == 0) goto L_0x0286
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x0286:
            X.AnonymousClass000.A1I(r12, r15, r3)
            r0 = r16
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r0, r12)
            r0 = 14
            X.C53562rW.A00(r1, r8, r0)
            r10.add(r1)
            android.animation.ArgbEvaluator r12 = new android.animation.ArgbEvaluator
            r12.<init>()
            java.lang.Object[] r11 = new java.lang.Object[r11]
            boolean r1 = r8.A03
            if (r1 == 0) goto L_0x0427
            int r0 = r8.A05
        L_0x02a4:
            X.AnonymousClass000.A1L(r11, r0, r2)
            if (r1 == 0) goto L_0x0423
            int r0 = r8.A04
        L_0x02ab:
            X.AnonymousClass000.A1L(r11, r0, r3)
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r12, r11)
            r0 = 15
            X.C53562rW.A00(r1, r8, r0)
            r10.add(r1)
            android.animation.AnimatorSet r1 = r8.A02
            r0 = 29
            X.AnonymousClass4VL.A00(r1, r8, r0)
            android.animation.AnimatorSet r0 = r8.A02
            X.C36391kE.A13(r0)
            android.animation.AnimatorSet r11 = r8.A02
            r0 = 300(0x12c, double:1.48E-321)
            r11.setStartDelay(r0)
            android.animation.AnimatorSet r11 = r8.A02
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.setDuration(r0)
            android.animation.AnimatorSet r0 = r8.A02
            r0.playTogether(r10)
            android.animation.AnimatorSet r0 = r8.A02
            r0.start()
        L_0x02de:
            com.whatsapp.storage.SizeTickerView r12 = r8.A0H
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r12.A01 = r1
            r12.A00 = r0
            android.view.View r11 = r8.A0H
            android.content.Context r15 = r11.getContext()
            android.content.Context r10 = r11.getContext()
            r1 = 2130970618(0x7f0407fa, float:1.7549951E38)
            r0 = 2131102215(0x7f060a07, float:1.7816862E38)
            int r0 = X.C36351kA.A02(r10, r15, r1, r0)
            r12.A0D(r0, r6, r3)
            com.whatsapp.WaTextView r12 = r8.A0D
            r15 = 2131755350(0x7f100156, float:1.9141577E38)
            android.util.Pair r0 = X.AnonymousClass3TF.A00(r9, r6, r2, r2)
            java.lang.Object r10 = r0.second
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r0 = r0.first
            r1[r2] = r0
            java.lang.String r0 = r9.A0I(r10, r1, r15)
            r12.setText(r0)
            com.whatsapp.storage.SizeTickerView r10 = r8.A0G
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r10.A01 = r1
            r10.A00 = r0
            android.content.Context r1 = r11.getContext()
            r0 = 2131102329(0x7f060a79, float:1.7817093E38)
            if (r17 == 0) goto L_0x032f
            r0 = 2131102331(0x7f060a7b, float:1.7817097E38)
        L_0x032f:
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r10.A0D(r0, r4, r3)
            com.whatsapp.WaTextView r11 = r8.A0A
            r12 = 2131755349(0x7f100155, float:1.9141575E38)
            android.util.Pair r0 = X.AnonymousClass3TF.A00(r9, r4, r2, r2)
            java.lang.Object r10 = r0.second
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r0 = r0.first
            r1[r2] = r0
            java.lang.String r0 = r9.A0I(r10, r1, r12)
            r11.setText(r0)
            float r10 = (float) r6
            float r0 = (float) r13
            float r10 = r10 / r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r1
            float r6 = (float) r4
            float r6 = r6 / r0
            float r6 = r6 * r1
            float r1 = r1 - r6
            float r1 = r1 - r10
            r0 = 0
            r5 = 2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0432
            float[] r9 = new float[r5]
            r9[r2] = r10
            r9[r3] = r1
            if (r17 == 0) goto L_0x041f
            int r7 = r8.A04
        L_0x036b:
            com.whatsapp.components.SegmentedProgressBar r4 = r8.A0E
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r4.A01 = r1
            r4.A00 = r0
            int[] r6 = r8.A0I
            r10 = 2
            r11 = 0
            r4.A06 = r2
            r1 = 0
        L_0x037c:
            float r1 = (float) r1
            r0 = r9[r11]
            float r1 = r1 + r0
            int r1 = (int) r1
            r4.A06 = r1
            int r11 = r11 + 1
            if (r11 < r5) goto L_0x037c
            if (r1 < 0) goto L_0x042b
            r0 = 100
            if (r1 > r0) goto L_0x042b
            float[] r0 = r4.A0D
            if (r0 == 0) goto L_0x0394
            int r0 = r0.length
            if (r0 == r5) goto L_0x0398
        L_0x0394:
            float[] r0 = new float[r5]
            r4.A0D = r0
        L_0x0398:
            r4.A0E = r6
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            android.animation.AnimatorSet r0 = r4.A08
            if (r0 == 0) goto L_0x03a5
            r0.cancel()
        L_0x03a5:
            android.animation.AnimatorSet r0 = X.C36441kJ.A0C()
            r4.A08 = r0
            r6 = 0
        L_0x03ac:
            float[] r11 = r4.A0D
            r1 = r11[r6]
            r0 = r9[r6]
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x03cf
            float[] r1 = new float[r10]
            r0 = r11[r6]
            r1[r2] = r0
            r0 = r9[r6]
            r1[r3] = r0
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            X.2ra r0 = new X.2ra
            r0.<init>(r4, r6, r2)
            r1.addUpdateListener(r0)
            r5.add(r1)
        L_0x03cf:
            int r6 = r6 + 1
            if (r6 < r10) goto L_0x03ac
            int r0 = r4.A02
            if (r0 == r7) goto L_0x03ed
            android.animation.ArgbEvaluator r6 = new android.animation.ArgbEvaluator
            r6.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r10]
            int r0 = r4.A02
            X.C36331k8.A1X(r1, r0, r2, r7, r3)
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofObject(r6, r1)
            X.C53562rW.A00(r0, r4, r3)
            r5.add(r0)
        L_0x03ed:
            android.animation.AnimatorSet r1 = r4.A08
            X.1kL r0 = new X.1kL
            r0.<init>(r4, r9, r7)
            r1.addListener(r0)
            android.animation.AnimatorSet r0 = r4.A08
            X.C36391kE.A13(r0)
            android.animation.AnimatorSet r3 = r4.A08
            int r0 = r4.A01
            long r0 = (long) r0
            r3.setDuration(r0)
            android.animation.AnimatorSet r3 = r4.A08
            int r0 = r4.A00
            long r0 = (long) r0
            r3.setStartDelay(r0)
            android.animation.AnimatorSet r0 = r4.A08
            r0.playTogether(r5)
            android.animation.AnimatorSet r0 = r4.A08
            r0.start()
            r4.setVisibility(r2)
            android.view.View r0 = r8.A07
            r0.setVisibility(r2)
            return
        L_0x041f:
            int r7 = r8.A06
            goto L_0x036b
        L_0x0423:
            int r0 = r8.A05
            goto L_0x02ab
        L_0x0427:
            int r0 = r8.A04
            goto L_0x02a4
        L_0x042b:
            java.lang.String r0 = "Progress sum must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0432:
            com.whatsapp.components.SegmentedProgressBar r0 = r8.A0E
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r8.A07
            r0.setVisibility(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.AnonymousClass000.A1I(r1, r10, r2)
            X.AnonymousClass000.A1I(r1, r6, r3)
            java.lang.String r0 = "usedSpacePercentage: %s, freeSpacePercentage: %s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            X.0wN r1 = r8.A08
            java.lang.String r0 = "storage-usage-summary progress percentages sum up above 100"
            r1.A0E(r0, r2, r3)
            return
        L_0x0454:
            android.view.View r0 = r8.A01
            r0.setVisibility(r7)
            return
        L_0x045a:
            java.util.List r0 = r9.A05
            java.util.Iterator r5 = r0.iterator()
            r6 = 0
        L_0x0461:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0482
            java.lang.Object r1 = r5.next()
            X.3v0 r1 = (X.C80193v0) r1
            X.11F r0 = r1.A01()
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0461
            X.3Xe r0 = r1.A00
            long r3 = r0.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0461
            int r6 = r6 + 1
            goto L_0x0461
        L_0x0482:
            X.2pI r5 = r9.A00
            X.2pI r2 = X.C52352pI.ALL
            if (r5 != r2) goto L_0x049f
            if (r7 != 0) goto L_0x049f
            if (r6 != 0) goto L_0x049f
            android.widget.TextView r0 = r8.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131894688(0x7f1221a0, float:1.9424188E38)
        L_0x0495:
            java.lang.String r1 = r1.getString(r0)
        L_0x0499:
            android.widget.TextView r0 = r8.A00
            r0.setText(r1)
            return
        L_0x049f:
            r4 = 0
            r3 = 1
            if (r5 != r2) goto L_0x04a5
            if (r7 == 0) goto L_0x04ab
        L_0x04a5:
            X.2pI r1 = X.C52352pI.CHANNELS
            if (r5 != r1) goto L_0x04b9
            if (r6 == 0) goto L_0x04bd
        L_0x04ab:
            android.widget.TextView r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755346(0x7f100152, float:1.9141569E38)
            java.lang.String r1 = X.C36321k7.A0B(r1, r6, r4, r0)
            goto L_0x0499
        L_0x04b9:
            if (r5 != r2) goto L_0x04bd
            if (r6 == 0) goto L_0x04c3
        L_0x04bd:
            X.2pI r0 = X.C52352pI.CHATS
            if (r5 != r0) goto L_0x04d1
            if (r7 == 0) goto L_0x04f8
        L_0x04c3:
            android.widget.TextView r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755347(0x7f100153, float:1.914157E38)
            java.lang.String r1 = X.C36321k7.A0B(r1, r7, r4, r0)
            goto L_0x0499
        L_0x04d1:
            if (r5 != r2) goto L_0x04e7
            android.widget.TextView r0 = r8.A00
            android.content.Context r2 = r0.getContext()
            r1 = 2131894670(0x7f12218e, float:1.9424151E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r7 = r7 + r6
            X.AnonymousClass000.A1L(r0, r7, r4)
            java.lang.String r1 = r2.getString(r1, r0)
            goto L_0x0499
        L_0x04e7:
            if (r5 == r0) goto L_0x04f8
            if (r5 != r1) goto L_0x04f5
            android.widget.TextView r0 = r8.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131894686(0x7f12219e, float:1.9424184E38)
            goto L_0x0495
        L_0x04f5:
            java.lang.String r1 = ""
            goto L_0x0499
        L_0x04f8:
            android.widget.TextView r0 = r8.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131894687(0x7f12219f, float:1.9424186E38)
            goto L_0x0495
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41071wZ.BSE(X.0D3, int):void");
    }

    public int getItemViewType(int i) {
        Iterator A10 = C36371kC.A10(this.A0S);
        int i2 = 0;
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            if (AnonymousClass000.A1X(A11.getValue())) {
                if (i2 == i) {
                    return AnonymousClass000.A0I(A11.getKey());
                }
                i2++;
            }
        }
        if (this.A07 && !this.A09 && ((this.A05.size() == 0 || A01(this) > 0) && i == A0J() - 1)) {
            return 6;
        }
        if (!this.A09 || this.A05.size() != 0) {
            return 5;
        }
        return 7;
    }

    public C41071wZ(LinearLayoutManager linearLayoutManager, C19700wN r7, C57872yx r8, AnonymousClass17Y r9, C21100yf r10, AnonymousClass1LI r11, AnonymousClass16D r12, AnonymousClass171 r13, AnonymousClass1RY r14, C18820ts r15, C21010yW r16, C87344Ok r17, C28201Rs r18, String str, String str2, int i, boolean z) {
        this.A0C = r9;
        this.A0I = r7;
        this.A0P = r16;
        this.A0J = r10;
        this.A0L = r12;
        this.A0M = r13;
        this.A0O = r15;
        this.A0K = r11;
        this.A0H = linearLayoutManager;
        this.A0N = r14;
        this.A0G = i;
        this.A0R = str;
        this.A0Q = r18;
        this.A0B = str2;
        this.A08 = z;
        this.A0D = new C40861wE((C57882yy) r8.A00.A00.A1u.get(), this);
        LinkedHashMap A1G = C36431kI.A1G();
        this.A0S = A1G;
        Integer A0j = C36361kB.A0j();
        Boolean A0j2 = C36381kD.A0j();
        A1G.put(A0j, A0j2);
        A1G.put(C36331k8.A0M(C36331k8.A0Q(C36331k8.A0L(1, true, A1G), A0j2, A1G), true, A1G), true);
        if (z) {
            this.A0E = r17;
            C36331k8.A1Q(true, A1G, 10);
            return;
        }
        this.A0E = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.A05.size() != 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0J() {
        /*
            r3 = this;
            int r2 = A00(r3)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0041
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0041
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            int r0 = A01(r3)
            int r1 = r1 - r0
        L_0x0017:
            int r2 = r2 + r1
            boolean r0 = r3.A07
            r1 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = r3.A05
            int r0 = r0.size()
            if (r0 == 0) goto L_0x002f
            int r0 = A01(r3)
            if (r0 <= 0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r2 = r2 + r1
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            r0 = 1
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            int r2 = r2 + r0
            return r2
        L_0x0041:
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41071wZ.A0J():int");
    }
}
