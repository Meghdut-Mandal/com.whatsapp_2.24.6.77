package X;

import com.whatsapp.R;

public class B6v extends AnonymousClass0UK {
    public Object A00;
    public final int A01;

    public B6v(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int A00(int i) {
        if (this.A01 != 0) {
            int itemViewType = ((C167927zQ) this.A00).A00.getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 1) {
                return 1;
            }
            if (itemViewType == 2 || itemViewType == 3) {
                return 3;
            }
            throw AnonymousClass001.A0E(AnonymousClass000.A0r("Invalid viewType: ", AnonymousClass000.A0u(), itemViewType));
        }
        C167937zR r1 = (C167937zR) this.A00;
        int itemViewType2 = r1.A01.getItemViewType(i);
        if (itemViewType2 == 0 || itemViewType2 == 1 || itemViewType2 == 2 || itemViewType2 == 3) {
            return 4 / r1.A00.getResources().getInteger(R.integer.f8nameremoved);
        }
        if (itemViewType2 == 4 || itemViewType2 == 5) {
            return 4;
        }
        throw AnonymousClass001.A0E(AnonymousClass000.A0r("Invalid viewType: ", AnonymousClass000.A0u(), itemViewType2));
    }
}
