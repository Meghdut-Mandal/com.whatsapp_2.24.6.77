package X;

/* renamed from: X.9ah  reason: invalid class name and case insensitive filesystem */
public abstract class C196889ah {
    public static C197819cQ[] A00;

    public static void A00(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            i = C165617ti.A07(bArr, (bArr2[i >> 3] >>> (i & 7)) & 1, i);
        } while (i < 256);
        int i2 = 0;
        do {
            if (bArr[i2] != 0) {
                int i3 = 1;
                do {
                    int i4 = i2 + i3;
                    if (i4 >= 256) {
                        break;
                    }
                    if (bArr[i4] != 0) {
                        byte b = bArr[i2];
                        int i5 = bArr[i4] << i3;
                        if (b + i5 > 15) {
                            if (b - i5 < -15) {
                                break;
                            }
                            bArr[i2] = (byte) (bArr[i2] - (bArr[i4] << i3));
                            while (true) {
                                if (bArr[i4] != 0) {
                                    bArr[i4] = 0;
                                    i4++;
                                    if (i4 >= 256) {
                                        break;
                                    }
                                } else {
                                    bArr[i4] = 1;
                                    break;
                                }
                            }
                        } else {
                            bArr[i2] = (byte) (b + i5);
                            bArr[i4] = 0;
                        }
                    }
                    i3++;
                } while (i3 <= 6);
            }
            i2++;
        } while (i2 < 256);
    }

    static {
        C197819cQ[] r3 = new C197819cQ[8];
        A00 = r3;
        r3[0] = C197819cQ.A00(new int[]{25967493, -14356035, 29566456, 3660896, -12694345, 4014787, 27544626, -11754271, -6079156, 2047605}, new int[]{-12545711, 934262, -2722910, 3049990, -727428, 9406986, 12720692, 5043384, 19500929, -15469378}, new int[]{-8738181, 4489570, 9688441, -14785194, 10184609, -12363380, 29287919, 11864899, -24514362, -4438546});
        A00[1] = C197819cQ.A00(new int[]{15636291, -9688557, 24204773, -7912398, 616977, -16685262, 27787600, -14772189, 28944400, -1550024}, new int[]{16568933, 4717097, -11556148, -1102322, 15682896, -11807043, 16354577, -11775962, 7689662, 11199574}, new int[]{30464156, -5976125, -11779434, -15670865, 23220365, 15915852, 7512774, 10017326, -17749093, -9920357});
        A00[2] = C197819cQ.A00(new int[]{10861363, 11473154, 27284546, 1981175, -30064349, 12577861, 32867885, 14515107, -15438304, 10819380}, new int[]{4708026, 6336745, 20377586, 9066809, -11272109, 6594696, -25653668, 12483688, -12668491, 5581306}, new int[]{19563160, 16186464, -29386857, 4097519, 10237984, -4348115, 28542350, 13850243, -23678021, -15815942});
        A00[3] = C197819cQ.A00(new int[]{5153746, 9909285, 1723747, -2777874, 30523605, 5516873, 19480852, 5230134, -23952439, -15175766}, new int[]{-30269007, -3463509, 7665486, 10083793, 28475525, 1649722, 20654025, 16520125, 30598449, 7715701}, new int[]{28881845, 14381568, 9657904, 3680757, -20181635, 7843316, -31400660, 1370708, 29794553, -1409300});
        A00[4] = C197819cQ.A00(new int[]{-22518993, -6692182, 14201702, -8745502, -23510406, 8844726, 18474211, -1361450, -13062696, 13821877}, new int[]{-6455177, -7839871, 3374702, -4740862, -27098617, -10571707, 31655028, -7212327, 18853322, -14220951}, new int[]{4566830, -12963868, -28974889, -12240689, -7602672, -2830569, -8514358, -10431137, 2207753, -3209784});
        A00[5] = C197819cQ.A00(new int[]{-25154831, -4185821, 29681144, 7868801, -6854661, -9423865, -12437364, -663000, -31111463, -16132436}, new int[]{25576264, -2703214, 7349804, -11814844, 16472782, 9300885, 3844789, 15725684, 171356, 6466918}, new int[]{23103977, 13316479, 9739013, -16149481, 817875, -15038942, 8965339, -14088058, -30714912, 16193877});
        A00[6] = C197819cQ.A00(new int[]{-33521811, 3180713, -2394130, 14003687, -16903474, -16270840, 17238398, 4729455, -18074513, 9256800}, new int[]{-25182317, -4174131, 32336398, 5036987, -21236817, 11360617, 22616405, 9761698, -19827198, 630305}, new int[]{-13720693, 2639453, -24237460, -7406481, 9494427, -5774029, -6554551, -15960994, -2449256, -14291300});
        A00[7] = C197819cQ.A00(new int[]{-3151181, -5046075, 9282714, 6866145, -31907062, -863023, -18940575, 15033784, 25105118, -7894876}, new int[]{-24326370, 15950226, -31801215, -14592823, -11662737, -5090925, 1573892, -2625887, 2198790, -15804619}, new int[]{-3099351, 10324967, -2241613, 7453183, -5446979, -2735503, -13812022, -16236442, -32461234, -12290683});
    }
}
