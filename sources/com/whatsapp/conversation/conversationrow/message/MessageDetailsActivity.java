package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass144;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1HX;
import X.AnonymousClass1LI;
import X.AnonymousClass1LU;
import X.AnonymousClass1QO;
import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass2I9;
import X.AnonymousClass2IR;
import X.AnonymousClass2JB;
import X.AnonymousClass2JC;
import X.AnonymousClass2XJ;
import X.AnonymousClass3IC;
import X.AnonymousClass3Q6;
import X.AnonymousClass3QY;
import X.AnonymousClass3T0;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass3UK;
import X.AnonymousClass3XT;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.C177528dw;
import X.C177618e5;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19630wG;
import X.C20310xM;
import X.C21710zg;
import X.C224514j;
import X.C226815j;
import X.C233117z;
import X.C24361Cd;
import X.C24511Cs;
import X.C27111My;
import X.C27731Pn;
import X.C32001cn;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C36781lI;
import X.C37941nS;
import X.C37991nX;
import X.C45682Sh;
import X.C46752bc;
import X.C46812bi;
import X.C61333Bl;
import X.C62683Hc;
import X.C64883Pu;
import X.C64933Qa;
import X.C66013Ui;
import X.C67293Zg;
import X.C80233v4;
import X.C81493x6;
import X.C87434Ou;
import X.C89004Uw;
import X.C89324Wc;
import X.C90104Zc;
import X.C90394a5;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MessageDetailsActivity extends AnonymousClass155 implements C87434Ou {
    public long A00;
    public BaseAdapter A01;
    public ListView A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public C19460v5 A05;
    public C19460v5 A06;
    public C61333Bl A07;
    public AnonymousClass1XY A08;
    public AnonymousClass1LI A09;
    public AnonymousClass1X4 A0A;
    public C24361Cd A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass16I A0D;
    public AnonymousClass171 A0E;
    public AnonymousClass1RY A0F;
    public C27731Pn A0G;
    public AnonymousClass2IR A0H;
    public AnonymousClass1V6 A0I;
    public C19630wG A0J;
    public C20310xM A0K;
    public AnonymousClass16J A0L;
    public AnonymousClass1QO A0M;
    public AnonymousClass1LU A0N;
    public C233117z A0O;
    public AnonymousClass3T1 A0P;
    public AnonymousClass3T0 A0Q;
    public C64883Pu A0R;
    public AnonymousClass1A1 A0S;
    public C62683Hc A0T;
    public boolean A0U;
    public AnonymousClass3QY A0V;
    public final Runnable A0W;
    public final ArrayList A0X;
    public final C32001cn A0Y;
    public final C226815j A0Z;
    public final AnonymousClass191 A0a;
    public final C24511Cs A0b;

    public int A2I() {
        return 154478781;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19460v5 r1 = this.A03;
                if (r1.A05()) {
                    r1.A02();
                    throw AnonymousClass001.A0A("handleAdvertiseForwardClick");
                }
                return;
            }
            ArrayList A0k = C36341k9.A0k(intent);
            boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
            String stringExtra = intent.getStringExtra("appended_message");
            AnonymousClass3XT r6 = null;
            if (AnonymousClass143.A0N(A0k)) {
                C18740tg.A06(intent);
                r6 = this.A0R.A01(intent.getExtras());
            }
            this.A0A.A0H(this.A08, r6, stringExtra, Collections.singletonList(this.A0P), A0k, booleanExtra);
            if (A0k.size() != 1 || (A0k.get(0) instanceof C177528dw)) {
                Bvu(A0k);
                return;
            }
            C36391kE.A1A(this, this.A01, C36371kC.A0a(this.A0C, A0k, 0), C36441kJ.A0j());
        }
    }

    public static void A01(MessageDetailsActivity messageDetailsActivity) {
        C46752bc r3;
        UserJid A0L2;
        AnonymousClass3Q6 r13;
        MessageDetailsActivity messageDetailsActivity2 = messageDetailsActivity;
        ArrayList arrayList = messageDetailsActivity2.A0X;
        arrayList.clear();
        messageDetailsActivity2.A00 = Long.MAX_VALUE;
        ConcurrentHashMap concurrentHashMap = messageDetailsActivity2.A0M.A00(messageDetailsActivity2.A0P).A00;
        if (concurrentHashMap.size() == 0) {
            AnonymousClass3T1 r4 = messageDetailsActivity2.A0P;
            AnonymousClass11F r0 = r4.A1J.A00;
            if (r0 instanceof UserJid) {
                if (!C66013Ui.A0V(messageDetailsActivity2.A02, r4)) {
                    r13 = new AnonymousClass3Q6(0, 0, 0);
                } else {
                    AnonymousClass3T1 r42 = messageDetailsActivity2.A0P;
                    boolean z = r42 instanceof C46812bi;
                    long j = r42.A0I;
                    if (z) {
                        r13 = new AnonymousClass3Q6(j, 0, j);
                    } else {
                        r13 = new AnonymousClass3Q6(j, j, 0);
                    }
                }
                AnonymousClass00C.A0D(r0, 0);
                concurrentHashMap.put(r0, r13);
            }
        }
        AnonymousClass3T1 r43 = messageDetailsActivity2.A0P;
        if (1 == r43.A0E() && (r3 = r43.A1U) != null) {
            if (r3.A1J.A02) {
                A0L2 = C36411kG.A0j(messageDetailsActivity2);
            } else {
                A0L2 = r3.A0L();
            }
            arrayList.add(new AnonymousClass2JB(A0L2, messageDetailsActivity2.A0P.A1U.A02));
        }
        Set entrySet = concurrentHashMap.entrySet();
        AnonymousClass00C.A08(entrySet);
        Iterator it = entrySet.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            AnonymousClass3Q6 r32 = (AnonymousClass3Q6) A11.getValue();
            arrayList.add(new AnonymousClass3IC(r32, (UserJid) A11.getKey()));
            long A012 = r32.A01(5);
            long A013 = r32.A01(13);
            long j2 = r32.A01;
            if (j2 <= 0) {
                j2 = 0;
            }
            if (A012 != 0) {
                messageDetailsActivity2.A00 = Math.min(messageDetailsActivity2.A00, A012);
                i2++;
            }
            if (A013 != 0) {
                messageDetailsActivity2.A00 = Math.min(messageDetailsActivity2.A00, A013);
                i3++;
            }
            if (j2 != 0) {
                messageDetailsActivity2.A00 = Math.min(messageDetailsActivity2.A00, j2);
                i++;
            }
        }
        AnonymousClass11F r1 = messageDetailsActivity2.A0P.A1J.A00;
        if (AnonymousClass143.A0G(r1) || (r1 instanceof C177618e5) || A07(messageDetailsActivity2)) {
            AnonymousClass3T1 r12 = messageDetailsActivity2.A0P;
            if (i < r12.A0B && C66013Ui.A0a(r12)) {
                arrayList.add(new AnonymousClass2JC(messageDetailsActivity2.A0P.A0B - i, 8));
            }
            int i4 = messageDetailsActivity2.A0P.A0B;
            if (i3 < i4) {
                arrayList.add(new AnonymousClass2JC(i4 - i3, 13));
            }
            if (i2 < i4) {
                arrayList.add(new AnonymousClass2JC(i4 - i2, 5));
            }
        }
        Collections.sort(arrayList, new C81493x6(messageDetailsActivity2));
        BaseAdapter baseAdapter = messageDetailsActivity2.A01;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
        ListView listView = messageDetailsActivity2.A02;
        Runnable runnable = messageDetailsActivity2.A0W;
        listView.removeCallbacks(runnable);
        long j3 = messageDetailsActivity2.A00;
        if (j3 != Long.MAX_VALUE) {
            messageDetailsActivity2.A02.postDelayed(runnable, C36401kF.A03(j3));
        }
    }

    public static boolean A07(MessageDetailsActivity messageDetailsActivity) {
        C19460v5 r1 = messageDetailsActivity.A04;
        if (!r1.A05() || !((AnonymousClass1HX) r1.A02()).A06(messageDetailsActivity.A0P)) {
            return false;
        }
        return true;
    }

    public void A2F() {
        if (!this.A0U) {
            this.A0U = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0J = C36351kA.A0W(r2);
            this.A08 = C36411kG.A0Y(r2);
            this.A0A = C36361kB.A0T(r2);
            this.A0G = C36351kA.A0T(r2);
            this.A0C = C36341k9.A0R(r2);
            this.A0M = (AnonymousClass1QO) r2.A7E.get();
            this.A0E = C36341k9.A0S(r2);
            this.A0D = C36351kA.A0S(r2);
            this.A0K = C36371kC.A0Z(r2);
            this.A0S = C36351kA.A0n(r2);
            this.A0L = C36361kB.A0Z(r2);
            this.A0Q = (AnonymousClass3T0) r3.A4L.get();
            C19470v6 r1 = C19470v6.A00;
            this.A05 = r1;
            this.A0B = C36371kC.A0T(r2);
            this.A0N = C36411kG.A0e(r2);
            this.A04 = C36381kD.A0Q(r2.A0y);
            this.A0R = C36381kD.A0h(r3);
            this.A0O = C36371kC.A0c(r2);
            this.A0I = (AnonymousClass1V6) r2.A4v.get();
            this.A06 = r1;
            this.A07 = (C61333Bl) A0L2.A16.get();
            this.A0T = (C62683Hc) r3.A4H.get();
            this.A03 = r1;
            this.A09 = C36361kB.A0S(r2);
        }
    }

    public AnonymousClass1RY getContactPhotosLoader() {
        return this.A0V.A02(this);
    }

    public void onCreate(Bundle bundle) {
        BaseAdapter r1;
        String str;
        A28(9);
        requestWindowFeature(9);
        super.onCreate(bundle);
        A2T("on_create");
        this.A0V = this.A07.A00(getSupportFragmentManager(), AnonymousClass2XJ.A01(this.A04));
        A2T("get_message_key_from_intent");
        C64933Qa A022 = AnonymousClass3UJ.A02(getIntent());
        if (A022 != null) {
            this.A0P = this.A0S.A03(A022);
        }
        A2S("get_message_key_from_intent");
        setTitle(R.string.f12nameremoved);
        getSupportActionBar().A0U(true);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(C36391kE.A05(this));
        supportActionBar.A0K(colorDrawable);
        supportActionBar.A0W(false);
        Intent intent = getIntent();
        if (intent == null) {
            str = "intent_is_null";
        } else {
            this.A0F = this.A0G.A05(this, "message-details-activity");
            if (this.A0P == null) {
                A2T("get_message_creating_message_key");
                this.A0P = this.A0S.A03(new C64933Qa(C36401kF.A0Z(intent, "key_remote_jid"), intent.getStringExtra("key_id"), true));
                A2S("get_message_creating_message_key");
            }
            AnonymousClass3T1 r3 = this.A0P;
            if (r3 == null) {
                str = "message_is_null";
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("MessageDetailsActivity/key: ");
                C36321k7.A1N(r3.A1J, A0u);
                this.A02 = (ListView) findViewById(16908298);
                A2T("refresh_receipts");
                A01(this);
                A2S("refresh_receipts");
                AnonymousClass2IR A032 = this.A0V.A03(this, (C89004Uw) null, this.A0P);
                this.A0H = A032;
                A032.setOnLongClickListener((View.OnLongClickListener) null);
                AnonymousClass2IR r12 = this.A0H;
                r12.A2F = C80233v4.A00(this, 38);
                r12.A2G = C80233v4.A00(this, 39);
                r12.A2M = false;
                ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
                ViewGroup A0P2 = C36411kG.A0P(viewGroup, R.id.conversation_row_center);
                A0P2.addView(this.A0H, -1, -2);
                Point point = new Point();
                C36321k7.A0K(this, point);
                AnonymousClass000.A16(A0P2, -2, 0, View.MeasureSpec.makeMeasureSpec(point.x, 1073741824));
                int i = point.y / 2;
                boolean z = false;
                if (A0P2.getMeasuredHeight() > i) {
                    z = true;
                    C90104Zc.A00(this.A02.getViewTreeObserver(), this, 17);
                }
                this.A02.addHeaderView(viewGroup, (Object) null, false);
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.edge_bottom);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.A02.addHeaderView(imageView, (Object) null, false);
                View view = new View(this);
                view.setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
                this.A02.addFooterView(view, (Object) null, false);
                AnonymousClass11F r4 = this.A0P.A1J.A00;
                if (AnonymousClass143.A0G(r4) || (r4 instanceof C177618e5) || A07(this)) {
                    r1 = new C37991nX(this);
                } else {
                    r1 = new C37941nS(this);
                }
                this.A01 = r1;
                this.A02.setAdapter(r1);
                Drawable A082 = this.A0Q.A08(this.A0Q.A0B(this, r4));
                if (A082 != null) {
                    viewGroup.setBackground(new C36781lI(A082, viewGroup, this));
                } else {
                    viewGroup.setBackgroundResource(C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
                }
                this.A02.setOnScrollListener(new C67293Zg(colorDrawable, A0P2, this, i, z));
                this.A0I.A06();
                this.A0D.registerObserver(this.A0Z);
                this.A0L.registerObserver(this.A0a);
                this.A0B.registerObserver(this.A0Y);
                this.A0O.registerObserver(this.A0b);
                C36441kJ.A0b(this).A00(MessageDetailsViewModel.class);
                A2S("on_create");
                return;
            }
        }
        BPK(str);
        A2S("on_create");
        BPG(3);
        finish();
    }

    public MessageDetailsActivity(int i) {
        this.A0U = false;
        C89324Wc.A00(this, 48);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        A2K.A04 = true;
        A2K.A00((String) null, 8);
        return A2K;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.A02();
        AnonymousClass3QY r1 = this.A0V;
        AnonymousClass1RY r0 = r1.A00;
        if (r0 != null) {
            r0.A02();
        }
        r1.A09.A06();
        r1.A0A.A0A();
        this.A0I.A06();
        this.A0D.unregisterObserver(this.A0Z);
        this.A0L.unregisterObserver(this.A0a);
        this.A0B.unregisterObserver(this.A0Y);
        this.A0O.unregisterObserver(this.A0b);
        this.A02.removeCallbacks(this.A0W);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A0T.A01();
        if (this.A0I.A0B()) {
            this.A0I.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0I.A0B()) {
            this.A0I.A05();
        }
        AnonymousClass2IR r2 = this.A0H;
        if (r2 instanceof AnonymousClass2I9) {
            r2.A0R.A0H(C80233v4.A00(r2, 12));
        }
    }

    public void onStart() {
        super.onStart();
        C45682Sh A2J = A2J();
        AnonymousClass3T1 r1 = this.A0P;
        AnonymousClass11F r0 = r1.A1J.A00;
        int i = r1.A0B;
        if (A2J != null && (r0 instanceof AnonymousClass144) && i > 0) {
            long j = (long) i;
            if (j <= 32) {
                j = 32;
            }
            A2J.A0A = Long.valueOf(j);
            A2J.A03 = Integer.valueOf(AnonymousClass3UK.A00(i));
        }
        Beg();
    }

    public MessageDetailsActivity() {
        this(0);
        this.A0X = AnonymousClass001.A0I();
        this.A0a = C90394a5.A00(this, 12);
        this.A0Z = AnonymousClass4W3.A00(this, 17);
        this.A0Y = new AnonymousClass4W0(this, 8);
        this.A0b = new AnonymousClass4WB(this, 13);
        this.A0W = C80233v4.A00(this, 37);
    }
}
