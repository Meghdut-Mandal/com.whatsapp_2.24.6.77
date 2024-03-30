package com.whatsapp.status;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass0VV;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass14B;
import X.AnonymousClass15K;
import X.AnonymousClass15M;
import X.AnonymousClass16D;
import X.AnonymousClass16E;
import X.AnonymousClass16F;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass18S;
import X.AnonymousClass190;
import X.AnonymousClass191;
import X.AnonymousClass1CR;
import X.AnonymousClass1HT;
import X.AnonymousClass1HU;
import X.AnonymousClass1N6;
import X.AnonymousClass1Q1;
import X.AnonymousClass1Q4;
import X.AnonymousClass1RK;
import X.AnonymousClass1RY;
import X.AnonymousClass1UL;
import X.AnonymousClass1X4;
import X.AnonymousClass2ZJ;
import X.AnonymousClass37S;
import X.AnonymousClass3CA;
import X.AnonymousClass3EG;
import X.AnonymousClass3HN;
import X.AnonymousClass3LQ;
import X.AnonymousClass3MK;
import X.AnonymousClass3P0;
import X.AnonymousClass3P1;
import X.AnonymousClass3UF;
import X.AnonymousClass3US;
import X.AnonymousClass3UW;
import X.AnonymousClass3Y8;
import X.AnonymousClass3ZU;
import X.AnonymousClass4SW;
import X.AnonymousClass4VI;
import X.AnonymousClass4W3;
import X.AnonymousClass4WM;
import X.C001700s;
import X.C012005e;
import X.C022509m;
import X.C022609n;
import X.C022709o;
import X.C17510rX;
import X.C177528dw;
import X.C18740tg;
import X.C18820ts;
import X.C18950u5;
import X.C19420v0;
import X.C19430v1;
import X.C19460v5;
import X.C19630wG;
import X.C19730wQ;
import X.C19760wT;
import X.C19770wU;
import X.C19970wo;
import X.C19980wp;
import X.C20060wx;
import X.C20310xM;
import X.C20350xQ;
import X.C20800yB;
import X.C20810yC;
import X.C20830yE;
import X.C21000yV;
import X.C21010yW;
import X.C21060yb;
import X.C21100yf;
import X.C21690ze;
import X.C219612i;
import X.C222013h;
import X.C224514j;
import X.C225014r;
import X.C226015b;
import X.C226515g;
import X.C226715i;
import X.C226815j;
import X.C229216m;
import X.C24341Cb;
import X.C24371Ce;
import X.C24801Dv;
import X.C27731Pn;
import X.C28781Ua;
import X.C29561Xc;
import X.C29731Xt;
import X.C31921ce;
import X.C31941cg;
import X.C32221dB;
import X.C32311dK;
import X.C32321dL;
import X.C32341dO;
import X.C32371dR;
import X.C32601dt;
import X.C32671e0;
import X.C33551fY;
import X.C34341gs;
import X.C34901hp;
import X.C35011i0;
import X.C35491im;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C37351mE;
import X.C38011nZ;
import X.C45722Sl;
import X.C48762i0;
import X.C49092iY;
import X.C50292kW;
import X.C51042n8;
import X.C51662oB;
import X.C54512t4;
import X.C58432zr;
import X.C60973Ab;
import X.C61103Ao;
import X.C62213Ff;
import X.C63023Il;
import X.C63623Kt;
import X.C65553Sn;
import X.C65663Sz;
import X.C65963Ud;
import X.C66133Uu;
import X.C67573a8;
import X.C77923rH;
import X.C79833uM;
import X.C79993uc;
import X.C81173wa;
import X.C88124Rm;
import X.C88134Rn;
import X.C89764Xu;
import X.C90394a5;
import X.C90414a7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
public class StatusesFragment extends Hilt_StatusesFragment implements AnonymousClass012, C31921ce, AnonymousClass1RK, AnonymousClass15K, C31941cg, C022509m, C022609n, C022709o, C17510rX {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public C19460v5 A05;
    public C19460v5 A06;
    public C19460v5 A07;
    public C19460v5 A08;
    public AnonymousClass18S A09;
    public C24801Dv A0A;
    public AnonymousClass3CA A0B;
    public C58432zr A0C;
    public AnonymousClass17Y A0D;
    public C19730wQ A0E;
    public C21100yf A0F;
    public C32601dt A0G;
    public AnonymousClass1X4 A0H;
    public WfalManager A0I;
    public AnonymousClass1Q4 A0J;
    public C229216m A0K;
    public AnonymousClass16D A0L;
    public AnonymousClass16I A0M;
    public AnonymousClass171 A0N;
    public AnonymousClass1RY A0O;
    public C27731Pn A0P;
    public C32671e0 A0Q;
    public C19980wp A0R;
    public C24341Cb A0S;
    public C21060yb A0T;
    public C19760wT A0U;
    public C19970wo A0V;
    public C19630wG A0W;
    public C20830yE A0X;
    public C19420v0 A0Y;
    public C18820ts A0Z;
    public C20060wx A0a;
    public C20310xM A0b;
    public AnonymousClass16J A0c;
    public AnonymousClass1HT A0d;
    public AnonymousClass16F A0e;
    public AnonymousClass16E A0f;
    public C20810yC A0g;
    public C21010yW A0h;
    public C62213Ff A0i;
    public C20350xQ A0j;
    public AnonymousClass1CR A0k;
    public AnonymousClass3ZU A0l;
    public AnonymousClass1Q1 A0m;
    public C24371Ce A0n;
    public C38011nZ A0o;
    public C34341gs A0p;
    public AnonymousClass37S A0q;
    public C32311dK A0r;
    public AnonymousClass1HU A0s;
    public C32321dL A0t;
    public AnonymousClass3P1 A0u;
    public C32371dR A0v;
    public C32341dO A0w;
    public AnonymousClass3P0 A0x = new AnonymousClass3P0();
    public C29561Xc A0y;
    public C32221dB A0z;
    public C29731Xt A10;
    public C65553Sn A11;
    public AnonymousClass3EG A12;
    public C34901hp A13;
    public C49092iY A14;
    public AnonymousClass1N6 A15;
    public AnonymousClass13J A16;
    public C19770wU A17;
    public AnonymousClass2ZJ A18;
    public AnonymousClass1UL A19;
    public C28781Ua A1A;
    public AnonymousClass005 A1B;
    public AnonymousClass005 A1C;
    public AnonymousClass005 A1D;
    public CharSequence A1E;
    public List A1F;
    public List A1G = AnonymousClass001.A0I();
    public List A1H = AnonymousClass001.A0I();
    public boolean A1I;
    public boolean A1J = true;
    public boolean A1K;
    public boolean A1L = false;
    public boolean A1M;
    public View A1N;
    public StatusExpirationLifecycleOwner A1O;
    public C50292kW A1P;
    public final List A1Q = AnonymousClass001.A0I();
    public final List A1R = AnonymousClass001.A0I();
    public final List A1S = AnonymousClass001.A0I();
    public final List A1T = AnonymousClass001.A0I();
    public final Set A1U = C36441kJ.A16();
    public final C226815j A1V = AnonymousClass4W3.A00(this, 36);
    public final C226515g A1W = new AnonymousClass3MK(this, 6);
    public final AnonymousClass191 A1X = C90394a5.A00(this, 29);
    public final C88124Rm A1Y = new C90414a7(this, 0);
    public final AnonymousClass4SW A1Z = new C79833uM(this);
    public final AnonymousClass3HN A1a = new C51042n8(this);
    public final Runnable A1b = new C81173wa(this, 16);

