package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import com.whatsapp.newsletter.viewmodel.NewsletterListViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Yd  reason: invalid class name and case insensitive filesystem */
public abstract class C46512Yd extends AnonymousClass24P implements AnonymousClass4ON, AnonymousClass4OP {
    public C19460v5 A00;
    public C57682ye A01;
    public AnonymousClass16I A02;
    public AnonymousClass1GQ A03;
    public NewsletterLinkLauncher A04;
    public AnonymousClass1ZS A05;
    public C32241dD A06;
    public AnonymousClass3UC A07;
    public C40131uz A08;
    public NewsletterListViewModel A09;
    public AnonymousClass3LE A0A;
    public Runnable A0B;
    public String A0C;
    public String A0D;
    public final Handler A0E = C36341k9.A0H();
    public final C226815j A0F = AnonymousClass4W3.A00(this, 26);

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        AnonymousClass1GQ A3i = A3i();
        if (A3i.A06() && A3i.A00.A0E(4283)) {
            MenuItem add = menu.add(0, 10001, 0, R.string.f12nameremoved);
            View A0R = C36441kJ.A0R(add, R.layout.f9nameremoved);
            if (A0R != null) {
                A0R.setEnabled(true);
                C36371kC.A1F(A0R, this, add, 8);
            }
            add.setShowAsAction(1);
        }
        if (A3i().A05()) {
            MenuItem add2 = menu.add(0, 10002, 0, R.string.f12nameremoved);
            add2.setIcon(R.drawable.vec_ic_filter_icon);
            View actionView = add2.getActionView();
            if (actionView != null) {
                actionView.setEnabled(true);
                C36371kC.A1F(actionView, this, add2, 8);
            }
            add2.setShowAsAction(1);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final AnonymousClass1GQ A3i() {
        AnonymousClass1GQ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterConfig");
    }

    public final C32241dD A3j() {
        C32241dD r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterLogging");
    }

    public final C40131uz A3k() {
        C40131uz r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterDirectoryViewModel");
    }

    public final NewsletterListViewModel A3l() {
        NewsletterListViewModel newsletterListViewModel = this.A09;
        if (newsletterListViewModel != null) {
            return newsletterListViewModel;
        }
        throw C36331k8.A0d("newsletterListViewModel");
    }

    public final AnonymousClass3LE A3m() {
        AnonymousClass3LE r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("searchToolbarHelper");
    }

    public void A3n() {
        if (this instanceof NewsletterDirectoryActivity) {
            NewsletterDirectoryActivity.A0F((NewsletterDirectoryActivity) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3o() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity
            if (r0 == 0) goto L_0x0012
            r0 = r3
            com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity r0 = (com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity) r0
            X.1wF r2 = r0.A08
            if (r2 == 0) goto L_0x0012
            X.2pt r1 = r0.A09
            java.lang.String r0 = r0.A0C
            r2.A0L(r1, r0)
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46512Yd.A3o():void");
    }

    public final void A3p() {
        String str = this.A0C;
        CountrySelectorBottomSheet countrySelectorBottomSheet = new CountrySelectorBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("SELECTED_COUNTRY_ISO", str);
        countrySelectorBottomSheet.A17(A072);
        countrySelectorBottomSheet.A04 = new AnonymousClass355(this, countrySelectorBottomSheet);
        Btm(countrySelectorBottomSheet);
    }

    public void A3q(AnonymousClass11F r8, boolean z, boolean z2) {
        C46542Yg r1;
        if (!(this instanceof NewsletterDirectoryCategoriesActivity)) {
            C41051wX r4 = ((NewsletterDirectoryActivity) this).A07;
            if (r4 == null) {
                throw C36331k8.A0d("newsletterDirectoryAdapter");
            }
            List list = r4.A08;
            AnonymousClass00C.A0D(list, 0);
            Iterator it = C36441kJ.A15(list).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    throw C36351kA.A0v();
                }
                C54882ti r12 = (C54882ti) next;
                if ((r12 instanceof C46542Yg) && (r1 = (C46542Yg) r12) != null) {
                    if (!AnonymousClass00C.A0J(r1.A02.A06(), r8)) {
                        i = i2;
                    } else if (z) {
                        r1.A01 = false;
                    } else if (z2 && !r1.A00.A0f) {
                        r1.A00 = r4.A03.A0D(r8);
                    }
                }
                r4.A02.A0H(new C81293wm((Object) r4, i, 0));
                i = i2;
            }
        }
    }

    public void A3r(C28981Uw r12, int i, boolean z) {
        C52512pY r5;
        C52512pY r52;
        if (!(this instanceof NewsletterDirectoryCategoriesActivity)) {
            NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this;
            C28981Uw r4 = r12;
            AnonymousClass00C.A0D(r12, 0);
            boolean z2 = false;
            C32241dD A3j = newsletterDirectoryActivity.A3j();
            String str = newsletterDirectoryActivity.A0D;
            int i2 = i;
            if (z) {
                if (str == null || str.length() == 0) {
                    z2 = true;
                }
                boolean z3 = !z2;
                String A002 = newsletterDirectoryActivity.A09.A00();
                C32241dD.A03(r12, A3j, 7, i, z3);
                if (z3) {
                    r52 = C52512pY.NEWSLETTER_DIRECTORY_SEARCH;
                } else {
                    r52 = C52512pY.NEWSLETTER_DIRECTORY;
                }
                A3j.A0C(r4, r52, r52, (Long) null, A002, (String) null, i2);
                return;
            }
            if (str == null || str.length() == 0) {
                z2 = true;
            }
            boolean z4 = !z2;
            String A003 = newsletterDirectoryActivity.A09.A00();
            C32241dD.A03(r12, A3j, 8, i, z4);
            if (z4) {
                r5 = C52512pY.NEWSLETTER_DIRECTORY_SEARCH;
            } else {
                r5 = C52512pY.NEWSLETTER_DIRECTORY;
            }
            A3j.A0D(r4, r5, r5, (Long) null, A003, (String) null, i2);
        }
    }

    public void A3s(C604938b r12) {
        C41051wX r3;
        Object obj;
        if (!(this instanceof NewsletterDirectoryCategoriesActivity)) {
            NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this;
            AnonymousClass00C.A0D(r12, 0);
            boolean z = false;
            if (r12.A01.ordinal() != 0) {
                r3 = newsletterDirectoryActivity.A07;
                if (r3 == null) {
                    throw C36331k8.A0d("newsletterDirectoryAdapter");
                }
                if (r12.A02 != null) {
                    z = true;
                }
                C21854Abe abe = r12.A00;
                if (abe instanceof C178228fO) {
                    obj = C46562Yi.A00;
                } else if (abe instanceof AnonymousClass8fQ) {
                    r3.A05.A0G((Integer) null, (Integer) null, (String) null, 4);
                    obj = AnonymousClass2Yl.A00;
                } else {
                    obj = AnonymousClass2Yk.A00;
                }
                if (z) {
                    List list = r3.A08;
                    if (C36401kF.A1a(list)) {
                        list.remove(C36431kI.A07(list));
                        list.add(obj);
                        r3.A07(C36431kI.A07(list));
                        return;
                    }
                }
                List list2 = r3.A08;
                list2.clear();
                list2.add(obj);
            } else {
                C41051wX r9 = newsletterDirectoryActivity.A07;
                if (r9 == null) {
                    throw C36331k8.A0d("newsletterDirectoryAdapter");
                }
                List list3 = r12.A03;
                if (newsletterDirectoryActivity.A3k().A02) {
                    if (list3.isEmpty()) {
                        r9.A0L();
                    } else {
                        List list4 = r9.A08;
                        int size = list4.size();
                        list4.addAll(list3);
                        r9.A01.A02(size, list3.size());
                        AnonymousClass03X.A08(list4, new C89834Yb(5));
                    }
                } else if (C36401kF.A1a(list3)) {
                    C41051wX.A00(r9, list3);
                }
                if (newsletterDirectoryActivity.A3k().A02 || !list3.isEmpty()) {
                    C33521fV.A00(newsletterDirectoryActivity, newsletterDirectoryActivity.A08, newsletterDirectoryActivity.getString(R.string.f12nameremoved));
                    return;
                } else if (r12.A02 != null) {
                    newsletterDirectoryActivity.A3t((Integer) null, true);
                    return;
                } else {
                    C33521fV.A00(newsletterDirectoryActivity, newsletterDirectoryActivity.A08, newsletterDirectoryActivity.getString(R.string.f12nameremoved));
                    r3 = newsletterDirectoryActivity.A07;
                    if (r3 == null) {
                        throw C36331k8.A0d("newsletterDirectoryAdapter");
                    }
                    C46572Yj r1 = C46572Yj.A00;
                    List list5 = r3.A08;
                    list5.clear();
                    list5.add(r1);
                }
            }
            r3.A07(0);
        }
    }

    public void A3t(Integer num, boolean z) {
        C52462pT r6;
        C22726Aue r4;
        C604938b r0;
        int i;
        C604938b r02;
        String str;
        if (!(this instanceof NewsletterDirectoryCategoriesActivity)) {
            NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this;
            AnonymousClass19A r03 = newsletterDirectoryActivity.A06;
            if (r03 == null) {
                throw C36331k8.A0d("messageClient");
            } else if (!r03.A0I()) {
                C604938b r04 = (C604938b) newsletterDirectoryActivity.A3k().A03.A04();
                if (r04 != null) {
                    str = r04.A02;
                } else {
                    str = null;
                }
                C52202p3 r42 = C52202p3.FAILED;
                if (!z) {
                    str = null;
                }
                newsletterDirectoryActivity.A3s(new C604938b(new C178228fO(), r42, str, C023409w.A00));
            } else {
                RecyclerView recyclerView = newsletterDirectoryActivity.A01;
                if (recyclerView == null) {
                    throw C36331k8.A0d("directoryRecyclerView");
                }
                recyclerView.A0e();
                C41051wX r3 = newsletterDirectoryActivity.A07;
                if (!z) {
                    if (r3 == null) {
                        throw C36331k8.A0d("newsletterDirectoryAdapter");
                    }
                    C46552Yh r43 = C46552Yh.A00;
                    List list = r3.A08;
                    list.clear();
                    list.add(r43);
                    r3.A07(0);
                } else if (r3 == null) {
                    throw C36331k8.A0d("newsletterDirectoryAdapter");
                } else {
                    List list2 = r3.A08;
                    if (C36401kF.A1a(list2) && ((C36401kF.A0n(list2) instanceof C46562Yi) || (C36401kF.A0n(list2) instanceof AnonymousClass2Yl) || (C36401kF.A0n(list2) instanceof AnonymousClass2Yk))) {
                        list2.remove(C36431kI.A07(list2));
                        list2.add(C46552Yh.A00);
                        r3.A07(C36431kI.A07(list2));
                    }
                }
                String str2 = newsletterDirectoryActivity.A0D;
                if (str2 == null || AnonymousClass098.A06(str2)) {
                    C40131uz A3k = newsletterDirectoryActivity.A3k();
                    int ordinal = newsletterDirectoryActivity.A09.ordinal();
                    if (ordinal == 1) {
                        r6 = C52462pT.TRENDING;
                    } else if (ordinal == 2) {
                        r6 = C52462pT.FEATURED;
                    } else if (ordinal == 3) {
                        r6 = C52462pT.NEW;
                    } else if (ordinal == 4 || ordinal == 6) {
                        r6 = C52462pT.POPULAR;
                    } else {
                        r6 = C52462pT.RECOMMENDED;
                    }
                    String str3 = newsletterDirectoryActivity.A0C;
                    if (!z || A3k.A00 == null) {
                        C22726Aue aue = A3k.A00;
                        if (aue != null) {
                            aue.cancel();
                        }
                        A3k.A02 = z;
                        C30131Zi r2 = A3k.A07;
                        String str4 = null;
                        if (z && (r0 = (C604938b) A3k.A03.A04()) != null) {
                            str4 = r0.A02;
                        }
                        C75933o3 r7 = A3k.A09;
                        AnonymousClass00C.A0D(r7, 3);
                        if (!C36391kE.A1Z(r2.A0G)) {
                            r4 = new AnonymousClass2YB(r7);
                        } else {
                            if (AnonymousClass00C.A0J(str3, "Global")) {
                                str3 = null;
                            }
                            C20810yC r44 = r2.A0E;
                            r4 = new AnonymousClass2YC(r2.A0I, r6, r7, str3, str4, r44.A07(5853), r44.A0E(5015));
                        }
                        r2.A0B.A01(r4);
                        A3k.A00 = r4;
                    }
                    C32241dD A3j = newsletterDirectoryActivity.A3j();
                    int ordinal2 = newsletterDirectoryActivity.A09.ordinal();
                    Integer A0j = C36361kB.A0j();
                    switch (ordinal2) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                        case 6:
                            break;
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            A0j = null;
                            break;
                        default:
                            throw C36441kJ.A18();
                    }
                    A0j = Integer.valueOf(i);
                    A3j.A0G(A0j, num, newsletterDirectoryActivity.A0C, 12);
                    return;
                }
                String str5 = newsletterDirectoryActivity.A0D;
                if (str5 != null) {
                    C40131uz A3k2 = newsletterDirectoryActivity.A3k();
                    if (!z || A3k2.A00 == null) {
                        C22726Aue aue2 = A3k2.A00;
                        if (aue2 != null) {
                            aue2.cancel();
                        }
                        A3k2.A02 = z;
                        C30131Zi r22 = A3k2.A07;
                        String str6 = null;
                        if (z && (r02 = (C604938b) A3k2.A03.A04()) != null) {
                            str6 = r02.A02;
                        }
                        A3k2.A00 = r22.A00(A3k2.A09, str5, str6);
                    }
                }
            }
        }
    }

