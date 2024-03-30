package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17Z;
import X.AnonymousClass190;
import X.AnonymousClass1HJ;
import X.AnonymousClass1LI;
import X.AnonymousClass1MK;
import X.AnonymousClass1N6;
import X.AnonymousClass1ND;
import X.AnonymousClass1PW;
import X.AnonymousClass1RY;
import X.AnonymousClass3TF;
import X.AnonymousClass3U5;
import X.AnonymousClass3UD;
import X.AnonymousClass3UE;
import X.AnonymousClass3UF;
import X.AnonymousClass3UY;
import X.AnonymousClass3YB;
import X.AnonymousClass3Z4;
import X.AnonymousClass4W3;
import X.C107255Nf;
import X.C107265Nh;
import X.C130806Mm;
import X.C132636Up;
import X.C135006by;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C226815j;
import X.C27731Pn;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C41011wT;
import X.C61243Bc;
import X.C63083Ir;
import X.C65473Sf;
import X.C81433x0;
import X.C88514Sz;
import X.C89314Wb;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.views.MultiContactThumbnail;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GroupCallLogActivity extends AnonymousClass155 {
    public AnonymousClass1LI A00;
    public C33771fu A01;
    public C41011wT A02;
    public AnonymousClass1ND A03;
    public AnonymousClass1PW A04;
    public C130806Mm A05;
    public AnonymousClass1MK A06;
    public AnonymousClass16D A07;
    public AnonymousClass16I A08;
    public AnonymousClass171 A09;
    public AnonymousClass1RY A0A;
    public AnonymousClass1RY A0B;
    public C27731Pn A0C;
    public AnonymousClass17Z A0D;
    public AnonymousClass1HJ A0E;
    public AnonymousClass1N6 A0F;
    public AnonymousClass13J A0G;
    public C107265Nh A0H;
    public boolean A0I;
    public final C88514Sz A0J;
    public final C226815j A0K;

    public void A2F() {
        if (!this.A0I) {
            this.A0I = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A01 = C36351kA.A0P(A0B2);
            this.A03 = C36391kE.A0Y(A0B2);
            this.A0C = C36351kA.A0T(A0B2);
            this.A06 = C36381kD.A0W(A0B2);
            this.A09 = C36341k9.A0S(A0B2);
            this.A07 = C36341k9.A0R(A0B2);
            this.A0G = C36351kA.A0q(A0B2);
            this.A08 = C36351kA.A0S(A0B2);
            this.A0E = (AnonymousClass1HJ) A0B2.A1O.get();
            this.A04 = (AnonymousClass1PW) A0B2.A74.get();
            this.A05 = C18830tt.A2o(r2);
            this.A0D = C36411kG.A0c(A0B2);
            this.A0F = C36361kB.A0e(A0B2);
            this.A00 = C36361kB.A0S(A0B2);
        }
    }

    public void A2X() {
        this.A0F.A03((AnonymousClass11F) null, 15);
        super.A2X();
    }

    public GroupCallLogActivity(int i) {
        this.A0I = false;
        C89314Wb.A00(this, 36);
    }

    public /* synthetic */ boolean A3i(String str, boolean z) {
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        String A0v = C36391kE.A0v(this, AnonymousClass3UD.A05(str, z), new Object[1], 0, i);
        if (Build.VERSION.SDK_INT < 22) {
            C130806Mm r2 = this.A05;
            r2.A00.Bly(AnonymousClass3UD.A02((String) null, 2, 2, z));
        }
        startActivity(AnonymousClass3UD.A00(this, A0v, getString(R.string.f12nameremoved), 2, z));
        return true;
    }

    public void onCreate(Bundle bundle) {
        C107265Nh r0;
        int i;
        CharSequence charSequence;
        int i2;
        super.onCreate(bundle);
        boolean A1X = C36341k9.A1X(this);
        setTitle(R.string.f12nameremoved);
        C135006by r02 = (C135006by) C36431kI.A0F(this, R.layout.f9nameremoved).getParcelableExtra("call_log_key");
        if (r02 != null) {
            r0 = AnonymousClass1HJ.A00(this.A0E, new C135006by(r02.A00, r02.A01, r02.A02, r02.A03));
        } else {
            r0 = null;
        }
        this.A0H = r0;
        if (r0 == null) {
            Log.i("call log missing");
            finish();
            return;
        }
        this.A0B = this.A0C.A05(this, "group-call-log-activity");
        this.A0A = this.A0C.A06("group-call-log-multi-contact", 0.0f, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.participants_list);
        C36351kA.A1F(recyclerView, A1X ? 1 : 0);
        C107255Nf r9 = null;
        C41011wT r03 = new C41011wT(this);
        this.A02 = r03;
        recyclerView.setAdapter(r03);
        ArrayList A0C2 = this.A0H.A0C();
        UserJid userJid = this.A0H.A04.A01;
        Iterator it = A0C2.iterator();
        C107255Nf r4 = null;
        while (it.hasNext()) {
            C107255Nf r2 = (C107255Nf) it.next();
            UserJid userJid2 = r2.A00;
            if (userJid2.equals(userJid)) {
                r4 = r2;
            } else if (C36431kI.A1V(this, userJid2)) {
                r9 = r2;
            }
        }
        if (r9 != null) {
            A0C2.remove(r9);
        }
        if (r4 != null) {
            A0C2.remove(r4);
            A0C2.add(0, r4);
        }
        Collections.sort(A0C2.subList(A1X ^ this.A0H.A04.A03 ? 1 : 0, A0C2.size()), new C81433x0(this.A07, this.A09));
        C41011wT r1 = this.A02;
        r1.A00 = C36441kJ.A15(A0C2);
        r1.A06();
        C107265Nh r7 = this.A0H;
        TextView A0Q = C36391kE.A0Q(this, R.id.call_type_text);
        ImageView A0Q2 = C36411kG.A0Q(this, R.id.call_type_icon);
        if (r7.A0C != null) {
            C19730wQ r92 = this.A02;
            ArrayList A012 = C65473Sf.A01(r7);
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it2 = A012.iterator();
            while (it2.hasNext()) {
                UserJid userJid3 = ((C107255Nf) it2.next()).A00;
                if (!r92.A0M(userJid3)) {
                    A0I2.add(userJid3);
                }
            }
            C61243Bc A042 = AnonymousClass3UD.A04(this.A07, this.A09, A0I2, 3, false);
            C18740tg.A06(A042);
            charSequence = A042.A00(this);
            i = R.drawable.vec_ic_sloped_link;
        } else {
            if (r7.A04.A03) {
                i = R.drawable.vec_ic_call_outgoing;
                i2 = R.string.f12nameremoved;
            } else if (r7.A07 == 5) {
                i = R.drawable.vec_ic_call_incoming_or_missed;
                i2 = R.string.f12nameremoved;
            } else {
                boolean A0O = r7.A0O();
                i = R.drawable.vec_ic_call_incoming_or_missed;
                i2 = R.string.f12nameremoved;
                if (A0O) {
                    i2 = R.string.f12nameremoved;
                }
            }
            charSequence = getString(i2);
        }
        A0Q.setText(charSequence);
        A0Q2.setImageResource(i);
        AnonymousClass3UF.A0E(A0Q2, AnonymousClass00F.A00(this, AnonymousClass3UE.A02(r7)));
        C36391kE.A0Q(this, R.id.call_duration).setText(AnonymousClass3UY.A07(this.A00, (long) r7.A09));
        AnonymousClass3TF.A05(C36391kE.A0Q(this, R.id.call_data), this.A00, r7.A0B);
        AnonymousClass3UY.A0H(C36391kE.A0Q(this, R.id.call_date), this.A07, this.A00, r7.A01);
        ArrayList A0I3 = AnonymousClass001.A0I();
        Iterator it3 = A0C2.iterator();
        while (it3.hasNext()) {
            C36381kD.A1H(this.A07, ((C107255Nf) it3.next()).A00, A0I3);
        }
        ((MultiContactThumbnail) findViewById(R.id.multi_contact_photo)).A00(this.A0J, this.A0A, A0I3);
        if (this.A0H.A0C != null) {
            C63083Ir r6 = this.A0H.A0C;
            boolean z = this.A0H.A0K;
            C36331k8.A11(this, R.id.divider);
            C36341k9.A13(this, R.id.call_link_container, 0);
            TextView A0Q3 = C36391kE.A0Q(this, R.id.call_link_text);
            TextView A0Q4 = C36391kE.A0Q(this, R.id.join_btn);
            int i3 = R.drawable.ic_btn_call_audio;
            if (z) {
                i3 = R.drawable.ic_btn_call_video;
            }
            Drawable A002 = AnonymousClass00E.A00(this, i3);
            if (A002 != null) {
                Drawable A013 = AnonymousClass08I.A01(A002);
                AnonymousClass076.A06(A013, C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved));
                A0Q4.setCompoundDrawablesWithIntrinsicBounds(A013, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            String str = r6.A02;
            A0Q3.setText(AnonymousClass3UD.A05(str, z));
            A0Q3.setOnClickListener(new AnonymousClass3YB(this, str, z));
            A0Q3.setOnLongClickListener(new AnonymousClass3Z4(this, str, z));
            A0Q4.setOnClickListener(new AnonymousClass3YB(this, str, z));
        }
        this.A08.registerObserver(this.A0K);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_delete);
        if (!this.A0D.A0E(3321)) {
            return true;
        }
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.unregisterObserver(this.A0K);
        AnonymousClass1RY r0 = this.A0B;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass1RY r02 = this.A0A;
        if (r02 != null) {
            r02.A02();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
            Log.i("calllog/delete");
            this.A0E.A0B(Collections.singletonList(this.A0H));
        } else if (menuItem.getItemId() != 16908332) {
            if (menuItem.getItemId() != R.id.menuitem_call_log_bugnub) {
                return false;
            }
            startActivity(AnonymousClass190.A0Q(this, (Uri) null, getIntent().getParcelableExtra("call_log_key"), true));
            return true;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A06.A01()) {
            this.A04.A00(new C132636Up("show_voip_activity"));
        }
    }

    public GroupCallLogActivity() {
        this(0);
        this.A0K = AnonymousClass4W3.A00(this, 2);
        this.A0J = new AnonymousClass3U5(this, 0);
    }
}
