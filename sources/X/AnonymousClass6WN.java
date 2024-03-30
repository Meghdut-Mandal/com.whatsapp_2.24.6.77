package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView;

/* renamed from: X.6WN  reason: invalid class name */
public class AnonymousClass6WN {
    public C19630wG A00;
    public C33191es A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public LinearLayout A05;
    public ShimmerFrameLayout A06;
    public C19730wQ A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public WaImageView A0A;
    public WaImageView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public AnonymousClass6V2 A0H;
    public AnonymousClass67X A0I;
    public C1258561o A0J;
    public DirectoryProductImagesCardView A0K;
    public C27761Ps A0L;
    public C18820ts A0M;
    public C20810yC A0N;
    public AnonymousClass1QW A0O;
    public C19770wU A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public ViewGroup A0U;
    public CircleWaImageView A0V;
    public WaImageButton A0W;
    public WaTextView A0X;
    public WaTextView A0Y;
    public WaTextView A0Z;
    public final Handler A0a = new Handler();

    public static Integer A00(AnonymousClass6WN r1, AnonymousClass5EL r2) {
        int A002;
        if (!r2.A0D) {
            return null;
        }
        if (!r2.A0B.A0P) {
            A002 = 0;
        } else if (r1.A0K.A00()) {
            A002 = 3;
        } else {
            A002 = C36371kC.A00(r1.A0K.A01() ? 1 : 0);
        }
        return Integer.valueOf(A002);
    }

