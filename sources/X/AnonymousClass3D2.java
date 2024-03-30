package X;

import com.whatsapp.calling.callsuggestions.SuggestionRunBlockingCancelable$invoke$1;
import com.whatsapp.util.Log;
import java.util.concurrent.CancellationException;

/* renamed from: X.3D2  reason: invalid class name */
public final class AnonymousClass3D2 {
    public boolean A00 = true;
    public final C19700wN A01;

    public AnonymousClass3D2(C19700wN r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public final Object A00(C009003v r6) {
        try {
            return C110515an.A00(C008903u.A00, new SuggestionRunBlockingCancelable$invoke$1((C023509x) null, r6));
        } catch (C13390jn unused) {
            if (this.A00) {
                Log.e("FrequentlyAddedToCallStore job timed out");
                this.A01.A0E("FrequentlyCalledStore/fetch", "{ timeout }", false);
                this.A00 = false;
            }
            return null;
        } catch (CancellationException e) {
            C36321k7.A1J(e, "FrequentlyAddedToCallStore job was cancelled; reason: ", AnonymousClass000.A0u());
            return null;
        }
    }
}
