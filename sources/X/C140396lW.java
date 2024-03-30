package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.6lW  reason: invalid class name and case insensitive filesystem */
public class C140396lW implements C161007lx {
    public final Integer[] A00;
    public final LayoutOutput A01;
    public final C132456Tu A02;

    public Object BDT() {
        return null;
    }

    public int BEu() {
        return 0;
    }

    public int BEw() {
        return 0;
    }

    public int BEx() {
        return 0;
    }

    public int BEz() {
        return 0;
    }

    public C161007lx B9b(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = C90524aI.A06(numArr, i);
        }
        return (C161007lx) layoutOutput.measureResults[i];
    }

    public int B9g() {
        return this.A01.measureResults.length;
    }

    public int BJL(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = C90524aI.A06(numArr, i);
        }
        return (int) layoutOutput.arr[C90514aH.A09(i)];
    }

    public int BJM(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = C90524aI.A06(numArr, i);
        }
        return (int) layoutOutput.arr[C90514aH.A09(i) + 1];
    }

    public int getHeight() {
        return (int) this.A01.arr[1];
    }

    public int getWidth() {
        return (int) this.A01.arr[0];
    }

    public C140396lW(LayoutOutput layoutOutput, C132456Tu r2, Integer[] numArr) {
        this.A01 = layoutOutput;
        this.A02 = r2;
        this.A00 = numArr;
    }

    public C132456Tu BGf() {
        return this.A02;
    }
}
