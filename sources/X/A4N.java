package X;

import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class A4N implements OnSuccessListener {
    public final /* synthetic */ C30331a2 A00;

    public /* synthetic */ A4N(C30331a2 r1) {
        this.A00 = r1;
    }

    public final void onSuccess(Object obj) {
        String str;
        C30331a2 r2 = this.A00;
        C169878Ba r0 = ((A49) ((C23116B5v) ((AnonymousClass0WJ) obj).A00)).A00;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A00;
        }
        C30321a1 r22 = r2.A01;
        if (str != null) {
            r22.A01(str, 0, (String) null);
        } else {
            r22.A01((String) null, 1000, "Attestation API returned NULL as JWS result");
        }
    }
}
