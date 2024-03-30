package X;

import com.whatsapp.R;
import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteAdded$1;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Fn  reason: invalid class name and case insensitive filesystem */
public abstract class C129156Fn {
    public void A04() {
    }

    public void A06(C135066c4 r1, Integer num, String str, int i) {
    }

    public void A0B(String str, String str2) {
    }

    public static void A00(C162907pL r2, StickerPackFlow stickerPackFlow, List list) {
        StickerPackFlow.A00(new C106535Kb(list), stickerPackFlow, (C18000sQ) r2.A00);
    }

    public void A01() {
        if (this instanceof C162907pL) {
            C162907pL r2 = (C162907pL) this;
            switch (r2.A02) {
                case 2:
                    AnonymousClass6ST.A00((AnonymousClass6ST) r2.A01, (C18000sQ) r2.A00);
                    return;
                case 3:
                    AnonymousClass6ST r4 = (AnonymousClass6ST) r2.A01;
                    C18000sQ r3 = (C18000sQ) r2.A00;
                    C36381kD.A1R(r4.A03, new RecentStickerFlowImpl$updateStickerList$1(r4, (C023509x) null, r3), r3);
                    return;
                default:
                    return;
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 1:
                case 2:
                case 3:
                    C160667lO r0 = ((C133356Xz) r1.A00).A03;
                    if (r0 != null) {
                        r0.BeK();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A02() {
        if (this instanceof C162907pL) {
            C162907pL r2 = (C162907pL) this;
            if (2 - r2.A02 == 0) {
                AnonymousClass6ST.A00((AnonymousClass6ST) r2.A01, (C18000sQ) r2.A00);
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 1:
                case 2:
                case 3:
                    C160667lO r0 = ((C133356Xz) r1.A00).A03;
                    if (r0 != null) {
                        r0.BeK();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A03() {
        if (this instanceof C162907pL) {
            C162907pL r1 = (C162907pL) this;
            if (1 - r1.A02 == 0) {
                StickerPackFlow stickerPackFlow = (StickerPackFlow) r1.A01;
                C36381kD.A1R(stickerPackFlow.A0D, new StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(stickerPackFlow, (C023509x) null, (C18000sQ) r1.A00), stickerPackFlow.A0F);
            }
        } else if (this instanceof C162897pK) {
            C162897pK r12 = (C162897pK) this;
            switch (r12.A01) {
                case 1:
                case 2:
                case 3:
                    ((C133356Xz) r12.A00).A04();
                    return;
                case 4:
                    StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) r12.A00;
                    if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                        StickerStoreMyTabFragment.A00((StickerStoreMyTabFragment) stickerStoreTabFragment);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A05() {
        if (this instanceof C162907pL) {
            C162907pL r2 = (C162907pL) this;
            switch (r2.A02) {
                case 2:
                    AnonymousClass6ST.A00((AnonymousClass6ST) r2.A01, (C18000sQ) r2.A00);
                    return;
                case 3:
                    AnonymousClass6ST r4 = (AnonymousClass6ST) r2.A01;
                    C18000sQ r3 = (C18000sQ) r2.A00;
                    C36381kD.A1R(r4.A03, new RecentStickerFlowImpl$updateStickerList$1(r4, (C023509x) null, r3), r3);
                    return;
                default:
                    return;
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 1:
                case 2:
                case 3:
                    C133356Xz r12 = (C133356Xz) r1.A00;
                    C160667lO r0 = r12.A03;
                    if (r0 != null) {
                        r0.BeK();
                    }
                    C95494lK r02 = r12.A01;
                    if (r02 != null) {
                        r02.A0S();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A07(AnonymousClass68B r8) {
        StickerStoreTabFragment stickerStoreTabFragment;
        if (this instanceof C162907pL) {
            C162907pL r6 = (C162907pL) this;
            switch (r6.A02) {
                case 0:
                    AnonymousClass00C.A0D(r8, 0);
                    if (r8.A0R) {
                        ((C17300r3) r6.A00).BwE(new C106105Ij(r8));
                        return;
                    }
                    return;
                case 1:
                    AnonymousClass00C.A0D(r8, 0);
                    r8.A07 = true;
                    StickerPackFlow stickerPackFlow = (StickerPackFlow) r6.A01;
                    List list = stickerPackFlow.A00.A00;
                    ArrayList A0I = AnonymousClass001.A0I();
                    for (Object next : list) {
                        C36391kE.A1V(next, A0I, AnonymousClass00C.A0J(((C1268665y) next).A01(), r8.A0F) ? 1 : 0);
                    }
                    String str = r8.A0F;
                    AnonymousClass00C.A08(str);
                    ArrayList A0T = C007103b.A0T(new AnonymousClass5Kd(r8, str), A0I);
                    AnonymousClass00C.A0D(A0T, 0);
                    A00(r6, stickerPackFlow, A0T);
                    return;
                default:
                    return;
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 0:
                    AnonymousClass6XN r2 = (AnonymousClass6XN) r1.A00;
                    ArrayList A00 = AnonymousClass6XN.A00(r2, r8);
                    Map map = r2.A0Z;
                    String str2 = r8.A0F;
                    map.put(str2, r8);
                    r2.A0G.A01(A00);
                    r2.A0a.put(str2, A00);
                    AnonymousClass6XN.A02(r2, A00);
                    C96184mv r3 = r2.A0I;
                    LinkedHashMap linkedHashMap = r3.A02;
                    LinkedHashMap A1G = C36431kI.A1G();
                    r3.A02 = A1G;
                    A1G.put(str2, C96184mv.A01(r3, r8));
                    r3.A02.putAll(linkedHashMap);
                    C96184mv.A03(r3);
                    r3.A0A(r3.A03.size(), r3.A0J() - r3.A03.size());
                    C96184mv.A04(r3);
                    return;
                case 4:
                    StickerStoreTabFragment stickerStoreTabFragment2 = (StickerStoreTabFragment) r1.A00;
                    if (stickerStoreTabFragment2 instanceof StickerStoreMyTabFragment) {
                        StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment2;
                        if (stickerStoreMyTabFragment.A0G != null) {
                            for (int i = 0; i < stickerStoreMyTabFragment.A0I.size(); i++) {
                                if (C90514aH.A0f(stickerStoreMyTabFragment, i).A0F.equals(r8.A0F)) {
                                    stickerStoreMyTabFragment.A0I.set(i, r8);
                                    C96124mp r0 = stickerStoreMyTabFragment.A0G;
                                    if (r0 != null) {
                                        r0.A07(i);
                                        return;
                                    }
                                    return;
                                }
                            }
                            C96124mp r4 = stickerStoreMyTabFragment.A0G;
                            if (r4 instanceof AnonymousClass5L8) {
                                AnonymousClass5L8 r42 = (AnonymousClass5L8) r4;
                                boolean z = false;
                                if (!r42.A00.isEmpty()) {
                                    z = ((AnonymousClass68B) r42.A00.get(0)).A0R;
                                }
                                r42.A00.add(z ? 1 : 0, r8);
                                r42.A08(r42.A00.indexOf(r8));
                                stickerStoreTabFragment = r42.A00;
                            } else {
                                r4.A00.add(r8);
                                r4.A08(r4.A00.indexOf(r8));
                                stickerStoreTabFragment = r4.A01;
                            }
                            stickerStoreTabFragment.A1a();
                            stickerStoreMyTabFragment.A04 = true;
                            return;
                        }
                        return;
                    }
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) stickerStoreTabFragment2;
                    if (stickerStoreFeaturedTabFragment.A0I != null) {
                        int i2 = 0;
                        while (i2 < stickerStoreFeaturedTabFragment.A0I.size()) {
                            if (C90514aH.A0f(stickerStoreFeaturedTabFragment, i2).A0F.equals(r8.A0F)) {
                                stickerStoreFeaturedTabFragment.A0I.set(i2, r8);
                                C96124mp r12 = stickerStoreFeaturedTabFragment.A0G;
                                if (r12 != null) {
                                    if (StickerStoreFeaturedTabFragment.A03(stickerStoreFeaturedTabFragment)) {
                                        i2++;
                                    }
                                    r12.A07(i2);
                                    return;
                                }
                                return;
                            }
                            i2++;
                        }
                        return;
                    }
                    return;
                case 5:
                    StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r1.A00;
                    AnonymousClass68B r02 = stickerStorePackPreviewActivity.A0G;
                    if (r02 == null) {
                        if (r8.A0R) {
                            stickerStorePackPreviewActivity.A0H.A0C(new C148576z5(stickerStorePackPreviewActivity), stickerStorePackPreviewActivity.A0O, true);
                            return;
                        }
                        return;
                    } else if (r02.A0F.equals(r8.A0F)) {
                        StickerStorePackPreviewActivity.A07(r8, stickerStorePackPreviewActivity);
                        stickerStorePackPreviewActivity.setResult(1);
                        if (!stickerStorePackPreviewActivity.A0S && !r8.A0R) {
                            stickerStorePackPreviewActivity.A05.A06(R.string.f12nameremoved, 1);
                            stickerStorePackPreviewActivity.finish();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                default:
                    C133356Xz r43 = (C133356Xz) r1.A00;
                    HashMap hashMap = r43.A0G;
                    String str3 = r8.A0F;
                    hashMap.remove(str3);
                    r43.A0H.remove(str3);
                    if (r43.A04 != null) {
                        int i3 = 0;
                        while (true) {
                            int size = r43.A04.size();
                            List list2 = r43.A04;
                            if (i3 >= size) {
                                list2.add(r8);
                                Collections.sort(r43.A04, new AnonymousClass75V());
                            } else if (AnonymousClass68B.A00(str3, list2, i3)) {
                                r43.A04.set(i3, r8);
                            } else {
                                i3++;
                            }
                        }
                        C133356Xz.A02(r43, (String) null, r43.A04);
                    } else {
                        r43.A04();
                    }
                    C133356Xz.A00(r43);
                    return;
            }
        }
    }

    public void A08(AnonymousClass68B r12) {
        if (this instanceof C162907pL) {
            C162907pL r6 = (C162907pL) this;
            switch (r6.A02) {
                case 0:
                    if (r12.A0R) {
                        ((C17300r3) r6.A00).BwE(new C106115Ik(0));
                        return;
                    }
                    return;
                case 1:
                    StickerPackFlow stickerPackFlow = (StickerPackFlow) r6.A01;
                    C106535Kb r5 = stickerPackFlow.A00;
                    if (AnonymousClass1Ax.A03(stickerPackFlow.A01, 7640)) {
                        List list = r5.A00;
                        Iterator it = list.iterator();
                        int i = 0;
                        while (true) {
                            if (it.hasNext()) {
                                C1268665y r2 = (C1268665y) it.next();
                                if (!AnonymousClass00C.A0J(r2.A01(), r12.A0F) || !(r2 instanceof C106545Kf)) {
                                    i++;
                                } else if (i != -1) {
                                    stickerPackFlow.A0C.put(list.get(i), Integer.valueOf(i));
                                }
                            }
                        }
                    }
                    List list2 = r5.A00;
                    String str = r12.A0F;
                    AnonymousClass00C.A08(str);
                    ArrayList A0T = C007103b.A0T(new AnonymousClass5Kg(r12, str, 0), list2);
                    AnonymousClass00C.A0D(A0T, 0);
                    A00(r6, stickerPackFlow, A0T);
                    return;
                default:
                    return;
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 1:
                case 2:
                case 3:
                    C133356Xz r22 = (C133356Xz) r1.A00;
                    r22.A0H.put(r12.A0F, r12);
                    List list3 = r22.A04;
                    if (list3 != null) {
                        C133356Xz.A02(r22, (String) null, list3);
                        return;
                    }
                    return;
                case 4:
                    StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) r1.A00;
                    if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) stickerStoreTabFragment;
                        if (stickerStoreFeaturedTabFragment.A0I != null) {
                            for (int i2 = 0; i2 < stickerStoreFeaturedTabFragment.A0I.size(); i2++) {
                                AnonymousClass68B A0f = C90514aH.A0f(stickerStoreFeaturedTabFragment, i2);
                                if (A0f.A0F.equals(r12.A0F)) {
                                    A0f.A06 = true;
                                    C96124mp r23 = stickerStoreFeaturedTabFragment.A0G;
                                    if (r23 != null) {
                                        int i3 = i2;
                                        if (StickerStoreFeaturedTabFragment.A03(stickerStoreFeaturedTabFragment)) {
                                            i3 = i2 + 1;
                                        }
                                        r23.A07(i3);
                                    }
                                }
                            }
                            if (r12.A0R) {
                                StickerStoreFeaturedTabFragment.A00(stickerStoreFeaturedTabFragment);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (stickerStoreTabFragment.A0I != null) {
                        for (int i4 = 0; i4 < stickerStoreTabFragment.A0I.size(); i4++) {
                            AnonymousClass68B A0f2 = C90514aH.A0f(stickerStoreTabFragment, i4);
                            if (A0f2.A0F.equals(r12.A0F)) {
                                A0f2.A06 = true;
                                C96124mp r0 = stickerStoreTabFragment.A0G;
                                if (r0 != null) {
                                    r0.A07(i4);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                case 5:
                    if (r12.A0R) {
                        StickerStorePackPreviewActivity.A0H((StickerStorePackPreviewActivity) r1.A00, true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A09(AnonymousClass68B r8) {
        if (this instanceof C162907pL) {
            C162907pL r6 = (C162907pL) this;
            switch (r6.A02) {
                case 0:
                    if (r8.A0R) {
                        ((C17300r3) r6.A00).BwE(new C106105Ij(r8));
                        return;
                    }
                    return;
                case 1:
                    StickerPackFlow stickerPackFlow = (StickerPackFlow) r6.A01;
                    List<C1268665y> list = stickerPackFlow.A00.A00;
                    ArrayList A0J = C36321k7.A0J(list);
                    for (C1268665y r2 : list) {
                        String A01 = r2.A01();
                        String str = r8.A0F;
                        if (AnonymousClass00C.A0J(A01, str)) {
                            if (r8.A08) {
                                AnonymousClass00C.A08(str);
                                r2 = new C106545Kf(r8, str);
                            } else {
                                AnonymousClass00C.A08(str);
                                r2 = new AnonymousClass5Kd(r8, str);
                            }
                        }
                        A0J.add(r2);
                    }
                    A00(r6, stickerPackFlow, A0J);
                    return;
                default:
                    return;
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 1:
                case 2:
                case 3:
                    C160667lO r0 = ((C133356Xz) r1.A00).A03;
                    if (r0 != null) {
                        r0.Bhk(r8);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A0A(String str, int i) {
        List list;
        String str2 = str;
        int i2 = i;
        if (this instanceof C162907pL) {
            C162907pL r5 = (C162907pL) this;
            switch (r5.A02) {
                case 0:
                    AnonymousClass00C.A0D(str, 0);
                    if (str.equals("meta-avatar")) {
                        ((C17300r3) r5.A00).BwE(new C106115Ik(i));
                        return;
                    }
                    return;
                case 1:
                    AnonymousClass00C.A0D(str, 0);
                    StickerPackFlow stickerPackFlow = (StickerPackFlow) r5.A01;
                    List<C1268665y> list2 = stickerPackFlow.A00.A00;
                    ArrayList A0J = C36321k7.A0J(list2);
                    for (C1268665y r2 : list2) {
                        if ((r2 instanceof AnonymousClass5Kg) && AnonymousClass00C.A0J(r2.A01(), str)) {
                            AnonymousClass5Kg r22 = (AnonymousClass5Kg) r2;
                            r2 = new AnonymousClass5Kg(r22.A01, r22.A02, i);
                        }
                        A0J.add(r2);
                    }
                    A00(r5, stickerPackFlow, A0J);
                    return;
                default:
                    return;
            }
        } else if (this instanceof C162897pK) {
            C162897pK r1 = (C162897pK) this;
            switch (r1.A01) {
                case 1:
                case 2:
                case 3:
                    C133356Xz r0 = (C133356Xz) r1.A00;
                    C160667lO r6 = r0.A03;
                    if (r6 != null && (list = r0.A04) != null) {
                        r6.Bhh(str2, r0.A0H, r0.A0G, r0.A0I, list, i2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void A0C(Collection collection, boolean z) {
        C130566Lo r5;
        C18000sQ r4;
        boolean z2;
        if (this instanceof C162907pL) {
            C162907pL r1 = (C162907pL) this;
            switch (r1.A02) {
                case 4:
                    AnonymousClass00C.A0D(collection, 0);
                    r5 = (C130566Lo) r1.A01;
                    r4 = (C18000sQ) r1.A00;
                    C130566Lo.A00(r5, r4, 2);
                    z2 = false;
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C90504aG.A0U(it).A0L) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    AnonymousClass00C.A0D(collection, 0);
                    r5 = (C130566Lo) r1.A01;
                    r4 = (C18000sQ) r1.A00;
                    z2 = true;
                    C130566Lo.A00(r5, r4, 1);
                    if (!collection.isEmpty()) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C90504aG.A0U(it2).A0L) {
                                    break;
                                }
                            }
                        }
                    }
                    z2 = false;
                    break;
                default:
                    return;
            }
            C36381kD.A1R(r5.A04, new StarredStickersFlow$notifyStickerFavoriteAdded$1(r5, collection, (C023509x) null, z2), r4);
        } else if (this instanceof C162897pK) {
            C162897pK r12 = (C162897pK) this;
            switch (r12.A01) {
                case 0:
                    AnonymousClass6XN r13 = (AnonymousClass6XN) r12.A00;
                    AnonymousClass6XN.A01(r13, collection, true);
                    r13.A0I.A0L();
                    return;
                case 1:
                case 2:
                case 3:
                    C160667lO r14 = ((C133356Xz) r12.A00).A03;
                    if (r14 != null) {
                        r14.BXU(true, z);
                        return;
                    }
                    return;
                case 5:
                    ((C225314u) r12.A00).A05.A06(R.string.f12nameremoved, 1);
                    return;
                default:
                    return;
            }
        }
    }

    public void A0D(Collection collection, boolean z) {
        C130566Lo r2;
        C18000sQ r1;
        int i;
        if (this instanceof C162907pL) {
            C162907pL r12 = (C162907pL) this;
            switch (r12.A02) {
                case 4:
                    AnonymousClass00C.A0D(collection, 0);
                    r2 = (C130566Lo) r12.A01;
                    r1 = (C18000sQ) r12.A00;
                    i = 2;
                    break;
                case 5:
                    AnonymousClass00C.A0D(collection, 0);
                    r2 = (C130566Lo) r12.A01;
                    r1 = (C18000sQ) r12.A00;
                    i = 1;
                    break;
                default:
                    return;
            }
            C130566Lo.A00(r2, r1, i);
        } else if (this instanceof C162897pK) {
            C162897pK r13 = (C162897pK) this;
            switch (r13.A01) {
                case 1:
                case 2:
                case 3:
                    C133356Xz r22 = (C133356Xz) r13.A00;
                    C160667lO r14 = r22.A03;
                    if (r14 != null) {
                        r14.BXU(true, z);
                    }
                    C95494lK r0 = r22.A01;
                    if (r0 != null) {
                        r0.A0S();
                        return;
                    }
                    return;
                case 5:
                    StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r13.A00;
                    stickerStorePackPreviewActivity.A05.A06(R.string.f12nameremoved, 1);
                    for (Object next : collection) {
                        for (AnonymousClass6CV r15 : C96144mr.A00(stickerStorePackPreviewActivity.A0L)) {
                            if (next.equals(r15.A03)) {
                                r15.A02 = false;
                            }
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
