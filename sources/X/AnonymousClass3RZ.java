package X;

import java.util.HashMap;

/* renamed from: X.3RZ  reason: invalid class name */
public class AnonymousClass3RZ {
    public static final int[][] A01;
    public static final int[][] A02 = {new int[]{10084}, new int[]{128525}, new int[]{128536}, new int[]{128149}, new int[]{128571}, new int[]{128145}, new int[]{128105, 8205, 10084, 8205, 128105}, new int[]{128104, 8205, 10084, 8205, 128104}, new int[]{128143}, new int[]{128105, 8205, 10084, 8205, 128139, 8205, 128105}, new int[]{128104, 8205, 10084, 8205, 128139, 8205, 128104}, new int[]{10084}, new int[]{129505}, new int[]{128155}, new int[]{128154}, new int[]{128153}, new int[]{128156}, new int[]{128420}, new int[]{128148}, new int[]{10083}, new int[]{128149}, new int[]{128158}, new int[]{128147}, new int[]{128151}, new int[]{128150}, new int[]{128152}, new int[]{128157}, new int[]{128159}, new int[]{9829}, new int[]{128140}, new int[]{128139}};
    public static final int[][] A03 = {new int[]{9785}, new int[]{128547}, new int[]{128534}, new int[]{128555}, new int[]{128553}, new int[]{128546}, new int[]{128557}, new int[]{128542}, new int[]{128532}, new int[]{128543}, new int[]{128533}, new int[]{128548}, new int[]{128544}, new int[]{128549}, new int[]{128560}, new int[]{128552}, new int[]{128575}, new int[]{128574}, new int[]{128531}, new int[]{128589, 8205, 9794}, new int[]{128589, 8205, 9792}};
    public static final int[][] A04 = {new int[]{128559}, new int[]{128550}, new int[]{128551}, new int[]{128558}, new int[]{128562}, new int[]{128576}, new int[]{128561}, new int[]{129327}, new int[]{128563}, new int[]{128576}, new int[]{10071}, new int[]{10069}, new int[]{129325}};
    public HashMap A00;

    private void A00(int[][] iArr, int i) {
        int i2;
        for (int[] r0 : iArr) {
            AnonymousClass1XQ r2 = new AnonymousClass1XQ(r0);
            HashMap hashMap = this.A00;
            if (hashMap.containsKey(r2)) {
                i2 = AnonymousClass000.A0I(hashMap.get(r2));
            } else {
                i2 = 0;
            }
            C36341k9.A1K(r2, hashMap, i2 | i);
        }
    }

    static {
        int[][] iArr = new int[18][];
        iArr[4] = C36421kH.A1b(iArr);
        iArr[5] = new int[]{128517};
        iArr[6] = new int[]{128514};
        iArr[7] = new int[]{129315};
        iArr[8] = new int[]{128578};
        iArr[9] = new int[]{128539};
        iArr[10] = new int[]{128541};
        iArr[11] = new int[]{128540};
        iArr[12] = new int[]{129322};
        iArr[13] = new int[]{129303};
        iArr[14] = new int[]{128570};
        iArr[15] = new int[]{128568};
        iArr[16] = new int[]{128569};
        iArr[17] = new int[]{9786};
        A01 = iArr;
    }

    public AnonymousClass3RZ() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            this.A00 = AnonymousClass001.A0J();
        } else {
            hashMap.clear();
        }
        A00(A01, 1);
        A00(A04, 8);
        A00(A03, 4);
        A00(A02, 2);
    }
}
