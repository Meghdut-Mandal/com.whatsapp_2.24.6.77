package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;

/* renamed from: X.64i  reason: invalid class name and case insensitive filesystem */
public class C1265164i {
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final C1258161j A02;
    public final AnonymousClass6W0 A03;
    public final C21060yb A04;
    public final C19970wo A05;
    public final C18820ts A06;
    public final C21010yW A07;

    public void A00(Activity activity, C594233w r6, AnonymousClass65A r7, String str, HashMap hashMap) {
        AnonymousClass6Q3 r3 = ((C1025050g) ((C158017ff) activity)).A09;
        C110105a8.A00(activity, r3, r6, hashMap);
        C160377ku r2 = r6.A01;
        if (r2 != null) {
            r3.A01(r6.A00, r2, "dialog");
        }
        AnonymousClass01z r22 = (AnonymousClass01z) r7.A05.get();
        DialogFragment dialogFragment = (DialogFragment) r22.A0N("bloks-dialog");
        if (dialogFragment != null) {
            dialogFragment.A1b();
        }
        BloksDialogFragment.A03(str, hashMap).A1f(r22, "bloks-dialog");
    }

    public C1265164i(AnonymousClass17Y r1, C19730wQ r2, C1258161j r3, AnonymousClass6W0 r4, C21060yb r5, C19970wo r6, C18820ts r7, C21010yW r8) {
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }
}
