package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.group.ExitGroupsDialogFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4X8  reason: invalid class name */
public class AnonymousClass4X8 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public AnonymousClass4X8(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A05 = i2;
        this.A01 = obj2;
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A05 != 0) {
            ExitGroupsDialogFragment exitGroupsDialogFragment = (ExitGroupsDialogFragment) this.A01;
            int i2 = this.A00;
            List list = (List) this.A02;
            Object obj = this.A03;
            String str = this.A04;
            Log.i("LeaveGroupsDialogFragment/user-try-leaveGroup");
            boolean A09 = exitGroupsDialogFragment.A01.A09();
            AnonymousClass17Y r2 = exitGroupsDialogFragment.A00;
            if (A09) {
                if (i2 != 1) {
                    r2.A05(R.string.f12nameremoved, R.string.f12nameremoved);
                    if (i2 == 2) {
                        exitGroupsDialogFragment.A1C(C36371kC.A0C(exitGroupsDialogFragment.A1D()));
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F A0a = C36401kF.A0a(it);
                    C36321k7.A1K(A0a, "LeaveGroupsDialogFragment/exit/group:", AnonymousClass000.A0u());
                    exitGroupsDialogFragment.A08.A04(A0a, true);
                    exitGroupsDialogFragment.A0F.Boy(new C81263wj(exitGroupsDialogFragment, obj, A0a, str, i2, 3));
                }
            } else {
                r2.A06(R.string.f12nameremoved, 0);
            }
            C19420v0 r3 = exitGroupsDialogFragment.A05;
            C36321k7.A0q(r3, "delete_chat_count", C36371kC.A01(C36341k9.A0E(r3), "delete_chat_count") + list.size());
            if (i2 == 1) {
                exitGroupsDialogFragment.A08.A01(2);
            }
            exitGroupsDialogFragment.A1b();
            return;
        }
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = (SingleChoiceListDialogFragment) this.A01;
        boolean[] zArr = (boolean[]) this.A02;
        int i3 = this.A00;
        String[] strArr = (String[]) this.A03;
        String str2 = this.A04;
        int i4 = i;
        if (zArr == null || zArr[i]) {
            singleChoiceListDialogFragment.A01.Bgl(strArr, i3, i4);
            singleChoiceListDialogFragment.A02.set(true);
            dialogInterface.dismiss();
        } else if (str2 != null) {
            singleChoiceListDialogFragment.A00.A0E(str2, 0);
        }
    }
}
