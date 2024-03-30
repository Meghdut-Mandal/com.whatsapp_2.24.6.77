package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.storage.StorageUsageActivity;

/* renamed from: X.3Tv  reason: invalid class name and case insensitive filesystem */
public class C65883Tv implements C16670pt {
    public Object A00;
    public final int A01;

    public C65883Tv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BvZ(Object obj) {
        boolean A08;
        switch (this.A01) {
            case 0:
                C608139l r4 = (C608139l) this.A00;
                AnonymousClass141 r6 = (AnonymousClass141) obj;
                C220412q r2 = r4.A02;
                A08 = AnonymousClass3UL.A08(r4.A00, r2, r4.A03, r6, (GroupJid) r6.A06(GroupJid.class));
                break;
            case 1:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                AnonymousClass11F r62 = (AnonymousClass11F) obj;
                AnonymousClass16D r0 = storageUsageActivity.A04;
                C18740tg.A06(r62);
                AnonymousClass141 A082 = r0.A08(r62);
                if (A082 == null || !storageUsageActivity.A05.A0h(A082, storageUsageActivity.A0R, true)) {
                    return false;
                }
                return true;
            default:
                int ordinal = ((StorageUsageActivity) this.A00).A0G.ordinal();
                if (ordinal == 2) {
                    return obj instanceof C28981Uw;
                }
                if (ordinal == 1) {
                    A08 = obj instanceof C28981Uw;
                    break;
                } else {
                    return true;
                }
        }
        return !A08;
    }
}
