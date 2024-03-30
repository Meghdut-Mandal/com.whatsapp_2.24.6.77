package X;

import android.content.Context;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;
import java.util.Map;

/* renamed from: X.7px  reason: invalid class name and case insensitive filesystem */
public class C163287px implements AnonymousClass4RB {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163287px(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void Bfc(Context context) {
        if (this.A02 != 0) {
            BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = (BusinessDirectoryPopularApiBusinessesViewModel) this.A00;
            C144416s9 r1 = (C144416s9) this.A01;
            AnonymousClass00C.A0D(r1, 1);
            businessDirectoryPopularApiBusinessesViewModel.A01.A08((Integer) null, C36371kC.A0p(), (Map) null, 13, 90, 1);
            businessDirectoryPopularApiBusinessesViewModel.A02.A00(context, r1);
            return;
        }
        C121355t0 r3 = (C121355t0) this.A00;
        C144416s9 r2 = (C144416s9) this.A01;
        AnonymousClass00C.A0D(r2, 1);
        r3.A01.A01(C24801Dv.A00(context), r2);
        r3.A02.A0C(r2);
    }
}
