package com.whatsapp.calling.psa.view;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass3AO;
import X.AnonymousClass3NG;
import X.AnonymousClass49A;
import X.AnonymousClass49B;
import X.AnonymousClass4FG;
import X.C012005e;
import X.C019308f;
import X.C023509x;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C40831wB;
import X.C50782lZ;
import X.C586030i;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;

public final class GroupCallPsaBottomSheet extends Hilt_GroupCallPsaBottomSheet {
    public TextView A00;
    public C40831wB A01;
    public AnonymousClass00S A02;
    public RecyclerView A03;
    public final AnonymousClass00T A04;
    public final int A05 = R.layout.f9nameremoved;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A00 = C36391kE.A0O(view, R.id.psa_title);
        RecyclerView recyclerView = (RecyclerView) C012005e.A02(view, R.id.group_recycler_view);
        this.A03 = recyclerView;
        if (recyclerView != null) {
            C40831wB r0 = this.A01;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
            } else {
                throw C36331k8.A0Y();
            }
        }
        C40831wB r1 = this.A01;
        if (r1 != null) {
            r1.A00 = new C586030i(this);
            RecyclerView recyclerView2 = this.A03;
            if (recyclerView2 != null) {
                A0a();
                C36321k7.A0Q(recyclerView2);
            }
            C36331k8.A1T(new GroupCallPsaBottomSheet$onViewCreated$2(this, (C023509x) null), C36411kG.A0T(this));
            return;
        }
        throw C36331k8.A0Y();
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass3AO r1 = r3.A00;
        r1.A06 = true;
        r1.A04 = C50782lZ.A00;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass00S r0 = this.A02;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public GroupCallPsaBottomSheet() {
        C019308f A1A = C36441kJ.A1A(GroupCallPsaViewModel.class);
        this.A04 = C36441kJ.A0a(new AnonymousClass49A(this), new AnonymousClass49B(this), new AnonymousClass4FG(this), A1A);
    }

    public void A1J() {
        super.A1J();
        this.A00 = null;
        this.A03 = null;
    }

    public int A1i() {
        return this.A05;
    }
}
