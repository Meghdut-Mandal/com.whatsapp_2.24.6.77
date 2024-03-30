package com.whatsapp.calling.callhistory;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Z;
import X.AnonymousClass190;
import X.AnonymousClass1A5;
import X.AnonymousClass1EL;
import X.AnonymousClass1HJ;
import X.AnonymousClass1LI;
import X.AnonymousClass1N6;
import X.AnonymousClass1ND;
import X.AnonymousClass1NG;
import X.AnonymousClass1Pp;
import X.AnonymousClass2EO;
import X.AnonymousClass3CG;
import X.AnonymousClass3F5;
import X.AnonymousClass3KV;
import X.AnonymousClass3L5;
import X.AnonymousClass3LW;
import X.AnonymousClass3MH;
import X.AnonymousClass3SF;
import X.AnonymousClass3SJ;
import X.AnonymousClass3UE;
import X.AnonymousClass3UL;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.AnonymousClass4XL;
import X.AnonymousClass4YO;
import X.AnonymousClass6X4;
import X.C011004s;
import X.C011504z;
import X.C021809f;
import X.C03570Gk;
import X.C107265Nh;
import X.C135006by;
import X.C1502274l;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20040wv;
import X.C20430xY;
import X.C20810yC;
import X.C21710zg;
import X.C220412q;
import X.C226815j;
import X.C233117z;
import X.C235718z;
import X.C24361Cd;
import X.C24511Cs;
import X.C26211Jh;
import X.C27111My;
import X.C27761Ps;
import X.C32001cn;
import X.C32061ct;
import X.C32661dz;
import X.C32811eE;
import X.C33201et;
import X.C33511fU;
import X.C34681hT;
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
import X.C36441kJ;
import X.C37961nU;
import X.C39001qm;
import X.C48802i5;
import X.C48922iH;
import X.C48972iM;
import X.C55932vQ;
import X.C89314Wb;
import X.C90104Zc;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CallLogActivity extends AnonymousClass155 {
    public Parcelable A00;
    public ImageView A01;
    public ListView A02;
    public TextView A03;
    public AnonymousClass0V9 A04;
    public AnonymousClass1LI A05;
    public AnonymousClass1NG A06;
    public C33201et A07;
    public AnonymousClass1ND A08;
    public AnonymousClass6X4 A09;
    public C24361Cd A0A;
    public C235718z A0B;
    public AnonymousClass3L5 A0C;
    public AnonymousClass1Pp A0D;
    public AnonymousClass16D A0E;
    public AnonymousClass16I A0F;
    public AnonymousClass171 A0G;
    public C27761Ps A0H;
    public C20430xY A0I;
    public AnonymousClass17Z A0J;
    public AnonymousClass1HJ A0K;
    public C220412q A0L;
    public AnonymousClass1A5 A0M;
    public AnonymousClass17X A0N;
    public AnonymousClass3KV A0O;
    public C26211Jh A0P;
    public AnonymousClass141 A0Q;
    public C233117z A0R;
    public AnonymousClass1EL A0S;
    public AnonymousClass11F A0T;
    public AnonymousClass1N6 A0U;
    public C32661dz A0V;
    public C32811eE A0W;
    public AnonymousClass13J A0X;
    public ArrayList A0Y;
    public boolean A0Z;
    public boolean A0a;
    public View A0b;
    public ImageButton A0c;
    public ImageButton A0d;
    public AnonymousClass3SF A0e;
    public C48972iM A0f;
    public boolean A0g;
    public final C021809f A0h;
    public final C37961nU A0i;
    public final C32061ct A0j;
    public final HashSet A0k;
    public final C32001cn A0l;
    public final C226815j A0m;
    public final C24511Cs A0n;

    public int A2I() {
        return 78318969;
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        if (i == 1) {
            Log.i("calllog/dialog-add-contact");
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            C39001qm.A0I(r2, this, 27, R.string.f12nameremoved);
            r2.A0g(AnonymousClass4XL.A00(this, 28), R.string.f12nameremoved);
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            Log.w("calllog/add to contacts: activity not found, probably tablet");
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            C39001qm.A0I(r2, this, 29, R.string.f12nameremoved);
        }
        return r2.create();
    }

    public static void A01(CallLogActivity callLogActivity) {
        Log.i("calllog/new_conversation");
        C36391kE.A1A(callLogActivity, callLogActivity.A01, callLogActivity.A0Q, C36441kJ.A0j());
        callLogActivity.finish();
    }

    public static void A07(CallLogActivity callLogActivity) {
        GroupJid A0l2;
        Log.i("calllog/update");
        AnonymousClass141 A012 = callLogActivity.A0M.A01(callLogActivity.A0T);
        callLogActivity.A0Q = A012;
        callLogActivity.A0D.A07(callLogActivity.A01, A012);
        callLogActivity.A0e.A05(callLogActivity.A0Q);
        String str = callLogActivity.A0Q.A0X;
        if (str == null || str.isEmpty()) {
            callLogActivity.A03.setVisibility(8);
        } else {
            callLogActivity.A03.setVisibility(0);
            callLogActivity.A03.setText(callLogActivity.A0Q.A0X);
        }
        C48972iM r1 = callLogActivity.A0f;
        if (r1 != null) {
            r1.A0D(true);
        }
        C48972iM r12 = new C48972iM(callLogActivity, callLogActivity);
        callLogActivity.A0f = r12;
        C36331k8.A1F(r12, callLogActivity.A04);
        boolean z = !callLogActivity.A0S.A01(callLogActivity.A0Q);
        AnonymousClass3UE.A08(callLogActivity.A0c, z);
        AnonymousClass141 r0 = callLogActivity.A0Q;
        if (!(r0 == null || (A0l2 = C36441kJ.A0l(r0.A0H)) == null)) {
            int A0B2 = callLogActivity.A0N.A07.A0B(A0l2);
            if (C34681hT.A0D(callLogActivity.A02, callLogActivity.A0D, A0B2)) {
                callLogActivity.A0c.setImageResource(R.drawable.vec_ic_action_voicechat);
                AnonymousClass3UE.A08(callLogActivity.A0c, z);
                ImageButton imageButton = callLogActivity.A0c;
                float f = 0.4f;
                if (C34681hT.A0C(callLogActivity.A02, callLogActivity.A0D, A0B2)) {
                    f = 1.0f;
                }
                imageButton.setAlpha(f);
            }
            if (!AnonymousClass3UL.A08(callLogActivity.A06, callLogActivity.A0L, callLogActivity.A0N, callLogActivity.A0Q, A0l2)) {
                callLogActivity.A0d.setVisibility(8);
                return;
            }
        }
        AnonymousClass3UE.A08(callLogActivity.A0d, z);
    }

    public static void A0F(CallLogActivity callLogActivity) {
        int i;
        View A0L2 = C36411kG.A0L(callLogActivity.A02);
        if (A0L2 == null) {
            return;
        }
        if (callLogActivity.A02.getWidth() > callLogActivity.A02.getHeight()) {
            if (callLogActivity.A02.getFirstVisiblePosition() == 0) {
                i = A0L2.getTop();
            } else {
                i = (-callLogActivity.A0b.getHeight()) + 1;
            }
            View view = callLogActivity.A0b;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (callLogActivity.A0b.getTop() != 0) {
            View view2 = callLogActivity.A0b;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public static boolean A0G(CallLogActivity callLogActivity, C107265Nh r4) {
        boolean z;
        HashSet hashSet = callLogActivity.A0k;
        if (hashSet.contains(r4)) {
            hashSet.remove(r4);
            z = false;
        } else {
            hashSet.add(r4);
            z = true;
        }
        boolean A1R = AnonymousClass000.A1R(hashSet.size());
        AnonymousClass0V9 r0 = callLogActivity.A04;
        if (!A1R) {
            if (r0 != null) {
                r0.A05();
            }
            return z;
        } else if (r0 == null) {
            callLogActivity.A04 = callLogActivity.But(callLogActivity.A0h);
            return z;
        } else {
            r0.A06();
            return z;
        }
    }

    public void A2F() {
        if (!this.A0g) {
            this.A0g = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0L = C36351kA.A0a(r2);
            this.A08 = C36391kE.A0Y(r2);
            this.A0D = C36361kB.A0V(r2);
            this.A0E = C36341k9.A0R(r2);
            this.A0G = C36341k9.A0S(r2);
            this.A0C = C36391kE.A0a(r2);
            this.A0X = C36351kA.A0q(r2);
            this.A0B = C36391kE.A0Z(r2);
            this.A06 = C36381kD.A0V(r2);
            this.A0F = C36351kA.A0S(r2);
            this.A0S = C36381kD.A0d(r2);
            this.A0V = C36371kC.A0k(r2);
            this.A0K = (AnonymousClass1HJ) r2.A1O.get();
            this.A0W = C36401kF.A0e(r2);
            this.A09 = (AnonymousClass6X4) r2.A1M.get();
            this.A0A = C36371kC.A0T(r2);
            this.A0I = C36421kH.A0K(r2);
            this.A0P = (C26211Jh) r2.A7X.get();
            this.A0N = C36351kA.A0b(r2);
            this.A0H = C36361kB.A0W(r2);
            this.A0M = C36371kC.A0X(r2);
            this.A0R = C36371kC.A0c(r2);
            this.A0J = C36411kG.A0c(r2);
            this.A0U = C36361kB.A0e(r2);
            this.A05 = C36361kB.A0S(r2);
            this.A07 = (C33201et) A0L2.A2K.get();
        }
    }

    public void A2X() {
        this.A0U.A03((AnonymousClass11F) null, 15);
        super.A2X();
    }

    public /* synthetic */ void A3i(String str, Bundle bundle) {
        if (str.equals("request_bottom_sheet_fragment")) {
            if (bundle.getBoolean("is_contact_saved")) {
                this.A0I.A08();
            }
            this.A0V.A01();
        }
        getSupportFragmentManager().A0m("request_bottom_sheet_fragment");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 11 || i == 10) {
            if (i2 == -1) {
                this.A0I.A08();
            }
            this.A0V.A01();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean A1Y = C36331k8.A1Y(this.A06, this.A0Q);
        MenuItem findItem = menu.findItem(R.id.menuitem_unblock_contact);
        if (findItem != null) {
            findItem.setVisible(A1Y);
        }
        MenuItem findItem2 = menu.findItem(R.id.menuitem_block_contact);
        if (findItem2 != null) {
            findItem2.setVisible(!A1Y);
        }
        return true;
    }

    public CallLogActivity(int i) {
        this.A0g = false;
        C89314Wb.A00(this, 35);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public void Bih(AnonymousClass0V9 r1) {
        super.Bih(r1);
        C36391kE.A14(this);
    }

    public void Bii(AnonymousClass0V9 r1) {
        super.Bii(r1);
        C36341k9.A0n(this);
    }

    public AnonymousClass0V9 But(C021809f r4) {
        AnonymousClass0V9 But = super.But(r4);
        View findViewById = findViewById(R.id.action_mode_close_button);
        if (findViewById instanceof ImageView) {
            ((ImageView) findViewById).setImageResource(R.drawable.abc_ic_ab_back_material);
        }
        return But;
    }

    public void onCreate(Bundle bundle) {
        String formatDateTime;
        super.onCreate(bundle);
        boolean A1X = C36341k9.A1X(this);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass11F A0F2 = C36331k8.A0F(this);
        C18740tg.A06(A0F2);
        this.A0T = A0F2;
        this.A0Z = getIntent().getBooleanExtra("is_voice_chat", false);
        this.A02 = (ListView) findViewById(16908298);
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, this.A02, false);
        C011504z.A06(inflate, 2);
        this.A02.addHeaderView(inflate, (Object) null, false);
        View findViewById = findViewById(R.id.header);
        this.A0b = findViewById;
        findViewById.setClickable(A1X);
        findViewById(R.id.contact_info_container).setFocusable(A1X);
        AnonymousClass3SF B3q = this.A05.B3q(this, C36421kH.A0I(this, R.id.conversation_contact_name));
        this.A0e = B3q;
        C33511fU.A03(B3q.A01);
        this.A03 = C36391kE.A0Q(this, R.id.conversation_contact_status);
        View findViewById2 = findViewById(R.id.divider);
        C18820ts r1 = this.A00;
        C18740tg.A06(this);
        C36361kB.A0z(this, findViewById2, r1, R.drawable.list_header_divider);
        this.A02.setOnScrollListener(new C55932vQ(this, A1X ? 1 : 0));
        C90104Zc.A00(this.A02.getViewTreeObserver(), this, 3);
        this.A01 = C36411kG.A0Q(this, R.id.photo_btn);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(C36401kF.A0o(new AnonymousClass3CG(this).A00, R.string.f12nameremoved));
        String A0q = AnonymousClass000.A0q("-avatar", A0u);
        C011004s.A08(this.A01, A0q);
        this.A01.setOnClickListener(new C48922iH(2, A0q, this));
        this.A0c = (ImageButton) C03570Gk.A0B(this, R.id.call_btn);
        this.A0d = (ImageButton) C03570Gk.A0B(this, R.id.video_call_btn);
        this.A0c.setOnClickListener(new C48802i5(0, this, false));
        this.A0d.setOnClickListener(new C48802i5(0, this, A1X));
        ListView listView = this.A02;
        C37961nU r4 = this.A0i;
        listView.setAdapter(r4);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
        if (parcelableArrayListExtra == null) {
            this.A00 = null;
        } else {
            this.A0Y = AnonymousClass001.A0I();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C135006by r9 = (C135006by) ((Parcelable) it.next());
                AnonymousClass1HJ r8 = this.A0K;
                UserJid userJid = r9.A01;
                boolean z = r9.A03;
                C107265Nh A002 = AnonymousClass1HJ.A00(r8, new C135006by(r9.A00, userJid, r9.A02, z));
                if (A002 != null) {
                    this.A0Y.add(A002);
                }
                if (this.A00 == null) {
                    this.A00 = r9;
                }
            }
            int size = parcelableArrayListExtra.size();
            ArrayList arrayList = this.A0Y;
            if (size != arrayList.size()) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                C36341k9.A1N("CallLogActivity/onCreate:missingKeys: ", A0u2, arrayList);
                C36341k9.A1N(" out of ", A0u2, parcelableArrayListExtra);
                C36321k7.A1Z(A0u2, " fetched");
            }
            r4.A01 = this.A0Y;
            r4.notifyDataSetChanged();
            ArrayList arrayList2 = this.A0Y;
            if (!arrayList2.isEmpty()) {
                C107265Nh r42 = (C107265Nh) arrayList2.get(0);
                long A082 = this.A07.A08(r42.A01);
                TextView A0Q2 = C36391kE.A0Q(this, R.id.calls_title);
                if (DateUtils.isToday(A082)) {
                    formatDateTime = C20040wv.A00(this.A00);
                } else if (DateUtils.isToday(86400000 + A082)) {
                    formatDateTime = C20040wv.A01(this.A00);
                } else {
                    formatDateTime = DateUtils.formatDateTime(this, A082, 16);
                }
                A0Q2.setText(formatDateTime);
                if (!(r42.A0G == null || r42.A0D == null || !C34681hT.A0M(this.A0D))) {
                    this.A04.Bp1(new C1502274l(this, r42, r42.A0G.A00, 30));
                }
            } else {
                finish();
            }
        }
        A07(this);
        this.A0F.registerObserver(this.A0m);
        this.A0A.registerObserver(this.A0l);
        this.A0R.registerObserver(this.A0n);
        C36401kF.A1C(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_new_conversation, 0, R.string.f12nameremoved).setIcon(R.drawable.vec_ic_chat_filled).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_delete);
        if (!(this.A0T instanceof GroupJid)) {
            if (!this.A0Q.A0B() && (!C36421kH.A1V(this))) {
                menu.add(0, R.id.menuitem_add_to_contacts, 0, R.string.f12nameremoved);
            }
            menu.add(0, R.id.menuitem_unblock_contact, 0, R.string.f12nameremoved);
            menu.add(0, R.id.menuitem_block_contact, 0, R.string.f12nameremoved);
        }
        if (!this.A0D.A0E(3321)) {
            return true;
        }
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.unregisterObserver(this.A0m);
        this.A0A.unregisterObserver(this.A0l);
        this.A0R.unregisterObserver(this.A0n);
        if (this.A0a) {
            this.A0a = false;
            this.A0B.A03 = false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent A0Q2;
        if (menuItem.getItemId() != 16908332) {
            if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
                Log.i("calllog/delete");
                ArrayList arrayList = this.A0Y;
                if (arrayList != null) {
                    this.A0K.A0B(arrayList);
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_new_conversation) {
                AnonymousClass11F r1 = this.A0Q.A0H;
                if (r1 == null || !this.A0B.A0O() || !this.A0B.A0P(r1)) {
                    A01(this);
                    return true;
                }
                this.A0B.A0A(this, new AnonymousClass2EO(r1, true), this.A0j, 5);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_add_to_contacts) {
                AnonymousClass3SJ.A01(this, 1);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_unblock_contact) {
                this.A06.A0G(this, this.A0Q, "call_log_block", true);
                return true;
            } else {
                boolean z = false;
                if (menuItem.getItemId() == R.id.menuitem_block_contact) {
                    AnonymousClass141 r0 = this.A0Q;
                    if (r0 != null && r0.A0C()) {
                        z = true;
                    }
                    UserJid A0b2 = C36401kF.A0b(this.A0T);
                    C18740tg.A06(A0b2);
                    if (z) {
                        C20810yC r12 = this.A0D;
                        AnonymousClass00C.A0D(r12, 0);
                        A0Q2 = AnonymousClass190.A0x(this, A0b2, "biz_call_log_block", true, r12.A0E(6185), false, false);
                    } else {
                        AnonymousClass3F5 B3t = this.A07.B3t(A0b2, "call_log_block");
                        B3t.A05 = true;
                        boolean A0E2 = this.A0D.A0E(4351);
                        B3t.A04 = A0E2;
                        UserJid userJid = B3t.A07;
                        boolean z2 = B3t.A02;
                        boolean z3 = B3t.A05;
                        int i = B3t.A01;
                        Btm(BlockConfirmationDialogFragment.A03(userJid, B3t.A08, B3t.A00, i, z2, B3t.A03, A0E2, z3));
                        return true;
                    }
                } else if (menuItem.getItemId() != R.id.menuitem_call_log_bugnub) {
                    return false;
                } else {
                    A0Q2 = AnonymousClass190.A0Q(this, (Uri) null, this.A00, true);
                }
                startActivity(A0Q2);
                return true;
            }
        }
        finish();
        return true;
    }

    public CallLogActivity() {
        this(0);
        this.A04 = null;
        this.A0k = C36441kJ.A16();
        this.A0i = new C37961nU(this);
        this.A0h = new AnonymousClass4YO(this, 0);
        this.A0m = AnonymousClass4W3.A00(this, 1);
        this.A0l = new AnonymousClass4W0(this, 0);
        this.A0n = new AnonymousClass4WB(this, 0);
        this.A0j = new AnonymousClass3MH(this, 0);
    }
}
