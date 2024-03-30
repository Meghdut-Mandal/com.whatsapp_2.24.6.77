package com.whatsapp.gallery;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01P;
import X.AnonymousClass17Y;
import X.AnonymousClass1A2;
import X.AnonymousClass2Ty;
import X.AnonymousClass3MW;
import X.AnonymousClass4NC;
import X.AnonymousClass4US;
import X.AnonymousClass4V2;
import X.AnonymousClass6QO;
import X.AnonymousClass6YT;
import X.C007103b;
import X.C12380hx;
import X.C1270866x;
import X.C12790if;
import X.C12810ih;
import X.C132366Tg;
import X.C14760m9;
import X.C160017kK;
import X.C18660tW;
import X.C18820ts;
import X.C19970wo;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C40801w8;
import X.C41301wz;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GalleryRecentsFragment extends Hilt_GalleryRecentsFragment implements AnonymousClass4US, C160017kK {
    public int A00;
    public AnonymousClass6YT A01;
    public C19970wo A02;
    public GalleryTabHostFragment A03;
    public C41301wz A04;
    public AnonymousClass1A2 A05;
    public C1270866x A06;
    public boolean A07;
    public final List A08 = AnonymousClass001.A0I();
    public final Map A09 = C36431kI.A1G();

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A00 = A1Z().A07(2614);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            C36341k9.A0q(view.getContext(), stickyHeadersRecyclerView, R.color.f6nameremoved);
        }
        Bn7();
        C41301wz r1 = new C41301wz(this);
        this.A04 = r1;
        StickyHeadersRecyclerView stickyHeadersRecyclerView2 = this.A08;
        if (stickyHeadersRecyclerView2 != null) {
            stickyHeadersRecyclerView2.A13.add(r1);
        }
    }

    public boolean A1k(AnonymousClass4V2 r6, AnonymousClass2Ty r7) {
        Boolean bool;
        GalleryTabHostFragment galleryTabHostFragment;
        C41301wz r1;
        C1270866x r4 = this.A06;
        if (r4 != null) {
            r4.A02(Integer.valueOf(AnonymousClass3MW.A01(r6.BEF())), 4, 16);
            Uri B7k = r6.B7k();
            Map map = this.A09;
            if (!(map.containsKey(B7k) || this.A04 == null || map.size() >= this.A00 || (galleryTabHostFragment = this.A03) == null || !galleryTabHostFragment.A1a() || (r1 = this.A04) == null || this.A08 == null)) {
                int A012 = RecyclerView.A01(r7);
                r1.A04 = true;
                r1.A03 = A012;
                r1.A00 = C36441kJ.A07(r7);
            }
            GalleryTabHostFragment galleryTabHostFragment2 = this.A03;
            if (galleryTabHostFragment2 != null) {
                bool = Boolean.valueOf(galleryTabHostFragment2.A1a());
            } else {
                bool = null;
            }
            if (C36371kC.A1X(bool, true)) {
                return A03(r6);
            }
            return false;
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }

    public static final void A00(GalleryRecentsFragment galleryRecentsFragment) {
        ViewGroup viewGroup;
        int i;
        String str;
        GalleryTabHostFragment galleryTabHostFragment = galleryRecentsFragment.A03;
        if (galleryTabHostFragment != null) {
            Set A0f = C007103b.A0f(C007103b.A0V(galleryRecentsFragment.A09.values()));
            Toolbar toolbar = galleryTabHostFragment.A03;
            if (toolbar != null) {
                if (!A0f.isEmpty()) {
                    GalleryTabHostFragment.A0B(galleryTabHostFragment, true);
                    C18820ts r5 = galleryTabHostFragment.A0B;
                    if (r5 != null) {
                        long size = (long) A0f.size();
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1L(objArr, A0f.size(), 0);
                        str = r5.A0L(objArr, R.plurals.f10nameremoved, size);
                    } else {
                        throw C36321k7.A09();
                    }
                } else {
                    GalleryTabHostFragment.A0B(galleryTabHostFragment, GalleryTabHostFragment.A0D(galleryTabHostFragment));
                    Bundle bundle = galleryTabHostFragment.A0A;
                    if (bundle != null) {
                        str = bundle.getString("gallery_picker_title");
                    } else {
                        str = null;
                    }
                }
                toolbar.setTitle((CharSequence) str);
            }
            int A002 = C36351kA.A00(A0f.isEmpty() ^ true ? 1 : 0);
            ViewGroup viewGroup2 = galleryTabHostFragment.A02;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != A002) && (viewGroup = galleryTabHostFragment.A02) != null) {
                viewGroup.setVisibility(A002);
            }
            C40801w8 r1 = (C40801w8) galleryTabHostFragment.A0O.getValue();
            List list = r1.A02;
            list.clear();
            list.addAll(A0f);
            r1.A06();
            ViewPager viewPager = galleryTabHostFragment.A05;
            if (viewPager != null) {
                i = viewPager.getCurrentItem();
            } else {
                i = 0;
            }
            GalleryTabHostFragment.A0A(galleryTabHostFragment, i);
        }
        galleryRecentsFragment.A1d(galleryRecentsFragment.A09.size());
        galleryRecentsFragment.A1b();
    }

    public void A1e(AnonymousClass4V2 r5, AnonymousClass2Ty r6) {
        C1270866x r3 = this.A06;
        if (r3 != null) {
            r3.A02(Integer.valueOf(AnonymousClass3MW.A01(r5.BEF())), 1, 16);
            if (A1i()) {
                A03(r5);
                return;
            }
            Bundle bundle = this.A0A;
            if (bundle == null || !bundle.getBoolean("is_send_as_document", false)) {
                this.A09.put(r5.B7k(), r5);
            }
            GalleryTabHostFragment galleryTabHostFragment = this.A03;
            if (galleryTabHostFragment != null) {
                galleryTabHostFragment.A1Z(C36371kC.A11(r5));
                return;
            }
            return;
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }

    public boolean BPU() {
        return C36371kC.A1T(this.A09.size(), this.A00);
    }

    public void Bn7() {
        if (this.A0P.A02.compareTo(AnonymousClass01P.CREATED) >= 0) {
            A1g(false);
        }
    }

    public void Bpb(AnonymousClass4V2 r3) {
        if (!this.A09.containsKey(r3.B7k())) {
            A03(r3);
        }
    }

    public void Btq() {
        Toast toast = this.A06;
        if (toast != null) {
            toast.cancel();
        }
        AnonymousClass17Y r4 = this.A07;
        if (r4 != null) {
            Resources A0G = C36341k9.A0G(this);
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1J(A0L, this.A00);
            Toast A012 = r4.A01(A0G.getString(R.string.f12nameremoved, A0L));
            A012.show();
            this.A06 = A012;
            return;
        }
        throw C36321k7.A06();
    }

    public void BwO(AnonymousClass4V2 r3) {
        if (this.A09.containsKey(r3.B7k())) {
            A03(r3);
        }
    }

    private final boolean A03(AnonymousClass4V2 r7) {
        int A072 = A1Z().A07(2614);
        Map map = this.A09;
        if (map.size() >= A072) {
            A072 = A1Z().A07(2693);
        }
        Uri B7k = r7.B7k();
        if (map.containsKey(B7k)) {
            map.remove(B7k);
        } else if (map.size() >= A072) {
            Toast toast = this.A06;
            if (toast != null) {
                toast.cancel();
            }
            AnonymousClass17Y r3 = this.A07;
            if (r3 != null) {
                Resources A0G = C36341k9.A0G(this);
                Object[] objArr = new Object[1];
                boolean A1b = C36361kB.A1b(objArr, A072);
                Toast A012 = r3.A01(A0G.getString(R.string.f12nameremoved, objArr));
                A012.show();
                this.A06 = A012;
                return A1b;
            }
            throw C36321k7.A06();
        } else {
            map.put(B7k, r7);
        }
        A00(this);
        return true;
    }

    public void A1J() {
        super.A1J();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            C12380hx r2 = new C12380hx(new C12810ih(C14760m9.A00, new C12790if(AnonymousClass4NC.A00, new C18660tW(stickyHeadersRecyclerView, 0)), false));
            while (r2.hasNext()) {
                ((ImageView) r2.next()).setImageDrawable((Drawable) null);
            }
        }
    }

    public void A1M() {
        super.A1M();
        A00(this);
    }

    public void BHA(C132366Tg r5, Collection collection) {
        C36321k7.A0w(collection, r5);
        C132366Tg r3 = new C132366Tg();
        collection.clear();
        Iterator A0y = AnonymousClass000.A0y(this.A09);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            collection.add(A11.getKey());
            r3.A06(new AnonymousClass6QO((Uri) A11.getKey()));
        }
        Map map = r3.A00;
        map.clear();
        map.putAll(r5.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r5.containsAll(r12) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsA(X.C132366Tg r11, java.util.Collection r12, java.util.Collection r13) {
        /*
            r10 = this;
            X.C36321k7.A0w(r12, r13)
            java.util.List r5 = r10.A08
            int r1 = r5.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x0016
            boolean r0 = r5.containsAll(r12)
            r9 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r9 = 0
        L_0x0017:
            java.util.Map r4 = r10.A09
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0028
            if (r9 == 0) goto L_0x0028
            return
        L_0x0028:
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r4)
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x0030
            X.C36411kG.A1T(r3, r1)
            goto L_0x0030
        L_0x0048:
            java.util.LinkedHashMap r3 = X.C000400e.A06(r3)
            java.util.Iterator r8 = r13.iterator()
        L_0x0050:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r6 = r8.next()
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x0050
            X.6YT r0 = r10.A01
            if (r0 == 0) goto L_0x00ad
            X.6Dz r2 = r0.A0g
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x008a
            java.util.List r0 = r2.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x0070:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r7 = r1.next()
            X.4V2 r7 = (X.AnonymousClass4V2) r7
            android.net.Uri r0 = r7.B7k()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0070
        L_0x0086:
            r3.put(r6, r7)
            goto L_0x0050
        L_0x008a:
            X.4Uo r0 = r2.A02
            if (r0 == 0) goto L_0x00ad
            r1 = 0
        L_0x008f:
            X.4Uo r0 = r2.A02
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x00ad
            X.4Uo r0 = r2.A02
            X.4V2 r7 = r0.BDy(r1)
            if (r7 == 0) goto L_0x00aa
            android.net.Uri r0 = r7.B7k()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00aa
            goto L_0x0086
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x008f
        L_0x00ad:
            r7 = 0
            goto L_0x0086
        L_0x00af:
            r4.clear()
            r4.putAll(r3)
            if (r9 != 0) goto L_0x00c0
            r5.clear()
            r5.addAll(r12)
            r10.Bn7()
        L_0x00c0:
            A00(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryRecentsFragment.BsA(X.6Tg, java.util.Collection, java.util.Collection):void");
    }
}
