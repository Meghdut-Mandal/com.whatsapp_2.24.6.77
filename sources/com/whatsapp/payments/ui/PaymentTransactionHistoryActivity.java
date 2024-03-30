package com.whatsapp.payments.ui;

import X.AH1;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass076;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass1DR;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1N6;
import X.AnonymousClass1VZ;
import X.AnonymousClass3LE;
import X.AnonymousClass3LW;
import X.B2Z;
import X.B66;
import X.B84;
import X.C011004s;
import X.C012005e;
import X.C1276068y;
import X.C165567td;
import X.C165607th;
import X.C168147zm;
import X.C173918Tq;
import X.C179238jf;
import X.C183658r9;
import X.C183718rF;
import X.C18740tg;
import X.C18820ts;
import X.C193889Nh;
import X.C19770wU;
import X.C202179lC;
import X.C20310xM;
import X.C203349np;
import X.C203489oA;
import X.C20650xu;
import X.C206559tb;
import X.C21100yf;
import X.C224514j;
import X.C22828Awd;
import X.C22956Az8;
import X.C22972AzO;
import X.C23075B3f;
import X.C24611Dc;
import X.C25251Fo;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C90484aE;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.MultiExclusionChip;
import com.whatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.util.ArrayList;
import java.util.Objects;

public class PaymentTransactionHistoryActivity extends C173918Tq implements C22956Az8, C22972AzO, C22828Awd {
    public int A00;
    public View A01;
    public ProgressBar A02;
    public TextView A03;
    public C18820ts A04;
    public C20310xM A05;
    public C20650xu A06;
    public AnonymousClass1VZ A07;
    public AnonymousClass11F A08;
    public C25251Fo A09;
    public AnonymousClass1DR A0A;
    public AnonymousClass1EV A0B;
    public AnonymousClass1EU A0C;
    public C202179lC A0D;
    public C168147zm A0E;
    public C1276068y A0F;
    public MultiExclusionChipGroup A0G;
    public AnonymousClass1FR A0H;
    public AnonymousClass3LE A0I;
    public AnonymousClass1N6 A0J;
    public String A0K;
    public String A0L;
    public ArrayList A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public C183658r9 A0S;
    public C183718rF A0T;
    public boolean A0U = false;
    public boolean A0V = false;
    public final C24611Dc A0W = C165607th.A0c("PaymentTransactionHistoryActivity", "payment-settings");
    public final C193889Nh A0X = new C193889Nh();
    public final ArrayList A0Y = AnonymousClass001.A0I();
    public final B2Z A0Z = new C203349np(this, 3);

    public boolean onSearchRequested() {
        this.A0I.A06(false);
        AnonymousClass3LE r2 = this.A0I;
        String string = getString(R.string.f12nameremoved);
        SearchView searchView = r2.A00;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        View findViewById = findViewById(R.id.search_back);
        if (this.A06.A09(C21100yf.A0l) && !this.A0Q && (this.A0N || this.A0R)) {
            C36341k9.A13(this, R.id.appBarLayout, 0);
            if (this.A0G == null) {
                MultiExclusionChipGroup multiExclusionChipGroup = (MultiExclusionChipGroup) C012005e.A02(findViewById(R.id.payment_filters), R.id.payment_filter_group);
                this.A0G = multiExclusionChipGroup;
                String string2 = getString(R.string.f12nameremoved);
                String string3 = getString(R.string.f12nameremoved);
                String string4 = getString(R.string.f12nameremoved);
                String string5 = getString(R.string.f12nameremoved);
                MultiExclusionChip A072 = A07(string2);
                MultiExclusionChip A073 = A07(string3);
                MultiExclusionChip A074 = A07(string4);
                MultiExclusionChip A075 = A07(string5);
                if (this.A0R) {
                    ArrayList A0r = C90484aE.A0r(A072);
                    A0r.add(A073);
                    multiExclusionChipGroup.A00(A0r);
                }
                if (this.A0N) {
                    ArrayList A0r2 = C90484aE.A0r(A074);
                    A0r2.add(A075);
                    multiExclusionChipGroup.A00(A0r2);
                }
                multiExclusionChipGroup.A00 = new AH1(this, A072, A073, A074, A075);
            }
            this.A0G.setVisibility(0);
        }
        C36421kH.A13(findViewById, this, 37);
        return false;
    }