    public static Integer A01(AnonymousClass6WN r3, AnonymousClass5EL r4) {
        int i;
        if (!r4.A0D) {
            return null;
        }
        C144416s9 r2 = r4.A0B;
        if (r2.A0P) {
            return null;
        }
        if (!r2.A0Q) {
            i = 0;
        } else if (r2.A01 != 1 || TextUtils.isEmpty(r3.A09.getText())) {
            int i2 = r2.A01;
            i = 2;
            if (i2 != 2) {
                return 1;
            }
        } else {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    public static Integer A02(AnonymousClass6WN r1, AnonymousClass5EL r2) {
        int A002;
        if (!r2.A0D) {
            return null;
        }
        if (!r2.A0B.A0R) {
            A002 = 0;
        } else if (r1.A0K.A00()) {
            A002 = 3;
        } else {
            A002 = C36371kC.A00(r1.A0K.A01() ? 1 : 0);
        }
        return Integer.valueOf(A002);
    }

    private void A03(Context context, View view, WaTextView waTextView, Integer num, int i, int i2) {
        if (num != null) {
            int i3 = 0;
            view.setVisibility(0);
            int intValue = num.intValue();
            if (intValue > 0) {
                long j = (long) intValue;
                String A012 = AnonymousClass6HA.A01(this.A0M, j);
                String A002 = AnonymousClass6HA.A00(j);
                if (A002 != null) {
                    switch (A002.hashCode()) {
                        case 66:
                            if (A002.equals("B")) {
                                i3 = R.string.f12nameremoved;
                                break;
                            }
                            break;
                        case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                            if (A002.equals("K")) {
                                i3 = R.string.f12nameremoved;
                                break;
                            }
                            break;
                        case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                            if (A002.equals("M")) {
                                i3 = R.string.f12nameremoved;
                                break;
                            }
                            break;
                    }
                    StringBuilder A0v = AnonymousClass000.A0v(A012);
                    C36351kA.A14(context, A0v, i3);
                    A012 = A0v.toString();
                }
                waTextView.setText(context.getResources().getQuantityString(i, intValue, AnonymousClass000.A1b(A012)));
                return;
            }
            waTextView.setText(i2);
            return;
        }
        view.setVisibility(8);
    }

    public static void A04(AnonymousClass6WN r4, AnonymousClass5EL r5) {
        String str = r5.A01;
        if (TextUtils.isEmpty(str)) {
            r4.A03.setVisibility(8);
            return;
        }
        r4.A09.setVisibility(0);
        r4.A06.setVisibility(8);
        r4.A04.setVisibility(8);
        r4.A09.setText(str);
    }

    public void A05(View view) {
        this.A02 = view;
        this.A0V = (CircleWaImageView) C012005e.A02(view, R.id.business_avatar);
        this.A08 = C36401kF.A0O(view, R.id.business_name);
        this.A0E = C36401kF.A0Q(view, R.id.open_status);
        this.A0F = C36401kF.A0Q(view, R.id.price_tier);
        this.A0B = C36431kI.A0X(view, R.id.open_status_dot_divider);
        this.A0X = C36401kF.A0Q(view, R.id.category);
        this.A0C = C36401kF.A0Q(view, R.id.address);
        this.A0D = C36401kF.A0Q(view, R.id.distance);
        this.A0A = C36431kI.A0X(view, R.id.address_dot_divider);
        this.A0W = (WaImageButton) C012005e.A02(view, R.id.message_btn);
        this.A0Y = C36401kF.A0Q(view, R.id.fb_likes);
        this.A0Z = C36401kF.A0Q(view, R.id.ig_followers);
        this.A0R = C012005e.A02(view, R.id.fb_layout);
        this.A0S = C012005e.A02(view, R.id.ig_layout);
        this.A0Q = C012005e.A02(view, R.id.fb_ig_layout);
        this.A09 = C36401kF.A0O(view, R.id.business_description);
        this.A04 = C36411kG.A0O(view, R.id.description_error);
        this.A06 = (ShimmerFrameLayout) C012005e.A02(view, R.id.description_shimmer);
        this.A0T = C012005e.A02(view, R.id.responiveness_signal);
        this.A03 = C36411kG.A0O(view, R.id.description_container);
        this.A0K = (DirectoryProductImagesCardView) C012005e.A02(view, R.id.product_images_preview);
        this.A0U = C36411kG.A0O(view, R.id.additional_data_container);
        this.A05 = C90514aH.A0U(view, R.id.service_offerings_layout);
        this.A0G = C36401kF.A0Q(view, R.id.offering_name);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cb, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01cc, code lost:
        r5 = r1.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ce, code lost:
        if (r6 != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d0, code lost:
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d2, code lost:
        r5.setVisibility(r7);
        X.C36411kG.A1C(r1.A0W, r1, r3, 22);
        r9 = r1.A07;
        r8 = r2.A0F;
        r7 = com.whatsapp.jid.UserJid.Companion;
        r1.A0W.setEnabled(!r9.A0M(r7.A02(r8)));
        r1.A02.setEnabled(!r9.A0M(r7.A02(r8)));
        X.C36411kG.A1C(r1.A02, r1, r3, 23);
        r1.A0Q.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020e, code lost:
        if (r3.A05 == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0210, code lost:
        r6 = r1.A0O.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0218, code lost:
        if (X.C90494aF.A1X(r6) == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0220, code lost:
        if (r6.A0E(1564) == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0222, code lost:
        r9 = r2.A0N;
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x022c, code lost:
        if (r8.hasNext() == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022e, code lost:
        r7 = (X.C134766bZ) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023c, code lost:
        if ("facebook".equals(r7.A01) == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023e, code lost:
        r11 = java.lang.Integer.valueOf(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0244, code lost:
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024c, code lost:
        if (r8.hasNext() == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024e, code lost:
        r7 = (X.C134766bZ) r8.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r5.A0E(3429) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x025c, code lost:
        if ("instagram".equals(r7.A01) == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x025e, code lost:
        r14 = java.lang.Integer.valueOf(r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0264, code lost:
        if (r11 != null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0266, code lost:
        if (r14 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0268, code lost:
        r1.A0Q.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x026d, code lost:
        r8 = r19;
        A03(r8, r1.A0R, r1.A0Y, r11, com.whatsapp.R.plurals.f10nameremoved, com.whatsapp.R.string.f12nameremoved);
        A03(r8, r1.A0S, r1.A0Z, r14, com.whatsapp.R.plurals.f10nameremoved, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0292, code lost:
        if (r3.A05 == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0294, code lost:
        r5 = r1.A0O.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x029c, code lost:
        if (X.C90494aF.A1X(r5) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a4, code lost:
        if (r5.A0E(1696) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a8, code lost:
        if (r2.A0S == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02aa, code lost:
        r1.A0T.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02af, code lost:
        r3 = r2.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b1, code lost:
        if (r3 == null) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b7, code lost:
        if (r3.isEmpty() != false) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b9, code lost:
        r6 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r6 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c1, code lost:
        if (r6.hasNext() == false) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c3, code lost:
        r5 = (X.C134806bd) r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02cb, code lost:
        if (r5.A04 == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02d5, code lost:
        if ("restaurant_delivery".equals(r5.A03) == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02d7, code lost:
        r3 = r1.A0O.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02df, code lost:
        if (X.C90494aF.A1X(r3) == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02e7, code lost:
        if (r3.A0E(4457) == false) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02e9, code lost:
        r3 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ef, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02f1, code lost:
        r1.A05.setVisibility(0);
        r1.A0G.setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fc, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02fe, code lost:
        r1.A0T.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0304, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0307, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r1.A0D.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0311, code lost:
        r5.setText(r9);
        r1.A0C.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x031b, code lost:
        r6.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0320, code lost:
        r1.A0F.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0327, code lost:
        r5.setText(r9);
        r7 = r1.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x032c, code lost:
        if (r10 == 0) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x032e, code lost:
        r6 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0332, code lost:
        if (r10 == 1) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r6 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0337, code lost:
        X.C36331k8.A0r(r19, r7, r6);
        r1.A0E.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0343, code lost:
        r6 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r2.A0Q == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0347, code lost:
        r6 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x034b, code lost:
        r6 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034f, code lost:
        r6 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0352, code lost:
        r9 = r19.getString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x035a, code lost:
        r1.A08.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0363, code lost:
        if (r3.A03 == false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0365, code lost:
        r12 = r2.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x036b, code lost:
        if (android.text.TextUtils.isEmpty(r12) != false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x036d, code lost:
        r7 = r1.A0J;
        r10 = r1.A0V;
        r8 = X.AnonymousClass00E.A00(r10.getContext(), com.whatsapp.R.drawable.avatar_contact);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r5 = r1.A0O.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0384, code lost:
        if (r7.A00.A0E(2185) == false) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0386, code lost:
        r10.setTag(com.whatsapp.R.id.optin_for_bitmapool_caching, X.C36371kC.A0m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0390, code lost:
        r7.A01.A00(r8, r8, r10, (X.C160197kc) null, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0399, code lost:
        r1.A0V.setImageResource(com.whatsapp.R.drawable.avatar_contact);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03a3, code lost:
        A04(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a8, code lost:
        r1.A06.setVisibility(0);
        r1.A09.setVisibility(4);
        r5 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b6, code lost:
        r27 = r1.A02;
        r1.A03.setVisibility(8);
        r11 = false;
        r1.A0K.setVisibility(0);
        r10 = X.C36441kJ.A14(3);
        r6 = r2.A06;
        r5 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ce, code lost:
        if (r6 == null) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03d0, code lost:
        r10.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03d3, code lost:
        if (r5 == null) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (X.C90494aF.A1X(r5) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03d5, code lost:
        r10.addAll(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03d8, code lost:
        r6 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03da, code lost:
        if (r6 == 0) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03dc, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03dd, code lost:
        if (r6 == 1) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03e0, code lost:
        if (r6 == 2) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03e2, code lost:
        X.C67113Yo.A00(r1.A0K, r1, r3, r27, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03f1, code lost:
        if (r10.isEmpty() != false) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03f3, code lost:
        r9 = r1.A0K;
        r8 = r1.A0J;
        X.AnonymousClass00C.A0D(r8, 1);
        r18 = X.C36351kA.A0C(r9);
        r6 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0400, code lost:
        if (r6 == null) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0402, code lost:
        r6.A05((X.C125045zE) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0406, code lost:
        r26 = r9.A01;
        r26.removeAllViews();
        r13 = 0;
        r17 = X.C007103b.A0a(r10, 3).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x041b, code lost:
        if (r17.hasNext() == false) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x041d, code lost:
        r14 = r17.next();
        r16 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0423, code lost:
        if (r13 >= 0) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0429, code lost:
        throw X.C36351kA.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r5.A0E(3361) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x042a, code lost:
        r14 = (java.lang.String) r14;
        X.AnonymousClass00C.A0B(r18);
        r12 = r18.inflate(com.whatsapp.R.layout.f9nameremoved, r9, false);
        r12.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        r12 = (com.facebook.shimmer.ShimmerFrameLayout) r12;
        r7 = X.C36391kE.A0N(r12, com.whatsapp.R.id.product_image_view);
        r15 = (com.whatsapp.WaImageView) r12.findViewById(com.whatsapp.R.id.product_empty_view);
        r15.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0460, code lost:
        if (r8.A00.A0E(2185) == false) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0462, code lost:
        r7.setTag(com.whatsapp.R.id.optin_for_bitmapool_caching, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x046c, code lost:
        r8.A01.A00((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r7, new X.C148886za(r12, r15, r8), r14);
        r26.addView(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x048b, code lost:
        if (r13 == X.C36431kI.A07(r10)) goto L_0x04aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x048d, code lost:
        r7 = new android.view.View(r9.getContext());
        X.C90514aH.A1J(r7, r7.getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved), -1);
        r26.addView(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04aa, code lost:
        r13 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04ae, code lost:
        r1.A0K.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04b5, code lost:
        r10 = r1.A0K;
        r9 = r10.A01;
        r9.removeAllViews();
        r6 = X.C36351kA.A0C(r10);
        X.AnonymousClass00C.A08(r6);
        r8 = r6.inflate(com.whatsapp.R.layout.f9nameremoved, r10, false);
        r8.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        r8 = (com.facebook.shimmer.ShimmerFrameLayout) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d7, code lost:
        if (r11 == false) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d9, code lost:
        X.C36361kB.A0F(r8, com.whatsapp.R.id.product_empty_view).setVisibility(0);
        r8.A05((X.C125045zE) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04e7, code lost:
        r10.A00 = r8;
        r9.addView(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04ee, code lost:
        r1.A05.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r6 = r1.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r9 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r7 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r5 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r8 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        r6.setVisibility(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r9 != false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r8 != false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r7 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        r7 = r1.A02;
        r1.A03.setVisibility(0);
        r1.A0K.setVisibility(8);
        r8 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r8 == 0) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r8 == 1) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r8 != 2) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007a, code lost:
        r1.A04.setVisibility(0);
        r1.A09.setVisibility(4);
        r5 = r1.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        r5.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r2.A0P == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        if (r1.A07.A0M(X.C36431kI.A0l(r2.A0F)) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0097, code lost:
        A04(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        X.C67113Yo.A00(r1.A03, r1, r3, r7, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        r6 = r1.A0H;
        r6.A00 = r3.A06;
        r6.A07 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r3.A03 == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        if (r1.A07.A0M(X.C36431kI.A0l(r2.A0F)) == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        r1.A0P.Boy(new X.C1502474n(r1, r1.A02.getContext(), r1.A0V, 21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d1, code lost:
        r1.A0V.setVisibility(X.C36351kA.A00(r3.A04 ? 1 : 0));
        r1.A08.setText(r2.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e6, code lost:
        if (r2.A08 != 2) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        r1.A08.A0F(X.C55832vG.A00(r1.A0N), com.whatsapp.R.dimen.f7nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r10 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f8, code lost:
        if (r10 == 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        if (r10 == 1) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        if (r10 == 2) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
        r6 = android.text.TextUtils.isEmpty(r9);
        r8 = 8;
        r5 = r1.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r6 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0109, code lost:
        if (r6 == false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        r7 = r2.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
        if (r7 == null) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0112, code lost:
        r6 = r1.A0O.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011a, code lost:
        if (X.C90494aF.A1X(r6) == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0122, code lost:
        if (r6.A0E(4457) == false) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0124, code lost:
        r1.A0F.setVisibility(0);
        r1.A0F.setText(r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0134, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0136, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013d, code lost:
        if (r1.A0F.getVisibility() == 0) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013f, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0140, code lost:
        r5 = r1.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0142, code lost:
        if (r6 == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0144, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0145, code lost:
        r5.setVisibility(r8);
        r7 = r2.A0L;
        r5 = r7.isEmpty();
        r6 = r1.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (r5 != false) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0152, code lost:
        r6.setText(android.text.TextUtils.join(", ", r7));
        r1.A0X.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2.A0R == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0160, code lost:
        r9 = r2.A0D;
        r8 = r2.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0164, code lost:
        if (r8 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016a, code lost:
        if (r8.isEmpty() != false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016c, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0171, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0173, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0174, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0175, code lost:
        if (r5 == false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0177, code lost:
        r9 = ((X.C134756bY) r8.get(0)).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r5 = r1.A0O.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017f, code lost:
        r6 = android.text.TextUtils.isEmpty(r9);
        r5 = r1.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0185, code lost:
        if (r6 == false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0187, code lost:
        r5.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018a, code lost:
        r8 = r3.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x018c, code lost:
        if (r8 == false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018e, code lost:
        r11 = X.C90474aD.A0J(r3.A07, "origin").distanceTo(X.C90474aD.A0J(X.C90484aE.A0S(r2.A0C, r2.A0B.doubleValue()), "destination"));
        r1.A0D.setText(X.C110165aE.A00(r19, X.C36401kF.A0x(r1.A0M), r11));
        r1.A0D.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c6, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c8, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c9, code lost:
        if (r8 != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (X.C90494aF.A1X(r5) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass5EL r29) {
        /*
            r28 = this;
            r3 = r29
            X.6s9 r2 = r3.A0B
            r1 = r28
            android.view.View r0 = r1.A02
            android.content.Context r19 = r0.getContext()
            boolean r6 = r3.A0D
            r0 = 0
            if (r6 == 0) goto L_0x0016
            boolean r4 = r2.A0P
            r9 = 1
            if (r4 != 0) goto L_0x0019
        L_0x0016:
            r9 = 0
            if (r6 == 0) goto L_0x0030
        L_0x0019:
            boolean r4 = r2.A0R
            if (r4 == 0) goto L_0x0030
            X.1QW r4 = r1.A0O
            X.0yC r5 = r4.A03
            boolean r4 = X.C90494aF.A1X(r5)
            if (r4 == 0) goto L_0x0030
            r4 = 3429(0xd65, float:4.805E-42)
            boolean r4 = r5.A0E(r4)
            r8 = 1
            if (r4 != 0) goto L_0x004c
        L_0x0030:
            r8 = 0
            if (r6 == 0) goto L_0x004c
            if (r9 != 0) goto L_0x004c
            boolean r4 = r2.A0Q
            if (r4 == 0) goto L_0x004c
            X.1QW r4 = r1.A0O
            X.0yC r5 = r4.A03
            boolean r4 = X.C90494aF.A1X(r5)
            if (r4 == 0) goto L_0x004c
            r4 = 3361(0xd21, float:4.71E-42)
            boolean r4 = r5.A0E(r4)
            r7 = 1
            if (r4 != 0) goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            android.view.ViewGroup r6 = r1.A0U
            r4 = 8
            if (r9 != 0) goto L_0x0059
            if (r7 != 0) goto L_0x0059
            r5 = 8
            if (r8 == 0) goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            r6.setVisibility(r5)
            if (r9 != 0) goto L_0x03b6
            if (r8 != 0) goto L_0x03b6
            if (r7 == 0) goto L_0x00a1
            android.view.View r7 = r1.A02
            android.view.ViewGroup r5 = r1.A03
            r5.setVisibility(r0)
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r5 = r1.A0K
            r5.setVisibility(r4)
            int r8 = r2.A01
            r6 = 4
            if (r8 == 0) goto L_0x03a8
            r5 = 1
            if (r8 == r5) goto L_0x03a3
            r5 = 2
            if (r8 != r5) goto L_0x0089
            android.view.ViewGroup r5 = r1.A04
            r5.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r5 = r1.A09
            r5.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r5 = r1.A06
        L_0x0086:
            r5.setVisibility(r6)
        L_0x0089:
            X.0wQ r6 = r1.A07
            java.lang.String r5 = r2.A0F
            com.whatsapp.jid.UserJid r5 = X.C36431kI.A0l(r5)
            boolean r5 = r6.A0M(r5)
            if (r5 == 0) goto L_0x009a
            A04(r1, r3)
        L_0x009a:
            android.view.ViewGroup r6 = r1.A03
            r5 = 11
            X.C67113Yo.A00(r6, r1, r3, r7, r5)
        L_0x00a1:
            X.6V2 r6 = r1.A0H
            int r5 = r3.A06
            r6.A00 = r5
            java.lang.String r5 = r3.A02
            r6.A07 = r5
            boolean r5 = r3.A03
            if (r5 == 0) goto L_0x0361
            X.0wQ r6 = r1.A07
            java.lang.String r5 = r2.A0F
            com.whatsapp.jid.UserJid r5 = X.C36431kI.A0l(r5)
            boolean r5 = r6.A0M(r5)
            if (r5 == 0) goto L_0x0361
            android.view.View r5 = r1.A02
            android.content.Context r9 = r5.getContext()
            com.whatsapp.CircleWaImageView r8 = r1.A0V
            X.0wU r7 = r1.A0P
            r6 = 21
            X.74n r5 = new X.74n
            r5.<init>(r1, r9, r8, r6)
            r7.Boy(r5)
        L_0x00d1:
            com.whatsapp.CircleWaImageView r6 = r1.A0V
            boolean r5 = r3.A04
            int r5 = X.C36351kA.A00(r5)
            r6.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r6 = r1.A08
            java.lang.String r5 = r2.A0I
            r6.setText(r5)
            int r6 = r2.A08
            r5 = 2
            if (r6 != r5) goto L_0x035a
            X.0yC r5 = r1.A0N
            int r7 = X.C55832vG.A00(r5)
            com.whatsapp.TextEmojiLabel r6 = r1.A08
            r5 = 2131166927(0x7f0706cf, float:1.7948113E38)
            r6.A0F(r7, r5)
        L_0x00f6:
            int r10 = r2.A07
            if (r10 == 0) goto L_0x034b
            r5 = 1
            if (r10 == r5) goto L_0x034f
            r5 = 2
            if (r10 == r5) goto L_0x0347
            r9 = 0
        L_0x0101:
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r8 = 8
            com.whatsapp.WaTextView r5 = r1.A0E
            if (r6 == 0) goto L_0x0327
            r5.setVisibility(r4)
        L_0x010e:
            X.6bQ r7 = r2.A09
            if (r7 == 0) goto L_0x0320
            X.1QW r5 = r1.A0O
            X.0yC r6 = r5.A03
            boolean r5 = X.C90494aF.A1X(r6)
            if (r5 == 0) goto L_0x0320
            r5 = 4457(0x1169, float:6.246E-42)
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x0320
            com.whatsapp.WaTextView r5 = r1.A0F
            r5.setVisibility(r0)
            com.whatsapp.WaTextView r6 = r1.A0F
            java.lang.String r5 = r7.A02
            r6.setText(r5)
        L_0x0130:
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x013f
            com.whatsapp.WaTextView r5 = r1.A0F
            int r5 = r5.getVisibility()
            r6 = 1
            if (r5 == 0) goto L_0x0140
        L_0x013f:
            r6 = 0
        L_0x0140:
            com.whatsapp.WaImageView r5 = r1.A0B
            if (r6 == 0) goto L_0x0145
            r8 = 0
        L_0x0145:
            r5.setVisibility(r8)
            java.util.List r7 = r2.A0L
            boolean r5 = r7.isEmpty()
            com.whatsapp.WaTextView r6 = r1.A0X
            if (r5 != 0) goto L_0x031b
            java.lang.String r5 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r5, r7)
            r6.setText(r5)
            com.whatsapp.WaTextView r5 = r1.A0X
            r5.setVisibility(r0)
        L_0x0160:
            java.lang.String r9 = r2.A0D
            java.util.List r8 = r2.A0K
            if (r8 == 0) goto L_0x0173
            boolean r5 = r8.isEmpty()
            if (r5 != 0) goto L_0x0173
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r5 = 1
            if (r6 != 0) goto L_0x0174
        L_0x0173:
            r5 = 0
        L_0x0174:
            r7 = 0
            if (r5 == 0) goto L_0x017f
            java.lang.Object r5 = r8.get(r0)
            X.6bY r5 = (X.C134756bY) r5
            java.lang.String r9 = r5.A03
        L_0x017f:
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            com.whatsapp.WaTextView r5 = r1.A0C
            if (r6 == 0) goto L_0x0311
            r5.setVisibility(r4)
        L_0x018a:
            boolean r8 = r3.A0C
            if (r8 == 0) goto L_0x030a
            com.google.android.gms.maps.model.LatLng r11 = r3.A07
            java.lang.Double r5 = r2.A0B
            double r5 = r5.doubleValue()
            java.lang.Double r10 = r2.A0C
            com.google.android.gms.maps.model.LatLng r10 = X.C90484aE.A0S(r10, r5)
            java.lang.String r5 = "origin"
            android.location.Location r6 = X.C90474aD.A0J(r11, r5)
            java.lang.String r5 = "destination"
            android.location.Location r5 = X.C90474aD.A0J(r10, r5)
            float r11 = r6.distanceTo(r5)
            com.whatsapp.WaTextView r10 = r1.A0D
            X.0ts r5 = r1.A0M
            java.util.Locale r6 = X.C36401kF.A0x(r5)
            r5 = r19
            java.lang.String r5 = X.C110165aE.A00(r5, r6, r11)
            r10.setText(r5)
            com.whatsapp.WaTextView r5 = r1.A0D
            r5.setVisibility(r0)
        L_0x01c2:
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x01cb
            r6 = 1
            if (r8 != 0) goto L_0x01cc
        L_0x01cb:
            r6 = 0
        L_0x01cc:
            com.whatsapp.WaImageView r5 = r1.A0A
            if (r6 != 0) goto L_0x01d2
            r7 = 8
        L_0x01d2:
            r5.setVisibility(r7)
            com.whatsapp.WaImageButton r6 = r1.A0W
            r5 = 22
            X.C36411kG.A1C(r6, r1, r3, r5)
            X.0wQ r9 = r1.A07
            java.lang.String r8 = r2.A0F
            X.13r r7 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = r7.A02(r8)
            boolean r5 = r9.A0M(r5)
            com.whatsapp.WaImageButton r6 = r1.A0W
            r5 = r5 ^ 1
            r6.setEnabled(r5)
            android.view.View r6 = r1.A02
            com.whatsapp.jid.UserJid r5 = r7.A02(r8)
            boolean r5 = r9.A0M(r5)
            r5 = r5 ^ 1
            r6.setEnabled(r5)
            android.view.View r6 = r1.A02
            r5 = 23
            X.C36411kG.A1C(r6, r1, r3, r5)
            android.view.View r5 = r1.A0Q
            r5.setVisibility(r4)
            boolean r5 = r3.A05
            if (r5 == 0) goto L_0x0290
            X.1QW r5 = r1.A0O
            X.0yC r6 = r5.A03
            boolean r5 = X.C90494aF.A1X(r6)
            if (r5 == 0) goto L_0x0290
            r5 = 1564(0x61c, float:2.192E-42)
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x0290
            java.util.List r9 = r2.A0N
            java.util.Iterator r8 = r9.iterator()
        L_0x0228:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0307
            java.lang.Object r7 = r8.next()
            X.6bZ r7 = (X.C134766bZ) r7
            java.lang.String r6 = r7.A01
            java.lang.String r5 = "facebook"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0228
            int r5 = r7.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
        L_0x0244:
            java.util.Iterator r8 = r9.iterator()
        L_0x0248:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0304
            java.lang.Object r7 = r8.next()
            X.6bZ r7 = (X.C134766bZ) r7
            java.lang.String r6 = r7.A01
            java.lang.String r5 = "instagram"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0248
            int r5 = r7.A00
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
        L_0x0264:
            if (r11 != 0) goto L_0x0268
            if (r14 == 0) goto L_0x026d
        L_0x0268:
            android.view.View r5 = r1.A0Q
            r5.setVisibility(r0)
        L_0x026d:
            r12 = 2131755019(0x7f10000b, float:1.9140905E38)
            r13 = 2131889528(0x7f120d78, float:1.9413722E38)
            com.whatsapp.WaTextView r6 = r1.A0Y
            android.view.View r5 = r1.A0R
            r7 = r1
            r8 = r19
            r9 = r5
            r10 = r6
            r7.A03(r8, r9, r10, r11, r12, r13)
            r15 = 2131755020(0x7f10000c, float:1.9140907E38)
            r16 = 2131890485(0x7f121135, float:1.9415663E38)
            com.whatsapp.WaTextView r6 = r1.A0Z
            android.view.View r5 = r1.A0S
            r10 = r1
            r11 = r8
            r12 = r5
            r13 = r6
            r10.A03(r11, r12, r13, r14, r15, r16)
        L_0x0290:
            boolean r3 = r3.A05
            if (r3 == 0) goto L_0x02fe
            X.1QW r3 = r1.A0O
            X.0yC r5 = r3.A03
            boolean r3 = X.C90494aF.A1X(r5)
            if (r3 == 0) goto L_0x02fe
            r3 = 1696(0x6a0, float:2.377E-42)
            boolean r3 = r5.A0E(r3)
            if (r3 == 0) goto L_0x02fe
            boolean r3 = r2.A0S
            if (r3 == 0) goto L_0x02fe
            android.view.View r3 = r1.A0T
            r3.setVisibility(r0)
        L_0x02af:
            java.util.List r3 = r2.A0O
            if (r3 == 0) goto L_0x02fc
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x02fc
            java.util.Iterator r6 = r3.iterator()
        L_0x02bd:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x02fc
            java.lang.Object r5 = r6.next()
            X.6bd r5 = (X.C134806bd) r5
            boolean r2 = r5.A04
            if (r2 == 0) goto L_0x02bd
            java.lang.String r3 = r5.A03
            java.lang.String r2 = "restaurant_delivery"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02bd
            X.1QW r2 = r1.A0O
            X.0yC r3 = r2.A03
            boolean r2 = X.C90494aF.A1X(r3)
            if (r2 == 0) goto L_0x02bd
            r2 = 4457(0x1169, float:6.246E-42)
            boolean r2 = r3.A0E(r2)
            if (r2 == 0) goto L_0x02bd
            java.lang.String r3 = r5.A02
        L_0x02eb:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x04ee
            android.widget.LinearLayout r2 = r1.A05
            r2.setVisibility(r0)
            com.whatsapp.WaTextView r0 = r1.A0G
            r0.setText(r3)
            return
        L_0x02fc:
            r3 = 0
            goto L_0x02eb
        L_0x02fe:
            android.view.View r3 = r1.A0T
            r3.setVisibility(r4)
            goto L_0x02af
        L_0x0304:
            r14 = 0
            goto L_0x0264
        L_0x0307:
            r11 = 0
            goto L_0x0244
        L_0x030a:
            com.whatsapp.WaTextView r5 = r1.A0D
            r5.setVisibility(r4)
            goto L_0x01c2
        L_0x0311:
            r5.setText(r9)
            com.whatsapp.WaTextView r5 = r1.A0C
            r5.setVisibility(r0)
            goto L_0x018a
        L_0x031b:
            r6.setVisibility(r4)
            goto L_0x0160
        L_0x0320:
            com.whatsapp.WaTextView r5 = r1.A0F
            r5.setVisibility(r4)
            goto L_0x0130
        L_0x0327:
            r5.setText(r9)
            com.whatsapp.WaTextView r7 = r1.A0E
            if (r10 == 0) goto L_0x0343
            r5 = 1
            r6 = 2131099948(0x7f06012c, float:1.7812264E38)
            if (r10 == r5) goto L_0x0337
            r6 = 2131101132(0x7f0605cc, float:1.7814665E38)
        L_0x0337:
            r5 = r19
            X.C36331k8.A0r(r5, r7, r6)
            com.whatsapp.WaTextView r5 = r1.A0E
            r5.setVisibility(r0)
            goto L_0x010e
        L_0x0343:
            r6 = 2131099947(0x7f06012b, float:1.7812262E38)
            goto L_0x0337
        L_0x0347:
            r6 = 2131887240(0x7f120488, float:1.9409081E38)
            goto L_0x0352
        L_0x034b:
            r6 = 2131887239(0x7f120487, float:1.940908E38)
            goto L_0x0352
        L_0x034f:
            r6 = 2131887250(0x7f120492, float:1.9409102E38)
        L_0x0352:
            r5 = r19
            java.lang.String r9 = r5.getString(r6)
            goto L_0x0101
        L_0x035a:
            com.whatsapp.TextEmojiLabel r5 = r1.A08
            r5.A0E()
            goto L_0x00f6
        L_0x0361:
            boolean r5 = r3.A03
            if (r5 == 0) goto L_0x0399
            java.lang.String r12 = r2.A0G
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            if (r5 != 0) goto L_0x0399
            X.61o r7 = r1.A0J
            com.whatsapp.CircleWaImageView r10 = r1.A0V
            android.content.Context r6 = r10.getContext()
            r5 = 2131231033(0x7f080139, float:1.8078136E38)
            android.graphics.drawable.Drawable r8 = X.AnonymousClass00E.A00(r6, r5)
            X.0yC r6 = r7.A00
            r5 = 2185(0x889, float:3.062E-42)
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x0390
            r6 = 2131432219(0x7f0b131b, float:1.848619E38)
            java.lang.Boolean r5 = X.C36371kC.A0m()
            r10.setTag(r6, r5)
        L_0x0390:
            X.6CW r7 = r7.A01
            r11 = 0
            r9 = r8
            r7.A00(r8, r9, r10, r11, r12)
            goto L_0x00d1
        L_0x0399:
            com.whatsapp.CircleWaImageView r6 = r1.A0V
            r5 = 2131231033(0x7f080139, float:1.8078136E38)
            r6.setImageResource(r5)
            goto L_0x00d1
        L_0x03a3:
            A04(r1, r3)
            goto L_0x0089
        L_0x03a8:
            com.facebook.shimmer.ShimmerFrameLayout r5 = r1.A06
            r5.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r5 = r1.A09
            r5.setVisibility(r6)
            android.view.ViewGroup r5 = r1.A04
            goto L_0x0086
        L_0x03b6:
            android.view.View r5 = r1.A02
            r27 = r5
            android.view.ViewGroup r5 = r1.A03
            r5.setVisibility(r4)
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r5 = r1.A0K
            r11 = 0
            r5.setVisibility(r0)
            r5 = 3
            java.util.ArrayList r10 = X.C36441kJ.A14(r5)
            java.util.List r6 = r2.A06
            java.util.List r5 = r2.A05
            if (r6 == 0) goto L_0x03d3
            r10.addAll(r6)
        L_0x03d3:
            if (r5 == 0) goto L_0x03d8
            r10.addAll(r5)
        L_0x03d8:
            int r6 = r2.A01
            if (r6 == 0) goto L_0x04b5
            r11 = 1
            if (r6 == r11) goto L_0x03ed
            r5 = 2
            if (r6 == r5) goto L_0x04b5
        L_0x03e2:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r7 = r1.A0K
            r6 = 10
            r5 = r27
            X.C67113Yo.A00(r7, r1, r3, r5, r6)
            goto L_0x00a1
        L_0x03ed:
            boolean r5 = r10.isEmpty()
            if (r5 != 0) goto L_0x04ae
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r9 = r1.A0K
            X.61o r8 = r1.A0J
            X.AnonymousClass00C.A0D(r8, r11)
            android.view.LayoutInflater r18 = X.C36351kA.A0C(r9)
            com.facebook.shimmer.ShimmerFrameLayout r6 = r9.A00
            if (r6 == 0) goto L_0x0406
            r5 = 0
            r6.A05(r5)
        L_0x0406:
            android.widget.LinearLayout r5 = r9.A01
            r26 = r5
            r26.removeAllViews()
            r5 = 3
            java.util.List r5 = X.C007103b.A0a(r10, r5)
            r13 = 0
            java.util.Iterator r17 = r5.iterator()
        L_0x0417:
            boolean r5 = r17.hasNext()
            if (r5 == 0) goto L_0x03e2
            java.lang.Object r14 = r17.next()
            int r16 = r13 + 1
            if (r13 >= 0) goto L_0x042a
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x042a:
            java.lang.String r14 = (java.lang.String) r14
            X.AnonymousClass00C.A0B(r18)
            r6 = 2131624274(0x7f0e0152, float:1.8875723E38)
            r5 = r18
            android.view.View r12 = r5.inflate(r6, r9, r0)
            r7 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r7, r7, r6)
            r12.setLayoutParams(r5)
            com.facebook.shimmer.ShimmerFrameLayout r12 = (com.facebook.shimmer.ShimmerFrameLayout) r12
            r5 = 2131432941(0x7f0b15ed, float:1.8487654E38)
            android.widget.ImageView r7 = X.C36391kE.A0N(r12, r5)
            r5 = 2131432938(0x7f0b15ea, float:1.8487648E38)
            android.view.View r15 = r12.findViewById(r5)
            com.whatsapp.WaImageView r15 = (com.whatsapp.WaImageView) r15
            r15.setVisibility(r4)
            X.0yC r6 = r8.A00
            r5 = 2185(0x889, float:3.062E-42)
            boolean r5 = r6.A0E(r5)
            if (r5 == 0) goto L_0x046c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            r5 = 2131432219(0x7f0b131b, float:1.848619E38)
            r7.setTag(r5, r6)
        L_0x046c:
            X.6CW r6 = r8.A01
            X.6za r5 = new X.6za
            r5.<init>(r12, r15, r8)
            r21 = 0
            r20 = r6
            r22 = r21
            r23 = r7
            r24 = r5
            r25 = r14
            r20.A00(r21, r22, r23, r24, r25)
            r5 = r26
            r5.addView(r12)
            int r5 = X.C36431kI.A07(r10)
            if (r13 == r5) goto L_0x04aa
            android.content.Context r5 = r9.getContext()
            android.view.View r7 = new android.view.View
            r7.<init>(r5)
            android.content.res.Resources r6 = r7.getResources()
            r5 = 2131166278(0x7f070446, float:1.7946797E38)
            int r6 = r6.getDimensionPixelSize(r5)
            r5 = -1
            X.C90514aH.A1J(r7, r6, r5)
            r5 = r26
            r5.addView(r7)
        L_0x04aa:
            r13 = r16
            goto L_0x0417
        L_0x04ae:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r5 = r1.A0K
            r5.setVisibility(r4)
            goto L_0x03e2
        L_0x04b5:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r10 = r1.A0K
            android.widget.LinearLayout r9 = r10.A01
            r9.removeAllViews()
            android.view.LayoutInflater r6 = X.C36351kA.A0C(r10)
            X.AnonymousClass00C.A08(r6)
            r5 = 2131624274(0x7f0e0152, float:1.8875723E38)
            android.view.View r8 = r6.inflate(r5, r10, r0)
            r7 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r7, r7, r6)
            r8.setLayoutParams(r5)
            com.facebook.shimmer.ShimmerFrameLayout r8 = (com.facebook.shimmer.ShimmerFrameLayout) r8
            if (r11 == 0) goto L_0x04e7
            r5 = 2131432938(0x7f0b15ea, float:1.8487648E38)
            android.view.View r5 = X.C36361kB.A0F(r8, r5)
            r5.setVisibility(r0)
            r5 = 0
            r8.A05(r5)
        L_0x04e7:
            r10.A00 = r8
            r9.addView(r8)
            goto L_0x03e2
        L_0x04ee:
            android.widget.LinearLayout r0 = r1.A05
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WN.A06(X.5EL):void");
    }

    public void A07(AnonymousClass5EL r13) {
        C160947lq r0 = r13.A0A;
        if (r0 != null) {
            C33191es r1 = this.A01;
            int Bmk = r0.Bmk();
            r1.A01(r0.Blt(), C36401kF.A0j(), r0.Bme(), r0.BpU(), r0.BpW(), r0.Bml(), r0.BmE(), r0.BQB(), Bmk, r0.B6c());
        }
    }

    public AnonymousClass6WN(C19730wQ r2, AnonymousClass6V2 r3, AnonymousClass67X r4, C1258561o r5, C27761Ps r6, C19630wG r7, C18820ts r8, C20810yC r9, AnonymousClass1QW r10, C33191es r11, C19770wU r12) {
        this.A0N = r9;
        this.A00 = r7;
        this.A07 = r2;
        this.A0P = r12;
        this.A0J = r5;
        this.A0M = r8;
        this.A0O = r10;
        this.A0I = r4;
        this.A0H = r3;
        this.A0L = r6;
        this.A01 = r11;
    }
}
