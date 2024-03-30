package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Rc  reason: invalid class name and case insensitive filesystem */
public final class C65193Rc {
    public static final int[][] A02 = {new int[]{128544}, new int[]{128548}, new int[]{128545}, new int[]{129324}, new int[]{128127}, new int[]{128574}};
    public static final int[][] A03 = {new int[]{128077}, new int[]{129321}, new int[]{10024}, new int[]{11088, 65039}, new int[]{127775}, new int[]{128171}, new int[]{128514}, new int[]{129315}, new int[]{128521}, new int[]{127881}, new int[]{129395}, new int[]{127874}, new int[]{127882}, new int[]{128522}, new int[]{129325}, new int[]{128513}, new int[]{128512}, new int[]{128564}, new int[]{128173}};
    public static final int[][] A04 = {new int[]{127926}, new int[]{127925}, new int[]{128131}, new int[]{128378}, new int[]{128526}, new int[]{127939, 8205, 9792, 65039}, new int[]{127939}, new int[]{127939, 8205, 9794, 65039}, new int[]{127807}, new int[]{127793}, new int[]{128105, 8205, 127859}, new int[]{129489, 8205, 127859}, new int[]{128104, 8205, 127859}, new int[]{128164}, new int[]{128218}, new int[]{128583, 8205, 9792, 65039}, new int[]{128583}, new int[]{128583, 8205, 9794, 65039}};
    public static final int[][] A05;
    public static final int[][] A06 = {new int[]{128175}, new int[]{128075}, new int[]{128587, 8205, 9792, 65039}, new int[]{128587}, new int[]{128587, 8205, 9794, 65039}, new int[]{128591}, new int[]{129300}, new int[]{129346}, new int[]{127867}, new int[]{127821}, new int[]{129318, 8205, 9792, 65039}, new int[]{129318}, new int[]{129318, 8205, 9794, 65039}, new int[]{128079}, new int[]{128530}, new int[]{128529}, new int[]{128528}, new int[]{127908}, new int[]{128105, 8205, 9878, 65039}, new int[]{129489, 8205, 9878, 65039}, new int[]{128104, 8205, 9878, 65039}, new int[]{9749, 65039}, new int[]{129335, 8205, 9792, 65039}, new int[]{129335}, new int[]{129335, 8205, 9794, 65039}, new int[]{129764}, new int[]{9995}, new int[]{128683}, new int[]{128580}, new int[]{128170}, new int[]{128556}};
    public static final int[][] A07 = {new int[]{128557}, new int[]{128553}, new int[]{128555}, new int[]{128148}, new int[]{128546}, new int[]{129402}, new int[]{128542}, new int[]{128532}, new int[]{128534}, new int[]{128547}, new int[]{128533}, new int[]{128554}, new int[]{128577}};
    public final HashMap A00 = AnonymousClass001.A0J();
    public final HashMap A01 = AnonymousClass001.A0J();

    static {
        int[][] iArr = new int[40][];
        iArr[0] = new int[]{10084, 65039};
        iArr[1] = new int[]{128525};
        iArr[2] = new int[]{127801};
        iArr[3] = new int[]{128105, 8205, 10084, 65039, 8205, 128139, 8205, 128104};
        iArr[4] = new int[]{128104, 8205, 10084, 65039, 8205, 128139, 8205, 128104};
        iArr[5] = new int[]{128105, 8205, 10084, 65039, 8205, 128139, 8205, 128105};
        iArr[6] = new int[]{128105, 8205, 10084, 65039, 8205, 128104};
        iArr[7] = new int[]{128104, 8205, 10084, 65039, 8205, 128104};
        iArr[8] = new int[]{128105, 8205, 10084, 65039, 8205, 128105};
        iArr[9] = new int[]{128109};
        iArr[10] = new int[]{128107};
        iArr[11] = new int[]{128108};
        iArr[12] = new int[]{128536};
        iArr[13] = new int[]{128538};
        iArr[14] = new int[]{128537};
        iArr[15] = new int[]{10084};
        iArr[16] = new int[]{128139};
        iArr[17] = new int[]{10083};
        iArr[18] = new int[]{128149};
        iArr[19] = new int[]{128158};
        iArr[20] = new int[]{128151};
        iArr[21] = new int[]{128147};
        iArr[22] = new int[]{128152};
        iArr[23] = new int[]{128157};
        iArr[24] = new int[]{128150};
        C36411kG.A1U(new int[1], iArr, 128068);
        iArr[29] = new int[]{9829, 65039};
        iArr[30] = new int[]{128153};
        iArr[31] = new int[]{128156};
        iArr[32] = new int[]{128155};
        iArr[33] = new int[]{128154};
        iArr[34] = new int[]{129505};
        iArr[35] = new int[]{129293};
        iArr[36] = new int[]{129294};
        iArr[37] = new int[]{10084, 65039, 8205, 128293};
        iArr[38] = new int[]{10084, 65039, 8205, 129657};
        iArr[39] = new int[]{129782};
        A05 = iArr;
    }

    public C65193Rc() {
        A00(A03, 1);
        A00(A05, 2);
        A00(A07, 3);
        A00(A02, 4);
        A00(A06, 5);
        A00(A04, 6);
    }

    private final void A00(int[][] iArr, int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.A01;
        hashMap.put(valueOf, AnonymousClass001.A0I());
        for (int[] r0 : iArr) {
            AnonymousClass1XQ r2 = new AnonymousClass1XQ(r0);
            List list = (List) hashMap.get(valueOf);
            if (list != null) {
                list.add(r2);
            }
            HashMap hashMap2 = this.A00;
            if (hashMap2.containsKey(r2)) {
                Set set = (Set) hashMap2.get(r2);
                if (set != null) {
                    set.add(valueOf);
                }
            } else {
                HashSet A16 = C36441kJ.A16();
                A16.add(valueOf);
                hashMap2.put(r2, A16);
            }
        }
    }
}
