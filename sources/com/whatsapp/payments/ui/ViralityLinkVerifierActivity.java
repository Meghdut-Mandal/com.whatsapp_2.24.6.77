package com.whatsapp.payments.ui;

import X.AnonymousClass00F;
import X.AnonymousClass19A;
import X.AnonymousClass1AL;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass6X5;
import X.B9J;
import X.BAA;
import X.BAZ;
import X.C03570Gk;
import X.C165607th;
import X.C165617ti;
import X.C167777yn;
import X.C170788Eu;
import X.C173928Tr;
import X.C19460v5;
import X.C203399nx;
import X.C24601Db;
import X.C29121Vk;
import X.C29131Vl;
import X.C33751fs;
import X.C33771fu;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C61673Cz;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class ViralityLinkVerifierActivity extends C173928Tr {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public C19460v5 A05;
    public C33771fu A06;
    public WaTextView A07;
    public WaTextView A08;
    public C33751fs A09;
    public C24601Db A0A;
    public C29121Vk A0B;
    public AnonymousClass1EV A0C;
    public AnonymousClass1EU A0D;
    public C167777yn A0E;
    public C29131Vl A0F;
    public C61673Cz A0G;
    public WDSButton A0H;
    public WDSButton A0I;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0E = (C167777yn) C165617ti.A0A(new B9J(C165607th.A0H(this), this, 5), this).A00(C167777yn.class);
        setContentView((int) R.layout.f9nameremoved);
        C36421kH.A13(C03570Gk.A0B(this, R.id.virality_activity_root_view), this, 45);
        this.A02 = C03570Gk.A0B(this, R.id.actionable_container);
        this.A04 = C03570Gk.A0B(this, R.id.virality_texts_container);
        this.A03 = C03570Gk.A0B(this, R.id.progress_container);
        this.A08 = C36401kF.A0Q(this.A04, R.id.payment_enabled_or_not_title);
        this.A07 = C36401kF.A0Q(this.A04, R.id.virality_description_text);
        WDSButton wDSButton = (WDSButton) C03570Gk.A0B(this, R.id.done_or_cancel_button);
        this.A0H = wDSButton;
        C36421kH.A13(wDSButton, this, 46);
        WDSButton wDSButton2 = (WDSButton) C03570Gk.A0B(this, R.id.go_to_payments_button);
        this.A0I = wDSButton2;
        C36421kH.A13(wDSButton2, this, 47);
        this.A03.setVisibility(0);
        this.A04.setVisibility(8);
        this.A02.setVisibility(8);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C03570Gk.A0B(this, R.id.virality_bottom_sheet));
        A022.A0V(0);
        A022.A0W(3);
        A022.A0a(new C170788Eu(this));
        C36331k8.A0l(this);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(AnonymousClass00F.A00(this, R.color.f6nameremoved));
        C167777yn r2 = this.A0E;
        String str = r2.A09;
        if (str != null) {
            C29121Vk r7 = r2.A04;
            String A012 = r2.A08.A01();
            if (A012 == null) {
                A012 = "";
            }
            AnonymousClass1AL[] r3 = new AnonymousClass1AL[2];
            C36341k9.A1L("action", "verify-deep-link", r3, 0);
            r3[1] = new AnonymousClass1AL("device-id", A012);
            AnonymousClass1AL[] r1 = new AnonymousClass1AL[1];
            C36341k9.A1L("payload", str, r1, 0);
            C203399nx r5 = new C203399nx(C203399nx.A04("link", r1), "account", r3);
            BAZ baz = new BAZ(r2, 1);
            AnonymousClass19A r72 = r7.A06;
            String A092 = r72.A09();
            AnonymousClass1AL[] r12 = new AnonymousClass1AL[4];
            C36341k9.A1V(r12, 0);
            C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r12, 1);
            C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092, r12);
            C36361kB.A1Q("xmlns", "w:pay", r12);
            r72.A0F(baz, C36391kE.A0m(r5, r12), A092, 204, AnonymousClass6X5.A0L);
        }
        this.A0E.A00.A08(this, new BAA(this, 9));
    }
}
