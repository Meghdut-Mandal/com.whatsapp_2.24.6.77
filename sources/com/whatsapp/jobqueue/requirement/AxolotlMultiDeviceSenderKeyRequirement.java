package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass144;
import X.AnonymousClass17X;
import X.C18800tq;
import X.C19730wQ;
import X.C20810yC;
import X.C220412q;
import X.C232617u;
import X.C36351kA;
import X.C90464aC;
import android.content.Context;
import java.util.Set;

public class AxolotlMultiDeviceSenderKeyRequirement extends AxolotlMultiDeviceSessionRequirement {
    public static final long serialVersionUID = 1;
    public transient C19730wQ A00;
    public transient C220412q A01;
    public transient C232617u A02;
    public transient AnonymousClass17X A03;
    public transient C20810yC A04;
    public final String groupParticipantHash;
    public final boolean useLidForEncryption;
    public final boolean useParticipantUserHash;

    public AxolotlMultiDeviceSenderKeyRequirement(AnonymousClass144 r7, Boolean bool, String str, String str2, Set set, int i, boolean z, boolean z2) {
        super(r7, bool, str, set, i);
        this.groupParticipantHash = str2;
        this.useLidForEncryption = z;
        this.useParticipantUserHash = z2;
    }

    public void Bqf(Context context) {
        super.Bqf(context);
        C18800tq A0I = C90464aC.A0I(context);
        this.A04 = A0I.Azp();
        this.A00 = C36351kA.A0N(A0I);
        this.A01 = C36351kA.A0a(A0I);
        this.A02 = (C232617u) A0I.A3u.get();
        this.A03 = C36351kA.A0b(A0I);
    }
}
