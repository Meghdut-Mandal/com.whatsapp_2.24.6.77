package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.9y0  reason: invalid class name and case insensitive filesystem */
public class C208299y0 implements B5O, Ax2 {
    public final Path A00 = C36441kJ.A0M();
    public final Path A01 = C36441kJ.A0M();
    public final Path A02 = C36441kJ.A0M();
    public final List A03 = AnonymousClass001.A0I();
    public final C208539yQ A04;

    public void Bqe(List list, List list2) {
        int i = 0;
        while (true) {
            List list3 = this.A03;
            if (i < list3.size()) {
                ((B0T) list3.get(i)).Bqe(list, list2);
                i++;
            } else {
                return;
            }
        }
    }

    public Path BFG() {
        Path.Op op;
        Matrix matrix;
        Matrix matrix2;
        Path path = this.A01;
        path.reset();
        C208539yQ r1 = this.A04;
        if (!r1.A01) {
            int intValue = r1.A00.intValue();
            if (intValue == 0) {
                int i = 0;
                while (true) {
                    List list = this.A03;
                    if (i >= list.size()) {
                        break;
                    }
                    path.addPath(((B5O) list.get(i)).BFG());
                    i++;
                }
            } else {
                if (intValue == 1) {
                    op = Path.Op.UNION;
                } else if (intValue == 2) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else if (intValue == 3) {
                    op = Path.Op.INTERSECT;
                } else if (intValue == 4) {
                    op = Path.Op.XOR;
                }
                Path path2 = this.A02;
                path2.reset();
                Path path3 = this.A00;
                path3.reset();
                List list2 = this.A03;
                for (int size = list2.size() - 1; size >= 1; size--) {
                    B5O b5o = (B5O) list2.get(size);
                    if (b5o instanceof C208359y6) {
                        C208359y6 r11 = (C208359y6) b5o;
                        List A002 = r11.A00();
                        for (int A06 = C36421kH.A06(A002, 1); A06 >= 0; A06--) {
                            Path BFG = ((B5O) A002.get(A06)).BFG();
                            AnonymousClass9YD r0 = r11.A00;
                            if (r0 != null) {
                                matrix2 = r0.A00();
                            } else {
                                matrix2 = r11.A02;
                                matrix2.reset();
                            }
                            BFG.transform(matrix2);
                            path2.addPath(BFG);
                        }
                    } else {
                        path2.addPath(b5o.BFG());
                    }
                }
                B5O b5o2 = (B5O) list2.get(0);
                if (b5o2 instanceof C208359y6) {
                    C208359y6 r3 = (C208359y6) b5o2;
                    List A003 = r3.A00();
                    for (int i2 = 0; i2 < A003.size(); i2++) {
                        Path BFG2 = ((B5O) A003.get(i2)).BFG();
                        AnonymousClass9YD r02 = r3.A00;
                        if (r02 != null) {
                            matrix = r02.A00();
                        } else {
                            matrix = r3.A02;
                            matrix.reset();
                        }
                        BFG2.transform(matrix);
                        path3.addPath(BFG2);
                    }
                } else {
                    path3.set(b5o2.BFG());
                }
                path.op(path3, path2, op);
                return path;
            }
        }
        return path;
    }

    public C208299y0(C208539yQ r2) {
        this.A04 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Azr(java.util.ListIterator r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.previous()
            boolean r0 = r1 instanceof X.B5O
            if (r0 == 0) goto L_0x000d
            java.util.List r0 = r2.A03
            r0.add(r1)
            r3.remove()
            goto L_0x000d
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208299y0.Azr(java.util.ListIterator):void");
    }

    public String getName() {
        throw null;
    }
}
