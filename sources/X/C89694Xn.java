package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4Xn  reason: invalid class name and case insensitive filesystem */
public class C89694Xn implements MenuItem.OnMenuItemClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C89694Xn(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C65363Rt r7;
        AnonymousClass155 r6;
        UserJid userJid;
        boolean z;
        switch (this.A03) {
            case 0:
                r7 = (C65363Rt) this.A00;
                r6 = (AnonymousClass155) this.A01;
                userJid = (UserJid) this.A02;
                z = true;
                break;
            case 1:
                r7 = (C65363Rt) this.A00;
                r6 = (AnonymousClass155) this.A01;
                userJid = (UserJid) this.A02;
                z = false;
                break;
            default:
                Intent intent = (Intent) this.A00;
                AnonymousClass00C.A0D(intent, 0);
                ActivityInfo activityInfo = ((ResolveInfo) this.A01).activityInfo;
                C36421kH.A0o(intent, activityInfo.packageName, activityInfo.name);
                ((C224914p) this.A02).startActivityForResult(intent, 91);
                return false;
        }
        AnonymousClass00C.A0D(userJid, 2);
        try {
            r6.startActivityForResult(r7.A04.A03(r7.A01.A0D(userJid), userJid, z), 10);
            r7.A03.A03(z, 8);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("BaseMemberContextMenuHelper/startAddOrEditContact Exception while launching add to contacts", e);
            r7.A00.A06(R.string.f12nameremoved, 0);
            return true;
        }
    }
}
