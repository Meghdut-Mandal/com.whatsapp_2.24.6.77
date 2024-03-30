package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass076;
import X.AnonymousClass1AW;
import X.AnonymousClass1JN;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass34J;
import X.AnonymousClass3FX;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C19770wU;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36401kF;
import X.C36441kJ;
import X.C62563Gq;
import X.C64103Mq;
import X.C64993Qh;
import X.C65413Ry;
import X.C67073Yk;
import X.C67083Yl;
import X.C67093Ym;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class InteractiveMessageView extends LinearLayout implements C18700tb {
    public View.OnLongClickListener A00;
    public View A01;
    public WaImageView A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public C64993Qh A06;
    public C64103Mq A07;
    public AnonymousClass3FX A08;
    public C65413Ry A09;
    public C18820ts A0A;
    public C20810yC A0B;
    public AnonymousClass1JN A0C;
    public AnonymousClass1AW A0D;
    public C62563Gq A0E;
    public C19770wU A0F;
    public AnonymousClass1QZ A0G;
    public Map A0H;
    public boolean A0I;
    public View A0J;
    public WaTextView A0K;
    public final TextEmojiLabel A0L;
    public final AnonymousClass1RJ A0M;
    public final FrameLayout A0N;
    public final TextEmojiLabel A0O;
    public final AnonymousClass34J A0P;
    public final DynamicMessageView A0Q;
    public final AnonymousClass1RJ A0R;

    public InteractiveMessageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static JSONObject A00(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return C36441kJ.A1C(str);
            } catch (JSONException e) {
                Log.e(AnonymousClass000.A0p("InteractiveMessageView/parseNfmMessageParamsJson/invalid json=", str, AnonymousClass000.A0u()), e);
            }
        }
        return C36441kJ.A1B();
    }

    public static void A01(InteractiveMessageView interactiveMessageView) {
        interactiveMessageView.A02.setImageResource(R.drawable.ic_gift_card_disabled);
        AnonymousClass076.A06(interactiveMessageView.A02.getDrawable(), AnonymousClass00F.A00(interactiveMessageView.getContext(), R.color.f6nameremoved));
        C012005e.A0F(AnonymousClass00F.A04(interactiveMessageView.getContext(), R.color.f6nameremoved), interactiveMessageView.A02);
        if (interactiveMessageView.A09.A04 == null) {
            interactiveMessageView.A01.setOnClickListener(C67073Yk.A00);
            interactiveMessageView.A0N.setOnClickListener(C67083Yl.A00);
            interactiveMessageView.setOnClickListener(C67093Ym.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0290, code lost:
        if (r9.has("limited_time_offer") == false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        if (r13 == 4) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        if (r0.A01 != 2) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass2IR r18, X.AnonymousClass3T1 r19) {
        /*
            r17 = this;
            r8 = r19
            boolean r0 = r8 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x04bc
            r9 = r8
            X.B1o r9 = (X.C23043B1o) r9
            X.9uk r6 = r9.BA8()
            r7 = r17
            X.1AW r0 = r7.A0D
            X.9gz r5 = r0.A01(r9)
            X.34J r4 = r7.A0P
            r3 = 0
            X.AnonymousClass00C.A0D(r8, r3)
            X.9uk r2 = r9.BA8()
            r10 = r18
            if (r2 == 0) goto L_0x00f0
            int r13 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0 = 2
            r12 = 1
            if (r1 == 0) goto L_0x00f0
            if (r13 == r0) goto L_0x00ed
            r0 = 6
            if (r13 == r0) goto L_0x00ed
            r11 = 4
            r1 = 3
            if (r13 == r12) goto L_0x00ea
            r0 = 5
            if (r13 != r0) goto L_0x00d5
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x00de
            X.9uX r0 = r2.A04
            if (r0 == 0) goto L_0x00de
            int r0 = r0.A01
            if (r0 != r12) goto L_0x00de
            r11 = 5
        L_0x0048:
            android.widget.FrameLayout r12 = r4.A00
            r12.setVisibility(r3)
            java.util.Map r0 = r4.A01
            java.lang.Object r0 = X.C36371kC.A0r(r0, r11)
            X.3BX r0 = (X.AnonymousClass3BX) r0
            if (r0 == 0) goto L_0x04b5
            r0.A01(r12, r10, r8, r2)
        L_0x005a:
            r4 = 8
            r2 = 0
            if (r6 == 0) goto L_0x00fe
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x00fe
            X.9uX r0 = r6.A04
            if (r0 == 0) goto L_0x00fe
            int r1 = r0.A01
            r0 = 2
            if (r1 != r0) goto L_0x00fe
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r11 = r7.A0Q
            r11.setVisibility(r3)
            X.9uX r0 = r6.A04
            java.util.List r13 = r0.A04
            java.lang.Object r1 = r11.getTag()
            X.3Qa r0 = r8.A1J
            java.lang.String r5 = r0.A01
            boolean r0 = X.AnonymousClass00C.A0J(r1, r5)
            if (r0 != 0) goto L_0x0145
            if (r13 == 0) goto L_0x013e
            java.util.Iterator r16 = r13.iterator()
        L_0x008b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r1 = r16.next()
            X.9sw r1 = (X.C206239sw) r1
            boolean r0 = r1 instanceof X.C181968oK
            if (r0 == 0) goto L_0x00f9
            X.8oK r1 = (X.C181968oK) r1
            android.content.Context r14 = r11.getContext()
            r0 = 0
            com.whatsapp.StarRatingBar r3 = new com.whatsapp.StarRatingBar
            r3.<init>(r14, r0)
            java.lang.String r0 = r1.A01
            r3.setTag(r0)
            r15 = -2
            r14 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r15, r15, r14)
            r3.setLayoutParams(r0)
            r0 = 17
            r3.setGravity(r0)
            X.3cX r0 = new X.3cX
            r0.<init>(r1)
            r3.A01 = r0
            X.9sy r1 = r1.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.interactive.layout.RatingType.Stars"
            X.AnonymousClass00C.A0E(r1, r0)
            X.8oM r1 = (X.C181988oM) r1
            int r0 = r1.A00
            r3.setRating(r0)
            r11.addView(r3)
            goto L_0x008b
        L_0x00d5:
            if (r13 != r1) goto L_0x00da
            r11 = 3
            goto L_0x0048
        L_0x00da:
            if (r13 != r11) goto L_0x00f0
            goto L_0x0048
        L_0x00de:
            if (r1 == 0) goto L_0x00ea
            X.9uX r0 = r2.A04
            if (r0 == 0) goto L_0x00ea
            int r1 = r0.A01
            r0 = 2
            r11 = 6
            if (r1 == r0) goto L_0x0048
        L_0x00ea:
            r11 = 2
            goto L_0x0048
        L_0x00ed:
            r11 = 1
            goto L_0x0048
        L_0x00f0:
            android.widget.FrameLayout r12 = r4.A00
            r0 = 8
            r12.setVisibility(r0)
            goto L_0x005a
        L_0x00f9:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00fe:
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r0 = r7.A0Q
            r0.setVisibility(r4)
            if (r5 == 0) goto L_0x0138
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = r5.A0C(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0138
            android.content.Context r0 = r7.getContext()
            java.lang.String r1 = r5.A0C(r0)
            com.whatsapp.TextEmojiLabel r0 = r7.A0L
            r10.setMessageText(r1, r0, r8)
            r0.setVisibility(r3)
        L_0x0123:
            if (r6 == 0) goto L_0x015c
            java.lang.String r0 = r6.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x015c
            com.whatsapp.TextEmojiLabel r1 = r7.A0O
            r1.setVisibility(r3)
            java.lang.String r0 = r6.A0A
            r10.setMessageText(r0, r1, r8)
            goto L_0x0161
        L_0x0138:
            com.whatsapp.TextEmojiLabel r0 = r7.A0L
            r0.setVisibility(r4)
            goto L_0x0123
        L_0x013e:
            r11.A04 = r13
            r11.A03 = r8
            r11.setTag(r5)
        L_0x0145:
            X.9uX r0 = r6.A04
            X.9tV r0 = r0.A00
            if (r0 == 0) goto L_0x02d2
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x02d2
            r11.A05 = r2
            r11.setClickable(r2)
            r11.setFocusable(r2)
        L_0x0157:
            com.whatsapp.TextEmojiLabel r0 = r7.A0L
            r0.setVisibility(r4)
        L_0x015c:
            com.whatsapp.TextEmojiLabel r0 = r7.A0O
            r0.setVisibility(r4)
        L_0x0161:
            X.9uk r0 = r9.BA8()
            if (r0 == 0) goto L_0x02bf
            X.9uX r0 = r0.A04
            if (r0 == 0) goto L_0x02bf
            java.util.List r0 = r0.A03
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L_0x02bf
        L_0x0174:
            X.3Qa r0 = r8.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x019d
            android.view.ViewGroup r4 = r10.getDateWrapper()
            X.C18740tg.A04(r4)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            X.0ts r0 = r7.A0A
            boolean r0 = X.C36351kA.A1Y(r0)
            int r0 = X.C36421kH.A01(r0)
            r1 = r0 | 80
            boolean r0 = r3 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x02b4
            r0 = r3
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.gravity = r1
        L_0x019a:
            r4.setLayoutParams(r3)
        L_0x019d:
            r1 = 2131430415(0x7f0b0c0f, float:1.848253E38)
            android.view.View r0 = r12.findViewById(r1)
            if (r0 == 0) goto L_0x01b3
            android.view.View r1 = r12.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.graphics.drawable.Drawable r0 = r10.getInnerFrameForegroundDrawable()
            r1.setForeground(r0)
        L_0x01b3:
            if (r6 == 0) goto L_0x04bc
            X.9uX r0 = r6.A04
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0248
            X.1RJ r4 = r7.A0R
            if (r4 == 0) goto L_0x0248
            X.9uX r0 = r6.A04
            java.lang.String r0 = r0.A02
            org.json.JSONObject r3 = A00(r0)
            android.content.Context r5 = r7.getContext()
            X.AnonymousClass00C.A0D(r5, r2)
            java.lang.String r1 = "reminder_info"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x0248
            org.json.JSONObject r9 = r3.optJSONObject(r1)
            if (r9 == 0) goto L_0x0248
            java.lang.String r0 = "reminder_status"
            java.lang.String r3 = r9.optString(r0)
            if (r3 == 0) goto L_0x0248
            int r1 = r3.hashCode()
            r0 = -954581179(0xffffffffc71a3f45, float:-39487.27)
            if (r1 == r0) goto L_0x02a4
            r0 = -750561850(0xffffffffd34355c6, float:-8.3895766E11)
            if (r1 == r0) goto L_0x0298
            r0 = 682647242(0x28b05eca, float:1.9581033E-14)
            if (r1 != r0) goto L_0x0248
            java.lang.String r0 = "reminder_pending"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = "scheduled_timestamp"
            java.lang.String r0 = r9.optString(r0)
            if (r0 == 0) goto L_0x0248
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            if (r3 == 0) goto L_0x0248
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            java.text.SimpleDateFormat r0 = X.C64103Mq.A00
            java.lang.String r1 = r0.format(r3)
            java.text.SimpleDateFormat r0 = X.C64103Mq.A01
            java.lang.String r9 = r0.format(r3)
            r3 = 2131891218(0x7f121412, float:1.941715E38)
            java.lang.Object[] r1 = X.C36411kG.A1b(r1)
            r0 = 1
            java.lang.String r1 = X.C36391kE.A0v(r5, r9, r1, r0, r3)
        L_0x0234:
            if (r1 == 0) goto L_0x0248
            android.view.View r0 = X.C36391kE.A0L(r4, r2)
            r7.A0J = r0
            r0 = 2131433253(0x7f0b1725, float:1.8488286E38)
            com.whatsapp.WaTextView r0 = X.C36411kG.A0Z(r7, r0)
            r7.A0K = r0
            r0.setText(r1)
        L_0x0248:
            X.9uX r0 = r6.A04
            if (r0 == 0) goto L_0x04bc
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04bc
            X.3Gq r0 = r7.A0E
            X.0yC r1 = r0.A00
            r0 = 4693(0x1255, float:6.576E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x04bc
            X.1RJ r0 = r7.A0M
            if (r0 == 0) goto L_0x04bc
            X.3Ry r0 = r7.A09
            if (r0 == 0) goto L_0x04bc
            X.9uX r0 = r6.A04
            java.lang.String r0 = r0.A02
            org.json.JSONObject r9 = A00(r0)
            X.3Ry r6 = r7.A09
            X.3D7 r0 = new X.3D7
            r0.<init>(r7, r8)
            r6.A02 = r0
            int r5 = r8.A1I
            X.3Gq r0 = r6.A08
            X.0yC r1 = r0.A00
            r0 = 4693(0x1255, float:6.576E-42)
            boolean r0 = r1.A0E(r0)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = "limited_time_offer"
            boolean r1 = r9.has(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0293
        L_0x0292:
            r0 = 0
        L_0x0293:
            r6.A05 = r0
            if (r0 == 0) goto L_0x03f4
            goto L_0x02dd
        L_0x0298:
            java.lang.String r0 = "reminder_canceled"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0248
            r0 = 2131891216(0x7f121410, float:1.9417146E38)
            goto L_0x02af
        L_0x02a4:
            java.lang.String r0 = "reminder_sent"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0248
            r0 = 2131891223(0x7f121417, float:1.941716E38)
        L_0x02af:
            java.lang.String r1 = r5.getString(r0)
            goto L_0x0234
        L_0x02b4:
            boolean r0 = r3 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L_0x019a
            r0 = r3
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r1
            goto L_0x019a
        L_0x02bf:
            android.widget.FrameLayout r1 = r7.A0N
            r0 = 38
            X.AnonymousClass3YF.A00(r1, r7, r8, r0)
            r1 = 39
            X.3YF r0 = new X.3YF
            r0.<init>(r7, r8, r1)
            r7.setOnClickListener(r0)
            goto L_0x0174
        L_0x02d2:
            r0 = 1
            r11.A05 = r0
            r11.setClickable(r0)
            r11.setFocusable(r0)
            goto L_0x0157
        L_0x02dd:
            java.lang.String r0 = "limited_time_offer"
            org.json.JSONObject r1 = r9.optJSONObject(r0)     // Catch:{ JSONException -> 0x030a }
            if (r1 == 0) goto L_0x0314
            java.lang.String r0 = "text"
            java.lang.String r10 = r1.getString(r0)     // Catch:{ JSONException -> 0x030a }
            java.lang.String r0 = "url"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x030a }
            java.lang.String r0 = "copy_code"
            java.lang.String r2 = r1.optString(r0)     // Catch:{ JSONException -> 0x030a }
            java.lang.String r0 = "expiration_time"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x030a }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ JSONException -> 0x030a }
            java.lang.Long r1 = X.AnonymousClass097.A04(r0)     // Catch:{ JSONException -> 0x030a }
            X.381 r0 = new X.381     // Catch:{ JSONException -> 0x030a }
            r0.<init>(r1, r10, r8, r2)     // Catch:{ JSONException -> 0x030a }
            goto L_0x0315
        L_0x030a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LimitedTimeOfferParser/parseLimitedTimeOfferParams/invalid json="
            X.C36321k7.A1M(r9, r0, r1, r2)
        L_0x0314:
            r0 = 0
        L_0x0315:
            r6.A03 = r0
            X.3D7 r0 = r6.A02
            if (r0 == 0) goto L_0x034e
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r2 = r0.A00
            X.1RJ r0 = r2.A0M
            android.view.View r1 = X.C36391kE.A0L(r0, r4)
            r2.A01 = r1
            android.view.View$OnLongClickListener r0 = r2.A00
            r1.setOnLongClickListener(r0)
            r0 = 2131429234(0x7f0b0772, float:1.8480135E38)
            com.whatsapp.WaImageView r0 = X.C36421kH.A0J(r2, r0)
            r2.A02 = r0
            r0 = 2131432191(0x7f0b12ff, float:1.8486132E38)
            com.whatsapp.WaTextView r0 = X.C36411kG.A0Z(r2, r0)
            r2.A05 = r0
            r0 = 2131431346(0x7f0b0fb2, float:1.8484419E38)
            com.whatsapp.WaTextView r0 = X.C36411kG.A0Z(r2, r0)
            r2.A04 = r0
            r0 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            com.whatsapp.WaTextView r0 = X.C36411kG.A0Z(r2, r0)
            r2.A03 = r0
        L_0x034e:
            X.3D7 r9 = r6.A02
            X.381 r1 = r6.A03
            java.lang.Long r0 = r1.A00
            boolean r13 = X.AnonymousClass000.A1V(r0)
            java.lang.String r11 = r1.A01
            java.lang.String r12 = r1.A03
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r2 = r9.A00
            X.3Ry r0 = r2.A09
            X.4Pz r1 = r0.A04
            android.view.View r0 = r2.A01
            if (r1 == 0) goto L_0x04a9
            X.C66963Xz.A00(r0, r9, r4)
        L_0x0369:
            X.3D7 r2 = r6.A02
            X.381 r0 = r6.A03
            java.lang.String r1 = r0.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r2.A00
            com.whatsapp.WaTextView r0 = r0.A05
            r0.setText(r1)
            r12 = 2
            java.lang.String r10 = "%s: Limited Time offer not defined for message - %s"
            r11 = 62
            r9 = 57
            r8 = 55
            if (r5 == r8) goto L_0x0493
            if (r5 == r9) goto L_0x048d
            if (r5 == r11) goto L_0x048d
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Class r0 = r6.getClass()
            r1[r4] = r0
            X.AnonymousClass000.A1L(r1, r5, r3)
            java.lang.String.format(r10, r1)
        L_0x0393:
            X.381 r0 = r6.A03
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L_0x0406
            boolean r0 = r6.A02()
            if (r0 != 0) goto L_0x0402
            X.381 r0 = r6.A03
            java.lang.Long r0 = r0.A00
            X.C65413Ry.A01(r6, r0)
            X.381 r0 = r6.A03
            java.lang.String r8 = r0.A01
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            X.3D7 r0 = r6.A02
            if (r1 != 0) goto L_0x0400
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            com.whatsapp.WaTextView r5 = r0.A03
            android.content.Context r2 = r0.getContext()
            r1 = 2131890694(0x7f121206, float:1.9416087E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r8
            X.C36341k9.A0s(r2, r5, r0, r1)
            X.3D7 r0 = r6.A02
        L_0x03c6:
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            com.whatsapp.WaTextView r1 = r0.A03
            int r0 = X.C36351kA.A00(r3)
            r1.setVisibility(r0)
        L_0x03d1:
            X.381 r0 = r6.A03
            java.lang.Long r4 = r0.A00
            if (r4 == 0) goto L_0x03f4
            long r2 = r4.longValue()
            X.0wo r0 = r6.A07
            long r0 = X.C19970wo.A00(r0)
            long r2 = r2 - r0
            X.4VS r0 = new X.4VS
            r0.<init>((X.C65413Ry) r6, (java.lang.Long) r4, (long) r2)
            r6.A00 = r0
            X.0wU r1 = r6.A09
            r0 = 35
            X.3v4 r0 = X.C80233v4.A00(r6, r0)
            r1.Boy(r0)
        L_0x03f4:
            X.3Ry r0 = r7.A09
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x04bc
            A01(r7)
            return
        L_0x0400:
            r3 = 0
            goto L_0x03c6
        L_0x0402:
            X.C65413Ry.A00(r6)
            goto L_0x03d1
        L_0x0406:
            X.3D7 r0 = r6.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            com.whatsapp.WaTextView r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            if (r5 == r8) goto L_0x046b
            if (r5 == r9) goto L_0x0426
            if (r5 == r11) goto L_0x0426
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Class r0 = r6.getClass()
            r1[r4] = r0
            X.AnonymousClass000.A1L(r1, r5, r3)
            java.lang.String.format(r10, r1)
            goto L_0x03f4
        L_0x0426:
            X.381 r0 = r6.A03
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0483
            X.3D7 r0 = r6.A02
            r5 = 2131168871(0x7f070e67, float:1.7952056E38)
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r2 = r0.A00
            com.whatsapp.WaImageView r0 = r2.A02
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = X.C36371kC.A03(r2, r5)
            r1.width = r0
            int r0 = X.C36371kC.A03(r2, r5)
            r1.height = r0
            com.whatsapp.WaImageView r0 = r2.A02
            r0.setLayoutParams(r1)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168939(0x7f070eab, float:1.7952194E38)
            int r1 = r1.getDimensionPixelSize(r0)
            com.whatsapp.WaImageView r0 = r2.A02
            r0.setPadding(r1, r1, r1, r1)
            X.3D7 r2 = r6.A02
            r1 = 2131890700(0x7f12120c, float:1.94161E38)
            X.381 r0 = r6.A03
            java.lang.String r0 = r0.A03
            r2.A00(r0, r1, r4, r3)
            goto L_0x03f4
        L_0x046b:
            X.381 r0 = r6.A03
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0483
            X.3D7 r2 = r6.A02
            r1 = 2131890700(0x7f12120c, float:1.94161E38)
            X.381 r0 = r6.A03
            java.lang.String r0 = r0.A03
        L_0x047e:
            r2.A00(r0, r1, r3, r3)
            goto L_0x03f4
        L_0x0483:
            X.3D7 r2 = r6.A02
            r1 = 2131890694(0x7f121206, float:1.9416087E38)
            X.381 r0 = r6.A03
            java.lang.String r0 = r0.A01
            goto L_0x047e
        L_0x048d:
            X.3D7 r0 = r6.A02
            r2 = 2131233607(0x7f080b47, float:1.8083356E38)
            goto L_0x0498
        L_0x0493:
            X.3D7 r0 = r6.A02
            r2 = 2131233616(0x7f080b50, float:1.8083375E38)
        L_0x0498:
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            android.view.View r1 = r0.A01
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = X.C013105r.A01(r0, r2)
            r1.setBackground(r0)
            goto L_0x0393
        L_0x04a9:
            X.3T1 r10 = r9.A01
            X.3YW r8 = new X.3YW
            r8.<init>(r9, r10, r11, r12, r13)
            r0.setOnClickListener(r8)
            goto L_0x0369
        L_0x04b5:
            java.lang.String r0 = "Interactive header presenter can not be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageView.A03(X.2IR, X.3T1):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0G;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0G = r0;
        }
        return r0.generatedComponent();
    }

    public FrameLayout getInnerFrameLayout() {
        return (FrameLayout) this.A0P.A00.findViewById(R.id.frame_header);
    }

    public void onDetachedFromWindow() {
        CountDownTimer countDownTimer;
        C65413Ry r1 = this.A09;
        if (!(r1 == null || (countDownTimer = r1.A00) == null)) {
            countDownTimer.cancel();
            r1.A00 = null;
        }
        super.onDetachedFromWindow();
    }

    public void setDescriptionMinLines(int i) {
        this.A0L.setMinLines(i);
    }

    public void setLayoutView(int i) {
        TextEmojiLabel textEmojiLabel;
        Context context;
        int i2;
        if (i == 0) {
            textEmojiLabel = this.A0O;
            context = getContext();
            i2 = R.color.f6nameremoved;
        } else if (i == 1) {
            textEmojiLabel = this.A0O;
            context = getContext();
            i2 = R.color.f6nameremoved;
        } else {
            return;
        }
        C36331k8.A0r(context, textEmojiLabel, i2);
    }

    public void A02(View.OnLongClickListener onLongClickListener, C65413Ry r3) {
        setOnLongClickListener(onLongClickListener);
        this.A0N.setOnLongClickListener(onLongClickListener);
        this.A00 = onLongClickListener;
        this.A09 = r3;
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0I) {
            this.A0I = true;
            C27861Qc.A0k((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public InteractiveMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0I) {
            this.A0I = true;
            C27861Qc.A0k((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        this.A0K = null;
        this.A0J = null;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        FrameLayout A0T = C36441kJ.A0T(this, R.id.interactive_message_header_holder);
        this.A0N = A0T;
        AnonymousClass1RJ A0Y = C36341k9.A0Y(this, R.id.conversation_row_lto_offer_content);
        this.A0M = A0Y;
        A0Y.A03(8);
        AnonymousClass1RJ A0Y2 = C36341k9.A0Y(this, R.id.conversation_row_reminder_content);
        this.A0R = A0Y2;
        A0Y2.A03(8);
        this.A0P = new AnonymousClass34J(A0T, this.A0H);
        this.A0L = C36401kF.A0O(this, R.id.description);
        TextEmojiLabel A0O2 = C36401kF.A0O(this, R.id.bottom_message);
        this.A0O = A0O2;
        this.A0Q = (DynamicMessageView) C012005e.A02(this, R.id.dynamic_content);
        C36321k7.A0r(this.A0B, this.A0L);
        C36331k8.A1A(this.A0B, A0O2);
    }
}
