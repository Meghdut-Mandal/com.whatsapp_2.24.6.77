package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.profile.ViewProfilePhoto;
import java.util.Set;

public class B7E extends C24511Cs {
    public Object A00;
    public final int A01;

    public B7E(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A06(Set set) {
        switch (this.A01) {
            case 0:
                C173788Ta.A0w((C173788Ta) this.A00);
                return;
            case 1:
                ((BusinessProfileExtraFieldsActivity) this.A00).A3i();
                return;
            case 2:
                BlockList blockList = (BlockList) this.A00;
                AVW.A00(blockList.A04, blockList, 25);
                return;
            default:
                ViewProfilePhoto.A01((ViewProfilePhoto) this.A00);
                return;
        }
    }
}
