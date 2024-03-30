package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1RC;
import X.AnonymousClass3UF;
import X.AnonymousClass6WF;
import X.AnonymousClass74O;
import X.C000800j;
import X.C001400p;
import X.C001700s;
import X.C02800By;
import X.C03570Gk;
import X.C101394xU;
import X.C101404xV;
import X.C101414xW;
import X.C101424xX;
import X.C132306Ta;
import X.C152057Ja;
import X.C152067Jb;
import X.C152077Jc;
import X.C152087Jd;
import X.C154357Rw;
import X.C154367Rx;
import X.C154377Ry;
import X.C154387Rz;
import X.C163027pX;
import X.C164797sO;
import X.C165147sx;
import X.C18800tq;
import X.C18830tt;
import X.C19550w8;
import X.C224514j;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36421kH;
import X.C90464aC;
import X.C90514aH;
import X.C95784mH;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;

public final class AvatarProfilePhotoActivity extends AnonymousClass155 {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public Toolbar A05;
    public ShimmerFrameLayout A06;
    public AvatarProfilePhotoImageView A07;
    public AnonymousClass190 A08;
    public AnonymousClass6WF A09;
    public WDSButton A0A;
    public boolean A0B;
    public final C95784mH A0C;
    public final C95784mH A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A08 = C36351kA.A0h(r2);
            this.A09 = (AnonymousClass6WF) A0L.A04.get();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            getMenuInflater().inflate(R.menu.f11nameremoved, menu);
            MenuItem findItem = menu.findItem(R.id.menu_avatar_profile_photo_save);
            this.A00 = findItem;
            if (findItem != null) {
                findItem.setIcon((Drawable) this.A0E.getValue());
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        boolean z;
        MenuItem menuItem2 = menuItem;
        int A062 = C36341k9.A06(menuItem2);
        if (A062 == R.id.menu_avatar_profile_photo_save) {
            AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A0G.getValue();
            Log.i("AvatarProfilePhotoViewModel/onSavePhotoClicked()");
            C001700s r2 = avatarProfilePhotoViewModel.A00;
            C132306Ta r6 = (C132306Ta) r2.A04();
            if (r6 == null) {
                str = "AvatarProfilePhotoViewModel/onSavePhotoClicked(null view state)";
            } else {
                C101394xU r13 = r6.A01;
                C101424xX r11 = r6.A00;
                if (r13 == null || r11 == null) {
                    str = "AvatarProfilePhotoViewModel/onSavePhotoClicked(null value)";
                } else {
                    Iterator it = r6.A03.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        C101414xW r4 = (C101414xW) it.next();
                        if (r4 instanceof C101404xV) {
                            z = ((C101404xV) r4).A01;
                        } else {
                            z = ((C101394xU) r4).A03;
                        }
                        if (z) {
                            break;
                        }
                        i2++;
                    }
                    Iterator it2 = r6.A02.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C101424xX) it2.next()).A03) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    C132306Ta A0a = C90514aH.A0a(r2);
                    List list = A0a.A03;
                    List list2 = A0a.A02;
                    C101424xX r42 = A0a.A00;
                    C101394xU r5 = A0a.A01;
                    boolean z2 = A0a.A05;
                    boolean z3 = A0a.A04;
                    C36321k7.A0v(list, 1, list2);
                    r2.A0D(new C132306Ta(r42, r5, list, list2, true, z2, z3));
                    avatarProfilePhotoViewModel.A09.Bp1(new AnonymousClass74O(r11, avatarProfilePhotoViewModel, r13, i2, i, 1));
                }
            }
            Log.i(str);
        } else if (A062 == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem2);
    }

    public AvatarProfilePhotoActivity(int i) {
        this.A0B = false;
        C163027pX.A00(this, 11);
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        Toolbar toolbar = (Toolbar) C03570Gk.A0B(this, R.id.toolbar);
        setSupportActionBar(toolbar);
        AnonymousClass3UF.A0D(this, toolbar, this.A00, R.color.f6nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        this.A05 = toolbar;
        if (C19550w8.A01()) {
            AnonymousClass1RC.A04(this, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
            AnonymousClass1RC.A09(getWindow(), !AnonymousClass1RC.A0A(this));
        }
        WDSButton wDSButton = (WDSButton) C03570Gk.A0B(this, R.id.avatar_profile_photo_options);
        C36421kH.A10(wDSButton, this, 0);
        this.A0A = wDSButton;
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        C95784mH r2 = this.A0D;
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.avatar_pose_recycler);
        recyclerView.setAdapter(r2);
        recyclerView.setItemAnimator((C02800By) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1());
        C95784mH r22 = this.A0C;
        RecyclerView recyclerView2 = (RecyclerView) C03570Gk.A0B(this, R.id.avatar_color_recycler);
        recyclerView2.setAdapter(r22);
        recyclerView2.setItemAnimator((C02800By) null);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1());
        this.A07 = (AvatarProfilePhotoImageView) C03570Gk.A0B(this, R.id.avatar_pose);
        this.A02 = C03570Gk.A0B(this, R.id.pose_layout);
        this.A04 = (ProgressBar) C03570Gk.A0B(this, R.id.profile_image_progress);
        this.A06 = (ShimmerFrameLayout) C03570Gk.A0B(this, R.id.pose_shimmer);
        this.A03 = C03570Gk.A0B(this, R.id.poses_title);
        this.A01 = C03570Gk.A0B(this, R.id.background_color_title);
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A07;
        if (avatarProfilePhotoImageView != null) {
            C36331k8.A0q(this, avatarProfilePhotoImageView, R.string.f12nameremoved);
        }
        View view2 = this.A03;
        if (view2 != null) {
            C36331k8.A0q(this, view2, R.string.f12nameremoved);
        }
        View view3 = this.A01;
        if (view3 != null) {
            C36331k8.A0q(this, view3, R.string.f12nameremoved);
        }
        WDSButton wDSButton2 = this.A0A;
        if (wDSButton2 != null) {
            C36331k8.A0q(this, wDSButton2, R.string.f12nameremoved);
        }
        Toolbar toolbar2 = this.A05;
        if (toolbar2 != null) {
            toolbar2.setNavigationContentDescription((CharSequence) getString(R.string.f12nameremoved));
        }
        AnonymousClass00T r3 = this.A0G;
        C165147sx.A02(this, ((AvatarProfilePhotoViewModel) r3.getValue()).A00, new C154377Ry(this), 3);
        C165147sx.A02(this, ((AvatarProfilePhotoViewModel) r3.getValue()).A08, new C154367Rx(this), 2);
        if (C36341k9.A04(this) == 2 && (view = this.A02) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C164797sO(view, new C152077Jc(this), 1));
        }
    }

    public AvatarProfilePhotoActivity() {
        this(0);
        C000800j r2 = C000800j.NONE;
        this.A0G = C001400p.A00(r2, new C152087Jd(this));
        this.A0D = new C95784mH(new C154387Rz(this));
        this.A0C = new C95784mH(new C154357Rw(this));
        this.A0E = C001400p.A00(r2, new C152057Ja(this));
        this.A0F = C001400p.A00(r2, new C152067Jb(this));
    }
}
