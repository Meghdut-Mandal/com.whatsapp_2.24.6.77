package X;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Y2  reason: invalid class name */
public class AnonymousClass9Y2 {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 0;
    public Rect A04;
    public C000700i A05;
    public C10890fO A06;
    public List A07;
    public List A08;
    public Map A09;
    public Map A0A;
    public Map A0B;
    public boolean A0C;
    public final AnonymousClass9L1 A0D = new AnonymousClass9L1();
    public final HashSet A0E = C36441kJ.A16();

    public float A01() {
        return (float) ((long) (((this.A00 - this.A02) / this.A01) * 1000.0f));
    }

    public C192829Is A02(String str) {
        int size = this.A08.size();
        for (int i = 0; i < size; i++) {
            C192829Is r4 = (C192829Is) this.A08.get(i);
            String str2 = r4.A02;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return r4;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i("LottieComposition:\n");
        for (C195509Uo A002 : this.A07) {
            A0i.append(A002.A00("\t"));
        }
        return A0i.toString();
    }

    public static void A00(AnonymousClass9Y2 r0, String str) {
        AnonymousClass6GP.A00(str);
        r0.A0E.add(str);
    }
}
