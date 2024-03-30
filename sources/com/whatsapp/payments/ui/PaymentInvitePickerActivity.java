package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass1EU;
import X.AnonymousClass1N6;
import X.AnonymousClass2GI;
import X.C167527yC;
import X.C175728ax;
import X.C36331k8;
import X.C36391kE;
import X.C36441kJ;
import X.C62463Gg;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PaymentInvitePickerActivity extends AnonymousClass2GI {
    public AnonymousClass1EU A00;
    public C167527yC A01;
    public AnonymousClass1N6 A02;

    public void A2W() {
        this.A02.A03((AnonymousClass11F) null, 78);
    }

    public boolean A2f() {
        return this.A0D.A0E(7019);
    }

    public void A3v(C62463Gg r3, AnonymousClass141 r4) {
        super.A3v(r3, r4);
        TextEmojiLabel textEmojiLabel = r3.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(R.string.f12nameremoved);
    }

    public void A42(ArrayList arrayList) {
        ArrayList A0I = AnonymousClass001.A0I();
        super.A42(A0I);
        if (this.A00.A05().BFa() != null) {
            AnonymousClass1EU r0 = this.A00;
            AnonymousClass1EU.A00(r0);
            ArrayList A0C = r0.A06.A0C(new int[]{2}, 3);
            HashMap A0J = AnonymousClass001.A0J();
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                C175728ax r1 = (C175728ax) it.next();
                A0J.put(r1.A04, r1);
            }
            Iterator it2 = A0I.iterator();
            while (it2.hasNext()) {
                AnonymousClass141 A0f = C36391kE.A0f(it2);
                Object obj = A0J.get(A0f.A0H);
                if (!C36331k8.A1Y(this.A06, A0f) && obj != null) {
                    arrayList.add(A0f);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("extra_multi_invite_picker_title")) {
            setTitle(intent.getIntExtra("extra_multi_invite_picker_title", R.string.f12nameremoved));
        }
        this.A01 = (C167527yC) C36441kJ.A0b(this).A00(C167527yC.class);
    }
}
