package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.2JT  reason: invalid class name */
public final class AnonymousClass2JT extends C70813fl {
    public final MyStatusesActivity A00;
    public final C43702Jm A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JT(AnonymousClass3C3 r4, MyStatusesActivity myStatusesActivity, C43702Jm r6) {
        super(r4.A00(myStatusesActivity));
        AnonymousClass00C.A0D(r4, 1);
        this.A00 = myStatusesActivity;
        this.A01 = r6;
    }

    public boolean B73(AnonymousClass4Q1 r7, Collection collection, int i) {
        AnonymousClass00C.A0D(collection, 1);
        if (i == 13) {
            C47622fE r5 = this.A01.A03;
            MyStatusesActivity myStatusesActivity = this.A00;
            ArrayList A15 = C36441kJ.A15(collection);
            int i2 = 6;
            if (collection.size() > 1) {
                i2 = 7;
            }
            Integer valueOf = Integer.valueOf(i2);
            collection.size();
            myStatusesActivity.A3k(C51672oC.FACEBOOK_SHARE, valueOf, A15);
            if (collection.size() <= 15 || !r5.A01.A00()) {
                return true;
            }
            return false;
        } else if (i == 14) {
            this.A00.A3k(C51672oC.THIRD_PARTY_SHARE, (Integer) null, C36441kJ.A15(collection));
            return true;
        } else if (i == 21) {
            return this.A01.A01.A00(this.A00, collection);
        } else {
            if (i != 36) {
                return super.B73(r7, collection, i);
            }
            MyStatusesActivity myStatusesActivity2 = this.A00;
            ArrayList A152 = C36441kJ.A15(collection);
            int i3 = 6;
            if (collection.size() > 1) {
                i3 = 7;
            }
            Integer valueOf2 = Integer.valueOf(i3);
            collection.size();
            myStatusesActivity2.A3k(C51672oC.INSTAGRAM_SHARE, valueOf2, A152);
            if (collection.size() <= 15) {
                return true;
            }
            return false;
        }
    }
}
