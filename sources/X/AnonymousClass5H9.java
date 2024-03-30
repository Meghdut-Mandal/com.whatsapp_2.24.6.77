package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5H9  reason: invalid class name */
public class AnonymousClass5H9 extends C129046Es implements C160667lO {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public AnonymousClass11F A05;
    public C100774ve A06;
    public C78053rU A07;
    public C88234Rx A08;
    public C106645Kr A09;
    public C106685Kv A0A;
    public C106665Kt A0B;
    public C147396x9 A0C;
    public List A0D;
    public boolean A0E = false;
    public C106655Ks A0F;
    public C106655Ks A0G;
    public C106655Ks A0H;
    public C106655Ks A0I;
    public String A0J;
    public HashMap A0K;
    public List A0L;
    public boolean A0M = false;
    public final int A0N;
    public final int A0O;
    public final LayoutInflater A0P;
    public final ViewTreeObserver.OnGlobalLayoutListener A0Q = new C164757sK(this, 21);
    public final C19700wN A0R;
    public final C19730wQ A0S;
    public final C20810yC A0T;
    public final C21010yW A0U;
    public final C24031Au A0V;
    public final AnonymousClass1HA A0W;
    public final AnonymousClass3RZ A0X;
    public final AnonymousClass1AP A0Y;
    public final C88234Rx A0Z = new C109125Wj(this, 1);
    public final C95494lK A0a;
    public final C147416xB A0b;
    public final C133356Xz A0c;
    public final C19420v0 A0d;
    public final AnonymousClass1BB A0e;
    public final AnonymousClass3GT A0f;
    public final StickerPackDownloader A0g;
    public final AnonymousClass005 A0h;

    public static C106655Ks A00(AnonymousClass5H9 r8, int i) {
        return new C106655Ks(r8.A05, r8.A0P, r8.A0T, r8.A0W, r8.A0Z, i, r8.A0O, r8.A0N);
    }

    public static void A02(AnonymousClass5H9 r3) {
        C147396x9[] r2 = (C147396x9[]) r3.A0D.toArray(new C147396x9[0]);
        r3.A0b.A00(r2);
        C100774ve r1 = r3.A06;
        if (r1 != null) {
            AnonymousClass00C.A0D(r2, 0);
            C100774ve.A01(r1, r2);
            r1.A09();
            r3.A06.A09();
        }
    }

