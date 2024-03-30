package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass19J;
import X.AnonymousClass7i8;
import X.C36371kC;
import X.C90514aH;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class OfflineProcessingCompletedRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass19J A00;

    public boolean BMk() {
        return !this.A00.A02();
    }

    public void Bqf(Context context) {
        this.A00 = C90514aH.A0Z(C36371kC.A0P(context));
    }
}