    private void A0F() {
        B66 A052;
        if (TextUtils.isEmpty(this.A0K) || (A052 = this.A0C.A04(this.A0K)) == null) {
            A052 = this.A0C.A05();
        }
        C23075B3f BBn = A052.BBn();
        if (BBn != null) {
            Integer A0i = C36361kB.A0i();
            BBn.BOm(A0i, A0i, "payment_transaction_history", (String) null);
        }
    }

    public void A2W() {
        this.A0J.A03((AnonymousClass11F) null, 76);
    }

    public boolean A2f() {
        return this.A0D.A0E(7019);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.8r9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.8rF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.8r9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.8r9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3i() {
        /*
            r13 = this;
            X.8r9 r0 = r13.A0S
            boolean r1 = X.C36411kG.A1Z(r0)
            X.8rF r0 = r13.A0T
            if (r0 == 0) goto L_0x000d
            r0.A0D(r1)
        L_0x000d:
            boolean r2 = r13.A0V
            r0 = 0
            android.view.View r1 = r13.A01
            if (r2 == 0) goto L_0x0018
            r1.setVisibility(r0)
            return
        L_0x0018:
            r0 = 8
            r1.setVisibility(r0)
            X.0yf r1 = r13.A06
            X.0yi r0 = X.C21100yf.A0l
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r13.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0055
            X.11F r0 = r13.A08
            if (r0 != 0) goto L_0x0055
            X.1FR r10 = r13.A0H
            X.0ts r4 = r13.A04
            X.0xu r5 = r13.A06
            X.1EU r6 = r13.A0C
            X.68y r9 = r13.A0F
            java.lang.String r11 = r13.A0L
            boolean r12 = r13.A0Q
            X.9Nh r7 = r13.A0X
            X.9Q0 r8 = new X.9Q0
            r8.<init>(r13)
            X.8rF r3 = new X.8rF
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A0T = r3
        L_0x004f:
            X.0wU r0 = r13.A04
            X.C36391kE.A1Q(r3, r0)
            return
        L_0x0055:
            java.util.ArrayList r2 = r13.A0M
            X.9Q0 r1 = new X.9Q0
            r1.<init>(r13)
            X.68y r0 = r13.A0F
            X.8r9 r3 = new X.8r9
            r3.<init>(r1, r13, r0, r2)
            r13.A0S = r3
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionHistoryActivity.A3i():void");
    }

    public void BV6(String str) {
        this.A0E.A06();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        C168147zm r4;
        String stringExtra;
        C36331k8.A0l(this);
        this.A0K = getIntent().getStringExtra("extra_payment_service_name");
        super.onCreate(bundle);
        if (this.A0B.A04(0) || this.A0B.A02()) {
            z = true;
        } else {
            this.A0B.A04.A02();
            z = false;
        }
        C18740tg.A0C(z);
        this.A00 = C36431kI.A0F(this, R.layout.f9nameremoved).getIntExtra("extra_payment_flow_entry_point", 3);
        C19770wU r42 = this.A04;
        C25251Fo r3 = this.A09;
        Objects.requireNonNull(r3);
        AVY.A00(r42, r3, 34);
        this.A0A.registerObserver(this.A0Z);
        boolean z2 = this instanceof IndiaPaymentTransactionHistoryActivity;
        AnonymousClass1FR r13 = this.A0H;
        C18820ts r6 = this.A04;
        C24611Dc r10 = this.A0W;
        C20310xM r7 = this.A05;
        AnonymousClass1VZ r8 = this.A07;
        ArrayList A0I2 = AnonymousClass001.A0I();
        C1276068y r12 = this.A0F;
        int i = this.A00;
        if (z2) {
            r4 = new C179238jf(this, r6, r7, r8, this, r10, this, r12, r13, A0I2, i);
        } else {
            r4 = new C168147zm(this, r6, r7, r8, this, r10, this, r12, r13, A0I2, i);
        }
        this.A0E = r4;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.transaction_list);
        recyclerView.setAdapter(this.A0E);
        C011004s.A09(recyclerView, true);
        C011004s.A09(findViewById(16908292), true);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.A02 = progressBar;
        progressBar.setVisibility(0);
        this.A01 = findViewById(R.id.empty_list_container);
        this.A03 = C36391kE.A0Q(this, R.id.empty_container_text);
        Toolbar A0R2 = C36411kG.A0R(this);
        setSupportActionBar(A0R2);
        this.A0V = getIntent().getBooleanExtra("extra_show_empty_list_screen", false);
        this.A0I = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C203489oA(this, 3), A0R2, this.A04);
        this.A0P = getIntent().getBooleanExtra("extra_for_mandates", false);
        this.A0O = getIntent().getBooleanExtra("extra_show_mandate_pending_requests", false);
        this.A0Q = getIntent().getBooleanExtra("extra_show_requests", false);
        this.A0U = getIntent().getBooleanExtra("extra_disable_search", false);
        C206559tb r2 = (C206559tb) getIntent().getParcelableExtra("extra_predefined_search_filter");
        if (r2 != null) {
            this.A0X.A01 = r2;
        }
        this.A08 = C36401kF.A0Z(getIntent(), "extra_jid");
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (this.A0Q) {
                stringExtra = getResources().getQuantityString(R.plurals.f10nameremoved, 2);
            } else {
                stringExtra = getIntent().getStringExtra("extra_list_screen_configurable_title");
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = getString(R.string.f12nameremoved);
                }
            }
            supportActionBar.A0Q(stringExtra);
            supportActionBar.A0U(true);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(false);
        B84.A00(A002, this, 45, R.string.f12nameremoved);
        A002.A0d(R.string.f12nameremoved);
        return A002.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.A0U && !this.A0V) {
            menu.add(0, R.id.menuitem_search, 0, getString(R.string.f12nameremoved)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    private MultiExclusionChip A07(String str) {
        MultiExclusionChip multiExclusionChip = (MultiExclusionChip) getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
        AnonymousClass076.A06(multiExclusionChip.getCheckedIcon(), getResources().getColor(C224514j.A00(multiExclusionChip.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        multiExclusionChip.setText(str);
        return multiExclusionChip;
    }

    private boolean A0G() {
        B66 A052;
        if (!isTaskRoot()) {
            return false;
        }
        if (TextUtils.isEmpty(this.A0K) || (A052 = this.A0C.A04(this.A0K)) == null) {
            A052 = this.A0C.A05();
        }
        Class BFl = A052.BFl();
        C165567td.A16(this.A0W, BFl, "PaymentTransactionHistoryActivity maybeOpenPaymentSettings ", AnonymousClass000.A0u());
        Intent A0H2 = C36441kJ.A0H(this, BFl);
        finishAndRemoveTask();
        startActivity(A0H2);
        return true;
    }

    public void BcW() {
        A3i();
    }

    public void onBackPressed() {
        A0F();
        if (this.A0I.A07()) {
            this.A0I.A05(true);
            MultiExclusionChipGroup multiExclusionChipGroup = this.A0G;
            if (multiExclusionChipGroup != null) {
                for (int i = 0; i < multiExclusionChipGroup.getChildCount(); i++) {
                    ((CompoundButton) multiExclusionChipGroup.getChildAt(i)).setChecked(false);
                }
                this.A0G.setVisibility(8);
            }
            A3i();
        } else if (!A0G()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        boolean A1Z = C36411kG.A1Z(this.A0S);
        C183718rF r0 = this.A0T;
        if (r0 != null) {
            r0.A0D(A1Z);
        }
        this.A0A.unregisterObserver(this.A0Z);
        this.A0S = null;
        this.A0T = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A0F();
            finish();
            A0G();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0Q = bundle.getBoolean("extra_show_requests");
        this.A08 = C36351kA.A0i(bundle, "extra_jid");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_requests", this.A0Q);
        AnonymousClass11F r0 = this.A08;
        if (r0 != null) {
            bundle.putString("extra_jid", r0.getRawString());
        }
    }

    public void onStart() {
        super.onStart();
        A3i();
        C202179lC r1 = this.A0D;
        r1.A00.clear();
        r1.A02.add(AnonymousClass001.A0F(this));
    }

    public void onStop() {
        super.onStop();
        boolean A1Z = C36411kG.A1Z(this.A0S);
        C183718rF r0 = this.A0T;
        if (r0 != null) {
            r0.A0D(A1Z);
        }
        this.A0S = null;
        this.A0T = null;
        this.A0D.A03(this);
    }
}
