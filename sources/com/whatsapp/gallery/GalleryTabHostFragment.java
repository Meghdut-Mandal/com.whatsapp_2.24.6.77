package com.whatsapp.gallery;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01z;
import X.AnonymousClass02G;
import X.AnonymousClass03T;
import X.AnonymousClass07S;
import X.AnonymousClass0CZ;
import X.AnonymousClass0PK;
import X.AnonymousClass0Q1;
import X.AnonymousClass11F;
import X.AnonymousClass16L;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass3FR;
import X.AnonymousClass3K8;
import X.AnonymousClass3U9;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y2;
import X.AnonymousClass4M8;
import X.AnonymousClass4SF;
import X.AnonymousClass4V2;
import X.AnonymousClass6YT;
import X.C011004s;
import X.C03540Gb;
import X.C100744vb;
import X.C1270866x;
import X.C132366Tg;
import X.C157297cj;
import X.C160017kK;
import X.C18820ts;
import X.C19630wG;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C224514j;
import X.C25571Gv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39401sD;
import X.C40801w8;
import X.C49502jE;
import X.C54352so;
import X.C64293Nk;
import X.C74153l9;
import X.C83894Bd;
import X.C83904Be;
import X.C89674Xl;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class GalleryTabHostFragment extends Hilt_GalleryTabHostFragment implements AnonymousClass02G, C160017kK {
    public int A00 = 1;
    public View A01;
    public ViewGroup A02;
    public Toolbar A03;
    public RecyclerView A04;
    public ViewPager A05;
    public AnonymousClass16L A06;
    public AnonymousClass185 A07;
    public C21060yb A08;
    public C19970wo A09;
    public C19630wG A0A;
    public C18820ts A0B;
    public C20810yC A0C;
    public C54352so A0D;
    public C74153l9 A0E;
    public C1270866x A0F;
    public C19770wU A0G;
    public boolean A0H;
    public boolean A0I;
    public long A0J;
    public boolean A0K;
    public final Handler A0L = C36341k9.A0H();
    public final C132366Tg A0M = new C132366Tg();
    public final AnonymousClass00T A0N = C36431kI.A1I(new C83894Bd(this));
    public final AnonymousClass00T A0O = C36431kI.A1I(new C83904Be(this));

    private final void A08(Activity activity, AnonymousClass11F r11, List list) {
        Activity activity2 = activity;
        AnonymousClass185 r1 = this.A07;
        if (r1 != null) {
            AnonymousClass11F r5 = r11;
            if (C25571Gv.A04(r1, r11, list.size())) {
                Intent A0R = AnonymousClass190.A0R(activity2, (Uri) list.get(0), r5, (String) null, (String) null, false);
                AnonymousClass00C.A08(A0R);
                activity.startActivityForResult(A0R, 36);
            } else if (activity instanceof AnonymousClass4SF) {
                ((AnonymousClass4SF) activity2).Bps(C36441kJ.A15(list));
            } else {
                Intent A0D2 = C36411kG.A0D(this);
                A0D2.putParcelableArrayListExtra("android.intent.extra.STREAM", C36441kJ.A15(list));
                C36331k8.A0o(activity, A0D2);
            }
        } else {
            throw C36331k8.A0d("verifiedNameManager");
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        Intent intent;
        int intExtra;
        Intent intent2;
        int intExtra2;
        C157297cj r5;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        if (this.A09 != null) {
            this.A0J = SystemClock.elapsedRealtime();
            ViewPager viewPager = (ViewPager) view2.findViewById(R.id.gallery_view_pager);
            C011004s.A09(viewPager, true);
            AnonymousClass01I A0h = A0h();
            AnonymousClass6YT r15 = null;
            if ((A0h instanceof C157297cj) && (r5 = (C157297cj) A0h) != null) {
                r15 = ((CameraActivity) r5).A02;
            }
            C19630wG r4 = this.A0A;
            if (r4 != null) {
                Resources A0B2 = C36421kH.A0B(r4);
                Bundle bundle2 = this.A0A;
                int i2 = 7;
                if (bundle2 != null) {
                    i2 = bundle2.getInt("include", 7);
                }
                AnonymousClass01z A0k = A0k();
                boolean A1S = C36421kH.A1S(A0h(), this, "is_coming_from_chat");
                String A072 = A07();
                AnonymousClass01I A0h2 = A0h();
                Intent intent3 = null;
                if (A0h2 != null) {
                    intent3 = A0h2.getIntent();
                }
                String A0p = C36401kF.A0p(intent3, "android.intent.extra.TEXT");
                boolean A0C2 = A0C();
                Intent A032 = C36331k8.A03(this);
                boolean z4 = true;
                if (A032 == null || !A032.hasExtra("quoted_message_row_id")) {
                    z4 = false;
                }
                long j = 0;
                if (z4) {
                    j = A032.getLongExtra("quoted_message_row_id", 0);
                }
                AnonymousClass01I A0h3 = A0h();
                Intent intent4 = null;
                if (A0h3 != null) {
                    intent4 = A0h3.getIntent();
                }
                String A0p2 = C36401kF.A0p(intent4, "quoted_group_jid");
                int A002 = A00();
                Intent A033 = C36331k8.A03(this);
                boolean z5 = false;
                if (A033 != null && A033.hasExtra("skip_max_items_new_limit")) {
                    z5 = A033.getBooleanExtra("skip_max_items_new_limit", false);
                }
                AnonymousClass01I A0h4 = A0h();
                Intent intent5 = null;
                if (A0h4 != null) {
                    intent5 = A0h4.getIntent();
                }
                String A0p3 = C36401kF.A0p(intent5, "mentions");
                Intent A034 = C36331k8.A03(this);
                boolean z6 = false;
                if (A034 != null && A034.hasExtra("is_in_multi_select_mode_only") && A034.getBooleanExtra("is_in_multi_select_mode_only", false)) {
                    z6 = true;
                }
                Intent A035 = C36331k8.A03(this);
                boolean z7 = true;
                if (A035 == null || !A035.hasExtra("picker_open_time")) {
                    z7 = false;
                }
                long j2 = 0;
                if (z7) {
                    j2 = A035.getLongExtra("picker_open_time", 0);
                }
                Intent A036 = C36331k8.A03(this);
                if (A036 == null || !A036.hasExtra("should_send_media")) {
                    z = true;
                } else {
                    z = A036.getBooleanExtra("should_send_media", true);
                }
                Intent A037 = C36331k8.A03(this);
                boolean z8 = false;
                if (A037 == null || !A037.hasExtra("should_hide_caption_view")) {
                    z2 = false;
                } else {
                    z2 = A037.getBooleanExtra("should_hide_caption_view", false);
                }
                Intent A038 = C36331k8.A03(this);
                if (A038 != null && A038.hasExtra("should_set_gallery_result")) {
                    z8 = A038.getBooleanExtra("should_set_gallery_result", false);
                }
                Intent A039 = C36331k8.A03(this);
                if (A039 == null || !A039.hasExtra("origin")) {
                    i = 1;
                } else {
                    i = A039.getIntExtra("origin", 1);
                }
                boolean A1S2 = C36421kH.A1S(A0h(), this, "is_send_as_document");
                Intent A0310 = C36331k8.A03(this);
                if (A0310 == null || !A0310.hasExtra("disable_shared_activity_transition_animation")) {
                    z3 = false;
                } else {
                    z3 = A0310.getBooleanExtra("disable_shared_activity_transition_animation", false);
                }
                AnonymousClass00C.A0B(A0B2);
                Long valueOf = Long.valueOf(j);
                Integer valueOf2 = Integer.valueOf(A002);
                Boolean valueOf3 = Boolean.valueOf(z5);
                Boolean valueOf4 = Boolean.valueOf(z6);
                Boolean valueOf5 = Boolean.valueOf(A1S2);
                Long valueOf6 = Long.valueOf(j2);
                Boolean valueOf7 = Boolean.valueOf(z);
                Boolean valueOf8 = Boolean.valueOf(z2);
                Boolean valueOf9 = Boolean.valueOf(z8);
                Boolean valueOf10 = Boolean.valueOf(z3);
                Integer valueOf11 = Integer.valueOf(i);
                AnonymousClass00C.A0B(A0k);
                viewPager.setAdapter(new C39401sD(A0B2, A0k, r15, this, valueOf3, valueOf4, valueOf5, valueOf7, valueOf8, valueOf9, valueOf10, valueOf2, valueOf11, valueOf, valueOf6, A072, A0p, A0p2, A0p3, i2, A1S, A0C2));
                viewPager.A0K(this);
                this.A05 = viewPager;
                ((TabLayout) view2.findViewById(R.id.gallery_tab_layout)).setupWithViewPager(this.A05);
                this.A02 = C36411kG.A0P(view2, R.id.gallery_selected_container);
                Toolbar toolbar = (Toolbar) C36361kB.A0F(view2, R.id.toolbar);
                this.A03 = toolbar;
                boolean z9 = A0i() instanceof GalleryPickerBottomSheetActivity;
                int i3 = R.drawable.ic_back;
                int i4 = R.string.f12nameremoved;
                if (z9) {
                    i3 = R.drawable.ic_close;
                    i4 = R.string.f12nameremoved;
                }
                String A0a = C36421kH.A0a(this, i4);
                Drawable A012 = AnonymousClass3UF.A01(toolbar.getContext(), i3, C224514j.A00(toolbar.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                C18820ts r52 = this.A0B;
                if (r52 != null) {
                    toolbar.setNavigationIcon((Drawable) new C100744vb(A012, r52));
                    toolbar.setNavigationContentDescription((CharSequence) A0a);
                    toolbar.setNavigationOnClickListener(new AnonymousClass3Y2(this, 10));
                    toolbar.setTitleTextColor(C36351kA.A02(toolbar.getContext(), toolbar.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                    Menu menu = toolbar.getMenu();
                    AnonymousClass00C.A08(menu);
                    SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
                    AnonymousClass00C.A0B(subMenu);
                    Bundle bundle3 = this.A0A;
                    int i5 = 7;
                    if (bundle3 != null) {
                        i5 = bundle3.getInt("include", 7);
                    }
                    C19630wG r6 = this.A0A;
                    if (r6 != null) {
                        C49502jE r53 = new C49502jE(this, r6, new AnonymousClass4M8(subMenu, this), i5);
                        C19770wU r2 = this.A0G;
                        if (r2 != null) {
                            C36391kE.A1Q(r53, r2);
                            toolbar.A0C = new C89674Xl(this, 2);
                            if (A0i() instanceof GalleryPickerBottomSheetActivity) {
                                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                                AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                                toolbar.setLayoutParams(marginLayoutParams);
                                toolbar.requestLayout();
                            }
                            Intent A0311 = C36331k8.A03(this);
                            if (A0311 != null && A0311.hasExtra("origin") && ((intExtra2 = A0311.getIntExtra("origin", 1)) == 2 || intExtra2 == 15 || intExtra2 == 18 || intExtra2 == 7 || intExtra2 == 8 || intExtra2 == 12 || intExtra2 == 13)) {
                                this.A00 = 0;
                            } else {
                                AnonymousClass01I A0h5 = A0h();
                                int i6 = 1;
                                if (!(A0h5 == null || (intent2 = A0h5.getIntent()) == null)) {
                                    i6 = intent2.getIntExtra("default_tab", 1);
                                }
                                this.A00 = i6;
                                int i7 = 15;
                                if (i6 == 0) {
                                    i7 = 16;
                                }
                                AnonymousClass01I A0h6 = A0h();
                                if ((A0h6 instanceof GalleryPicker) && A0h6 != null && (intent = A0h6.getIntent()) != null && (intExtra = intent.getIntExtra("media_sharing_user_journey_origin", -1)) > 0) {
                                    C1270866x r42 = this.A0F;
                                    if (r42 != null) {
                                        r42.A01(i7, intExtra, 25);
                                    } else {
                                        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
                                    }
                                }
                                ViewPager viewPager2 = this.A05;
                                if (viewPager2 != null) {
                                    viewPager2.A0J(i6, false);
                                }
                            }
                            AnonymousClass00C.A08(view2.getContext());
                            RecyclerView recyclerView = (RecyclerView) C36361kB.A0F(view2, R.id.gallery_selected_media);
                            this.A04 = recyclerView;
                            recyclerView.A0U = true;
                            recyclerView.setAdapter((AnonymousClass0CZ) this.A0O.getValue());
                            LinearLayoutManager A0T = C36431kI.A0T();
                            A0T.A1f(0);
                            recyclerView.setLayoutManager(A0T);
                            View A0F2 = C36361kB.A0F(view2, R.id.gallery_done_btn);
                            this.A01 = A0F2;
                            AnonymousClass3Y2.A00(A0F2, this, 11);
                            return;
                        }
                        throw C36321k7.A08();
                    }
                    throw C36331k8.A0d("waContext");
                }
                throw C36321k7.A09();
            }
            throw C36331k8.A0d("waContext");
        }
        throw C36331k8.A0d("time");
    }

    public void BcA(int i) {
        boolean z = true;
        if (i == 0) {
            z = false;
        } else if (i != 1) {
            z = this.A0I;
        }
        this.A0I = z;
    }

    public void BcB(int i, float f, int i2) {
    }

    public void BsA(C132366Tg r2, Collection collection, Collection collection2) {
        AnonymousClass00C.A0D(collection, 0);
        C36321k7.A0x(collection2, r2);
        C39401sD A062 = A06(this);
        if (A062 != null) {
            A062.BsA(r2, collection, collection2);
        }
    }

    public static final C39401sD A06(GalleryTabHostFragment galleryTabHostFragment) {
        AnonymousClass07S r1;
        ViewPager viewPager = galleryTabHostFragment.A05;
        if (viewPager != null) {
            r1 = viewPager.getAdapter();
        } else {
            r1 = null;
        }
        if (r1 instanceof C39401sD) {
            return (C39401sD) r1;
        }
        return null;
    }

    public void A1Z(List list) {
        Uri uri;
        Bundle bundle;
        C64293Nk A052;
        View view;
        String str;
        C157297cj r0;
        AnonymousClass6YT r6;
        ArrayList A0I2;
        boolean z;
        GalleryRecentsFragment galleryRecentsFragment;
        View view2;
        AnonymousClass11F A022 = AnonymousClass11F.A00.A02(A07());
        if (C36421kH.A1S(A0h(), this, "is_send_as_document") && C36401kF.A1a(list) && A022 != null) {
            ArrayList A0J2 = C36321k7.A0J(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C36381kD.A1P(A0J2, it);
            }
            A08(A0i(), A022, C36441kJ.A15(A0J2));
        } else if (A0C()) {
            AnonymousClass01I A0h = A0h();
            if (!(A0h instanceof C157297cj) || (r0 = (C157297cj) A0h) == null || (r6 = ((CameraActivity) r0).A02) == null || r6.A0A == null) {
                if (A0h == null || (view = (A052 = A05(list)).A01) == null || (str = A052.A03) == null) {
                    bundle = null;
                } else {
                    bundle = new C03540Gb(AnonymousClass0PK.A00(A0h, view, str)).A00.toBundle();
                }
                ArrayList A0J3 = C36321k7.A0J(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C36381kD.A1P(A0J3, it2);
                }
                A0t(A03(C36441kJ.A15(A0J3)), 101, bundle);
            } else if (!list.isEmpty()) {
                C64293Nk A053 = A05(list);
                ArrayList A0J4 = C36321k7.A0J(list);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C36381kD.A1P(A0J4, it3);
                }
                String str2 = A053.A03;
                if (str2 == null || (view2 = A053.A01) == null) {
                    A0I2 = AnonymousClass001.A0I();
                } else {
                    A0I2 = AnonymousClass03T.A03(C36441kJ.A0W(view2, str2));
                }
                Bitmap bitmap = A053.A00;
                AnonymousClass4V2 r9 = A053.A02;
                C39401sD A062 = A06(this);
                if (A062 == null || (galleryRecentsFragment = (GalleryRecentsFragment) A062.A0J.getValue()) == null) {
                    z = false;
                } else {
                    z = galleryRecentsFragment.A07;
                }
                r6.A0R(bitmap, this, r9, A0J4, A0I2, 4, z);
            }
        } else {
            ArrayList A0J5 = C36321k7.A0J(list);
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                C36381kD.A1P(A0J5, it4);
            }
            ArrayList A15 = C36441kJ.A15(A0J5);
            AnonymousClass01I A0i = A0i();
            Intent A0D2 = C36431kI.A0D();
            Intent intent = A0i.getIntent();
            Uri uri2 = null;
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            A0D2.putExtra("bucket_uri", uri);
            A0D2.putParcelableArrayListExtra("android.intent.extra.STREAM", A15);
            if (A15.size() == 1) {
                uri2 = (Uri) C36441kJ.A12(A15);
            }
            A0D2.setData(uri2);
            C36331k8.A0o(A0i, A0D2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0.getCurrentItem() != 1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r1 != 1) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcC(int r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 == r7) goto L_0x0036
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x0036
            X.66x r5 = r6.A0F
            if (r5 == 0) goto L_0x0055
            boolean r0 = r6.A0I
            r4 = 1
            r3 = 1
            if (r0 == 0) goto L_0x0013
            r3 = 6
        L_0x0013:
            androidx.viewpager.widget.ViewPager r0 = r6.A05
            if (r0 == 0) goto L_0x001f
            int r0 = r0.getCurrentItem()
            r2 = 16
            if (r0 == r4) goto L_0x0021
        L_0x001f:
            r2 = 15
        L_0x0021:
            androidx.viewpager.widget.ViewPager r0 = r6.A05
            if (r0 == 0) goto L_0x002d
            int r1 = r0.getCurrentItem()
            r0 = 62
            if (r1 == r4) goto L_0x002f
        L_0x002d:
            r0 = 63
        L_0x002f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A02(r0, r3, r2)
        L_0x0036:
            r0 = 0
            r6.A0K = r0
            r6.A00 = r7
            A09(r6)
            androidx.appcompat.widget.Toolbar r2 = r6.A03
            if (r2 == 0) goto L_0x004f
            android.os.Bundle r1 = r6.A0A
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = "gallery_picker_title"
            java.lang.String r0 = r1.getString(r0)
        L_0x004c:
            r2.setTitle((java.lang.CharSequence) r0)
        L_0x004f:
            A0A(r6, r7)
            return
        L_0x0053:
            r0 = 0
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.BcC(int):void");
    }

    private final int A00() {
        Intent A032 = C36331k8.A03(this);
        boolean z = true;
        if (A032 == null || !A032.hasExtra("max_items")) {
            z = false;
        }
        C20810yC r0 = this.A0C;
        if (z) {
            if (r0 != null) {
                return A032.getIntExtra("max_items", r0.A07(2614));
            }
            throw C36321k7.A07();
        } else if (r0 != null) {
            return r0.A07(2614);
        } else {
            throw C36321k7.A07();
        }
    }

    private final Intent A03(ArrayList arrayList) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        Intent A032 = C36331k8.A03(this);
        if (A032 == null || !A032.hasExtra("origin")) {
            i = 1;
        } else {
            i = A032.getIntExtra("origin", 1);
        }
        AnonymousClass3FR r3 = new AnonymousClass3FR(A0i());
        if (this.A09 != null) {
            r3.A05 = SystemClock.elapsedRealtime() - this.A0J;
            Intent A033 = C36331k8.A03(this);
            boolean z4 = true;
            boolean z5 = false;
            if (A033 != null && A033.hasExtra("number_from_url")) {
                z5 = A033.getBooleanExtra("number_from_url", false);
            }
            r3.A0K = z5;
            r3.A0D = A07();
            r3.A01 = A00() - ((C40801w8) this.A0O.getValue()).A02.size();
            Intent A034 = C36331k8.A03(this);
            boolean z6 = false;
            if (A034 != null && A034.hasExtra("skip_max_items_new_limit")) {
                z6 = A034.getBooleanExtra("skip_max_items_new_limit", false);
            }
            r3.A0Q = z6;
            r3.A02 = i;
            Intent A035 = C36331k8.A03(this);
            if (A035 == null || !A035.hasExtra("picker_open_time")) {
                z4 = false;
            }
            long j = 0;
            if (z4) {
                j = A035.getLongExtra("picker_open_time", 0);
            }
            r3.A06 = j;
            AnonymousClass01I A0h = A0h();
            Intent intent = null;
            if (A0h != null) {
                intent = A0h.getIntent();
            }
            r3.A0E = C36401kF.A0p(intent, "quoted_group_jid");
            Intent A036 = C36331k8.A03(this);
            boolean z7 = true;
            if (A036 == null || !A036.hasExtra("quoted_message_row_id")) {
                z7 = false;
            }
            long j2 = 0;
            if (z7) {
                j2 = A036.getLongExtra("quoted_message_row_id", 0);
            }
            r3.A07 = j2;
            r3.A0M = C36381kD.A1U(i, 20);
            Intent A037 = C36331k8.A03(this);
            if (A037 == null || !A037.hasExtra("should_send_media")) {
                z = true;
            } else {
                z = A037.getBooleanExtra("should_send_media", true);
            }
            r3.A0P = z;
            Intent A038 = C36331k8.A03(this);
            if (A038 == null || !A038.hasExtra("should_hide_caption_view")) {
                z2 = false;
            } else {
                z2 = A038.getBooleanExtra("should_hide_caption_view", false);
            }
            r3.A0O = z2;
            Intent A039 = C36331k8.A03(this);
            if (A039 == null || !A039.hasExtra("send")) {
                z3 = true;
            } else {
                z3 = A039.getBooleanExtra("send", true);
            }
            r3.A0N = z3;
            r3.A0H = arrayList;
            AnonymousClass01I A0h2 = A0h();
            Intent intent2 = null;
            if (A0h2 != null) {
                intent2 = A0h2.getIntent();
            }
            r3.A0C = C36401kF.A0p(intent2, "android.intent.extra.TEXT");
            AnonymousClass3FR.A00(this.A0M, r3);
            return r3.A01();
        }
        throw C36331k8.A0d("time");
    }

    private final C64293Nk A05(List list) {
        RecyclerView recyclerView;
        View view;
        int size = list.size();
        if (!AnonymousClass3U9.A00 || ((C40801w8) this.A0O.getValue()).A02.size() != 1 || (recyclerView = this.A04) == null || recyclerView.getChildCount() != 1 || size != 1 || this.A0F == null) {
            return new C64293Nk((Bitmap) null, (View) null, (AnonymousClass4V2) null, (String) null);
        }
        RecyclerView recyclerView2 = this.A04;
        if (recyclerView2 != null) {
            view = AnonymousClass0Q1.A00(recyclerView2);
        } else {
            view = null;
        }
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View A002 = AnonymousClass0Q1.A00((ViewGroup) view);
        AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.WaMediaThumbnailView");
        WaMediaThumbnailView waMediaThumbnailView = (WaMediaThumbnailView) A002;
        String A0y = C36381kD.A0y(((AnonymousClass4V2) list.get(0)).B7k());
        AnonymousClass00C.A0D(waMediaThumbnailView, 1);
        return new C64293Nk(waMediaThumbnailView.A00, waMediaThumbnailView, waMediaThumbnailView.A01, A0y);
    }

    private final String A07() {
        AnonymousClass01I A0h = A0h();
        Intent intent = null;
        if (A0h != null) {
            intent = A0h.getIntent();
        }
        return C36401kF.A0p(intent, "jid");
    }

    public static final void A09(GalleryTabHostFragment galleryTabHostFragment) {
        C39401sD A062 = A06(galleryTabHostFragment);
        if (A062 != null) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) A062.A0J.getValue();
            if (false != galleryRecentsFragment.A07) {
                galleryRecentsFragment.A09.clear();
            }
            galleryRecentsFragment.A07 = false;
            galleryRecentsFragment.A09.clear();
            GalleryRecentsFragment.A00(galleryRecentsFragment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (((X.C40801w8) r4.A0O.getValue()).A02.size() != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(com.whatsapp.gallery.GalleryTabHostFragment r4, int r5) {
        /*
            boolean r0 = A0D(r4)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0021
            if (r5 != 0) goto L_0x0021
            boolean r0 = r4.A1a()
            if (r0 == 0) goto L_0x0021
            X.00T r0 = r4.A0O
            java.lang.Object r0 = r0.getValue()
            X.1w8 r0 = (X.C40801w8) r0
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r1 = 1
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            androidx.appcompat.widget.Toolbar r0 = r4.A03
            if (r0 == 0) goto L_0x0035
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x0035
            android.view.MenuItem r0 = r0.getItem(r3)
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1)
        L_0x0035:
            androidx.appcompat.widget.Toolbar r0 = r4.A03
            if (r0 == 0) goto L_0x004e
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x004e
            android.view.MenuItem r1 = r0.getItem(r2)
            if (r1 == 0) goto L_0x004e
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x004f
            if (r5 != r2) goto L_0x004f
        L_0x004b:
            r1.setVisible(r2)
        L_0x004e:
            return
        L_0x004f:
            r2 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A0A(com.whatsapp.gallery.GalleryTabHostFragment, int):void");
    }

    public static final void A0B(GalleryTabHostFragment galleryTabHostFragment, boolean z) {
        C39401sD A062 = A06(galleryTabHostFragment);
        if (A062 != null) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) A062.A0J.getValue();
            if (!z && z != galleryRecentsFragment.A07) {
                galleryRecentsFragment.A09.clear();
            }
            galleryRecentsFragment.A07 = z;
        }
    }

    private final boolean A0C() {
        Intent intent;
        AnonymousClass01I A0h;
        Intent intent2;
        AnonymousClass01I A0h2 = A0h();
        if (A0h2 == null || (intent = A0h2.getIntent()) == null || !intent.hasExtra("preview") || ((A0h = A0h()) != null && (intent2 = A0h.getIntent()) != null && intent2.getBooleanExtra("preview", true))) {
            return true;
        }
        return false;
    }

    public static final boolean A0D(GalleryTabHostFragment galleryTabHostFragment) {
        if (!galleryTabHostFragment.A1a() || galleryTabHostFragment.A00() <= 1) {
            return false;
        }
        C74153l9 r0 = galleryTabHostFragment.A0E;
        if (r0 == null) {
            throw C36331k8.A0d("mediaTray");
        } else if (r0.A00.A0E(4261)) {
            return true;
        } else {
            return false;
        }
    }

    public void A1J() {
        List list;
        super.A1J();
        ((AnonymousClass3K8) this.A0N.getValue()).A00();
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            viewPager.setAdapter((AnonymousClass07S) null);
        }
        ViewPager viewPager2 = this.A05;
        if (!(viewPager2 == null || (list = viewPager2.A0E) == null)) {
            list.remove(this);
        }
        this.A05 = null;
        this.A02 = null;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass0CZ) null);
        }
        this.A04 = null;
        this.A03 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1N(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            X.01I r1 = r7.A0h()
            boolean r0 = r1 instanceof X.C157297cj
            if (r0 == 0) goto L_0x0019
            X.7cj r1 = (X.C157297cj) r1
            if (r1 == 0) goto L_0x0019
            com.whatsapp.camera.CameraActivity r1 = (com.whatsapp.camera.CameraActivity) r1
            X.6YT r1 = r1.A02
            if (r1 == 0) goto L_0x0019
            X.14u r0 = r1.A0A
            if (r0 == 0) goto L_0x0019
            r1.A0Q(r8, r9, r10)
        L_0x0019:
            r0 = 101(0x65, float:1.42E-43)
            r4 = -1
            if (r8 != r0) goto L_0x00e4
            if (r9 == r4) goto L_0x00a6
            if (r9 == 0) goto L_0x00a2
            r0 = 1
            if (r9 != r0) goto L_0x0152
            if (r10 == 0) goto L_0x0152
            X.6Tg r1 = r7.A0M
            android.os.Bundle r0 = r10.getExtras()
            r1.A05(r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r10.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x0057
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0040:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            goto L_0x0040
        L_0x0052:
            java.util.Set r6 = X.C007103b.A0f(r2)
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            X.1sD r0 = A06(r7)
            if (r0 == 0) goto L_0x0152
            if (r6 == 0) goto L_0x0152
            X.00T r0 = r0.A0J
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.gallery.GalleryRecentsFragment r5 = (com.whatsapp.gallery.GalleryRecentsFragment) r5
            int r1 = r6.size()
            java.util.Map r4 = r5.A09
            int r0 = r4.size()
            if (r1 == r0) goto L_0x0152
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r4)
        L_0x007c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0098
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r2)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = r0.toString()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x007c
            X.C36411kG.A1T(r3, r1)
            goto L_0x007c
        L_0x0098:
            r4.clear()
            r4.putAll(r3)
            com.whatsapp.gallery.GalleryRecentsFragment.A00(r5)
            return
        L_0x00a2:
            A09(r7)
            return
        L_0x00a6:
            X.01I r1 = r7.A0h()
            boolean r0 = r1 instanceof com.whatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x00b3
            if (r1 == 0) goto L_0x00b3
            r1.finish()
        L_0x00b3:
            android.content.Intent r5 = X.C36331k8.A03(r7)
            r3 = 1
            java.lang.String r2 = "should_set_gallery_result"
            r1 = 0
            if (r5 == 0) goto L_0x00d6
            boolean r0 = r5.hasExtra(r2)
            if (r0 != r3) goto L_0x00d6
            boolean r0 = r5.getBooleanExtra(r2, r1)
            if (r0 == 0) goto L_0x00d6
            X.01I r1 = r7.A0h()
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x00d6
            if (r1 == 0) goto L_0x00d6
            r1.setResult(r4, r10)
        L_0x00d6:
            X.01I r1 = r7.A0h()
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x0152
            if (r1 == 0) goto L_0x0152
            r1.finish()
            return
        L_0x00e4:
            r0 = 91
            if (r8 != r0) goto L_0x0132
            if (r9 != r4) goto L_0x0152
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x0148
            if (r10 == 0) goto L_0x0152
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r3 = r10.getParcelableArrayListExtra(r0)
            if (r3 != 0) goto L_0x0108
            android.net.Uri r1 = r10.getData()
            if (r1 == 0) goto L_0x0152
            r0 = 1
            java.util.ArrayList r3 = X.C36441kJ.A14(r0)
            r3.add(r1)
        L_0x0108:
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = r7.A07()
            X.11F r2 = r1.A02(r0)
            X.01I r1 = r7.A0h()
            java.lang.String r0 = "is_send_as_document"
            boolean r0 = X.C36421kH.A1S(r1, r7, r0)
            if (r0 == 0) goto L_0x0128
            if (r2 == 0) goto L_0x0128
            X.01I r0 = r7.A0i()
            r7.A08(r0, r2, r3)
            return
        L_0x0128:
            android.content.Intent r1 = r7.A03(r3)
            r0 = 90
            r7.startActivityForResult(r1, r0)
            return
        L_0x0132:
            r0 = 90
            if (r8 != r0) goto L_0x0152
            if (r9 == r4) goto L_0x0148
            r1 = 2
            if (r9 != r1) goto L_0x0152
            X.01I r0 = r7.A0h()
            if (r0 == 0) goto L_0x0144
            r0.setResult(r1)
        L_0x0144:
            X.C36341k9.A15(r7)
            return
        L_0x0148:
            X.01I r0 = r7.A0h()
            if (r0 == 0) goto L_0x0144
            r0.setResult(r4, r10)
            goto L_0x0144
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A1N(int, int, android.content.Intent):void");
    }

    public void A1V(boolean z) {
        super.A1V(z);
        if (this.A0P.A02.compareTo(AnonymousClass01P.RESUMED) >= 0) {
            ViewPager viewPager = this.A05;
            if (viewPager == null || viewPager.getCurrentItem() != 0) {
                this.A0K = true;
            }
            ViewPager viewPager2 = this.A05;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1.A0E(5643) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.A07()
            r4 = 0
            if (r0 == 0) goto L_0x0022
            X.13o r0 = com.whatsapp.jid.Jid.Companion
            java.lang.String r0 = r5.A07()
            com.whatsapp.jid.Jid r0 = X.C222513o.A00(r0)
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0022
            X.0yC r1 = r5.A0C
            if (r1 == 0) goto L_0x0046
            r0 = 5643(0x160b, float:7.908E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            return r4
        L_0x0022:
            int r1 = r5.A00()
            r0 = 1
            if (r1 <= r0) goto L_0x0021
            boolean r0 = r5.A0C()
            if (r0 != 0) goto L_0x0044
            android.content.Intent r3 = X.C36331k8.A03(r5)
            java.lang.String r2 = "is_in_multi_select_mode_only"
            if (r3 == 0) goto L_0x0021
            boolean r0 = r3.hasExtra(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0021
            boolean r0 = r3.getBooleanExtra(r2, r4)
            if (r0 != r1) goto L_0x0021
        L_0x0044:
            r4 = 1
            return r4
        L_0x0046:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.GalleryTabHostFragment.A1a():boolean");
    }

    public void BHA(C132366Tg r2, Collection collection) {
        C36321k7.A0w(collection, r2);
        C39401sD A062 = A06(this);
        if (A062 != null) {
            A062.BHA(r2, collection);
        }
    }

    public void Bn7() {
        C39401sD A062 = A06(this);
        if (A062 != null) {
            A062.Bn7();
        }
    }
}
