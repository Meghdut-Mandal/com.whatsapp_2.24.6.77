package com.whatsapp.contact.picker.invite;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass08S;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass15Q;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass1JI;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass2Gd;
import X.AnonymousClass3U8;
import X.AnonymousClass3XG;
import X.AnonymousClass4A5;
import X.AnonymousClass4A6;
import X.AnonymousClass4JX;
import X.AnonymousClass4W3;
import X.AnonymousClass4Z3;
import X.C012005e;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C21710zg;
import X.C226815j;
import X.C229216m;
import X.C27731Pn;
import X.C32601dt;
import X.C32611du;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C45602Rz;
import X.C48912iG;
import X.C55932vQ;
import X.C63713Lc;
import X.C65383Rv;
import X.C70243ep;
import X.C87254Ob;
import X.C88554Td;
import X.C89324Wc;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InviteNonWhatsAppContactPickerActivity extends AnonymousClass155 implements AnonymousClass15Q, C87254Ob {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ListView A04;
    public Toolbar A05;
    public C32601dt A06;
    public C229216m A07;
    public AnonymousClass1Pp A08;
    public AnonymousClass16I A09;
    public C27731Pn A0A;
    public C65383Rv A0B;
    public C32611du A0C;
    public AnonymousClass2Gd A0D;
    public InviteNonWhatsAppContactPickerViewModel A0E;
    public AnonymousClass1JI A0F;
    public WDSSearchBar A0G;
    public ViewGroup A0H;
    public ViewGroup A0I;
    public Button A0J;
    public TextView A0K;
    public AnonymousClass1RY A0L;
    public boolean A0M;
    public final AnonymousClass00T A0N;
    public final AnonymousClass00T A0O;
    public final C226815j A0P;

    public static final void A0G(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity, boolean z, boolean z2) {
        if (!z2) {
            View A012 = inviteNonWhatsAppContactPickerActivity.A01();
            ViewGroup viewGroup = inviteNonWhatsAppContactPickerActivity.A0I;
            if (viewGroup == null) {
                throw C36331k8.A0d("shareActionContainer");
            }
            viewGroup.addView(A012);
            ViewGroup viewGroup2 = inviteNonWhatsAppContactPickerActivity.A0I;
            if (viewGroup2 == null) {
                throw C36331k8.A0d("shareActionContainer");
            }
            viewGroup2.setVisibility(0);
        }
        View inflate = inviteNonWhatsAppContactPickerActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        View A022 = C012005e.A02(inflate, R.id.title);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) A022).setText(R.string.f12nameremoved);
        ViewGroup viewGroup3 = inviteNonWhatsAppContactPickerActivity.A0H;
        if (viewGroup3 == null) {
            throw C36331k8.A0d("contactsSectionContainer");
        }
        viewGroup3.addView(inflate);
        ViewGroup viewGroup4 = inviteNonWhatsAppContactPickerActivity.A0H;
        if (viewGroup4 == null) {
            throw C36331k8.A0d("contactsSectionContainer");
        }
        viewGroup4.setVisibility(0);
        View view = inviteNonWhatsAppContactPickerActivity.A01;
        if (view == null) {
            throw C36331k8.A0d("emptyView");
        }
        view.setVisibility(0);
        if (z || C36401kF.A1Y(inviteNonWhatsAppContactPickerActivity.A0D)) {
            TextView textView = inviteNonWhatsAppContactPickerActivity.A0K;
            if (textView == null) {
                throw C36331k8.A0d("emptyViewDescription");
            }
            textView.setText(R.string.f12nameremoved);
            Button button = inviteNonWhatsAppContactPickerActivity.A0J;
            if (button == null) {
                throw C36331k8.A0d("openPermissionsButton");
            }
            button.setVisibility(8);
            return;
        }
        C32611du r4 = inviteNonWhatsAppContactPickerActivity.A0C;
        if (r4 != null) {
            Integer A072 = A07(inviteNonWhatsAppContactPickerActivity);
            C45602Rz r2 = new C45602Rz();
            r2.A03 = 1;
            r2.A04 = A072;
            r2.A00 = true;
            r4.A03.Bly(r2);
            TextView textView2 = inviteNonWhatsAppContactPickerActivity.A0K;
            if (textView2 == null) {
                throw C36331k8.A0d("emptyViewDescription");
            }
            textView2.setText(R.string.f12nameremoved);
            Button button2 = inviteNonWhatsAppContactPickerActivity.A0J;
            if (button2 == null) {
                throw C36331k8.A0d("openPermissionsButton");
            }
            button2.setVisibility(0);
            return;
        }
        throw C36331k8.A0d("inviteFlowLogger");
    }

    public int A2I() {
        return 78318969;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        WDSSearchBar wDSSearchBar = this.A0G;
        if (wDSSearchBar == null) {
            throw C36331k8.A0d("wdsSearchBar");
        }
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, wDSSearchBar.getResources().getString(R.string.f12nameremoved)).setIcon(R.drawable.ic_action_search);
        AnonymousClass00C.A08(icon);
        icon.setShowAsAction(10);
        icon.setOnActionExpandListener(new AnonymousClass4Z3(this, 4));
        this.A00 = icon;
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0E;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C36331k8.A0a();
        }
        C88554Td.A00(this, inviteNonWhatsAppContactPickerViewModel.A06, new AnonymousClass4JX(this), 6);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0E;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                throw C36331k8.A0a();
            }
            C36341k9.A18(inviteNonWhatsAppContactPickerViewModel.A0C, true);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public static final void A0F(C70243ep r8, InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        List list = r8.A01;
        if (list.size() > 1) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it);
                String A022 = AnonymousClass171.A02(inviteNonWhatsAppContactPickerActivity, inviteNonWhatsAppContactPickerActivity.A00, A0f);
                String A042 = AnonymousClass3U8.A04(C36351kA.A0j(A0f));
                C18740tg.A06(A042);
                AnonymousClass00C.A08(A042);
                A0I2.add(new AnonymousClass3XG(A022, A042));
            }
            C32611du r4 = inviteNonWhatsAppContactPickerActivity.A0C;
            if (r4 != null) {
                Integer A072 = A07(inviteNonWhatsAppContactPickerActivity);
                C45602Rz r2 = new C45602Rz();
                r2.A03 = 1;
                r2.A04 = A072;
                r2.A02 = true;
                r2.A01 = true;
                r4.A03.Bly(r2);
                inviteNonWhatsAppContactPickerActivity.Btl(PhoneNumberSelectionDialog.A03(C36391kE.A0v(inviteNonWhatsAppContactPickerActivity, r8.A00, new Object[1], 0, R.string.f12nameremoved), A0I2), (String) null);
                return;
            }
            throw C36331k8.A0d("inviteFlowLogger");
        }
        AnonymousClass141 contact = r8.getContact();
        C18740tg.A06(contact);
        String A043 = AnonymousClass3U8.A04(C36351kA.A0j(contact));
        C18740tg.A06(A043);
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = inviteNonWhatsAppContactPickerActivity.A0E;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C36331k8.A0a();
        }
        C36361kB.A1I(A043);
        inviteNonWhatsAppContactPickerViewModel.A0K.A0D(A043);
    }

    public void A2F() {
        if (!this.A0M) {
            this.A0M = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0A = C36351kA.A0T(A0B2);
            this.A06 = (C32601dt) r1.A46.get();
            this.A08 = C36361kB.A0V(A0B2);
            this.A09 = C36351kA.A0S(A0B2);
            this.A0C = (C32611du) r1.A2N.get();
            this.A0B = (C65383Rv) r1.A2M.get();
            this.A07 = C36381kD.A0X(A0B2);
            this.A0F = (AnonymousClass1JI) r1.A3j.get();
        }
    }

    public void Bbo(String str) {
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0E;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C36331k8.A0a();
        }
        inviteNonWhatsAppContactPickerViewModel.A0K.A0D(str);
    }

    public void onBackPressed() {
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0E;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C36331k8.A0d("viewModel");
        } else if (C36341k9.A1Z(inviteNonWhatsAppContactPickerViewModel.A0C.A04())) {
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel2 = this.A0E;
            if (inviteNonWhatsAppContactPickerViewModel2 == null) {
                throw C36331k8.A0d("viewModel");
            }
            C36341k9.A18(inviteNonWhatsAppContactPickerViewModel2.A0C, false);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0114, code lost:
        if (r3.A0D.A0E(7478) == false) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r3 = r16
            r0 = r17
            super.onCreate(r0)
            r0 = 2131625298(0x7f0e0552, float:1.88778E38)
            r3.setContentView((int) r0)
            r0 = 2131897058(0x7f122ae2, float:1.9428995E38)
            r3.setTitle(r0)
            r0 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r1 = r3.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar"
            X.AnonymousClass00C.A0E(r1, r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r3.A05 = r1
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "toolbar"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002c:
            r3.setSupportActionBar(r1)
            X.07B r1 = X.C36381kD.A0O(r3)
            r0 = 1
            r1.A0U(r0)
            r1.A0V(r0)
            r0 = 2131435329(0x7f0b1f41, float:1.8492497E38)
            android.view.View r1 = r3.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.search.WDSSearchBar"
            X.AnonymousClass00C.A0E(r1, r0)
            com.whatsapp.wds.components.search.WDSSearchBar r1 = (com.whatsapp.wds.components.search.WDSSearchBar) r1
            r3.A0G = r1
            java.lang.String r2 = "wdsSearchBar"
            if (r1 != 0) goto L_0x0053
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0053:
            com.whatsapp.wds.components.search.WDSSearchView r1 = r1.A07
            r5 = 2
            X.4Xq r0 = new X.4Xq
            r0.<init>(r3, r5)
            r1.setOnQueryTextChangeListener(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r3.A0G
            if (r0 != 0) goto L_0x0067
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0067:
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A07
            X.2mt r0 = X.C50942mt.A00
            r1.setTrailingButtonIcon(r0)
            X.1Pn r1 = r3.A0A
            if (r1 == 0) goto L_0x029c
            java.lang.String r0 = "invite-non-wa-contact-picker"
            X.1RY r0 = r1.A05(r3, r0)
            r3.A0L = r0
            X.04H r1 = X.C36441kJ.A0b(r3)
            java.lang.Class<com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel> r0 = com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.class
            X.04R r7 = r1.A00(r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r7 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r7
            r3.A0E = r7
            java.lang.String r8 = "viewModel"
            r10 = 0
            if (r7 != 0) goto L_0x0092
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0092:
            X.00s r1 = r7.A0D
            r0 = 0
            X.C36341k9.A16(r1, r0)
            X.00s r2 = r7.A0E
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r2.A0D(r0)
            X.1Rz r1 = r7.A0J
            X.08S r6 = r7.A09
            r4 = 1
            X.4ZI r0 = new X.4ZI
            r0.<init>(r7, r4)
            r1.A00(r0, r2, r6)
            X.08S r2 = r7.A08
            r1 = 9
            X.4Td r0 = new X.4Td
            r0.<init>(r7, r1)
            r2.A0F(r6, r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r3.A0E
            if (r0 != 0) goto L_0x00c3
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00c3:
            X.00r r1 = r0.A02
            X.4JS r0 = new X.4JS
            r0.<init>(r3)
            r7 = 5
            X.C88554Td.A00(r3, r1, r0, r7)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r3.A0E
            if (r0 != 0) goto L_0x00d7
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00d7:
            X.00r r2 = r0.A03
            X.4JT r1 = new X.4JT
            r1.<init>(r3)
            r0 = 4
            X.C88554Td.A00(r3, r2, r1, r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r3.A0E
            if (r0 != 0) goto L_0x00eb
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x00eb:
            X.00r r1 = r0.A05
            X.4JU r0 = new X.4JU
            r0.<init>(r3)
            X.C88554Td.A00(r3, r1, r0, r5)
            X.16I r1 = r3.A09
            if (r1 == 0) goto L_0x0295
            X.15j r0 = r3.A0P
            r1.registerObserver(r0)
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r0 = "hide_share_link"
            r1 = 0
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0116
            X.0yC r2 = r3.A0D
            r0 = 7478(0x1d36, float:1.0479E-41)
            boolean r0 = r2.A0E(r0)
            r15 = 1
            if (r0 != 0) goto L_0x0117
        L_0x0116:
            r15 = 0
        L_0x0117:
            X.00T r2 = r3.A0N
            boolean r0 = X.C36331k8.A1b(r2)
            if (r0 == 0) goto L_0x0158
            X.4JW r14 = new X.4JW
            r14.<init>(r3)
            X.4A9 r11 = new X.4A9
            r11.<init>(r3)
            X.4A7 r12 = new X.4A7
            r12.<init>(r3)
            X.4A8 r13 = new X.4A8
            r13.<init>(r3)
            r0 = 2131429015(0x7f0b0697, float:1.847969E38)
            android.view.View r5 = X.C36361kB.A0D(r3, r0)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r9 = r3.A0E
            if (r9 != 0) goto L_0x0145
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0145:
            X.00T r0 = r3.A0O
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x0263
            X.1JI r10 = r3.A0F
            if (r10 != 0) goto L_0x0263
            java.lang.String r0 = "scrollPerfLoggerManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0158:
            r0 = 2131427726(0x7f0b018e, float:1.8477076E38)
            X.C36391kE.A16(r3, r0, r1)
            r0 = 2131430909(0x7f0b0dfd, float:1.8483532E38)
            android.view.View r6 = X.C36361kB.A0D(r3, r0)
            r0 = 2131429902(0x7f0b0a0e, float:1.848149E38)
            android.view.View r0 = X.C36361kB.A0D(r3, r0)
            r3.A01 = r0
            r0 = 2131434042(0x7f0b1a3a, float:1.8489887E38)
            android.view.View r0 = X.C36361kB.A0D(r3, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A0I = r0
            r0 = 2131429143(0x7f0b0717, float:1.847995E38)
            android.view.View r0 = X.C36361kB.A0D(r3, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A0H = r0
            r0 = 2131431008(0x7f0b0e60, float:1.8483733E38)
            android.view.View r0 = X.C36361kB.A0D(r3, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A0K = r0
            r0 = 2131428408(0x7f0b0438, float:1.847846E38)
            android.view.View r1 = X.C36361kB.A0D(r3, r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r3.A0J = r1
            if (r1 != 0) goto L_0x01a3
            java.lang.String r0 = "openPermissionsButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a3:
            r0 = 27
            X.C48912iG.A00(r1, r3, r0)
            r0 = 2131429083(0x7f0b06db, float:1.8479829E38)
            android.view.View r0 = X.C36361kB.A0D(r3, r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.A04 = r0
            X.1Pp r5 = r3.A08
            if (r5 == 0) goto L_0x028e
            X.1RY r1 = r3.A0L
            if (r1 != 0) goto L_0x01c2
            java.lang.String r0 = "contactPhotoLoader"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c2:
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            X.0ts r0 = r3.A00
            X.AnonymousClass00C.A07(r0)
            X.2Gd r9 = new X.2Gd
            r10 = r3
            r11 = r5
            r12 = r1
            r13 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            r3.A0D = r9
            android.view.View r1 = r3.A01()
            r3.A02 = r1
            r3.A03 = r1
            android.widget.ListView r0 = r3.A04
            java.lang.String r5 = "listView"
            if (r0 != 0) goto L_0x01e9
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x01e9:
            r0.addHeaderView(r1)
            android.widget.ListView r1 = r3.A04
            if (r1 != 0) goto L_0x01f5
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x01f5:
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x0200
            java.lang.String r0 = "emptyView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0200:
            r1.setEmptyView(r0)
            android.widget.ListView r0 = r3.A04
            if (r0 != 0) goto L_0x020c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x020c:
            r0.setAdapter(r9)
            android.widget.ListView r0 = r3.A04
            if (r0 != 0) goto L_0x0218
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0218:
            r3.registerForContextMenu(r0)
            android.widget.ListView r0 = r3.A04
            if (r0 != 0) goto L_0x0224
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0224:
            X.C89594Xd.A00(r0, r3, r7)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r3.A0E
            if (r0 != 0) goto L_0x0230
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0230:
            X.00r r5 = r0.A06
            X.4JV r1 = new X.4JV
            r1.<init>(r3)
            r0 = 7
            X.C88554Td.A00(r3, r5, r1, r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r3.A0E
            if (r0 != 0) goto L_0x0244
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0244:
            X.00r r5 = r0.A07
            X.4MX r1 = new X.4MX
            r1.<init>(r6, r3, r15)
            r0 = 3
            X.C88554Td.A00(r3, r5, r1, r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r3.A0E
            if (r0 != 0) goto L_0x0258
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r8)
            throw r0
        L_0x0258:
            X.00r r1 = r0.A04
            X.4Lz r0 = new X.4Lz
            r0.<init>(r3, r15)
            X.C88554Td.A00(r3, r1, r0, r4)
            goto L_0x0284
        L_0x0263:
            X.AnonymousClass00C.A0D(r5, r1)
            android.view.View r5 = r5.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView"
            X.AnonymousClass00C.A0E(r5, r0)
            androidx.compose.ui.platform.ComposeView r5 = (androidx.compose.ui.platform.ComposeView) r5
            r5.setVisibility(r1)
            X.7Yy r8 = new X.7Yy
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1 = 1805807305(0x6ba26ec9, float:3.927383E26)
            X.77p r0 = new X.77p
            r0.<init>(r1, r8, r4)
            r5.setContent(r0)
        L_0x0284:
            boolean r0 = X.C36331k8.A1b(r2)
            if (r0 != 0) goto L_0x028d
            X.C36401kF.A1C(r3)
        L_0x028d:
            return
        L_0x028e:
            java.lang.String r0 = "contactAvatars"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0295:
            java.lang.String r0 = "contactObservers"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x029c:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity.onCreate(android.os.Bundle):void");
    }

    public InviteNonWhatsAppContactPickerActivity(int i) {
        this.A0M = false;
        C89324Wc.A00(this, 37);
    }

    private final View A01() {
        View A0E2 = C36361kB.A0E(getLayoutInflater(), (ViewGroup) null, R.layout.f9nameremoved);
        C63713Lc.A01(A0E2, R.drawable.ic_action_share, C36391kE.A03(A0E2.getContext()), R.drawable.green_circle, R.string.f12nameremoved);
        C48912iG.A00(A0E2, this, 26);
        return A0E2;
    }

    public static final Integer A07(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        int A022 = C36431kI.A02(inviteNonWhatsAppContactPickerActivity.getIntent(), "invite_source");
        if (A022 == 0) {
            return null;
        }
        return Integer.valueOf(A022);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass16I r1 = this.A09;
        if (r1 != null) {
            r1.unregisterObserver(this.A0P);
            AnonymousClass1RY r0 = this.A0L;
            if (r0 == null) {
                throw C36331k8.A0d("contactPhotoLoader");
            }
            r0.A02();
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0E;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                throw C36331k8.A0a();
            }
            AnonymousClass08S r12 = inviteNonWhatsAppContactPickerViewModel.A09;
            r12.A0E(inviteNonWhatsAppContactPickerViewModel.A0E);
            inviteNonWhatsAppContactPickerViewModel.A08.A0E(r12);
            return;
        }
        throw C36331k8.A0d("contactObservers");
    }

    public void onResume() {
        super.onResume();
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0E;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            throw C36331k8.A0a();
        }
        C229216m r0 = this.A07;
        if (r0 != null) {
            C36341k9.A18(inviteNonWhatsAppContactPickerViewModel.A0B, r0.A00());
            if (!C36331k8.A1b(this.A0N) && C36331k8.A1b(this.A0O)) {
                AnonymousClass1JI r02 = this.A0F;
                if (r02 != null) {
                    r02.A01(this);
                    ListView listView = this.A04;
                    if (listView == null) {
                        throw C36331k8.A0d("listView");
                    }
                    listView.setOnScrollListener(new C55932vQ(this, 6));
                    return;
                }
                throw C36331k8.A0d("scrollPerfLoggerManager");
            }
            return;
        }
        throw C36331k8.A0d("contactAccessHelper");
    }

    public InviteNonWhatsAppContactPickerActivity() {
        this(0);
        this.A0N = C36431kI.A1I(new AnonymousClass4A5(this));
        this.A0O = C36431kI.A1I(new AnonymousClass4A6(this));
        this.A0P = AnonymousClass4W3.A00(this, 11);
    }
}
