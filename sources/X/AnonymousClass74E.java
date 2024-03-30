package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.HashMap;

/* renamed from: X.74E  reason: invalid class name */
public class AnonymousClass74E implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;

    public AnonymousClass74E(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A09 = i;
        this.A07 = z;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A08 = z2;
        this.A02 = obj3;
        this.A05 = str2;
        this.A03 = obj4;
        this.A06 = str3;
    }

    public final void run() {
        Intent intent;
        Bundle extras;
        AnonymousClass02E A0N;
        String str;
        String str2;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Intent intent2;
        Bundle extras5;
        AnonymousClass02E A0N2;
        if (this.A09 != 0) {
            boolean z = this.A07;
            Activity activity = (Activity) this.A00;
            C145366tm r7 = (C145366tm) this.A01;
            C594233w r2 = (C594233w) this.A02;
            String str3 = this.A04;
            boolean z2 = this.A08;
            String str4 = this.A05;
            AnonymousClass2Uv r9 = (AnonymousClass2Uv) this.A03;
            String str5 = this.A06;
            String str6 = null;
            if (z) {
                AnonymousClass02E A0N3 = ((AnonymousClass01I) activity).getSupportFragmentManager().A0N("extensions_bottom_sheet_container");
                if (!(A0N3 == null || (A0N2 = A0N3.A0k().A0N("BK_FRAGMENT")) == null)) {
                    ((WaBkExtensionsLayoutViewModel) C36441kJ.A0b(A0N2).A00(WaBkExtensionsLayoutViewModel.class)).A0V(r9, str3, (String) null, str5, r7.A0J);
                }
                r7.A03.A00(r2, "data_exchange").A02("failure", C131866Qy.A01(str3));
                if (z2 && (intent2 = r7.A00.getIntent()) != null && (extras5 = intent2.getExtras()) != null) {
                    String string = extras5.getString("chat_id");
                    String string2 = extras5.getString("message_id");
                    String string3 = extras5.getString("action_name");
                    if (string2 != null && string3 != null) {
                        r7.A0B.Boy(new AnonymousClass73K(r7, string, string2, string3, 5));
                        return;
                    }
                    return;
                }
                return;
            }
            Intent intent3 = activity.getIntent();
            if (intent3 == null || (extras4 = intent3.getExtras()) == null) {
                str = null;
            } else {
                str = extras4.getString("message_id");
            }
            Intent intent4 = activity.getIntent();
            if (intent4 == null || (extras3 = intent4.getExtras()) == null) {
                str2 = null;
            } else {
                str2 = extras3.getString("session_id");
            }
            Intent intent5 = activity.getIntent();
            if (!(intent5 == null || (extras2 = intent5.getExtras()) == null)) {
                str6 = extras2.getString("business_jid");
            }
            HashMap A012 = C131866Qy.A01(str4);
            if (!(!r7.A09.A0E(3216) || str4 == null || str == null || str2 == null)) {
                r7.A0B.Boy(new C80643vj(r7, A012, str, str2, str6, 1));
            }
            r7.A03.A00(r2, "data_exchange").A02("success", A012);
            return;
        }
        boolean z3 = this.A07;
        Activity activity2 = (Activity) this.A00;
        C1260062e r22 = (C1260062e) this.A01;
        String str7 = this.A04;
        boolean z4 = this.A08;
        C145356tl r12 = (C145356tl) this.A02;
        String str8 = this.A05;
        AnonymousClass2Uv r72 = (AnonymousClass2Uv) this.A03;
        String str9 = this.A06;
        if (z3) {
            AnonymousClass02E A0N4 = ((AnonymousClass01I) activity2).getSupportFragmentManager().A0N("extensions_bottom_sheet_container");
            if (!(A0N4 == null || (A0N = A0N4.A0k().A0N("BK_FRAGMENT")) == null)) {
                ((WaBkExtensionsLayoutViewModel) C36441kJ.A0b(A0N).A00(WaBkExtensionsLayoutViewModel.class)).A0V(r72, str7, (String) null, str9, r12.A0G);
            }
            if (r22 != null) {
                HashMap A013 = C131866Qy.A01(str7);
                Object A002 = AnonymousClass6MO.A00(r22.A02, 1);
                if (A002 instanceof AnonymousClass6JJ) {
                    C100674vP r23 = r22.A01;
                    C160377ku r1 = ((AnonymousClass6JJ) A002).A00;
                    C1273868b A032 = C1273868b.A03("failure");
                    A032.A0A(A013, 1);
                    C1273868b.A07(r23, A032, r1);
                }
            }
            if (z4 && (intent = r12.A00.getIntent()) != null && (extras = intent.getExtras()) != null) {
                String string4 = extras.getString("chat_id");
                String string5 = extras.getString("message_id");
                String string6 = extras.getString("action_name");
                if (string5 != null && string6 != null) {
                    r12.A08.Boy(new AnonymousClass73K(r12, string4, string5, string6, 4));
                }
            }
        } else if (r22 != null) {
            HashMap A014 = C131866Qy.A01(str8);
            Object A003 = AnonymousClass6MO.A00(r22.A02, 1);
            if (A003 instanceof AnonymousClass6JJ) {
                C100674vP r24 = r22.A01;
                C160377ku r13 = ((AnonymousClass6JJ) A003).A00;
                C1273868b A033 = C1273868b.A03("success");
                A033.A0A(A014, 1);
                C1273868b.A07(r24, A033, r13);
            }
        }
    }
}
