package com.whatsapp.calling;

import X.AnonymousClass6VN;
import X.AnonymousClass75B;
import X.C81223wf;

public class MultiNetworkCallback {
    public final AnonymousClass6VN provider;

    public void closeAlternativeSocket(boolean z) {
        AnonymousClass6VN r3 = this.provider;
        r3.A07.execute(new AnonymousClass75B(r3, 13, z));
    }

    public void createAlternativeSocket(boolean z, boolean z2) {
        AnonymousClass6VN r3 = this.provider;
        r3.A07.execute(new C81223wf(r3, 1, z2, z));
    }

    public MultiNetworkCallback(AnonymousClass6VN r1) {
        this.provider = r1;
    }
}
