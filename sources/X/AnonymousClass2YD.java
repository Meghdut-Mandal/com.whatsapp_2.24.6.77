package X;

import android.content.Context;

/* renamed from: X.2YD  reason: invalid class name */
public abstract class AnonymousClass2YD extends C22726Aue {
    public transient C220412q A00;
    public transient C26141Ja A01;
    public transient C27591Ow A02;
    public transient AnonymousClass1ZL A03;
    public AnonymousClass4UA callback;
    public final boolean filterOutSubscribedChannels;

    public boolean A0D(Exception exc) {
        return false;
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.Bqf(context);
        C18800tq A0P = C36371kC.A0P(context);
        C220412q A0a = C36351kA.A0a(A0P);
        AnonymousClass00C.A0D(A0a, 0);
        this.A00 = A0a;
        C27591Ow A0g = C36391kE.A0g(A0P);
        AnonymousClass00C.A0D(A0g, 0);
        this.A02 = A0g;
        C26141Ja r0 = (C26141Ja) A0P.A5m.get();
        AnonymousClass00C.A0D(r0, 0);
        this.A01 = r0;
        this.A03 = A0P.Azc();
    }

    public void A09() {
        if (!(this instanceof AnonymousClass2YB)) {
            C27591Ow r0 = this.A02;
            if (r0 == null) {
                throw C36331k8.A0d("graphQlClient");
            } else if (!r0.A03.A0I()) {
                AnonymousClass4UA r1 = this.callback;
                if (r1 != null) {
                    r1.BWe(new C178228fO());
                }
                this.callback = null;
            }
        }
    }

    public void A0A() {
        if (!this.isCancelled) {
            this.callback = null;
        }
    }

    public AnonymousClass2YD(AnonymousClass4UA r1, String str, boolean z) {
        super(str);
        this.callback = r1;
        this.filterOutSubscribedChannels = z;
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
