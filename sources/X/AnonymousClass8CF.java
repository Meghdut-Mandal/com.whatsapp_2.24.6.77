package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8CF  reason: invalid class name */
public final class AnonymousClass8CF extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205119r8();
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public final String toString() {
        Object valueOf;
        String str;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder A0i = C90524aI.A0i("DataItemParcelable[");
        A0i.append("@");
        C90504aG.A0z(hashCode(), A0i);
        byte[] bArr = this.A00;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        A0i.append(AnonymousClass000.A0p(",dataSz=", valueOf2, C90524aI.A0h(C90474aD.A05(valueOf2) + 8)));
        Map map = this.A02;
        A0i.append(AnonymousClass000.A0r(", numAssets=", C90524aI.A0h(23), map.size()));
        String valueOf3 = String.valueOf(this.A01);
        A0i.append(AnonymousClass000.A0p(", uri=", valueOf3, C90524aI.A0h(C90474aD.A05(valueOf3) + 6)));
        if (!isLoggable) {
            str = "]";
        } else {
            A0i.append("]\n  assets: ");
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                String A0C = AnonymousClass001.A0C(A10);
                String valueOf4 = String.valueOf(map.get(A0C));
                StringBuilder A0h = C90524aI.A0h(C90474aD.A05(A0C) + 7 + C90474aD.A05(valueOf4));
                A0h.append("\n    ");
                A0h.append(A0C);
                A0i.append(AnonymousClass000.A0p(": ", valueOf4, A0h));
            }
            str = "\n  ]";
        }
        return AnonymousClass000.A0q(str, A0i);
    }

    public AnonymousClass8CF(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap A0J = AnonymousClass001.A0J();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            A0J.put(A0C, bundle.getParcelable(A0C));
        }
        this.A02 = A0J;
        this.A00 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0B(parcel, this.A01, 2, i, false);
        Bundle A07 = AnonymousClass001.A07();
        A07.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator A0y = AnonymousClass000.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            A07.putParcelable(C90494aF.A0f(A11), new DataItemAssetParcelable((C22813AwO) A11.getValue()));
        }
        AnonymousClass0Z9.A03(A07, parcel, 4);
        AnonymousClass0Z9.A0F(parcel, this.A00, 5, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
