package X;

import com.whatsapp.R;
import com.whatsapp.blocklist.BlockList;

/* renamed from: X.B9h  reason: case insensitive filesystem */
public class C23199B9h implements C22952Az4 {
    public Object A00;
    public final int A01;

    public C23199B9h(BlockList blockList, int i) {
        this.A01 = i;
        this.A00 = blockList;
    }

    public final void Bf8(C202059ky r4) {
        int i = this.A01;
        BlockList blockList = (BlockList) this.A00;
        if (i != 0) {
            if (r4 == null) {
                AVW.A00(blockList.A04, blockList, 25);
            } else {
                blockList.BO5(R.string.f12nameremoved);
            }
        } else if (r4 == null) {
            AVW.A00(blockList.A04, blockList, 25);
        }
    }
}