    public static boolean A03(AnonymousClass5H9 r1) {
        C95494lK r0;
        AnonymousClass3GT r02 = r1.A0f;
        if (!(r02 == null || !r02.A01() || (r0 = r1.A0a) == null)) {
            C001700s r12 = r0.A02;
            if (r12.A04() == null || C36401kF.A0w(r12).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A08() {
        if (this.A04.getVisibility() == 0) {
            C19420v0 r8 = this.A0d;
            long A0B2 = C36341k9.A0B(C36341k9.A0E(r8), "sticker_store_update_hidden_time");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - A0B2 >= 604800000) {
                C36341k9.A0w(C19420v0.A00(r8), "sticker_store_update_hidden_time", currentTimeMillis);
            }
        }
        Iterator A0s = C36361kB.A0s(this.A0e);
        while (A0s.hasNext()) {
            ((C129156Fn) A0s.next()).A04();
        }
        Context context = this.A05;
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.StickerStoreActivity");
        context.startActivity(A0D2);
        this.A0U.Bly(new AnonymousClass2N3());
    }

    public void A09(String str) {
        this.A0J = str;
        C147396x9 A012 = A01(str, this.A0D);
        if (A012 != null) {
            A06(this.A0D.indexOf(A012), true);
            this.A0J = null;
        }
    }

    public void BXU(boolean z, boolean z2) {
        C106665Kt r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
            if (this.A0E && z && !z2) {
                A09("starred");
            }
        }
    }

    public void BeK() {
        C106685Kv r0 = this.A0A;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void Bhh(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i) {
        if (!this.A0K.containsKey(str)) {
            BsL((String) null, hashMap, hashMap2, hashSet, list);
            return;
        }
        C106675Ku r0 = (C106675Ku) this.A0K.get(str);
        r0.A01 = i;
        r0.A05();
    }

    public void Bhk(AnonymousClass68B r3) {
        C106675Ku r0 = (C106675Ku) this.A0K.get(r3.A0F);
        if (r0 != null) {
            r0.A06(r3);
            r0.A01();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r18v6, types: [X.5Ku] */
    /* JADX WARNING: type inference failed for: r18v7, types: [X.5Kq] */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0425, code lost:
        if (r7 == false) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a3, code lost:
        if (r32 != null) goto L_0x04a5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x045d A[LOOP:10: B:166:0x0457->B:168:0x045d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsL(java.lang.String r32, java.util.HashMap r33, java.util.HashMap r34, java.util.HashSet r35, java.util.List r36) {
        /*
            r31 = this;
            r13 = r31
            java.util.List r0 = r13.A0L
            boolean r17 = X.AnonymousClass000.A1V(r0)
            r29 = r36
            r0 = r29
            r13.A0L = r0
            java.util.Iterator r2 = r29.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0098
            X.68B r1 = X.C90514aH.A0g(r2)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0012
            r0 = 1
        L_0x0027:
            r5 = 8
            if (r0 == 0) goto L_0x0095
            X.0v0 r0 = r13.A0d
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r0)
            java.lang.String r0 = "sticker_store_update_hidden_time"
            long r0 = X.C36341k9.A0B(r1, r0)
            long r3 = X.C36441kJ.A0A(r0)
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r1 = X.C36401kF.A1U(r0)
            android.view.View r0 = r13.A04
            if (r1 == 0) goto L_0x0049
            r5 = 0
        L_0x0049:
            r0.setVisibility(r5)
            int r15 = r29.size()
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r29.iterator()
        L_0x0068:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009a
            X.68B r1 = X.C90514aH.A0g(r4)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0068
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x007c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            X.6c4 r1 = X.C90504aG.A0U(r2)
            X.3S2 r0 = r1.A04
            if (r0 == 0) goto L_0x007c
            X.1XQ[] r0 = r0.A0D
            if (r0 == 0) goto L_0x007c
            int r0 = r0.length
            if (r0 <= 0) goto L_0x007c
            r3.add(r1)
            goto L_0x007c
        L_0x0095:
            android.view.View r0 = r13.A04
            goto L_0x0049
        L_0x0098:
            r0 = 0
            goto L_0x0027
        L_0x009a:
            int r0 = r3.size()
            r16 = 1
            if (r0 <= 0) goto L_0x0102
            r16 = 0
            java.util.Iterator r14 = r3.iterator()
        L_0x00a8:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00f4
            X.6c4 r3 = X.C90504aG.A0U(r14)
            X.3RZ r7 = r13.A0X
            X.3S2 r0 = r3.A04
            r6 = 0
            if (r0 == 0) goto L_0x00a8
            X.1XQ[] r5 = r0.A0D
            if (r5 == 0) goto L_0x00a8
            int r4 = r5.length
            r12 = 0
        L_0x00bf:
            if (r6 >= r4) goto L_0x00d7
            r2 = r5[r6]
            java.util.HashMap r1 = r7.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r0 = r1.get(r2)
            int r0 = X.AnonymousClass000.A0I(r0)
            r12 = r12 | r0
        L_0x00d4:
            int r6 = r6 + 1
            goto L_0x00bf
        L_0x00d7:
            r0 = r12 & 1
            if (r0 == 0) goto L_0x00de
            r11.add(r3)
        L_0x00de:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x00e5
            r10.add(r3)
        L_0x00e5:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x00ec
            r8.add(r3)
        L_0x00ec:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x00a8
            r9.add(r3)
            goto L_0x00a8
        L_0x00f4:
            X.76G r0 = X.AnonymousClass76G.A00
            java.util.Collections.sort(r11, r0)
            java.util.Collections.sort(r10, r0)
            java.util.Collections.sort(r8, r0)
            java.util.Collections.sort(r9, r0)
        L_0x0102:
            java.util.ArrayList r12 = X.C36441kJ.A14(r15)
            boolean r0 = A03(r13)
            if (r0 == 0) goto L_0x0145
            X.5Kr r7 = r13.A09
            if (r7 != 0) goto L_0x0139
            X.0yC r14 = r13.A0T
            android.content.Context r6 = r13.A05
            android.view.LayoutInflater r5 = r13.A0P
            X.1HA r4 = r13.A0W
            X.4Rx r3 = r13.A0Z
            X.4lK r2 = r13.A0a
            int r1 = r13.A0O
            int r0 = r13.A0N
            X.5Kr r7 = new X.5Kr
            r18 = r7
            r19 = r6
            r20 = r5
            r21 = r14
            r22 = r4
            r23 = r3
            r24 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r13.A09 = r7
        L_0x0139:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r0 == 0) goto L_0x0140
            r7.A01()
        L_0x0140:
            X.5Kr r0 = r13.A09
            r12.add(r0)
        L_0x0145:
            X.5Kv r14 = r13.A0A
            if (r14 != 0) goto L_0x017e
            X.0yC r15 = r13.A0T
            android.content.Context r7 = r13.A05
            X.0wQ r6 = r13.A0S
            android.view.LayoutInflater r5 = r13.A0P
            X.005 r0 = r13.A0h
            java.lang.Object r4 = r0.get()
            X.5Ar r4 = (X.C104665Ar) r4
            X.1HA r3 = r13.A0W
            X.4Rx r2 = r13.A0Z
            int r1 = r13.A0O
            int r0 = r13.A0N
            X.5Kv r14 = new X.5Kv
            r18 = r14
            r19 = r7
            r20 = r5
            r21 = r6
            r22 = r15
            r23 = r13
            r24 = r4
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r13.A0A = r14
        L_0x017e:
            int r0 = r29.size()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r14.A07 = r0
            X.5Kv r0 = r13.A0A
            r12.add(r0)
            X.5Kt r7 = r13.A0B
            if (r7 != 0) goto L_0x01bc
            X.0yC r14 = r13.A0T
            android.content.Context r6 = r13.A05
            X.1AP r5 = r13.A0Y
            android.view.LayoutInflater r4 = r13.A0P
            X.1HA r3 = r13.A0W
            X.4Rx r2 = r13.A0Z
            int r1 = r13.A0O
            r27 = 0
            int r0 = r13.A0N
            X.5Kt r7 = new X.5Kt
            r18 = r7
            r19 = r6
            r20 = r4
            r21 = r14
            r22 = r3
            r23 = r5
            r24 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r13.A0B = r7
        L_0x01bc:
            r12.add(r7)
            if (r16 != 0) goto L_0x0226
            X.5Ks r0 = r13.A0F
            if (r0 != 0) goto L_0x01cc
            r0 = 1
            X.5Ks r0 = A00(r13, r0)
            r13.A0F = r0
        L_0x01cc:
            r0.A01 = r11
            X.4mj r0 = r0.A00()
            r0.A0L(r11)
            X.5Ks r0 = r13.A0F
            r12.add(r0)
            X.5Ks r0 = r13.A0G
            if (r0 != 0) goto L_0x01e5
            r0 = 2
            X.5Ks r0 = A00(r13, r0)
            r13.A0G = r0
        L_0x01e5:
            r0.A01 = r9
            X.4mj r0 = r0.A00()
            r0.A0L(r9)
            X.5Ks r0 = r13.A0G
            r12.add(r0)
            X.5Ks r0 = r13.A0H
            if (r0 != 0) goto L_0x01fe
            r0 = 4
            X.5Ks r0 = A00(r13, r0)
            r13.A0H = r0
        L_0x01fe:
            r0.A01 = r8
            X.4mj r0 = r0.A00()
            r0.A0L(r8)
            X.5Ks r0 = r13.A0H
            r12.add(r0)
            X.5Ks r0 = r13.A0I
            if (r0 != 0) goto L_0x0218
            r0 = 8
            X.5Ks r0 = A00(r13, r0)
            r13.A0I = r0
        L_0x0218:
            r0.A01 = r10
            X.4mj r0 = r0.A00()
            r0.A0L(r10)
            X.5Ks r0 = r13.A0I
            r12.add(r0)
        L_0x0226:
            int r0 = r29.size()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            java.util.Iterator r1 = r29.iterator()
        L_0x0233:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0243
            X.68B r0 = X.C90514aH.A0g(r1)
            java.lang.String r0 = r0.A0F
            r14.add(r0)
            goto L_0x0233
        L_0x0243:
            java.util.HashMap r11 = X.AnonymousClass001.A0J()
            r10 = 0
        L_0x0248:
            int r0 = r29.size()
            if (r10 >= r0) goto L_0x02f0
            r0 = r29
            java.lang.Object r9 = r0.get(r10)
            X.68B r9 = (X.AnonymousClass68B) r9
            java.util.HashMap r1 = r13.A0K
            java.lang.String r0 = r9.A0F
            java.lang.Object r8 = r1.get(r0)
            X.5Ku r8 = (X.C106675Ku) r8
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x02a8
            r7 = r35
            if (r8 != 0) goto L_0x02d9
            boolean r0 = r9.A0S
            if (r0 == 0) goto L_0x02ab
            X.0yC r0 = r13.A0T
            r16 = r0
            android.content.Context r15 = r13.A05
            android.view.LayoutInflater r6 = r13.A0P
            X.1AP r5 = r13.A0Y
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r13.A0g
            X.1HA r3 = r13.A0W
            X.4Rx r2 = r13.A0Z
            int r1 = r13.A0O
            int r0 = r13.A0N
            X.5Kq r8 = new X.5Kq
            r27 = r1
            r28 = r0
            r26 = r4
            r18 = r8
            r19 = r15
            r20 = r6
            r21 = r16
            r22 = r3
            r23 = r9
            r24 = r5
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = r9.A0F
            boolean r0 = r7.contains(r0)
            r8.A02 = r0
        L_0x02a3:
            java.lang.String r0 = r9.A0F
            r11.put(r0, r8)
        L_0x02a8:
            int r10 = r10 + 1
            goto L_0x0248
        L_0x02ab:
            X.0yC r15 = r13.A0T
            android.content.Context r7 = r13.A05
            android.view.LayoutInflater r6 = r13.A0P
            X.1AP r5 = r13.A0Y
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r13.A0g
            X.1HA r3 = r13.A0W
            X.4Rx r2 = r13.A0Z
            int r1 = r13.A0O
            int r0 = r13.A0N
            X.5Ku r8 = new X.5Ku
            r27 = r1
            r28 = r0
            r26 = r4
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r15
            r22 = r3
            r23 = r9
            r24 = r5
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x02a3
        L_0x02d9:
            r8.A06(r9)
            boolean r0 = r9.A0S
            if (r0 == 0) goto L_0x02a3
            boolean r0 = r8 instanceof X.C106635Kq
            if (r0 == 0) goto L_0x02a3
            r1 = r8
            X.5Kq r1 = (X.C106635Kq) r1
            java.lang.String r0 = r9.A0F
            boolean r0 = r7.contains(r0)
            r1.A02 = r0
            goto L_0x02a3
        L_0x02f0:
            r30 = r34
            java.util.Iterator r16 = X.C90484aE.A0s(r30)
        L_0x02f6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x037d
            java.lang.String r10 = X.AnonymousClass001.A0C(r16)
            r0 = r33
            java.lang.Object r9 = r0.get(r10)
            X.68B r9 = (X.AnonymousClass68B) r9
            if (r9 != 0) goto L_0x032d
            X.65S r1 = new X.65S
            r1.<init>()
            r1.A0E = r10
            java.lang.String r0 = ""
            r1.A0G = r0
            r1.A0I = r0
            java.util.LinkedList r0 = X.C90524aI.A0l()
            r1.A0N = r0
            java.util.LinkedList r0 = X.C90524aI.A0l()
            r1.A0M = r0
            r0 = 1
            r1.A0V = r0
            r1.A0T = r0
            X.68B r9 = new X.68B
            r9.<init>(r1)
        L_0x032d:
            boolean r0 = r11.containsKey(r10)
            if (r0 == 0) goto L_0x034c
            java.lang.Object r8 = r11.get(r10)
            X.5Ku r8 = (X.C106675Ku) r8
            r8.A06(r9)
        L_0x033c:
            r0 = r30
            java.lang.Object r0 = r0.get(r10)
            int r0 = X.AnonymousClass000.A0I(r0)
            r8.A01 = r0
            r8.A05()
            goto L_0x02f6
        L_0x034c:
            X.0yC r15 = r13.A0T
            android.content.Context r7 = r13.A05
            android.view.LayoutInflater r6 = r13.A0P
            X.1AP r5 = r13.A0Y
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r13.A0g
            X.1HA r3 = r13.A0W
            X.4Rx r2 = r13.A0Z
            int r1 = r13.A0O
            int r0 = r13.A0N
            X.5Ku r8 = new X.5Ku
            r26 = r4
            r27 = r1
            r28 = r0
            r24 = r5
            r25 = r2
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r15
            r22 = r3
            r23 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11.put(r10, r8)
            goto L_0x033c
        L_0x037d:
            java.util.Iterator r2 = X.C90484aE.A0s(r30)
        L_0x0381:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0399
            java.lang.Object r1 = r2.next()
            boolean r0 = r14.contains(r1)
            if (r0 != 0) goto L_0x0381
            java.lang.Object r0 = r11.get(r1)
            r12.add(r0)
            goto L_0x0381
        L_0x0399:
            java.util.Iterator r3 = r29.iterator()
        L_0x039d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03bc
            X.68B r2 = X.C90514aH.A0g(r3)
            java.lang.String r0 = r2.A0F
            java.lang.Object r1 = r11.get(r0)
            X.6x9 r1 = (X.C147396x9) r1
            if (r1 == 0) goto L_0x039d
            boolean r0 = r2.A0R
            if (r0 != 0) goto L_0x039d
            r1.A01()
            r12.add(r1)
            goto L_0x039d
        L_0x03bc:
            r13.A0K = r11
            int r1 = r13.A04()
            if (r1 >= 0) goto L_0x04ac
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            java.util.List r0 = r13.A0D
            int r0 = r0.size()
            boolean r5 = X.C36361kB.A1b(r1, r0)
            java.lang.String r0 = "StickerPicker/setStickerPacks/getCurrentPageIndex < 0, stickerPages.size(): %d"
            X.C90494aF.A1J(r0, r2, r1)
            r1 = 0
        L_0x03da:
            java.lang.String r9 = r13.A0J
            r4 = 0
            if (r9 != 0) goto L_0x0436
            java.util.List r0 = r13.A0D
            int r0 = r0.size()
            if (r0 > 0) goto L_0x03e9
            if (r32 != 0) goto L_0x04a5
        L_0x03e9:
            java.util.List r0 = r13.A0D
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x047d
            java.util.List r0 = r13.A0D
            java.lang.Object r0 = r0.get(r1)
        L_0x03f7:
            X.6x9 r0 = (X.C147396x9) r0
            java.lang.String r3 = r0.getId()
            X.5Kv r0 = r13.A0A
            r8 = 1
            if (r0 == 0) goto L_0x0478
            X.5Ar r0 = r0.A0A
            int r0 = r0.A02()
        L_0x0408:
            boolean r7 = X.AnonymousClass000.A1Q(r0)
            X.5Kt r0 = r13.A0B
            if (r0 == 0) goto L_0x0473
            X.4mj r0 = r0.A00()
            int r0 = r0.A0J()
        L_0x0418:
            boolean r6 = X.AnonymousClass000.A1Q(r0)
            java.lang.String r2 = "recents"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0427
            r1 = 1
            if (r7 != 0) goto L_0x0428
        L_0x0427:
            r1 = 0
        L_0x0428:
            java.lang.String r9 = "starred"
            boolean r0 = r9.equals(r3)
            if (r0 == 0) goto L_0x0471
            if (r6 == 0) goto L_0x0471
        L_0x0432:
            if (r1 == 0) goto L_0x046b
            if (r6 != 0) goto L_0x046b
        L_0x0436:
            X.6x9 r0 = A01(r9, r12)
            if (r0 == 0) goto L_0x04aa
            int r3 = r12.indexOf(r0)
            r13.A0J = r4
        L_0x0442:
            r13.A0D = r12
            X.6x9[] r0 = new X.C147396x9[r5]
            java.lang.Object[] r5 = r12.toArray(r0)
            X.6x9[] r5 = (X.C147396x9[]) r5
            X.6xB r0 = r13.A0b
            r0.A00(r5)
            java.util.List r0 = r13.A0D
            java.util.Iterator r4 = r0.iterator()
        L_0x0457:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04af
            java.lang.Object r2 = r4.next()
            X.6x9 r2 = (X.C147396x9) r2
            int r1 = r13.A01
            int r0 = r13.A00
            r2.A02(r1, r0)
            goto L_0x0457
        L_0x046b:
            if (r8 == 0) goto L_0x0483
            if (r7 != 0) goto L_0x0483
            r9 = r2
            goto L_0x0436
        L_0x0471:
            r8 = 0
            goto L_0x0432
        L_0x0473:
            X.6Xz r0 = r13.A0c
            boolean r0 = r0.A06
            goto L_0x0418
        L_0x0478:
            X.6Xz r0 = r13.A0c
            boolean r0 = r0.A05
            goto L_0x0408
        L_0x047d:
            java.lang.Object r0 = r12.get(r5)
            goto L_0x03f7
        L_0x0483:
            if (r1 != 0) goto L_0x0487
            if (r8 == 0) goto L_0x04a8
        L_0x0487:
            int r0 = r29.size()
            if (r0 <= 0) goto L_0x04a8
            java.util.Iterator r2 = r29.iterator()
        L_0x0491:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04a8
            X.68B r1 = X.C90514aH.A0g(r2)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0491
            java.lang.String r9 = r1.A0F
        L_0x04a1:
            if (r9 != 0) goto L_0x0436
            if (r32 == 0) goto L_0x04aa
        L_0x04a5:
            r9 = r32
            goto L_0x0436
        L_0x04a8:
            r9 = r3
            goto L_0x04a1
        L_0x04aa:
            r3 = 0
            goto L_0x0442
        L_0x04ac:
            r5 = 0
            goto L_0x03da
        L_0x04af:
            r2 = r5[r3]
            X.11F r1 = r13.A05
            r0 = 1
            r2.A04(r1, r0)
            X.4ve r0 = r13.A06
            if (r0 != 0) goto L_0x04cd
            X.0ts r1 = r13.A08
            X.4ve r0 = new X.4ve
            r0.<init>(r1, r5)
            r13.A06 = r0
            r13.A07(r0)
        L_0x04c7:
            r0 = r17
            r13.A06(r3, r0)
            return
        L_0x04cd:
            X.C100774ve.A01(r0, r5)
            r0.A09()
            goto L_0x04c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5H9.BsL(java.lang.String, java.util.HashMap, java.util.HashMap, java.util.HashSet, java.util.List):void");
    }

    public static C147396x9 A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C147396x9 r1 = (C147396x9) it.next();
            if (str.equals(r1.getId())) {
                return r1;
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5H9(android.app.Activity r17, android.view.ViewGroup r18, X.AnonymousClass0UE r19, X.C19700wN r20, X.C19730wQ r21, X.C19420v0 r22, X.C18820ts r23, X.C20810yC r24, X.C21010yW r25, X.AnonymousClass11F r26, X.C78053rU r27, X.C24031Au r28, X.AnonymousClass1HA r29, X.AnonymousClass1BB r30, X.AnonymousClass1AP r31, X.AnonymousClass3GT r32, X.C95494lK r33, X.C133356Xz r34, com.whatsapp.stickers.stickerpack.StickerPackDownloader r35, X.C19770wU r36, X.AnonymousClass005 r37, boolean r38) {
        /*
            r16 = this;
            r3 = r34
            r11 = r17
            r1 = 0
            r15 = 2131434346(0x7f0b1b6a, float:1.8490503E38)
            r10 = r16
            r14 = r23
            r13 = r19
            r12 = r18
            r10.<init>(r11, r12, r13, r14, r15)
            r10.A0E = r1
            r10.A0M = r1
            r2 = 1
            X.5Wj r0 = new X.5Wj
            r0.<init>(r10, r2)
            r10.A0Z = r0
            r2 = 21
            X.7sK r0 = new X.7sK
            r0.<init>(r10, r2)
            r10.A0Q = r0
            r0 = r24
            r10.A0T = r0
            r0 = r20
            r10.A0R = r0
            r0 = r21
            r10.A0S = r0
            r0 = r25
            r10.A0U = r0
            r5 = r30
            r10.A0e = r5
            r6 = r31
            r10.A0Y = r6
            r4 = r22
            r10.A0d = r4
            r0 = r35
            r10.A0g = r0
            r0 = r28
            r10.A0V = r0
            r0 = r29
            r10.A0W = r0
            r0 = r27
            r10.A07 = r0
            r9 = r37
            r10.A0h = r9
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r11)
            r10.A0P = r0
            r0 = r38
            r10.A0M = r0
            r0 = r26
            r10.A05 = r0
            r2 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r0 = X.C36351kA.A01(r11, r2, r0)
            r10.A0N = r0
            androidx.viewpager.widget.ViewPager r0 = r10.A07
            android.content.res.Resources r2 = X.C36341k9.A0F(r0)
            r0 = 2131168501(0x7f070cf5, float:1.7951306E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r10.A0O = r0
            X.3RZ r0 = new X.3RZ
            r0.<init>()
            r10.A0X = r0
            r7 = r32
            r10.A0f = r7
            if (r34 != 0) goto L_0x0095
            X.6Xz r3 = new X.6Xz
            r8 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0095:
            r10.A0c = r3
            r3 = r33
            r10.A0a = r3
            X.0wQ r0 = r10.A0S
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0124
            X.0yC r2 = r10.A0T
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0124
            r0 = 2131434418(0x7f0b1bb2, float:1.849065E38)
            X.C36381kD.A18(r12, r0)
            r0 = 2131434417(0x7f0b1bb1, float:1.8490647E38)
            X.C36341k9.A10(r12, r0, r1)
            r0 = 2131434416(0x7f0b1bb0, float:1.8490645E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A03 = r0
            r0 = 2131434415(0x7f0b1baf, float:1.8490643E38)
        L_0x00c5:
            android.view.View r0 = r12.findViewById(r0)
            r10.A04 = r0
            android.content.res.Resources r2 = r11.getResources()
            r0 = 2131168498(0x7f070cf2, float:1.79513E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = r12.getWidth()
            r10.A01 = r0
            int r0 = r12.getHeight()
            int r0 = r0 - r2
            r10.A00 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r10.A0D = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            r10.A0K = r0
            X.6x9[] r1 = new X.C147396x9[r1]
            X.4ve r0 = new X.4ve
            r0.<init>(r14, r1)
            r10.A06 = r0
            r10.A07(r0)
            android.content.Context r0 = r10.A05
            X.6xB r2 = new X.6xB
            r2.<init>(r0, r12, r14)
            r10.A0b = r2
            if (r33 == 0) goto L_0x010f
            X.00s r1 = r3.A02
            X.012 r11 = (X.AnonymousClass012) r11
            r0 = 19
            X.C165197t2.A01(r11, r1, r10, r0)
        L_0x010f:
            android.view.View r1 = r10.A03
            r0 = 24
            X.C48772i1.A00(r1, r10, r0)
            X.7kY r1 = r10.A04
            if (r1 == 0) goto L_0x011e
            r0 = 0
            r1.Bqd(r0)
        L_0x011e:
            r10.A04 = r2
            r2.Bqd(r10)
            return
        L_0x0124:
            r0 = 2131434417(0x7f0b1bb1, float:1.8490647E38)
            X.C36381kD.A18(r12, r0)
            r0 = 2131434418(0x7f0b1bb2, float:1.849065E38)
            X.C36341k9.A10(r12, r0, r1)
            r0 = 2131434361(0x7f0b1b79, float:1.8490534E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A03 = r0
            r0 = 2131434360(0x7f0b1b78, float:1.8490532E38)
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5H9.<init>(android.app.Activity, android.view.ViewGroup, X.0UE, X.0wN, X.0wQ, X.0v0, X.0ts, X.0yC, X.0yW, X.11F, X.3rU, X.1Au, X.1HA, X.1BB, X.1AP, X.3GT, X.4lK, X.6Xz, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.0wU, X.005, boolean):void");
    }
}
