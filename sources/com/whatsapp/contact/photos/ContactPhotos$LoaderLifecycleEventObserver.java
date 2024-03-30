package com.whatsapp.contact.photos;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass1RY;

public class ContactPhotos$LoaderLifecycleEventObserver implements AnonymousClass01Y {
    public final AnonymousClass1RY A00;

    public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
        if (r2 == AnonymousClass05R.ON_DESTROY) {
            this.A00.A02();
            r3.getLifecycle().A05(this);
        }
    }

    public ContactPhotos$LoaderLifecycleEventObserver(AnonymousClass1RY r1) {
        this.A00 = r1;
    }
}
