package X;

import android.text.Editable;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.HashSet;

/* renamed from: X.5LF  reason: invalid class name */
public final class AnonymousClass5LF extends AnonymousClass2gA {
    public final /* synthetic */ CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5LF(WaEditText waEditText, CallRatingViewModel callRatingViewModel, C21060yb r16, C18820ts r17, AnonymousClass1N0 r18, AnonymousClass1H2 r19, C19890wg r20) {
        super(waEditText, (TextView) null, r16, r17, r18, r19, r20, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 0, false, false, false);
        this.A00 = callRatingViewModel;
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass00C.A0D(editable, 0);
        super.afterTextChanged(editable);
        CallRatingViewModel callRatingViewModel = this.A00;
        String A0y = C36371kC.A0y(editable.toString());
        AnonymousClass00C.A0D(A0y, 0);
        callRatingViewModel.A06 = A0y;
        AnonymousClass5T0 r4 = AnonymousClass5T0.PROBLEM_OTHER;
        boolean z = true;
        if (A0y.codePointCount(0, A0y.length()) < 3) {
            z = false;
        }
        HashSet hashSet = callRatingViewModel.A0E;
        Integer valueOf = Integer.valueOf(r4.ordinal());
        if (z) {
            hashSet.add(valueOf);
        } else {
            hashSet.remove(valueOf);
        }
        C36341k9.A18(callRatingViewModel.A0A, C36411kG.A1a(hashSet));
    }
}
