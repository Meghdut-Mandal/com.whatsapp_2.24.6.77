package X;

/* renamed from: X.5go  reason: invalid class name and case insensitive filesystem */
public abstract class C114185go {
    public static final AnonymousClass6FX A00;
    public static final AnonymousClass6FX A01;
    public static final AnonymousClass6FX A02;
    public static final C94564iQ A03;
    public static final C94564iQ A04;
    public static final C94564iQ A05;
    public static final C94564iQ A06;
    public static final C94564iQ A07;
    public static final C94564iQ A08;
    public static final C94564iQ A09;
    public static final C94564iQ A0A;
    public static final C94564iQ A0B;
    public static final C94564iQ A0C;
    public static final C94564iQ A0D;
    public static final C94564iQ A0E;
    public static final C94564iQ A0F;
    public static final C94564iQ A0G;
    public static final C94564iQ A0H;
    public static final float[] A0I;
    public static final float[] A0J;
    public static final AnonymousClass6FX[] A0K;
    public static final C128406Cd A0L;
    public static final C128406Cd A0M;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        A0J = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        A0I = fArr2;
        C128406Cd r22 = new C128406Cd(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A0M = r22;
        C128406Cd r47 = new C128406Cd(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A0L = r47;
        AnonymousClass6EN r18 = C114055gZ.A03;
        C94564iQ r222 = new C94564iQ(r22, r18, "sRGB IEC61966-2.1", fArr, 0);
        A0G = r222;
        C94564iQ r223 = new C94564iQ(r18, "sRGB IEC61966-2.1 (Linear)", fArr, 1.0d, 0.0f, 1.0f, 1);
        A0C = r223;
        C94564iQ r14 = new C94564iQ(C137456gA.A00, C137466gB.A00, r22, r18, "scRGB-nl IEC 61966-2-2:2003", fArr, (float[]) null, -0.799f, 2.399f, 2);
        A0A = r14;
        C94564iQ r19 = new C94564iQ(r18, "scRGB IEC 61966-2-2:2003", fArr, 1.0d, -0.5f, 7.499f, 3);
        A0B = r19;
        C94564iQ r28 = new C94564iQ(new C128406Cd(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), r18, "Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, 4);
        A07 = r28;
        C94564iQ r20 = new C94564iQ(new C128406Cd(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), r18, "Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, 5);
        A06 = r20;
        C94564iQ r192 = new C94564iQ(new AnonymousClass6EN(0.314f, 0.351f), "SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, 2.6d, 0.0f, 1.0f, 6);
        A08 = r192;
        C94564iQ r48 = new C94564iQ(r22, r18, "Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, 7);
        A09 = r48;
        C94564iQ r54 = new C94564iQ(new C128406Cd(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), C114055gZ.A00, "NTSC (1953)", fArr2, 8);
        A0D = r54;
        C94564iQ r60 = new C94564iQ(new C128406Cd(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), r18, "SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, 9);
        A0F = r60;
        C94564iQ r202 = new C94564iQ(r18, "Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, 2.2d, 0.0f, 1.0f, 10);
        A05 = r202;
        C94564iQ r21 = new C94564iQ(new C128406Cd(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), C114055gZ.A01, "ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, 11);
        A0E = r21;
        AnonymousClass6EN r30 = C114055gZ.A02;
        C94564iQ r29 = new C94564iQ(r30, "SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, 1.0d, -65504.0f, 65504.0f, 12);
        A03 = r29;
        C94564iQ r38 = new C94564iQ(r30, "Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, 1.0d, -65504.0f, 65504.0f, 13);
        A04 = r38;
        C94544iO r13 = new C94544iO();
        A01 = r13;
        C94534iN r12 = new C94534iN();
        A00 = r12;
        C94564iQ r302 = new C94564iQ(r47, r18, "None", fArr, 16);
        A0H = r302;
        C94554iP r2 = new C94554iP();
        A02 = r2;
        AnonymousClass6FX[] r0 = new AnonymousClass6FX[18];
        C90494aF.A1H(r222, r223, r0);
        C90514aH.A1O(r14, r19, r0);
        C36401kF.A1R(r28, r20, r0);
        r0[6] = r192;
        r0[7] = r48;
        r0[8] = r54;
        r0[9] = r60;
        r0[10] = r202;
        r0[11] = r21;
        r0[12] = r29;
        r0[13] = r38;
        r0[14] = r13;
        r0[15] = r12;
        r0[16] = r302;
        r0[17] = r2;
        A0K = r0;
    }
}
