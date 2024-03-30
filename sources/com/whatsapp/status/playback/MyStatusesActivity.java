package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass02E;
import X.AnonymousClass0FM;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass15K;
import X.AnonymousClass16D;
import X.AnonymousClass16E;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1DU;
import X.AnonymousClass1H2;
import X.AnonymousClass1HT;
import X.AnonymousClass1N6;
import X.AnonymousClass1Q1;
import X.AnonymousClass1QO;
import X.AnonymousClass1SV;
import X.AnonymousClass1V2;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass22g;
import X.AnonymousClass2JT;
import X.AnonymousClass331;
import X.AnonymousClass37S;
import X.AnonymousClass3C3;
import X.AnonymousClass3CA;
import X.AnonymousClass3LW;
import X.AnonymousClass3MK;
import X.AnonymousClass3P1;
import X.AnonymousClass3PH;
import X.AnonymousClass3SJ;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass3XT;
import X.AnonymousClass3ZU;
import X.AnonymousClass4SX;
import X.AnonymousClass4W7;
import X.AnonymousClass4WM;
import X.AnonymousClass4XQ;
import X.AnonymousClass4XV;
import X.AnonymousClass4Z4;
import X.AnonymousClass4Z5;
import X.C021809f;
import X.C07200Ws;
import X.C132446Tt;
import X.C1497572q;
import X.C177528dw;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C18840tu;
import X.C18950u5;
import X.C19430v1;
import X.C19460v5;
import X.C19470v6;
import X.C19760wT;
import X.C19770wU;
import X.C19890wg;
import X.C20800yB;
import X.C20810yC;
import X.C20830yE;
import X.C21000yV;
import X.C21010yW;
import X.C21710zg;
import X.C226515g;
import X.C24341Cb;
import X.C27111My;
import X.C28781Ua;
import X.C29561Xc;
import X.C29731Xt;
import X.C32341dO;
import X.C32421dW;
import X.C32681e1;
import X.C34341gs;
import X.C34911hq;
import X.C34931hs;
import X.C35011i0;
import X.C35021i1;
import X.C35041i3;
import X.C35061i5;
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
import X.C37351mE;
import X.C37901nO;
import X.C39001qm;
import X.C43702Jm;
import X.C48772i1;
import X.C49072iW;
import X.C49182ih;
import X.C51662oB;
import X.C51672oC;
import X.C55432uc;
import X.C57822ys;
import X.C61103Ao;
import X.C62213Ff;
import X.C64933Qa;
import X.C65963Ud;
import X.C79353ta;
import X.C81173wa;
import X.C81703xR;
import X.C89364Wg;
import X.C89764Xu;
import X.C90394a5;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MyStatusesActivity extends AnonymousClass22g implements AnonymousClass15K {
    public AnonymousClass0V9 A00;
    public C07200Ws A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public C57822ys A05;
    public AnonymousClass3CA A06;
    public AnonymousClass1XY A07;
    public AnonymousClass1X4 A08;
    public WfalManager A09;
    public AnonymousClass16D A0A;
    public AnonymousClass171 A0B;
    public C24341Cb A0C;
    public C19760wT A0D;
    public C20830yE A0E;
    public C18820ts A0F;
    public AnonymousClass16J A0G;
    public AnonymousClass1QO A0H;
    public AnonymousClass1HT A0I;
    public AnonymousClass16E A0J;
    public C21010yW A0K;
    public C62213Ff A0L;
    public AnonymousClass1DU A0M;
    public C19890wg A0N;
    public AnonymousClass3T1 A0O;
    public AnonymousClass3ZU A0P;
    public AnonymousClass1Q1 A0Q;
    public StatusExpirationLifecycleOwner A0R;
    public AnonymousClass37S A0S;
    public AnonymousClass3P1 A0T;
    public C32341dO A0U;
    public C29561Xc A0V;
    public C29731Xt A0W;
    public C37901nO A0X;
    public C43702Jm A0Y;
    public C79353ta A0Z;
    public AnonymousClass1A1 A0a;
    public AnonymousClass1N6 A0b;
    public C32681e1 A0c;
    public AnonymousClass1SV A0d;
    public C32421dW A0e;
    public C34911hq A0f;
    public C34931hs A0g;
    public C35011i0 A0h;
    public C35021i1 A0i;
    public C28781Ua A0j;
    public AnonymousClass005 A0k;
    public boolean A0l;
    public boolean A0m;
    public C021809f A0n;
    public C49072iW A0o;
    public boolean A0p;
    public final Handler A0q;
    public final View.OnClickListener A0r;
    public final View.OnClickListener A0s;
    public final Runnable A0t;
    public final HashMap A0u;
    public final HashMap A0v;
    public final List A0w;
    public final Map A0x;
    public final Set A0y;
    public final C226515g A0z;
    public final AnonymousClass191 A10;
    public final AnonymousClass4SX A11;
    public final C35041i3 A12;
    public final Runnable A13;

    public int A2I() {
        return 78318969;
    }

    public boolean A2g() {
        return false;
    }

    public String BCV() {
        return "my_status_activity";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(findViewById(R.id.fab));
        A0I2.add(findViewById(R.id.fab_second));
        AnonymousClass3ZU r2 = new AnonymousClass3ZU(view, (AnonymousClass012) this, this.A08, (List) A0I2, i, i2, z);
        this.A0P = r2;
        r2.A05(new C81173wa((Object) this, 25));
        return this.A0P;
    }

    public static void A0u(AnonymousClass3T1 r4, MyStatusesActivity myStatusesActivity, boolean z) {
        HashMap hashMap = myStatusesActivity.A0v;
        C64933Qa r2 = r4.A1J;
        C132446Tt r1 = (C132446Tt) hashMap.remove(r2);
        if (r1 != null) {
            if (z) {
                r1.A0D(true);
            } else {
                return;
            }
        }
        C49182ih r12 = new C49182ih(r4, myStatusesActivity);
        hashMap.put(r2, r12);
        C36331k8.A1F(r12, myStatusesActivity.A04);
    }

    public static void A0v(MyStatusesActivity myStatusesActivity) {
        C36331k8.A1E(myStatusesActivity.A0o);
        C49072iW r1 = new C49072iW(myStatusesActivity);
        myStatusesActivity.A0o = r1;
        C36331k8.A1F(r1, myStatusesActivity.A04);
    }

    public static void A0w(MyStatusesActivity myStatusesActivity) {
        if (myStatusesActivity.A0V.A00()) {
            myStatusesActivity.A0W.A03();
        }
        if (RequestPermissionActivity.A0I(myStatusesActivity, myStatusesActivity.A0E, 33) && myStatusesActivity.A0C.A04(myStatusesActivity.A0z)) {
            if (myStatusesActivity.A08.A01() < C36401kF.A04(myStatusesActivity.A0D, 3659)) {
                AnonymousClass1V2.A05(myStatusesActivity, myStatusesActivity, myStatusesActivity.A0K, 5);
            } else {
                myStatusesActivity.startActivity(AnonymousClass190.A18(myStatusesActivity, C177528dw.A00.getRawString(), 4, 24, 9));
            }
        }
    }

    public static void A0x(MyStatusesActivity myStatusesActivity) {
        long j;
        AnonymousClass17Y r0 = myStatusesActivity.A05;
        Runnable runnable = myStatusesActivity.A13;
        r0.A0G(runnable);
        if (!myStatusesActivity.A0X.isEmpty()) {
            C37901nO r1 = myStatusesActivity.A0X;
            if (r1.A00.isEmpty()) {
                j = 0;
            } else {
                j = ((AnonymousClass3T1) C36391kE.A0t(r1.A00)).A0I;
            }
            myStatusesActivity.A05.A0I(runnable, C36401kF.A03(j));
        }
    }

    public void A2F() {
        if (!this.A0p) {
            this.A0p = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r3 = A0L2.A5g;
            C36321k7.A0c(r3, this);
            C18830tt r1 = r3.A00;
            C36321k7.A0X(r3, r1, this, C36321k7.A05(r3, r1, this));
            AnonymousClass22g.A0l(this);
            this.A07 = C36411kG.A0Y(r3);
            C19470v6 r4 = C19470v6.A00;
            this.A04 = r4;
            this.A0M = C36391kE.A0j(r3);
            this.A0K = C36351kA.A0g(r3);
            this.A0D = (C19760wT) r3.A70.get();
            this.A0J = C36391kE.A0e(r3);
            this.A08 = C36361kB.A0T(r3);
            this.A0j = C36391kE.A0p(r3);
            this.A0A = C36341k9.A0R(r3);
            this.A0H = (AnonymousClass1QO) r3.A7E.get();
            this.A0B = C36341k9.A0S(r3);
            this.A0F = C36341k9.A0T(r3);
            this.A03 = r4;
            this.A0a = C36351kA.A0n(r3);
            this.A0G = C36361kB.A0Z(r3);
            this.A0f = (C34911hq) r1.A6X.get();
            this.A0C = C36431kI.A0a(r3);
            this.A0d = C36401kF.A0g(r3);
            this.A09 = C36431kI.A0Y(r3);
            this.A0I = (AnonymousClass1HT) r3.A7x.get();
            this.A0Q = (AnonymousClass1Q1) r3.A9I.get();
            this.A0E = C36351kA.A0X(r3);
            this.A0U = (C32341dO) r3.A7z.get();
            this.A0W = C36381kD.A0i(r3);
            this.A0b = C36361kB.A0e(r3);
            this.A0h = (C35011i0) r1.A4Q.get();
            this.A0i = (C35021i1) r3.Aew.get();
            this.A0g = (C34931hs) r3.AEx.get();
            this.A0V = C18800tq.AKs(r3);
            this.A0N = C36351kA.A0m(r3);
            this.A02 = r4;
            this.A0L = (C62213Ff) r3.AAg.get();
            this.A0k = C18840tu.A00(r3.AfA);
            this.A0Y = C27111My.A3K(A0L2);
            this.A06 = (AnonymousClass3CA) r1.A7f.get();
            this.A0S = (AnonymousClass37S) r1.A07.get();
            this.A0e = r1.ADa();
            this.A05 = (C57822ys) A0L2.A1t.get();
            this.A0c = C36351kA.A0p(r1);
        }
    }

    public void A3j(View view, AnonymousClass3T1 r7) {
        int A082;
        Map map = this.A0x;
        C64933Qa r4 = r7.A1J;
        if (map.containsKey(r4)) {
            map.remove(r4);
            A082 = 0;
        } else {
            map.put(r4, r7);
            A082 = C36391kE.A08(view);
        }
        view.setBackgroundResource(A082);
        boolean isEmpty = map.isEmpty();
        AnonymousClass0V9 r3 = this.A00;
        if (!isEmpty) {
            if (r3 == null) {
                r3 = But(this.A0n);
                this.A00 = r3;
            }
            r3.A0B(this.A0F.A0M().format((long) map.size()));
            this.A00.A06();
        } else if (r3 != null) {
            r3.A05();
        }
        this.A0y.add(r4);
        Handler handler = this.A0q;
        Runnable runnable = this.A0t;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        this.A0X.notifyDataSetChanged();
    }

    public void A3k(C51672oC r6, Integer num, List list) {
        boolean A032;
        int i;
        C61103Ao r0;
        this.A0l = C36361kB.A1a(r6, C51672oC.FACEBOOK_SHARE);
        int ordinal = r6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                A032 = this.A0U.A04(this, (AnonymousClass02E) null, "my_status_activity", list);
            } else {
                return;
            }
        } else if (this.A0j.A00()) {
            if (list.size() > 15) {
                i = 27;
            } else {
                C35061i5 r4 = this.A0h.A06;
                ArrayList A0J2 = C36321k7.A0J(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C36391kE.A1W(A0J2, C36391kE.A0l(it).A1N);
                }
                if (!r4.A00(A0J2)) {
                    i = 26;
                } else {
                    this.A0x.clear();
                    this.A0h.A02(this, num, "my_status_activity", list);
                    return;
                }
            }
            AnonymousClass3SJ.A01(this, i);
            return;
        } else {
            A032 = this.A0U.A03(this, (AnonymousClass02E) null, "my_status_activity", list);
        }
        if (!A032 && !this.A0U.A02.A0D() && (r0 = this.A0W.A00) != null) {
            r0.A01 = 4;
        }
    }

    public AnonymousClass01P BAc() {
        return this.A06.A02;
    }

    public void onCreate(Bundle bundle) {
        Log.i("myStatusesActivity/onCreate");
        C36331k8.A0l(this);
        super.onCreate(bundle);
        C20810yC r3 = this.A0D;
        C21000yV r1 = C21000yV.A01;
        this.A0m = C20800yB.A01(r1, r3, 1875);
        setTitle(R.string.f12nameremoved);
        A2u();
        boolean A1X = C36341k9.A1X(this);
        setContentView((int) R.layout.f9nameremoved);
        findViewById(R.id.root_view).setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
        this.A01.setFitsSystemWindows(A1X);
        AnonymousClass17Y r11 = this.A05;
        C19770wU r14 = this.A04;
        this.A0R = new StatusExpirationLifecycleOwner(this, r11, this.A0I, this.A0J, r14);
        this.A0T = this.A06.A00(C51662oB.MY_STATUS_FRAGMENT, false);
        AnonymousClass1H2 r5 = this.A0C;
        AnonymousClass16D r112 = this.A0A;
        AnonymousClass171 r12 = this.A0B;
        C18820ts r4 = this.A0F;
        C57822ys r7 = this.A05;
        this.A0n = new AnonymousClass4W7(this, r112, r12, new AnonymousClass3PH(), new AnonymousClass2JT((AnonymousClass3C3) r7.A00.A00.A1Y.get(), this, C27111My.A3K(r7.A00.A00)), this.A0Y, r4, r5, this, 5);
        this.A0Z = new C79353ta(this);
        this.A0X = new C37901nO(this);
        ListView listView = getListView();
        listView.setFastScrollEnabled(false);
        boolean A0E2 = this.A0D.A0E(7724);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = R.layout.f9nameremoved;
        if (A0E2) {
            i = R.layout.f9nameremoved;
        }
        View inflate = layoutInflater.inflate(i, listView, false);
        listView.addFooterView(inflate, (Object) null, false);
        TextEmojiLabel A0O2 = C36401kF.A0O(inflate, R.id.e2ee_main_text);
        C32681e1 r113 = this.A0c;
        Object[] A0M2 = AnonymousClass001.A0M();
        A0M2[0] = "%s";
        AnonymousClass000.A1K(A0M2, 24);
        A0O2.setText(r113.A03(this, new C81173wa((Object) this, 24), getString(R.string.f12nameremoved, A0M2), "%s", C36381kD.A01(this)));
        C36331k8.A16(A0O2, this.A08);
        C36331k8.A10(A0O2, this.A0D);
        listView.setAdapter(this.A0X);
        listView.setOnItemClickListener(new AnonymousClass4WM(this.A07, this, 2));
        listView.setOnItemLongClickListener(new C89764Xu(this, 3));
        TextView A0Q2 = C36391kE.A0Q(this, 16908292);
        String string = getString(R.string.f12nameremoved);
        A0Q2.setText(C37351mE.A01(A0Q2.getPaint(), AnonymousClass00E.A00(this, R.drawable.ic_new_status_tip), string, "%s"));
        View findViewById = findViewById(R.id.fab);
        ImageView A0Q3 = C36411kG.A0Q(this, R.id.fab_second);
        if (C36421kH.A1V(this)) {
            C36421kH.A0x(findViewById, A0Q3);
        } else {
            C48772i1.A00(findViewById, this, 4);
            C48772i1.A00(A0Q3, this, 5);
            if (C20800yB.A01(r1, this.A0D, 1874)) {
                new C34341gs(A0Q3, this.A05, this.A0D, this.A09, this.A04).A00();
            }
        }
        C36391kE.A16(this, R.id.progress, 0);
        A0v(this);
        this.A0G.registerObserver(this.A10);
        this.A0i.registerObserver(this.A12);
        this.A0g.registerObserver(this.A11);
        this.A0Q.A01(this);
        if (this.A0V.A00() && bundle != null) {
            this.A0W.A09(C36371kC.A0m());
        }
        C36401kF.A1C(this);
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM create;
        if (i != 13) {
            if (i == 26) {
                if (this.A0j.A00()) {
                    C39001qm A002 = AnonymousClass3LW.A00(this);
                    A002.A0a(true);
                    A002.A0K(R.string.f12nameremoved);
                    AnonymousClass4XQ.A00(A002, this, 31, R.string.f12nameremoved);
                    A002.A0N(new AnonymousClass4XV(this, 23));
                    create = A002.create();
                }
                C18740tg.A0D(false, "MyStatusActivity/invalid dialog invoke");
                return null;
            } else if (i == 27) {
                if (this.A0j.A00()) {
                    C35011i0 r1 = this.A0h;
                    C39001qm A003 = AnonymousClass3LW.A00(this);
                    A003.A0a(true);
                    C18820ts r4 = r1.A02;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, 0, 15);
                    A003.A0Z(r4.A0L(objArr, R.plurals.f10nameremoved, 15));
                    AnonymousClass4XQ.A00(A003, this, 32, R.string.f12nameremoved);
                    A003.A0N(new AnonymousClass4XV(this, 22));
                    create = A003.create();
                }
                C18740tg.A0D(false, "MyStatusActivity/invalid dialog invoke");
                return null;
            }
            AnonymousClass00C.A08(create);
            return create;
        }
        Map map = this.A0x;
        if (map.isEmpty()) {
            Log.e("mediagallery/dialog/delete no messages");
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("mediagallery/dialog/delete/");
            C36321k7.A1Y(A0u2, map.size());
            HashSet hashSet = new HashSet(map.values());
            return C55432uc.A00(this, this.A05, this.A08, this.A0C, new AnonymousClass331(this), hashSet);
        }
        return super.onCreateDialog(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0D.A0E(6685)) {
            getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        Log.i("myStatusesActivity/onDestroy");
        super.onDestroy();
        this.A0G.unregisterObserver(this.A10);
        this.A0i.unregisterObserver(this.A12);
        this.A0g.unregisterObserver(this.A11);
        this.A0Q.A02(this);
        boolean A1Z = C36411kG.A1Z(this.A0o);
        HashMap hashMap = this.A0v;
        Iterator A102 = C36391kE.A10(hashMap);
        while (A102.hasNext()) {
            ((C132446Tt) A102.next()).A0D(A1Z);
        }
        List<Uri> list = this.A0w;
        for (Uri revokeUriPermission : list) {
            revokeUriPermission(revokeUriPermission, A1Z ? 1 : 0);
        }
        list.clear();
        hashMap.clear();
        this.A05.A0G(this.A13);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.A0D.A0E(6685) || menuItem.getItemId() != R.id.menu_item_status_privacy) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(AnonymousClass190.A0E(this));
        return true;
    }

    public void onPause() {
        Log.i("myStatusesActivity/onPause");
        this.A0U.A05.A07(this);
        super.onPause();
    }

    public void onResume() {
        Log.i("myStatusesActivity/onResume");
        super.onResume();
        C65963Ud.A00(this, this.A0U.A05, 23);
        this.A0b.A02((AnonymousClass11F) null, 83);
    }

    public void onStart() {
        Log.i("myStatusesActivity/onStart");
        super.onStart();
        A0x(this);
    }

    public void onStop() {
        Log.i("myStatusesActivity/onStop");
        super.onStop();
    }

    public MyStatusesActivity(int i) {
        this.A0p = false;
        C89364Wg.A00(this, 49);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void Bih(AnonymousClass0V9 r1) {
        super.Bih(r1);
        C36391kE.A14(this);
    }

    public void Bii(AnonymousClass0V9 r1) {
        super.Bii(r1);
        C36341k9.A0n(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass0V9 r0;
        C61103Ao r02;
        C51672oC r1;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i != 33) {
                if (i == 35) {
                    if (i2 == -1 && (r0 = this.A00) != null) {
                        r0.A05();
                    }
                    if (this.A0l) {
                        this.A0U.A01(intent);
                    }
                } else if (i != 151) {
                } else {
                    if (i2 == -1) {
                        Map map = this.A0x;
                        if (!map.isEmpty()) {
                            ArrayList A15 = C36441kJ.A15(map.values());
                            map.clear();
                            if (this.A0l) {
                                r1 = C51672oC.FACEBOOK_SHARE;
                            } else {
                                r1 = C51672oC.THIRD_PARTY_SHARE;
                            }
                            A3k(r1, (Integer) null, A15);
                        }
                    } else if (i2 == 0 && (r02 = this.A0W.A00) != null) {
                        r02.A01 = 4;
                    }
                }
            } else if (i2 == -1) {
                A0w(this);
            }
        } else if (i2 == -1 && intent != null) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Map map2 = this.A0x;
            if (!map2.isEmpty()) {
                A0I2.addAll(map2.values());
            } else {
                AnonymousClass3T1 r03 = this.A0O;
                if (r03 != null) {
                    A0I2.add(r03);
                }
            }
            if (!A0I2.isEmpty()) {
                ArrayList A0k2 = C36341k9.A0k(intent);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                String stringExtra = intent.getStringExtra("appended_message");
                AnonymousClass1X4 r4 = this.A08;
                AnonymousClass1XY r5 = this.A07;
                ArrayList A152 = C36441kJ.A15(A0I2);
                Collections.sort(A152, C81703xR.A00);
                r4.A0H(r5, (AnonymousClass3XT) null, stringExtra, A152, A0k2, booleanExtra);
                if (A0k2.size() != 1 || (A0k2.get(0) instanceof C177528dw)) {
                    Bvu(A0k2);
                } else {
                    C36391kE.A1A(this, this.A01, C36371kC.A0a(this.A0A, A0k2, 0), C36441kJ.A0j());
                }
            } else {
                Log.w("mystatuses/forward/failed");
                this.A05.A06(R.string.f12nameremoved, 0);
            }
            AnonymousClass0V9 r04 = this.A00;
            if (r04 != null) {
                r04.A05();
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            ArrayList A052 = AnonymousClass3UJ.A05(bundle);
            if (A052 != null) {
                Map map = this.A0x;
                map.clear();
                Iterator it = A052.iterator();
                while (it.hasNext()) {
                    C64933Qa r1 = (C64933Qa) it.next();
                    map.put(r1, this.A0a.A03(r1));
                }
                AnonymousClass0V9 r3 = this.A00;
                if (r3 == null) {
                    r3 = But(this.A0n);
                    this.A00 = r3;
                }
                r3.A0B(this.A0F.A0M().format((long) map.size()));
                this.A00.A06();
                this.A0X.notifyDataSetChanged();
            }
            C64933Qa A032 = AnonymousClass3UJ.A03(bundle, "");
            if (A032 != null) {
                this.A0O = this.A0a.A03(A032);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Map map = this.A0x;
        if (!map.isEmpty()) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator A0z2 = AnonymousClass000.A0z(map);
            while (A0z2.hasNext()) {
                AnonymousClass3T1.A0A(A0I2, A0z2);
            }
            AnonymousClass3UJ.A0A(bundle, A0I2);
        }
        AnonymousClass3T1 r0 = this.A0O;
        if (r0 != null) {
            AnonymousClass3UJ.A08(bundle, r0.A1J);
        }
    }

    public MyStatusesActivity() {
        this(0);
        this.A0x = C36431kI.A1G();
        HashSet A16 = C36441kJ.A16();
        this.A0y = A16;
        Objects.requireNonNull(A16);
        this.A0t = new C1497572q(A16, 47);
        this.A0q = C36341k9.A0H();
        this.A0u = AnonymousClass001.A0J();
        this.A0v = AnonymousClass001.A0J();
        this.A10 = C90394a5.A00(this, 30);
        this.A12 = new AnonymousClass4Z4(this, 0);
        this.A11 = new AnonymousClass4Z5(this, 0);
        this.A13 = new C81173wa((Object) this, 26);
        this.A0w = AnonymousClass001.A0I();
        this.A0m = false;
        this.A0z = new AnonymousClass3MK(this, 8);
        this.A0s = new C48772i1(this, 6);
        this.A0r = new C48772i1(this, 3);
    }
}
