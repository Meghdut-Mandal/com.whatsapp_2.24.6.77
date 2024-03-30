package X;

/* renamed from: X.1SW  reason: invalid class name */
public class AnonymousClass1SW {
    public final C20810yC A00;
    public final AnonymousClass1EJ A01;
    public final AnonymousClass1QB A02;
    public final C19930wk A03;

    public AnonymousClass1SW(C20810yC r3, AnonymousClass1EJ r4, AnonymousClass1QB r5, C19770wU r6) {
        this.A00 = r3;
        this.A03 = new C19930wk(r6, true);
        this.A02 = r5;
        this.A01 = r4;
    }

    public void A00(AnonymousClass3T1 r5, Runnable runnable) {
        C63683Kz A0V = r5.A0V();
        boolean z = false;
        if (A0V != null) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FMessageThumbnailAsyncLoader/loadAsync/should not be called for a message that doesn't support thumbnails. Message type = ");
        sb.append(r5.A1I);
        C18740tg.A0D(z, sb.toString());
        if (A0V == null) {
            return;
        }
        if (A0V.A01()) {
            runnable.run();
        } else {
            this.A03.execute(new C35631j0(this, r5, runnable, 17));
        }
    }
}
