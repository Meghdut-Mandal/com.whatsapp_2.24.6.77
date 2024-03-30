package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.util.List;
import java.util.Set;

/* renamed from: X.1iD  reason: invalid class name and case insensitive filesystem */
public class C35141iD implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35141iD(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onClick(View view) {
        List list;
        switch (this.A03) {
            case 0:
                C33931gA r3 = (C33931gA) this.A00;
                r3.A00(2);
                ((Context) this.A01).startActivity((Intent) this.A02);
                C19420v0.A00(r3.A02).putBoolean("should_show_smb_enforcement_banner", false).apply();
                return;
            case 1:
                C33791fw r4 = (C33791fw) this.A00;
                Uri uri = (Uri) this.A02;
                Context context = ((View) this.A01).getContext();
                AnonymousClass00C.A08(context);
                C33781fv.A00(r4.A03, 2);
                C33791fw.A00(r4);
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri));
                    return;
                } catch (Throwable th) {
                    new AnonymousClass03N(th);
                    return;
                }
            case 2:
                C31951ci r7 = (C31951ci) this.A00;
                List<AnonymousClass11F> list2 = (List) this.A01;
                Object obj = this.A02;
                for (AnonymousClass11F A08 : list2) {
                    r7.A0N.A1k.A08(A08, 0, false);
                }
                r7.A0N.A2u.Boy(new C35321iV(r7, list2, obj, 46));
                return;
            case 3:
                Object obj2 = this.A00;
                View.OnClickListener onClickListener = (View.OnClickListener) this.A01;
                AnonymousClass3ZU r1 = (AnonymousClass3ZU) this.A02;
                AnonymousClass00C.A0D(r1, 2);
                if (!(obj2 == null || (list = r1.A01.A05) == null)) {
                    list.remove(obj2);
                }
                onClickListener.onClick(view);
                return;
            case 4:
                Set set = (Set) this.A01;
                AnonymousClass15K r12 = (AnonymousClass15K) this.A02;
                AnonymousClass00C.A0D(set, 1);
                C34901hp.A01(r12, (C34901hp) this.A00, set);
                return;
            default:
                C35011i0 r5 = (C35011i0) this.A00;
                C122805vS r42 = (C122805vS) this.A01;
                r5.A03.Boy(new C35771jE(this.A02, r5, 23));
                C34901hp.A01(r42.A01, r42.A02, r42.A03);
                return;
        }
    }
}