    public void A1a() {
        C36331k8.A1E(this.A1P);
        AnonymousClass16E r5 = this.A0f;
        C28781Ua r10 = this.A1A;
        AnonymousClass1CR r7 = this.A0k;
        WfalManager wfalManager = this.A0I;
        AnonymousClass1HT r3 = this.A0d;
        C29731Xt r8 = this.A10;
        C50292kW r1 = new C50292kW(wfalManager, r3, this.A0e, r5, this.A0i, r7, r8, this, r10, this.A1B, this.A1D);
        this.A1P = r1;
        C36331k8.A1F(r1, this.A17);
    }

    public /* synthetic */ void B0Y(C226715i r2) {
        AnonymousClass00C.A0D(r2, 1);
        r2.BQx();
    }

    public String BCV() {
        return "status_fragment";
    }

    public String BDn() {
        return null;
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        View findViewById = A0i().findViewById(R.id.pager_holder);
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(A0i().findViewById(R.id.fab));
        A0I2.add(A0i().findViewById(R.id.fab_second));
        AnonymousClass3ZU r2 = new AnonymousClass3ZU(findViewById, (AnonymousClass012) this, this.A0T, (List) A0I2, i, i2, z);
        this.A0l = r2;
        r2.A05(new C81173wa(this, 14));
        return this.A0l;
    }

