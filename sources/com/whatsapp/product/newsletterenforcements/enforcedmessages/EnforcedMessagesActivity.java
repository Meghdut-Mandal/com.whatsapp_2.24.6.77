package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass12P;
import X.AnonymousClass163;
import X.AnonymousClass16D;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1RY;
import X.AnonymousClass22g;
import X.AnonymousClass2JG;
import X.AnonymousClass2JI;
import X.AnonymousClass3QY;
import X.AnonymousClass4DA;
import X.AnonymousClass4DB;
import X.AnonymousClass4DC;
import X.AnonymousClass4DD;
import X.AnonymousClass4DE;
import X.AnonymousClass4H0;
import X.AnonymousClass4H1;
import X.AnonymousClass4L5;
import X.AnonymousClass4L6;
import X.AnonymousClass4L7;
import X.AnonymousClass4V4;
import X.C000800j;
import X.C001400p;
import X.C023509x;
import X.C109325Xd;
import X.C1497372o;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C20810yC;
import X.C27111My;
import X.C28981Uw;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C48812i6;
import X.C62503Gk;
import X.C65993Ug;
import X.C77543qf;
import X.C89014Ux;
import X.C89354Wf;
import X.C90394a5;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;

public final class EnforcedMessagesActivity extends AnonymousClass2JG {
    public C33751fs A00;
    public C77543qf A01;
    public boolean A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass191 A08;

    public /* bridge */ /* synthetic */ AnonymousClass4V4 A3j() {
        C48812i6 r11 = new C48812i6(this, this.A01, 47);
        C19730wQ r3 = this.A02;
        AnonymousClass00C.A07(r3);
        AnonymousClass16D r4 = this.A00.A0C;
        AnonymousClass00C.A08(r4);
        AnonymousClass1A1 r10 = this.A00.A0x;
        AnonymousClass00C.A08(r10);
        AnonymousClass1RY r5 = this.A07;
        AnonymousClass00C.A07(r5);
        AnonymousClass3QY r6 = this.A00.A0L;
        AnonymousClass00C.A08(r6);
        C20810yC r8 = this.A0D;
        AnonymousClass00C.A07(r8);
        return new AnonymousClass2JI(this, r3, r4, r5, r6, this, r8, C36431kI.A0i(this.A06), r10, r11, new AnonymousClass4L5(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        ListView listView = getListView();
        AnonymousClass00C.A08(listView);
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnScrollListener(this.A0J);
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, listView, false);
        listView.addHeaderView(inflate);
        C36391kE.A0P(inflate, R.id.header_title).setText(R.string.f12nameremoved);
        TextView A0P = C36391kE.A0P(inflate, R.id.header_description);
        A0P.setText(this.A00.A11.A03(this, new C1497372o(this, 34), C36391kE.A0v(this, "clickable-span", new Object[1], 0, R.string.f12nameremoved), "clickable-span", C36341k9.A05(this)));
        C36331k8.A10(A0P, this.A0D);
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0A((AnonymousClass02E) this.A05.getValue(), R.id.newsletter_guidelines_fragment);
        A0O.A01();
        this.A00.A0Z.registerObserver(this.A08);
        AnonymousClass00T r3 = this.A07;
        C65993Ug.A00(this, ((EnforcedMessagesViewModel) r3.getValue()).A00, new AnonymousClass4L6(this), 40);
        C65993Ug.A00(this, ((EnforcedMessagesViewModel) r3.getValue()).A01, new AnonymousClass4L7(this), 41);
        EnforcedMessagesViewModel enforcedMessagesViewModel = (EnforcedMessagesViewModel) r3.getValue();
        C28981Uw A0i = C36431kI.A0i(this.A06);
        AnonymousClass00C.A0D(A0i, 0);
        C36331k8.A1T(new EnforcedMessagesViewModel$initializeViewModel$1(A0i, enforcedMessagesViewModel, (C023509x) null), C109325Xd.A00(enforcedMessagesViewModel));
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C36321k7.A0c(r3, this);
            C18830tt r1 = r3.A00;
            C36321k7.A0X(r3, r1, this, C36321k7.A05(r3, r1, this));
            AnonymousClass22g.A0H(A0L, r3, r1, new C62503Gk(), this);
            this.A00 = C36361kB.A0X(r1);
            this.A01 = new C77543qf((AnonymousClass163) r3.A1k.get(), (AnonymousClass12P) r3.A5G.get());
        }
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A00.A0P.A06;
    }

    public EnforcedMessagesActivity(int i) {
        this.A02 = false;
        C89354Wf.A00(this, 18);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0Z.unregisterObserver(this.A08);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        EnforcedMessagesViewModel enforcedMessagesViewModel = (EnforcedMessagesViewModel) this.A07.getValue();
        C28981Uw A0i = C36431kI.A0i(this.A06);
        AnonymousClass00C.A0D(A0i, 0);
        C36331k8.A1T(new EnforcedMessagesViewModel$initializeViewModel$1(A0i, enforcedMessagesViewModel, (C023509x) null), C109325Xd.A00(enforcedMessagesViewModel));
    }

    public EnforcedMessagesActivity() {
        this(0);
        this.A07 = C36441kJ.A0a(new AnonymousClass4DE(this), new AnonymousClass4DD(this), new AnonymousClass4H1(this), C36441kJ.A1A(EnforcedMessagesViewModel.class));
        this.A06 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4H0(this));
        this.A08 = C90394a5.A00(this, 26);
        this.A05 = C36431kI.A1I(new AnonymousClass4DC(this));
        this.A04 = C36431kI.A1I(new AnonymousClass4DB(this));
        this.A03 = C36431kI.A1I(new AnonymousClass4DA(this));
    }
}
