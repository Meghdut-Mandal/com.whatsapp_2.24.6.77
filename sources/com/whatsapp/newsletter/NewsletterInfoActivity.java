package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass0PG;
import X.AnonymousClass0XN;
import X.AnonymousClass141;
import X.AnonymousClass15K;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1A5;
import X.AnonymousClass1AO;
import X.AnonymousClass1C4;
import X.AnonymousClass1GQ;
import X.AnonymousClass1H2;
import X.AnonymousClass1LY;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1NM;
import X.AnonymousClass1O8;
import X.AnonymousClass1RY;
import X.AnonymousClass1XN;
import X.AnonymousClass227;
import X.AnonymousClass22g;
import X.AnonymousClass2Dm;
import X.AnonymousClass2EJ;
import X.AnonymousClass2LF;
import X.AnonymousClass3CE;
import X.AnonymousClass3CG;
import X.AnonymousClass3G3;
import X.AnonymousClass3IZ;
import X.AnonymousClass3JI;
import X.AnonymousClass3LW;
import X.AnonymousClass3QI;
import X.AnonymousClass3QQ;
import X.AnonymousClass3R5;
import X.AnonymousClass3U9;
import X.AnonymousClass3UC;
import X.AnonymousClass3UG;
import X.AnonymousClass3UY;
import X.AnonymousClass3Y4;
import X.AnonymousClass3ZU;
import X.AnonymousClass4CP;
import X.AnonymousClass4CQ;
import X.AnonymousClass4CR;
import X.AnonymousClass4CS;
import X.AnonymousClass4CT;
import X.AnonymousClass4CU;
import X.AnonymousClass4PA;
import X.AnonymousClass4RE;
import X.AnonymousClass4RH;
import X.AnonymousClass4RI;
import X.AnonymousClass4RJ;
import X.AnonymousClass4RK;
import X.AnonymousClass4TO;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4YE;
import X.AnonymousClass6O1;
import X.AnonymousClass6YV;
import X.C000800j;
import X.C001400p;
import X.C011504z;
import X.C023509x;
import X.C109325Xd;
import X.C1261362r;
import X.C1497272n;
import X.C161947nj;
import X.C18800tq;
import X.C18820ts;
import X.C19420v0;
import X.C19460v5;
import X.C19550w8;
import X.C19700wN;
import X.C19730wQ;
import X.C19890wg;
import X.C19970wo;
import X.C20380xT;
import X.C20810yC;
import X.C21010yW;
import X.C21060yb;
import X.C22726Aue;
import X.C24361Cd;
import X.C27121Mz;
import X.C27731Pn;
import X.C28081Rg;
import X.C28981Uw;
import X.C30131Zi;
import X.C32241dD;
import X.C32681e1;
import X.C33311f5;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C38021na;
import X.C39001qm;
import X.C40991wR;
import X.C44072La;
import X.C45682Sh;
import X.C45702Sj;
import X.C48752hz;
import X.C51872oW;
import X.C52172p0;
import X.C52512pY;
import X.C57572yS;
import X.C57582yT;
import X.C57652yb;
import X.C57662yc;
import X.C57672yd;
import X.C61413Bt;
import X.C61423Bv;
import X.C61433Bw;
import X.C61823Do;
import X.C61953Ed;
import X.C62403Ga;
import X.C64573On;
import X.C65723Tf;
import X.C65903Tx;
import X.C67963b7;
import X.C75963o6;
import X.C75973o7;
import X.C76003oA;
import X.C80763vv;
import X.C81123wV;
import X.C88474Sv;
import X.C90454aB;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.multiadmin.NewsletterSelectNewOwnerFragment;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import com.whatsapp.text.ReadMoreTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class NewsletterInfoActivity extends AnonymousClass2Dm implements AnonymousClass15K, C88474Sv, AnonymousClass4TO, C161947nj, AnonymousClass4RH, AnonymousClass4RI, AnonymousClass4RJ, AnonymousClass4RK {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public LinearLayout A06;
    public ListView A07;
    public SwitchCompat A08;
    public C19460v5 A09;
    public C19460v5 A0A;
    public C57572yS A0B;
    public C57582yT A0C;
    public C61413Bt A0D;
    public C57652yb A0E;
    public C57662yc A0F;
    public C57672yd A0G;
    public C61433Bw A0H;
    public AnonymousClass3CE A0I;
    public ListItemWithLeftIcon A0J;
    public WaTextView A0K;
    public WaTextView A0L;
    public AnonymousClass3CG A0M;
    public C24361Cd A0N;
    public AnonymousClass1AO A0O;
    public AnonymousClass3QQ A0P;
    public NewsletterInfoLayout A0Q;
    public AnonymousClass16I A0R;
    public AnonymousClass171 A0S;
    public AnonymousClass1RY A0T;
    public C27731Pn A0U;
    public AnonymousClass1NM A0V;
    public AnonymousClass1A5 A0W;
    public AnonymousClass16J A0X;
    public AnonymousClass141 A0Y;
    public C1261362r A0Z;
    public AnonymousClass6O1 A0a;
    public AnonymousClass1XN A0b;
    public EmojiSearchProvider A0c;
    public C21010yW A0d;
    public C45702Sj A0e;
    public AnonymousClass190 A0f;
    public AnonymousClass1C4 A0g;
    public AnonymousClass1GQ A0h;
    public NewsletterInfoMembersListViewModel A0i;
    public AnonymousClass2EJ A0j;
    public NewsletterLinkLauncher A0k;
    public C38021na A0l;
    public AnonymousClass3IZ A0m;
    public C30131Zi A0n;
    public C32241dD A0o;
    public C62403Ga A0p;
    public C61823Do A0q;
    public C40991wR A0r;
    public C64573On A0s;
    public AnonymousClass3UC A0t;
    public C76003oA A0u;
    public NewsletterViewModel A0v;
    public AnonymousClass3G3 A0w;
    public AnonymousClass1LY A0x;
    public C19890wg A0y;
    public AnonymousClass1O8 A0z;
    public AnonymousClass3ZU A10;
    public C20380xT A11;
    public ReadMoreTextView A12;
    public C32681e1 A13;
    public boolean A14;
    public long A15;
    public ImageView A16;
    public boolean A17;
    public final AnonymousClass4YE A18 = new AnonymousClass4YE(this, 18);
    public final AnonymousClass4W0 A19 = new AnonymousClass4W0(this, 13);
    public final AnonymousClass4W3 A1A = AnonymousClass4W3.A00(this, 25);
    public final AnonymousClass00T A1B = C36431kI.A1I(new AnonymousClass4CP(this));
    public final AnonymousClass00T A1C = C36431kI.A1I(new AnonymousClass4CQ(this));
    public final AnonymousClass00T A1D = C001400p.A00(C000800j.NONE, new AnonymousClass4CR(this));
    public final AnonymousClass00T A1E = C36431kI.A1I(new AnonymousClass4CS(this));
    public final AnonymousClass00T A1F = C36431kI.A1I(new AnonymousClass4CT(this));
    public final AnonymousClass00T A1G = C36431kI.A1I(new AnonymousClass4CU(this));

    private final void A1C(String str) {
        if (this.A06.A02 != AnonymousClass01P.DESTROYED) {
            View view = this.A00;
            AnonymousClass00C.A08(view);
            List emptyList = Collections.emptyList();
            AnonymousClass00C.A08(emptyList);
            C21060yb r5 = this.A08;
            AnonymousClass00C.A07(r5);
            AnonymousClass3ZU r2 = new AnonymousClass3ZU(view, (AnonymousClass012) this, r5, str, emptyList, 2000, false);
            r2.A05(new C1497272n(this, 41));
            r2.A02();
            this.A10 = r2;
        }
    }

    public boolean A2g() {
        return true;
    }

    public final void A3z(UserJid userJid, String str) {
        AnonymousClass00C.A0D(userJid, 0);
        if (str != null) {
            A3u();
            C28981Uw A3v = A3v();
            Intent A0D2 = C36431kI.A0D();
            C36331k8.A0u(A0D2, A3v, getPackageName(), "com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity");
            A0D2.putExtra("transfer_ownership_admin_jid", userJid.getRawString());
            A0D2.putExtra("transfer_ownership_admin_short_name", str);
            startActivityForResult(A0D2, 55);
        }
    }

    public String BCV() {
        return "newsletter_info_activity";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        String A0m2 = C36361kB.A0m(this, i);
        View view = this.A00;
        AnonymousClass00C.A08(view);
        List emptyList = Collections.emptyList();
        AnonymousClass00C.A08(emptyList);
        C21060yb r3 = this.A08;
        AnonymousClass00C.A07(r3);
        return new AnonymousClass3ZU(view, (AnonymousClass012) this, r3, A0m2, emptyList, i2, z);
    }

    public void BUS(AnonymousClass141 r1) {
    }

    public void BVv(UserJid userJid, boolean z) {
        AnonymousClass00C.A0D(userJid, 0);
        this.A17 = z;
        C62403Ga r5 = this.A0p;
        if (r5 != null) {
            C28981Uw A0F2 = AnonymousClass22g.A0F(this);
            C75973o7 r3 = new C75973o7(userJid, this, z);
            AnonymousClass00C.A0D(A0F2, 0);
            AnonymousClass4PA r0 = r5.A00;
            if (r0 != null) {
                r0.cancel();
            }
            r5.A01.A05(R.string.f12nameremoved, R.string.f12nameremoved);
            r5.A00 = r5.A03.A00(A0F2, userJid, new C90454aB(userJid, r3, r5, 0));
            return;
        }
        throw C36331k8.A0d("newsletterAdminInvitationHandler");
    }

    public void Bal(ArrayList arrayList) {
    }

    public void Bfa(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        C62403Ga r2 = this.A0p;
        if (r2 != null) {
            r2.A00(AnonymousClass22g.A0F(this), userJid, new C75963o6(this));
            return;
        }
        throw C36331k8.A0d("newsletterAdminInvitationHandler");
    }

    public void BgD(C28981Uw r8, String str, List list) {
        C36321k7.A0w(r8, list);
        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(this);
        C36331k8.A1T(new NewsletterInfoActivity$onSend$1(r8, this, str, list, (C023509x) null), A002);
    }

    public void Bji(C51872oW r4, String str, List list) {
        boolean A1a = C36341k9.A1a(list, r4);
        int ordinal = r4.ordinal();
        if (ordinal != A1a) {
            if (ordinal == 3) {
                Bfa((UserJid) list.get(0));
            } else if (ordinal == 4) {
                BVv((UserJid) list.get(0), this.A17);
            }
        } else if (str != null) {
            BgD(AnonymousClass22g.A0F(this), str, list);
        }
    }

    public void BkU() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4;
        long j;
        if (i2 == -1) {
            switch (i) {
                case 50:
                case 51:
                    AnonymousClass2EJ r0 = this.A0j;
                    if (r0 != null) {
                        r0.A0W(true);
                        break;
                    } else {
                        throw C36331k8.A0d("newsletterInfoViewModel");
                    }
                case 53:
                    C18820ts r7 = this.A00;
                    long j2 = 1;
                    if (intent != null) {
                        j = intent.getLongExtra("extra_invitees_count", 1);
                    } else {
                        j = 1;
                    }
                    Object[] objArr = new Object[1];
                    if (intent != null) {
                        j2 = intent.getLongExtra("extra_invitees_count", 1);
                    }
                    AnonymousClass000.A1M(objArr, 0, j2);
                    String A0L2 = r7.A0L(objArr, R.plurals.f10nameremoved, j);
                    AnonymousClass00C.A08(A0L2);
                    A17(this, A0L2, true);
                    break;
                case 54:
                    if (intent != null) {
                        Bvu(C36341k9.A0k(intent));
                        break;
                    }
                    break;
                case 55:
                    if (intent != null) {
                        AnonymousClass02E A0L3 = getSupportFragmentManager().A0L(R.id.search_container);
                        if ((A0L3 instanceof NewsletterSelectNewOwnerFragment) && !isFinishing()) {
                            AnonymousClass09Y A0O2 = C36341k9.A0O(this);
                            A0O2.A08(A0L3);
                            A0O2.A01();
                        }
                        String stringExtra = intent.getStringExtra("transfer_ownership_admin_short_name");
                        if (intent.getBooleanExtra("transfer_ownership_successful", false)) {
                            boolean booleanExtra = intent.getBooleanExtra("transfer_ownership_admin_dismiss_requested", false);
                            boolean booleanExtra2 = intent.getBooleanExtra("transfer_ownership_admin_dismiss_successful", false);
                            if (!booleanExtra) {
                                i4 = R.string.f12nameremoved;
                            } else if (booleanExtra2) {
                                i4 = R.string.f12nameremoved;
                            } else {
                                i3 = R.string.f12nameremoved;
                            }
                            A1C(C36351kA.A0x(this, stringExtra, new Object[1], 0, i4));
                            break;
                        } else {
                            i3 = R.string.f12nameremoved;
                        }
                        BO5(i3);
                        break;
                    }
                    break;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
    }

    public static final void A10(NewsletterInfoActivity newsletterInfoActivity) {
        AnonymousClass141 r0 = newsletterInfoActivity.A0Y;
        if (r0 == null) {
            throw C36331k8.A0d("contact");
        }
        int i = 0;
        if (!r0.A0f) {
            newsletterInfoActivity.A05.A06(R.string.f12nameremoved, 0);
            AnonymousClass1O8 r3 = newsletterInfoActivity.A0z;
            if (r3 != null) {
                C28981Uw A3v = newsletterInfoActivity.A3v();
                AnonymousClass141 r02 = newsletterInfoActivity.A0Y;
                if (r02 == null) {
                    throw C36331k8.A0d("contact");
                }
                r3.A01(A3v, r02.A06, 2);
                return;
            }
            throw C36331k8.A0d("profilePhotoManager");
        } else if (!newsletterInfoActivity.A0Z) {
            int statusBarColor = newsletterInfoActivity.getWindow().getStatusBarColor();
            if (C19550w8.A04()) {
                i = newsletterInfoActivity.getWindow().getNavigationBarColor();
            }
            newsletterInfoActivity.A3u();
            C28981Uw A3v2 = newsletterInfoActivity.A3v();
            Intent A0D2 = C36431kI.A0D();
            C36331k8.A0u(A0D2, A3v2, newsletterInfoActivity.getPackageName(), "com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto");
            A0D2.putExtra("circular_transition", true);
            A0D2.putExtra("start_transition_alpha", 0.0f);
            A0D2.putExtra("start_transition_status_bar_color", statusBarColor);
            A0D2.putExtra("return_transition_status_bar_color", 0);
            A0D2.putExtra("start_transition_navigation_bar_color", i);
            A0D2.putExtra("return_transition_navigation_bar_color", 0);
            A0D2.putExtra("open_pic_selection_sheet", false);
            AnonymousClass3CG r03 = newsletterInfoActivity.A0M;
            if (r03 == null) {
                throw C36331k8.A0d("transitionNames");
            }
            String A0o2 = C36401kF.A0o(r03.A00, R.string.f12nameremoved);
            AnonymousClass00C.A08(A0o2);
            NewsletterInfoLayout newsletterInfoLayout = newsletterInfoActivity.A0Q;
            if (newsletterInfoLayout == null) {
                throw C36331k8.A0d("rootLayout");
            }
            AnonymousClass0XN.A02(newsletterInfoActivity, A0D2, AnonymousClass3U9.A05(newsletterInfoActivity, C36361kB.A0G(newsletterInfoLayout, R.id.wds_profile_picture), A0o2), 51);
        }
    }

    public static final void A17(NewsletterInfoActivity newsletterInfoActivity, String str, boolean z) {
        if (newsletterInfoActivity.A06.A02 != AnonymousClass01P.DESTROYED) {
            if (z) {
                AnonymousClass2EJ r4 = newsletterInfoActivity.A0j;
                if (r4 == null) {
                    throw C36331k8.A0d("newsletterInfoViewModel");
                }
                C28981Uw A3v = newsletterInfoActivity.A3v();
                C36331k8.A1T(new NewsletterInfoViewModel$fetchPendingAdmins$1(A3v, r4, (C023509x) null), C109325Xd.A00(r4));
            }
            newsletterInfoActivity.A1C(str);
        }
    }

    public static final void A18(NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0v;
        if (newsletterViewModel == null) {
            throw C36331k8.A0d("newsletterViewModel");
        }
        List<AnonymousClass3JI> A0w2 = C36401kF.A0w(newsletterViewModel.A01);
        if (A0w2 != null) {
            NewsletterViewModel newsletterViewModel2 = newsletterInfoActivity.A0v;
            if (newsletterViewModel2 == null) {
                throw C36331k8.A0d("newsletterViewModel");
            }
            List<AnonymousClass3JI> A0w3 = C36401kF.A0w(newsletterViewModel2.A00);
            if (A0w3 != null) {
                boolean z2 = !z;
                C32241dD A3x = newsletterInfoActivity.A3x();
                long A082 = C36351kA.A08(newsletterInfoActivity.A1B);
                C28981Uw A3v = newsletterInfoActivity.A3v();
                ArrayList A0z2 = C36351kA.A0z(A0w2);
                for (AnonymousClass3JI r0 : A0w2) {
                    A0z2.add(r0.A02);
                }
                ArrayList A0z3 = C36351kA.A0z(A0w3);
                for (AnonymousClass3JI r02 : A0w3) {
                    A0z3.add(r02.A02);
                }
                A3x.A0E(A3v, C52512pY.SIMILAR_NEWSLETTERS_NEWSLETTER_PROFILE, A0z2, A0z3, z2 ? 1 : 0, A082);
            }
        }
    }

    public void A2X() {
        this.A0T.A03(C28981Uw.A03.A01(C36341k9.A0d(this)), 28);
    }

    public final C44072La A3t() {
        NewsletterViewModel newsletterViewModel = this.A0v;
        if (newsletterViewModel != null) {
            return AnonymousClass3IZ.A00(newsletterViewModel);
        }
        throw C36331k8.A0d("newsletterViewModel");
    }

    public final AnonymousClass190 A3u() {
        AnonymousClass190 r0 = this.A0f;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0X();
    }

    public C28981Uw A3v() {
        AnonymousClass141 r1 = this.A0Y;
        if (r1 == null) {
            throw C36331k8.A0d("contact");
        }
        C28981Uw r0 = (C28981Uw) r1.A06(C28981Uw.class);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("Invalid Newsletter Jid");
    }

    public final C38021na A3w() {
        C57652yb r0 = this.A0E;
        if (r0 != null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            AnonymousClass00C.A08(layoutInflater);
            AnonymousClass1RY r7 = this.A0T;
            if (r7 == null) {
                throw C36331k8.A0d("contactPhotoLoader");
            }
            C27121Mz r1 = r0.A00;
            C18800tq r02 = r1.A01;
            C20810yC A0V2 = C36341k9.A0V(r02);
            C19730wQ A0N2 = C36351kA.A0N(r02);
            C18820ts A0T2 = C36341k9.A0T(r02);
            AnonymousClass171 A0S2 = C36341k9.A0S(r02);
            return new C38021na(layoutInflater, (C61423Bv) r1.A00.A38.get(), A0N2, C36361kB.A0S(r02), A0S2, r7, A0T2, A0V2, this);
        }
        throw C36331k8.A0d("newsletterMembersAdapterFactory");
    }

    public final C32241dD A3x() {
        C32241dD r0 = this.A0o;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterLogging");
    }

    public final AnonymousClass3G3 A3y() {
        AnonymousClass3G3 r0 = this.A0w;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterSuspensionUtils");
    }

    public AnonymousClass01P BAc() {
        AnonymousClass01P r0 = this.A06.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BZK(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0063
            X.2EJ r0 = r6.A0j
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x000d:
            X.00s r0 = r0.A06
            java.lang.Object r0 = r0.A04()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            X.11F r0 = X.C36341k9.A0W(r1)
            if (r0 == 0) goto L_0x001f
            r5.add(r0)
            goto L_0x001f
        L_0x002f:
            X.09w r5 = X.C023409w.A00
        L_0x0031:
            r6.A3u()
            X.1Uw r4 = X.AnonymousClass22g.A0F(r6)
            X.2La r0 = r6.A3t()
            java.lang.String r3 = r0.A0K
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            X.C36421kH.A0m(r2, r4)
            java.lang.String r0 = "name"
            r2.putExtra(r0, r3)
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r5)
            java.lang.String r0 = "invited_admins_jids"
            r2.putExtra(r0, r1)
            r0 = 53
            r6.startActivityForResult(r2, r0)
            return
        L_0x0063:
            X.01z r3 = r6.getSupportFragmentManager()
            X.1Uw r2 = r6.A3v()
            r0 = 1
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r1 = 0
            r0[r1] = r7
            java.util.ArrayList r0 = X.AnonymousClass03T.A02(r0)
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r0 = X.C54822tc.A00(r2, r0, r1)
            X.C65443Sb.A02(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.BZK(com.whatsapp.jid.UserJid):void");
    }

    public void finishAfterTransition() {
        View view = this.A03;
        if (view == null) {
            throw C36331k8.A0d("headerView");
        }
        view.setTransitionName((String) null);
        TransitionSet transitionSet = new TransitionSet();
        Slide slide = new Slide(48);
        View view2 = this.A03;
        if (view2 == null) {
            throw C36331k8.A0d("headerView");
        }
        slide.addTarget(view2);
        transitionSet.addTransition(slide);
        Slide slide2 = new Slide(80);
        ListView listView = this.A07;
        if (listView == null) {
            throw C36331k8.A0d("newsletterListView");
        }
        AnonymousClass22g.A0G(this, slide2, transitionSet, listView);
        NewsletterInfoLayout newsletterInfoLayout = this.A0Q;
        if (newsletterInfoLayout == null) {
            throw C36331k8.A0d("rootLayout");
        }
        newsletterInfoLayout.setStatusData((C61953Ed) null);
        super.finishAfterTransition();
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0506  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            super.onCreate(r0)
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.A15 = r2
            X.3Ro r2 = X.C28981Uw.A03
            java.lang.String r0 = X.C36341k9.A0d(r1)
            X.1Uw r5 = r2.A01(r0)
            if (r5 != 0) goto L_0x001d
            r1.finish()
        L_0x001c:
            return
        L_0x001d:
            r1.A1p()
            r0 = 2131891554(0x7f121562, float:1.9417831E38)
            r1.setTitle(r0)
            X.1AO r2 = r1.A0O
            if (r2 == 0) goto L_0x0584
            r0 = 2
            r2.A01 = r0
            X.1Pn r2 = r1.A0U
            if (r2 == 0) goto L_0x057d
            java.lang.String r0 = "newsletter-info-activity"
            X.1RY r0 = r2.A05(r1, r0)
            r1.A0T = r0
            X.1A5 r0 = r1.A0W
            if (r0 == 0) goto L_0x0576
            X.141 r0 = r0.A01(r5)
            X.C18740tg.A06(r0)
            r1.A0Y = r0
            X.2yS r2 = r1.A0B
            if (r2 == 0) goto L_0x056f
            X.1Uw r0 = r1.A3v()
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = X.C54902tk.A00(r2, r1, r0)
            r1.A0v = r0
            java.lang.String r11 = "newsletterViewModel"
            if (r0 != 0) goto L_0x005d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x005d:
            X.00s r3 = r0.A01
            X.4Ke r2 = new X.4Ke
            r2.<init>(r1)
            r0 = 42
            X.C66023Uj.A01(r1, r3, r2, r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r1.A0v
            if (r0 != 0) goto L_0x0072
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x0072:
            X.00s r3 = r0.A00
            X.4Kf r2 = new X.4Kf
            r2.<init>(r1)
            r0 = 44
            X.C66023Uj.A01(r1, r3, r2, r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r1.A0v
            if (r0 != 0) goto L_0x0087
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x0087:
            X.3hE r2 = r0.A03
            X.1Uw r0 = r0.A05
            X.3IZ r2 = r2.A01(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.cache.NewsletterState"
            X.AnonymousClass00C.A0E(r2, r0)
            r1.A0m = r2
            X.2yT r4 = r1.A0C
            if (r4 == 0) goto L_0x0568
            X.1Uw r3 = r1.A3v()
            X.C18740tg.A06(r3)
            X.141 r2 = r1.A0Y
            if (r2 != 0) goto L_0x00ac
            java.lang.String r0 = "contact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00ac:
            r0 = 5
            X.04H r2 = X.AnonymousClass4ZD.A00(r1, r3, r2, r4, r0)
            java.lang.Class<X.2EJ> r0 = X.AnonymousClass2EJ.class
            X.04R r0 = r2.A00(r0)
            X.2EJ r0 = (X.AnonymousClass2EJ) r0
            r1.A0j = r0
            java.lang.String r10 = "newsletterInfoViewModel"
            if (r0 != 0) goto L_0x00c4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x00c4:
            r1.A3p(r0)
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x00d0
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x00d0:
            X.00s r3 = r0.A09
            X.4Ka r2 = new X.4Ka
            r2.<init>(r1)
            r0 = 48
            X.C66023Uj.A01(r1, r3, r2, r0)
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x00e5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x00e5:
            X.00r r3 = r0.A04
            X.4Kb r2 = new X.4Kb
            r2.<init>(r1)
            r0 = 43
            X.C66023Uj.A01(r1, r3, r2, r0)
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x00fa
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x00fa:
            X.00r r2 = r0.A03
            X.4Kc r0 = new X.4Kc
            r0.<init>(r1)
            r4 = 0
            X.C65993Ug.A00(r1, r2, r0, r4)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r1.A0v
            if (r0 != 0) goto L_0x010e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x010e:
            X.00r r2 = r0.A00
            X.4Kd r0 = new X.4Kd
            r0.<init>(r1)
            r7 = 2
            X.C65993Ug.A00(r1, r2, r0, r7)
            X.2Sj r2 = new X.2Sj
            r2.<init>()
            r1.A0e = r2
            r6 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A03 = r0
            android.view.LayoutInflater r2 = r1.getLayoutInflater()
            r0 = 2131625633(0x7f0e06a1, float:1.887848E38)
            android.view.View r0 = X.C36431kI.A0J(r2, r0)
            r1.setContentView((android.view.View) r0)
            android.view.View r2 = r1.A00
            r0 = 2131429151(0x7f0b071f, float:1.8479967E38)
            android.view.View r2 = r2.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout"
            X.AnonymousClass00C.A0E(r2, r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r2 = (com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout) r2
            r1.A0Q = r2
            androidx.appcompat.widget.Toolbar r3 = X.C36411kG.A0R(r1)
            if (r3 == 0) goto L_0x0166
            java.lang.String r0 = ""
            r3.setTitle((java.lang.CharSequence) r0)
            r3.A0F()
            X.07B r0 = X.C36431kI.A0Q(r1, r3)
            if (r0 == 0) goto L_0x015e
            r0.A0U(r6)
        L_0x015e:
            X.0ts r2 = r1.A00
            r0 = 2131231964(0x7f0804dc, float:1.8080024E38)
            X.C36331k8.A0s(r1, r3, r2, r0)
        L_0x0166:
            android.widget.ListView r0 = r1.getListView()
            X.AnonymousClass00C.A08(r0)
            r1.A07 = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r2 = r1.A0Q
            java.lang.String r9 = "rootLayout"
            if (r2 != 0) goto L_0x017a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x017a:
            r0 = 2131625636(0x7f0e06a4, float:1.8878486E38)
            r2.A0E(r0)
            r0 = 2131430714(0x7f0b0d3a, float:1.8483137E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            r1.A03 = r0
            r0 = 2131427652(0x7f0b0144, float:1.8476926E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            r1.A04 = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r1.A0Q
            if (r0 != 0) goto L_0x019b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x019b:
            r0.A0A()
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r2 = r1.A0Q
            if (r2 != 0) goto L_0x01a7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x01a7:
            int r0 = X.C36391kE.A05(r1)
            r2.setColor(r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r3 = r1.A0Q
            if (r3 != 0) goto L_0x01b7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x01b7:
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131165198(0x7f07000e, float:1.7944606E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = X.C36361kB.A02(r1, r0)
            r3.A0F(r2, r0)
            android.view.LayoutInflater r3 = r1.getLayoutInflater()
            r2 = 2131625635(0x7f0e06a3, float:1.8878484E38)
            android.widget.ListView r0 = r1.A07
            java.lang.String r8 = "newsletterListView"
            r14 = 0
            if (r0 != 0) goto L_0x01dc
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x01dc:
            android.view.View r3 = X.C36371kC.A0J(r3, r0, r2, r4)
            r1.A01 = r3
            android.widget.ListView r2 = r1.A07
            if (r2 != 0) goto L_0x01eb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x01eb:
            android.content.Context r0 = r3.getContext()
            android.widget.FrameLayout r0 = X.C36431kI.A0O(r0, r3)
            X.C011504z.A06(r0, r7)
            r2.addFooterView(r0, r14, r4)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r1)
            r1.A06 = r0
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            X.C36321k7.A0K(r1, r0)
            int r2 = r0.y
            android.widget.LinearLayout r0 = r1.A06
            java.lang.String r3 = "footerPadding"
            if (r0 != 0) goto L_0x0215
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0215:
            r0.setPadding(r4, r4, r4, r2)
            android.widget.ListView r2 = r1.A07
            if (r2 != 0) goto L_0x0221
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0221:
            android.widget.LinearLayout r0 = r1.A06
            if (r0 != 0) goto L_0x022a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x022a:
            r2.addFooterView(r0, r14, r4)
            android.widget.LinearLayout r0 = r1.A06
            if (r0 != 0) goto L_0x0236
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0236:
            X.C011504z.A06(r0, r7)
            r0 = 2131432708(0x7f0b1504, float:1.8487181E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.A16 = r0
            X.3CG r0 = new X.3CG
            r0.<init>(r1)
            r1.A0M = r0
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x0254
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x0254:
            r0.A0W(r6)
            boolean r0 = A1D(r1)
            if (r0 == 0) goto L_0x02bc
            X.2yd r7 = r1.A0G
            if (r7 == 0) goto L_0x0537
            X.1Uw r17 = r1.A3v()
            X.C18740tg.A06(r17)
            X.2La r0 = r1.A3t()
            long r2 = r0.A07
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x0277
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x0277:
            r19 = 1
            X.4ZC r15 = new X.4ZC
            r16 = r7
            r18 = r0
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            X.04H r2 = new X.04H
            r2.<init>(r15, r1)
            java.lang.Class<com.whatsapp.newsletter.NewsletterInfoMembersListViewModel> r0 = com.whatsapp.newsletter.NewsletterInfoMembersListViewModel.class
            X.04R r2 = r2.A00(r0)
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r2 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r2
            X.01N r0 = r1.A06
            r0.A04(r2)
            r1.A0i = r2
            if (r2 == 0) goto L_0x02a6
            X.00r r3 = r2.A02
            X.4KX r2 = new X.4KX
            r2.<init>(r1)
            r0 = 46
            X.C66023Uj.A01(r1, r3, r2, r0)
        L_0x02a6:
            boolean r0 = X.AnonymousClass22g.A0t(r1)
            if (r0 == 0) goto L_0x02bc
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r0 = r1.A0i
            if (r0 == 0) goto L_0x02bc
            X.00s r3 = r0.A03
            X.4KY r2 = new X.4KY
            r2.<init>(r1)
            r0 = 47
            X.C66023Uj.A01(r1, r3, r2, r0)
        L_0x02bc:
            X.1na r2 = r1.A3w()
            r1.A0l = r2
            android.widget.ListView r0 = r1.A07
            if (r0 != 0) goto L_0x02cb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x02cb:
            r0.setAdapter(r2)
            r2 = 2131435328(0x7f0b1f40, float:1.8492495E38)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r1.A0Q
            if (r0 != 0) goto L_0x02da
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x02da:
            android.widget.ImageView r2 = X.C36341k9.A0L(r0, r2)
            r0 = 2131231046(0x7f080146, float:1.8078162E38)
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r1, r0)
            r2.setImageDrawable(r0)
            r0 = 2131430620(0x7f0b0cdc, float:1.8482946E38)
            android.view.View r2 = X.C36361kB.A0D(r1, r0)
            com.whatsapp.text.ReadMoreTextView r2 = (com.whatsapp.text.ReadMoreTextView) r2
            r1.A12 = r2
            if (r2 != 0) goto L_0x02fc
            java.lang.String r0 = "descriptionTextView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02fc:
            r0 = 3
            r2.setLinesLimit(r0)
            X.0yb r0 = r1.A08
            X.C36331k8.A16(r2, r0)
            r0 = 2131429507(0x7f0b0883, float:1.8480689E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            r1.A00 = r0
            r0 = 2131430707(0x7f0b0d33, float:1.8483123E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            r1.A02 = r0
            r0 = 2131432092(0x7f0b129c, float:1.8485932E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r1.A0L = r0
            r0 = 2131429316(0x7f0b07c4, float:1.8480301E38)
            android.view.View r0 = X.C36361kB.A0D(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r1.A0K = r0
            A15(r1)
            r1.A2C(r6)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r3 = r1.A0Q
            if (r3 != 0) goto L_0x033c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x033c:
            r2 = 12
            X.3Y4 r0 = new X.3Y4
            r0.<init>(r1, r2)
            r3.A0B = r0
            boolean r0 = X.AnonymousClass22g.A0t(r1)
            if (r0 != 0) goto L_0x03f4
            X.0yC r2 = r1.A0D
            r0 = 7473(0x1d31, float:1.0472E-41)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x03f4
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r1.A0Q
            if (r0 != 0) goto L_0x035e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r9)
            throw r0
        L_0x035e:
            android.view.View r2 = r0.A0E
            r0 = 2131431978(0x7f0b122a, float:1.84857E38)
            android.view.ViewStub r0 = X.C36431kI.A0M(r2, r0)
            android.view.View r2 = r0.inflate()
            X.AnonymousClass00C.A08(r2)
            r0 = 2131431979(0x7f0b122b, float:1.8485702E38)
            androidx.recyclerview.widget.RecyclerView r6 = X.C36441kJ.A0c(r2, r0)
            X.3CE r3 = r1.A0I
            if (r3 == 0) goto L_0x053e
            X.1RY r2 = r1.A0T
            if (r2 != 0) goto L_0x0384
            java.lang.String r0 = "contactPhotoLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0384:
            X.AnonymousClass00C.A0B(r6)
            X.3o8 r0 = new X.3o8
            r0.<init>(r1)
            X.3oA r0 = r3.A00(r6, r2, r0, r4)
            r1.A0u = r0
            r0.A00()
            X.3oA r6 = r1.A0u
            if (r6 == 0) goto L_0x03df
            androidx.recyclerview.widget.RecyclerView r3 = r6.A01
            X.3bX r2 = r6.A03
            java.util.ArrayList r0 = r3.A13
            r0.add(r2)
            android.content.res.Resources r8 = r3.getResources()
            android.util.DisplayMetrics r0 = r8.getDisplayMetrics()
            int r2 = r0.widthPixels
            android.util.DisplayMetrics r0 = r8.getDisplayMetrics()
            int r0 = r0.heightPixels
            int r7 = java.lang.Math.max(r2, r0)
            boolean r2 = r6.A06
            r0 = 2131168090(0x7f070b5a, float:1.7950472E38)
            if (r2 == 0) goto L_0x03c0
            r0 = 2131168088(0x7f070b58, float:1.7950468E38)
        L_0x03c0:
            int r3 = r8.getDimensionPixelSize(r0)
            r0 = 2131168379(0x7f070c7b, float:1.7951058E38)
            int r0 = r8.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r3 = r3 + r0
            float r2 = (float) r7
            float r0 = (float) r3
            float r2 = r2 / r0
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r0 = (float) r2
            int r2 = (int) r0
            X.1wG r0 = r6.A04
            r0.A00 = r2
            r0.A06()
        L_0x03df:
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r3 = r1.A0v
            if (r3 != 0) goto L_0x03e8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x03e8:
            X.040 r2 = X.C109325Xd.A00(r3)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1 r0 = new com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1
            r0.<init>(r3, r14)
            X.C36331k8.A1T(r0, r2)
        L_0x03f4:
            X.0yC r2 = r1.A0D
            r0 = 5621(0x15f5, float:7.877E-42)
            boolean r2 = r2.A0E(r0)
            boolean r0 = X.AnonymousClass22g.A0t(r1)
            if (r0 == 0) goto L_0x041d
            if (r2 == 0) goto L_0x041d
            X.1Zi r0 = r1.A0n
            if (r0 == 0) goto L_0x0561
            X.1Uw r13 = r1.A3v()
            X.164 r0 = r0.A0B
            r15 = 1
            r16 = 1
            r18 = 0
            r17 = 0
            X.8fK r12 = new X.8fK
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.A01(r12)
        L_0x041d:
            A1B(r1, r4, r4)
            X.1Cd r2 = r1.A0N
            if (r2 == 0) goto L_0x055a
            X.4W0 r0 = r1.A19
            r2.registerObserver(r0)
            X.1Cf r2 = r1.A0K
            X.4YE r0 = r1.A18
            r2.registerObserver(r0)
            X.16I r2 = r1.A0R
            if (r2 == 0) goto L_0x0553
            X.4W3 r0 = r1.A1A
            r2.registerObserver(r0)
            X.16J r2 = r1.A0X
            if (r2 == 0) goto L_0x054c
            X.00T r0 = r1.A1D
            java.lang.Object r0 = r0.getValue()
            r2.registerObserver(r0)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r0 = r1.A0v
            if (r0 != 0) goto L_0x044f
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r11)
            throw r0
        L_0x044f:
            X.08S r3 = r0.A0U()
            X.4KV r2 = new X.4KV
            r2.<init>(r1)
            r0 = 1
            X.C65993Ug.A00(r1, r3, r2, r0)
            A14(r1)
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r0 = "circular_transition"
            boolean r0 = r2.getBooleanExtra(r0, r4)
            java.lang.String r2 = "transitionNames"
            if (r0 == 0) goto L_0x0481
            android.view.View r3 = r1.A03
            if (r3 != 0) goto L_0x0478
            java.lang.String r0 = "headerView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0478:
            X.3CG r0 = r1.A0M
            if (r0 != 0) goto L_0x0493
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0481:
            r0 = 2131432708(0x7f0b1504, float:1.8487181E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x049f
            X.3CG r0 = r1.A0M
            if (r0 != 0) goto L_0x0493
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0493:
            r2 = 2131897115(0x7f122b1b, float:1.942911E38)
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r2)
            r3.setTransitionName(r0)
        L_0x049f:
            X.2EJ r6 = r1.A0j
            if (r6 != 0) goto L_0x04a8
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x04a8:
            X.0yC r2 = r6.A0F
            r0 = 6618(0x19da, float:9.274E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x04dd
            X.2La r0 = r6.A00
            java.lang.String r3 = "newsletterInfo"
            if (r0 != 0) goto L_0x04bd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x04bd:
            X.1GQ r2 = r6.A0G
            boolean r0 = r0.A0R(r2)
            if (r0 != 0) goto L_0x04dd
            X.2La r0 = r6.A00
            if (r0 != 0) goto L_0x04ce
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x04ce:
            boolean r0 = r0.A0Q(r2)
            if (r0 != 0) goto L_0x04dd
            X.2La r2 = r6.A00
            if (r2 != 0) goto L_0x04e5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x04dd:
            X.00s r2 = r6.A07
            X.2nb r0 = X.C51302nb.None
            r2.A0C(r0)
            goto L_0x04fd
        L_0x04e5:
            boolean r0 = r2.A0o
            if (r0 != 0) goto L_0x04dd
            boolean r0 = r2.A0O()
            if (r0 == 0) goto L_0x04dd
            X.040 r3 = X.C109325Xd.A00(r6)
            X.02l r2 = r6.A0J
            com.whatsapp.newsletter.NewsletterInfoViewModel$fetchMvActionState$1 r0 = new com.whatsapp.newsletter.NewsletterInfoViewModel$fetchMvActionState$1
            r0.<init>(r6, r14)
            X.C36381kD.A1R(r2, r0, r3)
        L_0x04fd:
            X.2EJ r0 = r1.A0j
            if (r0 != 0) goto L_0x0506
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r10)
            throw r0
        L_0x0506:
            X.00r r3 = r0.A02
            X.4KZ r2 = new X.4KZ
            r2.<init>(r1)
            r0 = 49
            X.C66023Uj.A01(r1, r3, r2, r0)
            X.1NM r2 = r1.A0V
            if (r2 == 0) goto L_0x0545
            r0 = 7
            r2.A09(r5, r0)
            r1.A2C(r4)
            A16(r1)
            X.2La r0 = r1.A3t()
            boolean r2 = r0.A0N
            r0 = 2131429491(0x7f0b0873, float:1.8480656E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x001c
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
            return
        L_0x0537:
            java.lang.String r0 = "newsletterInfoMembersListViewModelFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x053e:
            java.lang.String r0 = "newsletterListViewHolderFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0545:
            java.lang.String r0 = "chatMessageCounts"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x054c:
            java.lang.String r0 = "messageObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0553:
            java.lang.String r0 = "contactObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x055a:
            java.lang.String r0 = "chatStateObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0561:
            java.lang.String r0 = "newsletterManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0568:
            java.lang.String r0 = "newsletterInfoViewModelFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x056f:
            java.lang.String r0 = "newsletterViewModelFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0576:
            java.lang.String r0 = "conversationContactManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x057d:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0584:
            java.lang.String r0 = "chatActionLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i2 != 52) {
            return super.onCreateDialog(i2);
        }
        C19970wo r18 = this.A07;
        C20810yC r17 = this.A0D;
        AnonymousClass17Y r16 = this.A05;
        AnonymousClass1N2 r15 = this.A0C;
        C19700wN r14 = this.A03;
        AnonymousClass1H2 r13 = this.A0C;
        AnonymousClass1XN r8 = this.A0b;
        if (r8 != null) {
            C21060yb r12 = this.A08;
            C18820ts r11 = this.A00;
            C1261362r r7 = this.A0Z;
            if (r7 != null) {
                EmojiSearchProvider emojiSearchProvider = this.A0c;
                if (emojiSearchProvider != null) {
                    C19420v0 r10 = this.A09;
                    C19890wg r5 = this.A0y;
                    if (r5 != null) {
                        AnonymousClass6O1 r4 = this.A0a;
                        if (r4 != null) {
                            AnonymousClass1N0 r3 = this.A0B;
                            String str = A3t().A0H;
                            C18820ts r19 = r11;
                            AnonymousClass3R5 r20 = new AnonymousClass3R5(this, 5);
                            AnonymousClass1N0 r21 = r3;
                            C1261362r r22 = r7;
                            AnonymousClass17Y r152 = r16;
                            C21060yb r162 = r12;
                            C19970wo r172 = r18;
                            C19420v0 r182 = r10;
                            AnonymousClass227 r122 = new AnonymousClass227(this, r14, r152, r162, r172, r182, r19, r20, r21, r22, r4, r8, r13, emojiSearchProvider, r17, r5, r15, str, 52, R.string.f12nameremoved, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, R.string.f12nameremoved, 0, 147457);
                            r122.A06 = true;
                            return r122;
                        }
                        throw C36331k8.A0d("expressionUserJourneyLogger");
                    }
                    throw C36331k8.A0d("sharedPreferencesFactory");
                }
                throw C36331k8.A0d("emojiSearchProvider");
            }
            throw C36331k8.A0d("emojiTrayLogger");
        }
        throw C36331k8.A0d("recentEmojis");
    }

    public void onDestroy() {
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel;
        C22726Aue aue;
        C45702Sj r1 = this.A0e;
        if (r1 != null) {
            C21010yW r0 = this.A0d;
            if (r0 != null) {
                r0.Bly(r1);
            } else {
                throw C36331k8.A0d("wamRuntime");
            }
        }
        C24361Cd r12 = this.A0N;
        if (r12 != null) {
            r12.unregisterObserver(this.A19);
            this.A0K.unregisterObserver(this.A18);
            AnonymousClass16I r13 = this.A0R;
            if (r13 != null) {
                r13.unregisterObserver(this.A1A);
                AnonymousClass16J r14 = this.A0X;
                if (r14 != null) {
                    C36411kG.A1I(r14, this.A1D);
                    AnonymousClass1RY r02 = this.A0T;
                    if (r02 == null) {
                        throw C36331k8.A0d("contactPhotoLoader");
                    }
                    r02.A02();
                    ImageView imageView = this.A16;
                    if (imageView == null) {
                        throw C36331k8.A0d("photoView");
                    }
                    imageView.setImageDrawable((Drawable) null);
                    if (!(!A1D(this) || (newsletterInfoMembersListViewModel = this.A0i) == null || (aue = newsletterInfoMembersListViewModel.A00) == null)) {
                        aue.cancel();
                    }
                    C62403Ga r2 = this.A0p;
                    if (r2 != null) {
                        AnonymousClass4PA r03 = r2.A00;
                        if (r03 != null) {
                            r03.cancel();
                        }
                        C81123wV.A00(r2.A01, r2, 9);
                        super.onDestroy();
                        return;
                    }
                    throw C36331k8.A0d("newsletterAdminInvitationHandler");
                }
                throw C36331k8.A0d("messageObservers");
            }
            throw C36331k8.A0d("contactObservers");
        }
        throw C36331k8.A0d("chatStateObservers");
    }

    private final Long A0u() {
        Serializable serializableExtra = getIntent().getSerializableExtra("similar_newsletters_session_id");
        if (serializableExtra instanceof Long) {
            return (Long) serializableExtra;
        }
        return null;
    }

    public static final String A0v(NewsletterInfoActivity newsletterInfoActivity) {
        String str;
        int i;
        C44072La A3t = newsletterInfoActivity.A3t();
        String str2 = A3t.A0I;
        if (str2 == null) {
            str2 = "";
        }
        if (str.length() > 0) {
            i = R.string.f12nameremoved;
        } else {
            str = A3t.A0J;
            if (str == null) {
                str = "impossible-code";
            }
            i = R.string.f12nameremoved;
        }
        Object[] A0M2 = AnonymousClass001.A0M();
        A0M2[0] = A3t.A0K;
        return C36351kA.A0x(newsletterInfoActivity, str, A0M2, 1, i);
    }

    public static final void A0w(NewsletterInfoActivity newsletterInfoActivity) {
        C39001qm A002 = AnonymousClass3LW.A00(newsletterInfoActivity);
        A002.A0p(C36381kD.A0r(newsletterInfoActivity, newsletterInfoActivity.A3t().A0K, AnonymousClass001.A0L(), R.string.f12nameremoved));
        A002.A0l(newsletterInfoActivity, C67963b7.A00, R.string.f12nameremoved);
        C39001qm.A06(newsletterInfoActivity, A002, 40, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public static final void A0x(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.Bu1(R.string.f12nameremoved);
        NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0v;
        if (newsletterViewModel == null) {
            throw C36331k8.A0d("newsletterViewModel");
        }
        newsletterViewModel.A04.A09(newsletterInfoActivity.A3v());
        newsletterInfoActivity.A3x().A0C(newsletterInfoActivity.A3v(), C65903Tx.A00(newsletterInfoActivity.getIntent()), C52512pY.NEWSLETTER_INFO, newsletterInfoActivity.A0u(), (String) null, C65903Tx.A01(newsletterInfoActivity), -1);
        C33521fV.A00(newsletterInfoActivity, newsletterInfoActivity.A08, C36391kE.A0v(newsletterInfoActivity, newsletterInfoActivity.A3t().A0K, AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
        if (newsletterInfoActivity.getIntent().getStringExtra("wamo_pc_id") != null && newsletterInfoActivity.A09 == null) {
            throw C36331k8.A0d("pcItemLogger");
        }
    }

    public static final void A0y(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.Bu1(R.string.f12nameremoved);
        NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0v;
        if (newsletterViewModel == null) {
            throw C36331k8.A0d("newsletterViewModel");
        }
        newsletterViewModel.A04.A08(newsletterInfoActivity.A3v());
        newsletterInfoActivity.A3x().A0A(newsletterInfoActivity.A3v(), C65903Tx.A00(newsletterInfoActivity.getIntent()), C52512pY.NEWSLETTER_INFO, newsletterInfoActivity.A0u(), C65903Tx.A01(newsletterInfoActivity));
    }

    public static final void A0z(NewsletterInfoActivity newsletterInfoActivity) {
        A19(newsletterInfoActivity, newsletterInfoActivity.A3t().A0M());
        if (newsletterInfoActivity.A3t().A0N() && AnonymousClass22g.A0s(newsletterInfoActivity)) {
            C36331k8.A0y(newsletterInfoActivity.findViewById(R.id.unfollow_and_report_card));
        }
        AnonymousClass3QQ r1 = newsletterInfoActivity.A0P;
        if (r1 != null) {
            AnonymousClass141 r0 = newsletterInfoActivity.A0Y;
            if (r0 == null) {
                throw C36331k8.A0d("contact");
            }
            r1.A02(r0);
        }
    }

    public static final void A11(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.Bu1(R.string.f12nameremoved);
        NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0v;
        if (newsletterViewModel == null) {
            throw C36331k8.A0d("newsletterViewModel");
        }
        newsletterViewModel.A0S(newsletterInfoActivity.A3v());
        newsletterInfoActivity.A3x().A0D(newsletterInfoActivity.A3v(), C65903Tx.A00(newsletterInfoActivity.getIntent()), C52512pY.NEWSLETTER_INFO, newsletterInfoActivity.A0u(), (String) null, C65903Tx.A01(newsletterInfoActivity), -1);
        C33521fV.A00(newsletterInfoActivity, newsletterInfoActivity.A08, C36391kE.A0v(newsletterInfoActivity, newsletterInfoActivity.A3t().A0K, AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
        if (newsletterInfoActivity.getIntent().getStringExtra("wamo_pc_id") != null && newsletterInfoActivity.A09 == null) {
            throw C36331k8.A0d("pcItemLogger");
        }
    }

    public static final void A12(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.Bu1(R.string.f12nameremoved);
        NewsletterViewModel newsletterViewModel = newsletterInfoActivity.A0v;
        if (newsletterViewModel == null) {
            throw C36331k8.A0d("newsletterViewModel");
        }
        newsletterViewModel.A0T(newsletterInfoActivity.A3v());
        newsletterInfoActivity.A3x().A0B(newsletterInfoActivity.A3v(), C65903Tx.A00(newsletterInfoActivity.getIntent()), C52512pY.NEWSLETTER_INFO, newsletterInfoActivity.A0u(), C65903Tx.A01(newsletterInfoActivity));
    }

    public static final void A13(NewsletterInfoActivity newsletterInfoActivity) {
        int i = (int) newsletterInfoActivity.A3t().A07;
        Resources resources = newsletterInfoActivity.getResources();
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L2, i);
        C36351kA.A16(resources, (TextView) newsletterInfoActivity.A1C.getValue(), A0L2, R.plurals.f10nameremoved, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r4.A0N != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A14(com.whatsapp.newsletter.NewsletterInfoActivity r7) {
        /*
            X.2La r4 = r7.A3t()
            X.3G3 r0 = r7.A3y()
            boolean r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x001f
            boolean r0 = r4.A0N()
            if (r0 == 0) goto L_0x001f
            r0 = 2131434925(0x7f0b1dad, float:1.8491678E38)
            android.view.View r0 = r7.findViewById(r0)
            X.C36331k8.A0y(r0)
        L_0x001e:
            return
        L_0x001f:
            X.3G3 r0 = r7.A3y()
            boolean r1 = r0.A00(r4)
            r0 = 2131433302(0x7f0b1756, float:1.8488386E38)
            android.view.View r3 = X.C36361kB.A0D(r7, r0)
            r2 = 0
            if (r1 != 0) goto L_0x0036
            boolean r1 = r4.A0N
            r0 = 1
            if (r1 == 0) goto L_0x0039
        L_0x0036:
            r0 = 0
            r2 = 8
        L_0x0039:
            r3.setVisibility(r2)
            if (r0 == 0) goto L_0x004d
            r0 = 2131433302(0x7f0b1756, float:1.8488386E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            r0 = 35
            X.C48752hz.A00(r1, r7, r0)
            X.C33521fV.A02(r1)
        L_0x004d:
            boolean r0 = r4.A0M()
            A19(r7, r0)
            r0 = 2131431963(0x7f0b121b, float:1.848567E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            boolean r0 = A1D(r7)
            r3 = 8
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            r0 = 2131429613(0x7f0b08ed, float:1.8480904E38)
            android.view.View r2 = X.C36361kB.A0D(r7, r0)
            X.2La r1 = r7.A3t()
            boolean r0 = r1.A0N
            if (r0 != 0) goto L_0x007e
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.ADMIN
            if (r1 != r0) goto L_0x007e
            r3 = 0
        L_0x007e:
            r2.setVisibility(r3)
            X.2La r1 = r7.A3t()
            boolean r0 = r1.A0N
            if (r0 != 0) goto L_0x009c
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.ADMIN
            if (r1 != r0) goto L_0x009c
            r1 = 1
            r0 = 0
            A1A(r7, r1, r0)
            r0 = 37
            X.C48752hz.A00(r2, r7, r0)
            X.C33521fV.A02(r2)
        L_0x009c:
            X.2La r0 = r7.A3t()
            boolean r6 = r0.A0O()
            r0 = 2131429474(0x7f0b0862, float:1.8480622E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            r5 = 0
            int r0 = X.C36351kA.A00(r6)
            r1.setVisibility(r0)
            if (r6 == 0) goto L_0x00ea
            r0 = 38
            X.C48752hz.A00(r1, r7, r0)
            X.C33521fV.A02(r1)
            X.1GQ r0 = r7.A0h
            if (r0 == 0) goto L_0x0202
            X.0yC r1 = r0.A00
            r0 = 7245(0x1c4d, float:1.0152E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00ea
            X.2EJ r4 = r7.A0j
            if (r4 != 0) goto L_0x00d6
            java.lang.String r0 = "newsletterInfoViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00d6:
            X.1Uw r3 = X.AnonymousClass22g.A0F(r7)
            X.AnonymousClass00C.A0D(r3, r5)
            X.040 r2 = X.C109325Xd.A00(r4)
            r1 = 0
            com.whatsapp.newsletter.NewsletterInfoViewModel$fetchAdminCount$1 r0 = new com.whatsapp.newsletter.NewsletterInfoViewModel$fetchAdminCount$1
            r0.<init>(r3, r4, r1)
            X.C36331k8.A1T(r0, r2)
        L_0x00ea:
            X.1GQ r0 = r7.A0h
            if (r0 == 0) goto L_0x0210
            X.0yC r1 = r0.A00
            r0 = 7124(0x1bd4, float:9.983E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0119
            X.00T r0 = r7.A1G
            java.lang.Object r2 = r0.getValue()
            X.1RJ r2 = (X.AnonymousClass1RJ) r2
            if (r6 != 0) goto L_0x0104
            r5 = 8
        L_0x0104:
            r2.A03(r5)
            if (r6 == 0) goto L_0x0119
            android.view.View r1 = r2.A01()
            r0 = 39
            X.C48752hz.A00(r1, r7, r0)
            android.view.View r0 = r2.A01()
            X.C33521fV.A02(r0)
        L_0x0119:
            X.2La r0 = r7.A3t()
            boolean r0 = r0.A0O()
            java.lang.String r5 = "newsletterInfoViewModel"
            if (r0 == 0) goto L_0x0190
            X.1wR r0 = r7.A0r
            if (r0 != 0) goto L_0x0175
            X.3Bw r4 = r7.A0H
            if (r4 == 0) goto L_0x0209
            android.view.LayoutInflater r3 = r7.getLayoutInflater()
            X.AnonymousClass00C.A08(r3)
            X.1RY r1 = r7.A0T
            r2 = 0
            if (r1 != 0) goto L_0x0140
            java.lang.String r0 = "contactPhotoLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0140:
            r0 = 0
            X.1wR r0 = r4.A00(r3, r1, r7, r0)
            r7.A0r = r0
            r0 = 2131427654(0x7f0b0146, float:1.847693E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.1wR r0 = r7.A0r
            r1.setAdapter(r0)
            com.whatsapp.newsletter.NewsletterInfoActivity$initInvitedAdminListLayout$layoutManager$1 r0 = new com.whatsapp.newsletter.NewsletterInfoActivity$initInvitedAdminListLayout$layoutManager$1
            r0.<init>()
            r1.setLayoutManager(r0)
            r1.setItemAnimator(r2)
            X.2EJ r0 = r7.A0j
            if (r0 != 0) goto L_0x0169
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0169:
            X.00s r2 = r0.A06
            X.4KW r1 = new X.4KW
            r1.<init>(r7)
            r0 = 45
            X.C66023Uj.A01(r7, r2, r1, r0)
        L_0x0175:
            X.2EJ r4 = r7.A0j
            if (r4 != 0) goto L_0x017e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x017e:
            X.1Uw r3 = r7.A3v()
            X.040 r2 = X.C109325Xd.A00(r4)
            r1 = 0
            com.whatsapp.newsletter.NewsletterInfoViewModel$fetchPendingAdmins$1 r0 = new com.whatsapp.newsletter.NewsletterInfoViewModel$fetchPendingAdmins$1
            r0.<init>(r3, r4, r1)
            X.C36331k8.A1T(r0, r2)
            goto L_0x01a0
        L_0x0190:
            X.2EJ r0 = r7.A0j
            if (r0 != 0) goto L_0x0199
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0199:
            X.00s r1 = r0.A06
            X.02c r0 = X.C004702c.A00
            r1.A0C(r0)
        L_0x01a0:
            boolean r2 = A1D(r7)
            r0 = 2131431964(0x7f0b121c, float:1.8485672E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x001e
            X.2La r0 = r7.A3t()
            boolean r2 = r0.A0O()
            r0 = 2131430997(0x7f0b0e55, float:1.848371E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            int r0 = X.C36351kA.A00(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x01d1
            r0 = 8
            X.AnonymousClass3Y4.A00(r1, r7, r0)
        L_0x01d1:
            r0 = 2131431982(0x7f0b122e, float:1.8485709E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            r0 = 6
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            X.2La r0 = r7.A3t()
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x01f3
            r0 = 2131431021(0x7f0b0e6d, float:1.848376E38)
            android.widget.TextView r1 = X.C36401kF.A0H(r7, r0)
            r0 = 2131891497(0x7f121529, float:1.9417716E38)
            r1.setText(r0)
        L_0x01f3:
            r0 = 2131431966(0x7f0b121e, float:1.8485676E38)
            android.view.View r1 = X.C36361kB.A0D(r7, r0)
            r0 = 3
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            A13(r7)
            return
        L_0x0202:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0209:
            java.lang.String r0 = "newsletterInvitedAdminsListAdapterFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0210:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A14(com.whatsapp.newsletter.NewsletterInfoActivity):void");
    }

    public static final void A15(NewsletterInfoActivity newsletterInfoActivity) {
        String str = newsletterInfoActivity.A3t().A0H;
        if (str == null) {
            str = "";
        }
        int dimensionPixelSize = newsletterInfoActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (!AnonymousClass000.A1R(str.length()) || AnonymousClass22g.A0s(newsletterInfoActivity)) {
            boolean A0t2 = AnonymousClass22g.A0t(newsletterInfoActivity);
            View view = newsletterInfoActivity.A00;
            if (A0t2) {
                if (view == null) {
                    throw C36331k8.A0d("descriptionCard");
                }
                view.setVisibility(0);
                View view2 = newsletterInfoActivity.A02;
                if (view2 == null) {
                    throw C36331k8.A0d("hasDescription");
                }
                view2.setVisibility(8);
                WaTextView waTextView = newsletterInfoActivity.A0L;
                if (waTextView == null) {
                    throw C36331k8.A0d("noDescription");
                }
                waTextView.setVisibility(0);
            } else if (view == null) {
                throw C36331k8.A0d("descriptionCard");
            } else {
                view.setVisibility(0);
                View view3 = newsletterInfoActivity.A02;
                if (view3 == null) {
                    throw C36331k8.A0d("hasDescription");
                }
                view3.setVisibility(8);
                WaTextView waTextView2 = newsletterInfoActivity.A0L;
                if (waTextView2 == null) {
                    throw C36331k8.A0d("noDescription");
                }
                waTextView2.setVisibility(8);
                dimensionPixelSize = 0;
            }
        } else {
            View view4 = newsletterInfoActivity.A00;
            if (view4 == null) {
                throw C36331k8.A0d("descriptionCard");
            }
            view4.setVisibility(0);
            View view5 = newsletterInfoActivity.A02;
            if (view5 == null) {
                throw C36331k8.A0d("hasDescription");
            }
            view5.setVisibility(0);
            WaTextView waTextView3 = newsletterInfoActivity.A0L;
            if (waTextView3 == null) {
                throw C36331k8.A0d("noDescription");
            }
            waTextView3.setVisibility(8);
            C21060yb r5 = newsletterInfoActivity.A08;
            C19890wg r2 = newsletterInfoActivity.A0y;
            if (r2 != null) {
                ReadMoreTextView readMoreTextView = newsletterInfoActivity.A12;
                if (readMoreTextView == null) {
                    throw C36331k8.A0d("descriptionTextView");
                }
                SpannableStringBuilder A0P2 = C36441kJ.A0P(AnonymousClass6YV.A08(r5, r2, AnonymousClass3UG.A03(newsletterInfoActivity, readMoreTextView.getPaint(), newsletterInfoActivity.A0C, str)));
                C32681e1 r1 = newsletterInfoActivity.A13;
                if (r1 != null) {
                    ReadMoreTextView readMoreTextView2 = newsletterInfoActivity.A12;
                    if (readMoreTextView2 == null) {
                        throw C36331k8.A0d("descriptionTextView");
                    }
                    r1.A04(readMoreTextView2.getContext(), A0P2);
                    ReadMoreTextView readMoreTextView3 = newsletterInfoActivity.A12;
                    if (readMoreTextView3 == null) {
                        throw C36331k8.A0d("descriptionTextView");
                    }
                    readMoreTextView3.A0I(A0P2);
                } else {
                    throw C36331k8.A0b();
                }
            } else {
                throw C36331k8.A0d("sharedPreferencesFactory");
            }
        }
        if (AnonymousClass22g.A0t(newsletterInfoActivity)) {
            View view6 = newsletterInfoActivity.A00;
            if (view6 == null) {
                throw C36331k8.A0d("descriptionCard");
            }
            AnonymousClass3Y4.A00(view6, newsletterInfoActivity, 9);
        }
        long A082 = newsletterInfoActivity.A07.A08(newsletterInfoActivity.A3t().A0Q);
        WaTextView waTextView4 = newsletterInfoActivity.A0K;
        if (waTextView4 == null) {
            throw C36331k8.A0d("creationInfoView");
        }
        waTextView4.setText(AnonymousClass3UY.A0G(newsletterInfoActivity.A00, new Object[0], R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, A082, false));
        WaTextView waTextView5 = newsletterInfoActivity.A0K;
        if (waTextView5 == null) {
            throw C36331k8.A0d("creationInfoView");
        }
        C65723Tf.A02(waTextView5, new AnonymousClass3QI(0, dimensionPixelSize, 0, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r6 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r6 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r6 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r5 == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A16(com.whatsapp.newsletter.NewsletterInfoActivity r7) {
        /*
            boolean r6 = X.AnonymousClass22g.A0s(r7)
            boolean r5 = X.AnonymousClass22g.A0t(r7)
            r3 = 8
            if (r6 == 0) goto L_0x001b
            if (r5 != 0) goto L_0x001b
            r0 = 2131429075(0x7f0b06d3, float:1.8479812E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x001a
            r0.setVisibility(r3)
        L_0x001a:
            return
        L_0x001b:
            r0 = 2131432018(0x7f0b1252, float:1.8485782E38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 == 0) goto L_0x002e
            if (r5 != 0) goto L_0x0029
            r0 = 0
            if (r6 == 0) goto L_0x002b
        L_0x0029:
            r0 = 8
        L_0x002b:
            r1.setVisibility(r0)
        L_0x002e:
            r0 = 2131432019(0x7f0b1253, float:1.8485784E38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 == 0) goto L_0x0046
            if (r5 == 0) goto L_0x003c
            r0 = 0
            if (r6 == 0) goto L_0x003e
        L_0x003c:
            r0 = 8
        L_0x003e:
            r1.setVisibility(r0)
            r0 = 14
            X.AnonymousClass3Y4.A00(r1, r7, r0)
        L_0x0046:
            r0 = 2131432017(0x7f0b1251, float:1.848578E38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 == 0) goto L_0x005e
            if (r5 != 0) goto L_0x0054
            r0 = 0
            if (r6 == 0) goto L_0x0056
        L_0x0054:
            r0 = 8
        L_0x0056:
            r1.setVisibility(r0)
            r0 = 11
            X.AnonymousClass3Y4.A00(r1, r7, r0)
        L_0x005e:
            r0 = 2131432034(0x7f0b1262, float:1.8485814E38)
            android.view.View r4 = r7.findViewById(r0)
            if (r4 == 0) goto L_0x0094
            X.1GQ r0 = r7.A0h
            if (r0 == 0) goto L_0x00b6
            X.0yC r1 = r0.A00
            r0 = 4887(0x1317, float:6.848E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0078
            r2 = 1
            if (r5 != 0) goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            X.1GQ r0 = r7.A0h
            if (r0 == 0) goto L_0x00af
            X.0yC r1 = r0.A00
            r0 = 5625(0x15f9, float:7.882E-42)
            boolean r0 = r1.A0E(r0)
            if (r6 != 0) goto L_0x00ac
            if (r2 != 0) goto L_0x008b
            if (r0 == 0) goto L_0x00ac
        L_0x008b:
            r0 = 0
        L_0x008c:
            r4.setVisibility(r0)
            r0 = 10
            X.AnonymousClass3Y4.A00(r4, r7, r0)
        L_0x0094:
            r0 = 2131431936(0x7f0b1200, float:1.8485615E38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 == 0) goto L_0x001a
            boolean r0 = X.AnonymousClass22g.A0t(r7)
            if (r0 == 0) goto L_0x00a4
            r3 = 0
        L_0x00a4:
            r1.setVisibility(r3)
            r0 = 5
            X.AnonymousClass3Y4.A00(r1, r7, r0)
            return
        L_0x00ac:
            r0 = 8
            goto L_0x008c
        L_0x00af:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b6:
            java.lang.String r0 = "newsletterConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A16(com.whatsapp.newsletter.NewsletterInfoActivity):void");
    }

    public static final void A19(NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        View A0D2 = C36361kB.A0D(newsletterInfoActivity, R.id.unfollow_newsletter_btn);
        A0D2.setVisibility(C36351kA.A00(z ? 1 : 0));
        C48752hz.A00(A0D2, newsletterInfoActivity, 36);
        C33521fV.A02(A0D2);
    }

    public static final void A1A(NewsletterInfoActivity newsletterInfoActivity, boolean z, boolean z2) {
        int i;
        if (A1D(newsletterInfoActivity) || AnonymousClass22g.A0t(newsletterInfoActivity)) {
            TextView A0Q2 = C36391kE.A0Q(newsletterInfoActivity, R.id.newsletter_followers_footer_text);
            if (!AnonymousClass22g.A0t(newsletterInfoActivity) || (!z && !z2)) {
                if (A0Q2 != null) {
                    i = R.string.f12nameremoved;
                } else {
                    return;
                }
            } else if (A0Q2 != null) {
                i = R.string.f12nameremoved;
            } else {
                return;
            }
            A0Q2.setText(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r1.A09 == X.C52382pL.ADMIN) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r7 != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1B(com.whatsapp.newsletter.NewsletterInfoActivity r5, boolean r6, boolean r7) {
        /*
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x000d
            if (r6 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            r0 = 2131427538(0x7f0b00d2, float:1.8476695E38)
            android.view.View r4 = r5.findViewById(r0)
            if (r4 == 0) goto L_0x000c
            boolean r0 = X.AnonymousClass22g.A0s(r5)
            r2 = 0
            if (r0 != 0) goto L_0x0053
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0N
            if (r0 != 0) goto L_0x0053
            r3 = 0
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0M()
            if (r0 != 0) goto L_0x0040
            X.2La r1 = r5.A3t()
            boolean r0 = r1.A0N
            if (r0 != 0) goto L_0x003e
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.ADMIN
            if (r1 == r0) goto L_0x0040
        L_0x003e:
            if (r7 == 0) goto L_0x0054
        L_0x0040:
            r0 = 0
        L_0x0041:
            r4.setVisibility(r0)
            if (r3 != 0) goto L_0x000c
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x0057
            if (r7 != 0) goto L_0x0057
            return
        L_0x0053:
            r3 = 1
        L_0x0054:
            r0 = 8
            goto L_0x0041
        L_0x0057:
            android.view.View r1 = r5.A00
            r0 = 2131431844(0x7f0b11a4, float:1.8485429E38)
            android.view.View r3 = X.C36361kB.A0G(r1, r0)
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0M()
            if (r0 != 0) goto L_0x007c
            X.2La r1 = r5.A3t()
            boolean r0 = r1.A0N
            if (r0 != 0) goto L_0x0078
            X.2pL r1 = r1.A09
            X.2pL r0 = X.C52382pL.ADMIN
            if (r1 == r0) goto L_0x007c
        L_0x0078:
            if (r7 != 0) goto L_0x007c
            r2 = 8
        L_0x007c:
            r3.setVisibility(r2)
            r1 = r3
            com.whatsapp.ListItemWithLeftIcon r1 = (com.whatsapp.ListItemWithLeftIcon) r1
            r0 = 2131431247(0x7f0b0f4f, float:1.8484218E38)
            android.widget.TextView r2 = X.C36341k9.A0M(r1, r0)
            r0 = 2131431846(0x7f0b11a6, float:1.8485433E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r5.A08 = r0
            r0 = 2131886151(0x7f120047, float:1.9406873E38)
            X.C33521fV.A03(r3, r0)
            androidx.appcompat.widget.SwitchCompat r0 = r5.A08
            if (r0 != 0) goto L_0x00a4
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = X.C53462rM.A00(r5, r1)
            r5.A08 = r0
        L_0x00a4:
            r1 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
            X.C36321k7.A0M(r5, r2, r1, r0)
            androidx.appcompat.widget.SwitchCompat r1 = r5.A08
            if (r1 == 0) goto L_0x000c
            r0 = 2131886193(0x7f120071, float:1.9406958E38)
            X.C36331k8.A0q(r5, r1, r0)
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0O
            r1.setChecked(r0)
            X.2La r0 = r5.A3t()
            boolean r0 = r0.A0N
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            r0 = 15
            X.AnonymousClass4XY.A00(r1, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A1B(com.whatsapp.newsletter.NewsletterInfoActivity, boolean, boolean):void");
    }

    public static final boolean A1D(NewsletterInfoActivity newsletterInfoActivity) {
        if (!AnonymousClass22g.A0t(newsletterInfoActivity) || !newsletterInfoActivity.A0D.A0E(4307)) {
            return false;
        }
        return true;
    }

    public void A3l() {
        super.A3l();
        AnonymousClass2EJ r0 = this.A0j;
        if (r0 == null) {
            throw C36331k8.A0d("newsletterInfoViewModel");
        }
        AnonymousClass2LF r1 = r0.A0B;
        C36351kA.A1H(r1.A00);
        r1.A00 = null;
    }

    public final void A40(boolean z) {
        CharSequence charSequence;
        A3x().A07(15, false);
        NewsletterInfoLayout newsletterInfoLayout = this.A0Q;
        if (newsletterInfoLayout == null) {
            throw C36331k8.A0d("rootLayout");
        }
        C011504z.A06(newsletterInfoLayout, 4);
        AnonymousClass09Y A0O2 = C36341k9.A0O(this);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.newsletter_followers_footer_text);
        if (A0Q2 != null) {
            charSequence = A0Q2.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        boolean A1R = AnonymousClass000.A1R((A3t().A07 > 5000 ? 1 : (A3t().A07 == 5000 ? 0 : -1)));
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = new NewsletterInfoMembersSearchFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("footer_text", valueOf);
        A072.putBoolean("enter_ime", z);
        A072.putBoolean("is_over_max", A1R);
        A072.putBoolean("enter_animated", true);
        A072.putBoolean("exit_animated", true);
        newsletterInfoMembersSearchFragment.A17(A072);
        A0O2.A0B(newsletterInfoMembersSearchFragment, R.id.search_container);
        A0O2.A0J((String) null);
        A0O2.A01();
    }

    public void BkS() {
        A10(this);
    }

    public void onBackPressed() {
        AnonymousClass02E A0L2 = getSupportFragmentManager().A0L(R.id.search_container);
        if (A0L2 instanceof AnonymousClass4RE) {
            ((AnonymousClass4RE) A0L2).B75();
            return;
        }
        if (isTaskRoot()) {
            Intent A0F2 = C36391kE.A0F(this, A3u(), A3v());
            AnonymousClass00C.A08(A0F2);
            finishAndRemoveTask();
            startActivity(A0F2);
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!AnonymousClass22g.A0s(this) && AnonymousClass22g.A0t(this) && menu != null) {
            menu.add(0, 1001, 0, getString(R.string.f12nameremoved));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C28981Uw A3v;
        Intent A0D2;
        String packageName;
        String str;
        int A062 = C36341k9.A06(menuItem);
        if (A062 != 1001) {
            if (A062 != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            AnonymousClass0PG.A00(this);
            if (!isTaskRoot()) {
                return true;
            }
            Intent A0F2 = C36391kE.A0F(this, A3u(), A3v());
            AnonymousClass00C.A08(A0F2);
            finishAndRemoveTask();
            startActivity(A0F2);
            return true;
        } else if (!AnonymousClass22g.A0t(this)) {
            this.A05.A0H(new C1497272n(this, 42));
            return true;
        } else {
            A3x().A0H(false);
            if (!this.A0D.A0E(6618) || !A3t().A0P()) {
                A3u();
                A3v = A3v();
                A0D2 = C36431kI.A0D();
                packageName = getPackageName();
                str = "com.whatsapp.newsletter.ui.NewsletterEditActivity";
            } else {
                A3u();
                A3v = A3v();
                A0D2 = C36431kI.A0D();
                packageName = getPackageName();
                str = "com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity";
            }
            C36331k8.A0u(A0D2, A3v, packageName, str);
            startActivityForResult(A0D2, 50);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        C30131Zi r1 = this.A0n;
        if (r1 != null) {
            r1.A05(A3v());
            AnonymousClass2EJ r0 = this.A0j;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterInfoViewModel");
            }
            boolean z = false;
            r0.A0W(false);
            NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = this.A0i;
            if (newsletterInfoMembersListViewModel != null) {
                newsletterInfoMembersListViewModel.A0S(C52172p0.SHORT);
            }
            if (this.A0u != null) {
                if (C36401kF.A0F(this.A1F).getVisibility() == 0) {
                    z = true;
                }
                A18(this, z);
                return;
            }
            return;
        }
        throw C36331k8.A0d("newsletterManager");
    }

    public void onStart() {
        super.onStart();
        if (this.A15 > 0) {
            C32241dD A3x = A3x();
            C28981Uw A3v = A3v();
            long uptimeMillis = SystemClock.uptimeMillis() - this.A15;
            C28081Rg r6 = A3x.A05;
            r6.A0J.Boy(new C80763vv((C45682Sh) null, A3v, r6, 17, 0, 0, uptimeMillis));
            this.A15 = 0;
        }
    }
}
