package X;

import com.whatsapp.stickers.flow.StickerPackFlow;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.store.StickerStoreMyTabFragment;
import com.whatsapp.stickers.store.StickerStoreTabFragment;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5MC  reason: invalid class name */
public class AnonymousClass5MC extends C132446Tt {
    public final AnonymousClass1BB A00;
    public final C158527he A01;
    public final AnonymousClass1AP A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str = (String) obj;
        C158527he r1 = this.A01;
        if (r1 != null) {
            r1.Bhj(AnonymousClass000.A1V(str));
        }
        if (str != null) {
            Iterator A0s = C36361kB.A0s(this.A00);
            while (A0s.hasNext()) {
                C129156Fn r5 = (C129156Fn) A0s.next();
                if (r5 instanceof C162907pL) {
                    C162907pL r52 = (C162907pL) r5;
                    switch (r52.A02) {
                        case 0:
                            if (!str.equals("meta-avatar")) {
                                break;
                            } else {
                                ((C17300r3) r52.A00).BwE(new C106125Il("onStickerPackRemoved"));
                                break;
                            }
                        case 1:
                            StickerPackFlow stickerPackFlow = (StickerPackFlow) r52.A01;
                            List list = stickerPackFlow.A00.A00;
                            ArrayList A0I = AnonymousClass001.A0I();
                            for (Object next : list) {
                                C36391kE.A1V(next, A0I, AnonymousClass00C.A0J(((C1268665y) next).A01(), str) ? 1 : 0);
                            }
                            C129156Fn.A00(r52, stickerPackFlow, A0I);
                            break;
                    }
                } else if (r5 instanceof C162897pK) {
                    C162897pK r53 = (C162897pK) r5;
                    switch (r53.A01) {
                        case 0:
                            AnonymousClass6XN r9 = (AnonymousClass6XN) r53.A00;
                            r9.A0Z.remove(str);
                            Map map = r9.A0a;
                            Collection<C161307mX> collection = (Collection) map.get(str);
                            if (collection != null) {
                                AnonymousClass6vC r7 = r9.A0G;
                                synchronized (r7) {
                                    for (C161307mX r54 : collection) {
                                        for (AnonymousClass1XQ r12 : r54.BBU()) {
                                            Collection collection2 = (Collection) r7.A01.get(r12);
                                            if (collection2 != null) {
                                                collection2.remove(r54);
                                            }
                                        }
                                    }
                                }
                            }
                            map.remove(str);
                            r9.A0I.A0M(str);
                            break;
                        case 4:
                            StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) r53.A00;
                            if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) stickerStoreTabFragment;
                                if (stickerStoreFeaturedTabFragment.A0I == null) {
                                    break;
                                } else {
                                    int i = 0;
                                    while (true) {
                                        if (i >= stickerStoreFeaturedTabFragment.A0I.size()) {
                                            break;
                                        } else {
                                            AnonymousClass68B A0f = C90514aH.A0f(stickerStoreFeaturedTabFragment, i);
                                            if (A0f.A0F.equals(str)) {
                                                A0f.A06 = false;
                                                A0f.A01 = 0;
                                                A0f.A03 = null;
                                                C96124mp r13 = stickerStoreFeaturedTabFragment.A0G;
                                                if (r13 != null) {
                                                    if (StickerStoreFeaturedTabFragment.A03(stickerStoreFeaturedTabFragment)) {
                                                        i++;
                                                    }
                                                    r13.A07(i);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment;
                                C96124mp r3 = stickerStoreMyTabFragment.A0G;
                                if (r3 == null) {
                                    break;
                                } else {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < r3.A00.size()) {
                                            AnonymousClass68B r14 = (AnonymousClass68B) r3.A00.get(i2);
                                            if (r14.A0F.equals(str)) {
                                                r3.A00.remove(r14);
                                                if (r3.A00.size() == 0) {
                                                    r3.A06();
                                                } else {
                                                    r3.A09(i2);
                                                }
                                                r3.A01.A1a();
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                    stickerStoreMyTabFragment.A04 = true;
                                    break;
                                }
                            }
                        case 5:
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r53.A00;
                            AnonymousClass68B r0 = stickerStorePackPreviewActivity.A0G;
                            if (r0 != null && r0.A0F.equals(str)) {
                                stickerStorePackPreviewActivity.A0H.A0C(new C148576z5(stickerStorePackPreviewActivity), stickerStorePackPreviewActivity.A0O, true);
                                break;
                            }
                        default:
                            C133356Xz r32 = (C133356Xz) r53.A00;
                            if (r32.A04 != null) {
                                boolean z = false;
                                for (int i3 = 0; i3 < r32.A04.size(); i3++) {
                                    if (AnonymousClass68B.A00(str, r32.A04, i3)) {
                                        r32.A04.remove(i3);
                                        z = true;
                                    }
                                }
                                if (z) {
                                    C133356Xz.A02(r32, (String) null, r32.A04);
                                }
                            }
                            C133356Xz.A00(r32);
                            C95494lK r02 = r32.A01;
                            if (r02 == null) {
                                break;
                            } else {
                                r02.A0S();
                                break;
                            }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public AnonymousClass5MC(AnonymousClass1BB r1, C158527he r2, AnonymousClass1AP r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
