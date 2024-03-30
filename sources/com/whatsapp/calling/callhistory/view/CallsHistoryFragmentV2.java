package com.whatsapp.calling.callhistory.view;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass04H;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass11e;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass1C6;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1JL;
import X.AnonymousClass1MK;
import X.AnonymousClass1N6;
import X.AnonymousClass1ND;
import X.AnonymousClass1PZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RK;
import X.AnonymousClass1RY;
import X.AnonymousClass2RE;
import X.AnonymousClass3OM;
import X.AnonymousClass6W1;
import X.AnonymousClass72P;
import X.C012005e;
import X.C021809f;
import X.C02740Bs;
import X.C02800By;
import X.C107265Nh;
import X.C135006by;
import X.C18740tg;
import X.C18820ts;
import X.C19460v5;
import X.C19730wQ;
import X.C19740wR;
import X.C19770wU;
import X.C19970wo;
import X.C20350xQ;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21060yb;
import X.C222013h;
import X.C222813r;
import X.C224514j;
import X.C225314u;
import X.C226015b;
import X.C226715i;
import X.C229216m;
import X.C24801Dv;
import X.C26211Jh;
import X.C27731Pn;
import X.C29411Wn;
import X.C31921ce;
import X.C31931cf;
import X.C31941cg;
import X.C32461de;
import X.C32471df;
import X.C32481dg;
import X.C32491dh;
import X.C32501di;
import X.C32511dj;
import X.C32521dk;
import X.C32601dt;
import X.C32671e0;
import X.C32681e1;
import X.C33521fV;
import X.C33551fY;
import X.C33771fu;
import X.C34021gK;
import X.C34591hI;
import X.C34621hN;
import X.C34681hT;
import X.C34691hU;
import X.C34841hj;
import X.C35331iW;
import X.C35671j4;
import X.C36151jq;
import X.C36201jv;
import X.C42631z8;
import X.C44032Kw;
import X.C49012iQ;
import X.C53402rG;
import X.C54512t4;
import X.C65533Sl;
import X.C80223v3;
import X.C89104Vg;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class CallsHistoryFragmentV2 extends Hilt_CallsHistoryFragmentV2 implements C31921ce, AnonymousClass1RK, C31931cf, C31941cg {
    public View A00;
    public View A01;
    public View A02;
    public AnonymousClass0V9 A03;
    public RecyclerView A04;
    public C19460v5 A05;
    public C19460v5 A06;
    public C19460v5 A07;
    public C24801Dv A08;
    public AnonymousClass17Y A09;
    public C19730wQ A0A;
    public C32601dt A0B;
    public C33771fu A0C;
    public C29411Wn A0D;
    public C34591hI A0E;
    public CallsHistoryFragmentV2ViewModel A0F;
    public AnonymousClass1ND A0G;
    public AnonymousClass1PZ A0H;
    public AnonymousClass1MK A0I;
    public C229216m A0J;
    public AnonymousClass16D A0K;
    public AnonymousClass1RY A0L;
    public AnonymousClass1RY A0M;
    public C27731Pn A0N;
    public C32671e0 A0O;
    public C21060yb A0P;
    public C19970wo A0Q;
    public C18820ts A0R;
    public AnonymousClass1HJ A0S;
    public AnonymousClass17X A0T;
    public AnonymousClass1HO A0U;
    public C26211Jh A0V;
    public C20810yC A0W;
    public C20350xQ A0X;
    public AnonymousClass1JL A0Y;
    public AnonymousClass11e A0Z;
    public AnonymousClass1C6 A0a;
    public AnonymousClass1N6 A0b;
    public C32681e1 A0c;
    public AnonymousClass13J A0d;
    public AnonymousClass1RJ A0e;
    public AnonymousClass1RJ A0f;
    public AnonymousClass1RJ A0g;
    public AnonymousClass1RJ A0h;
    public AnonymousClass1RJ A0i;
    public AnonymousClass1RJ A0j;
    public C19770wU A0k;
    public AnonymousClass005 A0l;
    public AnonymousClass005 A0m;
    public CharSequence A0n = "";
    public boolean A0o;
    public boolean A0p = false;
    public boolean A0q = true;
    public boolean A0r = false;
    public AnonymousClass1RJ[] A0s;
    public C02740Bs A0t;
    public ObservableListView A0u;
    public boolean A0v = false;
    public final C32501di A0w = new C32501di(this);
    public final C32461de A0x = new C32461de(this);
    public final C32471df A0y = new C32471df(this);
    public final C32481dg A0z = new C32481dg(this);
    public final C32511dj A10 = new C32511dj(this);
    public final C32521dk A11 = new C32521dk(this);
    public final Runnable A12 = new C35671j4(this, 17);
    public final HashMap A13 = new HashMap();
    public final C021809f A14 = new C32491dh(this);

    public static void A09(CallsHistoryFragmentV2 callsHistoryFragmentV2, AnonymousClass141 r7, long j) {
        String str;
        CallsHistoryFragmentV2 callsHistoryFragmentV22 = callsHistoryFragmentV2;
        Context A1D = callsHistoryFragmentV2.A1D();
        if (A1D == null) {
            str = "CallsHistoryFragmentV2/openPrecallLobby context is null";
        } else {
            AnonymousClass11F r1 = r7.A0H;
            Parcelable.Creator creator = AnonymousClass147.CREATOR;
            AnonymousClass147 A032 = C65533Sl.A03(r1);
            if (A032 == null) {
                str = "CallsHistoryFragmentV2/openPrecallLobby group jid is null";
            } else {
                callsHistoryFragmentV2.A0k.Bp1(new C35331iW(callsHistoryFragmentV22, A1D, A032, 1, j));
                return;
            }
        }
        Log.w(str);
    }

    public void A1N(int i, int i2, Intent intent) {
        if (i2 == -1) {
            boolean z = false;
            if (i != 10) {
                if (i == 150) {
                    this.A0o = true;
                    A03();
                } else if (i == 157) {
                    this.A0o = true;
                    A00(this, false);
                }
            } else if (intent != null) {
                try {
                    String stringExtra = intent.getStringExtra("contact");
                    C222813r r0 = UserJid.Companion;
                    UserJid A012 = C222813r.A01(stringExtra);
                    int intExtra = intent.getIntExtra("call_type", 1);
                    AnonymousClass1ND r4 = this.A0G;
                    AnonymousClass141 A0D2 = this.A0K.A0D(A012);
                    AnonymousClass01I A0i2 = A0i();
                    if (intExtra == 2) {
                        z = true;
                    }
                    r4.Bua(A0i2, A0D2, 3, z);
                } catch (C19740wR unused) {
                    Log.e("callsHistory/callPicker failed to get selected contact");
                }
            }
        }
    }

    public /* synthetic */ void B0Y(C226715i r2) {
        AnonymousClass00C.A0D(r2, 1);
        r2.BQx();
    }

    public boolean B0r() {
        return true;
    }

    public void B5R() {
        this.A0q = false;
    }

    public void B6Q() {
        this.A0q = true;
    }

    public boolean B7g() {
        return true;
    }

    public String BDn() {
        return null;
    }

    public String BH5() {
        return null;
    }

    public Drawable BH6() {
        return null;
    }

    public int BIA() {
        return 400;
    }

    public String BIO() {
        return null;
    }

    public void Bg1() {
    }

    public boolean BvL() {
        return true;
    }

    public static int A00(CallsHistoryFragmentV2 callsHistoryFragmentV2, boolean z) {
        if (callsHistoryFragmentV2.A0J.A00()) {
            Context A1D = callsHistoryFragmentV2.A1D();
            Intent intent = new Intent();
            intent.setClassName(A1D.getPackageName(), "com.whatsapp.calling.favorite.FavoritePicker");
            callsHistoryFragmentV2.A1C(intent);
            return 0;
        } else if (!z) {
            return 0;
        } else {
            RequestPermissionActivity.A0H(callsHistoryFragmentV2, R.string.f12nameremoved, 157);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r5.getBoolean("request_sync", false) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r5, android.view.LayoutInflater r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            X.11e r0 = r4.A0Z
            java.lang.String r3 = "CallsHistoryFragmentV2_onCreateView"
            r0.A09(r3)
            java.lang.String r0 = "CallsHistoryFragmentV2/onCreateView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            if (r5 == 0) goto L_0x0018
            java.lang.String r0 = "request_sync"
            boolean r1 = r5.getBoolean(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r4.A0o = r0
            r0 = 2131624333(0x7f0e018d, float:1.8875843E38)
            android.view.View r1 = r6.inflate(r0, r7, r2)
            X.11e r0 = r4.A0Z
            r0.A08(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1J() {
        C02740Bs r1;
        Log.i("voip/CallsHistoryFragmentV2/onDestroyView");
        this.A0M.A02();
        this.A0L.A02();
        if (this.A0v && (r1 = this.A0t) != null) {
            this.A0E.A01.unregisterObserver(r1);
        }
        super.A1J();
        this.A00 = null;
        this.A0u = null;
        this.A04 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public void A1L() {
        this.A0Z.A09("CallsHistoryFragmentV2_onResume");
        super.A1L();
        this.A0F.A0W();
        this.A0Z.A08("CallsHistoryFragmentV2_onResume");
    }

    public void A1R(Bundle bundle) {
        bundle.putBoolean("request_sync", this.A0o);
    }

    public void A1S(Bundle bundle, View view) {
        Log.i("CallsHistoryFragmentV2/onViewCreated");
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = (CallsHistoryFragmentV2ViewModel) new AnonymousClass04H(this).A00(CallsHistoryFragmentV2ViewModel.class);
        this.A0F = callsHistoryFragmentV2ViewModel;
        callsHistoryFragmentV2ViewModel.A0i.A08(A0m(), new C36201jv(this, 5));
        this.A0F.A0K.A08(A0m(), new C36201jv(this, 4));
        this.A04 = (RecyclerView) C012005e.A02(A0d(), R.id.calls_recyclerView);
        this.A0M = this.A0N.A05(A0a(), "calls-fragment-single");
        this.A0L = this.A0N.A06("calls-fragment-multi", 0.0f, A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A04.setLayoutManager(new LinearLayoutManager());
        this.A04.setAdapter(this.A0E);
        C34591hI r2 = this.A0E;
        r2.A01 = this.A0x;
        r2.A02 = this.A0y;
        r2.A03 = this.A0z;
        r2.A07 = this.A0M;
        r2.A06 = this.A0L;
        Runnable runnable = this.A12;
        r2.A08 = runnable;
        Set keySet = this.A13.keySet();
        AnonymousClass00C.A0D(keySet, 0);
        r2.A09 = keySet;
        C34591hI r1 = this.A0E;
        r1.A00 = this.A0w;
        r1.A04 = this.A10;
        if (C34681hT.A0H(this.A0W)) {
            C34591hI r22 = this.A0E;
            r22.A0A = new C44032Kw(this, 2);
            r22.A0B = new C44032Kw(this, 3);
        }
        if (C20800yB.A01(C21000yV.A02, this.A0W, 4119)) {
            this.A0E.A05 = this.A11;
        }
        this.A04.setItemAnimator((C02800By) null);
        this.A04.setScrollbarFadingEnabled(true);
        C33551fY.A00(view, this);
        ((AbsListView) C012005e.A02(view, 16908298)).setAdapter((ListAdapter) null);
        AnonymousClass1RJ r12 = new AnonymousClass1RJ(C012005e.A02(view, R.id.calls_empty_no_contacts_stub));
        this.A0e = r12;
        r12.A07(new C36151jq(this, 1));
        AnonymousClass1RJ r13 = new AnonymousClass1RJ(C012005e.A02(view, R.id.contacts_empty_permission_denied_stub));
        this.A0f = r13;
        r13.A07(new C36151jq(this, 3));
        this.A0g = new AnonymousClass1RJ(C012005e.A02(view, R.id.calls_progress_bar_stub));
        this.A0i = new AnonymousClass1RJ(C012005e.A02(view, R.id.search_no_matches_text_stub));
        AnonymousClass1RJ r14 = new AnonymousClass1RJ(C012005e.A02(view, R.id.search_no_matches_frame_stub));
        this.A0h = r14;
        r14.A07(new C36151jq(this, 2));
        AnonymousClass1RJ r15 = new AnonymousClass1RJ(C012005e.A02(view, R.id.welcome_calls_layout_stub));
        this.A0j = r15;
        r15.A07(new C36151jq(this, 0));
        this.A0u = (ObservableListView) C012005e.A02(view, 16908298);
        this.A00 = C012005e.A02(view, 16908292);
        this.A01 = C012005e.A02(view, R.id.no_search_results_e2ee_footer);
        this.A0s = new AnonymousClass1RJ[]{this.A0e, this.A0f, this.A0g, this.A0i, this.A0h, this.A0j};
        this.A02 = this.A04;
        A10(true);
        TextView textView = (TextView) C012005e.A02(this.A01, R.id.e2ee_main_text);
        textView.setText(this.A0c.A03(textView.getContext(), runnable, A0n(R.string.f12nameremoved), "%s", C224514j.A00(textView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
        textView.setMovementMethod(new C34021gK(this.A0W));
        if (!C20800yB.A01(C21000yV.A01, this.A0W, 3637)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            textView.setLayoutParams(marginLayoutParams);
        }
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        if (C34681hT.A0H(this.A0W)) {
            menu.add(3, R.id.menuitem_add_favorite, 0, R.string.f12nameremoved).setIcon(C54512t4.A00(this, R.drawable.ic_notif_heart_wds));
            menu.add(3, R.id.menuitem_edit_favorites, 0, R.string.f12nameremoved).setIcon(C54512t4.A00(this, R.drawable.menu_favorites_edit));
        }
        C20810yC r1 = this.A0W;
        C21000yV r2 = C21000yV.A02;
        if (!C20800yB.A01(r2, r1, 4023)) {
            menu.add(3, R.id.menuitem_clear_call_log, 0, R.string.f12nameremoved).setIcon(C54512t4.A00(this, R.drawable.ic_settings_delete));
        }
        if (this.A06.A05() && C20800yB.A01(r2, this.A0W, 852) && C20800yB.A01(r2, this.A0X.A0a, 2574)) {
            this.A06.A02();
            throw new NullPointerException("getMenuItemBusinessToolsId");
        }
    }

    public void A1Z() {
        if (this.A0I.A00()) {
            Log.w("voip/CallsFragment tried to start outgoing call from active voip call");
            this.A09.A06(R.string.f12nameremoved, 0);
            return;
        }
        C20810yC r1 = this.A0W;
        C21000yV r3 = C21000yV.A02;
        if (!C20800yB.A01(r3, r1, 5868) && !this.A0J.A00()) {
            RequestPermissionActivity.A0H(this, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (C20800yB.A00(r3, this.A0W, 5370) > 0) {
            C20810yC r12 = this.A0W;
            if (C20800yB.A00(r3, r12, 5370) > 0 && C20800yB.A01(r3, r12, 5757)) {
                AnonymousClass6W1 r32 = (AnonymousClass6W1) this.A0m.get();
                r32.A03.execute(new C80223v3(r32, 0));
            }
            Intent className = new Intent().setClassName(A0a().getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker");
            className.putExtra("hidden_jids", 0);
            className.putExtra("call_from_ui", 44);
            A1C(className);
        } else {
            A03();
        }
    }

    public void B1H(C226015b r3) {
        String str = r3.A02;
        this.A0n = str;
        this.A0F.A0T.filter(str);
    }

    public Drawable BDm() {
        int i;
        boolean z = true;
        if (C20800yB.A00(C21000yV.A02, this.A0W, 5370) != 1) {
            z = false;
        }
        Context A0a2 = A0a();
        if (z) {
            i = R.drawable.vec_ic_action_add_rounded;
        } else {
            boolean z2 = C222013h.A07;
            i = R.drawable.ic_action_new_call;
            if (z2) {
                i = R.drawable.ic_action_new_call_filled_wds;
            }
        }
        return AnonymousClass00E.A00(A0a2, i);
    }

    public void BYN() {
        if (!this.A0p) {
            this.A0p = true;
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0F;
            if (!callsHistoryFragmentV2ViewModel.A0G) {
                callsHistoryFragmentV2ViewModel.A0G = true;
                C34621hN r3 = callsHistoryFragmentV2ViewModel.A0M;
                r3.A01();
                C20810yC r1 = callsHistoryFragmentV2ViewModel.A0f;
                if (C34681hT.A0M(r1)) {
                    r3.A02();
                }
                if (C34681hT.A0H(r1)) {
                    C49012iQ r12 = r3.A04;
                    if (r12 != null) {
                        r12.A0D(true);
                    }
                    C49012iQ r2 = new C49012iQ(r3);
                    r3.A04 = r2;
                    r3.A0S.Box(r2, new Void[0]);
                }
            }
        }
        if (C20800yB.A01(C21000yV.A01, this.A0W, 3637) && this.A0t == null) {
            C89104Vg r13 = new C89104Vg(this, 0);
            this.A0t = r13;
            this.A0E.BnA(r13);
        }
        this.A0v = true;
        if (!isEmpty()) {
            this.A0Y.A02(400, false);
        }
    }

    public void Bs8(boolean z) {
        C34691hU r2 = this.A0F.A0U;
        if (z) {
            r2.A00 = UUID.randomUUID();
            r2.A01 = true;
            AnonymousClass2RE A002 = C34691hU.A00(r2);
            A002.A01 = 0;
            A002.A03 = 0;
            r2.A02.Bly(A002);
            return;
        }
        r2.A00 = null;
    }

    public void Bs9(boolean z) {
        View view;
        EmptyTellAFriendView emptyTellAFriendView;
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0F;
        synchronized (callsHistoryFragmentV2ViewModel) {
            if (C20800yB.A01(C21000yV.A02, callsHistoryFragmentV2ViewModel.A0f, 6792)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CallsHistoryFragmentV2ViewModel/setHasActiveObserver ");
                sb.append(z);
                Log.i(sb.toString());
                boolean z2 = callsHistoryFragmentV2ViewModel.A0H;
                callsHistoryFragmentV2ViewModel.A0H = z;
                if (z && !z2) {
                    callsHistoryFragmentV2ViewModel.A0M.A01();
                }
            }
        }
        if (z) {
            this.A0b.A02((AnonymousClass11F) null, 15);
            if (this.A0r && (view = this.A02) != null && (emptyTellAFriendView = (EmptyTellAFriendView) view.findViewById(R.id.calls_history_empty_tell_a_friend_view)) != null) {
                emptyTellAFriendView.setImage(R.drawable.wds_illustration_invite);
                this.A0r = false;
            }
        }
    }

    public boolean isEmpty() {
        C18740tg.A0D(this.A0v, "isEmpty should be called after onFragmentAsyncInit for accuracy");
        CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = this.A0F;
        if (!callsHistoryFragmentV2ViewModel.A0m.isEmpty() || !callsHistoryFragmentV2ViewModel.A0k.isEmpty()) {
            return false;
        }
        return true;
    }

    private void A03() {
        AnonymousClass3OM r3 = new AnonymousClass3OM(A0h());
        boolean z = true;
        r3.A04 = true;
        if (!this.A0o || this.A0A.A0L()) {
            z = false;
        }
        r3.A0F = Boolean.valueOf(z);
        startActivityForResult(AnonymousClass3OM.A02(r3, "com.whatsapp.contact.picker.ContactPicker"), 10);
        this.A0o = false;
    }

    public static void A05(View view, CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        if ((callsHistoryFragmentV2.A0a().getResources().getConfiguration().screenLayout & 15) == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 48;
                view.setLayoutParams(layoutParams2);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
            }
        }
    }

    public static void A06(AnonymousClass72P r7, CallsHistoryFragmentV2 callsHistoryFragmentV2, AnonymousClass141 r9) {
        AnonymousClass11F r2;
        String str;
        Intent intent;
        Context A1D = callsHistoryFragmentV2.A1D();
        if (A1D == null) {
            str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked context null";
        } else {
            List<C107265Nh> unmodifiableList = Collections.unmodifiableList(r7.A03);
            if (unmodifiableList.isEmpty()) {
                str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked no calls registered for item";
            } else {
                boolean z = false;
                C107265Nh r1 = (C107265Nh) unmodifiableList.get(0);
                if (!r7.A04() || r9 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C107265Nh A092 : unmodifiableList) {
                        arrayList.add(A092.A09());
                    }
                    if (r9 == null || !r7.A04()) {
                        AnonymousClass141 A022 = r7.A02();
                        if (A022 == null) {
                            str = "CallsHistoryFragmentV2/launchCallLogInfoPage/onViewHolderClicked no contact registered for call group";
                        } else {
                            r2 = A022.A0H;
                        }
                    } else {
                        r2 = r9.A0H;
                    }
                    if (((C107265Nh) unmodifiableList.get(0)).A08 == 2) {
                        z = true;
                    }
                    intent = new Intent();
                    intent.setClassName(A1D.getPackageName(), "com.whatsapp.calling.callhistory.CallLogActivity");
                    intent.putExtra("jid", AnonymousClass143.A03(r2));
                    intent.putExtra("calls", arrayList);
                    intent.putExtra("is_voice_chat", z);
                } else {
                    C135006by A093 = r1.A09();
                    intent = new Intent();
                    intent.setClassName(A1D.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallLogActivity");
                    intent.putExtra("call_log_key", A093);
                }
                callsHistoryFragmentV2.A1C(intent);
                return;
            }
        }
        Log.w(str);
    }

    public static void A07(C42631z8 r10, CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        String str;
        AnonymousClass0V9 r0;
        C34841hj A0B2 = r10.A0B();
        if (A0B2 == null) {
            str = "CallsHistoryFragmentV2/toggleItemSelection view holder not bound";
        } else {
            AnonymousClass72P B9E = A0B2.B9E();
            if (B9E == null) {
                str = "CallsHistoryFragmentV2/toggleItemSelection call group is null";
            } else {
                String A032 = B9E.A03();
                HashMap hashMap = callsHistoryFragmentV2.A13;
                boolean containsKey = hashMap.containsKey(A032);
                if (containsKey) {
                    hashMap.remove(A032);
                    if (hashMap.isEmpty() && (r0 = callsHistoryFragmentV2.A03) != null) {
                        r0.A05();
                    }
                } else {
                    hashMap.put(A032, r10);
                    if (callsHistoryFragmentV2.A03 == null) {
                        AnonymousClass01I A0h2 = callsHistoryFragmentV2.A0h();
                        if (A0h2 instanceof AnonymousClass01L) {
                            callsHistoryFragmentV2.A03 = ((AnonymousClass01L) A0h2).But(callsHistoryFragmentV2.A14);
                        }
                    }
                }
                r10.A0D(!containsKey, true, true);
                AnonymousClass0V9 r02 = callsHistoryFragmentV2.A03;
                if (r02 != null) {
                    r02.A06();
                }
                C34591hI r1 = callsHistoryFragmentV2.A0E;
                Set keySet = hashMap.keySet();
                AnonymousClass00C.A0D(keySet, 0);
                r1.A09 = keySet;
                if (!hashMap.isEmpty()) {
                    AnonymousClass01I A0h3 = callsHistoryFragmentV2.A0h();
                    if (A0h3 == null) {
                        str = "CallsHistoryFragmentV2/toggleItemSelection activity null for # items selected";
                    } else {
                        C33521fV.A00(A0h3, callsHistoryFragmentV2.A0P, callsHistoryFragmentV2.A0a().getResources().getQuantityString(R.plurals.f10nameremoved, hashMap.size(), new Object[]{Integer.valueOf(hashMap.size())}));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Log.w(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (X.C20800yB.A00(X.C21000yV.A02, r1.A0f, 4708) == 2) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r6, int r7) {
        /*
            boolean r0 = r6.A12()
            if (r0 == 0) goto L_0x0081
            android.view.View r0 = r6.A0F
            if (r0 == 0) goto L_0x0081
            r0 = 1
            r5 = 0
            if (r7 == r0) goto L_0x003f
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r6.A0F
            boolean r0 = r0.A0a()
            if (r0 != 0) goto L_0x003f
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r6.A0F
            X.1hk r0 = r1.A01
            if (r0 == 0) goto L_0x0031
            java.util.ArrayList r0 = r1.A0C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0031
            X.0yC r2 = r1.A0f
            r1 = 4708(0x1264, float:6.597E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            r0 = 2
            if (r1 != r0) goto L_0x003f
        L_0x0031:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r6.A0F
            X.3du r0 = r1.A02
            if (r0 == 0) goto L_0x0086
            java.util.ArrayList r0 = r1.A0C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0086
        L_0x003f:
            X.0yC r2 = r6.A0W
            X.0yV r1 = X.C21000yV.A01
            r0 = 3289(0xcd9, float:4.609E-42)
            boolean r3 = X.C20800yB.A01(r1, r2, r0)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r6.A0F
            java.util.ArrayList r0 = r0.A0k
            boolean r2 = r0.isEmpty()
            android.content.Context r0 = r6.A0a()
            android.content.res.Resources r1 = r0.getResources()
            if (r2 == 0) goto L_0x0082
            r0 = 2131166027(0x7f07034b, float:1.7946288E38)
            if (r3 == 0) goto L_0x0063
            r0 = 2131166763(0x7f07062b, float:1.794778E38)
        L_0x0063:
            int r4 = r1.getDimensionPixelSize(r0)
        L_0x0067:
            com.whatsapp.collections.observablelistview.ObservableListView r0 = r6.A0u
            r0.setClipToPadding(r5)
            com.whatsapp.collections.observablelistview.ObservableListView r3 = r6.A0u
            int r2 = r3.getPaddingLeft()
            com.whatsapp.collections.observablelistview.ObservableListView r0 = r6.A0u
            int r1 = r0.getPaddingRight()
            com.whatsapp.collections.observablelistview.ObservableListView r0 = r6.A0u
            int r0 = r0.getPaddingBottom()
            r3.setPadding(r2, r4, r1, r0)
        L_0x0081:
            return
        L_0x0082:
            r0 = 2131166917(0x7f0706c5, float:1.7948093E38)
            goto L_0x0063
        L_0x0086:
            r4 = 0
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A08(com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2, int):void");
    }

    public static void A0A(CallsHistoryFragmentV2 callsHistoryFragmentV2, AnonymousClass141 r5, boolean z) {
        AnonymousClass01I A0h2 = callsHistoryFragmentV2.A0h();
        if (A0h2 instanceof C225314u) {
            int i = 16;
            if (!TextUtils.isEmpty(callsHistoryFragmentV2.A0F.A0T.A01)) {
                i = 35;
            }
            C225314u r3 = (C225314u) A0h2;
            if (!r5.A0G() || !C34681hT.A0R(callsHistoryFragmentV2.A0W, false)) {
                CallConfirmationFragment.A08(r3, r5, Integer.valueOf(i), z);
                return;
            }
            Jid A062 = r5.A06(AnonymousClass147.class);
            C18740tg.A06(A062);
            r3.Btl(C53402rG.A00((AnonymousClass147) A062, i, z), "LGCCallConfirmationSheet");
            return;
        }
        Log.e("Cannot call group contact since activity is not a dialog activity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.A0k.isEmpty() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1T(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131431608(0x7f0b10b8, float:1.848495E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x0022
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r3.A0F
            java.util.LinkedHashMap r0 = r1.A0m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
            java.util.ArrayList r0 = r1.A0k
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r0 = r0 ^ 1
            r2.setVisible(r0)
        L_0x0022:
            r0 = 2131431651(0x7f0b10e3, float:1.8485037E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x003e
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0F
            java.util.List r0 = r0.A0F
            if (r0 == 0) goto L_0x0038
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            r0 = r0 ^ 1
            r2.setVisible(r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A1T(android.view.Menu):void");
    }

    public boolean A1X(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_add_favorite) {
            A00(this, true);
            return true;
        } else if (itemId == R.id.menuitem_edit_favorites) {
            Context A1D = A1D();
            Intent intent = new Intent();
            intent.setClassName(A1D.getPackageName(), "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity");
            intent.putExtra("com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit", true);
            A1C(intent);
            return true;
        } else if (itemId == R.id.menuitem_new_call) {
            A1Z();
            return true;
        } else if (itemId == R.id.menuitem_clear_call_log && this.A08 >= 7) {
            new CallsHistoryClearCallLogDialogFragment().A1f(A0l(), (String) null);
            return true;
        } else if (!this.A05.A05()) {
            return false;
        } else {
            this.A06.A02();
            throw new NullPointerException("getMenuItemBusinessToolsId");
        }
    }

    public String BDl() {
        return A0n(R.string.f12nameremoved);
    }

    public boolean BYO() {
        return this.A0v;
    }

    public /* synthetic */ void BaQ(int i, int i2) {
        A1Z();
    }
}
