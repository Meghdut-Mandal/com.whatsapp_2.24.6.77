package com.whatsapp.events;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass1N6;
import X.AnonymousClass3RF;
import X.AnonymousClass3Y1;
import X.C000800j;
import X.C001400p;
import X.C023509x;
import X.C18800tq;
import X.C18830tt;
import X.C20810yC;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36441kJ;
import X.C64813Pn;
import X.C85004Fk;
import X.C85434Hb;
import X.C89334Wd;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;

public final class EventCreationActivity extends AnonymousClass155 {
    public AnonymousClass1N6 A00;
    public C64813Pn A01;
    public BottomSheetBehavior A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (C64813Pn) r1.A9Z.get();
            this.A00 = C36361kB.A0e(A0B);
        }
    }

    public EventCreationActivity(int i) {
        this.A03 = false;
        C89334Wd.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C20810yC r1 = this.A0D;
        AnonymousClass00C.A07(r1);
        boolean A0E = r1.A0E(6260);
        this.A04 = A0E;
        if (A0E) {
            View A0G = C36361kB.A0G(this.A00, R.id.event_creation_activity_container);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A02 = bottomSheetBehavior;
            C64813Pn r12 = this.A01;
            if (r12 != null) {
                r12.A02(A0G, bottomSheetBehavior, this, this.A0C);
            } else {
                throw C36331k8.A0d("mediaAttachmentUtils");
            }
        }
        View view = this.A00;
        AnonymousClass00C.A08(view);
        ImageView A0L = C36341k9.A0L(view, R.id.event_creation_close_button);
        A0L.setImageResource(R.drawable.ic_close);
        AnonymousClass3Y1.A00(A0L, this, 1);
        View view2 = this.A00;
        AnonymousClass00C.A08(view2);
        C36341k9.A0M(view2, R.id.event_creation_bottom_sheet_title).setText(R.string.f12nameremoved);
        if (bundle == null) {
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            Jid A0m = C36441kJ.A0m(this.A05);
            long A08 = C36351kA.A08(this.A06);
            AnonymousClass00C.A0D(A0m, 0);
            Bundle A07 = C36331k8.A07(A0m);
            A07.putLong("extra_quoted_message_row_id", A08);
            EventCreateOrEditFragment eventCreateOrEditFragment = new EventCreateOrEditFragment();
            eventCreateOrEditFragment.A17(A07);
            A0O.A0B(eventCreateOrEditFragment, R.id.container_layout);
            A0O.A01();
            C36331k8.A1T(new EventCreationActivity$onCreate$1(this, (C023509x) null), C33311f5.A00(this));
        }
        getSupportFragmentManager().A0l(new AnonymousClass3RF(this, 6), this, "RESULT");
    }

    public void onStart() {
        super.onStart();
        if (this.A04) {
            C64813Pn r1 = this.A01;
            if (r1 != null) {
                r1.A03(this.A02, this);
                return;
            }
            throw C36331k8.A0d("mediaAttachmentUtils");
        }
    }

    public EventCreationActivity() {
        this(0);
        C000800j r1 = C000800j.PUBLICATION;
        this.A05 = C001400p.A00(r1, new C85004Fk(this));
        this.A06 = C001400p.A00(r1, new C85434Hb(this));
    }
}
