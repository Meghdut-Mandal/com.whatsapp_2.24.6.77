package com.whatsapp.invites;

import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass1EM;
import X.AnonymousClass1N2;
import X.AnonymousClass1RY;
import X.AnonymousClass1X4;
import X.AnonymousClass38V;
import X.AnonymousClass3M0;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C220412q;
import X.C27731Pn;
import X.C27761Ps;
import X.C33511fU;
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
import X.C40681vw;
import X.C48932iI;
import X.C49302it;
import X.C53092ql;
import X.C65533Sl;
import X.C67113Yo;
import X.C89344We;
import X.C90204Zm;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InviteGroupParticipantsActivity extends AnonymousClass155 {
    public ImageView A00;
    public AnonymousClass1X4 A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C27731Pn A04;
    public C27761Ps A05;
    public C18820ts A06;
    public C220412q A07;
    public AnonymousClass141 A08;
    public MentionableEntry A09;
    public AnonymousClass1EM A0A;
    public List A0B;
    public byte[] A0C;
    public AnonymousClass1RY A0D;
    public boolean A0E;

    public static void A01(InviteGroupParticipantsActivity inviteGroupParticipantsActivity, AnonymousClass147 r4, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty() && C36441kJ.A1L(inviteGroupParticipantsActivity.A0D)) {
            inviteGroupParticipantsActivity.startActivity(AnonymousClass190.A0g(inviteGroupParticipantsActivity, r4, arrayList, inviteGroupParticipantsActivity.getIntent().getIntExtra("invite_trigger_source", 0), false));
        }
    }

    public void A2F() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A07 = C36351kA.A0a(A0B2);
            this.A01 = C36361kB.A0T(A0B2);
            this.A04 = C36351kA.A0T(A0B2);
            this.A02 = C36341k9.A0R(A0B2);
            this.A03 = C36341k9.A0S(A0B2);
            this.A06 = C36341k9.A0T(A0B2);
            this.A0A = C36371kC.A0l(A0B2);
            this.A05 = C36361kB.A0W(A0B2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        LayoutInflater from = LayoutInflater.from(this);
        this.A0D = this.A04.A05(this, "invite-group-participants-activity");
        this.A09 = (MentionableEntry) findViewById(R.id.comment);
        getWindow().setSoftInputMode(3);
        this.A09.requestFocus();
        TextView A0Q = C36391kE.A0Q(this, R.id.group_name);
        this.A00 = C36411kG.A0Q(this, R.id.group_photo);
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = C36401kF.A0u(getIntent(), UserJid.class, "jids").iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            A0I.add(A0a);
            C36381kD.A1H(this.A02, A0a, A0I2);
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("invite_hashes");
        long longExtra = getIntent().getLongExtra("invite_expiration", 0);
        AnonymousClass147 A002 = C65533Sl.A00(getIntent(), "group_jid");
        C18740tg.A06(A002);
        boolean A062 = this.A0A.A06(A002);
        TextView A0H = C36401kF.A0H(this, R.id.group_invite_subtitle);
        int i = R.string.f12nameremoved;
        if (A062) {
            i = R.string.f12nameremoved;
        }
        A0H.setText(i);
        MentionableEntry mentionableEntry = this.A09;
        int i2 = R.string.f12nameremoved;
        if (A062) {
            i2 = R.string.f12nameremoved;
        }
        mentionableEntry.setText(i2);
        this.A0B = AnonymousClass001.A0I();
        for (int i3 = 0; i3 < stringArrayListExtra.size(); i3++) {
            this.A0B.add(new AnonymousClass38V(A002, (UserJid) A0I.get(i3), C36421kH.A0e(stringArrayListExtra, i3), longExtra));
        }
        AnonymousClass141 A0D2 = this.A02.A0D(A002);
        this.A08 = A0D2;
        if (AnonymousClass3M0.A00(A0D2, this.A0D)) {
            A0Q.setText(R.string.f12nameremoved);
            A0H.setVisibility(8);
        } else {
            A0Q.setText(this.A03.A0H(this.A08));
        }
        C36331k8.A1F(new C49302it(this.A05, this.A08, this), this.A04);
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("sms_invites_jids");
        ImageView A0Q2 = C36411kG.A0Q(this, R.id.send);
        C36321k7.A0L(this, A0Q2, this.A06, R.drawable.input_send);
        C48932iI.A00(A0Q2, A002, this, stringArrayListExtra2, 26);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invite_contacts_recycler);
        LinearLayoutManager A0T = C36431kI.A0T();
        A0T.A1f(0);
        recyclerView.setLayoutManager(A0T);
        C220412q r13 = this.A07;
        C40681vw r7 = new C40681vw(this, from, this.A03, this.A0D, this.A06, r13);
        r7.A00 = A0I2;
        r7.A06();
        recyclerView.setAdapter(r7);
        C33511fU.A03(C36391kE.A0Q(this, R.id.send_invite_title));
        View findViewById = findViewById(R.id.container);
        C90204Zm.A00(findViewById.getViewTreeObserver(), this, findViewById, 4);
        Intent A003 = C53092ql.A00(getIntent());
        A003.setComponent(getIntent().getComponent());
        setResult(0, A003);
        C67113Yo.A00(findViewById(R.id.filler), this, stringArrayListExtra2, A002, 49);
        C36331k8.A0l(this);
        C36361kB.A0u(this);
    }

    public InviteGroupParticipantsActivity(int i) {
        this.A0E = false;
        C89344We.A00(this, 7);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1RY r0 = this.A0D;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void onPause() {
        super.onPause();
        getWindow().setSoftInputMode(C36421kH.A01(AnonymousClass1N2.A00(this.A00) ? 1 : 0));
    }

    public InviteGroupParticipantsActivity() {
        this(0);
    }
}
