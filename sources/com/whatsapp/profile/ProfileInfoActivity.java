package com.whatsapp.profile;

import X.AnonymousClass065;
import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass142;
import X.AnonymousClass155;
import X.AnonymousClass16I;
import X.AnonymousClass190;
import X.AnonymousClass1P3;
import X.AnonymousClass1Pp;
import X.AnonymousClass1WR;
import X.AnonymousClass3ED;
import X.AnonymousClass3U8;
import X.AnonymousClass3U9;
import X.AnonymousClass3Y5;
import X.AnonymousClass4U0;
import X.AnonymousClass4VF;
import X.AnonymousClass4W3;
import X.AnonymousClass4YQ;
import X.AnonymousClass6X5;
import X.C001700s;
import X.C18800tq;
import X.C18830tt;
import X.C18950u5;
import X.C19430v1;
import X.C19460v5;
import X.C19470v6;
import X.C19980wp;
import X.C202899mr;
import X.C21010yW;
import X.C21710zg;
import X.C226815j;
import X.C23871Ae;
import X.C27111My;
import X.C27341Nv;
import X.C27761Ps;
import X.C32951eT;
import X.C33021ea;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C38361oQ;
import X.C48762i0;
import X.C64873Pt;
import X.C65993Ug;
import X.C81133wW;
import X.C89284Vy;
import X.C89354Wf;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class ProfileInfoActivity extends AnonymousClass155 implements AnonymousClass4U0 {
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public C19460v5 A05;
    public C19460v5 A06;
    public AnonymousClass1WR A07;
    public C27341Nv A08;
    public C38361oQ A09;
    public C32951eT A0A;
    public C33021ea A0B;
    public AnonymousClass1Pp A0C;
    public AnonymousClass16I A0D;
    public C27761Ps A0E;
    public C19980wp A0F;
    public AnonymousClass141 A0G;
    public C21010yW A0H;
    public WhatsAppLibLoader A0I;
    public C23871Ae A0J;
    public AnonymousClass1P3 A0K;
    public ProfileSettingsRowIconText A0L;
    public ProfileSettingsRowIconText A0M;
    public SettingsRowPhotoOrInitialText A0N;
    public AnonymousClass3ED A0O;
    public C64873Pt A0P;
    public boolean A0Q;
    public Handler A0R;
    public View A0S;
    public ProfileSettingsRowIconText A0T;
    public Runnable A0U;
    public boolean A0V;
    public final C226815j A0W;

    public static void A07(ProfileInfoActivity profileInfoActivity) {
        ProfileInfoActivity profileInfoActivity2 = profileInfoActivity;
        profileInfoActivity.A02.setVisibility(8);
        int dimensionPixelSize = profileInfoActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        boolean A022 = C202899mr.A02(C36411kG.A0j(profileInfoActivity));
        ImageView imageView = profileInfoActivity2.A04;
        if (A022) {
            imageView.setEnabled(false);
            profileInfoActivity2.A02.setVisibility(0);
        } else {
            imageView.setEnabled(true);
            profileInfoActivity2.A02.setVisibility(4);
        }
        Bitmap A072 = profileInfoActivity2.A0E.A07(profileInfoActivity2, profileInfoActivity2.A0G, -1.0f, dimensionPixelSize, false);
        if (A072 == null) {
            AnonymousClass141 r1 = profileInfoActivity2.A0G;
            if (r1.A06 == 0 && r1.A05 == 0) {
                profileInfoActivity2.A02.setVisibility(0);
                Handler handler = profileInfoActivity2.A0R;
                if (handler == null) {
                    handler = C36341k9.A0H();
                    profileInfoActivity2.A0R = handler;
                    profileInfoActivity2.A0U = new C81133wW((Object) profileInfoActivity2, 6);
                }
                handler.removeCallbacks(profileInfoActivity2.A0U);
                profileInfoActivity2.A0R.postDelayed(profileInfoActivity2.A0U, AnonymousClass6X5.A0L);
            } else {
                profileInfoActivity2.A02.setVisibility(4);
            }
            A072 = AnonymousClass1Pp.A01(profileInfoActivity2.A04.getContext(), profileInfoActivity2.A0C, -1.0f, R.drawable.avatar_contact, dimensionPixelSize);
            profileInfoActivity2.A0Q = false;
        } else {
            profileInfoActivity2.A0Q = true;
        }
        profileInfoActivity2.A04.setImageBitmap(A072);
    }

    public int A2I() {
        return 78318969;
    }

    public /* synthetic */ void BT1(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r5.A08.A00("profile") == 0) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r1 = -1
            switch(r6) {
                case 12: goto L_0x0008;
                case 13: goto L_0x007c;
                case 14: goto L_0x00a2;
                case 15: goto L_0x00ae;
                default: goto L_0x0004;
            }
        L_0x0004:
            super.onActivityResult(r6, r7, r8)
        L_0x0007:
            return
        L_0x0008:
            if (r7 != r1) goto L_0x002b
            r1 = 0
            if (r8 == 0) goto L_0x0074
            java.lang.String r0 = "is_reset"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0059
            android.view.View r0 = r5.A02
            r0.setVisibility(r1)
            X.1P3 r1 = r5.A0K
            X.141 r0 = r5.A0G
            r1.A0D(r0)
            r5.A01()
        L_0x0024:
            X.3Pt r2 = r5.A0P
            r1 = 1
            r0 = 2
            X.C64873Pt.A00(r2, r1, r0)
        L_0x002b:
            android.view.View r0 = r5.A01
            float r0 = r0.getScaleX()
            double r1 = (double) r0
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0007
            android.view.View r0 = r5.A01
            float r0 = r0.getScaleY()
            double r1 = (double) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0007
            android.view.View r0 = r5.A01
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleY(r1)
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            return
        L_0x0059:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0074
            X.1P3 r0 = r5.A0K
            X.C36411kG.A1J(r0)
            X.1P3 r1 = r5.A0K
            X.141 r0 = r5.A0G
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x002b
            A07(r5)
            goto L_0x0024
        L_0x0074:
            X.1P3 r1 = r5.A0K
            r0 = 13
            r1.A05(r8, r5, r0)
            goto L_0x002b
        L_0x007c:
            X.1P3 r0 = r5.A0K
            X.C36411kG.A1J(r0)
            if (r7 != r1) goto L_0x0098
            X.1P3 r1 = r5.A0K
            X.141 r0 = r5.A0G
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x0007
            A07(r5)
            X.3Pt r2 = r5.A0P
            r1 = 1
            r0 = 2
            X.C64873Pt.A00(r2, r1, r0)
            return
        L_0x0098:
            if (r7 != 0) goto L_0x0007
            if (r8 == 0) goto L_0x0007
            X.1P3 r0 = r5.A0K
            r0.A04(r8, r5)
            return
        L_0x00a2:
            if (r7 != r1) goto L_0x0007
            com.whatsapp.profile.ProfileSettingsRowIconText r1 = r5.A0T
            java.lang.String r0 = X.C36391kE.A0w(r5)
            r1.setSubText(r0)
            return
        L_0x00ae:
            X.0yC r1 = r5.A0D
            r0 = 6149(0x1805, float:8.617E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00c3
            X.1Nv r1 = r5.A08
            java.lang.String r0 = "profile"
            int r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            android.view.View r1 = r5.A00
            int r0 = X.C36381kD.A09(r0)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ProfileInfoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        C81133wW r1 = new C81133wW((Object) this, 5);
        if (AnonymousClass3U9.A00) {
            A0F(r1);
        } else {
            r1.run();
        }
    }

    private void A01() {
        if (this.A0B.A01()) {
            if (this.A03 == null) {
                this.A03 = (FrameLayout) ((ViewStub) findViewById(R.id.banner_stub)).inflate();
            }
            C32951eT r2 = this.A0A;
            r2.A00 = null;
            r2.A00(new AnonymousClass4YQ(this, 1));
        }
    }

    private void A0F(Runnable runnable) {
        if (this.A01 == null || (!C36421kH.A1V(this) && C36411kG.A1W(this.A0D))) {
            runnable.run();
        } else {
            this.A01.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125).setListener(new AnonymousClass4VF(this, runnable));
        }
    }

    public void A2F() {
        if (!this.A0V) {
            this.A0V = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r4 = r1.A00;
            C36321k7.A0X(r1, r4, this, C36321k7.A05(r1, r4, this));
            this.A07 = (AnonymousClass1WR) r1.A03.get();
            C19470v6 r3 = C19470v6.A00;
            this.A06 = r3;
            this.A0H = C36351kA.A0g(r1);
            this.A0J = (C23871Ae) r1.A0V.get();
            this.A0C = C36361kB.A0V(r1);
            this.A0O = (AnonymousClass3ED) r4.ABY.get();
            this.A05 = r3;
            this.A0D = C36351kA.A0S(r1);
            this.A0I = (WhatsAppLibLoader) r1.A9W.get();
            this.A0K = C36391kE.A0k(r1);
            this.A0E = C36361kB.A0W(r1);
            this.A0P = (C64873Pt) r4.A9Y.get();
            this.A0A = C27111My.A09(A0L2);
            this.A0B = C27111My.A0D(A0L2);
            this.A0F = (C19980wp) r1.A1x.get();
            this.A08 = C36411kG.A0X(r1);
        }
    }

    public void BWL(int i, String str) {
        if (i == 0 && str.length() != 0) {
            C36421kH.A1H(this.A04, this, str, 16);
            this.A0T.setSubText(str);
            C64873Pt.A00(this.A0P, 2, 2);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean A0E2;
        if (AnonymousClass3U9.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(200);
            changeBounds.setInterpolator(new AnonymousClass065());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.setDuration(220);
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.setDuration(240);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
        }
        super.onCreate(bundle);
        if (!this.A0I.A04()) {
            Log.i("aborting due to native libraries missing");
        } else {
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass07B supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0U(true);
            }
            AnonymousClass142 A0V2 = C36431kI.A0V(this);
            this.A0G = A0V2;
            if (A0V2 == null) {
                Log.i("profileinfo/create/no-me");
                startActivity(AnonymousClass190.A09(this));
            } else {
                this.A0T = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_name_card);
                this.A0L = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_username_card);
                this.A0S = findViewById(R.id.profile_info_username_card_divider);
                this.A0T.setSubText(C36391kE.A0w(this));
                if (C36421kH.A1V(this)) {
                    A0E2 = C36371kC.A1U(C19980wp.A00(this.A0F), "username_creation_supported_on_primary");
                } else {
                    A0E2 = this.A0D.A0E(4745);
                }
                if (A0E2) {
                    this.A0L.setVisibility(0);
                    this.A0L.setText(getString(R.string.f12nameremoved));
                    this.A0L.setDescription(getString(R.string.f12nameremoved));
                    this.A0L.setPrimaryIcon(R.drawable.vec_ic_at_symbol);
                    this.A0S.setVisibility(0);
                    UsernameViewModel usernameViewModel = (UsernameViewModel) C36441kJ.A0b(this).A00(UsernameViewModel.class);
                    C001700s r2 = usernameViewModel.A03;
                    if (r2.A04() == null) {
                        C36401kF.A1I(usernameViewModel, (Integer) null);
                        usernameViewModel.A05.A00(usernameViewModel);
                    }
                    r2.A08(this, new C65993Ug(this, 49));
                }
                AnonymousClass3Y5.A00(this.A0T, this, 31);
                ImageView A0Q2 = C36411kG.A0Q(this, R.id.photo_btn);
                this.A04 = A0Q2;
                AnonymousClass3Y5.A00(A0Q2, this, 32);
                View findViewById = findViewById(R.id.change_photo_btn);
                this.A01 = findViewById;
                AnonymousClass3Y5.A00(findViewById, this, 33);
                if (bundle == null && ((C36421kH.A1V(this) || !C36411kG.A1W(this.A0D)) && !getIntent().getBooleanExtra("is_deep_link", false))) {
                    Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
                    getWindow().setSharedElementExitTransition(sharedElementEnterTransition.clone());
                    getWindow().setSharedElementReenterTransition(sharedElementEnterTransition.clone());
                    getWindow().setSharedElementReturnTransition(sharedElementEnterTransition.clone());
                    this.A01.setScaleX(0.0f);
                    this.A01.setScaleY(0.0f);
                    this.A01.setVisibility(0);
                    getWindow().getSharedElementEnterTransition().addListener(new C89284Vy(this, 2));
                    getWindow().getSharedElementExitTransition().addListener(new C89284Vy(this, 3));
                    getWindow().getSharedElementReenterTransition().addListener(new C89284Vy(this, 4));
                }
                this.A02 = findViewById(R.id.change_photo_progress);
                A07(this);
                ProfileSettingsRowIconText profileSettingsRowIconText = (ProfileSettingsRowIconText) findViewById(R.id.profile_phone_info);
                profileSettingsRowIconText.A00.setTextDirection(3);
                profileSettingsRowIconText.setSubText(AnonymousClass3U8.A04(C36351kA.A0j(this.A0G)));
                if (!C36421kH.A1V(this)) {
                    C48762i0.A00(profileSettingsRowIconText, this, 13);
                }
                this.A0M = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_status_card);
                boolean A0E3 = this.A0D.A0E(4921);
                ProfileSettingsRowIconText profileSettingsRowIconText2 = this.A0M;
                if (A0E3) {
                    profileSettingsRowIconText2.setVisibility(8);
                } else {
                    C48762i0.A00(profileSettingsRowIconText2, this, 14);
                    this.A0M.setSubText(this.A07.A00());
                }
                this.A0D.registerObserver(this.A0W);
                if ("android.intent.action.ATTACH_DATA".equals(getIntent().getAction())) {
                    setTitle(R.string.f12nameremoved);
                    this.A0K.A05(getIntent(), this, 13);
                } else {
                    setTitle(R.string.f12nameremoved);
                }
                this.A0J.A01(4);
                this.A00 = findViewById(R.id.alt_profile_view);
                if (!this.A0D.A0E(6149) || this.A08.A00("profile") == 0) {
                    this.A00.setVisibility(8);
                } else {
                    SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) findViewById(R.id.alt_profile_row);
                    this.A0N = settingsRowPhotoOrInitialText;
                    settingsRowPhotoOrInitialText.setName(C36391kE.A0w(this));
                    this.A00.setVisibility(0);
                }
                A01();
                C36401kF.A1C(this);
                return;
            }
        }
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0D.A0E(6149)) {
            return false;
        }
        menu.add(0, 0, 0, R.string.f12nameremoved);
        return true;
    }

    public ProfileInfoActivity(int i) {
        this.A0V = false;
        C89354Wf.A00(this, 25);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public /* synthetic */ void A3i() {
        super.onBackPressed();
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void BSF(String str) {
        Btm(PushnameEmojiBlacklistDialogFragment.A03(str));
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.A00(4);
        this.A0D.unregisterObserver(this.A0W);
        Handler handler = this.A0R;
        if (handler != null) {
            handler.removeCallbacks(this.A0U);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            startActivityForResult(C36431kI.A0D().setClassName(this, "com.whatsapp.profile.ProfilePhotoPrivacyActivity"), 15);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (AnonymousClass3U9.A00) {
                A0F(new C81133wW((Object) this, 4));
                return true;
            }
            finish();
            return true;
        }
    }

    public ProfileInfoActivity() {
        this(0);
        this.A0W = AnonymousClass4W3.A00(this, 28);
    }
}
