package com.whatsapp.calling.calllink.view;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass15P;
import X.AnonymousClass1MK;
import X.AnonymousClass1N6;
import X.AnonymousClass1ND;
import X.AnonymousClass1PW;
import X.AnonymousClass22c;
import X.AnonymousClass23r;
import X.AnonymousClass23s;
import X.AnonymousClass23t;
import X.AnonymousClass23u;
import X.AnonymousClass3UD;
import X.AnonymousClass3XZ;
import X.C03570Gk;
import X.C130806Mm;
import X.C132636Up;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C55492ui;
import X.C89314Wb;
import X.C89744Xs;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.calling.views.VoipReturnToCallBanner;

public class CallLinkActivity extends AnonymousClass22c implements AnonymousClass15P {
    public ViewGroup A00;
    public AnonymousClass23r A01;
    public AnonymousClass23u A02;
    public AnonymousClass23t A03;
    public AnonymousClass23s A04;
    public WaImageView A05;
    public CallLinkViewModel A06;
    public AnonymousClass1ND A07;
    public AnonymousClass1PW A08;
    public C130806Mm A09;
    public VoipReturnToCallBanner A0A;
    public AnonymousClass1MK A0B;
    public AnonymousClass1N6 A0C;
    public boolean A0D;

    public void Bgm(int i, int i2) {
        if (i == 1) {
            CallLinkViewModel callLinkViewModel = this.A06;
            if (i2 != (!CallLinkViewModel.A03(callLinkViewModel))) {
                CallLinkViewModel.A02(callLinkViewModel, AnonymousClass000.A1Q(i2));
            }
        }
    }

    public static void A01(CallLinkActivity callLinkActivity, AnonymousClass3XZ r5) {
        boolean z = false;
        C18740tg.A0D(AnonymousClass000.A1V(callLinkActivity.A03.A02), "Share text cannot be null");
        if (callLinkActivity.A03.A01 != null) {
            z = true;
        }
        C18740tg.A0D(z, "Email subject cannot be null");
        if (Build.VERSION.SDK_INT < 22) {
            callLinkActivity.A09.A00.Bly(AnonymousClass3UD.A02((String) null, 2, 1, r5.A06));
        }
        boolean z2 = r5.A06;
        AnonymousClass23t r0 = callLinkActivity.A03;
        callLinkActivity.startActivity(AnonymousClass3UD.A00(callLinkActivity, r0.A02, r0.A01, 1, z2));
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A07 = C36391kE.A0Y(A0B2);
            this.A0B = C36381kD.A0W(A0B2);
            this.A08 = (AnonymousClass1PW) A0B2.A74.get();
            this.A09 = C18830tt.A2o(r1);
            this.A0C = C36361kB.A0e(A0B2);
        }
    }

    public void A2X() {
        this.A0C.A03((AnonymousClass11F) null, 15);
        super.A2X();
    }

    public CallLinkActivity(int i) {
        this.A0D = false;
        C89314Wb.A00(this, 39);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        this.A00 = (ViewGroup) C03570Gk.A0B(this, R.id.link_btn);
        this.A05 = (WaImageView) C03570Gk.A0B(this, R.id.link_icon);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A06 = (CallLinkViewModel) C36441kJ.A0b(this).A00(CallLinkViewModel.class);
        AnonymousClass23u r1 = new AnonymousClass23u();
        this.A02 = r1;
        r1.A00 = A3i();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A02.A00);
        A0a.setMargins(A0a.leftMargin, A0a.topMargin, A0a.rightMargin, dimensionPixelSize2);
        this.A02.A00.setLayoutParams(A0a);
        this.A02 = this.A02;
        A3m();
        this.A04 = A3l();
        this.A01 = A3j();
        this.A03 = A3k();
        C55492ui.A00(this, this.A06.A02.A01("saved_state_link"), 42);
        C55492ui.A00(this, this.A06.A00, 45);
        CallLinkViewModel callLinkViewModel = this.A06;
        C55492ui.A00(this, callLinkViewModel.A02.A00(CallLinkViewModel.A01(callLinkViewModel), "saved_state_link_type"), 43);
        C55492ui.A00(this, this.A06.A01, 44);
        VoipReturnToCallBanner voipReturnToCallBanner = new VoipReturnToCallBanner(this, (AttributeSet) null);
        voipReturnToCallBanner.A0E = null;
        this.A0A = voipReturnToCallBanner;
        ViewGroup A0E = C36421kH.A0E(this, R.id.call_notification_holder);
        if (A0E != null) {
            A0E.addView(this.A0A);
        }
        this.A0A.A03 = new C89744Xs(this, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.setOnClickListener((View.OnClickListener) null);
        this.A00.setOnLongClickListener((View.OnLongClickListener) null);
    }

    public void onResume() {
        super.onResume();
        if (this.A0B.A00() || this.A0B.A01()) {
            this.A08.A00(new C132636Up("show_voip_activity"));
        }
    }

    public CallLinkActivity() {
        this(0);
    }
}
