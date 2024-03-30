package X;

import android.os.Handler;
import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.Afp  reason: case insensitive filesystem */
public final class C22042Afp extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C202559mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22042Afp(C202559mB r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C202559mB r5 = this.this$0;
        synchronized (r5.A0A) {
            if (r5.A0E.get()) {
                r5.A0G.invoke(new AnonymousClass89K("Unable to encrypt, link setup has been detached"));
            } else {
                AnonymousClass6YR.A06("LinkSetup", "Setting up encryption...");
                Handler handler = r5.A03;
                if (handler != null) {
                    handler.postDelayed(r5.A0C, 3000);
                }
                synchronized (r5.A0B) {
                    if (r5.A01 == null) {
                        C22313Akb akb = new C22313Akb(r5);
                        CipherBuilder cipherBuilder = new CipherBuilder();
                        akb.invoke(cipherBuilder);
                        r5.A01 = cipherBuilder;
                    }
                }
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
