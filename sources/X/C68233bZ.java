package X;

import android.os.Bundle;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3bZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68233bZ implements C003801r {
    public final /* synthetic */ MessageSelectionViewModel A00;

    public /* synthetic */ C68233bZ(MessageSelectionViewModel messageSelectionViewModel) {
        this.A00 = messageSelectionViewModel;
    }

    public final Bundle BpH() {
        MessageSelectionViewModel messageSelectionViewModel = this.A00;
        AnonymousClass00C.A0D(messageSelectionViewModel, 0);
        C62473Gh r0 = (C62473Gh) messageSelectionViewModel.A00.A04();
        Bundle A07 = AnonymousClass001.A07();
        if (r0 != null) {
            Collection A01 = r0.A01();
            AnonymousClass00C.A08(A01);
            ArrayList A0J = C36321k7.A0J(A01);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1.A0A(A0J, it);
            }
            AnonymousClass3UJ.A0A(A07, A0J);
        }
        return A07;
    }
}
