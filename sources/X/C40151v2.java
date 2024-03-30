package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1v2  reason: invalid class name and case insensitive filesystem */
public class C40151v2 extends C03760Hp {
    public List A00;
    public final C18820ts A01;
    public final C20810yC A02;
    public final File[] A03;

    public void A03() {
        List list = this.A00;
        if (list != null && !this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        List list = (List) obj;
        if (!this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A14 = C36441kJ.A14(128);
        File[] fileArr = this.A03;
        int i = 0;
        do {
            File[] listFiles = fileArr[i].listFiles(C80093um.A00);
            if (listFiles != null) {
                long A04 = C36401kF.A04(this.A02, 542);
                for (File r0 : listFiles) {
                    AnonymousClass3GY r3 = new AnonymousClass3GY(r0);
                    if (r3.A02 <= A04) {
                        A14.add(r3);
                    }
                }
            }
            i++;
        } while (i < 4);
        Collator A0p = C36361kB.A0p(this.A01);
        A0p.setDecomposition(1);
        Collections.sort(A14, new AnonymousClass4YZ(A0p, 8));
        return A14;
    }

    public C40151v2(Context context, C20690y0 r5, C18820ts r6, C20810yC r7) {
        super(context);
        this.A02 = r7;
        this.A01 = r6;
        File file = r5.A08().A02;
        C20690y0.A07(file, false);
        this.A03 = new File[]{C36441kJ.A0w(Environment.getExternalStorageDirectory(), "Download"), Environment.getExternalStorageDirectory(), file, C36441kJ.A0w(Environment.getExternalStorageDirectory(), "Documents")};
    }

    public void A01() {
        A00();
        this.A00 = null;
    }

    public void A02() {
        A00();
    }
}
