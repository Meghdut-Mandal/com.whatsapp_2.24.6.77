package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass143;
import X.AnonymousClass159;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1EV;
import X.AnonymousClass1FR;
import X.AnonymousClass1M4;
import X.AnonymousClass1QZ;
import X.AnonymousClass28e;
import X.AnonymousClass2H9;
import X.AnonymousClass2RC;
import X.AnonymousClass34I;
import X.AnonymousClass39O;
import X.AnonymousClass3BB;
import X.C012005e;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19730wQ;
import X.C20810yC;
import X.C21060yb;
import X.C220412q;
import X.C24631De;
import X.C27111My;
import X.C27851Qb;
import X.C27861Qc;
import X.C28981Uw;
import X.C29541Xa;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C48912iG;
import X.C64953Qc;
import X.C65103Qt;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.text.CondensedTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ConversationAttachmentContentView extends ScrollView implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public LinearLayout A06;
    public C19460v5 A07;
    public AnonymousClass17Y A08;
    public C19730wQ A09;
    public AnonymousClass3BB A0A;
    public ConversationCommunityViewModel A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass28e A0D;
    public C64953Qc A0E;
    public AnonymousClass34I A0F;
    public C21060yb A0G;
    public C19420v0 A0H;
    public C18820ts A0I;
    public C220412q A0J;
    public C29541Xa A0K;
    public C20810yC A0L;
    public AnonymousClass11F A0M;
    public C24631De A0N;
    public AnonymousClass1EV A0O;
    public AnonymousClass39O A0P;
    public AnonymousClass1FR A0Q;
    public AnonymousClass1M4 A0R;
    public AnonymousClass13J A0S;
    public AnonymousClass1QZ A0T;
    public boolean A0U;
    public boolean A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final LinkedHashMap A0c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028b, code lost:
        if (r12.A0V == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028d, code lost:
        r3.setColorFilter(X.C36381kD.A05(r12, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0294, code lost:
        X.C011504z.A06(r3, 2);
        r17.setText(r7);
        r4.setId(r6);
        r3.setOnClickListener(r11);
        r4.setOnClickListener(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a5, code lost:
        if (r10 == null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a7, code lost:
        r3.setOnLongClickListener(r10);
        r4.setOnLongClickListener(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ad, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ae, code lost:
        r15 = X.AnonymousClass00F.A00(getContext(), com.whatsapp.R.color.f6nameremoved);
        r13 = X.AnonymousClass00F.A00(getContext(), com.whatsapp.R.color.f6nameremoved);
        r2 = new android.graphics.drawable.GradientDrawable();
        r2.setColor(r15);
        r2.setShape(0);
        r2.setGradientType(2);
        r2.setGradientCenter(-1.0f, 0.5f);
        r2.setCornerRadius(X.C36441kJ.A00(getResources(), com.whatsapp.R.dimen.f7nameremoved) / 4.0f);
        r2.setStroke(1, r13);
        r1 = X.AnonymousClass00F.A04(getContext(), com.whatsapp.R.color.f6nameremoved);
        X.C18740tg.A06(r1);
        r13 = new android.graphics.drawable.RippleDrawable(r1, r2, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0303, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0306, code lost:
        r12.A07.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0311, code lost:
        throw X.AnonymousClass001.A0A("getAttachQuickReplyIconId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        if (r1.equals("contact") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (r1.equals("document") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (r1.equals("event") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        if (r1.equals("audio") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        if (r1.equals("shop") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (r1.equals("poll") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        if (r1.equals("gallery") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        if (r1.equals("payment") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r1.equals("quick reply") == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        r3 = com.whatsapp.R.drawable.ic_attachment_contact;
        r2 = com.whatsapp.R.color.f6nameremoved;
        r1 = com.whatsapp.R.color.f6nameremoved;
        r8 = com.whatsapp.R.color.f6nameremoved;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_contact_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
        if (r12.A0V != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        r0 = r12.A0b;
        r3 = com.whatsapp.R.drawable.ic_attachment_document;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0110, code lost:
        if (r0 == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        r3 = com.whatsapp.R.drawable.ic_attachment_document_v2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        r2 = com.whatsapp.R.color.f6nameremoved;
        r1 = com.whatsapp.R.color.f6nameremoved;
        r8 = com.whatsapp.R.color.f6nameremoved;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_document_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        r3 = com.whatsapp.R.drawable.ic_attachment_event;
        r2 = com.whatsapp.R.color.f6nameremoved;
        r1 = com.whatsapp.R.color.f6nameremoved;
        r8 = com.whatsapp.R.color.f6nameremoved;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_event_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r3 = com.whatsapp.R.drawable.ic_attachment_audio;
        r2 = com.whatsapp.R.color.f6nameremoved;
        r1 = com.whatsapp.R.color.f6nameremoved;
        r8 = com.whatsapp.R.color.f6nameremoved;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_audio_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014b, code lost:
        r12.A07.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0156, code lost:
        throw X.AnonymousClass001.A0A("getAttachShopIconId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0157, code lost:
        r0 = r12.A0V;
        r3 = com.whatsapp.R.drawable.ic_attachment_poll;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015c, code lost:
        if (r0 == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015e, code lost:
        r3 = com.whatsapp.R.drawable.ic_attachment_poll_v2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0161, code lost:
        r2 = com.whatsapp.R.color.f6nameremoved;
        r1 = com.whatsapp.R.color.f6nameremoved;
        r8 = com.whatsapp.R.color.f6nameremoved;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_poll_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        r18 = false;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0176, code lost:
        if (r12.A0V != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0178, code lost:
        r0 = r12.A0b;
        r3 = com.whatsapp.R.drawable.ic_attachment_gallery;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017d, code lost:
        if (r0 == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017f, code lost:
        r3 = com.whatsapp.R.drawable.ic_attachment_gallery_v2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0182, code lost:
        r2 = com.whatsapp.R.color.f6nameremoved;
        r1 = com.whatsapp.R.color.f6nameremoved;
        r8 = com.whatsapp.R.color.f6nameremoved;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_gallery_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0191, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0193, code lost:
        r5 = X.C36341k9.A0F(r12).getDrawable(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019c, code lost:
        r5 = r12.A0Q;
        r1 = getContext();
        r0 = r12.A0N.A01();
        java.util.Objects.requireNonNull(r0);
        r5 = r5.A0J(r1, r0, com.whatsapp.R.color.f6nameremoved, com.whatsapp.R.dimen.f7nameremoved);
        r0 = r12.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        if (r0 == 2) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b9, code lost:
        r2 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bc, code lost:
        if (r0 != 4) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01be, code lost:
        r2 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c1, code lost:
        if (r0 == 2) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c3, code lost:
        r1 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c6, code lost:
        if (r0 != 4) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c8, code lost:
        r1 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cb, code lost:
        if (r0 == 2) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cd, code lost:
        r8 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d0, code lost:
        if (r0 != 4) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d2, code lost:
        r8 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        r11 = new X.C48912iG(r12, 28);
        r10 = null;
        r7 = com.whatsapp.R.string.f12nameremoved;
        r6 = com.whatsapp.R.id.pickfiletype_payment_holder;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e5, code lost:
        r4 = X.C36351kA.A0C(r12);
        r3 = r12.A0V;
        r0 = com.whatsapp.R.layout.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ee, code lost:
        if (r3 == false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f0, code lost:
        r0 = com.whatsapp.R.layout.f9nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f3, code lost:
        r4 = X.C36361kB.A0E(r4, r20, r0);
        r3 = X.C36401kF.A0G(r4, com.whatsapp.R.id.icon);
        r17 = X.C36391kE.A0O(r4, com.whatsapp.R.id.text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0207, code lost:
        if (r18 == false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0209, code lost:
        r13 = getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f7nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0216, code lost:
        if (r12.A0V != false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0218, code lost:
        r2 = X.C36381kD.A05(r12, r2);
        r15 = X.C36381kD.A05(r12, r1);
        r2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{r2, r15});
        r2.setShape(1);
        r2.setGradientType(2);
        r2.setGradientCenter(-1.0f, 0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x023c, code lost:
        if (r13 <= 0) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023e, code lost:
        r2.setSize(r13, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0241, code lost:
        if (r18 == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0247, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0249, code lost:
        r1 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
        r1.getPaint().setColor(r15);
        r2 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{r2, r1});
        r0 = r13 / 4;
        r2.setLayerSize(1, r0, r0);
        r2.setLayerGravity(1, 17);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x026f, code lost:
        r1 = X.AnonymousClass00F.A04(getContext(), com.whatsapp.R.color.f6nameremoved);
        X.C18740tg.A06(r1);
        r13 = new android.graphics.drawable.RippleDrawable(r1, r2, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0283, code lost:
        r3.setBackground(r13);
        r3.setImageDrawable(r5);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View A00(android.widget.LinearLayout r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = 3
            X.2iH r11 = new X.2iH
            r12 = r19
            r1 = r21
            r11.<init>(r0, r1, r12)
            r14 = 1
            X.4Y4 r10 = new X.4Y4
            r10.<init>(r14, r1, r12)
            int r0 = r1.hashCode()
            r4 = 4
            r9 = 2
            r2 = -1
            switch(r0) {
                case -1367751899: goto L_0x00e9;
                case -1275762953: goto L_0x00df;
                case -786681338: goto L_0x00d5;
                case -309474065: goto L_0x00ca;
                case -196315310: goto L_0x00c0;
                case 3446719: goto L_0x00b6;
                case 3529462: goto L_0x00ac;
                case 93166550: goto L_0x00a2;
                case 96891546: goto L_0x0098;
                case 106006350: goto L_0x008d;
                case 861720859: goto L_0x0084;
                case 951526432: goto L_0x007b;
                case 1901043637: goto L_0x0070;
                default: goto L_0x001a;
            }
        L_0x001a:
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0306;
                case 2: goto L_0x019c;
                case 3: goto L_0x002c;
                case 4: goto L_0x0174;
                case 5: goto L_0x0157;
                case 6: goto L_0x014b;
                case 7: goto L_0x0138;
                case 8: goto L_0x0125;
                case 9: goto L_0x002c;
                case 10: goto L_0x0107;
                case 11: goto L_0x00f4;
                case 12: goto L_0x002d;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConversationAttachmentContentHelper Icon not mapped properly "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r1, r2)
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x002c:
            return r3
        L_0x002d:
            X.13J r0 = r12.A0S
            X.13K r0 = (X.AnonymousClass13K) r0
            X.00T r0 = r0.A04
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r12.A0b
            r3 = 2131231927(0x7f0804b7, float:1.8079949E38)
            if (r0 == 0) goto L_0x0043
            r3 = 2131231928(0x7f0804b8, float:1.807995E38)
        L_0x0043:
            r2 = 2131099735(0x7f060057, float:1.7811832E38)
            r1 = 2131099736(0x7f060058, float:1.7811834E38)
            r8 = 2131099737(0x7f060059, float:1.7811836E38)
            r7 = 2131892763(0x7f121a1b, float:1.9420283E38)
            r6 = 2131432699(0x7f0b14fb, float:1.8487163E38)
            goto L_0x0170
        L_0x0054:
            X.13J r0 = r12.A0S
            boolean r0 = r0.BJo()
            if (r0 == 0) goto L_0x002c
            r3 = 2131231913(0x7f0804a9, float:1.807992E38)
            r2 = 2131099723(0x7f06004b, float:1.7811807E38)
            r1 = 2131099724(0x7f06004c, float:1.781181E38)
            r8 = 2131099725(0x7f06004d, float:1.7811811E38)
            r7 = 2131886531(0x7f1201c3, float:1.9407643E38)
            r6 = 2131432694(0x7f0b14f6, float:1.8487153E38)
            goto L_0x0191
        L_0x0070:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            r2 = 12
            goto L_0x001a
        L_0x007b:
            java.lang.String r0 = "contact"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f4
            goto L_0x001a
        L_0x0084:
            java.lang.String r0 = "document"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0107
            goto L_0x001a
        L_0x008d:
            java.lang.String r0 = "order"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            r2 = 9
            goto L_0x001a
        L_0x0098:
            java.lang.String r0 = "event"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0125
            goto L_0x001a
        L_0x00a2:
            java.lang.String r0 = "audio"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0138
            goto L_0x001a
        L_0x00ac:
            java.lang.String r0 = "shop"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x014b
            goto L_0x001a
        L_0x00b6:
            java.lang.String r0 = "poll"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0157
            goto L_0x001a
        L_0x00c0:
            java.lang.String r0 = "gallery"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0174
            goto L_0x001a
        L_0x00ca:
            java.lang.String r0 = "product"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            r2 = 3
            goto L_0x001a
        L_0x00d5:
            java.lang.String r0 = "payment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x019c
            goto L_0x001a
        L_0x00df:
            java.lang.String r0 = "quick reply"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0306
            goto L_0x001a
        L_0x00e9:
            java.lang.String r0 = "camera"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            r2 = 0
            goto L_0x001a
        L_0x00f4:
            r3 = 2131231915(0x7f0804ab, float:1.8079924E38)
            r2 = 2131099726(0x7f06004e, float:1.7811813E38)
            r1 = 2131099727(0x7f06004f, float:1.7811815E38)
            r8 = 2131099728(0x7f060050, float:1.7811817E38)
            r7 = 2131886532(0x7f1201c4, float:1.9407646E38)
            r6 = 2131432695(0x7f0b14f7, float:1.8487155E38)
            goto L_0x0170
        L_0x0107:
            boolean r0 = r12.A0V
            if (r0 != 0) goto L_0x0112
            boolean r0 = r12.A0b
            r3 = 2131231917(0x7f0804ad, float:1.8079929E38)
            if (r0 == 0) goto L_0x0115
        L_0x0112:
            r3 = 2131231918(0x7f0804ae, float:1.807993E38)
        L_0x0115:
            r2 = 2131099729(0x7f060051, float:1.781182E38)
            r1 = 2131099730(0x7f060052, float:1.7811821E38)
            r8 = 2131099731(0x7f060053, float:1.7811823E38)
            r7 = 2131886533(0x7f1201c5, float:1.9407648E38)
            r6 = 2131432696(0x7f0b14f8, float:1.8487157E38)
            goto L_0x0170
        L_0x0125:
            r3 = 2131231921(0x7f0804b1, float:1.8079937E38)
            r2 = 2131099723(0x7f06004b, float:1.7811807E38)
            r1 = 2131099724(0x7f06004c, float:1.781181E38)
            r8 = 2131102915(0x7f060cc3, float:1.7818281E38)
            r7 = 2131886534(0x7f1201c6, float:1.940765E38)
            r6 = 2131432697(0x7f0b14f9, float:1.8487159E38)
            goto L_0x0170
        L_0x0138:
            r3 = 2131231911(0x7f0804a7, float:1.8079916E38)
            r2 = 2131099719(0x7f060047, float:1.78118E38)
            r1 = 2131099720(0x7f060048, float:1.7811801E38)
            r8 = 2131099721(0x7f060049, float:1.7811803E38)
            r7 = 2131886530(0x7f1201c2, float:1.9407641E38)
            r6 = 2131432693(0x7f0b14f5, float:1.848715E38)
            goto L_0x0170
        L_0x014b:
            X.0v5 r0 = r12.A07
            r0.A02()
            java.lang.String r0 = "getAttachShopIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0157:
            boolean r0 = r12.A0V
            r3 = 2131231930(0x7f0804ba, float:1.8079955E38)
            if (r0 == 0) goto L_0x0161
            r3 = 2131231931(0x7f0804bb, float:1.8079957E38)
        L_0x0161:
            r2 = 2131099750(0x7f060066, float:1.7811862E38)
            r1 = 2131099751(0x7f060067, float:1.7811864E38)
            r8 = 2131099752(0x7f060068, float:1.7811866E38)
            r7 = 2131886537(0x7f1201c9, float:1.9407656E38)
            r6 = 2131432702(0x7f0b14fe, float:1.8487169E38)
        L_0x0170:
            r18 = 0
            r10 = 0
            goto L_0x0193
        L_0x0174:
            boolean r0 = r12.A0V
            if (r0 != 0) goto L_0x017f
            boolean r0 = r12.A0b
            r3 = 2131231923(0x7f0804b3, float:1.807994E38)
            if (r0 == 0) goto L_0x0182
        L_0x017f:
            r3 = 2131231924(0x7f0804b4, float:1.8079943E38)
        L_0x0182:
            r2 = 2131099732(0x7f060054, float:1.7811826E38)
            r1 = 2131099733(0x7f060055, float:1.7811828E38)
            r8 = 2131099734(0x7f060056, float:1.781183E38)
            r7 = 2131886536(0x7f1201c8, float:1.9407654E38)
            r6 = 2131432698(0x7f0b14fa, float:1.848716E38)
        L_0x0191:
            r18 = 1
        L_0x0193:
            android.content.res.Resources r0 = X.C36341k9.A0F(r12)
            android.graphics.drawable.Drawable r5 = r0.getDrawable(r3)
            goto L_0x01e5
        L_0x019c:
            X.1FR r5 = r12.A0Q
            r3 = 2131103013(0x7f060d25, float:1.781848E38)
            r2 = 2131165333(0x7f070095, float:1.794488E38)
            android.content.Context r1 = r12.getContext()
            X.1De r0 = r12.A0N
            X.16U r0 = r0.A01()
            java.util.Objects.requireNonNull(r0)
            X.1lL r5 = r5.A0J(r1, r0, r3, r2)
            int r0 = r12.A04
            if (r0 == r9) goto L_0x01be
            r2 = 2131099744(0x7f060060, float:1.781185E38)
            if (r0 != r4) goto L_0x01c1
        L_0x01be:
            r2 = 2131099742(0x7f06005e, float:1.7811846E38)
        L_0x01c1:
            if (r0 == r9) goto L_0x01c8
            r1 = 2131099745(0x7f060061, float:1.7811852E38)
            if (r0 != r4) goto L_0x01cb
        L_0x01c8:
            r1 = 2131099743(0x7f06005f, float:1.7811848E38)
        L_0x01cb:
            if (r0 == r9) goto L_0x01d2
            r8 = 2131099745(0x7f060061, float:1.7811852E38)
            if (r0 != r4) goto L_0x01d5
        L_0x01d2:
            r8 = 2131099741(0x7f06005d, float:1.7811844E38)
        L_0x01d5:
            r0 = 28
            X.2iG r11 = new X.2iG
            r11.<init>(r12, r0)
            r10 = 0
            r7 = 2131892146(0x7f1217b2, float:1.9419032E38)
            r6 = 2131432701(0x7f0b14fd, float:1.8487167E38)
            r18 = 0
        L_0x01e5:
            android.view.LayoutInflater r4 = X.C36351kA.A0C(r12)
            boolean r3 = r12.A0V
            r0 = 2131624515(0x7f0e0243, float:1.8876212E38)
            if (r3 == 0) goto L_0x01f3
            r0 = 2131624517(0x7f0e0245, float:1.8876216E38)
        L_0x01f3:
            r3 = r20
            android.view.View r4 = X.C36361kB.A0E(r4, r3, r0)
            r0 = 2131430834(0x7f0b0db2, float:1.848338E38)
            android.widget.ImageView r3 = X.C36401kF.A0G(r4, r0)
            r0 = 2131434592(0x7f0b1c60, float:1.8491002E38)
            android.widget.TextView r17 = X.C36391kE.A0O(r4, r0)
            if (r18 == 0) goto L_0x0303
            android.content.res.Resources r13 = r12.getResources()
            r0 = 2131165325(0x7f07008d, float:1.7944864E38)
            int r13 = r13.getDimensionPixelSize(r0)
        L_0x0214:
            boolean r0 = r12.A0V
            if (r0 != 0) goto L_0x02ae
            int r2 = X.C36381kD.A05(r12, r2)
            int r15 = X.C36381kD.A05(r12, r1)
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r0 = new int[r9]
            r16 = 0
            r0[r16] = r2
            r0[r14] = r15
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>(r1, r0)
            r2.setShape(r14)
            r2.setGradientType(r9)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.setGradientCenter(r0, r1)
            if (r13 <= 0) goto L_0x0241
            r2.setSize(r13, r13)
        L_0x0241:
            if (r18 == 0) goto L_0x026f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x026f
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            android.graphics.drawable.ShapeDrawable r1 = new android.graphics.drawable.ShapeDrawable
            r1.<init>(r0)
            android.graphics.Paint r0 = r1.getPaint()
            r0.setColor(r15)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r0[r16] = r2
            r0[r14] = r1
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
            int r0 = r13 / 4
            r2.setLayerSize(r14, r0, r0)
            r0 = 17
            r2.setLayerGravity(r14, r0)
        L_0x026f:
            android.content.Context r1 = r12.getContext()
            r0 = 2131102121(0x7f0609a9, float:1.781667E38)
            android.content.res.ColorStateList r1 = X.AnonymousClass00F.A04(r1, r0)
            X.C18740tg.A06(r1)
            r0 = 0
            android.graphics.drawable.RippleDrawable r13 = new android.graphics.drawable.RippleDrawable
            r13.<init>(r1, r2, r0)
        L_0x0283:
            r3.setBackground(r13)
            r3.setImageDrawable(r5)
            boolean r0 = r12.A0V
            if (r0 == 0) goto L_0x0294
            int r0 = X.C36381kD.A05(r12, r8)
            r3.setColorFilter(r0)
        L_0x0294:
            X.C011504z.A06(r3, r9)
            r0 = r17
            r0.setText(r7)
            r4.setId(r6)
            r3.setOnClickListener(r11)
            r4.setOnClickListener(r11)
            if (r10 == 0) goto L_0x02ad
            r3.setOnLongClickListener(r10)
            r4.setOnLongClickListener(r10)
        L_0x02ad:
            return r4
        L_0x02ae:
            android.content.Context r1 = r12.getContext()
            r0 = 2131099722(0x7f06004a, float:1.7811805E38)
            int r15 = X.AnonymousClass00F.A00(r1, r0)
            android.content.Context r1 = r12.getContext()
            r0 = 2131099759(0x7f06006f, float:1.781188E38)
            int r13 = X.AnonymousClass00F.A00(r1, r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setColor(r15)
            r0 = 0
            r2.setShape(r0)
            r2.setGradientType(r9)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.setGradientCenter(r1, r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131165325(0x7f07008d, float:1.7944864E38)
            float r1 = X.C36441kJ.A00(r1, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            r2.setCornerRadius(r1)
            r2.setStroke(r14, r13)
            android.content.Context r1 = r12.getContext()
            r0 = 2131102121(0x7f0609a9, float:1.781667E38)
            android.content.res.ColorStateList r1 = X.AnonymousClass00F.A04(r1, r0)
            X.C18740tg.A06(r1)
            r0 = 0
            android.graphics.drawable.RippleDrawable r13 = new android.graphics.drawable.RippleDrawable
            r13.<init>(r1, r2, r0)
            goto L_0x0283
        L_0x0303:
            r13 = 0
            goto L_0x0214
        L_0x0306:
            X.0v5 r0 = r12.A07
            r0.A02()
            java.lang.String r0 = "getAttachQuickReplyIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A00(android.widget.LinearLayout, java.lang.String):android.view.View");
    }

    public void A0B(int i, boolean z) {
        int[] iArr;
        long j;
        int[][] iArr2 = new int[3][];
        int[] iArr3 = {6, 0, 0, 0};
        if (z) {
            // fill-array-data instruction
            iArr3[0] = 2;
            iArr3[1] = 3;
            iArr3[2] = 6;
            iArr3[3] = 8;
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{6, 0, 0, 0};
        } else {
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{2, 3, 6, 8};
        }
        iArr2[2] = iArr;
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator A10 = C36371kC.A10(this.A0c);
        while (A10.hasNext()) {
            A0I2.add(C36351kA.A0u(A10));
        }
        int i2 = 0;
        int i3 = 0;
        do {
            int[] iArr4 = iArr2[i2];
            for (int i4 = 0; i4 < iArr4.length; i4++) {
                if (i4 < getNumberOfColumns() && i3 < A0I2.size()) {
                    View view = (View) A0I2.get(i3);
                    int i5 = iArr4[i4];
                    AnimationSet animationSet = new AnimationSet(true);
                    float f = 0.0f;
                    if (z) {
                        f = 1.0f;
                    }
                    animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, f));
                    animationSet.setInterpolator(new OvershootInterpolator(1.0f));
                    animationSet.setDuration(300);
                    if (i5 == 0) {
                        j = 0;
                    } else {
                        j = (long) (i / i5);
                    }
                    animationSet.setStartOffset(j);
                    view.startAnimation(animationSet);
                    i3++;
                }
            }
            i2++;
        } while (i2 < 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A01() {
        /*
            r6 = this;
            boolean r0 = r6.A0V
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.A0a
            if (r0 != 0) goto L_0x007c
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            boolean r4 = r6.A04()
            boolean r3 = r6.A05()
            X.11F r1 = r6.A0M
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 == 0) goto L_0x0075
            r5 = 0
        L_0x001d:
            java.lang.String r0 = "gallery"
            r2.add(r0)
            java.lang.String r0 = "camera"
            r2.add(r0)
            X.11F r1 = r6.A0M
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "location"
            r2.add(r0)
        L_0x0038:
            X.11F r1 = r6.A0M
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "contact"
            r2.add(r0)
        L_0x0049:
            X.11F r0 = r6.A0M
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "document"
            r2.add(r0)
        L_0x0054:
            boolean r0 = r6.A03()
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "audio"
            r2.add(r0)
        L_0x005f:
            if (r3 == 0) goto L_0x0066
            java.lang.String r0 = "poll"
            r2.add(r0)
        L_0x0066:
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = "payment"
        L_0x006a:
            r2.add(r0)
        L_0x006d:
            if (r5 == 0) goto L_0x0074
            java.lang.String r0 = "event"
            r2.add(r0)
        L_0x0074:
            return r2
        L_0x0075:
            X.1Xa r0 = r6.A0K
            boolean r5 = r0.A05(r1)
            goto L_0x001d
        L_0x007c:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            boolean r4 = r6.A04()
            boolean r3 = r6.A05()
            X.11F r1 = r6.A0M
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 == 0) goto L_0x00df
            r5 = 0
        L_0x0091:
            X.11F r0 = r6.A0M
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "document"
            r2.add(r0)
        L_0x009c:
            java.lang.String r0 = "camera"
            r2.add(r0)
            java.lang.String r0 = "gallery"
            r2.add(r0)
            boolean r0 = r6.A03()
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "audio"
            r2.add(r0)
        L_0x00b1:
            X.11F r1 = r6.A0M
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "location"
            r2.add(r0)
        L_0x00c2:
            if (r4 == 0) goto L_0x00c9
            java.lang.String r0 = "payment"
            r2.add(r0)
        L_0x00c9:
            X.11F r1 = r6.A0M
            boolean r0 = X.AnonymousClass143.A0H(r1)
            if (r0 != 0) goto L_0x00da
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "contact"
            r2.add(r0)
        L_0x00da:
            if (r3 == 0) goto L_0x006d
            java.lang.String r0 = "poll"
            goto L_0x006a
        L_0x00df:
            X.1Xa r0 = r6.A0K
            boolean r5 = r0.A05(r1)
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A01():java.util.ArrayList");
    }

    private boolean A03() {
        if (!(this.A0M instanceof C28981Uw)) {
            return true;
        }
        AnonymousClass34I r2 = this.A0F;
        if (!r2.A00.A00.A0E(6505) || !r2.A01.A03(2)) {
            return false;
        }
        return true;
    }

    private boolean A04() {
        AnonymousClass11F r1 = this.A0M;
        if (AnonymousClass143.A0H(r1)) {
            return false;
        }
        this.A04 = this.A0Q.A0D(r1);
        if (!this.A0Q.A0d(getContext(), C36401kF.A0b(this.A0M), this.A04) || this.A09.A0L()) {
            return false;
        }
        C20810yC r12 = this.A0L;
        AnonymousClass00C.A0D(r12, 0);
        r12.A0E(4925);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r0.intValue() < r1) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05() {
        /*
            r4 = this;
            X.11F r0 = r4.A0M
            boolean r0 = X.AnonymousClass143.A0H(r0)
            r3 = 0
            if (r0 != 0) goto L_0x0074
            X.0yC r1 = r4.A0L
            r0 = 1394(0x572, float:1.953E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0074
            X.11F r0 = r4.A0M
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0039
            X.34I r2 = r4.A0F
            X.1GQ r0 = r2.A00
            X.0yC r1 = r0.A00
            r0 = 5533(0x159d, float:7.753E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0074
            X.1Tc r1 = r2.A01
            r0 = 66
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0074
            r0 = 67
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0074
        L_0x0039:
            X.11F r1 = r4.A0M
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x007a
            X.12q r0 = r4.A0J
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A05(r1)
            r0 = 3
            if (r1 != r0) goto L_0x0073
            X.0yC r1 = r4.A0L
            r0 = 2738(0xab2, float:3.837E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x007a
            X.0yC r1 = r4.A0L
            r0 = 5056(0x13c0, float:7.085E-42)
            int r1 = r1.A07(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0073
            com.whatsapp.community.ConversationCommunityViewModel r0 = r4.A0B
            android.util.Pair r0 = r0.A00
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0075
            int r0 = r0.intValue()
            if (r0 >= r1) goto L_0x007a
        L_0x0073:
            r3 = 1
        L_0x0074:
            return r3
        L_0x0075:
            java.lang.String r0 = "conversationCommunityViewModel/missing-cag-participant-count"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x007a:
            X.11F r1 = r4.A0M
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 != 0) goto L_0x0074
            boolean r0 = r1 instanceof X.C177618e5
            if (r0 != 0) goto L_0x0074
            boolean r0 = r4.A0U
            if (r0 == 0) goto L_0x0094
            X.0yC r1 = r4.A0L
            r0 = 2663(0xa67, float:3.732E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0074
        L_0x0094:
            X.0yC r1 = r4.A0L
            r0 = 2194(0x892, float:3.074E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0074
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A05():boolean");
    }

    private int getIconSize() {
        boolean z = this.A0V;
        Resources resources = getResources();
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        return resources.getDimensionPixelSize(i);
    }

    private View.OnClickListener getListenerToHandleOrderDisableState() {
        return new C48912iG(this, 29);
    }

    public void A08() {
        int numberOfColumns;
        this.A06.removeAllViews();
        LinkedHashMap linkedHashMap = this.A0c;
        linkedHashMap.clear();
        ArrayList A012 = A01();
        if (this.A0V) {
            numberOfColumns = getColumnsCountV2();
        } else {
            numberOfColumns = getNumberOfColumns();
        }
        Iterator it = A012.iterator();
        LinearLayout linearLayout = null;
        int i = 0;
        while (it.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it);
            if (i % numberOfColumns == 0) {
                linearLayout = (LinearLayout) C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this.A06, false);
                AnonymousClass2H9.A00(this.A06, this, 0, this.A02);
                this.A06.addView(linearLayout);
            }
            View A002 = A00(linearLayout, A0C2);
            if (A002 != null) {
                linkedHashMap.put(A0C2, A002);
                linearLayout.addView(A002);
                i++;
            }
        }
        AnonymousClass2H9.A00(this.A06, this, 0, this.A00);
        this.A0E.A04(this.A0M);
    }

    public void A09() {
        Integer num;
        C64953Qc r3 = this.A0E;
        AnonymousClass2RC r2 = r3.A01;
        if (r2 != null && (num = r2.A02) != null && num.intValue() == 1) {
            r2.A01 = C36371kC.A0n();
            C64953Qc.A00(r3);
            r3.A01();
        }
    }

    public void A0A() {
        if (!this.A0Z) {
            this.A0Z = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r2.A0M;
            this.A0L = C36341k9.A0V(r1);
            this.A08 = C36351kA.A0M(r1);
            this.A09 = C36351kA.A0N(r1);
            this.A0J = C36351kA.A0a(r1);
            this.A07 = C19470v6.A00;
            this.A0R = C36361kB.A0f(r1);
            this.A0Q = C36431kI.A0p(r1);
            this.A0G = C36351kA.A0U(r1);
            this.A0S = C36351kA.A0q(r1);
            this.A0C = C36341k9.A0R(r1);
            this.A0I = C36341k9.A0T(r1);
            this.A0K = C36421kH.A0M(r1);
            this.A0H = C36351kA.A0Y(r1);
            this.A0O = C36371kC.A0h(r1);
            this.A0N = (C24631De) r1.A6J.get();
            this.A0P = C27111My.A2t(r2.A0L);
            C18830tt r12 = r1.A00;
            this.A0A = (AnonymousClass3BB) r12.A6H.get();
            this.A0E = (C64953Qc) r12.A6G.get();
            this.A0F = (AnonymousClass34I) r12.AAB.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r1.A0E(3223) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(com.whatsapp.community.ConversationCommunityViewModel r15, X.AnonymousClass28e r16, X.AnonymousClass11F r17, boolean r18) {
        /*
            r14 = this;
            r0 = r17
            r14.A0M = r0
            r0 = r16
            r14.A0D = r0
            r14.A0B = r15
            r0 = r18
            r14.A0U = r0
            X.0yC r0 = r14.A0L
            r3 = 0
            X.AnonymousClass00C.A0D(r0, r3)
            r2 = 3223(0xc97, float:4.516E-42)
            boolean r0 = r0.A0E(r2)
            r14.A0V = r0
            boolean r0 = X.C222013h.A07
            r14.A0b = r0
            X.0yC r1 = r14.A0L
            X.AnonymousClass00C.A0D(r1, r3)
            r0 = 5896(0x1708, float:8.262E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0034
            boolean r1 = r1.A0E(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r14.A0a = r0
            boolean r0 = r14.A0V
            if (r0 == 0) goto L_0x00f4
            android.widget.LinearLayout r0 = r14.A06
            r0.removeAllViews()
            java.util.LinkedHashMap r8 = r14.A0c
            r8.clear()
            android.content.Context r0 = r14.getContext()
            X.2H9 r6 = new X.2H9
            r6.<init>(r0, r14)
            r6.A01 = r3
            r6.A00 = r3
            android.widget.LinearLayout r0 = r14.A06
            r0.addView(r6)
            java.util.ArrayList r12 = r14.A01()
            int r7 = r14.getColumnsCountV2()
            int r0 = r12.size()
            double r4 = (double) r0
            double r0 = (double) r7
            double r4 = r4 / r0
            double r0 = java.lang.Math.ceil(r4)
            int r4 = (int) r0
            android.content.res.Resources r2 = r14.getResources()
            r1 = 2
            r0 = 2131165328(0x7f070090, float:1.794487E38)
            if (r4 <= r1) goto L_0x0078
            r0 = 2131165331(0x7f070093, float:1.7944876E38)
        L_0x0078:
            int r11 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r14.getResources()
            r9 = 3
            r0 = 2131165327(0x7f07008f, float:1.7944868E38)
            if (r7 <= r9) goto L_0x0089
            r0 = 2131165329(0x7f070091, float:1.7944872E38)
        L_0x0089:
            int r10 = r1.getDimensionPixelSize(r0)
            java.util.Iterator r13 = r12.iterator()
            r1 = 0
            r12 = 0
        L_0x0093:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r5 = X.AnonymousClass001.A0C(r13)
            int r0 = r12 % r7
            if (r0 != 0) goto L_0x00cb
            if (r12 == 0) goto L_0x00a8
            android.widget.LinearLayout r0 = r14.A06
            X.AnonymousClass2H9.A00(r0, r14, r3, r11)
        L_0x00a8:
            android.view.LayoutInflater r2 = X.C36351kA.A0C(r14)
            r1 = 2131624514(0x7f0e0242, float:1.887621E38)
            android.widget.LinearLayout r0 = r14.A06
            android.view.View r1 = r2.inflate(r1, r0, r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.widget.LinearLayout r0 = r14.A06
            r0.addView(r1)
        L_0x00bc:
            android.view.View r0 = r14.A00(r1, r5)
            if (r0 == 0) goto L_0x0093
            r8.put(r5, r0)
            r1.addView(r0)
            int r12 = r12 + 1
            goto L_0x0093
        L_0x00cb:
            X.AnonymousClass2H9.A00(r1, r14, r10, r3)
            goto L_0x00bc
        L_0x00cf:
            r0 = 2131165336(0x7f070098, float:1.7944886E38)
            r2 = 2131165330(0x7f070092, float:1.7944874E38)
            if (r4 < r9) goto L_0x00dd
            r0 = 2131165337(0x7f070099, float:1.7944888E38)
            r2 = 2131165337(0x7f070099, float:1.7944888E38)
        L_0x00dd:
            int r0 = X.C36371kC.A03(r14, r0)
            r6.A00 = r0
            android.widget.LinearLayout r1 = r14.A06
            int r0 = X.C36371kC.A03(r14, r2)
            X.AnonymousClass2H9.A00(r1, r14, r3, r0)
            X.3Qc r1 = r14.A0E
            X.11F r0 = r14.A0M
            r1.A04(r0)
            return
        L_0x00f4:
            r14.A08()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A0C(com.whatsapp.community.ConversationCommunityViewModel, X.28e, X.11F, boolean):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0T;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0T = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i4, i5);
        if (this.A0Y != getMeasuredHeight()) {
            int measuredHeight = getMeasuredHeight();
            if (!this.A0V) {
                int childCount = this.A06.getChildCount();
                int i6 = this.A01;
                int i7 = i6 / 4;
                int i8 = i6 / 2;
                int i9 = (i6 * 4) / 5;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.A06.getChildAt(i11);
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (childAt instanceof AnonymousClass2H9) {
                        i12++;
                        measuredHeight2 = ((AnonymousClass2H9) childAt).A00;
                        z = true;
                    } else {
                        z = false;
                    }
                    i13 += measuredHeight2;
                    if (i13 <= measuredHeight) {
                        i11++;
                        i14 = measuredHeight2;
                    } else if (i11 <= 2) {
                        int i15 = i7 / 2;
                        ((AnonymousClass2H9) this.A06.getChildAt(0)).A00 = this.A00 / 2;
                        int i16 = childCount - 1;
                        ((AnonymousClass2H9) this.A06.getChildAt(i16)).A00 = this.A00 / 2;
                        for (int i17 = 1; i17 < i16; i17++) {
                            if (this.A06.getChildAt(i17) instanceof AnonymousClass2H9) {
                                ((AnonymousClass2H9) this.A06.getChildAt(i17)).A00 = this.A02 / 2;
                            }
                        }
                        i10 = i15;
                    } else {
                        if (!z) {
                            int i18 = (measuredHeight - ((i7 + i13) - measuredHeight2)) / i12;
                            int i19 = (measuredHeight - ((i8 + i13) - measuredHeight2)) / i12;
                            i10 = (measuredHeight - ((i9 + i13) - measuredHeight2)) / i12;
                            if (Math.abs(i19) < Math.abs(i18)) {
                                i18 = i19;
                            }
                            if (Math.abs(i10) >= Math.abs(i18)) {
                                i10 = i18;
                            }
                            if (i11 == childCount - 2) {
                                i3 = ((measuredHeight - (i13 + ((AnonymousClass2H9) this.A06.getChildAt(i11 + 1)).A00)) - i12) / (i12 + 1);
                            }
                        } else if (i11 == childCount - 1) {
                            i10 = (measuredHeight - i13) / i12;
                        } else {
                            int i20 = ((i11 + 1) - i12) * this.A01;
                            i10 = (measuredHeight - ((i7 + i13) / i12)) - i20;
                            i3 = (measuredHeight - (((i13 - i14) - measuredHeight2) + i9)) - i20;
                        }
                        if (Math.abs(i3) < Math.abs(i10)) {
                            i10 = i3;
                        }
                    }
                }
                this.A03 = i10;
            }
            this.A0Y = getMeasuredHeight();
            super.onMeasure(i4, i5);
        }
    }

    public ConversationAttachmentContentView(Context context) {
        super(context);
        A0A();
        this.A0c = C36431kI.A1G();
        A02();
    }

    private void A02() {
        this.A01 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0W = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0X = getIconTextViewHeight();
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A06 = (LinearLayout) C012005e.A02(this, R.id.row_content);
    }

    private int getColumnsCountV2() {
        Point currentConversationViewSize = getCurrentConversationViewSize();
        return Math.min((currentConversationViewSize.x - getMinMarginSize()) / getIconSize(), C36431kI.A01(this.A0a ? 1 : 0));
    }

    private String getCommerceAttachmentType() {
        return "product";
    }

    private Point getCurrentConversationViewSize() {
        Point BAC;
        Context context = getContext();
        if (!(context instanceof AnonymousClass159) || (BAC = ((AnonymousClass159) context).BAC()) == null) {
            return C65103Qt.A02(C21060yb.A01(context));
        }
        return BAC;
    }

    private int getIconTextViewHeight() {
        CondensedTextView condensedTextView = new CondensedTextView(getContext(), (AttributeSet) null, R.style.f13nameremoved);
        C36351kA.A1B(condensedTextView, C36361kB.A0B(this).widthPixels, 1073741824);
        return condensedTextView.getMeasuredHeight();
    }

    private int getMaxMarginSize() {
        return (getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2) + getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    private int getMinMarginSize() {
        int dimensionPixelSize;
        Resources resources = getResources();
        boolean z = this.A0V;
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        if (this.A0V) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        return (dimensionPixelSize2 * 2) + dimensionPixelSize;
    }

    private int getNumberOfColumns() {
        Point currentConversationViewSize = getCurrentConversationViewSize();
        int minMarginSize = (currentConversationViewSize.x - getMinMarginSize()) / getIconSize();
        int i = 2;
        if (minMarginSize >= 2) {
            i = Math.max(3, minMarginSize);
        }
        return Math.min(4, i);
    }

    public int A06(View view) {
        Point A022 = C65103Qt.A02(C21060yb.A01(getContext()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return Math.max(getMaxMarginSize() + (getIconSize() * getNumberOfColumns()), ((iArr[0] + (view.getWidth() / 2)) - (A022.x / 2)) * 2);
    }

    public int A07(View view) {
        int ceil = (int) Math.ceil(((double) A01().size()) / ((double) getNumberOfColumns()));
        int A012 = ((this.A01 + this.A0W + this.A0X + this.A03) * ceil) + ((ceil - 1) * this.A02) + (this.A00 * 2) + C65103Qt.A01(getContext(), 1.0f);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int measuredHeight = ((iArr[1] - view.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.f7nameremoved)) - C65103Qt.A00(getContext());
        if (measuredHeight >= A012 || A012 - (this.A01 / 2) <= measuredHeight) {
            return A012;
        }
        return measuredHeight;
    }

    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - getHeight();
        int i = this.A05;
        int i2 = computeVerticalScrollRange - (i * 2);
        if (i <= 0 || i2 <= 0) {
            return computeVerticalScrollOffset;
        }
        return i + ((computeVerticalScrollOffset * i2) / computeVerticalScrollRange);
    }

    public int getPopupHeightV2() {
        int ceil = (int) Math.ceil(((double) A01().size()) / ((double) getColumnsCountV2()));
        Resources resources = getResources();
        int i = R.dimen.f7nameremoved;
        if (ceil > 2) {
            i = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        Resources resources2 = getResources();
        int i2 = R.dimen.f7nameremoved;
        if (ceil > 2) {
            i2 = R.dimen.f7nameremoved;
        }
        return ((this.A01 + this.A0W + this.A0X) * ceil) + ((ceil - 1) * dimensionPixelSize) + (resources2.getDimensionPixelSize(i2) * 2);
    }

    public void setVerticalScrollbarInset(int i) {
        this.A05 = i;
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A0A();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
        this.A0c = C36431kI.A1G();
        A02();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A0A();
        this.A0c = C36431kI.A1G();
        A02();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
        this.A0c = C36431kI.A1G();
        A02();
    }
}
