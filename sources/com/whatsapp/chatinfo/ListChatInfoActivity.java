package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass0PG;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass191;
import X.AnonymousClass1DF;
import X.AnonymousClass1EU;
import X.AnonymousClass1H2;
import X.AnonymousClass1LI;
import X.AnonymousClass1LW;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1NO;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.AnonymousClass1XN;
import X.AnonymousClass227;
import X.AnonymousClass22V;
import X.AnonymousClass22g;
import X.AnonymousClass2Dr;
import X.AnonymousClass2E6;
import X.AnonymousClass2EG;
import X.AnonymousClass34X;
import X.AnonymousClass3CG;
import X.AnonymousClass3D9;
import X.AnonymousClass3LW;
import X.AnonymousClass3R5;
import X.AnonymousClass3SJ;
import X.AnonymousClass3U8;
import X.AnonymousClass3U9;
import X.AnonymousClass3UG;
import X.AnonymousClass3UY;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.AnonymousClass4XL;
import X.AnonymousClass4Y2;
import X.AnonymousClass4ZG;
import X.AnonymousClass6O1;
import X.AnonymousClass6R8;
import X.C012005e;
import X.C1261362r;
import X.C177538dx;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19700wN;
import X.C19890wg;
import X.C19970wo;
import X.C20430xY;
import X.C20810yC;
import X.C21060yb;
import X.C21100yf;
import X.C226815j;
import X.C233117z;
import X.C235618y;
import X.C24361Cd;
import X.C24511Cs;
import X.C27111My;
import X.C27731Pn;
import X.C29541Xa;
import X.C32001cn;
import X.C32661dz;
import X.C32791eC;
import X.C32811eE;
import X.C33051ed;
import X.C33521fV;
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
import X.C36431kI;
import X.C36441kJ;
import X.C37831nH;
import X.C39001qm;
import X.C43112Dy;
import X.C48892iE;
import X.C55422ub;
import X.C55932vQ;
import X.C58102zK;
import X.C58112zL;
import X.C603537n;
import X.C64613Or;
import X.C65913Ty;
import X.C66933Xw;
import X.C81783xZ;
import X.C89314Wb;
import X.C89594Xd;
import X.C89814Xz;
import X.C90104Zc;
import X.C90394a5;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.group.view.custom.GroupDetailsCard;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ListChatInfoActivity extends AnonymousClass2Dr {
    public C19460v5 A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C58102zK A04;
    public C58112zL A05;
    public AnonymousClass1LI A06;
    public C24361Cd A07;
    public C37831nH A08;
    public AnonymousClass2EG A09;
    public AnonymousClass16I A0A;
    public AnonymousClass171 A0B;
    public C235618y A0C;
    public AnonymousClass1RY A0D;
    public C27731Pn A0E;
    public C20430xY A0F;
    public C18820ts A0G;
    public AnonymousClass1LW A0H;
    public AnonymousClass16J A0I;
    public AnonymousClass1NO A0J;
    public AnonymousClass141 A0K;
    public AnonymousClass141 A0L;
    public C1261362r A0M;
    public AnonymousClass6O1 A0N;
    public AnonymousClass1XN A0O;
    public EmojiSearchProvider A0P;
    public C65913Ty A0Q;
    public C233117z A0R;
    public C19890wg A0S;
    public C32791eC A0T;
    public C32661dz A0U;
    public C32811eE A0V;
    public C33051ed A0W;
    public View A0X;
    public ListView A0Y;
    public TextView A0Z;
    public TextView A0a;
    public TextView A0b;
    public C43112Dy A0c;
    public AnonymousClass2E6 A0d;
    public GroupDetailsCard A0e;
    public AnonymousClass1RJ A0f;
    public boolean A0g;
    public final ArrayList A0h;
    public final C32001cn A0i;
    public final C226815j A0j;
    public final AnonymousClass191 A0k;
    public final C24511Cs A0l;

    public void onCreate(Bundle bundle) {
        View findViewById;
        UserJid A0h2;
        A28(5);
        super.onCreate(bundle);
        this.A0D = this.A0E.A05(this, "list-chat-info");
        A1p();
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        this.A0d = (AnonymousClass2E6) findViewById(R.id.content);
        Toolbar A0R2 = C36411kG.A0R(this);
        A0R2.setTitle((CharSequence) "");
        A0R2.A0F();
        C36431kI.A0Q(this, A0R2).A0U(true);
        C36331k8.A0s(this, A0R2, this.A0G, R.drawable.ic_back_shadow);
        this.A0Y = getListView();
        this.A0d.A0E(R.layout.f9nameremoved);
        this.A0X = findViewById(R.id.header);
        this.A0e = (GroupDetailsCard) findViewById(R.id.group_details_card);
        this.A0d.A0A();
        this.A0d.setColor(C36391kE.A05(this));
        this.A0d.A0F(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), C36361kB.A02(this, R.dimen.f7nameremoved));
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, this.A0Y, false);
        this.A0Y.addFooterView(inflate, (Object) null, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setVisibility(4);
        Point point = new Point();
        C36321k7.A0K(this, point);
        linearLayout.setPadding(0, 0, 0, point.y);
        this.A0Y.addFooterView(linearLayout, (Object) null, false);
        C177538dx A002 = C177538dx.A00(getIntent().getStringExtra("gid"));
        if (A002 == null) {
            Log.e("list_chat_info/on_create: exiting due to null listChat jid object");
            finish();
            return;
        }
        this.A0K = AnonymousClass22g.A07(this, A002);
        ArrayList arrayList = this.A0h;
        this.A08 = new C37831nH(this, this, arrayList);
        this.A0X = findViewById(R.id.header);
        this.A0Y.setOnScrollListener(new C55932vQ(this, 2));
        C90104Zc.A00(this.A0Y.getViewTreeObserver(), this, 5);
        C89594Xd.A00(this.A0Y, this, 1);
        this.A0K.toString();
        View findViewById2 = findViewById(R.id.add_participant_layout);
        View findViewById3 = findViewById(R.id.add_participant_button);
        C36391kE.A0P(findViewById3, R.id.add_participant_text).setText(R.string.f12nameremoved);
        findViewById2.findViewById(R.id.invite_via_link_button).setVisibility(8);
        findViewById2.setVisibility(0);
        C66933Xw.A00(findViewById3, this, 6);
        A0u();
        this.A0Z = C36391kE.A0Q(this, R.id.conversation_contact_status);
        A3m();
        C58112zL r1 = this.A05;
        C177538dx A3t = A3t();
        C18740tg.A06(A3t);
        AnonymousClass00C.A0D(r1, 0);
        AnonymousClass00C.A0D(A3t, 1);
        AnonymousClass2EG r0 = (AnonymousClass2EG) AnonymousClass4ZG.A00(this, A3t, r1, 0).A00(AnonymousClass2EG.class);
        this.A09 = r0;
        A3p(r0);
        C55422ub.A01(this, this.A09.A00, 21);
        this.A0U.setTopShadowVisibility(8);
        this.A0Y.setAdapter(this.A08);
        registerForContextMenu(this.A0Y);
        this.A0K.toString();
        TextView A0Q2 = C36391kE.A0Q(this, R.id.participants_title);
        this.A0b = A0Q2;
        Resources resources = getResources();
        int size = arrayList.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, arrayList.size(), 0);
        C36351kA.A16(resources, A0Q2, objArr, R.plurals.f10nameremoved, size);
        this.A0a = C36391kE.A0Q(this, R.id.participants_info);
        A0v();
        A3q(Integer.valueOf(R.drawable.avatar_broadcast));
        A3r(getString(R.string.f12nameremoved), R.drawable.ic_action_delete);
        C36351kA.A19(this.A00, R.id.report_group_btn);
        View findViewById4 = findViewById(R.id.exit_group_btn);
        C66933Xw.A00(findViewById4, this, 7);
        C33521fV.A02(findViewById4);
        AnonymousClass17X r02 = this.A0M;
        HashSet hashSet = new HashSet(r02.A07.A0C(A3t()).A05());
        hashSet.remove(C36411kG.A0j(this));
        hashSet.remove(this.A02.A08());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A072 = AnonymousClass22g.A07(this, C36401kF.A0a(it));
            if (!arrayList.contains(A072)) {
                arrayList.add(A072);
            }
        }
        A11(this);
        A10(this);
        A12(this);
        A0y(this);
        C19460v5 r12 = this.A02;
        if (r12.A05()) {
            r12.A02();
            A3t();
            throw AnonymousClass001.A0A("initSmbLabelScroller");
        }
        findViewById(R.id.starred_messages_layout).setOnClickListener(new C48892iE(this, 39));
        this.A0A.registerObserver(this.A0j);
        this.A0I.registerObserver(this.A0k);
        this.A07.registerObserver(this.A0i);
        this.A0R.registerObserver(this.A0l);
        if (!(bundle == null || (A0h2 = C36391kE.A0h(bundle, "selected_jid")) == null)) {
            this.A0L = AnonymousClass22g.A07(this, A0h2);
        }
        AnonymousClass3CG r3 = new AnonymousClass3CG(this);
        if (getIntent().getBooleanExtra("circular_transition", false)) {
            findViewById = this.A0X;
        } else {
            findViewById = findViewById(R.id.picture);
        }
        findViewById.setTransitionName(C36401kF.A0o(r3.A00, R.string.f12nameremoved));
        this.A0d.A0G(inflate, linearLayout, this.A08);
    }

    public Dialog onCreateDialog(int i) {
        C39001qm A002;
        int i2;
        int i3;
        AnonymousClass141 r4;
        int i4 = i;
        if (i4 == 2) {
            if (TextUtils.isEmpty(this.A0B.A0H(this.A0K))) {
                getString(R.string.f12nameremoved);
            } else {
                Object[] objArr = new Object[1];
                C36361kB.A1F(this.A0B, this.A0K, objArr, 0);
                getString(R.string.f12nameremoved, objArr);
            }
            return this.A0W.A00(this, new AnonymousClass4Y2(new C89814Xz(this, 0), 2), 1, 1, 0, false).create();
        } else if (i4 != 3) {
            if (i4 == 4) {
                Log.w("listchatinfo/add existing contact: activity not found, probably tablet");
                A002 = AnonymousClass3LW.A00(this);
                A002.A0c(R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 35;
            } else if (i4 != 6 || (r4 = this.A0L) == null) {
                return super.onCreateDialog(i4);
            } else {
                Object[] objArr2 = new Object[1];
                C36361kB.A1F(this.A0B, r4, objArr2, 0);
                String string = getString(R.string.f12nameremoved, objArr2);
                A002 = AnonymousClass3LW.A00(this);
                A002.A0p(AnonymousClass3UG.A05(this, this.A0C, string));
                A002.A0r(true);
                A002.A0f(AnonymousClass4XL.A00(this, 33), R.string.f12nameremoved);
                i2 = R.string.f12nameremoved;
                i3 = 34;
            }
            C39001qm.A0I(A002, this, i3, i2);
            return A002.create();
        } else {
            AnonymousClass3R5 r7 = new AnonymousClass3R5(this, 0);
            C19970wo r37 = this.A07;
            C20810yC r18 = this.A0D;
            AnonymousClass17Y r17 = this.A05;
            AnonymousClass1N2 r16 = this.A0C;
            C19700wN r15 = this.A03;
            AnonymousClass1H2 r11 = this.A0C;
            AnonymousClass1XN r10 = this.A0O;
            C21060yb r9 = this.A08;
            C18820ts r8 = this.A0G;
            C1261362r r6 = this.A0M;
            EmojiSearchProvider emojiSearchProvider = this.A0P;
            C19420v0 r42 = this.A09;
            C19890wg r3 = this.A0S;
            AnonymousClass6O1 r1 = this.A0N;
            AnonymousClass1N0 r0 = this.A0B;
            AnonymousClass141 A0A2 = this.A0G.A0A(A3t());
            C18740tg.A06(A0A2);
            C20810yC r27 = r18;
            AnonymousClass1N2 r29 = r16;
            return new AnonymousClass227(this, r15, r17, r9, r37, r42, r8, r7, r0, r6, r1, r10, r11, emojiSearchProvider, r27, r3, r29, A0A2.A0J(), 3, R.string.f12nameremoved, Math.max(0, this.A06.A04(C21100yf.A1v)), 0, 0, 16385);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_add_person_shadow).setShowAsAction(0);
        C36391kE.A1F(menu, 3, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    private void A0u() {
        C012005e.A02(this.A00, R.id.participants_search).setVisibility(8);
        C36351kA.A1A(this.A00, R.id.mute_layout, 8);
        C36351kA.A1A(this.A00, R.id.notifications_layout, 8);
        C36351kA.A1A(this.A00, R.id.media_visibility_layout, 8);
    }

    private void A0v() {
        int A042 = this.A06.A04(C21100yf.A1s);
        ArrayList arrayList = this.A0h;
        if (arrayList.size() <= (A042 * 9) / 10 || A042 == 0) {
            this.A0a.setVisibility(8);
            return;
        }
        this.A0a.setVisibility(0);
        TextView textView = this.A0a;
        Object[] A0M2 = AnonymousClass001.A0M();
        AnonymousClass000.A1L(A0M2, arrayList.size(), 0);
        AnonymousClass000.A1L(A0M2, A042, 1);
        C36341k9.A0s(this, textView, A0M2, R.string.f12nameremoved);
    }

    public static void A0w(ListChatInfoActivity listChatInfoActivity) {
        ArrayList arrayList = listChatInfoActivity.A0h;
        arrayList.clear();
        AnonymousClass17X r0 = listChatInfoActivity.A0M;
        HashSet hashSet = new HashSet(r0.A07.A0C(listChatInfoActivity.A3t()).A05());
        hashSet.remove(C36411kG.A0j(listChatInfoActivity));
        hashSet.remove(listChatInfoActivity.A02.A08());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A072 = AnonymousClass22g.A07(listChatInfoActivity, C36401kF.A0a(it));
            if (!arrayList.contains(A072)) {
                arrayList.add(A072);
            }
        }
        A0y(listChatInfoActivity);
        A12(listChatInfoActivity);
    }

    public static void A0y(ListChatInfoActivity listChatInfoActivity) {
        AnonymousClass1RJ r0 = listChatInfoActivity.A0f;
        if (r0 == null) {
            r0 = C36341k9.A0X(listChatInfoActivity.A00, R.id.encryption_info);
            listChatInfoActivity.A0f = r0;
        }
        ((AnonymousClass22V) r0.A01()).setDescription((CharSequence) listChatInfoActivity.getString(R.string.f12nameremoved));
        listChatInfoActivity.A0f.A05(new C48892iE(listChatInfoActivity, 40));
        listChatInfoActivity.A0f.A03(0);
    }

    public static void A0z(ListChatInfoActivity listChatInfoActivity) {
        int i;
        View A0L2 = C36411kG.A0L(listChatInfoActivity.A0Y);
        if (A0L2 == null) {
            return;
        }
        if (listChatInfoActivity.A0Y.getWidth() > listChatInfoActivity.A0Y.getHeight()) {
            if (listChatInfoActivity.A0Y.getFirstVisiblePosition() == 0) {
                i = A0L2.getTop();
            } else {
                i = (-listChatInfoActivity.A0X.getHeight()) + 1;
            }
            View view = listChatInfoActivity.A0X;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (listChatInfoActivity.A0X.getTop() != 0) {
            View view2 = listChatInfoActivity.A0X;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public static void A10(ListChatInfoActivity listChatInfoActivity) {
        TextView textView;
        long A012 = AnonymousClass6R8.A01(listChatInfoActivity.A0K.A0V, Long.MIN_VALUE);
        if (A012 != Long.MIN_VALUE || (textView = listChatInfoActivity.A0Z) == null) {
            String A0G2 = AnonymousClass3UY.A0G(listChatInfoActivity.A0G, new Object[0], R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, A012, true);
            GroupDetailsCard groupDetailsCard = listChatInfoActivity.A0e;
            C18740tg.A04(groupDetailsCard);
            groupDetailsCard.setSecondSubtitleText(A0G2);
        } else {
            textView.setVisibility(8);
        }
        boolean A1Z = C36411kG.A1Z(listChatInfoActivity.A0c);
        listChatInfoActivity.A09.A0T();
        listChatInfoActivity.A2C(A1Z);
        C58102zK r0 = listChatInfoActivity.A04;
        AnonymousClass2EG r4 = listChatInfoActivity.A09;
        C177538dx A3t = listChatInfoActivity.A3t();
        C18800tq r1 = r0.A00.A01;
        AnonymousClass17Y A0M2 = C36351kA.A0M(r1);
        AnonymousClass1EU A0f2 = C36381kD.A0f(r1);
        C18830tt r2 = r1.A00;
        C29541Xa A0M3 = C36421kH.A0M(r1);
        C43112Dy r22 = new C43112Dy(A0M2, r4, (AnonymousClass3D9) r2.A1U.get(), (AnonymousClass34X) r2.A2T.get(), (C64613Or) r1.A4S.get(), (AnonymousClass1DF) r1.A4m.get(), (AnonymousClass1NO) r1.A7t.get(), A0M3, A3t, C36371kC.A0h(r1), A0f2);
        listChatInfoActivity.A0c = r22;
        C36391kE.A1Q(r22, listChatInfoActivity.A04);
    }

    public static void A11(ListChatInfoActivity listChatInfoActivity) {
        String A0J2;
        int i;
        if (C36421kH.A1Y(listChatInfoActivity.A0K)) {
            A0J2 = listChatInfoActivity.getString(R.string.f12nameremoved);
            i = R.color.f6nameremoved;
        } else {
            A0J2 = listChatInfoActivity.A0K.A0J();
            i = R.color.f6nameremoved;
        }
        int A002 = AnonymousClass00F.A00(listChatInfoActivity, i);
        listChatInfoActivity.A0d.setTitleText(A0J2);
        GroupDetailsCard groupDetailsCard = listChatInfoActivity.A0e;
        C18740tg.A04(groupDetailsCard);
        groupDetailsCard.A06(A0J2, false);
        listChatInfoActivity.A0e.setTitleColor(A002);
        GroupDetailsCard groupDetailsCard2 = listChatInfoActivity.A0e;
        Resources resources = listChatInfoActivity.getResources();
        ArrayList arrayList = listChatInfoActivity.A0h;
        int size = arrayList.size();
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L2, arrayList.size(), 0);
        groupDetailsCard2.setSubtitleText(resources.getQuantityString(R.plurals.f10nameremoved, size, A0L2));
    }

    public static void A12(ListChatInfoActivity listChatInfoActivity) {
        TextView textView = listChatInfoActivity.A0b;
        Resources resources = listChatInfoActivity.getResources();
        ArrayList arrayList = listChatInfoActivity.A0h;
        int size = arrayList.size();
        Object[] A0L2 = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L2, arrayList.size());
        C36351kA.A16(resources, textView, A0L2, R.plurals.f10nameremoved, size);
        listChatInfoActivity.A0v();
        Collections.sort(arrayList, new C81783xZ(listChatInfoActivity.A02, listChatInfoActivity.A0B, 1));
        listChatInfoActivity.A08.notifyDataSetChanged();
        A11(listChatInfoActivity);
    }

    private void A13(boolean z) {
        String str;
        boolean z2;
        AnonymousClass141 r1 = this.A0L;
        if (r1 == null) {
            this.A05.A06(R.string.f12nameremoved, 0);
            return;
        }
        C32811eE r3 = this.A0V;
        String A042 = AnonymousClass3U8.A04(C36351kA.A0j(r1));
        if (r1.A0C()) {
            str = r1.A0K();
            z2 = true;
        } else {
            str = null;
            z2 = false;
        }
        try {
            startActivityForResult(C32811eE.A00(r3, A042, str, z, z2), 10);
            this.A0U.A03(z, 9);
        } catch (ActivityNotFoundException unused) {
            AnonymousClass3SJ.A01(this, 4);
        }
    }

    public void A2F() {
        if (!this.A0g) {
            this.A0g = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            AnonymousClass22g.A0Q(r1, r3, this);
            AnonymousClass22g.A0j(r1, this);
            AnonymousClass22g.A0I(A0L2, r1, r3, this, r1.A1R);
            AnonymousClass22g.A0K(A0L2, r1, this);
            C19470v6 r4 = C19470v6.A00;
            this.A03 = r4;
            this.A0O = C36351kA.A0d(r1);
            this.A01 = r4;
            this.A0E = C36351kA.A0T(r1);
            this.A0H = (AnonymousClass1LW) r1.AOX.get();
            this.A0G = C36341k9.A0T(r1);
            this.A0B = C36341k9.A0S(r1);
            this.A0A = C36351kA.A0S(r1);
            this.A0C = C36401kF.A0U(r1);
            this.A0Q = (C65913Ty) r1.ACf.get();
            this.A0W = C36411kG.A0p(r3);
            this.A0I = C36361kB.A0Z(r1);
            this.A02 = r4;
            this.A0U = C36371kC.A0k(r1);
            this.A0V = C36401kF.A0e(r1);
            this.A07 = C36371kC.A0T(r1);
            this.A0F = C36421kH.A0K(r1);
            this.A0P = C36351kA.A0f(r3);
            this.A0M = C36371kC.A0b(r3);
            this.A0J = (AnonymousClass1NO) r1.A7t.get();
            this.A00 = r4;
            this.A0S = C36351kA.A0m(r1);
            this.A04 = (C58102zK) A0L2.A2g.get();
            this.A0R = C36371kC.A0c(r1);
            this.A0T = (C32791eC) r3.A3L.get();
            this.A0N = C36351kA.A0c(r3);
            this.A05 = (C58112zL) A0L2.A2u.get();
            this.A06 = C36361kB.A0S(r1);
        }
    }

    public C177538dx A3t() {
        Class<C177538dx> cls = C177538dx.class;
        Jid A062 = this.A0K.A06(cls);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("jid is not broadcast jid: ");
        C18740tg.A07(A062, AnonymousClass000.A0o(this.A0K.A06(cls), A0u));
        return (C177538dx) A062;
    }

    public void finishAfterTransition() {
        if (AnonymousClass3U9.A00) {
            this.A0X.setTransitionName((String) null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A0X);
            transitionSet.addTransition(slide);
            AnonymousClass22g.A0G(this, new Slide(80), transitionSet, this.A0Y);
        }
        super.finishAfterTransition();
    }

    public ListChatInfoActivity(int i) {
        this.A0g = false;
        C89314Wb.A00(this, 47);
    }

    public static void A0x(ListChatInfoActivity listChatInfoActivity) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = listChatInfoActivity.A0h.iterator();
        while (it.hasNext()) {
            A0I2.add(C36371kC.A0d(it));
        }
        Intent A0D2 = C36431kI.A0D();
        A0D2.setClassName(listChatInfoActivity.getPackageName(), "com.whatsapp.conversation.EditBroadcastRecipientsSelector");
        A0D2.putExtra("selected", AnonymousClass143.A07(A0I2));
        listChatInfoActivity.startActivityForResult(A0D2, 12);
    }

    public void A3l() {
        super.A3l();
        C43112Dy r1 = this.A0c;
        if (r1 != null) {
            r1.A0D(true);
            this.A0c = null;
        }
    }

    public void A3n(long j) {
        super.A3n(j);
        findViewById(R.id.actions_card).setVisibility(C36421kH.A00((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        A0u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r4.isEmpty() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3s(java.util.List r4) {
        /*
            r3 = this;
            super.A3s(r4)
            r0 = 2131430718(0x7f0b0d3e, float:1.8483145E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0016
            boolean r1 = r4.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setVisibility(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ListChatInfoActivity.A3s(java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a6 A[LOOP:6: B:58:0x01a0->B:60:0x01a6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            super.onActivityResult(r13, r14, r15)
            switch(r13) {
                case 10: goto L_0x0036;
                case 11: goto L_0x0036;
                case 12: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            r0 = -1
            if (r14 != r0) goto L_0x0006
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "contacts"
            java.util.ArrayList r6 = X.C36401kF.A0u(r15, r5, r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.HashSet r7 = X.C36441kJ.A16()
            java.util.ArrayList r3 = r12.A0h
            java.util.Iterator r1 = r3.iterator()
        L_0x0024:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0041
            X.141 r0 = X.C36391kE.A0f(r1)
            com.whatsapp.jid.Jid r0 = r0.A06(r5)
            r7.add(r0)
            goto L_0x0024
        L_0x0036:
            X.0xY r0 = r12.A0F
            r0.A08()
            X.1dz r0 = r12.A0U
            r0.A01()
            return
        L_0x0041:
            java.util.Iterator r2 = r6.iterator()
        L_0x0045:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r2.next()
            boolean r0 = r7.contains(r1)
            if (r0 != 0) goto L_0x0045
            r8.add(r1)
            goto L_0x0045
        L_0x0059:
            java.util.Iterator r2 = r3.iterator()
        L_0x005d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0075
            X.141 r0 = X.C36391kE.A0f(r2)
            com.whatsapp.jid.Jid r1 = r0.A06(r5)
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L_0x005d
            r4.add(r1)
            goto L_0x005d
        L_0x0075:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01b0
            X.3Ty r7 = r12.A0Q
            X.8dx r6 = r12.A3t()
            r11 = r8
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.16D r0 = r7.A02
            X.141 r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = r0.A0M
        L_0x0090:
            java.lang.String r2 = "lid"
            boolean r10 = r0.equals(r2)
            boolean r9 = X.C65913Ty.A04(r8)
            X.0yC r1 = r7.A09
            r0 = 4509(0x119d, float:6.318E-42)
            boolean r5 = r1.A0E(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BroadcastListManager/addListParticipants adding to list: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; isCurrentAddressingModeLid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; addingLidParticipant="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; lidAbPropEnabled="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ";  participants="
            X.C36321k7.A1K(r8, r0, r1)
            if (r10 == 0) goto L_0x0130
            if (r5 != 0) goto L_0x018f
            java.lang.String r2 = "pn"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BroadcastListManager/convertListAddressingMode converting list "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " to "
            X.C36321k7.A1Q(r0, r2, r1)
            X.17X r0 = r7.A07
            X.17r r0 = r0.A07
            X.6X6 r10 = r0.A0C(r6)
            X.0y7 r0 = r10.A05()
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x00f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x00f9
            if (r1 == 0) goto L_0x00f9
            r9.add(r1)
            goto L_0x00f9
        L_0x010d:
            java.lang.String r0 = "pn"
            goto L_0x0090
        L_0x0110:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r9.iterator()
        L_0x0118:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r1 = r2.next()
            X.13w r1 = (X.C223313w) r1
            X.12O r0 = r7.A08
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0118
            r5.add(r0)
            goto L_0x0118
        L_0x0130:
            if (r9 == 0) goto L_0x0193
            if (r5 == 0) goto L_0x0178
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BroadcastListManager/convertListAddressingMode converting list "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " to "
            X.C36321k7.A1Q(r0, r2, r1)
            X.17X r0 = r7.A07
            X.17r r0 = r0.A07
            X.6X6 r9 = r0.A0C(r6)
            X.0y7 r0 = r9.A05()
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x015c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x015c
            if (r1 == 0) goto L_0x015c
            r5.add(r1)
            goto L_0x015c
        L_0x0170:
            X.4Hh r0 = new X.4Hh
            r0.<init>(r10, r7, r6)
            X.C65913Ty.A03(r7, r6, r5, r9, r0)
        L_0x0178:
            java.util.List r11 = X.C65913Ty.A02(r8)
            goto L_0x0193
        L_0x017d:
            X.12O r0 = r7.A08
            java.util.LinkedHashMap r0 = r0.A0E(r5)
            java.util.Collection r1 = r0.values()
            X.4Hg r0 = new X.4Hg
            r0.<init>(r9, r7, r6)
            X.C65913Ty.A03(r7, r6, r1, r5, r0)
        L_0x018f:
            java.util.ArrayList r11 = X.C65913Ty.A01(r7, r8)
        L_0x0193:
            X.0xQ r1 = r7.A0A
            java.util.ArrayList r0 = X.C36361kB.A0q(r11)
            r1.A0Z(r6, r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x01a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b0
            X.11F r1 = X.C36401kF.A0a(r2)
            X.16D r0 = r12.A0G
            X.C36381kD.A1H(r0, r1, r3)
            goto L_0x01a0
        L_0x01b0:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01db
            X.3Ty r2 = r12.A0Q
            X.8dx r1 = r12.A3t()
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.0xQ r0 = r2.A0A
            r0.A0a(r1, r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x01c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01db
            X.11F r0 = X.C36401kF.A0a(r1)
            X.141 r0 = X.AnonymousClass22g.A07(r12, r0)
            r3.remove(r0)
            goto L_0x01c9
        L_0x01db:
            A12(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ListChatInfoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Intent intent;
        AnonymousClass141 r3 = ((C603537n) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A03;
        this.A0L = r3;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                Intent A1W = C36441kJ.A0j().A1W(this, r3);
                A1W.putExtra("entry_point_conversion_source", "broadcast_list_context_menu");
                A1W.putExtra("entry_point_conversion_app", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME);
                this.A01.A07(this, A1W);
                return true;
            } else if (itemId == 2) {
                A13(true);
                return true;
            } else if (itemId == 3) {
                A13(false);
                return true;
            } else if (itemId == 5) {
                AnonymousClass3SJ.A01(this, 6);
                return true;
            } else if (itemId != 6) {
                return false;
            } else {
                intent = AnonymousClass190.A0u(this, C36351kA.A0l(this.A0L));
            }
        } else if (r3.A0F == null) {
            return true;
        } else {
            intent = C36441kJ.A0j().A1X(this, r3, C36401kF.A0h());
        }
        startActivity(intent);
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AnonymousClass141 r2 = ((C603537n) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A03;
        if (r2 != null) {
            String A0v = C36381kD.A0v(this.A0B, r2);
            contextMenu.add(0, 1, 0, AnonymousClass3UG.A05(this, this.A0C, C36391kE.A0v(this, A0v, new Object[1], 0, R.string.f12nameremoved)));
            if (r2.A0F == null) {
                contextMenu.add(0, 2, 0, R.string.f12nameremoved);
                contextMenu.add(0, 3, 0, R.string.f12nameremoved);
            } else {
                contextMenu.add(0, 0, 0, AnonymousClass3UG.A05(this, this.A0C, C36351kA.A0w(this, A0v, 1, R.string.f12nameremoved)));
            }
            if (this.A0h.size() > 2) {
                contextMenu.add(0, 5, 0, AnonymousClass3UG.A05(this, this.A0C, C36351kA.A0w(this, A0v, 1, R.string.f12nameremoved)));
            }
            contextMenu.add(0, 6, 0, R.string.f12nameremoved);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0D.A02();
        this.A0A.unregisterObserver(this.A0j);
        this.A0I.unregisterObserver(this.A0k);
        this.A07.unregisterObserver(this.A0i);
        this.A0R.unregisterObserver(this.A0l);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                C19460v5 r1 = this.A00;
                if (r1.A05()) {
                    r1.A02();
                    A3t();
                    this.A03.A02();
                    throw AnonymousClass001.A0A("getLabelBroadcastList");
                }
            } else if (itemId == 3) {
                AnonymousClass3SJ.A01(this, 3);
                return true;
            } else if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                AnonymousClass0PG.A00(this);
            }
            return true;
        }
        A0x(this);
        return true;
    }

    public void onResume() {
        super.onResume();
        C36411kG.A1M(this.A04, this, A3t(), 34);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass141 r0 = this.A0L;
        if (r0 != null) {
            bundle.putString("selected_jid", AnonymousClass143.A03(r0.A0H));
        }
    }

    public ListChatInfoActivity() {
        this(0);
        this.A0h = AnonymousClass001.A0I();
        this.A0j = AnonymousClass4W3.A00(this, 4);
        this.A0i = new AnonymousClass4W0(this, 2);
        this.A0l = new AnonymousClass4WB(this, 2);
        this.A0k = C90394a5.A00(this, 6);
    }
}
