package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0UA  reason: invalid class name */
public final class AnonymousClass0UA {
    public int A00;
    public ArrayList A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public final PendingIntent A04;
    public final Bundle A05;
    public final IconCompat A06;
    public final CharSequence A07;

    public AnonymousClass0UA(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat A022 = IconCompat.A02((Resources) null, "", i);
        Bundle A072 = AnonymousClass001.A07();
        this.A06 = A022;
        this.A07 = C07700Yy.A04(charSequence);
        this.A04 = pendingIntent;
        this.A05 = A072;
        this.A01 = null;
        this.A02 = true;
        this.A00 = 0;
        this.A03 = true;
    }

    public C07250Wx A00() {
        AnonymousClass0TH[] r6;
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0I2.add(it.next());
            }
        }
        AnonymousClass0TH[] r5 = null;
        if (A0I.isEmpty()) {
            r6 = null;
        } else {
            r6 = (AnonymousClass0TH[]) A0I.toArray(new AnonymousClass0TH[A0I.size()]);
        }
        if (!A0I2.isEmpty()) {
            r5 = (AnonymousClass0TH[]) A0I2.toArray(new AnonymousClass0TH[A0I2.size()]);
        }
        return new C07250Wx(this.A04, this.A05, this.A06, this.A07, r5, r6, this.A00, this.A02, this.A03);
    }
}
