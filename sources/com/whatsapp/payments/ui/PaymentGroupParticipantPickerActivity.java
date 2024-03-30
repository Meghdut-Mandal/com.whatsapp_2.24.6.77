package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1LI;
import X.AnonymousClass1NG;
import X.AnonymousClass1RY;
import X.AnonymousClass3LE;
import X.AnonymousClass9IB;
import X.B79;
import X.C131606Ps;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C166317vX;
import X.C167527yC;
import X.C183438qn;
import X.C183538qx;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C203049nB;
import X.C203489oA;
import X.C207459vF;
import X.C226815j;
import X.C23075B3f;
import X.C23140B7a;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class PaymentGroupParticipantPickerActivity extends AnonymousClass155 {
    public AnonymousClass1LI A00;
    public AnonymousClass1NG A01;
    public AnonymousClass16D A02;
    public AnonymousClass16I A03;
    public AnonymousClass171 A04;
    public AnonymousClass1RY A05;
    public C27731Pn A06;
    public C19630wG A07;
    public AnonymousClass17X A08;
    public GroupJid A09;
    public AnonymousClass1EV A0A;
    public AnonymousClass1EU A0B;
    public C183538qx A0C;
    public C166317vX A0D;
    public C167527yC A0E;
    public String A0F;
    public ArrayList A0G;
    public ListView A0H;
    public C183438qn A0I;
    public AnonymousClass3LE A0J;
    public boolean A0K;
    public final ArrayList A0L;
    public final C226815j A0M;

    public void onCreate(Bundle bundle) {
        C36331k8.A0l(this);
        super.onCreate(bundle);
        this.A0E = (C167527yC) C36441kJ.A0b(this).A00(C167527yC.class);
        this.A05 = this.A06.A05(this, "payment-group-participant-picker");
        this.A09 = GroupJid.Companion.A02(C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("extra_jid"));
        Intent intent = getIntent();
        if (intent != null) {
            this.A0F = intent.getStringExtra("referral_screen");
        }
        this.A0D = new C166317vX(this, this, this.A0L);
        ListView listView = (ListView) findViewById(R.id.group_participant_picker_list);
        this.A0H = listView;
        listView.setAdapter(this.A0D);
        this.A0H.setOnItemClickListener(new C207459vF(intent, this));
        registerForContextMenu(this.A0H);
        this.A03.registerObserver(this.A0M);
        Toolbar A0R = C36411kG.A0R(this);
        setSupportActionBar(A0R);
        this.A0J = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C203489oA(this, 2), A0R, this.A00);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        C183538qx r1 = this.A0C;
        if (r1 != null) {
            r1.A0D(true);
            this.A0C = null;
        }
        C183438qn r12 = new C183438qn(this);
        this.A0I = r12;
        C36331k8.A1F(r12, this.A04);
        Bu1(R.string.f12nameremoved);
        C23075B3f BBn = this.A0B.A05().BBn();
        if (BBn != null) {
            C203049nB.A04((C131606Ps) null, BBn, "payment_contact_picker", this.A0F);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AnonymousClass141 r4 = ((AnonymousClass9IB) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position)).A00;
        if (this.A01.A0O(C36351kA.A0l(r4))) {
            contextMenu.add(0, 0, 0, C36391kE.A0v(this, this.A04.A0H(r4), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public static void A01(Intent intent, UserJid userJid, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        Intent A0H2 = C36441kJ.A0H(paymentGroupParticipantPickerActivity.A07.A00, paymentGroupParticipantPickerActivity.A0B.A05().BHH());
        if (intent != null) {
            A0H2.putExtras(intent);
        }
        A0H2.putExtra("extra_jid", paymentGroupParticipantPickerActivity.A09.getRawString());
        A0H2.putExtra("extra_receiver_jid", AnonymousClass143.A03(userJid));
        A0H2.putExtra("extra_referral_screen", "payment_contact_picker");
        paymentGroupParticipantPickerActivity.finish();
        paymentGroupParticipantPickerActivity.startActivity(A0H2);
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C165567td.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C165567td.A0v(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A07 = C36351kA.A0W(A0B2);
            this.A06 = C165577te.A0Q(A0B2);
            this.A02 = C36341k9.A0R(A0B2);
            this.A04 = C36341k9.A0S(A0B2);
            this.A0B = C36381kD.A0f(A0B2);
            this.A01 = C36381kD.A0V(A0B2);
            this.A03 = C165587tf.A0M(A0B2);
            this.A0A = C36371kC.A0h(A0B2);
            this.A08 = C36351kA.A0b(A0B2);
            this.A00 = (AnonymousClass1LI) A0B2.A3Q.get();
        }
    }

    public void onBackPressed() {
        if (this.A0J.A07()) {
            this.A0J.A05(true);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onSearchRequested() {
        this.A0J.A06(false);
        return false;
    }

    public PaymentGroupParticipantPickerActivity(int i) {
        this.A0K = false;
        C23140B7a.A00(this, 2);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AnonymousClass9IB r0 = (AnonymousClass9IB) this.A0H.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (r0 != null) {
            AnonymousClass141 r2 = r0.A00;
            if (menuItem.getItemId() == 0) {
                this.A01.A0H(this, C36351kA.A0k(r2));
                return true;
            }
        }
        return super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, getString(R.string.f12nameremoved)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.A02();
        this.A03.unregisterObserver(this.A0M);
        C183538qx r0 = this.A0C;
        if (r0 != null) {
            r0.A0D(true);
            this.A0C = null;
        }
        C183438qn r02 = this.A0I;
        if (r02 != null) {
            r02.A0D(true);
            this.A0I = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public PaymentGroupParticipantPickerActivity() {
        this(0);
        this.A0L = AnonymousClass001.A0I();
        this.A0M = new B79(this, 5);
    }
}
