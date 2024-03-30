package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4X7  reason: invalid class name */
public class AnonymousClass4X7 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public AnonymousClass4X7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A02 = obj4;
        this.A03 = obj6;
        this.A04 = obj3;
        this.A05 = obj2;
        this.A01 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A06 != 0) {
            Set set = (Set) this.A03;
            AnonymousClass17Y r7 = (AnonymousClass17Y) this.A04;
            Resources resources = (Resources) this.A05;
            AnonymousClass331 r5 = (AnonymousClass331) this.A01;
            AnonymousClass3SJ.A00((Activity) this.A00, 13);
            ((AnonymousClass1X4) this.A02).A0d(set, true);
            AnonymousClass00C.A0B(resources);
            if (set.size() == 1) {
                r7.A06(R.string.f12nameremoved, 0);
            } else {
                int size = set.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, set.size(), 0);
                r7.A0E(resources.getQuantityString(R.plurals.f10nameremoved, size, objArr), 0);
            }
            if (r5 != null) {
                MyStatusesActivity myStatusesActivity = r5.A00;
                myStatusesActivity.A0x.clear();
                AnonymousClass0V9 r0 = myStatusesActivity.A00;
                if (r0 != null) {
                    r0.A05();
                    return;
                }
                return;
            }
            return;
        }
        C225014r r4 = (C225014r) this.A00;
        AnonymousClass1LV r72 = (AnonymousClass1LV) this.A04;
        Object obj = this.A05;
        r4.Bu2(0, R.string.f12nameremoved);
        Set singleton = Collections.singleton(obj);
        ((C19770wU) this.A01).Box(new C49422j5(new AnonymousClass4ZH(r4, obj, 0), (AnonymousClass012) this.A02, r72, (AnonymousClass1YR) this.A03, singleton), new Object[0]);
    }
}
