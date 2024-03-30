package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4Zy  reason: invalid class name and case insensitive filesystem */
public class C90324Zy implements C88564Te {
    public Object A00;
    public final int A01;

    public C90324Zy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXj(Map map) {
        if (this.A01 != 0) {
            Iterator A0z = AnonymousClass000.A0z(map);
            while (A0z.hasNext()) {
                Log.e(A0z.next().toString());
            }
            C39471sS r2 = (C39471sS) this.A00;
            C145166tS r0 = r2.A01;
            if (r0 != null) {
                C39471sS.A03(r2, (AnonymousClass11F) null, r0.A0Z);
            }
        }
    }

    public void BXk(AnonymousClass3XW r11) {
        String str;
        String str2;
        if (this.A01 != 0) {
            C39471sS r2 = (C39471sS) this.A00;
            C145166tS r1 = r2.A01;
            if (r1 != null && (r1 instanceof AnonymousClass28T)) {
                AnonymousClass28T r12 = (AnonymousClass28T) r1;
                r12.A00 = r11;
                String str3 = r11.A03;
                if (str3 != null) {
                    r12.A0F = str3;
                }
                String str4 = r11.A01;
                if (str4 != null) {
                    r12.A0C = str4;
                }
                byte[] A002 = r11.A00();
                if (A002 != null) {
                    r12.A0Q = A002;
                }
                C39471sS.A01(r2.A01, r2, C52492pW.SMALL_THUMBNAIL_LOADED);
                return;
            }
            return;
        }
        String str5 = r11.A03;
        if ((str5 != null && str5.length() != 0) || (((str = r11.A01) != null && str.length() != 0) || ((str2 = r11.A02) != null && str2.length() != 0))) {
            AnonymousClass28e r13 = (AnonymousClass28e) this.A00;
            r13.A0B.A0X((AnonymousClass3T1) null, r11.A00, str5, r11.A01, r13.A04.getString(R.string.f12nameremoved), Collections.singletonList(r13.A0K), r11.A00());
        }
    }
}
