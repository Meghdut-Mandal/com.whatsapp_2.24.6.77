package X;

import android.widget.CompoundButton;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6dj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136076dj implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C95934mW A00;
    public final /* synthetic */ C1278369v A01;

    public /* synthetic */ C136076dj(C95934mW r1, C1278369v r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C95934mW r1 = this.A00;
        C1278369v r2 = this.A01;
        List list = AnonymousClass0D3.A0I;
        CallRatingViewModel callRatingViewModel = r1.A00;
        AnonymousClass5T0 r0 = r2.A01;
        HashSet hashSet = callRatingViewModel.A0E;
        Integer valueOf = Integer.valueOf(r0.ordinal());
        if (z) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        C36341k9.A18(callRatingViewModel.A0A, C36411kG.A1a(hashSet));
    }
}
