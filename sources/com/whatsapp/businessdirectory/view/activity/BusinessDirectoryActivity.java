package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass13I;
import X.AnonymousClass16P;
import X.AnonymousClass1QW;
import X.AnonymousClass1RU;
import X.AnonymousClass3SK;
import X.AnonymousClass67X;
import X.AnonymousClass6L0;
import X.AnonymousClass6QK;
import X.AnonymousClass79B;
import X.C101004wU;
import X.C106485Jw;
import X.C129406Gu;
import X.C134986bw;
import X.C20810yC;
import X.C25271Fq;
import X.C28961Uu;
import X.C36341k9;
import X.C36361kB;
import X.C63063Ip;
import X.C90484aE;
import X.C90494aF;
import X.C95394km;
import X.C96464nN;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Menu;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.TimerTask;

public class BusinessDirectoryActivity extends C101004wU {
    public C28961Uu A00;
    public AnonymousClass1RU A01;
    public AnonymousClass6L0 A02;
    public AnonymousClass67X A03;
    public C106485Jw A04;
    public BusinessDirectoryContextualSearchFragment A05;
    public BusinessDirectoryActivityViewModel A06;
    public C25271Fq A07;
    public AnonymousClass1QW A08;
    public AnonymousClass13I A09;
    public AnonymousClass16P A0A;
    public TimerTask A0B;
    public boolean A0C;
    public boolean A0D;
    public Menu A0E;
    public boolean A0F;
    public final Timer A0G = new Timer();

