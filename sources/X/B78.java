package X;

import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.profile.ViewProfilePhoto;

public class B78 extends C32001cn {
    public Object A00;
    public final int A01;

    public B78(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(AnonymousClass11F r4) {
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