    public int BIA() {
        return 300;
    }

    public String BIO() {
        return null;
    }

    public void BVg(DialogFragment dialogFragment, boolean z) {
    }

    public /* synthetic */ void BYN() {
    }

    public void Bhb(AnonymousClass3P0 r9) {
        this.A1P = null;
        this.A0x = r9;
        C29731Xt r0 = this.A10;
        Map map = r9.A04;
        Map map2 = r0.A0D;
        map2.clear();
        map2.putAll(map);
        if (r9.A01.size() == 0) {
            this.A1J = true;
        }
        C38011nZ.A00(this);
        long j = 0;
        int i = 0;
        Iterator it = this.A0x.A02.iterator();
        while (it.hasNext()) {
            C65663Sz A0h2 = C36441kJ.A0h(it);
            i++;
            if (A0h2.A04() > j) {
                j = A0h2.A04();
            }
        }
        AnonymousClass01I A0h3 = A0h();
        if (A0h3 instanceof AnonymousClass15M) {
            ((AnonymousClass15M) A0h3).Bx1(j, i);
        }
        C29731Xt r2 = this.A10;
        C61103Ao r1 = r2.A00;
        if (r1 != null && !r1.A04 && r1.A07) {
            r2.A0B(r9.A05, this.A0x.A02.size());
        }
        A09(this);
        A0C(this);
        this.A1O.A00();
        C36331k8.A1E(this.A14);
        C49092iY r12 = new C49092iY(this.A0d, this);
        this.A14 = r12;
        C36331k8.A1F(r12, this.A17);
    }

    public boolean BvL() {
        return true;
    }

    public static String A03(StatusesFragment statusesFragment) {
        AnonymousClass3P0 r0 = statusesFragment.A0x;
        if (r0 == null || r0.A05.isEmpty()) {
            return null;
        }
        return AnonymousClass14B.A08(",", (String[]) statusesFragment.A0x.A05.keySet().toArray(new String[0]));
    }

    private void A05() {
        if (this.A1L) {
            this.A10.A09(C36371kC.A0m());
            if (this.A1P == null) {
                this.A10.A0B(this.A0x.A05, this.A0x.A02.size());
                this.A10.A06(new C45722Sl(), this.A0x, false, false);
            }
        }
    }

    private void A06() {
        if (!this.A0E.A0L() || (C36371kC.A1U(C19980wp.A00(this.A0R), "post_status_in_companion") && this.A0g.A0E(4905))) {
            this.A10.A04();
            A1C(AnonymousClass190.A10(A0a(), C36371kC.A0p()));
            return;
        }
        AnonymousClass3LQ.A01(new StatusCompanionModeUnavailableDialogFragment(), this);
    }

    public static void A08(ListView listView, StatusesFragment statusesFragment) {
        if (statusesFragment.A1N == null) {
            statusesFragment.A1N = new Space(statusesFragment.A1D());
            boolean A012 = C20800yB.A01(C21000yV.A01, statusesFragment.A0g, 3289);
            Resources A0G2 = C36341k9.A0G(statusesFragment);
            int i = R.dimen.f7nameremoved;
            if (A012) {
                i = R.dimen.f7nameremoved;
            }
            statusesFragment.A1N.setLayoutParams(new AbsListView.LayoutParams(-1, A0G2.getDimensionPixelSize(i)));
        }
        listView.removeHeaderView(statusesFragment.A1N);
        listView.addHeaderView(statusesFragment.A1N);
    }

