package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1KK;
import X.AnonymousClass1N4;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1V9;
import X.AnonymousClass1YJ;
import X.AnonymousClass27r;
import X.AnonymousClass362;
import X.AnonymousClass3A9;
import X.AnonymousClass3F9;
import X.AnonymousClass3HF;
import X.AnonymousClass3KL;
import X.AnonymousClass3LE;
import X.AnonymousClass3MR;
import X.AnonymousClass3PZ;
import X.AnonymousClass3UR;
import X.AnonymousClass4Z3;
import X.AnonymousClass6XI;
import X.C012005e;
import X.C03570Gk;
import X.C108695Un;
import X.C1502474n;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C19460v5;
import X.C19630wG;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C20830yE;
import X.C21050ya;
import X.C21060yb;
import X.C223213v;
import X.C223313w;
import X.C229216m;
import X.C230116v;
import X.C230416y;
import X.C27731Pn;
import X.C27761Ps;
import X.C32601dt;
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
import X.C37761nA;
import X.C40491vd;
import X.C42741zP;
import X.C48912iG;
import X.C48982iN;
import X.C49372j0;
import X.C49582jM;
import X.C53842ry;
import X.C57072xd;
import X.C599735z;
import X.C62583Gs;
import X.C63813Ln;
import X.C64643Ow;
import X.C64813Pn;
import X.C64953Qc;
import X.C65033Ql;
import X.C65643Sx;
import X.C66943Xx;
import X.C67253Zc;
import X.C80273v8;
import X.C89134Vj;
import X.C89594Xd;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PhoneContactsSelector extends AnonymousClass27r {
    public MenuItem A00;
    public View A01;
    public ImageView A02;
    public ListView A03;
    public C19460v5 A04;
    public AnonymousClass1N4 A05;
    public C57072xd A06;
    public C32601dt A07;
    public AnonymousClass1KK A08;
    public C229216m A09;
    public AnonymousClass1Pp A0A;
    public AnonymousClass16D A0B;
    public AnonymousClass171 A0C;
    public AnonymousClass1RY A0D;
    public AnonymousClass1RY A0E;
    public C27731Pn A0F;
    public C27761Ps A0G;
    public C48982iN A0H;
    public C37761nA A0I;
    public C49372j0 A0J;
    public C49582jM A0K;
    public C64953Qc A0L;
    public AnonymousClass3HF A0M;
    public AnonymousClass1V6 A0N;
    public C19630wG A0O;
    public C20830yE A0P;
    public C18820ts A0Q;
    public C230416y A0R;
    public AnonymousClass11F A0S;
    public C230116v A0T;
    public C64813Pn A0U;
    public AnonymousClass005 A0V;
    public AnonymousClass005 A0W;
    public String A0X;
    public ArrayList A0Y;
    public boolean A0Z;
    public View A0a;
    public RecyclerView A0b;
    public BottomSheetBehavior A0c;
    public AnonymousClass3LE A0d;
    public boolean A0e;
    public final C40491vd A0f = new C40491vd(this);
    public final ArrayList A0g = AnonymousClass001.A0I();
    public final ArrayList A0h = AnonymousClass001.A0I();
    public final List A0i = AnonymousClass001.A0I();

    public void onCreate(Bundle bundle) {
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i;
        super.onCreate(bundle);
        boolean A002 = AnonymousClass3MR.A00(this.A0D);
        this.A0Z = A002;
        int i2 = R.layout.f9nameremoved;
        if (A002) {
            i2 = R.layout.f9nameremoved;
        }
        Toolbar A0O2 = C36361kB.A0O(this, i2);
        setSupportActionBar(A0O2);
        AnonymousClass07B A0O3 = C36381kD.A0O(this);
        A0O3.A0U(true);
        A0O3.A0V(true);
        this.A0D = this.A0F.A05(this, "phone-contacts-selector");
        this.A0d = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C53842ry(this, 3), A0O2, this.A0Q);
        setTitle(R.string.f12nameremoved);
        this.A0S = C36331k8.A0F(this);
        ListView listView2 = getListView();
        this.A03 = listView2;
        listView2.setFastScrollAlwaysVisible(true);
        this.A03.setScrollBarStyle(33554432);
        List list = this.A0i;
        list.clear();
        ViewStub viewStub = (ViewStub) C03570Gk.A0B(this, R.id.selected_list_stub);
        viewStub.setLayoutResource(R.layout.f9nameremoved);
        viewStub.inflate();
        this.A0b = (RecyclerView) findViewById(R.id.selected_items);
        this.A0b.A0t(new C89134Vj(this, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1f(0);
        this.A0b.setLayoutManager(linearLayoutManager);
        this.A0b.setAdapter(this.A0f);
        this.A0b.setItemAnimator(new C42741zP());
        this.A03.setOnScrollListener(new C63813Ln(this));
        this.A03.setFastScrollEnabled(true);
        this.A03.setScrollbarFadingEnabled(true);
        boolean A1X = C36401kF.A1X(this.A0Q);
        ListView listView3 = this.A03;
        if (A1X) {
            listView3.setVerticalScrollbarPosition(1);
            listView = this.A03;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            resources = getResources();
            i = R.dimen.f7nameremoved;
        } else {
            listView3.setVerticalScrollbarPosition(2);
            listView = this.A03;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            resources = getResources();
            i = R.dimen.f7nameremoved;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i), 0);
        C89594Xd.A00(this.A03, this, 4);
        A0x(this, list.size());
        this.A0a = C03570Gk.A0B(this, R.id.selected_list);
        if (list.isEmpty()) {
            this.A0a.setVisibility(4);
        }
        C36361kB.A0v(this, R.id.warning);
        C37761nA r0 = new C37761nA(this, this, this.A0g);
        this.A0I = r0;
        A3i(r0);
        ImageView A0P2 = C36431kI.A0P(this, R.id.next_btn);
        this.A02 = A0P2;
        C36321k7.A0L(this, A0P2, this.A0Q, R.drawable.ic_fab_next);
        C36331k8.A0q(this, this.A02, R.string.f12nameremoved);
        this.A02.setVisibility(0);
        C48912iG.A00(this.A02, this, 22);
        ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new C66943Xx(this, 45));
        C48912iG.A00(findViewById(R.id.button_open_permission_settings), this, 23);
        registerForContextMenu(this.A03);
        if (bundle == null && !this.A09.A00()) {
            RequestPermissionActivity.A01(this, R.string.f12nameremoved, R.string.f12nameremoved);
        }
        if (this.A09.A00()) {
            C36341k9.A13(this, R.id.init_contacts_progress, 0);
        }
        if (this.A0Z) {
            View A022 = C012005e.A02(this.A00, R.id.contact_picker_activity);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A0c = bottomSheetBehavior;
            this.A0U.A02(A022, bottomSheetBehavior, this, this.A0C);
            C64813Pn.A00(this, A0O3);
        }
    }

    public static void A0v(C62583Gs r10, PhoneContactsSelector phoneContactsSelector) {
        boolean z;
        C19770wU r2;
        Runnable r1;
        SelectionCheckView selectionCheckView = (SelectionCheckView) phoneContactsSelector.A03.findViewWithTag(r10);
        if (r10.A03) {
            r10.A03 = false;
            z = false;
        } else if (phoneContactsSelector.A0i.size() == 257) {
            AnonymousClass17Y r5 = phoneContactsSelector.A05;
            C18820ts r4 = phoneContactsSelector.A0Q;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 257, 0);
            r5.A0E(r4.A0L(objArr, R.plurals.f10nameremoved, 257), 1);
            if (selectionCheckView != null) {
                selectionCheckView.A04(false, false);
                return;
            }
            return;
        } else {
            TextView A0P2 = C36391kE.A0P(phoneContactsSelector.findViewById(R.id.search_holder), R.id.search_src_text);
            if (A0P2 != null) {
                C36391kE.A1K(A0P2);
            }
            r10.A03 = true;
            z = true;
        }
        List list = phoneContactsSelector.A0i;
        if (!z) {
            int indexOf = list.indexOf(r10);
            if (list.remove(r10)) {
                phoneContactsSelector.A0f.A09(indexOf);
            }
        } else if (list.add(r10)) {
            phoneContactsSelector.A0f.A08(C36421kH.A06(list, 1));
        }
        if (selectionCheckView != null) {
            selectionCheckView.A04(r10.A03, false);
        }
        if (list.isEmpty()) {
            A0w(phoneContactsSelector);
        } else if (phoneContactsSelector.A0a.getVisibility() != 0) {
            int dimensionPixelSize = phoneContactsSelector.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            phoneContactsSelector.A0a.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) dimensionPixelSize);
            translateAnimation.setDuration(240);
            translateAnimation.setAnimationListener(new C67253Zc(phoneContactsSelector, dimensionPixelSize));
            phoneContactsSelector.A03.startAnimation(translateAnimation);
        } else if (r10.A03) {
            phoneContactsSelector.A0b.A0h(C36421kH.A06(list, 1));
        }
        A0x(phoneContactsSelector, list.size());
        if (r10.A02 == null) {
            if (r10.A01 != null && C36401kF.A1Y(phoneContactsSelector.A0D)) {
                AnonymousClass141 r12 = r10.A01;
                if (r12.A07 == 1) {
                    AnonymousClass11F r3 = r12.A0H;
                    r2 = phoneContactsSelector.A04;
                    r1 = new C1502474n(phoneContactsSelector, r10, r3, 41);
                    r2.Boy(r1);
                }
            }
            r2 = phoneContactsSelector.A04;
            r1 = new C80273v8(phoneContactsSelector, r10, 17);
            r2.Boy(r1);
        }
    }

    public static void A0w(PhoneContactsSelector phoneContactsSelector) {
        phoneContactsSelector.A0a.setVisibility(4);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-phoneContactsSelector.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        translateAnimation.setDuration(240);
        translateAnimation.setAnimationListener(new C67253Zc(phoneContactsSelector, 0));
        phoneContactsSelector.A03.startAnimation(translateAnimation);
    }

    public void A3j() {
        C49372j0 r1 = this.A0J;
        if (r1 != null) {
            r1.A0D(true);
            this.A0J = null;
        }
        C49372j0 r12 = new C49372j0(this, this.A0Q, this.A0Y, this.A0h);
        this.A0J = r12;
        C36331k8.A1F(r12, this.A04);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        this.A0V.get();
        if (this.A0e) {
            this.A0e = false;
            C18740tg.A01();
            ArrayList arrayList = this.A0g;
            arrayList.clear();
            arrayList.addAll(this.A0h);
            this.A0I.notifyDataSetChanged();
            this.A0d.A05(true);
            return;
        }
        super.onBackPressed();
    }

    public void onResume() {
        super.onResume();
        boolean A1Z = C36411kG.A1Z(this.A0K);
        C49372j0 r0 = this.A0J;
        if (r0 != null) {
            r0.A0D(A1Z);
            this.A0J = null;
        }
        C19630wG r3 = this.A0O;
        C21060yb r2 = this.A08;
        C19630wG r8 = r3;
        C21060yb r7 = r2;
        C49582jM r4 = new C49582jM(this.A0B, this, r7, r8, this.A0P, this.A0D);
        this.A0K = r4;
        C36331k8.A1F(r4, this.A04);
        if (this.A09.A00()) {
            this.A02.setVisibility(0);
        }
        boolean z = C36431kI.A0o(this.A0V).A03;
        View view = this.A00;
        if (z) {
            C20810yC r15 = this.A0D;
            AnonymousClass17Y r14 = this.A05;
            C19730wQ r13 = this.A02;
            C19770wU r11 = this.A04;
            C27731Pn r10 = this.A0F;
            AnonymousClass16D r9 = this.A0B;
            AnonymousClass171 r82 = this.A0C;
            C18820ts r72 = this.A0Q;
            AnonymousClass3HF r6 = this.A0M;
            AnonymousClass1V6 r5 = this.A0N;
            AnonymousClass005 r42 = this.A0V;
            AnonymousClass005 r32 = this.A0W;
            View view2 = this.A01;
            AnonymousClass1RY r1 = this.A0E;
            C19420v0 r23 = this.A09;
            AnonymousClass1V6 r22 = r5;
            AnonymousClass3HF r21 = r6;
            C27731Pn r20 = r10;
            AnonymousClass1RY r19 = r1;
            AnonymousClass171 r18 = r82;
            AnonymousClass16D r17 = r9;
            C19730wQ r16 = r13;
            AnonymousClass17Y r152 = r14;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass3UR.A00(this, view4, view3, r152, r16, r17, r18, r19, r20, r21, r22, r23, r72, r15, r11, r42, r32, "phone-contacts-selector-activity");
            this.A01 = (View) A002.first;
            this.A0E = (AnonymousClass1RY) A002.second;
        } else if (AnonymousClass1V9.A00(view)) {
            AnonymousClass3UR.A04(this.A00, this.A0N, this.A0V);
        }
        C36421kH.A1I(this.A0V);
    }

    public boolean onSearchRequested() {
        this.A0d.A06(this.A0Z);
        this.A0e = true;
        return false;
    }

    public static void A0x(PhoneContactsSelector phoneContactsSelector, int i) {
        AnonymousClass07B supportActionBar = phoneContactsSelector.getSupportActionBar();
        Object[] A0L2 = AnonymousClass001.A0L();
        C36331k8.A1W(A0L2, i);
        supportActionBar.A0P(phoneContactsSelector.A0Q.A0L(A0L2, R.plurals.f10nameremoved, (long) i));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = C36411kG.A0I(menu).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        if (this.A0Z) {
            icon.setIcon(R.drawable.ic_search_normal);
            this.A00.getIcon().setTint(AnonymousClass00F.A00(this, R.color.f6nameremoved));
        }
        this.A00.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new AnonymousClass4Z3(this, 1));
        this.A00.setVisible(C36411kG.A1a(this.A0h));
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C49372j0 r0 = this.A0J;
        if (r0 != null) {
            r0.A0D(true);
            this.A0J = null;
        }
        C49582jM r02 = this.A0K;
        if (r02 != null) {
            r02.A0D(true);
            this.A0K = null;
        }
        this.A0h.clear();
        this.A0g.clear();
        this.A0D.A02();
        AnonymousClass3UR.A02(this.A01, this.A0N);
        AnonymousClass1RY r03 = this.A0E;
        if (r03 != null) {
            r03.A02();
            this.A0E = null;
        }
        this.A0L.A02(9);
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

    public void onPause() {
        super.onPause();
        AnonymousClass3UR.A07(this.A0N);
        C36431kI.A0o(this.A0V).A01(this.A00);
    }

    public void onStart() {
        super.onStart();
        if (this.A0Z) {
            this.A0U.A03(this.A0c, this);
        }
    }

    public static String A0u(AnonymousClass1N4 r36, AnonymousClass1KK r37, AnonymousClass16D r38, C62583Gs r39, C21060yb r40, C19630wG r41, C18820ts r42, C230416y r43, C230116v r44) {
        Throwable th;
        AnonymousClass141 A052;
        String A0f2;
        String str;
        C18740tg.A00();
        AnonymousClass16D r35 = r38;
        C18820ts r34 = r42;
        C65033Ql r8 = new C65033Ql(r35, r40, r41, r34);
        C62583Gs r2 = r39;
        String str2 = r2.A06;
        C65643Sx r0 = r8.A04;
        AnonymousClass3F9 r6 = r0.A0A;
        r6.A01 = str2;
        String obj = Long.valueOf(r2.A04).toString();
        String str3 = "data9";
        String[] strArr = {"data2", "data3", "data5", "data4", "data6", "data7", str3};
        C21060yb r33 = r8.A01;
        C21050ya A0z = C36431kI.A0z(r33);
        Uri uri = ContactsContract.Data.CONTENT_URI;
        String[] A1S = C36441kJ.A1S();
        A1S[0] = obj;
        A1S[1] = "vnd.android.cursor.item/name";
        Cursor A032 = A0z.A03(uri, strArr, "contact_id = ? AND mimetype=?", A1S, (String) null);
        if (A032 != null) {
            while (A032.moveToNext()) {
                try {
                    r6.A02 = C36341k9.A0f(A032, "data2");
                    r6.A00 = C36341k9.A0f(A032, "data3");
                    r6.A03 = C36341k9.A0f(A032, "data5");
                    r6.A06 = C36341k9.A0f(A032, "data4");
                    r6.A07 = C36341k9.A0f(A032, "data6");
                    r6.A04 = C36341k9.A0f(A032, "data7");
                    r6.A05 = C36341k9.A0f(A032, str3);
                } catch (Throwable th2) {
                    th = th2;
                    A032.close();
                    throw th;
                }
            }
            A032.close();
        }
        Cursor A033 = C36431kI.A0z(r33).A03(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data2", "data1", "data3", "is_primary", "raw_contact_id"}, "contact_id =?", new String[]{obj}, (String) null);
        try {
            HashMap A022 = r8.A02(obj);
            if (A033 != null) {
                while (A033.moveToNext()) {
                    r0.A04((UserJid) A022.get(C36341k9.A0f(A033, "raw_contact_id")), C36341k9.A0f(A033, "data1"), C36341k9.A0f(A033, "data3"), C36351kA.A03(A033, "data2"), AnonymousClass000.A1S(C36351kA.A03(A033, "is_primary"), 1));
                }
                r8.A07(r0);
                A033.close();
            }
            Cursor A034 = C36431kI.A0z(r33).A03(ContactsContract.CommonDataKinds.Email.CONTENT_URI, (String[]) null, "contact_id = ?", new String[]{obj}, (String) null);
            if (A034 != null) {
                while (A034.moveToNext()) {
                    try {
                        Class<ContactsContract.CommonDataKinds.Email> cls = ContactsContract.CommonDataKinds.Email.class;
                        int A035 = C36351kA.A03(A034, "data2");
                        String A0f3 = C36341k9.A0f(A034, "data1");
                        String A0f4 = C36341k9.A0f(A034, "data3");
                        boolean A1S2 = AnonymousClass000.A1S(C36351kA.A03(A034, "is_primary"), 1);
                        List list = r0.A03;
                        if (list == null) {
                            list = AnonymousClass001.A0I();
                            r0.A03 = list;
                        }
                        AnonymousClass3A9 r5 = new AnonymousClass3A9();
                        r5.A01 = cls;
                        r5.A00 = A035;
                        r5.A02 = A0f3;
                        r5.A03 = A0f4;
                        r5.A05 = A1S2;
                        list.add(r5);
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
                A034.close();
            }
            String format = String.format("%s =? AND %s =?", new Object[]{"contact_id", "mimetype"});
            C21050ya A0z2 = C36431kI.A0z(r33);
            Uri uri2 = ContactsContract.Data.CONTENT_URI;
            Cursor A036 = A0z2.A03(uri2, new String[]{"data2", "data1"}, format, new String[]{obj, "vnd.android.cursor.item/website"}, (String) null);
            if (A036 != null) {
                while (A036.moveToNext()) {
                    try {
                        int A037 = C36351kA.A03(A036, "data2");
                        String A0f5 = C36341k9.A0f(A036, "data1");
                        List list2 = r0.A07;
                        if (list2 == null) {
                            list2 = AnonymousClass001.A0I();
                            r0.A07 = list2;
                        }
                        AnonymousClass362 r52 = new AnonymousClass362();
                        r52.A00 = A037;
                        C18740tg.A06(A0f5);
                        r52.A01 = A0f5;
                        list2.add(r52);
                    } catch (ParseException e) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Date string '");
                        A0u.append(A0f2);
                        C36351kA.A1Q("' not in format of <MMM dd, yyyy>", A0u, e);
                    } catch (Throwable th4) {
                        th = th4;
                        A036.close();
                        throw th;
                    }
                }
                A036.close();
            }
            A036 = C36431kI.A0z(r33).A03(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, (String[]) null, "contact_id = ?", new String[]{obj}, (String) null);
            if (A036 != null) {
                while (A036.moveToNext()) {
                    if (r0.A03 == null) {
                        r0.A03 = AnonymousClass001.A0I();
                    }
                    AnonymousClass3A9 r10 = new AnonymousClass3A9();
                    r10.A01 = ContactsContract.CommonDataKinds.StructuredPostal.class;
                    r10.A00 = C36351kA.A03(A036, "data2");
                    r10.A02 = C36341k9.A0f(A036, "data1");
                    r10.A04 = new AnonymousClass3PZ();
                    String A0f6 = C36341k9.A0f(A036, "data4");
                    if (A0f6 != null) {
                        r10.A04.A03 = A0f6.replaceAll("(\r\n|\r|\n|\n\r)", " ");
                    }
                    r10.A04.A00 = C36341k9.A0f(A036, "data7");
                    r10.A04.A02 = C36341k9.A0f(A036, "data8");
                    r10.A04.A04 = C36341k9.A0f(A036, "data9");
                    r10.A04.A01 = C36341k9.A0f(A036, "data10");
                    r10.A03 = C36341k9.A0f(A036, "data3");
                    boolean z = true;
                    if (C36351kA.A03(A036, "is_primary") != 1) {
                        z = false;
                    }
                    r10.A05 = z;
                    r0.A03.add(r10);
                }
                A036.close();
            }
            String[] A1S3 = C36441kJ.A1S();
            A1S3[0] = obj;
            A1S3[1] = "vnd.android.cursor.item/organization";
            A036 = C36431kI.A0z(r33).A03(uri2, (String[]) null, "contact_id = ? AND mimetype = ?", A1S3, (String) null);
            if (A036 != null) {
                if (A036.moveToFirst()) {
                    String A0f7 = C36341k9.A0f(A036, "data1");
                    String A0f8 = C36341k9.A0f(A036, "data5");
                    StringBuilder A0v = AnonymousClass000.A0v(A0f7);
                    if (A0f8 == null || A0f8.length() == 0) {
                        str = "";
                    } else {
                        str = AnonymousClass000.A0p(";", A0f8, AnonymousClass000.A0u());
                    }
                    String A0q = AnonymousClass000.A0q(str, A0v);
                    String A0f9 = C36341k9.A0f(A036, "data4");
                    A036.getInt(A036.getColumnIndexOrThrow("is_primary"));
                    r0.A05(A0q, A0f9);
                }
                A036.close();
            }
            String[] A1S4 = C36441kJ.A1S();
            A1S4[0] = obj;
            A1S4[1] = "vnd.android.cursor.item/photo";
            Uri uri3 = uri2;
            A032 = C36431kI.A0z(r33).A03(uri3, new String[]{"data15"}, "contact_id = ? AND mimetype = ? ", A1S4, (String) null);
            if (A032 != null) {
                if (A032.moveToFirst()) {
                    r0.A0B = C36391kE.A1b(A032, "data15");
                }
                A032.close();
            }
            String[] A1S5 = C36441kJ.A1S();
            A1S5[0] = obj;
            A1S5[1] = "vnd.android.cursor.item/nickname";
            A032 = C36431kI.A0z(r33).A03(uri2, (String[]) null, "contact_id = ? AND mimetype = ?", A1S5, (String) null);
            if (A032 != null) {
                if (A032.moveToFirst()) {
                    AnonymousClass3KL r53 = new AnonymousClass3KL();
                    r53.A01 = "NICKNAME";
                    r53.A02 = C36341k9.A0f(A032, "data1");
                    r0.A06(r53);
                }
                A032.close();
            }
            A036 = C36431kI.A0z(r33).A03(uri3, (String[]) null, "contact_id = ? AND mimetype = ? AND data2 =? ", new String[]{obj, "vnd.android.cursor.item/contact_event", String.valueOf(3)}, (String) null);
            if (A036 != null) {
                if (A036.moveToFirst()) {
                    AnonymousClass3KL r7 = new AnonymousClass3KL();
                    r7.A01 = "BDAY";
                    A0f2 = C36341k9.A0f(A036, "data1");
                    if (A0f2 == null) {
                        A0f2 = null;
                    } else {
                        A0f2 = ((DateFormat) AnonymousClass6XI.A01.A01()).format(((DateFormat) AnonymousClass6XI.A00.A01()).parse(A0f2));
                    }
                    r7.A02 = A0f2;
                    r0.A06(r7);
                }
                A036.close();
            }
            String[] A1S6 = C36441kJ.A1S();
            A1S6[0] = obj;
            A1S6[1] = "vnd.android.cursor.item/im";
            A032 = C36431kI.A0z(r33).A03(uri3, (String[]) null, "contact_id = ? AND mimetype = ? ", A1S6, (String) null);
            if (A032 != null) {
                while (A032.moveToNext()) {
                    int A038 = C36351kA.A03(A032, "data5");
                    AnonymousClass3KL r62 = new AnonymousClass3KL();
                    r62.A02 = C36341k9.A0f(A032, "data1");
                    C18820ts r9 = r8.A03;
                    String A0o = C36401kF.A0o(r9.A00, ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(A038));
                    Iterator A10 = C36371kC.A10(C65643Sx.A0D);
                    while (A10.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A10);
                        if (((String) A11.getValue()).equalsIgnoreCase(A0o)) {
                            r62.A01 = (String) A11.getKey();
                        }
                    }
                    r62.A04.add(C36401kF.A0o(r9.A00, ContactsContract.CommonDataKinds.Im.getTypeLabelResource(A038)).toUpperCase());
                    r0.A06(r62);
                }
                A032.close();
            }
            r8.A04(r37);
            if (r44.A01.A0E(3790) && (A052 = r35.A05(Long.parseLong(obj))) != null) {
                AnonymousClass11F r22 = A052.A0H;
                if (AnonymousClass143.A0I(r22)) {
                    String A002 = r43.A00((C223213v) r22);
                    C223313w r23 = (C223313w) A052.A0H;
                    if (r23 != null) {
                        C599735z r1 = r0.A09;
                        r1.A00 = r23;
                        r1.A01 = A002;
                    }
                }
            }
            try {
                return new C64643Ow(r36, r34).A01(r0);
            } catch (AnonymousClass1YJ e2) {
                Log.e("Could not create VCard", new C108695Un(e2));
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            if (A033 != null) {
                A033.close();
                throw th;
            }
            throw th;
        }
    }
}
