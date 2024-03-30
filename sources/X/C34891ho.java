package X;

import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.updates.ui.UpdatesFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1ho  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C34891ho extends C03030Cw implements C006302t {
    public C34891ho(Object obj) {
        super(1, obj, UpdatesFragment.class, "onStatusSharingInfoChanged", "onStatusSharingInfoChanged(Lcom/whatsapp/status/crossposting/data/StatusSharingInfo;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        C51652oA r1;
        AnonymousClass37T r7 = (AnonymousClass37T) obj;
        UpdatesFragment updatesFragment = (UpdatesFragment) this.receiver;
        Log.i("UpdatesFragment/onStatusSharingInfoChanged");
        if (r7 == null) {
            i = 0;
        } else if (r7.A01 != null) {
            List<Uri> list = updatesFragment.A17;
            for (Uri uri : list) {
                C19630wG r0 = updatesFragment.A0H;
                if (r0 != null) {
                    r0.A00.revokeUriPermission(uri, 1);
                } else {
                    AnonymousClass00C.A0G("waContext");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            }
            list.clear();
            List list2 = r7.A02;
            if (list2 != null) {
                list.addAll(list2);
            }
            if (updatesFragment.A0z) {
                r1 = C51652oA.SHARE_TO_FACEBOOK;
            } else {
                r1 = C51652oA.SHARE_TO_THIRD_PARTY;
            }
            CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = updatesFragment.A0W;
            if (crossPostingUpdatesViewModel == null) {
                AnonymousClass00C.A0G("crosspostingUpdatesViewModel");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C51662oB r3 = C51662oB.UPDATES_FRAGMENT;
            int ordinal = r1.ordinal();
            int i3 = 3;
            if (ordinal == 1) {
                i3 = 2;
            }
            C61103Ao r02 = crossPostingUpdatesViewModel.A04.A00;
            if (r02 != null) {
                r02.A00 = i3;
            }
            updatesFragment.startActivityForResult(r7.A01, 35);
            return AnonymousClass0AJ.A00;
        } else {
            i = r7.A00;
        }
        AnonymousClass17Y A1Z = updatesFragment.A1Z();
        if (i != 0) {
            if (i != 1) {
                i2 = R.string.f12nameremoved;
            } else {
                i2 = R.string.f12nameremoved;
            }
            A1Z.A04(i2, 1);
        } else {
            A1Z.A06(R.string.f12nameremoved, 1);
        }
        return AnonymousClass0AJ.A00;
    }
}
