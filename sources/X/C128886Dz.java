package X;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Dz  reason: invalid class name and case insensitive filesystem */
public class C128886Dz {
    public int A00 = 1;
    public int A01 = 1;
    public C88924Uo A02;
    public C132366Tg A03 = new C132366Tg();
    public boolean A04;
    public boolean A05 = false;
    public final C21060yb A06;
    public final AnonymousClass1YL A07;
    public final List A08 = AnonymousClass001.A0I();
    public final Set A09 = C36441kJ.A17();
    public final Context A0A;

    public void A00() {
        List<C162037nv> list = this.A08;
        if (!list.isEmpty()) {
            for (C162037nv BBo : list) {
                File BBo2 = BBo.BBo();
                if (!BBo2.delete()) {
                    C36321k7.A1L(BBo2, "camerastatemanager/cannot-delete-file ", AnonymousClass000.A0u());
                }
            }
            list.clear();
        }
    }

    public boolean A01() {
        return AnonymousClass000.A1S(this.A00, 2);
    }

    public C128886Dz(C21060yb r2, C19630wG r3, AnonymousClass1YL r4) {
        this.A0A = r3.A00;
        this.A07 = r4;
        this.A06 = r2;
    }

    public boolean A02(Collection collection) {
        for (Object next : collection) {
            Iterator it = this.A08.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (next.equals(((AnonymousClass4V2) it.next()).B7k())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
