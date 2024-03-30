package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.07k  reason: invalid class name and case insensitive filesystem */
public class C017307k extends AnonymousClass054 {
    public boolean A00 = false;
    public int A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03 = true;
    public int A04 = 0;

    public /* bridge */ /* synthetic */ AnonymousClass054 A09(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AnonymousClass054) arrayList.get(i)).A09(view);
                i++;
            } else {
                super.A09(view);
                return this;
            }
        }
    }

    public void A0Z(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AnonymousClass054) arrayList.get(i)).A08(view);
                i++;
            } else {
                super.A08(view);
                return;
            }
        }
    }

    public void A0G() {
        ArrayList arrayList;
        if (this.A02.isEmpty()) {
            A0I();
            A0F();
            return;
        }
        AnonymousClass0IR r2 = new AnonymousClass0IR(this);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((AnonymousClass054) it.next()).A0A(r2);
        }
        this.A01 = this.A02.size();
        if (!this.A03) {
            int i = 1;
            while (true) {
                arrayList = this.A02;
                if (i >= arrayList.size()) {
                    break;
                }
                ((AnonymousClass054) arrayList.get(i - 1)).A0A(new C18220so(arrayList.get(i), this, 1));
                i++;
            }
            AnonymousClass054 r0 = (AnonymousClass054) arrayList.get(0);
            if (r0 != null) {
                r0.A0G();
                return;
            }
            return;
        }
        Iterator it2 = this.A02.iterator();
        while (it2.hasNext()) {
            ((AnonymousClass054) it2.next()).A0G();
        }
    }

    public void A0M(ViewGroup viewGroup, AnonymousClass05B r17, AnonymousClass05B r18, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.A02;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass054 r9 = (AnonymousClass054) this.A02.get(i);
            if (j > 0 && (this.A03 || i == 0)) {
                long j2 = r9.A02;
                if (j2 > 0) {
                    r9.A02 = j2 + j;
                } else {
                    r9.A02 = j;
                }
            }
            r9.A0M(viewGroup, r17, r18, arrayList, arrayList2);
        }
    }

    public void A0P(AnonymousClass0TZ r4) {
        this.A05 = r4;
        this.A04 |= 8;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0P(r4);
        }
    }

    public void A0Q(AnonymousClass05C r4) {
        this.A06 = r4;
        this.A04 |= 2;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0Q(r4);
        }
    }

    public void A0S(AnonymousClass0X9 r5) {
        View view = r5.A00;
        if (A0U(view)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                AnonymousClass054 r1 = (AnonymousClass054) it.next();
                if (r1.A0U(view)) {
                    r1.A0S(r5);
                    r5.A01.add(r1);
                }
            }
        }
    }

    public void A0T(AnonymousClass0X9 r5) {
        View view = r5.A00;
        if (A0U(view)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                AnonymousClass054 r1 = (AnonymousClass054) it.next();
                if (r1.A0U(view)) {
                    r1.A0T(r5);
                    r5.A01.add(r1);
                }
            }
        }
    }

    public void A0X(long j) {
        ArrayList arrayList;
        this.A01 = j;
        if (j >= 0 && (arrayList = this.A02) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass054) this.A02.get(i)).A06(j);
            }
        }
    }

    public void A0Y(TimeInterpolator timeInterpolator) {
        this.A04 |= 1;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass054) this.A02.get(i)).A07(timeInterpolator);
            }
        }
        this.A03 = timeInterpolator;
    }

    public void A0a(AnonymousClass054 r6) {
        this.A02.add(r6);
        r6.A07 = this;
        long j = this.A01;
        if (j >= 0) {
            r6.A06(j);
        }
        if ((this.A04 & 1) != 0) {
            r6.A07(this.A03);
        }
        if ((this.A04 & 2) != 0) {
            r6.A0Q(this.A06);
        }
        if ((this.A04 & 4) != 0) {
            r6.A0O(this.A04);
        }
        if ((this.A04 & 8) != 0) {
            r6.A0P(this.A05);
        }
    }

    public AnonymousClass054 A05() {
        C017307k r4 = (C017307k) super.clone();
        r4.A02 = new ArrayList();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass054 A05 = ((AnonymousClass054) this.A02.get(i)).clone();
            r4.A02.add(A05);
            A05.A07 = r4;
        }
        return r4;
    }

    public String A0E(String str) {
        String A0E = super.A0E(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i >= arrayList.size()) {
                return A0E;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0E);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(((AnonymousClass054) arrayList.get(i)).A0E(sb2.toString()));
            A0E = sb.toString();
            i++;
        }
    }

    public void A0H() {
        super.A0H();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0H();
        }
    }

    public void A0J(View view) {
        super.A0J(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0J(view);
        }
    }

    public void A0K(View view) {
        super.A0K(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0K(view);
        }
    }

    public void A0L(ViewGroup viewGroup) {
        super.A0L(viewGroup);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0L(viewGroup);
        }
    }

    public void A0O(AnonymousClass057 r4) {
        super.A0O(r4);
        this.A04 |= 4;
        if (this.A02 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A02;
                if (i < arrayList.size()) {
                    ((AnonymousClass054) arrayList.get(i)).A0O(r4);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0R(AnonymousClass0X9 r4) {
        super.A0R(r4);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass054) this.A02.get(i)).A0R(r4);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass054 A06(long j) {
        A0X(j);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass054 A07(TimeInterpolator timeInterpolator) {
        A0Y(timeInterpolator);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass054 A08(View view) {
        A0Z(view);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass054 A0A(C17290r2 r1) {
        super.A0A(r1);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass054 A0B(C17290r2 r1) {
        super.A0B(r1);
        return this;
    }
}
