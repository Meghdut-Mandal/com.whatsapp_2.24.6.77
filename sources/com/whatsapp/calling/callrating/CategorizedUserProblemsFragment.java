package com.whatsapp.calling.callrating;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0CZ;
import X.AnonymousClass1H2;
import X.AnonymousClass5LF;
import X.AnonymousClass5TQ;
import X.AnonymousClass7KZ;
import X.C011004s;
import X.C123245wB;
import X.C1278469w;
import X.C152317Ka;
import X.C152327Kb;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C66763Xf;
import X.C90524aI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.ArrayList;

public final class CategorizedUserProblemsFragment extends Hilt_CategorizedUserProblemsFragment {
    public AnonymousClass005 A00;
    public View A01;
    public final AnonymousClass00T A02 = C36431kI.A1I(new AnonymousClass7KZ(this));
    public final AnonymousClass00T A03 = C36431kI.A1I(new C152317Ka(this));
    public final AnonymousClass00T A04 = C36431kI.A1I(new C152327Kb(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.user_problems_recycler_view);
        int i = 0;
        C011004s.A09(recyclerView, false);
        view2.getContext();
        C36351kA.A1F(recyclerView, 1);
        recyclerView.setAdapter((AnonymousClass0CZ) this.A03.getValue());
        View findViewById = view2.findViewById(R.id.user_problem_free_text_layout);
        AnonymousClass00T r7 = this.A04;
        CallRatingViewModel A0L = C90524aI.A0L(r7);
        int A022 = C36331k8.A02(this.A02);
        ArrayList arrayList = A0L.A0D;
        if (A022 >= arrayList.size() || ((C1278469w) arrayList.get(A022)).A00 != AnonymousClass5TQ.OTHER) {
            i = 8;
        } else {
            AnonymousClass005 r0 = this.A00;
            if (r0 != null) {
                C123245wB r3 = (C123245wB) r0.get();
                WaEditText waEditText = (WaEditText) C36361kB.A0F(view2, R.id.user_problem_descriptive_text);
                CallRatingViewModel A0L2 = C90524aI.A0L(r7);
                AnonymousClass00C.A0D(waEditText, 0);
                AnonymousClass00C.A0D(A0L2, 1);
                waEditText.setFilters(new C66763Xf[]{new C66763Xf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
                AnonymousClass1H2 r13 = r3.A03;
                waEditText.addTextChangedListener(new AnonymousClass5LF(waEditText, A0L2, r3.A00, r3.A01, r3.A02, r13, r3.A04));
            } else {
                throw C36331k8.A0d("userFeedbackTextFilter");
            }
        }
        findViewById.setVisibility(i);
        this.A01 = findViewById;
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
    }
}
