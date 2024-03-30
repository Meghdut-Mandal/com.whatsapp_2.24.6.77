package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.9Xp  reason: invalid class name and case insensitive filesystem */
public class C196089Xp {
    public boolean A00 = false;
    public final C195119So A01;
    public final AnonymousClass9R1 A02;
    public final Set A03;

    public void A01(ImageView imageView, C206759tv r20, C22914AyQ ayQ, AnonymousClass9HG r22, C22915AyR ayR, C22916AyS ayS, int i) {
        Integer num;
        UserJid userJid = null;
        AnonymousClass9HG r5 = r22;
        if (r22 != null) {
            AnonymousClass9ED r0 = r5.A00;
            AnonymousClass9R1 r4 = this.A02;
            int i2 = r0.A00;
            num = Integer.valueOf(r4.A00.A02(i2));
            r4.A01.put(num, Integer.valueOf(i2));
            userJid = r5.A01;
        } else {
            num = null;
        }
        C206759tv r8 = r20;
        C22915AyR ayR2 = ayR;
        C21097A8i a8i = new C21097A8i(imageView, r8, new C23152B7m(ayQ, this, 0), new A99(r8, ayR2, this, userJid, num), new A9C(ayS, this, userJid, num), i, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (!TextUtils.isEmpty(a8i.BIk())) {
            C195119So r42 = this.A01;
            if (r42.A01 != null) {
                ImageView BCZ = a8i.BCZ();
                if (BCZ != null) {
                    BCZ.setTag(R.id.image_id, a8i.A05.A04);
                    BCZ.setTag(R.id.image_quality, Integer.valueOf(a8i.A04));
                    if (!a8i.BIk().equals(BCZ.getTag(R.id.loaded_image_url))) {
                        BCZ.setTag(R.id.loaded_image_url, (Object) null);
                    }
                }
                r42.A01.A01(a8i, true);
            }
        } else if (ayR != null) {
            if (!(userJid == null || num == null)) {
                this.A02.A00(userJid, num.intValue());
            }
            ayR2.BZx(a8i);
        }
    }

    public void A02(ImageView imageView, C206759tv r10, C22914AyQ ayQ, C22916AyS ayS, int i) {
        A01(imageView, r10, ayQ, (AnonymousClass9HG) null, (C22915AyR) null, ayS, i);
    }

    public void A00() {
        C102164zP r1;
        if (!this.A00) {
            Set<C21097A8i> set = this.A03;
            for (C21097A8i A002 : set) {
                this.A01.A00(A002);
            }
            set.clear();
            C195119So r2 = this.A01;
            if (r2.A0B.decrementAndGet() == 0 && (r1 = r2.A01) != null) {
                r1.A02(false);
                r2.A01 = null;
            }
            this.A00 = true;
        }
    }

    public C196089Xp(C195119So r3, AnonymousClass9R1 r4) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = C36441kJ.A16();
        AVW.A00(r3.A0A, r3, 11);
    }

    public void finalize() {
        super.finalize();
    }
}
