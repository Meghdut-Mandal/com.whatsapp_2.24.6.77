package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Map;

/* renamed from: X.6bs  reason: invalid class name and case insensitive filesystem */
public final class C134946bs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C133856a6();
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    public Object A00() {
        Bundle bundle = this.A00;
        Map map = AnonymousClass6XY.A00;
        if (C90494aF.A1a("CarApp.Bun")) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unbundling ");
            String str = (String) C36371kC.A0r(AnonymousClass6XY.A00, bundle.getInt("tag_class_type"));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", AnonymousClass000.A0q(str, A0u));
        }
        return AnonymousClass6XY.A02(bundle, new AnonymousClass72K((Object) null, "", new ArrayDeque()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public C134946bs(Object obj) {
        Map map = AnonymousClass6XY.A00;
        String A03 = AnonymousClass6XY.A03(obj.getClass());
        if (C90494aF.A1a("CarApp.Bun")) {
            C90464aC.A1G("Bundling ", A03, "CarApp.Bun", AnonymousClass000.A0u());
        }
        this.A00 = AnonymousClass6XY.A00(new AnonymousClass72K((Object) null, "", new ArrayDeque()), obj, A03);
    }

    public C134946bs(Bundle bundle) {
        this.A00 = bundle;
    }
}
