package X;

import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.6ug  reason: invalid class name and case insensitive filesystem */
public class C145886ug implements C159487jR {
    public final float A00;
    public final LatLng A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;
    public final /* synthetic */ C1272067j A05;

    public C145886ug(LatLng latLng, C159287j7 r3, C1272067j r4, String str, String str2, float f) {
        this.A05 = r4;
        this.A01 = latLng;
        this.A03 = str;
        this.A00 = f;
        this.A02 = str2;
        this.A04 = AnonymousClass001.A0F(r3);
    }

    public void BWx(C1261662u r2, int i) {
        C159287j7 r0 = (C159287j7) this.A04.get();
        if (r0 != null) {
            r0.BZ6(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C116775lB r7 = (C116775lB) obj;
        LatLng latLng = this.A01;
        double d = latLng.A00;
        double d2 = latLng.A01;
        ArrayList A032 = C132796Vh.A03(d, d2, 14);
        C18740tg.A06(A032);
        String A022 = C132796Vh.A02((Long) C36391kE.A0t(A032), (Long) C90514aH.A0r(A032), 14);
        C159287j7 r9 = (C159287j7) this.A04.get();
        if (r9 != null) {
            Map map = r7.A00;
            if (map.containsKey(A022)) {
                i = C90474aD.A06(A022, map);
            } else {
                i = 10;
            }
            String str = this.A02;
            ArrayList A033 = C132796Vh.A03(d, d2, i);
            C18740tg.A06(A033);
            ArrayList A042 = C132796Vh.A04(i, C36431kI.A09(A033.get(0)), C36431kI.A09(A033.get(1)));
            LatLng A0S = C90484aE.A0S((Number) A042.get(1), C90504aG.A01(A042.get(0)));
            double A012 = C132796Vh.A01(A033, i);
            String str2 = this.A03;
            double d3 = (double) this.A00;
            AnonymousClass6QG r11 = new AnonymousClass6QG(Double.valueOf(A012 + d3), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(A0S.A00), Double.valueOf(A0S.A01), Double.valueOf(d3), str2, (String) null, str);
            r11.A00 = i;
            r9.BZ7(r11);
        }
    }
}
