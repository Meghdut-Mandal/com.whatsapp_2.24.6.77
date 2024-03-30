package X;

import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5HA  reason: invalid class name */
public class AnonymousClass5HA extends C129046Es implements C160667lO {
    public static final String[] A0Q = {"recents", "starred", "id_all", "id_love", "id_haha", "id_sad", "id_angry", "id_reaction", "id_lifestyle"};
    public int A00;
    public int A01;
    public AnonymousClass11F A02;
    public C100774ve A03;
    public C88234Rx A04;
    public List A05 = AnonymousClass001.A0I();
    public boolean A06 = false;
    public boolean A07 = false;
    public final int A08 = 9;
    public final int A09;
    public final int A0A;
    public final LayoutInflater A0B;
    public final ViewTreeObserver.OnGlobalLayoutListener A0C;
    public final AnonymousClass17Y A0D;
    public final C20810yC A0E;
    public final C65193Rc A0F;
    public final AnonymousClass1HA A0G;
    public final AnonymousClass1AP A0H;
    public final C88234Rx A0I;
    public final C133356Xz A0J;
    public final C147406xA A0K;
    public final C106685Kv A0L;
    public final C106665Kt A0M;
    public final StickerPackDownloader A0N;
    public final C19770wU A0O;
    public final AnonymousClass3N8 A0P;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5HA(android.app.Activity r29, android.view.ViewGroup r30, X.AnonymousClass0UE r31, X.AnonymousClass17Y r32, X.C19730wQ r33, X.C18820ts r34, X.C20810yC r35, X.AnonymousClass11F r36, X.AnonymousClass6WF r37, X.C23871Ae r38, X.AnonymousClass3N8 r39, X.C104665Ar r40, X.AnonymousClass1HA r41, X.AnonymousClass1AP r42, X.C133356Xz r43, com.whatsapp.stickers.stickerpack.StickerPackDownloader r44, X.C19770wU r45) {
        /*
            r28 = this;
            r10 = 0
            r5 = 2131427876(0x7f0b0224, float:1.847738E38)
            r9 = r28
            r3 = r31
            r13 = r30
            r12 = r29
            r27 = r34
            r0 = r9
            r1 = r12
            r2 = r13
            r4 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 9
            r9.A08 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r9.A05 = r0
            r9.A06 = r10
            r9.A07 = r10
            r8 = 2
            X.5Wj r7 = new X.5Wj
            r7.<init>(r9, r8)
            r9.A0I = r7
            r1 = 22
            X.7sK r0 = new X.7sK
            r0.<init>(r9, r1)
            r9.A0C = r0
            r20 = r35
            r0 = r20
            r9.A0E = r0
            r0 = r32
            r9.A0D = r0
            r0 = r45
            r9.A0O = r0
            r11 = r43
            r9.A0J = r11
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r12)
            r9.A0B = r6
            r14 = r42
            r9.A0H = r14
            r0 = r39
            r9.A0P = r0
            r0 = r44
            r9.A0N = r0
            r15 = r41
            r9.A0G = r15
            r0 = r36
            r9.A02 = r0
            r1 = 2130969255(0x7f0402a7, float:1.7547187E38)
            r0 = 2131100353(0x7f0602c1, float:1.7813085E38)
            int r0 = X.C36351kA.A01(r12, r1, r0)
            r9.A09 = r0
            androidx.viewpager.widget.ViewPager r0 = r9.A07
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131168501(0x7f070cf5, float:1.7951306E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.A0A = r0
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168498(0x7f070cf2, float:1.79513E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.3Rc r0 = new X.3Rc
            r0.<init>()
            r9.A0F = r0
            int r0 = r13.getWidth()
            r9.A01 = r0
            int r0 = r13.getHeight()
            int r0 = r0 - r1
            r9.A00 = r0
            android.content.Context r5 = r9.A05
            int r2 = r9.A0A
            int r1 = r9.A09
            r4 = 0
            X.5Kv r0 = new X.5Kv
            r22 = r40
            r19 = r33
            r24 = r7
            r25 = r2
            r26 = r1
            r21 = r9
            r23 = r15
            r16 = r0
            r17 = r5
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9.A0L = r0
            int r3 = r9.A0A
            r2 = 1
            int r1 = r9.A09
            X.5Kt r0 = new X.5Kt
            r25 = 1
            r16 = r0
            r19 = r20
            r20 = r15
            r21 = r14
            r22 = r7
            r23 = r3
            r24 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.A0M = r0
            X.4TT[] r3 = new X.AnonymousClass4TT[r10]
            X.4ve r1 = new X.4ve
            r0 = r27
            r1.<init>(r0, r3)
            r9.A03 = r1
            r9.A07(r1)
            X.6xA r3 = new X.6xA
            r3.<init>(r13)
            r9.A0K = r3
            X.7kY r1 = r9.A04
            if (r1 == 0) goto L_0x00f6
            r0 = 0
            r1.Bqd(r0)
        L_0x00f6:
            r9.A04 = r3
            r3.Bqd(r9)
            r0 = 2131427840(0x7f0b0200, float:1.8477308E38)
            android.view.View r1 = X.C012005e.A02(r13, r0)
            X.2iB r0 = new X.2iB
            r18 = 2
            r17 = r38
            r16 = r37
            r13 = r0
            r14 = r9
            r15 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            r1.setOnClickListener(r0)
            r0 = 2131886619(0x7f12021b, float:1.9407822E38)
            X.C36331k8.A0q(r12, r1, r0)
            X.1BB r1 = r11.A0B
            X.6Fn r0 = r11.A09
            r1.registerObserver(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r7 = 2131231495(0x7f080307, float:1.8079073E38)
            r0 = 2131886621(0x7f12021d, float:1.9407826E38)
            java.lang.String r6 = r5.getString(r0)
            java.lang.String r1 = "1"
            X.5Kn r0 = new X.5Kn
            r0.<init>(r10, r7, r1, r6)
            r3.add(r0)
            r7 = 2131233777(0x7f080bf1, float:1.8083701E38)
            r0 = 2131886620(0x7f12021c, float:1.9407824E38)
            java.lang.String r6 = r5.getString(r0)
            java.lang.String r1 = "2"
            X.5Kn r0 = new X.5Kn
            r0.<init>(r2, r7, r1, r6)
            r3.add(r0)
            r0 = 2131886622(0x7f12021e, float:1.9407828E38)
            java.lang.String r1 = r5.getString(r0)
            java.lang.String r0 = "3"
            A03(r0, r1, r3, r8)
            r0 = 2131886626(0x7f120222, float:1.9407836E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 3
            java.lang.String r0 = "4"
            A03(r0, r2, r3, r1)
            r0 = 2131886624(0x7f120220, float:1.9407832E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 4
            java.lang.String r0 = "5"
            A03(r0, r2, r3, r1)
            r0 = 2131886628(0x7f120224, float:1.940784E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 5
            java.lang.String r0 = "6"
            A03(r0, r2, r3, r1)
            r0 = 2131886623(0x7f12021f, float:1.940783E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 6
            java.lang.String r0 = "7"
            A03(r0, r2, r3, r1)
            r0 = 2131886627(0x7f120223, float:1.9407838E38)
            java.lang.String r2 = r5.getString(r0)
            r1 = 7
            java.lang.String r0 = "8"
            A03(r0, r2, r3, r1)
            X.0yC r1 = r9.A0E
            r0 = 4821(0x12d5, float:6.756E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x01b1
            r2 = 8
            r0 = 2131886625(0x7f120221, float:1.9407834E38)
            java.lang.String r1 = r5.getString(r0)
            java.lang.String r0 = "9"
            A03(r0, r1, r3, r2)
        L_0x01b1:
            X.6xA r1 = r9.A0K
            java.util.ArrayList r0 = r1.A05
            r0.clear()
            r0.addAll(r3)
            X.4mY r2 = r1.A04
            java.util.List r1 = r2.A00
            X.4ls r0 = new X.4ls
            r0.<init>(r1, r3)
            X.C36341k9.A1A(r0, r2, r3, r1)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            X.5Kv r0 = r9.A0L
            r11.add(r0)
            X.5Kt r0 = r9.A0M
            r11.add(r0)
            r12 = 2
        L_0x01d6:
            int r0 = r9.A08
            if (r12 >= r0) goto L_0x020d
            java.lang.String[] r0 = A0Q
            r0 = r0[r12]
            X.0yC r10 = r9.A0E
            android.view.LayoutInflater r8 = r9.A0B
            X.1AP r7 = r9.A0H
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r6 = r9.A0N
            X.1HA r3 = r9.A0G
            X.4Rx r2 = r9.A0I
            int r1 = r9.A0A
            X.68B r18 = r9.A01(r0)
            int r0 = r9.A09
            X.5Ku r13 = new X.5Ku
            r14 = r5
            r15 = r8
            r16 = r10
            r17 = r3
            r19 = r7
            r20 = r2
            r21 = r6
            r22 = r1
            r23 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x01d6
        L_0x020d:
            r9.A05 = r11
            int r0 = r11.size()
            X.4TT[] r0 = new X.AnonymousClass4TT[r0]
            java.lang.Object[] r2 = r11.toArray(r0)
            X.4TT[] r2 = (X.AnonymousClass4TT[]) r2
            X.4ve r0 = r9.A03
            if (r0 != 0) goto L_0x022c
            X.0ts r1 = r9.A08
            X.4ve r0 = new X.4ve
            r0.<init>(r1, r2)
            r9.A03 = r0
            r9.A07(r0)
            return
        L_0x022c:
            X.AnonymousClass00C.A0D(r2, r4)
            X.C100774ve.A01(r0, r2)
            r0.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HA.<init>(android.app.Activity, android.view.ViewGroup, X.0UE, X.17Y, X.0wQ, X.0ts, X.0yC, X.11F, X.6WF, X.1Ae, X.3N8, X.5Ar, X.1HA, X.1AP, X.6Xz, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.0wU):void");
    }

    public void Bhh(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i) {
    }

    public static AnonymousClass68B A00(AnonymousClass68B r2, String str, String str2, List list) {
        AnonymousClass65S r1 = new AnonymousClass65S();
        r1.A0N = list;
        r1.A0E = str;
        r1.A0G = str2;
        r1.A0I = r2.A0J;
        r1.A0M = C90524aI.A0l();
        r1.A0P = r2.A0O;
        r1.A0V = r2.A0S;
        r1.A0T = r2.A06;
        return new AnonymousClass68B(r1);
    }

    private AnonymousClass68B A01(String str) {
        AnonymousClass65S r5 = new AnonymousClass65S();
        r5.A0E = str;
        r5.A0G = "";
        r5.A0I = "";
        ArrayList A0I2 = AnonymousClass001.A0I();
        int i = 0;
        do {
            C135066c4 r1 = new C135066c4();
            r1.A0E = "loading-hash";
            A0I2.add(r1);
            i++;
        } while (i < 16);
        r5.A0N = A0I2;
        r5.A0M = C90524aI.A0l();
        r5.A0V = false;
        r5.A0R = true;
        r5.A0T = false;
        return new AnonymousClass68B(r5);
    }

    public static void A03(String str, String str2, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C106595Km(i, str, str2));
    }

    public void A08(String str) {
        List<AnonymousClass4TT> list = this.A05;
        for (AnonymousClass4TT r2 : list) {
            if (str.equals(r2.getId())) {
                A06(list.indexOf(r2), true);
                try {
                    ((C147396x9) r2).A04(this.A02, true);
                    return;
                } catch (Exception e) {
                    Log.e("AvatarStickerPicker/selectPageById/Error setting current displayed tab", e);
                    return;
                }
            }
        }
    }

    public void BXU(boolean z, boolean z2) {
        this.A0M.A01();
        if (this.A06 && z && !z2) {
            A08("starred");
        }
    }

    public void BeK() {
        this.A0L.A01();
    }

    public void Bhk(AnonymousClass68B r4) {
        if (r4.A0R) {
            this.A0O.Bp1(new C81203wd(this, r4, 23));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r6.A0L.A0A.A02() != 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r6 = this;
            int r2 = r6.A04()
            java.lang.String r4 = "recents"
            if (r2 < 0) goto L_0x006a
            java.util.List r1 = r6.A05
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x006a
            java.lang.Object r0 = r1.get(r2)
            X.4TT r0 = (X.AnonymousClass4TT) r0
            java.lang.String r3 = r0.getId()
            boolean r0 = r4.equals(r3)
            r5 = 1
            if (r0 == 0) goto L_0x002c
            X.5Kv r0 = r6.A0L
            X.5Ar r0 = r0.A0A
            int r0 = r0.A02()
            r2 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            java.lang.String r1 = "starred"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0068
            X.5Kt r0 = r6.A0M
            X.4mj r0 = r0.A00()
            int r0 = r0.A0J()
            if (r0 != 0) goto L_0x0068
        L_0x0041:
            if (r2 == 0) goto L_0x0054
            X.5Kt r0 = r6.A0M
            X.4mj r0 = r0.A00()
            int r0 = r0.A0J()
            if (r0 == 0) goto L_0x0054
            r4 = r1
        L_0x0050:
            r6.A08(r4)
            return
        L_0x0054:
            if (r5 == 0) goto L_0x0060
            X.5Kv r0 = r6.A0L
            X.5Ar r0 = r0.A0A
            int r0 = r0.A02()
            if (r0 != 0) goto L_0x0050
        L_0x0060:
            if (r2 != 0) goto L_0x0064
            if (r5 == 0) goto L_0x0066
        L_0x0064:
            java.lang.String r3 = "id_all"
        L_0x0066:
            r4 = r3
            goto L_0x0050
        L_0x0068:
            r5 = 0
            goto L_0x0041
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AvatarStickerPicker/getDesiredPageId/pagePos out of bounds, pages.size()="
            r1.append(r0)
            java.util.List r0 = r6.A05
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = ", index="
            X.C36321k7.A1S(r0, r1, r2)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HA.A02():void");
    }

    public void BsL(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list) {
        String A0q;
        if (list.size() == 0) {
            A0q = "AvatarStickerPicker/setStickerPacks Avatar sticker pack is empty";
        } else {
            Iterator A10 = C36391kE.A10(hashMap);
            while (A10.hasNext()) {
                if (C90514aH.A0g(A10).A0R) {
                    this.A07 = true;
                    for (int i = 2; i < this.A08; i++) {
                        C106675Ku r1 = (C106675Ku) this.A05.get(i);
                        r1.A06(A01(A0Q[i]));
                        r1.A01();
                    }
                    C106685Kv r6 = this.A0L;
                    r6.A05((C135066c4) null);
                    C106665Kt r5 = this.A0M;
                    r5.A05((C135066c4) null);
                    List list2 = r6.A06;
                    if (list2 != null && list2.size() > 0) {
                        int size = list2.size();
                        ArrayList A0I2 = AnonymousClass001.A0I();
                        for (int i2 = 0; i2 < size; i2++) {
                            C135066c4 r12 = new C135066c4();
                            r12.A0E = "loading-hash";
                            A0I2.add(r12);
                        }
                        r6.A06(A0I2);
                    }
                    List list3 = r5.A02;
                    if (list3 != null && list3.size() > 0) {
                        int size2 = list3.size();
                        ArrayList A0I3 = AnonymousClass001.A0I();
                        for (int i3 = 0; i3 < size2; i3++) {
                            C135066c4 r13 = new C135066c4();
                            r13.A0E = "loading-hash";
                            A0I3.add(r13);
                        }
                        r5.A06(A0I3);
                    }
                    A02();
                    return;
                }
            }
            if (this.A07) {
                this.A07 = false;
                C106685Kv r14 = this.A0L;
                List list4 = r14.A06;
                if (list4 == null ? r14.A0A.A02() != 0 : !list4.isEmpty()) {
                    r14.A06 = null;
                    r14.A01();
                }
                C106665Kt r15 = this.A0M;
                List list5 = r15.A02;
                if (list5 == null ? r15.A00().A0J() != 0 : !list5.isEmpty()) {
                    r15.A02 = null;
                    r15.A01();
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass68B A0g = C90514aH.A0g(it);
                if (A0g.A0R) {
                    if (str != null) {
                        A02();
                    }
                    this.A0O.Bp1(new C81203wd(this, A0g, 23));
                    return;
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C36371kC.A1R("AvatarStickerPicker/setStickerPacks got ", A0u, list);
            A0q = AnonymousClass000.A0q(" sticker packs, but no Avatar sticker pack", A0u);
        }
        Log.e(A0q);
    }
}
