package com.whatsapp.events;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass05L;
import X.AnonymousClass0A2;
import X.AnonymousClass21S;
import X.AnonymousClass3NG;
import X.AnonymousClass3RF;
import X.AnonymousClass3S4;
import X.AnonymousClass4BO;
import X.AnonymousClass4HX;
import X.AnonymousClass4HY;
import X.AnonymousClass4IL;
import X.AnonymousClass4XN;
import X.AnonymousClass4ZD;
import X.C000800j;
import X.C001400p;
import X.C007103b;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C109325Xd;
import X.C18820ts;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C40091uu;
import X.C50792la;
import X.C51282nZ;
import X.C51552o0;
import X.C58232zX;
import X.C66313Vm;
import X.C85014Fl;
import X.C85474Hf;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

public final class EventInfoBottomSheet extends Hilt_EventInfoBottomSheet {
    public C58232zX A00;
    public WaImageView A01;
    public WaTextView A02;
    public C18820ts A03;
    public C40091uu A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07 = C36431kI.A1I(new AnonymousClass4BO(this));
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;

    public static final void A03(Bundle bundle, EventInfoBottomSheet eventInfoBottomSheet) {
        AnonymousClass00C.A0D(bundle, 2);
        if (bundle.getBoolean("SUCCESS")) {
            eventInfoBottomSheet.A1b();
        }
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        C40091uu r0 = this.A04;
        if (r0 == null) {
            throw C36331k8.A0d("eventInfoViewModel");
        }
        bundle.putInt("STATE_CURRENT_STEP", ((AnonymousClass3S4) r0.A0B.getValue()).A01.ordinal());
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C58232zX r3 = this.A00;
        if (r3 != null) {
            Object A0p = C36381kD.A0p(this.A07);
            Object value = this.A09.getValue();
            AnonymousClass00C.A0D(value, 2);
            this.A04 = (C40091uu) AnonymousClass4ZD.A00(this, value, r3, A0p, 3).A00(C40091uu.class);
            this.A01 = C36431kI.A0X(view, R.id.event_info_close_button);
            this.A02 = C36401kF.A0Q(view, R.id.event_info_bottom_sheet_title);
            LifecycleCoroutineScopeImpl A0T = C36411kG.A0T(this);
            EventInfoBottomSheet$onViewCreated$1 eventInfoBottomSheet$onViewCreated$1 = new EventInfoBottomSheet$onViewCreated$1(this, (C023509x) null);
            C008903u r0 = C008903u.A00;
            Integer num = C023109s.A00;
            AnonymousClass0A2.A02(num, r0, eventInfoBottomSheet$onViewCreated$1, A0T);
            if (this.A06.getValue() == C51552o0.MAIN && bundle == null) {
                C40091uu r4 = this.A04;
                if (r4 == null) {
                    throw C36331k8.A0d("eventInfoViewModel");
                }
                AnonymousClass0A2.A02(num, r4.A09, new EventInfoViewModel$logNavigateToEventInfo$1(r4, (C023509x) null), C109325Xd.A00(r4));
            }
            A0k().A0l(new AnonymousClass3RF(this, 7), this, "RESULT");
            return;
        }
        throw C36331k8.A0d("eventInfoViewModelFactory");
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.A00.A04 = new C50792la(AnonymousClass4IL.A00);
    }

    public void A1J() {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A02 = null;
        super.A1J();
    }

    public boolean A1l() {
        C40091uu r0 = this.A04;
        if (r0 == null) {
            throw C36331k8.A0d("eventInfoViewModel");
        } else if (((AnonymousClass3S4) r0.A0B.getValue()).A01 != C51552o0.EDIT) {
            return false;
        } else {
            List A042 = A0k().A0T.A04();
            AnonymousClass00C.A08(A042);
            AnonymousClass02E r1 = (AnonymousClass02E) C007103b.A0O(A042);
            if (!(r1 instanceof EventCreateOrEditFragment) || !((EventCreateOrEditFragment) r1).A1Z()) {
                return false;
            }
            A05(this);
            return true;
        }
    }

    public EventInfoBottomSheet() {
        C000800j r2 = C000800j.NONE;
        this.A05 = C001400p.A00(r2, new C85014Fl(this));
        this.A08 = C001400p.A00(r2, new C85474Hf(this, "extra_quoted_message_row_id"));
        this.A06 = C001400p.A00(r2, new AnonymousClass4HX(this, C51552o0.MAIN));
        this.A09 = C001400p.A00(r2, new AnonymousClass4HY(this, C51282nZ.NONE));
    }

    public static final void A05(EventInfoBottomSheet eventInfoBottomSheet) {
        AnonymousClass21S A002 = AnonymousClass21S.A00(eventInfoBottomSheet.A0a());
        A002.A0e(R.string.f12nameremoved);
        A002.A0d(R.string.f12nameremoved);
        A002.A0g(new AnonymousClass4XN(eventInfoBottomSheet, 14), R.string.f12nameremoved);
        A002.A0f(C66313Vm.A00, R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public void A1A(Bundle bundle) {
        Object value;
        AnonymousClass3S4 r0;
        super.A1A(bundle);
        if (bundle != null) {
            int i = bundle.getInt("STATE_CURRENT_STEP");
            if (Integer.valueOf(i) != null) {
                C51552o0 r5 = C51552o0.values()[i];
                C40091uu r02 = this.A04;
                if (r02 == null) {
                    throw C36331k8.A0d("eventInfoViewModel");
                }
                AnonymousClass00C.A0D(r5, 0);
                AnonymousClass05L r2 = r02.A0A;
                do {
                    value = r2.getValue();
                    r0 = (AnonymousClass3S4) value;
                } while (!r2.B3B(value, new AnonymousClass3S4(r0.A00, r5, r0.A03, r0.A02, false)));
            }
        }
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
