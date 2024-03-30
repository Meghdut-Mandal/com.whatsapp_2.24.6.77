package com.whatsapp.calling.participantlist;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass0CZ;
import X.AnonymousClass1PZ;
import X.AnonymousClass3UE;
import X.AnonymousClass495;
import X.AnonymousClass496;
import X.AnonymousClass4FE;
import X.C012005e;
import X.C019308f;
import X.C135456cj;
import X.C24801Dv;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C55492ui;
import X.C85794Il;
import X.C85804Im;
import X.C95894mS;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.components.MaxHeightLinearLayout;

public final class ParticipantListBottomSheetDialog extends Hilt_ParticipantListBottomSheetDialog {
    public C24801Dv A00;
    public C95894mS A01;
    public AnonymousClass1PZ A02;
    public RecyclerView A03;
    public MaxHeightLinearLayout A04;
    public final AnonymousClass00T A05;
    public final int A06 = R.layout.f9nameremoved;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C36411kG.A0K(view));
        AnonymousClass00C.A08(A022);
        A022.A0h = true;
        A022.A0W(3);
        this.A04 = (MaxHeightLinearLayout) view;
        A03();
        C012005e.A02(view, R.id.close_btn).setOnClickListener(new C135456cj(this, 26));
        this.A03 = (RecyclerView) C012005e.A02(view, R.id.participant_list);
        C95894mS r1 = this.A01;
        if (r1 != null) {
            AnonymousClass00T r4 = this.A05;
            r1.A01 = (ParticipantsListViewModel) r4.getValue();
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                C95894mS r0 = this.A01;
                if (r0 != null) {
                    recyclerView.setAdapter(r0);
                } else {
                    throw C36331k8.A0d("participantListAdapter");
                }
            }
            C55492ui.A01(A0m(), ((ParticipantsListViewModel) r4.getValue()).A01, new C85794Il(this), 47);
            C55492ui.A01(A0m(), ((ParticipantsListViewModel) r4.getValue()).A0A, new C85804Im(this), 48);
            return;
        }
        throw C36331k8.A0d("participantListAdapter");
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        A03();
    }

    public ParticipantListBottomSheetDialog() {
        C019308f A1A = C36441kJ.A1A(ParticipantsListViewModel.class);
        this.A05 = C36441kJ.A0a(new AnonymousClass495(this), new AnonymousClass496(this), new AnonymousClass4FE(this), A1A);
    }

    private final void A03() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            float f = 0.6f;
            if (C36341k9.A04(A0a()) == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A04;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) AnonymousClass3UE.A00(A0h)) * f));
            }
        }
    }

    public void A1J() {
        super.A1J();
        AnonymousClass1PZ r3 = this.A02;
        if (r3 != null) {
            int i = 16;
            if (C36341k9.A1Z(((ParticipantsListViewModel) this.A05.getValue()).A0A.A04())) {
                i = 35;
            }
            r3.A01(C36391kE.A0r(), 23, i);
            this.A04 = null;
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                recyclerView.setAdapter((AnonymousClass0CZ) null);
            }
            this.A03 = null;
            Bundle A07 = AnonymousClass001.A07();
            A07.putBoolean("on_dismissed", true);
            A0l().A0o("participant_list_request", A07);
            return;
        }
        throw C36331k8.A0d("callUserJourneyLogger");
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        Window window = A1a.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        return A1a;
    }

    public int A1i() {
        return this.A06;
    }
}
