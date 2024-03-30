package X;

import com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$addRecentEmojiShape$1;
import com.whatsapp.util.Log;
import java.io.RandomAccessFile;

/* renamed from: X.7su  reason: invalid class name and case insensitive filesystem */
public class C165117su implements AnonymousClass00P, C006302t {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C165117su(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A05 = i;
        this.A00 = obj3;
        this.A01 = obj4;
        this.A02 = obj;
        this.A03 = obj5;
        this.A04 = obj2;
    }

    public final Object invoke(Object obj) {
        if (this.A05 != 0) {
            int[] iArr = (int[]) this.A03;
            C123875xE r4 = (C123875xE) ((AnonymousClass005) this.A01).get();
            AnonymousClass01N r0 = ((AnonymousClass01G) this.A02).A06;
            C36321k7.A0w(r0, iArr);
            C36381kD.A1R(r4.A04, new ExpressionsShapeCreator$addRecentEmojiShape$1(r4, (C023509x) null, iArr), C33321f6.A00(r0));
            ((AnonymousClass3UT) this.A04).A08();
            ((C142386on) this.A00).A03.BgS((C129196Ft) obj);
            return AnonymousClass0AJ.A00;
        }
        C133176Xc r3 = (C133176Xc) this.A00;
        C1261162p r2 = (C1261162p) this.A01;
        AnonymousClass6QJ r42 = (AnonymousClass6QJ) this.A02;
        Number number = (Number) obj;
        try {
            C133176Xc.A01(r2, r3, r42, (RandomAccessFile) this.A03, (RandomAccessFile) this.A04, number.intValue());
            return new AnonymousClass6AM((Exception) null, AnonymousClass0AJ.A00);
        } catch (Exception e) {
            r3.A02 = e;
            if (e instanceof AnonymousClass1GY) {
                r3.A07.A0U(C90484aE.A0h(number), r3.A0R, r3.A0I.A05, r42.A01, true);
            } else if (e instanceof C108605Ue) {
                Log.w("StreamMediaDownloadHandler/stream check failed");
                r3.A0H.A09(1);
            }
            return new AnonymousClass6AM(e, (Object) null);
        }
    }
}
