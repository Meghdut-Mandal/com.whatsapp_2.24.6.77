package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8r7  reason: invalid class name and case insensitive filesystem */
public class C183638r7 extends C132446Tt {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    public C183638r7(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, String str, ArrayList arrayList, List list) {
        ArrayList arrayList2;
        this.A03 = indiaUpiBankPickerActivity;
        if (arrayList != null) {
            arrayList2 = C36441kJ.A15(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A01 = arrayList2;
        this.A00 = str;
        this.A02 = list;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        View view;
        List list = (List) obj;
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A03;
        indiaUpiBankPickerActivity.A07 = null;
        if (list.isEmpty()) {
            TextView textView = indiaUpiBankPickerActivity.A01;
            Object[] A0L = AnonymousClass001.A0L();
            A0L[0] = indiaUpiBankPickerActivity.A09;
            C36341k9.A0s(indiaUpiBankPickerActivity, textView, A0L, R.string.f12nameremoved);
            indiaUpiBankPickerActivity.A01.setVisibility(0);
            view = indiaUpiBankPickerActivity.A02;
        } else {
            indiaUpiBankPickerActivity.A02.setVisibility(0);
            view = indiaUpiBankPickerActivity.A01;
        }
        view.setVisibility(8);
        indiaUpiBankPickerActivity.A04.setVisibility(8);
        indiaUpiBankPickerActivity.A03.setVisibility(8);
        indiaUpiBankPickerActivity.A06.A0L(list);
        indiaUpiBankPickerActivity.A02.A0h(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r18) {
        /*
            r17 = this;
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            r8 = r17
            java.util.ArrayList r7 = r8.A01
            if (r7 == 0) goto L_0x0010
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x0010:
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r0 = r8.A03
            java.util.List r0 = r0.A0B
            if (r0 == 0) goto L_0x001a
            r9.addAll(r0)
        L_0x0019:
            return r9
        L_0x001a:
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L_0x0019
            java.util.Iterator r16 = r0.iterator()
        L_0x0022:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r6 = r16.next()
            X.8b6 r6 = (X.C175818b6) r6
            X.6c7 r0 = r6.A01
            java.lang.Object r2 = X.C165577te.A0g(r0)
            java.lang.String r2 = (java.lang.String) r2
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r3 = r8.A03
            X.0ts r1 = r3.A00
            r0 = 1
            boolean r0 = X.C202859mm.A04(r1, r2, r7, r0)
            if (r0 != 0) goto L_0x00b2
            X.6c7 r0 = r6.A01
            java.lang.Object r1 = X.C165577te.A0g(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r8.A00
            X.0ts r3 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r12 = 0
            if (r0 != 0) goto L_0x00bc
            java.util.regex.Pattern r0 = X.C202859mm.A01
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = " "
            java.lang.String r11 = r1.replaceAll(r0)
            java.util.regex.Pattern r0 = X.C1906699v.A00
            boolean r0 = X.C165587tf.A1a(r11, r0)
            r15 = r0 ^ 1
            if (r15 == 0) goto L_0x006e
            java.lang.String r11 = X.AnonymousClass14B.A06(r11)
        L_0x006e:
            java.text.BreakIterator r10 = X.C202859mm.A02(r3)
            r10.setText(r11)
            int r14 = r10.first()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = X.AnonymousClass14B.A06(r2)
        L_0x0083:
            char[] r5 = r0.toCharArray()
            int r4 = r5.length
            r3 = 0
        L_0x0089:
            if (r3 >= r4) goto L_0x00b2
            char r2 = r5[r3]
        L_0x008d:
            int r13 = r10.next()
            r1 = r14
            r14 = r13
            r0 = -1
            if (r13 == r0) goto L_0x00bc
            java.lang.String r1 = r11.substring(r1, r13)
            if (r15 != 0) goto L_0x00a0
            java.lang.String r1 = X.AnonymousClass14B.A06(r1)
        L_0x00a0:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008d
            char r0 = r1.charAt(r12)
            if (r2 != r0) goto L_0x008d
            int r3 = r3 + 1
            goto L_0x0089
        L_0x00af:
            java.lang.String r0 = ""
            goto L_0x0083
        L_0x00b2:
            r2 = 3
            r1 = 0
            X.66u r0 = new X.66u
            r0.<init>(r6, r1, r2)
            r9.add(r0)
        L_0x00bc:
            X.4c6 r0 = r8.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0022
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183638r7.A08(java.lang.Object[]):java.lang.Object");
    }
}