    public void A3q(boolean z) {
        A3n(new BusinessDirectoryConsumerHomeFragment(), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r8 = r13
            super.onCreate(r14)
            r0 = 2131624015(0x7f0e004f, float:1.8875198E38)
            r13.setContentView((int) r0)
            if (r14 == 0) goto L_0x0025
            java.lang.String r0 = "arg_show_search_menu"
            r1 = 0
            boolean r0 = r14.getBoolean(r0, r1)
            r13.A0F = r0
            java.lang.String r0 = "arg_show_search_view"
            boolean r0 = r14.getBoolean(r0, r1)
            r13.A0D = r0
            java.lang.String r0 = "arg_go_back_to_utilities"
            boolean r0 = r14.getBoolean(r0, r1)
            r13.A0C = r0
        L_0x0025:
            r0 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r11 = r13.findViewById(r0)
            androidx.appcompat.widget.Toolbar r11 = (androidx.appcompat.widget.Toolbar) r11
            X.07B r1 = X.C36431kI.A0Q(r13, r11)
            X.C18740tg.A06(r1)
            r0 = 1
            r1.A0V(r0)
            r1.A0U(r0)
            r0 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r9 = r13.findViewById(r0)
            X.0ts r12 = r13.A00
            r2 = 1
            X.6UC r10 = new X.6UC
            r10.<init>(r13, r2)
            X.5Jw r7 = new X.5Jw
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A04 = r7
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x0059
            r13.A3j()
        L_0x0059:
            r0 = 2131886815(0x7f1202df, float:1.940822E38)
            r13.setTitle(r0)
            X.04H r1 = X.C36441kJ.A0b(r13)
            java.lang.Class<com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel> r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel.class
            X.04R r0 = r1.A00(r0)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r0 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel) r0
            r13.A06 = r0
            X.1Rs r3 = r0.A01
            r1 = 40
            X.2ui r0 = new X.2ui
            r0.<init>(r13, r1)
            r3.A08(r13, r0)
            if (r14 != 0) goto L_0x00d8
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r4 = "INITIAL_CATEGORY"
            android.os.Parcelable r3 = r0.getParcelableExtra(r4)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "ARG_DIRECTORY_SHOULD_GO_BACK_TO_UTILITIES"
            r6 = 0
            boolean r0 = r1.getBooleanExtra(r0, r6)
            r13.A0C = r0
            if (r3 != 0) goto L_0x011a
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r7 = "directory_biz_chaining_jid"
            android.os.Parcelable r5 = r0.getParcelableExtra(r7)
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r4 = "directory_biz_chaining_name"
            java.lang.String r3 = r0.getStringExtra(r4)
            if (r5 == 0) goto L_0x0116
            if (r3 == 0) goto L_0x0116
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            r0.putParcelable(r7, r5)
            r0.putString(r4, r3)
        L_0x00bb:
            r1.A17(r0)
            r13.A3n(r1, r6)
        L_0x00c1:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r3 = r13.A06
            X.5DR r0 = r3.A00
            X.9Qj r0 = r0.A03
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "is_nux"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x00d8
            X.1Rs r0 = r3.A01
            X.C36341k9.A17(r0, r6)
        L_0x00d8:
            X.1QW r0 = r13.A08
            X.0yC r1 = r0.A03
            boolean r0 = X.C90494aF.A1X(r1)
            if (r0 == 0) goto L_0x0115
            r0 = 1883(0x75b, float:2.639E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0115
            X.6L0 r0 = r13.A02
            boolean r3 = r0.A02
            X.0yC r1 = r0.A03
            r0 = 2010(0x7da, float:2.817E-42)
            if (r3 == 0) goto L_0x00f6
            r0 = 2011(0x7db, float:2.818E-42)
        L_0x00f6:
            java.lang.String r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0115
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0115
            r0 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.7r5 r0 = new X.7r5
            r0.<init>(r13, r2)
            r1.addOnPreDrawListener(r0)
        L_0x0115:
            return
        L_0x0116:
            r13.A3q(r6)
            goto L_0x00c1
        L_0x011a:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass001.A07()
            r0.putParcelable(r4, r3)
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 4, 1, getString(R.string.f12nameremoved));
        this.A0E = menu;
        if (this.A0F) {
            A3k();
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void A07() {
        C20810yC r1 = this.A08.A03;
        if (C90494aF.A1X(r1) && r1.A0E(1883)) {
            AnonymousClass6L0 r0 = this.A02;
            boolean z = r0.A02;
            C20810yC r12 = r0.A03;
            int i = 2010;
            if (z) {
                i = 2011;
            }
            String A092 = r12.A09(i);
            if (!(A092 == null || A092.length() == 0)) {
                TimerTask timerTask = this.A0B;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                AnonymousClass79B r13 = new AnonymousClass79B(this);
                this.A0B = r13;
                this.A0G.schedule(r13, 0, 7000);
                return;
            }
        }
        C106485Jw r2 = this.A04;
        if (r2 != null) {
            String string = getString(R.string.f12nameremoved);
            SearchView searchView = r2.A00;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
        }
    }

    public static void A0F(BusinessDirectoryActivity businessDirectoryActivity) {
        C106485Jw r1 = businessDirectoryActivity.A04;
        if (r1 != null) {
            r1.A05(true);
        }
        if (!businessDirectoryActivity.isDestroyed() && !businessDirectoryActivity.isFinishing()) {
            AnonymousClass01z.A0H(businessDirectoryActivity.getSupportFragmentManager(), (String) null);
        }
    }

    public static void A0G(BusinessDirectoryActivity businessDirectoryActivity, String str) {
        BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = businessDirectoryActivity.A05;
        if (businessDirectoryContextualSearchFragment != null) {
            C96464nN r1 = businessDirectoryContextualSearchFragment.A0B;
            r1.A00 = 0;
            r1.A01.clear();
            businessDirectoryContextualSearchFragment.A08.A0V(str);
        }
        if (TextUtils.isEmpty(str)) {
            businessDirectoryActivity.A07();
        } else if (businessDirectoryActivity.A0B != null) {
            C106485Jw r12 = businessDirectoryActivity.A04;
            if (r12 != null) {
                ObjectAnimator objectAnimator = r12.A02;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimator2 = r12.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator objectAnimator3 = r12.A01;
                if (objectAnimator3 != null) {
                    objectAnimator3.cancel();
                }
                ObjectAnimator objectAnimator4 = r12.A00;
                if (objectAnimator4 != null) {
                    objectAnimator4.cancel();
                }
                r12.A04.clearAnimation();
                r12.A05.clearAnimation();
            }
            businessDirectoryActivity.A0B.cancel();
        }
    }

    public void A3i() {
        Menu menu = this.A0E;
        if (!(menu == null || menu.findItem(1) == null)) {
            this.A0E.removeItem(1);
        }
        this.A0F = false;
    }

    public void A3j() {
        C106485Jw r0 = this.A04;
        if (r0 != null && !r0.A07()) {
            this.A04.A06(false);
            A07();
            this.A04.A00.requestFocus();
            C36361kB.A18(this.A04.A04.findViewById(R.id.search_back), this, 32);
        }
    }

    public void A3k() {
        Menu menu = this.A0E;
        if (menu != null && menu.findItem(1) == null) {
            this.A0E.add(0, 1, 0, getString(R.string.f12nameremoved)).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        }
        this.A0F = true;
    }

    public void A3p(String str) {
        C106485Jw r0 = this.A04;
        if (r0 != null) {
            Editable text = r0.A00.A0d.getText();
            if (text == null || !str.equals(text.toString())) {
                this.A04.A00.A0I(str);
            } else {
                A0G(this, str);
            }
        }
    }

    public void onBackPressed() {
        C106485Jw r0 = this.A04;
        if (r0 != null && r0.A07()) {
            this.A04.A05(true);
        }
        this.A05.A00();
    }

    public void onResume() {
        if (this.A09.A00) {
            Log.i("BusinessDirectoryActivity/onResume WhatsApp login failed");
            this.A07.A03(20, "DirectoryLoginFailed");
            AnonymousClass3SK.A01(this, this.A01, this.A0D);
        } else if (this.A00.A00() != null && this.A0D.A0E(2466)) {
            Log.i("home/show-account-logout-request");
            C63063Ip A002 = this.A00.A00();
            this.A00.A01((C63063Ip) null);
            this.A07.A03(52, "HomeActivityShowingDialog");
            AnonymousClass3SK.A00(this, A002);
        }
        super.onResume();
    }

    public static BusinessDirectorySearchFragment A01(BusinessDirectoryActivity businessDirectoryActivity) {
        AnonymousClass02E A0N = businessDirectoryActivity.getSupportFragmentManager().A0N("BusinessDirectorySearchFragment");
        if (A0N instanceof BusinessDirectorySearchFragment) {
            return (BusinessDirectorySearchFragment) A0N;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == 2) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3l() {
        /*
            r5 = this;
            X.01z r0 = r5.getSupportFragmentManager()
            X.021 r2 = r0.A0T
            java.util.List r0 = r2.A04()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008b
            r2 = 0
        L_0x0011:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            if (r0 == 0) goto L_0x0053
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r2
            X.4km r2 = r2.A0B
            int r1 = r2.A02
            if (r1 == 0) goto L_0x0021
            r0 = 2
            r4 = 2
            if (r1 != r0) goto L_0x0022
        L_0x0021:
            r4 = 3
        L_0x0022:
            r0 = 2
            if (r1 != r0) goto L_0x004b
            X.1Rs r0 = r2.A0S
        L_0x0027:
            java.lang.Object r3 = r0.A04()
            X.6bw r3 = (X.C134986bw) r3
        L_0x002d:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "SEARCH_CONTEXT_CATEGORY"
            r1.putParcelable(r0, r3)
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            r1.putInt(r0, r4)
            r2.A17(r1)
            r0 = 1
            r5.A3n(r2, r0)
        L_0x0047:
            r5.A3j()
            return
        L_0x004b:
            r0 = 1
            if (r1 != r0) goto L_0x0051
            X.1Rs r0 = r2.A0T
            goto L_0x0027
        L_0x0051:
            r3 = 0
            goto L_0x002d
        L_0x0053:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment
            if (r0 == 0) goto L_0x006d
            r3 = 0
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            r1.putInt(r0, r3)
            r2.A17(r1)
        L_0x0069:
            r5.A3m(r2)
            goto L_0x0047
        L_0x006d:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x0077
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            goto L_0x0069
        L_0x0077:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BusinessDirectoryActivity/startSearchInConsumerSearchHome foreground fragment is "
            r1.append(r0)
            if (r2 != 0) goto L_0x0088
            java.lang.String r0 = "null"
        L_0x0084:
            X.C36321k7.A1Z(r1, r0)
            goto L_0x0047
        L_0x0088:
            java.lang.String r0 = r2.A0U
            goto L_0x0084
        L_0x008b:
            java.util.List r1 = r2.A04()
            java.util.List r0 = r2.A04()
            int r0 = X.C36431kI.A07(r0)
            java.lang.Object r2 = r1.get(r0)
            X.02E r2 = (X.AnonymousClass02E) r2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.A3l():void");
    }

    public void A3m(AnonymousClass02E r4) {
        String A0k = C90484aE.A0k(r4);
        if (!isDestroyed() && !isFinishing()) {
            AnonymousClass01z.A0H(getSupportFragmentManager(), (String) null);
        }
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0F(r4, A0k, R.id.business_search_container_view);
        A0O.A0J(A0k);
        A0O.A00(false);
    }

    public void A3n(AnonymousClass02E r5, boolean z) {
        String A0k = C90484aE.A0k(r5);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.A0N(A0k) == null) {
            AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
            r1.A0F(r5, A0k, R.id.business_search_container_view);
            if (z) {
                r1.A0J(A0k);
            }
            r1.A00(false);
        }
    }

    public void A3o(C134986bw r5, int i) {
        BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment;
        AnonymousClass02E A0N = getSupportFragmentManager().A0N("BusinessDirectoryConsumerHomeFragment");
        if (A0N instanceof BusinessDirectoryConsumerHomeFragment) {
            businessDirectoryConsumerHomeFragment = (BusinessDirectoryConsumerHomeFragment) A0N;
        } else {
            businessDirectoryConsumerHomeFragment = null;
        }
        if (businessDirectoryConsumerHomeFragment != null) {
            businessDirectoryConsumerHomeFragment.A0F = false;
        }
        A0F(this);
        if (businessDirectoryConsumerHomeFragment != null) {
            businessDirectoryConsumerHomeFragment.A0F = true;
        }
        BusinessDirectorySearchFragment A012 = A01(this);
        if (A012 != null) {
            C95394km r2 = A012.A0B;
            r2.A00 = i;
            AnonymousClass6QK r1 = r2.A0K;
            r1.A07();
            r1.A00 = null;
            r2.A0S.A0D(r5);
            if (C129406Gu.A01(r5.A00)) {
                C95394km.A0A(r2);
                return;
            }
            r2.A0T.A0D(r5);
            C95394km.A0G(r2, false);
            if (C95394km.A0O(r2)) {
                r2.A05.pop();
                return;
            }
            return;
        }
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putParcelable("INITIAL_CATEGORY", r5);
        businessDirectorySearchFragment.A17(A072);
        A3n(businessDirectorySearchFragment, false);
    }

    public void onDestroy() {
        super.onDestroy();
        TimerTask timerTask = this.A0B;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("from_api_biz_search", false)) {
            A3m(new BusinessDirectoryContextualSearchFragment());
        } else if (intent.getBooleanExtra("arg_launch_consumer_home", false)) {
            A3l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        if (r1 == 2) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r13) {
        /*
            r12 = this;
            int r1 = r13.getItemId()
            r11 = 1
            if (r1 == r11) goto L_0x00a5
            r0 = 2
            if (r1 == r0) goto L_0x008a
            r0 = 4
            if (r1 == r0) goto L_0x006c
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 == r0) goto L_0x0017
            boolean r0 = super.onOptionsItemSelected(r13)
            return r0
        L_0x0017:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = A01(r12)
            X.01z r1 = r12.getSupportFragmentManager()
            java.lang.String r0 = "BusinessDirectoryPopularApiBusinessesFragment"
            X.02E r1 = r1.A0N(r0)
            boolean r0 = r1 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x0039
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment) r1
        L_0x002b:
            if (r2 == 0) goto L_0x003b
            boolean r0 = r2.A15()
            if (r0 == 0) goto L_0x003b
            X.4km r0 = r2.A0B
            r0.A0T()
            return r11
        L_0x0039:
            r1 = 0
            goto L_0x002b
        L_0x003b:
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1.A15()
            if (r0 == 0) goto L_0x0066
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r0 = r1.A00
            if (r0 == 0) goto L_0x0061
            X.6pD r5 = r0.A01
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r9 = 13
            r10 = 91
            r6 = 0
            r8 = r6
            r5.A08(r6, r7, r8, r9, r10, r11)
            r12.A3q(r0)
            r0 = 2131886815(0x7f1202df, float:1.940822E38)
            r12.setTitle(r0)
            return r11
        L_0x0061:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0066:
            X.01W r0 = r12.A05
            r0.A00()
            return r11
        L_0x006c:
            java.lang.String r4 = "biz-directory-browsing"
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            r2.putExtra(r0, r3)
            r12.startActivity(r2)
            return r11
        L_0x008a:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r0 = r12.A06
            X.5DR r0 = r0.A00
            X.9Qj r0 = r0.A03
            android.content.SharedPreferences$Editor r1 = X.C90474aD.A0H(r0)
            java.lang.String r0 = "is_nux"
            X.C36331k8.A0w(r1, r0, r11)
            r1 = 2131896345(0x7f122819, float:1.9427549E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r12, r1, r0)
            r0.show()
            return r11
        L_0x00a5:
            X.01z r0 = r12.getSupportFragmentManager()
            X.021 r2 = r0.A0T
            java.util.List r0 = r2.A04()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f6
            r3 = 0
        L_0x00b6:
            boolean r0 = r3 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            if (r0 == 0) goto L_0x00d9
            r0 = r3
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r0
            X.4km r2 = r0.A0B
            X.6pD r4 = r2.A0E
            int r1 = r2.A02
            if (r1 == 0) goto L_0x00c9
            r0 = 2
            r8 = 2
            if (r1 != r0) goto L_0x00ca
        L_0x00c9:
            r8 = 3
        L_0x00ca:
            r9 = 62
            java.lang.Integer r5 = X.C95394km.A02(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 0
            r10 = 1
            r4.A08(r5, r6, r7, r8, r9, r10)
        L_0x00d9:
            boolean r0 = r3 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x00f2
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment r3 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment) r3
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r0 = r3.A00
            if (r0 == 0) goto L_0x0109
            X.6pD r5 = r0.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r9 = 13
            r10 = 62
            r6 = 0
            r8 = r6
            r5.A08(r6, r7, r8, r9, r10, r11)
        L_0x00f2:
            r12.A3l()
            return r11
        L_0x00f6:
            java.util.List r1 = r2.A04()
            java.util.List r0 = r2.A04()
            int r0 = X.C36431kI.A07(r0)
            java.lang.Object r3 = r1.get(r0)
            X.02E r3 = (X.AnonymousClass02E) r3
            goto L_0x00b6
        L_0x0109:
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C106485Jw r0 = this.A04;
        if (r0 != null) {
            r0.A03(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            X.5Jw r0 = r3.A04
            if (r0 == 0) goto L_0x000a
            r0.A04(r4)
        L_0x000a:
            android.view.Menu r1 = r3.A0E
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0017
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.5Jw r0 = r3.A04
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            boolean r1 = r3.A0C
            java.lang.String r0 = "arg_go_back_to_utilities"
            r4.putBoolean(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
