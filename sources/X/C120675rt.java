package X;

import java.util.List;

/* renamed from: X.5rt  reason: invalid class name and case insensitive filesystem */
public final class C120675rt {
    public int A00;
    public final AnonymousClass61T A01;
    public final List A02;

    public C120675rt(AnonymousClass61T r6, List list) {
        int i;
        this.A02 = list;
        this.A01 = r6;
        if (r6 != null) {
            r6.A01.A00.getButtonState();
        }
        AnonymousClass61T r0 = this.A01;
        if (r0 != null) {
            r0.A01.A00.getMetaState();
        }
        AnonymousClass61T r02 = this.A01;
        if (r02 != null) {
            int actionMasked = r02.A01.A00.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            List list2 = this.A02;
            int i2 = 0;
            int size = list2.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                AnonymousClass6E5 r1 = (AnonymousClass6E5) list2.get(i2);
                if (!r1.A0C || r1.A0B) {
                    if (!r1.A0C && r1.A0B) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            i = 1;
        }
        this.A00 = i;
    }
}
