package X;

import android.os.Bundle;
import com.whatsapp.events.EventInfoBottomSheet;

/* renamed from: X.2sd  reason: invalid class name and case insensitive filesystem */
public abstract class C54242sd {
    public static final EventInfoBottomSheet A00(AnonymousClass2bT r4, C51552o0 r5, C51282nZ r6) {
        String rawString;
        AnonymousClass00C.A0D(r6, 2);
        Bundle A07 = AnonymousClass001.A07();
        C64933Qa r0 = r4.A1J;
        AnonymousClass3UJ.A08(A07, r0);
        AnonymousClass11F r02 = r0.A00;
        if (!(r02 == null || (rawString = r02.getRawString()) == null)) {
            A07.putString("jid", rawString);
        }
        AnonymousClass3T1 A0S = r4.A0S();
        if (A0S != null) {
            A07.putLong("extra_quoted_message_row_id", A0S.A1N);
        }
        if (r5 != null) {
            A07.putString("INITIAL_STEP_KEY", r5.toString());
        }
        A07.putString("SOURCE_KEY", r6.toString());
        EventInfoBottomSheet eventInfoBottomSheet = new EventInfoBottomSheet();
        eventInfoBottomSheet.A17(A07);
        return eventInfoBottomSheet;
    }
}
