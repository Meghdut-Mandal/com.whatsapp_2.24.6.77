package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.location.StopLiveLocationDialogFragment;
import com.whatsapp.textstatus.AddTextStatusActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Xg  reason: invalid class name and case insensitive filesystem */
public class C89624Xg implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public C89624Xg(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A03 != 0) {
            C40691vx r7 = (C40691vx) this.A00;
            String str = this.A01;
            String str2 = this.A02;
            AnonymousClass00C.A0D(r7, 0);
            dialogInterface.dismiss();
            List list = r7.A06;
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C63233Jg r1 = (C63233Jg) it.next();
                if (AnonymousClass00C.A0J(r1.A02, str2) && AnonymousClass00C.A0J(r1.A03, str)) {
                    break;
                }
                i2++;
            }
            list.remove(i2);
            if (list.size() > 0) {
                r7.A09(i2);
            }
            AddTextStatusActivity addTextStatusActivity = r7.A03.A00;
            List list2 = addTextStatusActivity.A0M;
            list2.remove(i2);
            if (list2.isEmpty()) {
                C36341k9.A13(addTextStatusActivity, R.id.suggestions, C36391kE.A09(addTextStatusActivity, R.id.suggestions_list));
                return;
            }
            return;
        }
        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = (StopLiveLocationDialogFragment) this.A00;
        stopLiveLocationDialogFragment.A01.Boy(new C80393vK(stopLiveLocationDialogFragment, this.A01, this.A02, 10));
    }
}
