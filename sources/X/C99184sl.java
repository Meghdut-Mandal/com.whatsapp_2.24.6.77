package X;

import android.content.Context;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: X.4sl  reason: invalid class name and case insensitive filesystem */
public abstract class C99184sl extends C92744eX implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C99184sl(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass5B9) this).A09 = C36351kA.A0U(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }
}
