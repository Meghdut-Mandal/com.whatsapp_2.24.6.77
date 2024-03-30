package com.whatsapp.avatar.home;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass060;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass1RC;
import X.AnonymousClass3UF;
import X.AnonymousClass484;
import X.AnonymousClass4IO;
import X.AnonymousClass4IP;
import X.AnonymousClass6WF;
import X.AnonymousClass75B;
import X.C000800j;
import X.C001400p;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C55492ui;
import X.C66923Xv;
import X.C89194Vp;
import X.C89314Wb;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.whatsapp.components.MainChildCoordinatorLayout;
import com.whatsapp.wds.components.button.WDSButton;

public final class AvatarHomeActivity extends AnonymousClass155 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public AnonymousClass060 A08;
    public CircularProgressBar A09;
    public C32691e2 A0A;
    public WaImageView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public LockableBottomSheetBehavior A0F;
    public MainChildCoordinatorLayout A0G;
    public AnonymousClass6WF A0H;
    public WaTextView A0I;
    public WDSButton A0J;
    public boolean A0K;
    public final AnonymousClass00T A0L;

    public static final void A01(AvatarHomeActivity avatarHomeActivity) {
        WaTextView waTextView = avatarHomeActivity.A0C;
        if (waTextView == null) {
            throw C36331k8.A0d("browseStickersTextView");
        }
        C66923Xv.A01(waTextView, avatarHomeActivity, 46);
        WaTextView waTextView2 = avatarHomeActivity.A0C;
        if (waTextView2 == null) {
            throw C36331k8.A0d("browseStickersTextView");
        }
        waTextView2.setClickable(true);
        WaTextView waTextView3 = avatarHomeActivity.A0D;
        if (waTextView3 == null) {
            throw C36331k8.A0d("createProfilePhotoTextView");
        }
        C66923Xv.A01(waTextView3, avatarHomeActivity, 45);
        WaTextView waTextView4 = avatarHomeActivity.A0D;
        if (waTextView4 == null) {
            throw C36331k8.A0d("createProfilePhotoTextView");
        }
        waTextView4.setClickable(true);
        WaTextView waTextView5 = avatarHomeActivity.A0E;
        if (waTextView5 == null) {
            throw C36331k8.A0d("deleteAvatarTextView");
        }
        C66923Xv.A01(waTextView5, avatarHomeActivity, 49);
        WaTextView waTextView6 = avatarHomeActivity.A0E;
        if (waTextView6 == null) {
            throw C36331k8.A0d("deleteAvatarTextView");
        }
        waTextView6.setClickable(true);
        LinearLayout linearLayout = avatarHomeActivity.A07;
        if (linearLayout == null) {
            throw C36331k8.A0d("containerPrivacy");
        }
        C66923Xv.A01(linearLayout, avatarHomeActivity, 44);
        LinearLayout linearLayout2 = avatarHomeActivity.A07;
        if (linearLayout2 == null) {
            throw C36331k8.A0d("containerPrivacy");
        }
        linearLayout2.setClickable(true);
    }

    public static final void A0F(AvatarHomeActivity avatarHomeActivity, boolean z) {
        MainChildCoordinatorLayout mainChildCoordinatorLayout = avatarHomeActivity.A0G;
        if (mainChildCoordinatorLayout == null) {
            throw C36331k8.A0d("coordinatorLayout");
        }
        mainChildCoordinatorLayout.post(new AnonymousClass75B(8, (Object) avatarHomeActivity, z));
    }

    private final boolean A0G() {
        Integer num;
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.A0F;
        if (lockableBottomSheetBehavior != null) {
            num = Integer.valueOf(lockableBottomSheetBehavior.A0J);
        } else {
            num = null;
        }
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        if (intValue != 5 && intValue != 3) {
            return false;
        }
        if (lockableBottomSheetBehavior != null) {
            lockableBottomSheetBehavior.A0W(4);
        }
        return true;
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A0A = C36371kC.A0R(r2);
            this.A0H = (AnonymousClass6WF) A0L2.A04.get();
        }
    }

    public void onCreate(Bundle bundle) {
        A28(9);
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A0G = (MainChildCoordinatorLayout) C36361kB.A0D(this, R.id.coordinator);
        this.A05 = (LinearLayout) C36361kB.A0D(this, R.id.avatar_home_sheet);
        this.A06 = (LinearLayout) C36361kB.A0D(this, R.id.avatar_new_user_container);
        this.A04 = (FrameLayout) C36361kB.A0D(this, R.id.avatar_set_container);
        this.A07 = (LinearLayout) C36361kB.A0D(this, R.id.avatar_privacy);
        this.A03 = C36361kB.A0D(this, R.id.avatar_bottom_sheet_padding);
        this.A01 = C36361kB.A0D(this, R.id.avatar_placeholder);
        if (C36341k9.A04(this) != 2) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout == null) {
                throw C36331k8.A0d("containerAvatarSheet");
            }
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(linearLayout);
            AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.bottomsheet.LockableBottomSheetBehavior<android.widget.LinearLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) A022;
            this.A0F = lockableBottomSheetBehavior;
            if (lockableBottomSheetBehavior != null) {
                C89194Vp.A00(lockableBottomSheetBehavior, this, 1);
            }
        }
        WaImageView waImageView = (WaImageView) C36361kB.A0D(this, R.id.avatar_set_image);
        C66923Xv.A01(waImageView, this, 43);
        this.A0B = waImageView;
        this.A09 = (CircularProgressBar) C36361kB.A0D(this, R.id.avatar_set_progress);
        this.A0C = (WaTextView) C36361kB.A0D(this, R.id.avatar_browse_stickers);
        this.A0D = (WaTextView) C36361kB.A0D(this, R.id.avatar_create_profile_photo);
        this.A0E = (WaTextView) C36361kB.A0D(this, R.id.avatar_delete);
        this.A02 = C36361kB.A0D(this, R.id.avatar_privacy_divider);
        WDSButton wDSButton = (WDSButton) C36361kB.A0D(this, R.id.avatar_create_avatar_button);
        C66923Xv.A01(wDSButton, this, 47);
        this.A0J = wDSButton;
        AnonymousClass060 r3 = (AnonymousClass060) C36361kB.A0D(this, R.id.avatar_home_fab);
        C66923Xv.A01(r3, this, 48);
        C36361kB.A13(AnonymousClass3UF.A02(this, R.drawable.ic_action_edit, C36381kD.A02(this)), r3, this.A00);
        this.A08 = r3;
        this.A00 = C36361kB.A0D(this, R.id.avatar_home_preview_error);
        WaTextView waTextView = (WaTextView) C36361kB.A0D(this, R.id.avatar_try_again);
        C66923Xv.A01(waTextView, this, 42);
        this.A0I = waTextView;
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        AnonymousClass00T r32 = this.A0L;
        C55492ui.A01(this, ((AvatarHomeViewModel) r32.getValue()).A00, new AnonymousClass4IP(this), 4);
        C55492ui.A01(this, ((AvatarHomeViewModel) r32.getValue()).A05, new AnonymousClass4IO(this), 5);
        View view = this.A01;
        if (view == null) {
            throw C36331k8.A0d("newUserAvatarImage");
        }
        C36331k8.A0q(this, view, R.string.f12nameremoved);
        WaImageView waImageView2 = this.A0B;
        if (waImageView2 == null) {
            throw C36331k8.A0d("avatarSetImageView");
        }
        C36331k8.A0q(this, waImageView2, R.string.f12nameremoved);
    }

    public AvatarHomeActivity(int i) {
        this.A0K = false;
        C89314Wb.A00(this, 18);
    }

    public static final void A07(AvatarHomeActivity avatarHomeActivity) {
        AnonymousClass07B supportActionBar = avatarHomeActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0D();
        }
        boolean z = !AnonymousClass1RC.A0A(avatarHomeActivity);
        MainChildCoordinatorLayout mainChildCoordinatorLayout = avatarHomeActivity.A0G;
        if (mainChildCoordinatorLayout == null) {
            throw C36331k8.A0d("coordinatorLayout");
        }
        mainChildCoordinatorLayout.postDelayed(new AnonymousClass75B(7, (Object) avatarHomeActivity, z), 250);
    }

    public boolean A2D() {
        if (!A0G()) {
            return super.A2D();
        }
        return false;
    }

    public void onBackPressed() {
        if (!A0G()) {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (A0G()) {
            return true;
        }
        finish();
        return true;
    }

    public AvatarHomeActivity() {
        this(0);
        this.A0L = C001400p.A00(C000800j.NONE, new AnonymousClass484(this));
    }
}
