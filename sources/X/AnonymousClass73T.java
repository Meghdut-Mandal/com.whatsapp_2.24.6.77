package X;

import android.content.Context;
import com.whatsapp.extensions.phoenix.viewmodel.FlowsFooterViewModel;

/* renamed from: X.73T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73T implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass141 A03;
    public final /* synthetic */ FlowsFooterViewModel A04;

    public /* synthetic */ AnonymousClass73T(Context context, AnonymousClass141 r2, FlowsFooterViewModel flowsFooterViewModel, float f, int i) {
        this.A04 = flowsFooterViewModel;
        this.A02 = context;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = f;
    }

    public final void run() {
        FlowsFooterViewModel flowsFooterViewModel = this.A04;
        Context context = this.A02;
        AnonymousClass141 r3 = this.A03;
        int i = this.A01;
        flowsFooterViewModel.A01.A0C(flowsFooterViewModel.A03.A07(context, r3, this.A00, i, false));
    }
}