    public void A3u(boolean z) {
        RecyclerView recyclerView;
        if ((this instanceof NewsletterDirectoryActivity) && (recyclerView = ((NewsletterDirectoryActivity) this).A02) != null) {
            recyclerView.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
    }

    public void A3v(boolean z) {
        if (this instanceof NewsletterDirectoryCategoriesActivity) {
            NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity = (NewsletterDirectoryCategoriesActivity) this;
            if (newsletterDirectoryCategoriesActivity.A3i().A05()) {
                RecyclerView recyclerView = newsletterDirectoryCategoriesActivity.A00;
                if (z) {
                    if (recyclerView == null) {
                        throw C36331k8.A0d("recyclerView");
                    }
                    recyclerView.setVisibility(8);
                    AnonymousClass1RJ r0 = newsletterDirectoryCategoriesActivity.A03;
                    if (r0 == null) {
                        throw C36331k8.A0d("categorySearchLayout");
                    }
                    View A012 = r0.A01();
                    AnonymousClass00C.A08(A012);
                    A012.setVisibility(0);
                } else if (recyclerView == null) {
                    throw C36331k8.A0d("recyclerView");
                } else {
                    recyclerView.setVisibility(0);
                    AnonymousClass1RJ r02 = newsletterDirectoryCategoriesActivity.A03;
                    if (r02 == null) {
                        throw C36331k8.A0d("categorySearchLayout");
                    }
                    View A013 = r02.A01();
                    AnonymousClass00C.A08(A013);
                    A013.setVisibility(8);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        boolean z = this instanceof NewsletterDirectoryCategoriesActivity;
        if (z) {
            i = R.layout.f9nameremoved;
        } else {
            i = R.layout.f9nameremoved;
        }
        Toolbar A0O = C36361kB.A0O(this, i);
        A0O.setTitle((int) R.string.f12nameremoved);
        setSupportActionBar(A0O);
        C36321k7.A0O(this);
        this.A0A = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C53842ry(this, 11), A0O, this.A00);
        AnonymousClass1ZS r1 = this.A05;
        if (r1 != null) {
            this.A0C = r1.A00();
            if (z) {
                NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity = (NewsletterDirectoryCategoriesActivity) this;
                C57742yk r2 = newsletterDirectoryCategoriesActivity.A01;
                if (r2 != null) {
                    C19770wU A0Z = C36341k9.A0Z(r2.A00.A01);
                    C27121Mz r12 = r2.A00;
                    C18800tq r22 = r12.A01;
                    newsletterDirectoryCategoriesActivity.A02 = new C40971wP((C57752yl) r12.A00.A0U.get(), C36351kA.A0T(r22), C36351kA.A0W(r22), C36341k9.A0T(r22), C36371kC.A0f(r22), (C61553Cl) r22.A00.A1T.get(), newsletterDirectoryCategoriesActivity, A0Z);
                    C65993Ug.A00(newsletterDirectoryCategoriesActivity, newsletterDirectoryCategoriesActivity.A3k().A04, new C86384Ks(newsletterDirectoryCategoriesActivity), 16);
                    newsletterDirectoryCategoriesActivity.A3k().A0S();
                } else {
                    throw C36331k8.A0d("directoryCategoriesAdapterFactory");
                }
            } else {
                NewsletterDirectoryActivity newsletterDirectoryActivity = (NewsletterDirectoryActivity) this;
                C57722yi r23 = newsletterDirectoryActivity.A05;
                if (r23 != null) {
                    C20810yC A0V = C36341k9.A0V(r23.A00.A01);
                    newsletterDirectoryActivity.A08 = new C40871wF(C19470v6.A00, (C57732yj) r23.A00.A00.A1c.get(), A0V, newsletterDirectoryActivity);
                    C57692yf r24 = newsletterDirectoryActivity.A04;
                    if (r24 != null) {
                        C27731Pn A0T = C36351kA.A0T(r24.A00.A01);
                        C27121Mz r13 = r24.A00;
                        C18800tq r25 = r13.A01;
                        C19630wG A0W = C36351kA.A0W(r25);
                        C19770wU A0Z2 = C36341k9.A0Z(r25);
                        AnonymousClass16D A0R = C36341k9.A0R(r25);
                        newsletterDirectoryActivity.A07 = new C41051wX((C57702yg) r13.A00.A34.get(), C36351kA.A0M(r25), A0R, A0T, A0W, (C61553Cl) r25.A00.A1T.get(), C36431kI.A0n(r25), newsletterDirectoryActivity, newsletterDirectoryActivity, A0Z2);
                    } else {
                        throw C36331k8.A0d("newsletterDirectoryAdapterFactory");
                    }
                } else {
                    throw C36331k8.A0d("newsletterDirectoryFilterAdapterFactory");
                }
            }
            AnonymousClass16I r26 = this.A02;
            if (r26 != null) {
                r26.registerObserver(this.A0F);
                C65993Ug.A00(this, A3k().A03, new C86344Ko(this), 14);
                if (z) {
                    NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity2 = (NewsletterDirectoryCategoriesActivity) this;
                    RecyclerView recyclerView = (RecyclerView) C36361kB.A0D(newsletterDirectoryCategoriesActivity2, R.id.directory_category_list);
                    C40971wP r14 = newsletterDirectoryCategoriesActivity2.A02;
                    if (r14 == null) {
                        throw C36331k8.A0d("newsletterDirectoryCategoriesAdapter");
                    }
                    recyclerView.setAdapter(r14);
                    recyclerView.setItemAnimator((C02800By) null);
                    C36321k7.A0Q(recyclerView);
                    newsletterDirectoryCategoriesActivity2.A00 = recyclerView;
                    AnonymousClass1RJ A0r = C36351kA.A0r(newsletterDirectoryCategoriesActivity2, R.id.categories_search_stub);
                    newsletterDirectoryCategoriesActivity2.A03 = A0r;
                    View A012 = A0r.A01();
                    AnonymousClass00C.A08(A012);
                    A012.setVisibility(8);
                } else {
                    NewsletterDirectoryActivity newsletterDirectoryActivity2 = (NewsletterDirectoryActivity) this;
                    RecyclerView recyclerView2 = (RecyclerView) C36361kB.A0D(newsletterDirectoryActivity2, R.id.newsletter_list);
                    C41051wX r15 = newsletterDirectoryActivity2.A07;
                    if (r15 == null) {
                        throw C36331k8.A0d("newsletterDirectoryAdapter");
                    }
                    recyclerView2.setAdapter(r15);
                    recyclerView2.setItemAnimator((C02800By) null);
                    C36351kA.A1F(recyclerView2, 1);
                    newsletterDirectoryActivity2.A01 = recyclerView2;
                    if (C36331k8.A1b(newsletterDirectoryActivity2.A0C)) {
                        C89144Vk r16 = new C89144Vk(newsletterDirectoryActivity2, 6);
                        RecyclerView recyclerView3 = newsletterDirectoryActivity2.A01;
                        if (recyclerView3 == null) {
                            throw C36331k8.A0d("directoryRecyclerView");
                        }
                        recyclerView3.A0v(r16);
                        newsletterDirectoryActivity2.A00 = r16;
                    }
                    newsletterDirectoryActivity2.A02 = (RecyclerView) C03570Gk.A0B(newsletterDirectoryActivity2, R.id.filter_list);
                    newsletterDirectoryActivity2.A3u(true);
                    C03570Gk.A0B(newsletterDirectoryActivity2, R.id.filter_divider).setVisibility(0);
                    C40871wF r27 = newsletterDirectoryActivity2.A08;
                    if (r27 != null) {
                        r27.A0L(C52622pt.EXPLORE, newsletterDirectoryActivity2.A0C);
                    }
                    RecyclerView recyclerView4 = newsletterDirectoryActivity2.A02;
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(newsletterDirectoryActivity2.A08);
                    }
                    RecyclerView recyclerView5 = newsletterDirectoryActivity2.A02;
                    if (recyclerView5 != null) {
                        C36351kA.A1F(recyclerView5, 0);
                    }
                }
                C57682ye r3 = this.A01;
                if (r3 != null) {
                    NewsletterListViewModel newsletterListViewModel = (NewsletterListViewModel) new AnonymousClass04H(new AnonymousClass4ZE(r3, 4), this).A00(NewsletterListViewModel.class);
                    this.A06.A04(newsletterListViewModel);
                    AnonymousClass00C.A0D(newsletterListViewModel, 0);
                    this.A09 = newsletterListViewModel;
                    C65993Ug.A00(this, A3l().A03.A00, new C86354Kp(this), 13);
                    C65993Ug.A00(this, A3l().A01, new C86364Kq(this), 12);
                    C65993Ug.A00(this, A3l().A00, new C86374Kr(this), 15);
                    A3t(C36371kC.A0n(), false);
                    A3k();
                    return;
                }
                throw C36331k8.A0d("newsletterListViewModelFactory");
            }
            throw C36331k8.A0d("contactObservers");
        }
        throw C36331k8.A0d("newsletterDirectoryUtil");
    }

    public void onBackPressed() {
        if (A3m().A07()) {
            A3m().A05(true);
            A3u(true);
            A3v(false);
            return;
        }
        super.onBackPressed();
        A3j().A0G((Integer) null, (Integer) null, (String) null, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass16I r1 = this.A02;
        if (r1 != null) {
            r1.unregisterObserver(this.A0F);
            Runnable runnable = this.A0B;
            if (runnable != null) {
                this.A0E.removeCallbacks(runnable);
            }
            C22726Aue aue = A3k().A00;
            if (aue != null) {
                aue.cancel();
            }
            C32241dD A3j = A3j();
            A3j.A00 = 0;
            A3j.A01 = 0;
            return;
        }
        throw C36331k8.A0d("contactObservers");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 10001) {
            onSearchRequested();
        } else if (A062 == 10002) {
            A3p();
        } else if (A062 == 16908332) {
            A3j().A0G((Integer) null, (Integer) null, (String) null, 2);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        A3m().A06(false);
        A3u(false);
        A3v(true);
        A3j().A0G((Integer) null, (Integer) null, (String) null, 3);
        A3j().A0G((Integer) null, (Integer) null, (String) null, 13);
        AnonymousClass3Y4.A00(findViewById(R.id.search_back), this, 27);
        return false;
    }
}
