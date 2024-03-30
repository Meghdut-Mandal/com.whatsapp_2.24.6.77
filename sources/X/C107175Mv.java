package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Mv  reason: invalid class name and case insensitive filesystem */
public class C107175Mv extends C132446Tt {
    public C160517l8 A00;
    public final AnonymousClass1AP A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C160517l8 r0 = this.A00;
        if (r0 != null) {
            r0.Bc7();
        }
        this.A00 = null;
    }

    public Void A0G(Void... voidArr) {
        C91494c6 r5 = this.A02;
        if (!r5.isCancelled()) {
            AnonymousClass1AP r4 = this.A01;
            List A0A = r4.A0A();
            if (!r5.isCancelled()) {
                ArrayList A07 = r4.A07();
                if (!r5.isCancelled()) {
                    A0F(new C1512378t(A0A, A07));
                    if (!r5.isCancelled()) {
                        ArrayList A09 = r4.A09(new C117885mz(this));
                        HashSet A16 = C36441kJ.A16();
                        Iterator it = A09.iterator();
                        while (it.hasNext()) {
                            A16.add(C90514aH.A0g(it).A0F);
                        }
                        Iterator it2 = A07.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass68B A0g = C90514aH.A0g(it2);
                            String str = A0g.A0F;
                            if (!A16.contains(str)) {
                                C36321k7.A1P("LoadStickerPickerPacksAsyncTask/doInBackground failed to load pack ", str, AnonymousClass000.A0u());
                                A0F(A0g);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public C107175Mv(AnonymousClass1AP r1) {
        this.A01 = r1;
    }

    public C107175Mv(AnonymousClass1AP r1, C160517l8 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
