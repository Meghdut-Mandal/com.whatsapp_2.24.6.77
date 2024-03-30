package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* renamed from: X.0X0  reason: invalid class name */
public class AnonymousClass0X0 {
    public static SparseIntArray A10;
    public float A00 = 0.0f;
    public float A01 = -1.0f;
    public float A02 = 1.0f;
    public float A03 = 0.5f;
    public float A04 = -1.0f;
    public float A05 = 0.5f;
    public float A06 = -1.0f;
    public float A07 = 1.0f;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = 0;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = 0;
    public int A0S = -1;
    public int A0T = -1;
    public int A0U = 0;
    public int A0V = -1;
    public int A0W = -1;
    public int A0X = -1;
    public int A0Y = -1;
    public int A0Z = 0;
    public int A0a;
    public int A0b = -1;
    public int A0c;
    public int A0d = -1;
    public int A0e = -1;
    public int A0f = -1;
    public int A0g = -1;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = 0;
    public int A0o = 0;
    public int A0p = -1;
    public int A0q = -1;
    public String A0r = null;
    public String A0s;
    public String A0t;
    public boolean A0u = false;
    public boolean A0v = false;
    public boolean A0w = false;
    public boolean A0x = true;
    public boolean A0y = false;
    public int[] A0z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A10 = sparseIntArray;
        A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(sparseIntArray, 38, 24), 39, 25), 41, 28), 42, 29), 47, 35), 46, 34), 20, 4), 19, 3), 17, 1), 55, 6), 56, 7), 27, 17), 28, 18), 29, 19), 0, 26), 43, 31), 44, 32), 26, 10), 25, 9), 59, 13), 62, 16), 60, 14), 57, 11), 61, 15), 58, 12), 50, 38), 36, 37), 35, 39), 49, 40), 34, 20), 48, 36), 24, 5), 37, 76), 45, 76), 40, 76), 18, 76), 16, 76), 3, 23), 5, 27), 7, 30).append(8, 8);
        A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A10, 4, 33), 6, 2), 1, 22), 2, 21), 21, 61), 23, 62), 22, 63), 54, 69), 33, 70), 12, 71), 10, 72), 11, 73), 13, 74).append(9, 75);
    }

    public void A01(Context context, AttributeSet attributeSet) {
        StringBuilder A0u2;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C33961gD.A03);
        this.A0w = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = A10;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.A0v = obtainStyledAttributes.getBoolean(index, this.A0v);
            } else if (i2 != 81) {
                switch (i2) {
                    case 1:
                        this.A08 = C07690Yx.A00(obtainStyledAttributes, index, this.A08);
                        break;
                    case 2:
                        this.A09 = obtainStyledAttributes.getDimensionPixelSize(index, this.A09);
                        break;
                    case 3:
                        this.A0A = C07690Yx.A00(obtainStyledAttributes, index, this.A0A);
                        break;
                    case 4:
                        this.A0B = C07690Yx.A00(obtainStyledAttributes, index, this.A0B);
                        break;
                    case 5:
                        this.A0r = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0E);
                        break;
                    case 7:
                        this.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0F);
                        break;
                    case 8:
                        this.A0G = obtainStyledAttributes.getDimensionPixelSize(index, this.A0G);
                        break;
                    case 9:
                        this.A0H = C07690Yx.A00(obtainStyledAttributes, index, this.A0H);
                        break;
                    case 10:
                        this.A0I = C07690Yx.A00(obtainStyledAttributes, index, this.A0I);
                        break;
                    case 11:
                        this.A0J = obtainStyledAttributes.getDimensionPixelSize(index, this.A0J);
                        break;
                    case 12:
                        this.A0K = obtainStyledAttributes.getDimensionPixelSize(index, this.A0K);
                        break;
                    case 13:
                        this.A0L = obtainStyledAttributes.getDimensionPixelSize(index, this.A0L);
                        break;
                    case 14:
                        this.A0M = obtainStyledAttributes.getDimensionPixelSize(index, this.A0M);
                        break;
                    case 15:
                        this.A0N = obtainStyledAttributes.getDimensionPixelSize(index, this.A0N);
                        break;
                    case 16:
                        this.A0O = obtainStyledAttributes.getDimensionPixelSize(index, this.A0O);
                        break;
                    case 17:
                        this.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0P);
                        break;
                    case 18:
                        this.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0Q);
                        break;
                    case 19:
                        this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                        break;
                    case 20:
                        this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                        break;
                    case 21:
                        this.A0a = obtainStyledAttributes.getLayoutDimension(index, this.A0a);
                        break;
                    case 22:
                        this.A0c = obtainStyledAttributes.getLayoutDimension(index, this.A0c);
                        break;
                    case 23:
                        this.A0V = obtainStyledAttributes.getDimensionPixelSize(index, this.A0V);
                        break;
                    case 24:
                        this.A0W = C07690Yx.A00(obtainStyledAttributes, index, this.A0W);
                        break;
                    case 25:
                        this.A0X = C07690Yx.A00(obtainStyledAttributes, index, this.A0X);
                        break;
                    case 26:
                        this.A0d = obtainStyledAttributes.getInt(index, this.A0d);
                        break;
                    case 27:
                        this.A0e = obtainStyledAttributes.getDimensionPixelSize(index, this.A0e);
                        break;
                    case 28:
                        this.A0f = C07690Yx.A00(obtainStyledAttributes, index, this.A0f);
                        break;
                    case 29:
                        this.A0g = C07690Yx.A00(obtainStyledAttributes, index, this.A0g);
                        break;
                    case 30:
                        this.A0h = obtainStyledAttributes.getDimensionPixelSize(index, this.A0h);
                        break;
                    case 31:
                        this.A0i = C07690Yx.A00(obtainStyledAttributes, index, this.A0i);
                        break;
                    case 32:
                        this.A0j = C07690Yx.A00(obtainStyledAttributes, index, this.A0j);
                        break;
                    case 33:
                        this.A0k = obtainStyledAttributes.getDimensionPixelSize(index, this.A0k);
                        break;
                    case 34:
                        this.A0l = C07690Yx.A00(obtainStyledAttributes, index, this.A0l);
                        break;
                    case 35:
                        this.A0m = C07690Yx.A00(obtainStyledAttributes, index, this.A0m);
                        break;
                    case 36:
                        this.A05 = obtainStyledAttributes.getFloat(index, this.A05);
                        break;
                    case 37:
                        this.A04 = obtainStyledAttributes.getFloat(index, this.A04);
                        break;
                    case 38:
                        this.A06 = obtainStyledAttributes.getFloat(index, this.A06);
                        break;
                    case 39:
                        this.A0U = obtainStyledAttributes.getInt(index, this.A0U);
                        break;
                    case 40:
                        this.A0n = obtainStyledAttributes.getInt(index, this.A0n);
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                this.A0o = obtainStyledAttributes.getInt(index, this.A0o);
                                break;
                            case 55:
                                this.A0R = obtainStyledAttributes.getInt(index, this.A0R);
                                break;
                            case 56:
                                this.A0p = obtainStyledAttributes.getDimensionPixelSize(index, this.A0p);
                                break;
                            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                                this.A0S = obtainStyledAttributes.getDimensionPixelSize(index, this.A0S);
                                break;
                            case 58:
                                this.A0q = obtainStyledAttributes.getDimensionPixelSize(index, this.A0q);
                                break;
                            case 59:
                                this.A0T = obtainStyledAttributes.getDimensionPixelSize(index, this.A0T);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.A0C = C07690Yx.A00(obtainStyledAttributes, index, this.A0C);
                                        break;
                                    case 62:
                                        this.A0D = obtainStyledAttributes.getDimensionPixelSize(index, this.A0D);
                                        break;
                                    case 63:
                                        this.A00 = obtainStyledAttributes.getFloat(index, this.A00);
                                        break;
                                    default:
                                        switch (i2) {
                                            case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                                                this.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER /*70*/:
                                                this.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER /*71*/:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case 72:
                                                this.A0Y = obtainStyledAttributes.getInt(index, this.A0Y);
                                                continue;
                                            case 73:
                                                this.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Z);
                                                continue;
                                            case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                                                this.A0t = obtainStyledAttributes.getString(index);
                                                continue;
                                            case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                                                this.A0x = obtainStyledAttributes.getBoolean(index, this.A0x);
                                                continue;
                                            case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                                                A0u2 = AnonymousClass000.A0u();
                                                str = "unused attribute 0x";
                                                break;
                                            case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                                                this.A0s = obtainStyledAttributes.getString(index);
                                                continue;
                                            default:
                                                A0u2 = AnonymousClass000.A0u();
                                                str = "Unknown attribute 0x";
                                                break;
                                        }
                                        A0u2.append(str);
                                        A0u2.append(Integer.toHexString(index));
                                        A0u2.append("   ");
                                        A0u2.append(sparseIntArray.get(index));
                                        AnonymousClass000.A1A(A0u2, "ConstraintSet");
                                        break;
                                }
                        }
                }
            } else {
                this.A0u = obtainStyledAttributes.getBoolean(index, this.A0u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static SparseIntArray A00(SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.append(i, i2);
        return A10;
    }
}
