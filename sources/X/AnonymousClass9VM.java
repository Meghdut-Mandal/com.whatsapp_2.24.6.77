package X;

import com.whatsapp.util.Log;

/* renamed from: X.9VM  reason: invalid class name */
public class AnonymousClass9VM {
    public boolean A00;
    public final /* synthetic */ C1690483a A01;

    public AnonymousClass9VM(C1690483a r1) {
        this.A01 = r1;
    }

    public void A00(Exception exc) {
        C1690483a r3 = this.A01;
        C23112B5r b5r = r3.A02;
        if (b5r != null) {
            C1690483a.A01(r3, new AnonymousClass88Q(exc));
            if (!this.A00) {
                this.A00 = true;
                b5r.BuH("MediaGraphControllerImpl:onMediaGraphRenderError", exc, true);
            }
        }
        if (r3.A06 != null) {
            new AnonymousClass88Q(exc);
            Log.e("CameraProcessor/mediaGraphErrorCallback");
        }
    }
}
