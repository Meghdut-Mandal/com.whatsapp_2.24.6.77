package X;

import com.whatsapp.calling.callsuggestions.SuggestionManager$combineResults$jobResult$1;
import com.whatsapp.calling.callsuggestions.SuggestionManager$loadBuckets$bucketResultList$1$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.63R  reason: invalid class name */
public final class AnonymousClass63R {
    public final C123745x1 A00;
    public final AnonymousClass3D2 A01;
    public final AnonymousClass040 A02;
    public final C124165xh A03;

    public AnonymousClass63R(C123745x1 r2, C124165xh r3, AnonymousClass3D2 r4, AnonymousClass040 r5) {
        AnonymousClass00C.A0D(r5, 3);
        this.A01 = r4;
        this.A03 = r3;
        this.A02 = r5;
        this.A00 = r2;
    }

    public final AnonymousClass6O7 A00(Collection collection) {
        C108295Sy r8;
        Object obj;
        Collection collection2 = collection;
        AnonymousClass00C.A0D(collection2, 0);
        C123745x1 r12 = this.A00;
        List<C108295Sy> list = r12.A05;
        ArrayList<C159397jI> A0J = C36321k7.A0J(list);
        for (C108295Sy r6 : list) {
            C124165xh r4 = this.A03;
            AnonymousClass040 r5 = this.A02;
            AnonymousClass00C.A0D(r6, 0);
            switch (r6.ordinal()) {
                case 0:
                    obj = C143996rS.A00;
                    break;
                case 1:
                    AnonymousClass1U2 r42 = r4.A00.A00;
                    AnonymousClass16D A0R = C36341k9.A0R(r42.A00);
                    AnonymousClass1U1 r43 = r42.A01;
                    obj = new C144056rY(r12, (C1260762l) r43.A1I.get(), (C130896Mv) r43.A2g.get(), A0R, collection2, r5);
                    break;
                case 2:
                    AnonymousClass1U2 r44 = r4.A01.A00;
                    obj = new C144016rU(r12, (C1260762l) r44.A01.A1I.get(), C36341k9.A0R(r44.A00), collection2, r5);
                    break;
                case 3:
                    AnonymousClass1U2 r45 = r4.A02.A00;
                    C18800tq r3 = r45.A00;
                    obj = new C144046rX(r12, (C130896Mv) r45.A01.A2g.get(), C36341k9.A0R(r3), (C24541Cv) r3.A4O.get(), collection2, r5);
                    break;
                case 4:
                    obj = new C144006rT(C36341k9.A0R(r4.A03.A00.A00), collection2);
                    break;
                case 5:
                    obj = new C143986rR(r12, (C130896Mv) r4.A04.A00.A01.A2g.get(), collection2, r5);
                    break;
                case 6:
                    AnonymousClass1U2 r62 = r4.A05.A00;
                    obj = new C144036rW(r12, (C1260762l) r62.A01.A1I.get(), C36351kA.A0b(r62.A00), collection2, r5);
                    break;
                case 7:
                    AnonymousClass1U2 r46 = r4.A06.A00;
                    C18800tq r32 = r46.A00;
                    obj = new C144026rV(r12, (C130896Mv) r46.A01.A2g.get(), C36351kA.A0b(r32), (C24541Cv) r32.A4O.get(), collection2);
                    break;
                default:
                    throw C36441kJ.A18();
            }
            A0J.add(obj);
        }
        ArrayList<C17990sP> A0J2 = C36321k7.A0J(A0J);
        for (C159397jI suggestionManager$loadBuckets$bucketResultList$1$1 : A0J) {
            AnonymousClass040 r47 = this.A02;
            A0J2.add(AnonymousClass0A2.A01(C023109s.A00, AnonymousClass19R.A01, new SuggestionManager$loadBuckets$bucketResultList$1$1(this, suggestionManager$loadBuckets$bucketResultList$1$1, (C023509x) null), r47));
        }
        AnonymousClass6O7 r48 = new AnonymousClass6O7(5, true);
        LinkedHashSet A17 = C36441kJ.A17();
        for (C17990sP suggestionManager$combineResults$jobResult$1 : A0J2) {
            int i = r12.A00;
            C1278569x r63 = (C1278569x) this.A01.A00(new SuggestionManager$combineResults$jobResult$1((C023509x) null, suggestionManager$combineResults$jobResult$1));
            if (r63 != null) {
                C159397jI r7 = r63.A00;
                if (r7 instanceof C143996rS) {
                    r8 = C108295Sy.NONE;
                } else if (r7 instanceof C144056rY) {
                    r8 = C108295Sy.LGC_MEMBERS;
                } else if (r7 instanceof C144016rU) {
                    r8 = C108295Sy.ADHOC_MEMBERS;
                } else if (r7 instanceof C144046rX) {
                    r8 = C108295Sy.GROUP_CHAT_MEMBERS;
                } else if (r7 instanceof C144006rT) {
                    r8 = C108295Sy.STARRED_CONTACTS;
                } else if (r7 instanceof C143986rR) {
                    r8 = C108295Sy.ONE_ON_ONE;
                } else if (r7 instanceof C144036rW) {
                    r8 = C108295Sy.LGC;
                } else if (r7 instanceof C144026rV) {
                    r8 = C108295Sy.GROUP_CHAT;
                } else {
                    throw C36441kJ.A18();
                }
                for (Object next : r63.A01) {
                    if (i > 0) {
                        AnonymousClass00C.A0D(next, 1);
                        List A0o = C90524aI.A0o(r8, r48.A01);
                        if (A0o != null) {
                            A0o.add(next);
                        }
                        List list2 = r48.A00;
                        if (list2.size() < 5 || r48.A03.contains(next)) {
                            Map map = r48.A02;
                            map.put(r8, C90464aC.A0S((Number) C90494aF.A0Y(r8, map)));
                            if (r48.A03.add(next)) {
                                list2.add(next);
                            }
                        }
                        if (A17.add(next)) {
                            i--;
                        }
                    }
                }
            }
        }
        return r48;
    }
}
