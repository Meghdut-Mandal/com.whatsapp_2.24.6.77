package X;

import java.util.List;

/* renamed from: X.7zN  reason: invalid class name and case insensitive filesystem */
public final class C167897zN extends C06730Uv {
    public final List A00;
    public final List A01;

    public C167897zN(List list, List list2) {
        AnonymousClass00C.A0D(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        Object obj;
        Object obj2;
        C22913AyP ayP = (C22913AyP) this.A01.get(i);
        C22913AyP ayP2 = (C22913AyP) this.A00.get(i2);
        int type = ayP.getType();
        if (type != ayP2.getType()) {
            return false;
        }
        if (type == 0) {
            obj = ((A96) ayP).A00;
            obj2 = ((A96) ayP2).A00;
        } else if (type != 1) {
            return true;
        } else {
            obj = ((A95) ayP).A00;
            obj2 = ((A95) ayP2).A00;
        }
        return AnonymousClass00C.A0J(obj, obj2);
    }

    public boolean A04(int i, int i2) {
        String str;
        String str2;
        C22913AyP ayP = (C22913AyP) this.A01.get(i);
        C22913AyP ayP2 = (C22913AyP) this.A00.get(i2);
        int type = ayP.getType();
        if (type != ayP2.getType()) {
            return false;
        }
        if (type == 0) {
            str = ((A96) ayP).A00.A0F;
            str2 = ((A96) ayP2).A00.A0F;
        } else if (type != 1) {
            return true;
        } else {
            str = ((A95) ayP).A00;
            str2 = ((A95) ayP2).A00;
        }
        return AnonymousClass00C.A0J(str, str2);
    }
}
