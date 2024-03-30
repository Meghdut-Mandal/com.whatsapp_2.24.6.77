package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Yx  reason: invalid class name and case insensitive filesystem */
public class C07690Yx {
    public static SparseIntArray A02;
    public static final int[] A03 = {0, 4, 8};
    public HashMap A00 = AnonymousClass001.A0J();
    public HashMap A01 = AnonymousClass001.A0J();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(sparseIntArray, 76, 25), 77, 26), 79, 29), 80, 30), 86, 36), 85, 35), 58, 4), 57, 3), 55, 1), 94, 6), 95, 7), 65, 17), 66, 18), 67, 19), 0, 27), 81, 32), 82, 33), 64, 10), 63, 9), 98, 13), 101, 16), 99, 14), 96, 11), 100, 15), 97, 12), 89, 40), 74, 39), 73, 41), 88, 42), 72, 20), 87, 37), 62, 5), 75, 82), 84, 82), 78, 82), 56, 82), 54, 82), 5, 24), 7, 28), 23, 31), 24, 8), 6, 34), 8, 2), 3, 23), 4, 21), 2, 22), 13, 43), 26, 44), 21, 45), 22, 46), 20, 60), 18, 47), 19, 48), 14, 49), 15, 50), 16, 51), 17, 52), 25, 53), 90, 54), 68, 55), 91, 56), 69, 57), 92, 58), 70, 59), 59, 61), 61, 62), 60, 63), 27, 64), 106, 65), 33, 66), 107, 67), 103, 79), 1, 38), 102, 68), 93, 69), 71, 70), 31, 71), 29, 72), 30, 73), 32, 74), 28, 75), 104, 76), 83, 77), C65953Uc.A03, 78), 53, 80).append(52, 81);
    }

    public static String A04(int i) {
        switch (i) {
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    public void A07(int i) {
        A03(this, i).A02.A03 = 0.0f;
    }

    public static AnonymousClass0UV A02(Context context, AttributeSet attributeSet) {
        String str;
        StringBuilder A0u;
        String str2;
        AnonymousClass0UV r4 = new AnonymousClass0UV();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C33961gD.A00);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                r4.A03.A06 = true;
                r4.A02.A0w = true;
                r4.A04.A04 = true;
                r4.A05.A0C = true;
            }
            SparseIntArray sparseIntArray = A02;
            switch (sparseIntArray.get(index)) {
                case 1:
                    AnonymousClass0X0 r1 = r4.A02;
                    r1.A08 = A00(obtainStyledAttributes, index, r1.A08);
                    continue;
                case 2:
                    AnonymousClass0X0 r12 = r4.A02;
                    r12.A09 = obtainStyledAttributes.getDimensionPixelSize(index, r12.A09);
                    continue;
                case 3:
                    AnonymousClass0X0 r13 = r4.A02;
                    r13.A0A = A00(obtainStyledAttributes, index, r13.A0A);
                    continue;
                case 4:
                    AnonymousClass0X0 r14 = r4.A02;
                    r14.A0B = A00(obtainStyledAttributes, index, r14.A0B);
                    continue;
                case 5:
                    r4.A02.A0r = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    AnonymousClass0X0 r15 = r4.A02;
                    r15.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, r15.A0E);
                    continue;
                case 7:
                    AnonymousClass0X0 r16 = r4.A02;
                    r16.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, r16.A0F);
                    continue;
                case 8:
                    AnonymousClass0X0 r17 = r4.A02;
                    r17.A0G = obtainStyledAttributes.getDimensionPixelSize(index, r17.A0G);
                    continue;
                case 9:
                    AnonymousClass0X0 r18 = r4.A02;
                    r18.A0H = A00(obtainStyledAttributes, index, r18.A0H);
                    continue;
                case 10:
                    AnonymousClass0X0 r19 = r4.A02;
                    r19.A0I = A00(obtainStyledAttributes, index, r19.A0I);
                    continue;
                case 11:
                    AnonymousClass0X0 r110 = r4.A02;
                    r110.A0J = obtainStyledAttributes.getDimensionPixelSize(index, r110.A0J);
                    continue;
                case 12:
                    AnonymousClass0X0 r111 = r4.A02;
                    r111.A0K = obtainStyledAttributes.getDimensionPixelSize(index, r111.A0K);
                    continue;
                case 13:
                    AnonymousClass0X0 r112 = r4.A02;
                    r112.A0L = obtainStyledAttributes.getDimensionPixelSize(index, r112.A0L);
                    continue;
                case 14:
                    AnonymousClass0X0 r113 = r4.A02;
                    r113.A0M = obtainStyledAttributes.getDimensionPixelSize(index, r113.A0M);
                    continue;
                case 15:
                    AnonymousClass0X0 r114 = r4.A02;
                    r114.A0N = obtainStyledAttributes.getDimensionPixelSize(index, r114.A0N);
                    continue;
                case 16:
                    AnonymousClass0X0 r115 = r4.A02;
                    r115.A0O = obtainStyledAttributes.getDimensionPixelSize(index, r115.A0O);
                    continue;
                case 17:
                    AnonymousClass0X0 r116 = r4.A02;
                    r116.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, r116.A0P);
                    continue;
                case 18:
                    AnonymousClass0X0 r117 = r4.A02;
                    r117.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, r117.A0Q);
                    continue;
                case 19:
                    AnonymousClass0X0 r118 = r4.A02;
                    r118.A01 = obtainStyledAttributes.getFloat(index, r118.A01);
                    continue;
                case 20:
                    AnonymousClass0X0 r119 = r4.A02;
                    r119.A03 = obtainStyledAttributes.getFloat(index, r119.A03);
                    continue;
                case 21:
                    AnonymousClass0X0 r120 = r4.A02;
                    r120.A0a = obtainStyledAttributes.getLayoutDimension(index, r120.A0a);
                    continue;
                case 22:
                    AnonymousClass0U2 r8 = r4.A04;
                    int i2 = obtainStyledAttributes.getInt(index, r8.A03);
                    r8.A03 = i2;
                    r8.A03 = A03[i2];
                    continue;
                case 23:
                    AnonymousClass0X0 r121 = r4.A02;
                    r121.A0c = obtainStyledAttributes.getLayoutDimension(index, r121.A0c);
                    continue;
                case 24:
                    AnonymousClass0X0 r122 = r4.A02;
                    r122.A0V = obtainStyledAttributes.getDimensionPixelSize(index, r122.A0V);
                    continue;
                case 25:
                    AnonymousClass0X0 r123 = r4.A02;
                    r123.A0W = A00(obtainStyledAttributes, index, r123.A0W);
                    continue;
                case 26:
                    AnonymousClass0X0 r124 = r4.A02;
                    r124.A0X = A00(obtainStyledAttributes, index, r124.A0X);
                    continue;
                case 27:
                    AnonymousClass0X0 r125 = r4.A02;
                    r125.A0d = obtainStyledAttributes.getInt(index, r125.A0d);
                    continue;
                case 28:
                    AnonymousClass0X0 r126 = r4.A02;
                    r126.A0e = obtainStyledAttributes.getDimensionPixelSize(index, r126.A0e);
                    continue;
                case 29:
                    AnonymousClass0X0 r127 = r4.A02;
                    r127.A0f = A00(obtainStyledAttributes, index, r127.A0f);
                    continue;
                case 30:
                    AnonymousClass0X0 r128 = r4.A02;
                    r128.A0g = A00(obtainStyledAttributes, index, r128.A0g);
                    continue;
                case 31:
                    AnonymousClass0X0 r129 = r4.A02;
                    r129.A0h = obtainStyledAttributes.getDimensionPixelSize(index, r129.A0h);
                    continue;
                case 32:
                    AnonymousClass0X0 r130 = r4.A02;
                    r130.A0i = A00(obtainStyledAttributes, index, r130.A0i);
                    continue;
                case 33:
                    AnonymousClass0X0 r131 = r4.A02;
                    r131.A0j = A00(obtainStyledAttributes, index, r131.A0j);
                    continue;
                case 34:
                    AnonymousClass0X0 r132 = r4.A02;
                    r132.A0k = obtainStyledAttributes.getDimensionPixelSize(index, r132.A0k);
                    continue;
                case 35:
                    AnonymousClass0X0 r133 = r4.A02;
                    r133.A0l = A00(obtainStyledAttributes, index, r133.A0l);
                    continue;
                case 36:
                    AnonymousClass0X0 r134 = r4.A02;
                    r134.A0m = A00(obtainStyledAttributes, index, r134.A0m);
                    continue;
                case 37:
                    AnonymousClass0X0 r135 = r4.A02;
                    r135.A05 = obtainStyledAttributes.getFloat(index, r135.A05);
                    continue;
                case 38:
                    r4.A00 = obtainStyledAttributes.getResourceId(index, r4.A00);
                    continue;
                case 39:
                    AnonymousClass0X0 r136 = r4.A02;
                    r136.A04 = obtainStyledAttributes.getFloat(index, r136.A04);
                    continue;
                case 40:
                    AnonymousClass0X0 r137 = r4.A02;
                    r137.A06 = obtainStyledAttributes.getFloat(index, r137.A06);
                    continue;
                case 41:
                    AnonymousClass0X0 r138 = r4.A02;
                    r138.A0U = obtainStyledAttributes.getInt(index, r138.A0U);
                    continue;
                case 42:
                    AnonymousClass0X0 r139 = r4.A02;
                    r139.A0n = obtainStyledAttributes.getInt(index, r139.A0n);
                    continue;
                case 43:
                    AnonymousClass0U2 r140 = r4.A04;
                    r140.A00 = obtainStyledAttributes.getFloat(index, r140.A00);
                    continue;
                case 44:
                    C07270Wz r141 = r4.A05;
                    r141.A0B = true;
                    r141.A00 = obtainStyledAttributes.getDimension(index, r141.A00);
                    continue;
                case 45:
                    C07270Wz r142 = r4.A05;
                    r142.A02 = obtainStyledAttributes.getFloat(index, r142.A02);
                    continue;
                case 46:
                    C07270Wz r143 = r4.A05;
                    r143.A03 = obtainStyledAttributes.getFloat(index, r143.A03);
                    continue;
                case 47:
                    C07270Wz r144 = r4.A05;
                    r144.A04 = obtainStyledAttributes.getFloat(index, r144.A04);
                    continue;
                case 48:
                    C07270Wz r145 = r4.A05;
                    r145.A05 = obtainStyledAttributes.getFloat(index, r145.A05);
                    continue;
                case 49:
                    C07270Wz r146 = r4.A05;
                    r146.A06 = obtainStyledAttributes.getDimension(index, r146.A06);
                    continue;
                case 50:
                    C07270Wz r147 = r4.A05;
                    r147.A07 = obtainStyledAttributes.getDimension(index, r147.A07);
                    continue;
                case 51:
                    C07270Wz r148 = r4.A05;
                    r148.A08 = obtainStyledAttributes.getDimension(index, r148.A08);
                    continue;
                case 52:
                    C07270Wz r149 = r4.A05;
                    r149.A09 = obtainStyledAttributes.getDimension(index, r149.A09);
                    continue;
                case 53:
                    C07270Wz r150 = r4.A05;
                    r150.A0A = obtainStyledAttributes.getDimension(index, r150.A0A);
                    continue;
                case 54:
                    AnonymousClass0X0 r151 = r4.A02;
                    r151.A0o = obtainStyledAttributes.getInt(index, r151.A0o);
                    continue;
                case 55:
                    AnonymousClass0X0 r152 = r4.A02;
                    r152.A0R = obtainStyledAttributes.getInt(index, r152.A0R);
                    continue;
                case 56:
                    AnonymousClass0X0 r153 = r4.A02;
                    r153.A0p = obtainStyledAttributes.getDimensionPixelSize(index, r153.A0p);
                    continue;
                case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                    AnonymousClass0X0 r154 = r4.A02;
                    r154.A0S = obtainStyledAttributes.getDimensionPixelSize(index, r154.A0S);
                    continue;
                case 58:
                    AnonymousClass0X0 r155 = r4.A02;
                    r155.A0q = obtainStyledAttributes.getDimensionPixelSize(index, r155.A0q);
                    continue;
                case 59:
                    AnonymousClass0X0 r156 = r4.A02;
                    r156.A0T = obtainStyledAttributes.getDimensionPixelSize(index, r156.A0T);
                    continue;
                case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                    C07270Wz r157 = r4.A05;
                    r157.A01 = obtainStyledAttributes.getFloat(index, r157.A01);
                    continue;
                case 61:
                    AnonymousClass0X0 r158 = r4.A02;
                    r158.A0C = A00(obtainStyledAttributes, index, r158.A0C);
                    continue;
                case 62:
                    AnonymousClass0X0 r159 = r4.A02;
                    r159.A0D = obtainStyledAttributes.getDimensionPixelSize(index, r159.A0D);
                    continue;
                case 63:
                    AnonymousClass0X0 r160 = r4.A02;
                    r160.A00 = obtainStyledAttributes.getFloat(index, r160.A00);
                    continue;
                case 64:
                    C07230Wv r161 = r4.A03;
                    r161.A02 = A00(obtainStyledAttributes, index, r161.A02);
                    continue;
                case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    C07230Wv r82 = r4.A03;
                    if (i3 == 3) {
                        str = obtainStyledAttributes.getString(index);
                    } else {
                        str = AnonymousClass0RC.A00[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    r82.A05 = str;
                    continue;
                case 66:
                    r4.A03.A03 = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                    C07230Wv r162 = r4.A03;
                    r162.A01 = obtainStyledAttributes.getFloat(index, r162.A01);
                    continue;
                case 68:
                    AnonymousClass0U2 r163 = r4.A04;
                    r163.A01 = obtainStyledAttributes.getFloat(index, r163.A01);
                    continue;
                case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                    r4.A02.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER /*70*/:
                    r4.A02.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER /*71*/:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    AnonymousClass0X0 r164 = r4.A02;
                    r164.A0Y = obtainStyledAttributes.getInt(index, r164.A0Y);
                    continue;
                case 73:
                    AnonymousClass0X0 r165 = r4.A02;
                    r165.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, r165.A0Z);
                    continue;
                case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                    r4.A02.A0t = obtainStyledAttributes.getString(index);
                    continue;
                case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                    AnonymousClass0X0 r166 = r4.A02;
                    r166.A0x = obtainStyledAttributes.getBoolean(index, r166.A0x);
                    continue;
                case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                    C07230Wv r167 = r4.A03;
                    r167.A04 = obtainStyledAttributes.getInt(index, r167.A04);
                    continue;
                case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                    r4.A02.A0s = obtainStyledAttributes.getString(index);
                    continue;
                case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                    AnonymousClass0U2 r168 = r4.A04;
                    r168.A02 = obtainStyledAttributes.getInt(index, r168.A02);
                    continue;
                case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER /*79*/:
                    C07230Wv r169 = r4.A03;
                    r169.A00 = obtainStyledAttributes.getFloat(index, r169.A00);
                    continue;
                case AnonymousClass8SX.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                    AnonymousClass0X0 r170 = r4.A02;
                    r170.A0v = obtainStyledAttributes.getBoolean(index, r170.A0v);
                    continue;
                case 81:
                    AnonymousClass0X0 r171 = r4.A02;
                    r171.A0u = obtainStyledAttributes.getBoolean(index, r171.A0u);
                    continue;
                case AnonymousClass8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                    A0u = AnonymousClass000.A0u();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    A0u = AnonymousClass000.A0u();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            A0u.append(str2);
            A0u.append(Integer.toHexString(index));
            A0u.append("   ");
            A0u.append(sparseIntArray.get(index));
            AnonymousClass000.A1A(A0u, "ConstraintSet");
        }
        obtainStyledAttributes.recycle();
        return r4;
    }

    public static AnonymousClass0UV A03(C07690Yx r2, int i) {
        HashMap hashMap = r2.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new AnonymousClass0UV());
        }
        return (AnonymousClass0UV) hashMap.get(valueOf);
    }

    public static int[] A05(View view, String str) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = C52982qV.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, PublicKeyCredentialControllerUtility.JSON_KEY_ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim == null || (hashMap = constraintLayout.A0C) == null || !hashMap.containsKey(trim)) {
                    obj = null;
                } else {
                    obj = constraintLayout.A0C.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = AnonymousClass000.A0I(obj);
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public void A08(int i, int i2, int i3, int i4) {
        AnonymousClass0X0 r0;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new AnonymousClass0UV());
        }
        AnonymousClass0UV r7 = (AnonymousClass0UV) hashMap.get(valueOf);
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    r0 = r7.A02;
                    r0.A0m = i3;
                    r0.A0l = -1;
                    break;
                } else if (i4 == 4) {
                    r0 = r7.A02;
                    r0.A0l = i3;
                    r0.A0m = -1;
                    break;
                } else {
                    StringBuilder A0v = AnonymousClass000.A0v("right to ");
                    A0v.append(A04(i4));
                    throw AnonymousClass000.A0c(" undefined", A0v);
                }
            case 4:
                if (i4 == 4) {
                    r0 = r7.A02;
                    r0.A0A = i3;
                    r0.A0B = -1;
                    break;
                } else if (i4 == 3) {
                    r0 = r7.A02;
                    r0.A0B = i3;
                    r0.A0A = -1;
                    break;
                } else {
                    StringBuilder A0v2 = AnonymousClass000.A0v("right to ");
                    A0v2.append(A04(i4));
                    throw AnonymousClass000.A0c(" undefined", A0v2);
                }
            case 5:
                if (i4 == 5) {
                    AnonymousClass0X0 r02 = r7.A02;
                    r02.A08 = i3;
                    r02.A0A = -1;
                    r02.A0B = -1;
                    r02.A0m = -1;
                    r02.A0l = -1;
                    return;
                }
                StringBuilder A0v3 = AnonymousClass000.A0v("right to ");
                A0v3.append(A04(i4));
                throw AnonymousClass000.A0c(" undefined", A0v3);
            case 6:
                if (i4 == 6) {
                    AnonymousClass0X0 r03 = r7.A02;
                    r03.A0j = i3;
                    r03.A0i = -1;
                    return;
                } else if (i4 == 7) {
                    AnonymousClass0X0 r04 = r7.A02;
                    r04.A0i = i3;
                    r04.A0j = -1;
                    return;
                } else {
                    StringBuilder A0v4 = AnonymousClass000.A0v("right to ");
                    A0v4.append(A04(i4));
                    throw AnonymousClass000.A0c(" undefined", A0v4);
                }
            default:
                if (i4 == 7) {
                    AnonymousClass0X0 r05 = r7.A02;
                    r05.A0H = i3;
                    r05.A0I = -1;
                    return;
                } else if (i4 == 6) {
                    AnonymousClass0X0 r06 = r7.A02;
                    r06.A0I = i3;
                    r06.A0H = -1;
                    return;
                } else {
                    StringBuilder A0v5 = AnonymousClass000.A0v("right to ");
                    A0v5.append(A04(i4));
                    throw AnonymousClass000.A0c(" undefined", A0v5);
                }
        }
        r0.A08 = -1;
    }

    public void A0A(ConstraintLayout constraintLayout) {
        Method method;
        Object[] objArr;
        String str;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout2.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                A0u.append(str);
                AnonymousClass000.A1A(A0u, "ConstraintSet");
            } else if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    Integer valueOf = Integer.valueOf(id);
                    hashSet.remove(valueOf);
                    AnonymousClass0UV r8 = (AnonymousClass0UV) hashMap.get(valueOf);
                    if (childAt instanceof Barrier) {
                        r8.A02.A0b = 1;
                    }
                    AnonymousClass0X0 r9 = r8.A02;
                    int i2 = r9.A0b;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.A00 = r9.A0Y;
                        barrier.setMargin(r9.A0Z);
                        barrier.setAllowsGoneWidget(r9.A0x);
                        int[] iArr = r9.A0z;
                        if (iArr == null) {
                            String str2 = r9.A0t;
                            if (str2 != null) {
                                iArr = A05(barrier, str2);
                                r9.A0z = iArr;
                            }
                        }
                        barrier.setReferencedIds(iArr);
                    }
                    AnonymousClass0BJ r10 = (AnonymousClass0BJ) childAt.getLayoutParams();
                    r10.A00();
                    r8.A00(r10);
                    HashMap hashMap2 = r8.A01;
                    Class<?> cls = childAt.getClass();
                    Iterator it = hashMap2.keySet().iterator();
                    while (it.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it);
                        AnonymousClass0Y7 r0 = (AnonymousClass0Y7) hashMap2.get(A0C);
                        String A0p = AnonymousClass000.A0p("set", A0C, AnonymousClass000.A0u());
                        try {
                            switch (r0.A04.intValue()) {
                                case 0:
                                    method = AnonymousClass001.A0G(cls, Integer.TYPE, A0p, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1L(objArr, r0.A03, 0);
                                    break;
                                case 1:
                                    method = AnonymousClass001.A0G(cls, Float.TYPE, A0p, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1I(objArr, r0.A01, 0);
                                    break;
                                case 2:
                                    method = AnonymousClass001.A0G(cls, Integer.TYPE, A0p, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1L(objArr, r0.A02, 0);
                                    break;
                                case 3:
                                    Method A0G = AnonymousClass001.A0G(cls, Drawable.class, A0p, new Class[1], 0);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(r0.A02);
                                    A0G.invoke(childAt, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    method = AnonymousClass001.A0G(cls, CharSequence.class, A0p, new Class[1], 0);
                                    objArr = new Object[]{r0.A05};
                                    break;
                                case 5:
                                    method = AnonymousClass001.A0G(cls, Boolean.TYPE, A0p, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1N(objArr, 0, r0.A06);
                                    break;
                                case 6:
                                    method = AnonymousClass001.A0G(cls, Float.TYPE, A0p, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1I(objArr, r0.A01, 0);
                                    break;
                            }
                            method.invoke(childAt, objArr);
                        } catch (NoSuchMethodException e) {
                            Log.e("TransitionLayout", e.getMessage());
                            StringBuilder A0v = AnonymousClass000.A0v(" Custom Attribute \"");
                            A0v.append(A0C);
                            A0v.append("\" not found on ");
                            String name = cls.getName();
                            Log.e("TransitionLayout", AnonymousClass000.A0q(name, A0v));
                            Log.e("TransitionLayout", AnonymousClass000.A0p(" must have a method ", A0p, AnonymousClass000.A0v(name)));
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            StringBuilder A0v2 = AnonymousClass000.A0v(" Custom Attribute \"");
                            A0v2.append(A0C);
                            A0v2.append("\" not found on ");
                            Log.e("TransitionLayout", AnonymousClass000.A0q(cls.getName(), A0v2));
                            e2.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(r10);
                    AnonymousClass0U2 r1 = r8.A04;
                    if (r1.A02 == 0) {
                        childAt.setVisibility(r1.A03);
                    }
                    childAt.setAlpha(r1.A00);
                    C07270Wz r3 = r8.A05;
                    childAt.setRotation(r3.A01);
                    childAt.setRotationX(r3.A02);
                    childAt.setRotationY(r3.A03);
                    childAt.setScaleX(r3.A04);
                    childAt.setScaleY(r3.A05);
                    float f = r3.A06;
                    if (!Float.isNaN(f)) {
                        childAt.setPivotX(f);
                    }
                    float f2 = r3.A07;
                    if (!Float.isNaN(f2)) {
                        childAt.setPivotY(f2);
                    }
                    childAt.setTranslationX(r3.A08);
                    childAt.setTranslationY(r3.A09);
                    childAt.setTranslationZ(r3.A0A);
                    if (r3.A0B) {
                        childAt.setElevation(r3.A00);
                    }
                } else {
                    Log.v("ConstraintSet", AnonymousClass000.A0r("WARNING NO CONSTRAINTS for view ", AnonymousClass000.A0u(), id));
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            AnonymousClass0UV r6 = (AnonymousClass0UV) hashMap.get(number);
            AnonymousClass0X0 r82 = r6.A02;
            int i3 = r82.A0b;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout2.getContext());
                barrier2.setId(number.intValue());
                int[] iArr2 = r82.A0z;
                if (iArr2 == null) {
                    String str3 = r82.A0t;
                    if (str3 != null) {
                        iArr2 = A05(barrier2, str3);
                        r82.A0z = iArr2;
                    }
                    barrier2.A00 = r82.A0Y;
                    barrier2.setMargin(r82.A0Z);
                    AnonymousClass0BJ r12 = new AnonymousClass0BJ(-2, -2);
                    barrier2.A04();
                    r6.A00(r12);
                    constraintLayout2.addView(barrier2, r12);
                }
                barrier2.setReferencedIds(iArr2);
                barrier2.A00 = r82.A0Y;
                barrier2.setMargin(r82.A0Z);
                AnonymousClass0BJ r122 = new AnonymousClass0BJ(-2, -2);
                barrier2.A04();
                r6.A00(r122);
                constraintLayout2.addView(barrier2, r122);
            }
            if (r82.A0y) {
                Guideline guideline = new Guideline(constraintLayout2.getContext());
                guideline.setId(number.intValue());
                AnonymousClass0BJ r13 = new AnonymousClass0BJ(-2, -2);
                r6.A00(r13);
                constraintLayout2.addView(guideline, r13);
            }
        }
    }

    public void A0B(ConstraintLayout constraintLayout) {
        AnonymousClass0Y7 r15;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout2.getChildAt(i);
            AnonymousClass0BJ r9 = (AnonymousClass0BJ) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new AnonymousClass0UV());
                }
                AnonymousClass0UV r8 = (AnonymousClass0UV) hashMap.get(Integer.valueOf(id));
                HashMap hashMap2 = this.A01;
                HashMap A0J = AnonymousClass001.A0J();
                Class<?> cls = childAt.getClass();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    String A0C = AnonymousClass001.A0C(it);
                    AnonymousClass0Y7 r1 = (AnonymousClass0Y7) hashMap2.get(A0C);
                    try {
                        if (A0C.equals("BackgroundColor")) {
                            r15 = new AnonymousClass0Y7(r1, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            r15 = new AnonymousClass0Y7(r1, AnonymousClass000.A0h(cls, childAt, AnonymousClass000.A0p("getMap", A0C, AnonymousClass000.A0u())));
                        }
                        A0J.put(A0C, r15);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
                r8.A01 = A0J;
                r8.A00 = id;
                AnonymousClass0X0 r12 = r8.A02;
                r12.A0W = r9.A0U;
                r12.A0X = r9.A0V;
                r12.A0f = r9.A0l;
                r12.A0g = r9.A0m;
                r12.A0m = r9.A0q;
                r12.A0l = r9.A0p;
                r12.A0B = r9.A0E;
                r12.A0A = r9.A0D;
                r12.A08 = r9.A0C;
                r12.A0i = r9.A0n;
                r12.A0j = r9.A0o;
                r12.A0I = r9.A0K;
                r12.A0H = r9.A0J;
                r12.A03 = r9.A04;
                r12.A05 = r9.A0A;
                r12.A0r = r9.A0u;
                r12.A0C = r9.A0F;
                r12.A0D = r9.A0G;
                r12.A00 = r9.A02;
                r12.A0E = r9.A0H;
                r12.A0F = r9.A0I;
                r12.A0d = r9.A0c;
                r12.A01 = r9.A03;
                r12.A0P = r9.A0R;
                r12.A0Q = r9.A0S;
                r12.A0c = r9.width;
                r12.A0a = r9.height;
                r12.A0V = r9.leftMargin;
                r12.A0e = r9.rightMargin;
                r12.A0k = r9.topMargin;
                r12.A09 = r9.bottomMargin;
                r12.A06 = r9.A0B;
                r12.A04 = r9.A05;
                r12.A0n = r9.A0r;
                r12.A0U = r9.A0T;
                r12.A0v = r9.A0w;
                r12.A0u = r9.A0v;
                r12.A0o = r9.A0X;
                r12.A0R = r9.A0W;
                r12.A0p = r9.A0Z;
                r12.A0S = r9.A0Y;
                r12.A0q = r9.A0b;
                r12.A0T = r9.A0a;
                r12.A07 = r9.A07;
                r12.A02 = r9.A06;
                r12.A0s = r9.A0t;
                r12.A0O = r9.A0Q;
                r12.A0J = r9.A0L;
                r12.A0L = r9.A0N;
                r12.A0M = r9.A0O;
                r12.A0N = r9.A0P;
                r12.A0K = r9.A0M;
                r12.A0G = r9.getMarginEnd();
                r12.A0h = r9.getMarginStart();
                AnonymousClass0U2 r13 = r8.A04;
                r13.A03 = childAt.getVisibility();
                r13.A00 = childAt.getAlpha();
                C07270Wz r92 = r8.A05;
                r92.A01 = childAt.getRotation();
                r92.A02 = childAt.getRotationX();
                r92.A03 = childAt.getRotationY();
                r92.A04 = childAt.getScaleX();
                r92.A05 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    r92.A06 = pivotX;
                    r92.A07 = pivotY;
                }
                r92.A08 = childAt.getTranslationX();
                r92.A09 = childAt.getTranslationY();
                r92.A0A = childAt.getTranslationZ();
                if (r92.A0B) {
                    r92.A00 = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    AnonymousClass0X0 r14 = r8.A02;
                    r14.A0x = barrier.A01.A02;
                    r14.A0z = barrier.getReferencedIds();
                    r14.A0Y = barrier.A00;
                    r14.A0Z = barrier.A01.A01;
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public static SparseIntArray A01(SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.append(i, i2);
        return A02;
    }

    public void A06(int i) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new AnonymousClass0UV());
        }
        AnonymousClass0X0 r0 = ((AnonymousClass0UV) hashMap.get(valueOf)).A02;
        r0.A0W = R.id.parent;
        r0.A0X = -1;
        r0.A0V = 0;
    }

    public void A09(ConstraintLayout constraintLayout) {
        A0A(constraintLayout);
        constraintLayout.A0A = null;
        constraintLayout.requestLayout();
    }
}