    public static void A09(StatusesFragment statusesFragment) {
        int i;
        int i2;
        View view = statusesFragment.A0F;
        if (view != null) {
            if (statusesFragment.A0x.A00()) {
                if (statusesFragment.A1P != null) {
                    C36341k9.A10(view, R.id.init_statuses_progress, 0);
                    C36341k9.A10(view, R.id.search_no_matches, 8);
                } else if (statusesFragment.A0L.A0p()) {
                    C36341k9.A10(view, R.id.init_statuses_progress, 8);
                    C36341k9.A10(view, R.id.search_no_matches, 8);
                    C36341k9.A10(view, R.id.welcome_statuses_message, 0);
                    C36341k9.A10(view, R.id.statuses_empty_no_contacts, 8);
                    C36341k9.A10(view, R.id.contacts_empty_permission_denied, 8);
                    TextView A0P2 = C36391kE.A0P(view, R.id.welcome_statuses_message);
                    Context context = A0P2.getContext();
                    String A0n2 = statusesFragment.A0n(R.string.f12nameremoved);
                    A0P2.setText(C37351mE.A01(A0P2.getPaint(), AnonymousClass3UF.A04(context, C36381kD.A0H(context, R.drawable.ic_new_status_tip), R.color.f6nameremoved), A0n2, "%s"));
                    return;
                } else {
                    if (statusesFragment.A0K.A00()) {
                        ViewGroup A0O2 = C36411kG.A0O(view, R.id.statuses_empty_no_contacts);
                        if (A0O2.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(statusesFragment.A1D());
                            A0O2.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new AnonymousClass3Y8(statusesFragment, 47));
                        }
                        A0O2.setVisibility(0);
                        i2 = R.id.contacts_empty_permission_denied;
                    } else {
                        ViewGroup A0P3 = C36411kG.A0P(view, R.id.contacts_empty_permission_denied);
                        if (A0P3.getChildCount() == 0) {
                            C36381kD.A0J(statusesFragment).inflate(R.layout.f9nameremoved, A0P3, true);
                            C48762i0.A00(A0P3.findViewById(R.id.button_open_permission_settings), statusesFragment, 48);
                        }
                        A0P3.setVisibility(0);
                        i2 = R.id.statuses_empty_no_contacts;
                    }
                    C36341k9.A10(view, i2, 8);
                    C36341k9.A10(view, R.id.init_statuses_progress, 8);
                    C36341k9.A10(view, R.id.search_no_matches, 8);
                    i = R.id.welcome_statuses_message;
                    C36341k9.A10(view, i, 8);
                }
            } else if (!TextUtils.isEmpty(statusesFragment.A1E)) {
                C36341k9.A10(view, R.id.init_statuses_progress, 8);
                C36341k9.A10(view, R.id.search_no_matches, 0);
                C36381kD.A1E(C36391kE.A0P(view, R.id.search_no_matches), statusesFragment, new Object[]{statusesFragment.A1E}, R.string.f12nameremoved);
            } else {
                return;
            }
            C36341k9.A10(view, R.id.welcome_statuses_message, 8);
            C36341k9.A10(view, R.id.statuses_empty_no_contacts, 8);
            i = R.id.contacts_empty_permission_denied;
            C36341k9.A10(view, i, 8);
        }
    }

    public static void A0A(StatusesFragment statusesFragment) {
        List<Uri> list = statusesFragment.A1T;
        for (Uri revokeUriPermission : list) {
            statusesFragment.A0W.A00.revokeUriPermission(revokeUriPermission, 1);
        }
        list.clear();
    }

    public static void A0B(StatusesFragment statusesFragment) {
        if (!statusesFragment.A0E.A0L() || (C36371kC.A1U(C19980wp.A00(statusesFragment.A0R), "post_status_in_companion") && statusesFragment.A0g.A0E(4905))) {
            statusesFragment.A10.A03();
            C20830yE r2 = statusesFragment.A0X;
            AnonymousClass3US r1 = RequestPermissionActivity.A0B;
            AnonymousClass00C.A0D(r2, 1);
            Intent A0B2 = r1.A0B(statusesFragment.A0a(), r2, 33);
            if (A0B2 == null) {
                AnonymousClass1Q4 r3 = statusesFragment.A0J;
                AnonymousClass01I A0h2 = statusesFragment.A0h();
                C18740tg.A06(A0h2);
                if (r3.A00(A0h2, (C225014r) A0h2, statusesFragment.A1W, 33)) {
                    if (statusesFragment.A02 != null) {
                        statusesFragment.A0Y.A11();
                        statusesFragment.A02.setVisibility(8);
                    }
                    statusesFragment.A1C(AnonymousClass190.A18(statusesFragment.A1D(), C177528dw.A00.getRawString(), 4, 32, 9));
                    return;
                }
                return;
            }
            statusesFragment.startActivityForResult(A0B2, 33);
            return;
        }
        AnonymousClass3LQ.A01(new StatusCompanionModeUnavailableDialogFragment(), statusesFragment);
    }

    public static void A0C(StatusesFragment statusesFragment) {
        Long l;
        AnonymousClass17Y r0 = statusesFragment.A0D;
        Runnable runnable = statusesFragment.A1b;
        r0.A0G(runnable);
        if (!statusesFragment.A0x.A00() && statusesFragment.A0h() != null) {
            AnonymousClass3P0 r3 = statusesFragment.A0x;
            Iterator it = r3.A02.iterator();
            Long l2 = null;
            if (it.hasNext()) {
                l2 = C65663Sz.A00(it);
                while (it.hasNext()) {
                    Long A002 = C65663Sz.A00(it);
                    if (l2.compareTo(A002) < 0) {
                        l2 = A002;
                    }
                }
            }
            long j = 0;
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue < 0) {
                    longValue = 0;
                }
                j = longValue;
            }
            Iterator it2 = r3.A03.iterator();
            if (it2.hasNext()) {
                Long A003 = C65663Sz.A00(it2);
                while (it2.hasNext()) {
                    Long A004 = C65663Sz.A00(it2);
                    if (A003.compareTo(A004) < 0) {
                        A003 = A004;
                    }
                }
                if (A003 != null) {
                    long longValue2 = A003.longValue();
                    if (longValue2 < j) {
                        longValue2 = j;
                    }
                    j = longValue2;
                }
            }
            Iterator it3 = r3.A01.iterator();
            if (it3.hasNext()) {
                Long A005 = C65663Sz.A00(it3);
                loop2:
                while (true) {
                    l = A005;
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop2;
                        }
                        A005 = C65663Sz.A00(it3);
                        if (l.compareTo(A005) < 0) {
                        }
                    }
                }
                if (l != null) {
                    long longValue3 = l.longValue();
                    if (longValue3 < j) {
                        longValue3 = j;
                    }
                    j = longValue3;
                }
            }
            C65663Sz r02 = r3.A00;
            if (r02 != null) {
                long A052 = r02.A05();
                if (A052 < j) {
                    A052 = j;
                }
                j = A052;
            }
            statusesFragment.A0D.A0I(runnable, C36401kF.A03(j));
        }
    }

    public void A1B() {
        Log.i("statusesFragment/onStop");
        super.A1B();
        this.A0m.A02(this);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C32221dB r1 = this.A0z;
        r1.A01.A09("StatusesFragment_onCreateView");
        r1.A02.A09.markerPoint(453128091, 1, "CREATE_VIEW_START");
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        ObservableListView observableListView = (ObservableListView) C012005e.A02(inflate, 16908298);
        C32221dB r12 = this.A0z;
        AnonymousClass00C.A0D(observableListView, 0);
        observableListView.A09.A02(r12);
        observableListView.A08.A02(r12);
        C33551fY.A00(inflate, this);
        C32221dB r13 = this.A0z;
        r13.A01.A08("StatusesFragment_onCreateView");
        r13.A02.A09.markerPoint(453128091, 1, "CREATE_VIEW_END");
        return inflate;
    }

    public void A1H() {
        Object value;
        Log.i("statusesFragment/onDestroy");
        super.A1H();
        this.A13.A04();
        AnonymousClass3P1 r2 = this.A0u;
        if (!r2.A05.A00() && (value = r2.A06.getValue()) != null) {
            r2.A02.A01.unregisterObserver(value);
        }
        C35011i0 r3 = (C35011i0) this.A1C.get();
        C63623Kt r22 = (C63623Kt) r3.A07.get();
        r22.A00 = null;
        r22.A03 = false;
        r22.A07.unregisterObserver(r22.A05);
        ((C60973Ab) r3.A08.get()).A01 = null;
        this.A0O.A02();
        this.A0M.unregisterObserver(this.A1V);
        this.A0c.unregisterObserver(this.A1X);
        this.A0n.unregisterObserver(this.A1Y);
        this.A19.unregisterObserver(this.A1a);
        this.A18.unregisterObserver(this.A1Z);
        this.A0D.A0G(this.A1b);
        C36331k8.A1E(this.A1P);
        C36331k8.A1E(this.A14);
        A0A(this);
    }

    public void A1K() {
        Log.i("statusesFragment/onPause");
        this.A0w.A05.A07(this);
        AnonymousClass3ZU r0 = this.A0l;
        if (r0 != null) {
            r0.A01();
        }
        super.A1K();
    }

    public void A1L() {
        this.A0z.A01.A09("StatusesFragment_onResume");
        Log.i("statusesFragment/onResume");
        super.A1L();
        C65963Ud.A00(this, this.A0w.A05, 22);
        this.A0Q.A01(this);
        this.A0z.A01.A08("StatusesFragment_onResume");
    }

    public void A1M() {
        Log.i("statusesFragment/onStart");
        super.A1M();
        if (this.A09.A00) {
            A05();
        }
        this.A0m.A01(this);
        ((C63623Kt) ((C35011i0) this.A1C.get()).A07.get()).A01();
        A0C(this);
    }

    public void A1N(int i, int i2, Intent intent) {
        C61103Ao r0;
        if (i != 33) {
            if (i == 35) {
                if (this.A1I) {
                    AnonymousClass3P1 r2 = this.A0u;
                    r2.A02.A03();
                    r2.A01().A02 = true;
                    r2.A01().A03 = false;
                    AnonymousClass3P1.A00(r2);
                }
                this.A10.A05();
                if (this.A1I) {
                    this.A0w.A01(intent);
                }
            } else if (i != 151) {
            } else {
                if (i2 == -1) {
                    A0E(this, this.A0u.A02.A02(), this.A1I);
                } else if (i2 == 0 && (r0 = this.A10.A00) != null) {
                    r0.A01 = 4;
                }
            }
        } else if (i2 == -1) {
            A0B(this);
        }
    }

    public void A1P(Bundle bundle) {
        boolean z;
        String str;
        Log.i("statusesFragment/onActivityCreated");
        this.A0z.A02.A09.markerPoint(453128091, 1, "CREATE_ACTIVITY_START");
        this.A0Y = true;
        A10(true);
        ListFragment.A00(this);
        ListView listView = this.A05;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new AnonymousClass4WM(this.A0V, this, 1));
        listView.setOnItemLongClickListener(new C89764Xu(this, 2));
        if (!C36341k9.A0E(this.A0Y).getBoolean("show_statuses_education", true) || this.A0E.A0L()) {
            A08(listView, this);
        } else {
            C219612i r9 = this.A0f.A04;
            C001700s A0S2 = C36431kI.A0S();
            synchronized (r9.A01) {
                Map map = r9.A02;
                if (map.containsKey("status_distribution")) {
                    str = C36431kI.A1A("status_distribution", map);
                    z = true;
                } else {
                    z = false;
                    str = null;
                }
            }
            if (z) {
                A0S2.A0C(str);
            } else {
                r9.A00.Boy(new C35491im(A0S2, r9));
            }
            AnonymousClass3UW.A00(A0m(), AnonymousClass0VV.A00(C67573a8.A00, A0S2), listView, this, 33);
        }
        C36341k9.A10(A0d(), R.id.init_statuses_progress, 0);
        C38011nZ r0 = new C38011nZ(this);
        this.A0o = r0;
        A1Y(r0);
        this.A0M.registerObserver(this.A1V);
        this.A0c.registerObserver(this.A1X);
        this.A0n.registerObserver(this.A1Y);
        this.A19.registerObserver(this.A1a);
        this.A18.registerObserver(this.A1Z);
        C63623Kt r1 = (C63623Kt) ((C35011i0) this.A1C.get()).A07.get();
        if (r1.A01 == null) {
            r1.A01 = new C63023Il(false, false);
        }
        if (r1.A02 == null) {
            r1.A02 = new C63023Il(false, false);
        }
        A1a();
        C21690ze r2 = this.A0z.A02.A09;
        r2.markerPoint(453128091, 1, "CREATE_ACTIVITY_END");
        r2.markerEnd(453128091, 1, 2);
    }

    public void A1Q(Bundle bundle) {
        Object value;
        Log.i("statusesFragment/onCreate");
        this.A0z.A00();
        this.A0O = this.A0P.A05(A1D(), "status-fragment");
        this.A13.A03();
        super.A1Q(bundle);
        AnonymousClass17Y r5 = this.A0D;
        C19770wU r8 = this.A17;
        this.A1O = new StatusExpirationLifecycleOwner(this, r5, this.A0d, this.A0f, r8);
        ArrayList A0I2 = AnonymousClass001.A0I();
        A0I2.add(A0i().findViewById(R.id.fab));
        A0I2.add(A0i().findViewById(R.id.fab_second));
        boolean z = true;
        View view = (View) A0I2.get(1);
        if (view != null && (view instanceof ImageView)) {
            if (C20800yB.A01(C21000yV.A01, this.A0g, 1874)) {
                this.A0p = new C34341gs((ImageView) view, this.A0D, this.A0U, this.A0Y, this.A17);
            }
        }
        this.A1M = true;
        if (bundle == null || !bundle.getBoolean("SHARE_CTA_VISIBILITY_SI_KEY", false)) {
            z = false;
        }
        AnonymousClass3P1 A002 = this.A0B.A00(C51662oB.STATUS_FRAGMENT, z);
        this.A0u = A002;
        if (!A002.A05.A00() && (value = A002.A06.getValue()) != null) {
            A002.A02.A01.registerObserver(value);
        }
        if (bundle != null) {
            this.A1I = bundle.getBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", false);
        }
        if (this.A1A.A00()) {
            ((C60973Ab) ((C35011i0) this.A1C.get()).A08.get()).A01 = new C79993uc(this);
        }
    }

    public void A1R(Bundle bundle) {
        bundle.putBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", this.A1I);
        bundle.putBoolean("SHARE_CTA_VISIBILITY_SI_KEY", this.A0u.A01.A03);
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        if (!this.A0E.A0L()) {
            menu.add(2, R.id.menuitem_status_privacy, 0, R.string.f12nameremoved).setIcon(C54512t4.A00(this, R.drawable.privacy_checkup_lock_person));
        }
    }

    public void B1H(C226015b r2) {
        this.A1E = r2.A02;
        C38011nZ.A00(this);
    }

    public AnonymousClass01P BAc() {
        return this.A0P.A02;
    }

    public void Bs8(boolean z) {
        this.A1K = z;
        C38011nZ.A00(this);
    }

    public void Bs9(boolean z) {
        this.A1L = z;
        if (z) {
            C19420v0 r1 = this.A0Y;
            C36341k9.A0w(C19420v0.A00(r1), "status_tab_last_opened_time", C19970wo.A00(this.A0V));
            this.A15.A02((AnonymousClass11F) null, 17);
            A05();
            if (this.A0g.A0E(249)) {
                this.A17.Boy(new C81173wa(this, 13));
            }
            C34341gs r0 = this.A0p;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        AnonymousClass3P1 r2 = this.A0u;
        if (r2.A01().A03) {
            r2.A02.A03();
            C61103Ao r02 = r2.A04.A00;
            if (r02 != null) {
                r02.A00 = 1;
            }
            r2.A01().A02 = false;
            r2.A01().A03 = false;
            AnonymousClass3P1.A00(r2);
        }
        this.A10.A05();
        if (this.A1M) {
            this.A1J = true;
            C38011nZ.A00(this);
        }
        this.A17.Boy(new C81173wa(this, 15));
        if (this.A1A.A00()) {
            C63623Kt r22 = (C63623Kt) ((C35011i0) this.A1C.get()).A07.get();
            r22.A08.A03("EXIT_STATUS_VIEW");
            r22.A09.A03("EXIT_STATUS_VIEW");
            r22.A06.A01();
        }
    }

    public static void A07(Animator.AnimatorListener animatorListener, StatusesFragment statusesFragment, boolean z) {
        View view;
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (int i = 0; i < statusesFragment.A0o.getCount(); i++) {
            if (statusesFragment.A0o.getItemViewType(i) == 0) {
                C77923rH r4 = (C77923rH) ((C88134Rn) statusesFragment.A0o.A03.A1G.get(i));
                AnonymousClass1CR r2 = statusesFragment.A0k;
                C65663Sz r1 = r4.A01;
                if (r2.A0l(r1.A09) && !r1.A0B() && (view = r4.A00) != null) {
                    if (z) {
                        view.measure(0, 0);
                    }
                    int measuredHeight = view.getMeasuredHeight();
                    int[] A1O2 = C36441kJ.A1O();
                    if (z) {
                        A1O2[0] = 0;
                        A1O2[1] = measuredHeight;
                    } else {
                        A1O2[0] = measuredHeight;
                        A1O2[1] = 0;
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1O2);
                    ofInt.addListener(new AnonymousClass4VI(view, measuredHeight, 2));
                    ofInt.addUpdateListener(new C66133Uu(view, z));
                    A0I2.add(ofInt);
                }
            }
        }
        AnimatorSet A0C2 = C36441kJ.A0C();
        statusesFragment.A00 = A0C2;
        C36391kE.A13(A0C2);
        statusesFragment.A00.setDuration(250);
        statusesFragment.A00.addListener(animatorListener);
        statusesFragment.A00.playTogether(A0I2);
        statusesFragment.A00.start();
    }

    public static void A0D(StatusesFragment statusesFragment, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            statusesFragment.A12.A00(statusesFragment.A0d.A02(C36441kJ.A0h(it).A09));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = statusesFragment.A0d.A03(C36441kJ.A0h(it2).A09).iterator();
            while (it3.hasNext()) {
                statusesFragment.A12.A00(C36391kE.A0l(it3));
            }
        }
    }

    public static void A0E(StatusesFragment statusesFragment, List list, boolean z) {
        boolean A042;
        C61103Ao r0;
        AnonymousClass01I A0h2 = statusesFragment.A0h();
        if (A0h2 != null) {
            statusesFragment.A1I = z;
            C32341dO r1 = statusesFragment.A0w;
            if (z) {
                A042 = r1.A03(A0h2, statusesFragment, "status_fragment", list);
            } else {
                A042 = r1.A04(A0h2, statusesFragment, "status_fragment", list);
            }
            if (!A042 && !statusesFragment.A0w.A02.A0D() && (r0 = statusesFragment.A10.A00) != null) {
                r0.A01 = 4;
            }
        }
    }

    public void A1S(Bundle bundle, View view) {
        ListFragment.A00(this);
        boolean A0E2 = this.A0g.A0E(7724);
        C32671e0 r2 = this.A0Q;
        ListFragment.A00(this);
        ListView listView = this.A05;
        int i = R.layout.f9nameremoved;
        if (A0E2) {
            i = R.layout.f9nameremoved;
        }
        r2.A00(listView, this, i);
        C33551fY.A01(view, this, C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public void A1V(boolean z) {
        super.A1V(z);
        if (this.A08 >= 7 && z) {
            this.A0Q.A01(this);
        }
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_status) {
            A0B(this);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            A1C(AnonymousClass190.A0E(A1D()));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_text_status) {
            A06();
            return true;
        } else if (!this.A05.A05()) {
            return false;
        } else {
            menuItem.getItemId();
            this.A07.A02();
            throw AnonymousClass001.A0A("getMenuItemBusinessToolsId");
        }
    }

    public /* synthetic */ boolean B0r() {
        return false;
    }

    public /* synthetic */ boolean B7g() {
        return false;
    }

    public String BDl() {
        return A0n(R.string.f12nameremoved);
    }

    public Drawable BDm() {
        Context A0a2 = A0a();
        boolean z = C222013h.A07;
        int i = R.drawable.ic_camera;
        if (z) {
            i = R.drawable.ic_camera_filled_wds;
        }
        return AnonymousClass3UF.A02(A0a2, i, R.color.f6nameremoved);
    }

    public C18950u5 BGv() {
        return C19430v1.A01;
    }

    public String BH5() {
        return A0n(R.string.f12nameremoved);
    }

    public Drawable BH6() {
        Context A0a2 = A0a();
        boolean z = C222013h.A07;
        int i = R.drawable.ic_text_status_compose;
        if (z) {
            i = R.drawable.ic_text_status_compose_filled_wds;
        }
        return AnonymousClass3UF.A02(A0a2, i, C224514j.A00(A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public /* synthetic */ boolean BYO() {
        return false;
    }

    public void Bg1() {
        A06();
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public /* synthetic */ void BaQ(int i, int i2) {
        A0B(this);
    }
}
